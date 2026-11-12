package bp0;

import c2.l;
import com.garmin.android.apps.connectmobile.R;
import cq.u;
import e23.p;
import h4.r;
import hw1.e;
import java.util.ArrayList;
import l52.i;
import m92.y;
import o4.d0;
import o4.m1;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import w52.f1;
import z3.f;
import zr.h;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f19415b;

    public /* synthetic */ b(int i14, ArrayList arrayList) {
        this.f19414a = i14;
        this.f19415b = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f19414a;
        ArrayList<o13.p> arrayList = this.f19415b;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                c.b(arrayList, (m) obj, p0.t(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                u.q(arrayList, (m) obj, p0.t(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                u.m(arrayList, (m) obj, p0.t(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                u.l(arrayList, (m) obj, p0.t(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                u.n(arrayList, (m) obj, p0.t(1));
                break;
            case 5:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, f.c(-1321214802, new b(6, arrayList), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 6:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    e.a(l.C(u1.n.e(r.S, fb1.c.z(d92.b.f58623a, mVar2), m1.f128891a), 0.0f, 0.0f, 0.0f, gl.b.q(mVar2, R.dimen.spacing_normal), 7), arrayList, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
            case 7:
                i.a aVar = (i.a) obj2;
                ((l52.r) obj).getClass();
                aVar.getClass();
                if (aVar.getDepth() == 0) {
                    f1.c(arrayList, aVar);
                }
                break;
            case 8:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    for (o13.p pVar : arrayList) {
                        q71.e eVar = (q71.e) pVar.f128594a;
                        q71.b bVar = (q71.b) pVar.f128595b;
                        d0 d0VarA = d0.a(z32.e.c(eVar, mVar3));
                        String str = bVar.f143231b;
                        x1 x1Var4 = n.f135158a;
                        int i15 = z32.e.a.f202159a[eVar.ordinal()];
                        y.b(d0VarA, str, null, null, gl1.y.Q(mVar3, (i15 == 1 || i15 != 2) ? R.string.lbl_vo2_max : R.string.lbl_cycling_vo2_max), null, mVar3, 384, 40);
                    }
                    x1 x1Var5 = n.f135158a;
                } else {
                    mVar3.e();
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                zr.b.b(arrayList, (m) obj, p0.t(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                h.c(arrayList, (m) obj, p0.t(1));
                break;
            default:
                ((Integer) obj2).getClass();
                zr.i.a(arrayList, (m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ b(ArrayList arrayList, int i14, int i15) {
        this.f19414a = i15;
        this.f19415b = arrayList;
    }
}
