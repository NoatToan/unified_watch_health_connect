package m40;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f116589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f116590c;

    public /* synthetic */ f(g gVar, c cVar, int i14) {
        this.f116588a = 2;
        this.f116589b = gVar;
        this.f116590c = cVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f116588a;
        byte b14 = 0;
        c cVar = this.f116590c;
        g gVar = this.f116589b;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                g.a aVar = g.f116591h;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1523438149, new f(gVar, cVar, i15, b14), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                g.a aVar2 = g.f116591h;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    gVar.z6(cVar, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                g.a aVar3 = g.f116591h;
                gVar.z6(cVar, (m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ f(g gVar, c cVar, int i14, byte b14) {
        this.f116588a = i14;
        this.f116589b = gVar;
        this.f116590c = cVar;
    }
}
