package com.garmin.android.apps.connectmobile.activities.stats.timinggates;

import a3.a1;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import b82.d2;
import b82.g0;
import c2.j;
import c2.l;
import c2.q2;
import c2.s2;
import c2.t2;
import c2.u2;
import c2.x2;
import c2.z;
import c22.b;
import c22.l3;
import c22.t;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.stats.timinggates.TimingGatesActivity;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.l2;
import cq0.i;
import d6.p;
import e23.q;
import g6.f;
import gl1.y;
import h4.d;
import h4.g;
import h4.k;
import h4.r;
import h5.e0;
import i3.e5;
import i3.mh;
import i3.v5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.t1;
import l72.v2;
import l72.x0;
import o4.m1;
import o72.a3;
import org.slf4j.Marker;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.n0;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.x;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import v.h;
import w02.b0;
import z3.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/timinggates/TimingGatesActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "", "width", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TimingGatesActivity extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f29952c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f29953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f29954b;

    public static float ha(m mVar) {
        x1 x1Var = n.f135158a;
        Context context = (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b);
        f.a aVar = f.f75994b;
        return b0.w(b.c(context, b0.g(90, mVar), 1.3f), mVar);
    }

    public static float ia(m mVar) {
        x1 x1Var = n.f135158a;
        Context context = (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b);
        f.a aVar = f.f75994b;
        return b0.w(b.c(context, b0.g(60, mVar), 1.3f), mVar);
    }

    public final void ca(final Double d14, final Double d15, m mVar, int i14) {
        o0 o0VarE = mVar.E(-845712704);
        int i15 = i14 | (o0VarE.B(d14) ? 4 : 2) | (o0VarE.B(d15) ? 32 : 16);
        final int i16 = 0;
        final int i17 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            final yq.c cVar = new yq.c(new l22.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b)));
            x0 x0Var = x0.f111346a;
            r.a aVar = r.S;
            float f14 = 16;
            f.a aVar2 = f.f75994b;
            r rVarY = l.y(aVar, f14);
            e eVarC = z3.f.c(-540445817, new q() { // from class: yq.b
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    String strA;
                    String strA2;
                    String strG;
                    String strA3;
                    String str;
                    int i18 = i16;
                    Double d16 = d15;
                    Double d17 = d14;
                    c cVar2 = cVar;
                    switch (i18) {
                        case 0:
                            l22.b bVar = cVar2.f198726a;
                            t2 t2Var = (t2) obj;
                            m mVar2 = (m) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            TimingGatesActivity.a aVar3 = TimingGatesActivity.f29952c;
                            t2Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= mVar2.B(t2Var) ? 4 : 2;
                            }
                            if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                                x1 x1Var2 = n.f135158a;
                                x0 x0Var2 = x0.f111346a;
                                String strC = cVar2.c(d17);
                                String string = bVar.getString(R.string.lbl_optimal_run);
                                b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                                if (Double.isNaN(d17.doubleValue())) {
                                    strA = bVar.a(R.string.string_space_string_pattern, bVar.getString(R.string.lbl_optimal_run), cVar2.f());
                                } else {
                                    l3.a aVar4 = l3.f23124b;
                                    double dDoubleValue = d17.doubleValue();
                                    aVar4.getClass();
                                    oi0.b bVar2 = new oi0.b(bVar, new oi0.h(bVar).a((long) (((double) 1000) * dDoubleValue), true));
                                    bVar2.M();
                                    Unit unit = Unit.INSTANCE;
                                    strA = bVar.a(R.string.string_space_string_pattern, bVar.getString(R.string.lbl_optimal_run), bVar2.f132238b);
                                }
                                c0235a.f16962a.put("merge", strA);
                                b92.a aVarB = c0235a.b();
                                int i19 = b92.a.f16960b;
                                int i24 = (iIntValue & 14) | (x0.f111348c << 24);
                                x0Var2.a(i24, 60, aVarB, t2Var, null, null, strC, string, null, null, mVar2);
                                String strC2 = cVar2.c(d16);
                                String string2 = bVar.getString(R.string.lbl_fastest_run);
                                b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
                                if (d16 == null || Double.isNaN(d16.doubleValue())) {
                                    strA2 = bVar.a(R.string.string_space_string_pattern, bVar.getString(R.string.lbl_fastest_run), cVar2.f());
                                } else {
                                    l3.a aVar5 = l3.f23124b;
                                    double dDoubleValue2 = d16.doubleValue();
                                    aVar5.getClass();
                                    oi0.b bVar3 = new oi0.b(bVar, new oi0.h(bVar).a((long) (dDoubleValue2 * ((double) 1000)), true));
                                    bVar3.M();
                                    Unit unit2 = Unit.INSTANCE;
                                    strA2 = bVar.a(R.string.string_space_string_pattern, bVar.getString(R.string.lbl_fastest_run), bVar3.f132238b);
                                }
                                c0235a2.f16962a.put("merge", strA2);
                                x0Var2.a(i24, 60, c0235a2.b(), t2Var, null, null, strC2, string2, null, null, mVar2);
                            } else {
                                mVar2.e();
                            }
                            break;
                        default:
                            l22.b bVar4 = cVar2.f198726a;
                            t2 t2Var2 = (t2) obj;
                            m mVar3 = (m) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            TimingGatesActivity.a aVar6 = TimingGatesActivity.f29952c;
                            t2Var2.getClass();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= mVar3.B(t2Var2) ? 4 : 2;
                            }
                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                x1 x1Var3 = n.f135158a;
                                x0 x0Var3 = x0.f111346a;
                                if (Double.isNaN(d17.doubleValue()) || d16 == null || Double.isNaN(d16.doubleValue())) {
                                    strG = cVar2.g();
                                } else {
                                    double dAbs = Math.abs(d16.doubleValue() - d17.doubleValue());
                                    if (d16.doubleValue() - d17.doubleValue() > 0.0d) {
                                        str = Marker.ANY_NON_NULL_MARKER;
                                    } else {
                                        str = d16.doubleValue() - d17.doubleValue() < 0.0d ? "-" : "";
                                    }
                                    l3.f23124b.getClass();
                                    String strW1 = l3.a.w1((long) (((double) 1000) * dAbs), null, true);
                                    if (strW1 == null) {
                                        strW1 = cVar2.g();
                                    }
                                    strG = str.concat(strW1);
                                }
                                String str2 = strG;
                                String string3 = bVar4.getString(R.string.lbl_difference);
                                b92.a.C0235a c0235a3 = new b92.a.C0235a(null, 1, null);
                                if (Double.isNaN(d17.doubleValue()) || d16 == null || Double.isNaN(d16.doubleValue())) {
                                    strA3 = bVar4.a(R.string.string_space_string_pattern, bVar4.getString(R.string.lbl_difference), cVar2.f());
                                } else {
                                    double dDoubleValue3 = d16.doubleValue() - d17.doubleValue();
                                    l3.f23124b.getClass();
                                    oi0.b bVar5 = new oi0.b(bVar4, new oi0.h(bVar4).a((long) (((double) 1000) * dDoubleValue3), true));
                                    bVar5.M();
                                    Unit unit3 = Unit.INSTANCE;
                                    strA3 = bVar4.a(R.string.string_space_string_pattern, bVar4.getString(R.string.lbl_difference), (dDoubleValue3 > 0.0d ? Marker.ANY_NON_NULL_MARKER : "").concat(bVar5.f132238b));
                                }
                                c0235a3.f16962a.put("merge", strA3);
                                b92.a aVarB2 = c0235a3.b();
                                int i25 = iIntValue2 & 14;
                                int i26 = b92.a.f16960b;
                                int i27 = x0.f111348c;
                                x0Var3.a((i27 << 24) | i25, 60, aVarB2, t2Var2, null, null, str2, string3, null, null, mVar3);
                                x0Var3.h(t2Var2, mVar3, i25 | (i27 << 3));
                            } else {
                                mVar3.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE);
            int i18 = (x0.f111348c << 6) | 54;
            x0Var.e(rVarY, eVarC, o0VarE, i18, 0);
            x0Var.e(l.y(aVar, f14), z3.f.c(-2002001168, new q() { // from class: yq.b
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    String strA;
                    String strA2;
                    String strG;
                    String strA3;
                    String str;
                    int i19 = i17;
                    Double d16 = d15;
                    Double d17 = d14;
                    c cVar2 = cVar;
                    switch (i19) {
                        case 0:
                            l22.b bVar = cVar2.f198726a;
                            t2 t2Var = (t2) obj;
                            m mVar2 = (m) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            TimingGatesActivity.a aVar3 = TimingGatesActivity.f29952c;
                            t2Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= mVar2.B(t2Var) ? 4 : 2;
                            }
                            if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                                x1 x1Var2 = n.f135158a;
                                x0 x0Var2 = x0.f111346a;
                                String strC = cVar2.c(d17);
                                String string = bVar.getString(R.string.lbl_optimal_run);
                                b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                                if (Double.isNaN(d17.doubleValue())) {
                                    strA = bVar.a(R.string.string_space_string_pattern, bVar.getString(R.string.lbl_optimal_run), cVar2.f());
                                } else {
                                    l3.a aVar4 = l3.f23124b;
                                    double dDoubleValue = d17.doubleValue();
                                    aVar4.getClass();
                                    oi0.b bVar2 = new oi0.b(bVar, new oi0.h(bVar).a((long) (((double) 1000) * dDoubleValue), true));
                                    bVar2.M();
                                    Unit unit = Unit.INSTANCE;
                                    strA = bVar.a(R.string.string_space_string_pattern, bVar.getString(R.string.lbl_optimal_run), bVar2.f132238b);
                                }
                                c0235a.f16962a.put("merge", strA);
                                b92.a aVarB = c0235a.b();
                                int i110 = b92.a.f16960b;
                                int i24 = (iIntValue & 14) | (x0.f111348c << 24);
                                x0Var2.a(i24, 60, aVarB, t2Var, null, null, strC, string, null, null, mVar2);
                                String strC2 = cVar2.c(d16);
                                String string2 = bVar.getString(R.string.lbl_fastest_run);
                                b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
                                if (d16 == null || Double.isNaN(d16.doubleValue())) {
                                    strA2 = bVar.a(R.string.string_space_string_pattern, bVar.getString(R.string.lbl_fastest_run), cVar2.f());
                                } else {
                                    l3.a aVar5 = l3.f23124b;
                                    double dDoubleValue2 = d16.doubleValue();
                                    aVar5.getClass();
                                    oi0.b bVar3 = new oi0.b(bVar, new oi0.h(bVar).a((long) (dDoubleValue2 * ((double) 1000)), true));
                                    bVar3.M();
                                    Unit unit2 = Unit.INSTANCE;
                                    strA2 = bVar.a(R.string.string_space_string_pattern, bVar.getString(R.string.lbl_fastest_run), bVar3.f132238b);
                                }
                                c0235a2.f16962a.put("merge", strA2);
                                x0Var2.a(i24, 60, c0235a2.b(), t2Var, null, null, strC2, string2, null, null, mVar2);
                            } else {
                                mVar2.e();
                            }
                            break;
                        default:
                            l22.b bVar4 = cVar2.f198726a;
                            t2 t2Var2 = (t2) obj;
                            m mVar3 = (m) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            TimingGatesActivity.a aVar6 = TimingGatesActivity.f29952c;
                            t2Var2.getClass();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= mVar3.B(t2Var2) ? 4 : 2;
                            }
                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                x1 x1Var3 = n.f135158a;
                                x0 x0Var3 = x0.f111346a;
                                if (Double.isNaN(d17.doubleValue()) || d16 == null || Double.isNaN(d16.doubleValue())) {
                                    strG = cVar2.g();
                                } else {
                                    double dAbs = Math.abs(d16.doubleValue() - d17.doubleValue());
                                    if (d16.doubleValue() - d17.doubleValue() > 0.0d) {
                                        str = Marker.ANY_NON_NULL_MARKER;
                                    } else {
                                        str = d16.doubleValue() - d17.doubleValue() < 0.0d ? "-" : "";
                                    }
                                    l3.f23124b.getClass();
                                    String strW1 = l3.a.w1((long) (((double) 1000) * dAbs), null, true);
                                    if (strW1 == null) {
                                        strW1 = cVar2.g();
                                    }
                                    strG = str.concat(strW1);
                                }
                                String str2 = strG;
                                String string3 = bVar4.getString(R.string.lbl_difference);
                                b92.a.C0235a c0235a3 = new b92.a.C0235a(null, 1, null);
                                if (Double.isNaN(d17.doubleValue()) || d16 == null || Double.isNaN(d16.doubleValue())) {
                                    strA3 = bVar4.a(R.string.string_space_string_pattern, bVar4.getString(R.string.lbl_difference), cVar2.f());
                                } else {
                                    double dDoubleValue3 = d16.doubleValue() - d17.doubleValue();
                                    l3.f23124b.getClass();
                                    oi0.b bVar5 = new oi0.b(bVar4, new oi0.h(bVar4).a((long) (((double) 1000) * dDoubleValue3), true));
                                    bVar5.M();
                                    Unit unit3 = Unit.INSTANCE;
                                    strA3 = bVar4.a(R.string.string_space_string_pattern, bVar4.getString(R.string.lbl_difference), (dDoubleValue3 > 0.0d ? Marker.ANY_NON_NULL_MARKER : "").concat(bVar5.f132238b));
                                }
                                c0235a3.f16962a.put("merge", strA3);
                                b92.a aVarB2 = c0235a3.b();
                                int i25 = iIntValue2 & 14;
                                int i26 = b92.a.f16960b;
                                int i27 = x0.f111348c;
                                x0Var3.a((i27 << 24) | i25, 60, aVarB2, t2Var2, null, null, str2, string3, null, null, mVar3);
                                x0Var3.h(t2Var2, mVar3, i25 | (i27 << 3));
                            } else {
                                mVar3.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, i18, 0);
            String strQ = y.Q(o0VarE, R.string.lbl_optimal_run_footer);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            mh.c(strQ, l.C(aVar, f14, 0.0f, f14, f14, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xk1.e(this, d14, d15, i14, 20);
        }
    }

    public final void da(float f14, float f15, int i14, m mVar, int i15) {
        int i16;
        o0 o0VarE = mVar.E(1879893727);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.i(f14) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.k(i14) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= o0VarE.i(f15) ? 256 : 128;
        }
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            float f16 = 2;
            f.a aVar = f.f75994b;
            d92.b.f58623a.getClass();
            float f17 = i14;
            v5.a(f16, 48, 0, d92.b.a(o0VarE).j().c(), v2.a(v2.a(r.S, f14 <= f17, new as.e(i14, 10), o0VarE, 6), f14 > f17, new a1(f15, 7), o0VarE, 0), o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c22.a(this, f14, i14, f15, i15);
        }
    }

    public final void ea(int i14, r rVar, String str, m mVar, boolean z14) {
        int i15;
        o0 o0VarE = mVar.E(-1984737565);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(rVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(this) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            d.f81522a.getClass();
            g.a aVar = d.a.f81538p;
            f.a aVar2 = f.f75994b;
            r rVarU = x2.u(l.z(rVar, 16, 8), ha(o0VarE));
            j.f22691a.getClass();
            z zVarA = c2.y.a(j.f22694d, aVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarU, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            g.b bVar2 = d.a.f81534l;
            r.a aVar4 = r.S;
            s2 s2VarA = q2.a(j.f22692b, bVar2, o0VarE, 48);
            int i16 = i15;
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = k.c(aVar4, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            if (z14) {
                o0VarE.C(651632164);
                yq.f.a(0.0f, 0L, o0VarE, 0, 3);
                o0VarE.g0(false);
            } else {
                o0VarE.C(651683097);
                o0VarE.g0(false);
            }
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97932i), o0VarE);
            p.f57793b.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, p.f57794c, false, Integer.MAX_VALUE, 0, null, x0VarB, o0VarE, i16 & 14, 24960, 110590);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(this, str, z14, rVar, i14, 28);
        }
    }

    public final void fa(t2 t2Var, String str, boolean z14, r rVar, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-229755051);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(t2Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(rVar) ? 2048 : 1024;
        }
        byte b14 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            d2 d2Var = d2.f16532a;
            d.f81522a.getClass();
            d2Var.e(t2Var, rVar, d.a.f81538p, z3.f.c(1242491843, new g0(z14, str, 10, b14), o0VarE), o0VarE, (i15 & 14) | 3456 | ((i15 >> 6) & 112), 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ad0.l(this, t2Var, str, z14, rVar, i14, 25);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x037f  */
    /* JADX WARN: Code duplicated, block: B:107:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:109:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:110:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:115:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:119:0x0410  */
    /* JADX WARN: Code duplicated, block: B:121:0x0422  */
    /* JADX WARN: Code duplicated, block: B:127:0x0473  */
    /* JADX WARN: Code duplicated, block: B:129:0x0499  */
    /* JADX WARN: Code duplicated, block: B:133:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:135:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:136:0x050d  */
    /* JADX WARN: Code duplicated, block: B:143:0x053a  */
    /* JADX WARN: Code duplicated, block: B:148:0x0570  */
    /* JADX WARN: Code duplicated, block: B:152:0x0584  */
    /* JADX WARN: Code duplicated, block: B:154:0x0597  */
    /* JADX WARN: Code duplicated, block: B:156:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:158:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:160:0x05af  */
    /* JADX WARN: Code duplicated, block: B:162:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:173:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x019d  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:73:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:75:0x0201  */
    /* JADX WARN: Code duplicated, block: B:76:0x0205  */
    /* JADX WARN: Code duplicated, block: B:81:0x0220  */
    /* JADX WARN: Code duplicated, block: B:85:0x0267 A[LOOP:0: B:83:0x0262->B:85:0x0267, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:89:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:91:0x02d3 A[LOOP:1: B:87:0x02c5->B:91:0x02d3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:96:0x0353  */
    /* JADX WARN: Code duplicated, block: B:98:0x035a  */
    /* JADX WARN: Code duplicated, block: B:99:0x035e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void ga(ArrayList arrayList, boolean z14, HashMap map, zq.b bVar, m mVar, int i14) {
        zq.b bVar2;
        o0 o0Var;
        int i15;
        h5.g.a.f fVar;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        Object objQ;
        s2 s2VarA;
        int iHashCode2;
        i2 i2VarA1;
        r rVarC2;
        u2 u2Var;
        int i16;
        yq.c cVar;
        int i17;
        int i18;
        char c14;
        int i19;
        int i24;
        int i25;
        o0 o0Var2;
        yq.c cVar2;
        r.a aVar;
        d.b bVar3;
        z zVarA2;
        int iHashCode3;
        i2 i2VarA2;
        r rVarC3;
        e0.a aVar2;
        h5.g.a.e eVar;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar4;
        h5.g.a.f fVar2;
        int i26;
        s2 s2VarA2;
        int iHashCode4;
        i2 i2VarA3;
        r rVarC4;
        int i27;
        int i28;
        boolean zR;
        Object objQ2;
        int i29;
        int i30;
        StringBuilder sb3;
        boolean z15;
        boolean zR2;
        Object objQ3;
        int i34;
        StringBuilder sb4;
        boolean zR3;
        Object objQ4;
        int i35;
        o0 o0VarE = mVar.E(903246906);
        p3.c<?> cVar3 = o0VarE.f135177b;
        int i36 = i14 | (o0VarE.r(arrayList) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(map) ? 256 : 128) | (o0VarE.r(bVar) ? 2048 : 1024) | (o0VarE.r(this) ? 16384 : 8192);
        if (o0VarE.n(i36 & 1, (i36 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            yq.c cVar4 = new yq.c(new l22.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b)));
            List<ps.x1> list = ((zq.a) h0.b0(arrayList)).f206626c;
            int size = list != null ? list.size() : 0;
            float fIa = ia(o0VarE) + (ha(o0VarE) * size) + ((size + 1) * 32);
            int i37 = ((Configuration) o0VarE.A(AndroidCompositionLocals_androidKt.f6041a)).screenWidthDp;
            Object objQ5 = o0VarE.q();
            m.f135153a.getClass();
            Object obj = m.a.f135155b;
            if (objQ5 == obj) {
                objQ5 = e5.o(0, o0VarE);
            }
            n1 n1Var = (n1) objQ5;
            g6.c cVar5 = (g6.c) o0VarE.A(t1.f91490h);
            boolean zK = o0VarE.k(n1Var.getIntValue()) | o0VarE.B(cVar5);
            Object objQ6 = o0VarE.q();
            if (zK || objQ6 == obj) {
                objQ6 = f.a(cVar5.c1(n1Var.getIntValue()));
                o0VarE.K(objQ6);
            }
            float f14 = ((f) objQ6).f75997a;
            r.a aVar3 = r.S;
            r rVarA = v2.a(x2.d(aVar3, 1.0f), fIa > ((float) i37), new yp0.b(2), o0VarE, 6);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            d.f81522a.getClass();
            g.a aVar4 = d.a.f81536n;
            z zVarA3 = c2.y.a(kVar, aVar4, o0VarE, 0);
            int iHashCode5 = Long.hashCode(o0VarE.U);
            i2 i2VarA4 = o0VarE.a0();
            r rVarC5 = k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (cVar3 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA3, o0VarE);
            h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
            b4.c(c1623g2, i2VarA4, o0VarE);
            h5.g.a.b bVar5 = h5.g.a.f81813j;
            if (o0VarE.T) {
                i15 = size;
            } else {
                i15 = size;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode5))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC5, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                r rVarE = u1.n.e(x2.f(aVar3, 1.0f), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
                zVarA = c2.y.a(kVar, aVar4, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarE, o0VarE);
                if (cVar3 != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar5);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA, o0VarE);
                b4.c(c1623g2, i2VarA0, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    h.A(iHashCode, o0VarE, iHashCode, bVar5);
                }
                b4.c(fVar, rVarC, o0VarE);
                objQ = o0VarE.q();
                if (objQ == obj) {
                    objQ = new a3(n1Var, 20);
                    o0VarE.K(objQ);
                }
                r rVarG = f5.g0.g(aVar3, (e23.l) objQ);
                s2VarA = q2.a(j.f22692b, d.a.f81533k, o0VarE, 0);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = k.c(rVarG, o0VarE);
                if (cVar3 != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar5);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, s2VarA, o0VarE);
                b4.c(c1623g2, i2VarA1, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    h.A(iHashCode2, o0VarE, iHashCode2, bVar5);
                }
                b4.c(fVar, rVarC2, o0VarE);
                u2Var = u2.f22900a;
                d2 d2Var = d2.f16532a;
                String strQ = y.Q(o0VarE, R.string.pacepro_lbl_plan_splits_type);
                d2Var.getClass();
                i16 = i15;
                cVar = cVar4;
                i17 = 1;
                d2Var.c(u2Var, strQ, null, x2.u(d2.h(), ia(o0VarE)), aVar4, 0, 0, o0VarE, 24582, 50);
                o0VarE.C(-1830248679);
                i18 = 0;
                while (i18 < i16) {
                    d2 d2Var2 = d2.f16532a;
                    int i38 = i18 + 1;
                    String strP = y.P(R.string.lbl_enduro_split_index, new Object[]{String.valueOf(i38)}, o0VarE);
                    d.f81522a.getClass();
                    g.a aVar6 = d.a.f81538p;
                    d2Var2.getClass();
                    d2Var2.c(u2Var, strP, null, x2.u(d2.h(), ha(o0VarE)), aVar6, 0, 0, o0VarE, 24582, 50);
                    i18 = i38;
                }
                o0VarE.g0(false);
                o0VarE.g0(true);
                c14 = 3;
                i19 = (i36 >> 3) & 7168;
                da(fIa, f14, i37, o0VarE, i19);
                o0VarE.g0(true);
                o0VarE.C(167472306);
                i24 = 0;
                for (Object obj2 : arrayList) {
                    i35 = i24 + 1;
                    if (i24 >= 0) {
                        x.q();
                        throw null;
                    }
                    int i39 = i24;
                    yq.c cVar6 = cVar;
                    d2.f16532a.g(i39, 384, 2, null, o0VarE, z3.f.c(489817882, new ep.i(i39, this, (zq.a) obj2, cVar6, z14, 1), o0VarE));
                    c14 = c14;
                    cVar = cVar6;
                    i24 = i35;
                    i17 = i17;
                }
                i25 = i17;
                o0Var2 = o0VarE;
                cVar2 = cVar;
                o0Var2.g0(false);
                aVar = r.S;
                r rVarE2 = u1.n.e(x2.f(aVar, 1.0f), am.j.c(d92.b.f58623a, o0Var2), m1.f128891a);
                j.f22691a.getClass();
                j.k kVar2 = j.f22694d;
                d.f81522a.getClass();
                bVar3 = d.a.f81536n;
                zVarA2 = c2.y.a(kVar2, bVar3, o0Var2, 0);
                x1 x1Var2 = n.f135158a;
                iHashCode3 = Long.hashCode(o0Var2.U);
                i2VarA2 = o0Var2.a0();
                rVarC3 = k.c(rVarE2, o0Var2);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (cVar3 != null) {
                    p0.l();
                    throw null;
                }
                o0Var2.z();
                if (o0Var2.T) {
                    o0Var2.M(aVar2);
                } else {
                    o0Var2.c();
                }
                eVar = h5.g.a.f81810g;
                b4.c(eVar, zVarA2, o0Var2);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA2, o0Var2);
                bVar4 = h5.g.a.f81813j;
                if (o0Var2.T || !s.g(o0Var2.q(), Integer.valueOf(iHashCode3))) {
                    h.A(iHashCode3, o0Var2, iHashCode3, bVar4);
                }
                fVar2 = h5.g.a.f81807d;
                b4.c(fVar2, rVarC3, o0Var2);
                c2.b0 b0Var2 = c2.b0.f22601a;
                i26 = i25;
                da(fIa, f14, i37, o0Var2, i19);
                s2VarA2 = q2.a(j.f22692b, d.a.f81533k, o0Var2, 0);
                iHashCode4 = Long.hashCode(o0Var2.U);
                i2VarA3 = o0Var2.a0();
                rVarC4 = k.c(aVar, o0Var2);
                if (cVar3 != null) {
                    p0.l();
                    throw null;
                }
                o0Var2.z();
                if (o0Var2.T) {
                    o0Var2.M(aVar2);
                } else {
                    o0Var2.c();
                }
                b4.c(eVar, s2VarA2, o0Var2);
                b4.c(c1623g, i2VarA3, o0Var2);
                if (o0Var2.T || !s.g(o0Var2.q(), Integer.valueOf(iHashCode4))) {
                    h.A(iHashCode4, o0Var2, iHashCode4, bVar4);
                }
                b4.c(fVar2, rVarC4, o0Var2);
                t2 t2Var = u2.f22900a;
                d2 d2Var3 = d2.f16532a;
                i27 = R.string.lbl_total;
                String strQ2 = y.Q(o0Var2, R.string.lbl_total);
                r rVarU = x2.u(aVar, ia(o0Var2));
                i28 = R.string.lbl_enduro_split_index;
                d2Var3.a(t2Var, strQ2, rVarU, bVar3, 0, 0, o0Var2, 3078, 24);
                o0Var2.C(1747958758);
                for (Map.Entry entry : map.entrySet()) {
                    if (((zq.b) entry.getValue()).f206628b) {
                        o0Var2.C(72779920);
                        sb4 = new StringBuilder();
                        sb4.append(y.Q(o0Var2, i27));
                        sb4.append(",");
                        sb4.append(y.P(i28, new Object[]{String.valueOf(((Number) entry.getKey()).intValue() + 1)}, o0Var2));
                        sb4.append(",");
                        sb4.append(cVar2.f());
                        String strG = cVar2.g();
                        r.a aVar7 = r.S;
                        zR3 = o0Var2.r(sb4);
                        objQ4 = o0Var2.q();
                        if (zR3 || objQ4 == m.a.f135155b) {
                            objQ4 = new rg2.e(3, sb4);
                            o0Var2.K(objQ4);
                        }
                        r rVarB = v.b(aVar7, (e23.l) objQ4);
                        i30 = i27;
                        i29 = i28;
                        ea(i19 | 48, rVarB, strG, o0Var2, false);
                        o0Var2.g0(false);
                        i34 = i26;
                    } else {
                        i29 = i28;
                        i30 = i27;
                        o0Var2.C(73706293);
                        sb3 = new StringBuilder();
                        sb3.append(y.Q(o0Var2, i30));
                        sb3.append(",");
                        sb3.append(y.P(i29, new Object[]{String.valueOf(((Number) entry.getKey()).intValue() + 1)}, o0Var2));
                        sb3.append(",");
                        sb3.append(cVar2.d(Double.valueOf(((zq.b) entry.getValue()).f206627a)));
                        sb3.append(",");
                        if (s.g(bVar, entry.getValue()) || !z14) {
                            z15 = 0;
                        } else {
                            z15 = i26;
                        }
                        if (z15 != 0) {
                            o0Var2.C(74262402);
                            sb3.append(y.Q(o0Var2, R.string.lbl_fastest));
                            o0Var2.g0(false);
                        } else {
                            o0Var2.C(74389254);
                            o0Var2.g0(false);
                        }
                        String strC = cVar2.c(Double.valueOf(((zq.b) entry.getValue()).f206627a));
                        r.a aVar8 = r.S;
                        zR2 = o0Var2.r(sb3);
                        objQ3 = o0Var2.q();
                        if (!zR2 || objQ3 == m.a.f135155b) {
                            i34 = i26;
                            objQ3 = new rg2.e(i34, sb3);
                            o0Var2.K(objQ3);
                        } else {
                            i34 = i26;
                        }
                        ea(i19, v.b(aVar8, (e23.l) objQ3), strC, o0Var2, z15);
                        o0Var2.g0(false);
                    }
                    i27 = i30;
                    i28 = i29;
                    i26 = i34;
                }
                bVar2 = bVar;
                boolean z16 = i26;
                o0Var2.g0(false);
                o0Var2.g0(z16);
                o0Var2.g0(z16);
                o0Var2.g0(z16);
                if (this.f29953a) {
                    o0Var2.C(665329988);
                    zR = o0Var2.r(this);
                    objQ2 = o0Var2.q();
                    if (zR || objQ2 == m.a.f135155b) {
                        objQ2 = new xn.r(this, 24);
                        o0Var2.K(objQ2);
                    }
                    cr.s.a((e23.a) objQ2, o0Var2, 0);
                    o0Var2.g0(false);
                } else {
                    o0Var2.C(665549096);
                    o0Var2.g0(false);
                }
                x1 x1Var3 = n.f135158a;
                o0Var = o0Var2;
            }
            h.A(iHashCode5, o0VarE, iHashCode5, bVar5);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC5, o0VarE);
            c2.b0 b0Var3 = c2.b0.f22601a;
            r rVarE3 = u1.n.e(x2.f(aVar3, 1.0f), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            zVarA = c2.y.a(kVar, aVar4, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(rVarE3, o0VarE);
            if (cVar3 != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g2, i2VarA0, o0VarE);
            if (o0VarE.T) {
                h.A(iHashCode, o0VarE, iHashCode, bVar5);
            } else {
                h.A(iHashCode, o0VarE, iHashCode, bVar5);
            }
            b4.c(fVar, rVarC, o0VarE);
            objQ = o0VarE.q();
            if (objQ == obj) {
                objQ = new a3(n1Var, 20);
                o0VarE.K(objQ);
            }
            r rVarG2 = f5.g0.g(aVar3, (e23.l) objQ);
            s2VarA = q2.a(j.f22692b, d.a.f81533k, o0VarE, 0);
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = k.c(rVarG2, o0VarE);
            if (cVar3 != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA, o0VarE);
            b4.c(c1623g2, i2VarA1, o0VarE);
            if (o0VarE.T) {
                h.A(iHashCode2, o0VarE, iHashCode2, bVar5);
            } else {
                h.A(iHashCode2, o0VarE, iHashCode2, bVar5);
            }
            b4.c(fVar, rVarC2, o0VarE);
            u2Var = u2.f22900a;
            d2 d2Var4 = d2.f16532a;
            String strQ3 = y.Q(o0VarE, R.string.pacepro_lbl_plan_splits_type);
            d2Var4.getClass();
            i16 = i15;
            cVar = cVar4;
            i17 = 1;
            d2Var4.c(u2Var, strQ3, null, x2.u(d2.h(), ia(o0VarE)), aVar4, 0, 0, o0VarE, 24582, 50);
            o0VarE.C(-1830248679);
            i18 = 0;
            while (i18 < i16) {
                d2 d2Var5 = d2.f16532a;
                int i310 = i18 + 1;
                String strP2 = y.P(R.string.lbl_enduro_split_index, new Object[]{String.valueOf(i310)}, o0VarE);
                d.f81522a.getClass();
                g.a aVar9 = d.a.f81538p;
                d2Var5.getClass();
                d2Var5.c(u2Var, strP2, null, x2.u(d2.h(), ha(o0VarE)), aVar9, 0, 0, o0VarE, 24582, 50);
                i18 = i310;
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            c14 = 3;
            i19 = (i36 >> 3) & 7168;
            da(fIa, f14, i37, o0VarE, i19);
            o0VarE.g0(true);
            o0VarE.C(167472306);
            i24 = 0;
            while (r21.hasNext()) {
                i35 = i24 + 1;
                if (i24 >= 0) {
                    x.q();
                    throw null;
                }
                int i311 = i24;
                yq.c cVar7 = cVar;
                d2.f16532a.g(i311, 384, 2, null, o0VarE, z3.f.c(489817882, new ep.i(i311, this, (zq.a) obj2, cVar7, z14, 1), o0VarE));
                c14 = c14;
                cVar = cVar7;
                i24 = i35;
                i17 = i17;
            }
            i25 = i17;
            o0Var2 = o0VarE;
            cVar2 = cVar;
            o0Var2.g0(false);
            aVar = r.S;
            r rVarE4 = u1.n.e(x2.f(aVar, 1.0f), am.j.c(d92.b.f58623a, o0Var2), m1.f128891a);
            j.f22691a.getClass();
            j.k kVar3 = j.f22694d;
            d.f81522a.getClass();
            bVar3 = d.a.f81536n;
            zVarA2 = c2.y.a(kVar3, bVar3, o0Var2, 0);
            x1 x1Var4 = n.f135158a;
            iHashCode3 = Long.hashCode(o0Var2.U);
            i2VarA2 = o0Var2.a0();
            rVarC3 = k.c(rVarE4, o0Var2);
            h5.g.V.getClass();
            aVar2 = h5.g.a.f81805b;
            if (cVar3 != null) {
                p0.l();
                throw null;
            }
            o0Var2.z();
            if (o0Var2.T) {
                o0Var2.M(aVar2);
            } else {
                o0Var2.c();
            }
            eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA2, o0Var2);
            c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA2, o0Var2);
            bVar4 = h5.g.a.f81813j;
            if (o0Var2.T) {
                h.A(iHashCode3, o0Var2, iHashCode3, bVar4);
            } else {
                h.A(iHashCode3, o0Var2, iHashCode3, bVar4);
            }
            fVar2 = h5.g.a.f81807d;
            b4.c(fVar2, rVarC3, o0Var2);
            c2.b0 b0Var4 = c2.b0.f22601a;
            i26 = i25;
            da(fIa, f14, i37, o0Var2, i19);
            s2VarA2 = q2.a(j.f22692b, d.a.f81533k, o0Var2, 0);
            iHashCode4 = Long.hashCode(o0Var2.U);
            i2VarA3 = o0Var2.a0();
            rVarC4 = k.c(aVar, o0Var2);
            if (cVar3 != null) {
                p0.l();
                throw null;
            }
            o0Var2.z();
            if (o0Var2.T) {
                o0Var2.M(aVar2);
            } else {
                o0Var2.c();
            }
            b4.c(eVar, s2VarA2, o0Var2);
            b4.c(c1623g, i2VarA3, o0Var2);
            if (o0Var2.T) {
                h.A(iHashCode4, o0Var2, iHashCode4, bVar4);
            } else {
                h.A(iHashCode4, o0Var2, iHashCode4, bVar4);
            }
            b4.c(fVar2, rVarC4, o0Var2);
            t2 t2Var2 = u2.f22900a;
            d2 d2Var6 = d2.f16532a;
            i27 = R.string.lbl_total;
            String strQ4 = y.Q(o0Var2, R.string.lbl_total);
            r rVarU2 = x2.u(aVar, ia(o0Var2));
            i28 = R.string.lbl_enduro_split_index;
            d2Var6.a(t2Var2, strQ4, rVarU2, bVar3, 0, 0, o0Var2, 3078, 24);
            o0Var2.C(1747958758);
            while (r8.hasNext()) {
                if (((zq.b) entry.getValue()).f206628b) {
                    o0Var2.C(72779920);
                    sb4 = new StringBuilder();
                    sb4.append(y.Q(o0Var2, i27));
                    sb4.append(",");
                    sb4.append(y.P(i28, new Object[]{String.valueOf(((Number) entry.getKey()).intValue() + 1)}, o0Var2));
                    sb4.append(",");
                    sb4.append(cVar2.f());
                    String strG2 = cVar2.g();
                    r.a aVar10 = r.S;
                    zR3 = o0Var2.r(sb4);
                    objQ4 = o0Var2.q();
                    if (zR3) {
                        objQ4 = new rg2.e(3, sb4);
                        o0Var2.K(objQ4);
                    } else {
                        objQ4 = new rg2.e(3, sb4);
                        o0Var2.K(objQ4);
                    }
                    r rVarB2 = v.b(aVar10, (e23.l) objQ4);
                    i30 = i27;
                    i29 = i28;
                    ea(i19 | 48, rVarB2, strG2, o0Var2, false);
                    o0Var2.g0(false);
                    i34 = i26;
                } else {
                    i29 = i28;
                    i30 = i27;
                    o0Var2.C(73706293);
                    sb3 = new StringBuilder();
                    sb3.append(y.Q(o0Var2, i30));
                    sb3.append(",");
                    sb3.append(y.P(i29, new Object[]{String.valueOf(((Number) entry.getKey()).intValue() + 1)}, o0Var2));
                    sb3.append(",");
                    sb3.append(cVar2.d(Double.valueOf(((zq.b) entry.getValue()).f206627a)));
                    sb3.append(",");
                    if (s.g(bVar, entry.getValue())) {
                        z15 = 0;
                    } else {
                        z15 = 0;
                    }
                    if (z15 != 0) {
                        o0Var2.C(74262402);
                        sb3.append(y.Q(o0Var2, R.string.lbl_fastest));
                        o0Var2.g0(false);
                    } else {
                        o0Var2.C(74389254);
                        o0Var2.g0(false);
                    }
                    String strC2 = cVar2.c(Double.valueOf(((zq.b) entry.getValue()).f206627a));
                    r.a aVar11 = r.S;
                    zR2 = o0Var2.r(sb3);
                    objQ3 = o0Var2.q();
                    if (zR2) {
                        i34 = i26;
                        objQ3 = new rg2.e(i34, sb3);
                        o0Var2.K(objQ3);
                    } else {
                        i34 = i26;
                        objQ3 = new rg2.e(i34, sb3);
                        o0Var2.K(objQ3);
                    }
                    ea(i19, v.b(aVar11, (e23.l) objQ3), strC2, o0Var2, z15);
                    o0Var2.g0(false);
                }
                i27 = i30;
                i28 = i29;
                i26 = i34;
            }
            bVar2 = bVar;
            boolean z17 = i26;
            o0Var2.g0(false);
            o0Var2.g0(z17);
            o0Var2.g0(z17);
            o0Var2.g0(z17);
            if (this.f29953a) {
                o0Var2.C(665329988);
                zR = o0Var2.r(this);
                objQ2 = o0Var2.q();
                if (zR) {
                    objQ2 = new xn.r(this, 24);
                    o0Var2.K(objQ2);
                } else {
                    objQ2 = new xn.r(this, 24);
                    o0Var2.K(objQ2);
                }
                cr.s.a((e23.a) objQ2, o0Var2, 0);
                o0Var2.g0(false);
            } else {
                o0Var2.C(665549096);
                o0Var2.g0(false);
            }
            x1 x1Var5 = n.f135158a;
            o0Var = o0Var2;
        } else {
            bVar2 = bVar;
            o0VarE.e();
            o0Var = o0VarE;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ug2.p(this, arrayList, z14, map, bVar2, i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        ps.p pVar;
        Object next;
        Double elapsedDuration;
        Double elapsedDuration2;
        Double elapsedDuration3;
        List<ps.x1> listI;
        Object next2;
        Parcelable parcelable;
        TimingGatesActivity timingGatesActivity = this;
        super.onCreate(bundle);
        timingGatesActivity.setContentView(R.layout.activity_composable_container);
        boolean z14 = true;
        timingGatesActivity.initActionBar(true, R.string.lbl_timing_gates_title);
        l2.a aVar = l2.f37135b;
        Intent intent = timingGatesActivity.getIntent();
        aVar.getClass();
        Bundle bundleA = l2.a.a(intent);
        if (bundleA != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) bundleA.getParcelable("ACTIVITY_SPLITS_INTENT_KEY", ps.p.class);
            } else {
                Parcelable parcelable2 = bundleA.getParcelable("ACTIVITY_SPLITS_INTENT_KEY");
                if (!(parcelable2 instanceof ps.p)) {
                    parcelable2 = null;
                }
                parcelable = (ps.p) parcelable2;
            }
            pVar = (ps.p) parcelable;
        } else {
            pVar = null;
        }
        timingGatesActivity.f29953a = bundleA != null && bundleA.getBoolean("FIVE_HZ_DATA_INTENT_KEY", false);
        timingGatesActivity.f29954b = bundleA != null ? bundleA.getString("DEVICE_NAME_INTENT_KEY") : null;
        ArrayList arrayList = new ArrayList();
        ArrayList<ArrayList> arrayList2 = new ArrayList();
        m0 m0Var = new m0();
        ps.p pVar2 = pVar;
        m0 m0Var2 = new m0();
        n0 n0Var = new n0();
        HashMap map = new HashMap();
        if (pVar2 != null && (listI = pVar2.i()) != null) {
            double dMin = Double.MAX_VALUE;
            for (ps.x1 x1Var : b0.k(listI)) {
                List<ps.x1> listI2 = pVar2.i();
                ArrayList arrayListJ = listI2 != null ? b0.j(listI2, x1Var) : null;
                if (arrayListJ != null) {
                    arrayList2.add(new ArrayList(arrayListJ));
                    Iterator it = arrayListJ.iterator();
                    double dDoubleValue = 0.0d;
                    while (it.hasNext()) {
                        Double elapsedDuration4 = ((ps.x1) it.next()).getElapsedDuration();
                        dDoubleValue += elapsedDuration4 != null ? elapsedDuration4.doubleValue() : 0.0d;
                    }
                    dMin = Math.min(dMin, dDoubleValue);
                    if (!m0Var.f105804a) {
                        Iterator it3 = arrayListJ.iterator();
                        do {
                            if (!it3.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it3.next();
                        } while (((ps.x1) next2).getElapsedDuration() != null);
                        m0Var.f105804a = next2 != null;
                    }
                }
                if ((arrayListJ != null ? arrayListJ.size() : 0) > 1) {
                    m0Var2.f105804a = true;
                }
            }
        }
        Throwable th3 = null;
        Iterator it4 = arrayList2.iterator();
        int i14 = 0;
        while (it4.hasNext()) {
            Object next3 = it4.next();
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            boolean z15 = false;
            double dDoubleValue2 = 0.0d;
            for (ps.x1 x1Var2 : (ArrayList) next3) {
                if (x1Var2.getElapsedDuration() != null) {
                    Double elapsedDuration5 = x1Var2.getElapsedDuration();
                    elapsedDuration5.getClass();
                    dDoubleValue2 = elapsedDuration5.doubleValue() + dDoubleValue2;
                } else {
                    z15 = z14;
                }
            }
            if (map.get(Integer.valueOf(i14)) == null) {
                map.put(Integer.valueOf(i14), new zq.b(0.0d, false));
            }
            if (z15) {
                Object obj = map.get(Integer.valueOf(i14));
                obj.getClass();
                ((zq.b) obj).f206628b = true;
            }
            Object obj2 = map.get(Integer.valueOf(i14));
            obj2.getClass();
            if (!((zq.b) obj2).f206628b) {
                Object obj3 = map.get(Integer.valueOf(i14));
                obj3.getClass();
                ((zq.b) obj3).f206627a = dDoubleValue2;
            }
            i14 = i15;
            m0Var2 = m0Var2;
            it4 = it4;
            z14 = true;
        }
        m0 m0Var3 = m0Var2;
        if (!arrayList2.isEmpty()) {
            Object obj4 = arrayList2.get(0);
            obj4.getClass();
            int i16 = 0;
            for (Object obj5 : (Iterable) obj4) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    x.q();
                    throw null;
                }
                ps.x1 x1Var3 = (ps.x1) obj5;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList(p13.y.r(arrayList2, 10));
                for (ArrayList arrayList5 : arrayList2) {
                    arrayList4.add(i16 < arrayList5.size() ? (ps.x1) arrayList5.get(i16) : th3);
                }
                Iterator it5 = arrayList4.iterator();
                if (!it5.hasNext()) {
                    t.g();
                    return;
                }
                Object next4 = it5.next();
                if (it5.hasNext()) {
                    ps.x1 x1Var4 = (ps.x1) next4;
                    double dDoubleValue3 = (x1Var4 == null || (elapsedDuration2 = x1Var4.getElapsedDuration()) == null) ? Double.MAX_VALUE : elapsedDuration2.doubleValue();
                    while (true) {
                        Object next5 = it5.next();
                        ps.x1 x1Var5 = (ps.x1) next5;
                        double dDoubleValue4 = (x1Var5 == null || (elapsedDuration = x1Var5.getElapsedDuration()) == null) ? Double.MAX_VALUE : elapsedDuration.doubleValue();
                        if (Double.compare(dDoubleValue3, dDoubleValue4) > 0) {
                            dDoubleValue3 = dDoubleValue4;
                            next4 = next5;
                        }
                        if (!it5.hasNext()) {
                            break;
                        }
                        i16 = i16;
                        th3 = null;
                    }
                } else {
                    i16 = i16;
                }
                ps.x1 x1Var6 = (ps.x1) next4;
                int i18 = 0;
                for (Object obj6 : arrayList2) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        x.q();
                        throw th3;
                    }
                    int i24 = i16;
                    if (i24 < ((ArrayList) arrayList2.get(i18)).size()) {
                        arrayList3.add(((ArrayList) arrayList2.get(i18)).get(i24));
                    } else {
                        arrayList3.add(th3);
                        Object obj7 = map.get(Integer.valueOf(i18));
                        obj7.getClass();
                        ((zq.b) obj7).f206628b = true;
                        m0Var.f105804a = true;
                    }
                    i18 = i19;
                    i16 = i24;
                }
                n0Var.f105805a += (x1Var6 == null || (elapsedDuration3 = x1Var6.getElapsedDuration()) == null) ? 0.0d : elapsedDuration3.doubleValue();
                arrayList.add(new zq.a(x1Var6, x1Var3, arrayList3));
                i16 = i17;
                th3 = null;
            }
        }
        Throwable th4 = th3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!((zq.b) entry.getValue()).f206628b) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it6 = linkedHashMap.entrySet().iterator();
        if (it6.hasNext()) {
            next = it6.next();
            if (it6.hasNext()) {
                double d14 = ((zq.b) ((Map.Entry) next).getValue()).f206627a;
                while (true) {
                    Object next6 = it6.next();
                    double d15 = ((zq.b) ((Map.Entry) next6).getValue()).f206627a;
                    if (Double.compare(d14, d15) > 0) {
                        next = next6;
                        d14 = d15;
                    }
                    if (!it6.hasNext()) {
                        break;
                    }
                    n0Var = n0Var;
                    map = map;
                    timingGatesActivity = this;
                }
            }
        } else {
            next = th4;
        }
        Map.Entry entry2 = (Map.Entry) next;
        ((ComposeView) timingGatesActivity.findViewById(R.id.composable_container)).setContent(new e(-1715556015, true, new yq.a(arrayList, m0Var3, timingGatesActivity, n0Var, entry2 != null ? (zq.b) entry2.getValue() : th4, m0Var, map, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/timinggates/TimingGatesActivity$a;", "", "<init>", "()V", "", "ACTIVITY_SPLITS_INTENT_KEY", "Ljava/lang/String;", "FIVE_HZ_DATA_INTENT_KEY", "DEVICE_NAME_INTENT_KEY", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
