package com.xiaomi.xms.wearable.di;

import com.mi.fitness.capability.export.model.CapabilityModel;
import defpackage.dei;
import defpackage.f6i;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements dei {
    public static CapabilityModel a() {
        return (CapabilityModel) f6i.c(XmsManagerModule.INSTANCE.provideWechatLicense());
    }
}
