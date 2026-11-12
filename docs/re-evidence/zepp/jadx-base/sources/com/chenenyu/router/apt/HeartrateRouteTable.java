package com.chenenyu.router.apt;

import com.chenenyu.router.template.RouteTable;
import com.huami.heartrate.ui.HeartRateActivity;
import com.huami.module.homepage.cards.helper.RouterHelper;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class HeartrateRouteTable implements RouteTable {
    @Override // com.chenenyu.router.template.RouteTable
    public void handle(Map<String, Class<?>> map) {
        map.put(RouterHelper.HEART_RATE_PATH, HeartRateActivity.class);
    }
}
