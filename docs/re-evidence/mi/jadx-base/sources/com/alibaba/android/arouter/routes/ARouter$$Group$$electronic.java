package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.xiaomi.fitness.electronic.scale.BabyWeightActivity;
import com.xiaomi.fitness.electronic.scale.DataReportActivity;
import com.xiaomi.fitness.electronic.scale.MainActivity;
import com.xiaomi.fitness.electronic.scale.OTAActivity;
import com.xiaomi.fitness.electronic.scale.PairGuideActivity;
import com.xiaomi.fitness.electronic.scale.UserAddActivity;
import com.xiaomi.fitness.electronic.scale.UserIndicatorsActivity;
import com.xiaomi.fitness.electronic.scale.UserManageActivity;
import com.xiaomi.fitness.electronic.scale.VirtualMemberDataActivity;
import com.xiaomi.fitness.electronic.scale.WeightActivity;
import com.xiaomi.fitness.electronic.scale.WeightGuideActivity;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManagerExtKt;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Group$$electronic implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        RouteType routeType = RouteType.ACTIVITY;
        map.put(ElectronicScaleManagerExtKt.ELECTRONIC_SCALE_DATA_REPORT_ACTIVITY, RouteMeta.build(routeType, DataReportActivity.class, "/electronic/activity/datareport", "electronic", null, -1, Integer.MIN_VALUE));
        map.put("/electronic/activity/VirtualMemberData", RouteMeta.build(routeType, VirtualMemberDataActivity.class, "/electronic/activity/virtualmemberdata", "electronic", null, -1, Integer.MIN_VALUE));
        map.put(ElectronicScaleManagerExtKt.ELECTRONIC_SCALE_BABY_WEIGHT_EIGHT, RouteMeta.build(routeType, BabyWeightActivity.class, ElectronicScaleManagerExtKt.ELECTRONIC_SCALE_BABY_WEIGHT_EIGHT, "electronic", null, -1, Integer.MIN_VALUE));
        map.put(ElectronicScaleManagerExtKt.ELECTRONIC_EIGHT_SCALE_WEIGHT_GUIDE, RouteMeta.build(routeType, WeightGuideActivity.class, ElectronicScaleManagerExtKt.ELECTRONIC_EIGHT_SCALE_WEIGHT_GUIDE, "electronic", null, -1, Integer.MIN_VALUE));
        map.put(ElectronicScaleManagerExtKt.ELECTRONIC_EIGHT_SCALE_WEIGHT, RouteMeta.build(routeType, WeightActivity.class, ElectronicScaleManagerExtKt.ELECTRONIC_EIGHT_SCALE_WEIGHT, "electronic", null, -1, Integer.MIN_VALUE));
        map.put(ElectronicScaleManagerExtKt.ELECTRONIC_SCALE_MAIN, RouteMeta.build(routeType, MainActivity.class, ElectronicScaleManagerExtKt.ELECTRONIC_SCALE_MAIN, "electronic", null, -1, Integer.MIN_VALUE));
        map.put(ElectronicScaleManagerExtKt.ELECTRONIC_SCALE_OTA, RouteMeta.build(routeType, OTAActivity.class, ElectronicScaleManagerExtKt.ELECTRONIC_SCALE_OTA, "electronic", null, -1, Integer.MIN_VALUE));
        map.put(ElectronicScaleManagerExtKt.ELECTRONIC_SCALE_PAIR_GUIDE, RouteMeta.build(routeType, PairGuideActivity.class, "/electronic/activity/pairguide", "electronic", null, -1, Integer.MIN_VALUE));
        map.put(ElectronicScaleManagerExtKt.ELECTRONIC_SCALE_USER, RouteMeta.build(routeType, UserManageActivity.class, ElectronicScaleManagerExtKt.ELECTRONIC_SCALE_USER, "electronic", null, -1, Integer.MIN_VALUE));
        map.put(ElectronicScaleManagerExtKt.ELECTRONIC_SCALE_USER_ADD, RouteMeta.build(routeType, UserAddActivity.class, ElectronicScaleManagerExtKt.ELECTRONIC_SCALE_USER_ADD, "electronic", null, -1, Integer.MIN_VALUE));
        map.put(ElectronicScaleManagerExtKt.ELECTRONIC_SCALE_USER_INFO, RouteMeta.build(routeType, UserIndicatorsActivity.class, ElectronicScaleManagerExtKt.ELECTRONIC_SCALE_USER_INFO, "electronic", null, -1, Integer.MIN_VALUE));
    }
}
