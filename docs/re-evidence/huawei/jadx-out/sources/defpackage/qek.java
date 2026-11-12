package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes15.dex */
public class qek implements IRequest {
    private transient int d;

    public int e() {
        return this.d;
    }

    public void d(int i) {
        this.d = i;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("marketingGateWayUrl") + "/healthFitnessPlan/app/v1/";
    }

    public String toString() {
        return "{strategy=" + this.d + '}';
    }
}
