package com.huawei.hmf.md.bootstrap;

import com.huawei.health.plan.impl.CoursePlanServiceModule;
import com.huawei.health.plan.impl.PlanImpl;
import com.huawei.hmf.repository.Repository;
import com.huawei.hmf.services.ApiSet;
import com.huawei.hmf.services.ModuleProviderWrapper;
import defpackage.ggn;
import defpackage.ggt;
import defpackage.ggz;
import defpackage.ghb;

/* JADX INFO: loaded from: classes33.dex */
public final class CoursePlanServiceModuleBootstrap {
    public static final void register(Repository repository) {
        ApiSet.Builder builder = ApiSet.builder();
        builder.add(ghb.class, "com.huawei.health.courseplanservice.api.SportServiceApi");
        builder.add(ggt.class, "com.huawei.health.courseplanservice.api.DataPlatformApi");
        builder.add(PlanImpl.class, "com.huawei.health.plan.api.PlanApi");
        builder.add(ggn.class, "com.huawei.health.course.api.CourseApi");
        builder.add(ggz.class, "com.huawei.health.courseplanservice.api.RecordApi");
        new ModuleProviderWrapper(new CoursePlanServiceModule(), 1).bootstrap(repository, name(), builder.build());
    }

    public static final String name() {
        return "CoursePlanService";
    }
}
