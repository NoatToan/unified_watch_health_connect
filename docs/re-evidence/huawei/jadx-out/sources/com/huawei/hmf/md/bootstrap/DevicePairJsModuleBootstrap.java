package com.huawei.hmf.md.bootstrap;

import com.huawei.hmf.repository.Repository;
import com.huawei.hmf.services.ApiSet;
import com.huawei.hmf.services.ModuleProviderWrapper;
import defpackage.rch;
import defpackage.rcq;
import defpackage.rcs;
import defpackage.rcu;

/* JADX INFO: loaded from: classes33.dex */
public final class DevicePairJsModuleBootstrap {
    public static final void register(Repository repository) {
        ApiSet.Builder builder = ApiSet.builder();
        builder.add(rcu.class, "com.huawei.devicepair.api.UpdateDeviceApi");
        builder.add(rcs.class, "com.huawei.devicepair.api.MessageNotificationApi");
        builder.add(rch.class, "com.huawei.devicepair.api.BasePairManagerApi");
        new ModuleProviderWrapper(new rcq(), 1).bootstrap(repository, name(), builder.build());
    }

    public static final String name() {
        return "DevicePairJs";
    }
}
