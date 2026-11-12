package defpackage;

import com.google.gson.Gson;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import health.compact.a.GRSManager;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class wzb<T> extends wzg<T> {
    public wzb(Class<T> cls, String str) {
        super(cls, str);
    }

    public void b(Map<String, Object> map, final ICloudOperationResult<T> iCloudOperationResult) {
        LogUtil.a("AuthorizeService", "enter getAuthorizeToken()");
        oet.d().c(GRSManager.c(BaseApplication.getContext()).getUrl("healthCloudUrl") + this.urlPath, createHeader(), ofe.c(addCommonParams(map)), this.clazz, new ResultCallback<T>(this) { // from class: wzb.2
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(T t) {
                String json = new Gson().toJson(t);
                LogUtil.a("AuthorizeService", "getAuthorizeToken result:", json);
                iCloudOperationResult.operationResult(t, json, true);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.e("AuthorizeService", "getAuthorizeToken onFailure:", th.getMessage());
                iCloudOperationResult.operationResult(null, th.getMessage(), false);
            }
        });
    }
}
