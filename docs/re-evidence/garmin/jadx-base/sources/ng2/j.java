package ng2;

import c2.a0;
import c2.t2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.q;
import gl1.y;
import h4.r;
import i3.mh;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import s5.l0;
import zo1.r0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class j implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f126106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f126107c;

    public /* synthetic */ j(String str, boolean z14) {
        this.f126105a = 0;
        this.f126107c = str;
        this.f126106b = z14;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f126105a;
        String str = this.f126107c;
        boolean z14 = this.f126106b;
        switch (i14) {
            case 0:
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = n.f135158a;
                    bg2.g.a(str, false, z14, mVar, 48);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((t2) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = n.f135158a;
                    r.a aVar = r.S;
                    boolean z15 = !z14;
                    Object objQ = mVar2.q();
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new rw0.b(4);
                        mVar2.K(objQ);
                    }
                    r rVarA = wz1.i.a((l) objQ, aVar, z15);
                    z5.b.f202439b.getClass();
                    String strB = l0.b(str, z5.b.a.a());
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strB, rVarA, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97935l), mVar2), mVar2, 0, 0, 131068);
                } else {
                    mVar2.e();
                }
                break;
            default:
                m mVar3 = (m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = n.f135158a;
                    r.a aVar2 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    c2.l.f(x2.h(aVar2, eVar.f97918c), mVar3);
                    if (z14) {
                        mVar3.C(-2074844251);
                        r0.g(R.string.lbl_climb_rankings, mVar3, 0);
                        mVar3.f();
                    } else {
                        mVar3.C(-2074737239);
                        if (str != null) {
                            mVar3.C(-2074694211);
                            r0.h(y.P(R.string.lbl_user_climb_rankings, new Object[]{str}, mVar3), mVar3, 0);
                            mVar3.f();
                        } else {
                            mVar3.C(-2074555331);
                            r0.g(R.string.lbl_climb_rankings, mVar3, 0);
                            mVar3.f();
                        }
                        mVar3.f();
                    }
                    c2.l.f(x2.h(aVar2, eVar.f97918c), mVar3);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ j(boolean z14, String str, int i14) {
        this.f126105a = i14;
        this.f126106b = z14;
        this.f126107c = str;
    }
}
