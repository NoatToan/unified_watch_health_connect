package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.userprofile.AddPrivacyRecordReq;
import com.huawei.hwcloudmodel.model.userprofile.AddPrivacyRecordRsp;
import com.huawei.hwcloudmodel.model.userprofile.GetPrivacyRecordReq;
import com.huawei.hwcloudmodel.model.userprofile.GetPrivacyRecordRsp;
import com.huawei.hwcloudmodel.model.userprofile.PrivacyRecord;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.up.callback.CommonCallback;
import health.compact.a.KeyValDbManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ioi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ioi f37912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f37913c;
    private lqs e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f37911a = {"", "true", "", "", "true", "true", "", "", "", "", "", "", "", "", ""};
    private static final Object d = new Object();

    private static boolean a(int i) {
        return i == 601 || i == 602 || i == 603 || i == 604 || i == 403 || i == 405;
    }

    private static boolean d(int i) {
        return (i == 601 || i == 602 || i == 603 || i == 604 || i == 402 || i == 403 || i == 12 || i == 17 || i == 13 || i == 14 || i == 15 || i == 203 || i == 405 || i == 701) ? false : true;
    }

    private ioi() {
        this.f37913c = null;
        this.e = null;
        this.f37913c = BaseApplication.getContext();
        if (this.e == null) {
            this.e = lqs.d();
        }
    }

    public static ioi d() {
        ioi ioiVar;
        synchronized (d) {
            if (f37912b == null) {
                f37912b = new ioi();
            }
            ioiVar = f37912b;
        }
        return ioiVar;
    }

    public String b(String str) {
        return SharedPreferenceManager.e(this.f37913c, String.valueOf(1004), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, String str2, StorageParams storageParams) {
        SharedPreferenceManager.e(this.f37913c, String.valueOf(1004), str, str2, storageParams);
    }

    public void b() {
        d("custome_define_init_flag", "false", null);
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10016), "health_first_login");
        LogUtil.a("HWUserProfileMgrUserPrivacy", "firstLogin = ", strE);
        if ("false".equals(strE)) {
            return;
        }
        SharedPreferenceManager.e(this.f37913c, String.valueOf(10016), "health_first_login", "false", null);
        if (Utils.m()) {
            return;
        }
        a((CommonCallback) null);
    }

    public void e() {
        ffv.u();
        d("custome_define_init_flag", "true", null);
        for (int i = 1; i < 15; i++) {
            String[] strArr = f37911a;
            d("cloud_user_privacy" + i, strArr[i], null);
            d("cloud_user_privacy_reupload" + i, "", null);
            d("cloud_user_privacy_reupload_desp" + i, "", null);
            KeyValDbManager.d(this.f37913c).b("cloud_user_privacy" + i, strArr[i]);
        }
        niz.d();
        j();
    }

    private void j() {
        SharedPreferenceManager.e(this.f37913c, Integer.toString(10000), "health_product_recommend", "", new StorageParams());
        SharedPreferenceManager.e(this.f37913c, Integer.toString(10000), "personalized_recommend", "", new StorageParams());
        SharedPreferenceManager.e(this.f37913c, Integer.toString(1004), "cloud_user_privacy16", "", new StorageParams());
    }

    public void a(final CommonCallback commonCallback) {
        LogUtil.a("HWUserProfileMgrUserPrivacy", " downloadUserPrivacy Entry");
        final GetPrivacyRecordReq getPrivacyRecordReq = new GetPrivacyRecordReq();
        getPrivacyRecordReq.setPrivacyId(0);
        ThreadPoolManager.c().execute(new Runnable() { // from class: ioo
            @Override // java.lang.Runnable
            public final void run() {
                this.f37923c.c(getPrivacyRecordReq, commonCallback);
            }
        });
    }

    /* synthetic */ void c(GetPrivacyRecordReq getPrivacyRecordReq, final CommonCallback commonCallback) {
        lqo.b(this.f37913c).e(getPrivacyRecordReq, new ICloudOperationResult() { // from class: iop
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str, boolean z) {
                this.e.c(commonCallback, (GetPrivacyRecordRsp) obj, str, z);
            }
        });
    }

    /* synthetic */ void c(CommonCallback commonCallback, GetPrivacyRecordRsp getPrivacyRecordRsp, String str, boolean z) {
        LogUtil.a("HWUserProfileMgrUserPrivacy", "downloadUserPrivacy result is " + z);
        if (z) {
            e(getPrivacyRecordRsp, commonCallback);
            return;
        }
        LogUtil.a("HWUserProfileMgrUserPrivacy", "getPrivacyRecord fail " + str);
        if (commonCallback != null) {
            commonCallback.onFail(-1);
        }
    }

    public void b(final Integer num, final CommonCallback commonCallback) {
        LogUtil.a("HWUserProfileMgrUserPrivacy", " downloadUserPrivacy Entry");
        ThreadPoolManager.c().execute(new Runnable() { // from class: ios
            @Override // java.lang.Runnable
            public final void run() {
                this.f37927c.a(num, commonCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(Integer num, final CommonCallback commonCallback) {
        GetPrivacyRecordReq getPrivacyRecordReq = new GetPrivacyRecordReq();
        getPrivacyRecordReq.setPrivacyId(num);
        lqo.b(this.f37913c).e(getPrivacyRecordReq, new ICloudOperationResult() { // from class: ion
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str, boolean z) {
                this.d.d(commonCallback, (GetPrivacyRecordRsp) obj, str, z);
            }
        });
    }

    /* synthetic */ void d(CommonCallback commonCallback, GetPrivacyRecordRsp getPrivacyRecordRsp, String str, boolean z) {
        LogUtil.a("HWUserProfileMgrUserPrivacy", "downloadUserPrivacy result is " + z);
        if (z) {
            e(getPrivacyRecordRsp, commonCallback);
            return;
        }
        LogUtil.a("HWUserProfileMgrUserPrivacy", "getPrivacyRecord fail " + str);
        if (commonCallback == null) {
            LogUtil.j("HWUserProfileMgrUserPrivacy", "getPrivacyRecord cb is null ");
        } else {
            commonCallback.onFail(-1);
        }
    }

    private void e(GetPrivacyRecordRsp getPrivacyRecordRsp, CommonCallback commonCallback) {
        try {
            List<PrivacyRecord> privacyRecords = getPrivacyRecordRsp.getPrivacyRecords();
            if (privacyRecords != null) {
                boolean z = false;
                boolean z2 = false;
                for (PrivacyRecord privacyRecord : privacyRecords) {
                    if (privacyRecord.getPrivacyId().intValue() != 1) {
                        int iIntValue = privacyRecord.getPrivacyId().intValue();
                        String str = "cloud_user_privacy" + iIntValue;
                        if (iIntValue == 10) {
                            SharedPreferenceManager.e(this.f37913c, Integer.toString(10000), "health_product_recommend", privacyRecord.getOpinion().intValue() == 2 ? "0" : "1", new StorageParams());
                        } else if (iIntValue == 12) {
                            SharedPreferenceManager.e(this.f37913c, Integer.toString(10000), "personalized_recommend", privacyRecord.getOpinion().intValue() == 2 ? "0" : "1", new StorageParams());
                        } else if (iIntValue == 17) {
                            SharedPreferenceManager.e(this.f37913c, Integer.toString(10000), "personalized_watch_face_recommend", privacyRecord.getOpinion().intValue() == 2 ? "0" : "1", new StorageParams());
                        } else if (iIntValue == 11) {
                            LogUtil.a("HWUserProfileMgrUserPrivacy", "setShareStatus opinion = ", privacyRecord.getOpinion());
                            niz.c(privacyRecord.getOpinion().intValue() == 1);
                            z2 = true;
                        } else {
                            if (iIntValue == 402) {
                                z = true;
                            }
                            if (LoginInit.getInstance(BaseApplication.getContext()).isMinorAccount() && (iIntValue == 13 || iIntValue == 14 || iIntValue == 15)) {
                                d(str, "false", null);
                            } else {
                                d(str, String.valueOf(privacyRecord.getOpinion().intValue() == 1), null);
                            }
                        }
                        KeyValDbManager.d(this.f37913c).b(str, String.valueOf(privacyRecord.getOpinion().intValue() == 1));
                        c(true);
                    }
                }
                e(z);
                f();
                d(z2);
            }
            if (commonCallback != null) {
                commonCallback.onSuccess(new Bundle());
            }
        } catch (ClassCastException e) {
            LogUtil.d("HWUserProfileMgrUserPrivacy", "operationReultRsp fail ", e.getMessage());
        }
    }

    private void d(boolean z) {
        LogUtil.a("HWUserProfileMgrUserPrivacy", "updateDefaultShareStatus, hasShareStatus is ", Boolean.valueOf(z));
        if (z || Utils.o()) {
            return;
        }
        niz.c(!LoginInit.getInstance(BaseApplication.getContext()).isKidAccount());
    }

    private void e(boolean z) {
        LogUtil.a("HWUserProfileMgrUserPrivacy", "setDefaultHealthKitStatus ");
        if (z || Utils.o()) {
            return;
        }
        e(402, true, String.valueOf(402), new IBaseResponseCallback() { // from class: ioh
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                LogUtil.a("HWUserProfileMgrUserPrivacy", i == 0 ? "onResponse setUserPrivacy success" : "onResponse setUserPrivacy failure");
            }
        });
    }

    private void f() {
        LogUtil.a("HWUserProfileMgrUserPrivacy", "setDefaultPersonalRecommendStatus.");
        if (TextUtils.isEmpty(SharedPreferenceManager.e(this.f37913c, Integer.toString(10000), "personalized_recommend")) && !Utils.o()) {
            LogUtil.a("HWUserProfileMgrUserPrivacy", "PersonalRecommendStatus is empty. Set default value.");
            e(12, !LoginInit.getInstance(BaseApplication.getContext()).isKidAccount(), String.valueOf(12), new IBaseResponseCallback() { // from class: iol
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    ioi.b(i, obj);
                }
            });
        }
        if (!TextUtils.isEmpty(SharedPreferenceManager.e(this.f37913c, Integer.toString(1004), "cloud_user_privacy16")) || Utils.o()) {
            return;
        }
        e(16, false, String.valueOf(16), new IBaseResponseCallback() { // from class: ioq
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                ioi.c(i, obj);
            }
        });
    }

    static /* synthetic */ void b(int i, Object obj) {
        String str;
        if (i == 0) {
            str = "onResponse setDefaultPersonalRecommendStatus success";
        } else {
            str = "onResponse setDefaultPersonalRecommendStatus failure";
        }
        LogUtil.a("HWUserProfileMgrUserPrivacy", str);
    }

    static /* synthetic */ void c(int i, Object obj) {
        String str;
        if (i == 0) {
            str = "onResponse setDefaultHealthDataStatus success";
        } else {
            str = "onResponse setDefaultHealthDataStatus failure";
        }
        LogUtil.a("HWUserProfileMgrUserPrivacy", str);
    }

    public void e(int i, boolean z, String str, IBaseResponseCallback iBaseResponseCallback) {
        if (i == 10) {
            SharedPreferenceManager.e(this.f37913c, Integer.toString(10000), "health_product_recommend", z ? "1" : "0", new StorageParams());
        } else if (i == 12) {
            SharedPreferenceManager.e(this.f37913c, Integer.toString(10000), "personalized_recommend", z ? "1" : "0", new StorageParams());
        } else if (i == 17) {
            SharedPreferenceManager.e(this.f37913c, Integer.toString(10000), "personalized_watch_face_recommend", z ? "1" : "0", new StorageParams());
        } else if (i == 11) {
            niz.c(z);
            lmf.d().c(LoginInit.getInstance(this.f37913c).getAccountInfo(1011));
        } else {
            LogUtil.a("HWUserProfileMgrUserPrivacy", "privacyId is not privacy recommendation switch");
        }
        d("cloud_user_privacy" + i, String.valueOf(z), null);
        KeyValDbManager.d(this.f37913c).b("cloud_user_privacy" + i, String.valueOf(z));
        if (Utils.h()) {
            AddPrivacyRecordReq addPrivacyRecordReq = new AddPrivacyRecordReq();
            addPrivacyRecordReq.setPrivacyId(Integer.valueOf(i));
            addPrivacyRecordReq.setOpinion(Integer.valueOf(z ? 1 : 2));
            addPrivacyRecordReq.setDescription(str);
            a(addPrivacyRecordReq, iBaseResponseCallback, i, z, str);
        }
    }

    private void a(final AddPrivacyRecordReq addPrivacyRecordReq, final IBaseResponseCallback iBaseResponseCallback, final int i, final boolean z, final String str) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: iok
            @Override // java.lang.Runnable
            public final void run() {
                this.f37915a.d(addPrivacyRecordReq, iBaseResponseCallback, i, z, str);
            }
        });
    }

    /* synthetic */ void d(AddPrivacyRecordReq addPrivacyRecordReq, final IBaseResponseCallback iBaseResponseCallback, final int i, final boolean z, final String str) {
        lqo.b(this.f37913c).b(addPrivacyRecordReq, new ICloudOperationResult() { // from class: iom
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str2, boolean z2) {
                this.f37918a.b(iBaseResponseCallback, i, z, str, (AddPrivacyRecordRsp) obj, str2, z2);
            }
        });
    }

    /* synthetic */ void b(IBaseResponseCallback iBaseResponseCallback, int i, boolean z, String str, AddPrivacyRecordRsp addPrivacyRecordRsp, String str2, boolean z2) {
        if (z2) {
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(0, null);
            }
            OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_PRIVACY_SWITCH_85070029.value(), 0);
            d("cloud_user_privacy_reupload" + i, "", null);
            d("cloud_user_privacy_reupload_desp" + i, "", null);
            return;
        }
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(300099, null);
        }
        d("cloud_user_privacy_reupload" + i, String.valueOf(z), null);
        d("cloud_user_privacy_reupload_desp" + i, str, null);
        if (addPrivacyRecordRsp != null) {
            OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_PRIVACY_SWITCH_85070029.value(), addPrivacyRecordRsp.getResultCode().intValue());
        }
    }

    public String c(int i) {
        if ((i < 1 || (i >= 8 && i != 11 && i != 202)) && i != 401 && d(i)) {
            LogUtil.j("HWUserProfileMgrUserPrivacy", "getUserPrivacy invalid privacyId");
            return null;
        }
        String strB = b("cloud_user_privacy" + i);
        boolean zIsKidAccount = LoginInit.getInstance(BaseApplication.getContext()).isKidAccount();
        boolean zIsMinorAccount = LoginInit.getInstance(BaseApplication.getContext()).isMinorAccount();
        if (!TextUtils.isEmpty(strB)) {
            return strB;
        }
        if (i == 401 || a(i)) {
            return String.valueOf(false);
        }
        if (i == 11) {
            if (Utils.o()) {
                return String.valueOf(!zIsKidAccount && String.valueOf(true).equals(iox.c(i)));
            }
            return String.valueOf(!zIsKidAccount);
        }
        if (i == 12) {
            if (Utils.o()) {
                return String.valueOf(!zIsMinorAccount && String.valueOf(true).equals(iox.c(i)));
            }
            return String.valueOf(!zIsMinorAccount);
        }
        if (i == 17) {
            return String.valueOf(String.valueOf(true).equals(iox.c(i)));
        }
        if (i == 402) {
            return String.valueOf(!Utils.o());
        }
        if (i == 202 || i == 701) {
            return "true";
        }
        if (i == 203) {
            return "false";
        }
        if (i == 13 || i == 14 || i == 15) {
            String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010);
            if (!zIsMinorAccount && !"SA".equalsIgnoreCase(accountInfo)) {
                return "true";
            }
            return "false";
        }
        return f37911a[i];
    }

    private void b(final int i) {
        String strB = b("cloud_user_privacy_reupload" + i);
        String strB2 = b("cloud_user_privacy_reupload_desp" + i);
        if (TextUtils.isEmpty(strB) || TextUtils.isEmpty(strB2)) {
            return;
        }
        AddPrivacyRecordReq addPrivacyRecordReq = new AddPrivacyRecordReq();
        addPrivacyRecordReq.setPrivacyId(Integer.valueOf(i));
        addPrivacyRecordReq.setOpinion(Integer.valueOf(strB.equals("true") ? 1 : 2));
        addPrivacyRecordReq.setDescription(strB2);
        lqo.b(this.f37913c).b(addPrivacyRecordReq, new ICloudOperationResult<AddPrivacyRecordRsp>() { // from class: ioi.1
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void operationResult(AddPrivacyRecordRsp addPrivacyRecordRsp, String str, boolean z) {
                if (z && addPrivacyRecordRsp.getResultCode().equals(0)) {
                    ioi.this.d("cloud_user_privacy_reupload" + i, "", null);
                    ioi.this.d("cloud_user_privacy_reupload_desp" + i, "", null);
                }
            }
        });
    }

    public void c() {
        LogUtil.a("HWUserProfileMgrUserPrivacy", "reuploadUserPrivacy Enter");
        ThreadPoolManager.c().execute(new Runnable() { // from class: iot
            @Override // java.lang.Runnable
            public final void run() {
                this.f37928a.a();
            }
        });
    }

    /* synthetic */ void a() {
        for (int i = 1; i < 8; i++) {
            b(i);
        }
    }

    public void c(boolean z) {
        LogUtil.a("HWUserProfileMgrUserPrivacy", "setUserPrivacyUpgraded, flag = " + z);
        d("KEY_PERSONAL_PRIVACY_SETTINGS_UPGRADED_FLAG", String.valueOf(z), null);
    }
}
