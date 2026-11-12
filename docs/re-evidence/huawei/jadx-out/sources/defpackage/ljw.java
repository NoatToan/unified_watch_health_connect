package defpackage;

import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.auth.HiAuthorization;
import com.huawei.hihealthservice.auth.HiUserAuth;
import com.huawei.hihealthservice.auth.WhiteListApp;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class ljw {
    /* JADX WARN: Code duplicated, block: B:10:0x0033 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    public static HiAuthorization b(boolean z, String str, String str2) {
        String appScopes;
        if (z) {
            WhiteListApp whiteListAppE = kyl.c().e(str);
            if (whiteListAppE != null) {
                appScopes = whiteListAppE.getAppScopes();
            }
            if (appScopes == null) {
                return null;
            }
            return (HiAuthorization) HiJsonUtil.d(appScopes, HiAuthorization.class);
        }
        LogUtil.d("HiHttpUtil", "by ID :", "/rest.php?appid=" + str2 + "&type=3&access_token=xxx&nsp_svc=nsp.scope.app.get");
        appScopes = null;
        if (appScopes == null) {
            return null;
        }
        return (HiAuthorization) HiJsonUtil.d(appScopes, HiAuthorization.class);
    }

    public static HiUserAuth a(boolean z, String str, String str2) {
        if (z) {
            WhiteListApp whiteListAppE = kyl.c().e(str);
            String userScopes = whiteListAppE != null ? whiteListAppE.getUserScopes() : null;
            return (HiUserAuth) HiJsonUtil.d(userScopes, HiUserAuth.class);
        }
        LogUtil.d("HiHttpUtil", "by Token :", "/rest.php?nsp_svc=huawei.oauth2.user.getTokenInfo&open_id=OPENID&access_token=" + str2);
        return (HiUserAuth) HiJsonUtil.d(userScopes, HiUserAuth.class);
    }
}
