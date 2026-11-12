package p21;

import com.garmin.android.apps.connectmobile.R;
import e23.p;
import gl1.y;
import h4.r;
import i3.ff;
import i3.hf;
import i3.mh;
import l72.p2;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import q21.q;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f135018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f135019c;

    public /* synthetic */ j(q qVar, e23.l lVar, int i14) {
        this.f135017a = i14;
        this.f135018b = qVar;
        this.f135019c = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f135017a;
        q qVar = this.f135018b;
        int i15 = 1;
        m mVar = (m) obj;
        switch (i14) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    p2.f111205a.g(y.Q(mVar, R.string.auto_adjust_calorie_goal_settings), null, null, null, z3.f.c(2071413809, new j(qVar, this.f135019c, i15), mVar), false, false, null, mVar, 24576, 494);
                    r.a aVar = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    r rVarZ = c2.l.z(aVar, eVar.f97920e, eVar.f97917b);
                    String strQ = y.Q(mVar, R.string.msg_auto_adjust_calories);
                    d92.b.f58624b.getClass();
                    mh.c(strQ, rVarZ, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar), mVar, 0, 0, 131068);
                } else {
                    mVar.e();
                }
                break;
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    hf.a(qVar.f142279b, this.f135019c, null, false, d92.c.a(ff.f88115a, mVar), mVar, 0, 92);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
