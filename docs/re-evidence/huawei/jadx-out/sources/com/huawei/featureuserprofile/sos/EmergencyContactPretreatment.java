package com.huawei.featureuserprofile.sos;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.featureuserprofile.sos.EmergencyContactPretreatment;
import com.huawei.featureuserprofile.sos.manager.EmergencyInfoManager;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.facade.service.PretreatmentService;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.jsmodules.fallDetection.FallDetectionConstant;
import defpackage.iov;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes2.dex */
public class EmergencyContactPretreatment implements PretreatmentService {
    @Override // com.huawei.haf.router.facade.template.ServiceProvider
    public void init(Context context) {
    }

    @Override // com.huawei.haf.router.facade.service.PretreatmentService
    public boolean onPretreatment(Context context, Guidepost guidepost) {
        String string = guidepost.o().toString();
        LogUtil.a("DeviceScreenshotPretreatment", "EmergencyContact uri is ", string);
        if (!TextUtils.isEmpty(string) && string.contains("emergencyContactPage")) {
            e();
        }
        return false;
    }

    private static void e() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: cxs
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                EmergencyContactPretreatment.a();
            }
        });
    }

    public static /* synthetic */ void a() throws Throwable {
        boolean zHasEmergencyInfoProvider = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).hasEmergencyInfoProvider();
        LogUtil.a("DeviceScreenshotPretreatment", "enter emergencyInfo isHasEmergencyInfo: ", Boolean.valueOf(zHasEmergencyInfoProvider));
        if (zHasEmergencyInfoProvider) {
            ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).registerContactChangeObserver();
            try {
                Intent intent = new Intent();
                intent.setClassName(FallDetectionConstant.PACKAGE_NAME, FallDetectionConstant.CLASS_NAME);
                iov.d(BaseApplication.b(), intent);
                EmergencyInfoManager.a().c(true);
                return;
            } catch (ActivityNotFoundException unused) {
                LogUtil.e("DeviceScreenshotPretreatment", "Emui110 activityNotFoundException SOS");
                return;
            }
        }
        AppRouter.c("/HWUserProfileMgr/EditInfoActivity").b(BaseApplication.b());
    }
}
