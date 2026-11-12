package com.tencent.open.log;

/* JADX INFO: loaded from: classes20.dex */
public abstract class Tracer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile int f31066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f31067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f31068c;

    protected abstract void doTrace(int i, Thread thread, long j, String str, String str2, Throwable th);

    public Tracer() {
        this(c.f31075a, true, g.f31084a);
    }

    public Tracer(int i, boolean z, g gVar) {
        this.f31066a = c.f31075a;
        this.f31067b = true;
        this.f31068c = g.f31084a;
        a(i);
        a(z);
        a(gVar);
    }

    public void a(int i, Thread thread, long j, String str, String str2, Throwable th) {
        if (d() && d.a.a(this.f31066a, i)) {
            doTrace(i, thread, j, str, str2, th);
        }
    }

    public void a(int i) {
        this.f31066a = i;
    }

    public boolean d() {
        return this.f31067b;
    }

    public void a(boolean z) {
        this.f31067b = z;
    }

    public g e() {
        return this.f31068c;
    }

    public void a(g gVar) {
        this.f31068c = gVar;
    }
}
