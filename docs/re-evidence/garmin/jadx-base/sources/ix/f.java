package ix;

import am.z0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q2;
import c2.s2;
import c2.u2;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.google.accompanist.drawablepainter.DrawablePainter2Kt;
import gs1.t;
import gs1.z;
import h5.e0;
import h82.p;
import h82.r;
import i3.i7;
import i3.mh;
import java.util.List;
import o4.d0;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.x;
import p3.b4;
import p3.i2;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lix/f;", "Lh82/c;", "<init>", "()V", "a", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends h82.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f95592j = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public t f95594g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f95596i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f95593f = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f95595h = 1.0d;

    static {
        new a(null);
    }

    @Override // h82.c
    public final void a(Bundle bundle, p3.m mVar, int i14) {
        int i15;
        Parcelable parcelable;
        o0 o0VarE = mVar.E(1183964177);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(bundle) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(this) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            super.a(bundle, o0VarE, i15 & 126);
            this.f95593f = bundle.getBoolean("EXTRA_IS_FROM_SUMMARY");
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) bundle.getParcelable("EXTRA_TIMELINE_DTO", t.class);
            } else {
                Parcelable parcelable2 = bundle.getParcelable("EXTRA_TIMELINE_DTO");
                if (!(parcelable2 instanceof t)) {
                    parcelable2 = null;
                }
                parcelable = (t) parcelable2;
            }
            this.f95594g = (t) parcelable;
            this.f95595h = bundle.getDouble("EXTRA_BODY_BATTERY_VERSION");
            this.f95596i = bundle.getBoolean("EXTRA_SHOW_BODY_BATTERY_TRUE_UP");
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ik1.a(this, bundle, i14, 7);
        }
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        return x.k(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(1289628157, true, new b(this, 3)), 4, null), new h82.c.b("WHAT_IS_BODY_BATTERY_ACTION", context.getString(R.string.gcm_help_body_battery_section1), null, new z3.e(-861854978, true, new b(this, 4)), 4, null), new h82.c.b("HOW_WE_CALCULATE_IT_ACTION", context.getString(R.string.gcm_help_body_battery_section2), null, new z3.e(1281629183, true, new b(this, 5)), 4, null), new h82.c.b("READINGS_ACTION", context.getString(R.string.lbl_how_to_use_reading), null, new z3.e(-869853952, true, new b(this, 6)), 4, null), new h82.c.b("ESTIMATED_BODY_BATTERY_ACTION", context.getString(R.string.gcm_body_battery_lbl_estimated_body_battery), null, new z3.e(1273630209, true, new b(this, 7)), 4, null), new h82.c.b("MERGED_BODY_BATTERY_DATA", context.getString(R.string.lbl_merged_body_battery_data), null, new z3.e(-877852926, true, new b(this, 8)), 4, null));
    }

    public final void g(r rVar, p3.m mVar, int i14) {
        r rVar2;
        rVar.getClass();
        o0 o0VarE = mVar.E(2014318772);
        int i15 = 2;
        int i16 = (i14 & 6) == 0 ? (o0VarE.B(rVar) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(this) ? 32 : 16;
        }
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            t tVar = this.f95594g;
            Unit unit = null;
            if (tVar == null) {
                o0VarE.C(-712438243);
                o0VarE.g0(false);
                rVar2 = rVar;
            } else {
                o0VarE.C(-712438242);
                if (tVar.t()) {
                    o0VarE.C(847210135);
                    gs1.a activitiesForDayDTO = tVar.getActivitiesForDayDTO();
                    List<gs1.b> listB = activitiesForDayDTO != null ? activitiesForDayDTO.b() : null;
                    if (listB == null) {
                        o0VarE.C(847210134);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(847210135);
                        for (gs1.b bVar : listB) {
                            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                            gs1.c activityType = bVar.getActivityType();
                            LayerDrawable layerDrawableA = zx0.g.a(0, z0.m(activityType != null ? activityType.getTypeKey() : null), context);
                            String activityName = bVar.getActivityName();
                            if (activityName == null) {
                                activityName = "";
                            }
                            j(layerDrawableA, activityName, o0VarE, (i16 << 3) & 896);
                        }
                        o0VarE.g0(false);
                        unit = Unit.INSTANCE;
                    }
                    o0VarE.g0(false);
                    rVar2 = rVar;
                } else {
                    o0VarE.C(847669648);
                    rVar2 = rVar;
                    rVar2.o(R.string.lbl_no_activities_recorded, (i16 << 6) & 896, 2, null, o0VarE);
                    o0VarE.g0(false);
                    unit = Unit.INSTANCE;
                }
                o0VarE.g0(false);
            }
            if (unit == null) {
                o0VarE.C(-711801502);
                rVar2.o(R.string.msg_common_no_data_available, 0, 2, null, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1269908191);
                o0VarE.g0(false);
            }
            x1 x1Var2 = n.f135158a;
        } else {
            rVar2 = rVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(this, rVar2, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x0090  */
    /* JADX WARN: Code duplicated, block: B:45:0x0095  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a0  */
    public final void h(r rVar, p3.m mVar, int i14) {
        int i15;
        r rVar2;
        int iIntValue;
        gs1.i.b payload;
        Integer sleepTimeSeconds;
        rVar.getClass();
        o0 o0VarE = mVar.E(-1232788574);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(this) ? 32 : 16;
        }
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            t tVar = this.f95594g;
            if (tVar == null) {
                o0VarE.C(261028103);
                o0VarE.g0(false);
                tVar = null;
                rVar2 = rVar;
            } else {
                o0VarE.C(261028104);
                gs1.i currentDayDailySleepDTO = tVar.getCurrentDayDailySleepDTO();
                if (currentDayDailySleepDTO == null || (payload = currentDayDailySleepDTO.getPayload()) == null) {
                    iIntValue = 0;
                } else {
                    Long autoSleepStartTimestampGMT = payload.getAutoSleepStartTimestampGMT();
                    if ((autoSleepStartTimestampGMT != null ? autoSleepStartTimestampGMT.longValue() : 0L) > 0) {
                        Long autoSleepEndTimestampGMT = payload.getAutoSleepEndTimestampGMT();
                        if ((autoSleepEndTimestampGMT != null ? autoSleepEndTimestampGMT.longValue() : 0L) > 0) {
                            sleepTimeSeconds = payload.getSleepTimeSeconds();
                        } else if (s.g(payload.getSleepWindowConfirmed(), Boolean.TRUE)) {
                            sleepTimeSeconds = payload.getSleepTimeSeconds();
                        } else {
                            sleepTimeSeconds = 0;
                        }
                    } else if (s.g(payload.getSleepWindowConfirmed(), Boolean.TRUE)) {
                        sleepTimeSeconds = payload.getSleepTimeSeconds();
                    } else {
                        sleepTimeSeconds = 0;
                    }
                    if (sleepTimeSeconds != null) {
                        iIntValue = sleepTimeSeconds.intValue();
                    } else {
                        iIntValue = 0;
                    }
                }
                if (iIntValue > 0) {
                    o0VarE.C(68357211);
                    Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                    long j8 = iIntValue;
                    l3.f23124b.getClass();
                    context.getClass();
                    String strF = "";
                    if (j8 > 0) {
                        int i17 = ((int) j8) / DateTimeConstants.SECONDS_PER_HOUR;
                        int iL1 = l3.a.L1(j8);
                        if (i17 > 0 && iL1 > 0) {
                            strF = context.getString(R.string.string_space_string_pattern, context.getString(R.string.common_hour_small_abbreviation, Integer.valueOf(i17)), androidx.core.view.j.f(iL1, context.getString(R.string.common_min_abbreviated_without_period)));
                            strF.getClass();
                        } else if (i17 > 0) {
                            strF = context.getString(R.string.common_hour_small_abbreviation, Integer.valueOf(i17));
                            strF.getClass();
                        } else if (iL1 > 0) {
                            strF = androidx.core.view.j.f(iL1, context.getString(R.string.common_min_abbreviated_without_period));
                        }
                    }
                    j(ql1.d.a(R.drawable.sleep, context), strF, o0VarE, (i15 << 3) & 896);
                    o0VarE.g0(false);
                    rVar2 = rVar;
                } else {
                    o0VarE.C(68681719);
                    rVar2 = rVar;
                    rVar2.o(R.string.lbl_no_sleep_data, (i15 << 6) & 896, 2, null, o0VarE);
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            }
            if (tVar == null) {
                o0VarE.C(261918796);
                rVar2.o(R.string.msg_common_no_data_available, 0, 2, null, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(701156607);
                o0VarE.g0(false);
            }
        } else {
            rVar2 = rVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(this, rVar2, i14, i16);
        }
    }

    public final void i(r rVar, p3.m mVar, int i14) {
        int i15;
        r rVar2;
        Unit unit;
        String string;
        gs1.l payload;
        Integer averageStressLevel;
        rVar.getClass();
        o0 o0VarE = mVar.E(1229345997);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(this) ? 32 : 16;
        }
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            t tVar = this.f95594g;
            if (tVar == null) {
                o0VarE.C(260541074);
                o0VarE.g0(false);
                unit = null;
                rVar2 = rVar;
            } else {
                o0VarE.C(260541075);
                Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                z userDailySummary = tVar.getUserDailySummary();
                int iIntValue = (userDailySummary == null || (payload = userDailySummary.getPayload()) == null || (averageStressLevel = payload.getAverageStressLevel()) == null) ? 0 : averageStressLevel.intValue();
                if (iIntValue > 0) {
                    o0VarE.C(2009170436);
                    context.getClass();
                    if (iIntValue < 0) {
                        string = "";
                    } else {
                        String string2 = context.getString(jg.b.C(Integer.valueOf(iIntValue)));
                        string2.getClass();
                        string = context.getString(R.string.overall_stress_level_format, Integer.valueOf(iIntValue), context.getString(R.string.alldaystress_avg_level), string2);
                        string.getClass();
                    }
                    j(a7.b.getDrawable(context, 2131232760), string, o0VarE, (i15 << 3) & 896);
                    o0VarE.g0(false);
                    rVar2 = rVar;
                } else {
                    o0VarE.C(2009456287);
                    rVar2 = rVar;
                    rVar2.o(R.string.lbl_no_stress_data, (i15 << 6) & 896, 2, null, o0VarE);
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                o0VarE.C(261072105);
                rVar2.o(R.string.msg_common_no_data_available, 0, 2, null, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(285498892);
                o0VarE.g0(false);
            }
        } else {
            rVar2 = rVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(this, rVar2, i14, i16);
        }
    }

    public final void j(Drawable drawable, String str, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(505523680);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.r(drawable) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            h4.r.a aVar = h4.r.S;
            float f14 = 16;
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarC = c2.l.C(aVar, f14, f14, f14, 0.0f, 8);
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
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
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            if (drawable != null) {
                o0VarE.C(-79519411);
                t4.d dVarRememberDrawablePainter = DrawablePainter2Kt.rememberDrawablePainter(drawable, o0VarE, i15 & 14);
                d0.f128823b.getClass();
                i7.a(dVarRememberDrawablePainter, null, null, d0.f128832k, o0VarE, 3120, 4);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-79380066);
                o0VarE.g0(false);
            }
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            mh.c(str, c2.l.A(aVar, f14, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, ((i15 >> 3) & 14) | 48, 0, 131068);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(this, drawable, str, i14);
        }
    }

    public final void k(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(817384259);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            m.f95670a.getClass();
            h82.e.a(m.f95671b, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ix.a(this, i14, 3);
        }
    }

    public final void l(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1255394465);
        int i15 = 2;
        int i16 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.a(z3.f.c(234970796, new b(this, i15), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ix.a(this, i14, 5);
        }
    }

    public final void m(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1377353465);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 0;
        int i17 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.b(z3.f.c(-537371251, new b(this, i16), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ix.a(this, i14, i17);
        }
    }

    public final void n(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1297393689);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.a(z3.f.c(2059285690, new b(this, 9), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ix.a(this, i14, i16);
        }
    }

    public final void o(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1623909515);
        int i15 = 2;
        int i16 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.a(z3.f.c(559066328, new hv0.d(7, this, (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b)), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ix.a(this, i14, i15);
        }
    }

    public final void p(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1516047187);
        int i15 = 4;
        int i16 = (o0VarE.r(this) ? 4 : 2) | i14;
        int i17 = 1;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.a(z3.f.c(472730022, new b(this, i17), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ix.a(this, i14, i15);
        }
    }

    public final boolean q() {
        return this.f95595h == 3.0d;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006¨\u0006\u0014"}, d2 = {"Lix/f$a;", "", "<init>", "()V", "", "GARMIN_SUPPORT_PAGE_WITH_COMPATIBLE_DEVICES", "Ljava/lang/String;", "", "DEFAULT_BODY_BATTERY_VERSION", "D", "BODY_BATTERY_VERSION_3_0", "WHAT_IS_BODY_BATTERY_ACTION", "HOW_WE_CALCULATE_IT_ACTION", "READINGS_ACTION", "ESTIMATED_BODY_BATTERY_ACTION", "MERGED_BODY_BATTERY_DATA", "EXTRA_IS_FROM_SUMMARY", "EXTRA_TIMELINE_DTO", "EXTRA_BODY_BATTERY_VERSION", "EXTRA_SHOW_BODY_BATTERY_TRUE_UP", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
