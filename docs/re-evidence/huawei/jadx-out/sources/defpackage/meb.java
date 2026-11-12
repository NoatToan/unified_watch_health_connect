package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.m.s.e;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.task.HttpConnTask;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class meb extends HttpConnTask<mdr, mdk> {
    public meb(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.task.HttpConnTask
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String prepareRequestString(mdk mdkVar) {
        if (mdkVar == null) {
            LogUtil.j("PersonalizeAppletTask", "pwrepareRequestString, request null");
            return null;
        }
        if (TextUtils.isEmpty(mdkVar.g()) || TextUtils.isEmpty(mdkVar.i())) {
            LogUtil.j("PersonalizeAppletTask", "prepareRequestString, invalid param.");
            return null;
        }
        return mea.d(mdkVar.k(), mdkVar.m(), b(mea.a(mdkVar.l(), "pass.mod.param", mdkVar.q()), mdkVar));
    }

    private static JSONObject b(JSONObject jSONObject, mdk mdkVar) {
        if (jSONObject == null) {
            LogUtil.j("PersonalizeAppletTask", "createDataString invalid param");
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("header", jSONObject);
            jSONObject2.put("issuerid", mdkVar.g());
            jSONObject2.put("passTypeIdentifier", mdkVar.b());
            jSONObject2.put("cplc", mdkVar.f());
            jSONObject2.put("appletAid", mdkVar.i());
            jSONObject2.put(e.n, mdkVar.c());
            jSONObject2.put("deviceModel", mdkVar.j());
            return jSONObject2;
        } catch (JSONException unused) {
            LogUtil.e("PersonalizeAppletTask", "createDataString,JSONException");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.task.HttpConnTask
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public mdr readErrorResponse(int i) {
        LogUtil.a("PersonalizeAppletTask", "readErrorResponse errorCode:", Integer.valueOf(i));
        mdr mdrVar = new mdr();
        mdrVar.b(i);
        return mdrVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.task.HttpConnTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public mdr readSuccessResponse(JSONObject jSONObject) {
        mdr mdrVar = new mdr();
        if (jSONObject == null) {
            LogUtil.j("PersonalizeAppletTask", "dataObject is null");
            mdrVar.b(-1);
            return mdrVar;
        }
        try {
            if (jSONObject.has("returnCode")) {
                int iN = CommonUtil.n(BaseApplication.getContext(), jSONObject.getString("returnCode"));
                mdrVar.b(iN);
                if (iN == 0) {
                    mdrVar.e(mea.b(jSONObject, "transactionid"));
                    mdrVar.d(mea.b(jSONObject, "cardNo"));
                    int iA = mea.a(jSONObject, "invokeIntervalTime");
                    if (iA > 0) {
                        mdrVar.d(iA);
                    }
                    if (jSONObject.has("nextStep")) {
                        mdrVar.b(mea.b(jSONObject, "nextStep"));
                    }
                    JSONArray jSONArray = jSONObject.has("apduList") ? jSONObject.getJSONArray("apduList") : null;
                    if (jSONArray != null) {
                        mdrVar.a(mdy.e(jSONArray));
                        return mdrVar;
                    }
                }
                return mdrVar;
            }
            mdrVar.b(-1);
            return mdrVar;
        } catch (JSONException unused) {
            LogUtil.e("PersonalizeAppletTask", "readSuccessResponse,JSONException");
            mdrVar.b(-1);
        }
    }
}
