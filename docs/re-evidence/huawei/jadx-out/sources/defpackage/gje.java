package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gje implements IRequest {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("cond")
    private String f35266c;

    private gje(b bVar) {
        this.f35266c = bVar.f35267b;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.an();
    }

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f35267b;

        public b b(String str) {
            this.f35267b = str;
            return this;
        }

        public gje a() {
            return new gje(this);
        }
    }
}
