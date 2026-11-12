package rf;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lrf/d;", "Lrf/b;", "Lrf/g;", "strongMemoryCache", "Lrf/h;", "weakMemoryCache", "<init>", "(Lrf/g;Lrf/h;)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f152373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f152374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f152375c = new Object();

    public d(g gVar, h hVar) {
        this.f152373a = gVar;
        this.f152374b = hVar;
    }

    @Override // rf.b
    public final b.c a(b.C2864b c2864b) {
        b.c cVarA;
        synchronized (this.f152375c) {
            try {
                cVarA = this.f152373a.a(c2864b);
                if (cVarA == null) {
                    cVarA = this.f152374b.a(c2864b);
                }
                if (cVarA != null && !cVarA.f152367a.getF83538b()) {
                    synchronized (this.f152375c) {
                        this.f152373a.d(c2864b);
                        this.f152374b.d(c2864b);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return cVarA;
    }

    @Override // rf.b
    public final void b(long j8) {
        synchronized (this.f152375c) {
            this.f152373a.b(j8);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // rf.b
    public final void c(long j8) {
        synchronized (this.f152375c) {
            this.f152373a.c(j8);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // rf.b
    public final void clear() {
        synchronized (this.f152375c) {
            this.f152373a.clear();
            this.f152374b.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // rf.b
    public final long e() {
        long jE;
        synchronized (this.f152375c) {
            jE = this.f152373a.e();
        }
        return jE;
    }

    @Override // rf.b
    public final void f(b.C2864b c2864b, b.c cVar) {
        synchronized (this.f152375c) {
            long size = cVar.f152367a.getSize();
            if (size < 0) {
                throw new IllegalStateException(("Image size must be non-negative: " + size).toString());
            }
            this.f152373a.f(c2864b, cVar.f152367a, cVar.f152368b, size);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // rf.b
    public final long getMaxSize() {
        long maxSize;
        synchronized (this.f152375c) {
            maxSize = this.f152373a.getMaxSize();
        }
        return maxSize;
    }

    @Override // rf.b
    public final long getSize() {
        long size;
        synchronized (this.f152375c) {
            size = this.f152373a.getSize();
        }
        return size;
    }
}
