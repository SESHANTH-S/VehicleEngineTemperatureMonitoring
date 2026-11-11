
package com.seshanth;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EngineTemperatureMonitorTest {

    @Test
    public void testNormalTemperature() {
        assertEquals("Normal",
                EngineTemperatureMonitor.checkTemperature(80));
    }

    @Test
    public void testWarningTemperature() {
        assertEquals("Warning - Engine Overheating",
                EngineTemperatureMonitor.checkTemperature(95));
    }

    @Test
    public void testCriticalTemperature() {
        assertEquals("Critical - High Engine Temperature",
                EngineTemperatureMonitor.checkTemperature(115));
    }

    @Test
    public void testInvalidTemperature() {
        assertEquals("Invalid Temperature",
                EngineTemperatureMonitor.checkTemperature(-5));
    }
}
