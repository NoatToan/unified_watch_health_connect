package androidx.media3.exoplayer;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends androidx.media3.common.d0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f8662e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.t f8664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f8665d;

    public a(boolean z14, androidx.media3.exoplayer.source.t tVar) {
        this.f8665d = z14;
        this.f8664c = tVar;
        this.f8663b = tVar.getLength();
    }

    @Override // androidx.media3.common.d0
    public final int a(boolean z14) {
        if (this.f8663b != 0) {
            if (this.f8665d) {
                z14 = false;
            }
            int firstIndex = z14 ? this.f8664c.getFirstIndex() : 0;
            while (x(firstIndex).p()) {
                firstIndex = w(firstIndex, z14);
                if (firstIndex == -1) {
                }
            }
            return x(firstIndex).a(z14) + v(firstIndex);
        }
        return -1;
    }

    @Override // androidx.media3.common.d0
    public final int b(Object obj) {
        int iB;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iQ = q(obj2);
        if (iQ == -1 || (iB = x(iQ).b(obj3)) == -1) {
            return -1;
        }
        return u(iQ) + iB;
    }

    @Override // androidx.media3.common.d0
    public final int c(boolean z14) {
        int i14 = this.f8663b;
        if (i14 != 0) {
            if (this.f8665d) {
                z14 = false;
            }
            androidx.media3.exoplayer.source.t tVar = this.f8664c;
            int lastIndex = z14 ? tVar.getLastIndex() : i14 - 1;
            while (x(lastIndex).p()) {
                if (z14) {
                    lastIndex = tVar.getPreviousIndex(lastIndex);
                } else {
                    lastIndex = lastIndex > 0 ? lastIndex - 1 : -1;
                }
                if (lastIndex == -1) {
                }
            }
            return x(lastIndex).c(z14) + v(lastIndex);
        }
        return -1;
    }

    @Override // androidx.media3.common.d0
    public final int e(int i14, int i15, boolean z14) {
        if (this.f8665d) {
            if (i15 == 1) {
                i15 = 2;
            }
            z14 = false;
        }
        int iS = s(i14);
        int iV = v(iS);
        int iE = x(iS).e(i14 - iV, i15 != 2 ? i15 : 0, z14);
        if (iE != -1) {
            return iV + iE;
        }
        int iW = w(iS, z14);
        while (iW != -1 && x(iW).p()) {
            iW = w(iW, z14);
        }
        if (iW != -1) {
            return x(iW).a(z14) + v(iW);
        }
        if (i15 == 2) {
            return a(z14);
        }
        return -1;
    }

    @Override // androidx.media3.common.d0
    public final androidx.media3.common.d0.b f(int i14, androidx.media3.common.d0.b bVar, boolean z14) {
        int iR = r(i14);
        int iV = v(iR);
        x(iR).f(i14 - u(iR), bVar, z14);
        bVar.f8189c += iV;
        if (z14) {
            Object objT = t(iR);
            Object obj = bVar.f8188b;
            obj.getClass();
            bVar.f8188b = Pair.create(objT, obj);
        }
        return bVar;
    }

    @Override // androidx.media3.common.d0
    public final androidx.media3.common.d0.b g(Object obj, androidx.media3.common.d0.b bVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iQ = q(obj2);
        int iV = v(iQ);
        x(iQ).g(obj3, bVar);
        bVar.f8189c += iV;
        bVar.f8188b = obj;
        return bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0033, code lost:
    
        r0 = -1;
     */
    @Override // androidx.media3.common.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int k(int i14, int i15, boolean z14) {
        int previousIndex;
        if (this.f8665d) {
            if (i15 == 1) {
                i15 = 2;
            }
            z14 = false;
        }
        int iS = s(i14);
        int iV = v(iS);
        int iK = x(iS).k(i14 - iV, i15 != 2 ? i15 : 0, z14);
        if (iK != -1) {
            return iV + iK;
        }
        androidx.media3.exoplayer.source.t tVar = this.f8664c;
        if (z14) {
            previousIndex = tVar.getPreviousIndex(iS);
        } else if (iS > 0) {
            previousIndex = iS - 1;
        }
        while (previousIndex != -1 && x(previousIndex).p()) {
            if (z14) {
                previousIndex = tVar.getPreviousIndex(previousIndex);
            } else {
                previousIndex = previousIndex > 0 ? previousIndex - 1 : -1;
            }
        }
        if (previousIndex != -1) {
            return x(previousIndex).c(z14) + v(previousIndex);
        }
        if (i15 == 2) {
            return c(z14);
        }
        return -1;
    }

    @Override // androidx.media3.common.d0
    public final Object l(int i14) {
        int iR = r(i14);
        return Pair.create(t(iR), x(iR).l(i14 - u(iR)));
    }

    @Override // androidx.media3.common.d0
    public final androidx.media3.common.d0.c m(int i14, androidx.media3.common.d0.c cVar, long j8) {
        int iS = s(i14);
        int iV = v(iS);
        int iU = u(iS);
        x(iS).m(i14 - iV, cVar, j8);
        Object objT = t(iS);
        if (!androidx.media3.common.d0.c.f8194q.equals(cVar.f8196a)) {
            objT = Pair.create(objT, cVar.f8196a);
        }
        cVar.f8196a = objT;
        cVar.f8209n += iU;
        cVar.f8210o += iU;
        return cVar;
    }

    public abstract int q(Object obj);

    public abstract int r(int i14);

    public abstract int s(int i14);

    public abstract Object t(int i14);

    public abstract int u(int i14);

    public abstract int v(int i14);

    public final int w(int i14, boolean z14) {
        if (z14) {
            return this.f8664c.getNextIndex(i14);
        }
        if (i14 < this.f8663b - 1) {
            return i14 + 1;
        }
        return -1;
    }

    public abstract androidx.media3.common.d0 x(int i14);
}
