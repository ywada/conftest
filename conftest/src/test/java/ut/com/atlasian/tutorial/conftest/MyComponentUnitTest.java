package ut.com.atlasian.tutorial.conftest;

import org.junit.Test;
import com.atlasian.tutorial.conftest.MyPluginComponent;
import com.atlasian.tutorial.conftest.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}