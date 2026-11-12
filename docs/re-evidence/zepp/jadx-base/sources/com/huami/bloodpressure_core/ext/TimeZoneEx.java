package com.huami.bloodpressure_core.ext;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\u0002R\u0016\u0010\n\u001a\u00020\u00028B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\u00028B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/huami/bloodpressure_core/ext/TimeZoneEx;", "", "", "second", "", "getTimeZoneIdFromSeconds", "(Ljava/lang/Integer;)Ljava/lang/String;", "getSecondsFromGMT", "a", "()I", "TIMEZONE_MAXSECONDS", "b", "TIMEZONE_SECONDS", "<init>", "()V", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
public final class TimeZoneEx {

    @NotNull
    public static final TimeZoneEx INSTANCE = new TimeZoneEx();

    private TimeZoneEx() {
    }

    private final int a() {
        return (int) TimeUnit.HOURS.toSeconds(18L);
    }

    private final int b() {
        return (int) TimeUnit.HOURS.toSeconds(1L);
    }

    public final int getSecondsFromGMT() {
        return (Calendar.getInstance().get(15) + Calendar.getInstance().get(16)) / 1000;
    }

    @NotNull
    public final String getTimeZoneIdFromSeconds(@Nullable Integer second) {
        String str;
        if (second == null || Math.abs(second.intValue()) > a()) {
            return "GMT+8";
        }
        int iIntValue = second.intValue() / b();
        if (iIntValue >= 0) {
            str = "GMT+" + iIntValue;
        } else {
            str = "GMT" + iIntValue;
        }
        return str;
    }
}
