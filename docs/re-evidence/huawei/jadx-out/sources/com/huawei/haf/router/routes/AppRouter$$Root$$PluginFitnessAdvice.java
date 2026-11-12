package com.huawei.haf.router.routes;

import com.huawei.haf.router.facade.template.RouteGroup;
import com.huawei.haf.router.facade.template.RouteRoot;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class AppRouter$$Root$$PluginFitnessAdvice implements RouteRoot {
    @Override // com.huawei.haf.router.facade.template.RouteRoot
    public void loadInto(Map<String, Class<? extends RouteGroup>> map) {
        map.put("PluginExercisePlanAdvice", AppRouter$$Group$$PluginExercisePlanAdvice.class);
        map.put("PluginFitnessAdvice", AppRouter$$Group$$PluginFitnessAdvice.class);
        map.put("PluginTrainingPlanAdvice", AppRouter$$Group$$PluginTrainingPlanAdvice.class);
    }
}
