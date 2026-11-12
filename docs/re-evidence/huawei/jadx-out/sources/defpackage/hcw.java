package defpackage;

import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.up.model.UserInfomation;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes9.dex */
class hcw {
    static float b() {
        return ien.c();
    }

    static String d() {
        UserInfomation userInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo();
        if (userInfo != null) {
            return userInfo.getPortraitUrl();
        }
        return null;
    }
}
