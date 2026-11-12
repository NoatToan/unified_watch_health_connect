package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class giv implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("planId")
    private String f35231a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("planType")
    private int f35232c;

    @SerializedName("reportType")
    private int d;

    private giv(a aVar) {
        this.d = aVar.f35233b;
        this.f35231a = aVar.e;
        this.f35232c = aVar.f35234c;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.ad();
    }

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f35233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f35234c;
        private String e;

        public a e(int i) {
            this.f35233b = i;
            return this;
        }

        public a e(String str) {
            this.e = str;
            return this;
        }

        public a a(int i) {
            this.f35234c = i;
            return this;
        }

        public giv b() {
            return new giv(this);
        }
    }
}
