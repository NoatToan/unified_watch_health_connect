package cn.hutool.core.lang.caller;

import cn.hutool.core.exceptions.UtilException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class StackTraceCaller implements Serializable {
    private static final int OFFSET = 2;
    private static final long serialVersionUID = 1;

    public Class<?> getCaller() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (3 >= stackTrace.length) {
            return null;
        }
        String className = stackTrace[3].getClassName();
        try {
            return Class.forName(className);
        } catch (ClassNotFoundException e) {
            throw new UtilException(e, "[{}] not found!", className);
        }
    }

    public Class<?> getCallerCaller() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (4 >= stackTrace.length) {
            return null;
        }
        String className = stackTrace[4].getClassName();
        try {
            return Class.forName(className);
        } catch (ClassNotFoundException e) {
            throw new UtilException(e, "[{}] not found!", className);
        }
    }

    public boolean isCalledBy(Class<?> cls) {
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            if (stackTraceElement.getClassName().equals(cls.getName())) {
                return true;
            }
        }
        return false;
    }

    public Class<?> getCaller(int i) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int i2 = i + 2;
        if (i2 >= stackTrace.length) {
            return null;
        }
        String className = stackTrace[i2].getClassName();
        try {
            return Class.forName(className);
        } catch (ClassNotFoundException e) {
            throw new UtilException(e, "[{}] not found!", className);
        }
    }
}
