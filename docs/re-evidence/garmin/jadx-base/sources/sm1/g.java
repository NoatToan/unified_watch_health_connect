package sm1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c22.b0;
import com.garmin.android.apps.connectmobile.R;
import java.util.Locale;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.sleep.presentation.a f160118b;

    public /* synthetic */ g(com.garmin.android.apps.connectmobile.sleep.presentation.a aVar, int i14) {
        this.f160117a = i14;
        this.f160118b = aVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f160117a;
        com.garmin.android.apps.connectmobile.sleep.presentation.a aVar = this.f160118b;
        int i15 = 0;
        int i16 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i17 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    aVar.m(mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i18 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    aVar.o(mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i19 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    aVar.n(mVar3, 0);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i24 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var4 = p3.n.f135158a;
                    aVar.q(mVar4, 0);
                } else {
                    mVar4.e();
                }
                break;
            case 4:
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                int i25 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x1 x1Var5 = p3.n.f135158a;
                    aVar.s(mVar5, 0);
                } else {
                    mVar5.e();
                }
                break;
            case 5:
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                int i26 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    x1 x1Var6 = p3.n.f135158a;
                    aVar.p(mVar6, 0);
                } else {
                    mVar6.e();
                }
                break;
            case 6:
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                int i27 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x1 x1Var7 = p3.n.f135158a;
                    aVar.r(null, mVar7, 0);
                } else {
                    mVar7.e();
                }
                break;
            case 7:
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                int i28 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    x1 x1Var8 = p3.n.f135158a;
                    aVar.l(mVar8, 0);
                } else {
                    mVar8.e();
                }
                break;
            default:
                h82.r rVar = (h82.r) obj;
                p3.m mVar9 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                int i29 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                rVar.getClass();
                int i30 = 2;
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= mVar9.B(rVar) ? 4 : 2;
                }
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    x1 x1Var9 = p3.n.f135158a;
                    Context context = (Context) mVar9.A(AndroidCompositionLocals_androidKt.f6042b);
                    int i34 = (iIntValue9 << 3) & 112;
                    rVar.D(R.string.lbl_your_body_as_you_sleep, mVar9, i34);
                    rVar.l(R.string.msg_sleep_timeline_metrics_intro_description, (iIntValue9 << 6) & 896, 2, null, mVar9);
                    if (aVar.f44254f.f44259e.f44262a) {
                        mVar9.C(-1801990183);
                        rVar.j(z3.f.c(1933536656, new a(rVar, 23), mVar9), mVar9, i34 | 6);
                        mVar9.f();
                    } else {
                        mVar9.C(-1801370338);
                        mVar9.f();
                    }
                    if (aVar.f44254f.f44259e.f44263b) {
                        mVar9.C(-1801304556);
                        rVar.j(z3.f.c(-85789191, new a(rVar, 25), mVar9), mVar9, i34 | 6);
                        mVar9.f();
                    } else {
                        mVar9.C(-1801067096);
                        rVar.j(z3.f.c(485136912, new a(rVar, 26), mVar9), mVar9, i34 | 6);
                        mVar9.f();
                    }
                    if (aVar.f44254f.f44259e.f44266e) {
                        mVar9.C(-1800797024);
                        rVar.j(z3.f.c(359748120, new a(rVar, 27), mVar9), mVar9, i34 | 6);
                        mVar9.f();
                    } else {
                        mVar9.C(-1800583682);
                        mVar9.f();
                    }
                    if (aVar.f44254f.f44259e.f44267f) {
                        mVar9.C(-1800513870);
                        rVar.j(z3.f.c(805285431, new a(rVar, 28), mVar9), mVar9, i34 | 6);
                        mVar9.f();
                    } else {
                        mVar9.C(-1800194818);
                        mVar9.f();
                    }
                    if (aVar.f44254f.f44259e.f44268g) {
                        mVar9.C(-1800068369);
                        if (b0.b(null).equalsIgnoreCase(Locale.JAPAN.getCountry())) {
                            mVar9.C(-1800004261);
                            rVar.j(z3.f.c(-437239077, new a(rVar, 29), mVar9), mVar9, i34 | 6);
                            mVar9.f();
                        } else {
                            mVar9.C(-1799601757);
                            rVar.j(z3.f.c(1313273394, new c70.b(rVar, context, 5), mVar9), mVar9, i34 | 6);
                            mVar9.f();
                        }
                        mVar9.f();
                    } else {
                        mVar9.C(-1797870562);
                        mVar9.f();
                    }
                    if (aVar.f44254f.f44259e.f44269h) {
                        mVar9.C(-1797803819);
                        rVar.j(z3.f.c(1696360053, new j(rVar, i15), mVar9), mVar9, i34 | 6);
                        mVar9.f();
                    } else {
                        mVar9.C(-1797579906);
                        mVar9.f();
                    }
                    com.garmin.android.apps.connectmobile.sleep.presentation.a.d dVar = aVar.f44254f.f44259e;
                    if (dVar.f44270i && dVar.f44263b) {
                        mVar9.C(-1797466167);
                        int i35 = i34 | 6;
                        rVar.j(z3.f.c(2141897364, new j(rVar, i16), mVar9), mVar9, i35);
                        rVar.j(z3.f.c(1772880573, new j(rVar, i30), mVar9), mVar9, i35);
                        mVar9.f();
                    } else {
                        mVar9.C(-1796861698);
                        mVar9.f();
                    }
                    if (aVar.f44254f.f44259e.f44265d) {
                        mVar9.C(-1796798458);
                        rVar.j(z3.f.c(-1707532621, new a(rVar, 24), mVar9), mVar9, i34 | 6);
                        mVar9.f();
                    } else {
                        mVar9.C(-1796590882);
                        mVar9.f();
                    }
                } else {
                    mVar9.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
