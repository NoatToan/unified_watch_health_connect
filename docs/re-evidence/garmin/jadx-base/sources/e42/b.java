package e42;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import b63.o;
import c22.f3;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.b1;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.apps.connectmobile.v2;
import d53.t;
import d53.w;
import e23.p;
import f12.l;
import g22.k;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import o13.r;
import o61.q;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import p13.u;
import q71.f;
import r1.q2;
import r53.b2;
import r53.j;
import r53.k2;
import r53.p2;
import r53.s;
import r53.v;
import v13.i;
import vb.h;
import zd0.n;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Le42/b;", "Landroidx/lifecycle/u1;", "Lq71/e;", "initialSelectedVO2MaxType", "Landroid/content/Context;", "applicationContext", "Lt32/a;", "vo2MaxRepository", "Lf12/l;", "gcmUserSettings", "Lcom/garmin/android/apps/connectmobile/b1;", "featureItemAvailability", "Lu32/a;", "vo2MaxDelegate", "Lzd0/n;", "getScreenlessPairedDevicesUseCase", "<init>", "(Lq71/e;Landroid/content/Context;Lt32/a;Lf12/l;Lcom/garmin/android/apps/connectmobile/b1;Lu32/a;Lzd0/n;)V", "gcm-vo2_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q71.e f62874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f62875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t32.a f62876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f62877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b1 f62878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u32.a f62879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f62880g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f62881h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b2 f62882i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2 f62883j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b2 f62884k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u82.a<o82.a, d42.b> f62885l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u82.a<o82.a, q71.d> f62886m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u82.a<o82.a, q71.d> f62887n;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Ld42/b;", "<anonymous>", "(Lo82/a;)Ld42/b;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.vo2.reports.presentation.viewmodel.VO2MaxReportsViewModel$currentVO2MaxPageState$1", f = "VO2MaxReportsViewModel.kt", l = {59}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<o82.a, t13.d<? super d42.b>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f62888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f62889b;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = b.this.new a(dVar);
            aVar.f62889b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super d42.b> dVar) {
            return ((a) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            Object objB;
            boolean z14;
            o13.p pVar;
            String string;
            String string2;
            String str;
            String str2;
            Integer numI;
            o82.a aVar = (o82.a) this.f62889b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f62888a;
            boolean z15 = true;
            b bVar = b.this;
            if (i14 == 0) {
                r.b(obj);
                t32.a aVar3 = bVar.f62876c;
                fz0.c cVarA = fz0.d.a(aVar.f130843a);
                this.f62889b = null;
                this.f62888a = 1;
                objB = aVar3.b(cVarA, j0.f134944a, this);
                if (objB == aVar2) {
                    return aVar2;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                objB = obj;
            }
            v2 v2Var = (v2) objB;
            if (!(v2Var instanceof v2.b)) {
                q2.u("Error fetching current VO2Max data!");
                return null;
            }
            o61.p pVar2 = (o61.p) ((v2.b) v2Var).f47386a;
            a61.e.f1563a.getClass();
            double[] dArrG = a61.e.g();
            b42.a aVar4 = b42.a.f15716a;
            Context context = bVar.f62875b;
            l lVar = bVar.f62877d;
            int iU = lVar.u();
            UserSettingsDTO.c.a aVar5 = UserSettingsDTO.c.f43531c;
            String strW = lVar.w();
            aVar5.getClass();
            UserSettingsDTO.c cVarA2 = UserSettingsDTO.c.a.a(strW);
            boolean zT0 = bVar.f62878e.T0();
            aVar4.getClass();
            pVar2.getClass();
            context.getClass();
            dArrG.getClass();
            cVarA2.getClass();
            pi0.e eVar = new pi0.e(context);
            w13.c<q71.e> cVar = q71.e.f143243g;
            ArrayList arrayList = new ArrayList();
            for (q71.e eVar2 : cVar) {
                q qVarC = pVar2.c(eVar2);
                if (qVarC != null) {
                    a61.e eVar3 = a61.e.f1563a;
                    double vo2MaxPreciseValue = qVarC.getVo2MaxPreciseValue();
                    eVar3.getClass();
                    q71.a aVarB = a61.e.b(vo2MaxPreciseValue, dArrG);
                    float fFloatValue = ((Number) oi0.c.I(qVarC.getVo2MaxPreciseValue(), oi0.c.j(u.e0(dArrG), qVarC.getVo2MaxPreciseValue())).f128595b).floatValue() / 100.0f;
                    String strValueOf = String.valueOf((int) qVarC.getVo2MaxValue());
                    b42.a aVar6 = b42.a.f15716a;
                    String fitnessAge = qVarC.getFitnessAge();
                    int iIntValue = (fitnessAge == null || (numI = t.i(fitnessAge)) == null) ? 0 : numI.intValue();
                    aVar6.getClass();
                    String strA = "";
                    if (iIntValue == 0 || zT0) {
                        string = null;
                    } else {
                        f3 f3Var = f3.f23054a;
                        String string3 = context.getString(R.string.vo2_max_fitness_age_normal_msg, String.valueOf(iIntValue));
                        string3.getClass();
                        int color = a7.b.getColor(context, R.color.gcm_system_static_white);
                        f3Var.getClass();
                        int iL = w.L(0, 6, string3, "<white>");
                        int iL2 = w.L(0, 6, string3, "</white>") - 7;
                        SpannableString spannableString = new SpannableString(d53.u.v(d53.u.v(string3, "<white>", "", false), "</white>", "", false));
                        spannableString.setSpan(new ForegroundColorSpan(color), iL, iL2, 18);
                        string = spannableString.toString();
                    }
                    double vo2MaxPreciseValue2 = qVarC.getVo2MaxPreciseValue();
                    if (Double.isNaN(vo2MaxPreciseValue2)) {
                        str = null;
                    } else {
                        String strI = a61.e.i(iU, vo2MaxPreciseValue2, (cVarA2 == UserSettingsDTO.c.NOT_SPECIFIED ? UserSettingsDTO.c.MALE : cVarA2) == UserSettingsDTO.c.MALE);
                        if (w.z(strI, "top", false)) {
                            int i15 = b42.a.C0222a.f15717a[eVar2.ordinal()];
                            if (i15 == 1) {
                                string2 = context.getString(R.string.vo2_max_top_percentile_msg, w.O(strI, "top "));
                            } else if (i15 == 2) {
                                string2 = context.getString(R.string.cycling_vo2_max_top_percentile_msg, w.O(strI, "top "));
                            } else {
                                if (i15 != 3) {
                                    u0.r();
                                    return null;
                                }
                                string2 = context.getString(R.string.rowing_vo2_max_top_percentile_msg, w.O(strI, "top "));
                            }
                        } else {
                            int i16 = b42.a.C0222a.f15717a[eVar2.ordinal()];
                            if (i16 == 1) {
                                string2 = context.getString(R.string.vo2_max_bottom_percentile_msg, w.O(strI, "bottom "));
                            } else if (i16 == 2) {
                                string2 = context.getString(R.string.cycling_vo2_max_bottom_percentile_msg, w.O(strI, "bottom "));
                            } else {
                                if (i16 != 3) {
                                    u0.r();
                                    return null;
                                }
                                string2 = context.getString(R.string.rowing_vo2_max_bottom_percentile_msg, w.O(strI, "bottom "));
                            }
                        }
                        str = string2;
                    }
                    DateTime dateTimeK = c22.j0.K(qVarC.getCalendarDate(), "yyyy-MM-dd");
                    if (dateTimeK != null) {
                        DateTime dateTime = new DateTime();
                        if (k.f(dateTime, dateTimeK)) {
                            String string4 = context.getString(R.string.challenge_leaderboard_header_today_label);
                            string4.getClass();
                            str2 = string4;
                            z14 = true;
                        } else {
                            z14 = true;
                            if (k.f(dateTime.minusDays(1), dateTimeK)) {
                                strA = context.getString(R.string.social_elapsed_time_yesterday);
                                strA.getClass();
                            } else {
                                strA = eVar.a(dateTimeK, qi0.a.RELATIVE_YEAR_ABBREV_MONTH_DAY_WEEKDAY);
                            }
                        }
                        pVar = new o13.p(eVar2, new d42.a(strValueOf, fFloatValue, aVarB, string, str, str2));
                    } else {
                        z14 = true;
                    }
                    str2 = strA;
                    pVar = new o13.p(eVar2, new d42.a(strValueOf, fFloatValue, aVarB, string, str, str2));
                } else {
                    dArrG = dArrG;
                    z14 = z15;
                    zT0 = zT0;
                    pVar = null;
                }
                if (pVar != null) {
                    arrayList.add(pVar);
                }
                pVar2 = pVar2;
                z15 = z14;
                dArrG = dArrG;
                zT0 = zT0;
            }
            return new d42.b(i53.a.g(p13.u0.l(arrayList)));
        }
    }

    /* JADX INFO: renamed from: e42.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lq71/d;", "<anonymous>", "(Lo82/a;)Lq71/d;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.vo2.reports.presentation.viewmodel.VO2MaxReportsViewModel$dailyVO2MaxPageState$1", f = "VO2MaxReportsViewModel.kt", l = {86}, m = "invokeSuspend", v = 2)
    public static final class C1325b extends i implements p<o82.a, t13.d<? super q71.d>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f62891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f62892b;

        public C1325b(t13.d<? super C1325b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C1325b c1325b = b.this.new C1325b(dVar);
            c1325b.f62892b = obj;
            return c1325b;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super q71.d> dVar) {
            return ((C1325b) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            o82.a aVar = (o82.a) this.f62892b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f62891a;
            b bVar = b.this;
            if (i14 == 0) {
                r.b(obj);
                if (bVar.f62885l.b().isEmpty()) {
                    u82.a<o82.a, d42.b> aVar3 = bVar.f62885l;
                    o.Companion companion = o.INSTANCE;
                    aVar3.i(new o82.a(g22.l.d(companion), g22.l.d(companion)), true);
                }
                t32.a aVar4 = bVar.f62876c;
                fz0.c cVarA = fz0.d.a(aVar.f130843a);
                fz0.c cVarA2 = fz0.d.a(aVar.f130844b);
                this.f62892b = aVar;
                this.f62891a = 1;
                obj = aVar4.c(cVarA, cVarA2, j0.f134944a, this);
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                return f.a((List) ((v2.b) v2Var).f47386a, bVar.f62875b, aVar);
            }
            q2.u("Error fetching daily VO2Max data!");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Le42/a;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.vo2.reports.presentation.viewmodel.VO2MaxReportsViewModel$screenlessDevicesState$1", f = "VO2MaxReportsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<j<? super e42.a>, t13.d<? super Unit>, Object> {
        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(j<? super e42.a> jVar, t13.d<? super Unit> dVar) {
            return ((c) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            b bVar = b.this;
            bVar.getClass();
            ge1.b.T(v1.a(bVar), null, null, new e42.c(bVar, null), 3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lq71/e;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.vo2.reports.presentation.viewmodel.VO2MaxReportsViewModel$selectedVO2MaxType$1", f = "VO2MaxReportsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends i implements p<j<? super q71.e>, t13.d<? super Unit>, Object> {
        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(j<? super q71.e> jVar, t13.d<? super Unit> dVar) {
            return ((d) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            b bVar = b.this;
            q71.e eVar = bVar.f62874a;
            if (eVar != null) {
                p2 p2Var = bVar.f62881h;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, eVar));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lq71/d;", "<anonymous>", "(Lo82/a;)Lq71/d;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.vo2.reports.presentation.viewmodel.VO2MaxReportsViewModel$weeklyVO2MaxPageState$1", f = "VO2MaxReportsViewModel.kt", l = {107}, m = "invokeSuspend", v = 2)
    public static final class e extends i implements p<o82.a, t13.d<? super q71.d>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f62896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f62897b;

        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            e eVar = b.this.new e(dVar);
            eVar.f62897b = obj;
            return eVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super q71.d> dVar) {
            return ((e) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            o82.a aVar = (o82.a) this.f62897b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f62896a;
            b bVar = b.this;
            if (i14 == 0) {
                r.b(obj);
                if (bVar.f62885l.b().isEmpty()) {
                    u82.a<o82.a, d42.b> aVar3 = bVar.f62885l;
                    o.Companion companion = o.INSTANCE;
                    aVar3.i(new o82.a(g22.l.d(companion), g22.l.d(companion)), true);
                }
                t32.a aVar4 = bVar.f62876c;
                fz0.c cVarA = fz0.d.a(aVar.f130843a);
                fz0.c cVarA2 = fz0.d.a(aVar.f130844b);
                this.f62897b = aVar;
                this.f62896a = 1;
                obj = aVar4.a(cVarA, cVarA2, j0.f134944a, this);
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                return f.a((List) ((v2.b) v2Var).f47386a, bVar.f62875b, aVar);
            }
            q2.u("Error fetching daily VO2Max data!");
            return null;
        }
    }

    public b(q71.e eVar, Context context, t32.a aVar, l lVar, b1 b1Var, u32.a aVar2, n nVar) {
        context.getClass();
        aVar.getClass();
        lVar.getClass();
        b1Var.getClass();
        aVar2.getClass();
        nVar.getClass();
        this.f62874a = eVar;
        this.f62875b = context;
        this.f62876c = aVar;
        this.f62877d = lVar;
        this.f62878e = b1Var;
        this.f62879f = aVar2;
        this.f62880g = nVar;
        p2 p2VarA = r53.q2.a(eVar == null ? (q71.e) h0.b0(q71.e.f143243g) : eVar);
        this.f62881h = p2VarA;
        v vVar = new v(new d(null), p2VarA);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f62882i = s.K(vVar, aVarA, k2.a.f150706c, p2VarA.getValue());
        p2 p2VarA2 = r53.q2.a(e42.a.b.f62872a);
        this.f62883j = p2VarA2;
        this.f62884k = s.K(new v(new c(null), p2VarA2), v1.a(this), k2.a.f150705b, p2VarA2.getValue());
        this.f62885l = new u82.a<>(v1.a(this), new y82.e(new y82.c(new a(null)), null, 2, null), false, 4, null);
        this.f62886m = new u82.a<>(v1.a(this), new y82.e(new y82.c(new C1325b(null)), null, 2, null), false, 4, null);
        this.f62887n = new u82.a<>(v1.a(this), new y82.e(new y82.c(new e(null)), null, 2, null), false, 4, null);
    }
}
