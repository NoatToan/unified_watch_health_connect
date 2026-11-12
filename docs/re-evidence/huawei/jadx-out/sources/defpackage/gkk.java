package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gkk implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("dayNum")
    private Integer f35387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("weekNum")
    private Integer f35388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("planId")
    private String f35389c;

    @SerializedName("record")
    private pdr d;

    @SerializedName("planType")
    private Integer e;

    private gkk(b bVar) {
        this.e = bVar.d;
        this.f35389c = bVar.e;
        this.f35388b = bVar.f35390a;
        this.f35387a = bVar.f35392c;
        this.d = bVar.f35391b;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.bz();
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f35390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private pdr f35391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f35392c;
        private Integer d;
        private String e;

        public b c(Integer num) {
            this.d = num;
            return this;
        }

        public b d(String str) {
            this.e = str;
            return this;
        }

        public b e(Integer num) {
            this.f35390a = num;
            return this;
        }

        public b a(Integer num) {
            this.f35392c = num;
            return this;
        }

        public b b(pdr pdrVar) {
            this.f35391b = pdrVar;
            return this;
        }

        public gkk b() {
            return new gkk(this);
        }
    }
}
