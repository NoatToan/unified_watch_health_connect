package defpackage;

import com.google.gson.Gson;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ResultCallback;
import health.compact.a.GRSManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class wzj extends wzg<xcw> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f52616b;

    wzj() {
        super(xcw.class, "/dataOpen/wechat/supportedDevices");
        this.f52616b = 0;
    }

    public void b(final ICloudOperationResult<xcw> iCloudOperationResult) {
        if (this.f52616b == 1) {
            ReleaseLogUtil.d("HiH_SupportDeviceService", "retry requestSupportDevice");
        }
        oet.d().c(GRSManager.c(BaseApplication.getContext()).getUrl("healthCloudUrl") + this.urlPath, a(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1015)), ofe.c(createParams()), xcw.class, new ResultCallback<xcw>() { // from class: wzj.3
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(xcw xcwVar) {
                if (xcwVar == null) {
                    iCloudOperationResult.operationResult(null, "server error", false);
                    return;
                }
                int resultCode = xcwVar.getResultCode();
                ReleaseLogUtil.d("HiH_SupportDeviceService", "requestSupportDevice resultCode: ", Integer.valueOf(resultCode));
                if (resultCode == 0) {
                    String json = new Gson().toJson(xcwVar);
                    LogUtil.a("SupportDeviceService", "onSuccess:", json);
                    iCloudOperationResult.operationResult(xcwVar, json, true);
                    wzj.this.f52616b = 0;
                    return;
                }
                if ((resultCode == 1002 || resultCode == 1005) && wzj.this.f52616b < 1) {
                    ReleaseLogUtil.e("HiH_SupportDeviceService", "requestSupportDevice failed, at is expired, retry once again");
                    wzj.this.f52616b++;
                    wzj.this.b(iCloudOperationResult);
                    return;
                }
                ReleaseLogUtil.a("HiH_SupportDeviceService", "requestSupportDevice failed, resultCode: ", Integer.valueOf(resultCode));
                iCloudOperationResult.operationResult(null, "server error", false);
                wzj.this.f52616b = 0;
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.e("SupportDeviceService", "onFailure:", th.getMessage());
                if (th instanceof oeu) {
                    ReleaseLogUtil.a("HiH_SupportDeviceService", "requestSupportDevice responseCode: ", Integer.valueOf(((oeu) th).e()));
                    iCloudOperationResult.operationResult(null, "server error", false);
                } else {
                    iCloudOperationResult.operationResult(null, th.getMessage(), false);
                }
                wzj.this.f52616b = 0;
            }
        });
    }

    private Map<String, String> a(String str) {
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
