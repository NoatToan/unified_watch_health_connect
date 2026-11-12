package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.StackTraceElementProxy;
import ch.qos.logback.classic.spi.ThrowableProxyUtil;

/* JADX INFO: loaded from: classes7.dex */
public class ExtendedThrowableProxyConverter extends ThrowableProxyConverter {
    @Override // ch.qos.logback.classic.pattern.ThrowableProxyConverter
    public void extraData(StringBuilder sb3, StackTraceElementProxy stackTraceElementProxy) {
        ThrowableProxyUtil.subjoinPackagingData(sb3, stackTraceElementProxy);
    }

    public void prepareLoggingEvent(ILoggingEvent iLoggingEvent) {
    }
}
