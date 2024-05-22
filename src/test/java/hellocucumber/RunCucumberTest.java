package hellocucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "pretty","json:target/surefire-reports/cucumber.json",
                "html:target/cucumber-html-report.html"},
        glue = {"hellocucumber"},
        features = {"src/test/resources/hellocucumber/"}
)
public class RunCucumberTest {
}