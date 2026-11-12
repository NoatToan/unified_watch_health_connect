package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gkb implements IRequest {

    @SerializedName("type")
    private Integer e;

    private gkb(d dVar) {
        this.e = dVar.e;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.bu();
    }

    public static final class d {
        private Integer e;

        public d d(Integer num) {
            this.e = num;
            return this;
        }

        public gkb e() {
            return new gkb(this);
        }
    }
}
