package wi;

/* JADX INFO: loaded from: classes7.dex */
public final class t<Z> implements u<Z>, rj.a.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final rj.a.c f185444e = rj.a.a(20, new a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rj.d.b f185445a = new rj.d.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u<Z> f185446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f185447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f185448d;

    public class a implements rj.a.b<t<?>> {
        @Override // rj.a.b
        public final t<?> b() {
            return new t<>();
        }
    }

    @Override // wi.u
    public final Class<Z> a() {
        return this.f185446b.a();
    }

    @Override // wi.u
    public final synchronized void b() {
        this.f185445a.a();
        this.f185448d = true;
        if (!this.f185447c) {
            this.f185446b.b();
            this.f185446b = null;
            f185444e.a(this);
        }
    }

    public final synchronized void c() {
        this.f185445a.a();
        if (!this.f185447c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f185447c = false;
        if (this.f185448d) {
            b();
        }
    }

    @Override // rj.a.d
    public final rj.d.b e() {
        return this.f185445a;
    }

    @Override // wi.u
    public final Z get() {
        return this.f185446b.get();
    }

    @Override // wi.u
    public final int getSize() {
        return this.f185446b.getSize();
    }
}
