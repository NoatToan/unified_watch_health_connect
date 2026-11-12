package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import com.huawei.operation.utils.CloudParamKeys;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes29.dex */
public class gnz implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("audioIdStr")
    private String f35858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("audioId")
    private int f35859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("complete")
    private boolean f35860c;

    @SerializedName(CloudParamKeys.CLIENT_TYPE)
    private String d;

    @SerializedName("duration")
    private long e;

    private gnz(e eVar) {
        this.f35859b = eVar.f35863c;
        this.e = eVar.f35862b;
        this.f35860c = eVar.e;
        this.d = eVar.f35861a;
        this.f35858a = eVar.d;
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f35861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f35862b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f35863c;
        private String d;
        private boolean e;

        public e a(int i) {
            this.f35863c = i;
            return this;
        }

        public e b(long j) {
            this.f35862b = j;
            return this;
        }

        public e e(boolean z) {
            this.e = z;
            return this;
        }

        public e c(String str) {
            this.f35861a = str;
            return this;
        }

        public e b(String str) {
            this.d = str;
            return this;
        }

        public gnz e() {
            return new gnz(this);
        }
    }

    public String toString() {
        return "SaveSleepPlayRecordReq{mAudioId=" + this.f35859b + ", mDuration=" + this.e + ", mComplete=" + this.f35860c + ", mClientType='" + this.d + "', mAiAudioId='" + this.f35858a + "'}";
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("sportSuggestUrl") + "/user/saveSleepPlayRecord";
    }
}
