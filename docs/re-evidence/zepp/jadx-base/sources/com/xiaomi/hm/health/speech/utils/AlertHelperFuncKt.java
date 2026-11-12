package com.xiaomi.hm.health.speech.utils;

import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0000\u001a\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\u0006"}, d2 = {"", "getReminderWorkDayFlag", "getReminderWeekendFlag", "", "daysOfWeek", "getDaysOfWeekFlag", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class AlertHelperFuncKt {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final short getDaysOfWeekFlag(@NotNull String str) {
        int i;
        short s = 0;
        for (String str2 : StringsKt__StringsKt.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null)) {
            switch (str2.hashCode()) {
                case 49:
                    if (!str2.equals("1")) {
                        throw new IllegalArgumentException("unexpected value");
                    }
                    i = s | 32;
                    break;
                    break;
                case 50:
                    if (!str2.equals("2")) {
                        throw new IllegalArgumentException("unexpected value");
                    }
                    i = s | 64;
                    break;
                    break;
                case 51:
                    if (!str2.equals("3")) {
                        throw new IllegalArgumentException("unexpected value");
                    }
                    i = s | 128;
                    break;
                    break;
                case 52:
                    if (!str2.equals("4")) {
                        throw new IllegalArgumentException("unexpected value");
                    }
                    i = s | 256;
                    break;
                    break;
                case 53:
                    if (!str2.equals("5")) {
                        throw new IllegalArgumentException("unexpected value");
                    }
                    i = s | 512;
                    break;
                    break;
                case 54:
                    if (!str2.equals("6")) {
                        throw new IllegalArgumentException("unexpected value");
                    }
                    i = s | 1024;
                    break;
                    break;
                case 55:
                    if (!str2.equals("7")) {
                        throw new IllegalArgumentException("unexpected value");
                    }
                    i = s | 2048;
                    break;
                    break;
                default:
                    throw new IllegalArgumentException("unexpected value");
            }
            s = (short) i;
        }
        return s;
    }

    public static final short getReminderWeekendFlag() {
        return (short) 3072;
    }

    public static final short getReminderWorkDayFlag() {
        return (short) (((short) (((short) (((short) 96) | 128)) | 256)) | 512);
    }
}
