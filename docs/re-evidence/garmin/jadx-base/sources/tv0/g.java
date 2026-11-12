package tv0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import o53.b0;
import o53.c0;
import o53.c2;
import o53.m0;
import o53.s0;
import o53.z;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Ltv0/g;", "", "Ltv0/d;", "lifecycleLoggingDelegate", "Lo53/z;", "dispatcher", "<init>", "(Ltv0/d;Lo53/z;)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f166548d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f166549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u53.d f166550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c2 f166551c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.domain.RequestDeviceUpdateUseCase$invoke$2", f = "RequestDeviceUpdateUseCase.kt", l = {30}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f166552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f166553b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f166554c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g f166555d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j8, g gVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f166554c = j8;
            this.f166555d = gVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = new b(this.f166554c, this.f166555d, dVar);
            bVar.f166553b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.f166553b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f166552a;
            if (i14 == 0) {
                o13.r.b(obj);
                StringBuilder sb3 = new StringBuilder("Schedule device update request with a delay of ");
                long j8 = this.f166554c;
                sb3.append(j8);
                sb3.append(" ms");
                String string = sb3.toString();
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var, "RequestDeviceUpdateUseCase", string);
                this.f166553b = b0Var;
                this.f166552a = 1;
                if (m0.b(j8, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            if (c0.g(b0Var)) {
                for (ov0.a aVar3 : this.f166555d.f166549a.e()) {
                    aVar3.getClass();
                    if (aVar3.f134130f) {
                        ge1.b.T(aVar3.f134126b, null, null, new ov0.b(aVar3, null), 3);
                        Unit unit = Unit.INSTANCE;
                    } else {
                        rs2.c cVar = aVar3.f134128d;
                        if (cVar != null) {
                            cVar.getF92746j();
                        }
                    }
                }
                i2.a aVar4 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar4.getClass();
                i2.a.b(a2Var2, "RequestDeviceUpdateUseCase", "Requesting device update");
            } else {
                i2.a aVar5 = i2.f36769a;
                a2 a2Var3 = a2.GENERAL;
                aVar5.getClass();
                i2.a.b(a2Var3, "RequestDeviceUpdateUseCase", "Coroutine is not active, skipping device update request");
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public g(d dVar, z zVar) {
        dVar.getClass();
        zVar.getClass();
        this.f166549a = dVar;
        this.f166550b = c0.a(zVar);
    }

    public final void a(long j8) {
        c2 c2Var = this.f166551c;
        if (c2Var != null && c2Var.isActive()) {
            c2Var.c(null);
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "RequestDeviceUpdateUseCase", "Cancelling previous job before requesting device update");
        }
        this.f166551c = ge1.b.T(this.f166550b, null, null, new b(j8, this, null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ltv0/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g(d dVar, z zVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 2) != 0) {
            x53.c cVar = s0.f129406a;
            zVar = x53.b.f189152a;
        }
        this(dVar, zVar);
    }
}
