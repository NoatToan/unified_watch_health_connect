package com.google.firebase.crashlytics.internal.stacktrace;

import java.util.Stack;

/* JADX INFO: loaded from: classes2.dex */
public class TrimmedThrowableData {
    public final TrimmedThrowableData cause;
    public final String className;
    public final String localizedMessage;
    public final StackTraceElement[] stacktrace;

    private TrimmedThrowableData(String str, String str2, StackTraceElement[] stackTraceElementArr, TrimmedThrowableData trimmedThrowableData) {
        this.localizedMessage = str;
        this.className = str2;
        this.stacktrace = stackTraceElementArr;
        this.cause = trimmedThrowableData;
    }

    public static TrimmedThrowableData makeTrimmedThrowableData(Throwable th3, StackTraceTrimmingStrategy stackTraceTrimmingStrategy) {
        Stack stack = new Stack();
        while (th3 != null) {
            stack.push(th3);
            th3 = th3.getCause();
        }
        TrimmedThrowableData trimmedThrowableData = null;
        while (!stack.isEmpty()) {
            Throwable th4 = (Throwable) stack.pop();
            trimmedThrowableData = new TrimmedThrowableData(th4.getLocalizedMessage(), th4.getClass().getName(), stackTraceTrimmingStrategy.getTrimmedStackTrace(th4.getStackTrace()), trimmedThrowableData);
        }
        return trimmedThrowableData;
    }
}
