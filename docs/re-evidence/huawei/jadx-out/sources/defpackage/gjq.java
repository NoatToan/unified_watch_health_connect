package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gjq implements IRequest {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("id")
    private Integer f35302c;

    @SerializedName("operateType")
    private Integer d;

    private gjq(c cVar) {
        this.f35302c = cVar.f35303c;
        this.d = cVar.d;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.ba();
    }

    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f35303c;
        private Integer d;

        public c b(Integer num) {
            this.f35303c = num;
            return this;
        }

        public c a(Integer num) {
            this.d = num;
            return this;
        }

        public gjq c() {
            return new gjq(this);
        }
    }
}
