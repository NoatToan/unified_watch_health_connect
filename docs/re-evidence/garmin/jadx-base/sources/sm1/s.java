package sm1;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import aq1.d0;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.performance.model.TrainingStatusReportDTO;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.Collection;
import java.util.List;
import java.util.TreeMap;
import o53.b0;
import org.joda.time.DateTime;
import org.joda.time.Weeks;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import p13.u0;
import p3.c2;
import p3.p0;
import r1.q2;
import r53.b2;
import r53.k2;
import r53.m2;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lsm1/s;", "Landroidx/lifecycle/u1;", "Lnm1/a;", "sleepRepository", "Lpm1/g;", "preferences", "Lpm1/f;", "sleepDelegate", "Lpm1/a;", "cachedSleepDataUseCase", "Lt60/h;", "crossSellingPreferences", "<init>", "(Lnm1/a;Lpm1/g;Lpm1/f;Lpm1/a;Lt60/h;)V", "a", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s extends u1 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final t60.a f160180t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nm1.a f160181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pm1.g f160182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pm1.f f160183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pm1.a f160184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t60.h f160185e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final tf0.i f160186f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f160187g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b2 f160188h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c2 f160189i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c2 f160190j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b2 f160191k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u82.a f160192l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u82.a f160193m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u82.a f160194n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final u82.a f160195o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final u82.a f160196p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final u82.a f160197q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b2 f160198r;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f160199a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f160199a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lcom/garmin/android/apps/connectmobile/performance/model/TrainingStatusReportDTO;", "<anonymous>", "(Lo82/a;)Lcom/garmin/android/apps/connectmobile/performance/model/TrainingStatusReportDTO;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.SleepReportsViewModel$acuteLoadReportsDataState$1", f = "SleepReportsViewModel.kt", l = {276}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o82.a, t13.d<? super TrainingStatusReportDTO>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f160200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f160201b;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = s.this.new c(dVar);
            cVar.f160201b = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super TrainingStatusReportDTO> dVar) {
            return ((c) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            o82.a aVar = (o82.a) this.f160201b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f160200a;
            if (i14 == 0) {
                o13.r.b(obj);
                b63.o oVar = aVar.f130843a;
                b63.o oVar2 = aVar.f130844b;
                pm1.f fVar = s.this.f160183c;
                this.f160201b = null;
                this.f160200a = 1;
                obj = fVar.j(oVar, oVar2, this);
                if (obj == aVar2) {
                    return aVar2;
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
                return (TrainingStatusReportDTO) ((v2.b) v2Var).f47386a;
            }
            q2.u("Error fetching details sleep data");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lmm1/b;", "<anonymous>", "(Lo82/a;)Lmm1/b;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.SleepReportsViewModel$dailyReportsDataState$1", f = "SleepReportsViewModel.kt", l = {196}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o82.a, t13.d<? super mm1.b>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public DateTime f160203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public DateTime f160204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f160205c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f160206d;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = s.this.new d(dVar);
            dVar2.f160206d = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super mm1.b> dVar) {
            return ((d) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            DateTime dateTimeAtStartOfDay;
            Object objG;
            DateTime dateTime;
            v2 aVar;
            o82.a aVar2 = (o82.a) this.f160206d;
            u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f160205c;
            s sVar = s.this;
            if (i14 == 0) {
                o13.r.b(obj);
                DateTime dateTimeAtStartOfDay2 = g22.l.h(aVar2.f130843a).toDateTimeAtStartOfDay();
                dateTimeAtStartOfDay = g22.l.h(aVar2.f130844b).toDateTimeAtStartOfDay();
                nm1.a aVar4 = sVar.f160181a;
                dateTimeAtStartOfDay2.getClass();
                dateTimeAtStartOfDay.getClass();
                this.f160206d = null;
                this.f160203a = dateTimeAtStartOfDay2;
                this.f160204b = dateTimeAtStartOfDay;
                this.f160205c = 1;
                objG = aVar4.g(dateTimeAtStartOfDay2, dateTimeAtStartOfDay, this);
                if (objG == aVar3) {
                    return aVar3;
                }
                dateTime = dateTimeAtStartOfDay2;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dateTimeAtStartOfDay = this.f160204b;
                DateTime dateTime2 = this.f160203a;
                o13.r.b(obj);
                objG = obj;
                dateTime = dateTime2;
            }
            DateTime dateTime3 = dateTimeAtStartOfDay;
            v2 v2Var = (v2) objG;
            dateTime.getClass();
            dateTime3.getClass();
            t60.a aVar5 = s.f160180t;
            sVar.getClass();
            if (v2Var instanceof v2.b) {
                TreeMap treeMap = new TreeMap();
                u0.k(treeMap, new o13.p[0]);
                v2.b bVar = (v2.b) v2Var;
                int i15 = bVar.f47387b;
                mm1.b bVar2 = i15 == 200 ? (mm1.b) bVar.f47386a : new mm1.b(j0.f134944a, null, 2, null);
                new e32.d(null, 1, null).a(dateTime, dateTime3, treeMap, 1, new d0(bVar2.b(), 24));
                Collection collectionValues = treeMap.values();
                collectionValues.getClass();
                aVar = new v2.b(mm1.b.a(bVar2, h0.b1(collectionValues)), i15, null, null, 12, null);
            } else {
                if (!(v2Var instanceof v2.a)) {
                    lc.u0.r();
                    return null;
                }
                v2.a aVar6 = (v2.a) v2Var;
                aVar = new v2.a(aVar6.f47383a, aVar6.f47384b, null, 4, null);
            }
            if (aVar instanceof v2.b) {
                return (mm1.b) ((v2.b) aVar).f47386a;
            }
            q2.u("Error fetching daily sleep data");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lkm1/c;", "<anonymous>", "(Lo82/a;)Lkm1/c;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.SleepReportsViewModel$detailsDataState$1", f = "SleepReportsViewModel.kt", l = {175}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<o82.a, t13.d<? super km1.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f160208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f160209b;

        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            e eVar = s.this.new e(dVar);
            eVar.f160209b = obj;
            return eVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super km1.c> dVar) {
            return ((e) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            Object objB;
            Object value;
            km1.a0 sleepNeed;
            o82.a aVar = (o82.a) this.f160209b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f160208a;
            s sVar = s.this;
            if (i14 == 0) {
                o13.r.b(obj);
                nm1.a aVar3 = sVar.f160181a;
                DateTime dateTimeK = vb.h.k(aVar.f130843a);
                this.f160209b = null;
                this.f160208a = 1;
                objB = aVar3.b(dateTimeK, this);
                if (objB == aVar2) {
                    return aVar2;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                objB = obj;
            }
            v2 v2Var = (v2) objB;
            if (!(v2Var instanceof v2.b)) {
                q2.u("Error fetching details sleep data");
                return null;
            }
            km1.c cVar = (km1.c) ((v2.b) v2Var).f47386a;
            km1.v dailySleep = cVar.getDailySleep();
            if (dailySleep != null && (sleepNeed = dailySleep.getSleepNeed()) != null) {
                long deviceId = sleepNeed.getDeviceId();
                t60.a aVar4 = s.f160180t;
                sVar.getClass();
                if (deviceId == -1) {
                    i2.a aVar5 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar5.getClass();
                    i2.a.f(a2Var, "SleepNavigationViewModel", "Invalid device ID unable to check if device is performance device.");
                }
                ge1.b.T(v1.a(sVar), null, null, new w(deviceId, sVar, null), 3);
            }
            Integer respirationVersion = cVar.getRespirationVersion();
            t60.a aVar6 = s.f160180t;
            sVar.getClass();
            if (respirationVersion != null) {
                int iIntValue = respirationVersion.intValue();
                Integer num = ((a0) sVar.f160188h.f150540a.getValue()).f160097m;
                if (iIntValue > (num != null ? num.intValue() : 0)) {
                    p2 p2Var = sVar.f160187g;
                    do {
                        value = p2Var.getValue();
                    } while (!p2Var.b(value, a0.a((a0) value, false, false, null, null, null, 0, null, false, false, false, false, false, respirationVersion, false, null, null, 258047)));
                }
            }
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Li41/e;", "<anonymous>", "(Lo82/a;)Li41/e;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.SleepReportsViewModel$hrvReportsDataState$1", f = "SleepReportsViewModel.kt", l = {238}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.p<o82.a, t13.d<? super i41.e>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f160211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f160212b;

        public f(t13.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            f fVar = s.this.new f(dVar);
            fVar.f160212b = obj;
            return fVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super i41.e> dVar) {
            return ((f) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            o82.a aVar = (o82.a) this.f160212b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f160211a;
            if (i14 == 0) {
                o13.r.b(obj);
                b63.o oVar = aVar.f130843a;
                b63.o oVar2 = aVar.f130844b;
                pm1.f fVar = s.this.f160183c;
                this.f160212b = null;
                this.f160211a = 1;
                obj = fVar.g(oVar, oVar2, this);
                if (obj == aVar2) {
                    return aVar2;
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
                return (i41.e) ((v2.b) v2Var).f47386a;
            }
            q2.u("Error fetching daily hrv data");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv60/a;", "<unused var>", "product", "<anonymous>", "(Lv60/a;Lv60/a;)Lv60/a;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.SleepReportsViewModel$indexArmbandBanner$1", f = "SleepReportsViewModel.kt", l = {129}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements e23.q<v60.a, v60.a, t13.d<? super v60.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f160214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ v60.a f160215b;

        public g(t13.d<? super g> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(v60.a aVar, v60.a aVar2, t13.d<? super v60.a> dVar) {
            g gVar = s.this.new g(dVar);
            gVar.f160215b = aVar2;
            return gVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            v60.a aVar = this.f160215b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f160214a;
            if (i14 == 0) {
                o13.r.b(obj);
                pm1.a aVar3 = s.this.f160184d;
                this.f160215b = aVar;
                this.f160214a = 1;
                obj = aVar3.b(this);
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            sn1.b.f160414a.getClass();
            bv.b.f21239a.getClass();
            bv.b.a();
            return (aVar.f175792a && !zBooleanValue && k1.f37122a.O0()) ? new v60.a(true, aVar.f175793b) : new v60.a(false, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lv60/a;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.SleepReportsViewModel$indexArmbandBanner$2", f = "SleepReportsViewModel.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS}, m = "invokeSuspend", v = 2)
    public static final class h extends v13.i implements e23.p<r53.j<? super v60.a>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f160217a;

        public h(t13.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return s.this.new h(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super v60.a> jVar, t13.d<? super Unit> dVar) {
            return ((h) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f160217a;
            if (i14 == 0) {
                o13.r.b(obj);
                t60.h hVar = s.this.f160185e;
                t60.a aVar2 = s.f160180t;
                this.f160217a = 1;
                if (hVar.b(aVar2, this) == aVar) {
                    return aVar;
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lir0/e;", "<anonymous>", "(Lo82/a;)Lir0/e;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.SleepReportsViewModel$intensityMinutesReportsDataState$1", f = "SleepReportsViewModel.kt", l = {TsExtractor.TS_STREAM_TYPE_AIT}, m = "invokeSuspend", v = 2)
    public static final class i extends v13.i implements e23.p<o82.a, t13.d<? super ir0.e>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f160219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f160220b;

        public i(t13.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            i iVar = s.this.new i(dVar);
            iVar.f160220b = obj;
            return iVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super ir0.e> dVar) {
            return ((i) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            o82.a aVar = (o82.a) this.f160220b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f160219a;
            if (i14 == 0) {
                o13.r.b(obj);
                DateTime dateTimeAtStartOfDay = g22.l.h(aVar.f130843a).toDateTimeAtStartOfDay();
                DateTime dateTimeAtStartOfDay2 = g22.l.h(aVar.f130844b).toDateTimeAtStartOfDay();
                pm1.f fVar = s.this.f160183c;
                dateTimeAtStartOfDay.getClass();
                dateTimeAtStartOfDay2.getClass();
                this.f160220b = null;
                this.f160219a = 1;
                obj = fVar.h(dateTimeAtStartOfDay, dateTimeAtStartOfDay2, this);
                if (obj == aVar2) {
                    return aVar2;
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
                return new ir0.e((List) ((v2.b) v2Var).f47386a, true);
            }
            q2.u("Error fetching details sleep data");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.SleepReportsViewModel$showManagePrimaryDeviceInHelp$1", f = "SleepReportsViewModel.kt", l = {356, 356}, m = "invokeSuspend", v = 2)
    public static final class j extends v13.i implements e23.p<r53.j<? super Boolean>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public r53.j f160222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f160223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f160224c;

        public j(t13.d<? super j> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            j jVar = s.this.new j(dVar);
            jVar.f160224c = obj;
            return jVar;
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super Boolean> jVar, t13.d<? super Unit> dVar) {
            return ((j) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            r53.j jVar = (r53.j) this.f160224c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f160223b;
            if (i14 != 0) {
                if (i14 == 1) {
                    jVar = this.f160222a;
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            pm1.f fVar = s.this.f160183c;
            this.f160224c = null;
            this.f160222a = jVar;
            this.f160223b = 1;
            obj = fVar.f(this);
            if (obj != aVar) {
            }
            return aVar;
            this.f160224c = null;
            this.f160222a = null;
            this.f160223b = 2;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class k implements r53.i<v60.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f160226a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f160227a;

            /* JADX INFO: renamed from: sm1.s$k$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.SleepReportsViewModel$special$$inlined$map$1$2", f = "SleepReportsViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C3028a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f160228a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f160229b;

                public C3028a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f160228a = obj;
                    this.f160229b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f160227a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C3028a c3028a;
                v60.a aVar;
                if (dVar instanceof C3028a) {
                    c3028a = (C3028a) dVar;
                    int i14 = c3028a.f160229b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c3028a.f160229b = i14 - Integer.MIN_VALUE;
                    } else {
                        c3028a = new C3028a(dVar);
                    }
                } else {
                    c3028a = new C3028a(dVar);
                }
                Object obj2 = c3028a.f160228a;
                u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
                int i15 = c3028a.f160229b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    g3 g3Var = (g3) obj;
                    int i16 = b.f160199a[g3Var.f35300a.ordinal()];
                    if (i16 == 1) {
                        aVar = (v60.a) g3Var.f35301b;
                        if (aVar == null) {
                            aVar = new v60.a(false, null);
                        }
                    } else if (i16 != 2) {
                        aVar = new v60.a(false, null);
                    } else {
                        i2.a aVar3 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        Exception exc = g3Var.f35303d;
                        aVar3.getClass();
                        i2.a.g(a2Var, "SleepCrossSellingItem", exc);
                        aVar = new v60.a(false, null);
                    }
                    c3028a.f160229b = 1;
                    if (this.f160227a.emit(aVar, c3028a) == aVar2) {
                        return aVar2;
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

        public k(r53.i iVar) {
            this.f160226a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super v60.a> jVar, t13.d dVar) {
            Object objCollect = this.f160226a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.SleepReportsViewModel$updateNotes$1", f = "SleepReportsViewModel.kt", l = {384, 386}, m = "invokeSuspend", v = 2)
    public static final class l extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f160231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f160232b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ s f160233c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ DateTime f160234d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, s sVar, DateTime dateTime, t13.d<? super l> dVar) {
            super(2, dVar);
            this.f160232b = str;
            this.f160233c = sVar;
            this.f160234d = dateTime;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new l(this.f160232b, this.f160233c, this.f160234d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
        
            if (r7 == r0) goto L24;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Exception {
            v2 v2Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f160231a;
            DateTime dateTime = this.f160234d;
            s sVar = this.f160233c;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    String str = this.f160232b;
                    if (str == null || str.length() == 0) {
                        nm1.a aVar2 = sVar.f160181a;
                        this.f160231a = 2;
                        obj = aVar2.h(dateTime, this);
                    } else {
                        nm1.a aVar3 = sVar.f160181a;
                        this.f160231a = 1;
                        obj = aVar3.k(dateTime, str, this);
                        if (obj == aVar) {
                        }
                        v2Var = (v2) obj;
                    }
                    return aVar;
                }
                if (i14 == 1) {
                    o13.r.b(obj);
                    v2Var = (v2) obj;
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                    v2Var = (v2) obj;
                }
                if (v2Var instanceof v2.b) {
                    sVar.f160192l.i(new o82.a(g22.k.z(dateTime).b(), null, 2, null), true);
                }
                return Unit.INSTANCE;
            } catch (Throwable unused) {
                q2.u("Error updating user sleep notes");
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lmm1/f;", "<anonymous>", "(Lo82/a;)Lmm1/f;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.SleepReportsViewModel$weeklyReportsDataState$1", f = "SleepReportsViewModel.kt", l = {217}, m = "invokeSuspend", v = 2)
    public static final class m extends v13.i implements e23.p<o82.a, t13.d<? super mm1.f>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public DateTime f160235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public DateTime f160236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f160237c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f160238d;

        public m(t13.d<? super m> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            m mVar = s.this.new m(dVar);
            mVar.f160238d = obj;
            return mVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super mm1.f> dVar) {
            return ((m) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            DateTime dateTimeAtStartOfDay;
            Object objF;
            DateTime dateTime;
            v2 aVar;
            o82.a aVar2 = (o82.a) this.f160238d;
            u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f160237c;
            s sVar = s.this;
            if (i14 == 0) {
                o13.r.b(obj);
                DateTime dateTimeAtStartOfDay2 = g22.l.h(aVar2.f130843a).toDateTimeAtStartOfDay();
                dateTimeAtStartOfDay = g22.l.h(aVar2.f130844b).toDateTimeAtStartOfDay();
                int weeks = Weeks.weeksBetween(dateTimeAtStartOfDay2, dateTimeAtStartOfDay).getWeeks() + 1;
                nm1.a aVar4 = sVar.f160181a;
                dateTimeAtStartOfDay.getClass();
                this.f160238d = null;
                this.f160235a = dateTimeAtStartOfDay2;
                this.f160236b = dateTimeAtStartOfDay;
                this.f160237c = 1;
                objF = aVar4.f(dateTimeAtStartOfDay, weeks, this);
                if (objF == aVar3) {
                    return aVar3;
                }
                dateTime = dateTimeAtStartOfDay2;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dateTimeAtStartOfDay = this.f160236b;
                DateTime dateTime2 = this.f160235a;
                o13.r.b(obj);
                objF = obj;
                dateTime = dateTime2;
            }
            DateTime dateTime3 = dateTimeAtStartOfDay;
            v2 v2Var = (v2) objF;
            dateTime.getClass();
            dateTime3.getClass();
            t60.a aVar5 = s.f160180t;
            sVar.getClass();
            if (v2Var instanceof v2.b) {
                TreeMap treeMap = new TreeMap();
                u0.k(treeMap, new o13.p[0]);
                v2.b bVar = (v2.b) v2Var;
                int i15 = bVar.f47387b;
                mm1.f fVar = i15 == 200 ? (mm1.f) bVar.f47386a : new mm1.f(j0.f134944a, null, 2, null);
                new e32.d(null, 1, null).a(dateTime, dateTime3, treeMap, 7, new d0(fVar.b(), 23));
                Collection collectionValues = treeMap.values();
                collectionValues.getClass();
                aVar = new v2.b(mm1.f.a(fVar, h0.b1(collectionValues)), i15, null, null, 12, null);
            } else {
                if (!(v2Var instanceof v2.a)) {
                    lc.u0.r();
                    return null;
                }
                v2.a aVar6 = (v2.a) v2Var;
                aVar = new v2.a(aVar6.f47383a, aVar6.f47384b, null, 4, null);
            }
            if (aVar instanceof v2.b) {
                return (mm1.f) ((v2.b) aVar).f47386a;
            }
            q2.u("Error fetching weekly sleep data");
            return null;
        }
    }

    static {
        new a(null);
        f160180t = t60.a.SLEEP_BAND_BANNER;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x012b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0157  */
    /* JADX WARN: Multi-variable type inference failed */
    public s(nm1.a aVar, pm1.g gVar, pm1.f fVar, pm1.a aVar2, t60.h hVar) {
        boolean z14;
        boolean z15;
        aVar.getClass();
        gVar.getClass();
        fVar.getClass();
        aVar2.getClass();
        hVar.getClass();
        this.f160181a = aVar;
        this.f160182b = gVar;
        this.f160183c = fVar;
        this.f160184d = aVar2;
        this.f160185e = hVar;
        this.f160186f = new tf0.i(v1.a(this), null, 2, null);
        p2 p2VarA = r53.q2.a(new a0(false, false, null, null, null, 0, gVar.a(), false, false, false, false, false, null, false, null, false, false, null, 262079, null));
        this.f160187g = p2VarA;
        this.f160188h = r53.s.d(p2VarA);
        c2 c2VarN = p0.n(null);
        this.f160189i = c2VarN;
        this.f160190j = c2VarN;
        boolean z16 = false;
        r53.v vVar = new r53.v(new h(null), new r53.u1(r53.q2.a(new v60.a(false, null)), new k(androidx.lifecycle.v.a(hVar.getF162729b())), new g(null)));
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        m2 m2Var = k2.a.f150706c;
        this.f160191k = r53.s.K(vVar, aVarA, m2Var, new v60.a(false, null));
        C4(!gVar.h() ? 1 : 0);
        e12.b historicalDeviceBasedIndicators = bo1.a.a().c().getHistoricalDeviceBasedIndicators();
        boolean zG = historicalDeviceBasedIndicators != null ? p005kotlin.jvm.internal.s.g(historicalDeviceBasedIndicators.getHasSleepTimeCapableDevice(), Boolean.TRUE) : false;
        sn1.b.f160414a.getClass();
        Object[] objArr = sn1.b.e() && zG;
        Object[] objArr2 = gVar.m() && !objArr == true;
        Object[] objArr3 = gVar.d() && !objArr == true;
        if (objArr2 != false) {
            if (sn1.b.d()) {
                bv.b.f21239a.getClass();
                bv.b.a();
                k1 k1Var = k1.f37122a;
                k1Var.getClass();
                if (bo1.a.a().c().y()) {
                    bv.b.a();
                    z15 = k1Var.e0() ? false : z15;
                }
                z15 = true;
            }
            G4(z15);
        }
        if (objArr3 != false) {
            bv.b.f21239a.getClass();
            bv.b.a();
            k1 k1Var2 = k1.f37122a;
            k1Var2.getClass();
            if (bo1.a.a().c().y()) {
                bv.b.a();
                if (k1Var2.e0()) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            } else {
                z14 = false;
            }
            E4(z14);
        }
        F4(sn1.b.d() && gVar.k());
        if (sn1.b.g() && gVar.b()) {
            z16 = true;
        }
        H4(z16);
        this.f160192l = new u82.a(v1.a(this), new y82.e(new y82.c(new e(null)), null, 2, null), false, 4, null);
        this.f160193m = new u82.a(v1.a(this), new y82.e(new y82.c(new d(null)), null, 2, null), false, 4, null);
        this.f160194n = new u82.a(v1.a(this), new y82.e(new y82.c(new m(null)), null, 2, null), false, 4, null);
        this.f160195o = new u82.a(v1.a(this), new y82.e(new y82.c(new f(null)), null, 2, null), false, 4, null);
        this.f160196p = new u82.a(v1.a(this), new y82.e(new y82.c(new i(null)), null, 2, null), false, 4, null);
        this.f160197q = new u82.a(v1.a(this), new y82.e(new y82.c(new c(null)), null, 2, null), false, 4, null);
        this.f160198r = r53.s.K(r53.s.A(new r53.c2(new j(null)), x53.b.f189152a), v1.a(this), m2Var, Boolean.FALSE);
    }

    public final void A4(boolean z14) {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f160187g;
            value = p2Var.getValue();
        } while (!p2Var.b(value, a0.a((a0) value, false, false, null, null, null, 0, null, false, false, false, false, false, null, z14, null, null, 253951)));
    }

    public final void B4(rl1.i iVar) {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f160187g;
            value = p2Var.getValue();
        } while (!p2Var.b(value, a0.a((a0) value, false, false, null, null, null, 0, iVar, false, false, false, false, false, null, false, null, null, 262079)));
        this.f160182b.f(iVar);
    }

    public final void C4(int i14) {
        p2 p2Var;
        Object value;
        this.f160182b.n(i14 == 0);
        do {
            p2Var = this.f160187g;
            value = p2Var.getValue();
        } while (!p2Var.b(value, a0.a((a0) value, false, false, null, null, null, i14, null, false, false, false, false, false, null, false, null, null, 262111)));
    }

    public final void D4(en1.c cVar) {
        p2 p2Var;
        Object value;
        if (cVar != null) {
            do {
                p2Var = this.f160187g;
                value = p2Var.getValue();
            } while (!p2Var.b(value, a0.a((a0) value, false, false, null, null, cVar, 0, null, false, false, false, false, false, null, false, null, null, 262127)));
        }
    }

    public final void E4(boolean z14) {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f160187g;
            value = p2Var.getValue();
        } while (!p2Var.b(value, a0.a((a0) value, false, false, null, null, null, 0, null, false, false, z14, false, false, null, false, null, null, 261631)));
    }

    public final void F4(boolean z14) {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f160187g;
            value = p2Var.getValue();
        } while (!p2Var.b(value, a0.a((a0) value, false, false, null, null, null, 0, null, false, false, false, z14, false, null, false, null, null, 261119)));
        this.f160182b.c(z14);
    }

    public final void G4(boolean z14) {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f160187g;
            value = p2Var.getValue();
        } while (!p2Var.b(value, a0.a((a0) value, false, false, null, null, null, 0, null, false, z14, false, false, false, null, false, null, null, 261887)));
    }

    public final void H4(boolean z14) {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f160187g;
            value = p2Var.getValue();
        } while (!p2Var.b(value, a0.a((a0) value, false, false, null, null, null, 0, null, false, false, false, false, z14, null, false, null, null, 260095)));
        this.f160182b.e(z14);
    }

    public final void I4(String str, DateTime dateTime) {
        if (dateTime != null) {
            ge1.b.T(v1.a(this), null, null, new l(str, this, dateTime, null), 3);
        }
    }

    public final void x4(boolean z14) {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f160187g;
            value = p2Var.getValue();
        } while (!p2Var.b(value, a0.a((a0) value, false, z14, null, null, null, 0, null, false, false, false, false, false, null, false, null, null, 262141)));
    }

    public final void y4(boolean z14) {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f160187g;
            value = p2Var.getValue();
        } while (!p2Var.b(value, a0.a((a0) value, false, false, null, null, null, 0, null, z14, false, false, false, false, null, false, null, null, 262015)));
    }

    public final void z4(boolean z14) {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f160187g;
            value = p2Var.getValue();
        } while (!p2Var.b(value, a0.a((a0) value, z14, false, null, null, null, 0, null, false, false, false, false, false, null, false, null, null, 262142)));
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lsm1/s$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "CROSS_SELLING_ITEM_TAG", "Lt60/a;", "SLEEP_BAND_BANNER", "Lt60/a;", "", "DAYS_DELTA_DAILY", "I", "DAYS_DELTA_WEEKLY", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
