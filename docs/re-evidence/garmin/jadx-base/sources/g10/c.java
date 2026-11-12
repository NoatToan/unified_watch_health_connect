package g10;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.userprofile.model.g;
import e23.p;
import ew1.c2;
import gl1.y;
import h4.r;
import mh1.h;
import mh1.w;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import v62.l9;
import z3.f;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f74829b;

    public /* synthetic */ c(d dVar, int i14) {
        this.f74828a = i14;
        this.f74829b = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b2  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        String str;
        int i14 = this.f74828a;
        d dVar = this.f74829b;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                d.a aVar = d.f74830e;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, f.c(1843954381, new c(dVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                d.a aVar2 = d.f74830e;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    if (dVar.f74831a == -1 && ((str = dVar.f74832b) == null || str.length() == 0)) {
                        mVar2.C(613371045);
                        r.a aVar3 = r.S;
                        h4.d.f81522a.getClass();
                        r rVarX = x2.x(aVar3, h4.d.a.f81533k, 2);
                        s62.a.f157643a.getClass();
                        b82.n.c(l9.a(t62.b.f162798a), y.Q(mVar2, R.string.lbl_friends_not_supported), y.Q(mVar2, R.string.msg_friends_not_supported), rVarX, null, mVar2, 3072, 16);
                        mVar2.f();
                    } else {
                        mVar2.C(613851173);
                        g gVarW0 = dVar.f74833c.W0();
                        if (gVarW0 == null) {
                            mVar2.C(613851172);
                            mVar2.f();
                        } else {
                            mVar2.C(613851173);
                            w wVar = (w) dVar.f74834d.getValue();
                            String str2 = dVar.f74832b;
                            if (str2 == null) {
                                str2 = "";
                            }
                            String str3 = str2;
                            long j8 = dVar.f74831a;
                            boolean zR = mVar2.r(gVarW0) | mVar2.r(dVar);
                            Object objQ = mVar2.q();
                            if (zR) {
                                objQ = new c2(22, gVarW0, dVar);
                                mVar2.K(objQ);
                            } else {
                                m.f135153a.getClass();
                                if (objQ == m.a.f135155b) {
                                    objQ = new c2(22, gVarW0, dVar);
                                    mVar2.K(objQ);
                                }
                            }
                            h.b(wVar, gVarW0, j8, str3, (e23.a) objQ, mVar2, g.f46856f << 3);
                            mVar2 = mVar2;
                            mVar2.f();
                            Unit unit = Unit.INSTANCE;
                        }
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
