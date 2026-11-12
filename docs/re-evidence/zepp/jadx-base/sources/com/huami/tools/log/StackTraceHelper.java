package com.huami.tools.log;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0015\u0010\r\u001a\u0004\u0018\u00010\n8F@\u0006¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0013\u0010\u0011\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/huami/tools/log/StackTraceHelper;", "", "", "a", "Ljava/lang/String;", "getTargetStackElementPrefix", "()Ljava/lang/String;", "setTargetStackElementPrefix", "(Ljava/lang/String;)V", "targetStackElementPrefix", "Ljava/lang/StackTraceElement;", "getInvokeTraceElement", "()Ljava/lang/StackTraceElement;", "invokeTraceElement", "getInvokeClassName", "invokeClassName", "getInvokeInfo", "invokeInfo", "<init>", "()V", "log_release"}, k = 1, mv = {1, 4, 0})
public final class StackTraceHelper {
    public static final StackTraceHelper INSTANCE = new StackTraceHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static String targetStackElementPrefix;

    static {
        String name;
        HMLog hMLog = HMLog.INSTANCE;
        Package r1 = hMLog.getClass().getPackage();
        if (r1 == null || (name = r1.getName()) == null) {
            name = hMLog.getClass().getName();
        }
        targetStackElementPrefix = name;
    }

    private StackTraceHelper() {
    }

    @Nullable
    public final String getInvokeClassName() {
        StackTraceElement invokeTraceElement = getInvokeTraceElement();
        if (invokeTraceElement != null) {
            return invokeTraceElement.getClassName();
        }
        return null;
    }

    @NotNull
    public final String getInvokeInfo() {
        String strA;
        StackTraceElement invokeTraceElement = getInvokeTraceElement();
        return (invokeTraceElement == null || (strA = StackTraceHelperKt.a(invokeTraceElement)) == null) ? "" : strA;
    }

    @Nullable
    public final StackTraceElement getInvokeTraceElement() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String str = targetStackElementPrefix;
        int i = -1;
        for (int length = stackTrace.length - 1; length >= 0; length--) {
            if (m.startsWith$default(stackTrace[length].getClassName(), str, false, 2, null)) {
                i = length;
                break;
            }
        }
        return (StackTraceElement) ArraysKt.getOrNull(stackTrace, i + 1);
    }

    @NotNull
    public final String getTargetStackElementPrefix() {
        return targetStackElementPrefix;
    }

    public final void setTargetStackElementPrefix(@NotNull String str) {
        targetStackElementPrefix = str;
    }
}
