package vu1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.e3;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.performance.model.CurrentTrainingStatusDTO;
import com.garmin.android.apps.connectmobile.performance.model.TrainingStatusDeviceDTO;
import com.garmin.android.apps.connectmobile.performance.model.TrainingStatusReportDTO;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.mlkit.common.MlKitException;
import java.util.List;
import java.util.Map;
import jv1.e0;
import o53.b0;
import o53.i0;
import o53.j0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTBaseDashboardAndScheduleViewModel$getFBTPlan$1", f = "FBTBaseDashboardAndScheduleViewModel.kt", l = {162, 167, 168, 169, 170, 171, 217, 237, 243, 247, 269, 286, MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE, 321, 339, 402, 403}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {
    public h61.a A;
    public Long B;
    public ps.r C;
    public List D;
    public e0 E;
    public List F;
    public int H0;
    public List I;
    public int I0;
    public /* synthetic */ Object J0;
    public final /* synthetic */ vu1.c K0;
    public final /* synthetic */ long L0;
    public List P;
    public List T;
    public Object X;
    public j0 Y;
    public Object Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j0 f180269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i0 f180270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i0 f180271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i0 f180272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i0 f180273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i0 f180274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i0 f180275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v2 f180276h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public v2 f180277i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public v2 f180278j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public v2 f180279k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f180280k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public v2 f180281l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public oz1.b f180282m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CurrentTrainingStatusDTO f180283n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TrainingStatusReportDTO f180284o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TrainingStatusDeviceDTO f180285p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List f180286q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public i71.w f180287r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public o61.q f180288t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public tw1.m f180289v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public fg0.k f180290w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f180291x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Map f180292y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public List f180293z;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lps/m;", "<anonymous>", "(Lo53/b0;)Lps/m;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTBaseDashboardAndScheduleViewModel$getFBTPlan$1$2$1", f = "FBTBaseDashboardAndScheduleViewModel.kt", l = {329}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super ps.m>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f180294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ vu1.c f180295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ActivityListItemDTO f180296c;

        /* JADX INFO: renamed from: vu1.f$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lps/m;", "<anonymous>", "(Lo53/b0;)Lps/m;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTBaseDashboardAndScheduleViewModel$getFBTPlan$1$2$1$1", f = "FBTBaseDashboardAndScheduleViewModel.kt", l = {331}, m = "invokeSuspend", v = 2)
        public static final class C3362a extends v13.i implements e23.p<b0, t13.d<? super ps.m>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f180297a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f180298b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ vu1.c f180299c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ ActivityListItemDTO f180300d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3362a(vu1.c cVar, ActivityListItemDTO activityListItemDTO, t13.d<? super C3362a> dVar) {
                super(2, dVar);
                this.f180299c = cVar;
                this.f180300d = activityListItemDTO;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C3362a c3362a = new C3362a(this.f180299c, this.f180300d, dVar);
                c3362a.f180298b = obj;
                return c3362a;
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super ps.m> dVar) {
                return ((C3362a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                b0 b0Var = (b0) this.f180298b;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f180297a;
                try {
                    if (i14 == 0) {
                        o13.r.b(obj);
                        kv1.b bVar = this.f180299c.I;
                        long j8 = this.f180300d.f29250b;
                        this.f180298b = b0Var;
                        this.f180297a = 1;
                        obj = bVar.a(j8, this);
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
                    return (ps.m) obj;
                } catch (Exception unused) {
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.f(a2Var, "FBTBaseDashboardAndScheduleViewModel", "Failed to get activity polyline");
                    return null;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(vu1.c cVar, ActivityListItemDTO activityListItemDTO, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f180295b = cVar;
            this.f180296c = activityListItemDTO;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f180295b, this.f180296c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super ps.m> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f180294a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            C3362a c3362a = new C3362a(this.f180295b, this.f180296c, null);
            this.f180294a = 1;
            Object objY = ge1.b.Y(c3362a, this);
            return objY == aVar ? aVar : objY;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lav1/c;", "<anonymous>", "(Lo53/b0;)Lav1/c;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTBaseDashboardAndScheduleViewModel$getFBTPlan$1$bodyBatteryResult$1", f = "FBTBaseDashboardAndScheduleViewModel.kt", l = {397}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super av1.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f180301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ vu1.c f180302b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(vu1.c cVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f180302b = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f180302b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super av1.c> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f180301a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            e3 e3Var = (e3) this.f180302b.Z.getValue();
            this.f180301a = 1;
            Object objC = e3Var.c(this);
            return objC == aVar ? aVar : objC;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lps/r;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTBaseDashboardAndScheduleViewModel$getFBTPlan$1$childCalls$1$1", f = "FBTBaseDashboardAndScheduleViewModel.kt", l = {284}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<b0, t13.d<? super v2<? extends ps.r>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f180303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ vu1.c f180304b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f180305c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(vu1.c cVar, long j8, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f180304b = cVar;
            this.f180305c = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f180304b, this.f180305c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends ps.r>> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f180303a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            hg0.b bVarB4 = this.f180304b.B4();
            this.f180303a = 1;
            bVarB4.getClass();
            Object objJ = f0.J(bVarB4, new hg0.e(bVarB4, this.f180305c, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lzz1/d;", "<anonymous>", "(Lo53/b0;)Lzz1/d;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTBaseDashboardAndScheduleViewModel$getFBTPlan$1$intensityMinutesResult$1", f = "FBTBaseDashboardAndScheduleViewModel.kt", l = {390}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<b0, t13.d<? super zz1.d>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f180306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ vu1.c f180307b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(vu1.c cVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f180307b = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f180307b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super zz1.d> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f180306a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            e3 e3Var = (e3) this.f180307b.Z.getValue();
            this.f180306a = 1;
            Object objD = e3Var.d(this);
            return objD == aVar ? aVar : objD;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ltw1/m;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTBaseDashboardAndScheduleViewModel$getFBTPlan$1$trainingPlanAsync$1", f = "FBTBaseDashboardAndScheduleViewModel.kt", l = {128}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<b0, t13.d<? super v2<? extends tw1.m>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f180308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ vu1.c f180309b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f180310c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(vu1.c cVar, long j8, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f180309b = cVar;
            this.f180310c = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f180309b, this.f180310c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends tw1.m>> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f180308a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            kv1.b bVar = this.f180309b.I;
            this.f180308a = 1;
            Object objC = bVar.c(this.f180310c, this);
            return objC == aVar ? aVar : objC;
        }
    }

    /* JADX INFO: renamed from: vu1.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lav1/h;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTBaseDashboardAndScheduleViewModel$getFBTPlan$1$trainingPlanPremiumContentAsync$1", f = "FBTBaseDashboardAndScheduleViewModel.kt", l = {158}, m = "invokeSuspend", v = 2)
    public static final class C3363f extends v13.i implements e23.p<b0, t13.d<? super v2<? extends List<? extends av1.h>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f180311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ vu1.c f180312b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f180313c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3363f(vu1.c cVar, long j8, t13.d<? super C3363f> dVar) {
            super(2, dVar);
            this.f180312b = cVar;
            this.f180313c = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C3363f(this.f180312b, this.f180313c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends av1.h>>> dVar) {
            return ((C3363f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f180311a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            kv1.b bVar = this.f180312b.I;
            this.f180311a = 1;
            bVar.getClass();
            Object objJ = f0.J(bVar, new kv1.n(bVar, this.f180313c, null, null, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Loz1/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTBaseDashboardAndScheduleViewModel$getFBTPlan$1$trainingReadinessAsync$1", f = "FBTBaseDashboardAndScheduleViewModel.kt", l = {TsExtractor.TS_STREAM_TYPE_E_AC3}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements e23.p<b0, t13.d<? super v2<? extends List<? extends oz1.b>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f180314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ vu1.c f180315b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(vu1.c cVar, t13.d<? super g> dVar) {
            super(2, dVar);
            this.f180315b = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new g(this.f180315b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends oz1.b>>> dVar) {
            return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f180314a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            kv1.b bVar = this.f180315b.I;
            this.f180314a = 1;
            Object objK = bVar.f106722c.k(this);
            return objK == aVar ? aVar : objK;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/performance/model/TrainingStatusReportDTO;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTBaseDashboardAndScheduleViewModel$getFBTPlan$1$trainingStatus4WeeksTSData$1", f = "FBTBaseDashboardAndScheduleViewModel.kt", l = {150}, m = "invokeSuspend", v = 2)
    public static final class h extends v13.i implements e23.p<b0, t13.d<? super v2<? extends TrainingStatusReportDTO>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f180316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ DateTime f180317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ vu1.c f180318c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(DateTime dateTime, vu1.c cVar, t13.d<? super h> dVar) {
            super(2, dVar);
            this.f180317b = dateTime;
            this.f180318c = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new h(this.f180317b, this.f180318c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends TrainingStatusReportDTO>> dVar) {
            return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f180316a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            DateTime dateTime = this.f180317b;
            String strB = c22.j0.b(dateTime, "yyyy-MM-dd", null);
            if (strB == null) {
                strB = "";
            }
            String strB2 = c22.j0.b(dateTime.minusWeeks(4).plusDays(1), "yyyy-MM-dd", null);
            String str = strB2 != null ? strB2 : "";
            s61.a aVar2 = this.f180318c.P;
            this.f180316a = 1;
            aVar2.getClass();
            Object objJ = f0.J(aVar2, new s61.f(aVar2, str, strB, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/performance/model/CurrentTrainingStatusDTO;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTBaseDashboardAndScheduleViewModel$getFBTPlan$1$trainingStatusCurrentTSData$1", f = "FBTBaseDashboardAndScheduleViewModel.kt", l = {143}, m = "invokeSuspend", v = 2)
    public static final class i extends v13.i implements e23.p<b0, t13.d<? super v2<? extends CurrentTrainingStatusDTO>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f180319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ vu1.c f180320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ DateTime f180321c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(vu1.c cVar, DateTime dateTime, t13.d<? super i> dVar) {
            super(2, dVar);
            this.f180320b = cVar;
            this.f180321c = dateTime;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new i(this.f180320b, this.f180321c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends CurrentTrainingStatusDTO>> dVar) {
            return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f180319a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            s61.a aVar2 = this.f180320b.P;
            String strB = c22.j0.b(this.f180321c, "yyyy-MM-dd", null);
            if (strB == null) {
                strB = "";
            }
            this.f180319a = 1;
            aVar2.getClass();
            Object objJ = f0.J(aVar2, new s61.b(aVar2, strB, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/performance/model/TrainingStatusDeviceDTO;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTBaseDashboardAndScheduleViewModel$getFBTPlan$1$tsLastDeviceUsed$1", f = "FBTBaseDashboardAndScheduleViewModel.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend", v = 2)
    public static final class j extends v13.i implements e23.p<b0, t13.d<? super v2<? extends TrainingStatusDeviceDTO>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f180322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ vu1.c f180323b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(vu1.c cVar, t13.d<? super j> dVar) {
            super(2, dVar);
            this.f180323b = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new j(this.f180323b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends TrainingStatusDeviceDTO>> dVar) {
            return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f180322a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            kv1.v vVar = (kv1.v) this.f180323b.X.getValue();
            this.f180322a = 1;
            vVar.getClass();
            Object objJ = f0.J(vVar, new kv1.w(vVar, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ljv1/e0;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTBaseDashboardAndScheduleViewModel$getFBTPlan$1$userSettings$1", f = "FBTBaseDashboardAndScheduleViewModel.kt", l = {123}, m = "invokeSuspend", v = 2)
    public static final class k extends v13.i implements e23.p<b0, t13.d<? super v2<? extends e0>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f180324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ vu1.c f180325b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(vu1.c cVar, t13.d<? super k> dVar) {
            super(2, dVar);
            this.f180325b = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new k(this.f180325b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends e0>> dVar) {
            return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f180324a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            kv1.y yVar = (kv1.y) this.f180325b.T.getValue();
            this.f180324a = 1;
            Object objA = yVar.a(this);
            return objA == aVar ? aVar : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(vu1.c cVar, long j8, t13.d<? super f> dVar) {
        super(2, dVar);
        this.K0 = cVar;
        this.L0 = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f fVar = new f(this.K0, this.L0, dVar);
        fVar.J0 = obj;
        return fVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:312:0x0c72  */
    /* JADX WARN: Code duplicated, block: B:314:0x0c7c  */
    /* JADX WARN: Code duplicated, block: B:316:0x0cfc  */
    /* JADX WARN: Code duplicated, block: B:317:0x0cff  */
    /* JADX WARN: Type inference failed for: r10v70 */
    /* JADX WARN: Type inference failed for: r10v71, types: [com.garmin.android.apps.connectmobile.performance.model.CurrentTrainingStatusDTO, com.garmin.android.apps.connectmobile.performance.model.TrainingStatusDeviceDTO, com.garmin.android.apps.connectmobile.performance.model.TrainingStatusReportDTO, com.garmin.android.apps.connectmobile.v2, java.lang.Long, java.lang.Object, java.util.List, o53.i0, o53.j0] */
    /* JADX WARN: Type inference failed for: r10v78 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17, types: [com.garmin.android.apps.connectmobile.performance.model.CurrentTrainingStatusDTO, com.garmin.android.apps.connectmobile.performance.model.TrainingStatusDeviceDTO, com.garmin.android.apps.connectmobile.performance.model.TrainingStatusReportDTO, com.garmin.android.apps.connectmobile.v2, java.lang.Long, o53.i0, o53.j0] */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v54, types: [com.garmin.android.apps.connectmobile.performance.model.CurrentTrainingStatusDTO, com.garmin.android.apps.connectmobile.performance.model.TrainingStatusDeviceDTO, com.garmin.android.apps.connectmobile.performance.model.TrainingStatusReportDTO, com.garmin.android.apps.connectmobile.v2, o53.i0, o53.j0] */
    /* JADX WARN: Type inference failed for: r6v60 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:317:0x0cff -> B:318:0x0d12). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r41) {
        /*
            Method dump skipped, instruction units count: 4520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vu1.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
