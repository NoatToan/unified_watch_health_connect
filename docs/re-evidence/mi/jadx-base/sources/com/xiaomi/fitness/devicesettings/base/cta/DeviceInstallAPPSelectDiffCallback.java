package com.xiaomi.fitness.devicesettings.base.cta;

import androidx.recyclerview.widget.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/cta/DeviceInstallAPPSelectDiffCallback;", "Landroidx/recyclerview/widget/h$f;", "Lcom/xiaomi/fitness/devicesettings/base/cta/CTABehaviorApp;", "oldItem", "newItem", "", "areItemsTheSame", "(Lcom/xiaomi/fitness/devicesettings/base/cta/CTABehaviorApp;Lcom/xiaomi/fitness/devicesettings/base/cta/CTABehaviorApp;)Z", "areContentsTheSame", "<init>", "()V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DeviceInstallAPPSelectDiffCallback extends h.f<CTABehaviorApp> {
    @Override // androidx.recyclerview.widget.h.f
    public boolean areContentsTheSame(@NotNull CTABehaviorApp oldItem, @NotNull CTABehaviorApp newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return false;
    }

    @Override // androidx.recyclerview.widget.h.f
    public boolean areItemsTheSame(@NotNull CTABehaviorApp oldItem, @NotNull CTABehaviorApp newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return false;
    }
}
