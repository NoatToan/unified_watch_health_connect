package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gku implements IRequest {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("reportData")
    private String f35443c;

    @SerializedName("planId")
    private String d;

    private gku(e eVar) {
        this.d = eVar.d;
        this.f35443c = eVar.e;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.cc();
    }

    public static final class e {
        private String d;
        private String e;

        public e c(String str) {
            this.d = str;
            return this;
        }

        public e d(String str) {
            this.e = str;
            return this;
        }

        public gku b() {
            return new gku(this);
        }
    }
}
