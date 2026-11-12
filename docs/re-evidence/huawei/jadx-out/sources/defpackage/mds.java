package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.hiai.awareness.client.AwarenessRequest;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.task.HttpConnTask;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class mds extends HttpConnTask<mdo, mdd> {
    public mds(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.task.HttpConnTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String prepareRequestString(mdd mddVar) {
        if (mddVar == null) {
            LogUtil.j("ApplyApduTask", "prepareRequestString request is null");
            return null;
        }
        if (TextUtils.isEmpty(mddVar.g()) || TextUtils.isEmpty(mddVar.i())) {
            LogUtil.j("ApplyApduTask", "prepareRequestString invalid param");
            return null;
        }
        if (mddVar.b().isEmpty() || mddVar.c() != mddVar.b().size()) {
            LogUtil.j("ApplyApduTask", "prepareRequestString ApduList is null");
        }
        return mea.d(mddVar.k(), mddVar.m(), c(mea.a(mddVar.l(), "get.apdu", mddVar.q()), mddVar));
    }

    private static JSONObject c(JSONObject jSONObject, mdd mddVar) {
        if (jSONObject == null) {
            LogUtil.j("ApplyApduTask", "prepareRequestString headerObject is null");
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("header", jSONObject);
            jSONObject2.put("issuerid", mddVar.g());
            jSONObject2.put("appletAid", mddVar.i());
            jSONObject2.put("cplc", mddVar.f());
            jSONObject2.put("transactionid", mddVar.l());
            jSONObject2.put("apduCount", mddVar.c());
            jSONObject2.put("seChipManuFacturer", mddVar.n());
            jSONObject2.put("deviceModel", mddVar.j());
            jSONObject2.put("clientVersion", mddVar.h());
            if (!TextUtils.isEmpty(mddVar.e())) {
                jSONObject2.put("commandId", mddVar.e());
            }
            jSONObject2.put("apduList", c(mddVar.b()));
            if (!TextUtils.isEmpty(mddVar.o())) {
                jSONObject2.put(CommonUtil.IMEI, mddVar.o());
            }
            if (!TextUtils.isEmpty(mddVar.a())) {
                jSONObject2.put("partnerId", mddVar.a());
            }
            if (!TextUtils.isEmpty(mddVar.d())) {
                jSONObject2.put("currentStep", mddVar.d());
            }
            return jSONObject2;
        } catch (JSONException unused) {
            LogUtil.e("ApplyApduTask", "createRequestString JSONException");
            return null;
        }
    }

    public static JSONArray c(List<mdg> list) {
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    for (mdg mdgVar : list) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("apduNo", mdgVar.a());
                        jSONObject.put("apduContent", mdgVar.c());
                        if (!TextUtils.isEmpty(mdgVar.b())) {
                            jSONObject.put("apduStatus", mdgVar.b());
                        }
                        if (!TextUtils.isEmpty(mdgVar.e())) {
                            jSONObject.put(AwarenessRequest.Field.COMMAND, mdgVar.e());
                        }
                        if (!TextUtils.isEmpty(mdgVar.d())) {
                            jSONObject.put("checker", mdgVar.d());
                        }
                        jSONArray.put(jSONObject);
                    }
                }
            } catch (JSONException unused) {
                LogUtil.e("ApplyApduTask", "createRequestString JSONException");
            }
        }
        return jSONArray;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.task.HttpConnTask
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public mdo readErrorResponse(int i) {
        LogUtil.a("ApplyApduTask", "readErrorResponse errorCode", Integer.valueOf(i));
        mdo mdoVar = new mdo();
        mdoVar.b(i);
        return mdoVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.task.HttpConnTask
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public mdo readSuccessResponse(JSONObject jSONObject) {
        mdo mdoVar = new mdo();
        if (jSONObject == null) {
            LogUtil.j("ApplyApduTask", "object is null");
            mdoVar.b(-1);
            return mdoVar;
        }
        try {
            if (jSONObject.has("returnCode")) {
                int iN = health.compact.a.CommonUtil.n(BaseApplication.getContext(), jSONObject.getString("returnCode"));
                mdoVar.b(iN);
                if (iN == 0) {
                    if (jSONObject.has("transactionid")) {
                        mdoVar.e(mea.b(jSONObject, "transactionid"));
                    }
                    JSONArray jSONArray = jSONObject.has("apduList") ? jSONObject.getJSONArray("apduList") : null;
                    if (jSONArray != null) {
                        mdoVar.a(mdy.e(jSONArray));
                    }
                    if (jSONObject.has("nextStep")) {
                        mdoVar.a(mea.b(jSONObject, "nextStep"));
                        return mdoVar;
                    }
                }
                return mdoVar;
            }
            mdoVar.b(-1);
            return mdoVar;
        } catch (JSONException unused) {
            LogUtil.e("ApplyApduTask", "readSuccessResponse JSONException");
            mdoVar.b(-1);
        }
    }
}
