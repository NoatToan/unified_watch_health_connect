package ch.qos.logback.classic.spi;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class ThrowableProxyVO implements IThrowableProxy, Serializable {
    private static final long serialVersionUID = -773438177285807139L;
    private IThrowableProxy cause;
    private String className;
    private int commonFramesCount;
    private String message;
    private StackTraceElementProxy[] stackTraceElementProxyArray;
    private IThrowableProxy[] suppressed;

    public static ThrowableProxyVO build(IThrowableProxy iThrowableProxy) {
        if (iThrowableProxy == null) {
            return null;
        }
        ThrowableProxyVO throwableProxyVO = new ThrowableProxyVO();
        throwableProxyVO.className = iThrowableProxy.getClassName();
        throwableProxyVO.message = iThrowableProxy.getMessage();
        throwableProxyVO.commonFramesCount = iThrowableProxy.getCommonFrames();
        throwableProxyVO.stackTraceElementProxyArray = iThrowableProxy.getStackTraceElementProxyArray();
        IThrowableProxy cause = iThrowableProxy.getCause();
        if (cause != null) {
            throwableProxyVO.cause = build(cause);
        }
        IThrowableProxy[] suppressed = iThrowableProxy.getSuppressed();
        if (suppressed != null) {
            throwableProxyVO.suppressed = new IThrowableProxy[suppressed.length];
            for (int i14 = 0; i14 < suppressed.length; i14++) {
                throwableProxyVO.suppressed[i14] = build(suppressed[i14]);
            }
        }
        return throwableProxyVO;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ThrowableProxyVO throwableProxyVO = (ThrowableProxyVO) obj;
        String str = this.className;
        String str2 = throwableProxyVO.className;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        if (!Arrays.equals(this.stackTraceElementProxyArray, throwableProxyVO.stackTraceElementProxyArray) || !Arrays.equals(this.suppressed, throwableProxyVO.suppressed)) {
            return false;
        }
        IThrowableProxy iThrowableProxy = this.cause;
        IThrowableProxy iThrowableProxy2 = throwableProxyVO.cause;
        if (iThrowableProxy == null) {
            if (iThrowableProxy2 != null) {
                return false;
            }
        } else if (!iThrowableProxy.equals(iThrowableProxy2)) {
            return false;
        }
        return true;
    }

    @Override // ch.qos.logback.classic.spi.IThrowableProxy
    public IThrowableProxy getCause() {
        return this.cause;
    }

    @Override // ch.qos.logback.classic.spi.IThrowableProxy
    public String getClassName() {
        return this.className;
    }

    @Override // ch.qos.logback.classic.spi.IThrowableProxy
    public int getCommonFrames() {
        return this.commonFramesCount;
    }

    @Override // ch.qos.logback.classic.spi.IThrowableProxy
    public String getMessage() {
        return this.message;
    }

    @Override // ch.qos.logback.classic.spi.IThrowableProxy
    public StackTraceElementProxy[] getStackTraceElementProxyArray() {
        return this.stackTraceElementProxyArray;
    }

    @Override // ch.qos.logback.classic.spi.IThrowableProxy
    public IThrowableProxy[] getSuppressed() {
        return this.suppressed;
    }

    public int hashCode() {
        String str = this.className;
        return 31 + (str == null ? 0 : str.hashCode());
    }
}
