package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Login.feature",glue= {"stepDefinitions"},
plugin= {"pretty","html:test-output"})
public class TestRunner {

}
