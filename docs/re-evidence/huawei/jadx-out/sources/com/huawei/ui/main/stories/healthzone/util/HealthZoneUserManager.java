package com.huawei.ui.main.stories.healthzone.util;

import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.pluginhealthzone.FamilyHealthZoneApi;
import com.huawei.health.pluginhealthzone.UserInfoCallback;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hwcloudmodel.contentcenter.UploadProgressListener;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.gqd;
import defpackage.lok;
import defpackage.lpf;
import health.compact.a.Services;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class HealthZoneUserManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f28228a = new Object();
    private static volatile HealthZoneUserManager d;

    public interface UploadDataFilesCallback {
        void errorCallback(int i);

        void infoCallback(List<lpf> list);
    }

    private HealthZoneUserManager() {
    }

    public static HealthZoneUserManager e() {
        HealthZoneUserManager healthZoneUserManager;
        synchronized (HealthZoneUserManager.class) {
            if (d == null) {
                synchronized (f28228a) {
                    if (d == null) {
                        d = new HealthZoneUserManager();
                    }
                }
            }
            healthZoneUserManager = d;
        }
        return healthZoneUserManager;
    }

    public void c(int i, String str, UserInfoCallback<gqd.c> userInfoCallback) {
        ((FamilyHealthZoneApi) Services.d("PluginHealthZone", FamilyHealthZoneApi.class)).requestFindUserInfo(i, str, userInfoCallback);
    }

    private void e(List<lpf> list, UploadDataFilesCallback uploadDataFilesCallback) {
        if (uploadDataFilesCallback != null) {
            uploadDataFilesCallback.infoCallback(list);
        }
    }

    public void c(final int i, final List<String> list, final UploadDataFilesCallback uploadDataFilesCallback) {
        ReleaseLogUtil.c("HealthZoneUserManager", "uploadDataFiles listPath is ", list);
        ThreadPoolManager.c().execute(new Runnable() { // from class: vow
            @Override // java.lang.Runnable
            public final void run() {
                this.f51424b.a(list, i, uploadDataFilesCallback);
            }
        });
    }

    public /* synthetic */ void a(List list, int i, final UploadDataFilesCallback uploadDataFilesCallback) {
        e(new lok().e(list, 1, i, new UploadProgressListener() { // from class: com.huawei.ui.main.stories.healthzone.util.HealthZoneUserManager.4
            @Override // com.huawei.hwcloudmodel.contentcenter.UploadProgressListener
            public void onProgress(float f) {
                LogUtil.d("HealthZoneUserManager", "progress:", Float.valueOf(f));
            }

            @Override // com.huawei.hwcloudmodel.contentcenter.UploadProgressListener
            public void onError(int i2, String str) {
                uploadDataFilesCallback.errorCallback(i2);
            }
        }), uploadDataFilesCallback);
    }
}
