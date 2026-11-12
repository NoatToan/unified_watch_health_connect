package b5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lb5/e0;", "", "Lh5/e0;", "root", "<init>", "(Lh5/e0;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h5.e0 f15793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f15794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f15795c = new b0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h5.v f15796d = new h5.v();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15797e;

    public e0(h5.e0 e0Var) {
        this.f15793a = e0Var;
        this.f15794b = new f(e0Var.P.f81682c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int a(c0 c0Var, kotlin.m mVar, boolean z14) {
        int i14;
        Object[] objArr;
        f fVar;
        int i15;
        int i16;
        h5.v vVar = this.f15796d;
        if (this.f15797e) {
            return 0;
        }
        try {
            this.f15797e = true;
            k kVarA = this.f15795c.a(c0Var, mVar);
            p1.z<a0> zVar = kVarA.f15832a;
            int iH = zVar.h();
            while (true) {
                if (i14 >= iH) {
                    objArr = true;
                    break;
                }
                a0 a0VarI = zVar.i(i14);
                i14 = (a0VarI.f15751d || a0VarI.f15755h) ? 0 : i14 + 1;
                objArr = false;
                break;
            }
            int iH2 = zVar.h();
            int i17 = 0;
            while (true) {
                fVar = this.f15794b;
                if (i17 >= iH2) {
                    break;
                }
                a0 a0VarI2 = zVar.i(i17);
                if (objArr != false || r.b(a0VarI2)) {
                    h5.e0 e0Var = this.f15793a;
                    long j8 = a0VarI2.f15750c;
                    h5.v vVar2 = this.f15796d;
                    int i18 = a0VarI2.f15756i;
                    h5.e0.d dVar = h5.e0.N0;
                    e0Var.O(j8, vVar2, i18, true);
                    if (!vVar.f82000a.d()) {
                        fVar.a(a0VarI2.f15748a, vVar, r.b(a0VarI2));
                        vVar.clear();
                    }
                }
                i17++;
            }
            boolean zB = fVar.b(kVarA, z14);
            if (kVarA.f15834c) {
                i15 = 0;
                break;
            }
            int iH3 = zVar.h();
            int i19 = 0;
            while (true) {
                if (i19 >= iH3) {
                    i15 = 0;
                    break;
                }
                a0 a0VarI3 = zVar.i(i19);
                long jF = r.f(a0VarI3, true);
                n4.c.f123541b.getClass();
                if (!n4.c.d(jF, 0L) && a0VarI3.b()) {
                    i15 = 1;
                    break;
                }
                i19++;
            }
            int iH4 = zVar.h();
            for (int i24 = 0; i24 < iH4; i24++) {
                if (zVar.i(i24).b()) {
                    i16 = 1;
                    return (zB ? 1 : 0) | (i15 << 1) | (i16 << 2);
                }
            }
            i16 = 0;
            return (zB ? 1 : 0) | (i15 << 1) | (i16 << 2);
        } finally {
            this.f15797e = false;
        }
    }
}
