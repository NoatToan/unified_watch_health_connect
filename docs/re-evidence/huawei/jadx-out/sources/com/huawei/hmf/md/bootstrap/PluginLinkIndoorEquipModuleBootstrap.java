package com.huawei.hmf.md.bootstrap;

import com.huawei.hmf.repository.Repository;
import com.huawei.hmf.services.ApiSet;
import com.huawei.hmf.services.ModuleProviderWrapper;
import com.huawei.indoorequip.device.IndoorEquipManagerImpl;
import defpackage.nxw;
import defpackage.nyb;

/* JADX INFO: loaded from: classes33.dex */
public final class PluginLinkIndoorEquipModuleBootstrap {
    public static final void register(Repository repository) {
        ApiSet.Builder builder = ApiSet.builder();
        builder.add(nxw.class, "com.huawei.health.device.api.BackgroundSportApi");
        builder.add(IndoorEquipManagerImpl.class, "com.huawei.health.device.api.IndoorEquipManagerApi");
        new ModuleProviderWrapper(new nyb(), 1).bootstrap(repository, name(), builder.build());
    }

    public static final String name() {
        return "PluginLinkIndoorEquip";
    }
}
