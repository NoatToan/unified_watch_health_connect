package defpackage;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.AccountConstants;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.up.model.UserInfomation;
import health.compact.a.SharedPreferenceManager;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class wsr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f52416b;
    private final UserProfileMgrApi d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f52415a = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f52417c = false;

    public wsr(Handler handler, UserProfileMgrApi userProfileMgrApi) {
        this.d = userProfileMgrApi;
        this.f52416b = handler;
    }

    public void e() {
        b();
        d();
    }

    private void b() {
        LogUtil.a("PersonalUserInfoManager", "getAccountInfo");
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1006);
        String accountInfo2 = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1005);
        boolean zIsEmpty = TextUtils.isEmpty(accountInfo);
        boolean z = ("0".equals(accountInfo2) || "1".equals(accountInfo2)) ? false : true;
        if (zIsEmpty || z) {
            this.f52415a = true;
            Handler handler = this.f52416b;
            if (handler != null) {
                this.f52416b.sendMessage(handler.obtainMessage(8));
            }
        } else {
            this.f52415a = false;
        }
        Handler handler2 = this.f52416b;
        if (handler2 == null || this.f52415a || this.f52417c) {
            return;
        }
        this.f52416b.sendMessage(handler2.obtainMessage(14));
    }

    private void d() {
        HiHealthManager.d(BaseApplication.getContext()).fetchUserData(new HiCommonListener() { // from class: wsr.5
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                if (!(obj instanceof List)) {
                    LogUtil.j("PersonalUserInfoManager", "getDataPlatformInfo data is null or error");
                    return;
                }
                List list = (List) obj;
                if (njy.e(list)) {
                    LogUtil.j("PersonalUserInfoManager", "getDataPlatformInfo userInfos is empty");
                    return;
                }
                LogUtil.a("PersonalUserInfoManager", "fetchUserData onSuccess");
                HiUserInfo hiUserInfo = (HiUserInfo) list.get(0);
                if (hiUserInfo == null) {
                    LogUtil.j("PersonalUserInfoManager", "userInfos.get(0) is null");
                    return;
                }
                if (hiUserInfo.isHeightValid() || hiUserInfo.isWeightValid()) {
                    wsr.this.f52417c = false;
                } else {
                    LogUtil.a("PersonalUserInfoManager", "enter set by hw");
                    wsr.this.f52417c = true;
                    if (wsr.this.f52416b != null) {
                        wsr.this.f52416b.sendMessage(wsr.this.f52416b.obtainMessage(8));
                    }
                }
                wsr.this.c(hiUserInfo);
                if (wsr.this.f52416b == null || wsr.this.f52415a || wsr.this.f52417c) {
                    return;
                }
                wsr.this.f52416b.sendMessage(wsr.this.f52416b.obtainMessage(14));
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                LogUtil.e("PersonalUserInfoManager", "fetchUserData onFailure");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(HiUserInfo hiUserInfo) {
        if (hiUserInfo == null) {
            LogUtil.j("PersonalUserInfoManager", "hiUserInfo is null");
            return;
        }
        if ("1".equals(SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), AccountConstants.HEALTH_APP_THIRD_LOGIN))) {
            LogUtil.a("PersonalUserInfoManager", "third");
            if (hiUserInfo.getGender() != 1 && hiUserInfo.getGender() != 0) {
                LogUtil.a("PersonalUserInfoManager", "enter set by gender");
                this.f52415a = true;
                Handler handler = this.f52416b;
                if (handler != null) {
                    this.f52416b.sendMessage(handler.obtainMessage(8));
                }
            } else {
                this.f52415a = false;
            }
            if (!hiUserInfo.isBirthdayValid()) {
                LogUtil.a("PersonalUserInfoManager", "enter set by birthday");
                this.f52415a = true;
                Handler handler2 = this.f52416b;
                if (handler2 != null) {
                    this.f52416b.sendMessage(handler2.obtainMessage(8));
                    return;
                }
                return;
            }
            this.f52415a = false;
        }
    }

    public void a() {
        if ("1".equals(SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), AccountConstants.HEALTH_APP_THIRD_LOGIN))) {
            LogUtil.a("PersonalUserInfoManager", "accountmigrate: isthirdlogin == 1 and return!");
            c();
        } else {
            this.d.getUserInfo(new c(this.f52416b));
        }
    }

    private void c() {
        HiHealthManager.d(BaseApplication.getContext()).fetchUserData(new HiCommonListener() { // from class: wsr.1
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                if (obj == null || !(obj instanceof List)) {
                    LogUtil.j("PersonalUserInfoManager", "fetchUserData data is error");
                }
                LogUtil.d("PersonalUserInfoManager", "fetchUserData data = ", obj);
                List list = (List) obj;
                if (njy.e(list)) {
                    LogUtil.j("PersonalUserInfoManager", "fetchUserData userInfos is empty");
                    return;
                }
                LogUtil.a("PersonalUserInfoManager", "fetchUserData onSuccess");
                HiUserInfo hiUserInfo = (HiUserInfo) list.get(0);
                if (LoginInit.getInstance(BaseApplication.getContext()).isLoginedByWear()) {
                    dnj mainUser = MultiUsersManager.INSTANCE.getMainUser();
                    String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1002);
                    if (accountInfo == null) {
                        LogUtil.a("PersonalUserInfoManager", "updateUserNameFromLocal userName is null");
                    } else {
                        hiUserInfo.setName(accountInfo);
                        if (mainUser != null) {
                            mainUser.e(accountInfo);
                        }
                    }
                    String accountInfo2 = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1003);
                    if (mainUser != null) {
                        mainUser.c(accountInfo2);
                    }
                    hiUserInfo.setHeadImgUrl(accountInfo2);
                }
                if (wsr.this.f52416b != null) {
                    Message messageObtainMessage = wsr.this.f52416b.obtainMessage(4);
                    messageObtainMessage.obj = hiUserInfo;
                    wsr.this.f52416b.sendMessage(messageObtainMessage);
                    return;
                }
                LogUtil.a("PersonalUserInfoManager", "Handler is null");
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                LogUtil.a("PersonalUserInfoManager", "fetchUserData onFailure");
            }
        });
    }

    public String b(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        String[] strArrSplit = str.split("/");
        String canonicalPath = BaseApplication.getContext().getFilesDir() + "/photos/headimage/" + strArrSplit[strArrSplit.length - 1];
        if (new File(canonicalPath).exists()) {
            LogUtil.a("PersonalUserInfoManager", "accountmigrate: getHeadImageFromLocal file.exists() yes");
        } else {
            LogUtil.a("PersonalUserInfoManager", "accountmigrate: getHeadImageFromLocal file.exists() no");
            File[] fileArrListFiles = new File(BaseApplication.getContext().getFilesDir() + "/photos/headimage").listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                LogUtil.d("PersonalUserInfoManager", "accountmigrate: getHeadImageFromLocal files num:", Integer.valueOf(fileArrListFiles.length));
                try {
                    canonicalPath = fileArrListFiles[fileArrListFiles.length - 1].getCanonicalPath();
                } catch (IOException unused) {
                    LogUtil.a("PersonalUserInfoManager", "accountmigrate: get localpath io exception");
                }
            }
        }
        LogUtil.d("PersonalUserInfoManager", "accountmigrate: getHeadImageFromLocal localpath = ", canonicalPath);
        return canonicalPath;
    }

    static class c implements BaseResponseCallback<UserInfomation> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<Handler> f52419b;

        c(Handler handler) {
            this.f52419b = new WeakReference<>(handler);
        }

        @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, UserInfomation userInfomation) {
            Handler handler = this.f52419b.get();
            if (handler == null) {
                return;
            }
            if (i != 0) {
                handler.sendEmptyMessage(1);
                return;
            }
            if (userInfomation == null) {
                LogUtil.a("PersonalUserInfoManager", "get userinfo success but obtain null objData");
                return;
            }
            LogUtil.a("PersonalUserInfoManager", "get userinfo success objData：", userInfomation.toString());
            Message messageObtain = Message.obtain();
            messageObtain.obj = userInfomation;
            messageObtain.what = 0;
            handler.sendMessage(messageObtain);
        }
    }
}
