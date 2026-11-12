package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gio implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("categoryCode")
    private String f35212a;

    private gio(d dVar) {
        this.f35212a = dVar.d;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.ci();
    }

    public static final class d {
        private String d;

        public d b(String str) {
            this.d = str;
            return this;
        }

        public gio a() {
            return new gio(this);
        }
    }
}
