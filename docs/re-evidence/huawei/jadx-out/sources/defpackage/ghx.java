package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.basefitnessadvice.model.intplan.LeaveInfo;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class ghx implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("category")
    private Integer f35146a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("leaveInfo")
    private LeaveInfo f35147c;

    @SerializedName("planId")
    private String d;

    @SerializedName("subCategory")
    private Integer e;

    private ghx(c cVar) {
        this.d = cVar.f35150c;
        this.f35146a = cVar.d;
        this.e = cVar.f35149b;
        this.f35147c = cVar.f35148a;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.a();
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private LeaveInfo f35148a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f35149b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f35150c;
        private Integer d;

        public c b(String str) {
            this.f35150c = str;
            return this;
        }

        public c a(Integer num) {
            this.d = num;
            return this;
        }

        public c e(Integer num) {
            this.f35149b = num;
            return this;
        }

        public c c(LeaveInfo leaveInfo) {
            this.f35148a = leaveInfo;
            return this;
        }

        public ghx a() {
            return new ghx(this);
        }
    }
}
