package CucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",    // running all feature file  present inside the features folder
		                                        // or id you want run specific file the after slash / add file name 
		glue ="stepDefinations"    //  glue is an parameter to define the step definition file locations
									// but here my step defination file present in same parent package so no need to mention path just a file name
								// test runner file and step defination having common parent package
		// so here we pass the package name
		)
public class TestRunner 
{

}
