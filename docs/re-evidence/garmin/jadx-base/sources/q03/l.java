package q03;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l<T> implements o<T> {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f142049a;

        static {
            int[] iArr = new int[q03.a.values().length];
            f142049a = iArr;
            try {
                iArr[q03.a.DROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f142049a[q03.a.LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f142049a[q03.a.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f142049a[q03.a.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // q03.o
    public final void b(p<? super T> pVar) {
        w03.b.a(pVar, "observer is null");
        try {
            f(pVar);
        } catch (NullPointerException e4) {
            throw e4;
        } catch (Throwable th3) {
            t03.a.a(th3);
            k13.a.b(th3);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th3);
            throw nullPointerException;
        }
    }

    public final y03.i d(u03.d dVar, u03.d dVar2) {
        return e(dVar, dVar2, w03.a.f181171b, w03.a.f181172c);
    }

    public final y03.i e(u03.d dVar, u03.d dVar2, u03.a aVar, u03.d dVar3) {
        w03.b.a(dVar2, "onError is null");
        w03.b.a(aVar, "onComplete is null");
        w03.b.a(dVar3, "onSubscribe is null");
        y03.i iVar = new y03.i(dVar, dVar2, aVar, dVar3);
        b(iVar);
        return iVar;
    }

    public abstract void f(p<? super T> pVar);

    public final d13.v g(q qVar) {
        w03.b.a(qVar, "scheduler is null");
        return new d13.v(this, qVar);
    }

    public final g<T> h(q03.a aVar) {
        a13.d dVar = new a13.d(this);
        int i14 = a.f142049a[aVar.ordinal()];
        if (i14 == 1) {
            return new a13.g(dVar);
        }
        if (i14 == 2) {
            return new a13.i(dVar);
        }
        if (i14 == 3) {
            return dVar;
        }
        if (i14 == 4) {
            return new a13.h(dVar);
        }
        int i15 = g.f142048a;
        w03.b.b(i15, "capacity");
        return new a13.f(dVar, i15, true, false, w03.a.f181171b);
    }
}
