package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class gkp implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("exeDate")
    private List<Integer> f35416a;

    @SerializedName("runDate")
    private List<Integer> d;

    @SerializedName("planId")
    private String e;

    private gkp(b bVar) {
        this.e = bVar.e;
        this.d = bVar.f35418c;
        this.f35416a = bVar.f35417a;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.cg();
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<Integer> f35417a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<Integer> f35418c;
        private String e;

        public b b(String str) {
            this.e = str;
            return this;
        }

        public b e(List<Integer> list) {
            this.f35418c = list;
            return this;
        }

        public b c(List<Integer> list) {
            this.f35417a = list;
            return this;
        }

        public gkp c() {
            return new gkp(this);
        }
    }
}
