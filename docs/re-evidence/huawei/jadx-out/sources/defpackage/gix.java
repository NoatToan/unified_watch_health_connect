package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gix implements IRequest {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("type")
    private int f35240b;

    private gix(d dVar) {
        this.f35240b = dVar.f35241c;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.e();
    }

    public static final class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f35241c;

        public d b(int i) {
            this.f35241c = i;
            return this;
        }

        public gix e() {
            return new gix(this);
        }
    }
}
