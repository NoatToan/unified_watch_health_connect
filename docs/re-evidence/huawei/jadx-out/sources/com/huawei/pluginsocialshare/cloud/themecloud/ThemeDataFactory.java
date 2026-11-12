package com.huawei.pluginsocialshare.cloud.themecloud;

import android.content.Context;
import android.os.Build;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hms.network.embedded.j2;
import com.huawei.hms.network.embedded.w9;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ParamsFactory;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;
import defpackage.ofe;
import health.compact.a.CommonUtil;
import health.compact.a.LogUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes15.dex */
public class ThemeDataFactory implements ParamsFactory {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f22558c;

    public ThemeDataFactory(Context context) {
        if (context == null) {
            this.f22558c = BaseApplication.b();
        } else {
            this.f22558c = context.getApplicationContext();
        }
    }

    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, String> getHeaders() {
        HashMap map = new HashMap();
        map.put(j2.v, "gzip, deflate");
        map.put("Content-Type", HealthEngineRequestManager.CONTENT_TYPE);
        map.put("Connection", w9.j);
        map.put(ProfileRequestConstants.X_APPID_KEY, "10013");
        return map;
    }

    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, Object> getBody(Object obj) {
        Map<String, Object> mapA = ofe.a(obj);
        if (mapA == null) {
            mapA = new HashMap<>();
        }
        String strReplace = "1.0";
        try {
            Matcher matcher = Pattern.compile("^[0-9.,x]*").matcher(CommonUtil.a(this.f22558c));
            if (matcher.find()) {
                strReplace = matcher.group(0).replace(".", "");
            }
        } catch (PatternSyntaxException e) {
            LogUtil.d("ThemeDataFactory", "getHeaders ex=", LogUtil.c(e));
        }
        mapA.put("versionCode", strReplace);
        mapA.put(RecommendConstants.VER, "1.7");
        mapA.put("userToken", LoginInit.getInstance(this.f22558c).getAccountInfo(1008));
        mapA.put("deviceType", "9");
        mapA.put("appId", "3");
        mapA.put(FaqConstants.FAQ_EMUIVERSION, CommonUtil.p());
        mapA.put("deviceModel", Build.MODEL);
        mapA.put("buildNumber", Build.DISPLAY);
        mapA.put("resourceType", "2");
        mapA.put("listType", "2");
        mapA.put("isNeedTotalCount", "1");
        return mapA;
    }
}
