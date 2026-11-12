package c63;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e1 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j1 f24966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f24967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j1 f24968d;

    public /* synthetic */ e1(j1 j1Var, boolean z14, j1 j1Var2, int i14) {
        this.f24965a = i14;
        this.f24966b = j1Var;
        this.f24967c = z14;
        this.f24968d = j1Var2;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f24965a;
        j1 j1Var = this.f24968d;
        boolean z14 = this.f24967c;
        j1 j1Var2 = this.f24966b;
        s.e eVar = (s.e) obj;
        switch (i14) {
            case 0:
                eVar.getClass();
                t.a(eVar, new e23.l[]{new n(10)}, new e1(j1Var2, z14, j1Var, 1));
                break;
            default:
                eVar.getClass();
                eVar.g(r0.ZERO);
                f1.a(eVar, j1Var2, new as2.d(z14, j1Var, 4));
                break;
        }
        return Unit.INSTANCE;
    }
}
