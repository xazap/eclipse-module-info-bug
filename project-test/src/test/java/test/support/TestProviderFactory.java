package test.support;

import project.spi.SomeProvider;
import project.spi.SomeProviderFactory;

public class TestProviderFactory implements SomeProviderFactory {

	@Override
	public SomeProvider newInstance() {
		
		return new SomeProvider() {
			
			@Override
			public Object getSome() {
				return "SOME";
			}
		};
	}
}