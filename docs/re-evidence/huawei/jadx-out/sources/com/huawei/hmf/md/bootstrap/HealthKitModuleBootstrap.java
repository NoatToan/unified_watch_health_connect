package com.huawei.hmf.md.bootstrap;

import com.huawei.hmf.repository.Repository;
import com.huawei.hmf.services.ApiSet;
import com.huawei.hmf.services.ModuleProviderWrapper;
import defpackage.kxy;
import defpackage.kyq;
import defpackage.lbd;
import defpackage.lda;

/* JADX INFO: loaded from: classes33.dex */
public final class HealthKitModuleBootstrap {
    public static final void register(Repository repository) {
        ApiSet.Builder builder = ApiSet.builder();
        builder.add(kxy.class, "com.huawei.hihealthservice.healthtrend.HealthTrendApi");
        builder.add(lbd.class, "com.huawei.hihealthservice.HiHealthKitApi");
        builder.add(lda.class, "com.huawei.hihealthservice.hmsauth.HmsAuthApi");
        new ModuleProviderWrapper(new kyq(), 1).bootstrap(repository, name(), builder.build());
    }

    public static final String name() {
        return "HealthKit";
    }
}
