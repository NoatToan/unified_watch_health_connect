package com.huawei.watchface;

import android.text.TextUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.GrsClient;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.flavor.FlavorConfig;
import com.huawei.watchface.utils.HwLog;

/* JADX INFO: loaded from: classes20.dex */
public class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile String f30624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GrsClient f30625b;

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static v0 f30626a = new v0();
    }

    public static v0 a() {
        return a.f30626a;
    }

    public String a(String str, String str2, String str3) {
        synchronized (this) {
            String strSynGetGrsUrl = "";
            try {
                if (TextUtils.isEmpty(str)) {
                    HwLog.e("GRSSdk", "getServerUrl country is empty");
                    return "";
                }
                if (TextUtils.isEmpty(str3)) {
                    HwLog.e("GRSSdk", "getServerUrl serviceName is empty");
                    return "";
                }
                if (!str.equalsIgnoreCase(this.f30624a) || this.f30625b == null) {
                    HwLog.i("GRSSdk", "getServerUrl !country.equalsIgnoreCase(lastInitCountry)");
                    GrsBaseInfo grsBaseInfo = new GrsBaseInfo();
                    grsBaseInfo.setSerCountry(str);
                    grsBaseInfo.setCountrySource("APP");
                    this.f30625b = new GrsClient(Environment.getApplicationContext(), grsBaseInfo);
                }
                strSynGetGrsUrl = this.f30625b.synGetGrsUrl(str3, str2);
                this.f30624a = str;
                FlavorConfig.safeHwLog("GRSSdk", "key:" + str2 + ",url:" + strSynGetGrsUrl);
                return strSynGetGrsUrl;
            } catch (Exception e) {
                HwLog.i("GRSSdk", "getServerUrl Exception:" + HwLog.printException(e));
            }
        }
    }

    public String a(String str, String str2) {
        return a(str2, str, w0.a(str));
    }
}
