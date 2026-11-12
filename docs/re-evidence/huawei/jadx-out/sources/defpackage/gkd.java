package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gkd implements IRequest {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("pageNum")
    private Integer f35359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("lang")
    private String f35360c;

    @SerializedName("courseCategory")
    private Integer d;

    private gkd(b bVar) {
        this.d = bVar.f35361c;
        this.f35359b = bVar.d;
        this.f35360c = bVar.e;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.bq();
    }

    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f35361c;
        private Integer d;
        private String e;

        public b c(Integer num) {
            this.f35361c = num;
            return this;
        }

        public b e(Integer num) {
            this.d = num;
            return this;
        }

        public b b(String str) {
            this.e = str;
            return this;
        }

        public gkd d() {
            return new gkd(this);
        }
    }
}
