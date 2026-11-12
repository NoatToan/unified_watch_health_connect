package com.chenenyu.router.apt;

import com.chenenyu.router.template.RouteTable;
import com.huami.moving.ui.sport.in.GPSMainActivity;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class MovingRouteTable implements RouteTable {
    @Override // com.chenenyu.router.template.RouteTable
    public void handle(Map<String, Class<?>> map) {
        map.put("moving/GPSMainActivity", GPSMainActivity.class);
    }
}
