package com.huawei.ui.main.stories.fitness.util;

import android.content.Context;
import android.net.Uri;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.facade.service.PretreatmentService;
import com.huawei.health.threeCircle.remind.ThreeCircleNotificationReceiver;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes3.dex */
public class ThreeCirclePretreatment implements PretreatmentService {
    @Override // com.huawei.haf.router.facade.template.ServiceProvider
    public void init(Context context) {
    }

    @Override // com.huawei.haf.router.facade.service.PretreatmentService
    public boolean onPretreatment(Context context, Guidepost guidepost) {
        LogUtil.a("SCUI_ThreeCirclePretreatment", "onPretreatment:", guidepost.g(), " ", guidepost.l());
        Uri uriO = guidepost.o();
        if (uriO == null) {
            ReleaseLogUtil.a("SCUI_ThreeCirclePretreatment", "uri is null.");
            return false;
        }
        String queryParameter = uriO.getQueryParameter("name");
        String queryParameter2 = uriO.getQueryParameter("remindType");
        String queryParameter3 = uriO.getQueryParameter("subRemindType");
        ReleaseLogUtil.d("SCUI_ThreeCirclePretreatment", "onPretreatment, title: ", queryParameter, "remindType: ", queryParameter2, "subRemindType: ", queryParameter3);
        ThreeCircleNotificationReceiver.c(queryParameter, queryParameter2, queryParameter3);
        return false;
    }
}
