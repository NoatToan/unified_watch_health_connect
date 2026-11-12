package o62;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import mt0.s1;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f129702b;

    public /* synthetic */ k(l lVar, int i14) {
        this.f129701a = i14;
        this.f129702b = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:31:0x0109  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f129701a;
        l lVar = this.f129702b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i15 = l.f129705g;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    lVar.g(mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                h82.r rVar = (h82.r) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i16 = l.f129705g;
                rVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(rVar) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    int i17 = (iIntValue2 << 3) & 112;
                    rVar.D(R.string.power_curve_target_help_title, mVar2, i17);
                    int i18 = (iIntValue2 << 6) & 896;
                    rVar.l(R.string.power_curve_target_help_intro, i18, 2, null, mVar2);
                    rVar.o(R.string.power_curve_target_help_msg1, i18, 2, null, mVar2);
                    rVar.t(R.string.power_curve_target_help_subtitle1, mVar2, i17);
                    rVar.o(R.string.power_curve_target_help_msg2, i18, 2, null, mVar2);
                    if (lVar.f129706f) {
                        mVar2.C(1266129607);
                        rVar.q(gl1.y.P(R.string.string_space_string_pattern, new Object[]{gl1.y.Q(mVar2, R.string.power_curve_target_help_msg3), gl1.y.Q(mVar2, R.string.power_curve_target_help_incomplete_data_extra_msg)}, mVar2), mVar2, i17);
                        mVar2.f();
                    } else {
                        mVar2.C(1266483999);
                        rVar.o(R.string.power_curve_target_help_msg3, i18, 2, null, mVar2);
                        mVar2.f();
                    }
                    rVar.t(R.string.power_curve_target_help_subtitle2, mVar2, i17);
                    rVar.o(R.string.power_curve_target_help_msg4, i18, 2, null, mVar2);
                    Context context = (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b);
                    boolean zR = mVar2.r(lVar) | mVar2.r(context);
                    Object objQ = mVar2.q();
                    p3.m.a aVar = p3.m.f135153a;
                    if (zR) {
                        objQ = new s1(18, lVar, context);
                        mVar2.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new s1(18, lVar, context);
                            mVar2.K(objQ);
                        }
                    }
                    int i19 = (iIntValue2 << 9) & 7168;
                    rVar.v((e23.a) objQ, R.string.power_curve_target_help_link1, mVar2, i19);
                    f12.l.f68084a.getClass();
                    if (f12.l.a.a().I()) {
                        mVar2.C(1266965491);
                        rVar.c(mVar2, iIntValue2 & 14);
                        boolean zR2 = mVar2.r(context);
                        Object objQ2 = mVar2.q();
                        if (zR2) {
                            objQ2 = new l71.g(context, 15);
                            mVar2.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new l71.g(context, 15);
                                mVar2.K(objQ2);
                            }
                        }
                        rVar.v((e23.a) objQ2, R.string.power_curve_target_help_link2, mVar2, i19);
                        mVar2.f();
                    } else {
                        mVar2.C(1267238415);
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
