package com.google.firebase.crashlytics.internal.stacktrace;

/* JADX INFO: loaded from: classes2.dex */
public class MiddleOutStrategy implements StackTraceTrimmingStrategy {
    private final int trimmedSize;

    public MiddleOutStrategy(int i14) {
        this.trimmedSize = i14;
    }

    @Override // com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy
    public StackTraceElement[] getTrimmedStackTrace(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i14 = this.trimmedSize;
        if (length <= i14) {
            return stackTraceElementArr;
        }
        int i15 = i14 / 2;
        int i16 = i14 - i15;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i14];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i16);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i15, stackTraceElementArr2, i16, i15);
        return stackTraceElementArr2;
    }
}
