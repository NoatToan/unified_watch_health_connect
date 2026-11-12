package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gkl implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("propType")
    private String f35393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("planType")
    private int f35394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("propValue")
    private String f35395c;

    @SerializedName("planId")
    private String d;

    private gkl(c cVar) {
        this.d = cVar.f35396a;
        this.f35394b = cVar.f35398c;
        this.f35393a = cVar.d;
        this.f35395c = cVar.f35397b;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.ca();
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f35396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f35397b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f35398c;
        private String d;

        public c c(String str) {
            this.f35396a = str;
            return this;
        }

        public c a(int i) {
            this.f35398c = i;
            return this;
        }

        public c d(String str) {
            this.d = str;
            return this;
        }

        public c a(String str) {
            this.f35397b = str;
            return this;
        }

        public gkl c() {
            return new gkl(this);
        }
    }
}
