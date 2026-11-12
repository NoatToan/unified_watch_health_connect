package ep;

import am.i0;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import c22.j0;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import e23.q;
import java.util.ArrayList;
import lc.u0;
import m92.h0;
import o13.r;
import o4.d0;
import o53.s0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;
import ps.i1;
import r53.a2;
import r53.b2;
import r53.c2;
import r53.e2;
import r53.g2;
import r53.m1;
import r53.p2;
import r53.q2;
import r53.s;
import r53.w;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lep/o;", "Landroidx/lifecycle/u1;", "Lam/m;", "activityRepo", "Lam/d;", "activityDelegate", "<init>", "(Lam/m;Lam/d;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final am.m f64842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final am.e f64843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f64844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b2 f64845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f64846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b2 f64847f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e2 f64848g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a2 f64849h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f64850i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b2 f64851j;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f64852a;

        static {
            int[] iArr = new int[ep.c.values().length];
            try {
                iArr[ep.c.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ep.c.LAST_4_WEEKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ep.c.LAST_3_MONTHS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ep.c.LAST_12_MONTHS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ep.c.CUSTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f64852a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lps/i1;", "result", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.powercurve.PowerCurveViewModel$getPeakPowerCurve$1", f = "PowerCurveViewModel.kt", l = {174}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<v2<? extends i1>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f64853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f64854b;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = o.this.new c(dVar);
            cVar.f64854b = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(v2<? extends i1> v2Var, t13.d<? super Unit> dVar) {
            return ((c) create(v2Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            v2 v2Var = (v2) this.f64854b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f64853a;
            int i15 = 1;
            if (i14 == 0) {
                r.b(obj);
                boolean z14 = v2Var instanceof v2.b;
                o oVar = o.this;
                if (z14) {
                    i53.c<ep.b> cVarE = i53.a.e(ep.d.a((i1) ((v2.b) v2Var).f47386a));
                    p2 p2Var = oVar.f64850i;
                    while (true) {
                        Object value = p2Var.getValue();
                        n nVar = (n) value;
                        double d14 = 1.0d;
                        if (nVar.f64839b) {
                            double d15 = nVar.f64838a;
                            if (d15 > 0.0d) {
                                d14 = 1.0d / d15;
                            }
                        }
                        ArrayList arrayList = new ArrayList(y.r(cVarE, 10));
                        for (ep.b bVar : cVarE) {
                            h0.e.a aVar2 = bVar.f64801a;
                            arrayList.add(new ep.b(h0.e.a.a(aVar2, 0.0f, (float) (((double) aVar2.f117347b) * d14), i15), bVar.f64802b, bVar.f64803c, bVar.f64804d, bVar.f64805e));
                            i15 = 1;
                        }
                        if (p2Var.b(value, n.a(nVar, false, null, e.a(nVar.f64841d, null, i53.a.e(arrayList), 13), 7))) {
                            break;
                        }
                        i15 = 1;
                    }
                } else {
                    if (!(v2Var instanceof v2.a)) {
                        u0.r();
                        return null;
                    }
                    e2 e2Var = oVar.f64848g;
                    Boolean bool = Boolean.TRUE;
                    this.f64854b = null;
                    this.f64853a = 1;
                    if (e2Var.emit(bool, this) == aVar) {
                        return aVar;
                    }
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

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lps/i1;", "", "<unused var>", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.powercurve.PowerCurveViewModel$getPeakPowerCurve$2", f = "PowerCurveViewModel.kt", l = {177}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements q<r53.j<? super v2<? extends i1>>, Throwable, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f64856a;

        public d(t13.d<? super d> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super v2<? extends i1>> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            return o.this.new d(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f64856a;
            if (i14 == 0) {
                r.b(obj);
                e2 e2Var = o.this.f64848g;
                Boolean bool = Boolean.TRUE;
                this.f64856a = 1;
                if (e2Var.emit(bool, this) == aVar) {
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

    static {
        new a(null);
    }

    public o(am.m mVar, am.d dVar) {
        mVar.getClass();
        dVar.getClass();
        this.f64842a = mVar;
        am.f fVarY = dVar.Y();
        this.f64843b = fVarY;
        f12.l lVar = fVarY.f3932a;
        String strA4 = lVar.A4("key_start_date_power_curve", "");
        p2 p2VarA = q2.a(strA4 == null ? "" : strA4);
        this.f64844c = p2VarA;
        this.f64845d = s.d(p2VarA);
        String strA5 = lVar.A4("key_end_date_power_curve", "");
        p2 p2VarA2 = q2.a(strA5 != null ? strA5 : "");
        this.f64846e = p2VarA2;
        this.f64847f = s.d(p2VarA2);
        e2 e2VarB = g2.b(0, 0, null, 7);
        this.f64848g = e2VarB;
        this.f64849h = s.c(e2VarB);
        j53.j jVarB = j53.l.b();
        j53.j jVarB2 = j53.l.b();
        d0.f128823b.getClass();
        long j8 = d0.f128831j;
        p2 p2VarA3 = q2.a(new n(0.0d, false, null, new e(jVarB, jVarB2, j8, j8, null), 4, null));
        this.f64850i = p2VarA3;
        this.f64851j = s.d(p2VarA3);
    }

    public final void x4(Long l14, Long l15) {
        String strB = l14 != null ? j0.b(new DateTime(l14.longValue()), "yyyy-MM-dd", null) : null;
        String strB2 = l15 != null ? j0.b(new DateTime(l15.longValue()), "yyyy-MM-dd", null) : null;
        am.m mVar = this.f64842a;
        mVar.getClass();
        c2 c2Var = new c2(new i0(mVar, "cycling", strB, strB2, null));
        x53.c cVar = s0.f129406a;
        s.C(new w(new m1(s.A(c2Var, x53.b.f189152a), new c(null)), new d(null)), v1.a(this));
    }

    public final void y4(ep.c cVar) {
        p2 p2Var;
        Object value;
        cVar.getClass();
        do {
            p2Var = this.f64850i;
            value = p2Var.getValue();
        } while (!p2Var.b(value, n.a((n) value, false, cVar, null, 11)));
        DateTime dateTimeNow = DateTime.now();
        int i14 = b.f64852a[cVar.ordinal()];
        if (i14 == 1) {
            x4(null, null);
            return;
        }
        if (i14 == 2) {
            x4(Long.valueOf(dateTimeNow.minusWeeks(4).getMillis()), Long.valueOf(dateTimeNow.getMillis()));
            return;
        }
        if (i14 == 3) {
            x4(Long.valueOf(dateTimeNow.minusMonths(3).getMillis()), Long.valueOf(dateTimeNow.getMillis()));
        } else if (i14 == 4) {
            x4(Long.valueOf(dateTimeNow.minusMonths(12).getMillis()), Long.valueOf(dateTimeNow.getMillis()));
        } else {
            if (i14 == 5) {
                return;
            }
            u0.r();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lep/o$a;", "", "<init>", "()V", "", "SPORT", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
