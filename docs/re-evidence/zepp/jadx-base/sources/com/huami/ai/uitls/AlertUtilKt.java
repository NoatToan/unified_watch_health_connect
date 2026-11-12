package com.huami.ai.uitls;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.ai.koin.common.TimerParam;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\n\n\u0002\b\r\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\"\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0016\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006\"\u0016\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006\"\u0013\u0010\f\u001a\u00020\t8F@\u0006¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u0013\u0010\u000e\u001a\u00020\t8F@\u0006¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b\"\u0013\u0010\u0011\u001a\u00020\u00048F@\u0006¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0013\u0010\u0013\u001a\u00020\u00048F@\u0006¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010\"\u0013\u0010\u0015\u001a\u00020\u00048F@\u0006¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u0016"}, d2 = {"", "scheduleTime", "Lcom/huami/ai/koin/common/TimerParam;", "parseTimerTime", "", "MILLIS_SECOND", LogUtil.I, "MILLIS_MINUTE", "MILLIS_HOUR", "", "getWorkingDay_HMReminderInfo", "()S", "workingDay_HMReminderInfo", "getWeekend_HMReminderInfo", "weekend_HMReminderInfo", "getWorkingDay_AlertContent", "()I", "workingDay_AlertContent", "getEveryDay_AlertContent", "everyDay_AlertContent", "getWeekend_AlertContent", "weekend_AlertContent", "speech-skill_release"}, k = 2, mv = {1, 5, 1})
public final class AlertUtilKt {
    public static final int MILLIS_HOUR = 3600000;
    public static final int MILLIS_MINUTE = 60000;
    public static final int MILLIS_SECOND = 1000;

    public static final int getEveryDay_AlertContent() {
        return getWorkingDay_AlertContent() | 32 | 64;
    }

    public static final int getWeekend_AlertContent() {
        return 96;
    }

    public static final short getWeekend_HMReminderInfo() {
        return (short) 3072;
    }

    public static final int getWorkingDay_AlertContent() {
        return 31;
    }

    public static final short getWorkingDay_HMReminderInfo() {
        return (short) (((short) (((short) (((short) 96) | 128)) | 256)) | 512);
    }

    @NotNull
    public static final TimerParam parseTimerTime(long j) {
        long jCurrentTimeMillis = j - System.currentTimeMillis();
        long j2 = 3600000;
        long j3 = jCurrentTimeMillis / j2;
        long j4 = jCurrentTimeMillis - (j2 * j3);
        long j5 = 60000;
        long j6 = j4 / j5;
        return new TimerParam((int) j3, (int) j6, (int) ((j4 - (j5 * j6)) / ((long) 1000)));
    }
}
