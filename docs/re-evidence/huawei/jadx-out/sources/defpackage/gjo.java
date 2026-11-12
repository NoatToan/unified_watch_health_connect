package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.basefitnessadvice.model.intplan.LeaveInfo;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gjo implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("subCategory")
    private Integer f35294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("leaveInfo")
    private LeaveInfo f35295b;

    @SerializedName("category")
    private Integer d;

    @SerializedName("planId")
    private String e;

    private gjo(c cVar) {
        this.e = cVar.d;
        this.d = cVar.f35296a;
        this.f35294a = cVar.f35297b;
        this.f35295b = cVar.f35298c;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.ax();
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f35296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f35297b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private LeaveInfo f35298c;
        private String d;

        public c c(String str) {
            this.d = str;
            return this;
        }

        public c c(Integer num) {
            this.f35296a = num;
            return this;
        }

        public c a(Integer num) {
            this.f35297b = num;
            return this;
        }

        public c e(LeaveInfo leaveInfo) {
            this.f35298c = leaveInfo;
            return this;
        }

        public gjo a() {
            return new gjo(this);
        }
    }
}
