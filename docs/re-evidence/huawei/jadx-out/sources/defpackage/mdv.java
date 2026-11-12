package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.task.HttpConnTask;
import com.huawei.hwlogsmodel.LogUtil;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class mdv extends HttpConnTask<mdn, mdm> {
    public mdv(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.task.HttpConnTask
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public String prepareRequestString(mdm mdmVar) {
        if (mdmVar == null) {
            LogUtil.j("DeleteAppletTask", "prepareRequestString, request null");
            return null;
        }
        if (TextUtils.isEmpty(mdmVar.g()) || TextUtils.isEmpty(mdmVar.i())) {
            LogUtil.j("DeleteAppletTask", "prepareRequestString, invalid param");
            return null;
        }
        return mea.d(mdmVar.k(), mdmVar.m(), b(mea.a(mdmVar.l(), "delete.app", mdmVar.q()), mdmVar));
    }

    private static JSONObject b(JSONObject jSONObject, mdm mdmVar) {
        if (jSONObject == null) {
            LogUtil.j("DeleteAppletTask", "prepareRequestString, request null");
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("header", jSONObject);
            jSONObject2.put("issuerid", mdmVar.g());
            jSONObject2.put("cplc", mdmVar.f());
            jSONObject2.put("appletAid", mdmVar.i());
            jSONObject2.put("deviceModel", mdmVar.j());
            jSONObject2.put("seChipManuFacturer", mdmVar.n());
            if (!TextUtils.isEmpty(mdmVar.t())) {
                jSONObject2.put("userid", mdmVar.t());
            }
            if (!TextUtils.isEmpty(mdmVar.o())) {
                jSONObject2.put(CommonUtil.IMEI, mdmVar.o());
            }
            if (!TextUtils.isEmpty(mdmVar.e())) {
                jSONObject2.put("flag", mdmVar.e());
            }
            return jSONObject2;
        } catch (JSONException unused) {
            LogUtil.e("DeleteAppletTask", "createRequestString JSONException");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.task.HttpConnTask
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public mdn readErrorResponse(int i) {
        LogUtil.a("DeleteAppletTask", "readErrorResponse errorCode :", Integer.valueOf(i));
        mdn mdnVar = new mdn();
        mdnVar.b(i);
        return mdnVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.task.HttpConnTask
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public mdn readSuccessResponse(JSONObject jSONObject) {
        mdn mdnVar = new mdn();
        if (jSONObject == null) {
            LogUtil.j("DeleteAppletTask", "jsonObject is null");
            mdnVar.b(-1);
            return mdnVar;
        }
        try {
            if (jSONObject.has("returnCode")) {
                int iN = health.compact.a.CommonUtil.n(BaseApplication.getContext(), jSONObject.getString("returnCode"));
                mdnVar.b(iN);
                if (iN == 0) {
                    mdnVar.e(mea.b(jSONObject, "transactionid"));
                    if (jSONObject.has("nextStep")) {
                        mdnVar.b(mea.b(jSONObject, "nextStep"));
                    }
                    JSONArray jSONArray = jSONObject.has("apduList") ? jSONObject.getJSONArray("apduList") : null;
                    if (jSONArray != null) {
                        mdnVar.a(mdy.e(jSONArray));
                        return mdnVar;
                    }
                }
                return mdnVar;
            }
            mdnVar.b(-1);
            return mdnVar;
        } catch (JSONException unused) {
            LogUtil.e("DeleteAppletTask", "readSuccessResponse,JSONException");
            mdnVar.b(-1);
        }
    }
}
