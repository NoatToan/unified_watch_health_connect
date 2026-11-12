package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gjz implements IRequest {

    @SerializedName("planId")
    private String e;

    private gjz(a aVar) {
        this.e = aVar.f35351b;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.bm();
    }

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f35351b;

        public a b(String str) {
            this.f35351b = str;
            return this;
        }

        public gjz c() {
            return new gjz(this);
        }
    }
}
