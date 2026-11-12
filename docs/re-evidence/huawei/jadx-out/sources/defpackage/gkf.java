package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gkf implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("endTime")
    private Long f35364a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("smartScreenLogsFlag")
    private Integer f35365c;

    @SerializedName("pageNum")
    private Integer d;

    @SerializedName("startTime")
    private Long e;

    private gkf(e eVar) {
        this.e = eVar.f35367b;
        this.f35364a = eVar.f35366a;
        this.d = eVar.e;
        this.f35365c = eVar.f35368c;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.bv();
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f35366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f35367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f35368c;
        private Integer e;

        public e b(Long l) {
            this.f35367b = l;
            return this;
        }

        public e d(Long l) {
            this.f35366a = l;
            return this;
        }

        public e e(Integer num) {
            this.e = num;
            return this;
        }

        public e a(Integer num) {
            this.f35368c = num;
            return this;
        }

        public gkf d() {
            return new gkf(this);
        }
    }
}
