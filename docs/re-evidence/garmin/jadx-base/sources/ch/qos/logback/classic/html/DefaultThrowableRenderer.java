package ch.qos.logback.classic.html;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.StackTraceElementProxy;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.helpers.Transform;
import ch.qos.logback.core.html.IThrowableRenderer;
import q6.f;

/* JADX INFO: loaded from: classes7.dex */
public class DefaultThrowableRenderer implements IThrowableRenderer<ILoggingEvent> {
    static final String TRACE_PREFIX = "<br />&nbsp;&nbsp;&nbsp;&nbsp;";

    public void printFirstLine(StringBuilder sb3, IThrowableProxy iThrowableProxy) {
        if (iThrowableProxy.getCommonFrames() > 0) {
            sb3.append("<br />");
            sb3.append(CoreConstants.CAUSED_BY);
        }
        sb3.append(iThrowableProxy.getClassName());
        sb3.append(": ");
        sb3.append(Transform.escapeTags(iThrowableProxy.getMessage()));
        sb3.append(CoreConstants.LINE_SEPARATOR);
    }

    public void render(StringBuilder sb3, IThrowableProxy iThrowableProxy) {
        printFirstLine(sb3, iThrowableProxy);
        int commonFrames = iThrowableProxy.getCommonFrames();
        StackTraceElementProxy[] stackTraceElementProxyArray = iThrowableProxy.getStackTraceElementProxyArray();
        for (int i14 = 0; i14 < stackTraceElementProxyArray.length - commonFrames; i14++) {
            StackTraceElementProxy stackTraceElementProxy = stackTraceElementProxyArray[i14];
            sb3.append(TRACE_PREFIX);
            sb3.append(Transform.escapeTags(stackTraceElementProxy.toString()));
            sb3.append(CoreConstants.LINE_SEPARATOR);
        }
        if (commonFrames > 0) {
            f.q(commonFrames, TRACE_PREFIX, "\t... ", " common frames omitted", sb3);
            sb3.append(CoreConstants.LINE_SEPARATOR);
        }
    }

    @Override // ch.qos.logback.core.html.IThrowableRenderer
    public void render(StringBuilder sb3, ILoggingEvent iLoggingEvent) {
        sb3.append("<tr><td class=\"Exception\" colspan=\"6\">");
        for (IThrowableProxy throwableProxy = iLoggingEvent.getThrowableProxy(); throwableProxy != null; throwableProxy = throwableProxy.getCause()) {
            render(sb3, throwableProxy);
        }
        sb3.append("</td></tr>");
    }
}
