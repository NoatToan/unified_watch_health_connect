package p40;

import c2.c1;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import l72.x0;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class o implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q40.b f135709b;

    public /* synthetic */ o(q40.b bVar, int i14) {
        this.f135708a = i14;
        this.f135709b = bVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f135708a;
        q40.b bVar = this.f135709b;
        switch (i14) {
            case 0:
                c1 c1Var = (c1) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                c1Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(c1Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    x0 x0Var = x0.f111346a;
                    String str = bVar.f142576c;
                    String strQ = gl1.y.Q(mVar, R.string.lbl_location);
                    String str2 = bVar.f142577d;
                    int i15 = (iIntValue & 14) | (x0.f111348c << 24);
                    x0Var.a(i15, 116, null, c1Var, null, null, str, strQ, str2, null, mVar);
                    x0Var.a(i15, 116, null, c1Var, null, null, bVar.f142578e, gl1.y.Q(mVar, R.string.activity_details_elevation), bVar.f142579f, null, mVar);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                c1 c1Var2 = (c1) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                c1Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(c1Var2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    x0 x0Var2 = x0.f111346a;
                    String str3 = bVar.f142576c;
                    String strQ2 = gl1.y.Q(mVar2, R.string.lbl_location);
                    String str4 = bVar.f142577d;
                    int i16 = (iIntValue2 & 14) | (x0.f111348c << 24);
                    x0Var2.a(i16, 116, null, c1Var2, null, null, str3, strQ2, str4, null, mVar2);
                    x0Var2.a(i16, 116, null, c1Var2, null, null, bVar.f142578e, gl1.y.Q(mVar2, R.string.activity_details_elevation), bVar.f142579f, null, mVar2);
                } else {
                    mVar2.e();
                }
                break;
            default:
                p3.m mVar3 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                ((r1.e0) obj).getClass();
                x1 x1Var3 = p3.n.f135158a;
                h4.r.a aVar = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                j92.e eVar = j92.b.f97899b;
                h4.r rVarA = c2.l.A(c2.l.A(aVar, eVar.f97920e, 0.0f, 2), 0.0f, eVar.f97917b, 1);
                d92.b.f58624b.getClass();
                mh.c(androidx.core.view.j.f(bVar.f142575b.length(), "/15"), rVarA, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar3), mVar3, 0, 0, 131068);
                break;
        }
        return Unit.INSTANCE;
    }
}
