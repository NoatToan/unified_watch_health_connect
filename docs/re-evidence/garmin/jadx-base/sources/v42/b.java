package v42;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import java.text.DecimalFormat;
import java.util.Arrays;
import lc.u0;
import o42.e;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import q42.h;
import r53.i;
import r70.q;
import r70.r;
import t21.l0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lv42/b;", "Lr70/r;", "Lw42/a;", "stateHolder", "<init>", "(Lw42/a;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w42.a f175696a;

    public b(w42.a aVar) {
        aVar.getClass();
        this.f175696a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(h4.r rVar, q qVar, m mVar, int i14) {
        int i15;
        o0 o0VarQ = u0.q(rVar, qVar, mVar, 778110110);
        final int i16 = 2;
        if ((i14 & 6) == 0) {
            i15 = (o0VarQ.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.r(this) ? 256 : 128;
        }
        final int i17 = 0;
        final int i18 = 1;
        if (o0VarQ.n(i15 & 1, (i15 & 131) != 130)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarQ.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = (i) this.f175696a.f181986a.invoke();
                o0VarQ.K(objQ);
            }
            e eVar = (e) s9.c.b((i) objQ, null, o0VarQ, 48).getF182175a();
            final h hVar = new h((Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b));
            boolean zR = o0VarQ.r(hVar);
            Object objQ2 = o0VarQ.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new l() { // from class: v42.a
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        DecimalFormat decimalFormat;
                        int iD;
                        String strH;
                        DecimalFormat decimalFormat2;
                        DecimalFormat decimalFormat3;
                        int i19 = i17;
                        h hVar2 = hVar;
                        Double d14 = (Double) obj;
                        switch (i19) {
                            case 0:
                                return h.c(hVar2, d14, null, false, 14);
                            case 1:
                                return h.e(hVar2, d14, 6);
                            case 2:
                                Context context = hVar2.f142645a;
                                double dC = k42.b.c(d14 != null ? d14.doubleValue() : Double.NaN);
                                k42.b.f102880a.getClass();
                                if (dC == 0.0d) {
                                    l3.f23124b.getClass();
                                    decimalFormat = l3.f23130h;
                                } else {
                                    l3.f23124b.getClass();
                                    decimalFormat = l3.f23133k;
                                }
                                if (((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).C1() && (iD = ((k42.a) KoinJavaComponent.get$default(k42.a.class, null, null, 6, null)).d()) != 0 && iD != 1 && iD == 2) {
                                    if (dC == 0.0d) {
                                        l3.f23124b.getClass();
                                        decimalFormat2 = l3.f23131i;
                                        decimalFormat3 = decimalFormat2;
                                    } else {
                                        l3.f23124b.getClass();
                                        decimalFormat2 = l3.f23132j;
                                        decimalFormat3 = l3.f23130h;
                                    }
                                    if (Double.isNaN(dC)) {
                                        strH = context.getString(R.string.no_value);
                                        strH.getClass();
                                    } else {
                                        String strF = k42.b.f(dC, decimalFormat2);
                                        String strE = k42.b.e(context, Math.abs(dC), decimalFormat3);
                                        x0 x0Var = x0.f105818a;
                                        String string = context.getString(R.string.stone_pound_short);
                                        string.getClass();
                                        strH = String.format(string, Arrays.copyOf(new Object[]{strF, strE}, 2));
                                    }
                                } else {
                                    strH = k42.b.h(context, dC, false, decimalFormat);
                                }
                                return k42.b.a(context, strH);
                            default:
                                return h.c(hVar2, d14, null, true, 6);
                        }
                    }
                };
                o0VarQ.K(objQ2);
            }
            l lVar = (l) objQ2;
            boolean zR2 = o0VarQ.r(hVar);
            Object objQ3 = o0VarQ.q();
            if (zR2 || objQ3 == c2565a) {
                objQ3 = new l() { // from class: v42.a
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        DecimalFormat decimalFormat;
                        int iD;
                        String strH;
                        DecimalFormat decimalFormat2;
                        DecimalFormat decimalFormat3;
                        int i19 = i18;
                        h hVar2 = hVar;
                        Double d14 = (Double) obj;
                        switch (i19) {
                            case 0:
                                return h.c(hVar2, d14, null, false, 14);
                            case 1:
                                return h.e(hVar2, d14, 6);
                            case 2:
                                Context context = hVar2.f142645a;
                                double dC = k42.b.c(d14 != null ? d14.doubleValue() : Double.NaN);
                                k42.b.f102880a.getClass();
                                if (dC == 0.0d) {
                                    l3.f23124b.getClass();
                                    decimalFormat = l3.f23130h;
                                } else {
                                    l3.f23124b.getClass();
                                    decimalFormat = l3.f23133k;
                                }
                                if (((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).C1() && (iD = ((k42.a) KoinJavaComponent.get$default(k42.a.class, null, null, 6, null)).d()) != 0 && iD != 1 && iD == 2) {
                                    if (dC == 0.0d) {
                                        l3.f23124b.getClass();
                                        decimalFormat2 = l3.f23131i;
                                        decimalFormat3 = decimalFormat2;
                                    } else {
                                        l3.f23124b.getClass();
                                        decimalFormat2 = l3.f23132j;
                                        decimalFormat3 = l3.f23130h;
                                    }
                                    if (Double.isNaN(dC)) {
                                        strH = context.getString(R.string.no_value);
                                        strH.getClass();
                                    } else {
                                        String strF = k42.b.f(dC, decimalFormat2);
                                        String strE = k42.b.e(context, Math.abs(dC), decimalFormat3);
                                        x0 x0Var = x0.f105818a;
                                        String string = context.getString(R.string.stone_pound_short);
                                        string.getClass();
                                        strH = String.format(string, Arrays.copyOf(new Object[]{strF, strE}, 2));
                                    }
                                } else {
                                    strH = k42.b.h(context, dC, false, decimalFormat);
                                }
                                return k42.b.a(context, strH);
                            default:
                                return h.c(hVar2, d14, null, true, 6);
                        }
                    }
                };
                o0VarQ.K(objQ3);
            }
            l lVar2 = (l) objQ3;
            boolean zR3 = o0VarQ.r(hVar);
            Object objQ4 = o0VarQ.q();
            if (zR3 || objQ4 == c2565a) {
                objQ4 = new l() { // from class: v42.a
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        DecimalFormat decimalFormat;
                        int iD;
                        String strH;
                        DecimalFormat decimalFormat2;
                        DecimalFormat decimalFormat3;
                        int i19 = i16;
                        h hVar2 = hVar;
                        Double d14 = (Double) obj;
                        switch (i19) {
                            case 0:
                                return h.c(hVar2, d14, null, false, 14);
                            case 1:
                                return h.e(hVar2, d14, 6);
                            case 2:
                                Context context = hVar2.f142645a;
                                double dC = k42.b.c(d14 != null ? d14.doubleValue() : Double.NaN);
                                k42.b.f102880a.getClass();
                                if (dC == 0.0d) {
                                    l3.f23124b.getClass();
                                    decimalFormat = l3.f23130h;
                                } else {
                                    l3.f23124b.getClass();
                                    decimalFormat = l3.f23133k;
                                }
                                if (((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).C1() && (iD = ((k42.a) KoinJavaComponent.get$default(k42.a.class, null, null, 6, null)).d()) != 0 && iD != 1 && iD == 2) {
                                    if (dC == 0.0d) {
                                        l3.f23124b.getClass();
                                        decimalFormat2 = l3.f23131i;
                                        decimalFormat3 = decimalFormat2;
                                    } else {
                                        l3.f23124b.getClass();
                                        decimalFormat2 = l3.f23132j;
                                        decimalFormat3 = l3.f23130h;
                                    }
                                    if (Double.isNaN(dC)) {
                                        strH = context.getString(R.string.no_value);
                                        strH.getClass();
                                    } else {
                                        String strF = k42.b.f(dC, decimalFormat2);
                                        String strE = k42.b.e(context, Math.abs(dC), decimalFormat3);
                                        x0 x0Var = x0.f105818a;
                                        String string = context.getString(R.string.stone_pound_short);
                                        string.getClass();
                                        strH = String.format(string, Arrays.copyOf(new Object[]{strF, strE}, 2));
                                    }
                                } else {
                                    strH = k42.b.h(context, dC, false, decimalFormat);
                                }
                                return k42.b.a(context, strH);
                            default:
                                return h.c(hVar2, d14, null, true, 6);
                        }
                    }
                };
                o0VarQ.K(objQ4);
            }
            l lVar3 = (l) objQ4;
            boolean zR4 = o0VarQ.r(hVar);
            Object objQ5 = o0VarQ.q();
            if (zR4 || objQ5 == c2565a) {
                final int i19 = 3;
                objQ5 = new l() { // from class: v42.a
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        DecimalFormat decimalFormat;
                        int iD;
                        String strH;
                        DecimalFormat decimalFormat2;
                        DecimalFormat decimalFormat3;
                        int i110 = i19;
                        h hVar2 = hVar;
                        Double d14 = (Double) obj;
                        switch (i110) {
                            case 0:
                                return h.c(hVar2, d14, null, false, 14);
                            case 1:
                                return h.e(hVar2, d14, 6);
                            case 2:
                                Context context = hVar2.f142645a;
                                double dC = k42.b.c(d14 != null ? d14.doubleValue() : Double.NaN);
                                k42.b.f102880a.getClass();
                                if (dC == 0.0d) {
                                    l3.f23124b.getClass();
                                    decimalFormat = l3.f23130h;
                                } else {
                                    l3.f23124b.getClass();
                                    decimalFormat = l3.f23133k;
                                }
                                if (((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).C1() && (iD = ((k42.a) KoinJavaComponent.get$default(k42.a.class, null, null, 6, null)).d()) != 0 && iD != 1 && iD == 2) {
                                    if (dC == 0.0d) {
                                        l3.f23124b.getClass();
                                        decimalFormat2 = l3.f23131i;
                                        decimalFormat3 = decimalFormat2;
                                    } else {
                                        l3.f23124b.getClass();
                                        decimalFormat2 = l3.f23132j;
                                        decimalFormat3 = l3.f23130h;
                                    }
                                    if (Double.isNaN(dC)) {
                                        strH = context.getString(R.string.no_value);
                                        strH.getClass();
                                    } else {
                                        String strF = k42.b.f(dC, decimalFormat2);
                                        String strE = k42.b.e(context, Math.abs(dC), decimalFormat3);
                                        x0 x0Var = x0.f105818a;
                                        String string = context.getString(R.string.stone_pound_short);
                                        string.getClass();
                                        strH = String.format(string, Arrays.copyOf(new Object[]{strF, strE}, 2));
                                    }
                                } else {
                                    strH = k42.b.h(context, dC, false, decimalFormat);
                                }
                                return k42.b.a(context, strH);
                            default:
                                return h.c(hVar2, d14, null, true, 6);
                        }
                    }
                };
                o0VarQ.K(objQ5);
            }
            c.a(rVar, eVar, lVar, lVar2, lVar3, (l) objQ5, o0VarQ, i15 & 14);
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l0(this, rVar, qVar, false, i14, 19);
        }
    }
}
