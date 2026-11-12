package ch.qos.logback.classic.spi;

import ch.qos.logback.classic.Level;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import org.slf4j.Marker;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: loaded from: classes7.dex */
public class LoggingEventVO implements ILoggingEvent, Serializable {
    private static final int NULL_ARGUMENT_ARRAY = -1;
    private static final String NULL_ARGUMENT_ARRAY_ELEMENT = "NULL_ARGUMENT_ARRAY_ELEMENT";
    private static final long serialVersionUID = 6553722650255690312L;
    private transient Object[] argumentArray;
    private StackTraceElement[] callerDataArray;
    private transient String formattedMessage;
    private transient Level level;
    private LoggerContextVO loggerContextVO;
    private String loggerName;
    private Marker marker;
    private Map<String, String> mdcPropertyMap;
    private String message;
    private String threadName;
    private ThrowableProxyVO throwableProxy;
    private long timeStamp;

    public static LoggingEventVO build(ILoggingEvent iLoggingEvent) {
        LoggingEventVO loggingEventVO = new LoggingEventVO();
        loggingEventVO.loggerName = iLoggingEvent.getLoggerName();
        loggingEventVO.loggerContextVO = iLoggingEvent.getLoggerContextVO();
        loggingEventVO.threadName = iLoggingEvent.getThreadName();
        loggingEventVO.level = iLoggingEvent.getLevel();
        loggingEventVO.message = iLoggingEvent.getMessage();
        loggingEventVO.argumentArray = iLoggingEvent.getArgumentArray();
        loggingEventVO.marker = iLoggingEvent.getMarker();
        loggingEventVO.mdcPropertyMap = iLoggingEvent.getMDCPropertyMap();
        loggingEventVO.timeStamp = iLoggingEvent.getTimeStamp();
        loggingEventVO.throwableProxy = ThrowableProxyVO.build(iLoggingEvent.getThrowableProxy());
        if (iLoggingEvent.hasCallerData()) {
            loggingEventVO.callerDataArray = iLoggingEvent.getCallerData();
        }
        return loggingEventVO;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.level = Level.toLevel(objectInputStream.readInt());
        int i14 = objectInputStream.readInt();
        if (i14 != -1) {
            this.argumentArray = new String[i14];
            for (int i15 = 0; i15 < i14; i15++) {
                Object object = objectInputStream.readObject();
                if (!NULL_ARGUMENT_ARRAY_ELEMENT.equals(object)) {
                    this.argumentArray[i15] = object;
                }
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.level.levelInt);
        Object[] objArr = this.argumentArray;
        if (objArr == null) {
            objectOutputStream.writeInt(-1);
            return;
        }
        objectOutputStream.writeInt(objArr.length);
        int i14 = 0;
        while (true) {
            Object[] objArr2 = this.argumentArray;
            if (i14 >= objArr2.length) {
                return;
            }
            Object obj = objArr2[i14];
            objectOutputStream.writeObject(obj != null ? obj.toString() : NULL_ARGUMENT_ARRAY_ELEMENT);
            i14++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LoggingEventVO loggingEventVO = (LoggingEventVO) obj;
        String str = this.message;
        String str2 = loggingEventVO.message;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        String str3 = this.loggerName;
        String str4 = loggingEventVO.loggerName;
        if (str3 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str3.equals(str4)) {
            return false;
        }
        String str5 = this.threadName;
        String str6 = loggingEventVO.threadName;
        if (str5 == null) {
            if (str6 != null) {
                return false;
            }
        } else if (!str5.equals(str6)) {
            return false;
        }
        if (this.timeStamp != loggingEventVO.timeStamp) {
            return false;
        }
        Marker marker = this.marker;
        Marker marker2 = loggingEventVO.marker;
        if (marker == null) {
            if (marker2 != null) {
                return false;
            }
        } else if (!marker.equals(marker2)) {
            return false;
        }
        Map<String, String> map = this.mdcPropertyMap;
        Map<String, String> map2 = loggingEventVO.mdcPropertyMap;
        if (map == null) {
            if (map2 != null) {
                return false;
            }
        } else if (!map.equals(map2)) {
            return false;
        }
        return true;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public Object[] getArgumentArray() {
        return this.argumentArray;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public StackTraceElement[] getCallerData() {
        return this.callerDataArray;
    }

    public long getContextBirthTime() {
        return this.loggerContextVO.getBirthTime();
    }

    public LoggerContextVO getContextLoggerRemoteView() {
        return this.loggerContextVO;
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
        return this.mdcPropertyMap;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public Marker getMarker() {
        return this.marker;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public Map<String, String> getMdc() {
        return this.mdcPropertyMap;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public String getMessage() {
        return this.message;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public String getThreadName() {
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

    public int hashCode() {
        String str = this.message;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.threadName;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        long j8 = this.timeStamp;
        return iHashCode2 + ((int) (j8 ^ (j8 >>> 32)));
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent, ch.qos.logback.core.spi.DeferredProcessingAware
    public void prepareForDeferredProcessing() {
    }
}
