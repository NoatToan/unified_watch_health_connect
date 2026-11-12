package com.xiaomi.fitness.nfc.di;

import com.mi.fitness.capability.export.model.CapabilityModel;
import defpackage.dei;
import defpackage.f6i;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements dei {
    public static CapabilityModel a() {
        return (CapabilityModel) f6i.c(NfcModule.INSTANCE.provide());
    }
}
