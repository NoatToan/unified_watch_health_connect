package com.huawei.haf.router.routes;

import com.huawei.haf.router.facade.model.RouteMeta;
import com.huawei.haf.router.facade.model.RouteType;
import com.huawei.haf.router.facade.template.RouteGroup;
import com.huawei.health.FaCardSettingActivity;
import com.huawei.health.HonorCardSettingActivity;
import com.huawei.health.browseraction.HwHealthBrowserActionActivity;
import com.huawei.health.routeradapter.AccountCenterPretreatmentService;
import com.huawei.health.routeradapter.AchievePretreatmentService;
import com.huawei.health.routeradapter.ArkUIPretreatmentService;
import com.huawei.health.routeradapter.BasicSportPretreatmentService;
import com.huawei.health.routeradapter.ColumnPretreatmentService;
import com.huawei.health.routeradapter.DevicemgrPretreatmentService;
import com.huawei.health.routeradapter.FaPretreatmentService;
import com.huawei.health.routeradapter.GroupPretreatmentService;
import com.huawei.health.routeradapter.HealthCustomRouteService;
import com.huawei.health.routeradapter.HealthRouterExtras;
import com.huawei.health.routeradapter.HighLandCarePretreatmentService;
import com.huawei.health.routeradapter.HonorCardPretreatmentService;
import com.huawei.health.routeradapter.OAuthLoginPreTreatmentService;
import com.huawei.health.routeradapter.OrderListPretreatmentService;
import com.huawei.health.routeradapter.TradePretreatmentService;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class AppRouter$$Group$$HuaweiHealth implements RouteGroup {
    @Override // com.huawei.haf.router.facade.template.RouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("/HuaweiHealth/Arkui/service/pretreatment", RouteMeta.build(RouteType.HANDLER, ArkUIPretreatmentService.class, -1, 16777216, null));
        map.put("/HuaweiHealth/FaCardSettingActivity", RouteMeta.build(RouteType.ACTIVITY, FaCardSettingActivity.class, -1, Integer.MIN_VALUE, null));
        map.put("/HuaweiHealth/HonorCardSettingActivity", RouteMeta.build(RouteType.ACTIVITY, HonorCardSettingActivity.class, -1, Integer.MIN_VALUE, null));
        map.put("/HuaweiHealth/HwHealthBrowserActionActivity", RouteMeta.build(RouteType.ACTIVITY, HwHealthBrowserActionActivity.class, -1, Integer.MIN_VALUE, null));
        map.put("/HuaweiHealth/service/HonorCard/pretreatment", RouteMeta.build(RouteType.HANDLER, HonorCardPretreatmentService.class, -1, Integer.MIN_VALUE, null));
        map.put("/HuaweiHealth/service/accountCenter/pretreatment", RouteMeta.build(RouteType.HANDLER, AccountCenterPretreatmentService.class, -1, Integer.MIN_VALUE, null));
        map.put("/HuaweiHealth/service/achievement/pretreatment", RouteMeta.build(RouteType.HANDLER, AchievePretreatmentService.class, -1, Integer.MIN_VALUE, null));
        map.put("/HuaweiHealth/service/basicSport/pretreatment", RouteMeta.build(RouteType.HANDLER, BasicSportPretreatmentService.class, -1, 16777216, null));
        map.put("/HuaweiHealth/service/column/pretreatment", RouteMeta.build(RouteType.HANDLER, ColumnPretreatmentService.class, -1, Integer.MIN_VALUE, null));
        map.put("/HuaweiHealth/service/customroute", RouteMeta.build(RouteType.HANDLER, HealthCustomRouteService.class, -1, Integer.MIN_VALUE, null));
        map.put("/HuaweiHealth/service/devicemgr/pretreatment", RouteMeta.build(RouteType.HANDLER, DevicemgrPretreatmentService.class, -1, Integer.MIN_VALUE, null));
        map.put("/HuaweiHealth/service/fa/pretreatment", RouteMeta.build(RouteType.HANDLER, FaPretreatmentService.class, -1, Integer.MIN_VALUE, null));
        map.put("/HuaweiHealth/service/groupqrcode/pretreatment", RouteMeta.build(RouteType.HANDLER, GroupPretreatmentService.class, -1, Integer.MIN_VALUE, null));
        map.put("/HuaweiHealth/service/highlandcare/pretreatment", RouteMeta.build(RouteType.HANDLER, HighLandCarePretreatmentService.class, -1, 16777216, null));
        map.put("/HuaweiHealth/service/linkagelogin/pretreatment", RouteMeta.build(RouteType.HANDLER, OAuthLoginPreTreatmentService.class, -1, Integer.MIN_VALUE, null));
        map.put("/HuaweiHealth/service/myOrder/pretreatment", RouteMeta.build(RouteType.HANDLER, OrderListPretreatmentService.class, -1, 16777216, null));
        map.put("/HuaweiHealth/service/router/extras", RouteMeta.build(RouteType.HANDLER, HealthRouterExtras.class, -1, Integer.MIN_VALUE, null));
        map.put("/HuaweiHealth/service/trade/pretreatment", RouteMeta.build(RouteType.HANDLER, TradePretreatmentService.class, -1, Integer.MIN_VALUE, null));
    }
}
