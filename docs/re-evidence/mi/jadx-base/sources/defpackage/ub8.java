package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class ub8<Z> implements kqk<Z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f35594b;
    public final kqk<Z> c;
    public final a d;
    public final pzd e;
    public int f;
    public boolean g;

    public interface a {
        void a(pzd pzdVar, ub8<?> ub8Var);
    }

    public ub8(kqk<Z> kqkVar, boolean z, boolean z2, pzd pzdVar, a aVar) {
        this.c = (kqk) a6i.d(kqkVar);
        this.f35593a = z;
        this.f35594b = z2;
        this.e = pzdVar;
        this.d = (a) a6i.d(aVar);
    }

    @Override // defpackage.kqk
    public Class<Z> a() {
        return this.c.a();
    }

    public synchronized void b() {
        if (this.g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f++;
    }

    public kqk<Z> c() {
        return this.c;
    }

    public boolean d() {
        return this.f35593a;
    }

    public void e() {
        boolean z;
        synchronized (this) {
            int i = this.f;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.f = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.d.a(this.e, this);
        }
    }

    @Override // defpackage.kqk
    public Z get() {
        return this.c.get();
    }

    @Override // defpackage.kqk
    public int getSize() {
        return this.c.getSize();
    }

    @Override // defpackage.kqk
    public synchronized void recycle() {
        if (this.f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.g = true;
        if (this.f35594b) {
            this.c.recycle();
        }
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f35593a + ", listener=" + this.d + ", key=" + this.e + ", acquired=" + this.f + ", isRecycled=" + this.g + ", resource=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }
}
