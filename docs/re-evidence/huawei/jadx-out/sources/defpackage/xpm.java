package defpackage;

import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.wear.oversea.httputil.BaseHttpParams;
import com.huawei.wear.oversea.overseamanger.OverSeaMangerUtil;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class xpm {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f53272c = "JSONHelper";

    public static JSONObject c(String str, String str2, boolean z) {
        if (str2 == null) {
            return null;
        }
        String str3 = f53272c;
        xnd.b(str3, "createHeaderStr commandStr : " + str2 + " srcTransID: " + str, false);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("srcTranID", str);
            if (z) {
                jSONObject.put("version", "1.0");
                int iL = OverSeaMangerUtil.a(xml.d()).b().l();
                xnd.b(str3, "getServerTokenType = " + iL, false);
                if (iL == 1) {
                    c(jSONObject, str2);
                } else if (iL == 2) {
                    d(jSONObject, str2);
                } else {
                    xnd.b(str3, "The value of AT or ST is null", false);
                }
            } else {
                jSONObject.put("version", "1.0");
            }
            jSONObject.put("ts", System.currentTimeMillis() / 1000);
            jSONObject.put("commander", str2);
            Locale locale = Locale.getDefault();
            jSONObject.put("language", locale.getLanguage() + Constants.LINK + locale.getCountry());
            return jSONObject;
        } catch (JSONException unused) {
            xnd.d(f53272c, "createHeaderObject, params invalid.", false);
            return null;
        }
    }

    public static void c(JSONObject jSONObject, String str) {
        JSONObject jSONObjectC = xpn.c(str);
        try {
            if (jSONObjectC == null) {
                jSONObject.put("serviceTokenAuth", BaseHttpParams.AUTH_SERVICE_TOKEN_ERROR);
            } else {
                jSONObject.put("serviceTokenAuth", jSONObjectC);
            }
        } catch (JSONException unused) {
            xnd.d(f53272c, "createHeaderObject, params invalid.", false);
        }
    }

    public static void d(JSONObject jSONObject, String str) {
        JSONObject jSONObjectE = xpn.e(str);
        try {
            if (jSONObjectE == null) {
                jSONObject.put("accessTokenAuth", BaseHttpParams.AUTH_SERVICE_TOKEN_ERROR);
            } else {
                jSONObject.put("accessTokenAuth", jSONObjectE);
            }
        } catch (JSONException unused) {
            xnd.d(f53272c, "createHeaderObject, params invalid.", false);
        }
    }
}
