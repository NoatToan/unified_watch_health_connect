package com.huami.sleep.util;

import com.huami.sleep.ext.KoinExtKt;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0005\u001a\u00020\u0003*\u00020\u0000¨\u0006\u0006"}, d2 = {"", "", "is24Hour", "", "formatMinTHHmm", "formatMinToH", "sleep_release"}, k = 2, mv = {1, 5, 1})
public final class SleepTimeUtilKt {
    @NotNull
    public static final String formatMinTHHmm(int i, boolean z) {
        return TimeUtils.formatTime(KoinExtKt.getAppContext(), TimeUtils.getDate(i), z);
    }

    @NotNull
    public static final String formatMinToH(int i) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(i / 60.0f)}, 1)) + "h";
    }
}
