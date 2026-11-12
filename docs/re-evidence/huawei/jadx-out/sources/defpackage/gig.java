package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gig implements IRequest {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("recordId")
    private String f35181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("planType")
    private Integer f35182c;

    @SerializedName("planId")
    private String e;

    private gig(b bVar) {
        this.f35182c = bVar.f35183a;
        this.e = bVar.d;
        this.f35181b = bVar.f35184b;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.k();
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f35183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f35184b;
        private String d;

        public b c(Integer num) {
            this.f35183a = num;
            return this;
        }

        public b c(String str) {
            this.d = str;
            return this;
        }

        public b e(String str) {
            this.f35184b = str;
            return this;
        }

        public gig c() {
            return new gig(this);
        }
    }
}
