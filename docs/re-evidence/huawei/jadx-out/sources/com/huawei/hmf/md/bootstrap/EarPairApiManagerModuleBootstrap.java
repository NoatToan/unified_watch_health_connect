package com.huawei.hmf.md.bootstrap;

import com.huawei.hmf.repository.Repository;
import com.huawei.hmf.services.ApiSet;
import com.huawei.hmf.services.ModuleProviderWrapper;
import defpackage.lwy;
import defpackage.lxa;

/* JADX INFO: loaded from: classes33.dex */
public final class EarPairApiManagerModuleBootstrap {
    public static final void register(Repository repository) {
        ApiSet.Builder builder = ApiSet.builder();
        builder.add(lwy.class, "com.huawei.syncmgr.periodrri.PeriodRriSyncApi");
        new ModuleProviderWrapper(new lxa(), 1).bootstrap(repository, name(), builder.build());
    }

    public static final String name() {
        return "EarPairApiManager";
    }
}
