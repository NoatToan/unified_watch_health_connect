package com.chenenyu.router.apt;

import com.chenenyu.router.template.RouteTable;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;
import com.huami.sleep.ui.breathquality.BreathQualityActivity;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class SleepRouteTable implements RouteTable {
    @Override // com.chenenyu.router.template.RouteTable
    public void handle(Map<String, Class<?>> map) {
        map.put(RouterHelper.SLEEP_BREATH_PATH, BreathQualityActivity.class);
        map.put(RouterHelper.SLEEP_PATH, SleepHomeActivity.class);
    }
}
