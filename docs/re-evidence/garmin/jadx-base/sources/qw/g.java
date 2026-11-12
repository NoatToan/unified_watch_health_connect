package qw;

import android.content.Context;
import androidx.lifecycle.t1;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.w0;
import c22.s1;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import java.sql.Date;
import java.util.List;
import kw.m;
import kw.o;
import o13.r;
import o53.b0;
import o53.i0;
import okhttp3.OkHttpClient;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import p13.w;
import r53.b2;
import r53.p2;
import r53.q2;
import r53.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lqw/g;", "Landroidx/lifecycle/u1;", "<init>", "()V", "b", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends u1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final t60.a f148245k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw.b f148246a = (lw.b) KoinJavaComponent.get$default(lw.b.class, null, null, 6, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t60.h f148247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f148248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b2 f148249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f148250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f148251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w0 f148252g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u82.a f148253h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u82.a f148254i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u82.a f148255j;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.blood_pressure.presentation.BloodPressureReportsViewModel$1", f = "BloodPressureReportsViewModel.kt", l = {78}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f148256a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return g.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f148256a;
            if (i14 == 0) {
                r.b(obj);
                t60.h hVar = g.this.f148247b;
                t60.a aVar2 = g.f148245k;
                this.f148256a = 1;
                if (hVar.b(aVar2, this) == aVar) {
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

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f148258a;

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
            f148258a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lkw/i;", "<anonymous>", "(Lo82/a;)Lkw/i;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.blood_pressure.presentation.BloodPressureReportsViewModel$dailyReportsDataState$1", f = "BloodPressureReportsViewModel.kt", l = {120, 128}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<o82.a, t13.d<? super kw.i>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public m f148259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f148260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f148261c;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = g.this.new d(dVar);
            dVar2.f148261c = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super kw.i> dVar) {
            return ((d) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            m mVar;
            DateTime dateTimeAtStartOfDay;
            DateTime dateTimeAtStartOfDay2;
            m mVar2;
            Exception e4;
            o82.a aVar = (o82.a) this.f148261c;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f148260b;
            g gVar = g.this;
            kw.h hVar = null;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    lw.b bVar = gVar.f148246a;
                    this.f148261c = aVar;
                    this.f148260b = 1;
                    obj = bVar.b(this);
                    if (obj != aVar2) {
                    }
                    return aVar2;
                }
                if (i14 != 1) {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mVar2 = this.f148259a;
                    try {
                        r.b(obj);
                        hVar = (kw.h) obj;
                    } catch (Exception e14) {
                        e4 = e14;
                        String strN = fb1.c.n("Error fetching daily blood pressure summary: ", e4.getMessage());
                        i2.a aVar3 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar3.getClass();
                        i2.a.f(a2Var, "BloodPressureReportsViewModel", strN);
                    }
                    return new kw.i(hVar, mVar2);
                }
                r.b(obj);
                lw.b bVar2 = gVar.f148246a;
                dateTimeAtStartOfDay.getClass();
                dateTimeAtStartOfDay2.getClass();
                i0<kw.h> i0VarI = bVar2.i(dateTimeAtStartOfDay, dateTimeAtStartOfDay2);
                this.f148261c = null;
                this.f148259a = mVar;
                this.f148260b = 2;
                Object objAwait = i0VarI.await(this);
                if (objAwait != aVar2) {
                    mVar2 = mVar;
                    obj = objAwait;
                    hVar = (kw.h) obj;
                    return new kw.i(hVar, mVar2);
                }
                return aVar2;
            } catch (Exception e15) {
                mVar2 = mVar;
                e4 = e15;
                String strN2 = fb1.c.n("Error fetching daily blood pressure summary: ", e4.getMessage());
                i2.a aVar4 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar4.getClass();
                i2.a.f(a2Var2, "BloodPressureReportsViewModel", strN2);
            }
            mVar = (m) obj;
            dateTimeAtStartOfDay = g22.l.h(aVar.f130843a).toDateTimeAtStartOfDay();
            dateTimeAtStartOfDay2 = g22.l.h(aVar.f130844b).toDateTimeAtStartOfDay();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lkw/p;", "<anonymous>", "(Lo82/a;)Lkw/p;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.blood_pressure.presentation.BloodPressureReportsViewModel$detailsDataState$1", f = "BloodPressureReportsViewModel.kt", l = {107, 108}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements p<o82.a, t13.d<? super kw.p>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o f148263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f148264b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f148265c;

        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            e eVar = g.this.new e(dVar);
            eVar.f148265c = obj;
            return eVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super kw.p> dVar) {
            return ((e) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
        
            if (r8 == r1) goto L15;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            o oVar;
            o82.a aVar = (o82.a) this.f148265c;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f148264b;
            g gVar = g.this;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oVar = this.f148263a;
                    r.b(obj);
                }
                return new kw.p(oVar, (m) obj);
            }
            r.b(obj);
            DateTime dateTimeAtStartOfDay = g22.l.h(aVar.f130843a).toDateTimeAtStartOfDay();
            lw.b bVar = gVar.f148246a;
            dateTimeAtStartOfDay.getClass();
            i0<o> i0VarD = bVar.d(dateTimeAtStartOfDay);
            this.f148265c = null;
            this.f148264b = 1;
            obj = i0VarD.await(this);
            if (obj != aVar2) {
            }
            return aVar2;
            oVar = (o) obj;
            lw.b bVar2 = gVar.f148246a;
            this.f148265c = null;
            this.f148263a = oVar;
            this.f148264b = 2;
            obj = bVar2.b(this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lkw/i;", "<anonymous>", "(Lo82/a;)Lkw/i;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.blood_pressure.presentation.BloodPressureReportsViewModel$weeklyReportsDataState$1", f = "BloodPressureReportsViewModel.kt", l = {SyslogConstants.LOG_LOCAL2, SyslogConstants.LOG_LOCAL3}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements p<o82.a, t13.d<? super kw.i>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public m f148267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f148268b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f148269c;

        public f(t13.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            f fVar = g.this.new f(dVar);
            fVar.f148269c = obj;
            return fVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super kw.i> dVar) {
            return ((f) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            m mVar;
            DateTime dateTimeAtStartOfDay;
            DateTime dateTimeAtStartOfDay2;
            m mVar2;
            Exception e4;
            o82.a aVar = (o82.a) this.f148269c;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f148268b;
            g gVar = g.this;
            kw.h hVar = null;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    lw.b bVar = gVar.f148246a;
                    this.f148269c = aVar;
                    this.f148268b = 1;
                    obj = bVar.b(this);
                    if (obj != aVar2) {
                    }
                    return aVar2;
                }
                if (i14 != 1) {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mVar2 = this.f148267a;
                    try {
                        r.b(obj);
                        hVar = (kw.h) obj;
                    } catch (Exception e14) {
                        e4 = e14;
                        String strN = fb1.c.n("Error fetching weekly blood pressure summary: ", e4.getMessage());
                        i2.a aVar3 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar3.getClass();
                        i2.a.f(a2Var, "BloodPressureReportsViewModel", strN);
                    }
                    return new kw.i(hVar, mVar2);
                }
                r.b(obj);
                lw.b bVar2 = gVar.f148246a;
                dateTimeAtStartOfDay.getClass();
                dateTimeAtStartOfDay2.getClass();
                i0<kw.h> i0VarJ = bVar2.j(dateTimeAtStartOfDay, dateTimeAtStartOfDay2);
                this.f148269c = null;
                this.f148267a = mVar;
                this.f148268b = 2;
                Object objAwait = i0VarJ.await(this);
                if (objAwait != aVar2) {
                    mVar2 = mVar;
                    obj = objAwait;
                    hVar = (kw.h) obj;
                    return new kw.i(hVar, mVar2);
                }
                return aVar2;
            } catch (Exception e15) {
                mVar2 = mVar;
                e4 = e15;
                String strN2 = fb1.c.n("Error fetching weekly blood pressure summary: ", e4.getMessage());
                i2.a aVar4 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar4.getClass();
                i2.a.f(a2Var2, "BloodPressureReportsViewModel", strN2);
            }
            mVar = (m) obj;
            dateTimeAtStartOfDay = g22.l.h(aVar.f130843a).toDateTimeAtStartOfDay();
            dateTimeAtStartOfDay2 = g22.l.h(aVar.f130844b).toDateTimeAtStartOfDay();
        }
    }

    static {
        new b(null);
        f148245k = t60.a.BPM_BANNER;
    }

    public g() {
        t60.h hVar = (t60.h) KoinJavaComponent.get$default(t60.h.class, null, null, 6, null);
        this.f148247b = hVar;
        p2 p2VarA = q2.a(new l(null, null, null, null, false, 31, null));
        this.f148248c = p2VarA;
        this.f148249d = s.d(p2VarA);
        p2 p2VarA2 = q2.a(i53.a.e(j0.f134944a));
        this.f148250e = p2VarA2;
        this.f148251f = p2VarA2;
        ge1.b.T(v1.a(this), null, null, new a(null), 3);
        this.f148252g = t1.a(hVar.getF162729b(), new qv1.l(1));
        this.f148253h = new u82.a(v1.a(this), new y82.e(new y82.c(new e(null)), null, 2, null), false, 4, null);
        this.f148254i = new u82.a(v1.a(this), new y82.e(new y82.c(new d(null)), null, 2, null), false, 4, null);
        this.f148255j = new u82.a(v1.a(this), new y82.e(new y82.c(new f(null)), null, 2, null), false, 4, null);
    }

    public static pa2.a x4(Date date, Date date2, yw.e eVar, String str) {
        bz0.o.f22274a.getClass();
        OkHttpClient okHttpClientB = bz0.o.b();
        String strK = ((zy0.l) KoinJavaComponent.get$default(zy0.l.class, null, null, 6, null)).k(ez0.c.GC);
        s1 s1Var = s1.f23251a;
        Context contextC = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
        s1Var.getClass();
        return new pa2.a("BloodPressure", "bloodpressure", strK, okHttpClientB, 0, false, s1.e(contextC), date, date2, "Garmin_BloodPressure", new qa2.j(eVar.name(), null, w.c("string"), "string", 2, null), str, 48, null);
    }

    public final void y4(pw.a aVar) {
        while (true) {
            p2 p2Var = this.f148248c;
            Object value = p2Var.getValue();
            pw.a aVar2 = aVar;
            if (p2Var.b(value, l.a((l) value, null, null, null, aVar2, false, 23))) {
                return;
            } else {
                aVar = aVar2;
            }
        }
    }

    public final void z4(List<kw.l> list) {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f148248c;
            value = p2Var.getValue();
        } while (!p2Var.b(value, l.a((l) value, null, null, null, null, list != null ? !list.isEmpty() : false, 15)));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lqw/g$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lt60/a;", "BPM_BANNER", "Lt60/a;", "REPORTS_FEATURE_NAME", "REPORTS_FEATURE_API", "REPORTS_FEATURE_PREFIX_NAME", "CROSS_SELLING_ITEM_TAG", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
