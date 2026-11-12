package xg0;

import android.content.Context;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class s implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f190844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f190845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wg0.a f190846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f190847e;

    public /* synthetic */ s(int i14, Context context, e23.a aVar, wg0.a aVar2, o oVar) {
        this.f190843a = i14;
        this.f190844b = context;
        this.f190845c = oVar;
        this.f190846d = aVar2;
        this.f190847e = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x005e  */
    /* JADX WARN: Code duplicated, block: B:27:0x00cf  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f190843a;
        p3.m.a aVar = p3.m.f135153a;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    y.f190868a.getClass();
                    z3.e eVar = y.f190869b;
                    Context context = this.f190844b;
                    boolean zR = mVar.r(context);
                    o oVar = this.f190845c;
                    boolean zR2 = zR | mVar.r(oVar);
                    wg0.a aVar2 = this.f190846d;
                    boolean zR3 = zR2 | mVar.r(aVar2);
                    e23.a aVar3 = this.f190847e;
                    boolean zB = zR3 | mVar.B(aVar3);
                    Object objQ = mVar.q();
                    if (zB) {
                        e eVar2 = new e(1, context, aVar3, aVar2, oVar);
                        mVar.K(eVar2);
                        objQ = eVar2;
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            e eVar3 = new e(1, context, aVar3, aVar2, oVar);
                            mVar.K(eVar3);
                            objQ = eVar3;
                        }
                    }
                    i3.u.b(eVar, (e23.a) objQ, null, null, null, false, null, null, mVar, 6, 508);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    z.f190870a.getClass();
                    z3.e eVar4 = z.f190871b;
                    Context context2 = this.f190844b;
                    boolean zR4 = mVar2.r(context2);
                    o oVar2 = this.f190845c;
                    boolean zR5 = zR4 | mVar2.r(oVar2);
                    wg0.a aVar4 = this.f190846d;
                    boolean zR6 = zR5 | mVar2.r(aVar4);
                    e23.a aVar5 = this.f190847e;
                    boolean zB2 = zR6 | mVar2.B(aVar5);
                    Object objQ2 = mVar2.q();
                    if (zB2) {
                        e eVar5 = new e(2, context2, aVar5, aVar4, oVar2);
                        mVar2.K(eVar5);
                        objQ2 = eVar5;
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            e eVar6 = new e(2, context2, aVar5, aVar4, oVar2);
                            mVar2.K(eVar6);
                            objQ2 = eVar6;
                        }
                    }
                    i3.u.b(eVar4, (e23.a) objQ2, null, null, null, false, null, null, mVar2, 6, 508);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
