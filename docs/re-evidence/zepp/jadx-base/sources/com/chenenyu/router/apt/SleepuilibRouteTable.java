package com.chenenyu.router.apt;

import com.chenenyu.router.template.RouteTable;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.huami.sleepassistant.lib.ui.SleepAssistantActivity;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class SleepuilibRouteTable implements RouteTable {
    @Override // com.chenenyu.router.template.RouteTable
    public void handle(Map<String, Class<?>> map) {
        map.put(RouterHelper.SLEEP_ASSISTANT_PATH, SleepAssistantActivity.class);
    }
}
