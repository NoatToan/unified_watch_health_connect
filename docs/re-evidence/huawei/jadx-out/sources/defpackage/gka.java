package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gka implements IRequest {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("ids")
    private String f35355b;

    private gka(e eVar) {
        this.f35355b = eVar.f35356a;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.bj();
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f35356a;

        public e c(String str) {
            this.f35356a = str;
            return this;
        }

        public gka e() {
            return new gka(this);
        }
    }
}
