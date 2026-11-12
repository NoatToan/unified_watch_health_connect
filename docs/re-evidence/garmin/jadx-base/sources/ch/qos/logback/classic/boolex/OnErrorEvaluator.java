package ch.qos.logback.classic.boolex;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.boolex.EventEvaluatorBase;

/* JADX INFO: loaded from: classes7.dex */
public class OnErrorEvaluator extends EventEvaluatorBase<ILoggingEvent> {
    @Override // ch.qos.logback.core.boolex.EventEvaluator
    public boolean evaluate(ILoggingEvent iLoggingEvent) {
        return iLoggingEvent.getLevel().levelInt >= 40000;
    }
}
