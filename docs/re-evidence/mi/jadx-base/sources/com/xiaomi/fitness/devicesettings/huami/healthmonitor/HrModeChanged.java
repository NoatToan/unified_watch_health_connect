package com.xiaomi.fitness.devicesettings.huami.healthmonitor;

import defpackage.prf;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/HrModeChanged;", "Lprf;", "Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/HrMode;", "mode", "Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/HrMode;", "getMode", "()Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/HrMode;", "<init>", "(Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/HrMode;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HrModeChanged implements prf {

    @NotNull
    private final HrMode mode;

    public HrModeChanged(@NotNull HrMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.mode = mode;
    }

    @NotNull
    public final HrMode getMode() {
        return this.mode;
    }
}
