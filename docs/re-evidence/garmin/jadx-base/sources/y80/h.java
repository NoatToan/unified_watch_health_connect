package y80;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.device.setup.data.model.ScanFailedApplicationRegistrationException;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lr53/j;", "Lz80/b;", "", "cause", "", "attempt", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;J)Z"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.data.BleDeviceScanRepositoryImpl$startDeviceScan$2", f = "BleDeviceScanRepositoryImpl.kt", l = {84}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.r<r53.j<? super z80.b>, Throwable, Long, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f195137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ r53.j f195138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Throwable f195139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ long f195140d;

    public h(t13.d<? super h> dVar) {
        super(4, dVar);
    }

    @Override // e23.r
    public final Object invoke(r53.j<? super z80.b> jVar, Throwable th3, Long l14, t13.d<? super Boolean> dVar) {
        long jLongValue = l14.longValue();
        h hVar = new h(dVar);
        hVar.f195138b = jVar;
        hVar.f195139c = th3;
        hVar.f195140d = jLongValue;
        return hVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Throwable th3 = this.f195139c;
        long j8 = this.f195140d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f195137a;
        if (i14 == 0) {
            o13.r.b(obj);
            if (!(th3 instanceof ScanFailedApplicationRegistrationException) || j8 >= 5) {
                return Boolean.FALSE;
            }
            a2 a2Var = a2.DEVICE_SETUP;
            String strE = org.apache.commons.lang3.e.e(1 + j8, "Scan failed with SCAN_FAILED_APPLICATION_REGISTRATION_FAILED, retrying after delay. Attempt: ");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "BleDeviceScanRepository", strE);
            this.f195138b = null;
            this.f195139c = null;
            this.f195140d = j8;
            this.f195137a = 1;
            if (o53.m0.b(3000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Boolean.TRUE;
    }
}
