package defpackage;

import android.content.Context;
import com.huawei.wear.oversea.httputil.BasePassCardTask;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
public class xor extends BasePassCardTask<xon, xoo> {
    public xor(Context context, String str) {
        super(context, str);
    }

    @Override // com.huawei.wear.oversea.httputil.BaseWalletTask
    public void makeResponseData(xnl xnlVar, JSONObject jSONObject) throws JSONException {
        if (xnlVar instanceof xon) {
            xon xonVar = (xon) xnlVar;
            try {
                if (jSONObject.has("status")) {
                    xonVar.e(jSONObject.getString("status"));
                    return;
                }
                return;
            } catch (JSONException unused) {
                xnd.a("GetParticipationStatusTask", "readSuccessResponse, JSONException");
                xonVar.a(-99);
                return;
            }
        }
        xnd.d("GetParticipationStatusTask", "response instanceof GetParticipationStatusResponse is false", false);
    }

    @Override // com.huawei.wear.oversea.httputil.BaseWalletTask
    public String getTag() {
        return "GetParticipationStatusTask";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.wear.oversea.httputil.HttpConnTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String prepareRequestStr(xoo xooVar) {
        if (xooVar == null) {
            xnd.d("GetParticipationStatusTask", "prepareRequestStr, invalid param", false);
            return "";
        }
        JSONObject jSONObjectC = xpm.c(xooVar.g(), "/api/v1/client/getParticipationStatus", xooVar.b());
        xnd.d("GetParticipationStatusTask", "srcTranID = " + xooVar.g());
        return a(jSONObjectC, xooVar).toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.wear.oversea.httputil.HttpConnTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public xon readErrorResponse(int i) {
        xnd.b("GetParticipationStatusTask", "readErrorResponse errorCode is " + i, false);
        xon xonVar = new xon();
        xonVar.f53201b = i;
        if (i == -1) {
            xonVar.f53201b = -1;
            return xonVar;
        }
        if (i == -3) {
            xonVar.f53201b = 1;
            return xonVar;
        }
        if (i == -2) {
            xonVar.f53201b = -2;
            return xonVar;
        }
        xnd.b("GetParticipationStatusTask", "readErrorResponse others " + i, false);
        return xonVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.wear.oversea.httputil.HttpConnTask
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public xon readSuccessResponse(String str) {
        xon xonVar = new xon();
        resolveResponse(xonVar, str);
        return xonVar;
    }

    private JSONObject a(JSONObject jSONObject, xoo xooVar) {
        JSONObject jSONObject2;
        try {
            jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("header", jSONObject);
                jSONObject2.put("cplc", xooVar.a());
                jSONObject2.put("deviceId", xooVar.c());
                jSONObject2.put("deviceType", "UDID");
                return jSONObject2;
            } catch (JSONException unused) {
                xnd.d("GetParticipationStatusTask", " createDataStr parse json error:JSONException", true);
                return jSONObject2;
            }
        } catch (JSONException unused2) {
            jSONObject2 = null;
        }
    }
}
