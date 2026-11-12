package ch.qos.logback.classic.layout;

import ch.qos.logback.classic.pattern.ThrowableProxyConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.LayoutBase;
import ch.qos.logback.core.util.CachingDateFormatter;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes7.dex */
public class TTLLLayout extends LayoutBase<ILoggingEvent> {
    CachingDateFormatter cachingDateFormatter = new CachingDateFormatter("HH:mm:ss.SSS");
    ThrowableProxyConverter tpc = new ThrowableProxyConverter();

    @Override // ch.qos.logback.core.Layout
    public String doLayout(ILoggingEvent iLoggingEvent) {
        if (!isStarted()) {
            return "";
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.cachingDateFormatter.format(iLoggingEvent.getTimeStamp()));
        sb3.append(" [");
        sb3.append(iLoggingEvent.getThreadName());
        sb3.append("] ");
        sb3.append(iLoggingEvent.getLevel().toString());
        sb3.append(StringUtils.SPACE);
        sb3.append(iLoggingEvent.getLoggerName());
        sb3.append(" - ");
        sb3.append(iLoggingEvent.getFormattedMessage());
        sb3.append(CoreConstants.LINE_SEPARATOR);
        if (iLoggingEvent.getThrowableProxy() != null) {
            sb3.append(this.tpc.convert(iLoggingEvent));
        }
        return sb3.toString();
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        this.tpc.start();
        super.start();
    }
}
