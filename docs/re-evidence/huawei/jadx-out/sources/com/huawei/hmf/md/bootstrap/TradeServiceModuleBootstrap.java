package com.huawei.hmf.md.bootstrap;

import com.huawei.health.tradeservice.TradeServiceModule;
import com.huawei.hmf.repository.Repository;
import com.huawei.hmf.services.ApiSet;
import com.huawei.hmf.services.ModuleProviderWrapper;
import defpackage.ilr;
import defpackage.ilt;
import defpackage.irn;

/* JADX INFO: loaded from: classes33.dex */
public final class TradeServiceModuleBootstrap {
    public static final void register(Repository repository) {
        ApiSet.Builder builder = ApiSet.builder();
        builder.add(ilr.class, "com.huawei.trade.TradeViewApi");
        builder.add(ilt.class, "com.huawei.trade.PayApi");
        builder.add(irn.class, "com.huawei.health.vip.api.VipApi");
        new ModuleProviderWrapper(new TradeServiceModule(), 1).bootstrap(repository, name(), builder.build());
    }

    public static final String name() {
        return "TradeService";
    }
}
