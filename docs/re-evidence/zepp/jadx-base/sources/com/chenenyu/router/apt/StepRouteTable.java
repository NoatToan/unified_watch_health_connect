package com.chenenyu.router.apt;

import com.chenenyu.router.template.RouteTable;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.huami.step.ui.StepInfoActivity;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class StepRouteTable implements RouteTable {
    @Override // com.chenenyu.router.template.RouteTable
    public void handle(Map<String, Class<?>> map) {
        map.put(RouterHelper.STEP_PATH, StepInfoActivity.class);
    }
}
