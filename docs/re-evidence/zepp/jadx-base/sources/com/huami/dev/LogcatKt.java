package com.huami.dev;

import androidx.core.graphics.drawable.IconCompat;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.tekartik.sqflite.Constant;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a$\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u001a$\u0010\b\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u001a$\u0010\t\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u001a$\u0010\n\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u001a$\u0010\u000b\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u001a$\u0010\f\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u001a,\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\u0002\u001a\u0010\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u001a\u0010\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u001a\u0012\u0010\u0015\u001a\u00020\u00012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0002\"\u0016\u0010\u0017\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/huami/dev/Logcat;", "", "tag", "Lkotlin/Function0;", "", "message", "", "verbose", "debug", "info", "warn", "error", "wtf", "", Constant.e, "c", "Ljava/lang/StackTraceElement;", "trace", "a", "b", IconCompat.EXTRA_OBJ, "e", LogUtil.I, "DEFAULT_TRACE_LEVEL", "logcat_release"}, k = 2, mv = {1, 5, 1})
public final class LogcatKt {
    private static final int a = 4;

    /* JADX INFO: Access modifiers changed from: private */
    public static final String a(StackTraceElement stackTraceElement) {
        String name = Thread.currentThread().getName();
        return " >>> " + b(stackTraceElement) + " -> " + ((Object) stackTraceElement.getMethodName()) + "() | Thread:" + ((Object) name);
    }

    private static final String b(StackTraceElement stackTraceElement) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("(%s:%s)", Arrays.copyOf(new Object[]{stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber())}, 2));
    }

    private static final void c(String str, int i, Function0<? extends Object> function0) {
        if (Logcat.INSTANCE.getEnable()) {
            Timber.tag(str).log(i, e(function0.invoke()), new Object[0]);
        }
    }

    public static /* synthetic */ void d(String str, int i, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = Logcat.INSTANCE.getTag();
        }
        if ((i2 & 2) != 0) {
            i = 2;
        }
        c(str, i, function0);
    }

    public static final void debug(@NotNull Logcat logcat, @NotNull String str, @NotNull Function0<? extends Object> function0) {
        c(str, 3, function0);
    }

    public static /* synthetic */ void debug$default(Logcat logcat, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = Logcat.INSTANCE.getTag();
        }
        debug(logcat, str, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(Object obj) {
        String string;
        return (obj == null || (string = obj.toString()) == null) ? "null" : string;
    }

    public static final void error(@NotNull Logcat logcat, @NotNull String str, @NotNull Function0<? extends Object> function0) {
        c(str, 6, function0);
    }

    public static /* synthetic */ void error$default(Logcat logcat, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = Logcat.INSTANCE.getTag();
        }
        error(logcat, str, function0);
    }

    public static final void info(@NotNull Logcat logcat, @NotNull String str, @NotNull Function0<? extends Object> function0) {
        c(str, 4, function0);
    }

    public static /* synthetic */ void info$default(Logcat logcat, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = Logcat.INSTANCE.getTag();
        }
        info(logcat, str, function0);
    }

    public static final void verbose(@NotNull Logcat logcat, @NotNull String str, @NotNull Function0<? extends Object> function0) {
        c(str, 2, function0);
    }

    public static /* synthetic */ void verbose$default(Logcat logcat, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = Logcat.INSTANCE.getTag();
        }
        verbose(logcat, str, function0);
    }

    public static final void warn(@NotNull Logcat logcat, @NotNull String str, @NotNull Function0<? extends Object> function0) {
        c(str, 5, function0);
    }

    public static /* synthetic */ void warn$default(Logcat logcat, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = Logcat.INSTANCE.getTag();
        }
        warn(logcat, str, function0);
    }

    public static final void wtf(@NotNull Logcat logcat, @NotNull String str, @NotNull Function0<? extends Object> function0) {
        c(str, 6, function0);
    }

    public static /* synthetic */ void wtf$default(Logcat logcat, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = Logcat.INSTANCE.getTag();
        }
        wtf(logcat, str, function0);
    }
}
