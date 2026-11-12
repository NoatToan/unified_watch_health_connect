package defpackage;

import com.huawei.hwcloudmodel.healthdatacloud.HealthDataCloudFactory;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.networkclient.ResultCallback;

/* JADX INFO: loaded from: classes43.dex */
public class vyq {
    private static vyq e = new vyq();
    private final HealthDataCloudFactory d = new HealthDataCloudFactory(BaseApplication.getContext());

    private vyq() {
    }

    public static vyq a() {
        return e;
    }

    public void e(vyv vyvVar, ResultCallback<vyw> resultCallback) {
        oet.d().c(vyvVar.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(vyvVar)), vyw.class, resultCallback);
    }
}
