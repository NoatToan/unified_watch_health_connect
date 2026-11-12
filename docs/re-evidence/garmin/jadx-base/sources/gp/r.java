package gp;

import am.x0;
import am.z0;
import android.content.Context;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b63.u;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.pending.activities.presentation.PendingActivitiesActivity;
import f21.a0;
import gl1.y;
import java.util.List;
import lc.u0;
import o53.b0;
import o53.m0;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import r1.c0;
import r1.e0;
import r1.v1;
import v62.b3;
import v62.e1;
import w51.c1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, d2 = {"Lgp/r;", "Lr70/r;", "Lhp/e;", "stateHolder", "<init>", "(Lhp/e;)V", "", "visible", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r implements r70.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hp.e f78419a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.presentation.dashboard.component.PendingActivityCardComposable$DashboardItem$1$3$1$1", f = "PendingActivityCardComposable.kt", l = {133}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f78420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r70.q f78421b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r f78422c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r70.q qVar, r rVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f78421b = qVar;
            this.f78422c = rVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f78421b, this.f78422c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f78420a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f78420a = 1;
                if (m0.b(160L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            r rVar = this.f78422c;
            String strA = rVar.f78419a.f84924b.a();
            this.f78421b.c(rVar.f78419a.f84923a, strA);
            return Unit.INSTANCE;
        }
    }

    public r(hp.e eVar) {
        eVar.getClass();
        this.f78419a = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(final h4.r rVar, final r70.q qVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        String strT;
        String strP;
        double dB;
        DateTime dateTime;
        DateTime dateTime2;
        String str;
        hp.e eVar = this.f78419a;
        pb2.a.d dVar = eVar.f84923a;
        o0 o0VarQ = u0.q(rVar, qVar, mVar, -1150805229);
        int i16 = 2;
        if ((i14 & 6) == 0) {
            i15 = (o0VarQ.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarQ.r(qVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.r(this) ? 256 : 128;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            final Context context = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
            l22.a aVar = new l22.a(context);
            w00.b bVar = new w00.b(aVar);
            bv.b.f21239a.getClass();
            bv.b.a();
            final boolean zL0 = k1.f37122a.l0();
            ns.h hVar = new ns.h(aVar, null, i16, 0 == true ? 1 : 0);
            List<String> list = dVar.f136904l;
            x0 x0VarM = (list == null || (str = (String) h0.d0(list)) == null) ? null : z0.m(str);
            if (x0VarM == null) {
                o0VarQ.C(-1209014726);
                o0VarQ.g0(false);
                strT = null;
            } else {
                o0VarQ.C(-1209014725);
                strT = gl1.d.T(x0VarM.f4360c, o0VarQ, 0);
                o0VarQ.g0(false);
            }
            if (strT == null) {
                o0VarQ.C(-1208914813);
                o0VarQ.g0(false);
                strP = null;
            } else {
                o0VarQ.C(-1208914812);
                strP = y.P(R.string.lbl_maybe_with_category, new Object[]{strT}, o0VarQ);
                o0VarQ.g0(false);
            }
            if (strP == null) {
                strP = com.airbnb.lottie.animation.keyframe.a.j(o0VarQ, -2117204679, R.string.activity_type_timed_activity, o0VarQ, false);
            } else {
                o0VarQ.C(-2117207717);
                o0VarQ.g0(false);
            }
            Double d14 = dVar.f136902j;
            if (zf.b.D(d14)) {
                dB = d14 != null ? d14.doubleValue() : Double.NaN;
            } else {
                LocalDateTime localDateTime = dVar.f136897e;
                u uVarZ = (localDateTime == null || (dateTime2 = localDateTime.toDateTime()) == null) ? null : g22.k.z(dateTime2);
                LocalDateTime localDateTime2 = dVar.f136898f;
                dB = c1.b(d14, (localDateTime2 == null || (dateTime = localDateTime2.toDateTime()) == null) ? null : g22.k.z(dateTime), uVarZ);
            }
            final String strB = gm.b.b(context, dB);
            final String strB2 = ss.k.b(ls.e.TIME, aVar, Double.valueOf(dB), 32);
            final String strF = bVar.f(dVar.f136899g, true);
            Double d15 = dVar.f136899g;
            final String strC = bVar.c(Double.valueOf(d15 != null ? d15.doubleValue() : 0.0d));
            final String strC2 = u00.b.c(hVar, dVar.f136901i, 80, 4);
            String str2 = DateFormat.is24HourFormat(context) ? "HH:mm" : "h:mm a";
            LocalDateTime localDateTime3 = dVar.f136897e;
            String string = localDateTime3 != null ? g22.k.x(localDateTime3).toString(str2) : null;
            if (string == null) {
                string = "";
            }
            Object objQ = o0VarQ.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.TRUE);
                o0VarQ.K(objQ);
            }
            final p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarQ.q();
            if (objQ2 == c2565a) {
                objQ2 = l0.j(t13.h.f161748a, o0VarQ);
                o0VarQ.K(objQ2);
            }
            final b0 b0Var = (b0) objQ2;
            DateTime dateTime3 = eVar.f84925c;
            dateTime3.getClass();
            final boolean zIsToday = DateUtils.isToday(dateTime3.getMillis() + 86400000);
            boolean zBooleanValue = zIsToday ? true : ((Boolean) p1Var.getF182175a()).booleanValue();
            xz1.a.f192853a.getClass();
            v1 v1VarA = xz1.a.a(o0VarQ);
            r1.x1 x1VarB = xz1.a.b(o0VarQ);
            String strConcat = "PendingActivityCard:".concat(dVar.f136893a);
            final x0 x0Var = x0VarM;
            final String str3 = string;
            final String str4 = strP;
            e23.q qVar2 = new e23.q() { // from class: gp.p
                /* JADX WARN: Code duplicated, block: B:13:0x00b2  */
                /* JADX WARN: Code duplicated, block: B:18:0x00d3  */
                /* JADX WARN: Code duplicated, block: B:23:0x00fd  */
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    u4.d dVarS;
                    p3.m mVar2 = (p3.m) obj2;
                    ((Integer) obj3).getClass();
                    ((e0) obj).getClass();
                    x1 x1Var2 = p3.n.f135158a;
                    x0 x0Var2 = x0Var;
                    if (x0Var2 == null || (dVarS = x0Var2.s(zL0)) == null) {
                        dVarS = c10.a.f22442c1.f22489b;
                    }
                    u4.d dVar2 = dVarS;
                    f02.h.f67736a.getClass();
                    long jA = f02.h.a(mVar2);
                    gl.c.f77766a.getClass();
                    long jG = gl.c.a(mVar2).g();
                    String str5 = strB;
                    str5.getClass();
                    String str6 = str3;
                    String strP2 = y.P(R.string.lbl_started_at, new Object[]{str6}, mVar2);
                    s62.a.f157643a.getClass();
                    t62.b bVar2 = t62.b.f162798a;
                    an.e eVar2 = new an.e(dVar2, jA, jG, str4, str5, strF, strC2, str6, null, strB2, strC, null, strP2, b3.a(bVar2), e1.a(bVar2), y.Q(mVar2, R.string.msg_edit_pending_activity_description), y.Q(mVar2, R.string.msg_accept_pending_activity_description), false, 133376, null);
                    final Context context2 = context;
                    boolean zR = mVar2.r(context2);
                    final r rVar2 = this;
                    boolean zR2 = zR | mVar2.r(rVar2);
                    Object objQ3 = mVar2.q();
                    p3.m.a aVar2 = p3.m.f135153a;
                    if (zR2) {
                        final int i17 = 0;
                        objQ3 = new e23.a() { // from class: gp.q
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i17) {
                                    case 0:
                                        PendingActivitiesActivity.a aVar3 = PendingActivitiesActivity.f39793d;
                                        com.garmin.android.apps.connectmobile.pending.activities.presentation.a.c cVar = new com.garmin.android.apps.connectmobile.pending.activities.presentation.a.c(s.a(rVar2.f78419a.f84923a));
                                        aVar3.getClass();
                                        Context context3 = context2;
                                        context3.getClass();
                                        context3.startActivity(PendingActivitiesActivity.a.a(context3, cVar));
                                        break;
                                    default:
                                        PendingActivitiesActivity.a aVar4 = PendingActivitiesActivity.f39793d;
                                        com.garmin.android.apps.connectmobile.pending.activities.presentation.a.c cVar2 = new com.garmin.android.apps.connectmobile.pending.activities.presentation.a.c(s.a(rVar2.f78419a.f84923a));
                                        aVar4.getClass();
                                        Context context4 = context2;
                                        context4.getClass();
                                        context4.startActivity(PendingActivitiesActivity.a.a(context4, cVar2));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ3);
                    } else {
                        aVar2.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            final int i18 = 0;
                            objQ3 = new e23.a() { // from class: gp.q
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i18) {
                                        case 0:
                                            PendingActivitiesActivity.a aVar3 = PendingActivitiesActivity.f39793d;
                                            com.garmin.android.apps.connectmobile.pending.activities.presentation.a.c cVar = new com.garmin.android.apps.connectmobile.pending.activities.presentation.a.c(s.a(rVar2.f78419a.f84923a));
                                            aVar3.getClass();
                                            Context context3 = context2;
                                            context3.getClass();
                                            context3.startActivity(PendingActivitiesActivity.a.a(context3, cVar));
                                            break;
                                        default:
                                            PendingActivitiesActivity.a aVar4 = PendingActivitiesActivity.f39793d;
                                            com.garmin.android.apps.connectmobile.pending.activities.presentation.a.c cVar2 = new com.garmin.android.apps.connectmobile.pending.activities.presentation.a.c(s.a(rVar2.f78419a.f84923a));
                                            aVar4.getClass();
                                            Context context4 = context2;
                                            context4.getClass();
                                            context4.startActivity(PendingActivitiesActivity.a.a(context4, cVar2));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ3);
                        }
                    }
                    e23.a aVar3 = (e23.a) objQ3;
                    boolean zR3 = mVar2.r(context2) | mVar2.r(rVar2);
                    Object objQ4 = mVar2.q();
                    if (zR3) {
                        final int i19 = 1;
                        objQ4 = new e23.a() { // from class: gp.q
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i19) {
                                    case 0:
                                        PendingActivitiesActivity.a aVar4 = PendingActivitiesActivity.f39793d;
                                        com.garmin.android.apps.connectmobile.pending.activities.presentation.a.c cVar = new com.garmin.android.apps.connectmobile.pending.activities.presentation.a.c(s.a(rVar2.f78419a.f84923a));
                                        aVar4.getClass();
                                        Context context3 = context2;
                                        context3.getClass();
                                        context3.startActivity(PendingActivitiesActivity.a.a(context3, cVar));
                                        break;
                                    default:
                                        PendingActivitiesActivity.a aVar5 = PendingActivitiesActivity.f39793d;
                                        com.garmin.android.apps.connectmobile.pending.activities.presentation.a.c cVar2 = new com.garmin.android.apps.connectmobile.pending.activities.presentation.a.c(s.a(rVar2.f78419a.f84923a));
                                        aVar5.getClass();
                                        Context context4 = context2;
                                        context4.getClass();
                                        context4.startActivity(PendingActivitiesActivity.a.a(context4, cVar2));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ4);
                    } else {
                        aVar2.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            final int i110 = 1;
                            objQ4 = new e23.a() { // from class: gp.q
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i110) {
                                        case 0:
                                            PendingActivitiesActivity.a aVar4 = PendingActivitiesActivity.f39793d;
                                            com.garmin.android.apps.connectmobile.pending.activities.presentation.a.c cVar = new com.garmin.android.apps.connectmobile.pending.activities.presentation.a.c(s.a(rVar2.f78419a.f84923a));
                                            aVar4.getClass();
                                            Context context3 = context2;
                                            context3.getClass();
                                            context3.startActivity(PendingActivitiesActivity.a.a(context3, cVar));
                                            break;
                                        default:
                                            PendingActivitiesActivity.a aVar5 = PendingActivitiesActivity.f39793d;
                                            com.garmin.android.apps.connectmobile.pending.activities.presentation.a.c cVar2 = new com.garmin.android.apps.connectmobile.pending.activities.presentation.a.c(s.a(rVar2.f78419a.f84923a));
                                            aVar5.getClass();
                                            Context context4 = context2;
                                            context4.getClass();
                                            context4.startActivity(PendingActivitiesActivity.a.a(context4, cVar2));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ4);
                        }
                    }
                    e23.a aVar4 = (e23.a) objQ4;
                    b0 b0Var2 = b0Var;
                    boolean zR4 = mVar2.r(b0Var2);
                    r70.q qVar3 = qVar;
                    boolean zR5 = zR4 | mVar2.r(qVar3) | mVar2.r(rVar2);
                    Object objQ5 = mVar2.q();
                    if (zR5) {
                        af0.e eVar3 = new af0.e(b0Var2, p1Var, qVar3, rVar2, 26);
                        mVar2.K(eVar3);
                        objQ5 = eVar3;
                    } else {
                        aVar2.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            af0.e eVar4 = new af0.e(b0Var2, p1Var, qVar3, rVar2, 26);
                            mVar2.K(eVar4);
                            objQ5 = eVar4;
                        }
                    }
                    an.d.a(rVar, eVar2, zIsToday, aVar3, aVar4, (e23.a) objQ5, mVar2, 0, 0);
                    return Unit.INSTANCE;
                }
            };
            o0Var = o0VarQ;
            c0.e(zBooleanValue, null, v1VarA, x1VarB, strConcat, z3.f.c(-1782318613, qVar2, o0Var), o0Var, 196608, 2);
        } else {
            o0Var = o0VarQ;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a0((r70.r) this, rVar, qVar, i14, 25);
        }
    }
}
