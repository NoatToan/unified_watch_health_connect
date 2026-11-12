package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.up.model.UserInfomation;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes9.dex */
public class ioy {
    public static UserInfomation a() {
        UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.d("HWUserProfileMgr", UserProfileMgrApi.class);
        if (userProfileMgrApi == null) {
            ReleaseLogUtil.d("UserInformationUtils", "getUserInformation api is null");
            return null;
        }
        UserInfomation userInfo = userProfileMgrApi.getUserInfo();
        if (userInfo != null) {
            return userInfo;
        }
        boolean zC = HandlerExecutor.c();
        ReleaseLogUtil.d("UserInformationUtils", "getUserInformation userInformation is null isMainTread ", Boolean.valueOf(zC));
        return !zC ? LoginInit.getInstance(BaseApplication.b()).getUserInfoFromDbSync() : userInfo;
    }

    public static int d() {
        UserInfomation userInfomationA = a();
        if (userInfomationA == null) {
            return -100;
        }
        return userInfomationA.getAge();
    }

    public static int e() {
        UserInfomation userInfomationA = a();
        if (userInfomationA == null) {
            return -100;
        }
        return userInfomationA.getGender();
    }

    public static int c() {
        UserInfomation userInfomationA = a();
        if (userInfomationA == null) {
            return -100;
        }
        return userInfomationA.getHeight();
    }

    public static float b() {
        UserInfomation userInfomationA = a();
        if (userInfomationA == null) {
            return -100.0f;
        }
        return userInfomationA.getWeight();
    }
}
