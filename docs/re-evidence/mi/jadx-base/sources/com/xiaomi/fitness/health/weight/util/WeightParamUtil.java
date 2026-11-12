package com.xiaomi.fitness.health.weight.util;

import com.xiaomi.fitness.util.ExtUtilKt;
import defpackage.c0j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\b¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/health/weight/util/WeightParamUtil;", "", "<init>", "()V", "getWeightBalanceLevelName", "", "level", "", "(Ljava/lang/Integer;)Ljava/lang/String;", "getSomatotypeName", "type", "getBodyShape", "shape", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WeightParamUtil {

    @NotNull
    public static final WeightParamUtil INSTANCE = new WeightParamUtil();

    private WeightParamUtil() {
    }

    @NotNull
    public final String getBodyShape(@Nullable Integer shape) {
        if (shape != null && shape.intValue() == 1) {
            return ExtUtilKt.getString(c0j.A3);
        }
        if (shape != null && shape.intValue() == 2) {
            return ExtUtilKt.getString(c0j.D3);
        }
        if (shape != null && shape.intValue() == 3) {
            return ExtUtilKt.getString(c0j.B3);
        }
        if (shape != null && shape.intValue() == 4) {
            return ExtUtilKt.getString(c0j.E3);
        }
        return (shape != null && shape.intValue() == 5) ? ExtUtilKt.getString(c0j.C3) : ExtUtilKt.getString(c0j.lo);
    }

    @NotNull
    public final String getSomatotypeName(@Nullable Integer type) {
        if (type != null && type.intValue() == 3) {
            return ExtUtilKt.getString(c0j.Kk);
        }
        if (type != null && type.intValue() == 1) {
            return ExtUtilKt.getString(c0j.Ok);
        }
        if (type != null && type.intValue() == -2) {
            return ExtUtilKt.getString(c0j.Mk);
        }
        if (type != null && type.intValue() == -1) {
            return ExtUtilKt.getString(c0j.Sk);
        }
        if (type != null && type.intValue() == -5) {
            return ExtUtilKt.getString(c0j.Tk);
        }
        if (type != null && type.intValue() == -4) {
            return ExtUtilKt.getString(c0j.Rk);
        }
        if (type != null && type.intValue() == 0) {
            return ExtUtilKt.getString(c0j.Lk);
        }
        if (type != null && type.intValue() == 2) {
            return ExtUtilKt.getString(c0j.Qk);
        }
        if (type != null && type.intValue() == 4) {
            return ExtUtilKt.getString(c0j.Pk);
        }
        return (type != null && type.intValue() == -3) ? ExtUtilKt.getString(c0j.Nk) : ExtUtilKt.getString(c0j.lo);
    }

    @NotNull
    public final String getWeightBalanceLevelName(@Nullable Integer level) {
        if (level != null && level.intValue() == 0) {
            return ExtUtilKt.getString(c0j.Y);
        }
        if (level != null && level.intValue() == 1) {
            return ExtUtilKt.getString(c0j.X);
        }
        return (level != null && level.intValue() == 2) ? ExtUtilKt.getString(c0j.W) : ExtUtilKt.getString(c0j.lo);
    }
}
