package com.amap.api.col.p0003sl;

/* JADX INFO: loaded from: classes4.dex */
public class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d1 f5977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public la f5978b;
    public long c;
    public long d;

    public interface a {
        void onDownload(byte[] bArr, long j);

        void onException(Throwable th);

        void onFinish();

        void onStop();
    }

    public c1(la laVar) {
        this(laVar, (byte) 0);
    }

    public final void a() {
        d1 d1Var = this.f5977a;
        if (d1Var != null) {
            d1Var.k();
        }
    }

    public final void b(a aVar) {
        try {
            d1 d1Var = new d1();
            this.f5977a = d1Var;
            d1Var.t(this.d);
            this.f5977a.l(this.c);
            b1.b();
            if (b1.g(this.f5978b)) {
                this.f5978b.setDegradeType(la.b.NEVER_GRADE);
                this.f5977a.m(this.f5978b, aVar);
            } else {
                this.f5978b.setDegradeType(la.b.DEGRADE_ONLY);
                this.f5977a.m(this.f5978b, aVar);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public c1(la laVar, byte b2) {
        this(laVar, 0L, -1L, false);
    }

    public c1(la laVar, long j, long j2, boolean z) {
        this.f5978b = laVar;
        this.c = j;
        this.d = j2;
        laVar.setHttpProtocol(z ? la.c.HTTPS : la.c.HTTP);
        this.f5978b.setDegradeAbility(la.a.SINGLE);
    }
}
