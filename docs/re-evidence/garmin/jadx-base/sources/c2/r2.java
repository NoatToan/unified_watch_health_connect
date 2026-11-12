package c2;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r2 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22857a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f22859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f22861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f22862f;

    public /* synthetic */ r2(t3 t3Var, int i14, f5.v1 v1Var, int i15, f5.b1 b1Var) {
        this.f22860d = t3Var;
        this.f22858b = i14;
        this.f22861e = v1Var;
        this.f22859c = i15;
        this.f22862f = b1Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f22857a) {
            case 0:
                f5.v1[] v1VarArr = (f5.v1[]) this.f22860d;
                s2 s2Var = (s2) this.f22861e;
                int[] iArr = (int[]) this.f22862f;
                f5.v1.a aVar = (f5.v1.a) obj;
                int length = v1VarArr.length;
                int i14 = 0;
                int i15 = 0;
                while (i14 < length) {
                    f5.v1 v1Var = v1VarArr[i14];
                    int i16 = i15 + 1;
                    v1Var.getClass();
                    Object f81969t = v1Var.getF81969t();
                    p2 p2Var = f81969t instanceof p2 ? (p2) f81969t : null;
                    f0 f0Var = p2Var != null ? p2Var.f22813c : null;
                    int i17 = this.f22858b;
                    aVar.r(v1Var, iArr[i15], f0Var != null ? f0Var.a(i17, g6.o.Ltr, v1Var, this.f22859c) : s2Var.f22872b.a(v1Var.f69145b, i17), 0.0f);
                    i14++;
                    i15 = i16;
                }
                break;
            default:
                t3 t3Var = (t3) this.f22860d;
                f5.v1 v1Var2 = (f5.v1) this.f22861e;
                f5.v1.a.y((f5.v1.a) obj, v1Var2, t3Var.f22884c.invoke(g6.m.a((((long) (this.f22858b - v1Var2.f69144a)) << 32) | (((long) (this.f22859c - v1Var2.f69145b)) & 4294967295L)), ((f5.b1) this.f22862f).getF68887b()).f76005a);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ r2(f5.v1[] v1VarArr, s2 s2Var, int i14, int i15, int[] iArr) {
        this.f22860d = v1VarArr;
        this.f22861e = s2Var;
        this.f22858b = i14;
        this.f22859c = i15;
        this.f22862f = iArr;
    }
}
