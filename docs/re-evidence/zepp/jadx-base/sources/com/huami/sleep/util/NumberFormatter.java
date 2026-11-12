package com.huami.sleep.util;

import com.huami.moving.ui.animator.AnimatorViewWrapper;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\"\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\n\u0010\u0003\u001a\u00020\u0002\"\u00020\u0004J\"\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00042\n\u0010\u0003\u001a\u00020\u0002\"\u00020\u0004J$\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\n\u0010\u0003\u001a\u00020\u0002\"\u00020\u0004J$\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00042\n\u0010\u0003\u001a\u00020\u0002\"\u00020\u0004¨\u0006\u0010"}, d2 = {"Lcom/huami/sleep/util/NumberFormatter;", "", "", "mode", "", "a", "", "value", AnimatorViewWrapper.SCALE, TrainingWebConst.QueryParam.VIDEO_FORMAT, "", "", "formatDouble2String", "formatFloat2String", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class NumberFormatter {

    @NotNull
    public static final NumberFormatter INSTANCE = new NumberFormatter();

    private NumberFormatter() {
    }

    private final int a(int[] mode) {
        if (mode == null || mode.length != 1 || mode[0] < 0 || mode[0] > 6) {
            return 1;
        }
        return mode[0];
    }

    public final double format(double value, int scale, @NotNull int... mode) {
        return new BigDecimal(String.valueOf(value)).setScale(scale, a(mode)).doubleValue();
    }

    @Nullable
    public final String formatDouble2String(double value, int scale, @NotNull int... mode) {
        double d = mode.length == 1 ? format(value, scale, mode[0]) : format(value, scale, new int[0]);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(Locale.getDefault(), "%." + scale + "f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
    }

    @Nullable
    public final String formatFloat2String(float value, int scale, @NotNull int... mode) {
        float f = mode.length == 1 ? format(value, scale, mode[0]) : format(value, scale, new int[0]);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(Locale.getDefault(), "%." + scale + "f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
    }

    public final float format(float value, int scale, @NotNull int... mode) {
        return new BigDecimal(String.valueOf(value)).setScale(scale, a(mode)).floatValue();
    }
}
