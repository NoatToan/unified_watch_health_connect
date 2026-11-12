package com.huawei.pluginhealthzone;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.facade.service.PretreatmentService;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.qrs;

/* JADX INFO: loaded from: classes3.dex */
public class FamilyHealthPretreatmentService implements PretreatmentService {
    @Override // com.huawei.haf.router.facade.template.ServiceProvider
    public void init(Context context) {
    }

    @Override // com.huawei.haf.router.facade.service.PretreatmentService
    public boolean onPretreatment(Context context, Guidepost guidepost) {
        Uri uriO = guidepost.o();
        if (uriO == null) {
            LogUtil.j("FamilyHealthPretreatmentService", "onPretreatment uri is null!");
            return false;
        }
        if (b(uriO) == 10) {
            String query = uriO.getQuery();
            if (TextUtils.isEmpty(query)) {
                AppRouter.c("/PluginHealthZone/FamilyHealthTempActivity").b(context);
            } else {
                AppRouter.e(Uri.parse("huaweischeme://healthapp/PluginHealthZone/FamilyHealthTempActivity?" + query)).b(context);
            }
        }
        return false;
    }

    private int b(Uri uri) {
        try {
            String queryParameter = uri.getQueryParameter(CommonUtil.PARAM_HEALTH_TYPE);
            if (qrs.d(queryParameter)) {
                try {
                    return Integer.parseInt(queryParameter);
                } catch (NumberFormatException unused) {
                }
            }
            return -1;
        } catch (IllegalArgumentException unused2) {
            LogUtil.e("FamilyHealthPretreatmentService", "getHealthType IllegalArgumentException:");
            return -1;
        }
    }
}
