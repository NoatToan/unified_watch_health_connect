package com.chenenyu.router.apt;

import com.chenenyu.router.template.RouteTable;
import com.huami.bloodoxygen.ui.base.BloodOxygenDetailActivity;
import com.huami.module.homepage.cards.helper.RouterHelper;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class BloodOxygenUiRouteTable implements RouteTable {
    @Override // com.chenenyu.router.template.RouteTable
    public void handle(Map<String, Class<?>> map) {
        map.put(RouterHelper.SPO2_PATH, BloodOxygenDetailActivity.class);
    }
}
