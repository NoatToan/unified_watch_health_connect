package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.featureuserprofile.account.data.IAccountDataMgr;
import com.huawei.featureuserprofile.account.ext.IAccountDataExtMgr;
import com.huawei.featureuserprofile.media.UserInfoMedia;
import com.huawei.featureuserprofile.util.AsyncSelectorSerialize;
import com.huawei.featureuserprofile.util.EventBus;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.up.callback.CommonCallback;
import com.huawei.up.model.UserInfomation;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class cup {
    private static final int[] d = {1000, 3000, 5000};
    private static cup e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IAccountDataMgr f31315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IAccountDataExtMgr f31316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f31317c;
    private long g = 0;
    private EventBus h;

    private cup(Context context) {
        this.f31317c = null;
        this.f31315a = new cuy();
        this.f31316b = new cvc();
        this.h = null;
        this.f31317c = context;
        d dVar = new d();
        this.h = dVar;
        dVar.init(this.f31317c);
        this.h.loadSceneIfExist();
        if (CommonUtil.ca()) {
            cuv cuvVar = new cuv();
            this.f31315a = cuvVar;
            cuvVar.init(this.f31317c);
            cvb cvbVar = new cvb();
            this.f31316b = cvbVar;
            cvbVar.init(this.f31317c);
        }
    }

    class d extends EventBus {
        private d() {
        }

        @Override // com.huawei.featureuserprofile.util.EventBus
        public void onLoginIfAllow() {
            if (Utils.k()) {
                cup.this.f31315a = new cuz();
                LogUtil.j("UserProfileMgrNative", "onLoginIfAllow isOverseaNoCloudVersion");
            } else {
                cup.this.f31315a = new cuv();
            }
            cup.this.f31315a.init(cup.this.f31317c);
            cup.this.f31316b = new cvb();
            cup.this.f31316b.init(cup.this.f31317c);
        }

        @Override // com.huawei.featureuserprofile.util.EventBus
        public void onDuplicateLoginIfAllow() {
            if (cup.this.f31315a != null) {
                cup.this.f31315a.sync();
            }
        }

        @Override // com.huawei.featureuserprofile.util.EventBus
        public void onLogoutIfAllow() {
            cup.this.f31315a.destroy();
            cup.this.f31315a = new cuy();
            cup.this.f31316b.destroy(cup.this.f31317c);
            cup.this.f31316b = new cvc();
        }

        @Override // com.huawei.featureuserprofile.util.EventBus
        public void onRecognizeNotAllow() {
            cup.this.f31315a = new cuz();
            cup.this.f31315a.init(cup.this.f31317c);
            cup.this.f31316b = new cvb();
            cup.this.f31316b.init(cup.this.f31317c);
        }
    }

    public static cup c(Context context) {
        cup cupVar;
        if (context == null) {
            LogUtil.j("UserProfileMgrNative", "getInstance context is null");
            return null;
        }
        synchronized (cup.class) {
            if (e == null) {
                e = new cup(context.getApplicationContext());
            }
            cupVar = e;
        }
        return cupVar;
    }

    public void b() {
        this.h.loginAccount();
    }

    public void e() {
        this.h.loginStorage();
    }

    public void a() {
        this.h.logoutAcount();
    }

    public void i() {
        this.h.logoutStorage();
    }

    public void j() {
        this.h.setAllowArea();
    }

    public void g() {
        this.h.setNotAllowArea();
    }

    public boolean h() {
        LogUtil.a("UserProfileMgrNative", "waitInit checkInit before mAccountDataMgr.checkInit(): ", Boolean.valueOf(this.f31315a.checkInit()), " mAccountDataExtMgr.checkInit(): ", Boolean.valueOf(this.f31316b.checkInit()));
        int[] iArr = d;
        for (int length = iArr.length; length != 0 && (!this.f31315a.checkInit() || !this.f31316b.checkInit()); length--) {
            try {
                int i = iArr[3 - length];
                LogUtil.a("UserProfileMgrNative", "waitInit sleepArg: ", Integer.valueOf(i));
                Thread.sleep(i);
            } catch (InterruptedException unused) {
                LogUtil.j("UserProfileMgrNative", "waitInit interrupt");
            }
        }
        LogUtil.a("UserProfileMgrNative", "waitInit checkInit after mAccountDataMgr.checkInit(): ", Boolean.valueOf(this.f31315a.checkInit()), " mAccountDataExtMgr.checkInit(): ", Boolean.valueOf(this.f31316b.checkInit()));
        return this.f31315a.checkInit() && this.f31316b.checkInit();
    }

    public boolean d() {
        return this.f31315a.checkInit() && this.f31316b.checkInit();
    }

    public void e(UserInfomation userInfomation, final ICloudOperationResult<Boolean> iCloudOperationResult) {
        LogUtil.a("UserProfileMgrNative", "setUserInfo");
        boolean z = false;
        if (userInfomation == null) {
            if (iCloudOperationResult != null) {
                iCloudOperationResult.operationResult(false, null, false);
                return;
            }
            return;
        }
        UserInfomation userInfomationCopyFrom = userInfomation.copyFrom();
        AsyncSelectorSerialize asyncSelectorSerialize = new AsyncSelectorSerialize(new Handler(Looper.getMainLooper())) { // from class: cup.4
            @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize
            public void onFailed(int i) {
                ICloudOperationResult iCloudOperationResult2 = iCloudOperationResult;
                if (iCloudOperationResult2 != null) {
                    iCloudOperationResult2.operationResult(null, null, false);
                }
            }

            @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize
            public void onSuccess(Map map) {
                ICloudOperationResult iCloudOperationResult2 = iCloudOperationResult;
                if (iCloudOperationResult2 != null) {
                    iCloudOperationResult2.operationResult(null, null, true);
                }
                if (CompileParameterUtil.c("SUPPORT_WIFI_WEIGHT_DEVICE", false)) {
                    LogUtil.a("UserProfileMgrNative", "setUserInfo by HWUserProfileMgrNative");
                    Intent intent = new Intent();
                    intent.setPackage(cup.this.f31317c.getPackageName());
                    intent.setAction("com.huawei.health.action.ACTION_WIFI_USERINFO_ACTION");
                    BaseApplication.getContext().sendBroadcast(intent, LocalBroadcast.f36595c);
                }
            }
        };
        LoginInit loginInit = LoginInit.getInstance(BaseApplication.getContext());
        boolean z2 = userInfomationCopyFrom.isGenderValid() && !String.valueOf(userInfomationCopyFrom.getGender()).equals(loginInit.getAccountInfo(1005));
        boolean z3 = userInfomationCopyFrom.isBirthdayValid() && !userInfomationCopyFrom.getBirthday().equals(loginInit.getAccountInfo(1006));
        if (!TextUtils.isEmpty(userInfomationCopyFrom.getName()) && !userInfomationCopyFrom.getName().equals(loginInit.getAccountInfo(1002))) {
            z = true;
        }
        if (z2 || z3 || z) {
            asyncSelectorSerialize.add(e(userInfomationCopyFrom, asyncSelectorSerialize));
        }
        if (userInfomationCopyFrom.isHeightValid() || userInfomationCopyFrom.isWeightValid()) {
            asyncSelectorSerialize.add(b(userInfomationCopyFrom, asyncSelectorSerialize));
        }
        asyncSelectorSerialize.run();
    }

    private AsyncSelectorSerialize.BaseAction e(final UserInfomation userInfomation, final AsyncSelectorSerialize asyncSelectorSerialize) {
        return new AsyncSelectorSerialize.BaseAction() { // from class: cup.2
            @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize.BaseAction, com.huawei.featureuserprofile.util.AsyncSelectorSerialize.Action
            public void execute(Map map) {
                LogUtil.a("UserProfileMgrNative", "getAccountAction modify AccountData");
                cup.this.f31315a.setUserInfo(userInfomation, new UserInfoMedia.UserInfoWriter.Callback() { // from class: cup.2.3
                    @Override // com.huawei.featureuserprofile.media.UserInfoMedia.UserInfoWriter.Callback
                    public void onSuccess() {
                        LogUtil.a("UserProfileMgrNative", "getAccountAction AccountDataChange success");
                        asyncSelectorSerialize.next(null);
                    }

                    @Override // com.huawei.featureuserprofile.media.UserInfoMedia.UserInfoWriter.Callback
                    public void onFail(int i) {
                        LogUtil.j("UserProfileMgrNative", "getAccountAction AccountDataChange fail");
                        asyncSelectorSerialize.postError();
                    }
                });
            }
        };
    }

    private AsyncSelectorSerialize.BaseAction b(final UserInfomation userInfomation, final AsyncSelectorSerialize asyncSelectorSerialize) {
        return new AsyncSelectorSerialize.BaseAction() { // from class: cup.5
            @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize.BaseAction, com.huawei.featureuserprofile.util.AsyncSelectorSerialize.Action
            public void execute(Map map) {
                LogUtil.a("UserProfileMgrNative", "getExtendDataAction modify AccountDataExt");
                cup.this.f31316b.setUserInfo(userInfomation, new UserInfoMedia.UserInfoWriter.Callback() { // from class: cup.5.5
                    @Override // com.huawei.featureuserprofile.media.UserInfoMedia.UserInfoWriter.Callback
                    public void onSuccess() {
                        LogUtil.a("UserProfileMgrNative", "getExtendDataAction AccountDataExtChange setUserInfo success");
                        asyncSelectorSerialize.next(null);
                    }

                    @Override // com.huawei.featureuserprofile.media.UserInfoMedia.UserInfoWriter.Callback
                    public void onFail(int i) {
                        LogUtil.j("UserProfileMgrNative", "getExtendDataAction AccountDataExtChange setUserInfo fail");
                        asyncSelectorSerialize.postError();
                    }
                });
            }
        };
    }

    public UserInfomation c() {
        LogUtil.a("UserProfileMgrNative", "enter getUserInfo mAccountDataMgr|mAccountDataExtMgr null is ", Boolean.valueOf(this.f31315a == null || this.f31316b == null));
        IAccountDataMgr iAccountDataMgr = this.f31315a;
        if (iAccountDataMgr == null || this.f31316b == null) {
            return null;
        }
        UserInfomation userInfo = iAccountDataMgr.getUserInfo();
        UserInfomation userInfo2 = this.f31316b.getUserInfo();
        if (userInfo == null || userInfo2 == null) {
            LogUtil.j("UserProfileMgrNative", "getUserInfo accountData|accountDataExt null");
            return null;
        }
        UserInfomation userInfomation = new UserInfomation(0);
        userInfomation.loadAccountData(userInfo);
        userInfomation.loadAccountExtData(userInfo2);
        if (!TextUtils.isEmpty(userInfomation.getPicPath()) && !"default".equals(userInfomation.getPicPath())) {
            return userInfomation;
        }
        userInfomation.setPicPath(czz.a());
        return userInfomation;
    }

    private UserInfomation f() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.g;
        if (j > 0 && jElapsedRealtime - j < 5000) {
            LogUtil.a("UserProfileMgrNative", "isSync false");
            return null;
        }
        this.g = jElapsedRealtime;
        return c();
    }

    public void a(BaseResponseCallback<UserInfomation> baseResponseCallback) {
        UserInfomation userInfomationF = f();
        if (d() && userInfomationF != null) {
            LogUtil.a("UserProfileMgrNative", "isSync true");
            cwq.a(baseResponseCallback, 0, userInfomationF);
        } else {
            HiHealthNativeApi.a(this.f31317c).fetchUserData(new e(baseResponseCallback));
        }
    }

    public void e(UserInfomation userInfomation) {
        IAccountDataMgr iAccountDataMgr = this.f31315a;
        if (iAccountDataMgr != null) {
            iAccountDataMgr.refreshAccountDataCache(userInfomation);
        }
    }

    public void d(final CommonCallback commonCallback) {
        this.f31315a.sync(new UserInfoMedia.UserInfoReader.Callback() { // from class: cup.1
            @Override // com.huawei.featureuserprofile.media.UserInfoMedia.UserInfoReader.Callback
            public void onSuccess(UserInfomation userInfomation) {
                CommonCallback commonCallback2 = commonCallback;
                if (commonCallback2 != null) {
                    commonCallback2.onSuccess(new Bundle());
                }
            }

            @Override // com.huawei.featureuserprofile.media.UserInfoMedia.UserInfoReader.Callback
            public void onFail(int i) {
                CommonCallback commonCallback2 = commonCallback;
                if (commonCallback2 != null) {
                    commonCallback2.onFail(i);
                }
            }
        });
    }

    static class e implements HiCommonListener {
        private final BaseResponseCallback<UserInfomation> e;

        e(BaseResponseCallback<UserInfomation> baseResponseCallback) {
            this.e = baseResponseCallback;
        }

        @Override // com.huawei.hihealth.data.listener.HiCommonListener
        public void onSuccess(int i, Object obj) {
            if (!njy.b(obj, HiUserInfo.class)) {
                LogUtil.j("UserProfileMgrNative", "getUserInfo isListTypeMatch = false");
                cwq.a(this.e, -1, null);
                return;
            }
            List list = (List) obj;
            if (njy.e(list)) {
                LogUtil.j("UserProfileMgrNative", "getUserInfo userList is null or empty");
                cwq.a(this.e, -1, null);
                return;
            }
            HiUserInfo hiUserInfo = (HiUserInfo) list.get(0);
            if (hiUserInfo == null) {
                LogUtil.j("UserProfileMgrNative", "getUserInfo hiUserInfo is null");
                cwq.a(this.e, -1, null);
                return;
            }
            ReleaseLogUtil.d("R_PersonalInfo_UserProfileMgrNative", "verify userInfo, isGenderValid: ", Boolean.valueOf(hiUserInfo.isGenderValid()), " isBirthdayValid: ", Boolean.valueOf(hiUserInfo.isBirthdayValid()), " isHeightValid: ", Boolean.valueOf(hiUserInfo.isHeightValid()), " isWeightValid: ", Boolean.valueOf(hiUserInfo.isWeightValid()));
            UserInfomation userInfomation = new UserInfomation(0);
            userInfomation.loadAccountData(hiUserInfo);
            userInfomation.loadAccountExtData(hiUserInfo);
            if (TextUtils.isEmpty(userInfomation.getPicPath()) || "default".equals(userInfomation.getPicPath())) {
                userInfomation.setPicPath(czz.a());
            }
            cwq.a(this.e, 0, userInfomation);
        }

        @Override // com.huawei.hihealth.data.listener.HiCommonListener
        public void onFailure(int i, Object obj) {
            LogUtil.a("UserProfileMgrNative", "getUserInfo fetchUserData errorCode = ", Integer.valueOf(i), " errorMessage = ", obj);
            cwq.a(this.e, -1, null);
        }
    }
}
