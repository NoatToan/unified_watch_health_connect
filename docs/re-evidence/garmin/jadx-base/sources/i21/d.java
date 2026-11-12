package i21;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import c22.j0;
import c22.x0;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.l0;
import p13.y;
import r53.b2;
import r53.p2;
import r53.q2;
import v01.n1;
import v01.w1;
import v01.x1;
import v01.y1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Li21/d;", "Landroidx/lifecycle/u1;", "Lm01/g;", "nutritionRepo", "Lv01/s;", "dailySummaryUseCase", "Lv01/w1;", "reportsDailyUseCase", "Lv01/y1;", "reportsWeeklyUseCase", "Lm01/a;", "myFitnessPalRepo", "Lv01/n1;", "logFoodUseCase", "Lv01/b;", "bulkEditFoodUseCase", "Le01/a;", "nutritionPreferences", "Lf12/l;", "gcmUserSettings", "Lx01/i;", "nutritionStateProvider", "Ls01/f;", "nutritionSettingsConfigProvider", "<init>", "(Lm01/g;Lv01/s;Lv01/w1;Lv01/y1;Lm01/a;Lv01/n1;Lv01/b;Le01/a;Lf12/l;Lx01/i;Ls01/f;)V", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends u1 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f87268z = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m01.g f87269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v01.s f87270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1 f87271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y1 f87272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m01.a f87273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n1 f87274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v01.b f87275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e01.a f87276h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f12.l f87277i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x01.i f87278j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final s01.f f87279k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public o13.p<? extends o82.g, o82.a> f87280l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p2 f87281m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i53.c f87282n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public g21.k f87283o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Boolean f87284p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p2 f87285q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b2 f87286r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p2 f87287t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b2 f87288v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final u82.a f87289w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final u82.a f87290x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final u82.a f87291y;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.reports.viewmodel.NutritionReportsViewModel$1", f = "NutritionReportsViewModel.kt", l = {264}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f87292a;

        /* JADX INFO: renamed from: i21.d$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C1731a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f87294a;

            public C1731a(d dVar) {
                this.f87294a = dVar;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                d dVar2 = this.f87294a;
                dVar2.f87281m.setValue((x01.e) obj);
                dVar2.P4();
                return Unit.INSTANCE;
            }
        }

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

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to i21.d$a for r4v1 'this'  t13.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                u13.a r0 = u13.a.COROUTINE_SUSPENDED
                int r1 = r4.f87292a
                r2 = 1
                if (r1 == 0) goto L14
                if (r1 == r2) goto L10
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r5)
            Le:
                r5 = 0
                return r5
            L10:
                o13.r.b(r5)
                goto L30
            L14:
                o13.r.b(r5)
                i21.d r5 = i21.d.this
                x01.i r1 = r5.f87278j
                r1.getClass()
                r53.b2 r1 = x01.i.f188280c
                i21.d$a$a r3 = new i21.d$a$a
                r3.<init>(r5)
                r4.f87292a = r2
                r53.o2<T> r5 = r1.f150540a
                java.lang.Object r5 = r5.collect(r3, r4)
                if (r5 != r0) goto L30
                return r0
            L30:
                o2.c.f()
                goto Le
            */
            throw new UnsupportedOperationException("Method not decompiled: i21.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f87295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f87296b;

        static {
            int[] iArr = new int[o82.g.values().length];
            try {
                iArr[o82.g.f130851d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o82.g.f130853f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o82.g.f130856i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o82.g.f130850c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f87295a = iArr;
            int[] iArr2 = new int[i01.a.values().length];
            try {
                iArr2[i01.a.COPY.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[i01.a.MOVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f87296b = iArr2;
        }
    }

    /* JADX INFO: renamed from: i21.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lk01/f;", "<anonymous>", "(Lo82/a;)Lk01/f;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.reports.viewmodel.NutritionReportsViewModel$dailyReportsState$1", f = "NutritionReportsViewModel.kt", l = {243}, m = "invokeSuspend", v = 2)
    public static final class C1732d extends v13.i implements e23.p<o82.a, t13.d<? super k01.f>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f87297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f87298b;

        public C1732d(t13.d<? super C1732d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C1732d c1732d = d.this.new C1732d(dVar);
            c1732d.f87298b = obj;
            return c1732d;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super k01.f> dVar) {
            return ((C1732d) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            o82.a aVar = (o82.a) this.f87298b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f87297a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            this.f87298b = null;
            this.f87297a = 1;
            Object objY4 = d.y4(d.this, aVar, this);
            return objY4 == aVar2 ? aVar2 : objY4;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lg21/i;", "<anonymous>", "(Lo82/a;)Lg21/i;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.reports.viewmodel.NutritionReportsViewModel$dailySummaryState$1", f = "NutritionReportsViewModel.kt", l = {225, 227, 232}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<o82.a, t13.d<? super g21.i>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f87300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f87301b;

        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            e eVar = d.this.new e(dVar);
            eVar.f87301b = obj;
            return eVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super g21.i> dVar) {
            return ((e) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0069  */
        /* JADX WARN: Code duplicated, block: B:29:0x0077  */
        /* JADX WARN: Code duplicated, block: B:31:0x007b  */
        /* JADX WARN: Code duplicated, block: B:32:0x007f  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
        
            if (r9 == r1) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x008c, code lost:
        
            if (r9 == r1) goto L36;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Exception {
            v2 v2Var;
            o82.a aVar = (o82.a) this.f87301b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f87300a;
            d dVar = d.this;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    v2Var = (v2) obj;
                    if (v2Var instanceof v2.b) {
                        if (!(v2Var instanceof v2.a)) {
                            throw ((v2.a) v2Var).f47383a;
                        }
                        u0.r();
                        return null;
                    }
                    this.f87301b = null;
                    this.f87300a = 2;
                    obj = d.x4(dVar, aVar, this);
                } else {
                    if (i14 != 2) {
                        if (i14 == 3) {
                            o13.r.b(obj);
                            return (g21.i) obj;
                        }
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return (g21.i) obj;
            }
            o13.r.b(obj);
            x01.e eVar = (x01.e) dVar.f87281m.getValue();
            if ((eVar != null ? eVar.f188254c : null) == x01.f.ACTIVE) {
                Date date = g22.l.h(aVar.f130843a).toDateTimeAtStartOfDay().toDate();
                date.getClass();
                String strG = j0.g(date, "yyyy-MM-dd", null);
                m01.a aVar3 = dVar.f87273e;
                this.f87301b = aVar;
                this.f87300a = 1;
                obj = aVar3.b(strG, this);
                if (obj != aVar2) {
                    v2Var = (v2) obj;
                    if (v2Var instanceof v2.b) {
                        if (!(v2Var instanceof v2.a)) {
                            throw ((v2.a) v2Var).f47383a;
                        }
                        u0.r();
                        return null;
                    }
                    this.f87301b = null;
                    this.f87300a = 2;
                    obj = d.x4(dVar, aVar, this);
                }
            } else {
                this.f87301b = null;
                this.f87300a = 3;
                obj = d.x4(dVar, aVar, this);
            }
            return aVar2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.reports.viewmodel.NutritionReportsViewModel$dismissWhatsNewModal$2", f = "NutritionReportsViewModel.kt", l = {568}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f87303a;

        public f(t13.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new f(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f87303a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f87303a = 1;
                if (d.C4(d.this, this) == aVar) {
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

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Integer.valueOf(((g21.q) t7).f75479c), Integer.valueOf(((g21.q) t14).f75479c));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lk01/g;", "<anonymous>", "(Lo82/a;)Lk01/g;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.reports.viewmodel.NutritionReportsViewModel$weeklyReportsState$1", f = "NutritionReportsViewModel.kt", l = {253}, m = "invokeSuspend", v = 2)
    public static final class h extends v13.i implements e23.p<o82.a, t13.d<? super k01.g>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f87305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f87306b;

        public h(t13.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            h hVar = d.this.new h(dVar);
            hVar.f87306b = obj;
            return hVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super k01.g> dVar) {
            return ((h) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            o82.a aVar = (o82.a) this.f87306b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f87305a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            this.f87306b = null;
            this.f87305a = 1;
            Object objZ4 = d.z4(d.this, aVar, this);
            return objZ4 == aVar2 ? aVar2 : objZ4;
        }
    }

    static {
        new b(null);
    }

    public d(m01.g gVar, v01.s sVar, w1 w1Var, y1 y1Var, m01.a aVar, n1 n1Var, v01.b bVar, e01.a aVar2, f12.l lVar, x01.i iVar, s01.f fVar) {
        gVar.getClass();
        sVar.getClass();
        w1Var.getClass();
        y1Var.getClass();
        aVar.getClass();
        n1Var.getClass();
        bVar.getClass();
        aVar2.getClass();
        lVar.getClass();
        iVar.getClass();
        fVar.getClass();
        this.f87269a = gVar;
        this.f87270b = sVar;
        this.f87271c = w1Var;
        this.f87272d = y1Var;
        this.f87273e = aVar;
        this.f87274f = n1Var;
        this.f87275g = bVar;
        this.f87276h = aVar2;
        this.f87277i = lVar;
        this.f87278j = iVar;
        this.f87279k = fVar;
        this.f87281m = q2.a(null);
        p2 p2VarA = q2.a(new i21.c(null, new g21.d(null, i53.a.e(g21.v.f75526f), 1, null), null, null, null, null, null, i53.a.e(g21.l.f75452g), null, null, null, null, null, null, false, false, null, false, false, false, null, null, 4194173, null));
        this.f87285q = p2VarA;
        this.f87286r = r53.s.d(p2VarA);
        p2 p2VarA2 = q2.a(l0.f134950a);
        this.f87287t = p2VarA2;
        this.f87288v = r53.s.d(p2VarA2);
        boolean z14 = false;
        this.f87289w = new u82.a(v1.a(this), new y82.e(new y82.c(new e(null)), null, 2, null), z14, 4, null);
        this.f87290x = new u82.a(v1.a(this), new y82.e(new y82.c(new C1732d(null)), null, 2, null), z14, 4, null);
        this.f87291y = new u82.a(v1.a(this), new y82.e(new y82.c(new h(null)), null, 2, null), false, 4, null);
        ge1.b.T(v1.a(this), null, null, new i21.g(this, null), 3);
        ge1.b.T(v1.a(this), null, null, new i21.f(this, null), 3);
        ge1.b.T(v1.a(this), null, null, new t(this, null), 3);
        ge1.b.T(v1.a(this), null, null, new a(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object A4(d dVar, b63.o oVar, v13.c cVar) {
        m mVar;
        dVar.getClass();
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f87336c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f87336c = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(dVar, cVar);
            }
        } else {
            mVar = new m(dVar, cVar);
        }
        Object objY = mVar.f87334a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f87336c;
        if (i15 == 0) {
            o13.r.b(objY);
            m01.g gVar = dVar.f87269a;
            mVar.f87336c = 1;
            objY = gVar.Y(oVar, mVar);
            if (objY == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objY);
        }
        v2 v2Var = (v2) objY;
        if (!(v2Var instanceof v2.b)) {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            a2 a2Var = a2.NUTRITION;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "NutritionReportsViewModel", "fetchSettings: error fetching settings");
            return null;
        }
        v2.b bVar = (v2.b) v2Var;
        if (bVar.f47387b == 204) {
            a2 a2Var2 = a2.NUTRITION;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "NutritionReportsViewModel", "fetchSettings: error fetching settings");
            return null;
        }
        a2 a2Var3 = a2.NUTRITION;
        i2.f36769a.getClass();
        i2.a.b(a2Var3, "NutritionReportsViewModel", "fetchSettings: successfully retrieved nutrition settings");
        return (l01.k) bVar.f47386a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object B4(d dVar, v13.c cVar) {
        n nVar;
        dVar.getClass();
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f87339c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f87339c = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(dVar, cVar);
            }
        } else {
            nVar = new n(dVar, cVar);
        }
        Object objS0 = nVar.f87337a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f87339c;
        if (i15 == 0) {
            o13.r.b(objS0);
            m01.g gVar = dVar.f87269a;
            nVar.f87339c = 1;
            objS0 = gVar.s0(nVar);
            if (objS0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objS0);
        }
        v2 v2Var = (v2) objS0;
        if (v2Var instanceof v2.b) {
            a2 a2Var = a2.NUTRITION;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "NutritionReportsViewModel", "markPostPregnancySuggestionOpened: successfully updated user preference");
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            a2 a2Var2 = a2.NUTRITION;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "NutritionReportsViewModel", "markPostPregnancySuggestionOpened: error updating user preference");
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object C4(d dVar, v13.c cVar) {
        p pVar;
        dVar.getClass();
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i14 = pVar.f87345c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                pVar.f87345c = i14 - Integer.MIN_VALUE;
            } else {
                pVar = new p(dVar, cVar);
            }
        } else {
            pVar = new p(dVar, cVar);
        }
        Object objC = pVar.f87343a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = pVar.f87345c;
        if (i15 == 0) {
            o13.r.b(objC);
            m01.g gVar = dVar.f87269a;
            pVar.f87345c = 1;
            objC = gVar.c(pVar);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objC);
        }
        v2 v2Var = (v2) objC;
        if (v2Var instanceof v2.b) {
            a2 a2Var = a2.NUTRITION;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "NutritionReportsViewModel", "markWhatsNewModalAsShown: successfully updated user preference");
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            a2 a2Var2 = a2.NUTRITION;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "NutritionReportsViewModel", "markWhatsNewModalAsShown: error updating user preference");
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009c, code lost:
    
        if (r28.K4(r2) == r3) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object D4(d dVar, v13.c cVar) {
        v vVar;
        dVar.getClass();
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i14 = vVar.f87370c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                vVar.f87370c = i14 - Integer.MIN_VALUE;
            } else {
                vVar = new v(dVar, cVar);
            }
        } else {
            vVar = new v(dVar, cVar);
        }
        Object objB0 = vVar.f87368a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = vVar.f87370c;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(objB0);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objB0);
            }
            return i21.b.f.f87245b;
        }
        o13.r.b(objB0);
        l01.k kVar = new l01.k(s21.s.NO_GOAL.f156170a, (b63.o) null, (Integer) null, (String) null, (Integer) null, (Boolean) null, (Integer) null, (l01.i) null, (l01.h) null, (Boolean) null, (String) null, (String) null, (b63.v) null, (b63.v) null, (Double) null, (Double) null, (l01.e) null, (List) null, 262142, (p005kotlin.jvm.internal.j) null);
        m01.g gVar = dVar.f87269a;
        int iB = dVar.f87279k.b();
        b63.o oVarD = g22.l.d(b63.o.INSTANCE);
        vVar.f87370c = 1;
        objB0 = gVar.b0(iB, oVarD, kVar, vVar);
        if (objB0 != obj) {
        }
        return obj;
        v2 v2Var = (v2) objB0;
        if (!(v2Var instanceof v2.b)) {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            a2 a2Var = a2.NUTRITION;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "NutritionReportsViewModel", "updateGoalToNoGoal: error updating nutrition settings");
            return i21.b.a.f87240b;
        }
        a2 a2Var2 = a2.NUTRITION;
        i2.f36769a.getClass();
        i2.a.b(a2Var2, "NutritionReportsViewModel", "updateGoalToNoGoal: successfully updated nutrition settings");
        dVar.P4();
        vVar.f87370c = 2;
    }

    public static List I4(List list) {
        g21.q qVar;
        k01.i iVar;
        String str;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            k01.j jVar = (k01.j) it.next();
            if (jVar == null || (iVar = jVar.f102069a) == null || (str = iVar.f102065b) == null) {
                qVar = null;
            } else {
                Boolean bool = iVar.f102066c;
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                Integer num = iVar.f102067d;
                int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
                k01.k kVar = jVar.f102070b;
                qVar = new g21.q(str, zBooleanValue, iIntValue, kVar != null ? kVar.f102072a : null, kVar != null ? kVar.f102077f : null);
            }
            if (qVar != null) {
                arrayList.add(qVar);
            }
        }
        return h0.N0(arrayList, new g());
    }

    public static o82.a J4() {
        return new o82.a(v21.d.f175306j, b63.p.c(g22.l.d(b63.o.INSTANCE), new b63.d(0, 0, 90, 3, null)));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0076  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object x4(d dVar, o82.a aVar, v13.c cVar) throws Exception {
        j jVar;
        boolean z14;
        g21.h hVar;
        g21.h hVar2;
        dVar.getClass();
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f87327c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f87327c = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(dVar, cVar);
            }
        } else {
            jVar = new j(dVar, cVar);
        }
        Object objE0 = jVar.f87325a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f87327c;
        s21.c cVar2 = null;
        if (i15 == 0) {
            o13.r.b(objE0);
            b63.o oVar = aVar.f130843a;
            v01.s sVar = dVar.f87270b;
            jVar.f87327c = 1;
            objE0 = ge1.b.e0(sVar.f174526b, new v01.o(sVar, oVar, false, null), jVar);
            if (objE0 == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE0);
        }
        v2 v2Var = (v2) objE0;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                throw ((v2.a) v2Var).f47383a;
            }
            u0.r();
            return null;
        }
        g21.i iVar = (g21.i) ((v2.b) v2Var).f47386a;
        dVar.f87282n = (iVar == null || (hVar2 = iVar.f75433a) == null) ? null : hVar2.f75430g;
        if (dVar.f87279k.e()) {
            if (iVar != null && (hVar = iVar.f75433a) != null) {
                cVar2 = hVar.f75427d;
            }
            z14 = cVar2 == s21.c.TIMELINE;
        }
        dVar.f87284p = Boolean.valueOf(z14);
        return iVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object y4(d dVar, o82.a aVar, v13.c cVar) throws Exception {
        k kVar;
        dVar.getClass();
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f87330c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f87330c = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(dVar, cVar);
            }
        } else {
            kVar = new k(dVar, cVar);
        }
        Object objE0 = kVar.f87328a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f87330c;
        if (i15 == 0) {
            o13.r.b(objE0);
            b63.o oVar = (b63.o) r13.b.d(aVar.f130843a, J4().f130843a);
            b63.o oVar2 = (b63.o) r13.b.e(aVar.f130844b, J4().f130844b);
            b63.o oVarD = g22.l.d(b63.o.INSTANCE);
            w1 w1Var = dVar.f87271c;
            kVar.f87330c = 1;
            objE0 = ge1.b.e0(w1Var.f174580c, new v01.v1(w1Var, oVar, oVar2, oVarD, null), kVar);
            if (objE0 == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE0);
        }
        v2 v2Var = (v2) objE0;
        if (v2Var instanceof v2.b) {
            k01.f fVar = (k01.f) ((v2.b) v2Var).f47386a;
            dVar.S4(fVar.f102056c);
            return fVar;
        }
        if (v2Var instanceof v2.a) {
            throw ((v2.a) v2Var).f47383a;
        }
        u0.r();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object z4(d dVar, o82.a aVar, v13.c cVar) throws Exception {
        l lVar;
        dVar.getClass();
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f87333c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f87333c = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(dVar, cVar);
            }
        } else {
            lVar = new l(dVar, cVar);
        }
        Object objE0 = lVar.f87331a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f87333c;
        if (i15 == 0) {
            o13.r.b(objE0);
            b63.o oVar = aVar.f130843a;
            b63.o oVar2 = aVar.f130844b;
            b63.o oVarD = g22.l.d(b63.o.INSTANCE);
            y1 y1Var = dVar.f87272d;
            lVar.f87333c = 1;
            objE0 = ge1.b.e0(y1Var.f174614c, new x1(y1Var, oVar, oVar2, oVarD, null), lVar);
            if (objE0 == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE0);
        }
        v2 v2Var = (v2) objE0;
        if (v2Var instanceof v2.b) {
            k01.g gVar = (k01.g) ((v2.b) v2Var).f47386a;
            dVar.S4(gVar.f102059c);
            return gVar;
        }
        if (v2Var instanceof v2.a) {
            throw ((v2.a) v2Var).f47383a;
        }
        u0.r();
        return null;
    }

    public final void E4() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f87285q;
            value = p2Var.getValue();
        } while (!p2Var.b(value, i21.c.a((i21.c) value, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, 262143)));
    }

    public final void F4() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f87285q;
            value = p2Var.getValue();
        } while (!p2Var.b(value, i21.c.a((i21.c) value, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, 4194302)));
    }

    public final void G4() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f87285q;
            value = p2Var.getValue();
        } while (!p2Var.b(value, i21.c.a((i21.c) value, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, 4128767)));
        ge1.b.T(v1.a(this), null, null, new f(null), 3);
    }

    public final o82.a H4(o82.g gVar) {
        b63.d dVar;
        gVar.getClass();
        int i14 = c.f87295a[gVar.ordinal()];
        if (i14 == 1) {
            dVar = new b63.d(0, 0, 91, 3, null);
        } else if (i14 == 2) {
            dVar = new b63.d(0, 0, 112, 3, null);
        } else if (i14 != 3) {
            dVar = new b63.d(0, 0, 90, 3, null);
        } else {
            dVar = new b63.d(0, 0, 364, 3, null);
        }
        o82.f fVar = gVar.f130862a;
        b63.o oVar = v21.d.f175306j;
        b63.o.Companion companion = b63.o.INSTANCE;
        return new o82.a(fVar.b(oVar, g22.l.d(companion)), b63.p.c(g22.l.d(companion), dVar));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object K4(v13.c cVar) {
        o oVar;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i14 = oVar.f87342c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                oVar.f87342c = i14 - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        Object objB = oVar.f87340a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = oVar.f87342c;
        if (i15 == 0) {
            o13.r.b(objB);
            oVar.f87342c = 1;
            objB = this.f87269a.B(oVar);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objB);
        }
        v2 v2Var = (v2) objB;
        if (v2Var instanceof v2.b) {
            a2 a2Var = a2.NUTRITION;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "NutritionReportsViewModel", "markPregnancySuggestionOpened: successfully updated user preference");
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            a2 a2Var2 = a2.NUTRITION;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "NutritionReportsViewModel", "markPregnancySuggestionOpened: error updating user preference");
        }
        return Unit.INSTANCE;
    }

    public final void L4(g21.v vVar) {
        p2 p2Var;
        Object value;
        i21.c cVar;
        g21.d dVar;
        do {
            p2Var = this.f87285q;
            value = p2Var.getValue();
            cVar = (i21.c) value;
            dVar = cVar.f87247b;
        } while (!p2Var.b(value, i21.c.a(cVar, null, dVar != null ? new g21.d(vVar, dVar.f75406b) : null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, 4194301)));
    }

    public final void M4(g21.l lVar) {
        p2 p2Var;
        Object value;
        lVar.getClass();
        do {
            p2Var = this.f87285q;
            value = p2Var.getValue();
        } while (!p2Var.b(value, i21.c.a((i21.c) value, null, null, null, null, lVar, null, null, null, null, null, false, false, null, false, false, false, null, null, 4194239)));
    }

    public final void N4(g21.r rVar) {
        p2 p2Var;
        Object value;
        rVar.getClass();
        do {
            p2Var = this.f87285q;
            value = p2Var.getValue();
        } while (!p2Var.b(value, i21.c.a((i21.c) value, null, null, null, null, null, rVar, null, null, null, null, false, false, null, false, false, false, null, null, 4194047)));
    }

    public final void O4(int i14) {
        p2 p2Var;
        Object value;
        i21.c cVar;
        g21.x xVar;
        do {
            p2Var = this.f87285q;
            value = p2Var.getValue();
            cVar = (i21.c) value;
            xVar = (g21.x) h0.e0(i14, cVar.f87251f);
            if (xVar == null) {
                xVar = g21.x.MACROS;
            }
        } while (!p2Var.b(value, i21.c.a(cVar, null, null, null, xVar, null, null, null, null, null, null, false, false, null, false, false, false, null, null, 4194295)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P4() {
        o82.g gVar;
        o13.p<? extends o82.g, o82.a> pVar = this.f87280l;
        if (pVar == null || (gVar = (o82.g) pVar.f128594a) == null) {
            return;
        }
        a2 a2Var = a2.NUTRITION;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "NutritionReportsViewModel", "refreshAllDataForCurrentReports: setting home screen refresh needed");
        sn.a.o(f12.l.f68084a, true);
        int i14 = c.f87295a[gVar.ordinal()];
        u82.a aVar = this.f87291y;
        u82.a aVar2 = this.f87290x;
        u82.a aVar3 = this.f87289w;
        if (i14 == 1 || i14 == 2) {
            aVar2.g();
            aVar3.e();
            aVar.e();
        } else if (i14 == 3) {
            aVar.g();
            aVar3.e();
            aVar2.e();
        } else {
            if (i14 != 4) {
                return;
            }
            aVar3.g();
            aVar2.e();
            aVar.e();
        }
    }

    public final void Q4(List<b63.o> list) {
        list.getClass();
        if (!list.isEmpty()) {
            for (b63.o oVar : list) {
                b63.o.Companion companion = b63.o.INSTANCE;
                if (oVar.compareTo(b63.q.d(g22.l.d(companion), new b63.d(0, 0, 28, 3, null))) >= 0 && oVar.compareTo(g22.l.d(companion)) <= 0) {
                    a2 a2Var = a2.NUTRITION;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "NutritionReportsViewModel", "refreshData: setting home screen refresh needed");
                    sn.a.o(f12.l.f68084a, true);
                    break;
                }
            }
        }
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new o82.a((b63.o) it.next(), null, 2, null));
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            this.f87289w.i((o82.a) it3.next(), true);
        }
        this.f87290x.e();
        this.f87291y.e();
    }

    public final void R4(boolean z14, b63.o oVar, List<? extends b11.i> list) {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f87285q;
            value = p2Var.getValue();
        } while (!p2Var.b(value, i21.c.a((i21.c) value, new i21.a(i21.b.e.f87244b, z14 ? new fk0.a(this, 29, oVar, list) : null), null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, 4194302)));
    }

    public final void S4(List<s21.n> list) {
        Object value;
        i21.c cVar;
        Integer numValueOf;
        Integer numValueOf2;
        String str;
        String str2;
        Object next;
        s21.n nVar;
        p2 p2Var = this.f87285q;
        g21.r rVar = ((i21.c) p2Var.getValue()).f87254i;
        if (rVar == null) {
            w13.c cVar2 = g21.r.f75490k;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar2, cVar2);
            do {
                if (!bVarN.hasNext()) {
                    next = null;
                    break;
                }
                next = bVarN.next();
            } while (!p005kotlin.jvm.internal.s.g(((g21.r) next).f75491a, (list == null || (nVar = (s21.n) h0.d0(list)) == null) ? null : nVar.f156152b));
            rVar = (g21.r) next;
        }
        g21.r rVar2 = rVar;
        boolean z14 = (list == null || list.isEmpty() || rVar2 == null) ? false : true;
        do {
            value = p2Var.getValue();
            cVar = (i21.c) value;
            numValueOf = z14 ? null : Integer.valueOf(R.string.daily_macronutrients);
            numValueOf2 = z14 ? null : Integer.valueOf(R.string.lbl_avg_daily_macronutrients);
            s01.f fVar = this.f87279k;
            if (fVar.e()) {
                x0.f23314a.getClass();
                str = x0.Nd;
            } else {
                str = null;
            }
            if (fVar.e()) {
                x0.f23314a.getClass();
                str2 = x0.Ed;
            } else {
                str2 = null;
            }
        } while (!p2Var.b(value, i21.c.a(cVar, null, null, null, null, null, rVar2, numValueOf, numValueOf2, str, str2, false, false, null, false, false, false, null, null, 4178687)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li21/d$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
