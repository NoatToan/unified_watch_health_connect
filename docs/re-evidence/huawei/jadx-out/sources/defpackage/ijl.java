package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ParamsFactory;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import health.compact.a.CommonUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public class ijl implements ParamsFactory {
    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, String> getHeaders() {
        LoginInit loginInit = LoginInit.getInstance(BaseApplication.b());
        HashMap map = new HashMap(16);
        map.put(ProfileRequestConstants.X_APPID_KEY, "10013");
        map.put("versionCode", String.valueOf(BaseApplication.c()));
        map.put(WatchFaceConstant.X_UID, loginInit.getAccountInfo(1011));
        map.put("x-hc", loginInit.getAccountInfo(1010));
        map.put(WatchFaceConstant.X_CLIENTTRACEID, String.valueOf(System.currentTimeMillis()));
        map.put("usertoken", loginInit.getAccountInfo(1015));
        map.put("authtype", "AT");
        map.put("x-accountBrand", "0");
        map.put("x-appBrand", e());
        return map;
    }

    private String e() {
        if (CommonUtil.bg()) {
            return "1";
        }
        if (CommonUtil.bd()) {
            return "2";
        }
        return "3";
    }

    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, Object> getBody(Object obj) {
        return new HashMap();
    }
}
