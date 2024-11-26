package test.project;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import project.spi.SomeService;

class SomeServiceTest {

	@Test
	void testFindingProviderInUnitTest() {
		var actual = SomeService.getInstance().getProvider();
		
		assertThat(actual.getSome()).isEqualTo("SOME");
	}
}