package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;

/* JADX INFO: loaded from: classes7.dex */
public class LoggerConverter extends NamedConverter {
    @Override // ch.qos.logback.classic.pattern.NamedConverter
    public String getFullyQualifiedName(ILoggingEvent iLoggingEvent) {
        return iLoggingEvent.getLoggerName();
    }
}
