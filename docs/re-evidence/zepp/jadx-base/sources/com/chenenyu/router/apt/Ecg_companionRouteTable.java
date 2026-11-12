package com.chenenyu.router.apt;

import com.chenenyu.router.template.RouteTable;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.huami.watch.companion.ecg.ui.activity.EcgActivity;
import com.huami.watch.companion.ecg.ui.activity.EcgDetailActivity;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class Ecg_companionRouteTable implements RouteTable {
    @Override // com.chenenyu.router.template.RouteTable
    public void handle(Map<String, Class<?>> map) {
        map.put("ecg/EcgDetailActivity", EcgDetailActivity.class);
        map.put(RouterHelper.ECG_PATH, EcgActivity.class);
    }
}
