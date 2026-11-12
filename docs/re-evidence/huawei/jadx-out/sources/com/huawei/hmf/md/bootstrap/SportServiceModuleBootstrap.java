package com.huawei.hmf.md.bootstrap;

import com.huawei.health.sportservice.impl.AppLinkageApiImpl;
import com.huawei.health.sportservice.impl.SportDataOutputImpl;
import com.huawei.health.sportservice.impl.SportLifeCircleImpl;
import com.huawei.health.sportservice.impl.SportServiceModule;
import com.huawei.hmf.repository.Repository;
import com.huawei.hmf.services.ApiSet;
import com.huawei.hmf.services.ModuleProviderWrapper;

/* JADX INFO: loaded from: classes33.dex */
public final class SportServiceModuleBootstrap {
    public static final void register(Repository repository) {
        ApiSet.Builder builder = ApiSet.builder();
        builder.add(AppLinkageApiImpl.class, "com.huawei.linkage.sportlinkage.AppLinkageApi");
        builder.add(SportDataOutputImpl.class, "com.huawei.health.sportservice.SportDataOutputApi");
        builder.add(SportLifeCircleImpl.class, "com.huawei.health.sportservice.SportLifecycle");
        new ModuleProviderWrapper(new SportServiceModule(), 1).bootstrap(repository, name(), builder.build());
    }

    public static final String name() {
        return "SportService";
    }
}
