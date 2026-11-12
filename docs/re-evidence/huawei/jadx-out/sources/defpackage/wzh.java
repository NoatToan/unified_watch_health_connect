package defpackage;

import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ResultCallback;
import health.compact.a.GRSManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class wzh extends wzg<String> {
    private int e;

    public wzh() {
        super(String.class, "/dataOpen/wechat/bindDeviceTicket");
        this.e = 0;
    }

    public void e(final Map<String, String> map, final ICloudOperationResult<String> iCloudOperationResult) {
        if (this.e == 1) {
            ReleaseLogUtil.d("HiH_BindDeviceService", "retry bindDevice");
        }
        String str = GRSManager.c(BaseApplication.getContext()).getUrl("healthCloudUrl") + this.urlPath;
        Map<String, Object> mapA = a(map);
        LogUtil.d("BindDeviceService", "Req body = ", ofe.c(mapA));
        oet.d().c(str, c(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1015)), ofe.c(mapA), String.class, new ResultCallback<String>() { // from class: wzh.3
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(String str2) {
                LogUtil.a("BindDeviceService", "bindDevice onSuccess:", str2);
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    int iOptInt = jSONObject.optInt("resultCode", -1);
                    ReleaseLogUtil.d("BindDeviceService", "bindDevice resultCode:", Integer.valueOf(iOptInt));
                    if (iOptInt == 0) {
                        iCloudOperationResult.operationResult(str2, jSONObject.optString("ticket"), true);
                        wzh.this.e = 0;
                        return;
                    }
                    if ((iOptInt == 1002 || iOptInt == 1005) && wzh.this.e < 1) {
                        ReleaseLogUtil.e("HiH_BindDeviceService", "bindDevice failed, at is expired, retry once again");
                        wzh.this.e++;
                        wzh.this.e(map, iCloudOperationResult);
                        return;
                    }
                    if (iOptInt != 30005 && iOptInt != 112000000 && iOptInt != 112000090 && iOptInt != 1001) {
                        if (iOptInt != 9999 && iOptInt != 40060) {
                            iCloudOperationResult.operationResult(null, "server error", false);
                            wzh.this.e = 0;
                            return;
                        }
                        iCloudOperationResult.operationResult(null, "wechat error", false);
                        wzh.this.e = 0;
                        return;
                    }
                    iCloudOperationResult.operationResult(null, "bind device error", false);
                    wzh.this.e = 0;
                } catch (JSONException e) {
                    iCloudOperationResult.operationResult(null, e.getMessage(), false);
                    wzh.this.e = 0;
                }
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.e("BindDeviceService", "bindDevice onFailure:", th.getMessage());
                if (th instanceof oeu) {
                    ReleaseLogUtil.a("HiH_BindDeviceService", "bindDevice responseCode: ", Integer.valueOf(((oeu) th).e()));
                    iCloudOperationResult.operationResult(null, "server error", false);
                } else {
                    iCloudOperationResult.operationResult(null, th.getMessage(), false);
                }
                wzh.this.e = 0;
            }
        });
    }

    private Map<String, String> c(String str) {
        Map<String, String> mapCreateHeader = super.createHeader();
        mapCreateHeader.put("Cache-Control", " no-cache");
        mapCreateHeader.put("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + str);
        return mapCreateHeader;
    }

    private Map<String, Object> a(Map<String, String> map) {
        Map<String, Object> mapCreateParams = super.createParams();
        mapCreateParams.putAll(map);
        mapCreateParams.put("siteId", super.getParamSiteID());
        return mapCreateParams;
    }
}
