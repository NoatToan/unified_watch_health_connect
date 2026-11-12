package fn1;

import a11.g0;
import am.e1;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.t2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e11.f0;
import ew1.c2;
import h5.e0;
import i3.e5;
import i3.e9;
import i3.mc;
import i3.mh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import km1.c0;
import km1.d0;
import l72.r1;
import l72.x0;
import lc.u0;
import o4.m1;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p13.h0;
import p13.x;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import w2.a0;

/* JADX INFO: loaded from: classes10.dex */
public final class m {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final List list, final Map map, final boolean z14, p3.m mVar, final int i14) {
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar;
        String string;
        String string2;
        String str;
        String strJ;
        String string3;
        o0 o0VarE = mVar.E(-826649588);
        int i15 = 4;
        int i16 = i14 | (o0VarE.r(list) ? 4 : 2) | (o0VarE.r(map) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            if (list.isEmpty()) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i17 = 0;
                pVar = new e23.p(list, map, z14, i14, i17) { // from class: fn1.e

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f72190a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ List f72191b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Map f72192c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ boolean f72193d;

                    {
                        this.f72190a = i17;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        int i18 = this.f72190a;
                        p3.m mVar2 = (p3.m) obj;
                        ((Integer) obj2).getClass();
                        switch (i18) {
                            case 0:
                                m.a(this.f72191b, this.f72192c, this.f72193d, mVar2, p0.t(1));
                                break;
                            default:
                                m.a(this.f72191b, this.f72192c, this.f72193d, mVar2, p0.t(1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                mn1.d dVar = new mn1.d(a0.s(o0VarE));
                oi0.h hVar = new oi0.h(context);
                h4.r.a aVar = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                c2.l.f(c2.l.C(aVar, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13), o0VarE);
                o0VarE.C(158712065);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    km1.w wVar = (km1.w) it.next();
                    c0 f105616a = wVar.getF105616a();
                    f105616a.getClass();
                    int i18 = mn1.d.a.f119773a[f105616a.ordinal()];
                    l22.b bVar = dVar.f119771a;
                    if (i18 == 1) {
                        string = bVar.getString(R.string.lbl_sleep_history);
                    } else if (i18 == 2) {
                        string = bVar.getString(R.string.lbl_activity_history);
                    } else if (i18 == 3) {
                        string = bVar.getString(R.string.tr_factor_hrv_status);
                    } else {
                        if (i18 != i15) {
                            u0.r();
                            return;
                        }
                        string = bVar.getString(R.string.lbl_naps);
                    }
                    String str2 = string;
                    km1.e f105617b = wVar.getF105617b();
                    if (f105617b == null) {
                        str = null;
                    } else {
                        switch (mn1.d.a.f119775c[f105617b.ordinal()]) {
                            case 1:
                                string2 = bVar.getString(R.string.lbl_very_active_day);
                                break;
                            case 2:
                                string2 = bVar.getString(R.string.lbl_more_active_recently);
                                break;
                            case 3:
                                string2 = bVar.getString(R.string.lbl_less_active_but_still_catching_up);
                                break;
                            case 4:
                                string2 = bVar.getString(R.string.lbl_highly_active_last_few_weeks);
                                break;
                            case 5:
                                string2 = bVar.getString(R.string.lbl_highly_active_recently);
                                break;
                            case 6:
                                string2 = bVar.getString(R.string.lbl_pattern_of_short_sleep);
                                break;
                            case 7:
                                string2 = bVar.getString(R.string.lbl_good_sleep_duration);
                                break;
                            case 8:
                                string2 = bVar.getString(R.string.lbl_low_quality_sleep_recently);
                                break;
                            case 9:
                                string2 = bVar.getString(R.string.lbl_high_quality_sleep_recently);
                                break;
                            case 10:
                                string2 = bVar.getString(R.string.lbl_lower_than_usual_recently);
                                break;
                            case 11:
                                string2 = bVar.getString(R.string.lbl_adapting_well_to_strain);
                                break;
                            case 12:
                                string2 = bVar.getString(R.string.lbl_hard_training_today);
                                break;
                            case 13:
                                string2 = bVar.getString(R.string.lbl_high_training_load_recently);
                                break;
                            case 14:
                                string2 = bVar.getString(R.string.lbl_less_training_recently_but_still_catching_up);
                                break;
                            case 15:
                                string2 = bVar.getString(R.string.lbl_heavy_training_last_few_weeks);
                                break;
                            case 16:
                                string2 = bVar.getString(z14 ? R.string.lbl_one_nap_today : R.string.lbl_one_nap);
                                break;
                            case 17:
                                string2 = bVar.getString(z14 ? R.string.lbl_two_naps_today : R.string.lbl_two_naps);
                                break;
                            case 18:
                                string2 = bVar.getString(z14 ? R.string.lbl_more_than_two_naps_today : R.string.lbl_more_than_two_naps);
                                break;
                            default:
                                u0.r();
                                return;
                        }
                        str = string2;
                    }
                    e23.a aVar2 = map != null ? (e23.a) map.get(wVar.getF105616a()) : null;
                    String strC = "";
                    if (aVar2 != null) {
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1028535965, R.string.lbl_double_tap_to_activate, o0VarE, false);
                    } else {
                        o0VarE.C(1819903673);
                        o0VarE.g0(false);
                        strJ = "";
                    }
                    r0 r0Var = new r0();
                    r0Var.f105810a = "";
                    if (wVar instanceof km1.w.b) {
                        Integer num = ((km1.w.b) wVar).f105619d;
                        r0Var.f105810a = num != null ? hVar.c(num.intValue(), false) : 0;
                        if (num != null) {
                            strC = dVar.f119772b.f14213c.c(num.intValue());
                        }
                    } else {
                        km1.d f105618c = wVar.getF105618c();
                        if (f105618c == null) {
                            string3 = null;
                        } else {
                            switch (mn1.d.a.f119774b[f105618c.ordinal()]) {
                                case 1:
                                    string3 = bVar.getString(R.string.lbl_high_strain_today);
                                    break;
                                case 2:
                                    string3 = bVar.getString(R.string.lbl_high_load_today);
                                    break;
                                case 3:
                                    string3 = bVar.getString(R.string.lbl_active_day);
                                    break;
                                case 4:
                                    string3 = bVar.getString(R.string.lbl_high_strain);
                                    break;
                                case 5:
                                    string3 = bVar.getString(R.string.lbl_high_load);
                                    break;
                                case 6:
                                    string3 = bVar.getString(R.string.lbl_high_long_term_strain);
                                    break;
                                case 7:
                                    string3 = bVar.getString(R.string.lbl_high_chronic_load);
                                    break;
                                case 8:
                                    string3 = bVar.getString(R.string.lbl_poor);
                                    break;
                                case 9:
                                    string3 = bVar.getString(R.string.lbl_good);
                                    break;
                                case 10:
                                    string3 = bVar.getString(R.string.ohrv_summary_status_unbalanced);
                                    break;
                                case 11:
                                    string3 = bVar.getString(R.string.lbl_is_in_balance);
                                    break;
                                case 12:
                                    string3 = bVar.getString(R.string.ohrv_summary_status_invalid);
                                    break;
                                case 13:
                                    string3 = bVar.getString(R.string.ohrv_summary_status_low);
                                    break;
                                case 14:
                                    string3 = bVar.getString(R.string.lbl_active_training);
                                    break;
                                case 15:
                                case 16:
                                    string3 = bVar.getString(R.string.ohrv_summary_status_no_status);
                                    break;
                                default:
                                    u0.r();
                                    return;
                            }
                        }
                        strC = string3;
                    }
                    h4.r.a aVar3 = h4.r.S;
                    d92.b.f58623a.getClass();
                    j92.b bVar2 = d92.b.f58625c;
                    bVar2.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97920e;
                    bVar2.getClass();
                    Context context2 = context;
                    h4.r rVarB = p5.v.b(c2.l.z(aVar3, f14, eVar.f97918c), new e1(str2, context2, str, r0Var, strJ));
                    yz1.t.a(str2, str, strC, rVarB, aVar2 != null, aVar2, o0VarE, 0, 0);
                    dVar = dVar;
                    hVar = hVar;
                    context = context2;
                    i15 = 4;
                }
                o0VarE.g0(false);
                h4.r.a aVar4 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                c2.l.f(c2.l.C(aVar4, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13), o0VarE);
                x1 x1Var2 = p3.n.f135158a;
            }
            p2VarI0.f135219d = pVar;
        }
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final int i19 = 1;
            pVar = new e23.p(list, map, z14, i14, i19) { // from class: fn1.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f72190a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ List f72191b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Map f72192c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f72193d;

                {
                    this.f72190a = i19;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i110 = this.f72190a;
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    switch (i110) {
                        case 0:
                            m.a(this.f72191b, this.f72192c, this.f72193d, mVar2, p0.t(1));
                            break;
                        default:
                            m.a(this.f72191b, this.f72192c, this.f72193d, mVar2, p0.t(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }

    public static final void b(km1.c cVar, p3.m mVar, int i14) {
        final j23.i iVarA;
        km1.v dailySleep;
        km1.p sleepAlignment;
        km1.v dailySleep2;
        km1.p sleepAlignment2;
        o0 o0VarE = mVar.E(-425131387);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14;
        final int i16 = 0;
        final int i17 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            final b10.a aVar = new b10.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            if (((cVar == null || (dailySleep2 = cVar.getDailySleep()) == null || (sleepAlignment2 = dailySleep2.getSleepAlignment()) == null) ? null : km1.q.c(sleepAlignment2)) != km1.r.NO_SLEEP_DATA) {
                sn1.a aVar2 = sn1.a.f160413a;
                km1.v dailySleep3 = cVar != null ? cVar.getDailySleep() : null;
                aVar2.getClass();
                iVarA = sn1.a.a(dailySleep3);
            } else {
                iVarA = null;
            }
            final j23.i iVarA2 = (cVar == null || (dailySleep = cVar.getDailySleep()) == null || (sleepAlignment = dailySleep.getSleepAlignment()) == null) ? null : km1.q.a(sleepAlignment);
            h4.r.a aVar3 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar3, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            x0 x0Var = x0.f111346a;
            z3.e eVarC = z3.f.c(192232022, new e23.q() { // from class: fn1.i
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i18 = i16;
                    j23.g gVar = iVarA2;
                    j23.g gVar2 = iVarA;
                    b10.a aVar5 = aVar;
                    switch (i18) {
                        case 0:
                            t2 t2Var = (t2) obj;
                            p3.m mVar2 = (p3.m) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            t2Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= mVar2.B(t2Var) ? 4 : 2;
                            }
                            if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                                x1 x1Var2 = p3.n.f135158a;
                                String strB = b10.a.b(aVar5, gVar2 != null ? (b63.u) gVar2.getStart() : null, 6);
                                l22.a aVar6 = aVar5.f14205a;
                                int i19 = iIntValue;
                                x0 x0Var2 = x0.f111346a;
                                String string = aVar6.getString(R.string.sleep_lbl_bedtime);
                                String strC = aVar5.c(gVar2 != null ? (b63.u) gVar2.getStart() : null);
                                int i24 = (i19 & 14) | (x0.f111348c << 24);
                                x0Var2.a(i24, 116, null, t2Var, null, null, strB, string, strC, null, mVar2);
                                x0Var2.a(i24, 116, null, t2Var, null, null, b10.a.b(aVar5, gVar != null ? (b63.u) gVar.getStart() : null, 6), aVar6.getString(R.string.lbl_optimal_bedtime), aVar5.c(gVar != null ? (b63.u) gVar.getStart() : null), null, mVar2);
                            } else {
                                mVar2.e();
                            }
                            break;
                        default:
                            t2 t2Var2 = (t2) obj;
                            p3.m mVar3 = (p3.m) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            t2Var2.getClass();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= mVar3.B(t2Var2) ? 4 : 2;
                            }
                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                x1 x1Var3 = p3.n.f135158a;
                                String strB2 = b10.a.b(aVar5, gVar2 != null ? (b63.u) gVar2.b() : null, 6);
                                l22.a aVar7 = aVar5.f14205a;
                                x0 x0Var3 = x0.f111346a;
                                String string2 = aVar7.getString(R.string.sleep_lbl_wake_time);
                                String strC2 = aVar5.c(gVar2 != null ? (b63.u) gVar2.b() : null);
                                int i25 = (iIntValue2 & 14) | (x0.f111348c << 24);
                                x0Var3.a(i25, 116, null, t2Var2, null, null, strB2, string2, strC2, null, mVar3);
                                x0Var3.a(i25, 116, null, t2Var2, null, null, b10.a.b(aVar5, gVar != null ? (b63.u) gVar.b() : null, 6), aVar7.getString(R.string.lbl_optimal_wake_time), aVar5.c(gVar != null ? (b63.u) gVar.b() : null), null, mVar3);
                            } else {
                                mVar3.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE);
            int i18 = (x0.f111348c << 6) | 48;
            x0Var.e(null, eVarC, o0VarE, i18, 1);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            x0Var.e(c2.l.C(aVar3, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), z3.f.c(-525117825, new e23.q() { // from class: fn1.i
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i19 = i17;
                    j23.g gVar = iVarA2;
                    j23.g gVar2 = iVarA;
                    b10.a aVar5 = aVar;
                    switch (i19) {
                        case 0:
                            t2 t2Var = (t2) obj;
                            p3.m mVar2 = (p3.m) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            t2Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= mVar2.B(t2Var) ? 4 : 2;
                            }
                            if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                                x1 x1Var2 = p3.n.f135158a;
                                String strB = b10.a.b(aVar5, gVar2 != null ? (b63.u) gVar2.getStart() : null, 6);
                                l22.a aVar6 = aVar5.f14205a;
                                int i110 = iIntValue;
                                x0 x0Var2 = x0.f111346a;
                                String string = aVar6.getString(R.string.sleep_lbl_bedtime);
                                String strC = aVar5.c(gVar2 != null ? (b63.u) gVar2.getStart() : null);
                                int i24 = (i110 & 14) | (x0.f111348c << 24);
                                x0Var2.a(i24, 116, null, t2Var, null, null, strB, string, strC, null, mVar2);
                                x0Var2.a(i24, 116, null, t2Var, null, null, b10.a.b(aVar5, gVar != null ? (b63.u) gVar.getStart() : null, 6), aVar6.getString(R.string.lbl_optimal_bedtime), aVar5.c(gVar != null ? (b63.u) gVar.getStart() : null), null, mVar2);
                            } else {
                                mVar2.e();
                            }
                            break;
                        default:
                            t2 t2Var2 = (t2) obj;
                            p3.m mVar3 = (p3.m) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            t2Var2.getClass();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= mVar3.B(t2Var2) ? 4 : 2;
                            }
                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                x1 x1Var3 = p3.n.f135158a;
                                String strB2 = b10.a.b(aVar5, gVar2 != null ? (b63.u) gVar2.b() : null, 6);
                                l22.a aVar7 = aVar5.f14205a;
                                x0 x0Var3 = x0.f111346a;
                                String string2 = aVar7.getString(R.string.sleep_lbl_wake_time);
                                String strC2 = aVar5.c(gVar2 != null ? (b63.u) gVar2.b() : null);
                                int i25 = (iIntValue2 & 14) | (x0.f111348c << 24);
                                x0Var3.a(i25, 116, null, t2Var2, null, null, strB2, string2, strC2, null, mVar3);
                                x0Var3.a(i25, 116, null, t2Var2, null, null, b10.a.b(aVar5, gVar != null ? (b63.u) gVar.b() : null, 6), aVar7.getString(R.string.lbl_optimal_wake_time), aVar5.c(gVar != null ? (b63.u) gVar.b() : null), null, mVar3);
                            } else {
                                mVar3.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, i18, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h(cVar, i14, 1);
        }
    }

    public static final void c(km1.c cVar, p3.m mVar, int i14) {
        int i15;
        km1.v dailySleep;
        o0 o0VarE = mVar.E(1374511655);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            km1.p sleepAlignment = (cVar == null || (dailySleep = cVar.getDailySleep()) == null) ? null : dailySleep.getSleepAlignment();
            km1.r rVarC = sleepAlignment != null ? km1.q.c(sleepAlignment) : null;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = p0.n(null);
                o0VarE.K(objQ);
            }
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            m92.o.a(u1.n.e(c2.l.C(aVar, 0.0f, j92.b.f97899b.f97917b, 0.0f, 0.0f, 13), ds.e0.f(o0VarE), m1.f128891a), null, null, null, z3.f.c(24266407, new d50.i(rVarC, cVar, sleepAlignment, (p1) objQ, 24), o0VarE), null, z3.f.c(-1344194203, new f0(rVarC, 16, sleepAlignment, cVar), o0VarE), o0VarE, 1597440, 46);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h(cVar, i14, 0);
        }
    }

    public static final void d(km1.r rVar, j23.g<b63.u> gVar, p3.m mVar, int i14, int i15) {
        j23.g<b63.u> gVar2;
        int i16;
        o0 o0Var;
        j23.g<b63.u> gVar3;
        o0 o0VarE = mVar.E(1513787385);
        int i17 = i14 | (o0VarE.k(rVar == null ? -1 : rVar.ordinal()) ? 4 : 2);
        int i18 = i15 & 2;
        if (i18 != 0) {
            i16 = i17 | 48;
            gVar2 = gVar;
        } else {
            gVar2 = gVar;
            i16 = i17 | (o0VarE.r(gVar2) ? 32 : 16);
        }
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            String strA = null;
            j23.g<b63.u> gVar4 = i18 != 0 ? null : gVar2;
            x1 x1Var = p3.n.f135158a;
            b10.a aVar = new b10.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            String strB = b10.a.b(aVar, gVar4 != null ? (b63.u) gVar4.getStart() : null, 2);
            String strB2 = b10.a.b(aVar, gVar4 != null ? (b63.u) gVar4.b() : null, 2);
            if (rVar != null) {
                o0VarE.C(-1244222458);
                l22.a aVarS = a0.s(o0VarE);
                Object[] objArr = {strB, strB2};
                switch (gn1.g.f78087a[rVar.ordinal()]) {
                    case 1:
                        strA = aVarS.a(R.string.msg_aligned_feedback, Arrays.copyOf(objArr, 2));
                        break;
                    case 2:
                        strA = aVarS.a(R.string.msg_ahead_feedback, Arrays.copyOf(objArr, 2));
                        break;
                    case 3:
                        strA = aVarS.a(R.string.msg_behind_feedback, Arrays.copyOf(objArr, 2));
                        break;
                    case 4:
                        strA = aVarS.a(R.string.msg_not_aligned_feedback, Arrays.copyOf(objArr, 2));
                        break;
                    case 5:
                        strA = aVarS.a(R.string.msg_irregular_feedback, Arrays.copyOf(objArr, 2));
                        break;
                    case 6:
                        strA = aVarS.a(R.string.msg_onboarding_feedback, Arrays.copyOf(objArr, 2));
                        break;
                    case 7:
                        strA = aVarS.a(R.string.msg_not_enough_data_feedback, Arrays.copyOf(objArr, 2));
                        break;
                    case 9:
                        strA = aVarS.a(R.string.msg_sleep_alignment_let_lag_autodetected_feedback, Arrays.copyOf(objArr, 2));
                        break;
                    case 10:
                    case 11:
                        strA = aVarS.a(R.string.msg_sleep_alignment_let_lag_feedback, Arrays.copyOf(objArr, 2));
                        break;
                }
            } else {
                o0VarE.C(83809467);
            }
            o0VarE.g0(false);
            if (strA == null || strA.length() == 0) {
                o0Var = o0VarE;
                o0Var.C(84122537);
                o0Var.g0(false);
            } else {
                o0VarE.C(83946488);
                h4.r.a aVar2 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarC = c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7);
                d92.b.f58624b.getClass();
                mh.c(strA, rVarC, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, 0, 0, 131068);
                o0Var = o0VarE;
                o0Var.g0(false);
            }
            gVar3 = gVar4;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            gVar3 = gVar2;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f2.o(rVar, gVar3, i14, i15, 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00e6  */
    public static final void e(km1.r rVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-964055589);
        int i15 = (o0VarE.k(rVar.ordinal()) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            pm1.f fVar = (pm1.f) KoinJavaComponent.get$default(pm1.f.class, null, null, 6, null);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            h4.r rVarE = u1.n.e(x2.f(h4.r.S, 1.0f), tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            d92.b.f58625c.getClass();
            h4.r rVarY = c2.l.y(rVarE, j92.b.f97899b.f97920e);
            h4.d.f81522a.getClass();
            h4.g.a aVar = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = y.a(c2.j.f22694d, aVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            d(rVar, null, o0VarE, i15 & 14, 2);
            l72.f0 f0Var = l72.f0.f110999a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_see_jet_lag_advisor);
            boolean zR = o0VarE.r(fVar) | o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new c2(16, fVar, context);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new c2(16, fVar, context);
                    o0VarE.K(objQ);
                }
            }
            f0Var.k(strQ, null, false, (e23.a) objQ, o0VarE, 0, 6);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(rVar, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0084  */
    public static final void f(km1.c cVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        km1.v dailySleep;
        o0 o0VarE = mVar.E(-5881731);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            km1.p sleepAlignment = (cVar == null || (dailySleep = cVar.getDailySleep()) == null) ? null : dailySleep.getSleepAlignment();
            if (sleepAlignment != null) {
                o0VarE.C(871220260);
                km1.r rVarC = km1.q.c(sleepAlignment);
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_sleep_alignment);
                String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_help);
                boolean z14 = (i15 & 112) == 32;
                Object objQ = o0VarE.q();
                if (z14) {
                    objQ = new eu.a(aVar, 15);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new eu.a(aVar, 15);
                        o0VarE.K(objQ);
                    }
                }
                r1.c(strQ, strQ2, (e23.a) objQ, false, null, null, o0VarE, 0, 56);
                if (rVarC != null && h0.R(x.k(km1.r.JET_LAG, km1.r.JET_LAG_AUTODETECTED, km1.r.JET_LAG_FOLLOWING_GUIDANCE), rVarC)) {
                    o0VarE.C(871536987);
                    e(rVarC, o0VarE, 0);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(871616967);
                    c(cVar, o0VarE, (i15 & 14) | km1.c.B);
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            } else {
                o0VarE.C(871713253);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(cVar, aVar, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0211  */
    /* JADX WARN: Code duplicated, block: B:103:0x0239  */
    /* JADX WARN: Code duplicated, block: B:105:0x0240  */
    /* JADX WARN: Code duplicated, block: B:106:0x0244  */
    /* JADX WARN: Code duplicated, block: B:111:0x025f  */
    /* JADX WARN: Code duplicated, block: B:117:0x027e  */
    /* JADX WARN: Code duplicated, block: B:121:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:124:0x0348  */
    /* JADX WARN: Code duplicated, block: B:125:0x034c  */
    /* JADX WARN: Code duplicated, block: B:128:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:129:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:131:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:132:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:135:0x03de  */
    /* JADX WARN: Code duplicated, block: B:136:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:140:0x041f  */
    /* JADX WARN: Code duplicated, block: B:143:0x0447  */
    /* JADX WARN: Code duplicated, block: B:145:0x044e  */
    /* JADX WARN: Code duplicated, block: B:146:0x0452  */
    /* JADX WARN: Code duplicated, block: B:151:0x046d  */
    /* JADX WARN: Code duplicated, block: B:156:0x047c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:157:0x047e  */
    /* JADX WARN: Code duplicated, block: B:159:0x0485  */
    /* JADX WARN: Code duplicated, block: B:162:0x0491  */
    /* JADX WARN: Code duplicated, block: B:164:0x0495  */
    /* JADX WARN: Code duplicated, block: B:165:0x049a  */
    /* JADX WARN: Code duplicated, block: B:167:0x049e  */
    /* JADX WARN: Code duplicated, block: B:168:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:170:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:171:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:173:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:174:0x04be  */
    /* JADX WARN: Code duplicated, block: B:176:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:182:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:183:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:186:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:188:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:191:0x0500  */
    /* JADX WARN: Code duplicated, block: B:192:0x055a  */
    /* JADX WARN: Code duplicated, block: B:220:0x0617  */
    /* JADX WARN: Code duplicated, block: B:222:0x061b  */
    /* JADX WARN: Code duplicated, block: B:223:0x0669  */
    /* JADX WARN: Code duplicated, block: B:226:0x0680  */
    /* JADX WARN: Code duplicated, block: B:228:0x0688  */
    /* JADX WARN: Code duplicated, block: B:229:0x068d  */
    /* JADX WARN: Code duplicated, block: B:231:0x0691  */
    /* JADX WARN: Code duplicated, block: B:233:0x0698  */
    /* JADX WARN: Code duplicated, block: B:236:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:237:0x06ef  */
    /* JADX WARN: Code duplicated, block: B:239:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:241:0x071c  */
    /* JADX WARN: Code duplicated, block: B:243:0x0720  */
    /* JADX WARN: Code duplicated, block: B:245:0x0726  */
    /* JADX WARN: Code duplicated, block: B:247:0x072c  */
    /* JADX WARN: Code duplicated, block: B:252:0x075d  */
    /* JADX WARN: Code duplicated, block: B:256:0x07c7  */
    /* JADX WARN: Code duplicated, block: B:258:0x07d0  */
    /* JADX WARN: Code duplicated, block: B:259:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:264:0x07fd  */
    /* JADX WARN: Code duplicated, block: B:267:0x0811  */
    /* JADX WARN: Code duplicated, block: B:268:0x0813  */
    /* JADX WARN: Code duplicated, block: B:275:0x0824  */
    /* JADX WARN: Code duplicated, block: B:278:0x083a  */
    /* JADX WARN: Code duplicated, block: B:279:0x083c  */
    /* JADX WARN: Code duplicated, block: B:284:0x0849  */
    /* JADX WARN: Code duplicated, block: B:287:0x085d  */
    /* JADX WARN: Code duplicated, block: B:288:0x085f  */
    /* JADX WARN: Code duplicated, block: B:293:0x086c  */
    /* JADX WARN: Code duplicated, block: B:301:0x0897  */
    /* JADX WARN: Code duplicated, block: B:315:0x08c5  */
    /* JADX WARN: Code duplicated, block: B:328:0x08f6  */
    /* JADX WARN: Code duplicated, block: B:330:0x0901  */
    /* JADX WARN: Code duplicated, block: B:331:0x0906  */
    /* JADX WARN: Code duplicated, block: B:333:0x090a  */
    /* JADX WARN: Code duplicated, block: B:335:0x0912  */
    /* JADX WARN: Code duplicated, block: B:340:0x0922 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:341:0x0924  */
    /* JADX WARN: Code duplicated, block: B:343:0x0927  */
    /* JADX WARN: Code duplicated, block: B:345:0x092c  */
    /* JADX WARN: Code duplicated, block: B:346:0x092f  */
    /* JADX WARN: Code duplicated, block: B:347:0x0932  */
    /* JADX WARN: Code duplicated, block: B:351:0x0952  */
    /* JADX WARN: Code duplicated, block: B:352:0x0954  */
    /* JADX WARN: Code duplicated, block: B:356:0x0961  */
    /* JADX WARN: Code duplicated, block: B:362:0x096e  */
    /* JADX WARN: Code duplicated, block: B:365:0x0972  */
    /* JADX WARN: Code duplicated, block: B:368:0x098d  */
    /* JADX WARN: Code duplicated, block: B:369:0x09b1  */
    /* JADX WARN: Code duplicated, block: B:372:0x09c4  */
    /* JADX WARN: Code duplicated, block: B:381:0x09f4  */
    /* JADX WARN: Code duplicated, block: B:388:0x0a12  */
    /* JADX WARN: Code duplicated, block: B:393:0x0a8a  */
    /* JADX WARN: Code duplicated, block: B:394:0x0aa3  */
    /* JADX WARN: Code duplicated, block: B:396:0x0ab0  */
    /* JADX WARN: Code duplicated, block: B:401:0x0ac3  */
    /* JADX WARN: Code duplicated, block: B:404:0x0ad0  */
    /* JADX WARN: Code duplicated, block: B:405:0x0ae6  */
    /* JADX WARN: Code duplicated, block: B:407:0x0af4  */
    /* JADX WARN: Code duplicated, block: B:410:0x0b07  */
    /* JADX WARN: Code duplicated, block: B:415:0x0b35  */
    /* JADX WARN: Code duplicated, block: B:424:0x0bb5  */
    /* JADX WARN: Code duplicated, block: B:427:0x0bbe  */
    /* JADX WARN: Code duplicated, block: B:428:0x0bc1  */
    /* JADX WARN: Code duplicated, block: B:435:0x0bdb  */
    /* JADX WARN: Code duplicated, block: B:437:0x0c03  */
    /* JADX WARN: Code duplicated, block: B:439:0x0c12  */
    /* JADX WARN: Code duplicated, block: B:68:0x0107  */
    /* JADX WARN: Code duplicated, block: B:87:0x019e  */
    /* JADX WARN: Code duplicated, block: B:89:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:97:0x0205  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v5, types: [int] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v54 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [km1.e] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [km1.e0] */
    public static final void g(km1.c cVar, DateTime dateTime, sm1.s sVar, e23.a aVar, e23.a aVar2, e23.l lVar, p3.m mVar, int i14) {
        int i15;
        boolean z14;
        mc mcVar;
        h5.g.a.f fVar;
        b0 b0Var;
        h4.r.a aVar3;
        ?? r14;
        Context context;
        boolean z15;
        boolean z16;
        Throwable th3;
        o53.b0 b0Var2;
        mc mcVar2;
        boolean zR;
        Object objQ;
        int i16;
        int i17;
        boolean z17;
        ?? r15;
        km1.a0 a0Var;
        km1.c cVar2;
        z zVarA;
        int iHashCode;
        i2 i2VarX;
        h4.r rVarC;
        e0.a aVarA;
        h5.g.a.b bVarB;
        int i18;
        ?? r16;
        Object objQ2;
        e23.l lVar2;
        ?? r17;
        Object objQ3;
        boolean z18;
        Object objQ4;
        int size;
        int iIntValue;
        ?? r18;
        ArrayList arrayList;
        ?? r24;
        km1.e eVar;
        List<km1.w> listA;
        o53.b0 b0Var3;
        mc mcVar3;
        boolean z19;
        int i19;
        boolean z24;
        km1.v vVar;
        boolean z25;
        boolean z26;
        Context context2;
        boolean zR2;
        Object objQ5;
        km1.v dailySleep;
        ?? sleepScorePersonalizedInsight;
        km1.v dailySleep2;
        Object objQ6;
        p1 p1Var;
        boolean z27;
        boolean zR3;
        Object eVar2;
        ?? r19;
        boolean z28;
        km1.v dailySleep3;
        List<km1.b> listT;
        String hrvStatus;
        km1.v dailySleep4;
        List<km1.b> listT2;
        km1.v dailySleep5;
        List<km1.b> listT3;
        j92.b bVar;
        j92.e eVar3;
        z zVarA2;
        int iHashCode2;
        i2 i2VarA0;
        h4.r rVarC2;
        km1.a0 a0Var2;
        Object objQ7;
        z zVarA3;
        int iHashCode3;
        i2 i2VarA1;
        h4.r rVarC3;
        Context context3;
        String string;
        boolean zR4;
        Object objQ8;
        j92.f fVar2;
        int i24;
        s5.x0 x0Var;
        Integer actual;
        int iIntValue2;
        Integer baseline;
        int iIntValue3;
        boolean z29;
        int i25;
        Object objQ9;
        z zVarA4;
        int iHashCode4;
        i2 i2VarA2;
        h4.r rVarC4;
        km1.e0 e0Var;
        String feedback;
        int i26;
        Context context4;
        String string2;
        km1.e0 e0Var2;
        String str;
        String str2;
        s5.x0 x0Var2;
        boolean z34;
        b63.u uVarB;
        b63.u uVarA;
        String strA;
        String feedback2;
        Integer baseline2;
        String string3;
        String feedback3;
        Integer actual2;
        sVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-338088807);
        p3.c<?> cVar3 = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(dateTime) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(sVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(lVar) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(sVar.f160188h, o0VarE);
            Context context5 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            bv.d dVar = (bv.d) KoinJavaComponent.get$default(bv.d.class, null, null, 6, null);
            boolean z35 = ((sm1.a0) p1VarC.getF182175a()).f160098n;
            b10.c cVar4 = new b10.c(new l22.a(context5));
            b10.a aVar4 = new b10.a(context5);
            km1.e0 e0Var3 = new km1.e0(context5, z35);
            boolean zF = g22.k.f(dateTime, DateTime.now());
            km1.a0 a0VarV = cVar != null ? gl.b.v(cVar) : null;
            if (cVar == null || !in1.a.b(cVar)) {
                z14 = false;
            } else {
                if (gl.b.v(cVar) != null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            }
            Object objQ10 = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ10 == c2565a) {
                objQ10 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ10);
            }
            o53.b0 b0Var4 = (o53.b0) objQ10;
            mc mcVarF = e9.f(true, null, o0VarE, 6, 2);
            h4.r.a aVar5 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar6 = h4.d.a.f81536n;
            z zVarA5 = y.a(kVar, aVar6, o0VarE, 0);
            int iHashCode5 = Long.hashCode(o0VarE.getU());
            i2 i2VarA3 = o0VarE.a0();
            h4.r rVarC5 = h4.k.c(aVar5, o0VarE);
            h5.g.V.getClass();
            e0.a aVar7 = h5.g.a.f81805b;
            if (cVar3 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar7);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar4 = h5.g.a.f81810g;
            b4.c(eVar4, zVarA5, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA3, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            int i27 = i15;
            if (o0VarE.T) {
                mcVar = mcVarF;
            } else {
                mcVar = mcVarF;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode5))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC5, o0VarE);
                b0Var = b0.f22601a;
                if (z14) {
                    o0VarE.C(-435466753);
                    h4.r rVarE = u1.n.e(aVar5, tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
                    bVar = d92.b.f58625c;
                    bVar.getClass();
                    eVar3 = j92.b.f97899b;
                    h4.r rVarY = c2.l.y(rVarE, eVar3.f97920e);
                    zVarA2 = y.a(kVar, h4.d.a.f81537o, o0VarE, 48);
                    iHashCode2 = Long.hashCode(o0VarE.getU());
                    i2VarA0 = o0VarE.a0();
                    rVarC2 = h4.k.c(rVarY, o0VarE);
                    if (cVar3 != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    a0Var2 = a0VarV;
                    if (o0VarE.T) {
                        o0VarE.M(aVar7);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar4, zVarA2, o0VarE);
                    b4.c(c1623g, i2VarA0, o0VarE);
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    objQ7 = o0VarE.q();
                    if (objQ7 == c2565a) {
                        objQ7 = new fh0.b(17);
                        o0VarE.K(objQ7);
                    }
                    h4.r rVarC6 = p5.v.c((e23.l) objQ7, aVar5, true);
                    zVarA3 = y.a(kVar, aVar6, o0VarE, 0);
                    iHashCode3 = Long.hashCode(o0VarE.getU());
                    i2VarA1 = o0VarE.a0();
                    rVarC3 = h4.k.c(rVarC6, o0VarE);
                    if (cVar3 != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar7);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar4, zVarA3, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                        v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
                    }
                    b4.c(fVar, rVarC3, o0VarE);
                    b10.c cVar5 = e0Var3.f105512c;
                    context3 = e0Var3.f105510a;
                    if (a0Var2 != null || (actual2 = a0Var2.getActual()) == null) {
                        string = context3.getString(R.string.no_value_card);
                        string.getClass();
                    } else {
                        string = cVar5.f14213c.c(actual2.intValue() * 60);
                    }
                    h4.r rVarF = x2.f(aVar5, 1.0f);
                    String str3 = string;
                    zR4 = o0VarE.r(a0Var2) | o0VarE.r(cVar4);
                    objQ8 = o0VarE.q();
                    if (zR4 || objQ8 == c2565a) {
                        objQ8 = new e52.b(20, a0Var2, cVar4);
                        o0VarE.K(objQ8);
                    }
                    h4.r rVarC7 = p5.v.c((e23.l) objQ8, rVarF, false);
                    bVar.getClass();
                    h4.r rVarC8 = c2.l.C(rVarC7, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13);
                    d6.h.f57752b.getClass();
                    int i28 = d6.h.f57755e;
                    d6.h hVarA = d6.h.a(i28);
                    fVar2 = d92.b.f58624b;
                    fVar2.getClass();
                    th3 = null;
                    context = context5;
                    z15 = z35;
                    mh.c(str3, rVarC8, 0L, null, 0L, null, 0L, hVarA, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97928e, o0VarE), o0VarE, 0, 0, 130044);
                    if (zF) {
                        i24 = R.string.lbl_recommended;
                    } else {
                        i24 = R.string.lbl_sleep_need;
                    }
                    String strQ = gl1.y.Q(o0VarE, i24);
                    h4.r rVarF2 = x2.f(aVar5, 1.0f);
                    bVar.getClass();
                    h4.r rVarC9 = c2.l.C(rVarF2, 0.0f, 0.0f, 0.0f, eVar3.f97918c, 7);
                    d6.h hVarA2 = d6.h.a(i28);
                    fVar2.getClass();
                    x0Var = j92.f.f97932i;
                    mh.c(strQ, rVarC9, 0L, null, 0L, null, 0L, hVarA2, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0VarE), o0VarE, 0, 0, 130044);
                    o0VarE = o0VarE;
                    o0VarE.g0(true);
                    if (a0Var2 == null) {
                        o0VarE.C(1282058750);
                        i25 = 0;
                        o0VarE.g0(false);
                        z29 = zF;
                    } else {
                        o0VarE.C(1282058751);
                        actual = a0Var2.getActual();
                        if (actual != null) {
                            iIntValue2 = actual.intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        baseline = a0Var2.getBaseline();
                        if (baseline != null) {
                            iIntValue3 = baseline.intValue();
                        } else {
                            iIntValue3 = 0;
                        }
                        bVar.getClass();
                        float f14 = eVar3.f97921f;
                        bVar.getClass();
                        h4.r rVarC10 = c2.l.C(aVar5, 0.0f, f14, 0.0f, eVar3.f97920e, 5);
                        z29 = zF;
                        aVar5 = aVar5;
                        bn1.k.a(iIntValue2, iIntValue3, rVarC10, z29, 0, 0, 0.0f, o0VarE, 0);
                        o0VarE = o0VarE;
                        Unit unit = Unit.INSTANCE;
                        i25 = 0;
                        o0VarE.g0(false);
                    }
                    objQ9 = o0VarE.q();
                    if (objQ9 == c2565a) {
                        objQ9 = new fh0.b(20);
                        o0VarE.K(objQ9);
                    }
                    h4.r rVarC11 = p5.v.c((e23.l) objQ9, aVar5, r9);
                    zVarA4 = y.a(kVar, aVar6, o0VarE, i25);
                    x1 x1Var2 = p3.n.f135158a;
                    iHashCode4 = Long.hashCode(o0VarE.getU());
                    i2VarA2 = o0VarE.a0();
                    rVarC4 = h4.k.c(rVarC11, o0VarE);
                    if (cVar3 != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar7);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar4, zVarA4, o0VarE);
                    b4.c(c1623g, i2VarA2, o0VarE);
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode4))) {
                        v.h.A(iHashCode4, o0VarE, iHashCode4, bVar2);
                    }
                    b4.c(fVar, rVarC4, o0VarE);
                    if (z29) {
                        if (a0Var2 != null) {
                            feedback3 = a0Var2.getFeedback();
                        } else {
                            feedback3 = null;
                        }
                        km1.e0 e0Var4 = e0Var3;
                        string2 = e0Var4.a(feedback3);
                        context4 = context3;
                        e0Var2 = e0Var4;
                    } else {
                        e0Var = e0Var3;
                        if (a0Var2 != null) {
                            feedback = a0Var2.getFeedback();
                        } else {
                            feedback = null;
                        }
                        if (feedback != null) {
                            if (km1.t.HIGHLY_INCREASED.f105583a.contains(feedback)) {
                                i26 = R.string.lbl_sleep_need_feedback_highly_increased_past;
                            } else if (km1.t.INCREASED.f105583a.contains(feedback)) {
                                i26 = R.string.lbl_sleep_need_feedback_increased_past;
                            } else if (!km1.t.NO_CHANGE_NO_ADJUSTMENTS.f105583a.contains(feedback) || km1.t.NO_CHANGE_BALANCED.f105583a.contains(feedback)) {
                                i26 = R.string.lbl_sleep_need_feedback_no_change_past;
                            } else if (km1.t.DECREASED.f105583a.contains(feedback)) {
                                i26 = R.string.lbl_sleep_need_feedback_decrease_past;
                            } else if (km1.t.NONE.f105583a.contains(feedback)) {
                                i26 = R.string.lbl_sleep_need_feedback_no_change_past;
                            } else {
                                i26 = -1;
                            }
                            if (i26 != -1) {
                                context4 = context3;
                                string2 = context4.getString(i26);
                                e0Var2 = e0Var;
                            } else {
                                context4 = context3;
                                string2 = null;
                                e0Var2 = e0Var;
                            }
                        } else {
                            context4 = context3;
                            string2 = null;
                            e0Var2 = e0Var;
                        }
                    }
                    str = string2;
                    if (str != null) {
                        o0VarE.C(-2125740938);
                        bVar.getClass();
                        h4.r rVarF3 = x2.f(c2.l.C(aVar5, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13), 1.0f);
                        fVar2.getClass();
                        o0 o0Var = o0VarE;
                        z16 = z29;
                        mh.c(str, rVarF3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), o0Var, 0, 0, 131068);
                        o0VarE = o0Var;
                        o0VarE.g0(false);
                    } else {
                        z16 = z29;
                        o0VarE.C(-2125342123);
                        o0VarE.g0(false);
                    }
                    if (a0Var2 == null && (feedback2 = a0Var2.getFeedback()) != null) {
                        baseline2 = a0Var2.getBaseline();
                        Integer actual3 = a0Var2.getActual();
                        if (baseline2 != null || actual3 == null) {
                            str2 = null;
                        } else {
                            String strD = cVar5.f14213c.d(baseline2.intValue() * 60);
                            String strD2 = cVar5.f14213c.d(Math.abs(baseline2.intValue() - actual3.intValue()) * 60);
                            if (h0.C0(h0.C0(km1.t.NONE.f105583a, km1.t.NO_CHANGE_BALANCED.f105583a), km1.t.NO_CHANGE_NO_ADJUSTMENTS.f105583a).contains(feedback2)) {
                                string3 = z16 ? context4.getString(R.string.msg_change_in_sleep_need_with_feedback_neutral, strD) : context4.getString(R.string.msg_change_in_sleep_need_with_feedback_neutral_past, strD);
                            } else if (h0.C0(km1.t.INCREASED.f105583a, km1.t.HIGHLY_INCREASED.f105583a).contains(feedback2)) {
                                string3 = context4.getString(z16 ? R.string.msg_change_in_sleep_need_with_feedback_increasing : R.string.msg_change_in_sleep_need_with_feedback_increasing_past, strD2);
                            } else if (km1.t.DECREASED.f105583a.contains(feedback2)) {
                                string3 = context4.getString(z16 ? R.string.msg_change_in_sleep_need_with_feedback_decreasing : R.string.msg_change_in_sleep_need_with_feedback_decreasing_past, strD2);
                            } else {
                                str2 = null;
                            }
                            str2 = string3;
                        }
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        o0VarE.C(-2125188487);
                        bVar.getClass();
                        h4.r rVarC12 = c2.l.C(aVar5, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13);
                        fVar2.getClass();
                        x0Var2 = x0Var;
                        o0 o0Var2 = o0VarE;
                        mh.c(str2, rVarC12, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var2, o0VarE), o0Var2, 0, 0, 131068);
                        o0VarE = o0Var2;
                        o0VarE.g0(false);
                    } else {
                        x0Var2 = x0Var;
                        o0VarE.C(-2124915563);
                        o0VarE.g0(false);
                    }
                    sn1.b.f160414a.getClass();
                    if (sn1.b.e()) {
                        o0VarE.C(-2124813914);
                        if (a0Var2 != null) {
                            uVarB = km1.b0.b(a0Var2);
                        } else {
                            uVarB = null;
                        }
                        if (a0Var2 != null) {
                            uVarA = km1.b0.a(a0Var2);
                        } else {
                            uVarA = null;
                        }
                        strA = aVar4.a(uVarB, uVarA, z16);
                        if (strA != null) {
                            o0VarE.C(-2124392717);
                            bVar.getClass();
                            h4.r.a aVar8 = aVar5;
                            h4.r rVarC13 = c2.l.C(aVar8, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13);
                            aVar3 = aVar8;
                            fVar2.getClass();
                            o0 o0Var3 = o0VarE;
                            mh.c(strA, rVarC13, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var2, o0VarE), o0Var3, 0, 0, 131068);
                            o0VarE = o0Var3;
                            z34 = false;
                            o0VarE.g0(false);
                        } else {
                            aVar3 = aVar5;
                            z34 = false;
                            o0VarE.C(-2124083275);
                            o0VarE.g0(false);
                        }
                        o0VarE.g0(z34);
                    } else {
                        aVar3 = aVar5;
                        z34 = false;
                        o0VarE.C(-2124061451);
                        o0VarE.g0(false);
                    }
                    e5.u(o0VarE, r9, r9, z34);
                    cVar2 = cVar;
                    z17 = true;
                    r15 = z34;
                    mcVar2 = mcVar;
                    a0Var = a0Var2;
                    b0Var2 = b0Var4;
                    i17 = 3;
                    r14 = e0Var2;
                } else {
                    aVar3 = aVar5;
                    r14 = e0Var3;
                    km1.a0 a0Var3 = a0VarV;
                    context = context5;
                    z15 = z35;
                    z16 = zF;
                    th3 = null;
                    o0VarE.C(-431377016);
                    b0Var2 = b0Var4;
                    mcVar2 = mcVar;
                    zR = o0VarE.r(b0Var2) | o0VarE.B(mcVar2);
                    objQ = o0VarE.q();
                    if (!zR || objQ == c2565a) {
                        i16 = 3;
                        objQ = new cn1.t(b0Var2, mcVar2, 3);
                        o0VarE.K(objQ);
                    } else {
                        i16 = 3;
                    }
                    i17 = i16;
                    z17 = true;
                    r15 = 0;
                    a0Var = a0Var3;
                    u.b(cVar, dateTime, sVar, (e23.a) objQ, o0VarE, (i27 & 896) | km1.c.B | (i27 & 14) | (i27 & 112));
                    cVar2 = cVar;
                    o0VarE.g0(false);
                }
                d92.b.f58623a.getClass();
                h4.r rVarF4 = u1.n.f(d92.b.a(o0VarE).c().b(), aVar3);
                zVarA = y.a(c2.j.b(), h4.d.a.b(), o0VarE, r15);
                iHashCode = Long.hashCode(p0.i(o0VarE));
                i2VarX = o0VarE.x();
                rVarC = h4.k.c(rVarF4, o0VarE);
                aVarA = h5.g.a.a();
                if (o0VarE.F() != null) {
                    p0.l();
                    throw th3;
                }
                o0VarE.z();
                if (o0VarE.getT()) {
                    o0VarE.M(aVarA);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.c(), zVarA, o0VarE);
                b4.c(h5.g.a.e(), i2VarX, o0VarE);
                bVarB = h5.g.a.b();
                if (o0VarE.getT() || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVarB);
                }
                b4.c(h5.g.a.d(), rVarC, o0VarE);
                c0 c0Var = c0.ACTIVITY_HISTORY;
                i18 = i27 & 458752;
                if (i18 == 131072) {
                    r16 = z17;
                } else {
                    r16 = r15;
                }
                objQ2 = o0VarE.q();
                if (r16 == 0 || objQ2 == p3.m.a.a()) {
                    lVar2 = lVar;
                    objQ2 = new e40.g(lVar2, 24);
                    o0VarE.K(objQ2);
                } else {
                    lVar2 = lVar;
                }
                o13.p pVarA0 = g8.i.a0(c0Var, (e23.a) objQ2);
                c0 c0Var2 = c0.SLEEP_HISTORY;
                if (i18 == 131072) {
                    r17 = z17;
                } else {
                    r17 = r15;
                }
                objQ3 = o0VarE.q();
                if (r17 == 0 || objQ3 == p3.m.a.a()) {
                    objQ3 = new e40.g(lVar2, 25);
                    o0VarE.K(objQ3);
                }
                o13.p pVarA1 = g8.i.a0(c0Var2, (e23.a) objQ3);
                c0 c0Var3 = c0.HRV_STATUS;
                if (i18 == 131072) {
                    z18 = z17;
                } else {
                    z18 = false;
                }
                objQ4 = o0VarE.q();
                if (z18 || objQ4 == p3.m.a.a()) {
                    objQ4 = new e40.g(lVar2, 26);
                    o0VarE.K(objQ4);
                }
                LinkedHashMap linkedHashMapF = p13.u0.f(pVarA0, pVarA1, g8.i.a0(c0Var3, (e23.a) objQ4));
                if (cVar2 != null || (dailySleep5 = cVar2.getDailySleep()) == null || (listT3 = dailySleep5.t()) == null) {
                    size = 0;
                } else {
                    size = listT3.size();
                }
                if (cVar2 != null || (dailySleep4 = cVar2.getDailySleep()) == null || (listT2 = dailySleep4.t()) == null) {
                    iIntValue = 0;
                } else {
                    Iterator it = listT2.iterator();
                    iIntValue = 0;
                    while (it.hasNext()) {
                        Integer napTimeSec = ((km1.b) it.next()).getNapTimeSec();
                        iIntValue += napTimeSec != null ? napTimeSec.intValue() : 0;
                    }
                }
                if (size > 0 || iIntValue <= 0) {
                    o0VarE.C(1702834685);
                    o0VarE.f();
                } else {
                    o0VarE.C(1702719365);
                    c0 c0Var4 = c0.NAPS;
                    boolean z36 = i18 == 131072 ? z17 : false;
                    Object objQ11 = o0VarE.q();
                    if (z36 || objQ11 == p3.m.a.a()) {
                        objQ11 = new e40.g(lVar2, 27);
                        o0VarE.K(objQ11);
                    }
                    linkedHashMapF.put(c0Var4, (e23.a) objQ11);
                    o0VarE.f();
                }
                if (cVar2 != null) {
                    hrvStatus = cVar2.getHrvStatus();
                } else {
                    r18 = th3;
                }
                if (z14) {
                    r18 = hrvStatus;
                    listA = d0.a(a0Var, r18, size, iIntValue, z15);
                } else {
                    arrayList = new ArrayList();
                    if (iIntValue > 0 && size > 0) {
                        km1.j.f105531a.getClass();
                        if (size != 0) {
                            if (size != z17) {
                                eVar = km1.e.ONE_NAP;
                            } else if (size != 2) {
                                eVar = km1.e.MORE_THAN_TWO_NAPS;
                            } else {
                                eVar = km1.e.TWO_NAPS;
                            }
                            r24 = eVar;
                        } else {
                            r24 = th3;
                        }
                        arrayList.add(new km1.w.b(c0.NAPS, r24, size, Integer.valueOf(iIntValue), null, 16, null));
                        listA = arrayList;
                    }
                }
                r18 = hrvStatus;
                listA = arrayList;
                listA = arrayList;
                a(listA, linkedHashMapF, z16, o0VarE, 0);
                if (z16) {
                    if (!z14) {
                        if (cVar2 != null || (dailySleep3 = cVar2.getDailySleep()) == null) {
                            r19 = th3;
                        } else {
                            listT = dailySleep3.t();
                        }
                        if (r19 != 0 || r19.isEmpty()) {
                            r19 = listT;
                            r19 = listT;
                            z28 = z17;
                        } else {
                            z28 = false;
                        }
                        if (!z28) {
                            r19 = listT;
                            b0Var3 = b0Var2;
                            mcVar3 = mcVar2;
                            z19 = z17;
                            i19 = i17;
                            o0VarE.C(1705321629);
                            o0VarE.f();
                        }
                    }
                    r19 = listT;
                    o0VarE.C(1703801327);
                    if (listA.isEmpty()) {
                        o0VarE.C(1703796057);
                        h4.r.a aVar9 = h4.r.S;
                        d92.b.f58623a.getClass();
                        c2.l.f(x2.h(aVar9, d92.b.b().b().getF97920e()), o0VarE);
                        o0VarE.f();
                    } else {
                        o0VarE.C(1703892157);
                        o0VarE.f();
                    }
                    objQ6 = o0VarE.q();
                    if (objQ6 == p3.m.a.a()) {
                        objQ6 = p0.n(Boolean.FALSE);
                        o0VarE.K(objQ6);
                    }
                    p1Var = (p1) objQ6;
                    l72.p2 p2Var = l72.p2.f111205a;
                    String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_add_nap);
                    a.f72180a.getClass();
                    z19 = z17;
                    z3.e eVar5 = a.f72181b;
                    if ((i27 & 14) != 4 || ((i27 & 8) != 0 && o0VarE.r(cVar2))) {
                        z27 = z19;
                    } else {
                        z27 = false;
                    }
                    zR3 = z27 | o0VarE.r(b0Var2) | o0VarE.B(mcVar2);
                    Object objQ12 = o0VarE.q();
                    if (!zR3 || objQ12 == p3.m.a.a()) {
                        b0Var3 = b0Var2;
                        mc mcVar4 = mcVar2;
                        eVar2 = new af0.e((Object) cVar2, (Object) b0Var3, (Object) mcVar4, (Object) p1Var, 22);
                        mcVar3 = mcVar4;
                        o0VarE.K(eVar2);
                    } else {
                        eVar2 = objQ12;
                        b0Var3 = b0Var2;
                        mcVar3 = mcVar2;
                    }
                    o0 o0Var4 = o0VarE;
                    i19 = i17;
                    p2Var.g(strQ2, null, null, null, eVar5, false, false, (e23.a) eVar2, o0Var4, 24576, 238);
                    r1.c0.c(b0Var, ((Boolean) p1Var.getF182175a()).booleanValue(), null, null, null, null, z3.f.c(-882141265, new eb0.a(p1Var, i19), o0Var4), o0Var4, 1572870, 30);
                    o0VarE = o0Var4;
                    o0VarE.f();
                } else {
                    r19 = listT;
                    b0Var3 = b0Var2;
                    mcVar3 = mcVar2;
                    z19 = z17;
                    i19 = i17;
                    o0VarE.C(1705321629);
                    o0VarE.f();
                }
                bv.b.f21239a.getClass();
                if (((kd0.m) bv.b.a()).l().m()) {
                    o0VarE.C(1705470367);
                    f(cVar2, aVar2, o0VarE, km1.c.B | (i27 & 14) | ((i27 >> 9) & 112));
                    o0VarE.f();
                } else {
                    o0VarE.C(1705652957);
                    o0VarE.f();
                }
                if (z14) {
                    o0VarE.C(1705703983);
                    if (cVar2 != null || (dailySleep2 = cVar2.getDailySleep()) == null) {
                        sleepScorePersonalizedInsight = th3;
                    } else {
                        sleepScorePersonalizedInsight = dailySleep2.getSleepScorePersonalizedInsight();
                    }
                    km1.g.f105523a.getClass();
                    if (km1.g.a(sleepScorePersonalizedInsight)) {
                        z24 = false;
                        o0VarE.C(1706164829);
                        o0VarE.f();
                    } else {
                        o0VarE.C(1705878451);
                        z24 = false;
                        h(r14.e(sleepScorePersonalizedInsight), r14.d(sleepScorePersonalizedInsight), o0VarE, 0);
                        o0VarE.f();
                    }
                    o0VarE.f();
                } else {
                    z24 = false;
                    o0VarE.C(1706178717);
                    o0VarE.f();
                }
                o0VarE.y();
                if (mcVar3.e()) {
                    o0VarE.C(-426868066);
                    if (cVar2 != null || (dailySleep = cVar2.getDailySleep()) == null) {
                        vVar = new km1.v(0L, 0L, null, 0, 0, false, null, 0L, 0L, 0L, 0L, null, null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 8191, null);
                    } else {
                        vVar = km1.v.b(dailySleep, dVar.getUserProfilePk(), dateTime.toString("yyyy-MM-dd"), 0, 0L, 0L, null, -7, 8191);
                    }
                    boolean zR5 = o0VarE.r(sVar) | o0VarE.r(b0Var3);
                    if ((i27 & 14) != 4 || ((i27 & 8) != 0 && o0VarE.r(cVar2))) {
                        z25 = z19;
                    } else {
                        z25 = z24;
                    }
                    boolean z37 = zR5 | z25;
                    if ((i27 & 7168) == 2048) {
                        z26 = z19;
                    } else {
                        z26 = z24;
                    }
                    context2 = context;
                    zR2 = z37 | z26 | o0VarE.r(context2);
                    objQ5 = o0VarE.q();
                    if (zR2 || objQ5 == p3.m.a.a()) {
                        f fVar3 = new f(sVar, b0Var3, cVar2, aVar, context2);
                        o0VarE.K(fVar3);
                        objQ5 = fVar3;
                    }
                    pn1.b.a(false, vVar, null, b0Var3, mcVar3, (e23.l) objQ5, o0VarE, km1.v.P0 << 3, 5);
                    o0VarE.f();
                } else {
                    o0VarE.C(-425525549);
                    o0VarE.f();
                }
                o0VarE.y();
                x1 x1Var3 = p3.n.f135158a;
            }
            v.h.A(iHashCode5, o0VarE, iHashCode5, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC5, o0VarE);
            b0Var = b0.f22601a;
            if (z14) {
                o0VarE.C(-435466753);
                h4.r rVarE2 = u1.n.e(aVar5, tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
                bVar = d92.b.f58625c;
                bVar.getClass();
                eVar3 = j92.b.f97899b;
                h4.r rVarY2 = c2.l.y(rVarE2, eVar3.f97920e);
                zVarA2 = y.a(kVar, h4.d.a.f81537o, o0VarE, 48);
                iHashCode2 = Long.hashCode(o0VarE.getU());
                i2VarA0 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarY2, o0VarE);
                if (cVar3 != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                a0Var2 = a0VarV;
                if (o0VarE.T) {
                    o0VarE.M(aVar7);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar4, zVarA2, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                }
                b4.c(fVar, rVarC2, o0VarE);
                objQ7 = o0VarE.q();
                if (objQ7 == c2565a) {
                    objQ7 = new fh0.b(17);
                    o0VarE.K(objQ7);
                }
                h4.r rVarC14 = p5.v.c((e23.l) objQ7, aVar5, true);
                zVarA3 = y.a(kVar, aVar6, o0VarE, 0);
                iHashCode3 = Long.hashCode(o0VarE.getU());
                i2VarA1 = o0VarE.a0();
                rVarC3 = h4.k.c(rVarC14, o0VarE);
                if (cVar3 != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar7);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar4, zVarA3, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
                } else {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
                }
                b4.c(fVar, rVarC3, o0VarE);
                b10.c cVar6 = e0Var3.f105512c;
                context3 = e0Var3.f105510a;
                if (a0Var2 != null) {
                    string = context3.getString(R.string.no_value_card);
                    string.getClass();
                } else {
                    string = context3.getString(R.string.no_value_card);
                    string.getClass();
                }
                h4.r rVarF5 = x2.f(aVar5, 1.0f);
                String str4 = string;
                zR4 = o0VarE.r(a0Var2) | o0VarE.r(cVar4);
                objQ8 = o0VarE.q();
                if (zR4) {
                    objQ8 = new e52.b(20, a0Var2, cVar4);
                    o0VarE.K(objQ8);
                } else {
                    objQ8 = new e52.b(20, a0Var2, cVar4);
                    o0VarE.K(objQ8);
                }
                h4.r rVarC15 = p5.v.c((e23.l) objQ8, rVarF5, false);
                bVar.getClass();
                h4.r rVarC16 = c2.l.C(rVarC15, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13);
                d6.h.f57752b.getClass();
                int i29 = d6.h.f57755e;
                d6.h hVarA3 = d6.h.a(i29);
                fVar2 = d92.b.f58624b;
                fVar2.getClass();
                th3 = null;
                context = context5;
                z15 = z35;
                mh.c(str4, rVarC16, 0L, null, 0L, null, 0L, hVarA3, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97928e, o0VarE), o0VarE, 0, 0, 130044);
                if (zF) {
                    i24 = R.string.lbl_recommended;
                } else {
                    i24 = R.string.lbl_sleep_need;
                }
                String strQ3 = gl1.y.Q(o0VarE, i24);
                h4.r rVarF6 = x2.f(aVar5, 1.0f);
                bVar.getClass();
                h4.r rVarC17 = c2.l.C(rVarF6, 0.0f, 0.0f, 0.0f, eVar3.f97918c, 7);
                d6.h hVarA4 = d6.h.a(i29);
                fVar2.getClass();
                x0Var = j92.f.f97932i;
                mh.c(strQ3, rVarC17, 0L, null, 0L, null, 0L, hVarA4, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0VarE), o0VarE, 0, 0, 130044);
                o0VarE = o0VarE;
                o0VarE.g0(true);
                if (a0Var2 == null) {
                    o0VarE.C(1282058750);
                    i25 = 0;
                    o0VarE.g0(false);
                    z29 = zF;
                } else {
                    o0VarE.C(1282058751);
                    actual = a0Var2.getActual();
                    if (actual != null) {
                        iIntValue2 = actual.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    baseline = a0Var2.getBaseline();
                    if (baseline != null) {
                        iIntValue3 = baseline.intValue();
                    } else {
                        iIntValue3 = 0;
                    }
                    bVar.getClass();
                    float f15 = eVar3.f97921f;
                    bVar.getClass();
                    h4.r rVarC18 = c2.l.C(aVar5, 0.0f, f15, 0.0f, eVar3.f97920e, 5);
                    z29 = zF;
                    aVar5 = aVar5;
                    bn1.k.a(iIntValue2, iIntValue3, rVarC18, z29, 0, 0, 0.0f, o0VarE, 0);
                    o0VarE = o0VarE;
                    Unit unit2 = Unit.INSTANCE;
                    i25 = 0;
                    o0VarE.g0(false);
                }
                objQ9 = o0VarE.q();
                if (objQ9 == c2565a) {
                    objQ9 = new fh0.b(20);
                    o0VarE.K(objQ9);
                }
                h4.r rVarC19 = p5.v.c((e23.l) objQ9, aVar5, r9);
                zVarA4 = y.a(kVar, aVar6, o0VarE, i25);
                x1 x1Var4 = p3.n.f135158a;
                iHashCode4 = Long.hashCode(o0VarE.getU());
                i2VarA2 = o0VarE.a0();
                rVarC4 = h4.k.c(rVarC19, o0VarE);
                if (cVar3 != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar7);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar4, zVarA4, o0VarE);
                b4.c(c1623g, i2VarA2, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode4, o0VarE, iHashCode4, bVar2);
                } else {
                    v.h.A(iHashCode4, o0VarE, iHashCode4, bVar2);
                }
                b4.c(fVar, rVarC4, o0VarE);
                if (z29) {
                    if (a0Var2 != null) {
                        feedback3 = a0Var2.getFeedback();
                    } else {
                        feedback3 = null;
                    }
                    km1.e0 e0Var5 = e0Var3;
                    string2 = e0Var5.a(feedback3);
                    context4 = context3;
                    e0Var2 = e0Var5;
                } else {
                    e0Var = e0Var3;
                    if (a0Var2 != null) {
                        feedback = a0Var2.getFeedback();
                    } else {
                        feedback = null;
                    }
                    if (feedback != null) {
                        if (km1.t.HIGHLY_INCREASED.f105583a.contains(feedback)) {
                            i26 = R.string.lbl_sleep_need_feedback_highly_increased_past;
                        } else if (km1.t.INCREASED.f105583a.contains(feedback)) {
                            i26 = R.string.lbl_sleep_need_feedback_increased_past;
                        } else if (!km1.t.NO_CHANGE_NO_ADJUSTMENTS.f105583a.contains(feedback)) {
                            i26 = R.string.lbl_sleep_need_feedback_no_change_past;
                        } else if (km1.t.DECREASED.f105583a.contains(feedback)) {
                            i26 = R.string.lbl_sleep_need_feedback_decrease_past;
                        } else if (km1.t.NONE.f105583a.contains(feedback)) {
                            i26 = R.string.lbl_sleep_need_feedback_no_change_past;
                        } else {
                            i26 = -1;
                        }
                        if (i26 != -1) {
                            context4 = context3;
                            string2 = context4.getString(i26);
                            e0Var2 = e0Var;
                        } else {
                            context4 = context3;
                            string2 = null;
                            e0Var2 = e0Var;
                        }
                    } else {
                        context4 = context3;
                        string2 = null;
                        e0Var2 = e0Var;
                    }
                }
                str = string2;
                if (str != null) {
                    o0VarE.C(-2125740938);
                    bVar.getClass();
                    h4.r rVarF7 = x2.f(c2.l.C(aVar5, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13), 1.0f);
                    fVar2.getClass();
                    o0 o0Var5 = o0VarE;
                    z16 = z29;
                    mh.c(str, rVarF7, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), o0Var5, 0, 0, 131068);
                    o0VarE = o0Var5;
                    o0VarE.g0(false);
                } else {
                    z16 = z29;
                    o0VarE.C(-2125342123);
                    o0VarE.g0(false);
                }
                if (a0Var2 == null) {
                    str2 = null;
                } else {
                    baseline2 = a0Var2.getBaseline();
                    Integer actual4 = a0Var2.getActual();
                    if (baseline2 != null) {
                        str2 = null;
                    } else {
                        str2 = null;
                    }
                }
                if (str2 != null) {
                    o0VarE.C(-2125188487);
                    bVar.getClass();
                    h4.r rVarC110 = c2.l.C(aVar5, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13);
                    fVar2.getClass();
                    x0Var2 = x0Var;
                    o0 o0Var6 = o0VarE;
                    mh.c(str2, rVarC110, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var2, o0VarE), o0Var6, 0, 0, 131068);
                    o0VarE = o0Var6;
                    o0VarE.g0(false);
                } else {
                    x0Var2 = x0Var;
                    o0VarE.C(-2124915563);
                    o0VarE.g0(false);
                }
                sn1.b.f160414a.getClass();
                if (sn1.b.e()) {
                    o0VarE.C(-2124813914);
                    if (a0Var2 != null) {
                        uVarB = km1.b0.b(a0Var2);
                    } else {
                        uVarB = null;
                    }
                    if (a0Var2 != null) {
                        uVarA = km1.b0.a(a0Var2);
                    } else {
                        uVarA = null;
                    }
                    strA = aVar4.a(uVarB, uVarA, z16);
                    if (strA != null) {
                        o0VarE.C(-2124392717);
                        bVar.getClass();
                        h4.r.a aVar10 = aVar5;
                        h4.r rVarC111 = c2.l.C(aVar10, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13);
                        aVar3 = aVar10;
                        fVar2.getClass();
                        o0 o0Var7 = o0VarE;
                        mh.c(strA, rVarC111, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var2, o0VarE), o0Var7, 0, 0, 131068);
                        o0VarE = o0Var7;
                        z34 = false;
                        o0VarE.g0(false);
                    } else {
                        aVar3 = aVar5;
                        z34 = false;
                        o0VarE.C(-2124083275);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(z34);
                } else {
                    aVar3 = aVar5;
                    z34 = false;
                    o0VarE.C(-2124061451);
                    o0VarE.g0(false);
                }
                e5.u(o0VarE, r9, r9, z34);
                cVar2 = cVar;
                z17 = true;
                r15 = z34;
                mcVar2 = mcVar;
                a0Var = a0Var2;
                b0Var2 = b0Var4;
                i17 = 3;
                r14 = e0Var2;
            } else {
                aVar3 = aVar5;
                r14 = e0Var3;
                km1.a0 a0Var4 = a0VarV;
                context = context5;
                z15 = z35;
                z16 = zF;
                th3 = null;
                o0VarE.C(-431377016);
                b0Var2 = b0Var4;
                mcVar2 = mcVar;
                zR = o0VarE.r(b0Var2) | o0VarE.B(mcVar2);
                objQ = o0VarE.q();
                if (zR) {
                    i16 = 3;
                    objQ = new cn1.t(b0Var2, mcVar2, 3);
                    o0VarE.K(objQ);
                } else {
                    i16 = 3;
                    objQ = new cn1.t(b0Var2, mcVar2, 3);
                    o0VarE.K(objQ);
                }
                i17 = i16;
                z17 = true;
                r15 = 0;
                a0Var = a0Var4;
                u.b(cVar, dateTime, sVar, (e23.a) objQ, o0VarE, (i27 & 896) | km1.c.B | (i27 & 14) | (i27 & 112));
                cVar2 = cVar;
                o0VarE.g0(false);
            }
            d92.b.f58623a.getClass();
            h4.r rVarF8 = u1.n.f(d92.b.a(o0VarE).c().b(), aVar3);
            zVarA = y.a(c2.j.b(), h4.d.a.b(), o0VarE, r15);
            iHashCode = Long.hashCode(p0.i(o0VarE));
            i2VarX = o0VarE.x();
            rVarC = h4.k.c(rVarF8, o0VarE);
            aVarA = h5.g.a.a();
            if (o0VarE.F() != null) {
                p0.l();
                throw th3;
            }
            o0VarE.z();
            if (o0VarE.getT()) {
                o0VarE.M(aVarA);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.c(), zVarA, o0VarE);
            b4.c(h5.g.a.e(), i2VarX, o0VarE);
            bVarB = h5.g.a.b();
            if (o0VarE.getT()) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVarB);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVarB);
            }
            b4.c(h5.g.a.d(), rVarC, o0VarE);
            c0 c0Var5 = c0.ACTIVITY_HISTORY;
            i18 = i27 & 458752;
            if (i18 == 131072) {
                r16 = z17;
            } else {
                r16 = r15;
            }
            objQ2 = o0VarE.q();
            if (r16 == 0) {
                lVar2 = lVar;
                objQ2 = new e40.g(lVar2, 24);
                o0VarE.K(objQ2);
            } else {
                lVar2 = lVar;
                objQ2 = new e40.g(lVar2, 24);
                o0VarE.K(objQ2);
            }
            o13.p pVarA2 = g8.i.a0(c0Var5, (e23.a) objQ2);
            c0 c0Var6 = c0.SLEEP_HISTORY;
            if (i18 == 131072) {
                r17 = z17;
            } else {
                r17 = r15;
            }
            objQ3 = o0VarE.q();
            if (r17 == 0) {
                objQ3 = new e40.g(lVar2, 25);
                o0VarE.K(objQ3);
            } else {
                objQ3 = new e40.g(lVar2, 25);
                o0VarE.K(objQ3);
            }
            o13.p pVarA3 = g8.i.a0(c0Var6, (e23.a) objQ3);
            c0 c0Var7 = c0.HRV_STATUS;
            if (i18 == 131072) {
                z18 = z17;
            } else {
                z18 = false;
            }
            objQ4 = o0VarE.q();
            if (z18) {
                objQ4 = new e40.g(lVar2, 26);
                o0VarE.K(objQ4);
            } else {
                objQ4 = new e40.g(lVar2, 26);
                o0VarE.K(objQ4);
            }
            LinkedHashMap linkedHashMapF2 = p13.u0.f(pVarA2, pVarA3, g8.i.a0(c0Var7, (e23.a) objQ4));
            if (cVar2 != null) {
                size = 0;
            } else {
                size = 0;
            }
            if (cVar2 != null) {
                iIntValue = 0;
            } else {
                iIntValue = 0;
            }
            if (size > 0) {
                o0VarE.C(1702834685);
                o0VarE.f();
            } else {
                o0VarE.C(1702834685);
                o0VarE.f();
            }
            if (cVar2 != null) {
                hrvStatus = cVar2.getHrvStatus();
            } else {
                r18 = th3;
            }
            if (z14) {
                r18 = hrvStatus;
                listA = d0.a(a0Var, r18, size, iIntValue, z15);
            } else {
                arrayList = new ArrayList();
                if (iIntValue > 0) {
                    km1.j.f105531a.getClass();
                    if (size != 0) {
                        if (size != z17) {
                            eVar = km1.e.ONE_NAP;
                        } else if (size != 2) {
                            eVar = km1.e.MORE_THAN_TWO_NAPS;
                        } else {
                            eVar = km1.e.TWO_NAPS;
                        }
                        r24 = eVar;
                    } else {
                        r24 = th3;
                    }
                    arrayList.add(new km1.w.b(c0.NAPS, r24, size, Integer.valueOf(iIntValue), null, 16, null));
                    listA = arrayList;
                }
            }
            r18 = hrvStatus;
            listA = arrayList;
            listA = arrayList;
            a(listA, linkedHashMapF2, z16, o0VarE, 0);
            if (z16) {
                r19 = listT;
                b0Var3 = b0Var2;
                mcVar3 = mcVar2;
                z19 = z17;
                i19 = i17;
                o0VarE.C(1705321629);
                o0VarE.f();
            } else {
                if (!z14) {
                    if (cVar2 != null) {
                        r19 = th3;
                    } else {
                        r19 = th3;
                    }
                    if (r19 != 0) {
                        r19 = listT;
                        r19 = listT;
                        z28 = z17;
                    } else {
                        r19 = listT;
                        r19 = listT;
                        z28 = z17;
                    }
                    if (!z28) {
                        r19 = listT;
                        b0Var3 = b0Var2;
                        mcVar3 = mcVar2;
                        z19 = z17;
                        i19 = i17;
                        o0VarE.C(1705321629);
                        o0VarE.f();
                    }
                }
                r19 = listT;
                o0VarE.C(1703801327);
                if (listA.isEmpty()) {
                    o0VarE.C(1703796057);
                    h4.r.a aVar11 = h4.r.S;
                    d92.b.f58623a.getClass();
                    c2.l.f(x2.h(aVar11, d92.b.b().b().getF97920e()), o0VarE);
                    o0VarE.f();
                } else {
                    o0VarE.C(1703892157);
                    o0VarE.f();
                }
                objQ6 = o0VarE.q();
                if (objQ6 == p3.m.a.a()) {
                    objQ6 = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ6);
                }
                p1Var = (p1) objQ6;
                l72.p2 p2Var2 = l72.p2.f111205a;
                String strQ4 = gl1.y.Q(o0VarE, R.string.lbl_add_nap);
                a.f72180a.getClass();
                z19 = z17;
                z3.e eVar6 = a.f72181b;
                if ((i27 & 14) != 4) {
                    z27 = z19;
                } else {
                    z27 = z19;
                }
                zR3 = z27 | o0VarE.r(b0Var2) | o0VarE.B(mcVar2);
                Object objQ13 = o0VarE.q();
                if (zR3) {
                    b0Var3 = b0Var2;
                    mc mcVar5 = mcVar2;
                    eVar2 = new af0.e((Object) cVar2, (Object) b0Var3, (Object) mcVar5, (Object) p1Var, 22);
                    mcVar3 = mcVar5;
                    o0VarE.K(eVar2);
                } else {
                    b0Var3 = b0Var2;
                    mc mcVar6 = mcVar2;
                    eVar2 = new af0.e((Object) cVar2, (Object) b0Var3, (Object) mcVar6, (Object) p1Var, 22);
                    mcVar3 = mcVar6;
                    o0VarE.K(eVar2);
                }
                o0 o0Var8 = o0VarE;
                i19 = i17;
                p2Var2.g(strQ4, null, null, null, eVar6, false, false, (e23.a) eVar2, o0Var8, 24576, 238);
                r1.c0.c(b0Var, ((Boolean) p1Var.getF182175a()).booleanValue(), null, null, null, null, z3.f.c(-882141265, new eb0.a(p1Var, i19), o0Var8), o0Var8, 1572870, 30);
                o0VarE = o0Var8;
                o0VarE.f();
            }
            bv.b.f21239a.getClass();
            if (((kd0.m) bv.b.a()).l().m()) {
                o0VarE.C(1705470367);
                f(cVar2, aVar2, o0VarE, km1.c.B | (i27 & 14) | ((i27 >> 9) & 112));
                o0VarE.f();
            } else {
                o0VarE.C(1705652957);
                o0VarE.f();
            }
            if (z14) {
                o0VarE.C(1705703983);
                if (cVar2 != null) {
                    sleepScorePersonalizedInsight = th3;
                } else {
                    sleepScorePersonalizedInsight = th3;
                }
                km1.g.f105523a.getClass();
                if (km1.g.a(sleepScorePersonalizedInsight)) {
                    o0VarE.C(1705878451);
                    z24 = false;
                    h(r14.e(sleepScorePersonalizedInsight), r14.d(sleepScorePersonalizedInsight), o0VarE, 0);
                    o0VarE.f();
                } else {
                    z24 = false;
                    o0VarE.C(1706164829);
                    o0VarE.f();
                }
                o0VarE.f();
            } else {
                z24 = false;
                o0VarE.C(1706178717);
                o0VarE.f();
            }
            o0VarE.y();
            if (mcVar3.e()) {
                o0VarE.C(-426868066);
                if (cVar2 != null) {
                    vVar = new km1.v(0L, 0L, null, 0, 0, false, null, 0L, 0L, 0L, 0L, null, null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 8191, null);
                } else {
                    vVar = new km1.v(0L, 0L, null, 0, 0, false, null, 0L, 0L, 0L, 0L, null, null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 8191, null);
                }
                boolean zR6 = o0VarE.r(sVar) | o0VarE.r(b0Var3);
                if ((i27 & 14) != 4) {
                    z25 = z19;
                } else {
                    z25 = z19;
                }
                boolean z38 = zR6 | z25;
                if ((i27 & 7168) == 2048) {
                    z26 = z19;
                } else {
                    z26 = z24;
                }
                context2 = context;
                zR2 = z38 | z26 | o0VarE.r(context2);
                objQ5 = o0VarE.q();
                if (zR2) {
                    f fVar4 = new f(sVar, b0Var3, cVar2, aVar, context2);
                    o0VarE.K(fVar4);
                    objQ5 = fVar4;
                } else {
                    f fVar5 = new f(sVar, b0Var3, cVar2, aVar, context2);
                    o0VarE.K(fVar5);
                    objQ5 = fVar5;
                }
                pn1.b.a(false, vVar, null, b0Var3, mcVar3, (e23.l) objQ5, o0VarE, km1.v.P0 << 3, 5);
                o0VarE.f();
            } else {
                o0VarE.C(-425525549);
                o0VarE.f();
            }
            o0VarE.y();
            x1 x1Var5 = p3.n.f135158a;
        } else {
            dateTime = dateTime;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f(new g0(cVar, dateTime, sVar, aVar, aVar2, (o13.h) lVar, i14, 12));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(String str, String str2, p3.m mVar, int i14) {
        String str3;
        o0 o0Var;
        o0 o0Var2;
        h4.r.a aVar;
        int i15;
        j92.e eVar;
        o0 o0Var3;
        float f14;
        o0 o0VarE = mVar.E(402189028);
        int i16 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.B(str2) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            if (str == null && str2 == null) {
                p2 p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new b82.o(str, str2, i14, 12);
                    return;
                }
                return;
            }
            h4.r.a aVar2 = h4.r.S;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new fh0.b(18);
                o0VarE.K(objQ);
            }
            h4.r rVarC = p5.v.c((e23.l) objQ, aVar2, true);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar2 = j92.b.f97899b;
            h4.r rVarY = c2.l.y(rVarC, eVar2.f97920e);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            if (str != null) {
                o0VarE.C(61181866);
                d92.b.f58624b.getClass();
                aVar = aVar2;
                eVar = eVar2;
                mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), o0VarE, i16 & 14, 0, 131070);
                o0Var2 = o0VarE;
                i15 = 0;
                o0Var2.g0(false);
            } else {
                o0Var2 = o0VarE;
                aVar = aVar2;
                i15 = 0;
                eVar = eVar2;
                o0Var2.C(61272200);
                o0Var2.g0(false);
            }
            if (str2 != null) {
                o0Var2.C(61319692);
                if (str != null) {
                    bVar.getClass();
                    f14 = eVar.f97921f;
                } else {
                    f14 = i15;
                    g6.f.a aVar4 = g6.f.f75994b;
                }
                float f15 = f14;
                d92.b.f58624b.getClass();
                s5.x0 x0VarB = d92.c.b(j92.f.f97932i, o0Var2);
                o0 o0Var4 = o0Var2;
                str3 = str2;
                mh.c(str3, c2.l.C(aVar, 0.0f, f15, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0Var4, (i16 >> 3) & 14, 0, 131068);
                o0 o0Var5 = o0Var4;
                o0Var5.g0(false);
                o0Var3 = o0Var5;
            } else {
                boolean z14 = i15;
                o0 o0Var6 = o0Var2;
                str3 = str2;
                o0Var6.C(61531112);
                o0Var6.g0(z14);
                o0Var3 = o0Var6;
            }
            o0Var3.g0(true);
            o0Var = o0Var3;
        } else {
            str3 = str2;
            o0 o0Var7 = o0VarE;
            o0Var7.e();
            o0Var = o0Var7;
        }
        p2 p2VarI1 = o0Var.i0();
        if (p2VarI1 != null) {
            p2VarI1.f135219d = new b82.o(str, str3, i14, 13);
        }
    }
}
