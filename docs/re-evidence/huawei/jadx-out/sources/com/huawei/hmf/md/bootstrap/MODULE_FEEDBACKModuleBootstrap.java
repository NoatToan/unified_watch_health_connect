package com.huawei.hmf.md.bootstrap;

import com.huawei.hmf.repository.Repository;
import com.huawei.hmf.services.ApiSet;
import com.huawei.hmf.services.ModuleProviderWrapper;
import defpackage.sij;
import defpackage.sir;

/* JADX INFO: loaded from: classes33.dex */
public final class MODULE_FEEDBACKModuleBootstrap {
    public static final void register(Repository repository) {
        ApiSet.Builder builder = ApiSet.builder();
        builder.add(sij.class, "com.huawei.health.device.api.FeedbackApi");
        new ModuleProviderWrapper(new sir(), 1).bootstrap(repository, name(), builder.build());
    }

    public static final String name() {
        return "MODULE_FEEDBACK";
    }
}
