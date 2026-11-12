package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.ui.add.AddDeviceActivity;
import com.xiaomi.fitness.device.manager.ui.bind.BindBleDeviceDeviceActivity;
import com.xiaomi.fitness.device.manager.ui.bind.BindHeadphoneDeviceActivity;
import com.xiaomi.fitness.device.manager.ui.bind.BindHuaMiDeviceDeviceActivity;
import com.xiaomi.fitness.device.manager.ui.bind.BindLocalDeviceActivity;
import com.xiaomi.fitness.device.manager.ui.bind.BindThirdPartyDeviceActivity;
import com.xiaomi.fitness.device.manager.ui.scan.ScanDeviceActivity;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Group$$device implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        RouteType routeType = RouteType.ACTIVITY;
        map.put(DeviceManagerExtKt.ADD_DEVICE_ACTIVITY_PATH, RouteMeta.build(routeType, AddDeviceActivity.class, DeviceManagerExtKt.ADD_DEVICE_ACTIVITY_PATH, "device", null, -1, Integer.MIN_VALUE));
        map.put(DeviceManagerExtKt.BIND_BT_DEVICE_PATH, RouteMeta.build(routeType, BindBleDeviceDeviceActivity.class, DeviceManagerExtKt.BIND_BT_DEVICE_PATH, "device", null, -1, Integer.MIN_VALUE));
        map.put(DeviceManagerExtKt.BIND_HEAD_PHONE_DEVICE_PATH, RouteMeta.build(routeType, BindHeadphoneDeviceActivity.class, DeviceManagerExtKt.BIND_HEAD_PHONE_DEVICE_PATH, "device", null, -1, Integer.MIN_VALUE));
        map.put(DeviceManagerExtKt.BIND_HUAMI_DEVICE_PATH, RouteMeta.build(routeType, BindHuaMiDeviceDeviceActivity.class, DeviceManagerExtKt.BIND_HUAMI_DEVICE_PATH, "device", null, -1, Integer.MIN_VALUE));
        map.put(DeviceManagerExtKt.BIND_LOCAL_DEVICE_PATH, RouteMeta.build(routeType, BindLocalDeviceActivity.class, DeviceManagerExtKt.BIND_LOCAL_DEVICE_PATH, "device", null, -1, Integer.MIN_VALUE));
        map.put(DeviceManagerExtKt.BIND_THIRD_PARTY_PATH, RouteMeta.build(routeType, BindThirdPartyDeviceActivity.class, DeviceManagerExtKt.BIND_THIRD_PARTY_PATH, "device", null, -1, Integer.MIN_VALUE));
        map.put(DeviceManagerExtKt.SCAN_PATH, RouteMeta.build(routeType, ScanDeviceActivity.class, DeviceManagerExtKt.SCAN_PATH, "device", null, -1, Integer.MIN_VALUE));
    }
}
