package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.huawei.wear.oversea.httputil.HttpConnTask;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class xpu extends HttpConnTask<xnq, xod> {
    private static final String e = "QuerySupportedCardListByTerminalTask";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f53277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f53278b;

    public xpu(Context context, String str) {
        super(context, str);
        this.f53278b = "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.wear.oversea.httputil.HttpConnTask
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public String prepareRequestStr(xod xodVar) {
        if (xodVar != null) {
            if (!xpi.d(xodVar.g(), true) && !xpi.d(xodVar.j(), true) && b(xodVar)) {
                this.f53278b = xodVar.g();
                JSONObject jSONObjectD = d(xpm.c(xodVar.g(), "query.rule.issuer", xpi.d(xodVar.a(), true) ? xodVar.b() : true), xodVar);
                JSONObject jSONObjectD2 = d(xodVar);
                if (!xni.d()) {
                    xnd.d(e, "QuerySupportedCardListByTerminalTask prepareRequestStr, commander= query.rule.issuer reportRequestMessageJson= " + jSONObjectD2);
                }
                return xpn.a(xodVar.j(), xodVar.d(), jSONObjectD, this.mContext);
            }
        }
        xnd.d(e, "QuerySupportedCardListByTerminalTask prepareRequestStr, params invalid.");
        return null;
    }

    private JSONObject d(xod xodVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("srcTransactionID", xodVar.g());
            jSONObject.put("timestamp", xodVar.o());
            jSONObject.put("romVersion", xodVar.f());
            jSONObject.put("clientVersion", xodVar.n());
            jSONObject.put("terminal", xodVar.l());
            jSONObject.put("flag", xodVar.h());
            if (!xpi.d(xodVar.a(), true)) {
                jSONObject.put("appVersion", xodVar.a());
            }
            jSONObject.put("countryCode", xodVar.e());
            jSONObject.put("appId", xodVar.c());
            return jSONObject;
        } catch (JSONException unused) {
            xnd.d(e, "QuerySupportedCardListByTerminalTask reportRequestMessage parse json error", true);
            return null;
        }
    }

    private JSONObject d(JSONObject jSONObject, xod xodVar) {
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("header", jSONObject);
            jSONObject2.put("timestamp", xodVar.o());
            jSONObject2.put("romVersion", xodVar.f());
            jSONObject2.put("clientVersion", xodVar.n());
            jSONObject2.put("terminal", xodVar.l());
            jSONObject2.put("sn", xodVar.i());
            jSONObject2.put("flag", xodVar.h());
            if (!xpi.d(xodVar.a(), true)) {
                jSONObject2.put("appVersion", xodVar.a());
            }
            jSONObject2.put("countryCode", xodVar.e());
            jSONObject2.put("appId", xodVar.c());
            return jSONObject2;
        } catch (JSONException unused) {
            xnd.d(e, "QuerySupportedCardListByTerminalTask createDataStr parse json error", true);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.wear.oversea.httputil.HttpConnTask
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public xnq readErrorResponse(int i) {
        xnq xnqVar = new xnq();
        xnqVar.f53201b = i;
        xnqVar.c(i + "");
        xnd.d(e, "QuerySupportedCardListByTerminalTask readErrorResponse, srcTransactionID= " + this.f53278b + " errorCode= " + i);
        xnx.a("QuerySupportedCardListByTerminalTask readErrorResponse, commander= query.rule.issuer errorCode= " + i + " errorMessage= " + i);
        return xnqVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.wear.oversea.httputil.HttpConnTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public xnq readSuccessResponse(String str) {
        JSONObject jSONObject;
        String str2;
        String strD;
        int i;
        int i2 = -99;
        if (str == null) {
            onReportEvent("Error with unknown", String.valueOf(-99), "query.rule.issuer", this.receiveMsg, this.f53278b, "");
            this.f53277a = "21";
            return d(-99, null, null);
        }
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            int iB = xpn.b(jSONObject2, "keyIndex");
            String strD2 = xpn.d(jSONObject2, "errorCode");
            String strD3 = xpn.d(jSONObject2, "errorMsg");
            String strD4 = xpn.d(jSONObject2, "response");
            if (strD2 != null) {
                xnd.e(e, "handleResponse, return code : " + strD2, false);
                int i3 = Integer.parseInt(strD2);
                onReportEvent("handleResponse, return code : " + strD2 + ", return msg : " + strD3, strD2, "query.rule.issuer", this.receiveMsg, this.f53278b, "");
                this.f53277a = "23";
                return d(i3, strD3, null);
            }
            if (-1 == iB && !xpi.d(strD4, true)) {
                String str3 = e;
                xnd.c(str3, "handleResponse, responseDataStr : " + strD4, true);
                jSONObject = new JSONObject(strD4);
                try {
                    try {
                        String strD5 = xpn.d(jSONObject, "returnCode");
                        if (strD5 == null) {
                            xnd.c(str3, "handleResponse, returnCode is invalid.", false);
                            onReportEvent("handleResponse, returnCode is invalid.", String.valueOf(-99), "query.rule.issuer", this.receiveMsg, this.f53278b, "");
                            this.f53277a = "22";
                            return d(-99, "handleResponse, returnCode is invalid.", null);
                        }
                        if (c(strD5)) {
                            i = Integer.parseInt(strD5);
                        } else {
                            try {
                                if (xpi.d(strD5)) {
                                    if (strD5.startsWith("0X") || strD5.startsWith("0x")) {
                                        strD5 = strD5.substring(2, strD5.length());
                                    }
                                    i = Integer.parseInt(strD5, 16);
                                } else if (strD5.startsWith(ExifInterface.GPS_DIRECTION_TRUE)) {
                                    i = Integer.parseInt(strD5.substring(1, strD5.length()));
                                } else {
                                    i = -98;
                                }
                            } catch (NumberFormatException unused) {
                            }
                        }
                        this.f53277a = "24";
                        strD = xpn.d(jSONObject, "returnDesc");
                        onReportEvent(strD, String.valueOf(i), "query.rule.issuer", this.receiveMsg, this.f53278b, "");
                        i2 = i;
                        return d(i2, strD, jSONObject);
                    } catch (JSONException e2) {
                        e = e2;
                        xnd.d(e, "readSuccessResponse, JSONException : ", true);
                        str2 = ((String) null) + "readSuccessResponse, JSONException error ";
                        this.f53277a = "22";
                        onReportEvent("readSuccessResponse, JSONException error ", String.valueOf(-99), "query.rule.issuer", this.receiveMsg, this.f53278b, !TextUtils.isEmpty(e.getMessage()) ? e.getMessage() : "");
                        strD = str2;
                    }
                } catch (NumberFormatException e3) {
                    e = e3;
                    xnd.d(e, "readSuccessResponse, NumberFormatException : ", true);
                    str2 = ((String) null) + "readSuccessResponse, NumberFormatException error ";
                    this.f53277a = "22";
                    onReportEvent("readSuccessResponse, NumberFormatException error ", String.valueOf(-99), "query.rule.issuer", this.receiveMsg, this.f53278b, !TextUtils.isEmpty(e.getMessage()) ? e.getMessage() : "");
                    strD = str2;
                }
            }
            xnd.c(e, "handleResponse, unexpected error from server.", false);
            onReportEvent("handleResponse, unexpected error from server.", String.valueOf(-99), "query.rule.issuer", this.receiveMsg, this.f53278b, "");
            this.f53277a = "22";
            return d(-99, "handleResponse, unexpected error from server.", null);
        } catch (NumberFormatException e4) {
            e = e4;
            jSONObject = null;
        } catch (JSONException e5) {
            e = e5;
            jSONObject = null;
        }
    }

    public boolean c(String str) {
        if (str == null || "".equals(str)) {
            return false;
        }
        try {
            long j = Long.parseLong(str);
            Long lValueOf = Long.valueOf(j);
            lValueOf.getClass();
            if (j > 2147483647L) {
                return false;
            }
            lValueOf.getClass();
            return j >= -2147483648L;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    @Override // com.huawei.wear.oversea.httputil.HttpConnTask
    public void onReportEvent(String str, String str2, String str3, String str4, String str5, String str6) {
        String str7 = "commander:" + str3 + "; srcTranID:" + str5 + ";  ; result:" + str + "; returnCode:" + str2 + "; ";
        xnd.b(e, "HttpConnTask onReportEvent, action:" + str4 + ", Report data: " + str7, false);
        xnx.b(str4, str7 + " exception:" + str6);
    }

    private xnq d(int i, String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        xnd.d(e, "QuerySupportedCardListByTerminalTask readSuccessResponse, srcTransactionID= " + this.f53278b + " returnCode= " + i);
        StringBuilder sb = new StringBuilder();
        xnq xnqVar = new xnq();
        xnqVar.f53201b = i;
        xnqVar.f53208c = null;
        xnqVar.d = null;
        if (jSONObject != null) {
            try {
                if (jSONObject.has("header") && (jSONObject2 = jSONObject.getJSONObject("header")) != null) {
                    String string = jSONObject2.getString("srcTranID");
                    sb.append("srcTranId=");
                    sb.append(string);
                }
            } catch (JSONException unused) {
                xnd.a(e, "QuerySupportedCardListByTerminalTask readSuccessResponse, JSONException");
            }
        }
        if (i == 0) {
            try {
                String strD = xpn.d(jSONObject, "issuers");
                String strD2 = xpn.d(jSONObject, "issuersAndFlag");
                xnqVar.f53208c = strD;
                xnqVar.d = strD2;
                sb.append(" issuers=");
                sb.append(xpn.d(jSONObject, "issuers"));
                sb.append(" issuersAndFlag=");
                sb.append(xpn.d(jSONObject, "issuersAndFlag"));
            } catch (JSONException unused2) {
                xnd.d(e, "readSuccessResponse, JSONException : ", true);
                xnqVar.f53201b = -99;
            }
        }
        if (!xni.d()) {
            xnd.d(e, "QuerySupportedCardListByTerminalTask readSuccessResponse, commander= query.rule.issuer returnCode= " + i + " returnDesc= " + str + " dataObject: " + sb.toString());
        }
        return xnqVar;
    }

    private boolean b(xod xodVar) {
        if (!TextUtils.isEmpty(xodVar.l())) {
            return true;
        }
        xnd.d(e, "isReqValid terminal is empty");
        return false;
    }
}
