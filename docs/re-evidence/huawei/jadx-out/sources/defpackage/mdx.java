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
public class mdx extends HttpConnTask<mdq, mdj> {
    public mdx(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.task.HttpConnTask
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public String prepareRequestString(mdj mdjVar) {
        if (mdjVar == null) {
            LogUtil.j("DownloadInstallAppletTask", "prepareRequestString request null.");
            return null;
        }
        if (TextUtils.isEmpty(mdjVar.g()) || TextUtils.isEmpty(mdjVar.i())) {
            LogUtil.j("DownloadInstallAppletTask", "prepareRequestString invalid param.");
            return null;
        }
        return mea.d(mdjVar.k(), mdjVar.m(), d(mea.a(mdjVar.l(), "download.install.app", mdjVar.q()), mdjVar));
    }

    private static JSONObject d(JSONObject jSONObject, mdj mdjVar) {
        if (jSONObject == null) {
            LogUtil.j("DownloadInstallAppletTask", "createDataString invalid param.");
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("header", jSONObject);
            jSONObject2.put("issuerid", mdjVar.g());
            jSONObject2.put("userid", mdjVar.t());
            jSONObject2.put("cplc", mdjVar.f());
            jSONObject2.put("appletAid", mdjVar.i());
            jSONObject2.put("seChipManuFacturer", mdjVar.n());
            jSONObject2.put("deviceModel", mdjVar.j());
            jSONObject2.put("clientVersion", mdjVar.h());
            if (!TextUtils.isEmpty(mdjVar.t())) {
                jSONObject2.put("userid", mdjVar.t());
            }
            if (!TextUtils.isEmpty(mdjVar.o())) {
                jSONObject2.put(CommonUtil.IMEI, mdjVar.o());
            }
            if (!TextUtils.isEmpty(mdjVar.c())) {
                jSONObject2.put("onlyCap", mdjVar.c());
            }
            return jSONObject2;
        } catch (JSONException unused) {
            LogUtil.e("DownloadInstallAppletTask", "createRequestString JSONException");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.task.HttpConnTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public mdq readErrorResponse(int i) {
        LogUtil.a("DownloadInstallAppletTask", "readErrorResponse errorCode :", Integer.valueOf(i));
        mdq mdqVar = new mdq();
        mdqVar.b(i);
        return mdqVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.task.HttpConnTask
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public mdq readSuccessResponse(JSONObject jSONObject) {
        mdq mdqVar = new mdq();
        if (jSONObject == null) {
            LogUtil.j("DownloadInstallAppletTask", "dataObject is null.");
            mdqVar.b(-1);
            return mdqVar;
        }
        try {
            if (jSONObject.has("returnCode")) {
                int iN = health.compact.a.CommonUtil.n(BaseApplication.getContext(), jSONObject.getString("returnCode"));
                mdqVar.b(iN);
                if (iN == 0) {
                    mdqVar.e(mea.b(jSONObject, "transactionid"));
                    if (jSONObject.has("nextStep")) {
                        mdqVar.d(mea.b(jSONObject, "nextStep"));
                    }
                    JSONArray jSONArray = jSONObject.has("apduList") ? jSONObject.getJSONArray("apduList") : null;
                    if (jSONArray != null) {
                        mdqVar.a(mdy.e(jSONArray));
                        return mdqVar;
                    }
                }
                return mdqVar;
            }
            mdqVar.b(-1);
            return mdqVar;
        } catch (JSONException unused) {
            LogUtil.e("DownloadInstallAppletTask", "readSuccessResponse JSONException.");
            mdqVar.b(-1);
        }
    }
}
