package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import com.huawei.common.util.Utils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.IRequest;
import com.huawei.openalliance.ad.constant.Constants;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public class ijs implements IRequest {
    public Map<String, String> c(Map<String, String> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        Context contextB = BaseApplication.b();
        map.put("firmware", Build.VERSION.RELEASE);
        if (qrs.ah(contextB)) {
            map.put("screen", "1200*1920");
        } else {
            map.put("screen", qrs.q() + "*" + qrs.m());
        }
        Point pointL = qrs.l();
        map.put("realscreen", pointL.x + "*" + pointL.y);
        map.put("locale", CommonUtil.z().replace(Constants.LINK, "_"));
        map.put("isoCode", LoginInit.getInstance(contextB).getAccountInfo(1010));
        map.put("mcc", Utils.getCountryCode());
        map.put("type", "5");
        return map;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("domainThemeCloud") + "/servicesupport/theme/tis/service/getFrontParam.do";
    }
}
