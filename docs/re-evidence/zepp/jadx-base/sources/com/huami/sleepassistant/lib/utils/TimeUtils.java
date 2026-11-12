package com.huami.sleepassistant.lib.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002R\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0016\u0010\f\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0016\u0010\r\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0016\u0010\u000e\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0016\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0016\u0010\u0010\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0016\u0010\u0011\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/huami/sleepassistant/lib/utils/TimeUtils;", "", "", "i", "", "a", "time", "secToTime", "", "TIME_30_MINUTE", "J", "TIME_1_HOURS", "TIME_1_HOURS_30_MINUTE", "TIME_2_HOURS", "TIME_2_HOURS_30_MINUTE", "TIME_3_HOURS", "TIME_3_HOURS_30_MINUTE", "TIME_4_HOURS", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class TimeUtils {

    @NotNull
    public static final TimeUtils INSTANCE = new TimeUtils();
    public static final long TIME_1_HOURS = 3600;
    public static final long TIME_1_HOURS_30_MINUTE = 5400;
    public static final long TIME_2_HOURS = 7200;
    public static final long TIME_2_HOURS_30_MINUTE = 9000;
    public static final long TIME_30_MINUTE = 1800;
    public static final long TIME_3_HOURS = 10800;
    public static final long TIME_3_HOURS_30_MINUTE = 12600;
    public static final long TIME_4_HOURS = 14400;

    private TimeUtils() {
    }

    private final String a(int i) {
        boolean z = false;
        if (i >= 0 && i <= 9) {
            z = true;
        }
        return z ? Intrinsics.stringPlus("0", Integer.valueOf(i)) : Intrinsics.stringPlus("", Integer.valueOf(i));
    }

    @NotNull
    public final String secToTime(int time) {
        if (time <= 0) {
            return "00:00";
        }
        int i = time / 60;
        if (i < 60) {
            return a(i) + JsonLexerKt.COLON + a(time % 60);
        }
        int i2 = i / 60;
        if (i2 > 99) {
            return "99:59:55";
        }
        int i3 = i % 60;
        return a(i2) + JsonLexerKt.COLON + a(i3) + JsonLexerKt.COLON + a((time - (i2 * 3600)) - (i3 * 60));
    }
}
