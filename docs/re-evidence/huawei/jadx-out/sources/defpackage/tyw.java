package defpackage;

import android.webkit.JavascriptInterface;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.main.stories.fitness.activity.coresleep.SleepManagementCallback;
import health.compact.a.ReleaseLogUtil;

/* JADX INFO: loaded from: classes43.dex */
public class tyw extends JsBaseModule {
    @JavascriptInterface
    public void registerSleepSyncStatus(final long j) {
        ReleaseLogUtil.c("SleepManageH5Bridge", "registerSyncStatus callbackId:", Long.valueOf(j));
        if (VersionControlUtil.isSupportSleepManagement()) {
            ObserverManagerUtil.e("registerSyncStatus", new SleepManagementCallback<Integer>() { // from class: tyw.4
                @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepManagementCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(Integer num) {
                    ReleaseLogUtil.c("SleepManageH5Bridge", "SyncStatus success, result: ", num, " callbackId: ", Long.valueOf(j));
                    tyw.this.onSuccessCallback(j, num);
                }

                @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepManagementCallback
                public void onFailure(int i, String str) {
                    ReleaseLogUtil.d("SleepManageH5Bridge", "SyncStatus failed errCode: ", Integer.valueOf(i), " errMsg: ", str, " callbackId: ", Long.valueOf(j));
                    tyw.this.onFailureCallback(j, str, i);
                }
            });
        } else {
            ReleaseLogUtil.c("SleepManageH5Bridge", "SyncStatus failed with not supportSleepManagement, result: ", -1, " callbackId: ", Long.valueOf(j));
            onFailureCallback(j, "not SupportSleepManagement", -1);
        }
    }

    @JavascriptInterface
    public void registerWebViewDataListener(final long j) {
        ReleaseLogUtil.c("SleepManageH5Bridge", "registerSyncStatus callbackId:", Long.valueOf(j));
        if (VersionControlUtil.isSupportSleepManagement()) {
            ObserverManagerUtil.e("SLEEP_MANAGEMENT_TIME_TAG", new SleepManagementCallback<Long>() { // from class: tyw.1
                @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepManagementCallback
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public void onSuccess(Long l) {
                    ReleaseLogUtil.c("SleepManageH5Bridge", "notify time changed success, result: ", l, " callbackId: ", Long.valueOf(j));
                    tyw.this.onSuccessCallback(j, l);
                }

                @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepManagementCallback
                public void onFailure(int i, String str) {
                    ReleaseLogUtil.d("SleepManageH5Bridge", "notify time changed errCode: ", Integer.valueOf(i), " errMsg: ", str, " callbackId: ", Long.valueOf(j));
                    tyw.this.onFailureCallback(j, str, i);
                }
            });
        } else {
            ReleaseLogUtil.c("SleepManageH5Bridge", "registerWebViewDataListener failed, callbackId: ", Long.valueOf(j));
            onFailureCallback(j, "not SupportSleepManagement", -1);
        }
    }

    @JavascriptInterface
    public void registerDailyResultChanged(final long j) {
        ReleaseLogUtil.c("SleepManageH5Bridge", "registerDailyResultChanged callbackId:", Long.valueOf(j));
        if (VersionControlUtil.isSupportSleepManagement()) {
            ObserverManagerUtil.e("SLEEP_MANAGEMENT_DAILY_RESULT_TAG", new SleepManagementCallback<gwl>() { // from class: tyw.5
                @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepManagementCallback
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public void onSuccess(gwl gwlVar) {
                    ReleaseLogUtil.c("SleepManageH5Bridge", "notify daily result changed success, result: ", gwlVar, " callbackId: ", Long.valueOf(j));
                    tyw.this.onSuccessCallback(j, gwlVar);
                }

                @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepManagementCallback
                public void onFailure(int i, String str) {
                    ReleaseLogUtil.d("SleepManageH5Bridge", "notify daily result changed errCode: ", Integer.valueOf(i), " errMsg: ", str, " callbackId: ", Long.valueOf(j));
                    tyw.this.onFailureCallback(j, str, i);
                }
            });
        } else {
            ReleaseLogUtil.c("SleepManageH5Bridge", "registerDailyResultChanged failed, callbackId: ", Long.valueOf(j));
            onFailureCallback(j, "not SupportSleepManagement", -1);
        }
    }

    @JavascriptInterface
    public void registerDataValid(final long j) {
        ReleaseLogUtil.c("SleepManageH5Bridge", "registerDataValidChanged callbackId:", Long.valueOf(j));
        if (VersionControlUtil.isSupportSleepManagement()) {
            ObserverManagerUtil.e("SLEEP_MANAGEMENT_DATA_VALID_TAG", new SleepManagementCallback<Boolean>() { // from class: tyw.2
                @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepManagementCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(Boolean bool) {
                    ReleaseLogUtil.c("SleepManageH5Bridge", "notify registerDataValid success, result: ", bool, " callbackId: ", Long.valueOf(j));
                    tyw.this.onSuccessCallback(j, bool);
                }

                @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepManagementCallback
                public void onFailure(int i, String str) {
                    ReleaseLogUtil.d("SleepManageH5Bridge", "notify registerDataValid errCode: ", Integer.valueOf(i), " errMsg: ", str, " callbackId: ", Long.valueOf(j));
                    tyw.this.onFailureCallback(j, str, i);
                }
            });
        } else {
            ReleaseLogUtil.c("SleepManageH5Bridge", "registerDataValidChanged failed, callbackId: ", Long.valueOf(j));
            onFailureCallback(j, "not SupportSleepManagement", -1);
        }
    }
}
