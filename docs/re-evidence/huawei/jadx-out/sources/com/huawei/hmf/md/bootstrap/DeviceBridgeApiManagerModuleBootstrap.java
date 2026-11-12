package com.huawei.hmf.md.bootstrap;

import com.huawei.hmf.repository.Repository;
import com.huawei.hmf.services.ApiSet;
import com.huawei.hmf.services.ModuleProviderWrapper;
import defpackage.qvk;
import defpackage.qwn;
import defpackage.raj;
import defpackage.rar;
import defpackage.rch;
import defpackage.rcs;
import defpackage.rcu;
import defpackage.rdl;

/* JADX INFO: loaded from: classes33.dex */
public final class DeviceBridgeApiManagerModuleBootstrap {
    public static final void register(Repository repository) {
        ApiSet.Builder builder = ApiSet.builder();
        builder.add(rdl.class, "com.huawei.health.device.api.OfflineMapApi");
        builder.add(rcu.class, "com.huawei.devicepair.api.UpdateDeviceApi");
        builder.add(rcs.class, "com.huawei.devicepair.api.MessageNotificationApi");
        builder.add(rch.class, "com.huawei.devicepair.api.BasePairManagerApi");
        builder.add(raj.class, "com.huawei.arkuidevice.DeviceBridgeApi");
        builder.add(qvk.class, "com.huawei.health.heartrate.HeartRateApi");
        builder.add(qwn.class, "com.huawei.pluginhealthalgorithm.MenstrualPredictApi");
        new ModuleProviderWrapper(new rar(), 1).bootstrap(repository, name(), builder.build());
    }

    public static final String name() {
        return "DeviceBridgeApiManager";
    }
}
