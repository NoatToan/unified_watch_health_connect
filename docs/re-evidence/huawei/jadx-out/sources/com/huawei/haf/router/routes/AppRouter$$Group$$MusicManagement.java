package com.huawei.haf.router.routes;

import com.huawei.haf.router.facade.model.RouteMeta;
import com.huawei.haf.router.facade.model.RouteType;
import com.huawei.haf.router.facade.template.RouteGroup;
import com.huawei.ui.device.activity.music.MusicPretreatment;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class AppRouter$$Group$$MusicManagement implements RouteGroup {
    @Override // com.huawei.haf.router.facade.template.RouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("/MusicManagement/service/pretreatment", RouteMeta.build(RouteType.HANDLER, MusicPretreatment.class, -1, Integer.MIN_VALUE, null));
    }
}
