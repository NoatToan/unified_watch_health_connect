package com.huawei.haf.router.routes;

import com.huawei.haf.router.facade.template.RouteGroup;
import com.huawei.haf.router.facade.template.RouteRoot;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class AppRouter$$Root$$FeatureUserProfile implements RouteRoot {
    @Override // com.huawei.haf.router.facade.template.RouteRoot
    public void loadInto(Map<String, Class<? extends RouteGroup>> map) {
        map.put("EmergencyContactPage", AppRouter$$Group$$EmergencyContactPage.class);
        map.put(AppRoute$$Info$$HuaweiHealth.M_61, AppRouter$$Group$$FeatureUserProfile.class);
        map.put("HWUserProfileMgr", AppRouter$$Group$$HWUserProfileMgr.class);
        map.put("todoTask", AppRouter$$Group$$todoTask.class);
    }
}
