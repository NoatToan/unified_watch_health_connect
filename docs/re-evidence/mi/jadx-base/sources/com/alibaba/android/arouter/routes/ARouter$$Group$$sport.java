package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.xiaomi.fitness.sport.route.detail.RouteDetailActivity;
import com.xiaomi.fitness.sport.view.launch.gym.GymLaunchSportActivity;
import com.xiaomi.fitness.sport.view.route.CreateRouteDetailActivity;
import com.xiaomi.fitness.sport.view.sporting.CommonSportActivity;
import com.xiaomi.fitness.sport.view.sporting.IndoorRunningActivity;
import com.xiaomi.fitness.sport_manager_export.SportRouterKt;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Group$$sport implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        RouteType routeType = RouteType.ACTIVITY;
        map.put(SportRouterKt.COMMON_SPORTING, RouteMeta.build(routeType, CommonSportActivity.class, SportRouterKt.COMMON_SPORTING, "sport", null, -1, Integer.MIN_VALUE));
        map.put(SportRouterKt.CREATED_ROUTE_DETAIL, RouteMeta.build(routeType, CreateRouteDetailActivity.class, SportRouterKt.CREATED_ROUTE_DETAIL, "sport", null, -1, Integer.MIN_VALUE));
        map.put(SportRouterKt.INDOOR_SPORTING, RouteMeta.build(routeType, IndoorRunningActivity.class, SportRouterKt.INDOOR_SPORTING, "sport", null, -1, Integer.MIN_VALUE));
        map.put(SportRouterKt.GYM_LAUNCH, RouteMeta.build(routeType, GymLaunchSportActivity.class, SportRouterKt.GYM_LAUNCH, "sport", null, -1, Integer.MIN_VALUE));
        map.put(SportRouterKt.ROUTE_DETAIL, RouteMeta.build(routeType, RouteDetailActivity.class, SportRouterKt.ROUTE_DETAIL, "sport", null, -1, Integer.MIN_VALUE));
    }
}
