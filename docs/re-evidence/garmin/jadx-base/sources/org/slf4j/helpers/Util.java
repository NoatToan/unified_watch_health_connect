package org.slf4j.helpers;

import org.apache.commons.lang3.BooleanUtils;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
public final class Util {
    private static ClassContextSecurityManager SECURITY_MANAGER = null;
    private static boolean SECURITY_MANAGER_CREATION_ALREADY_ATTEMPTED = false;

    public static final class ClassContextSecurityManager extends SecurityManager {
        private ClassContextSecurityManager() {
        }

        @Override // java.lang.SecurityManager
        public Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }

    private Util() {
    }

    public static Class<?> getCallingClass() {
        int i14;
        ClassContextSecurityManager securityManager = getSecurityManager();
        if (securityManager == null) {
            return null;
        }
        Class<?>[] classContext = securityManager.getClassContext();
        String name = Util.class.getName();
        int i15 = 0;
        while (i15 < classContext.length && !name.equals(classContext[i15].getName())) {
            i15++;
        }
        if (i15 < classContext.length && (i14 = i15 + 2) < classContext.length) {
            return classContext[i14];
        }
        h.z("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
        return null;
    }

    private static ClassContextSecurityManager getSecurityManager() {
        ClassContextSecurityManager classContextSecurityManager = SECURITY_MANAGER;
        if (classContextSecurityManager != null) {
            return classContextSecurityManager;
        }
        if (SECURITY_MANAGER_CREATION_ALREADY_ATTEMPTED) {
            return null;
        }
        ClassContextSecurityManager classContextSecurityManagerSafeCreateSecurityManager = safeCreateSecurityManager();
        SECURITY_MANAGER = classContextSecurityManagerSafeCreateSecurityManager;
        SECURITY_MANAGER_CREATION_ALREADY_ATTEMPTED = true;
        return classContextSecurityManagerSafeCreateSecurityManager;
    }

    public static final void report(String str) {
        System.err.println("SLF4J: " + str);
    }

    private static ClassContextSecurityManager safeCreateSecurityManager() {
        try {
            return new ClassContextSecurityManager();
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static boolean safeGetBooleanSystemProperty(String str) {
        String strSafeGetSystemProperty = safeGetSystemProperty(str);
        if (strSafeGetSystemProperty == null) {
            return false;
        }
        return strSafeGetSystemProperty.equalsIgnoreCase(BooleanUtils.TRUE);
    }

    public static String safeGetSystemProperty(String str) {
        if (str != null) {
            try {
                return System.getProperty(str);
            } catch (SecurityException unused) {
                return null;
            }
        }
        h.s("null input");
        return null;
    }

    public static final void report(String str, Throwable th3) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th3.printStackTrace();
    }
}
