package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class gjn implements IRequest {

    @SerializedName("showDetail")
    private Boolean d;

    @SerializedName("workoutInfoQueryParams")
    private List<gzl> e;

    private gjn(d dVar) {
        this.e = dVar.d;
        this.d = dVar.e;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.aw();
    }

    public static final class d {
        private List<gzl> d;
        private Boolean e;

        public d c(List<gzl> list) {
            this.d = list;
            return this;
        }

        public d e(Boolean bool) {
            this.e = bool;
            return this;
        }

        public gjn d() {
            return new gjn(this);
        }
    }
}
