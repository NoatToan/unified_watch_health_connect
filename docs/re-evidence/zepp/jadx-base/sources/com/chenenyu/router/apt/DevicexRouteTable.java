package com.chenenyu.router.apt;

import com.chenenyu.router.template.RouteTable;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.xiaomi.hm.health.device.HMUnifySelectDeviceActivity;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class DevicexRouteTable implements RouteTable {
    @Override // com.chenenyu.router.template.RouteTable
    public void handle(Map<String, Class<?>> map) {
        map.put(RouterHelper.DEVICE_SELECT_PATH, HMUnifySelectDeviceActivity.class);
    }
}
