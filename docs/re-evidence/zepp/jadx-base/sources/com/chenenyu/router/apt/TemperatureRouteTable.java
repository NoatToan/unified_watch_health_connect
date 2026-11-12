package com.chenenyu.router.apt;

import com.chenenyu.router.template.RouteTable;
import com.huami.bodymeasurements.temperature.view.TemperatureAddDataActivity;
import com.huami.bodymeasurements.temperature.view.TemperatureDetailActivity;
import com.huami.bodymeasurements.temperature.view.TemperatureHistoryActivity;
import com.huami.module.homepage.cards.helper.RouterHelper;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class TemperatureRouteTable implements RouteTable {
    @Override // com.chenenyu.router.template.RouteTable
    public void handle(Map<String, Class<?>> map) {
        map.put("temperature/TemperatureAddDataActivity", TemperatureAddDataActivity.class);
        map.put("temperature/TemperatureHistoryActivity", TemperatureHistoryActivity.class);
        map.put(RouterHelper.BODY_TEMPERATURE_PATH, TemperatureDetailActivity.class);
    }
}
