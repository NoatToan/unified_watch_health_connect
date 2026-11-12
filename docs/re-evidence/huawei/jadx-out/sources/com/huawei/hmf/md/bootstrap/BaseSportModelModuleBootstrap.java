package com.huawei.hmf.md.bootstrap;

import com.huawei.hmf.repository.Repository;
import com.huawei.hmf.services.ApiSet;
import com.huawei.hmf.services.ModuleProviderWrapper;
import defpackage.dav;
import defpackage.daw;
import defpackage.dkb;
import defpackage.fgd;
import defpackage.hci;

/* JADX INFO: loaded from: classes33.dex */
public final class BaseSportModelModuleBootstrap {
    public static final void register(Repository repository) {
        ApiSet.Builder builder = ApiSet.builder();
        builder.add(dav.class, "com.huawei.basefitnessadvice.api.BaseSportModelApi");
        builder.add(dkb.class, "com.huawei.caloriecalculate.ActivityCaloriesCalculateApi");
        builder.add(hci.class, "com.huawei.health.suggestion.FitnessNavigationApi");
        builder.add(fgd.class, "com.huawei.basefitnessadvice.api.HeartRateControlApi");
        new ModuleProviderWrapper(new daw(), 1).bootstrap(repository, name(), builder.build());
    }

    public static final String name() {
        return "BaseSportModel";
    }
}
