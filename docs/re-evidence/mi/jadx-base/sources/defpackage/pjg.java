package defpackage;

import com.mi.fitness.capability.export.model.CapabilityModel;
import com.mi.fitness.netproxy.NetProxyModule;

/* JADX INFO: loaded from: classes5.dex */
public final class pjg implements dei {
    public static CapabilityModel a(NetProxyModule netProxyModule) {
        return (CapabilityModel) f6i.c(netProxyModule.provideNetProxyCap());
    }
}
