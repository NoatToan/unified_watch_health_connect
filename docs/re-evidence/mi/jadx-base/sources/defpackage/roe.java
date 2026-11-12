package defpackage;

import androidx.core.util.Pools;

/* JADX INFO: loaded from: classes4.dex */
public final class roe<Z> implements kqk<Z>, u69.f {
    public static final Pools.Pool<roe<?>> e = u69.d(20, new a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ado f32747a = ado.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public kqk<Z> f32748b;
    public boolean c;
    public boolean d;

    public class a implements u69.d<roe<?>> {
        @Override // u69.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public roe<?> create() {
            return new roe<>();
        }
    }

    public static <Z> roe<Z> c(kqk<Z> kqkVar) {
        roe<Z> roeVar = (roe) a6i.d(e.acquire());
        roeVar.b(kqkVar);
        return roeVar;
    }

    private void d() {
        this.f32748b = null;
        e.release(this);
    }

    @Override // defpackage.kqk
    public Class<Z> a() {
        return this.f32748b.a();
    }

    public final void b(kqk<Z> kqkVar) {
        this.d = false;
        this.c = true;
        this.f32748b = kqkVar;
    }

    @Override // u69.f
    public ado e() {
        return this.f32747a;
    }

    public synchronized void f() {
        this.f32747a.c();
        if (!this.c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.c = false;
        if (this.d) {
            recycle();
        }
    }

    @Override // defpackage.kqk
    public Z get() {
        return this.f32748b.get();
    }

    @Override // defpackage.kqk
    public int getSize() {
        return this.f32748b.getSize();
    }

    @Override // defpackage.kqk
    public synchronized void recycle() {
        this.f32747a.c();
        this.d = true;
        if (!this.c) {
            this.f32748b.recycle();
            d();
        }
    }
}
