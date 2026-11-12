package com.huawei.hmf.md.bootstrap;

import com.huawei.hmf.repository.Repository;
import com.huawei.hmf.services.ApiSet;
import com.huawei.hmf.services.ModuleProviderWrapper;
import defpackage.ehs;
import defpackage.eie;
import defpackage.eig;
import defpackage.eih;

/* JADX INFO: loaded from: classes33.dex */
public final class EcologyDeviceModuleBootstrap {
    public static final void register(Repository repository) {
        ApiSet.Builder builder = ApiSet.builder();
        builder.add(eig.class, "com.huawei.health.device.api.EcologyDeviceApi");
        builder.add(eie.class, "com.huawei.health.device.api.ResourceManagerApi");
        builder.add(ehs.class, "com.huawei.health.hearratecontrol.HeartRateControlConfigApi");
        new ModuleProviderWrapper(new eih(), 1).bootstrap(repository, name(), builder.build());
    }

    public static final String name() {
        return "EcologyDevice";
    }
}
