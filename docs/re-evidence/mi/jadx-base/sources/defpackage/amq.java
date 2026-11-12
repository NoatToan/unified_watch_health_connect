package defpackage;

import java.io.PrintStream;

/* JADX INFO: loaded from: classes3.dex */
public final class amq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f1223a = new b();

    public static final class b extends SecurityManager {
        public b() {
        }

        @Override // java.lang.SecurityManager
        public Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }

    public static Class<?> a() {
        int i;
        Class<?>[] classContext = f1223a.getClassContext();
        String name = amq.class.getName();
        int i2 = 0;
        while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
            i2++;
        }
        if (i2 >= classContext.length || (i = i2 + 2) >= classContext.length) {
            throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
        }
        return classContext[i];
    }

    public static final void b(String str) {
        System.err.println("SLF4J: " + str);
    }

    public static final void c(String str, Throwable th) {
        PrintStream printStream = System.err;
        printStream.println(str);
        printStream.println("Reported exception:");
        th.printStackTrace();
    }
}
