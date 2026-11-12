package defpackage;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.hms.framework.network.download.internal.constants.ExceptionCode;
import com.huawei.multisimsdk.multidevicemanager.common.AbsPrimaryDevice;
import com.huawei.multisimsdk.multidevicemanager.common.AuthParam;
import com.huawei.multisimsdk.multidevicemanager.util.ResponseHandler;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class odf {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f44187c = "AkaAuth";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Message f44188a;
    private final Context d;
    private final AuthParam e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ResponseHandler f44189b = new ResponseHandler() { // from class: odf.4
        @Override // com.huawei.multisimsdk.multidevicemanager.util.ResponseHandler
        public void onCallback(String str) {
            if (oco.c(str)) {
                odf.this.a(str);
                return;
            }
            if (odf.this.e == null) {
                return;
            }
            ocq.d(odf.f44187c, "AkaFirstAuthResult = " + str);
            ocq.e(odf.f44187c, "AkaFirstAuthResult response begin to parse");
            String strE = odf.this.e(str);
            if (TextUtils.isEmpty(strE)) {
                ocq.e(odf.f44187c, "entitleResponse.getEapAkaInfo() is null");
                oco.d(odf.this.f44188a, 1101);
                return;
            }
            ocq.d(odf.f44187c, "AkaFirstAuthResponsePayload =" + strE);
            String strB = new odk(odf.this.d, odf.this.e.getImsi()).b(strE, odf.this.e.getSlotId());
            ocq.d(odf.f44187c, "start second response payload = " + strB);
            if (TextUtils.isEmpty(strB)) {
                ocq.c(odf.f44187c, "fail to get second response payload.");
                oco.d(odf.this.f44188a, 1102);
                return;
            }
            String strB2 = oco.b(odf.this.d, odf.this.e.getImsi(), "cookie");
            ocq.d(odf.f44187c, "payload:" + strB + " cookie:" + strB2);
            odf.this.d(strB, strB2);
        }
    };
    private final ResponseHandler h = new ResponseHandler() { // from class: odf.3
        @Override // com.huawei.multisimsdk.multidevicemanager.util.ResponseHandler
        public void onCallback(String str) {
            odf.this.c(str);
            if (odf.this.e != null) {
                oco.e(odf.this.d, odf.this.e.getImsi(), "cookie");
            }
        }
    };

    public odf(Context context, AuthParam authParam, Message message) {
        this.d = context;
        this.f44188a = message;
        this.e = authParam;
    }

    public void c(AbsPrimaryDevice absPrimaryDevice) {
        String strA;
        if (this.e == null) {
            return;
        }
        String strC = oco.c("ODSA_ESURL", "");
        if (TextUtils.isEmpty(strC)) {
            ocq.c(f44187c, "get first aka url fail.");
            oco.d(this.f44188a, 1103);
            return;
        }
        if (oco.b("ODSA_SUPPORT_POST_METHOD", (Boolean) false).booleanValue()) {
            strA = b(absPrimaryDevice);
        } else {
            strA = a(absPrimaryDevice);
        }
        if (TextUtils.isEmpty(strA)) {
            ocq.c(f44187c, "get first aka param fail.");
            oco.d(this.f44188a, ExceptionCode.CHECK_FILE_HASH_FAILED);
        } else {
            ocp ocpVarD = ocp.d();
            oco.e(this.d, this.e.getImsi(), "cookie");
            ocpVarD.a(strC, strA, this.e.getImsi(), this.f44189b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(String str) {
        int iIndexOf = str.indexOf(":");
        int iLastIndexOf = str.lastIndexOf("\"");
        int i = iIndexOf + 2;
        if (iLastIndexOf <= i) {
            ocq.a(f44187c, "invalid response.");
            return null;
        }
        String strSubstring = str.substring(i, iLastIndexOf);
        ocq.a(f44187c, "get eap-relay-packet = " + strSubstring);
        return strSubstring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, String str2) {
        String strC = oco.c("ODSA_ESURL", "");
        if (TextUtils.isEmpty(strC)) {
            ocq.c(f44187c, "get second aka url fail.");
            oco.d(this.f44188a, 1103);
            return;
        }
        String strB = b(str);
        if (TextUtils.isEmpty(strB)) {
            ocq.c(f44187c, "get second aka param fail.");
            oco.d(this.f44188a, ExceptionCode.CHECK_FILE_HASH_FAILED);
        } else {
            ocp.d().d(strC, strB, str2, this.h);
        }
    }

    private String b(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("eap-relay-packet", str);
            return jSONObject.toString();
        } catch (JSONException unused) {
            ocq.c(f44187c, "generateJsonStr error");
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        String str2 = f44187c;
        ocq.d(str2, "aka second authentication response = " + str);
        if (oco.c(str)) {
            a(str);
            return;
        }
        int iLastIndexOf = str.lastIndexOf("&");
        String strSubstring = str.substring(iLastIndexOf + 1);
        if (iLastIndexOf >= 0) {
            str = str.substring(0, iLastIndexOf);
        }
        odw odwVar = new odw();
        if (strSubstring.contains("json")) {
            odwVar.e(str);
        } else {
            odwVar.d(str);
        }
        if (odwVar.e() != null) {
            ocq.d(str2, "AkaAuth token:" + odwVar.e().a());
            oed.c(odwVar.e().a());
            oco.d(this.f44188a, 1100);
            return;
        }
        ocq.e(str2, ".getTokenInfo()=null");
        oco.d(this.f44188a, 1111);
    }

    private String a(AbsPrimaryDevice absPrimaryDevice) {
        AuthParam authParam = this.e;
        if (authParam == null || absPrimaryDevice == null) {
            return "";
        }
        int slotId = authParam.getSlotId();
        String str = f44187c;
        ocq.a(str, "getFirstAkaRequestParam = " + slotId);
        String terminalId = absPrimaryDevice.getTerminalId();
        String strA = new odk(this.d, this.e.getImsi()).a(slotId);
        String strB = oco.b(this.d, this.e.getImsi(), "entitlement_version");
        if (TextUtils.isEmpty(strB)) {
            strB = "0";
        }
        StringBuilder sb = new StringBuilder("?terminal_id=");
        sb.append(terminalId);
        sb.append("&EAP_ID=");
        sb.append(strA);
        sb.append("&app=ap2006&vers=");
        sb.append(strB);
        sb.append("&app_name=Health&terminal_model=");
        sb.append(absPrimaryDevice.getTerminalModel());
        sb.append("&terminal_iccid=");
        sb.append(oco.e());
        sb.append("&terminal_vendor=");
        sb.append(absPrimaryDevice.getTerminalVendor());
        sb.append("&terminal_sw_version=");
        sb.append(absPrimaryDevice.getTerminalSwVersion());
        sb.append("&entitlement_version=");
        sb.append(oco.c("ODSA_ES_VERSION", "1.0"));
        if (oco.b("ODSA_SUPPORT_NOTIFICATION_SERVICE", (Boolean) true).booleanValue()) {
            String strB2 = oco.b(this.d, this.e.getImsi(), "notif_token");
            sb.append("&notif_token=");
            sb.append(strB2);
            sb.append("&notif_action=1");
        }
        ocq.e(str, "getFirstAkaRequestParam slot:" + slotId);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        String str2 = f44187c;
        ocq.e(str2, "AkaAuthFailCode =" + str);
        try {
            int i = Integer.parseInt(str);
            if (i == 403) {
                ocq.e(str2, "Response result is 403 Forbidden");
            } else if (i == 409) {
                ocq.e(str2, "Response result is 409 Conflict a duplicate value was provided for the friendly_device_name");
            } else if (i == 500) {
                ocq.e(str2, "Response result is 500 Internal Server error");
            } else if (i == 503) {
                ocq.e(str2, "Response result is 503 Retry after / Service Unavailable");
            } else if (i == 511) {
                ocq.e(str2, "Response result is 511 Network Authentication Required");
            } else if (i == 1112) {
                ocq.e(str2, "x509 error.");
            } else if (i == 1113) {
                ocq.e(str2, "Net is error");
            } else {
                ocq.e(str2, "undefine error. resultCode = " + i);
            }
            ocq.e(str2, "AKA Auth Fail.");
            oco.d(this.f44188a, i);
        } catch (NumberFormatException unused) {
            ocq.e(f44187c, "Response result code error");
            oco.d(this.f44188a, ExceptionCode.FILE_IO_EXCEPTION);
        }
    }

    private String b(AbsPrimaryDevice absPrimaryDevice) {
        AuthParam authParam = this.e;
        if (authParam == null || absPrimaryDevice == null) {
            return "";
        }
        int slotId = authParam.getSlotId();
        ocq.a(f44187c, "getFirstAkaPostRequestParam = " + slotId);
        String terminalId = absPrimaryDevice.getTerminalId();
        String strA = new odk(this.d, this.e.getImsi()).a(slotId);
        String strB = oco.b(this.d, this.e.getImsi(), "entitlement_version");
        if (TextUtils.isEmpty(strB)) {
            strB = "0";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("terminal_id", terminalId);
            jSONObject.put("EAP_ID", strA);
            jSONObject.put("app", "ap2006");
            jSONObject.put("vers", strB);
            jSONObject.put("terminal_iccid", oco.e());
            jSONObject.put("app_name", "Health");
            jSONObject.put("terminal_model", absPrimaryDevice.getTerminalModel());
            jSONObject.put("terminal_vendor", absPrimaryDevice.getTerminalVendor());
            jSONObject.put("terminal_sw_version", absPrimaryDevice.getTerminalSwVersion());
            jSONObject.put("entitlement_version", oco.c("ODSA_ES_VERSION", "1.0"));
            if (oco.b("ODSA_SUPPORT_NOTIFICATION_SERVICE", (Boolean) true).booleanValue()) {
                jSONObject.put("notif_token", oco.b(this.d, this.e.getImsi(), "notif_token"));
                jSONObject.put("notif_action", 1);
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            ocq.c(f44187c, "generateJsonStr error");
            return "";
        }
    }
}
