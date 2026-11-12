package ih0;

import androidx.lifecycle.t1;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.w0;
import c22.s3;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.v2;
import id0.p5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import o53.b0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.c0;
import p13.h0;
import p13.x;
import p13.y;
import r1.q2;
import r53.b2;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lih0/s;", "Landroidx/lifecycle/u1;", "Leh0/b;", "fitnessAgeRepository", "Lbh0/a;", "fitnessAgePreferences", "Lt60/h;", "crossSellingPreferences", "Lf12/l;", "userSettings", "<init>", "(Leh0/b;Lbh0/a;Lt60/h;Lf12/l;)V", "b", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s extends u1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final t60.a f93481l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eh0.b f93482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bh0.a f93483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t60.h f93484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f12.l f93485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f93486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b2 f93487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f93488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w0 f93489h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u82.a f93490i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u82.a f93491j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u82.a f93492k;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.fitness_age.presentation.FitnessAgeReportsViewModel$1", f = "FitnessAgeReportsViewModel.kt", l = {61}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f93493a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return s.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f93493a;
            if (i14 == 0) {
                o13.r.b(obj);
                if (!s3.b()) {
                    t60.h hVar = s.this.f93484c;
                    t60.a aVar2 = s.f93481l;
                    this.f93493a = 1;
                    if (hVar.b(aVar2, this) == aVar) {
                        return aVar;
                    }
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
        public static final /* synthetic */ int[] f93495a;

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
            f93495a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Ldh0/a;", "<anonymous>", "(Lo82/a;)Ldh0/a;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.fitness_age.presentation.FitnessAgeReportsViewModel$currentReportsDataState$1", f = "FitnessAgeReportsViewModel.kt", l = {90}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o82.a, t13.d<? super dh0.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f93496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f93497b;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = s.this.new d(dVar);
            dVar2.f93497b = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super dh0.a> dVar) {
            return ((d) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:49:0x00cc  */
        /* JADX WARN: Code duplicated, block: B:61:0x00ee  */
        /* JADX WARN: Code duplicated, block: B:63:0x00f1  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            boolean z14;
            Object value;
            boolean z15;
            boolean z16;
            Boolean boolValueOf;
            o82.a aVar = (o82.a) this.f93497b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f93496a;
            s sVar = s.this;
            if (i14 == 0) {
                o13.r.b(obj);
                eh0.b bVar = sVar.f93482a;
                b63.o oVar = aVar.f130843a;
                this.f93497b = null;
                this.f93496a = 1;
                obj = bVar.b(oVar, this);
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
            if (!(v2Var instanceof v2.b)) {
                q2.u("Error fetching current fitness age data");
                return null;
            }
            dh0.a aVarI = lg.d.I((dh0.c) ((v2.b) v2Var).f47386a);
            List<dh0.d> list = aVarI.f59546e;
            t60.a aVar3 = s.f93481l;
            sVar.getClass();
            if (aVarI.f59549h == null) {
                Double d14 = aVarI.f59543b;
                Double d15 = aVarI.f59545d;
                Double d16 = aVarI.f59544c;
                if (d14 == null || d16 == null) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(d14.doubleValue() <= d16.doubleValue());
                }
                LocalDate localDateNow = LocalDate.now();
                localDateNow.getClass();
                bh0.a aVar4 = sVar.f93483b;
                Double dE = aVar4.e();
                Double d17 = aVar4.d();
                if (d14 != null && d15 != null && (!p005kotlin.jvm.internal.s.d(d14, dE) || !p005kotlin.jvm.internal.s.d(d15, d17))) {
                    aVar4.a(d14);
                    aVar4.b(d15);
                    if (p005kotlin.jvm.internal.s.g(boolValueOf, Boolean.TRUE)) {
                        aVar4.c(null);
                    } else if (d14.doubleValue() < d15.doubleValue()) {
                        aVar4.c(localDateNow);
                    }
                }
            }
            if (sVar.f93488g) {
                dh0.g gVar = dh0.g.BMI;
                gVar.getClass();
                dh0.d dVarA = ih0.g.a(list, gVar);
                if (dVarA == null) {
                    z15 = false;
                } else {
                    Boolean bool = dVarA.f59567d;
                    if ((bool != null ? bool.booleanValue() : false) || !ih0.f.b(dVarA)) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                }
                if (!z15) {
                    dh0.g gVar2 = dh0.g.BODY_FAT;
                    gVar2.getClass();
                    dh0.d dVarA2 = ih0.g.a(list, gVar2);
                    if (dVarA2 == null) {
                        z16 = false;
                    } else {
                        Boolean bool2 = dVarA2.f59567d;
                        if ((bool2 != null ? bool2.booleanValue() : false) || !ih0.f.b(dVarA2)) {
                            z16 = false;
                        } else {
                            z16 = true;
                        }
                    }
                    z14 = z16 ? false : true;
                }
            }
            p2 p2Var = sVar.f93486e;
            do {
                value = p2Var.getValue();
                ((t) value).getClass();
            } while (!p2Var.b(value, new t(z14)));
            return aVarI;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "", "Ldh0/i;", "<anonymous>", "(Lo82/a;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.fitness_age.presentation.FitnessAgeReportsViewModel$dailyReportsDataState$1", f = "FitnessAgeReportsViewModel.kt", l = {109}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<o82.a, t13.d<? super List<? extends dh0.i>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f93499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f93500b;

        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            e eVar = s.this.new e(dVar);
            eVar.f93500b = obj;
            return eVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super List<? extends dh0.i>> dVar) {
            return ((e) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            o82.a aVar = (o82.a) this.f93500b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f93499a;
            if (i14 == 0) {
                o13.r.b(obj);
                eh0.b bVar = s.this.f93482a;
                b63.o oVar = aVar.f130843a;
                b63.o oVar2 = aVar.f130844b;
                this.f93500b = null;
                this.f93499a = 1;
                obj = bVar.c(oVar, oVar2, this);
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
            if (!(v2Var instanceof v2.b)) {
                q2.u("Error fetching daily fitness age data");
                return null;
            }
            Iterable iterable = (Iterable) ((v2.b) v2Var).f47386a;
            ArrayList arrayList = new ArrayList(y.r(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(lg.d.K((dh0.k) it.next()));
            }
            return arrayList;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.fitness_age.presentation.FitnessAgeReportsViewModel$onCrossSellingItemClose$1", f = "FitnessAgeReportsViewModel.kt", l = {146}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f93502a;

        public f(t13.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return s.this.new f(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f93502a;
            if (i14 == 0) {
                o13.r.b(obj);
                t60.h hVar = s.this.f93484c;
                t60.a aVar2 = s.f93481l;
                DateTime dateTimeNow = DateTime.now();
                dateTimeNow.getClass();
                this.f93502a = 1;
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

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "", "Ldh0/i;", "<anonymous>", "(Lo82/a;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.fitness_age.presentation.FitnessAgeReportsViewModel$weeklyReportsDataState$1", f = "FitnessAgeReportsViewModel.kt", l = {125}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements e23.p<o82.a, t13.d<? super List<? extends dh0.i>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f93504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f93505b;

        public g(t13.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            g gVar = s.this.new g(dVar);
            gVar.f93505b = obj;
            return gVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super List<? extends dh0.i>> dVar) {
            return ((g) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            o82.a aVar = (o82.a) this.f93505b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f93504a;
            if (i14 == 0) {
                o13.r.b(obj);
                eh0.b bVar = s.this.f93482a;
                b63.o oVar = aVar.f130844b;
                this.f93505b = null;
                this.f93504a = 1;
                obj = bVar.a(oVar, this);
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
            if (!(v2Var instanceof v2.b)) {
                q2.u("Error fetching weekly fitness age data");
                return null;
            }
            Iterable iterable = (Iterable) ((v2.b) v2Var).f47386a;
            ArrayList arrayList = new ArrayList(y.r(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(lg.d.K((dh0.k) it.next()));
            }
            return arrayList;
        }
    }

    static {
        new b(null);
        f93481l = t60.a.INDEX_BANNER;
    }

    public s(eh0.b bVar, bh0.a aVar, t60.h hVar, f12.l lVar) {
        bVar.getClass();
        aVar.getClass();
        hVar.getClass();
        lVar.getClass();
        this.f93482a = bVar;
        this.f93483b = aVar;
        this.f93484c = hVar;
        this.f93485d = lVar;
        p2 p2VarA = r53.q2.a(new t(false, 1, null));
        this.f93486e = p2VarA;
        this.f93487f = r53.s.d(p2VarA);
        ge1.b.T(v1.a(this), null, null, new a(null), 3);
        this.f93489h = t1.a(hVar.getF162729b(), new ig2.d(5));
        this.f93490i = new u82.a(v1.a(this), new y82.e(new y82.c(new d(null)), null, 2, null), false, 4, null);
        this.f93491j = new u82.a(v1.a(this), new y82.e(new y82.c(new e(null)), null, 2, null), false, 4, null);
        this.f93492k = new u82.a(v1.a(this), new y82.e(new y82.c(new g(null)), null, 2, null), false, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.util.ArrayList, java.util.List] */
    public static dh0.n y4(dh0.a aVar, boolean z14) {
        ?? K;
        Double d14 = aVar.f59543b;
        if (d14 == null || d14.doubleValue() <= 0.0d) {
            K = x.k(new dh0.l(dh0.m.TARGET, null, 2, null), new dh0.l(dh0.m.CURRENT, null, 2, null), new dh0.l(dh0.m.REAL, null, 2, null));
        } else {
            dh0.l lVar = new dh0.l(dh0.m.TARGET, z14 ? aVar.f59544c : null);
            dh0.m mVar = dh0.m.CURRENT;
            dh0.l lVar2 = new dh0.l(mVar, d14);
            dh0.m mVar2 = dh0.m.REAL;
            Integer num = aVar.f59542a;
            dh0.l lVar3 = new dh0.l(mVar2, num != null ? Double.valueOf(num.intValue()) : null);
            K = x.m(lVar, lVar2, lVar3);
            Double d15 = lVar.f59609b;
            if (d15 != null && d15.doubleValue() >= d14.doubleValue()) {
                K.set(K.indexOf(lVar), dh0.l.a(lVar));
            }
            Double d16 = lVar3.f59609b;
            if (d16 != null && p005kotlin.jvm.internal.s.a(d16.doubleValue(), d14)) {
                K.set(K.indexOf(lVar3), dh0.l.a(lVar3));
            }
            c0.u(K, new a61.c(new p5((byte) 0, 21), 10));
            int iNextIndex = -1;
            if (((dh0.l) h0.b0(K)).f59608a == mVar) {
                Iterator it = K.iterator();
                int i14 = 0;
                while (it.hasNext()) {
                    if (((dh0.l) it.next()).f59609b == null) {
                        iNextIndex = i14;
                        break;
                    }
                    i14++;
                }
                if (1 <= iNextIndex && iNextIndex <= K.size() - 1) {
                    K.add(0, (dh0.l) K.remove(iNextIndex));
                }
            } else if (((dh0.l) h0.m0(K)).f59608a == mVar) {
                ListIterator listIterator = K.listIterator(K.size());
                while (listIterator.hasPrevious()) {
                    if (((dh0.l) listIterator.previous()).f59609b == null) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                }
                if (iNextIndex >= 0 && iNextIndex < K.size() - 1) {
                    K.add((dh0.l) K.remove(iNextIndex));
                }
            }
        }
        return new dh0.n((dh0.l) K.get(0), (dh0.l) K.get(1), (dh0.l) K.get(2));
    }

    public final void A4() {
        this.f93490i.g();
        this.f93491j.e();
        this.f93492k.e();
    }

    public final n x4(dh0.a aVar) {
        dh0.f fVar = aVar.f59549h;
        Double d14 = aVar.f59543b;
        Double d15 = aVar.f59544c;
        if (fVar != null) {
            return new n.d(fVar);
        }
        if (d14 == null || d15 == null) {
            return n.e.f93469a;
        }
        if (d14.doubleValue() < d15.doubleValue()) {
            return n.c.f93467a;
        }
        if (p005kotlin.jvm.internal.s.d(d14, d15)) {
            return n.a.f93464a;
        }
        LocalDate localDateNow = LocalDate.now();
        LocalDate localDateF = this.f93483b.f();
        LocalDate localDatePlusDays = localDateF != null ? localDateF.plusDays(7) : null;
        return new n.b(localDatePlusDays != null && localDateNow.isBefore(localDatePlusDays), d14.doubleValue() - d15.doubleValue());
    }

    public final void z4() {
        ge1.b.T(v1.a(this), null, null, new f(null), 3);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lih0/s$b;", "", "<init>", "()V", "Lt60/a;", "INDEX_BANNER", "Lt60/a;", "", "TEMPORARY_MESSAGE_DAYS", "I", "", "CROSS_SELLING_ITEM_TAG", "Ljava/lang/String;", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
