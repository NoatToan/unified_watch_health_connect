package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.network.grs.GrsApi;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class xox {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile xox f53252a;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f53253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, String> f53254c = new HashMap();
    private Map<String, String> d = new HashMap();

    private xox(Context context) {
        if (context != null) {
            this.f53253b = context.getApplicationContext();
        }
    }

    public static xox d(Context context) {
        if (f53252a == null) {
            synchronized (e) {
                if (f53252a == null) {
                    f53252a = new xox(context);
                }
            }
        }
        return f53252a;
    }

    public String d(String str, String str2) {
        xnd.c("OverSeasManager", " getGrsUrlSync method BEGIN", false);
        a(str2);
        String str3 = this.f53254c.get(str);
        if (TextUtils.isEmpty(str3)) {
            xnd.d("OverSeasManager", "urlResult is null, and modelName is " + str, false);
        }
        xnd.b("OverSeasManager", " getGrsUrlSync method END,,cost :" + (System.currentTimeMillis() - System.currentTimeMillis()), false);
        return str3;
    }

    private void c(String str) {
        xnd.b("OverSeasManager", " getUrlMapFromGrs BEGIN.", false);
        Map<String, String> mapC = c(str, this.f53253b);
        if (!mapC.isEmpty()) {
            this.f53254c.putAll(mapC);
        }
        if (this.f53254c.isEmpty()) {
            xnd.d("OverSeasManager", " getUrlMapFromGrs bad, get url map empty.", false);
        } else {
            xmo.e(this.f53253b).e("account_service_country_code", str);
            xnd.b("OverSeasManager", " getUrlMapFromGrs god, get url map not empty.", false);
        }
        xnd.b("OverSeasManager", " getUrlMapFromGrs END.urlMap is empty :" + this.f53254c.isEmpty(), false);
    }

    private Map<String, String> c(String str, Context context) {
        GrsBaseInfo grsBaseInfo = new GrsBaseInfo();
        grsBaseInfo.setAppName(xov.b());
        grsBaseInfo.setSerCountry(str);
        if (context == null) {
            return new HashMap();
        }
        GrsApi.grsSdkInit(context, grsBaseInfo);
        Map<String, String> mapSynGetGrsUrls = GrsApi.synGetGrsUrls(xov.e());
        HashMap map = new HashMap();
        if (mapSynGetGrsUrls != null && !mapSynGetGrsUrls.isEmpty()) {
            if (!str.equals("CN")) {
                mapSynGetGrsUrls.put("WALLET", mapSynGetGrsUrls.get("VIRTUALCARD"));
            }
            map.putAll(mapSynGetGrsUrls);
        }
        Map<String, String> mapSynGetGrsUrls2 = GrsApi.synGetGrsUrls("com.huawei.cloud.agreementservice");
        if (mapSynGetGrsUrls2 != null && !mapSynGetGrsUrls2.isEmpty()) {
            map.put("GREMENT", mapSynGetGrsUrls2.get("ROOT"));
            map.put("GREMENT_COMMON", mapSynGetGrsUrls2.get("COMMONAPI"));
        } else {
            xnd.d("OverSeasManager", " getUrlMapFromGrs bad, agreementUrl is empty.", false);
        }
        String strSynGetGrsUrl = GrsApi.synGetGrsUrl("com.huawei.cloud.ccs", "ROOT");
        if (!TextUtils.isEmpty(strSynGetGrsUrl)) {
            map.put("WALLET_CA", strSynGetGrsUrl);
        }
        Map<String, String> mapSynGetGrsUrls3 = GrsApi.synGetGrsUrls("com.huawei.cloud.feedback");
        if (mapSynGetGrsUrls3 != null && !mapSynGetGrsUrls3.isEmpty()) {
            map.put("FEEDBACK_ROOT", mapSynGetGrsUrls3.get("ROOT"));
            map.put("FEEDBACK_REPORT", mapSynGetGrsUrls3.get("REPORT"));
            map.put("FEEDBACK_LOG", mapSynGetGrsUrls3.get("LOG"));
        } else {
            xnd.d("OverSeasManager", " getUrlMapFromGrs bad, feedBackUrl is empty.", false);
        }
        xnd.b("OverSeasManager", " getUrlMapFromGrs done  = " + map.size(), false);
        return map;
    }

    String b(String str, String str2) {
        synchronized (this) {
            Map<String, String> map = this.d;
            if (map == null || map.size() == 0) {
                this.d = xoz.c(this.f53253b).b(str, xov.e());
                xnd.b("OverSeasManager", "getUrlFromLocal is done", false);
            }
            Map<String, String> map2 = this.d;
            if (map2 != null && map2.size() > 0) {
                xnd.b("OverSeasManager", "getUrlFromLocal is done = " + this.d.get(str2), false);
                return this.d.get(str2);
            }
            if (this.d == null) {
                xnd.b("OverSeasManager", "getUrlFromLocal  addressLocalUrlMap is null", false);
            } else {
                xnd.b("OverSeasManager", "getUrlFromLocal  addressLocalUrlMap size:" + this.d.size(), false);
            }
            return " ";
        }
    }

    private void a(String str) {
        if (!e(null)) {
            xnd.b("OverSeasManager", " initGrs no need init.", false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            xnd.b("OverSeasManager", " initGrs isEmpty .", false);
            str = xph.a();
        }
        xnd.b("OverSeasManager", "initGrs", false);
        c(str);
    }

    private boolean e(String str) {
        boolean z;
        if (TextUtils.isEmpty(str) || !xmo.e(this.f53253b).a("account_service_country_code", "").equalsIgnoreCase(str) || this.f53254c.isEmpty()) {
            z = true;
        } else {
            xnd.c("OverSeasManager", " isNeedInit set the mem as sp.", false);
            z = false;
        }
        xnd.c("OverSeasManager", " isNeedInit :" + z, false);
        return z;
    }
}
