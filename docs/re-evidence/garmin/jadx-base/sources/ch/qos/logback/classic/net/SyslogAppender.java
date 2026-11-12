package ch.qos.logback.classic.net;

import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.classic.pattern.SyslogStartConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.StackTraceElementProxy;
import ch.qos.logback.classic.util.LevelToSyslogSeverity;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.Layout;
import ch.qos.logback.core.net.SyslogAppenderBase;
import ch.qos.logback.core.net.SyslogOutputStream;
import i3.e5;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes7.dex */
public class SyslogAppender extends SyslogAppenderBase<ILoggingEvent> {
    public static final String DEFAULT_STACKTRACE_PATTERN = "\t";
    public static final String DEFAULT_SUFFIX_PATTERN = "[%thread] %logger %msg";
    PatternLayout stackTraceLayout = new PatternLayout();
    String stackTracePattern = DEFAULT_STACKTRACE_PATTERN;
    boolean throwableExcluded = false;

    private void handleThrowableFirstLine(OutputStream outputStream, IThrowableProxy iThrowableProxy, String str, boolean z14) throws IOException {
        StringBuilder sbK = e5.k(str);
        if (!z14) {
            sbK.append(CoreConstants.CAUSED_BY);
        }
        sbK.append(iThrowableProxy.getClassName());
        sbK.append(": ");
        sbK.append(iThrowableProxy.getMessage());
        outputStream.write(sbK.toString().getBytes());
        outputStream.flush();
    }

    private void setupStackTraceLayout() {
        this.stackTraceLayout.getInstanceConverterMap().put("syslogStart", SyslogStartConverter.class.getName());
        this.stackTraceLayout.setPattern(getPrefixPattern() + this.stackTracePattern);
        this.stackTraceLayout.setContext(getContext());
        this.stackTraceLayout.start();
    }

    @Override // ch.qos.logback.core.net.SyslogAppenderBase
    public Layout<ILoggingEvent> buildLayout() {
        PatternLayout patternLayout = new PatternLayout();
        patternLayout.getInstanceConverterMap().put("syslogStart", SyslogStartConverter.class.getName());
        if (this.suffixPattern == null) {
            this.suffixPattern = DEFAULT_SUFFIX_PATTERN;
        }
        patternLayout.setPattern(getPrefixPattern() + this.suffixPattern);
        patternLayout.setContext(getContext());
        patternLayout.start();
        return patternLayout;
    }

    @Override // ch.qos.logback.core.net.SyslogAppenderBase
    public SyslogOutputStream createOutputStream() {
        return new SyslogOutputStream(getSyslogHost(), getPort());
    }

    public String getPrefixPattern() {
        return "%syslogStart{" + getFacility() + "}%nopex{}";
    }

    @Override // ch.qos.logback.core.net.SyslogAppenderBase
    public int getSeverityForEvent(Object obj) {
        return LevelToSyslogSeverity.convert((ILoggingEvent) obj);
    }

    public String getStackTracePattern() {
        return this.stackTracePattern;
    }

    public boolean isThrowableExcluded() {
        return this.throwableExcluded;
    }

    @Override // ch.qos.logback.core.net.SyslogAppenderBase
    public void postProcess(Object obj, OutputStream outputStream) {
        ILoggingEvent iLoggingEvent;
        IThrowableProxy throwableProxy;
        if (this.throwableExcluded || (throwableProxy = (iLoggingEvent = (ILoggingEvent) obj).getThrowableProxy()) == null) {
            return;
        }
        String strDoLayout = this.stackTraceLayout.doLayout(iLoggingEvent);
        boolean z14 = true;
        while (throwableProxy != null) {
            StackTraceElementProxy[] stackTraceElementProxyArray = throwableProxy.getStackTraceElementProxyArray();
            try {
                handleThrowableFirstLine(outputStream, throwableProxy, strDoLayout, z14);
                for (StackTraceElementProxy stackTraceElementProxy : stackTraceElementProxyArray) {
                    outputStream.write((strDoLayout + stackTraceElementProxy).getBytes());
                    outputStream.flush();
                }
                throwableProxy = throwableProxy.getCause();
                z14 = false;
            } catch (IOException unused) {
                return;
            }
        }
    }

    public void setStackTracePattern(String str) {
        this.stackTracePattern = str;
    }

    public void setThrowableExcluded(boolean z14) {
        this.throwableExcluded = z14;
    }

    public boolean stackTraceHeaderLine(StringBuilder sb3, boolean z14) {
        return false;
    }

    @Override // ch.qos.logback.core.net.SyslogAppenderBase, ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        super.start();
        setupStackTraceLayout();
    }
}
