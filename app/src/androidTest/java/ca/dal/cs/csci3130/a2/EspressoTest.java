package ca.dal.cs.csci3130.a2;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class EspressoTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule
            = new ActivityScenarioRule<>(MainActivity.class);


    @Test
    public void at3_username(){
        onView(withId(R.id.user_name))
                .perform(click())
                .check(matches(isDisplayed()));

    }


    @Test
    public void at3_email(){
        onView(withId(R.id.email_address))
                .perform(click())
                .check(matches(isDisplayed()));
    }
    @Test
    public void at3_register_button(){
        onView(withId(R.id.register_button))
                .perform(click())
                .check(matches(isDisplayed()));
    }
    @Test
    public void at4(){
        onData(withId(R.id.user_name))
                .perform(typeText("User name does not meet requirements"))
                .check(matches(R.id.username_error));
    }



}


