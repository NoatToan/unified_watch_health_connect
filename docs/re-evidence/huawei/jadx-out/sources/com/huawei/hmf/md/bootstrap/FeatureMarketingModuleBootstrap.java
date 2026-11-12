package com.huawei.hmf.md.bootstrap;

import com.huawei.hmf.repository.Repository;
import com.huawei.hmf.services.ApiSet;
import com.huawei.hmf.services.ModuleProviderWrapper;
import defpackage.ety;
import defpackage.eua;
import defpackage.evn;

/* JADX INFO: loaded from: classes33.dex */
public final class FeatureMarketingModuleBootstrap {
    public static final void register(Repository repository) {
        ApiSet.Builder builder = ApiSet.builder();
        builder.add(ety.class, "com.huawei.health.marketing.api.MarketingApi");
        builder.add(evn.class, "com.huawei.health.marketrouter.api.MarketRouterApi");
        new ModuleProviderWrapper(new eua(), 1).bootstrap(repository, name(), builder.build());
    }

    public static final String name() {
        return "FeatureMarketing";
    }
}
