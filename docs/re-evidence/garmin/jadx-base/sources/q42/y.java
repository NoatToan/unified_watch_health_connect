package q42;

import androidx.lifecycle.t1;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.w0;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import lc.u0;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import r53.b2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lq42/y;", "Landroidx/lifecycle/u1;", "", "showWhatsNew", "Lm42/b;", "weightsRepository", "Lal0/a;", "goalsRepository", "Lk42/a;", "preferences", "<init>", "(ZLm42/b;Lal0/a;Lk42/a;)V", "b", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y extends u1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final t60.a f142744q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m42.b f142745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final al0.a f142746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k42.a f142747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t60.h f142748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f142749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f142750f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f142751g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f142752h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f142753i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2 f142754j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2 f142755k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b2 f142756l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w0 f142757m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u82.a f142758n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final u82.a f142759o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final u82.a f142760p;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.weighttracker.presentation.WeightReportsViewModel$1", f = "WeightReportsViewModel.kt", l = {89}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f142761a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return y.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f142761a;
            if (i14 == 0) {
                o13.r.b(obj);
                y yVar = y.this;
                yVar.getClass();
                ge1.b.T(v1.a(yVar), null, null, new b0(yVar, null), 3);
                t60.h hVar = yVar.f142748d;
                t60.a aVar2 = t60.a.INDEX_BANNER;
                this.f142761a = 1;
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

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f142763a;

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
            f142763a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lq42/g;", "<anonymous>", "(Lo82/a;)Lq42/g;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.weighttracker.presentation.WeightReportsViewModel$dailyReportsDataState$1", f = "WeightReportsViewModel.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS, 141}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o82.a, t13.d<? super q42.g>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b63.o f142764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b63.o f142765b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public zk0.g f142766c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f142767d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f142768e;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = y.this.new d(dVar);
            dVar2.f142768e = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super q42.g> dVar) {
            return ((d) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0088  */
        /* JADX WARN: Code duplicated, block: B:29:0x008c  */
        /* JADX WARN: Code duplicated, block: B:32:0x0099  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b63.o oVar;
            b63.o oVar2;
            zk0.g gVar;
            v2 v2Var;
            o82.a aVar = (o82.a) this.f142768e;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f142767d;
            y yVar = y.this;
            l42.k kVar = null;
            if (i14 == 0) {
                o13.r.b(obj);
                oVar = aVar.f130843a;
                oVar2 = aVar.f130844b;
                fz0.c cVarA = fz0.d.a(oVar);
                fz0.c cVarA2 = fz0.d.a(oVar2);
                al0.a aVar3 = yVar.f142746b;
                this.f142768e = null;
                this.f142764a = oVar;
                this.f142765b = oVar2;
                this.f142767d = 1;
                aVar3.getClass();
                obj = com.garmin.android.apps.connectmobile.f0.J(aVar3, new al0.e(aVar3, cVarA, cVarA2, null), this);
                if (obj != aVar2) {
                }
                return aVar2;
            }
            if (i14 == 1) {
                oVar2 = this.f142765b;
                oVar = this.f142764a;
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gVar = this.f142766c;
                o13.r.b(obj);
            }
            v2Var = (v2) obj;
            if (!(v2Var instanceof v2.a)) {
                if (v2Var instanceof v2.b) {
                    u0.r();
                    return null;
                }
                kVar = (l42.k) ((v2.b) v2Var).f47386a;
            }
            return new q42.g(kVar, gVar);
            v2 v2Var2 = (v2) obj;
            v2.b bVar = v2Var2 instanceof v2.b ? (v2.b) v2Var2 : null;
            zk0.g gVar2 = bVar != null ? (zk0.g) bVar.f47386a : null;
            m42.b bVar2 = yVar.f142745a;
            this.f142768e = null;
            this.f142764a = null;
            this.f142765b = null;
            this.f142766c = gVar2;
            this.f142767d = 2;
            bVar2.getClass();
            Object objJ = com.garmin.android.apps.connectmobile.f0.J(bVar2, new m42.i(oVar, oVar2, null), this);
            if (objJ != aVar2) {
                gVar = gVar2;
                obj = objJ;
                v2Var = (v2) obj;
                if (!(v2Var instanceof v2.a)) {
                    if (v2Var instanceof v2.b) {
                        u0.r();
                        return null;
                    }
                    kVar = (l42.k) ((v2.b) v2Var).f47386a;
                }
                return new q42.g(kVar, gVar);
            }
            return aVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Ll42/a;", "<anonymous>", "(Lo82/a;)Ll42/a;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.weighttracker.presentation.WeightReportsViewModel$detailsDataState$1", f = "WeightReportsViewModel.kt", l = {118}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<o82.a, t13.d<? super l42.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f142770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f142771b;

        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            e eVar = y.this.new e(dVar);
            eVar.f142771b = obj;
            return eVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super l42.a> dVar) {
            return ((e) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o82.a aVar = (o82.a) this.f142771b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f142770a;
            if (i14 == 0) {
                o13.r.b(obj);
                b63.o oVar = aVar.f130843a;
                m42.b bVar = y.this.f142745a;
                this.f142771b = null;
                this.f142770a = 1;
                bVar.getClass();
                obj = com.garmin.android.apps.connectmobile.f0.J(bVar, new m42.h(oVar, null), this);
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
            if (v2Var instanceof v2.a) {
                return null;
            }
            if (v2Var instanceof v2.b) {
                return (l42.a) ((v2.b) v2Var).f47386a;
            }
            u0.r();
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.weighttracker.presentation.WeightReportsViewModel$onCrossSellingItemClose$1", f = "WeightReportsViewModel.kt", l = {242}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f142773a;

        public f(t13.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return y.this.new f(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f142773a;
            if (i14 == 0) {
                o13.r.b(obj);
                t60.h hVar = y.this.f142748d;
                t60.a aVar2 = y.f142744q;
                DateTime dateTimeNow = DateTime.now();
                dateTimeNow.getClass();
                this.f142773a = 1;
                if (hVar.c(aVar2, dateTimeNow, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lq42/g0;", "<anonymous>", "(Lo82/a;)Lq42/g0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.weighttracker.presentation.WeightReportsViewModel$weeklyReportsDataState$1", f = "WeightReportsViewModel.kt", l = {163, 166}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements e23.p<o82.a, t13.d<? super g0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b63.o f142775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b63.o f142776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public zk0.g f142777c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f142778d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f142779e;

        public g(t13.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            g gVar = y.this.new g(dVar);
            gVar.f142779e = obj;
            return gVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super g0> dVar) {
            return ((g) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0088  */
        /* JADX WARN: Code duplicated, block: B:29:0x008c  */
        /* JADX WARN: Code duplicated, block: B:32:0x0099  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b63.o oVar;
            b63.o oVar2;
            zk0.g gVar;
            v2 v2Var;
            o82.a aVar = (o82.a) this.f142779e;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f142778d;
            y yVar = y.this;
            l42.e eVar = null;
            if (i14 == 0) {
                o13.r.b(obj);
                oVar = aVar.f130843a;
                oVar2 = aVar.f130844b;
                fz0.c cVarA = fz0.d.a(oVar);
                fz0.c cVarA2 = fz0.d.a(oVar2);
                al0.a aVar3 = yVar.f142746b;
                this.f142779e = null;
                this.f142775a = oVar;
                this.f142776b = oVar2;
                this.f142778d = 1;
                aVar3.getClass();
                obj = com.garmin.android.apps.connectmobile.f0.J(aVar3, new al0.e(aVar3, cVarA, cVarA2, null), this);
                if (obj != aVar2) {
                }
                return aVar2;
            }
            if (i14 == 1) {
                oVar2 = this.f142776b;
                oVar = this.f142775a;
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gVar = this.f142777c;
                o13.r.b(obj);
            }
            v2Var = (v2) obj;
            if (!(v2Var instanceof v2.a)) {
                if (v2Var instanceof v2.b) {
                    u0.r();
                    return null;
                }
                eVar = (l42.e) ((v2.b) v2Var).f47386a;
            }
            return new g0(eVar, gVar);
            v2 v2Var2 = (v2) obj;
            v2.b bVar = v2Var2 instanceof v2.b ? (v2.b) v2Var2 : null;
            zk0.g gVar2 = bVar != null ? (zk0.g) bVar.f47386a : null;
            m42.b bVar2 = yVar.f142745a;
            this.f142779e = null;
            this.f142775a = null;
            this.f142776b = null;
            this.f142777c = gVar2;
            this.f142778d = 2;
            bVar2.getClass();
            Object objJ = com.garmin.android.apps.connectmobile.f0.J(bVar2, new m42.j(oVar, oVar2, null), this);
            if (objJ != aVar2) {
                gVar = gVar2;
                obj = objJ;
                v2Var = (v2) obj;
                if (!(v2Var instanceof v2.a)) {
                    if (v2Var instanceof v2.b) {
                        u0.r();
                        return null;
                    }
                    eVar = (l42.e) ((v2.b) v2Var).f47386a;
                }
                return new g0(eVar, gVar);
            }
            return aVar2;
        }
    }

    static {
        new b(null);
        f142744q = t60.a.INDEX_BANNER;
    }

    public y(boolean z14, m42.b bVar, al0.a aVar, k42.a aVar2) {
        bVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        this.f142745a = bVar;
        this.f142746b = aVar;
        this.f142747c = aVar2;
        t60.h hVar = (t60.h) KoinJavaComponent.get$default(t60.h.class, null, null, 6, null);
        this.f142748d = hVar;
        p2 p2VarA = q2.a(i53.a.e(j0.f134944a));
        this.f142749e = p2VarA;
        this.f142750f = p2VarA;
        p2 p2VarA2 = q2.a(null);
        this.f142751g = p2VarA2;
        this.f142752h = p2VarA2;
        p2 p2VarA3 = q2.a(null);
        this.f142753i = p2VarA3;
        this.f142754j = p2VarA3;
        p2 p2VarA4 = q2.a(new f0(null, null, null, null, aVar2.a(), z14, 15, null));
        this.f142755k = p2VarA4;
        this.f142756l = r53.s.d(p2VarA4);
        ge1.b.T(v1.a(this), null, null, new a(null), 3);
        this.f142757m = t1.a(hVar.getF162729b(), new po2.o(21));
        this.f142758n = new u82.a(v1.a(this), new y82.e(new y82.c(new e(null)), null, 2, null), false, 4, null);
        this.f142759o = new u82.a(v1.a(this), new y82.e(new y82.c(new d(null)), null, 2, null), false, 4, null);
        this.f142760p = new u82.a(v1.a(this), new y82.e(new y82.c(new g(null)), null, 2, null), false, 4, null);
    }

    public final void A4(l42.c cVar) {
        while (true) {
            p2 p2Var = this.f142755k;
            Object value = p2Var.getValue();
            l42.c cVar2 = cVar;
            if (p2Var.b(value, f0.a((f0) value, null, null, null, cVar2, null, 55))) {
                return;
            } else {
                cVar = cVar2;
            }
        }
    }

    public final void B4(l42.d dVar) {
        dVar.getClass();
        while (true) {
            p2 p2Var = this.f142755k;
            Object value = p2Var.getValue();
            l42.d dVar2 = dVar;
            if (p2Var.b(value, f0.a((f0) value, null, null, null, null, dVar2, 47))) {
                this.f142747c.b(dVar2);
                return;
            }
            dVar = dVar2;
        }
    }

    public final void x4(int i14) {
        k42.a aVar = (k42.a) KoinJavaComponent.get$default(k42.a.class, null, null, 6, null);
        if (i14 != aVar.d()) {
            aVar.c(i14);
            z4();
            ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).T3(true);
        }
    }

    public final void y4() {
        ge1.b.T(v1.a(this), null, null, new f(null), 3);
    }

    public final void z4() {
        this.f142758n.g();
        this.f142759o.e();
        this.f142760p.e();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lq42/y$b;", "", "<init>", "()V", "Lt60/a;", "INDEX_BANNER", "Lt60/a;", "", "CROSS_SELLING_ITEM_TAG", "Ljava/lang/String;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ y(boolean z14, m42.b bVar, al0.a aVar, k42.a aVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(z14, (i14 & 2) != 0 ? m42.b.a.b(m42.b.f116608a) : bVar, (i14 & 4) != 0 ? al0.a.C0064a.a(al0.a.f3717b) : aVar, aVar2);
    }
}
