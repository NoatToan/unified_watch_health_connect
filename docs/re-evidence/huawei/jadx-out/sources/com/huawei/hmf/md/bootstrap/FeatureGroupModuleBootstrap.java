package com.huawei.hmf.md.bootstrap;

import com.huawei.featuregroup.GroupImpl;
import com.huawei.featuregroup.GroupModule;
import com.huawei.hmf.repository.Repository;
import com.huawei.hmf.services.ApiSet;
import com.huawei.hmf.services.ModuleProviderWrapper;

/* JADX INFO: loaded from: classes33.dex */
public final class FeatureGroupModuleBootstrap {
    public static final void register(Repository repository) {
        ApiSet.Builder builder = ApiSet.builder();
        builder.add(GroupImpl.class, "com.huawei.health.group.api.GroupApi");
        new ModuleProviderWrapper(new GroupModule(), 1).bootstrap(repository, name(), builder.build());
    }

    public static final String name() {
        return "FeatureGroup";
    }
}
