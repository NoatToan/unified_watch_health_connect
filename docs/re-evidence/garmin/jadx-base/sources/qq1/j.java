package qq1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.steps.presentation.StepsActivity;
import f12.l;
import gl1.y;
import ht.s;
import lc.u0;
import o4.d0;
import o70.t;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import r70.q;
import r70.r;
import yz1.a0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lqq1/j;", "Lr70/r;", "Lrq1/a;", "stateHolder", "<init>", "(Lrq1/a;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rq1.a f146073a;

    public j(rq1.a aVar) {
        aVar.getClass();
        this.f146073a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(h4.r rVar, q qVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        int i16;
        int i17;
        String strP;
        o0 o0VarQ = u0.q(rVar, qVar, mVar, 1215294177);
        if ((i14 & 6) == 0) {
            i15 = (o0VarQ.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.r(this) ? 256 : 128;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 131) != 130)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarQ.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = (r53.i) this.f146073a.f154131a.invoke();
                o0VarQ.K(objQ);
            }
            a0.a aVar = (a0.a) s9.c.b((r53.i) objQ, null, o0VarQ, 48).getF182175a();
            l.f68084a.getClass();
            final boolean zB3 = l.a.a().B3();
            final mq1.a aVar2 = (mq1.a) KoinJavaComponent.get$default(mq1.a.class, null, null, 6, null);
            final Context context = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
            if (zB3) {
                i16 = -333384567;
                i17 = R.string.lbl_pushes;
            } else {
                i16 = -333386008;
                i17 = R.string.lbl_steps;
            }
            String strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarQ, i16, i17, o0VarQ, false);
            String strQ = y.Q(o0VarQ, R.string.no_value);
            boolean zB = o0VarQ.B(strQ);
            Object objQ2 = o0VarQ.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = new o60.b(strQ, 13);
                o0VarQ.K(objQ2);
            }
            e23.l lVar = (e23.l) objQ2;
            Object objQ3 = o0VarQ.q();
            if (objQ3 == c2565a) {
                objQ3 = new qc.c(24);
                o0VarQ.K(objQ3);
            }
            e23.l lVar2 = (e23.l) objQ3;
            if (zB3) {
                o0VarQ.C(-1744214370);
                strP = y.P(R.string.lbl_pushes_number, new Object[]{lVar.invoke(aVar != null ? aVar.f200239b : null)}, o0VarQ);
                o0VarQ.g0(false);
            } else {
                o0VarQ.C(-1744412801);
                strP = y.P(R.string.lbl_steps_number, new Object[]{lVar.invoke(aVar != null ? aVar.f200239b : null)}, o0VarQ);
                o0VarQ.g0(false);
            }
            String strJ2 = zB3 ? com.airbnb.lottie.animation.keyframe.a.j(o0VarQ, -1743959550, R.string.pushes_card_no_data_state_message, o0VarQ, false) : com.airbnb.lottie.animation.keyframe.a.j(o0VarQ, -1743859389, R.string.steps_card_no_data_state_message, o0VarQ, false);
            t tVar = t.H0;
            u4.d dVarB = t.b(tVar);
            d0 d0VarE = tVar.e(null, o0VarQ, 1);
            String strQ2 = y.Q(o0VarQ, R.string.label_last_7d);
            String strQ3 = y.Q(o0VarQ, R.string.txt_empty_page_no_data);
            boolean zB2 = o0VarQ.B(strP);
            Object objQ4 = o0VarQ.q();
            if (zB2 || objQ4 == c2565a) {
                objQ4 = new defpackage.b(strP, 9);
                o0VarQ.K(objQ4);
            }
            e23.l lVar3 = (e23.l) objQ4;
            boolean zH = o0VarQ.h(zB3) | o0VarQ.r(context) | o0VarQ.r(aVar2);
            Object objQ5 = o0VarQ.q();
            if (zH || objQ5 == c2565a) {
                final int i18 = 0;
                objQ5 = new e23.a() { // from class: qq1.i
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i18) {
                            case 0:
                                s sVar = s.f85508a;
                                lt.e.k kVar = new lt.e.k(lt.e.a.TappedTop, t.H0);
                                sVar.getClass();
                                s.a(kVar);
                                boolean z14 = zB3;
                                Context context2 = context;
                                if (z14) {
                                    context2.startActivity(aVar2.b(DateTime.now(), false));
                                } else {
                                    context2.startActivity(dh.b.z(StepsActivity.class, context2, DateTime.now(), false));
                                }
                                break;
                            default:
                                s sVar2 = s.f85508a;
                                lt.e.k kVar2 = new lt.e.k(lt.e.a.TappedBottom, t.H0);
                                sVar2.getClass();
                                s.a(kVar2);
                                boolean z15 = zB3;
                                Context context3 = context;
                                if (z15) {
                                    context3.startActivity(aVar2.b(DateTime.now(), true));
                                } else {
                                    context3.startActivity(dh.b.z(StepsActivity.class, context3, DateTime.now(), true));
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarQ.K(objQ5);
            }
            e23.a aVar3 = (e23.a) objQ5;
            boolean zH2 = o0VarQ.h(zB3) | o0VarQ.r(context) | o0VarQ.r(aVar2);
            Object objQ6 = o0VarQ.q();
            if (zH2 || objQ6 == c2565a) {
                final int i19 = 1;
                objQ6 = new e23.a() { // from class: qq1.i
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i19) {
                            case 0:
                                s sVar = s.f85508a;
                                lt.e.k kVar = new lt.e.k(lt.e.a.TappedTop, t.H0);
                                sVar.getClass();
                                s.a(kVar);
                                boolean z14 = zB3;
                                Context context2 = context;
                                if (z14) {
                                    context2.startActivity(aVar2.b(DateTime.now(), false));
                                } else {
                                    context2.startActivity(dh.b.z(StepsActivity.class, context2, DateTime.now(), false));
                                }
                                break;
                            default:
                                s sVar2 = s.f85508a;
                                lt.e.k kVar2 = new lt.e.k(lt.e.a.TappedBottom, t.H0);
                                sVar2.getClass();
                                s.a(kVar2);
                                boolean z15 = zB3;
                                Context context3 = context;
                                if (z15) {
                                    context3.startActivity(aVar2.b(DateTime.now(), true));
                                } else {
                                    context3.startActivity(dh.b.z(StepsActivity.class, context3, DateTime.now(), true));
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarQ.K(objQ6);
            }
            o0Var = o0VarQ;
            yz1.d0.b(rVar, strJ, dVarB, d0VarE, aVar, lVar, lVar2, strQ2, strQ3, lVar3, null, 0, 0.0f, null, null, aVar3, (e23.a) objQ6, yz1.d0.c(aVar), strJ2, null, null, o0Var, (i15 & 14) | 1572864, 1604608);
        } else {
            o0Var = o0VarQ;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mx.h(this, rVar, qVar, i14, 14);
        }
    }
}
