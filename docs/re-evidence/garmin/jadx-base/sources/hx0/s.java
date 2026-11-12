package hx0;

import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.menstrualcycle.network.ServerResponseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import o53.c2;
import o53.e2;
import o53.l1;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0007\bB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lhx0/s;", "Landroidx/lifecycle/u1;", "Lo53/b0;", "Lyw0/a;", "repository", "<init>", "(Lyw0/a;)V", "b", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s extends u1 implements o53.b0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f86136o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yw0.a f86137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f86138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f86139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f86140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f86141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c2 f86142f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ReentrantLock f86143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y0<cx0.a<Boolean>> f86144h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c2 f86145i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Long f86146j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f86147k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e2 f86148l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y0<cx0.a<Unit>> f86149m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y0<cx0.a<ww0.b>> f86150n;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lhx0/s$b;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "Lo53/r;", "", "mGetSettingsCall", "<init>", "(Lhx0/s;Lo53/r;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o53.r<Unit> f86151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s f86152b;

        public b(s sVar, o53.r<Unit> rVar) {
            rVar.getClass();
            this.f86152b = sVar;
            this.f86151a = rVar;
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            this.f86152b.f86146j = -1L;
            com.garmin.android.library.backgroundtaskmanagement.b.c cVar2 = com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
            o53.r<Unit> rVar = this.f86151a;
            if (cVar == cVar2) {
                rVar.p(null);
            } else {
                rVar.O(new ServerResponseException(cVar));
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
            eVar.getClass();
            obj.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleDetailsViewModel$fetchDailyData$1", f = "MenstrualCycleDetailsViewModel.kt", l = {279}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f86153a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LocalDate f86155c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ y0<cx0.a<ww0.c>> f86156d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ww0.c f86157e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleDetailsViewModel$fetchDailyData$1$1", f = "MenstrualCycleDetailsViewModel.kt", l = {281, 289}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public ww0.c f86158a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f86159b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ s f86160c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ LocalDate f86161d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ y0<cx0.a<ww0.c>> f86162e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ ww0.c f86163f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(s sVar, LocalDate localDate, y0<cx0.a<ww0.c>> y0Var, ww0.c cVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f86160c = sVar;
                this.f86161d = localDate;
                this.f86162e = y0Var;
                this.f86163f = cVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f86160c, this.f86161d, this.f86162e, this.f86163f, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                Object objB;
                Throwable th3;
                ww0.c cVar;
                ww0.l cycleSummary;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f86159b;
                s sVar = this.f86160c;
                LocalDate localDate = this.f86161d;
                y0<cx0.a<ww0.c>> y0Var = this.f86162e;
                try {
                    if (i14 == 0) {
                        o13.r.b(obj);
                        yw0.a aVar2 = sVar.f86137a;
                        this.f86159b = 1;
                        objB = aVar2.b(localDate, this);
                        if (objB == aVar) {
                        }
                        return aVar;
                    }
                    if (i14 != 1) {
                        if (i14 != 2) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ww0.c cVar2 = this.f86158a;
                        try {
                            o13.r.b(obj);
                            cVar = cVar2;
                            try {
                                y0Var.j(new cx0.a<>(cVar, null, null, false, 12, null));
                            } catch (Throwable th4) {
                                th3 = th4;
                                y0Var.j(new cx0.a<>(cVar, th3, null, false, 12, null));
                            }
                        } catch (Throwable th5) {
                            th3 = th5;
                            cVar = cVar2;
                            y0Var.j(new cx0.a<>(cVar, th3, null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    }
                    o13.r.b(obj);
                    objB = obj;
                    ww0.c cVar3 = (ww0.c) objB;
                    if (cVar3 == null || (cycleSummary = cVar3.getCycleSummary()) == null || cycleSummary.Z()) {
                        if (p005kotlin.jvm.internal.s.g(localDate, LocalDate.now())) {
                            if (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a.a(cVar3 != null ? cVar3.getCycleSummary() : null)) {
                                try {
                                    this.f86158a = cVar3;
                                    this.f86159b = 2;
                                    if (s.x4(sVar, localDate, this) != aVar) {
                                        cVar = cVar3;
                                        y0Var.j(new cx0.a<>(cVar, null, null, false, 12, null));
                                    }
                                    return aVar;
                                } catch (Throwable th6) {
                                    th3 = th6;
                                    cVar = cVar3;
                                    y0Var.j(new cx0.a<>(cVar, th3, null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                        y0Var.j(new cx0.a<>(cVar3, null, null, false, 12, null));
                    } else {
                        y0Var.j(new cx0.a<>(this.f86163f, new IllegalArgumentException("Invalid cycle summary."), null, false, 12, null));
                    }
                } catch (Throwable th7) {
                    y0Var.j(new cx0.a<>(this.f86163f, th7, null, false, 12, null));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(LocalDate localDate, y0<cx0.a<ww0.c>> y0Var, ww0.c cVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f86155c = localDate;
            this.f86156d = y0Var;
            this.f86157e = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return s.this.new c(this.f86155c, this.f86156d, this.f86157e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f86153a;
            if (i14 == 0) {
                o13.r.b(obj);
                a aVar2 = new a(s.this, this.f86155c, this.f86156d, this.f86157e, null);
                this.f86153a = 1;
                if (ge1.b.Y(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            s.this.f86140d.remove(this.f86155c);
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
        f86136o = s.class.getSimpleName();
    }

    public s(yw0.a aVar) {
        aVar.getClass();
        this.f86137a = aVar;
        this.f86138b = new ReentrantLock();
        this.f86139c = new LinkedHashMap();
        this.f86140d = new LinkedHashMap();
        this.f86141e = new LinkedHashMap();
        this.f86143g = new ReentrantLock();
        this.f86144h = new y0<>();
        this.f86148l = ge1.b.h();
        this.f86149m = new y0<>();
        this.f86150n = new y0<>();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object x4(s sVar, LocalDate localDate, v13.c cVar) {
        x xVar;
        ww0.a aVarL;
        LinkedHashMap linkedHashMap = sVar.f86139c;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i14 = xVar.f86196e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                xVar.f86196e = i14 - Integer.MIN_VALUE;
            } else {
                xVar = new x(sVar, cVar);
            }
        } else {
            xVar = new x(sVar, cVar);
        }
        Object obj = xVar.f86194c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = xVar.f86196e;
        if (i15 == 0) {
            o13.r.b(obj);
            i52.a.f91796a.getClass();
            aVarL = i52.a.l();
            t13.g.a aVar2 = sVar.getF195311f().get(l1.f129368i0);
            aVar2.getClass();
            o53.s sVar2 = new o53.s((l1) aVar2);
            sVar.f86146j = new Long(((ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null)).i(new b(sVar, sVar2)));
            xVar.f86192a = localDate;
            xVar.f86193b = aVarL;
            xVar.f86196e = 1;
            if (sVar2.C(xVar) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ww0.a aVar3 = xVar.f86193b;
            LocalDate localDate2 = xVar.f86192a;
            o13.r.b(obj);
            aVarL = aVar3;
            localDate = localDate2;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (!p005kotlin.jvm.internal.s.g((LocalDate) entry.getKey(), localDate)) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            y0 y0Var = (y0) linkedHashMap.get(entry2.getKey());
            if (y0Var != null) {
                y0Var.j(((y0) entry2.getValue()).d());
            }
        }
        i52.a.f91796a.getClass();
        if (aVarL != i52.a.l()) {
            sVar.B4(false);
        }
        return Unit.INSTANCE;
    }

    public final androidx.lifecycle.s0<cx0.a<ww0.c>> A4(LocalDate localDate) {
        ReentrantLock reentrantLock = this.f86138b;
        reentrantLock.lock();
        try {
            LinkedHashMap linkedHashMap = this.f86139c;
            Object y0Var = linkedHashMap.get(localDate);
            if (y0Var == null) {
                y0Var = new y0();
                linkedHashMap.put(localDate, y0Var);
            }
            y0<cx0.a<ww0.c>> y0Var2 = (y0) y0Var;
            l1 l1Var = (l1) this.f86141e.get(localDate);
            l1 l1Var2 = (l1) this.f86140d.get(localDate);
            if ((l1Var == null || !l1Var.isActive()) && ((l1Var2 == null || !l1Var2.isActive()) && y0Var2.d() == null)) {
                z4(localDate, y0Var2, null);
            }
            return y0Var2;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final y0 B4(boolean z14) {
        ReentrantLock reentrantLock = this.f86143g;
        reentrantLock.lock();
        try {
            i52.a.f91796a.getClass();
            ww0.a aVarL = i52.a.l();
            ww0.a aVar = ww0.a.NONE;
            y0<cx0.a<Boolean>> y0Var = this.f86144h;
            if (aVarL == aVar) {
                c2 c2Var = this.f86145i;
                if ((c2Var == null || !c2Var.isActive()) && (y0Var.d() == null || !z14)) {
                    y0Var.j(null);
                    this.f86145i = ge1.b.T(this, null, null, new w(this, null), 3);
                }
            } else {
                y0Var.j(new cx0.a<>(Boolean.TRUE, null, null, false, 12, null));
            }
            return y0Var;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void C4(LocalDate localDate) {
        localDate.getClass();
        ReentrantLock reentrantLock = this.f86138b;
        reentrantLock.lock();
        try {
            LinkedHashMap linkedHashMap = this.f86139c;
            Object y0Var = linkedHashMap.get(localDate);
            if (y0Var == null) {
                y0Var = new y0();
                linkedHashMap.put(localDate, y0Var);
            }
            y0<cx0.a<ww0.c>> y0Var2 = (y0) y0Var;
            l1 l1Var = (l1) this.f86141e.get(localDate);
            l1 l1Var2 = (l1) this.f86140d.get(localDate);
            cx0.a<ww0.c> aVarD = y0Var2.d();
            ww0.c cVar = aVarD != null ? aVarD.f56599a : null;
            if ((l1Var == null || !l1Var.isActive()) && (l1Var2 == null || !l1Var2.isActive())) {
                z4(localDate, y0Var2, cVar);
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void D4(LocalDate localDate, ww0.c cVar) {
        if (localDate != null) {
            LinkedHashMap linkedHashMap = this.f86139c;
            Object y0Var = linkedHashMap.get(localDate);
            if (y0Var == null) {
                y0Var = new y0();
                linkedHashMap.put(localDate, y0Var);
            }
            z4(localDate, (y0) y0Var, cVar);
        }
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final t13.g getF195311f() {
        return o53.s0.f129406a.plus(this.f86148l);
    }

    @Override // androidx.lifecycle.u1
    public final void onCleared() {
        this.f86148l.c(null);
        com.garmin.android.library.backgroundtaskmanagement.c cVar = com.garmin.android.library.backgroundtaskmanagement.c.f50123c;
        if (cVar.e(this.f86146j)) {
            cVar.b(this.f86146j);
        }
        super.onCleared();
    }

    public final void y4() {
        LinkedHashMap linkedHashMap = this.f86139c;
        ReentrantLock reentrantLock = this.f86138b;
        reentrantLock.lock();
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                l1 l1Var = (l1) this.f86140d.remove(entry.getKey());
                if (l1Var != null) {
                    l1Var.c(null);
                }
                if (((y0) entry.getValue()).e()) {
                    C4((LocalDate) entry.getKey());
                } else {
                    arrayList.add(entry.getKey());
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                linkedHashMap.remove((LocalDate) it.next());
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            ge1.b.T(this, null, null, new t(this, null), 3);
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    public final void z4(LocalDate localDate, y0<cx0.a<ww0.c>> y0Var, ww0.c cVar) {
        y0Var.j(null);
        this.f86140d.put(localDate, ge1.b.T(this, null, null, new c(localDate, y0Var, cVar, null), 3));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lhx0/s$a;", "", "<init>", "()V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
