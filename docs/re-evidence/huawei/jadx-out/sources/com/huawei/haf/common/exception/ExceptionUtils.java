package com.huawei.haf.common.exception;

import health.compact.a.LogConfig;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.BindException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.security.acl.NotOwnerException;
import java.sql.SQLException;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.IdentityHashMap;
import java.util.MissingResourceException;
import java.util.Set;
import java.util.jar.JarException;

/* JADX INFO: loaded from: classes.dex */
public final class ExceptionUtils {
    private ExceptionUtils() {
    }

    public static void b(Throwable th, PrintStream printStream, boolean z) {
        new WrappedThrowable(th).e(printStream, z);
    }

    public static void b(Throwable th, PrintWriter printWriter, boolean z) {
        new WrappedThrowable(th).e(printWriter, z);
    }

    public static String c(Throwable th) {
        return d(th, !LogConfig.c(), !(th instanceof ClassNotFoundException));
    }

    public static String d(Throwable th, boolean z, boolean z2) {
        if (th == null) {
            return "";
        }
        Throwable cause = th.getCause();
        if (cause == null || !z2) {
            return c(th, z);
        }
        return c(th, z) + ", Caused by: " + c(cause, z);
    }

    private static String c(Throwable th, boolean z) {
        if (z) {
            return a(th);
        }
        return th.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String a(Throwable th) {
        if (th instanceof FileNotFoundException) {
            return "*** Exception 10001 ***";
        }
        if (b(th) || d(th)) {
            return th.getClass().getName() + "：******";
        }
        return th.toString();
    }

    private static boolean d(Throwable th) {
        return (th instanceof SocketTimeoutException) || (th instanceof ConnectException);
    }

    public static void d(Thread thread, Throwable th, PrintStream printStream) {
        if (th != null) {
            b(th, printStream, true);
        } else {
            WrappedThrowable.d(thread.getStackTrace(), new WrappedPrintStream(printStream));
        }
        printStream.flush();
    }

    public static void d(Thread thread, Throwable th, PrintWriter printWriter) {
        if (th != null) {
            b(th, printWriter, true);
        } else {
            WrappedThrowable.d(thread.getStackTrace(), new WrappedPrintWriter(printWriter));
        }
        printWriter.flush();
    }

    public static boolean b(Throwable th) {
        if (th instanceof Exception) {
            return f(th);
        }
        if (th instanceof Error) {
            return h(th);
        }
        return false;
    }

    private static boolean f(Throwable th) {
        if (th instanceof IOException) {
            return j(th);
        }
        if (th instanceof RuntimeException) {
            return g(th);
        }
        return (th instanceof NotOwnerException) || (th instanceof SQLException);
    }

    private static boolean j(Throwable th) {
        return (th instanceof FileNotFoundException) || (th instanceof JarException) || (th instanceof BindException);
    }

    private static boolean g(Throwable th) {
        return (th instanceof MissingResourceException) || (th instanceof ConcurrentModificationException);
    }

    private static boolean h(Throwable th) {
        return (th instanceof OutOfMemoryError) || (th instanceof StackOverflowError);
    }

    static class WrappedThrowable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Throwable f5903c;
        private Set<Throwable> e;

        WrappedThrowable(Throwable th) {
            this.f5903c = th;
        }

        void e(PrintWriter printWriter, boolean z) {
            if (z) {
                e(new WrappedPrintWriter(printWriter));
            } else {
                this.f5903c.printStackTrace(printWriter);
            }
        }

        void e(PrintStream printStream, boolean z) {
            if (z) {
                e(new WrappedPrintStream(printStream));
            } else {
                this.f5903c.printStackTrace(printStream);
            }
        }

        static void d(StackTraceElement[] stackTraceElementArr, PrintStreamOrWriter printStreamOrWriter) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                printStreamOrWriter.append("\tat ").println(stackTraceElement);
            }
        }

        private void e(PrintStreamOrWriter printStreamOrWriter) {
            Set<Throwable> setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
            this.e = setNewSetFromMap;
            setNewSetFromMap.add(this.f5903c);
            synchronized (printStreamOrWriter.lock()) {
                try {
                    printStreamOrWriter.println(ExceptionUtils.a(this.f5903c));
                    StackTraceElement[] stackTrace = this.f5903c.getStackTrace();
                    d(stackTrace, printStreamOrWriter);
                    for (Throwable th : this.f5903c.getSuppressed()) {
                        d(th, printStreamOrWriter, stackTrace, "Suppressed: ", "\t");
                    }
                    Throwable cause = this.f5903c.getCause();
                    if (cause != null) {
                        d(cause, printStreamOrWriter, stackTrace, "Caused by: ", "");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        private void d(Throwable th, PrintStreamOrWriter printStreamOrWriter, StackTraceElement[] stackTraceElementArr, String str, String str2) {
            if (this.e.contains(th)) {
                printStreamOrWriter.append("\t[CIRCULAR REFERENCE:").append(ExceptionUtils.a(th)).println("]");
                return;
            }
            this.e.add(th);
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length - 1;
            for (int length2 = stackTraceElementArr.length - 1; length >= 0 && length2 >= 0 && stackTrace[length].equals(stackTraceElementArr[length2]); length2--) {
                length--;
            }
            int length3 = (stackTrace.length - 1) - length;
            printStreamOrWriter.append(str2).append(str).println(ExceptionUtils.a(th));
            for (int i = 0; i <= length; i++) {
                printStreamOrWriter.append(str2).append("\tat ").println(stackTrace[i]);
            }
            if (length3 != 0) {
                printStreamOrWriter.append(str2).append("\t... ").append(String.valueOf(length3)).println(" more");
            }
            for (Throwable th2 : th.getSuppressed()) {
                d(th2, printStreamOrWriter, stackTrace, "Suppressed: ", str2 + "\t");
            }
            Throwable cause = th.getCause();
            if (cause != null) {
                d(cause, printStreamOrWriter, stackTrace, "Caused by: ", str2);
            }
        }
    }

    static abstract class PrintStreamOrWriter {
        abstract PrintStreamOrWriter append(String str);

        abstract Object lock();

        abstract void println(Object obj);

        private PrintStreamOrWriter() {
        }
    }

    static class WrappedPrintStream extends PrintStreamOrWriter {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final PrintStream f5901c;

        WrappedPrintStream(PrintStream printStream) {
            super();
            this.f5901c = printStream;
        }

        @Override // com.huawei.haf.common.exception.ExceptionUtils.PrintStreamOrWriter
        Object lock() {
            return this.f5901c;
        }

        @Override // com.huawei.haf.common.exception.ExceptionUtils.PrintStreamOrWriter
        void println(Object obj) {
            this.f5901c.println(obj);
        }

        @Override // com.huawei.haf.common.exception.ExceptionUtils.PrintStreamOrWriter
        PrintStreamOrWriter append(String str) {
            this.f5901c.append((CharSequence) str);
            return this;
        }
    }

    static class WrappedPrintWriter extends PrintStreamOrWriter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final PrintWriter f5902b;

        WrappedPrintWriter(PrintWriter printWriter) {
            super();
            this.f5902b = printWriter;
        }

        @Override // com.huawei.haf.common.exception.ExceptionUtils.PrintStreamOrWriter
        Object lock() {
            return this.f5902b;
        }

        @Override // com.huawei.haf.common.exception.ExceptionUtils.PrintStreamOrWriter
        void println(Object obj) {
            this.f5902b.println(obj);
        }

        @Override // com.huawei.haf.common.exception.ExceptionUtils.PrintStreamOrWriter
        PrintStreamOrWriter append(String str) {
            this.f5902b.append((CharSequence) str);
            return this;
        }
    }
}
