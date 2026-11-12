package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.health.plan.model.intplan.UserProfileBean;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gkn implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("userInfo")
    private UserProfileBean f35405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("planType")
    private int f35406b;

    @SerializedName("planId")
    private String d;

    @SerializedName("isRunFlag")
    private int e;

    private gkn(e eVar) {
        this.f35405a = eVar.f35408b;
        this.d = eVar.e;
        this.f35406b = eVar.f35407a;
        this.e = eVar.f35409c;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.by();
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f35407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private UserProfileBean f35408b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f35409c;
        private String e;

        public e a(UserProfileBean userProfileBean) {
            this.f35408b = userProfileBean;
            return this;
        }

        public e c(String str) {
            this.e = str;
            return this;
        }

        public e a(int i) {
            this.f35407a = i;
            return this;
        }

        public e e(int i) {
            this.f35409c = i;
            return this;
        }

        public gkn b() {
            return new gkn(this);
        }
    }
}
