package com.huawei.hmf.md.bootstrap;

import com.huawei.hmf.repository.Repository;
import com.huawei.hmf.services.ApiSet;
import com.huawei.hmf.services.ModuleProviderWrapper;
import com.huawei.ui.homehealth.h5pro.SummaryApiImpl;
import defpackage.rhk;
import defpackage.rit;
import defpackage.sgn;
import defpackage.sij;
import defpackage.sla;
import defpackage.slr;
import defpackage.smf;

/* JADX INFO: loaded from: classes33.dex */
public final class HealthHeadLinesModuleBootstrap {
    public static final void register(Repository repository) {
        ApiSet.Builder builder = ApiSet.builder();
        builder.add(sgn.class, "com.huawei.health.device.api.DeviceGeneralSettingApi");
        builder.add(sla.class, "com.huawei.health.main.api.UtilApi");
        builder.add(SummaryApiImpl.class, "com.huawei.health.summary.SummaryApi");
        builder.add(slr.class, "com.huawei.health.healthheadlines.HealthHeadLinesJsApi");
        builder.add(sij.class, "com.huawei.health.device.api.FeedbackApi");
        builder.add(rhk.class, "com.huawei.health.device.api.BacklogManagerApi");
        builder.add(rit.class, "com.huawei.health.device.api.DeviceLegalInfoApi");
        new ModuleProviderWrapper(new smf(), 1).bootstrap(repository, name(), builder.build());
    }

    public static final String name() {
        return "HealthHeadLines";
    }
}
