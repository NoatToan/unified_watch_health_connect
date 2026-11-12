package com.huawei.hmf.md.bootstrap;

import com.huawei.hmf.repository.Repository;
import com.huawei.hmf.services.ApiSet;
import com.huawei.hmf.services.ModuleProviderWrapper;
import defpackage.mhb;
import defpackage.mhc;
import defpackage.mhj;

/* JADX INFO: loaded from: classes33.dex */
public final class Module_Device_FeatureModuleBootstrap {
    public static final void register(Repository repository) {
        ApiSet.Builder builder = ApiSet.builder();
        builder.add(mhc.class, "com.huawei.devicefeature.DeviceFeatureSupportApi");
        builder.add(mhj.class, "com.huawei.health.device.api.DeviceManagerCommonConfigApi");
        new ModuleProviderWrapper(new mhb(), 1).bootstrap(repository, name(), builder.build());
    }

    public static final String name() {
        return "Module_Device_Feature";
    }
}
