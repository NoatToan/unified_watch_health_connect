package com.huawei.hmf.md.bootstrap;

import com.huawei.hmf.repository.Repository;
import com.huawei.hmf.services.ApiSet;
import com.huawei.hmf.services.ModuleProviderWrapper;
import defpackage.lkx;
import defpackage.lla;

/* JADX INFO: loaded from: classes33.dex */
public final class HwAdapterWearMgrModuleBootstrap {
    public static final void register(Repository repository) {
        ApiSet.Builder builder = ApiSet.builder();
        builder.add(lkx.class, "com.huawei.health.adapterwear.api.AdapterWearMgrApi");
        new ModuleProviderWrapper(new lla(), 1).bootstrap(repository, name(), builder.build());
    }

    public static final String name() {
        return "HwAdapterWearMgr";
    }
}
