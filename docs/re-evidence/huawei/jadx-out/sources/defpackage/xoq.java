package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.huawei.wear.oversea.httputil.HttpConnTask;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class xoq extends HttpConnTask<xnp, xog> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f53244b;

    public xoq(Context context, String str) {
        super(context, str);
        this.f53244b = "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.wear.oversea.httputil.HttpConnTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String prepareRequestStr(xog xogVar) {
        if (xogVar == null || xpi.d(xogVar.c(), true) || xpi.d(xogVar.a(), true)) {
            xnd.c("QuerySupportBusinessTask", " prepareRequestStr, params invalid.", false);
            xnx.a("QuerySupportBusinessTask prepareRequestStr, commander= nfc.get.support.business ,prepareRequestStr, params invalid. ");
            return null;
        }
        this.f53244b = xogVar.g();
        return xpn.a(xogVar.j(), xogVar.d(), c(xpm.c(xogVar.g(), "nfc.get.support.business", xogVar.b()), xogVar), this.mContext);
    }

    private JSONObject c(JSONObject jSONObject, xog xogVar) {
        JSONObject jSONObject2 = null;
        if (jSONObject == null) {
            xnd.b("QuerySupportBusinessTask", " createDataStr, headerObject is null.", false);
            return null;
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("header", jSONObject);
                if (!xpi.d(xogVar.c(), true)) {
                    jSONObject3.put("location", xogVar.c());
                }
                if (!xpi.d(xogVar.a(), true)) {
                    jSONObject3.put("terminal", xogVar.a());
                }
                return jSONObject3;
            } catch (JSONException unused) {
                jSONObject2 = jSONObject3;
                xnd.b("QuerySupportBusinessTask", " createDataStr parse json error", false);
                return jSONObject2;
            }
        } catch (JSONException unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.wear.oversea.httputil.HttpConnTask
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public xnp readErrorResponse(int i) {
        xnp xnpVar = new xnp();
        xnpVar.f53201b = i;
        if (-1 == i) {
            xnpVar.f53201b = -1;
        } else if (-3 == i) {
            xnpVar.f53201b = 1;
        } else if (-2 == i) {
            xnpVar.f53201b = -2;
        }
        xnd.b("QuerySupportBusinessTask", "querySupportBusiness, returnCode = " + xnpVar.f53201b, false);
        xnx.a("QuerySupportBusinessTask readErrorResponse, commander= nfc.get.support.business,querySupportBusiness, returnCode = " + xnpVar.f53201b);
        return xnpVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.wear.oversea.httputil.HttpConnTask
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public xnp readSuccessResponse(String str) {
        JSONObject jSONObject;
        String str2;
        String strD;
        int i;
        xnd.b("QuerySupportBusinessTask", " readSuccessResponse  ", false);
        int i2 = -99;
        if (str == null) {
            onReportEvent("Error with unknown", String.valueOf(-99), "nfc.get.support.business", this.receiveMsg, this.f53244b, "");
            return b(-99, null, null);
        }
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            int iB = xpn.b(jSONObject2, "keyIndex");
            String strD2 = xpn.d(jSONObject2, "errorCode");
            String strD3 = xpn.d(jSONObject2, "errorMsg");
            String strD4 = xpn.d(jSONObject2, "response");
            if (strD2 != null) {
                xnd.e("QuerySupportBusinessTask", "handleResponse, return code : " + strD2 + ", return msg : " + strD3, false);
                int i3 = Integer.parseInt(strD2);
                onReportEvent("handleResponse, return code : " + strD2 + ", return msg : " + strD3, strD2, "nfc.get.support.business", this.receiveMsg, this.f53244b, "");
                return b(i3, strD3, null);
            }
            if (-1 == iB && !xpi.d(strD4, true)) {
                xnd.b("QuerySupportBusinessTask", "handleResponse, responseDataStr : " + strD4, true);
                jSONObject = new JSONObject(strD4);
                try {
                    try {
                        String strD5 = xpn.d(jSONObject, "returnCode");
                        if (strD5 == null) {
                            xnd.e("QuerySupportBusinessTask", "handleResponse, returnCode is invalid.", false);
                            onReportEvent("handleResponse, returnCode is invalid.", String.valueOf(-99), "nfc.get.support.business", this.receiveMsg, this.f53244b, "");
                            return b(-99, "handleResponse, returnCode is invalid.", null);
                        }
                        if (a(strD5)) {
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
                        strD = xpn.d(jSONObject, "returnDesc");
                        onReportEvent(strD, String.valueOf(i), "nfc.get.support.business", this.receiveMsg, this.f53244b, "");
                        i2 = i;
                        return b(i2, strD, jSONObject);
                    } catch (NumberFormatException e) {
                        e = e;
                        xnd.e("QuerySupportBusinessTask", "readSuccessResponse, NumberFormatException : ", true);
                        str2 = ((String) null) + "readSuccessResponse, NumberFormatException error ";
                        onReportEvent("readSuccessResponse, NumberFormatException error ", String.valueOf(-99), "nfc.get.support.business", this.receiveMsg, this.f53244b, !TextUtils.isEmpty(e.getMessage()) ? e.getMessage() : "");
                        strD = str2;
                    }
                } catch (JSONException e2) {
                    e = e2;
                    xnd.e("QuerySupportBusinessTask", "readSuccessResponse, JSONException : ", true);
                    str2 = ((String) null) + "readSuccessResponse, JSONException error ";
                    onReportEvent("readSuccessResponse, JSONException error ", String.valueOf(-99), "nfc.get.support.business", this.receiveMsg, this.f53244b, !TextUtils.isEmpty(e.getMessage()) ? e.getMessage() : "");
                    strD = str2;
                }
            }
            xnd.e("QuerySupportBusinessTask", "handleResponse, unexpected error from server.", false);
            onReportEvent("handleResponse, unexpected error from server.", String.valueOf(-99), "nfc.get.support.business", this.receiveMsg, this.f53244b, "");
            return b(-99, "handleResponse, unexpected error from server.", null);
        } catch (NumberFormatException e3) {
            e = e3;
            jSONObject = null;
        } catch (JSONException e4) {
            e = e4;
            jSONObject = null;
        }
    }

    private xnp b(int i, String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        xnd.d("QuerySupportBusinessTask", "QuerySupportedCardListByTerminalTask readSuccessResponse, srcTransactionID= " + this.f53244b + " returnCode= " + i);
        StringBuilder sb = new StringBuilder();
        xnp xnpVar = new xnp();
        xnpVar.f53201b = i;
        xnpVar.a((String) null);
        if (jSONObject != null) {
            try {
                if (jSONObject.has("header") && (jSONObject2 = jSONObject.getJSONObject("header")) != null) {
                    String string = jSONObject2.getString("srcTranID");
                    sb.append("srcTranId=");
                    sb.append(string);
                }
            } catch (JSONException unused) {
                xnd.d("QuerySupportBusinessTask", "QuerySupportedCardListByTerminalTask readSuccessResponse, JSONException");
            }
        }
        if (i == 0) {
            try {
                if (!xpi.d(xpn.d(jSONObject, "serviceList"), false)) {
                    xnpVar.a(xpn.d(jSONObject, "serviceList"));
                }
            } catch (JSONException unused2) {
                xnd.b("QuerySupportBusinessTask", "readSuccessResponse, JSONException : ", true);
                xnpVar.f53201b = -99;
            }
        }
        if (!xni.d()) {
            xnd.d("QuerySupportBusinessTask", "QuerySupportBusinessTask readSuccessResponse, commander= nfc.get.support.business returnCode= " + i + " returnDesc= " + str + " dataObject: " + sb.toString());
        }
        return xnpVar;
    }

    public boolean a(String str) {
        if (str == null || "".equals(str)) {
            return false;
        }
        try {
            long j = Long.parseLong(str);
            return j <= 2147483647L && j >= -2147483648L;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    @Override // com.huawei.wear.oversea.httputil.HttpConnTask
    public void onReportEvent(String str, String str2, String str3, String str4, String str5, String str6) {
        String str7 = "commander:" + str3 + "; srcTranID:" + str5 + ";  ; result:" + str + "; returnCode:" + str2 + "; ";
        xnd.b("QuerySupportBusinessTask", "HttpConnTask onReportEvent, action:" + str4 + ", Report data: " + str7, false);
        xnx.b(str4, str7 + " exception:" + str6);
    }
}
