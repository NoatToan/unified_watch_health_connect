package ch.qos.logback.classic.spi;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.spi.ContextAwareBase;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public class LoggerContextAwareBase extends ContextAwareBase implements LoggerContextAware {
    public LoggerContext getLoggerContext() {
        return (LoggerContext) this.context;
    }

    @Override // ch.qos.logback.core.spi.ContextAwareBase, ch.qos.logback.core.spi.ContextAware
    public void setContext(Context context) {
        if ((context instanceof LoggerContext) || context == null) {
            super.setContext(context);
        } else {
            h.s("LoggerContextAwareBase only accepts contexts of type c.l.classic.LoggerContext");
        }
    }

    @Override // ch.qos.logback.classic.spi.LoggerContextAware
    public void setLoggerContext(LoggerContext loggerContext) {
        super.setContext(loggerContext);
    }
}
