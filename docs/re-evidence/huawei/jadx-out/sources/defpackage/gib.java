package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gib implements IRequest {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("logId")
    private Integer f35165b;

    @SerializedName("type")
    private Integer d;

    private gib(d dVar) {
        this.f35165b = dVar.f35166a;
        this.d = dVar.f35167b;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.n();
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f35166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f35167b;

        public d d(Integer num) {
            this.f35166a = num;
            return this;
        }

        public d c(Integer num) {
            this.f35167b = num;
            return this;
        }

        public gib d() {
            return new gib(this);
        }
    }
}
