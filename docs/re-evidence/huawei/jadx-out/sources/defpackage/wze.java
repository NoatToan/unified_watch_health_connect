package defpackage;

import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ResultCallback;
import health.compact.a.GRSManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class wze extends wzg<Boolean> {
    public wze() {
        super(Boolean.class, "/dataOpen/wechat/hasBoundDevices");
    }

    public void b(final ICloudOperationResult<Boolean> iCloudOperationResult) {
        oet.d().c(GRSManager.c(BaseApplication.getContext()).getUrl("healthCloudUrl") + this.urlPath, c(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1015)), ofe.c(createParams()), String.class, new ResultCallback<String>(this) { // from class: wze.4
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(String str) {
                LogUtil.a("CheckBoundDeviceService", "checkBoundDevice onSuccess:", str);
                try {
                    iCloudOperationResult.operationResult(Boolean.valueOf(new JSONObject(str).optBoolean("result")), str, true);
                } catch (JSONException e) {
                    iCloudOperationResult.operationResult(false, e.getMessage(), false);
                }
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.e("CheckBoundDeviceService", "checkBoundDevice onFailure:", th.getMessage());
                iCloudOperationResult.operationResult(null, th.getMessage(), false);
            }
        });
    }

    private Map<String, String> c(String str) {
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
