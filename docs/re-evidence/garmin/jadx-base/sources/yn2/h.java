package yn2;

import com.garmin.feature.garminpay.providers.felica.exception.ServerInMaintenanceException;
import org.joda.time.LocalTime;
import p005kotlin.Metadata;
import xy2.o;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lyn2/h;", "Lxy2/o;", "Lcom/garmin/feature/garminpay/providers/felica/exception/ServerInMaintenanceException;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements o<ServerInMaintenanceException> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uy2.d f198207a;

    public h() {
        uy2.e eVar = uy2.e.f173458a;
        LocalTime localTime = LocalTime.parse("01:00");
        localTime.getClass();
        LocalTime localTime2 = LocalTime.parse("04:00");
        localTime2.getClass();
        ServerInMaintenanceException serverInMaintenanceException = new ServerInMaintenanceException(localTime, localTime2);
        eVar.getClass();
        this.f198207a = new uy2.d(serverInMaintenanceException);
    }

    @Override // xy2.o
    /* JADX INFO: renamed from: getValue */
    public final ServerInMaintenanceException getF173457a() {
        return (ServerInMaintenanceException) this.f198207a.f173457a;
    }
}
