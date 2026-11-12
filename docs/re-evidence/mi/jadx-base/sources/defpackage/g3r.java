package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class g3r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final asr f18564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw6 f18565b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public g3r(aw6 aw6Var) {
        if (aw6Var == null) {
            throw new NullPointerException("digest == null");
        }
        this.f18565b = aw6Var;
        int iH = fsr.h(aw6Var);
        this.c = iH;
        this.d = 16;
        int iCeil = (int) Math.ceil(((double) (iH * 8)) / ((double) fsr.n(16)));
        this.f = iCeil;
        int iFloor = ((int) Math.floor(fsr.n((16 - 1) * iCeil) / fsr.n(16))) + 1;
        this.g = iFloor;
        int i = iCeil + iFloor;
        this.e = i;
        f3r f3rVarB = f3r.b(aw6Var.getAlgorithmName(), iH, 16, i);
        this.f18564a = f3rVarB;
        if (f3rVarB != null) {
            return;
        }
        throw new IllegalArgumentException("cannot find OID for digest algorithm: " + aw6Var.getAlgorithmName());
    }

    public aw6 a() {
        return this.f18565b;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.e;
    }

    public int d() {
        return this.d;
    }
}
