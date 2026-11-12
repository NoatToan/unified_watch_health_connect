package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.xiaomi.fitness.sport_eco.view.launch.gym.GymLaunchEcoSportActivity;
import com.xiaomi.fitness.sport_eco.view.sporting.IndoorRidingActivity;
import com.xiaomi.fitness.sport_eco.view.sporting.IndoorRunningActivity;
import com.xiaomi.fitness.sport_eco.view.sporting.JumpingActivity;
import com.xiaomi.fitness.sport_eco_manager_export.SportRouterKt;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Group$$sport_eco implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        RouteType routeType = RouteType.ACTIVITY;
        map.put(SportRouterKt.INDOOR_RIDING_SPORTING, RouteMeta.build(routeType, IndoorRidingActivity.class, SportRouterKt.INDOOR_RIDING_SPORTING, "sport_eco", null, -1, Integer.MIN_VALUE));
        map.put(SportRouterKt.INDOOR_SPORTING, RouteMeta.build(routeType, IndoorRunningActivity.class, SportRouterKt.INDOOR_SPORTING, "sport_eco", null, -1, Integer.MIN_VALUE));
        map.put(SportRouterKt.JUMP_SPORTING, RouteMeta.build(routeType, JumpingActivity.class, SportRouterKt.JUMP_SPORTING, "sport_eco", null, -1, Integer.MIN_VALUE));
        map.put(SportRouterKt.GYM_LAUNCH, RouteMeta.build(routeType, GymLaunchEcoSportActivity.class, SportRouterKt.GYM_LAUNCH, "sport_eco", null, -1, Integer.MIN_VALUE));
    }
}
