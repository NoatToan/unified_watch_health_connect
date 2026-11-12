package wi;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes7.dex */
public class p<Z> implements u<Z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f185433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f185434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u<Z> f185435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f185436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ui.e f185437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f185438f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f185439g;

    public interface a {
        void a(ui.e eVar, p<?> pVar);
    }

    public p(u<Z> uVar, boolean z14, boolean z15, ui.e eVar, a aVar) {
        qj.l.c(uVar, "Argument must not be null");
        this.f185435c = uVar;
        this.f185433a = z14;
        this.f185434b = z15;
        this.f185437e = eVar;
        qj.l.c(aVar, "Argument must not be null");
        this.f185436d = aVar;
    }

    @Override // wi.u
    public final Class<Z> a() {
        return this.f185435c.a();
    }

    @Override // wi.u
    public final synchronized void b() {
        if (this.f185438f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f185439g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f185439g = true;
        if (this.f185434b) {
            this.f185435c.b();
        }
    }

    public final synchronized void c() {
        if (this.f185439g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f185438f++;
    }

    public final void d() {
        boolean z14;
        synchronized (this) {
            int i14 = this.f185438f;
            if (i14 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z14 = true;
            int i15 = i14 - 1;
            this.f185438f = i15;
            if (i15 != 0) {
                z14 = false;
            }
        }
        if (z14) {
            this.f185436d.a(this.f185437e, this);
        }
    }

    @Override // wi.u
    public final Z get() {
        return this.f185435c.get();
    }

    @Override // wi.u
    public final int getSize() {
        return this.f185435c.getSize();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f185433a + ", listener=" + this.f185436d + ", key=" + this.f185437e + ", acquired=" + this.f185438f + ", isRecycled=" + this.f185439g + ", resource=" + this.f185435c + CoreConstants.CURLY_RIGHT;
    }
}
