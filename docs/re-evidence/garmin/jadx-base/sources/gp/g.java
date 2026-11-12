package gp;

import am.x0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b21.v4;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.history.presentation.ActivitiesListActivity;
import com.garmin.android.apps.connectmobile.activities.reports.ActivityReportsActivity;
import com.garmin.android.apps.connectmobile.k1;
import f21.a0;
import g2.m1;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.t1;
import lc.u0;
import o4.d0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p13.h0;
import p13.x;
import p13.y;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, d2 = {"Lgp/g;", "Lr70/r;", "Lhp/b;", "stateHolder", "<init>", "(Lhp/b;)V", "", "quickActionsExpanded", "showDeviceDisconnectedDialog", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements r70.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hp.b f78356a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78357a;

        static {
            int[] iArr = new int[o70.n.values().length];
            try {
                iArr[o70.n.EMPTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o70.n.GENESIS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o70.n.PROMPT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o70.n.VALID_DATA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f78357a = iArr;
        }
    }

    public g(hp.b bVar) {
        bVar.getClass();
        this.f78356a = bVar;
    }

    public static void b(Context context, in.c cVar, int i14) {
        if (cVar != null) {
            o70.c cVar2 = cVar.f94394b;
            if (cVar2 == o70.c.ALL_ACTIVITIES) {
                ActivitiesListActivity.a.b(ActivitiesListActivity.f29099d, context, am.g.f3942f, null, 28);
            } else {
                ActivityReportsActivity.a.a(ActivityReportsActivity.f29758a, context, in.d.a(cVar2), null, null, Integer.valueOf(i14), 12);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:92:0x019c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(h4.r rVar, r70.q qVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        o70.n nVar;
        int i16;
        String string;
        int i17;
        String string2;
        u4.d dVarS;
        int i18;
        long jA;
        o13.p pVar;
        String strP;
        String str;
        String strK0;
        String str2;
        yz1.d dVar;
        i53.c cVarB;
        int i19;
        String str3;
        gp.a aVar;
        String str4;
        int i24;
        Object v4Var;
        int i25;
        in.c cVar;
        p1 p1Var;
        o70.n nVar2;
        e23.a aVar2;
        boolean z14;
        zd0.o.a aVar3;
        int i26;
        int i27;
        g gVar = this;
        o0 o0VarQ = u0.q(rVar, qVar, mVar, -295393304);
        if ((i14 & 384) == 0) {
            i15 = (o0VarQ.r(gVar) ? 256 : 128) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 129) != 128)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
            l22.a aVar4 = new l22.a(context);
            Object objQ = o0VarQ.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = (r53.i) gVar.f78356a.f84892a.invoke();
                o0VarQ.K(objQ);
            }
            in.c cVar2 = (in.c) s9.c.b((r53.i) objQ, null, o0VarQ, 48).getF182175a();
            Object objQ2 = o0VarQ.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(Boolean.FALSE);
                o0VarQ.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            Object objQ3 = o0VarQ.q();
            if (objQ3 == c2565a) {
                objQ3 = p0.n(Boolean.FALSE);
                o0VarQ.K(objQ3);
            }
            p1 p1Var3 = (p1) objQ3;
            boolean zR = o0VarQ.r(cVar2) | o0VarQ.r(context);
            Object objQ4 = o0VarQ.q();
            if (zR || objQ4 == c2565a) {
                objQ4 = new m1(9, cVar2, context);
                o0VarQ.K(objQ4);
            }
            e23.l lVar = (e23.l) objQ4;
            boolean z15 = cVar2 != null ? cVar2.f94401i : false;
            Integer num = cVar2 != null ? cVar2.f94398f : null;
            if (z15) {
                nVar = o70.n.PROMPT;
            } else if (num == null) {
                nVar = o70.n.GENESIS;
            } else if (num.intValue() <= 6) {
                nVar = o70.n.VALID_DATA;
            } else {
                nVar = num.intValue() <= 27 ? o70.n.EMPTY : o70.n.GENESIS;
            }
            int[] iArr = a.f78357a;
            int i28 = iArr[nVar.ordinal()];
            if (i28 != 1) {
                if (i28 != 2) {
                    if (i28 != 3) {
                        if (i28 != 4) {
                            u0.r();
                            return;
                        }
                    } else if (cVar2 != null) {
                        context.getClass();
                        string = context.getString(R.string.receive_trend_data, in.d.b(cVar2.f94394b, context));
                        string.getClass();
                    }
                    string = null;
                } else if (cVar2 != null) {
                    context.getClass();
                    switch (in.c.a.f94404a[cVar2.f94394b.ordinal()]) {
                        case 1:
                            i27 = R.string.no_activities_recorded;
                            break;
                        case 2:
                            i27 = R.string.no_runs_recorded;
                            break;
                        case 3:
                            i27 = R.string.no_rides_recorded;
                            break;
                        case 4:
                            i27 = R.string.no_swims_recorded;
                            break;
                        case 5:
                            i27 = R.string.no_walks_recorded;
                            break;
                        case 6:
                            i27 = R.string.no_multisport_recorded;
                            break;
                        case 7:
                            i27 = R.string.no_gym_and_fitness_recorded;
                            break;
                        case 8:
                            i27 = R.string.no_parasports_recorded;
                            break;
                        default:
                            u0.r();
                            return;
                    }
                    string = context.getString(i27);
                    string.getClass();
                } else {
                    string = null;
                }
            } else if (cVar2 != null) {
                context.getClass();
                switch (in.c.a.f94404a[cVar2.f94394b.ordinal()]) {
                    case 1:
                        i16 = R.string.no_activities_this_week;
                        break;
                    case 2:
                        i16 = R.string.no_runs_this_week;
                        break;
                    case 3:
                        i16 = R.string.no_rides_this_week;
                        break;
                    case 4:
                        i16 = R.string.no_swims_this_week;
                        break;
                    case 5:
                        i16 = R.string.no_walks_this_week;
                        break;
                    case 6:
                        i16 = R.string.no_multisport_this_week;
                        break;
                    case 7:
                        i16 = R.string.no_gym_and_fitness_this_week;
                        break;
                    case 8:
                        i16 = R.string.no_parasports_this_week;
                        break;
                    default:
                        u0.r();
                        return;
                }
                string = context.getString(i16);
                string.getClass();
            } else {
                string = null;
            }
            int i29 = iArr[nVar.ordinal()];
            if (i29 != 1) {
                if (i29 != 2) {
                    if (i29 != 3) {
                        if (i29 != 4) {
                            u0.r();
                            return;
                        }
                    } else if (cVar2 != null) {
                        context.getClass();
                        string2 = context.getString(R.string.want_view_weekly_trend, in.d.b(cVar2.f94394b, context));
                        string2.getClass();
                    }
                    string2 = null;
                } else if (cVar2 != null) {
                    context.getClass();
                    switch (in.c.a.f94404a[cVar2.f94394b.ordinal()]) {
                        case 1:
                            i26 = R.string.start_recording_activities_to_view_trend;
                            break;
                        case 2:
                            i26 = R.string.start_recording_runs_for_trends;
                            break;
                        case 3:
                            i26 = R.string.start_recording_rides_for_trends;
                            break;
                        case 4:
                            i26 = R.string.start_recording_swims_for_trends;
                            break;
                        case 5:
                            i26 = R.string.start_recording_walks_for_trends;
                            break;
                        case 6:
                            i26 = R.string.start_recording_multisport_for_trends;
                            break;
                        case 7:
                            i26 = R.string.start_recording_gym_and_fitness_for_trends;
                            break;
                        case 8:
                            i26 = R.string.start_recording_parasports_for_trends;
                            break;
                        default:
                            u0.r();
                            return;
                    }
                    string2 = context.getString(i26);
                    string2.getClass();
                } else {
                    string2 = null;
                }
            } else if (cVar2 != null) {
                context.getClass();
                switch (in.c.a.f94404a[cVar2.f94394b.ordinal()]) {
                    case 1:
                        i17 = R.string.record_your_activities_to_view_trend;
                        break;
                    case 2:
                        i17 = R.string.record_your_runs;
                        break;
                    case 3:
                        i17 = R.string.record_your_rides;
                        break;
                    case 4:
                        i17 = R.string.record_your_swims;
                        break;
                    case 5:
                        i17 = R.string.record_your_walks;
                        break;
                    case 6:
                        i17 = R.string.record_your_multisport;
                        break;
                    case 7:
                        i17 = R.string.record_your_gym_fitness;
                        break;
                    case 8:
                        i17 = R.string.record_your_parasports;
                        break;
                    default:
                        u0.r();
                        return;
                }
                string2 = context.getString(i17);
                string2.getClass();
            } else {
                string2 = null;
            }
            if (cVar2 != null) {
                bv.b.f21239a.getClass();
                bv.b.a();
                boolean zL0 = k1.f37122a.l0();
                o70.c cVar3 = cVar2.f94394b;
                dVarS = (in.c.a.f94404a[cVar3.ordinal()] == 1 ? x0.f4346x : in.d.a(cVar3)).s(zL0);
            } else {
                dVarS = null;
            }
            if (yz1.e.b(cVar2 != null ? cVar2.f94393a : null)) {
                o0VarQ.C(328135913);
                d92.b.f58623a.getClass();
                jA = d92.b.a(o0VarQ).f().d();
                o0VarQ.g0(false);
            } else {
                o0VarQ.C(328191806);
                if (cVar2 != null) {
                    o70.c cVar4 = cVar2.f94394b;
                    i18 = (in.c.a.f94404a[cVar4.ordinal()] == 1 ? x0.f4346x : in.d.a(cVar4)).f4366i;
                } else {
                    i18 = 0;
                }
                jA = n5.a.a(o0VarQ, i18);
                o0VarQ.g0(false);
            }
            boolean zR2 = o0VarQ.r(gVar) | o0VarQ.r(context) | o0VarQ.r(cVar2);
            Object objQ5 = o0VarQ.q();
            if (zR2 || objQ5 == c2565a) {
                objQ5 = new f(gVar, context, cVar2);
                o0VarQ.K(objQ5);
            }
            e23.a aVar5 = (e23.a) objQ5;
            if (cVar2 == null) {
                o0VarQ.C(328561108);
                o0VarQ.g0(false);
                jA = jA;
                pVar = null;
            } else {
                o0VarQ.C(-405043251);
                boolean z16 = (nVar == o70.n.GENESIS || nVar == o70.n.PROMPT) ? false : true;
                boolean z17 = ((g6.c) o0VarQ.A(t1.f91490h)).getF75992b() >= 1.5f;
                context.getClass();
                boolean z18 = z17;
                String string3 = context.getString(cVar2.f94394b.e());
                string3.getClass();
                if (z16) {
                    LocalDate localDateMinusDays = LocalDate.now().minusDays(6);
                    j23.l lVar2 = new j23.l(0, 6);
                    ArrayList arrayList = new ArrayList(y.r(lVar2, 10));
                    Iterator<Integer> it = lVar2.iterator();
                    while (((j23.k) it).f96801c) {
                        arrayList.add(localDateMinusDays.plusDays(((p13.p0) it).nextInt()));
                    }
                    String strM = new pi0.e(context).m((LocalDate) h0.b0(arrayList), (LocalDate) h0.m0(arrayList), pi0.f.SHORT_MONTH_NO_WEEKDAY);
                    String string4 = context.getString(R.string.value_dot_value, string3, z18 ? "\n".concat(strM) : strM);
                    string4.getClass();
                    String string5 = context.getString(R.string.report_email_subject_one_day, string3, strM);
                    string5.getClass();
                    pVar = new o13.p(string4, string5);
                } else {
                    pVar = new o13.p(string3, string3);
                }
                o0VarQ.g0(false);
            }
            String str5 = "";
            if (pVar == null) {
                pVar = new o13.p("", "");
            }
            String str6 = (String) pVar.f128594a;
            String str7 = (String) pVar.f128595b;
            if (cVar2 == null) {
                o0VarQ.C(328897365);
                o0VarQ.g0(false);
                strP = null;
            } else {
                o0VarQ.C(328897366);
                strP = gl1.y.P(R.string.msg_view_last_4_week_feature_trend, new Object[]{gl1.y.Q(o0VarQ, cVar2.f94394b.e())}, o0VarQ);
                o0VarQ.g0(false);
            }
            String str8 = strP == null ? "" : strP;
            String strC = cVar2 != null ? cVar2.c(context, true) : null;
            i53.c<o13.p<String, String>> cVarD = cVar2 != null ? cVar2.d(context, true) : null;
            if (strC == null) {
                strC = "";
            }
            if (cVarD != null) {
                ArrayList arrayList2 = new ArrayList(y.r(cVarD, 10));
                Iterator<o13.p<String, String>> it3 = cVarD.iterator();
                while (it3.hasNext()) {
                    o13.p<String, String> next = it3.next();
                    arrayList2.add(oi0.c.P(x.k(next.f128594a, next.f128595b)));
                    it3 = it3;
                    str5 = str5;
                }
                str = str5;
                strK0 = h0.k0(arrayList2, ". ", null, null, null, 62);
            } else {
                str = "";
                strK0 = str;
            }
            String strP2 = oi0.c.P(x.k(strC, strK0));
            if (cVar2 != null) {
                String str9 = string2;
                dVar = cVar2.f94393a;
                str2 = str9;
            } else {
                str2 = string2;
                dVar = null;
            }
            String strC2 = cVar2 != null ? cVar2.c(context, false) : str;
            i53.c<o13.p<String, String>> cVarD2 = cVar2 != null ? cVar2.d(context, false) : null;
            i53.c<Double> cVar5 = cVar2 != null ? cVar2.f94397e : null;
            String str10 = string == null ? str : string;
            String str11 = str2 == null ? str : str2;
            if (cVar2 == null || (cVarB = cVar2.f94399g) == null) {
                cVarB = j53.l.b();
            }
            i53.c cVar6 = cVarB;
            if (cVar2 == null) {
                o0VarQ.C(330269425);
                o0VarQ.g0(false);
                i19 = 2;
                str3 = null;
            } else {
                o0VarQ.C(-404988144);
                Context context2 = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
                context2.getClass();
                int i30 = cVar2.f94400h;
                i19 = 2;
                String string6 = i30 >= 2 ? context2.getString(R.string.variable_streak, context2.getString(R.string.mct_num_days_label, NumberFormat.getIntegerInstance().format(Integer.valueOf(i30)))) : null;
                o0VarQ.g0(false);
                str3 = string6;
            }
            o70.n nVar3 = o70.n.PROMPT;
            if (nVar == nVar3) {
                aVar = gp.a.Dismiss;
            } else {
                aVar = (cVar2 != null ? cVar2.f94394b : null) != o70.c.MULTI_SPORT ? gp.a.Add : gp.a.None;
            }
            gp.a aVar6 = aVar;
            if (nVar != nVar3 || cVar2 == null) {
                str4 = null;
            } else {
                context.getClass();
                String string7 = context.getString(R.string.add_activity_type_trends, context.getString(cVar2.f94394b.e()));
                string7.getClass();
                str4 = string7;
            }
            d0 d0VarA = d0.a(jA);
            boolean zK = o0VarQ.k(nVar.ordinal()) | o0VarQ.B(aVar5);
            Object objQ6 = o0VarQ.q();
            if (zK || objQ6 == p3.m.a.f135155b) {
                i24 = 1;
                objQ6 = new f(1, nVar, aVar5);
                o0VarQ.K(objQ6);
            } else {
                i24 = 1;
            }
            e23.a aVar7 = (e23.a) objQ6;
            boolean zK2 = o0VarQ.k(nVar.ordinal()) | o0VarQ.r(gVar) | o0VarQ.r(context) | o0VarQ.r(cVar2);
            Object objQ7 = o0VarQ.q();
            if (zK2 || objQ7 == p3.m.a.f135155b) {
                objQ7 = new fk0.a(nVar, gVar, context, cVar2);
                o0VarQ.K(objQ7);
            }
            e23.a aVar8 = (e23.a) objQ7;
            boolean zK3 = o0VarQ.k(nVar.ordinal()) | o0VarQ.r(cVar2) | o0VarQ.r(gVar) | o0VarQ.r(context);
            Object objQ8 = o0VarQ.q();
            if (zK3 || objQ8 == p3.m.a.f135155b) {
                o70.n nVar4 = nVar;
                i25 = i19;
                cVar = cVar2;
                p1Var = p1Var2;
                v4Var = new v4(nVar4, cVar, gVar, context, p1Var, 9);
                nVar2 = nVar4;
                gVar = gVar;
                aVar2 = aVar8;
                o0VarQ.K(v4Var);
            } else {
                nVar2 = nVar;
                aVar2 = aVar8;
                cVar = cVar2;
                v4Var = objQ8;
                i25 = i19;
                p1Var = p1Var2;
            }
            e23.a aVar9 = (e23.a) v4Var;
            boolean zR3 = o0VarQ.r(cVar) | o0VarQ.r(gVar);
            Object objQ9 = o0VarQ.q();
            if (zR3 || objQ9 == p3.m.a.f135155b) {
                z14 = false;
                objQ9 = new f(cVar, i25, gVar, false);
                o0VarQ.K(objQ9);
            } else {
                z14 = false;
            }
            int i34 = i24;
            in.c cVar7 = cVar;
            z3.e eVarC = z3.f.c(938524162, new et.p(p1Var, cVar7, aVar4, lVar, p1Var3, 10), o0VarQ);
            u4.d dVar2 = dVarS;
            l.a(null, dVar, nVar2, str6, str7, dVar2, d0VarA, strC2, cVarD2, cVar5, str10, str11, aVar6, cVar6, str3, str4, strP2, str8, aVar7, aVar2, aVar9, (e23.a) objQ9, eVarC, o0VarQ, 0);
            o0Var = o0VarQ;
            if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                o0Var.C(334659956);
                String str12 = (cVar7 == null || (aVar3 = cVar7.f94403k) == null) ? null : aVar3.f204092c;
                if (str12 == null) {
                    str12 = str;
                }
                Object objQ10 = o0Var.q();
                if (objQ10 == p3.m.a.f135155b) {
                    objQ10 = new e(p1Var3, i34);
                    o0Var.K(objQ10);
                }
                l.c(48, (e23.a) objQ10, str12, o0Var);
                o0Var.g0(z14);
            } else {
                o0Var.C(334880986);
                o0Var.g0(z14);
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarQ;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a0((r70.r) gVar, rVar, qVar, i14, 23);
        }
    }
}
