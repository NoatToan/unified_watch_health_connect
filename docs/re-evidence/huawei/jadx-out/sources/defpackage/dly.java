package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes27.dex */
public class dly implements IRequest {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("queryDate")
    private int f31986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("timeZone")
    private String f31987c;

    @SerializedName("queryType")
    private String e;

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        if ("weekEncourage".equals(this.e) || "monthEncourage".equals(this.e)) {
            return dmf.c();
        }
        return dmf.b();
    }

    private dly(c cVar) {
        this.e = cVar.f31988a;
        this.f31986b = cVar.f31989b;
        this.f31987c = ieg.d();
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f31988a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f31989b;

        public c e(String str) {
            this.f31988a = str;
            return this;
        }

        public c a(int i) {
            this.f31989b = i;
            return this;
        }

        public dly d() {
            return new dly(this);
        }
    }
}
