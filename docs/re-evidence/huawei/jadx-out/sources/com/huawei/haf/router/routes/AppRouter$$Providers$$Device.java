package com.huawei.haf.router.routes;

import com.huawei.haf.router.facade.template.ServiceGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class AppRouter$$Providers$$Device implements ServiceGroup {
    @Override // com.huawei.haf.router.facade.template.ServiceGroup
    public void loadInto(Map<String, String> map) {
        map.put("com.huawei.haf.router.facade.service.PretreatmentService", "/HeartRate/service/pretreatment");
        map.put("com.huawei.haf.router.facade.service.PretreatmentService", "/Device/service/pretreatment");
        map.put("com.huawei.haf.router.facade.service.PretreatmentService", "/MusicManagement/service/pretreatment");
    }
}
