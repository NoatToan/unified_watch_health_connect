package ew1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class w2 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.r0 f66825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f66826c;

    public /* synthetic */ w2(p005kotlin.jvm.internal.r0 r0Var, p3.p1 p1Var, int i14) {
        this.f66824a = i14;
        this.f66825b = r0Var;
        this.f66826c = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v15, types: [T, jv1.d0] */
    /* JADX WARN: Type inference failed for: r8v2, types: [T, jv1.d0] */
    /* JADX WARN: Type inference failed for: r8v5, types: [T, jv1.d0] */
    /* JADX WARN: Type inference failed for: r8v9, types: [T, jv1.d0] */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f66824a;
        p3.p1 p1Var = this.f66826c;
        p005kotlin.jvm.internal.r0 r0Var = this.f66825b;
        switch (i14) {
            case 0:
                hv1.i iVar = (hv1.i) obj;
                x2.a aVar = x2.f66834d;
                iVar.getClass();
                p1Var.setValue(iVar);
                r0Var.f105810a = jv1.d0.a((jv1.d0) r0Var.f105810a, iVar, null, null, 6);
                break;
            case 1:
                hv1.f fVar = (hv1.f) obj;
                x2.a aVar2 = x2.f66834d;
                fVar.getClass();
                p1Var.setValue(fVar);
                r0Var.f105810a = jv1.d0.a((jv1.d0) r0Var.f105810a, null, fVar, null, 5);
                break;
            case 2:
                hv1.j jVar = (hv1.j) obj;
                x2.a aVar3 = x2.f66834d;
                jVar.getClass();
                p1Var.setValue(jVar);
                jv1.d0 d0Var = (jv1.d0) r0Var.f105810a;
                r0Var.f105810a = jv1.d0.a(d0Var, null, null, jv1.d.a(d0Var.f101031c, jVar, 0, 6), 3);
                break;
            default:
                long jLongValue = ((Long) obj).longValue();
                x2.a aVar4 = x2.f66834d;
                int i15 = (int) jLongValue;
                p1Var.setValue(Integer.valueOf(i15));
                jv1.d0 d0Var2 = (jv1.d0) r0Var.f105810a;
                r0Var.f105810a = jv1.d0.a(d0Var2, null, null, jv1.d.a(d0Var2.f101031c, null, i15, 5), 3);
                break;
        }
        return Unit.INSTANCE;
    }
}
