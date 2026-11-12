package com.huawei.hmf.md.bootstrap;

import com.huawei.hmf.repository.Repository;
import com.huawei.hmf.services.ApiSet;
import com.huawei.hmf.services.ModuleProviderWrapper;
import com.huawei.hwversionmgr.impl.VersionMgrModule;
import defpackage.nuj;

/* JADX INFO: loaded from: classes33.dex */
public final class HWVersionMgrModuleBootstrap {
    public static final void register(Repository repository) {
        ApiSet.Builder builder = ApiSet.builder();
        builder.add(nuj.class, "com.huawei.health.versionmgr.api.VersionMgrApi");
        new ModuleProviderWrapper(new VersionMgrModule(), 1).bootstrap(repository, name(), builder.build());
    }

    public static final String name() {
        return "HWVersionMgr";
    }
}
