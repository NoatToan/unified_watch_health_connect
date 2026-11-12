package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.xiaomi.fitness.login.export.PrivacyExtKt;
import com.xiaomi.fitness.login.privacy.PrivacyActivity;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Group$$login implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(PrivacyExtKt.PRIVACY_PATH, RouteMeta.build(RouteType.ACTIVITY, PrivacyActivity.class, PrivacyExtKt.PRIVACY_PATH, "login", null, -1, Integer.MIN_VALUE));
    }
}
