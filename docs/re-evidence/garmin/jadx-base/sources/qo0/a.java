package qo0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import aq1.d0;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import do0.f;
import e23.p;
import g22.l;
import gs1.t;
import java.util.Collection;
import java.util.List;
import java.util.TreeMap;
import o13.r;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.j0;
import p13.u0;
import r53.b2;
import r53.m1;
import r53.p2;
import r53.q2;
import r53.s;
import tf0.i;
import zd0.g;
import zd0.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lqo0/a;", "Landroidx/lifecycle/u1;", "<init>", "()V", "b", "gcm-heart-rate_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends u1 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f145915p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final is1.e f145916a = new is1.e(null, 1, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f145917b = new f(null, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bo0.a f145918c = (bo0.a) KoinJavaComponent.get$default(bo0.a.class, null, null, 6, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f145919d = (h) KoinJavaComponent.get$default(h.class, null, null, 6, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f145920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b2 f145921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f145922g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f145923h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f145924i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2 f145925j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2 f145926k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f145927l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u82.a f145928m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u82.a f145929n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final u82.a f145930o;

    /* JADX INFO: renamed from: qo0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.heartrate.presentation.viewmodel.HeartRateViewModel$2", f = "HeartRateViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C2748a extends v13.i implements p<Boolean, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ boolean f145931a;

        public C2748a(t13.d<? super C2748a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C2748a c2748a = a.this.new C2748a(dVar);
            c2748a.f145931a = ((Boolean) obj).booleanValue();
            return c2748a;
        }

        @Override // e23.p
        public final Object invoke(Boolean bool, t13.d<? super Unit> dVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((C2748a) create(bool2, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            boolean z14 = this.f145931a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            p2 p2Var = a.this.f145920e;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, qo0.d.a((qo0.d) value, false, false, false, false, null, null, null, z14, 127)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lco0/c;", "<anonymous>", "(Lo82/a;)Lco0/c;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.heartrate.presentation.viewmodel.HeartRateViewModel$dailyReportsDataState$1", f = "HeartRateViewModel.kt", l = {111}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<o82.a, t13.d<? super co0.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public DateTime f145933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public DateTime f145934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f145935c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f145936d;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = a.this.new c(dVar);
            cVar.f145936d = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super co0.c> dVar) {
            return ((c) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            DateTime dateTimeAtStartOfDay;
            DateTime dateTime;
            o82.a aVar = (o82.a) this.f145936d;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f145935c;
            a aVar3 = a.this;
            if (i14 == 0) {
                r.b(obj);
                DateTime dateTimeAtStartOfDay2 = l.h(aVar.f130843a).toDateTimeAtStartOfDay();
                dateTimeAtStartOfDay = l.h(aVar.f130844b).toDateTimeAtStartOfDay();
                f fVar = aVar3.f145917b;
                dateTimeAtStartOfDay2.getClass();
                dateTimeAtStartOfDay.getClass();
                this.f145936d = null;
                this.f145933a = dateTimeAtStartOfDay2;
                this.f145934b = dateTimeAtStartOfDay;
                this.f145935c = 1;
                fVar.getClass();
                Object objJ = f0.J(fVar, new do0.d(fVar, dateTimeAtStartOfDay2, dateTimeAtStartOfDay, null), this);
                if (objJ == aVar2) {
                    return aVar2;
                }
                dateTime = dateTimeAtStartOfDay2;
                obj = objJ;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dateTimeAtStartOfDay = this.f145934b;
                DateTime dateTime2 = this.f145933a;
                r.b(obj);
                dateTime = dateTime2;
            }
            DateTime dateTime3 = dateTimeAtStartOfDay;
            v2 v2VarA = qo0.c.a((v2) obj);
            if (!(v2VarA instanceof v2.b)) {
                throw ((v2.a) v2VarA).f47383a;
            }
            co0.c cVar = (co0.c) ((v2.b) v2VarA).f47386a;
            dateTime.getClass();
            dateTime3.getClass();
            int i15 = a.f145915p;
            aVar3.getClass();
            TreeMap treeMap = new TreeMap();
            u0.k(treeMap, new o13.p[0]);
            List list = cVar.f28124a;
            if (list == null) {
                list = j0.f134944a;
            }
            new e32.d(null, 1, null).a(dateTime, dateTime3, treeMap, 1, new d0(list, 22));
            Collection collectionValues = treeMap.values();
            collectionValues.getClass();
            return new co0.c(h0.b1(collectionValues));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lgs1/t;", "<anonymous>", "(Lo82/a;)Lgs1/t;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.heartrate.presentation.viewmodel.HeartRateViewModel$detailsDataState$1", f = "HeartRateViewModel.kt", l = {97}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<o82.a, t13.d<? super t>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f145938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f145939b;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = a.this.new d(dVar);
            dVar2.f145939b = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super t> dVar) {
            return ((d) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            o82.a aVar = (o82.a) this.f145939b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f145938a;
            if (i14 == 0) {
                r.b(obj);
                DateTime dateTimeAtStartOfDay = l.h(aVar.f130843a).toDateTimeAtStartOfDay();
                is1.e eVar = a.this.f145916a;
                dateTimeAtStartOfDay.getClass();
                this.f145939b = null;
                this.f145938a = 1;
                obj = eVar.a(dateTimeAtStartOfDay, this);
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
            if (v2Var instanceof v2.a) {
                throw ((v2.a) v2Var).f47383a;
            }
            v2Var.getClass();
            return (t) ((v2.b) v2Var).f47386a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lco0/c;", "<anonymous>", "(Lo82/a;)Lco0/c;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.heartrate.presentation.viewmodel.HeartRateViewModel$weeklyReportsDataState$1", f = "HeartRateViewModel.kt", l = {129}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements p<o82.a, t13.d<? super co0.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f145941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f145942b;

        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            e eVar = a.this.new e(dVar);
            eVar.f145942b = obj;
            return eVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super co0.c> dVar) {
            return ((e) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            o82.a aVar = (o82.a) this.f145942b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f145941a;
            if (i14 == 0) {
                r.b(obj);
                f fVar = a.this.f145917b;
                DateTime dateTimeK = vb.h.k(aVar.f130844b);
                this.f145942b = null;
                this.f145941a = 1;
                fVar.getClass();
                obj = f0.J(fVar, new do0.e(fVar, dateTimeK, 52, null), this);
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
            v2 v2VarA = qo0.c.a((v2) obj);
            if (v2VarA instanceof v2.a) {
                throw ((v2.a) v2VarA).f47383a;
            }
            return (co0.c) ((v2.b) v2VarA).f47386a;
        }
    }

    static {
        new b(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        Object value;
        p2 p2VarA = q2.a(new qo0.d(false, false, false, false, null, null, null, false, 255, null));
        this.f145920e = p2VarA;
        this.f145921f = s.d(p2VarA);
        this.f145922g = q2.a(Boolean.TRUE);
        do {
            value = p2VarA.getValue();
        } while (!p2VarA.b(value, qo0.d.a((qo0.d) value, false, this.f145918c.c(), this.f145918c.d(), false, null, null, null, false, 248)));
        h hVar = this.f145919d;
        hVar.getClass();
        s.C(new m1(s.f(new g(hVar, null)), new C2748a(null)), v1.a(this));
        p2 p2VarA2 = q2.a(null);
        this.f145923h = p2VarA2;
        this.f145924i = p2VarA2;
        p2 p2VarA3 = q2.a(null);
        this.f145925j = p2VarA3;
        this.f145926k = p2VarA3;
        this.f145927l = new i(v1.a(this), null, 2, null);
        this.f145928m = new u82.a(v1.a(this), new y82.e(new y82.c(new d(null)), null, 2, null), false, 4, null);
        this.f145929n = new u82.a(v1.a(this), new y82.e(new y82.c(new c(null)), null, 2, null), false, 4, null);
        this.f145930o = new u82.a(v1.a(this), new y82.e(new y82.c(new e(null)), null, 2, null), false, 4, null);
    }

    public final void x4(gs1.d.b bVar) {
        while (true) {
            p2 p2Var = this.f145920e;
            Object value = p2Var.getValue();
            gs1.d.b bVar2 = bVar;
            if (p2Var.b(value, qo0.d.a((qo0.d) value, false, false, false, false, null, null, bVar2, false, 191))) {
                return;
            } else {
                bVar = bVar2;
            }
        }
    }

    public final void y4() {
        p2 p2Var;
        Object value;
        qo0.d dVarA;
        do {
            p2Var = this.f145920e;
            value = p2Var.getValue();
            qo0.d dVar = (qo0.d) value;
            boolean z14 = dVar.f145950d;
            bo0.a aVar = this.f145918c;
            if (z14) {
                aVar.b();
                dVarA = qo0.d.a(dVar, false, false, false, false, null, null, null, false, 253);
            } else {
                aVar.a();
                dVarA = qo0.d.a(dVar, false, false, false, false, null, null, null, false, 251);
            }
        } while (!p2Var.b(value, dVarA));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lqo0/a$b;", "", "<init>", "()V", "", "DAYS_DELTA_DAILY", "I", "gcm-heart-rate_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }
}
