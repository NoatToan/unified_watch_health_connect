package zu1;

import e23.p;
import jv1.c0;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f207104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f207105c;

    public /* synthetic */ g(i iVar, c0 c0Var, int i14) {
        this.f207103a = 2;
        this.f207104b = iVar;
        this.f207105c = c0Var;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f207103a;
        byte b14 = 0;
        c0 c0Var = this.f207105c;
        i iVar = this.f207104b;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                i.b bVar = i.f207108c;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(500323480, new g(iVar, c0Var, i15, b14), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                i.b bVar2 = i.f207108c;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    iVar.u6(c0Var, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                i.b bVar3 = i.f207108c;
                iVar.u6(c0Var, (m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ g(i iVar, c0 c0Var, int i14, byte b14) {
        this.f207103a = i14;
        this.f207104b = iVar;
        this.f207105c = c0Var;
    }
}
