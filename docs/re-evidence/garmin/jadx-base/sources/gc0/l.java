package gc0;

import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.v2;
import fe2.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import o53.b0;
import o53.c2;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgc0/l;", "Lkj1/a;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends kj1.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f76879m = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c2 f76880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c2 f76881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Logger f76882f = gt2.c.b(a2.DEVICES.f28756a);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final pc0.j f76883g = pc0.j.a.a(pc0.j.f137223i);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final tc0.a f76884h = (tc0.a) KoinJavaComponent.get$default(tc0.a.class, null, null, 6, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y0<t> f76885i = new y0<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y0<o13.p<String, List<String>>> f76886j = new y0<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o13.t f76887k = o13.m.b(new z(this, 17));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ej1.a f76888l;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.devices.dashboard.DevicesDashboardViewModel$refreshAllRegisteredDevices$1", f = "DevicesDashboardViewModel.kt", l = {103, 108, 118}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f76889a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f76890b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f76891c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.devices.dashboard.DevicesDashboardViewModel$refreshAllRegisteredDevices$1$1", f = "DevicesDashboardViewModel.kt", l = {120}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f76893a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f76894b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l lVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f76894b = lVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f76894b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f76893a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    this.f76893a = 1;
                    if (this.f76894b.y4(this) == aVar) {
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

        /* JADX INFO: renamed from: gc0.l$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lgc0/e;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.devices.dashboard.DevicesDashboardViewModel$refreshAllRegisteredDevices$1$mutableDeviceList$1", f = "DevicesDashboardViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C1549b extends v13.i implements e23.p<b0, t13.d<? super List<? extends e>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l f76895a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1549b(l lVar, t13.d<? super C1549b> dVar) {
                super(2, dVar);
                this.f76895a = lVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C1549b(this.f76895a, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super List<? extends e>> dVar) {
                return ((C1549b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                return this.f76895a.f76883g.k();
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lsc0/c;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.devices.dashboard.DevicesDashboardViewModel$refreshAllRegisteredDevices$1$userHasSensorsPrefResponse$1", f = "DevicesDashboardViewModel.kt", l = {109}, m = "invokeSuspend", v = 2)
        public static final class c extends v13.i implements e23.p<b0, t13.d<? super v2<? extends sc0.c>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f76896a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f76897b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(l lVar, t13.d<? super c> dVar) {
                super(2, dVar);
                this.f76897b = lVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new c(this.f76897b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends sc0.c>> dVar) {
                return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f76896a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                tc0.a aVar2 = this.f76897b.f76884h;
                this.f76896a = 1;
                Object objA = aVar2.a(this);
                return objA == aVar ? aVar : objA;
            }
        }

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return l.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0064  */
        /* JADX WARN: Code duplicated, block: B:22:0x006f  */
        /* JADX WARN: Code duplicated, block: B:26:0x0086  */
        /* JADX WARN: Code duplicated, block: B:28:0x0089  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v7 */
        /* JADX WARN: Type inference failed for: r11v10 */
        /* JADX WARN: Type inference failed for: r11v11, types: [int] */
        /* JADX WARN: Type inference failed for: r11v18 */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list;
            v2 v2Var;
            ?? A;
            x53.b bVar;
            a aVar;
            ?? r14;
            int i14;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i15 = this.f76891c;
            boolean z14 = false;
            l lVar = l.this;
            if (i15 == 0) {
                o13.r.b(obj);
                x53.c cVar = s0.f129406a;
                x53.b bVar2 = x53.b.f189152a;
                C1549b c1549b = new C1549b(lVar, null);
                this.f76891c = 1;
                obj = ge1.b.e0(bVar2, c1549b, this);
                if (obj != aVar2) {
                }
                return aVar2;
            }
            if (i15 == 1) {
                o13.r.b(obj);
            } else {
                if (i15 == 2) {
                    list = this.f76889a;
                    o13.r.b(obj);
                    v2Var = (v2) obj;
                    if (v2Var instanceof v2.b) {
                        A = ((sc0.c) ((v2.b) v2Var).f47386a).a();
                    } else {
                        A = 0;
                    }
                    x53.c cVar2 = s0.f129406a;
                    bVar = x53.b.f189152a;
                    aVar = new a(lVar, null);
                    this.f76889a = list;
                    this.f76890b = A;
                    this.f76891c = 3;
                    if (ge1.b.e0(bVar, aVar, this) != aVar2) {
                        r14 = A;
                    }
                    return aVar2;
                }
                if (i15 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i14 = this.f76890b;
                list = this.f76889a;
                o13.r.b(obj);
            }
            if (r14 != 0) {
                r14 = i14;
                z14 = true;
            }
            r14 = i14;
            ad0.f fVar = new ad0.f(list, lVar, z14, 6);
            int i16 = l.f76879m;
            lVar.getClass();
            ed0.a.d(new m(fVar, lVar));
            return Unit.INSTANCE;
            ArrayList arrayListD1 = h0.d1((Collection) obj);
            x53.c cVar3 = s0.f129406a;
            x53.b bVar3 = x53.b.f189152a;
            c cVar4 = new c(lVar, null);
            this.f76889a = arrayListD1;
            this.f76891c = 2;
            Object objE0 = ge1.b.e0(bVar3, cVar4, this);
            if (objE0 != aVar2) {
                list = arrayListD1;
                obj = objE0;
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    A = ((sc0.c) ((v2.b) v2Var).f47386a).a();
                } else {
                    A = 0;
                }
                x53.c cVar5 = s0.f129406a;
                bVar = x53.b.f189152a;
                aVar = new a(lVar, null);
                this.f76889a = list;
                this.f76890b = A;
                this.f76891c = 3;
                if (ge1.b.e0(bVar, aVar, this) != aVar2) {
                    r14 = A;
                    if (r14 != 0) {
                        r14 = i14;
                        z14 = true;
                    }
                    r14 = i14;
                    ad0.f fVar2 = new ad0.f(list, lVar, z14, 6);
                    int i17 = l.f76879m;
                    lVar.getClass();
                    ed0.a.d(new m(fVar2, lVar));
                    return Unit.INSTANCE;
                }
            }
            return aVar2;
        }
    }

    static {
        new a(null);
    }

    public l() {
        f12.l.f68084a.getClass();
        this.f76888l = new ej1.a(f12.l.a.a());
    }

    public final void A4() {
        o13.p<String, List<String>> pVar;
        ej1.a aVar = this.f76888l;
        Set<String> setL1 = aVar.f64404a.L1("key_removed_device_info");
        if (setL1.isEmpty()) {
            return;
        }
        new hj1.b();
        setL1.getClass();
        d53.k kVar = new d53.k("^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$");
        ArrayList arrayList = new ArrayList();
        if (setL1.isEmpty()) {
            pVar = null;
        } else {
            String str = "";
            for (String str2 : setL1) {
                if (kVar.d(str2)) {
                    arrayList.add(str2);
                } else {
                    str = str2;
                }
            }
            pVar = new o13.p<>(str, arrayList);
        }
        this.f76886j.m(pVar);
        aVar.f64404a.E4("key_removed_device_info");
    }

    public final boolean B4() {
        c2 c2Var = this.f76880d;
        if (c2Var != null ? c2Var.isActive() : false) {
            return true;
        }
        c2 c2Var2 = this.f76881e;
        return c2Var2 != null ? c2Var2.isActive() : false;
    }

    public final void C4() {
        c2 c2Var = this.f76881e;
        if (c2Var != null) {
            c2Var.c(null);
        }
        this.f76881e = ge1.b.T(v1.a(this), null, null, new b(null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgc0/l$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
