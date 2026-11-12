package ho;

import a3.l0;
import android.content.Context;
import c2.l2;
import c2.t2;
import c22.j0;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import i3.wg;
import l72.x0;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p13.h0;
import p3.x1;
import x5.r0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class x implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f84686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f84687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f84688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f84689e;

    public /* synthetic */ x(y yVar, e23.a aVar, long j8, e23.l lVar) {
        this.f84685a = 0;
        this.f84687c = yVar;
        this.f84688d = aVar;
        this.f84686b = j8;
        this.f84689e = lVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        p3.m mVar;
        String strConcat;
        String str;
        int i14 = this.f84685a;
        long j8 = this.f84686b;
        Object obj4 = this.f84689e;
        Object obj5 = this.f84688d;
        Object obj6 = this.f84687c;
        switch (i14) {
            case 0:
                ((Integer) obj3).intValue();
                ((r1.e0) obj).getClass();
                x1 x1Var = p3.n.f135158a;
                w.a((y) obj6, (e23.a) obj5, this.f84686b, (e23.l) obj4, (p3.m) obj2, 0);
                break;
            case 1:
                lp1.s sVar = (lp1.s) obj6;
                Context context = (Context) obj5;
                DateTime dateTime = (DateTime) obj4;
                t2 t2Var = (t2) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar2.B(t2Var) ? 4 : 2;
                }
                if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    String strA = j8 > 0 ? sVar.a(j8) : sVar.f114198d;
                    int i15 = iIntValue;
                    x0 x0Var = x0.f111346a;
                    String strQ = gl1.y.Q(mVar2, R.string.lbl_ride_time_gained);
                    int i16 = (i15 & 14) | (x0.f111348c << 24);
                    x0Var.a(i16, 124, null, t2Var, null, null, strA, strQ, null, null, mVar2);
                    x0Var.a(i16, 124, null, t2Var, null, null, j0.r(context, dateTime), gl1.y.Q(mVar2, R.string.lbl_start_time), null, null, mVar2);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                i53.f fVar = (i53.f) obj6;
                a10.a aVar = (a10.a) obj5;
                jz.a aVar2 = (jz.a) obj4;
                Float f14 = (Float) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar3.B(f14) ? 4 : 2;
                }
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var3 = p3.n.f135158a;
                    hz.d dVar = f14 != null ? (hz.d) h0.e0((int) f14.floatValue(), fVar) : null;
                    if (dVar == null) {
                        mVar3.C(-1207399628);
                        mVar3.f();
                    } else {
                        mVar3.C(-1207399627);
                        if (dVar.f86389b > 0.0f) {
                            mVar3.C(-1936957547);
                            me1.i.b(dVar, aVar, aVar2, this.f84686b, mVar3, 584);
                            mVar = mVar3;
                            mVar.f();
                        } else {
                            mVar = mVar3;
                            mVar.C(-1936626963);
                            mVar.f();
                        }
                        mVar.f();
                    }
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                sc1.a aVar3 = (sc1.a) obj6;
                Double d14 = (Double) obj5;
                Double d15 = (Double) obj4;
                t2 t2Var2 = (t2) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                t2Var2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar4.B(t2Var2) ? 4 : 2;
                }
                if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var4 = p3.n.f135158a;
                    x0 x0Var2 = x0.f111346a;
                    if (aVar3 == sc1.a.Time) {
                        mVar4.C(900946807);
                        l3.a aVar4 = l3.f23124b;
                        long jDoubleValue = (long) d14.doubleValue();
                        aVar4.getClass();
                        strConcat = l3.a.e1(jDoubleValue);
                        if (strConcat == null) {
                            strConcat = sn.a.h(mVar4, -1217860461, R.string.no_duration_value, mVar4);
                        } else {
                            mVar4.C(-1217863189);
                            mVar4.f();
                        }
                        mVar4.f();
                    } else {
                        mVar4.C(901130544);
                        l3.a aVar5 = l3.f23124b;
                        long jDoubleValue2 = (long) d15.doubleValue();
                        aVar5.getClass();
                        String strE1 = l3.a.e1(jDoubleValue2);
                        strConcat = strE1 != null ? strE1.concat(StringUtils.SPACE) : null;
                        if (strConcat == null) {
                            strConcat = sn.a.h(mVar4, -1217853325, R.string.no_duration_value, mVar4);
                        } else {
                            mVar4.C(-1217857262);
                            mVar4.f();
                        }
                        mVar4.f();
                    }
                    String str2 = strConcat;
                    if (aVar3 == sc1.a.Pace) {
                        mVar4.C(-1217849180);
                        l3.a aVar6 = l3.f23124b;
                        boolean zC = mg0.b.c();
                        aVar6.getClass();
                        String strQ2 = gl1.y.Q(mVar4, l3.a.N1(zC));
                        mVar4.f();
                        str = strQ2;
                    } else {
                        mVar4.C(901443860);
                        mVar4.f();
                        str = null;
                    }
                    String strQ3 = gl1.y.Q(mVar4, R.string.lbl_goal);
                    x0.a aVar7 = new x0.a(j8, null);
                    int i17 = iIntValue3 & 14;
                    int i18 = x0.f111348c;
                    x0Var2.a(i17 | (i18 << 24), 112, null, t2Var2, null, null, str2, strQ3, str, aVar7, mVar4);
                    x0Var2.h(t2Var2, mVar4, i17 | (i18 << 3));
                } else {
                    mVar4.e();
                }
                break;
            case 4:
                String str3 = (String) obj6;
                a2.j jVar = (a2.j) obj5;
                String str4 = (String) obj4;
                e23.p<? super p3.m, ? super Integer, Unit> pVar = (e23.p) obj;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                pVar.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar5.r(pVar) ? 4 : 2;
                }
                if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var5 = p3.n.f135158a;
                    int i19 = iIntValue4;
                    wg wgVar = wg.f90137a;
                    r0.f188941a.getClass();
                    nb0.b bVar = r0.a.f188943b;
                    k2.a aVar8 = j92.h.f97941a.f87991b;
                    g6.f.a aVar9 = g6.f.f75994b;
                    l2 l2VarA = c2.l.a(0);
                    long jA = com.nimbusds.jose.shaded.gson.internal.a.a(d92.b.f58623a, mVar5);
                    long jA2 = zl.a.a(mVar5);
                    long jX = com.nimbusds.jose.shaded.gson.internal.a.x(mVar5);
                    long jX2 = com.nimbusds.jose.shaded.gson.internal.a.x(mVar5);
                    long jB = sn.a.b(mVar5);
                    long jE = ds.e0.e(mVar5);
                    long jB2 = sn.a.b(mVar5);
                    long jB3 = sn.a.b(mVar5);
                    long jB4 = sn.a.b(mVar5);
                    o4.d0.f128823b.getClass();
                    long j14 = o4.d0.f128831j;
                    wgVar.getClass();
                    long j15 = this.f84686b;
                    wgVar.b(str3, pVar, true, true, bVar, jVar, false, null, z3.f.c(-724865855, new vd0.b(str4, 5), mVar5), null, null, null, null, null, aVar8, wg.c(jA, jA2, j15, j15, jE, j14, j14, jB, jB2, jB3, jB4, jX, jX2, mVar5, 1743152844), l2VarA, null, mVar5, ((i19 << 3) & 112) | 100691328, 102236160, 147136);
                } else {
                    mVar5.e();
                }
                break;
            default:
                b63.o oVar = (b63.o) obj6;
                i53.d dVar2 = (i53.d) obj5;
                yp0.o oVar2 = (yp0.o) obj4;
                Float f15 = (Float) obj;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar6.B(f15) ? 4 : 2;
                }
                if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x1 x1Var6 = p3.n.f135158a;
                    if (f15 == null) {
                        mVar6.C(204397801);
                        mVar6.f();
                    } else {
                        mVar6.C(204397802);
                        int iFloatValue = (int) f15.floatValue();
                        b63.i.INSTANCE.getClass();
                        b63.o oVarE = b63.q.e(oVar, iFloatValue, b63.i.f16191e);
                        Double d16 = (Double) dVar2.get(oVarE);
                        if (d16 == null || d16.doubleValue() <= 0.0d) {
                            mVar6.f();
                        } else {
                            m92.y.a(oVar2.f198685f.l(vb.h.k(oVarE), vb.h.k(b63.q.e(oVarE, 6, b63.i.f16190d)), pi0.f.SHORT_MONTH_NO_WEEKDAY), z3.f.c(-705587144, new l0(d16, oVar2, this.f84686b, 12), mVar6), mVar6, 384);
                            mVar6.f();
                        }
                    }
                } else {
                    mVar6.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ x(long j8, Object obj, Object obj2, Object obj3, int i14) {
        this.f84685a = i14;
        this.f84686b = j8;
        this.f84687c = obj;
        this.f84688d = obj2;
        this.f84689e = obj3;
    }

    public /* synthetic */ x(Object obj, Object obj2, Object obj3, long j8, int i14) {
        this.f84685a = i14;
        this.f84687c = obj;
        this.f84688d = obj2;
        this.f84689e = obj3;
        this.f84686b = j8;
    }
}
