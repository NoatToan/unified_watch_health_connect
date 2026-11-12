package com.huawei.hmf.md.bootstrap;

import com.huawei.health.awarenessdonate.AwarenessDonateImpl;
import com.huawei.hmf.repository.Repository;
import com.huawei.hmf.services.ApiSet;
import com.huawei.hmf.services.ModuleProviderWrapper;
import com.huawei.hwsmartinteractmgr.SmartModule;
import defpackage.crj;
import defpackage.ntg;

/* JADX INFO: loaded from: classes33.dex */
public final class HWSmartInteractMgrModuleBootstrap {
    public static final void register(Repository repository) {
        ApiSet.Builder builder = ApiSet.builder();
        builder.add(ntg.class, "com.huawei.hwsmartinteractmgr.util.SmartRulesApi");
        builder.add(AwarenessDonateImpl.class, "com.huawei.health.awarenessdonate.AwarenessDonateApi");
        builder.add(crj.class, "com.huawei.health.facardagds.FaCardAgdsApi");
        new ModuleProviderWrapper(new SmartModule(), 1).bootstrap(repository, name(), builder.build());
    }

    public static final String name() {
        return "HWSmartInteractMgr";
    }
}
