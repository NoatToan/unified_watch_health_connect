package com.huawei.hmf.md.bootstrap;

import com.huawei.hmf.repository.Repository;
import com.huawei.hmf.services.ApiSet;
import com.huawei.hmf.services.ModuleProviderWrapper;
import defpackage.sgn;
import defpackage.shj;

/* JADX INFO: loaded from: classes33.dex */
public final class DeviceSettingModuleBootstrap {
    public static final void register(Repository repository) {
        ApiSet.Builder builder = ApiSet.builder();
        builder.add(sgn.class, "com.huawei.health.device.api.DeviceGeneralSettingApi");
        new ModuleProviderWrapper(new shj(), 1).bootstrap(repository, name(), builder.build());
    }

    public static final String name() {
        return "DeviceSetting";
    }
}
