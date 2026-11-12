package com.amap.api.col.p0003sl;

/* JADX INFO: loaded from: classes4.dex */
public class kv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kx f2988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private la f2989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f2990c;
    private long d;

    public interface a {
        void onDownload(byte[] bArr, long j);

        void onException(Throwable th);

        void onFinish();

        void onStop();
    }

    public kv(la laVar) {
        this(laVar, (byte) 0);
    }

    private kv(la laVar, byte b2) {
        this(laVar, 0L, -1L, false);
    }

    public kv(la laVar, long j, long j2, boolean z) {
        this.f2989b = laVar;
        this.f2990c = j;
        this.d = j2;
        laVar.setHttpProtocol(z ? la.c.HTTPS : la.c.HTTP);
        this.f2989b.setDegradeAbility(la.a.SINGLE);
    }

    public final void a(a aVar) {
        try {
            kx kxVar = new kx();
            this.f2988a = kxVar;
            kxVar.b(this.d);
            this.f2988a.a(this.f2990c);
            kt.a();
            if (kt.b(this.f2989b)) {
                this.f2989b.setDegradeType(la.b.NEVER_GRADE);
                this.f2988a.a(this.f2989b, aVar);
            } else {
                this.f2989b.setDegradeType(la.b.DEGRADE_ONLY);
                this.f2988a.a(this.f2989b, aVar);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void a() {
        kx kxVar = this.f2988a;
        if (kxVar != null) {
            kxVar.a();
        }
    }
}
