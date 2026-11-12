package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.ui.bind.BindBleDeviceDeviceActivity;
import com.xiaomi.fitness.eco.device.manager.ui.bind.BindEcoDeviceDeviceActivity;
import com.xiaomi.fitness.eco.device.manager.ui.bind.BindLocalDeviceActivity;
import com.xiaomi.fitness.eco.device.manager.ui.bind.BindRopeSkippingListActivity;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Group$$ecoDevice implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        RouteType routeType = RouteType.ACTIVITY;
        map.put(EcoDeviceManagerExtKt.ECO_BIND_BT_DEVICE_PATH, RouteMeta.build(routeType, BindBleDeviceDeviceActivity.class, "/ecodevice/activity/bind_bt", "ecodevice", null, -1, Integer.MIN_VALUE));
        map.put(EcoDeviceManagerExtKt.BIND_ECO_DEVICE_PATH, RouteMeta.build(routeType, BindEcoDeviceDeviceActivity.class, "/ecodevice/activity/bind_eco", "ecodevice", null, -1, Integer.MIN_VALUE));
        map.put(EcoDeviceManagerExtKt.BIND_ROPE_SKIPPING_LIST_PATH, RouteMeta.build(routeType, BindRopeSkippingListActivity.class, "/ecodevice/activity/bind_rope_skipping_list", "ecodevice", null, -1, Integer.MIN_VALUE));
        map.put(EcoDeviceManagerExtKt.ECO_BIND_LOCAL_DEVICE_PATH, RouteMeta.build(routeType, BindLocalDeviceActivity.class, "/ecodevice/activity/local_bind_eco", "ecodevice", null, -1, Integer.MIN_VALUE));
    }
}
