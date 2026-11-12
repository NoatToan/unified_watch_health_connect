package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gjp implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("name")
    private String f35299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("planId")
    private String f35300b;

    private gjp(d dVar) {
        this.f35300b = dVar.f35301c;
        this.f35299a = dVar.e;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.at();
    }

    public static final class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f35301c;
        private String e;

        public d c(String str) {
            this.f35301c = str;
            return this;
        }

        public d b(String str) {
            this.e = str;
            return this;
        }

        public gjp c() {
            return new gjp(this);
        }
    }
}
