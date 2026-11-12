package defpackage;

import com.google.gson.Gson;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes20.dex */
public class wzp<T> extends wzg<T> {
    private static final String TAG = "TokenService";

    public wzp(Class<T> cls, String str) {
        super(cls, str);
    }

    public void getAuthorizeToken(final ICloudOperationResult<T> iCloudOperationResult) {
        LogUtil.a(TAG, "enter getAuthorizeToken()");
        GRSManager.c(BaseApplication.getContext()).d("healthCloudUrl", new GrsQueryCallback() { // from class: wzp.4
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str) {
                oet.d().c(str + wzp.this.urlPath, wzp.this.createHeader(), ofe.c(wzp.this.createParams()), wzp.this.clazz, new ResultCallback<T>() { // from class: wzp.4.2
                    @Override // com.huawei.networkclient.ResultCallback
                    public void onSuccess(T t) {
                        String json = new Gson().toJson(t);
                        LogUtil.a(wzp.TAG, "getAuthorizeToken result:", json);
                        iCloudOperationResult.operationResult(t, json, true);
                    }

                    @Override // com.huawei.networkclient.ResultCallback
                    public void onFailure(Throwable th) {
                        LogUtil.a(wzp.TAG, "getAuthorizeToken onFailure:", th.getMessage());
                        iCloudOperationResult.operationResult(null, th.getMessage(), false);
                    }
                });
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                LogUtil.j(wzp.TAG, "onCallBackFail:", Integer.valueOf(i));
            }
        });
    }
}
