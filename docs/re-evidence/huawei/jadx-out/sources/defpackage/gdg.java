package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes7.dex */
public class gdg implements IRequest {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("startDay")
    private int f34924c;

    @SerializedName("endDay")
    private int d;

    private gdg(d dVar) {
        this.f34924c = dVar.e;
        this.d = dVar.d;
    }

    public static final class d {
        private int d;
        private int e;

        public d b(int i) {
            this.e = i;
            return this;
        }

        public d e(int i) {
            this.d = i;
            return this;
        }

        public gdg b() {
            return new gdg(this);
        }
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/dataAnalyse/app/getHotPathParticipateInfos";
    }

    public String toString() {
        return "GetHotPathParticipateInfosReq{startDay=" + this.f34924c + ", endDay=" + this.d + '}';
    }
}
