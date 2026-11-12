package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.wear.oversea.impl.HttpConnTask;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class xok extends HttpConnTask<xnr, xnz> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f53242c = "CardStatusQueryTask";

    public xok(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.wear.oversea.impl.HttpConnTask
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public String prepareRequestStr(xnz xnzVar) {
        if (xnzVar == null || xpi.d(xnzVar.g(), true) || xpi.d(xnzVar.j(), true) || xpi.d(xnzVar.d, true)) {
            xnd.e(f53242c, "prepareRequestStr, params invalid.");
            return null;
        }
        return xpn.a(xnzVar.j(), xnzVar.d(), c(xpm.c(xnzVar.g(), "nfc.get.list.card", xnzVar.b()), xnzVar), this.mContext);
    }

    private JSONObject c(JSONObject jSONObject, xnz xnzVar) {
        if (jSONObject == null) {
            return null;
        }
        xnd.c(f53242c, "createDataStr headerStr : " + jSONObject.toString(), true);
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("header", jSONObject);
            if (!xpi.d(xnzVar.d, true)) {
                jSONObject2.put("cplc", xnzVar.d);
            }
            if (TextUtils.isEmpty(xnzVar.c())) {
                jSONObject2.put("flag", "21");
            } else {
                jSONObject2.put("flag", xnzVar.c());
            }
            if (!xpi.d(xnzVar.a(), true)) {
                jSONObject2.put("queryFlag", xnzVar.a());
            }
            if (!xpi.d(xnzVar.e(), true)) {
                jSONObject2.put("reserved", xnzVar.e());
            }
            return jSONObject2;
        } catch (JSONException unused) {
            xnd.a(f53242c, "createDataStr, params invalid.");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.wear.oversea.impl.HttpConnTask
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public xnr readErrorResponse(int i, String str) {
        xnr xnrVar = new xnr();
        xnrVar.f53201b = i;
        xnrVar.c(str);
        return xnrVar;
    }

    private xnj b(JSONObject jSONObject) {
        try {
            xnj xnjVar = new xnj();
            xnjVar.a(xpn.d(jSONObject, "issuerid"));
            return xnjVar;
        } catch (JSONException unused) {
            xnd.d(f53242c, "createCardItemFromJson JSONException : ", true);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.wear.oversea.impl.HttpConnTask
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public xnr readSuccessResponse(int i, String str, JSONObject jSONObject) {
        xnr xnrVar = new xnr();
        xnrVar.f53201b = i;
        if (i == 0 && jSONObject != null) {
            try {
                xnrVar.e(xpn.d(jSONObject, "devStatus"));
                xnrVar.e(xpn.b(jSONObject, "count"));
                xnrVar.b(xpn.d(jSONObject, "createtime"));
                if (jSONObject.has("inCloudCount")) {
                    xnrVar.c(xpn.b(jSONObject, "inCloudCount"));
                }
                xnj xnjVarB = null;
                JSONArray jSONArray = jSONObject.has("inCloudData") ? jSONObject.getJSONArray("inCloudData") : null;
                if (jSONArray != null) {
                    xnrVar.a(new ArrayList());
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        xnj xnjVarB2 = b(jSONArray.getJSONObject(i2));
                        if (xnjVarB2 != null) {
                            xnrVar.e().add(xnjVarB2);
                        }
                    }
                }
                JSONArray jSONArray2 = jSONObject.has("data") ? jSONObject.getJSONArray("data") : null;
                if (jSONArray2 != null) {
                    xnrVar.b(new ArrayList());
                    for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                        JSONObject jSONObject2 = jSONArray2.getJSONObject(i3);
                        String str2 = f53242c;
                        StringBuilder sb = new StringBuilder();
                        sb.append(" nfc.get.list.card ");
                        sb.append(jSONObject2 != null ? jSONObject2.toString() : "");
                        xnd.e(str2, sb.toString());
                        if (jSONObject2 != null) {
                            xnjVarB = b(jSONObject2);
                        }
                        if (xnjVarB != null) {
                            xnrVar.c().add(xnjVarB);
                        }
                    }
                }
            } catch (JSONException unused) {
                xnd.d(f53242c, "readSuccessResponse, JSONException : ", true);
                xnrVar.f53201b = -99;
            }
        }
        return xnrVar;
    }
}
