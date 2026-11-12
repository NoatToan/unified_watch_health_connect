package com.huawei.haf.router.routes;

import com.huawei.haf.router.facade.template.ServiceGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class AppRouter$$Providers$$PluginFitnessAdvice implements ServiceGroup {
    @Override // com.huawei.haf.router.facade.template.ServiceGroup
    public void loadInto(Map<String, String> map) {
        map.put("com.huawei.haf.router.facade.service.PretreatmentService", "/PluginExercisePlanAdvice/service/pretreatment");
        map.put("com.huawei.haf.router.facade.service.PretreatmentService", "/PluginFitnessAdvice/service/pretreatment");
        map.put("com.huawei.haf.router.facade.service.PretreatmentService", "/PluginTrainingPlanAdvice/service/pretreatment");
    }
}
