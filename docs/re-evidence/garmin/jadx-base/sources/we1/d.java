package we1;

import androidx.lifecycle.t1;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.w0;
import b63.o;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import e23.p;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.b0;
import o70.t;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.y;
import p3.c2;
import p3.p0;
import qe1.j;
import qe1.k;
import r1.q2;
import r53.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lwe1/d;", "Landroidx/lifecycle/u1;", "Lre1/a;", "runningEconomyRepository", "Lt60/h;", "crossSellingPreferences", "Ltc0/a;", "sensorsRepository", "<init>", "(Lre1/a;Lt60/h;Ltc0/a;)V", "d", "gcm-running-economy_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends u1 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final t60.a f184775p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final re1.a f184776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t60.h f184777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tc0.a f184778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f184779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c2 f184780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c2 f184781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c2 f184782g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c2 f184783h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c2 f184784i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c2 f184785j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f184786k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u82.a f184787l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u82.a f184788m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u82.a f184789n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final w0 f184790o;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.running_economy.presentation.RunningEconomyViewModel$1", f = "RunningEconomyViewModel.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f184791a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0047  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Integer num;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f184791a;
            d dVar = d.this;
            boolean z14 = true;
            if (i14 == 0) {
                r.b(obj);
                this.f184791a = 1;
                obj = dVar.f184776a.c(dVar.f184779d, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            c2 c2Var = dVar.f184780e;
            if (v2Var instanceof v2.b) {
                T t7 = ((v2.b) v2Var).f47386a;
                if (!(t7 instanceof qe1.g) || ((num = ((qe1.g) t7).getCom.google.firebase.analytics.FirebaseAnalytics.Param.SCORE java.lang.String()) != null && num.intValue() == 0)) {
                    z14 = false;
                }
            } else {
                z14 = false;
            }
            c2Var.setValue(Boolean.valueOf(z14));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.running_economy.presentation.RunningEconomyViewModel$2", f = "RunningEconomyViewModel.kt", l = {154}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f184793a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f184793a;
            if (i14 == 0) {
                r.b(obj);
                t60.a aVar2 = d.f184775p;
                d dVar = d.this;
                dVar.getClass();
                ge1.b.T(v1.a(dVar), null, null, new we1.e(dVar, null), 3);
                t60.h hVar = dVar.f184777b;
                t60.a aVar3 = d.f184775p;
                this.f184793a = 1;
                if (hVar.b(aVar3, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.running_economy.presentation.RunningEconomyViewModel$3", f = "RunningEconomyViewModel.kt", l = {158}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f184795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f184796b;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = d.this.new c(dVar);
            cVar.f184796b = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.f184796b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f184795a;
            d dVar = d.this;
            if (i14 == 0) {
                r.b(obj);
                this.f184796b = b0Var;
                this.f184795a = 1;
                obj = dVar.f184776a.d(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                c2 c2Var = dVar.f184782g;
                T t7 = ((v2.b) v2Var).f47386a;
                c2Var.setValue(t7);
                cf1.c.f27020a.getClass();
                cf1.c.f27021b = (qe1.i) t7;
            } else {
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var, "RunningEconomyViewModel", "Error fetching running economy ranges data");
            }
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f184798a;

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
            f184798a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", "<unused var>", "Lve1/c;", "<anonymous>", "(Lo82/a;)Lve1/c;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.running_economy.presentation.RunningEconomyViewModel$currentReportsDataState$1", f = "RunningEconomyViewModel.kt", l = {85}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements p<o82.a, t13.d<? super ve1.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f184799a;

        public f(t13.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new f(dVar);
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super ve1.c> dVar) {
            return ((f) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f184799a;
            if (i14 == 0) {
                r.b(obj);
                this.f184799a = 1;
                d dVar = d.this;
                obj = dVar.f184776a.c(dVar.f184779d, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                qe1.g gVar = (qe1.g) ((v2.b) v2Var).f47386a;
                return new ve1.c(gVar != null ? gVar.getCalendarDate() : null, gVar != null ? gVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.SCORE java.lang.String() : null, gVar != null ? gVar.getClassification() : null);
            }
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "RunningEconomyViewModel", "Error fetching running economy weekly data");
            q2.u("Error fetching running economy current data");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "", "Lve1/b;", "<anonymous>", "(Lo82/a;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.running_economy.presentation.RunningEconomyViewModel$dailyReportsDataState$1", f = "RunningEconomyViewModel.kt", l = {100}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements p<o82.a, t13.d<? super List<? extends ve1.b>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f184801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f184802b;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t7, T t14) {
                return r13.a.b(((ve1.b) t7).f177670a, ((ve1.b) t14).f177670a);
            }
        }

        public g(t13.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            g gVar = d.this.new g(dVar);
            gVar.f184802b = obj;
            return gVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super List<? extends ve1.b>> dVar) {
            return ((g) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            o82.a aVar = (o82.a) this.f184802b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f184801a;
            if (i14 == 0) {
                r.b(obj);
                o oVar = aVar.f130843a;
                o oVar2 = aVar.f130844b;
                this.f184802b = null;
                this.f184801a = 1;
                obj = d.this.f184776a.f(oVar, oVar2, this);
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (!(v2Var instanceof v2.b)) {
                i2.a aVar3 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var, "RunningEconomyViewModel", "Error fetching running economy weekly data");
                q2.u("Error fetching running economy weekly data");
                return null;
            }
            Iterable<qe1.h> iterable = (Iterable) ((v2.b) v2Var).f47386a;
            ArrayList arrayList = new ArrayList(y.r(iterable, 10));
            for (qe1.h hVar : iterable) {
                arrayList.add(new ve1.b(hVar != null ? hVar.getCalendarDate() : null, hVar != null ? hVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.SCORE java.lang.String() : null, hVar != null ? hVar.getClassification() : null));
            }
            return h0.N0(arrayList, new a());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "", "Lqe1/k;", "<anonymous>", "(Lo82/a;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.running_economy.presentation.RunningEconomyViewModel$weeklyReportsDataState$1", f = "RunningEconomyViewModel.kt", l = {120}, m = "invokeSuspend", v = 2)
    public static final class h extends v13.i implements p<o82.a, t13.d<? super List<? extends k>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f184804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f184805b;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t7, T t14) {
                return r13.a.b(((k) t7).f144559b, ((k) t14).f144559b);
            }
        }

        public h(t13.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            h hVar = d.this.new h(dVar);
            hVar.f184805b = obj;
            return hVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super List<? extends k>> dVar) {
            return ((h) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            o82.a aVar = (o82.a) this.f184805b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f184804a;
            if (i14 == 0) {
                r.b(obj);
                o oVar = aVar.f130843a;
                o oVar2 = aVar.f130844b;
                this.f184805b = null;
                this.f184804a = 1;
                obj = d.this.f184776a.b(oVar, oVar2, this);
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (!(v2Var instanceof v2.b)) {
                i2.a aVar3 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var, "RunningEconomyViewModel", "Error fetching running economy weekly data");
                q2.u("Error fetching running economy weekly data");
                return null;
            }
            Iterable<j> iterable = (Iterable) ((v2.b) v2Var).f47386a;
            ArrayList arrayList = new ArrayList(y.r(iterable, 10));
            for (j jVar : iterable) {
                arrayList.add(new k(jVar != null ? jVar.getStartDate() : null, jVar != null ? jVar.getEndDate() : null, jVar != null ? jVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.SCORE java.lang.String() : null, jVar != null ? jVar.getClassification() : null));
            }
            return h0.N0(arrayList, new a());
        }
    }

    static {
        new C3421d(null);
        f184775p = t60.a.HERMES_BANNER;
    }

    public d(re1.a aVar, t60.h hVar, tc0.a aVar2) {
        aVar.getClass();
        hVar.getClass();
        aVar2.getClass();
        this.f184776a = aVar;
        this.f184777b = hVar;
        this.f184778c = aVar2;
        this.f184779d = ((we1.c) s.d(r53.q2.a(new we1.c(false, null, null, 7, null))).f150540a.getValue()).f184774c;
        Boolean bool = Boolean.FALSE;
        this.f184780e = p0.n(bool);
        this.f184781f = p0.n(bool);
        c2 c2VarN = p0.n(null);
        this.f184782g = c2VarN;
        this.f184783h = c2VarN;
        c2 c2VarN2 = p0.n(bool);
        this.f184784i = c2VarN2;
        this.f184785j = c2VarN2;
        String strE = ((c22.k) KoinJavaComponent.get$default(c22.k.class, null, null, 6, null)).e("running_economy_upsell_device_name");
        this.f184786k = strE == null ? "Hermes" : strE;
        this.f184787l = new u82.a(v1.a(this), new y82.e(new y82.c(new f(null)), null, 2, null), false, 4, null);
        this.f184788m = new u82.a(v1.a(this), new y82.e(new y82.c(new g(null)), null, 2, null), false, 4, null);
        this.f184789n = new u82.a(v1.a(this), new y82.e(new y82.c(new h(null)), null, 2, null), false, 4, null);
        ge1.b.T(v1.a(this), null, null, new a(null), 3);
        ge1.b.T(v1.a(this), null, null, new we1.h(this, null), 3);
        ge1.b.T(v1.a(this), null, null, new b(null), 3);
        ge1.b.T(v1.a(this), null, null, new c(null), 3);
        this.f184790o = t1.a(hVar.getF162729b(), new w40.d(23));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object x4(d dVar, v13.c cVar) {
        we1.f fVar;
        j70.c dailyStatsConfig;
        List<j70.b> listG;
        dVar.getClass();
        if (cVar instanceof we1.f) {
            fVar = (we1.f) cVar;
            int i14 = fVar.f184815c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f184815c = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new we1.f(dVar, cVar);
            }
        } else {
            fVar = new we1.f(dVar, cVar);
        }
        Object objY = fVar.f184813a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f184815c;
        boolean z14 = true;
        if (i15 == 0) {
            r.b(objY);
            r53.i<j70.f> iVarP = ((l0) KoinJavaComponent.get$default(l0.class, null, null, 6, null)).p();
            fVar.f184815c = 1;
            objY = s.y(iVarP, fVar);
            if (objY == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objY);
        }
        j70.f fVar2 = (j70.f) objY;
        if (fVar2 == null || (dailyStatsConfig = fVar2.getDailyStatsConfig()) == null || (listG = dailyStatsConfig.g()) == null || listG.isEmpty()) {
            z14 = false;
        } else {
            Iterator<T> it = listG.iterator();
            while (it.hasNext()) {
                if (p005kotlin.jvm.internal.s.g(((j70.b) it.next()).getCardType(), t.f130079x.f130082a)) {
                }
            }
            z14 = false;
        }
        return Boolean.valueOf(z14);
    }

    /* JADX INFO: renamed from: we1.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lwe1/d$d;", "", "<init>", "()V", "", "PRODUCT_TITLE", "Ljava/lang/String;", "PREFERENCES_KEY", "PREFERENCES_KEY_VALUE", "Lt60/a;", "HERMES_BANNER", "Lt60/a;", "CROSS_SELLING_ITEM_TAG", "HERMES_PRODUCT_ID", "TAG", "gcm-running-economy_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3421d {
        public /* synthetic */ C3421d(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C3421d() {
        }
    }
}
