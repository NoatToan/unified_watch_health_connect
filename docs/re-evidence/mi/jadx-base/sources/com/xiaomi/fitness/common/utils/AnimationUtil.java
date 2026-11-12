package com.xiaomi.fitness.common.utils;

import android.content.Context;
import android.provider.Settings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/common/utils/AnimationUtil;", "", "<init>", "()V", "getAnimationScale", "", "context", "Landroid/content/Context;", "getTransitionDurationScale", "getWindowAnimationScale", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AnimationUtil {

    @NotNull
    public static final AnimationUtil INSTANCE = new AnimationUtil();

    private AnimationUtil() {
    }

    public final float getAnimationScale(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public final float getTransitionDurationScale(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Settings.Global.getFloat(context.getContentResolver(), "transition_animation_scale", 1.0f);
    }

    public final float getWindowAnimationScale(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Settings.Global.getFloat(context.getContentResolver(), "window_animation_scale", 1.0f);
    }
}
