package np;

import am.x0;
import am.z0;
import android.text.TextUtils;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import e23.p;
import java.util.List;
import lp.l;
import mp.k;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.w;
import p13.x;
import r53.b2;
import r53.k2;
import r53.m;
import r53.p2;
import r53.q2;
import r53.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lnp/c;", "Landroidx/lifecycle/u1;", "Lam/x0;", "parentActivity", "initialSelectedActivity", "Llp/i;", "getSelectionFilterActivitiesUseCase", "Llp/d;", "getDailySummaryActivityReportsUseCase", "Llp/f;", "getMonthlySummaryActivityReportsUseCase", "Llp/a;", "deleteActivityUseCase", "<init>", "(Lam/x0;Lam/x0;Llp/i;Llp/d;Llp/f;Llp/a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lp.a f126783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f126784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f126785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f126786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r53.i<i53.c<mp.b>> f126787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f126788f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b2 f126789g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u82.a f126790h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u82.a f126791i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u82.a f126792j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u82.a f126793k;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f126794a;

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
                iArr[o82.g.f130857j.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o82.g.f130859l.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f126794a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo82/a;", "dateInterval", "Li53/d;", "Lmp/k;", "Lqp/c;", "<anonymous>", "(Lo82/a;)Li53/d;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.reports.presentation.ActivityReportsPagerViewModel$dailySummaryPageState$1", f = "ActivityReportsPagerViewModel.kt", l = {90}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<o82.a, t13.d<? super i53.d<k, ? extends qp.c>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f126795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f126796b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ lp.d f126798d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(lp.d dVar, t13.d<? super b> dVar2) {
            super(2, dVar2);
            this.f126798d = dVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = c.this.new b(this.f126798d, dVar);
            bVar.f126796b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super i53.d<k, ? extends qp.c>> dVar) {
            return ((b) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            x0 x0Var;
            o82.a aVar = (o82.a) this.f126796b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f126795a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            mp.b bVar = (mp.b) c.this.f126786d.getValue();
            if (bVar == null || (x0Var = bVar.f119948a) == null) {
                return i53.a.c();
            }
            o82.g gVar = o82.g.f130851d;
            this.f126796b = null;
            this.f126795a = 1;
            Object objA = this.f126798d.a(aVar, x0Var, gVar, this);
            return objA == aVar2 ? aVar2 : objA;
        }
    }

    /* JADX INFO: renamed from: np.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo82/a;", "dateInterval", "Li53/d;", "Lmp/k;", "Lqp/c;", "<anonymous>", "(Lo82/a;)Li53/d;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.reports.presentation.ActivityReportsPagerViewModel$monthlySummaryPageState$1", f = "ActivityReportsPagerViewModel.kt", l = {120}, m = "invokeSuspend", v = 2)
    public static final class C2440c extends v13.i implements p<o82.a, t13.d<? super i53.d<k, ? extends qp.c>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f126799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f126800b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ lp.d f126802d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2440c(lp.d dVar, t13.d<? super C2440c> dVar2) {
            super(2, dVar2);
            this.f126802d = dVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C2440c c2440c = c.this.new C2440c(this.f126802d, dVar);
            c2440c.f126800b = obj;
            return c2440c;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super i53.d<k, ? extends qp.c>> dVar) {
            return ((C2440c) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            x0 x0Var;
            o82.a aVar = (o82.a) this.f126800b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f126799a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            mp.b bVar = (mp.b) c.this.f126786d.getValue();
            if (bVar == null || (x0Var = bVar.f119948a) == null) {
                return i53.a.c();
            }
            o82.g gVar = o82.g.f130857j;
            this.f126800b = null;
            this.f126799a = 1;
            Object objA = this.f126802d.a(aVar, x0Var, gVar, this);
            return objA == aVar2 ? aVar2 : objA;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo82/a;", "dateInterval", "Li53/d;", "Lmp/k;", "Lqp/c;", "<anonymous>", "(Lo82/a;)Li53/d;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.reports.presentation.ActivityReportsPagerViewModel$oneYearSummaryPageState$1", f = "ActivityReportsPagerViewModel.kt", l = {TsExtractor.TS_STREAM_TYPE_E_AC3}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<o82.a, t13.d<? super i53.d<k, ? extends qp.c>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f126803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f126804b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ lp.f f126806d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(lp.f fVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f126806d = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = c.this.new d(this.f126806d, dVar);
            dVar2.f126804b = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super i53.d<k, ? extends qp.c>> dVar) {
            return ((d) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            x0 x0Var;
            o82.a aVar = (o82.a) this.f126804b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f126803a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            mp.b bVar = (mp.b) c.this.f126786d.getValue();
            if (bVar == null || (x0Var = bVar.f119948a) == null) {
                return i53.a.c();
            }
            this.f126804b = null;
            this.f126803a = 1;
            Object objA = this.f126806d.a(aVar, x0Var, this);
            return objA == aVar2 ? aVar2 : objA;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lqp/d;", "<unused var>", "Lmp/b;", "filterSelection", "Li53/c;", "allFilterActivities", "<anonymous>", "(Lqp/d;Lmp/b;Li53/c;)Lqp/d;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.reports.presentation.ActivityReportsPagerViewModel$uiState$1", f = "ActivityReportsPagerViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.r<qp.d, mp.b, i53.c<? extends mp.b>, t13.d<? super qp.d>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ mp.b f126807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ i53.c f126808b;

        public e(t13.d<? super e> dVar) {
            super(4, dVar);
        }

        @Override // e23.r
        public final Object invoke(qp.d dVar, mp.b bVar, i53.c<? extends mp.b> cVar, t13.d<? super qp.d> dVar2) {
            e eVar = c.this.new e(dVar2);
            eVar.f126807a = bVar;
            eVar.f126808b = cVar;
            return eVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            List listK;
            mp.b bVar = this.f126807a;
            i53.c cVar = this.f126808b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            qp.d dVar = (qp.d) c.this.f126788f.getValue();
            if (bVar == null) {
                return dVar;
            }
            k.a aVar2 = k.f120007d;
            x0 x0Var = bVar.f119948a;
            aVar2.getClass();
            x0Var.getClass();
            String str = x0Var.f4358a;
            z0 z0Var = z0.f4390a;
            if (z0.b(x0.f4312o, str)) {
                listK = x.k(k.DISTANCE, k.TIME, k.ASCENT, k.CALORIES);
            } else if (z0.b(x0.D, str)) {
                listK = w.c(k.TIME);
            } else if (z0.b(x0.f4297k1, str)) {
                listK = x.k(k.TIME_INDOOR_ROWING, k.CALORIES);
            } else if (z0.b(x0.f4316p, str)) {
                listK = x.k(k.TIME, k.CALORIES);
            } else if (z0.b(x0.E3, str)) {
                listK = x.k(k.PACK_WEIGHT, k.DISTANCE, k.TIME, k.ASCENT, k.CALORIES);
            } else if (z0.b(x0.f4320q, str)) {
                listK = x.k(k.DISTANCE, k.TIME, k.ASCENT, k.CALORIES);
            } else if (z0.H(str)) {
                listK = w.c(k.DISTANCE);
            } else if (z0.b(x0.f4268a3, str)) {
                listK = x.k(k.DISTANCE, k.TIME, k.ASCENT, k.CALORIES);
            } else if (z0.b(x0.f4323q3, str)) {
                listK = w.c(k.TIME);
            } else if (z0.b(x0.f4308n, str)) {
                listK = x.k(k.DISTANCE, k.TIME, k.ASCENT, k.CALORIES);
            } else if (z0.b(x0.f4324r, str)) {
                listK = x.k(k.DISTANCE_SWIMMING, k.TIME);
            } else if (z0.b(x0.f4277d3, str)) {
                listK = w.c(k.TIME);
            } else if (z0.b(x0.f4331t, str)) {
                listK = x.k(k.DISTANCE, k.TIME, k.ASCENT, k.CALORIES);
            } else if (z0.b(x0.f4350y, str)) {
                listK = w.c(k.TIME);
            } else if (!TextUtils.isEmpty(str) && z0.b(x0.Y1, str)) {
                listK = x.k(k.DISTANCE, k.TIME, k.ASCENT, k.CALORIES);
            } else if (z0.b(x0.U1, str)) {
                listK = w.c(k.TIME);
            } else if (z0.b(x0.E2, str)) {
                listK = x.k(k.WIN_RATE, k.STRESS, k.BODY_BATTERY);
            } else {
                listK = z0.R(str) ? x.k(k.DISTANCE, k.TIME, k.ASCENT, k.CALORIES) : w.c(k.TIME);
            }
            return qp.d.a(dVar, false, false, null, null, new mp.a(bVar, cVar), i53.a.e(listK), null, null, 415);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo82/a;", "dateInterval", "Li53/d;", "Lmp/k;", "Lqp/c;", "<anonymous>", "(Lo82/a;)Li53/d;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.reports.presentation.ActivityReportsPagerViewModel$weeklySummaryPageState$1", f = "ActivityReportsPagerViewModel.kt", l = {105}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements p<o82.a, t13.d<? super i53.d<k, ? extends qp.c>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f126810a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f126811b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ lp.d f126813d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(lp.d dVar, t13.d<? super f> dVar2) {
            super(2, dVar2);
            this.f126813d = dVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            f fVar = c.this.new f(this.f126813d, dVar);
            fVar.f126811b = obj;
            return fVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super i53.d<k, ? extends qp.c>> dVar) {
            return ((f) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            x0 x0Var;
            o82.a aVar = (o82.a) this.f126811b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f126810a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            mp.b bVar = (mp.b) c.this.f126786d.getValue();
            if (bVar == null || (x0Var = bVar.f119948a) == null) {
                return i53.a.c();
            }
            o82.g gVar = o82.g.f130853f;
            this.f126811b = null;
            this.f126810a = 1;
            Object objA = this.f126813d.a(aVar, x0Var, gVar, this);
            return objA == aVar2 ? aVar2 : objA;
        }
    }

    public c(x0 x0Var, x0 x0Var2, lp.i iVar, lp.d dVar, lp.f fVar, lp.a aVar) {
        p2 p2VarA;
        x0 x0Var3 = x0Var;
        iVar.getClass();
        dVar.getClass();
        fVar.getClass();
        aVar.getClass();
        this.f126783a = aVar;
        p2 p2VarA2 = q2.a(null);
        this.f126784b = p2VarA2;
        this.f126785c = p2VarA2;
        if (x0Var2 == null || x0Var3 == null) {
            p2VarA = q2.a(x0Var3 != null ? new mp.f(x0Var3) : null);
        } else {
            p2VarA = q2.a(new mp.g(x0Var3, x0Var2));
        }
        this.f126786d = p2VarA;
        x0Var3 = (x0Var3 == null || x0Var3 == x0.C) ? null : x0Var3;
        r53.i<i53.c<mp.b>> hVar = x0Var3 != null ? new lp.h(s.s(s.f(new l(iVar.f114116b, null))), x0Var3, iVar) : new m(null);
        this.f126787e = hVar;
        p2 p2VarA3 = q2.a(new qp.d(false, false, false, null, null, null, null, null, null, 511, null));
        this.f126788f = p2VarA3;
        this.f126789g = s.K(s.l(p2VarA3, p2VarA, hVar, new e(null)), v1.a(this), k2.a.a(k2.f150703a, 2), new qp.d(false, false, false, null, null, null, null, null, null, 511, null));
        this.f126790h = new u82.a(v1.a(this), new y82.e(new y82.c(new b(dVar, null)), null, 2, null), false, 4, null);
        this.f126791i = new u82.a(v1.a(this), new y82.e(new y82.c(new f(dVar, null)), null, 2, null), false, 4, null);
        this.f126792j = new u82.a(v1.a(this), new y82.e(new y82.c(new C2440c(dVar, null)), null, 2, null), false, 4, null);
        this.f126793k = new u82.a(v1.a(this), new y82.e(new y82.c(new d(fVar, null)), null, 2, null), false, 4, null);
    }

    public final void x4() {
        this.f126790h.g();
        this.f126791i.g();
        this.f126792j.g();
        this.f126793k.g();
    }

    public final void y4(mp.b bVar) {
        p2 p2Var;
        Object value;
        bVar.getClass();
        p2 p2Var2 = this.f126786d;
        if (!bVar.equals(p2Var2.getValue())) {
            do {
                p2Var = this.f126788f;
                value = p2Var.getValue();
            } while (!p2Var.b(value, qp.d.a((qp.d) value, false, false, null, null, null, null, null, i53.a.c(), 255)));
        }
        p2Var2.k(null, bVar);
        x4();
    }

    public /* synthetic */ c(x0 x0Var, x0 x0Var2, lp.i iVar, lp.d dVar, lp.f fVar, lp.a aVar, int i14, j jVar) {
        this(x0Var, (i14 & 2) != 0 ? null : x0Var2, iVar, dVar, fVar, aVar);
    }
}
