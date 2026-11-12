package com.huawei.haf.router.routes;

import com.huawei.haf.router.facade.model.RouteMeta;
import com.huawei.haf.router.facade.model.RouteType;
import com.huawei.haf.router.facade.template.RouteGroup;
import com.huawei.health.routeradapter.TradeOrderDetailPretreatmentService;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class AppRouter$$Group$$OrderTradeService implements RouteGroup {
    @Override // com.huawei.haf.router.facade.template.RouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("/OrderTradeService/service/TradePretreatmentService", RouteMeta.build(RouteType.HANDLER, TradeOrderDetailPretreatmentService.class, -1, Integer.MIN_VALUE, null));
    }
}
