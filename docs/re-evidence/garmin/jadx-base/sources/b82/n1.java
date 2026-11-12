package b82;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n1 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1.a f16698b;

    public /* synthetic */ n1(q1.a aVar, int i14) {
        this.f16697a = i14;
        this.f16698b = aVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f16697a;
        q1.a aVar = this.f16698b;
        switch (i14) {
            case 0:
                q1 q1Var = q1.f16749a;
                aVar.d();
                break;
            case 1:
                q1 q1Var2 = q1.f16749a;
                aVar.b();
                break;
            case 2:
                q1 q1Var3 = q1.f16749a;
                aVar.a();
                break;
            default:
                q1 q1Var4 = q1.f16749a;
                aVar.c();
                break;
        }
        return Unit.INSTANCE;
    }
}
