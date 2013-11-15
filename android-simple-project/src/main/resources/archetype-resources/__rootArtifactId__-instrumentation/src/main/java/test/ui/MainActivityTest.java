package ${package}.test.ui;

import android.test.ActivityInstrumentationTestCase2;
import com.squareup.spoon.Spoon;

import ${package}.ui.MainActivity;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity>
{
	public MainActivityTest()
	{
#set($Integer = 0)
#if($Integer.parseInt($minSdkVersion) > 7)
		super(MainActivity.class);
#else
		super("${package}.ui", MainActivity.class);
#end
	}

	public void testActivity()
	{
		MainActivity mainActivity = getActivity();

		Spoon.screenshot(mainActivity, "initial_state");

		assertNotNull(mainActivity);
	}
}
