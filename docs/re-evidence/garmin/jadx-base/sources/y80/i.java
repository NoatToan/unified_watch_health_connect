package y80;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lz80/b;", "", "cause", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.data.BleDeviceScanRepositoryImpl$startDeviceScan$3", f = "BleDeviceScanRepositoryImpl.kt", l = {93}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.q<r53.j<? super z80.b>, Throwable, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f195144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ r53.j f195145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Throwable f195146c;

    public i(t13.d<? super i> dVar) {
        super(3, dVar);
    }

    @Override // e23.q
    public final Object invoke(r53.j<? super z80.b> jVar, Throwable th3, t13.d<? super Unit> dVar) {
        i iVar = new i(dVar);
        iVar.f195145b = jVar;
        iVar.f195146c = th3;
        return iVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = this.f195145b;
        Throwable th3 = this.f195146c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f195144a;
        if (i14 == 0) {
            o13.r.b(obj);
            a2 a2Var = a2.DEVICE_SETUP;
            String strP = am.j.p("Scan failed with exception: ", th3);
            i2.f36769a.getClass();
            i2.a.b(a2Var, "BleDeviceScanRepository", strP);
            z80.b.C3784b c3784b = z80.b.C3784b.f202978a;
            this.f195145b = null;
            this.f195146c = null;
            this.f195144a = 1;
            if (jVar.emit(c3784b, this) == aVar) {
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
