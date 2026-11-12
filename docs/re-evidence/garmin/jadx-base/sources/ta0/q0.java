package ta0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lta0/q0;", "Landroidx/lifecycle/u1;", "", "requireBackgroundLocationPermission", "Lk90/s;", "checkDeviceScanPermissionsUseCase", "<init>", "(ZLk90/s;)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q0 extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k90.s f163422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f163423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b2 f163424d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Ll90/e;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.discovery.DeviceScanPermissionsViewModel$permissionsState$1", f = "DeviceScanPermissionsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<r53.j<? super l90.e>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f163425a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = q0.this.new b(dVar);
            bVar.f163425a = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super l90.e> jVar, t13.d<? super Unit> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            q0 q0Var = q0.this;
            l90.e eVarB = q0Var.f163422b.b(q0Var.f163421a);
            i2.f36769a.getClass();
            i2.a.b(a2.DEVICE_SETUP, "DeviceScanPermissionsViewModel", "Initial permissions state: " + eVarB);
            p2 p2Var = q0Var.f163423c;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, eVarB));
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public q0(boolean z14, k90.s sVar) {
        sVar.getClass();
        this.f163421a = z14;
        this.f163422b = sVar;
        p2 p2VarA = q2.a(null);
        this.f163423c = p2VarA;
        this.f163424d = r53.s.K(new r53.v(new b(null), p2VarA), v1.a(this), k2.a.a(k2.f150703a, 2), null);
    }

    public final void x4() {
        p2 p2Var;
        Object value;
        a2 a2Var = a2.DEVICE_SETUP;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "DeviceScanPermissionsViewModel", "Checking Bluetooth state");
        do {
            p2Var = this.f163423c;
            value = p2Var.getValue();
            this.f163422b.getClass();
        } while (!p2Var.b(value, k90.s.a()));
    }

    public final void y4() {
        p2 p2Var;
        Object value;
        a2 a2Var = a2.DEVICE_SETUP;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "DeviceScanPermissionsViewModel", "Checking Location state");
        do {
            p2Var = this.f163423c;
            value = p2Var.getValue();
        } while (!p2Var.b(value, this.f163422b.c()));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lta0/q0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
