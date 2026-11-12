package com.google.firebase.crashlytics.internal.stacktrace;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class RemoveRepeatsStrategy implements StackTraceTrimmingStrategy {
    private final int maxRepetitions;

    public RemoveRepeatsStrategy(int i14) {
        this.maxRepetitions = i14;
    }

    private static boolean isRepeatingSequence(StackTraceElement[] stackTraceElementArr, int i14, int i15) {
        int i16 = i15 - i14;
        if (i15 + i16 > stackTraceElementArr.length) {
            return false;
        }
        for (int i17 = 0; i17 < i16; i17++) {
            if (!stackTraceElementArr[i14 + i17].equals(stackTraceElementArr[i15 + i17])) {
                return false;
            }
        }
        return true;
    }

    private static StackTraceElement[] trimRepeats(StackTraceElement[] stackTraceElementArr, int i14) {
        int i15;
        HashMap map = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i16 = 0;
        int i17 = 0;
        int i18 = 1;
        while (i16 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i16];
            Integer num = (Integer) map.get(stackTraceElement);
            if (num == null || !isRepeatingSequence(stackTraceElementArr, num.intValue(), i16)) {
                stackTraceElementArr2[i17] = stackTraceElementArr[i16];
                i17++;
                i18 = 1;
                i15 = i16;
            } else {
                int iIntValue = i16 - num.intValue();
                if (i18 < i14) {
                    System.arraycopy(stackTraceElementArr, i16, stackTraceElementArr2, i17, iIntValue);
                    i17 += iIntValue;
                    i18++;
                }
                i15 = (iIntValue - 1) + i16;
            }
            map.put(stackTraceElement, Integer.valueOf(i16));
            i16 = i15 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i17];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i17);
        return stackTraceElementArr3;
    }

    @Override // com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy
    public StackTraceElement[] getTrimmedStackTrace(StackTraceElement[] stackTraceElementArr) {
        StackTraceElement[] stackTraceElementArrTrimRepeats = trimRepeats(stackTraceElementArr, this.maxRepetitions);
        return stackTraceElementArrTrimRepeats.length < stackTraceElementArr.length ? stackTraceElementArrTrimRepeats : stackTraceElementArr;
    }

    public RemoveRepeatsStrategy() {
        this(1);
    }
}
