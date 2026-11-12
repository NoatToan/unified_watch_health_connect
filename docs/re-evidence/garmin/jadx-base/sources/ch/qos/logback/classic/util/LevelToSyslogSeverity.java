package ch.qos.logback.classic.util;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;
import org.apache.commons.lang3.e;

/* JADX INFO: loaded from: classes7.dex */
public class LevelToSyslogSeverity {
    public static int convert(ILoggingEvent iLoggingEvent) {
        Level level = iLoggingEvent.getLevel();
        int i14 = level.levelInt;
        if (i14 == 5000 || i14 == 10000) {
            return 7;
        }
        if (i14 == 20000) {
            return 6;
        }
        if (i14 == 30000) {
            return 4;
        }
        if (i14 == 40000) {
            return 3;
        }
        e.l("Level ", level, " is not a valid level for a printing method");
        return 0;
    }
}
