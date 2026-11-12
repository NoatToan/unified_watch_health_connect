package com.xiaomi.fitness.devicesettings.di;

import com.mi.fitness.capability.export.model.CapabilityModel;
import defpackage.dei;
import defpackage.f6i;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements dei {
    public static CapabilityModel a() {
        return (CapabilityModel) f6i.c(DeviceSettingsExportModule.INSTANCE.provideSupportSyncCapture());
    }
}
