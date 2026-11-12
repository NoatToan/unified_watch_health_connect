package aa2;

import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import jy0.z;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;
import ya0.c0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f2313c;

    public /* synthetic */ b(String str, e23.l lVar) {
        this.f2311a = 1;
        this.f2312b = str;
        this.f2313c = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f2311a;
        String str = this.f2312b;
        e23.l lVar = this.f2313c;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                c.b(str, lVar, (p3.m) obj, p0.t(1));
                break;
            case 1:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    String strQ = y.Q(mVar, R.string.lbl_note);
                    Object objQ = mVar.q();
                    p3.m.f135153a.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new dv0.n(7);
                        mVar.K(objQ);
                    }
                    e23.l lVar2 = (e23.l) objQ;
                    boolean zB = mVar.B(lVar);
                    Object objQ2 = mVar.q();
                    if (zB || objQ2 == c2565a) {
                        objQ2 = new ci0.f(lVar, 13);
                        mVar.K(objQ2);
                    }
                    x5.v.f188954b.getClass();
                    int i15 = x5.v.f188955c;
                    x5.p.f188918b.getClass();
                    y01.y.a(null, strQ, this.f2312b, 2000, false, lVar2, (e23.l) objQ2, null, i15, x5.p.f188920d, null, mVar, 14355456, 54, 12817);
                } else {
                    mVar.e();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                e11.x.f(str, lVar, (p3.m) obj, p0.t(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                z.a(str, lVar, (p3.m) obj, p0.t(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ml0.h.c(str, lVar, (p3.m) obj, p0.t(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                uj1.z.a(str, lVar, (p3.m) obj, p0.t(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                c0.e(str, lVar, (p3.m) obj, p0.t(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                yr.m.b(str, lVar, (p3.m) obj, p0.t(1));
                break;
            default:
                ((Integer) obj2).getClass();
                z50.g.a(str, lVar, (p3.m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ b(String str, e23.l lVar, int i14, int i15) {
        this.f2311a = i15;
        this.f2312b = str;
        this.f2313c = lVar;
    }
}
