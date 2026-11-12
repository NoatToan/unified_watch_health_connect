package d82;

import c2.c1;
import e23.q;
import gl1.y;
import j82.e;
import j82.f;
import java.util.Iterator;
import l72.g3;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import us1.i;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.c f58386b;

    public /* synthetic */ c(i53.c cVar, int i14) {
        this.f58385a = i14;
        this.f58386b = cVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f58385a;
        i53.c cVar = this.f58386b;
        c1 c1Var = (c1) obj;
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i14) {
            case 0:
                c1Var.getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = n.f135158a;
                    Iterator<E> it = cVar.iterator();
                    while (it.hasNext()) {
                        d.b((a) it.next(), mVar, 0);
                    }
                    x1 x1Var2 = n.f135158a;
                } else {
                    mVar.e();
                }
                break;
            case 1:
                c1Var.getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var3 = n.f135158a;
                    Iterator<E> it3 = cVar.iterator();
                    while (it3.hasNext()) {
                        g3.a(0, 2, null, y.Q(mVar, ((i) it3.next()).f172418b), mVar);
                    }
                    x1 x1Var4 = n.f135158a;
                } else {
                    mVar.e();
                }
                break;
            default:
                c1Var.getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var5 = n.f135158a;
                    Iterator<E> it4 = cVar.iterator();
                    while (it4.hasNext()) {
                        e.i((f) it4.next(), null, mVar, 0, 2);
                    }
                    x1 x1Var6 = n.f135158a;
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
