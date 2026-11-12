package ch.qos.logback.classic.spi;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.util.LogbackMDCAdapter;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.Map;
import org.slf4j.MDC;
import org.slf4j.Marker;
import org.slf4j.helpers.MessageFormatter;
import org.slf4j.spi.MDCAdapter;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public class LoggingEvent implements ILoggingEvent {
    private transient Object[] argumentArray;
    private StackTraceElement[] callerDataArray;
    transient String formattedMessage;
    transient String fqnOfLoggerClass;
    private transient Level level;
    private LoggerContext loggerContext;
    private LoggerContextVO loggerContextVO;
    private String loggerName;
    private Marker marker;
    private Map<String, String> mdcPropertyMap;
    private String message;
    private String threadName;
    private ThrowableProxy throwableProxy;
    private long timeStamp;

    public LoggingEvent(String str, Logger logger, Level level, String str2, Throwable th3, Object[] objArr) {
        this.fqnOfLoggerClass = str;
        this.loggerName = logger.getName();
        LoggerContext loggerContext = logger.getLoggerContext();
        this.loggerContext = loggerContext;
        this.loggerContextVO = loggerContext.getLoggerContextRemoteView();
        this.level = level;
        this.message = str2;
        this.argumentArray = objArr;
        th3 = th3 == null ? extractThrowableAnRearrangeArguments(objArr) : th3;
        if (th3 != null) {
            this.throwableProxy = new ThrowableProxy(th3);
            if (logger.getLoggerContext().isPackagingDataEnabled()) {
                this.throwableProxy.calculatePackagingData();
            }
        }
        this.timeStamp = System.currentTimeMillis();
    }

    private Throwable extractThrowableAnRearrangeArguments(Object[] objArr) {
        Throwable thExtractThrowable = EventArgUtil.extractThrowable(objArr);
        if (EventArgUtil.successfulExtraction(thExtractThrowable)) {
            this.argumentArray = EventArgUtil.trimmedCopy(objArr);
        }
        return thExtractThrowable;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        throw new UnsupportedOperationException(getClass() + " does not support serialization. Use LoggerEventVO instance instead. See also LoggerEventVO.build method.");
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public Object[] getArgumentArray() {
        return this.argumentArray;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public StackTraceElement[] getCallerData() {
        if (this.callerDataArray == null) {
            this.callerDataArray = CallerData.extract(new Throwable(), this.fqnOfLoggerClass, this.loggerContext.getMaxCallerDataDepth(), this.loggerContext.getFrameworkPackages());
        }
        return this.callerDataArray;
    }

    public long getContextBirthTime() {
        return this.loggerContextVO.getBirthTime();
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public String getFormattedMessage() {
        String str = this.formattedMessage;
        if (str != null) {
            return str;
        }
        Object[] objArr = this.argumentArray;
        String str2 = this.message;
        if (objArr != null) {
            this.formattedMessage = MessageFormatter.arrayFormat(str2, objArr).getMessage();
        } else {
            this.formattedMessage = str2;
        }
        return this.formattedMessage;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public Level getLevel() {
        return this.level;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public LoggerContextVO getLoggerContextVO() {
        return this.loggerContextVO;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public String getLoggerName() {
        return this.loggerName;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public Map<String, String> getMDCPropertyMap() {
        if (this.mdcPropertyMap == null) {
            MDCAdapter mDCAdapter = MDC.getMDCAdapter();
            this.mdcPropertyMap = mDCAdapter instanceof LogbackMDCAdapter ? ((LogbackMDCAdapter) mDCAdapter).getPropertyMap() : mDCAdapter.getCopyOfContextMap();
        }
        if (this.mdcPropertyMap == null) {
            this.mdcPropertyMap = Collections.EMPTY_MAP;
        }
        return this.mdcPropertyMap;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public Marker getMarker() {
        return this.marker;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public Map<String, String> getMdc() {
        return getMDCPropertyMap();
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public String getMessage() {
        return this.message;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public String getThreadName() {
        if (this.threadName == null) {
            this.threadName = Thread.currentThread().getName();
        }
        return this.threadName;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public IThrowableProxy getThrowableProxy() {
        return this.throwableProxy;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public long getTimeStamp() {
        return this.timeStamp;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public boolean hasCallerData() {
        return this.callerDataArray != null;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent, ch.qos.logback.core.spi.DeferredProcessingAware
    public void prepareForDeferredProcessing() {
        getFormattedMessage();
        getThreadName();
        getMDCPropertyMap();
    }

    public void setArgumentArray(Object[] objArr) {
        if (this.argumentArray == null) {
            this.argumentArray = objArr;
        } else {
            h.z("argArray has been already set");
        }
    }

    public void setCallerData(StackTraceElement[] stackTraceElementArr) {
        this.callerDataArray = stackTraceElementArr;
    }

    public void setLevel(Level level) {
        if (this.level == null) {
            this.level = level;
        } else {
            h.z("The level has been already set for this event.");
        }
    }

    public void setLoggerContextRemoteView(LoggerContextVO loggerContextVO) {
        this.loggerContextVO = loggerContextVO;
    }

    public void setLoggerName(String str) {
        this.loggerName = str;
    }

    public void setMDCPropertyMap(Map<String, String> map) {
        if (this.mdcPropertyMap == null) {
            this.mdcPropertyMap = map;
        } else {
            h.z("The MDCPropertyMap has been already set for this event.");
        }
    }

    public void setMarker(Marker marker) {
        if (this.marker == null) {
            this.marker = marker;
        } else {
            h.z("The marker has been already set for this event.");
        }
    }

    public void setMessage(String str) {
        if (this.message == null) {
            this.message = str;
        } else {
            h.z("The message for this event has been set already.");
        }
    }

    public void setThreadName(String str) {
        if (this.threadName == null) {
            this.threadName = str;
        } else {
            h.z("threadName has been already set");
        }
    }

    public void setThrowableProxy(ThrowableProxy throwableProxy) {
        if (this.throwableProxy == null) {
            this.throwableProxy = throwableProxy;
        } else {
            h.z("ThrowableProxy has been already set.");
        }
    }

    public void setTimeStamp(long j8) {
        this.timeStamp = j8;
    }

    public String toString() {
        return "[" + this.level + "] " + getFormattedMessage();
    }

    public LoggingEvent() {
    }
}
