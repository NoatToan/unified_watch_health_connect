package defpackage;

import android.content.Context;
import com.huawei.wear.oversea.impl.HttpConnTask;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class xop extends HttpConnTask<xns, xoc> {
    private static final String e = "GetPassTypeIdInfoTask";

    public xop(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.wear.oversea.impl.HttpConnTask
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String prepareRequestStr(xoc xocVar) {
        if (xocVar == null || xpi.d(xocVar.g(), true) || xpi.d(xocVar.j(), true) || xpi.d(xocVar.a(), true)) {
            xnd.a(e, "GetPassTypeIdInfoTask prepareRequestStr, invalid param");
            return null;
        }
        return xpn.a(xocVar.j(), xocVar.d(), xocVar.c(xpm.c(xocVar.g(), "query.pass.type", xocVar.b())), this.mContext);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.wear.oversea.impl.HttpConnTask
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public xns readErrorResponse(int i, String str) {
        xns xnsVar = new xns();
        xnsVar.f53201b = i;
        xnsVar.c(str);
        return xnsVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.wear.oversea.impl.HttpConnTask
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public xns readSuccessResponse(int i, String str, JSONObject jSONObject) {
        xns xnsVar = new xns();
        xnsVar.f53201b = i;
        xnsVar.c(str);
        if (i != 0) {
            setErrorInfo(jSONObject, xnsVar);
            return xnsVar;
        }
        if (jSONObject != null) {
            try {
                if (jSONObject.has("passTypeGroup")) {
                    xnsVar.e(jSONObject.getString("passTypeGroup"));
                }
                if (jSONObject.has("enableNFC")) {
                    xnsVar.a(jSONObject.getBoolean("enableNFC"));
                }
                if (jSONObject.has("reserve")) {
                    xnsVar.b(jSONObject.getString("reserve"));
                    return xnsVar;
                }
            } catch (JSONException unused) {
                xnsVar.f53201b = -99;
                xnd.a(e, "GetPassTypeIdInfoTask readSuccessResponse, JSONException");
            }
            return xnsVar;
        }
        xnsVar.f53201b = -99;
        return xnsVar;
    }
}
