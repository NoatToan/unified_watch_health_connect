package com.huawei.hmf.md.bootstrap;

import com.huawei.hmf.repository.Repository;
import com.huawei.hmf.services.ApiSet;
import com.huawei.hmf.services.ModuleProviderWrapper;
import defpackage.bus;
import defpackage.bvb;

/* JADX INFO: loaded from: classes33.dex */
public final class BasicHealthModelModuleBootstrap {
    public static final void register(Repository repository) {
        ApiSet.Builder builder = ApiSet.builder();
        builder.add(bus.class, "com.huawei.health.healthmodel.HealthLifeApi");
        new ModuleProviderWrapper(new bvb(), 1).bootstrap(repository, name(), builder.build());
    }

    public static final String name() {
        return "BasicHealthModel";
    }
}
