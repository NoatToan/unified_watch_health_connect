package com.xiaomi.fitness.data.valueformatter;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.health.curse.data.CurseFactor;
import defpackage.c0j;
import defpackage.onq;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/data/valueformatter/CurseSymChartValueFormatter;", "Lonq;", "", "value", "", "getFormattedValue", "(F)Ljava/lang/String;", "Lcom/xiaomi/fitness/health/curse/data/CurseFactor;", "factor", "Lcom/xiaomi/fitness/health/curse/data/CurseFactor;", "getFactor", "()Lcom/xiaomi/fitness/health/curse/data/CurseFactor;", "<init>", "(Lcom/xiaomi/fitness/health/curse/data/CurseFactor;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CurseSymChartValueFormatter extends onq {

    @NotNull
    private final CurseFactor factor;

    public CurseSymChartValueFormatter(@NotNull CurseFactor factor) {
        Intrinsics.checkNotNullParameter(factor, "factor");
        this.factor = factor;
    }

    @NotNull
    public final CurseFactor getFactor() {
        return this.factor;
    }

    @Override // defpackage.onq
    @NotNull
    public String getFormattedValue(float value) {
        if (Intrinsics.areEqual(this.factor, CurseFactor.Hurt.INSTANCE)) {
            int i = ((int) value) - 1;
            if (i == -1) {
                String string = ApplicationExtKt.getApplication().getString(c0j.p5);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return string;
            }
            if (i == 0) {
                String string2 = ApplicationExtKt.getApplication().getString(c0j.Zp);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }
            if (i == 1) {
                String string3 = ApplicationExtKt.getApplication().getString(c0j.aq);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return string3;
            }
            if (i != 2) {
                return "";
            }
            String string4 = ApplicationExtKt.getApplication().getString(c0j.Yp);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            return string4;
        }
        if (Intrinsics.areEqual(this.factor, CurseFactor.Blood.INSTANCE)) {
            int i2 = ((int) value) - 1;
            if (i2 == -1) {
                String string5 = ApplicationExtKt.getApplication().getString(c0j.p5);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                return string5;
            }
            if (i2 == 0) {
                String string6 = ApplicationExtKt.getApplication().getString(c0j.Mp);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                return string6;
            }
            if (i2 == 1) {
                String string7 = ApplicationExtKt.getApplication().getString(c0j.Op);
                Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                return string7;
            }
            if (i2 != 2) {
                return "";
            }
            String string8 = ApplicationExtKt.getApplication().getString(c0j.Np);
            Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
            return string8;
        }
        if (!Intrinsics.areEqual(this.factor, CurseFactor.Motion.INSTANCE)) {
            return "";
        }
        Logger.d("CurseSymChartValueFormatter", "cyzdebug - getFormattedValue: " + value);
        int i3 = (5 - (((int) value) - 1)) / 2;
        if (i3 == -1) {
            return "";
        }
        if (i3 == 0) {
            String string9 = ApplicationExtKt.getApplication().getString(c0j.Vp);
            Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
            return string9;
        }
        if (i3 == 1) {
            String string10 = ApplicationExtKt.getApplication().getString(c0j.Wp);
            Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
            return string10;
        }
        if (i3 != 2) {
            return "";
        }
        String string11 = ApplicationExtKt.getApplication().getString(c0j.Xp);
        Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
        return string11;
    }
}
