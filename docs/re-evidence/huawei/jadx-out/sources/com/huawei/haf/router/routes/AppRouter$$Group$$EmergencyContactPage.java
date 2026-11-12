package com.huawei.haf.router.routes;

import com.huawei.featureuserprofile.sos.EmergencyContactPretreatment;
import com.huawei.haf.router.facade.model.RouteMeta;
import com.huawei.haf.router.facade.model.RouteType;
import com.huawei.haf.router.facade.template.RouteGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class AppRouter$$Group$$EmergencyContactPage implements RouteGroup {
    @Override // com.huawei.haf.router.facade.template.RouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("/EmergencyContactPage/service/pretreatment", RouteMeta.build(RouteType.HANDLER, EmergencyContactPretreatment.class, -1, Integer.MIN_VALUE, null));
    }
}
