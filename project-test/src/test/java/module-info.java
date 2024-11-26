open module project.test {
	requires project;
	requires org.junit.jupiter.api;
	requires org.assertj.core;
	
	provides project.spi.SomeProviderFactory with test.support.TestProviderFactory;
}