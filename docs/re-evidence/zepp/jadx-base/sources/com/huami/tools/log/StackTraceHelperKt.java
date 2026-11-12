package com.huami.tools.log;

import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0019\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u001a\u0010\b\u001a\u00020\u0001*\u00020\u00058B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"", "", "getStackTraceString", "(Ljava/lang/Throwable;)Ljava/lang/String;", "stackTraceString", "Ljava/lang/StackTraceElement;", "a", "(Ljava/lang/StackTraceElement;)Ljava/lang/String;", "invokeInfo", "log_release"}, k = 2, mv = {1, 4, 0})
public final class StackTraceHelperKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String a(@NotNull StackTraceElement stackTraceElement) {
        return stackTraceElement.getClassName() + " / " + stackTraceElement.getMethodName() + " / " + stackTraceElement.getLineNumber();
    }

    @NotNull
    public static final String getStackTraceString(@Nullable Throwable th) {
        if (th == null) {
            return "";
        }
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }
}
