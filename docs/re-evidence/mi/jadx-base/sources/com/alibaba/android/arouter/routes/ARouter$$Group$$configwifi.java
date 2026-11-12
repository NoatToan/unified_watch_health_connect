package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.xiaomi.fitness.configwifi.ConfigWifiActivity;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManagerExtKt;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Group$$configwifi implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(ElectronicScaleManagerExtKt.ELECTRONIC_SCALE_PATH_CONFIG_WIFI_ACTIVITY, RouteMeta.build(RouteType.ACTIVITY, ConfigWifiActivity.class, "/configwifi/configwifiactivity", "configwifi", null, -1, Integer.MIN_VALUE));
    }
}
