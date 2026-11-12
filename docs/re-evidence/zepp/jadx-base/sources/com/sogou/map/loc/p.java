package com.sogou.map.loc;

/* JADX INFO: loaded from: classes18.dex */
final class p {
    private final f a;
    private final long b;
    private volatile long c;
    private volatile boolean d;
    private volatile k2 e;
    private Runnable f;
    private /* synthetic */ i g;

    private p(i iVar, f fVar, long j) {
        this.g = iVar;
        this.d = false;
        this.f = new q(this);
        this.a = fVar;
        this.b = j;
    }

    public final k2 a() {
        try {
            this.c = this.g.g.d.incrementAndGet();
            this.e = this.a.f().b(this.g.e, this.g.f);
            this.g.g.c.postDelayed(this.f, this.b);
        } catch (Throwable unused) {
        }
        return this.e;
    }

    public final void e() {
        if (this.e.h()) {
            return;
        }
        try {
            if (this.d) {
                this.a.e(this.c);
            } else {
                this.g.g.c.removeCallbacks(this.f);
            }
        } catch (Throwable unused) {
        }
    }

    public final void g() {
        if (this.e.h() || this.d) {
            return;
        }
        try {
            this.g.g.c.removeCallbacks(this.f);
            this.g.g.c.post(this.f);
        } catch (Throwable unused) {
        }
    }

    public /* synthetic */ p(i iVar, f fVar, long j, byte b) {
        this(iVar, fVar, j);
    }
}
