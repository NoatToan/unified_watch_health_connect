package cv;

import android.app.Activity;
import androidx.lifecycle.h1;
import androidx.lifecycle.n0;
import o13.r;
import o53.b0;
import o53.f0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcv/h;", "Landroidx/lifecycle/n;", "Landroid/app/Activity;", "activity", "Lbv/c;", "baseModuleAppDelegate", "<init>", "(Landroid/app/Activity;Lbv/c;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements androidx.lifecycle.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f55798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bv.c f55799b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.base.activity.LockedInLiveActivitySessionInProgressHandler$onCreate$1", f = "LockedInLiveActivitySessionInProgressHandler.kt", l = {21}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f55800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n0 f55801b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f55802c;

        /* JADX INFO: renamed from: cv.h$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.base.activity.LockedInLiveActivitySessionInProgressHandler$onCreate$1$1", f = "LockedInLiveActivitySessionInProgressHandler.kt", l = {24}, m = "invokeSuspend", v = 2)
        public static final class C1208a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f55803a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f55804b;

            /* JADX INFO: renamed from: cv.h$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "sessionInProgress", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.base.activity.LockedInLiveActivitySessionInProgressHandler$onCreate$1$1$1", f = "LockedInLiveActivitySessionInProgressHandler.kt", l = {}, m = "invokeSuspend", v = 2)
            public static final class C1209a extends v13.i implements e23.p<Boolean, t13.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ boolean f55805a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h f55806b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1209a(h hVar, t13.d<? super C1209a> dVar) {
                    super(2, dVar);
                    this.f55806b = hVar;
                }

                @Override // v13.a
                public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                    C1209a c1209a = new C1209a(this.f55806b, dVar);
                    c1209a.f55805a = ((Boolean) obj).booleanValue();
                    return c1209a;
                }

                @Override // e23.p
                public final Object invoke(Boolean bool, t13.d<? super Unit> dVar) {
                    Boolean bool2 = bool;
                    bool2.booleanValue();
                    return ((C1209a) create(bool2, dVar)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    boolean z14 = this.f55805a;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    r.b(obj);
                    h hVar = this.f55806b;
                    hVar.f55799b.i(hVar.f55798a, z14);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1208a(h hVar, t13.d<? super C1208a> dVar) {
                super(2, dVar);
                this.f55804b = hVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C1208a(this.f55804b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C1208a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f55803a;
                if (i14 == 0) {
                    r.b(obj);
                    h hVar = this.f55804b;
                    r53.i iVarS = s.s(hVar.f55799b.k());
                    C1209a c1209a = new C1209a(hVar, null);
                    this.f55803a = 1;
                    if (s.k(iVarS, c1209a, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n0 n0Var, h hVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f55801b = n0Var;
            this.f55802c = hVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f55801b, this.f55802c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f55800a;
            if (i14 == 0) {
                r.b(obj);
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
                C1208a c1208a = new C1208a(this.f55802c, null);
                this.f55800a = 1;
                if (h1.b(this.f55801b, bVar, c1208a, this) == aVar) {
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

    public h(Activity activity, bv.c cVar) {
        activity.getClass();
        cVar.getClass();
        this.f55798a = activity;
        this.f55799b = cVar;
    }

    @Override // androidx.lifecycle.n
    public final void onCreate(n0 n0Var) {
        ge1.b.T(f0.w(n0Var), null, null, new a(n0Var, this, null), 3);
    }
}
