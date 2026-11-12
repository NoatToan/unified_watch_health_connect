package com.huawei.haf.router.routes;

import com.huawei.haf.router.facade.template.RouteGroup;
import com.huawei.haf.router.facade.template.RouteRoot;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class AppRouter$$Root$$TradeService implements RouteRoot {
    @Override // com.huawei.haf.router.facade.template.RouteRoot
    public void loadInto(Map<String, Class<? extends RouteGroup>> map) {
        map.put("TradeService", AppRouter$$Group$$TradeService.class);
    }
}
