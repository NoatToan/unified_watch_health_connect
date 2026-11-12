package tz1;

import c2.t;
import com.garmin.android.apps.connectmobile.R;
import e23.q;
import h4.r;
import i3.mh;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Float f167296b;

    public /* synthetic */ a(int i14, Float f14) {
        this.f167295a = i14;
        this.f167296b = f14;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String strValueOf;
        int i14 = this.f167295a;
        Float f14 = this.f167296b;
        switch (i14) {
            case 0:
                t tVar = (t) obj;
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                tVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(tVar) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = n.f135158a;
                    strValueOf = f14 != null ? String.valueOf((int) f14.floatValue()) : null;
                    if (strValueOf == null) {
                        strValueOf = sn.a.h(mVar, -719283565, R.string.no_value, mVar);
                    } else {
                        mVar.C(-719284495);
                        mVar.f();
                    }
                    r.a aVar = r.S;
                    h4.d.f81522a.getClass();
                    r rVarC = tVar.c(aVar, h4.d.a.f81528f);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strValueOf, rVarC, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97930g, mVar), mVar, 0, 0, 131068);
                } else {
                    mVar.e();
                }
                break;
            default:
                t tVar2 = (t) obj;
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                tVar2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(tVar2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = n.f135158a;
                    strValueOf = f14 != null ? String.valueOf((int) f14.floatValue()) : null;
                    if (strValueOf == null) {
                        strValueOf = sn.a.h(mVar2, -589403759, R.string.no_value, mVar2);
                    } else {
                        mVar2.C(-589404689);
                        mVar2.f();
                    }
                    r.a aVar2 = r.S;
                    h4.d.f81522a.getClass();
                    r rVarC2 = tVar2.c(aVar2, h4.d.a.f81528f);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strValueOf, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar2), mVar2, 0, 0, 131068);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
