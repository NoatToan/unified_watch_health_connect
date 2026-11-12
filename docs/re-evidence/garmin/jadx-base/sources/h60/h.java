package h60;

import android.os.Bundle;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import g22.l;
import lc.u0;
import o13.r;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.p2;
import r53.q2;
import r53.s;
import tn.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lh60/h;", "Landroidx/lifecycle/u1;", "Lg60/c;", "criticalSwimSpeedRepository", "Lq60/b;", "criticalSwimSpeedSummaryRepository", "<init>", "(Lg60/c;Lq60/b;)V", "a", "gcm-critical-swim-speed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends u1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f82164j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g60.c f82165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q60.b f82166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Logger f82167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g60.b f82168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f82169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b2 f82170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u82.a f82171g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u82.a f82172h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u82.a f82173i;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f82174a;

        static {
            int[] iArr = new int[o82.g.values().length];
            try {
                iArr[o82.g.f130849b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o82.g.f130851d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o82.g.f130854g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o82.g.f130856i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f82174a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lg60/b;", "<anonymous>", "(Lo82/a;)Lg60/b;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.criticalswimspeed.summary.CriticalSwimSpeedReportsViewModel$currentReportsDataState$1", f = "CriticalSwimSpeedReportsViewModel.kt", l = {59}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<o82.a, t13.d<? super g60.b>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f82175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f82176b;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = h.this.new c(dVar);
            cVar.f82176b = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super g60.b> dVar) {
            return ((c) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o82.a aVar = (o82.a) this.f82176b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f82175a;
            h hVar = h.this;
            if (i14 == 0) {
                r.b(obj);
                DateTime dateTimeAtStartOfDay = l.h(aVar.f130843a).toDateTimeAtStartOfDay();
                g60.c cVar = hVar.f82165a;
                dateTimeAtStartOfDay.getClass();
                this.f82176b = null;
                this.f82175a = 1;
                obj = cVar.b(dateTimeAtStartOfDay, this);
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
            if (v2Var instanceof v2.b) {
                g60.b bVar = (g60.b) ((v2.b) v2Var).f47386a;
                hVar.f82168d = bVar;
                return bVar;
            }
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            hVar.f82168d = null;
            String str = h.f82164j;
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var, str, "Failed to get latest critical swim speed.");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Ln60/b;", "<anonymous>", "(Lo82/a;)Ln60/b;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.criticalswimspeed.summary.CriticalSwimSpeedReportsViewModel$dailyReportsDataState$1", f = "CriticalSwimSpeedReportsViewModel.kt", l = {83}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<o82.a, t13.d<? super n60.b>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public DateTime f82178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public DateTime f82179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f82180c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f82181d;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = h.this.new d(dVar);
            dVar2.f82181d = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super n60.b> dVar) {
            return ((d) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            DateTime dateTimeAtStartOfDay;
            DateTime dateTime;
            o82.a aVar = (o82.a) this.f82181d;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f82180c;
            if (i14 == 0) {
                r.b(obj);
                DateTime dateTimeAtStartOfDay2 = l.h(aVar.f130843a).toDateTimeAtStartOfDay();
                dateTimeAtStartOfDay = l.h(aVar.f130844b).toDateTimeAtStartOfDay();
                q60.b bVar = h.this.f82166b;
                dateTimeAtStartOfDay2.getClass();
                dateTimeAtStartOfDay.getClass();
                this.f82181d = null;
                this.f82178a = dateTimeAtStartOfDay2;
                this.f82179b = dateTimeAtStartOfDay;
                this.f82180c = 1;
                Object objA = bVar.a(dateTimeAtStartOfDay2, dateTimeAtStartOfDay, "daily", this);
                if (objA == aVar2) {
                    return aVar2;
                }
                dateTime = dateTimeAtStartOfDay2;
                obj = objA;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dateTimeAtStartOfDay = this.f82179b;
                dateTime = this.f82178a;
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                return (n60.b) ((v2.b) v2Var).f47386a;
            }
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String str = h.f82164j;
            String str2 = "Failed to get critical swim speed 7d summary for interval " + dateTime + " - " + dateTimeAtStartOfDay + ".";
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var, str, str2);
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Ln60/b;", "<anonymous>", "(Lo82/a;)Ln60/b;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.criticalswimspeed.summary.CriticalSwimSpeedReportsViewModel$weeklyReportsDataState$1", f = "CriticalSwimSpeedReportsViewModel.kt", l = {105}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements p<o82.a, t13.d<? super n60.b>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public DateTime f82183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public DateTime f82184b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f82185c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f82186d;

        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            e eVar = h.this.new e(dVar);
            eVar.f82186d = obj;
            return eVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super n60.b> dVar) {
            return ((e) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            DateTime dateTimeAtStartOfDay;
            DateTime dateTime;
            o82.a aVar = (o82.a) this.f82186d;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f82185c;
            if (i14 == 0) {
                r.b(obj);
                DateTime dateTimeAtStartOfDay2 = l.h(aVar.f130843a).toDateTimeAtStartOfDay();
                dateTimeAtStartOfDay = l.h(aVar.f130844b).toDateTimeAtStartOfDay();
                q60.b bVar = h.this.f82166b;
                dateTimeAtStartOfDay2.getClass();
                dateTimeAtStartOfDay.getClass();
                this.f82186d = null;
                this.f82183a = dateTimeAtStartOfDay2;
                this.f82184b = dateTimeAtStartOfDay;
                this.f82185c = 1;
                Object objA = bVar.a(dateTimeAtStartOfDay2, dateTimeAtStartOfDay, "weekly", this);
                if (objA == aVar2) {
                    return aVar2;
                }
                dateTime = dateTimeAtStartOfDay2;
                obj = objA;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dateTimeAtStartOfDay = this.f82184b;
                dateTime = this.f82183a;
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                return (n60.b) ((v2.b) v2Var).f47386a;
            }
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String str = h.f82164j;
            String str2 = "Failed to get critical swim speed weekly summary for interval " + dateTime + " - " + dateTimeAtStartOfDay + ".";
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var, str, str2);
            return null;
        }
    }

    static {
        new a(null);
        f82164j = h.class.getSimpleName();
    }

    public h(g60.c cVar, q60.b bVar) {
        cVar.getClass();
        bVar.getClass();
        this.f82165a = cVar;
        this.f82166b = bVar;
        this.f82167c = gt2.c.b(a2.CRITICAL_SWIM_SPEED.f28756a);
        p005kotlin.jvm.internal.j jVar = null;
        p2 p2VarA = q2.a(new j(false, null, null, 7, null));
        this.f82169e = p2VarA;
        this.f82170f = s.d(p2VarA);
        int i14 = 4;
        this.f82171g = new u82.a(v1.a(this), new y82.e(new y82.c(new c(null)), null, 2, null), false, i14, jVar);
        this.f82172h = new u82.a(v1.a(this), new y82.e(new y82.c(new d(null)), null, 2, null), false, 4, null);
        this.f82173i = new u82.a(v1.a(this), new y82.e(new y82.c(new e(null)), null, 2, null), false, i14, jVar);
    }

    public static void x4(o82.g gVar, String str) {
        gVar.getClass();
        Bundle bundleD = k.d("Screen", b.f82174a[gVar.ordinal()] == 1 ? "CssOneDayView" : "CssReports", "ReportsAction", str);
        ht.a.f85464a.getClass();
        ht.a.a(bundleD, "UserAction");
    }

    public final void y4(g60.b bVar) {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f82169e;
            value = p2Var.getValue();
        } while (!p2Var.b(value, j.a((j) value, bVar, null, 5)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lh60/h$a;", "", "<init>", "()V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "DAILY_AGGREGATION", "WEEKLY_AGGREGATION", "gcm-critical-swim-speed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public h() {
        this(null, null, 3, null);
    }

    public h(g60.c cVar, q60.b bVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 1) != 0) {
            g60.c.R.getClass();
            cVar = g60.c.a.a();
        }
        if ((i14 & 2) != 0) {
            q60.b.f143159q0.getClass();
            q60.a.f143157a.getClass();
            bVar = new q60.e((q60.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, q60.a.class, new c83.h.a[0], null, null, null, 120));
        }
        this(cVar, bVar);
    }
}
