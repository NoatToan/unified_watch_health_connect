package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class giq implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("actionId")
    private String f35219a;

    @SerializedName("version")
    private String d;

    private giq(e eVar) {
        this.f35219a = eVar.f35220b;
        this.d = eVar.e;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.aa();
    }

    public static final class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f35220b;
        private String e;

        public e a(String str) {
            this.f35220b = str;
            return this;
        }

        public e b(String str) {
            this.e = str;
            return this;
        }

        public giq b() {
            return new giq(this);
        }
    }
}
