package com.xiaomi.fitness.training_plan.util;

import android.annotation.SuppressLint;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import defpackage.cyi;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\n\u001a\u00020\u000b¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/training_plan/util/TrainingDataUtils;", "", "<init>", "()V", "handleTotalDuration", "Lkotlin/Pair;", "", "duration", "", "handleTotalDistance", "distance", "", "handleTotalDistanceWithEn", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TrainingDataUtils {

    @NotNull
    public static final TrainingDataUtils INSTANCE = new TrainingDataUtils();

    private TrainingDataUtils() {
    }

    @SuppressLint({"DefaultLocale"})
    @NotNull
    public final Pair<String, String> handleTotalDistance(float distance) {
        if (distance <= 1000.0f) {
            int i = (int) distance;
            return new Pair<>(String.valueOf(i), ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), cyi.l, i, Float.valueOf(distance)));
        }
        float f = distance / 1000;
        if (f >= 1000.0f) {
            int i2 = (int) f;
            return new Pair<>(String.valueOf(i2), ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), cyi.f14868k, i2, Float.valueOf(f)));
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return new Pair<>(str, ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), cyi.f14868k, (int) f, Float.valueOf(f)));
    }

    @NotNull
    public final Pair<String, String> handleTotalDistanceWithEn(float distance) {
        if (distance <= 1000.0f) {
            return new Pair<>(String.valueOf((int) distance), "m");
        }
        float f = distance / 1000;
        if (f >= 1000.0f) {
            return new Pair<>(String.valueOf((int) f), "km");
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return new Pair<>(str, "km");
    }

    @SuppressLint({"DefaultLocale"})
    @NotNull
    public final Pair<String, String> handleTotalDuration(int duration) {
        if (duration < 60) {
            return new Pair<>(String.valueOf(duration), ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), cyi.o, duration, Integer.valueOf(duration)));
        }
        if (duration < 3600) {
            int i = duration / 60;
            return new Pair<>(String.valueOf(i), ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), cyi.n, i, Integer.valueOf(i)));
        }
        float f = duration / 3600;
        int i2 = (int) f;
        if (i2 > 1000.0f) {
            return new Pair<>(String.valueOf(i2), ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), cyi.m, i2, Integer.valueOf(i2)));
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return new Pair<>(str, ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), cyi.m, i2, Float.valueOf(f)));
    }
}
