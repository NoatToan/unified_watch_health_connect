package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gkc implements IRequest {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("type")
    private Integer f35357c;

    private gkc(c cVar) {
        this.f35357c = cVar.f35358a;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.bn();
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f35358a;

        public c a(Integer num) {
            this.f35358a = num;
            return this;
        }

        public gkc e() {
            return new gkc(this);
        }
    }
}
