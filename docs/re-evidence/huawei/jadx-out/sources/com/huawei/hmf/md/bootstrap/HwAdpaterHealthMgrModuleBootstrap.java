package com.huawei.hmf.md.bootstrap;

import com.huawei.hmf.repository.Repository;
import com.huawei.hmf.services.ApiSet;
import com.huawei.hmf.services.ModuleProviderWrapper;
import com.huawei.hwadpaterhealthmgr.impl.AdapterHealthMgrModule;
import defpackage.llj;

/* JADX INFO: loaded from: classes33.dex */
public final class HwAdpaterHealthMgrModuleBootstrap {
    public static final void register(Repository repository) {
        ApiSet.Builder builder = ApiSet.builder();
        builder.add(llj.class, "com.huawei.health.adapterhealthmgr.api.AdapterHealthMgrApi");
        new ModuleProviderWrapper(new AdapterHealthMgrModule(), 1).bootstrap(repository, name(), builder.build());
    }

    public static final String name() {
        return "HwAdpaterHealthMgr";
    }
}
