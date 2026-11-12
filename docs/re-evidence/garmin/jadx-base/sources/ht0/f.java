package ht0;

import com.garmin.android.apps.connectmobile.R;
import e23.p;
import h82.r;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85520a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f85521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f85522c;

    public /* synthetic */ f(r rVar, j jVar) {
        this.f85522c = rVar;
        this.f85521b = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14;
        int i15;
        int i16 = this.f85520a;
        final j jVar = this.f85521b;
        final int i17 = 0;
        final int i18 = 1;
        switch (i16) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i19 = j.f85529g;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    String strT = gl1.d.T(jVar.f85530f.f179716a.f192069b, mVar, 0);
                    r rVar = this.f85522c;
                    rVar.E(strT, mVar, 0);
                    if (jVar.f85530f.f179716a == xs0.a.ROWING) {
                        i14 = -762852034;
                        i15 = R.string.rowing_lactate_threshold_feature_description;
                    } else {
                        i14 = -762729987;
                        i15 = R.string.running_lactate_threshold_feature_description;
                    }
                    rVar.m(0, 2, sn.a.h(mVar, i14, i15, mVar), null, mVar);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i24 = j.f85529g;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    boolean zIsNaN = Double.isNaN(jVar.f85530f.f179717b);
                    r rVar2 = this.f85522c;
                    m.a aVar = m.f135153a;
                    if (zIsNaN && Double.isNaN(jVar.f85530f.f179718c)) {
                        mVar2.C(-2011379204);
                        mVar2.f();
                    } else {
                        mVar2.C(-2011504134);
                        boolean zR = mVar2.r(jVar);
                        Object objQ = mVar2.q();
                        if (zR) {
                            objQ = new e23.a() { // from class: ht0.g
                                @Override // e23.a
                                public final Object invoke() {
                                    int i25 = i17;
                                    j jVar2 = jVar;
                                    switch (i25) {
                                        case 0:
                                            int i26 = j.f85529g;
                                            jVar2.e("READINGS_ACTION");
                                            break;
                                        default:
                                            int i27 = j.f85529g;
                                            jVar2.e("WHAT_IS_LT_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new e23.a() { // from class: ht0.g
                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i25 = i17;
                                        j jVar2 = jVar;
                                        switch (i25) {
                                            case 0:
                                                int i26 = j.f85529g;
                                                jVar2.e("READINGS_ACTION");
                                                break;
                                            default:
                                                int i27 = j.f85529g;
                                                jVar2.e("WHAT_IS_LT_ACTION");
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ);
                            }
                        }
                        rVar2.B(R.string.lbl_about_your_readings, null, false, (e23.a) objQ, mVar2, 0, 6);
                        mVar2.f();
                    }
                    boolean zR2 = mVar2.r(jVar);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new e23.a() { // from class: ht0.g
                            @Override // e23.a
                            public final Object invoke() {
                                int i25 = i18;
                                j jVar2 = jVar;
                                switch (i25) {
                                    case 0:
                                        int i26 = j.f85529g;
                                        jVar2.e("READINGS_ACTION");
                                        break;
                                    default:
                                        int i27 = j.f85529g;
                                        jVar2.e("WHAT_IS_LT_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new e23.a() { // from class: ht0.g
                                @Override // e23.a
                                public final Object invoke() {
                                    int i25 = i18;
                                    j jVar2 = jVar;
                                    switch (i25) {
                                        case 0:
                                            int i26 = j.f85529g;
                                            jVar2.e("READINGS_ACTION");
                                            break;
                                        default:
                                            int i27 = j.f85529g;
                                            jVar2.e("WHAT_IS_LT_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ2);
                        }
                    }
                    rVar2.B(R.string.lbl_what_is_lt, null, false, (e23.a) objQ2, mVar2, 0, 6);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ f(j jVar, r rVar) {
        this.f85521b = jVar;
        this.f85522c = rVar;
    }
}
