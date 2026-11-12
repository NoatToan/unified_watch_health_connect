package com.huawei.openalliance.ad;

import com.huawei.openalliance.ad.constant.Scheme;
import com.huawei.openalliance.ad.download.DownloadTask;

/* JADX INFO: loaded from: classes12.dex */
public class dx extends DownloadTask {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f18671c;
    private String d;
    private String e;
    private Long f;
    private Long g;
    private String i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f18670b = -1;
    private boolean h = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f18669a = 0;

    @Override // com.huawei.openalliance.ad.download.DownloadTask
    public String n() {
        return this.f18671c;
    }

    public void j(String str) {
        this.i = str;
    }

    public void i(String str) {
        this.e = str;
    }

    @Override // com.huawei.openalliance.ad.download.DownloadTask
    public int hashCode() {
        return super.hashCode();
    }

    public void h(String str) {
        this.d = str;
    }

    public void g(String str) {
        this.f18671c = str;
    }

    @Override // com.huawei.openalliance.ad.download.DownloadTask
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void e(boolean z) {
        this.h = z;
    }

    public void e(int i) {
        this.f18669a = i;
    }

    public void d(int i) {
        this.f18670b = i;
    }

    public void b(Long l) {
        this.g = l;
    }

    public void a(Long l) {
        this.f = l;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f18672a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f18673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f18674c;
        private String d;
        private String e;
        private String f;

        public a d(String str) {
            this.f = str;
            return this;
        }

        public a c(String str) {
            this.e = str;
            return this;
        }

        public a b(String str) {
            this.d = str;
            return this;
        }

        public dx a() {
            dx dxVar = new dx();
            dxVar.a(this.f18672a);
            String strA = com.huawei.openalliance.ad.utils.db.a(this.f18673b);
            dxVar.g(strA);
            dxVar.e(dw.h().b(strA));
            dxVar.d(Scheme.DISKCACHE.toString() + strA);
            dxVar.a(this.f18673b);
            dxVar.c(this.d);
            dxVar.a((long) this.f18674c);
            dxVar.a(0);
            dxVar.i(this.f);
            dxVar.h(this.e);
            return dxVar;
        }

        public a a(boolean z) {
            this.f18672a = z;
            return this;
        }

        public a a(String str) {
            this.f18673b = str;
            return this;
        }

        public a a(int i) {
            this.f18674c = i;
            return this;
        }
    }

    public int I() {
        return this.f18669a;
    }

    public String H() {
        return this.i;
    }

    public int G() {
        return this.f18670b;
    }

    public Long F() {
        return this.g;
    }

    public Long E() {
        return this.f;
    }

    public boolean D() {
        return this.h;
    }

    public String C() {
        return this.e;
    }

    public String B() {
        return this.d;
    }
}
