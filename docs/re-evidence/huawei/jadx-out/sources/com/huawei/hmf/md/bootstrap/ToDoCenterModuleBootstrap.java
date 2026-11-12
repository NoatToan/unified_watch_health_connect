package com.huawei.hmf.md.bootstrap;

import com.huawei.hmf.repository.Repository;
import com.huawei.hmf.services.ApiSet;
import com.huawei.hmf.services.ModuleProviderWrapper;
import defpackage.rhk;
import defpackage.rit;
import defpackage.rjx;

/* JADX INFO: loaded from: classes33.dex */
public final class ToDoCenterModuleBootstrap {
    public static final void register(Repository repository) {
        ApiSet.Builder builder = ApiSet.builder();
        builder.add(rhk.class, "com.huawei.health.device.api.BacklogManagerApi");
        builder.add(rit.class, "com.huawei.health.device.api.DeviceLegalInfoApi");
        new ModuleProviderWrapper(new rjx(), 1).bootstrap(repository, name(), builder.build());
    }

    public static final String name() {
        return "ToDoCenter";
    }
}
