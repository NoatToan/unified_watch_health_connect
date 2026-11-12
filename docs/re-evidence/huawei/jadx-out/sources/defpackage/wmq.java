package defpackage;

import android.content.Context;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.model.userprofile.DeleteAllUserProfileReq;
import com.huawei.hwcloudmodel.model.userprofile.DeleteAllUserProfileRsp;
import com.huawei.hwcloudmodel.model.userprofile.LastClearCloudDataTimeRsp;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes19.dex */
public class wmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static wmq f52198a;
    private ioi e = ioi.d();

    private wmq(Context context) {
    }

    public static wmq a(Context context) {
        if (f52198a == null) {
            f52198a = new wmq(context);
        }
        return f52198a;
    }

    public String c(int i) {
        if (i == 6) {
            return this.e.c(7);
        }
        return this.e.c(i);
    }

    public void a(int i, boolean z) {
        LogUtil.a("PersonalPrivacySettingsInteractors", "setPersonalPrivacySettingValue... privacyId = ", Integer.valueOf(i), ", isOpen = ", Boolean.valueOf(z));
        this.e.e(i, z, String.valueOf(i), new IBaseResponseCallback() { // from class: wmq.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                if (i2 == 0) {
                    LogUtil.a("PersonalPrivacySettingsInteractors", "onResponse setUserPrivacy success");
                } else {
                    LogUtil.e("PersonalPrivacySettingsInteractors", "onResponse setUserPrivacy failure");
                }
            }
        });
    }

    public void e(Boolean bool, final IBaseResponseCallback iBaseResponseCallback) {
        DeleteAllUserProfileReq deleteAllUserProfileReq = new DeleteAllUserProfileReq();
        deleteAllUserProfileReq.setScenario(!bool.booleanValue() ? 1 : 0);
        lqo.b(BaseApplication.b()).a(deleteAllUserProfileReq, new ResultCallback<DeleteAllUserProfileRsp>() { // from class: wmq.4
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(DeleteAllUserProfileRsp deleteAllUserProfileRsp) {
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 != null) {
                    iBaseResponseCallback2.a(0, null);
                }
                if (deleteAllUserProfileRsp.getResultCode().intValue() == 0) {
                    OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_CLEAN_CLOUD_DATA_85070028.value(), 0);
                } else {
                    OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_CLEAN_CLOUD_DATA_85070028.value(), deleteAllUserProfileRsp.getResultCode().intValue());
                }
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.e("PersonalPrivacySettingsInteractors", "deleteAllData fail:", th.getMessage());
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 != null) {
                    iBaseResponseCallback2.a(300099, null);
                }
            }
        });
    }

    public void e(final IBaseResponseCallback iBaseResponseCallback) {
        lqo.b(BaseApplication.b()).c(new ResultCallback<LastClearCloudDataTimeRsp>() { // from class: wmq.2
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(LastClearCloudDataTimeRsp lastClearCloudDataTimeRsp) {
                if (iBaseResponseCallback != null) {
                    if (lastClearCloudDataTimeRsp.getResultCode().intValue() == 0) {
                        iBaseResponseCallback.a(0, lastClearCloudDataTimeRsp.getLastRecord());
                    } else {
                        iBaseResponseCallback.a(300099, null);
                    }
                }
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.e("PersonalPrivacySettingsInteractors", "getLastClearCloudDataTime fail:", th.getMessage());
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 != null) {
                    iBaseResponseCallback2.a(300099, null);
                }
            }
        });
    }

    public void a() {
        if (!Utils.h()) {
            LogUtil.j("PersonalPrivacySettingsInteractors", "reUploadUserPrivacy not, no cloud version.");
        } else {
            this.e.c();
        }
    }
}
