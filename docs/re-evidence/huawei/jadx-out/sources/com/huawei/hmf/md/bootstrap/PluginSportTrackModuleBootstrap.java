package com.huawei.hmf.md.bootstrap;

import com.huawei.hmf.repository.Repository;
import com.huawei.hmf.services.ApiSet;
import com.huawei.hmf.services.ModuleProviderWrapper;
import defpackage.ivl;

/* JADX INFO: loaded from: classes33.dex */
public final class PluginSportTrackModuleBootstrap {
    public static final void register(Repository repository) {
        new ModuleProviderWrapper(new ivl(), 1).bootstrap(repository, name(), ApiSet.builder().build());
    }

    public static final String name() {
        return "PluginSportTrack";
    }
}
