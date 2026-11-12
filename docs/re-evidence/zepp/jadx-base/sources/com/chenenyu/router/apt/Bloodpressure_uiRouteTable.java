package com.chenenyu.router.apt;

import com.chenenyu.router.template.RouteTable;
import com.huami.bloodpressure_ui.BloodPressureActivity;
import com.huami.bloodpressure_ui.add.BloodPressureAddActivity;
import com.huami.bloodpressure_ui.history.BloodPressureHistoryActivity;
import com.huami.bloodpressure_ui.intro.BloodPressureInfoActivity;
import com.huami.bloodpressure_ui.intro.BloodPressureIntroActivity;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class Bloodpressure_uiRouteTable implements RouteTable {
    @Override // com.chenenyu.router.template.RouteTable
    public void handle(Map<String, Class<?>> map) {
        map.put(BloodPressureInfoActivity.ROUTE_BLOODPRESSURE_INFO, BloodPressureInfoActivity.class);
        map.put("bloodpressure/BloodPressureActivity", BloodPressureActivity.class);
        map.put(BloodPressureAddActivity.ROUTE_BLOODPRESSUREADD, BloodPressureAddActivity.class);
        map.put(BloodPressureHistoryActivity.ROUTE_BLOODPRESSURE_HISTORY, BloodPressureHistoryActivity.class);
        map.put(BloodPressureIntroActivity.ROUTE_BLOODPRESSURE_INTRO, BloodPressureIntroActivity.class);
    }
}
