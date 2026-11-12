package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gko implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("planId")
    private String f35410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("report")
    private String f35411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("planType")
    private int f35412c;

    @SerializedName("reportType")
    private int d;

    @SerializedName("reportUpdateTime")
    private long e;

    private gko(d dVar) {
        this.d = dVar.e;
        this.f35410a = dVar.f35413a;
        this.f35412c = dVar.d;
        this.e = dVar.f35414b;
        this.f35411b = dVar.f35415c;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.bg();
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f35413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f35414b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f35415c;
        private int d;
        private int e;

        public d d(int i) {
            this.e = i;
            return this;
        }

        public d a(String str) {
            this.f35413a = str;
            return this;
        }

        public d e(int i) {
            this.d = i;
            return this;
        }

        public d a(long j) {
            this.f35414b = j;
            return this;
        }

        public d b(String str) {
            this.f35415c = str;
            return this;
        }

        public gko e() {
            return new gko(this);
        }
    }
}
