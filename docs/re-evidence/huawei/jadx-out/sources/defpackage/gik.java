package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gik implements IRequest {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("lang")
    private String f35197b;

    @SerializedName("type")
    private Integer d;

    private gik(d dVar) {
        this.d = dVar.e;
        this.f35197b = dVar.f35198c;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.t();
    }

    public static final class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f35198c;
        private Integer e;

        public d d(Integer num) {
            this.e = num;
            return this;
        }

        public d a(String str) {
            this.f35198c = str;
            return this;
        }

        public gik d() {
            return new gik(this);
        }
    }
}
