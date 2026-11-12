package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gja implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("timbre")
    private String f35249a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("version")
    private Long f35250c;

    private gja(b bVar) {
        this.f35250c = bVar.d;
        this.f35249a = bVar.f35251b;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.af();
    }

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f35251b;
        private Long d;

        public b c(Long l) {
            this.d = l;
            return this;
        }

        public b e(String str) {
            this.f35251b = str;
            return this;
        }

        public gja b() {
            return new gja(this);
        }
    }
}
