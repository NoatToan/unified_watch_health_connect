package cn.hutool.core.lang.caller;

import defpackage.qj1;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class SecurityManagerCaller extends SecurityManager implements Serializable {
    private static final int OFFSET = 1;
    private static final long serialVersionUID = 1;

    public Class<?> getCaller() {
        Class<?>[] classContext = getClassContext();
        if (classContext == null || 2 >= classContext.length) {
            return null;
        }
        return classContext[2];
    }

    public Class<?> getCallerCaller() {
        Class<?>[] classContext = getClassContext();
        if (classContext == null || 3 >= classContext.length) {
            return null;
        }
        return classContext[3];
    }

    public boolean isCalledBy(Class<?> cls) {
        Class[] classContext = getClassContext();
        if (qj1.E(classContext)) {
            for (Class cls2 : classContext) {
                if (cls2.equals(cls)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Class<?> getCaller(int i) {
        int i2;
        Class<?>[] classContext = getClassContext();
        if (classContext == null || (i2 = i + 1) >= classContext.length) {
            return null;
        }
        return classContext[i2];
    }
}
