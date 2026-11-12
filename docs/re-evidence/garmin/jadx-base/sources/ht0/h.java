package ht0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import e23.q;
import f12.l;
import gl1.y;
import h82.r;
import hq.f0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import p3.y3;
import s5.l0;
import w2.a0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f85526b;

    public /* synthetic */ h(j jVar, int i14) {
        this.f85525a = i14;
        this.f85526b = jVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String lowerCase;
        String strP;
        String strP2;
        int i14;
        int i15;
        int i16 = this.f85525a;
        j jVar = this.f85526b;
        switch (i16) {
            case 0:
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i17 = j.f85529g;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = n.f135158a;
                    jVar.h(mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i18 = j.f85529g;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = n.f135158a;
                    jVar.g(mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                m mVar3 = (m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i19 = j.f85529g;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = n.f135158a;
                    jVar.i(mVar3, 0);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                r rVar = (r) obj;
                m mVar4 = (m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i24 = j.f85529g;
                rVar.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar4.B(rVar) ? 4 : 2;
                }
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var4 = n.f135158a;
                    y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                    Context context = (Context) mVar4.A(y3Var);
                    boolean zY = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
                    Object objQ = mVar4.q();
                    m.f135153a.getClass();
                    Object obj4 = m.a.f135155b;
                    if (objQ == obj4) {
                        objQ = new oi0.h(context);
                        mVar4.K(objQ);
                    }
                    oi0.h hVar = (oi0.h) objQ;
                    l3.a aVar = l3.f23124b;
                    l22.a aVarS = a0.s(mVar4);
                    double d14 = jVar.f85530f.f179717b;
                    String strQ = y.Q(mVar4, R.string.no_value);
                    aVar.getClass();
                    String strK0 = l3.a.k0(aVarS, d14, true, strQ);
                    Object objQ2 = mVar4.q();
                    if (objQ2 == obj4) {
                        objQ2 = new f0(19);
                        mVar4.K(objQ2);
                    }
                    String strB = oi0.c.B(strK0, (e23.l) objQ2, mVar4);
                    ft0.a aVar2 = ft0.a.f73439a;
                    Context context2 = (Context) mVar4.A(y3Var);
                    vs0.a aVar3 = jVar.f85530f;
                    xs0.a aVar4 = aVar3.f179716a;
                    int i25 = iIntValue4;
                    double d15 = aVar3.f179718c;
                    String strQ2 = y.Q(mVar4, R.string.no_duration_value);
                    aVar2.getClass();
                    String strA = ft0.a.a(context2, aVar4, d15, zY, true, strQ2);
                    Context context3 = (Context) mVar4.A(y3Var);
                    vs0.a aVar5 = jVar.f85530f;
                    String strB2 = ft0.a.b(context3, hVar, aVar5.f179716a, aVar5.f179718c, zY, true, y.Q(mVar4, R.string.msg_no_data_available));
                    Double d16 = jVar.f85530f.f179719d;
                    if (d16 == null) {
                        mVar4.C(-1985580898);
                        mVar4.f();
                        lowerCase = null;
                    } else {
                        mVar4.C(-341138310);
                        String strP3 = y.P(R.string.common_watts_with_format, new Object[]{l3.a.D0(context, d16.doubleValue(), false, y.Q(mVar4, R.string.no_value))}, mVar4);
                        z5.b.f202439b.getClass();
                        z5.b bVarA = z5.b.a.a();
                        l0.f157238a.getClass();
                        lowerCase = strP3.toLowerCase(bVarA.f202440a);
                        lowerCase.getClass();
                        mVar4.f();
                    }
                    if (lowerCase != null) {
                        mVar4.C(-1985256575);
                        if (jVar.f85530f.f179716a == xs0.a.ROWING) {
                            mVar4.C(-1985152539);
                            strP = y.P(R.string.rowing_lactate_threshold_dynamic_text, new Object[]{strK0, strA, lowerCase}, mVar4);
                            mVar4.f();
                        } else {
                            mVar4.C(-1985021564);
                            strP = y.P(R.string.running_lactate_threshold_dynamic_text, new Object[]{strK0, strA, lowerCase}, mVar4);
                            mVar4.f();
                        }
                        mVar4.f();
                    } else {
                        mVar4.C(-1984867587);
                        if (jVar.f85530f.f179716a == xs0.a.ROWING) {
                            mVar4.C(-1984763613);
                            strP = y.P(R.string.rowing_lactate_threshold_dynamic_text_no_power, new Object[]{strK0, strA}, mVar4);
                            mVar4.f();
                        } else {
                            mVar4.C(-1984630654);
                            strP = y.P(R.string.running_lactate_threshold_dynamic_text_no_power, new Object[]{strK0, strA}, mVar4);
                            mVar4.f();
                        }
                        mVar4.f();
                    }
                    if (lowerCase != null) {
                        mVar4.C(-1984417095);
                        if (jVar.f85530f.f179716a == xs0.a.ROWING) {
                            mVar4.C(-1984314175);
                            strP2 = y.P(R.string.rowing_lactate_threshold_dynamic_text, new Object[]{strB, strB2, lowerCase}, mVar4);
                            mVar4.f();
                        } else {
                            mVar4.C(-1984147488);
                            strP2 = y.P(R.string.running_lactate_threshold_dynamic_text, new Object[]{strB, strB2, lowerCase}, mVar4);
                            mVar4.f();
                        }
                        mVar4.f();
                    } else {
                        mVar4.C(-1983956683);
                        if (jVar.f85530f.f179716a == xs0.a.ROWING) {
                            mVar4.C(-1983853825);
                            strP2 = y.P(R.string.rowing_lactate_threshold_dynamic_text_no_power, new Object[]{strB, strB2}, mVar4);
                            mVar4.f();
                        } else {
                            mVar4.C(-1983685154);
                            strP2 = y.P(R.string.running_lactate_threshold_dynamic_text_no_power, new Object[]{strB, strB2}, mVar4);
                            mVar4.f();
                        }
                        mVar4.f();
                    }
                    rVar.D(R.string.lbl_your_lactate_threshold, mVar4, (i25 << 3) & 112);
                    int i26 = (i25 << 6) & 896;
                    rVar.p(strP, strP2, mVar4, i26);
                    rVar.o(R.string.running_lactate_threshold_reading_description, i26, 2, null, mVar4);
                } else {
                    mVar4.e();
                }
                break;
            case 4:
                r rVar2 = (r) obj;
                m mVar5 = (m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                int i27 = j.f85529g;
                rVar2.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar5.B(rVar2) ? 4 : 2;
                }
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x1 x1Var5 = n.f135158a;
                    int i28 = (iIntValue5 << 3) & 112;
                    rVar2.D(R.string.lbl_your_training_limit, mVar5, i28);
                    rVar2.o(R.string.msg_running_lactate_threshold_help1, (iIntValue5 << 6) & 896, 2, null, mVar5);
                    if (jVar.f85530f.f179716a == xs0.a.ROWING) {
                        i14 = 712891392;
                        i15 = R.string.msg_rowing_lactate_threshold_help2;
                    } else {
                        i14 = 712995583;
                        i15 = R.string.msg_running_lactate_threshold_help2;
                    }
                    rVar2.q(sn.a.h(mVar5, i14, i15, mVar5), mVar5, i28);
                    rVar2.j(z3.f.c(1917151238, new fe1.a(rVar2, 25), mVar5), mVar5, i28 | 6);
                } else {
                    mVar5.e();
                }
                break;
            default:
                r rVar3 = (r) obj;
                m mVar6 = (m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                int i29 = j.f85529g;
                rVar3.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= mVar6.B(rVar3) ? 4 : 2;
                }
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    x1 x1Var6 = n.f135158a;
                    int i30 = ((iIntValue6 << 3) & 112) | 6;
                    rVar3.k(z3.f.c(-2057907633, new f(rVar3, jVar), mVar6), mVar6, i30);
                    rVar3.a(z3.f.c(-864654778, new f(jVar, rVar3), mVar6), mVar6, i30);
                } else {
                    mVar6.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
