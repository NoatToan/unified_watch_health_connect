package defpackage;

import java.io.FileNotFoundException;
import java.net.BindException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.security.acl.NotOwnerException;
import java.sql.SQLException;
import java.util.ConcurrentModificationException;
import java.util.MissingResourceException;
import java.util.jar.JarException;

/* JADX INFO: loaded from: classes4.dex */
public class cpc {
    public static String c(Throwable th) {
        return b(th, true, true);
    }

    private static String b(Throwable th, boolean z, boolean z2) {
        if (th == null) {
            return "";
        }
        Throwable cause = th.getCause();
        if (cause == null || !z2) {
            return d(th, z);
        }
        return d(th, z) + ", Caused by: " + d(cause, z);
    }

    private static String d(Throwable th, boolean z) {
        if (z) {
            return b(th);
        }
        return th.toString();
    }

    private static String b(Throwable th) {
        if (th instanceof FileNotFoundException) {
            return "*** Exception 10001 ***";
        }
        if (a(th) || e(th)) {
            return th.getClass().getName() + "：******";
        }
        return th.toString();
    }

    public static boolean a(Throwable th) {
        if (th instanceof Error) {
            return d(th);
        }
        if (th instanceof Exception) {
            return j(th);
        }
        return false;
    }

    private static boolean d(Throwable th) {
        return (th instanceof OutOfMemoryError) || (th instanceof StackOverflowError);
    }

    private static boolean j(Throwable th) {
        return (th instanceof FileNotFoundException) || (th instanceof JarException) || (th instanceof BindException) || (th instanceof MissingResourceException) || (th instanceof ConcurrentModificationException) || (th instanceof NotOwnerException) || (th instanceof SQLException);
    }

    private static boolean e(Throwable th) {
        return (th instanceof SocketTimeoutException) || (th instanceof ConnectException);
    }
}
