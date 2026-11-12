package com.chenenyu.router.apt;

import com.chenenyu.router.template.RouteTable;
import com.huami.femalehealth.uilib.ui.activity.FemaleHealthActivity;
import com.huami.femalehealth.uilib.ui.activity.FemaleStartActivity;
import com.huami.module.homepage.cards.helper.RouterHelper;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class UilibRouteTable implements RouteTable {
    @Override // com.chenenyu.router.template.RouteTable
    public void handle(Map<String, Class<?>> map) {
        map.put(RouterHelper.FEMALE_HEALTH_PATH_MIFIT, FemaleStartActivity.class);
        map.put("fh/FemaleHealthActivity", FemaleHealthActivity.class);
    }
}
