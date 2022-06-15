package ru.kkuzmichev.simpleappforespresso;

import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class HomeWorkTest {
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);

//    @Test
//    public void testName() {
//        ViewInteraction mainText = onView(
//                withId(R.id.найденный id)
//        );
//        mainText.check(
//                matches(
//                        withText(Проверяемый текст)
//                )
//        );
//    }
}
