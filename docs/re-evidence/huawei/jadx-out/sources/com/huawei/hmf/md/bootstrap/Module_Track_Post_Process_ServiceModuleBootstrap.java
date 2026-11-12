package com.huawei.hmf.md.bootstrap;

import com.huawei.hmf.repository.Repository;
import com.huawei.hmf.services.ApiSet;
import com.huawei.hmf.services.ModuleProviderWrapper;
import defpackage.iky;
import defpackage.ikz;

/* JADX INFO: loaded from: classes33.dex */
public final class Module_Track_Post_Process_ServiceModuleBootstrap {
    public static final void register(Repository repository) {
        ApiSet.Builder builder = ApiSet.builder();
        builder.add(iky.class, "com.huawei.health.trackprocess.api.TrackPostProcessApi");
        new ModuleProviderWrapper(new ikz(), 1).bootstrap(repository, name(), builder.build());
    }

    public static final String name() {
        return "Module_Track_Post_Process_Service";
    }
}
