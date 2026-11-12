package go1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class z implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f78326b;

    public /* synthetic */ z(a0 a0Var, int i14) {
        this.f78325a = i14;
        this.f78326b = a0Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f78325a;
        a0 a0Var = this.f78326b;
        ds1.a aVar = (ds1.a) obj;
        switch (i14) {
            case 0:
                int i15 = a0.f78205g;
                aVar.getClass();
                String str = aVar.f61092b;
                if (str != null) {
                    a0Var.f78207b.s1(str, aVar.f61093c);
                }
                break;
            default:
                aVar.getClass();
                String str2 = aVar.f61092b;
                if (str2 != null) {
                    a0Var.f78207b.s1(str2, aVar.f61093c);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
