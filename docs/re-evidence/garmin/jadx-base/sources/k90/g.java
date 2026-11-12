package k90;

import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Ll90/a$c;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.discovery.BleDeviceDiscoveryUseCase$visibleDiscoveryTimeout$1", f = "BleDeviceDiscoveryUseCase.kt", l = {83, 87}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.p<r53.j<? super l90.a.c>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f103490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f103491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f103492c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d dVar, t13.d<? super g> dVar2) {
        super(2, dVar2);
        this.f103492c = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g gVar = new g(this.f103492c, dVar);
        gVar.f103491b = obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super l90.a.c> jVar, t13.d<? super Unit> dVar) {
        return ((g) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L17;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f103491b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f103490a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f103491b = jVar;
            this.f103490a = 1;
            if (o53.m0.b(AbstractComponentTracker.LINGERING_TIMEOUT, this) != aVar) {
            }
            return aVar;
        }
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
        a2 a2Var = a2.DEVICE_SETUP;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "DeviceDiscoveryUseCase", "Visible Discovery Timeout - after 10000 ms");
        if (this.f103492c.f103446d.isEmpty()) {
            i2.a.b(a2Var, "DeviceDiscoveryUseCase", "No devices found during visible discovery timeout");
            l90.a.c cVar = l90.a.c.f111514a;
            this.f103491b = null;
            this.f103490a = 2;
        }
        return Unit.INSTANCE;
    }
}
