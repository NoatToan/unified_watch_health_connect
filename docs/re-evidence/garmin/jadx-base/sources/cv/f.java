package cv;

import androidx.lifecycle.h1;
import androidx.lifecycle.n0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import o13.r;
import o53.b0;
import o53.f0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcv/f;", "Landroidx/lifecycle/n;", "Li/c;", "activity", "Lo31/a;", "inAppUpdateHandler", "Lbv/c;", "baseModuleAppDelegate", "<init>", "(Li/c;Lo31/a;Lbv/c;)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements androidx.lifecycle.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i.c f55788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o31.a f55789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bv.c f55790c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.base.activity.ForceUpdateHandler$onCreate$1", f = "ForceUpdateHandler.kt", l = {24}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f55791a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.base.activity.ForceUpdateHandler$onCreate$1$1", f = "ForceUpdateHandler.kt", l = {25}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f55793a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f55794b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f55795c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f fVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f55795c = fVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f55795c, dVar);
                aVar.f55794b = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                b0 b0Var = (b0) this.f55794b;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f55793a;
                f fVar = this.f55795c;
                if (i14 == 0) {
                    r.b(obj);
                    o31.a aVar2 = fVar.f55789b;
                    i.c cVar = fVar.f55788a;
                    this.f55794b = b0Var;
                    this.f55793a = 1;
                    obj = aVar2.K1(cVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    String strG = tn.k.g(fVar.f55788a.getLocalClassName(), " -> InAppUpdateManager found an immediate in app update available, force redirect to home screen to display it.");
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar3.getClass();
                    i2.a.b(a2Var, "ForceUpdateHandler", strG);
                    fVar.f55790c.a(fVar.f55788a, null, 268468224);
                }
                return Unit.INSTANCE;
            }
        }

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return f.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f55791a;
            if (i14 == 0) {
                r.b(obj);
                f fVar = f.this;
                i.c cVar = fVar.f55788a;
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.CREATED;
                a aVar2 = new a(fVar, null);
                this.f55791a = 1;
                if (h1.b(cVar, bVar, aVar2, this) == aVar) {
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

    public f(i.c cVar, o31.a aVar, bv.c cVar2) {
        cVar.getClass();
        aVar.getClass();
        cVar2.getClass();
        this.f55788a = cVar;
        this.f55789b = aVar;
        this.f55790c = cVar2;
    }

    @Override // androidx.lifecycle.n
    public final void onCreate(n0 n0Var) {
        bv.c cVar = this.f55790c;
        i.c cVar2 = this.f55788a;
        if (cVar.d(cVar2)) {
            return;
        }
        ge1.b.T(f0.w(cVar2), null, null, new b(null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcv/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
