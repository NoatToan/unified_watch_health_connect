package com.huawei.pluginhealthzone;

import android.content.Context;
import android.net.Uri;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.facade.service.PretreatmentService;
import com.huawei.health.pluginhealthzone.FamilyHealthZoneApi;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginhealthzone.FamilyHealthGlanceService;
import com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes3.dex */
public class FamilyHealthGlanceService implements PretreatmentService {
    @Override // com.huawei.haf.router.facade.template.ServiceProvider
    public void init(Context context) {
    }

    @Override // com.huawei.haf.router.facade.service.PretreatmentService
    public boolean onPretreatment(Context context, Guidepost guidepost) {
        ReleaseLogUtil.d("FamilyHealthGlanceService", "FamilyHealthGlanceService onPretreatment");
        Uri uriO = guidepost.o();
        if (uriO == null) {
            LogUtil.j("FamilyHealthGlanceService", "onPretreatment uri is null!");
            return false;
        }
        String strC = c(uriO);
        FamilyHealthZoneApi familyHealthZoneApi = (FamilyHealthZoneApi) Services.d("PluginHealthZone", FamilyHealthZoneApi.class);
        if (familyHealthZoneApi == null) {
            LogUtil.j("FamilyHealthGlanceService", "healthZoneApi is null");
            return false;
        }
        if (strC == null) {
            ReleaseLogUtil.e("FamilyHealthGlanceService", "hashHuid is null");
            return false;
        }
        familyHealthZoneApi.notifyMemberCheckHealth(strC, new IBaseResponseCallback() { // from class: pfe
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                FamilyHealthGlanceService.b(i, obj);
            }
        });
        return false;
    }

    public static /* synthetic */ void b(int i, Object obj) {
        if (i == 0) {
            ReleaseLogUtil.d("FamilyHealthGlanceService", "notifyMemberCheckHealth success");
        } else {
            ReleaseLogUtil.e("FamilyHealthGlanceService", "notifyMemberCheckHealth failed, errorCode:", Integer.valueOf(i));
        }
    }

    private String c(Uri uri) {
        try {
            return uri.getQueryParameter(HealthZonePushReceiver.MEMBER_HUID);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("FamilyHealthGlanceService", "getMemberHuidFromDeeplink IllegalArgumentException:");
            return null;
        }
    }
}
