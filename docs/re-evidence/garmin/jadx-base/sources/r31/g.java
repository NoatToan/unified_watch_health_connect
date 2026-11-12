package r31;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import i31.b0;
import i31.c0;
import i31.e0;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.k2;
import r53.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lr31/g;", "Landroidx/lifecycle/u1;", "", "deviceUnitId", "Li31/r;", "getDeviceOnboardingSetupItemsUseCase", "Li31/e0;", "updateDeviceOnboardingItemUseCase", "Li31/c0;", "refreshDeviceOnboardingItemsUseCase", "Li31/b0;", "refreshDeviceOnboardingItemsOnAppResumeUseCase", "<init>", "(JLi31/r;Li31/e0;Li31/c0;Li31/b0;)V", "a", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f150010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f150011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f150012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0 f150013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b2 f150014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b2 f150015f;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "", "Lr31/j;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "<anonymous>", "(Lr53/j;Lr31/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.presentation.DeviceOnboardingViewModel$showCompletionDialog$1", f = "DeviceOnboardingViewModel.kt", l = {45, 46}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.q<r53.j<? super Boolean>, j, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f150016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ r53.j f150017b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ j f150018c;

        public b(t13.d<? super b> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super Boolean> jVar, j jVar2, t13.d<? super Unit> dVar) {
            b bVar = new b(dVar);
            bVar.f150017b = jVar;
            bVar.f150018c = jVar2;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
        
            if (r0.emit(r10, r9) == r2) goto L21;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            r53.j jVar = this.f150017b;
            j jVar2 = this.f150018c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f150016a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    Boolean bool = Boolean.TRUE;
                    this.f150017b = null;
                    this.f150018c = null;
                    this.f150016a = 2;
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
            if (!jVar2.f150034g && !jVar2.f150035h && jVar2.f150031d.isEmpty()) {
                this.f150017b = jVar;
                this.f150018c = null;
                this.f150016a = 1;
                if (m0.b(3000L, this) != aVar) {
                    Boolean bool2 = Boolean.TRUE;
                    this.f150017b = null;
                    this.f150018c = null;
                    this.f150016a = 2;
                }
                return aVar;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lr31/j;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.presentation.DeviceOnboardingViewModel$uiState$1", f = "DeviceOnboardingViewModel.kt", l = {33, 34}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<r53.j<? super j>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f150019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f150020b;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = g.this.new c(dVar);
            cVar.f150020b = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super j> jVar, t13.d<? super Unit> dVar) {
            return ((c) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
        
            if (r1.emit(r5, r17) == r2) goto L15;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            r53.j jVar = (r53.j) this.f150020b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f150019a;
            if (i14 != 0) {
                if (i14 == 1) {
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
            g gVar = g.this;
            c0 c0Var = gVar.f150012c;
            long j8 = gVar.f150010a;
            this.f150020b = jVar;
            this.f150019a = 1;
            if (c0Var.a(j8, this) != aVar) {
            }
            return aVar;
            j jVar2 = new j(0L, null, null, null, null, null, true, false, 191, null);
            this.f150020b = null;
            this.f150019a = 2;
        }
    }

    static {
        new a(null);
    }

    public g(long j8, i31.r rVar, e0 e0Var, c0 c0Var, b0 b0Var) {
        rVar.getClass();
        e0Var.getClass();
        c0Var.getClass();
        b0Var.getClass();
        this.f150010a = j8;
        this.f150011b = e0Var;
        this.f150012c = c0Var;
        this.f150013d = b0Var;
        v vVar = new v(new c(null), new i31.n(r53.s.s(rVar.f90743a.d(j8)), rVar, j8));
        w9.a aVarA = v1.a(this);
        k2.a aVar = k2.f150703a;
        b2 b2VarK = r53.s.K(vVar, aVarA, k2.a.a(aVar, 2), new j(0L, null, null, null, null, null, true, false, 191, null));
        this.f150014e = b2VarK;
        this.f150015f = r53.s.K(r53.s.N(b2VarK, new b(null)), v1.a(this), k2.a.a(aVar, 2), Boolean.FALSE);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lr31/g$a;", "", "<init>", "()V", "", "COMPLETED_DIALOG_DELAY_MILLIS", "J", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
