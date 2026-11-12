package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes7.dex */
public class gdh implements IRequest {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("pathId")
    private String f34925c;

    private gdh(b bVar) {
        this.f34925c = bVar.f34926b;
    }

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f34926b;

        public b b(String str) {
            this.f34926b = str;
            return this;
        }

        public gdh c() {
            return new gdh(this);
        }
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/dataAnalyse/app/getHotPathDetail";
    }

    public String toString() {
        return "GetHotPathDetailReq{pathId='" + this.f34925c + "'}";
    }
}
