package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class gii implements IRequest {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("actionIdList")
    private List<String> f35188b;

    @SerializedName("sex")
    private int d;

    private gii(e eVar) {
        this.f35188b = eVar.f35189a;
        this.d = eVar.f35190c;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.q();
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<String> f35189a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f35190c;

        public e d(List<String> list) {
            this.f35189a = list;
            return this;
        }

        public e d(int i) {
            this.f35190c = i;
            return this;
        }

        public gii e() {
            return new gii(this);
        }
    }
}
