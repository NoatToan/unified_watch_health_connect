package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gjg implements IRequest {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("courseCategory")
    private Integer f35270c;

    private gjg(d dVar) {
        this.f35270c = dVar.d;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.ae();
    }

    public static final class d {
        private Integer d;

        public d d(Integer num) {
            this.d = num;
            return this;
        }

        public gjg b() {
            return new gjg(this);
        }
    }
}
