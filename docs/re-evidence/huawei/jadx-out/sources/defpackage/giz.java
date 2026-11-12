package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class giz implements IRequest {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("planId")
    private String f35245b;

    private giz(b bVar) {
        this.f35245b = bVar.d;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.ag();
    }

    public static final class b {
        private String d;

        public b b(String str) {
            this.d = str;
            return this;
        }

        public giz b() {
            return new giz(this);
        }
    }
}
