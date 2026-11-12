package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.wear.oversea.httputil.HttpConnTask;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class xnm extends HttpConnTask<xng, xnf> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f53202b = "QueryOverSeaMangerTask";
    private static final Pattern e = Pattern.compile("(\\\\+/)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f53203c;

    public xnm(Context context, String str) {
        super(context, str);
        this.f53203c = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.wear.oversea.httputil.HttpConnTask
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public String prepareRequestStr(xnf xnfVar) {
        if (xnfVar == null || xpi.d(xnfVar.g(), true) || xpi.d(xnfVar.j(), true) || xnfVar.e().contains("Error")) {
            xnd.b(f53202b, "QueryOverSeaMangerTask prepareRequestStr, params invalid.", false);
            return " ";
        }
        String strG = xnfVar.g();
        this.f53203c = strG;
        JSONObject jSONObjectB = b(xpm.c(strG, "/api/v1/client/wearQueryHuaweiPayUsability", xnfVar.b()), xnfVar);
        xnd.e(f53202b, "QueryOverSeaMangerTask prepareRequestStr, commander= /api/v1/client/wearQueryHuaweiPayUsability reportRequestMessageJson= " + jSONObjectB);
        if (jSONObjectB != null) {
            return a(jSONObjectB.toString());
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.wear.oversea.httputil.HttpConnTask
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public xng readErrorResponse(int i) {
        String str = f53202b;
        xnd.b(str, " readErrorResponse  ", false);
        xng xngVar = new xng();
        xngVar.f53201b = i;
        xnd.d(str, "QueryOverSeaMangerTask readErrorResponse, returnCode = " + xngVar.f53201b);
        xnx.a(str + " readErrorResponse, commander= /api/v1/client/wearQueryHuaweiPayUsability,QueryOverSeaMangerTask, returnCode = " + xngVar.f53201b);
        return xngVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.wear.oversea.httputil.HttpConnTask
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public xng readSuccessResponse(String str) {
        String str2 = f53202b;
        xnd.b(str2, " readSuccessResponse  ", false);
        xng xngVar = new xng();
        a(xngVar, str);
        xnd.c(str2, " readSuccessResponse, commander= /api/v1/client/wearQueryHuaweiPayUsability,readSuccessResponse, returnCode = " + xngVar.f53201b + "response = " + str, false);
        return xngVar;
    }

    @Override // com.huawei.wear.oversea.httputil.HttpConnTask
    public void onReportEvent(String str, String str2, String str3, String str4, String str5, String str6) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "/api/v1/client/wearQueryHuaweiPayUsability";
        }
        if (TextUtils.isEmpty(str5)) {
            str5 = this.f53203c;
        }
        String str7 = "commander:" + str3 + "; srcTranID:" + str5 + ";  ; result:" + str + "; returnCode:" + str2 + "; ";
        xnd.c(f53202b, "HttpConnTask onReportEvent, action:" + str4 + ", Report data: " + str7, true);
        xnx.b(str4, str7 + " exception:" + str6);
    }

    private JSONObject b(JSONObject jSONObject, xnf xnfVar) {
        JSONObject jSONObject2 = null;
        if (jSONObject == null) {
            xnd.d(f53202b, " createDataStr, headerObject is null.", false);
            return null;
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("header", jSONObject);
                jSONObject3.put("romVersion", xnfVar.e());
                jSONObject3.put("wearClientVersion", xnfVar.h());
                jSONObject3.put("terminal", xnfVar.c());
                jSONObject3.put("location", xnfVar.a());
                return jSONObject3;
            } catch (JSONException unused) {
                jSONObject2 = jSONObject3;
                xnd.d(f53202b, " createDataStr parse json error:JSONException", false);
                return jSONObject2;
            }
        } catch (JSONException unused2) {
        }
    }

    private void a(xng xngVar, String str) {
        if (xpi.d(str, true)) {
            xnd.b(f53202b, "responseStr is null", false);
            xngVar.f53201b = 8;
            return;
        }
        try {
            String str2 = f53202b;
            xnd.c(str2, " resolveResponse  " + str, true);
            JSONObject jSONObject = new JSONObject(str);
            String strD = xpn.d(jSONObject, "returnCode");
            String strD2 = xpn.d(jSONObject, "errorCode");
            xpn.d(jSONObject, "errorMsg");
            if (strD2 != null) {
                xnd.b(str2, ", " + (" code:" + strD2), false);
                xngVar.f53201b = Integer.parseInt(strD2);
                return;
            }
            if (strD == null) {
                xnd.d(str2, "returnCode is invalid.", false);
                xngVar.f53201b = 8;
                return;
            }
            xngVar.f53201b = Integer.parseInt(strD);
            xnd.b(str2, " readSuccessResponse  " + xngVar.f53201b, false);
            String strD3 = xpn.d(jSONObject, "returnDesc");
            if (xngVar.f53201b != 0) {
                xngVar.f53201b = 8;
                xnd.d(str2, " returnDesc : returnCode " + (" code:" + xngVar.f53201b), false);
                return;
            }
            xnd.b(str2, " returnDesc  " + strD3, false);
            if (jSONObject.has("returnDesc")) {
                xngVar.d(strD3);
            }
            String strD4 = xpn.d(jSONObject, "result");
            String str3 = " result:" + xngVar.d;
            xnd.b(str2, " result  " + str3, false);
            if (jSONObject.has("result")) {
                xngVar.d(Integer.parseInt(strD4));
                xngVar.f53201b = Integer.parseInt(strD4);
                xnd.d(str2, "readSuccessResponse resultCode =" + str3);
            }
            if (xngVar.f53201b != 0) {
                xnd.b(str2, ", returnCode : " + (" code:" + xngVar.f53201b), false);
            }
        } catch (NoSuchMethodError unused) {
            xnd.d(f53202b, ", NoSuchMethodError : ", false);
            xngVar.f53201b = 8;
        } catch (NumberFormatException unused2) {
            xnd.d(f53202b, ", NumberFormatException : ", false);
            xngVar.f53201b = 8;
        } catch (JSONException unused3) {
            xnd.d(f53202b, ", JSONException : ", false);
            xngVar.f53201b = 8;
        }
    }

    private static String a(String str) {
        return e.matcher(str).replaceAll("/");
    }
}
