package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class giy implements IRequest {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("lang")
    private String f35242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("planId")
    private String f35243c;

    private giy(e eVar) {
        this.f35243c = eVar.f35244b;
        this.f35242b = eVar.e;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.ah();
    }

    public static final class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f35244b;
        private String e;

        public e d(String str) {
            this.f35244b = str;
            return this;
        }

        public e c(String str) {
            this.e = str;
            return this;
        }

        public giy d() {
            return new giy(this);
        }
    }
}
