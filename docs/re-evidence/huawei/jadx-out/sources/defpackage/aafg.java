package defpackage;

/* JADX INFO: loaded from: classes20.dex */
public final class aafg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static d f162a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f163b = false;

    private aafg() {
    }

    public static String a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null input");
        }
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static boolean b(String str) {
        String strA = a(str);
        if (strA == null) {
            return false;
        }
        return strA.equalsIgnoreCase("true");
    }

    static final class d extends SecurityManager {
        private d() {
        }

        @Override // java.lang.SecurityManager
        protected Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }

    private static d c() {
        d dVar = f162a;
        if (dVar != null) {
            return dVar;
        }
        if (f163b) {
            return null;
        }
        d dVarB = b();
        f162a = dVarB;
        f163b = true;
        return dVarB;
    }

    private static d b() {
        try {
            return new d();
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static Class<?> d() {
        int i;
        d dVarC = c();
        if (dVarC == null) {
            return null;
        }
        Class<?>[] classContext = dVarC.getClassContext();
        String name = aafg.class.getName();
        int i2 = 0;
        while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
            i2++;
        }
        if (i2 >= classContext.length || (i = i2 + 2) >= classContext.length) {
            throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
        }
        return classContext[i];
    }

    public static final void c(String str, Throwable th) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th.printStackTrace();
    }

    public static final void c(String str) {
        System.err.println("SLF4J: " + str);
    }
}
