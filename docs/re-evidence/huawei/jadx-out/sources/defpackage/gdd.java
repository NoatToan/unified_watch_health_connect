package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes7.dex */
public class gdd implements IRequest {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("motionPathStartTime")
    private long f34918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("motionPathEndTime")
    private long f34919c;

    @SerializedName("timeZone")
    private String d;

    private gdd(e eVar) {
        this.f34918b = eVar.e;
        this.f34919c = eVar.f34920b;
        this.d = eVar.f34921c;
    }

    public static final class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f34920b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f34921c;
        private long e;

        public e a(long j) {
            this.e = j;
            return this;
        }

        public e d(long j) {
            this.f34920b = j;
            return this;
        }

        public e b(String str) {
            this.f34921c = str;
            return this;
        }

        public gdd b() {
            return new gdd(this);
        }
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/dataAnalyse/app/getHotPathParticipateByVersion";
    }

    public String toString() {
        return "GetHotPathParticipateInfoReq{mMotionPathStartTime=" + this.f34918b + ", mMotionPathEndTime=" + this.f34919c + ", mTimeZone='" + this.d + "'}";
    }
}
