
package org.example;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class SampleTest {

    @Test
    public void testMainMethod() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        try {
            System.setOut(new PrintStream(output));

            Sample.main(new String[]{});

            assertEquals("Hello and welcome!", output.toString().trim());

        } finally {
            System.setOut(originalOut);
        }
    }
}

