package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gir implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("planId")
    private String f35221a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("weekIndex")
    private Integer f35222c;

    @SerializedName("returnAlgorithmInfos")
    private Boolean d;

    private gir(d dVar) {
        this.f35221a = dVar.f35224b;
        this.f35222c = dVar.d;
        this.d = dVar.f35223a;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.y();
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Boolean f35223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f35224b;
        private Integer d;

        public d d(String str) {
            this.f35224b = str;
            return this;
        }

        public d b(Integer num) {
            this.d = num;
            return this;
        }

        public d d(Boolean bool) {
            this.f35223a = bool;
            return this;
        }

        public gir b() {
            return new gir(this);
        }
    }
}
