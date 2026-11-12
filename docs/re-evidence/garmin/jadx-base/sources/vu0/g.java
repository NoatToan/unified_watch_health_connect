package vu0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import e23.q;
import gl1.y;
import h82.r;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f180241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f180242c;

    public /* synthetic */ g(j jVar, Context context, int i14) {
        this.f180240a = i14;
        this.f180241b = jVar;
        this.f180242c = context;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:51:0x0178  */
    /* JADX WARN: Code duplicated, block: B:64:0x0206  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f180240a;
        m.a aVar = m.f135153a;
        Context context = this.f180242c;
        j jVar = this.f180241b;
        int i15 = 9;
        int i16 = 2;
        int i17 = 4;
        int i18 = 1;
        r rVar = (r) obj;
        m mVar = (m) obj2;
        switch (i14) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                int i19 = j.f180247o;
                rVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(rVar) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = n.f135158a;
                    int i24 = (iIntValue << 3) & 112;
                    rVar.D(R.string.livetrack_use_custom_url, mVar, i24);
                    rVar.m((iIntValue << 6) & 896, 2, y.Q(mVar, R.string.livetrack_profile_url_description_2), null, mVar);
                    if (jVar.f180253k) {
                        mVar.C(-288562492);
                        mVar.f();
                    } else {
                        mVar.C(-288821962);
                        String strQ = y.Q(mVar, R.string.livetrack_connect_plus_learn_more);
                        boolean zR = mVar.r(context);
                        Object objQ = mVar.q();
                        if (zR) {
                            objQ = new tz1.h(context, i15);
                            mVar.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new tz1.h(context, i15);
                                mVar.K(objQ);
                            }
                        }
                        rVar.w(strQ, null, (e23.a) objQ, mVar, (iIntValue << 9) & 7168, 2);
                        mVar.f();
                    }
                    int i25 = i24 | 6;
                    rVar.j(z3.f.c(1687748581, new h(rVar, i18), mVar), mVar, i25);
                    rVar.j(z3.f.c(1009575822, new h(rVar, i16), mVar), mVar, i25);
                    rVar.j(z3.f.c(-27434579, new h(rVar, 3), mVar), mVar, i25);
                    if (jVar.f180255m == null) {
                        mVar.C(-287819113);
                        mVar.f();
                    } else {
                        mVar.C(-287819112);
                        rVar.t(R.string.livetrack_delete_profile, mVar, i24);
                        String string = context.getString(R.string.livetrack_delete_profile_description);
                        string.getClass();
                        boolean zR2 = ((iIntValue & 14) == 4) | mVar.r(jVar);
                        Object objQ2 = mVar.q();
                        if (zR2) {
                            objQ2 = new i(rVar, jVar);
                            mVar.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == m.a.f135155b) {
                                objQ2 = new i(rVar, jVar);
                                mVar.K(objQ2);
                            }
                        }
                        rVar.w(string, null, (e23.a) objQ2, mVar, (iIntValue << 9) & 7168, 2);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                int i26 = j.f180247o;
                rVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar.B(rVar) ? 4 : 2;
                }
                if (mVar.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = n.f135158a;
                    int i27 = (iIntValue2 << 3) & 112;
                    rVar.D(R.string.lbl_sharing, mVar, i27);
                    rVar.l(R.string.msg_livetrack_link_sharing_options, (iIntValue2 << 6) & 896, 2, null, mVar);
                    int i28 = i27 | 6;
                    rVar.j(z3.f.c(-1397616915, new h(rVar, i17), mVar), mVar, i28);
                    if (jVar.f180252j) {
                        mVar.C(-116992662);
                        rVar.j(z3.f.c(-551857464, new tb0.h(rVar, 28, jVar, context), mVar), mVar, i28);
                        mVar.f();
                    } else {
                        mVar.C(-116435282);
                        mVar.f();
                    }
                    rVar.j(z3.f.c(-1316119900, new h(rVar, 5), mVar), mVar, i28);
                    if (jVar.f180252j) {
                        mVar.C(-116209447);
                        rVar.t(R.string.lbl_profile_url, mVar, i27);
                        String strQ2 = y.Q(mVar, R.string.livetrack_profile_url_description_1);
                        boolean zR3 = mVar.r(context);
                        Object objQ3 = mVar.q();
                        if (zR3) {
                            objQ3 = new tz1.h(context, 10);
                            mVar.K(objQ3);
                        } else {
                            aVar.getClass();
                            if (objQ3 == m.a.f135155b) {
                                objQ3 = new tz1.h(context, 10);
                                mVar.K(objQ3);
                            }
                        }
                        rVar.w(strQ2, null, (e23.a) objQ3, mVar, (iIntValue2 << 9) & 7168, 2);
                        mVar.f();
                    } else {
                        mVar.C(-115881746);
                        mVar.f();
                    }
                    rVar.j(z3.f.c(-1193215963, new h(rVar, 6), mVar), mVar, i28);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
