package com.xiaomi.hm.health.utils.ex;

import com.xiaomi.hm.health.baseutil.DecimalUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0003\"\u0016\u0010\u0007\u001a\u00020\u00018\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"", "", "toFloatString", "", "toDoubleString", "a", "Ljava/lang/String;", "DEFAULT_STRING", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class DecimalExKt {

    @NotNull
    private static final String a = "0";

    @NotNull
    public static final String toDoubleString(double d) {
        return DecimalUtil.doubleToStr(Double.valueOf(d));
    }

    @NotNull
    public static final String toFloatString(float f) {
        return DecimalUtil.floatToStr(Float.valueOf(f));
    }
}
