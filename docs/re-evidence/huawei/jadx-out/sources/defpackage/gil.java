package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gil implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("duration")
    private Long f35199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("completionRate")
    private Float f35200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("dateTime")
    private Long f35201c;

    @SerializedName("actualCalorie")
    private Float d;

    @SerializedName("actualDistance")
    private Integer e;

    @SerializedName("planId")
    private String h;

    private gil(e eVar) {
        this.h = eVar.j;
        this.f35200b = eVar.f35204c;
        this.e = eVar.d;
        this.f35199a = eVar.f35203b;
        this.d = eVar.e;
        this.f35201c = eVar.f35202a;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.s();
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f35202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f35203b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Float f35204c;
        private Integer d;
        private Float e;
        private String j;

        public e b(String str) {
            this.j = str;
            return this;
        }

        public e b(Float f) {
            this.f35204c = f;
            return this;
        }

        public e c(Integer num) {
            this.d = num;
            return this;
        }

        public e c(Float f) {
            this.e = f;
            return this;
        }

        public e a(Long l) {
            this.f35203b = l;
            return this;
        }

        public e d(Long l) {
            this.f35202a = l;
            return this;
        }

        public gil b() {
            return new gil(this);
        }
    }
}
