package defpackage;

import android.content.Context;
import com.huawei.wear.oversea.httputil.BasePassCardTask;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
public class xol extends BasePassCardTask<xom, xoi> {
    @Override // com.huawei.wear.oversea.httputil.BaseWalletTask
    public void makeResponseData(xnl xnlVar, JSONObject jSONObject) throws JSONException {
    }

    public xol(Context context, String str) {
        super(context, str);
    }

    @Override // com.huawei.wear.oversea.httputil.BaseWalletTask
    public String getTag() {
        return "ApplyForParticipationTask";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.wear.oversea.httputil.HttpConnTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String prepareRequestStr(xoi xoiVar) {
        if (xoiVar == null) {
            xnd.d("ApplyForParticipationTask", "prepareRequestStr, invalid param", false);
            return "";
        }
        JSONObject jSONObjectC = xpm.c(xoiVar.g(), "/api/v1/client/applyForParticipation", xoiVar.b());
        xnd.d("ApplyForParticipationTask", "srcTranID = " + xoiVar.g());
        return b(jSONObjectC, xoiVar).toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.wear.oversea.httputil.HttpConnTask
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public xom readErrorResponse(int i) {
        xnd.b("ApplyForParticipationTask", "readErrorResponse errorCode is " + i, false);
        xom xomVar = new xom();
        xomVar.f53201b = i;
        if (i == -1) {
            xomVar.f53201b = -1;
            return xomVar;
        }
        if (i == -3) {
            xomVar.f53201b = 1;
            return xomVar;
        }
        if (i == -2) {
            xomVar.f53201b = -2;
            return xomVar;
        }
        xnd.b("ApplyForParticipationTask", "readErrorResponse others " + i, false);
        return xomVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.wear.oversea.httputil.HttpConnTask
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public xom readSuccessResponse(String str) {
        xnd.d("ApplyForParticipationTask", "readSuccessResponse");
        xom xomVar = new xom();
        resolveResponse(xomVar, str);
        return xomVar;
    }

    private JSONObject b(JSONObject jSONObject, xoi xoiVar) {
        JSONObject jSONObject2;
        try {
            jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("header", jSONObject);
                jSONObject2.put("cplc", xoiVar.c());
                jSONObject2.put("deviceId", xoiVar.a());
                jSONObject2.put("deviceType", "UDID");
                return jSONObject2;
            } catch (JSONException unused) {
                xnd.d("ApplyForParticipationTask", " createDataStr parse json error:JSONException", true);
                return jSONObject2;
            }
        } catch (JSONException unused2) {
            jSONObject2 = null;
        }
    }
}
