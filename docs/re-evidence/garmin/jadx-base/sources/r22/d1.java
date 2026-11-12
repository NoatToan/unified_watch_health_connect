package r22;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d1 implements s1.d, s1.f, s1.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e1 f149634a;

    @Override // r22.s1.e
    public void a(int i14, int i15) {
        e1 e1Var = this.f149634a;
        e23.l<? super Double, Unit> lVar = e1Var.Y;
        if (lVar != null) {
            lVar.invoke(Double.valueOf(e1Var.y6()));
        }
    }

    @Override // r22.s1.f
    public void b() {
        e1.a aVar = e1.Z;
        this.f149634a.z6(false);
    }

    @Override // r22.s1.d
    public void c() {
        e1.a aVar = e1.Z;
        this.f149634a.z6(true);
    }
}
