package b71;

import android.os.Parcelable;
import e2.i0;
import e2.k0;
import l72.p2;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;
import x91.r;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.c f16360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f16361c;

    public /* synthetic */ m(int i14, e23.l lVar, i53.c cVar) {
        this.f16359a = 2;
        this.f16360b = cVar;
        this.f16361c = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008c  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f0  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f16359a;
        p3.m.a aVar = p3.m.f135153a;
        i53.c<fg0.k> cVar = this.f16360b;
        e23.l lVar = this.f16361c;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    i0 i0VarA = k0.a(0, 0, 3, mVar);
                    f82.b bVar = new f82.b();
                    boolean zB = mVar.B(lVar);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new n(lVar, 0, (byte) 0);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new n(lVar, 0, (byte) 0);
                            mVar.K(objQ);
                        }
                    }
                    e82.a.b(this.f16360b, bVar, i0VarA, null, null, (e23.p) objQ, mVar, 0, 24);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    for (fg0.k kVar : cVar) {
                        p2 p2Var = p2.f111205a;
                        Parcelable.Creator<fg0.k> creator = fg0.k.CREATOR;
                        String strR = kVar.r(false);
                        if (strR == null) {
                            strR = "";
                        }
                        LocalDate date = kVar.getDate();
                        String string = date != null ? date.toString("MMMM d, yyyy") : null;
                        if (string == null) {
                            string = "";
                        }
                        d50.a.f57509a.getClass();
                        z3.e eVar = d50.a.f57510b;
                        boolean zB2 = mVar2.B(lVar) | mVar2.r(kVar);
                        Object objQ2 = mVar2.q();
                        if (zB2) {
                            objQ2 = new d50.g(lVar, kVar, 0);
                            mVar2.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new d50.g(lVar, kVar, 0);
                                mVar2.K(objQ2);
                            }
                        }
                        p2Var.h(strR, string, null, null, null, false, false, eVar, null, null, (e23.a) objQ2, mVar2, 12582912, 0, 892);
                    }
                    x1 x1Var3 = p3.n.f135158a;
                } else {
                    mVar2.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                r.a(cVar, lVar, (p3.m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ m(i53.c cVar, e23.l lVar, int i14, byte b14) {
        this.f16359a = i14;
        this.f16360b = cVar;
        this.f16361c = lVar;
    }
}
