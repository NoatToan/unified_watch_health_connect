package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gjh implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("topicId")
    private Integer f35271a;

    @SerializedName("lang")
    private String d;

    @SerializedName("pageNum")
    private Integer e;

    private gjh(d dVar) {
        this.e = dVar.f35272a;
        this.f35271a = dVar.e;
        this.d = dVar.f35273b;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.ar();
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f35272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f35273b;
        private Integer e;

        public d e(Integer num) {
            this.f35272a = num;
            return this;
        }

        public d a(Integer num) {
            this.e = num;
            return this;
        }

        public d a(String str) {
            this.f35273b = str;
            return this;
        }

        public gjh d() {
            return new gjh(this);
        }
    }
}
