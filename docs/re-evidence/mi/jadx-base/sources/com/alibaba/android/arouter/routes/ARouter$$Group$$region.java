package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.region.RegionSelectListActivity;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Group$$region implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(RegionExtKt.REGION_SELECT_ACTIVITY_PATH, RouteMeta.build(RouteType.ACTIVITY, RegionSelectListActivity.class, RegionExtKt.REGION_SELECT_ACTIVITY_PATH, "region", null, -1, Integer.MIN_VALUE));
    }
}
