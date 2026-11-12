package com.xiaomi.fitness.sport_capture.manager;

import com.mi.fitness.capability.export.model.CapabilityModel;
import defpackage.dei;
import defpackage.f6i;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements dei {
    public static CapabilityModel a() {
        return (CapabilityModel) f6i.c(SportCaptureManagerModule.INSTANCE.provideSportCapture());
    }
}
