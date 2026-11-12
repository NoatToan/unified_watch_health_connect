package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class gid implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("idList")
    private List<Integer> f35170a;

    private gid(b bVar) {
        this.f35170a = bVar.f35171c;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.l();
    }

    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<Integer> f35171c;

        public b a(List<Integer> list) {
            this.f35171c = list;
            return this;
        }

        public gid a() {
            return new gid(this);
        }
    }
}
