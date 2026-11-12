package com.xiaomi.fitness.devicesettings.base;

import com.xiaomi.fitness.baseui.view.BaseFragment;
import defpackage.jni;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"defaultActionBarParamBuilder", "Lcom/xiaomi/fitness/devicesettings/base/ActionBarParamBuilder;", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "device-settings_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ActionBarParamBuilderKt {
    @NotNull
    public static final ActionBarParamBuilder defaultActionBarParamBuilder(@NotNull BaseFragment baseFragment) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        return new ActionBarParamBuilder().setStartView(jni.Q0);
    }
}
