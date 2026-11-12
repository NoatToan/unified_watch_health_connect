package t6;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class h extends e {
    public boolean B0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public float f162685w0 = -1.0f;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f162686x0 = -1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f162687y0 = -1;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public d f162688z0 = this.M;
    public int A0 = 0;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f162689a;

        static {
            int[] iArr = new int[d.a.values().length];
            f162689a = iArr;
            try {
                iArr[d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f162689a[d.a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f162689a[d.a.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f162689a[d.a.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f162689a[d.a.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f162689a[d.a.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f162689a[d.a.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f162689a[d.a.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f162689a[d.a.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public h() {
        this.U.clear();
        this.U.add(this.f162688z0);
        int length = this.T.length;
        for (int i14 = 0; i14 < length; i14++) {
            this.T[i14] = this.f162688z0;
        }
    }

    @Override // t6.e
    public final boolean C() {
        return this.B0;
    }

    @Override // t6.e
    public final boolean D() {
        return this.B0;
    }

    @Override // t6.e
    public final void V(m6.d dVar, boolean z14) {
        if (this.X == null) {
            return;
        }
        d dVar2 = this.f162688z0;
        dVar.getClass();
        int iN = m6.d.n(dVar2);
        if (this.A0 == 1) {
            this.f162607c0 = iN;
            this.f162609d0 = 0;
            O(this.X.m());
            T(0);
            return;
        }
        this.f162607c0 = 0;
        this.f162609d0 = iN;
        T(this.X.s());
        O(0);
    }

    public final void W(int i14) {
        this.f162688z0.l(i14);
        this.B0 = true;
    }

    public final void X(int i14) {
        if (this.A0 == i14) {
            return;
        }
        this.A0 = i14;
        ArrayList<d> arrayList = this.U;
        arrayList.clear();
        if (this.A0 == 1) {
            this.f162688z0 = this.L;
        } else {
            this.f162688z0 = this.M;
        }
        arrayList.add(this.f162688z0);
        d[] dVarArr = this.T;
        int length = dVarArr.length;
        for (int i15 = 0; i15 < length; i15++) {
            dVarArr[i15] = this.f162688z0;
        }
    }

    @Override // t6.e
    public final void c(m6.d dVar, boolean z14) {
        f fVar = (f) this.X;
        if (fVar == null) {
            return;
        }
        Object objK = fVar.k(d.a.LEFT);
        Object objK2 = fVar.k(d.a.RIGHT);
        e eVar = this.X;
        boolean z15 = eVar != null && eVar.W[0] == e.b.WRAP_CONTENT;
        if (this.A0 == 0) {
            objK = fVar.k(d.a.TOP);
            objK2 = fVar.k(d.a.BOTTOM);
            e eVar2 = this.X;
            z15 = eVar2 != null && eVar2.W[1] == e.b.WRAP_CONTENT;
        }
        if (this.B0) {
            d dVar2 = this.f162688z0;
            if (dVar2.f162585c) {
                m6.h hVarK = dVar.k(dVar2);
                dVar.d(hVarK, this.f162688z0.d());
                if (this.f162686x0 != -1) {
                    if (z15) {
                        dVar.f(dVar.k(objK2), hVarK, 0, 5);
                    }
                } else if (this.f162687y0 != -1 && z15) {
                    m6.h hVarK2 = dVar.k(objK2);
                    dVar.f(hVarK, dVar.k(objK), 0, 5);
                    dVar.f(hVarK2, hVarK, 0, 5);
                }
                this.B0 = false;
                return;
            }
        }
        if (this.f162686x0 != -1) {
            m6.h hVarK3 = dVar.k(this.f162688z0);
            dVar.e(hVarK3, dVar.k(objK), this.f162686x0, 8);
            if (z15) {
                dVar.f(dVar.k(objK2), hVarK3, 0, 5);
                return;
            }
            return;
        }
        if (this.f162687y0 != -1) {
            m6.h hVarK4 = dVar.k(this.f162688z0);
            m6.h hVarK5 = dVar.k(objK2);
            dVar.e(hVarK4, hVarK5, -this.f162687y0, 8);
            if (z15) {
                dVar.f(hVarK4, dVar.k(objK), 0, 5);
                dVar.f(hVarK5, hVarK4, 0, 5);
                return;
            }
            return;
        }
        if (this.f162685w0 != -1.0f) {
            m6.h hVarK6 = dVar.k(this.f162688z0);
            m6.h hVarK7 = dVar.k(objK2);
            float f14 = this.f162685w0;
            m6.b bVarL = dVar.l();
            bVarL.f116814d.k(hVarK6, -1.0f);
            bVarL.f116814d.k(hVarK7, f14);
            dVar.c(bVarL);
        }
    }

    @Override // t6.e
    public final boolean d() {
        return true;
    }

    @Override // t6.e
    public final void h(e eVar, HashMap<e, e> map) {
        super.h(eVar, map);
        h hVar = (h) eVar;
        this.f162685w0 = hVar.f162685w0;
        this.f162686x0 = hVar.f162686x0;
        this.f162687y0 = hVar.f162687y0;
        X(hVar.A0);
    }

    @Override // t6.e
    public final d k(d.a aVar) {
        int i14 = a.f162689a[aVar.ordinal()];
        if (i14 == 1 || i14 == 2) {
            if (this.A0 == 1) {
                return this.f162688z0;
            }
            return null;
        }
        if ((i14 == 3 || i14 == 4) && this.A0 == 0) {
            return this.f162688z0;
        }
        return null;
    }
}
