package defpackage;

import com.mi.fitness.capability.export.model.CapabilityModel;
import com.xiaomi.fitness.smarthome.di.SmartModule;

/* JADX INFO: loaded from: classes7.dex */
public final class u2n implements dei {
    public static CapabilityModel a(SmartModule smartModule) {
        return (CapabilityModel) f6i.c(smartModule.provideSmartHome());
    }
}
