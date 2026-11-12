package tp0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import f12.l;
import gl1.y;
import java.text.DecimalFormat;
import java.text.ParseException;
import lc.u0;
import o4.d0;
import o70.t;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import r53.i;
import r70.q;
import r70.r;
import s9.c;
import t21.l0;
import u4.d;
import yz1.a0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltp0/b;", "Lr70/r;", "Lup0/a;", "stateHolder", "<init>", "(Lup0/a;)V", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final up0.a f165938a;

    public b(up0.a aVar) {
        aVar.getClass();
        this.f165938a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(h4.r rVar, q qVar, m mVar, int i14) throws ParseException {
        int i15;
        o0 o0Var;
        Double dValueOf;
        Double d14;
        Double d15;
        o0 o0VarQ = u0.q(rVar, qVar, mVar, 1877737428);
        if ((i14 & 6) == 0) {
            i15 = (o0VarQ.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.r(this) ? 256 : 128;
        }
        final int i16 = 0;
        if (o0VarQ.n(i15 & 1, (i15 & 131) != 130)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarQ.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = (i) this.f165938a.f172146a.invoke();
                o0VarQ.K(objQ);
            }
            a0.a aVar = (a0.a) c.b((i) objQ, null, o0VarQ, 48).getF182175a();
            String strQ = y.Q(o0VarQ, R.string.lbl_hydration_title);
            Context context = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
            op0.b.a aVar2 = op0.b.f133168a;
            gg1.n nVarD0 = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).d0();
            aVar2.getClass();
            final q22.b bVarA = op0.b.a.a(nVarD0);
            final wp0.a aVar3 = new wp0.a(new l22.a(context));
            Double dValueOf2 = (aVar == null || (d15 = aVar.f200239b) == null) ? null : Double.valueOf(aVar3.f(d15.doubleValue(), bVarA));
            if (aVar == null || (d14 = aVar.f200240c) == null) {
                dValueOf = null;
            } else {
                double dDoubleValue = d14.doubleValue();
                bVarA.getClass();
                String strC = aVar3.c(dDoubleValue, bVarA);
                wp0.a.f186524b.getClass();
                Number number = wp0.a.C3469a.b(bVarA).parse(strC);
                dValueOf = Double.valueOf(number != null ? number.doubleValue() : 0.0d);
            }
            wp0.a.f186524b.getClass();
            final DecimalFormat decimalFormatA = wp0.a.C3469a.a(bVarA);
            final DecimalFormat decimalFormatA2 = wp0.a.C3469a.a(bVarA);
            boolean zK = o0VarQ.k(bVarA.ordinal()) | o0VarQ.r(aVar3) | o0VarQ.r(decimalFormatA);
            Object objQ2 = o0VarQ.q();
            if (zK || objQ2 == c2565a) {
                objQ2 = new e23.l() { // from class: tp0.a
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        Double d16 = (Double) obj;
                        switch (i16) {
                            case 0:
                                double dDoubleValue2 = d16 != null ? d16.doubleValue() : 0.0d;
                                wp0.a.C3469a c3469a = wp0.a.f186524b;
                                return aVar3.b(dDoubleValue2, bVarA, false, decimalFormatA, false);
                            default:
                                if (d16 == null) {
                                    return "";
                                }
                                double dDoubleValue3 = d16.doubleValue();
                                wp0.a.C3469a c3469a2 = wp0.a.f186524b;
                                return aVar3.b(dDoubleValue3, bVarA, true, decimalFormatA, false);
                        }
                    }
                };
                o0VarQ.K(objQ2);
            }
            e23.l lVar = (e23.l) objQ2;
            boolean zR = o0VarQ.r(aVar3) | o0VarQ.k(bVarA.ordinal()) | o0VarQ.r(decimalFormatA2);
            Object objQ3 = o0VarQ.q();
            if (zR || objQ3 == c2565a) {
                final int i17 = 1;
                objQ3 = new e23.l() { // from class: tp0.a
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        Double d16 = (Double) obj;
                        switch (i17) {
                            case 0:
                                double dDoubleValue2 = d16 != null ? d16.doubleValue() : 0.0d;
                                wp0.a.C3469a c3469a = wp0.a.f186524b;
                                return aVar3.b(dDoubleValue2, bVarA, false, decimalFormatA2, false);
                            default:
                                if (d16 == null) {
                                    return "";
                                }
                                double dDoubleValue3 = d16.doubleValue();
                                wp0.a.C3469a c3469a2 = wp0.a.f186524b;
                                return aVar3.b(dDoubleValue3, bVarA, true, decimalFormatA2, false);
                        }
                    }
                };
                o0VarQ.K(objQ3);
            }
            e23.l lVar2 = (e23.l) objQ3;
            String strQ2 = y.Q(o0VarQ, R.string.hydration_card_no_data_state_message);
            boolean zR2 = o0VarQ.r(context);
            Object objQ4 = o0VarQ.q();
            if (zR2 || objQ4 == c2565a) {
                objQ4 = new s70.r(context, 21);
                o0VarQ.K(objQ4);
            }
            e23.a aVar4 = (e23.a) objQ4;
            t tVar = t.B;
            d dVarB = t.b(tVar);
            a0.a aVar5 = null;
            d0 d0VarE = tVar.e(null, o0VarQ, 1);
            if (aVar != null) {
                yz1.d dVar = aVar.f200238a;
                i53.c<c02.c> cVar = aVar.f200241d;
                c02.c cVar2 = aVar.f200242e;
                dVar.getClass();
                aVar5 = new a0.a(dVar, dValueOf2, dValueOf, cVar, cVar2);
            }
            String strQ3 = y.Q(o0VarQ, R.string.label_last_7d);
            String strQ4 = y.Q(o0VarQ, R.string.txt_empty_page_no_data);
            String strP = y.P(R.string.lbl_add_feature_button, new Object[]{strQ}, o0VarQ);
            boolean zR3 = o0VarQ.r(context);
            Object objQ5 = o0VarQ.q();
            if (zR3 || objQ5 == c2565a) {
                objQ5 = new s70.r(context, 22);
                o0VarQ.K(objQ5);
            }
            e23.a aVar6 = (e23.a) objQ5;
            boolean zR4 = o0VarQ.r(context);
            Object objQ6 = o0VarQ.q();
            if (zR4 || objQ6 == c2565a) {
                objQ6 = new s70.r(context, 23);
                o0VarQ.K(objQ6);
            }
            o0Var = o0VarQ;
            yz1.d0.b(rVar, strQ, dVarB, d0VarE, aVar5, lVar, lVar2, strQ3, strQ4, null, null, R.drawable.ic_gcm_add_16, 0.0f, strP, aVar4, aVar6, (e23.a) objQ6, yz1.d0.c(aVar), strQ2, Integer.valueOf(R.string.lbl_track_hydration), aVar4, o0Var, i15 & 14, 5632);
        } else {
            o0Var = o0VarQ;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l0(this, rVar, qVar, false, i14, 7);
        }
    }
}
