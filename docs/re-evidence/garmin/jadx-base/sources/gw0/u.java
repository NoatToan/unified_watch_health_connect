package gw0;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lc.u0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import r53.b2;
import r53.c2;
import r53.k2;
import r53.n2;
import r53.p2;
import r53.q2;
import r53.w1;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lgw0/u;", "Landroidx/lifecycle/u1;", "Lrv0/a;", "repository", "Lqv0/a;", "lifestyleLoggingPreferences", "Lf12/l;", "userSettings", "Ltv0/d;", "loggingDelegate", "Ltv0/g;", "requestDeviceUpdate", "Ltv0/v;", "showAutoLoggingBannerUseCase", "Ltv0/f;", "manageLifestyleLoggingReminders", "Lb63/o;", "initialDate", "Lo82/g;", "initialIntervalType", "<init>", "(Lrv0/a;Lqv0/a;Lf12/l;Ltv0/d;Ltv0/g;Ltv0/v;Ltv0/f;Lb63/o;Lo82/g;)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u extends u1 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f79759x = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rv0.a f79760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qv0.a f79761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f12.l f79762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tv0.d f79763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final tv0.g f79764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final tv0.v f79765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final tv0.f f79766g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b63.o f79767h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b63.o f79768i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o82.g f79769j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f79770k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p2 f79771l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p2 f79772m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b2 f79773n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b2 f79774o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b2 f79775p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final u82.a f79776q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u82.a f79777r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final u82.a f79778t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final u82.a f79779v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b2 f79780w;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f79781a;

        static {
            int[] iArr = new int[pv0.w.values().length];
            try {
                iArr[pv0.w.ALCOHOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pv0.w.MORNING_CAFFEINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pv0.w.LATE_CAFFEINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f79781a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgw0/e;", Action.KEY_ATTRIBUTE, "Lpv0/v;", "<anonymous>", "(Lgw0/e;)Lpv0/v;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.reports.LifestyleReportsViewModel$dailySummaryDataState$1", f = "LifestyleReportsViewModel.kt", l = {139}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<gw0.e, t13.d<? super pv0.v>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f79782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f79783b;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = u.this.new c(dVar);
            cVar.f79783b = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(gw0.e eVar, t13.d<? super pv0.v> dVar) {
            return ((c) create(eVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            gw0.e eVar = (gw0.e) this.f79783b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f79782a;
            if (i14 == 0) {
                o13.r.b(obj);
                rv0.a aVar2 = u.this.f79760a;
                String str = eVar.f79580a;
                b63.o oVar = eVar.f79582c;
                b63.o oVar2 = eVar.f79583d;
                this.f79783b = null;
                this.f79782a = 1;
                obj = aVar2.y(str, oVar, oVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                return (pv0.v) ((v2.b) v2Var).f47386a;
            }
            if (v2Var instanceof v2.a) {
                throw ((v2.a) v2Var).f47383a;
            }
            u0.r();
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgw0/e;", Action.KEY_ATTRIBUTE, "Lpv0/z;", "<anonymous>", "(Lgw0/e;)Lpv0/z;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.reports.LifestyleReportsViewModel$dailySummaryDetailsDataState$1", f = "LifestyleReportsViewModel.kt", l = {SyslogConstants.LOG_LOCAL3}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<gw0.e, t13.d<? super pv0.z>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f79785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f79786b;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = u.this.new d(dVar);
            dVar2.f79786b = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(gw0.e eVar, t13.d<? super pv0.z> dVar) {
            return ((d) create(eVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            gw0.e eVar = (gw0.e) this.f79786b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f79785a;
            if (i14 == 0) {
                o13.r.b(obj);
                rv0.a aVar2 = u.this.f79760a;
                long j8 = eVar.f79581b;
                String str = eVar.f79580a;
                b63.o oVar = eVar.f79582c;
                b63.o oVar2 = eVar.f79583d;
                this.f79786b = null;
                this.f79785a = 1;
                obj = aVar2.r(j8, str, oVar, oVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                return (pv0.z) ((v2.b) v2Var).f47386a;
            }
            if (v2Var instanceof v2.a) {
                throw ((v2.a) v2Var).f47383a;
            }
            u0.r();
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lpv0/q;", "<anonymous>", "(Lo82/a;)Lpv0/q;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.reports.LifestyleReportsViewModel$detailsDataState$1", f = "LifestyleReportsViewModel.kt", l = {109, 116}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<o82.a, t13.d<? super pv0.q>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public pv0.q f79788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f79789b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f79790c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f79791d;

        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            e eVar = u.this.new e(dVar);
            eVar.f79791d = obj;
            return eVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super pv0.q> dVar) {
            return ((e) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0256  */
        /* JADX WARN: Code duplicated, block: B:102:0x025a  */
        /* JADX WARN: Code duplicated, block: B:105:0x0264  */
        /* JADX WARN: Code duplicated, block: B:109:0x027a  */
        /* JADX WARN: Code duplicated, block: B:110:0x027f  */
        /* JADX WARN: Code duplicated, block: B:115:0x028d  */
        /* JADX WARN: Code duplicated, block: B:117:0x02bb  */
        /* JADX WARN: Code duplicated, block: B:118:0x02c0  */
        /* JADX WARN: Code duplicated, block: B:120:0x02e0  */
        /* JADX WARN: Code duplicated, block: B:129:0x0128 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:133:0x0274 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:134:0x0283 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:136:0x025e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:137:0x025e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:141:0x00bf A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:142:0x00db A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:143:? A[LOOP:3: B:43:0x00c5->B:143:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:28:0x0095  */
        /* JADX WARN: Code duplicated, block: B:30:0x009f  */
        /* JADX WARN: Code duplicated, block: B:35:0x00ab  */
        /* JADX WARN: Code duplicated, block: B:39:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:41:0x00bf A[EDGE_INSN: B:41:0x00bf->B:49:0x00dc BREAK  A[LOOP:3: B:43:0x00c5->B:143:?]] */
        /* JADX WARN: Code duplicated, block: B:42:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:45:0x00cb  */
        /* JADX WARN: Code duplicated, block: B:51:0x0101  */
        /* JADX WARN: Code duplicated, block: B:54:0x010d  */
        /* JADX WARN: Code duplicated, block: B:56:0x0116  */
        /* JADX WARN: Code duplicated, block: B:57:0x011b  */
        /* JADX WARN: Code duplicated, block: B:64:0x012e  */
        /* JADX WARN: Code duplicated, block: B:73:0x0159  */
        /* JADX WARN: Code duplicated, block: B:75:0x0165  */
        /* JADX WARN: Code duplicated, block: B:77:0x0177  */
        /* JADX WARN: Code duplicated, block: B:79:0x0189  */
        /* JADX WARN: Code duplicated, block: B:81:0x01a2 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:82:0x01a4  */
        /* JADX WARN: Code duplicated, block: B:84:0x01b3  */
        /* JADX WARN: Code duplicated, block: B:86:0x01d1 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:87:0x01d3  */
        /* JADX WARN: Code duplicated, block: B:89:0x01e5  */
        /* JADX WARN: Code duplicated, block: B:91:0x0201  */
        /* JADX WARN: Code duplicated, block: B:93:0x0204  */
        /* JADX WARN: Code duplicated, block: B:95:0x0219  */
        /* JADX WARN: Code duplicated, block: B:97:0x024b  */
        /* JADX WARN: Instruction removed from duplicated block: B:79:0x0189, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:84:0x01b3, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:89:0x01e5, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:95:0x0219, please report this as an issue */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            Object objN;
            pv0.q qVar;
            boolean zG;
            Object objA;
            boolean z14;
            tv0.f fVar;
            List<pv0.h> list;
            fw0.b bVar;
            Context context;
            pd1.c cVar;
            Iterator<T> it;
            pv0.h hVar;
            boolean z15;
            DateTime dateTimeNow;
            wd1.a aVarB;
            wd1.a aVarB2;
            List<pd1.b> listF;
            Iterator<T> it3;
            Object next;
            pd1.b bVar2;
            List<Integer> listH;
            List listM0;
            int minuteOfHour;
            Integer num;
            int iIntValue;
            Integer num2;
            int iIntValue2;
            int size;
            a2 a2Var;
            String str;
            pd1.c cVarG;
            ArrayList<pd1.b> arrayListZ;
            List<Integer> listH2;
            ArrayList arrayListZ2;
            Iterator it4;
            Boolean enabled;
            boolean zBooleanValue;
            List<pd1.b> listF2;
            int size2;
            a2 a2Var2;
            pd1.b bVar3;
            String reminderType;
            o82.a aVar = (o82.a) this.f79791d;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f79790c;
            u uVar = u.this;
            if (i14 == 0) {
                o13.r.b(obj);
                rv0.a aVar3 = uVar.f79760a;
                b63.o oVar = aVar.f130843a;
                this.f79791d = aVar;
                this.f79790c = 1;
                objN = aVar3.n(oVar, this);
                if (objN != aVar2) {
                }
                return aVar2;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                objN = obj;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z14 = this.f79789b;
                qVar = this.f79788a;
                o13.r.b(obj);
                objA = obj;
            }
            uVar.y4(((Boolean) objA).booleanValue(), false);
            zG = z14;
            b63.o oVar2 = aVar.f130843a;
            b63.o oVarD = g22.l.d(b63.o.INSTANCE);
            b63.i.INSTANCE.getClass();
            boolean zG2 = p005kotlin.jvm.internal.s.g(oVar2, b63.q.c(oVarD, 1, b63.i.f16190d));
            if (zG || zG2) {
                fVar = uVar.f79766g;
                list = qVar.f141405a;
                bVar = fVar.f166546b;
                context = fVar.f166545a;
                if (list != null && !list.isEmpty()) {
                    if (fVar.f166547c == null) {
                        fVar.f166547c = fVar.f166546b.g();
                    }
                    cVar = fVar.f166547c;
                    if (cVar != null) {
                        if (list.isEmpty()) {
                            z15 = true;
                            break;
                        }
                        it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z15 = true;
                                break;
                            }
                            hVar = (pv0.h) it.next();
                            hVar.getClass();
                            if (pv0.j.b(hVar) == null) {
                                z15 = false;
                                break;
                            }
                        }
                        dateTimeNow = DateTime.now();
                        wd1.a.C3418a c3418a = wd1.a.f184362c;
                        int dayOfWeek = dateTimeNow.getDayOfWeek();
                        c3418a.getClass();
                        aVarB = wd1.a.C3418a.b(dayOfWeek);
                        aVarB2 = wd1.a.C3418a.b(g22.k.n(aVarB.f184373b, dateTimeNow).getDayOfWeek());
                        listF = cVar.f();
                        if (listF != null) {
                            it3 = listF.iterator();
                            do {
                                if (!it3.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it3.next();
                                bVar3 = (pd1.b) next;
                                if (bVar3 != null) {
                                    reminderType = bVar3.getReminderType();
                                } else {
                                    reminderType = null;
                                }
                            } while (!p005kotlin.jvm.internal.s.g(reminderType, pd1.a.LIFESTYLE_LOGGING.f137376a));
                            bVar2 = (pd1.b) next;
                            if (bVar2 != null && (listH = bVar2.h()) != null && (listM0 = p13.h0.M0(p13.h0.Z(listH))) != null && !listM0.isEmpty()) {
                                minuteOfHour = dateTimeNow.getMinuteOfHour() + (dateTimeNow.getHourOfDay() * 60);
                                num = (Integer) p13.h0.d0(listM0);
                                if (num != null) {
                                    iIntValue = num.intValue();
                                    num2 = (Integer) p13.h0.n0(listM0);
                                    if (num2 != null) {
                                        iIntValue2 = num2.intValue();
                                        if (z15) {
                                            size2 = listM0.size();
                                            a2Var2 = a2.USER_REMINDERS;
                                            i2.f36769a.getClass();
                                            i2.a.b(a2Var2, "ManageLifestyleLoggingRemindersUseCase", "All behaviors logged - managing reminders based on time of day");
                                            if (minuteOfHour < iIntValue) {
                                                i2.a.b(a2Var2, "ManageLifestyleLoggingRemindersUseCase", "Before first notification (" + iIntValue + ") - canceling today's first notification");
                                                bVar.b(context, aVarB, 0);
                                                return qVar;
                                            }
                                            if (minuteOfHour < iIntValue2) {
                                                i2.a.b(a2Var2, "ManageLifestyleLoggingRemindersUseCase", am.j.g(iIntValue, iIntValue2, "Between first (", ") and last (", ") notification - canceling today's last notification"));
                                                bVar.b(context, aVarB, size2 - 1);
                                                return qVar;
                                            }
                                            i2.a.b(a2Var2, "ManageLifestyleLoggingRemindersUseCase", "After last notification (" + iIntValue2 + ") - canceling today's last and tomorrow's first");
                                            bVar.b(context, aVarB, size2 + (-1));
                                            bVar.b(context, aVarB2, 0);
                                            return qVar;
                                        }
                                        if (zG) {
                                            size = listM0.size();
                                            a2Var = a2.USER_REMINDERS;
                                            i2.f36769a.getClass();
                                            i2.a.b(a2Var, "ManageLifestyleLoggingRemindersUseCase", "At least one behavior unlogged - rescheduling reminders based on time of day");
                                            if (minuteOfHour < iIntValue) {
                                                i2.a.b(a2Var, "ManageLifestyleLoggingRemindersUseCase", "Before first notification (" + iIntValue + ") - scheduling today's first notification");
                                                bVar.l(context, aVarB, 0);
                                                bVar.l(context, aVarB2, 0);
                                                return qVar;
                                            }
                                            if (minuteOfHour < iIntValue2) {
                                                i2.a.b(a2Var, "ManageLifestyleLoggingRemindersUseCase", am.j.g(iIntValue, iIntValue2, "Between first (", ") and last (", ") - scheduling today's last notification"));
                                                bVar.b(context, aVarB, 0);
                                                bVar.l(context, aVarB, size - 1);
                                                bVar.l(context, aVarB2, 0);
                                                return qVar;
                                            }
                                            i2.a.b(a2Var, "ManageLifestyleLoggingRemindersUseCase", "After last notification (" + iIntValue2 + ") - scheduling tomorrow's first notification");
                                            bVar.getClass();
                                            str = aVarB.f184372a;
                                            i2.a.b(a2Var, "ReminderNotificationHelper", "clearRemindersForDay: " + str);
                                            cVarG = bVar.g();
                                            if (cVarG != null || (listF2 = cVarG.f()) == null) {
                                                arrayListZ = null;
                                            } else {
                                                arrayListZ = p13.h0.Z(listF2);
                                            }
                                            if (arrayListZ != null) {
                                                for (pd1.b bVar4 : arrayListZ) {
                                                    if (w02.b0.i(bVar4).contains(aVarB)) {
                                                        listH2 = bVar4.h();
                                                        if (listH2 != null) {
                                                            arrayListZ2 = p13.h0.Z(listH2);
                                                        } else {
                                                            arrayListZ2 = null;
                                                        }
                                                        if (arrayListZ2 != null) {
                                                            it4 = arrayListZ2.iterator();
                                                            while (it4.hasNext()) {
                                                                int iIntValue3 = ((Number) it4.next()).intValue();
                                                                a2 a2Var3 = a2.USER_REMINDERS;
                                                                String strQ = am.j.q(l2.f("clearRemindersForDay: canceling reminder id=[", bVar4.getUserReminderId(), "] on ", str, " at "), iIntValue3, " minutes");
                                                                i2.f36769a.getClass();
                                                                i2.a.b(a2Var3, "ReminderNotificationHelper", strQ);
                                                                enabled = bVar4.getEnabled();
                                                                if (enabled != null) {
                                                                    zBooleanValue = enabled.booleanValue();
                                                                } else {
                                                                    zBooleanValue = false;
                                                                }
                                                                PendingIntent pendingIntentF = bVar.f(context, bVar4.getUserReminderId(), aVarB, iIntValue3, bVar4.getReminderText(), Boolean.valueOf(zBooleanValue));
                                                                Object systemService = context.getSystemService("alarm");
                                                                systemService.getClass();
                                                                ((AlarmManager) systemService).cancel(pendingIntentF);
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                i2.a.p(a2Var, "ReminderNotificationHelper", "clearRemindersForDay: no reminders found");
                                            }
                                            a2 a2Var4 = a2.USER_REMINDERS;
                                            String strN = fb1.c.n("clearRemindersForDay: finished clearing reminders for ", str);
                                            i2.f36769a.getClass();
                                            i2.a.b(a2Var4, "ReminderNotificationHelper", strN);
                                            bVar.l(context, aVarB2, 0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return qVar;
            v2 v2Var = (v2) objN;
            if (!(v2Var instanceof v2.b)) {
                if (v2Var instanceof v2.a) {
                    throw ((v2.a) v2Var).f47383a;
                }
                u0.r();
                return null;
            }
            qVar = (pv0.q) ((v2.b) v2Var).f47386a;
            zG = p005kotlin.jvm.internal.s.g(aVar.f130843a, g22.l.d(b63.o.INSTANCE));
            if (zG) {
                tv0.v vVar = uVar.f79765f;
                List list2 = qVar.f141405a;
                if (list2 == null) {
                    list2 = j0.f134944a;
                }
                this.f79791d = aVar;
                this.f79788a = qVar;
                this.f79789b = zG;
                this.f79790c = 2;
                objA = vVar.a(list2, this);
                if (objA != aVar2) {
                    z14 = zG;
                    uVar.y4(((Boolean) objA).booleanValue(), false);
                    zG = z14;
                }
                return aVar2;
            }
            b63.o oVar3 = aVar.f130843a;
            b63.o oVarD2 = g22.l.d(b63.o.INSTANCE);
            b63.i.INSTANCE.getClass();
            boolean zG3 = p005kotlin.jvm.internal.s.g(oVar3, b63.q.c(oVarD2, 1, b63.i.f16190d));
            if (zG) {
                fVar = uVar.f79766g;
                list = qVar.f141405a;
                bVar = fVar.f166546b;
                context = fVar.f166545a;
                if (list != null) {
                    if (fVar.f166547c == null) {
                        fVar.f166547c = fVar.f166546b.g();
                    }
                    cVar = fVar.f166547c;
                    if (cVar != null) {
                        if (list.isEmpty()) {
                            z15 = true;
                            break;
                        }
                        it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z15 = true;
                                break;
                            }
                            hVar = (pv0.h) it.next();
                            hVar.getClass();
                            if (pv0.j.b(hVar) == null) {
                                z15 = false;
                                break;
                            }
                        }
                        dateTimeNow = DateTime.now();
                        wd1.a.C3418a c3418a2 = wd1.a.f184362c;
                        int dayOfWeek2 = dateTimeNow.getDayOfWeek();
                        c3418a2.getClass();
                        aVarB = wd1.a.C3418a.b(dayOfWeek2);
                        aVarB2 = wd1.a.C3418a.b(g22.k.n(aVarB.f184373b, dateTimeNow).getDayOfWeek());
                        listF = cVar.f();
                        if (listF != null) {
                            it3 = listF.iterator();
                            do {
                                if (!it3.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it3.next();
                                bVar3 = (pd1.b) next;
                                if (bVar3 != null) {
                                    reminderType = bVar3.getReminderType();
                                } else {
                                    reminderType = null;
                                }
                            } while (!p005kotlin.jvm.internal.s.g(reminderType, pd1.a.LIFESTYLE_LOGGING.f137376a));
                            bVar2 = (pd1.b) next;
                            if (bVar2 != null) {
                                minuteOfHour = dateTimeNow.getMinuteOfHour() + (dateTimeNow.getHourOfDay() * 60);
                                num = (Integer) p13.h0.d0(listM0);
                                if (num != null) {
                                    iIntValue = num.intValue();
                                    num2 = (Integer) p13.h0.n0(listM0);
                                    if (num2 != null) {
                                        iIntValue2 = num2.intValue();
                                        if (z15) {
                                            size2 = listM0.size();
                                            a2Var2 = a2.USER_REMINDERS;
                                            i2.f36769a.getClass();
                                            i2.a.b(a2Var2, "ManageLifestyleLoggingRemindersUseCase", "All behaviors logged - managing reminders based on time of day");
                                            if (minuteOfHour < iIntValue) {
                                                i2.a.b(a2Var2, "ManageLifestyleLoggingRemindersUseCase", "Before first notification (" + iIntValue + ") - canceling today's first notification");
                                                bVar.b(context, aVarB, 0);
                                                return qVar;
                                            }
                                            if (minuteOfHour < iIntValue2) {
                                                i2.a.b(a2Var2, "ManageLifestyleLoggingRemindersUseCase", am.j.g(iIntValue, iIntValue2, "Between first (", ") and last (", ") notification - canceling today's last notification"));
                                                bVar.b(context, aVarB, size2 - 1);
                                                return qVar;
                                            }
                                            i2.a.b(a2Var2, "ManageLifestyleLoggingRemindersUseCase", "After last notification (" + iIntValue2 + ") - canceling today's last and tomorrow's first");
                                            bVar.b(context, aVarB, size2 + (-1));
                                            bVar.b(context, aVarB2, 0);
                                            return qVar;
                                        }
                                        if (zG) {
                                            size = listM0.size();
                                            a2Var = a2.USER_REMINDERS;
                                            i2.f36769a.getClass();
                                            i2.a.b(a2Var, "ManageLifestyleLoggingRemindersUseCase", "At least one behavior unlogged - rescheduling reminders based on time of day");
                                            if (minuteOfHour < iIntValue) {
                                                i2.a.b(a2Var, "ManageLifestyleLoggingRemindersUseCase", "Before first notification (" + iIntValue + ") - scheduling today's first notification");
                                                bVar.l(context, aVarB, 0);
                                                bVar.l(context, aVarB2, 0);
                                                return qVar;
                                            }
                                            if (minuteOfHour < iIntValue2) {
                                                i2.a.b(a2Var, "ManageLifestyleLoggingRemindersUseCase", am.j.g(iIntValue, iIntValue2, "Between first (", ") and last (", ") - scheduling today's last notification"));
                                                bVar.b(context, aVarB, 0);
                                                bVar.l(context, aVarB, size - 1);
                                                bVar.l(context, aVarB2, 0);
                                                return qVar;
                                            }
                                            i2.a.b(a2Var, "ManageLifestyleLoggingRemindersUseCase", "After last notification (" + iIntValue2 + ") - scheduling tomorrow's first notification");
                                            bVar.getClass();
                                            str = aVarB.f184372a;
                                            i2.a.b(a2Var, "ReminderNotificationHelper", "clearRemindersForDay: " + str);
                                            cVarG = bVar.g();
                                            if (cVarG != null) {
                                                arrayListZ = null;
                                            } else {
                                                arrayListZ = null;
                                            }
                                            if (arrayListZ != null) {
                                                while (r1.hasNext()) {
                                                    if (w02.b0.i(bVar4).contains(aVarB)) {
                                                        listH2 = bVar4.h();
                                                        if (listH2 != null) {
                                                            arrayListZ2 = p13.h0.Z(listH2);
                                                        } else {
                                                            arrayListZ2 = null;
                                                        }
                                                        if (arrayListZ2 != null) {
                                                            it4 = arrayListZ2.iterator();
                                                            while (it4.hasNext()) {
                                                                int iIntValue4 = ((Number) it4.next()).intValue();
                                                                a2 a2Var5 = a2.USER_REMINDERS;
                                                                String strQ2 = am.j.q(l2.f("clearRemindersForDay: canceling reminder id=[", bVar4.getUserReminderId(), "] on ", str, " at "), iIntValue4, " minutes");
                                                                i2.f36769a.getClass();
                                                                i2.a.b(a2Var5, "ReminderNotificationHelper", strQ2);
                                                                enabled = bVar4.getEnabled();
                                                                if (enabled != null) {
                                                                    zBooleanValue = enabled.booleanValue();
                                                                } else {
                                                                    zBooleanValue = false;
                                                                }
                                                                PendingIntent pendingIntentF2 = bVar.f(context, bVar4.getUserReminderId(), aVarB, iIntValue4, bVar4.getReminderText(), Boolean.valueOf(zBooleanValue));
                                                                Object systemService2 = context.getSystemService("alarm");
                                                                systemService2.getClass();
                                                                ((AlarmManager) systemService2).cancel(pendingIntentF2);
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                i2.a.p(a2Var, "ReminderNotificationHelper", "clearRemindersForDay: no reminders found");
                                            }
                                            a2 a2Var6 = a2.USER_REMINDERS;
                                            String strN2 = fb1.c.n("clearRemindersForDay: finished clearing reminders for ", str);
                                            i2.f36769a.getClass();
                                            i2.a.b(a2Var6, "ReminderNotificationHelper", strN2);
                                            bVar.l(context, aVarB2, 0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                fVar = uVar.f79766g;
                list = qVar.f141405a;
                bVar = fVar.f166546b;
                context = fVar.f166545a;
                if (list != null) {
                    if (fVar.f166547c == null) {
                        fVar.f166547c = fVar.f166546b.g();
                    }
                    cVar = fVar.f166547c;
                    if (cVar != null) {
                        if (list.isEmpty()) {
                            z15 = true;
                            break;
                        }
                        it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z15 = true;
                                break;
                            }
                            hVar = (pv0.h) it.next();
                            hVar.getClass();
                            if (pv0.j.b(hVar) == null) {
                                z15 = false;
                                break;
                            }
                        }
                        dateTimeNow = DateTime.now();
                        wd1.a.C3418a c3418a3 = wd1.a.f184362c;
                        int dayOfWeek3 = dateTimeNow.getDayOfWeek();
                        c3418a3.getClass();
                        aVarB = wd1.a.C3418a.b(dayOfWeek3);
                        aVarB2 = wd1.a.C3418a.b(g22.k.n(aVarB.f184373b, dateTimeNow).getDayOfWeek());
                        listF = cVar.f();
                        if (listF != null) {
                            it3 = listF.iterator();
                            do {
                                if (!it3.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it3.next();
                                bVar3 = (pd1.b) next;
                                if (bVar3 != null) {
                                    reminderType = bVar3.getReminderType();
                                } else {
                                    reminderType = null;
                                }
                            } while (!p005kotlin.jvm.internal.s.g(reminderType, pd1.a.LIFESTYLE_LOGGING.f137376a));
                            bVar2 = (pd1.b) next;
                            if (bVar2 != null) {
                                minuteOfHour = dateTimeNow.getMinuteOfHour() + (dateTimeNow.getHourOfDay() * 60);
                                num = (Integer) p13.h0.d0(listM0);
                                if (num != null) {
                                    iIntValue = num.intValue();
                                    num2 = (Integer) p13.h0.n0(listM0);
                                    if (num2 != null) {
                                        iIntValue2 = num2.intValue();
                                        if (z15) {
                                            size2 = listM0.size();
                                            a2Var2 = a2.USER_REMINDERS;
                                            i2.f36769a.getClass();
                                            i2.a.b(a2Var2, "ManageLifestyleLoggingRemindersUseCase", "All behaviors logged - managing reminders based on time of day");
                                            if (minuteOfHour < iIntValue) {
                                                i2.a.b(a2Var2, "ManageLifestyleLoggingRemindersUseCase", "Before first notification (" + iIntValue + ") - canceling today's first notification");
                                                bVar.b(context, aVarB, 0);
                                                return qVar;
                                            }
                                            if (minuteOfHour < iIntValue2) {
                                                i2.a.b(a2Var2, "ManageLifestyleLoggingRemindersUseCase", am.j.g(iIntValue, iIntValue2, "Between first (", ") and last (", ") notification - canceling today's last notification"));
                                                bVar.b(context, aVarB, size2 - 1);
                                                return qVar;
                                            }
                                            i2.a.b(a2Var2, "ManageLifestyleLoggingRemindersUseCase", "After last notification (" + iIntValue2 + ") - canceling today's last and tomorrow's first");
                                            bVar.b(context, aVarB, size2 + (-1));
                                            bVar.b(context, aVarB2, 0);
                                            return qVar;
                                        }
                                        if (zG) {
                                            size = listM0.size();
                                            a2Var = a2.USER_REMINDERS;
                                            i2.f36769a.getClass();
                                            i2.a.b(a2Var, "ManageLifestyleLoggingRemindersUseCase", "At least one behavior unlogged - rescheduling reminders based on time of day");
                                            if (minuteOfHour < iIntValue) {
                                                i2.a.b(a2Var, "ManageLifestyleLoggingRemindersUseCase", "Before first notification (" + iIntValue + ") - scheduling today's first notification");
                                                bVar.l(context, aVarB, 0);
                                                bVar.l(context, aVarB2, 0);
                                                return qVar;
                                            }
                                            if (minuteOfHour < iIntValue2) {
                                                i2.a.b(a2Var, "ManageLifestyleLoggingRemindersUseCase", am.j.g(iIntValue, iIntValue2, "Between first (", ") and last (", ") - scheduling today's last notification"));
                                                bVar.b(context, aVarB, 0);
                                                bVar.l(context, aVarB, size - 1);
                                                bVar.l(context, aVarB2, 0);
                                                return qVar;
                                            }
                                            i2.a.b(a2Var, "ManageLifestyleLoggingRemindersUseCase", "After last notification (" + iIntValue2 + ") - scheduling tomorrow's first notification");
                                            bVar.getClass();
                                            str = aVarB.f184372a;
                                            i2.a.b(a2Var, "ReminderNotificationHelper", "clearRemindersForDay: " + str);
                                            cVarG = bVar.g();
                                            if (cVarG != null) {
                                                arrayListZ = null;
                                            } else {
                                                arrayListZ = null;
                                            }
                                            if (arrayListZ != null) {
                                                while (r1.hasNext()) {
                                                    if (w02.b0.i(bVar4).contains(aVarB)) {
                                                        listH2 = bVar4.h();
                                                        if (listH2 != null) {
                                                            arrayListZ2 = p13.h0.Z(listH2);
                                                        } else {
                                                            arrayListZ2 = null;
                                                        }
                                                        if (arrayListZ2 != null) {
                                                            it4 = arrayListZ2.iterator();
                                                            while (it4.hasNext()) {
                                                                int iIntValue5 = ((Number) it4.next()).intValue();
                                                                a2 a2Var7 = a2.USER_REMINDERS;
                                                                String strQ3 = am.j.q(l2.f("clearRemindersForDay: canceling reminder id=[", bVar4.getUserReminderId(), "] on ", str, " at "), iIntValue5, " minutes");
                                                                i2.f36769a.getClass();
                                                                i2.a.b(a2Var7, "ReminderNotificationHelper", strQ3);
                                                                enabled = bVar4.getEnabled();
                                                                if (enabled != null) {
                                                                    zBooleanValue = enabled.booleanValue();
                                                                } else {
                                                                    zBooleanValue = false;
                                                                }
                                                                PendingIntent pendingIntentF3 = bVar.f(context, bVar4.getUserReminderId(), aVarB, iIntValue5, bVar4.getReminderText(), Boolean.valueOf(zBooleanValue));
                                                                Object systemService3 = context.getSystemService("alarm");
                                                                systemService3.getClass();
                                                                ((AlarmManager) systemService3).cancel(pendingIntentF3);
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                i2.a.p(a2Var, "ReminderNotificationHelper", "clearRemindersForDay: no reminders found");
                                            }
                                            a2 a2Var8 = a2.USER_REMINDERS;
                                            String strN3 = fb1.c.n("clearRemindersForDay: finished clearing reminders for ", str);
                                            i2.f36769a.getClass();
                                            i2.a.b(a2Var8, "ReminderNotificationHelper", strN3);
                                            bVar.l(context, aVarB2, 0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return qVar;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lr53/j;", "", "Lpv0/w;", "", "Lpv0/y$a;", "alcoholSubtype", "Lpv0/y$b;", "caffeineSubtype", "", "<anonymous>", "(Lr53/j;Lpv0/y$a;Lpv0/y$b;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.reports.LifestyleReportsViewModel$lastSelectedBehaviourSubtypes$1", f = "LifestyleReportsViewModel.kt", l = {177}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.r<r53.j<? super Map>, pv0.y.a, pv0.y.b, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f79793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ r53.j f79794b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ pv0.y.a f79795c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ pv0.y.b f79796d;

        public f(t13.d<? super f> dVar) {
            super(4, dVar);
        }

        @Override // e23.r
        public final Object invoke(r53.j<? super Map> jVar, pv0.y.a aVar, pv0.y.b bVar, t13.d<? super Unit> dVar) {
            f fVar = new f(dVar);
            fVar.f79794b = jVar;
            fVar.f79795c = aVar;
            fVar.f79796d = bVar;
            return fVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            r53.j jVar = this.f79794b;
            pv0.y.a aVar = this.f79795c;
            pv0.y.b bVar = this.f79796d;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f79793a;
            if (i14 == 0) {
                o13.r.b(obj);
                Map mapE = p13.u0.e(new o13.p(pv0.w.ALCOHOL, aVar), new o13.p(pv0.w.MORNING_CAFFEINE, bVar), new o13.p(pv0.w.LATE_CAFFEINE, bVar));
                this.f79794b = null;
                this.f79795c = null;
                this.f79796d = null;
                this.f79793a = 1;
                if (jVar.emit(mapE, this) == aVar2) {
                    return aVar2;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class g implements r53.i<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f79797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ u f79798b;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f79799a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f79800b;

            /* JADX INFO: renamed from: gw0.u$g$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.reports.LifestyleReportsViewModel$special$$inlined$map$1$2", f = "LifestyleReportsViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C1600a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f79801a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f79802b;

                public C1600a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f79801a = obj;
                    this.f79802b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar, u uVar) {
                this.f79799a = jVar;
                this.f79800b = uVar;
            }

            /* JADX WARN: Code duplicated, block: B:27:0x0069 A[EDGE_INSN: B:27:0x0069->B:28:0x006a BREAK  A[LOOP:0: B:22:0x0055->B:35:?]] */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, java.util.Map] */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C1600a c1600a;
                boolean z14;
                if (dVar instanceof C1600a) {
                    c1600a = (C1600a) dVar;
                    int i14 = c1600a.f79802b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c1600a.f79802b = i14 - Integer.MIN_VALUE;
                    } else {
                        c1600a = new C1600a(dVar);
                    }
                } else {
                    c1600a = new C1600a(dVar);
                }
                Object obj2 = c1600a.f79801a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c1600a.f79802b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    if (!((Boolean) obj).booleanValue()) {
                        z14 = false;
                        break;
                    }
                    Collection collectionValues = this.f79800b.f79770k.values();
                    if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                        Iterator<T> it = collectionValues.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z14 = false;
                                break;
                            }
                            if (!((Boolean) it.next()).booleanValue()) {
                                z14 = true;
                                break;
                            }
                        }
                    } else {
                        z14 = false;
                        break;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z14);
                    c1600a.f79802b = 1;
                    if (this.f79799a.emit(boolValueOf, c1600a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public g(r53.i iVar, u uVar) {
            this.f79797a = iVar;
            this.f79798b = uVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super Boolean> jVar, t13.d dVar) {
            Object objCollect = this.f79797a.collect(new a(jVar, this.f79798b), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class h implements r53.i<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f79804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ u f79805b;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f79806a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f79807b;

            /* JADX INFO: renamed from: gw0.u$h$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.reports.LifestyleReportsViewModel$special$$inlined$map$2$2", f = "LifestyleReportsViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C1601a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f79808a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f79809b;

                public C1601a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f79808a = obj;
                    this.f79809b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar, u uVar) {
                this.f79806a = jVar;
                this.f79807b = uVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.Map] */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C1601a c1601a;
                if (dVar instanceof C1601a) {
                    c1601a = (C1601a) dVar;
                    int i14 = c1601a.f79809b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c1601a.f79809b = i14 - Integer.MIN_VALUE;
                    } else {
                        c1601a = new C1601a(dVar);
                    }
                } else {
                    c1601a = new C1601a(dVar);
                }
                Object obj2 = c1601a.f79808a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c1601a.f79809b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    Boolean bool = (Boolean) this.f79807b.f79770k.get(((h0) obj).f79609a);
                    Boolean boolValueOf = Boolean.valueOf(!(bool != null ? bool.booleanValue() : false));
                    c1601a.f79809b = 1;
                    if (this.f79806a.emit(boolValueOf, c1601a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public h(r53.i iVar, u uVar) {
            this.f79804a = iVar;
            this.f79805b = uVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super Boolean> jVar, t13.d dVar) {
            Object objCollect = this.f79804a.collect(new a(jVar, this.f79805b), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgw0/e;", Action.KEY_ATTRIBUTE, "Lpv0/z;", "<anonymous>", "(Lgw0/e;)Lpv0/z;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.reports.LifestyleReportsViewModel$weeklySummaryDetailsDataState$1", f = "LifestyleReportsViewModel.kt", l = {165}, m = "invokeSuspend", v = 2)
    public static final class i extends v13.i implements e23.p<gw0.e, t13.d<? super pv0.z>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f79811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f79812b;

        public i(t13.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            i iVar = u.this.new i(dVar);
            iVar.f79812b = obj;
            return iVar;
        }

        @Override // e23.p
        public final Object invoke(gw0.e eVar, t13.d<? super pv0.z> dVar) {
            return ((i) create(eVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            gw0.e eVar = (gw0.e) this.f79812b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f79811a;
            if (i14 == 0) {
                o13.r.b(obj);
                rv0.a aVar2 = u.this.f79760a;
                long j8 = eVar.f79581b;
                String str = eVar.f79580a;
                b63.o oVar = eVar.f79583d;
                this.f79812b = null;
                this.f79811a = 1;
                obj = aVar2.a(j8, str, oVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                return (pv0.z) ((v2.b) v2Var).f47386a;
            }
            if (v2Var instanceof v2.a) {
                throw ((v2.a) v2Var).f47383a;
            }
            u0.r();
            return null;
        }
    }

    static {
        new a(null);
    }

    public u(rv0.a aVar, qv0.a aVar2, f12.l lVar, tv0.d dVar, tv0.g gVar, tv0.v vVar, tv0.f fVar, b63.o oVar, o82.g gVar2) {
        aVar.getClass();
        aVar2.getClass();
        lVar.getClass();
        dVar.getClass();
        gVar.getClass();
        vVar.getClass();
        fVar.getClass();
        this.f79760a = aVar;
        this.f79761b = aVar2;
        this.f79762c = lVar;
        this.f79763d = dVar;
        this.f79764e = gVar;
        this.f79765f = vVar;
        this.f79766g = fVar;
        b63.o oVarD = g22.l.d(b63.o.INSTANCE);
        this.f79767h = oVarD;
        this.f79768i = oVar != null ? oVar : oVarD;
        this.f79769j = gVar2 == null ? o82.g.f130850c : gVar2;
        bv.b.f21239a.getClass();
        bv.b.a();
        k1 k1Var = k1.f37122a;
        pv0.r rVar = pv0.r.OVERNIGHT_STRESS;
        k1Var.getClass();
        this.f79770k = p13.u0.e(new o13.p(rVar, Boolean.valueOf(bo1.a.a().c().p())), new o13.p(pv0.r.OVERNIGHT_HRV, Boolean.valueOf(k1Var.h())), new o13.p(pv0.r.SLEEP_SCORE, Boolean.valueOf(bo1.a.a().c().z0())));
        p2 p2VarA = q2.a(new h0(null, null, null, false, false, false, false, false, null, 511, null));
        this.f79771l = p2VarA;
        p2 p2VarA2 = q2.a(Boolean.valueOf(aVar2.l()));
        this.f79772m = p2VarA2;
        b2 b2VarD = r53.s.d(p2VarA2);
        this.f79773n = b2VarD;
        g gVar3 = new g(b2VarD, this);
        w9.a aVarA = v1.a(this);
        k2.a aVar3 = k2.f150703a;
        n2 n2VarA = k2.a.a(aVar3, 2);
        Boolean bool = Boolean.FALSE;
        this.f79774o = r53.s.K(gVar3, aVarA, n2VarA, bool);
        this.f79775p = r53.s.K(new h(p2VarA, this), v1.a(this), k2.a.a(aVar3, 2), bool);
        if (aVar2.r()) {
            B4(true);
        }
        if (aVar2.q()) {
            z4(true);
        }
        boolean zU = aVar2.u();
        boolean zD = dVar.d();
        if (zU && zD) {
            A4(true);
        }
        fVar.f166547c = fVar.f166546b.g();
        boolean z14 = false;
        this.f79776q = new u82.a(v1.a(this), new y82.e(new y82.c(new e(null)), null, 2, null), z14, 4, null);
        this.f79777r = new u82.a(v1.a(this), new y82.e(new y82.c(new c(null)), null, 2, null), z14, 4, null);
        this.f79778t = new u82.a(v1.a(this), new y82.e(new y82.c(new d(null)), null, 2, null), z14, 4, null);
        this.f79779v = new u82.a(v1.a(this), new y82.e(new y82.c(new i(null)), null, 2, null), z14, 4, null);
        this.f79780w = r53.s.K(new c2(new w1(new r53.i[]{aVar2.w(), aVar2.t()}, null, new f(null))), v1.a(this), k2.a.a(aVar3, 2), p13.u0.e(new o13.p(pv0.w.ALCOHOL, aVar2.c()), new o13.p(pv0.w.MORNING_CAFFEINE, aVar2.v()), new o13.p(pv0.w.LATE_CAFFEINE, aVar2.v())));
    }

    public final void A4(boolean z14) {
        while (true) {
            p2 p2Var = this.f79771l;
            Object value = p2Var.getValue();
            boolean z15 = z14;
            if (p2Var.b(value, h0.a((h0) value, null, null, null, false, false, false, z15, false, null, 447))) {
                this.f79761b.a(z15);
                return;
            }
            z14 = z15;
        }
    }

    public final void B4(boolean z14) {
        while (true) {
            p2 p2Var = this.f79771l;
            Object value = p2Var.getValue();
            boolean z15 = z14;
            if (p2Var.b(value, h0.a((h0) value, null, null, null, false, z15, false, false, false, null, 495))) {
                this.f79761b.n(z15);
                return;
            }
            z14 = z15;
        }
    }

    public final void C4(b63.o oVar) {
        while (true) {
            p2 p2Var = this.f79771l;
            Object value = p2Var.getValue();
            b63.o oVar2 = oVar;
            if (p2Var.b(value, h0.a((h0) value, null, null, null, false, false, false, false, false, oVar2, 255))) {
                return;
            } else {
                oVar = oVar2;
            }
        }
    }

    public final void D4(pv0.r rVar) {
        rVar.getClass();
        while (true) {
            p2 p2Var = this.f79771l;
            Object value = p2Var.getValue();
            pv0.r rVar2 = rVar;
            if (p2Var.b(value, h0.a((h0) value, rVar2, null, null, false, false, false, false, false, null, 510))) {
                return;
            } else {
                rVar = rVar2;
            }
        }
    }

    public final void x4(b63.o oVar, boolean z14) {
        p2 p2Var;
        Object value;
        oVar.getClass();
        boolean z15 = z14 && az0.b.a();
        if (z15) {
            this.f79776q.i(new o82.a(oVar, null, 2, null), false);
        }
        do {
            p2Var = this.f79771l;
            value = p2Var.getValue();
        } while (!p2Var.b(value, h0.a((h0) value, null, null, null, z15, false, false, false, false, null, 503)));
    }

    public final void y4(boolean z14, boolean z15) {
        boolean z16;
        while (true) {
            p2 p2Var = this.f79771l;
            Object value = p2Var.getValue();
            z16 = z14;
            if (p2Var.b(value, h0.a((h0) value, null, null, null, false, false, false, false, z16, null, 383))) {
                break;
            } else {
                z14 = z16;
            }
        }
        if (z15) {
            this.f79761b.g(z16);
        }
    }

    public final void z4(boolean z14) {
        while (true) {
            p2 p2Var = this.f79771l;
            Object value = p2Var.getValue();
            boolean z15 = z14;
            if (p2Var.b(value, h0.a((h0) value, null, null, null, false, false, z15, false, false, null, 479))) {
                this.f79761b.p(z15);
                return;
            }
            z14 = z15;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lgw0/u$a;", "", "<init>", "()V", "", "NUM_OF_WEEKS_IN_3_MONTHS", "I", "", "REQUEST_DEVICE_UPDATE_DELAY_MILLIS", "J", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
