package yp0;

import h4.r;
import l72.x0;
import p005kotlin.Unit;
import p3.x1;
import vd0.s0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f198633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f198634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f198635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f198636d;

    public /* synthetic */ d(String str, f fVar, String str2, int i14) {
        this.f198633a = i14;
        this.f198634b = str;
        this.f198635c = fVar;
        this.f198636d = str2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f198633a;
        String str = this.f198636d;
        f fVar = this.f198635c;
        String str2 = this.f198634b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1518250069, new d(str2, fVar, str, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    x0 x0Var = x0.f111346a;
                    r.a aVar = r.S;
                    float f14 = 16;
                    g6.f.a aVar2 = g6.f.f75994b;
                    x0Var.e(c2.l.C(aVar, f14, 0.0f, f14, f14, 2), z3.f.c(1013371972, new s0(fVar, str2, 18, str), mVar2), mVar2, (x0.f111348c << 6) | 54, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
