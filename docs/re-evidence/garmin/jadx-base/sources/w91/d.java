package w91;

import androidx.lifecycle.v1;
import lc.m0;
import o53.b0;
import o53.s0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f183586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ba1.d f183587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f183588c;

    public /* synthetic */ d(ba1.d dVar, m0 m0Var, int i14) {
        this.f183586a = i14;
        this.f183587b = dVar;
        this.f183588c = m0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f183586a;
        m0 m0Var = this.f183588c;
        ba1.d dVar = this.f183587b;
        switch (i14) {
            case 0:
                ug2.x xVar = new ug2.x(m0Var, 16);
                dVar.getClass();
                w9.a aVarA = v1.a(dVar);
                x53.c cVar = s0.f129406a;
                ge1.b.T(aVarA, x53.b.f189152a, null, new ba1.k(dVar, xVar, null), 2);
                break;
            case 1:
                dVar.getClass();
                dVar.K4(false);
                m0Var.n();
                break;
            case 2:
                dVar.J4(false);
                ug2.x xVar2 = new ug2.x(m0Var, 17);
                w9.a aVarA2 = v1.a(dVar);
                x53.c cVar2 = s0.f129406a;
                ge1.b.T(aVarA2, x53.b.f189152a, null, new ba1.k(dVar, xVar2, null), 2);
                break;
            case 3:
                a aVar = new a(dVar, m0Var, 4);
                dVar.getClass();
                r91.a aVar2 = dVar.f16984j;
                a42.i iVar = new a42.i(23, dVar, aVar);
                ba1.c cVar3 = new ba1.c(dVar, 0);
                aVar2.getClass();
                q91.d dVar2 = ((aa1.c) aVar2.f151363e.f150540a.getValue()).f2234b;
                if (dVar2 != null) {
                    b0 b0Var = aVar2.f151361c;
                    x53.c cVar4 = s0.f129406a;
                    ge1.b.T(b0Var, x53.b.f189152a, null, new r91.b(aVar2, dVar2, iVar, cVar3, null), 2);
                }
                break;
            default:
                a aVar3 = new a(dVar, m0Var, 3);
                dVar.getClass();
                r91.k kVar = dVar.f16985k;
                ba1.a aVar4 = new ba1.a(dVar, 1);
                kVar.getClass();
                b0 b0Var2 = kVar.f151429c;
                x53.c cVar5 = s0.f129406a;
                ge1.b.T(b0Var2, x53.b.f189152a, null, new r91.g(kVar, aVar3, aVar4, null), 2);
                break;
        }
        return Unit.INSTANCE;
    }
}
