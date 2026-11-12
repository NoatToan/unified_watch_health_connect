package xn2;

import com.garmin.feature.garminpay.providers.felica.exception.server.ServerInUrgentMaintenanceException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lxn2/f0;", "Lxy2/o;", "Lcom/garmin/feature/garminpay/providers/felica/exception/server/ServerInUrgentMaintenanceException;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f0 implements xy2.o<ServerInUrgentMaintenanceException> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uy2.d f191704a;

    public f0() {
        uy2.e eVar = uy2.e.f173458a;
        ServerInUrgentMaintenanceException serverInUrgentMaintenanceException = new ServerInUrgentMaintenanceException("{note}", "{result code}", "{result message}");
        eVar.getClass();
        this.f191704a = new uy2.d(serverInUrgentMaintenanceException);
    }

    @Override // xy2.o
    /* JADX INFO: renamed from: getValue */
    public final ServerInUrgentMaintenanceException getF173457a() {
        return (ServerInUrgentMaintenanceException) this.f191704a.f173457a;
    }
}
