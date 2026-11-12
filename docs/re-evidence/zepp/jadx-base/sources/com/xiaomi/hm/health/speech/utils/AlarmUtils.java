package com.xiaomi.hm.health.speech.utils;

/* JADX INFO: loaded from: classes21.dex */
public class AlarmUtils {
    private static final long a = 1000;
    private static final long b = 60;

    public static int[] convertTimeIntervalToMinuteAndSecondsArr(long timerStartTimeStamp, long timerEndTimeStamp) {
        int[] iArr = new int[2];
        if (timerStartTimeStamp > 0 && timerEndTimeStamp > 0 && timerEndTimeStamp > timerStartTimeStamp) {
            long j = (timerEndTimeStamp / 1000) - (timerStartTimeStamp / 1000);
            iArr[0] = (int) (j / 60);
            iArr[1] = (int) (j % 60);
        }
        return iArr;
    }
}
