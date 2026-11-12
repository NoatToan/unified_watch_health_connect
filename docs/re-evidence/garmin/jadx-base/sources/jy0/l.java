package jy0;

import am.x0;
import am.z0;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import gy0.c2;
import gy0.t1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.joda.time.DateTime;
import org.joda.time.ReadableInstant;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p13.c1;
import r53.b2;
import r53.k2;
import r53.m2;
import r53.p2;
import r53.q2;
import z10.d1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljy0/l;", "Landroidx/lifecycle/u1;", "Lorg/koin/core/component/KoinComponent;", "Ljy0/h;", "<init>", "()V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends u1 implements KoinComponent, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f101742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f101743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f101744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f101745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f101746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f101747f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f101748g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b2 f101749h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f101750i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b2 f101751j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2 f101752k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b2 f101753l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p2 f101754m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b2 f101755n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b2 f101756o;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "", "Lsy0/f;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.creation.MultiDayActivitiesCreationViewModel$coursesList$1", f = "MultiDayActivitiesCreationViewModel.kt", l = {76, 76}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<r53.j<? super List<? extends sy0.f>>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public r53.j f101757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f101758b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f101759c;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = l.this.new a(dVar);
            aVar.f101759c = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super List<? extends sy0.f>> jVar, t13.d<? super Unit> dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, o13.l] */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            r53.j jVar = (r53.j) this.f101759c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f101758b;
            if (i14 != 0) {
                if (i14 == 1) {
                    jVar = this.f101757a;
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            gy0.w wVar = (gy0.w) l.this.f101744c.getValue();
            this.f101759c = null;
            this.f101757a = jVar;
            this.f101758b = 1;
            obj = wVar.a(this);
            if (obj != aVar) {
            }
            return aVar;
            ArrayList arrayListA = sy0.s.a((List) obj);
            this.f101759c = null;
            this.f101757a = null;
            this.f101758b = 2;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lk30/n;", "courseSortFilterValue", "", "Lsy0/f;", "coursesListValue", "Li53/f;", "<anonymous>", "(Lk30/n;Ljava/util/List;)Li53/f;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.creation.MultiDayActivitiesCreationViewModel$processedCoursesList$1", f = "MultiDayActivitiesCreationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.q<k30.n, List<? extends sy0.f>, t13.d<? super i53.f<? extends sy0.f>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ k30.n f101761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ List f101762b;

        public b(t13.d<? super b> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(k30.n nVar, List<? extends sy0.f> list, t13.d<? super i53.f<? extends sy0.f>> dVar) {
            b bVar = new b(dVar);
            bVar.f101761a = nVar;
            bVar.f101762b = list;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            List<sy0.f> listB;
            k30.n nVar = this.f101761a;
            List list = this.f101762b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (list == null || (listB = ay0.b.b(ay0.b.a(list, nVar), nVar)) == null) {
                return null;
            }
            return i53.a.j(listB);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<c2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f101763a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f101764b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f101765c;

        public c(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f101763a = scope;
            this.f101764b = qualifier;
            this.f101765c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.c2, java.lang.Object] */
        @Override // e23.a
        public final c2 invoke() {
            return this.f101763a.get(s0.f105811a.b(c2.class), this.f101764b, this.f101765c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<gy0.q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f101766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f101767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f101768c;

        public d(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f101766a = scope;
            this.f101767b = qualifier;
            this.f101768c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.q, java.lang.Object] */
        @Override // e23.a
        public final gy0.q invoke() {
            return this.f101766a.get(s0.f105811a.b(gy0.q.class), this.f101767b, this.f101768c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<gy0.w> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f101769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f101770b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f101771c;

        public e(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f101769a = scope;
            this.f101770b = qualifier;
            this.f101771c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.w, java.lang.Object] */
        @Override // e23.a
        public final gy0.w invoke() {
            return this.f101769a.get(s0.f105811a.b(gy0.w.class), this.f101770b, this.f101771c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<gy0.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f101772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f101773b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f101774c;

        public f(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f101772a = scope;
            this.f101773b = qualifier;
            this.f101774c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.b, java.lang.Object] */
        @Override // e23.a
        public final gy0.b invoke() {
            return this.f101772a.get(s0.f105811a.b(gy0.b.class), this.f101773b, this.f101774c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<t1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f101775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f101776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f101777c;

        public g(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f101775a = scope;
            this.f101776b = qualifier;
            this.f101777c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.t1, java.lang.Object] */
        @Override // e23.a
        public final t1 invoke() {
            return this.f101775a.get(s0.f105811a.b(t1.class), this.f101776b, this.f101777c);
        }
    }

    public l() {
        Scope scopeV = xy2.b.v();
        o13.n nVar = o13.n.SYNCHRONIZED;
        this.f101742a = o13.m.a(nVar, new c(scopeV, null, null));
        this.f101743b = o13.m.a(nVar, new d(scopeV, null, null));
        this.f101744c = o13.m.a(nVar, new e(scopeV, null, null));
        this.f101745d = o13.m.a(nVar, new f(scopeV, null, null));
        this.f101746e = o13.m.a(nVar, new g(scopeV, null, null));
        p2 p2VarA = q2.a(new sy0.j(null, null, null, null, null, null, false, 127, null));
        this.f101748g = p2VarA;
        this.f101749h = r53.s.d(p2VarA);
        p2 p2VarA2 = q2.a(new sy0.b(null, null, null, false, 15, null));
        this.f101750i = p2VarA2;
        this.f101751j = r53.s.d(p2VarA2);
        p2 p2VarA3 = q2.a(new sy0.g(null, null, 3, null));
        this.f101752k = p2VarA3;
        this.f101753l = r53.s.d(p2VarA3);
        r53.c2 c2Var = new r53.c2(new a(null));
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        m2 m2Var = k2.a.f150706c;
        b2 b2VarK = r53.s.K(c2Var, aVarA, m2Var, null);
        p2 p2VarA4 = q2.a(lg.d.r());
        this.f101754m = p2VarA4;
        b2 b2VarD = r53.s.d(p2VarA4);
        this.f101755n = b2VarD;
        this.f101756o = r53.s.K(new r53.u1(b2VarD, b2VarK, new b(null)), v1.a(this), m2Var, null);
    }

    public static i53.f y4(i53.c cVar) {
        if (cVar.isEmpty()) {
            return j53.l.b();
        }
        ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
        Iterator<E> it = cVar.iterator();
        while (it.hasNext()) {
            x0 x0Var = ((ActivityListItemDTO) it.next()).f29265g;
            x0Var.getClass();
            arrayList.add(z0.d(x0Var, x0Var));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add((x0) obj)) {
                arrayList2.add(obj);
            }
        }
        return i53.a.j(p13.h0.N0(p13.h0.g1(arrayList2), new p()));
    }

    @Override // jy0.h
    public final void D0(x0 x0Var) {
        p2 p2Var;
        Object value;
        sy0.b bVar;
        x0 next;
        Set setF1;
        x0Var.getClass();
        do {
            p2Var = this.f101750i;
            value = p2Var.getValue();
            bVar = (sy0.b) value;
            Iterator<x0> it = bVar.f161203c.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (next != x0Var);
            x0 x0Var2 = next;
            i53.e<x0> eVar = bVar.f161203c;
            if (x0Var2 != null) {
                setF1 = p13.h0.f1(eVar);
                setF1.remove(x0Var2);
            } else {
                setF1 = p13.h0.f1(eVar);
                setF1.add(x0Var);
            }
        } while (!p2Var.b(value, sy0.b.a(bVar, i53.a.l(setF1), 11)));
    }

    @Override // jy0.h
    public final void D1(i53.c<k30.o> cVar) {
        p2 p2Var;
        Object value;
        cVar.getClass();
        do {
            p2Var = this.f101754m;
            value = p2Var.getValue();
        } while (!p2Var.b(value, k30.n.b((k30.n) value, null, cVar, 13)));
    }

    @Override // jy0.h
    public final void E1(boolean z14) {
        while (true) {
            p2 p2Var = this.f101748g;
            Object value = p2Var.getValue();
            boolean z15 = z14;
            if (p2Var.b(value, sy0.j.a((sy0.j) value, null, null, null, null, null, null, z15, 63))) {
                return;
            } else {
                z14 = z15;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, o13.l] */
    @Override // jy0.h
    public final Object G0(u.a aVar) {
        p2 p2Var;
        Object value;
        b2 b2Var = this.f101753l;
        Long l14 = ((sy0.g) b2Var.f150540a.getValue()).f161219a;
        if (l14 != null) {
            long jLongValue = l14.longValue();
            Long l15 = ((sy0.g) b2Var.f150540a.getValue()).f161220b;
            if (l15 != null) {
                long jLongValue2 = l15.longValue();
                b2 b2Var2 = this.f101749h;
                Long l16 = ((sy0.j) b2Var2.f150540a.getValue()).f161227b;
                Long l17 = ((sy0.j) b2Var2.f150540a.getValue()).f161228c;
                if (l16 != null && jLongValue == l16.longValue() && l17 != null && jLongValue2 == l17.longValue()) {
                    return gy0.c.C1605c.f80119a;
                }
                do {
                    p2Var = this.f101750i;
                    value = p2Var.getValue();
                } while (!p2Var.b(value, sy0.b.a((sy0.b) value, null, 7)));
                Object objA = ((c2) this.f101742a.getValue()).a(jLongValue, jLongValue2, aVar);
                return objA == u13.a.COROUTINE_SUSPENDED ? objA : (gy0.c) objA;
            }
        }
        return null;
    }

    @Override // jy0.h
    public final boolean I1() {
        return d1.h(q92.x.DI_CONNECT_LIVETRACK, true);
    }

    @Override // jy0.h
    public final void L() {
        p2 p2Var;
        Object value;
        sy0.j jVar;
        do {
            p2Var = this.f101748g;
            value = p2Var.getValue();
            jVar = (sy0.j) value;
        } while (!p2Var.b(value, sy0.j.a(jVar, null, null, null, i53.a.l(c1.g(jVar.f161229d, ((sy0.b) this.f101751j.f150540a.getValue()).f161205e)), null, null, false, 119)));
    }

    @Override // jy0.h
    public final void M3() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f101750i;
            value = p2Var.getValue();
        } while (!p2Var.b(value, sy0.b.a((sy0.b) value, i53.a.d(), 11)));
    }

    @Override // jy0.h
    public final void N2() {
        p2 p2Var;
        Object value;
        b2 b2Var;
        do {
            p2Var = this.f101748g;
            value = p2Var.getValue();
            b2Var = this.f101753l;
        } while (!p2Var.b(value, sy0.j.a((sy0.j) value, null, ((sy0.g) b2Var.f150540a.getValue()).f161219a, ((sy0.g) b2Var.f150540a.getValue()).f161220b, null, null, null, false, 121)));
    }

    @Override // jy0.h
    public final void N3(Long l14) {
        p2 p2Var;
        Object value;
        Long l15;
        do {
            p2Var = this.f101752k;
            value = p2Var.getValue();
            sy0.g gVar = (sy0.g) value;
            l15 = gVar.f161220b;
            gVar.getClass();
        } while (!p2Var.b(value, new sy0.g(l14, l15)));
    }

    @Override // jy0.h
    public final void Q1(sy0.m mVar) {
        mVar.getClass();
        while (true) {
            p2 p2Var = this.f101748g;
            Object value = p2Var.getValue();
            sy0.m mVar2 = mVar;
            if (p2Var.b(value, sy0.j.a((sy0.j) value, null, null, null, null, null, mVar2, false, 95))) {
                return;
            } else {
                mVar = mVar2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, o13.l] */
    @Override // jy0.h
    public final Object V(v13.c cVar) {
        n nVar;
        i53.e<x0> eVar;
        i53.c<ActivityListItemDTO> cVar2;
        p2 p2Var;
        Object value;
        i53.c cVar3;
        i53.e<ActivityListItemDTO> eVar2;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f101785e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f101785e = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        n nVar2 = nVar;
        Object obj = nVar2.f101783c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar2.f101785e;
        p2 p2Var2 = this.f101748g;
        if (i15 == 0) {
            o13.r.b(obj);
            Long l14 = ((sy0.j) p2Var2.getValue()).f161227b;
            if (l14 == null) {
                return Unit.INSTANCE;
            }
            long jLongValue = l14.longValue();
            Long l15 = ((sy0.j) p2Var2.getValue()).f161228c;
            if (l15 == null) {
                return Unit.INSTANCE;
            }
            long jLongValue2 = l15.longValue();
            b2 b2Var = this.f101751j;
            i53.c<ActivityListItemDTO> cVar4 = ((sy0.b) b2Var.f150540a.getValue()).f161201a;
            i53.e<x0> eVar3 = ((sy0.b) b2Var.f150540a.getValue()).f161203c;
            gy0.q qVar = (gy0.q) this.f101743b.getValue();
            nVar2.f101781a = cVar4;
            nVar2.f101782b = eVar3;
            nVar2.f101785e = 1;
            Object objA = qVar.a(jLongValue, jLongValue2, null, nVar2);
            if (objA == aVar) {
                return aVar;
            }
            eVar = eVar3;
            obj = objA;
            cVar2 = cVar4;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            eVar = nVar2.f101782b;
            cVar2 = nVar2.f101781a;
            o13.r.b(obj);
        }
        i53.c cVarB = (i53.c) obj;
        if (cVarB == null) {
            cVarB = j53.l.b();
        }
        i53.f fVarY4 = y4(cVarB);
        i53.e eVarL = !eVar.isEmpty() ? i53.a.l(p13.h0.h0(fVarY4, eVar)) : i53.a.d();
        do {
            p2Var = this.f101750i;
            value = p2Var.getValue();
            ((sy0.b) value).getClass();
            cVarB.getClass();
            fVarY4.getClass();
            eVarL.getClass();
        } while (!p2Var.b(value, new sy0.b(cVarB, fVarY4, eVarL, true)));
        i53.e<ActivityListItemDTO> eVar4 = ((sy0.j) this.f101749h.f150540a.getValue()).f161229d;
        if (eVar4.isEmpty()) {
            f4(true);
        } else {
            while (true) {
                Object value2 = p2Var2.getValue();
                sy0.j jVar = (sy0.j) value2;
                ArrayList arrayList = new ArrayList();
                for (ActivityListItemDTO activityListItemDTO : cVar2) {
                    ActivityListItemDTO activityListItemDTO2 = activityListItemDTO;
                    if (!eVar4.isEmpty()) {
                        Iterator<ActivityListItemDTO> it = eVar4.iterator();
                        do {
                            if (it.hasNext()) {
                            }
                        } while (it.next().f29250b != activityListItemDTO2.f29250b);
                    }
                    arrayList.add(activityListItemDTO);
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : cVarB) {
                    ActivityListItemDTO activityListItemDTO3 = (ActivityListItemDTO) obj2;
                    if (arrayList.isEmpty()) {
                        cVar3 = cVarB;
                        eVar2 = eVar4;
                        arrayList2.add(obj2);
                    } else {
                        Iterator it3 = arrayList.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                cVar3 = cVarB;
                                eVar2 = eVar4;
                                if (((ActivityListItemDTO) it3.next()).f29250b != activityListItemDTO3.f29250b) {
                                    cVarB = cVar3;
                                    eVar4 = eVar2;
                                }
                            } else {
                                cVar3 = cVarB;
                                eVar2 = eVar4;
                                arrayList2.add(obj2);
                            }
                        }
                    }
                    cVarB = cVar3;
                    eVar4 = eVar2;
                }
                i53.c cVar5 = cVarB;
                i53.e<ActivityListItemDTO> eVar5 = eVar4;
                if (p2Var2.b(value2, sy0.j.a(jVar, null, null, null, i53.a.l(arrayList2), null, null, false, 119))) {
                    break;
                }
                cVarB = cVar5;
                eVar4 = eVar5;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // jy0.h
    public final boolean W3() {
        Long l14 = ((sy0.j) this.f101748g.getValue()).f161228c;
        return l14 != null && g22.k.A(new DateTime(l14.longValue())).compareTo((ReadableInstant) DateTime.now()) > 0;
    }

    @Override // jy0.h
    public final void b0(k30.m mVar) {
        p2 p2Var;
        Object value;
        mVar.getClass();
        do {
            p2Var = this.f101754m;
            value = p2Var.getValue();
        } while (!p2Var.b(value, k30.n.b((k30.n) value, mVar, null, 14)));
    }

    @Override // jy0.h
    public final void e2(String str) {
        str.getClass();
        while (true) {
            p2 p2Var = this.f101748g;
            Object value = p2Var.getValue();
            String str2 = str;
            if (p2Var.b(value, sy0.j.a((sy0.j) value, str2, null, null, null, null, null, false, 126))) {
                return;
            } else {
                str = str2;
            }
        }
    }

    @Override // jy0.h
    public final void f4(boolean z14) {
        p2 p2Var;
        Object value;
        sy0.j jVar;
        b2 b2Var;
        do {
            p2Var = this.f101748g;
            value = p2Var.getValue();
            jVar = (sy0.j) value;
            b2Var = this.f101751j;
        } while (!p2Var.b(value, sy0.j.a(jVar, null, null, null, i53.a.l(z14 ? p13.h0.g1(((sy0.b) b2Var.f150540a.getValue()).f161201a) : c1.h(jVar.f161229d, ((sy0.b) b2Var.f150540a.getValue()).f161205e)), null, null, false, 119)));
    }

    @Override // org.koin.core.component.KoinComponent
    public final /* bridge */ Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // jy0.h
    public final void n3(Long l14) {
        p2 p2Var;
        Object value;
        Long l15;
        do {
            p2Var = this.f101752k;
            value = p2Var.getValue();
            sy0.g gVar = (sy0.g) value;
            l15 = gVar.f161219a;
            gVar.getClass();
        } while (!p2Var.b(value, new sy0.g(l15, l14)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, o13.l] */
    @Override // jy0.h
    public final Object p2(v13.c cVar) {
        m mVar;
        cy0.r uuid;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f101780c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f101780c = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object objA = mVar.f101778a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f101780c;
        if (i15 == 0) {
            o13.r.b(objA);
            gy0.b bVar = (gy0.b) this.f101745d.getValue();
            sy0.j jVar = (sy0.j) this.f101748g.getValue();
            mVar.f101780c = 1;
            objA = bVar.a(jVar, mVar);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        cy0.k kVar = (cy0.k) objA;
        if (kVar == null || (uuid = kVar.getUuid()) == null) {
            return null;
        }
        return uuid.getUuid();
    }

    @Override // jy0.h
    public final void u3(sy0.f fVar) {
        while (true) {
            p2 p2Var = this.f101748g;
            Object value = p2Var.getValue();
            sy0.f fVar2 = fVar;
            if (p2Var.b(value, sy0.j.a((sy0.j) value, null, null, null, null, fVar2, null, false, 111))) {
                return;
            } else {
                fVar = fVar2;
            }
        }
    }

    @Override // jy0.h
    public final void w4(ActivityListItemDTO activityListItemDTO) {
        Object next;
        Object value;
        activityListItemDTO.getClass();
        p2 p2Var = this.f101748g;
        Set setF1 = p13.h0.f1(((sy0.j) p2Var.getValue()).f161229d);
        Iterator it = setF1.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ActivityListItemDTO) next).f29250b != activityListItemDTO.f29250b);
        if (((ActivityListItemDTO) next) != null) {
            setF1.remove(activityListItemDTO);
        } else {
            setF1.add(activityListItemDTO);
        }
        i53.h hVarL = i53.a.l(setF1);
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, sy0.j.a((sy0.j) value, null, null, null, hVarL, null, null, false, 119)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, o13.l] */
    public final Object x4(List list, v13.c cVar) {
        o oVar;
        List list2;
        Object objA;
        p2 p2Var;
        Object value;
        Object value2;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i14 = oVar.f101789d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                oVar.f101789d = i14 - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        o oVar2 = oVar;
        Object obj = oVar2.f101787b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = oVar2.f101789d;
        p2 p2Var2 = this.f101748g;
        if (i15 == 0) {
            o13.r.b(obj);
            Long l14 = ((sy0.j) p2Var2.getValue()).f161227b;
            if (l14 == null) {
                return Unit.INSTANCE;
            }
            long jLongValue = l14.longValue();
            Long l15 = ((sy0.j) p2Var2.getValue()).f161228c;
            if (l15 == null) {
                return Unit.INSTANCE;
            }
            long jLongValue2 = l15.longValue();
            gy0.q qVar = (gy0.q) this.f101743b.getValue();
            list2 = list;
            oVar2.f101786a = list2;
            oVar2.f101789d = 1;
            objA = qVar.a(jLongValue, jLongValue2, null, oVar2);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list3 = oVar2.f101786a;
            o13.r.b(obj);
            objA = obj;
            list2 = list3;
        }
        i53.c cVarB = (i53.c) objA;
        if (cVarB == null) {
            cVarB = j53.l.b();
        }
        i53.f fVarY4 = y4(cVarB);
        m53.b bVarD = i53.a.d();
        do {
            p2Var = this.f101750i;
            value = p2Var.getValue();
            ((sy0.b) value).getClass();
            cVarB.getClass();
            fVarY4.getClass();
            bVarD.getClass();
        } while (!p2Var.b(value, new sy0.b(cVarB, fVarY4, bVarD, true)));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : cVarB) {
            if (list2.contains(new Long(((ActivityListItemDTO) obj2).f29250b))) {
                arrayList.add(obj2);
            }
        }
        i53.h hVarL = i53.a.l(arrayList);
        do {
            value2 = p2Var2.getValue();
        } while (!p2Var2.b(value2, sy0.j.a((sy0.j) value2, null, null, null, hVarL, null, null, false, 119)));
        return Unit.INSTANCE;
    }
}
