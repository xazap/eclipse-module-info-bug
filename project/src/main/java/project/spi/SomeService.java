package project.spi;

import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

public class SomeService {

	private static class InstanceHolder {
		private static final SomeService INSTANCE = new SomeService(); 
	}
	
	private ServiceLoader<SomeProviderFactory> loader;

	private SomeService() {
		loader = ServiceLoader.load(SomeProviderFactory.class);
	}

	public static SomeService getInstance() {
		return InstanceHolder.INSTANCE;
	}

	public SomeProvider getProvider() throws ServiceConfigurationError {
		return loader.findFirst()
				.orElseThrow(() -> new ServiceConfigurationError("No provider implementation found"))
				.newInstance();
	}
}