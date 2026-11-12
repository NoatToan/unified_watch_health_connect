package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gki implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("planType")
    private int f35383a;

    @SerializedName("planId")
    private String d;

    private gki(a aVar) {
        this.d = aVar.d;
        this.f35383a = aVar.f35384b;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.bx();
    }

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f35384b;
        private String d;

        public a a(String str) {
            this.d = str;
            return this;
        }

        public a b(int i) {
            this.f35384b = i;
            return this;
        }

        public gki e() {
            return new gki(this);
        }
    }

    public int c() {
        return this.f35383a;
    }

    public String d() {
        return this.d;
    }
}
