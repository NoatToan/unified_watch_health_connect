package com.huawei.hmf.md.bootstrap;

import com.huawei.hmf.repository.Repository;
import com.huawei.hmf.services.ApiSet;
import com.huawei.hmf.services.ModuleProviderWrapper;
import defpackage.pfg;
import defpackage.pfm;

/* JADX INFO: loaded from: classes33.dex */
public final class PluginHealthZoneModuleBootstrap {
    public static final void register(Repository repository) {
        ApiSet.Builder builder = ApiSet.builder();
        builder.add(pfg.class, "com.huawei.health.pluginhealthzone.FamilyHealthZoneApi");
        new ModuleProviderWrapper(new pfm(), 1).bootstrap(repository, name(), builder.build());
    }

    public static final String name() {
        return "PluginHealthZone";
    }
}
