package com.chenenyu.router.apt;

import com.chenenyu.router.template.RouteTable;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.xiaomi.hm.health.bodyfat.activity.BodyFatDetailActivity;
import com.xiaomi.hm.health.bodyfat.activity.OneFootDetailActivity;
import com.xiaomi.hm.health.bodyfat.activity.WeightDetailActivity;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class BodyfatRouteTable implements RouteTable {
    @Override // com.chenenyu.router.template.RouteTable
    public void handle(Map<String, Class<?>> map) {
        map.put(RouterHelper.BALANCE_PATH, OneFootDetailActivity.class);
        map.put(RouterHelper.WEIGHT_PATH, WeightDetailActivity.class);
        map.put(RouterHelper.BODY_SCORE_PATH, BodyFatDetailActivity.class);
    }
}
