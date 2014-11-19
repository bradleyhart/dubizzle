package org.fazz.arithmetic;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    /**
     * Q1
     */

    @Test
    public void shouldSumTwoIntegers(){
        int result = calculator.sum(3, 4);

        assertThat(result, is(7));
    }

    @Test
    public void shouldSumThreeOrMoreIntegers(){
        int result = calculator.sum(3, 4, 1, 2);

        assertThat(result, is(10));
    }

    @Test
    public void shouldSumNegativeIntegers(){
        int result = calculator.sum(3, -2);

        assertThat(result, is(1));
    }

    @Test
    public void shouldSumNegativeIntegersResultingInNegative(){
        int result = calculator.sum(3, -5);

        assertThat(result, is(-2));
    }

    /**
     * Q2
     * All code coverage tools do is check for the lines of code that have been exercised.
     *
     * This is useful because it can highlight areas of code that do not have tests.
     *
     * This is limited though because it does not ensure the tests are of good quality. For example, I would only
     * need to write the first Unit test (shouldSumTwoIntegers) to get 100% code coverage. But by just
     * writing this one test I have not ensured correct the correct functionality.
     *
     * Also it does not ensure that the requirements are being fulfilled.
     *
     *
     * Q3
     * Testing in an agile methodology is very different to one in a traditional methodology.
     *
     * The agile methodology focuses on enhancing communication so Developers and Testers will work on the same
     * team together with tests being written, ideally, before development or parallel to it.
     *
     * The tester would be part of the team, working closely with them, each team member is equal and responsibility is
     * shared, the only difference between testers and developers is that they specialize in their own areas. This will
     * allow the tester to write tests at the lowest level, where they are the most valuable.
     *
     * Agile focuses on delivering regularly so the whole software development lifecycle will happen each iteration.
     * From analysis all the way to deployment. So naturally this includes testing.
     *
     *
     * Q4
     * It is not ethical to load test someones production system.
     *
     * They say "We also limit each user (via their IP Address) for each application, this is to ensure that no single
     * user is able to spam an application. This limit will simply stop the user from requesting more data for an hour."
     *
     * Q5
     * Please see DubizzleShould.groovy
     */

}
