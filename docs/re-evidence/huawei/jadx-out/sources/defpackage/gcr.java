package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes7.dex */
public class gcr implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("pathId")
    private String f34906a;

    @SerializedName("feedbackDescription")
    private String e;

    private gcr(e eVar) {
        this.f34906a = eVar.e;
        this.e = eVar.d;
    }

    public static final class e {
        private String d;
        private String e;

        public e d(String str) {
            this.e = str;
            return this;
        }

        public e b(String str) {
            this.d = str;
            return this;
        }

        public gcr a() {
            return new gcr(this);
        }
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/dataAnalyse/app/feedbackHotPathInfo";
    }

    public String toString() {
        return "FeedbackHotPathInfoReq{pathId='" + this.f34906a + "', feedbackDescription='" + this.e + "'}";
    }
}
