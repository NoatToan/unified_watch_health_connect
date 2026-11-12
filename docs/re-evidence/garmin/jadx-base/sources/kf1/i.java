package kf1;

import c2.c1;
import e23.q;
import java.util.ArrayList;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104640a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ if1.b f104641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o82.g f104642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f104643d;

    public /* synthetic */ i(if1.b bVar, o82.g gVar, boolean z14) {
        this.f104641b = bVar;
        this.f104642c = gVar;
        this.f104643d = z14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f104640a;
        if1.b bVar = this.f104641b;
        switch (i14) {
            case 0:
                Float f14 = (Float) obj;
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(f14) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = n.f135158a;
                    if1.c cVar = null;
                    if (f14 != null) {
                        int iFloatValue = (int) f14.floatValue();
                        ArrayList arrayList = bVar.f93197m;
                        if (arrayList != null) {
                            cVar = (if1.c) arrayList.get(iFloatValue);
                        }
                    }
                    if1.c cVar2 = cVar;
                    if (cVar2 != null) {
                        mVar.C(-391847249);
                        h.b(this.f104642c, this.f104643d, cVar2, bVar.f93193i, mVar, 512);
                        mVar.f();
                    } else {
                        mVar.C(-391723280);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c1) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = n.f135158a;
                    for (e eVar : e.f104632g) {
                        if (eVar != e.ABOVE_TOLERANCE_IMPACT_LOAD || ((Boolean) bVar.f93208x.getF182175a()).booleanValue()) {
                            if (eVar != e.NORMAL_IMPACT_LOAD || ((Boolean) bVar.f93209y.getF182175a()).booleanValue()) {
                                mVar2.C(859634879);
                                j.a(eVar, this.f104642c, this.f104643d, mVar2, 0);
                            } else {
                                mVar2.C(859528487);
                            }
                            mVar2.f();
                        } else {
                            mVar2.C(859332195);
                            mVar2.f();
                        }
                    }
                    x1 x1Var3 = n.f135158a;
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ i(o82.g gVar, boolean z14, if1.b bVar) {
        this.f104642c = gVar;
        this.f104643d = z14;
        this.f104641b = bVar;
    }
}
