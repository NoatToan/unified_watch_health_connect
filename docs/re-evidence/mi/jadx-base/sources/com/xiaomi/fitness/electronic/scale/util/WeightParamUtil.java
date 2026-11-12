package com.xiaomi.fitness.electronic.scale.util;

import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import defpackage.zzi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\b¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/util/WeightParamUtil;", "", "<init>", "()V", "getWeightBalanceLevelName", "", "level", "", "(Ljava/lang/Integer;)Ljava/lang/String;", "getSomatotypeName", "type", "getBodyShape", "shape", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WeightParamUtil {

    @NotNull
    public static final WeightParamUtil INSTANCE = new WeightParamUtil();

    private WeightParamUtil() {
    }

    @NotNull
    public final String getBodyShape(@Nullable Integer shape) {
        if (shape != null && shape.intValue() == 1) {
            return ResourceExtKt.getString(zzi.a2);
        }
        if (shape != null && shape.intValue() == 2) {
            return ResourceExtKt.getString(zzi.d2);
        }
        if (shape != null && shape.intValue() == 3) {
            return ResourceExtKt.getString(zzi.b2);
        }
        if (shape != null && shape.intValue() == 4) {
            return ResourceExtKt.getString(zzi.e2);
        }
        return (shape != null && shape.intValue() == 5) ? ResourceExtKt.getString(zzi.c2) : ResourceExtKt.getString(zzi.r3);
    }

    @NotNull
    public final String getSomatotypeName(@Nullable Integer type) {
        if (type != null && type.intValue() == 3) {
            return ResourceExtKt.getString(zzi.g3);
        }
        if (type != null && type.intValue() == 1) {
            return ResourceExtKt.getString(zzi.k3);
        }
        if (type != null && type.intValue() == -2) {
            return ResourceExtKt.getString(zzi.i3);
        }
        if (type != null && type.intValue() == -1) {
            return ResourceExtKt.getString(zzi.o3);
        }
        if (type != null && type.intValue() == -5) {
            return ResourceExtKt.getString(zzi.p3);
        }
        if (type != null && type.intValue() == -4) {
            return ResourceExtKt.getString(zzi.n3);
        }
        if (type != null && type.intValue() == 0) {
            return ResourceExtKt.getString(zzi.h3);
        }
        if (type != null && type.intValue() == 2) {
            return ResourceExtKt.getString(zzi.m3);
        }
        if (type != null && type.intValue() == 4) {
            return ResourceExtKt.getString(zzi.l3);
        }
        return (type != null && type.intValue() == -3) ? ResourceExtKt.getString(zzi.j3) : ResourceExtKt.getString(zzi.r3);
    }

    @NotNull
    public final String getWeightBalanceLevelName(@Nullable Integer level) {
        if (level != null && level.intValue() == 0) {
            return ResourceExtKt.getString(zzi.k1);
        }
        if (level != null && level.intValue() == 1) {
            return ResourceExtKt.getString(zzi.j1);
        }
        return (level != null && level.intValue() == 2) ? ResourceExtKt.getString(zzi.i1) : ResourceExtKt.getString(zzi.r3);
    }
}
