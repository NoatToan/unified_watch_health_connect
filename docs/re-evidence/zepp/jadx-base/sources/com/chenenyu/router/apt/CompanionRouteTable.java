package com.chenenyu.router.apt;

import com.chenenyu.router.template.RouteTable;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.huami.watch.companion.firstbeat.SportLoadActivity;
import com.huami.watch.companion.firstbeat.VO2maxActivity;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class CompanionRouteTable implements RouteTable {
    @Override // com.chenenyu.router.template.RouteTable
    public void handle(Map<String, Class<?>> map) {
        map.put(RouterHelper.SPORT_STATE_VO2_MAX_PATH, VO2maxActivity.class);
        map.put(RouterHelper.SPORT_STATE_EPOC_PATH, SportLoadActivity.class);
    }
}
