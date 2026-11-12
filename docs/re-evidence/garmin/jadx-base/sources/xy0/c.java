package xy0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import e23.p;
import java.util.List;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import r53.b2;
import r53.e2;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.s;
import r53.v;
import uy0.i;
import uy0.j;
import uy0.k;
import vb.h;
import wd2.l;
import wd2.m;
import wd2.m1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lxy0/c;", "Landroidx/lifecycle/u1;", "Lf12/b;", "userAccount", "Lwd2/l;", "livetrackDelegate", "Lq00/a;", "unregisterCloudMessagingUseCase", "Luy0/j;", "getBottomNavigationItemsUseCase", "Luy0/i;", "getAvailableNavigationItemsUseCase", "Luy0/a;", "clearFlagsAndResetThemeUseCase", "<init>", "(Lf12/b;Lwd2/l;Lq00/a;Luy0/j;Luy0/i;Luy0/a;)V", "c", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f12.b f192658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f192659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q00.a f192660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f192661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f192662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final uy0.a f192663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<String> f192664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f192665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f192666i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b2 f192667j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2 f192668k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p2 f192669l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p2 f192670m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p2 f192671n;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.navigation.more.settings.SettingsViewModel$1", f = "SettingsViewModel.kt", l = {61}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f192672a;

        /* JADX INFO: renamed from: xy0.c$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C3602a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f192674a;

            public C3602a(c cVar) {
                this.f192674a = cVar;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                Boolean bool = (Boolean) obj;
                bool.getClass();
                this.f192674a.f192670m.k(null, bool);
                return Unit.INSTANCE;
            }
        }

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f192672a;
            if (i14 == 0) {
                r.b(obj);
                f12.l.f68084a.getClass();
                e2 f68089c = f12.l.a.a().getF68089c();
                C3602a c3602a = new C3602a(c.this);
                this.f192672a = 1;
                f68089c.getClass();
                if (e2.m(f68089c, c3602a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            o2.c.f();
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.navigation.more.settings.SettingsViewModel$2", f = "SettingsViewModel.kt", l = {67}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f192675a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f192677a;

            public a(c cVar) {
                this.f192677a = cVar;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) throws Throwable {
                List<String> list = (List) obj;
                c cVar = this.f192677a;
                cVar.f192664g = list;
                Object objX4 = c.x4(cVar, list, dVar);
                return objX4 == u13.a.COROUTINE_SUSPENDED ? objX4 : Unit.INSTANCE;
            }
        }

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f192675a;
            if (i14 == 0) {
                r.b(obj);
                c cVar = c.this;
                j jVar = cVar.f192661d;
                jVar.getClass();
                r53.b bVarF = s.f(new k(jVar, null));
                a aVar2 = new a(cVar);
                this.f192675a = 1;
                if (bVarF.collect(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lxy0/c$c;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.navigation.more.settings.SettingsViewModel$uiState$1", f = "SettingsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<r53.j<? super C3603c>, t13.d<? super Unit>, Object> {
        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super C3603c> jVar, t13.d<? super Unit> dVar) {
            return ((d) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            c cVar = c.this;
            cVar.getClass();
            ge1.b.T(v1.a(cVar), null, null, new g(cVar, null), 3);
            return Unit.INSTANCE;
        }
    }

    public c(f12.b bVar, l lVar, q00.a aVar, j jVar, i iVar, uy0.a aVar2) {
        bVar.getClass();
        lVar.getClass();
        aVar.getClass();
        jVar.getClass();
        iVar.getClass();
        aVar2.getClass();
        this.f192658a = bVar;
        this.f192659b = lVar;
        this.f192660c = aVar;
        this.f192661d = jVar;
        this.f192662e = iVar;
        this.f192663f = aVar2;
        this.f192664g = j0.f134944a;
        p2 p2VarA = q2.a(new C3603c(false, null, null, false, false, false, 63, null));
        this.f192666i = p2VarA;
        this.f192667j = s.K(new v(new d(null), p2VarA), v1.a(this), k2.a.a(k2.f150703a, 2), new C3603c(false, null, null, false, false, false, 63, null));
        p2 p2VarA2 = q2.a(0);
        this.f192668k = p2VarA2;
        this.f192669l = p2VarA2;
        f12.l.f68084a.getClass();
        p2 p2VarA3 = q2.a(Boolean.valueOf(f12.l.a.a().B3()));
        this.f192670m = p2VarA3;
        this.f192671n = p2VarA3;
        ge1.b.T(v1.a(this), null, null, new a(null), 3);
        ge1.b.T(v1.a(this), null, null, new b(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object x4(c cVar, List list, t13.d dVar) throws Throwable {
        f fVar;
        Object value;
        cVar.getClass();
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i14 = fVar.f192692c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f192692c = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(cVar, dVar);
            }
        } else {
            fVar = new f(cVar, dVar);
        }
        Object objE0 = fVar.f192690a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f192692c;
        if (i15 == 0) {
            r.b(objE0);
            i iVar = cVar.f192662e;
            ty0.b bVar = ty0.b.J2;
            fVar.f192692c = 1;
            objE0 = ge1.b.e0(iVar.f173208s, new uy0.h(bVar, iVar, list, false, false, null), fVar);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objE0);
        }
        List list2 = (List) objE0;
        p2 p2Var = cVar.f192666i;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, C3603c.a((C3603c) value, false, list2, null, false, false, 60)));
        return Unit.INSTANCE;
    }

    public final void y4(boolean z14) {
        while (true) {
            p2 p2Var = this.f192666i;
            Object value = p2Var.getValue();
            boolean z15 = z14;
            if (p2Var.b(value, C3603c.a((C3603c) value, false, null, null, false, z15, 47))) {
                return;
            } else {
                z14 = z15;
            }
        }
    }

    public final void z4() {
        m.g(this.f192659b.f().f(), new xy0.a(this, 5));
    }

    /* JADX INFO: renamed from: xy0.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lxy0/c$c;", "", "", "isLoading", "", "Lcom/garmin/android/apps/connectmobile/navigation/more/b;", "settings", "Lwd2/m1;", "liveTrackSettings", "extendLivetrack", "showSignOutDialog", "showLiveTrackExtensionDialog", "<init>", "(ZLjava/util/List;Lwd2/m1;ZZZ)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C3603c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f192678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<com.garmin.android.apps.connectmobile.navigation.more.b> f192679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final m1 f192680c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f192681d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f192682e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f192683f;

        public C3603c(boolean z14, List list, m1 m1Var, boolean z15, boolean z16, boolean z17, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? true : z14, (i14 & 2) != 0 ? j0.f134944a : list, (i14 & 4) != 0 ? null : m1Var, (i14 & 8) != 0 ? false : z15, (i14 & 16) != 0 ? false : z16, (i14 & 32) != 0 ? false : z17);
        }

        public static C3603c a(C3603c c3603c, boolean z14, List list, m1 m1Var, boolean z15, boolean z16, int i14) {
            if ((i14 & 1) != 0) {
                z14 = c3603c.f192678a;
            }
            boolean z17 = z14;
            if ((i14 & 2) != 0) {
                list = c3603c.f192679b;
            }
            List list2 = list;
            if ((i14 & 4) != 0) {
                m1Var = c3603c.f192680c;
            }
            m1 m1Var2 = m1Var;
            if ((i14 & 8) != 0) {
                z15 = c3603c.f192681d;
            }
            boolean z18 = z15;
            if ((i14 & 16) != 0) {
                z16 = c3603c.f192682e;
            }
            boolean z19 = z16;
            boolean z24 = (i14 & 32) != 0 ? c3603c.f192683f : true;
            c3603c.getClass();
            list2.getClass();
            return new C3603c(z17, list2, m1Var2, z18, z19, z24);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3603c)) {
                return false;
            }
            C3603c c3603c = (C3603c) obj;
            return this.f192678a == c3603c.f192678a && p005kotlin.jvm.internal.s.g(this.f192679b, c3603c.f192679b) && p005kotlin.jvm.internal.s.g(this.f192680c, c3603c.f192680c) && this.f192681d == c3603c.f192681d && this.f192682e == c3603c.f192682e && this.f192683f == c3603c.f192683f;
        }

        public final int hashCode() {
            int iB = u0.b(Boolean.hashCode(this.f192678a) * 31, 31, this.f192679b);
            m1 m1Var = this.f192680c;
            return Boolean.hashCode(this.f192683f) + q6.f.g(q6.f.g((iB + (m1Var == null ? 0 : m1Var.hashCode())) * 31, 31, this.f192681d), 31, this.f192682e);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("SettingsUiState(isLoading=");
            sb3.append(this.f192678a);
            sb3.append(", settings=");
            sb3.append(this.f192679b);
            sb3.append(", liveTrackSettings=");
            sb3.append(this.f192680c);
            sb3.append(", extendLivetrack=");
            sb3.append(this.f192681d);
            sb3.append(", showSignOutDialog=");
            return com.airbnb.lottie.animation.keyframe.a.f(", showLiveTrackExtensionDialog=", ")", sb3, this.f192682e, this.f192683f);
        }

        public C3603c() {
            this(false, null, null, false, false, false, 63, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C3603c(boolean z14, List<? extends com.garmin.android.apps.connectmobile.navigation.more.b> list, m1 m1Var, boolean z15, boolean z16, boolean z17) {
            list.getClass();
            this.f192678a = z14;
            this.f192679b = list;
            this.f192680c = m1Var;
            this.f192681d = z15;
            this.f192682e = z16;
            this.f192683f = z17;
        }
    }
}
