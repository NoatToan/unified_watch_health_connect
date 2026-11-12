package defpackage;

import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ResultCallback;
import health.compact.a.GRSManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class wzr extends wzg<String> {
    public wzr() {
        super(String.class, "/dataOpen/wechat/supportedProductIds");
    }

    public void c(final ICloudOperationResult<List<String>> iCloudOperationResult) {
        oet.d().c(GRSManager.c(BaseApplication.getContext()).getUrl("healthCloudUrl") + this.urlPath, d(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1015)), ofe.c(createParams()), String.class, new ResultCallback<String>() { // from class: wzr.2
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(String str) {
                LogUtil.a("SupportedProductIdsService", "onSuccess:", "resp=" + str);
                iCloudOperationResult.operationResult(wzr.this.c(str), str, true);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.e("SupportedProductIdsService", "onFailure:", th.getMessage());
                iCloudOperationResult.operationResult(null, th.getMessage(), false);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<String> c(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("wiseDeviceProdIds");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i));
                }
            }
            return arrayList;
        } catch (JSONException e) {
            LogUtil.e("SupportedProductIdsService", "parseProductIds exception", e.getMessage());
            return arrayList;
        }
    }

    private Map<String, String> d(String str) {
        Map<String, String> mapCreateHeader = super.createHeader();
        mapCreateHeader.put("Cache-Control", " no-cache");
        mapCreateHeader.put("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + str);
        return mapCreateHeader;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wzg
    public Map<String, Object> createParams() {
        Map<String, Object> mapCreateParams = super.createParams();
        mapCreateParams.put("siteId", super.getParamSiteID());
        return mapCreateParams;
    }
}
