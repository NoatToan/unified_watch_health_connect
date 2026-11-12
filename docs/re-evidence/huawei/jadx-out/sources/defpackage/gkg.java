package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gkg implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("planId")
    private String f35369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("planType")
    private Integer f35370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("dayNo")
    private Integer f35371c;

    @SerializedName("propensityWorkoutId")
    private String d;

    @SerializedName("replacedWorkoutId")
    private String e;

    @SerializedName("weekNo")
    private Integer f;

    private gkg(d dVar) {
        this.f35369a = dVar.f35373b;
        this.f35370b = dVar.f35374c;
        this.f = dVar.g;
        this.f35371c = dVar.d;
        this.d = dVar.f35372a;
        this.e = dVar.e;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.bs();
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f35372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f35373b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f35374c;
        private Integer d;
        private String e;
        private Integer g;

        public d e(String str) {
            this.f35373b = str;
            return this;
        }

        public d c(Integer num) {
            this.f35374c = num;
            return this;
        }

        public d b(Integer num) {
            this.g = num;
            return this;
        }

        public d d(Integer num) {
            this.d = num;
            return this;
        }

        public d c(String str) {
            this.f35372a = str;
            return this;
        }

        public d d(String str) {
            this.e = str;
            return this;
        }

        public gkg b() {
            return new gkg(this);
        }
    }
}
