package kotlin;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.internal.HidesMembers;
import kotlin.internal.InlineOnly;
import kotlin.internal.PlatformImplementationsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes23.dex */
public class a {
    @InlineOnly
    private static final void a(Throwable th) {
        th.printStackTrace();
    }

    @SinceKotlin(version = "1.1")
    @HidesMembers
    public static void addSuppressed(@NotNull Throwable th, @NotNull Throwable th2) throws IllegalAccessException, InvocationTargetException {
        if (th != th2) {
            PlatformImplementationsKt.IMPLEMENTATIONS.addSuppressed(th, th2);
        }
    }

    @InlineOnly
    private static final void b(Throwable th, PrintStream printStream) {
        th.printStackTrace(printStream);
    }

    @InlineOnly
    private static final void c(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
    }

    @NotNull
    public static final StackTraceElement[] getStackTrace(@NotNull Throwable th) {
        return th.getStackTrace();
    }

    public static /* synthetic */ void getStackTrace$annotations(Throwable th) {
    }

    @NotNull
    public static final List<Throwable> getSuppressedExceptions(@NotNull Throwable th) {
        return PlatformImplementationsKt.IMPLEMENTATIONS.getSuppressed(th);
    }

    @SinceKotlin(version = "1.4")
    public static /* synthetic */ void getSuppressedExceptions$annotations(Throwable th) {
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static String stackTraceToString(@NotNull Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }
}
