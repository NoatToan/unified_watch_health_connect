package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.task.HttpConnTask;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class mdz extends HttpConnTask<mdu, mdi> {
    public mdz(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.task.HttpConnTask
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String prepareRequestString(mdi mdiVar) {
        if (mdiVar == null) {
            LogUtil.j("TsmParamQueryTask", "prepareRequestString, request null");
            return null;
        }
        return mea.d(mdiVar.k(), mdiVar.m(), e(mea.a(mdiVar.l(), "nfc.get.NotifyInfoInit", mdiVar.q()), mdiVar));
    }

    private static JSONObject e(JSONObject jSONObject, mdi mdiVar) {
        if (jSONObject == null) {
            LogUtil.j("TsmParamQueryTask", "createDataString headerObject is null");
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("header", jSONObject);
            jSONObject2.put("cplc", mdiVar.f());
            jSONObject2.put("terminal", mdiVar.j());
            jSONObject2.put("tsmChannel", 0);
            return jSONObject2;
        } catch (JSONException unused) {
            LogUtil.e("TsmParamQueryTask", "createDataString, params invalid.");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.task.HttpConnTask
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public mdu readErrorResponse(int i) {
        mdu mduVar = new mdu();
        mduVar.b(i);
        return mduVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.task.HttpConnTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public mdu readSuccessResponse(JSONObject jSONObject) {
        mdu mduVar = new mdu();
        if (jSONObject == null) {
            LogUtil.j("TsmParamQueryTask", "dataObject is null");
            mduVar.b(-1);
            return mduVar;
        }
        try {
            if (jSONObject.has("returnCode")) {
                int iN = CommonUtil.n(BaseApplication.getContext(), jSONObject.getString("returnCode"));
                mduVar.b(iN);
                if (iN == 0) {
                    mduVar.e(mea.b(jSONObject, "transactionid"));
                    String strB = jSONObject.has("funcID") ? mea.b(jSONObject, "funcID") : null;
                    String strB2 = jSONObject.has("servicID") ? mea.b(jSONObject, "servicID") : null;
                    if (!TextUtils.isEmpty(strB) && !TextUtils.isEmpty(strB2)) {
                        mduVar.a(strB);
                        mduVar.d(strB2);
                        return mduVar;
                    }
                    LogUtil.j("readSuccessResponse, illegal funcId or servicId", new Object[0]);
                    mduVar.b(-1);
                    return mduVar;
                }
                return mduVar;
            }
            mduVar.b(-1);
            return mduVar;
        } catch (JSONException unused) {
            LogUtil.e("TsmParamQueryTask", "readSuccessResponse,JSONException");
            mduVar.b(-1);
        }
    }
}
