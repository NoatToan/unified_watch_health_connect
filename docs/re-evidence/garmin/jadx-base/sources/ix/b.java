package ix;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import e23.q;
import gl1.y;
import h4.r;
import java.util.List;
import l72.u1;
import o13.p;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p13.x;
import p3.n;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f95582b;

    public /* synthetic */ b(f fVar, int i14) {
        this.f95581a = i14;
        this.f95582b = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0082  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        x0 x0Var;
        r rVarZ;
        Object obj4;
        int i14 = this.f95581a;
        int i15 = 16;
        f fVar = this.f95582b;
        switch (i14) {
            case 0:
                h82.r rVar = (h82.r) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i16 = f.f95592j;
                rVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(rVar) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = n.f135158a;
                    int i17 = ((iIntValue << 3) & 112) | 6;
                    rVar.k(z3.f.c(-119931520, new c(rVar, fVar, false ? 1 : 0), mVar), mVar, i17);
                    rVar.a(z3.f.c(-1307298967, new c(rVar, fVar, true ? 1 : 0), mVar), mVar, i17);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                h82.r rVar2 = (h82.r) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i18 = f.f95592j;
                rVar2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(rVar2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = n.f135158a;
                    int i19 = (iIntValue2 << 3) & 112;
                    rVar2.D(R.string.gcm_help_body_battery_section1_title, mVar2, i19);
                    int i24 = (iIntValue2 << 6) & 896;
                    rVar2.o(R.string.gcm_help_body_battery_section1_description1, i24, 2, null, mVar2);
                    if (fVar.q()) {
                        mVar2.C(-97500643);
                        rVar2.o(R.string.gcm_help_body_battery_section1_description3, i24, 2, null, mVar2);
                        mVar2.f();
                    } else {
                        mVar2.C(-97400451);
                        rVar2.o(R.string.gcm_help_body_battery_section1_description2, i24, 2, null, mVar2);
                        mVar2.f();
                    }
                    if (fVar.q()) {
                        mVar2.C(-97271801);
                        rVar2.t(R.string.lbl_morning_values, mVar2, i19);
                        mVar2.f();
                    } else {
                        mVar2.C(-97190116);
                        mVar2.f();
                    }
                    if (fVar.q()) {
                        mVar2.C(-972964394);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0Var = j92.f.f97932i;
                    } else {
                        mVar2.C(-972963210);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0Var = j92.f.f97931h;
                    }
                    x0 x0VarF = d92.c.f(x0Var, mVar2);
                    mVar2.f();
                    mVar2.C(-972961095);
                    bx.c iVar = fVar.q() ? new bx.c.i() : new bx.c.h();
                    bx.c eVar = fVar.q() ? new bx.c.e() : new bx.c.d();
                    bx.c gVar = fVar.q() ? new bx.c.g() : new bx.c.f();
                    bx.c c0330c = fVar.q() ? new bx.c.C0330c() : new bx.c.b();
                    int i25 = 0;
                    p3.m mVar3 = mVar2;
                    for (Object obj5 : x.k(new p(2131232651, x.k(y.P(R.string.lbl_less_than_number, new Object[]{String.valueOf(iVar.f21616b)}, mVar2), y.Q(mVar2, R.string.gcm_body_battery_lbl_very_low))), new p(2131232649, x.k(y.P(R.string.string_short_dash_line_string_pattern, new Object[]{String.valueOf(eVar.f21615a), String.valueOf(eVar.f21616b)}, mVar2), y.Q(mVar2, R.string.gcm_body_battery_lbl_low))), new p(2131232650, x.k(y.P(R.string.string_short_dash_line_string_pattern, new Object[]{String.valueOf(gVar.f21615a), String.valueOf(gVar.f21616b)}, mVar2), y.Q(mVar2, R.string.gcm_body_battery_lbl_medium))), new p(2131232648, x.k(y.P(R.string.string_short_dash_line_string_pattern, new Object[]{String.valueOf(c0330c.f21615a), String.valueOf(c0330c.f21616b)}, mVar2), y.Q(mVar2, R.string.gcm_body_battery_lbl_high))))) {
                        int i26 = i25 + 1;
                        if (i25 < 0) {
                            x.q();
                            throw null;
                        }
                        p pVar = (p) obj5;
                        if (i25 == 0) {
                            g6.f.a aVar = g6.f.f75994b;
                            float f14 = 16;
                            rVarZ = c2.l.B(r.S, f14, 32, f14, 4);
                        } else {
                            g6.f.a aVar2 = g6.f.f75994b;
                            rVarZ = c2.l.z(r.S, 16, 4);
                        }
                        p3.m mVar4 = mVar3;
                        u1.e(rVarZ, ((Number) pVar.f128594a).intValue(), 0L, 0.1f, (List) pVar.f128595b, x0VarF, x.k(Float.valueOf(0.4f), Float.valueOf(0.52f)), mVar4, 1575936, 4);
                        p3.m mVar5 = mVar4;
                        if (fVar.q()) {
                            mVar5.C(-1624876720);
                            rVar2.c(mVar5, iIntValue2 & 14);
                            mVar5.f();
                        } else {
                            mVar5.C(-1624831553);
                            mVar5.f();
                        }
                        i25 = i26;
                        mVar3 = mVar5;
                    }
                    mVar3.f();
                    rVar2.c(mVar3, iIntValue2 & 14);
                    x1 x1Var3 = n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                h82.r rVar3 = (h82.r) obj;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i27 = f.f95592j;
                rVar3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar6.B(rVar3) ? 4 : 2;
                }
                if (mVar6.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var4 = n.f135158a;
                    int i28 = (iIntValue3 << 3) & 112;
                    rVar3.D(R.string.gcm_help_body_battery_section2_title, mVar6, i28);
                    String strQ = y.Q(mVar6, R.string.gcm_help_body_battery_section2_description1);
                    if (fVar.q()) {
                        mVar6.C(-781473645);
                        strQ = strQ + StringUtils.SPACE + y.Q(mVar6, R.string.msg_help_body_battery_section2_description1_cont);
                        mVar6.f();
                    } else {
                        mVar6.C(-781309686);
                        mVar6.f();
                    }
                    rVar3.q(strQ, mVar6, i28);
                    rVar3.o(R.string.gcm_help_body_battery_section2_description2, (iIntValue3 << 6) & 896, 2, null, mVar6);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 3:
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i29 = f.f95592j;
                if (mVar7.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var5 = n.f135158a;
                    fVar.m(mVar7, 0);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 4:
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                int i30 = f.f95592j;
                if (mVar8.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x1 x1Var6 = n.f135158a;
                    fVar.p(mVar8, 0);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 5:
                p3.m mVar9 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                int i34 = f.f95592j;
                if (mVar9.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    x1 x1Var7 = n.f135158a;
                    fVar.l(mVar9, 0);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 6:
                p3.m mVar10 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                int i35 = f.f95592j;
                if (mVar10.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x1 x1Var8 = n.f135158a;
                    fVar.o(mVar10, 0);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 7:
                p3.m mVar11 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                int i36 = f.f95592j;
                if (mVar11.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    x1 x1Var9 = n.f135158a;
                    fVar.k(mVar11, 0);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 8:
                p3.m mVar12 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                int i37 = f.f95592j;
                if (mVar12.n(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    x1 x1Var10 = n.f135158a;
                    fVar.n(mVar12, 0);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            default:
                h82.r rVar4 = (h82.r) obj;
                p3.m mVar13 = (p3.m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                int i38 = f.f95592j;
                rVar4.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= mVar13.B(rVar4) ? 4 : 2;
                }
                if (mVar13.n(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    x1 x1Var11 = n.f135158a;
                    rVar4.D(R.string.lbl_body_battery_on_different_devices, mVar13, (iIntValue10 << 3) & 112);
                    int i39 = (iIntValue10 << 6) & 896;
                    rVar4.l(R.string.msg_body_battery_on_different_devices_intro, i39, 2, null, mVar13);
                    rVar4.o(R.string.msg_body_battery_on_different_devices, i39, 2, null, mVar13);
                    rVar4.c(mVar13, iIntValue10 & 14);
                    Object obj6 = (Context) mVar13.A(AndroidCompositionLocals_androidKt.f6042b);
                    boolean zR = mVar13.r(fVar) | mVar13.r(obj6);
                    Object objQ = mVar13.q();
                    if (zR) {
                        obj4 = objQ;
                        Object cVar = new i91.c(i15, fVar, obj6);
                        mVar13.K(cVar);
                        obj4 = cVar;
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            obj4 = objQ;
                            Object cVar2 = new i91.c(i15, fVar, obj6);
                            mVar13.K(cVar2);
                            obj4 = cVar2;
                        }
                    }
                    obj4 = objQ;
                    rVar4.i((e23.a) obj4, R.string.calendar_sync_view_compatible_devices, mVar13, i39);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
        }
    }
}
