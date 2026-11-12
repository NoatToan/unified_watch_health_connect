package po2;

import android.content.DialogInterface;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.MaintenanceException;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.ProviderErrorCodeException;
import java.util.concurrent.TimeoutException;
import org.slf4j.Logger;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class q implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f139340b;

    public /* synthetic */ q(r rVar, int i14) {
        this.f139339a = i14;
        this.f139340b = rVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f139339a;
        r rVar = this.f139340b;
        switch (i14) {
            case 0:
                Logger logger = r.f139345c;
                ((DialogInterface) obj).getClass();
                ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) rVar.getView()).c();
                return Unit.INSTANCE;
            case 1:
                Logger logger2 = r.f139345c;
                ((DialogInterface) obj).getClass();
                ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) rVar.getView()).c();
                return Unit.INSTANCE;
            case 2:
                Logger logger3 = r.f139345c;
                ((DialogInterface) obj).getClass();
                ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) rVar.getView()).c();
                return Unit.INSTANCE;
            case 3:
                Logger logger4 = r.f139345c;
                ((DialogInterface) obj).getClass();
                ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) rVar.getView()).c();
                return Unit.INSTANCE;
            case 4:
                Logger logger5 = r.f139345c;
                ((DialogInterface) obj).getClass();
                ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) rVar.getView()).c();
                return Unit.INSTANCE;
            case 5:
                aq2.l lVar = (aq2.l) obj;
                if (!(lVar instanceof aq2.l.b)) {
                    if (lVar instanceof aq2.l.d) {
                        r.f139345c.debug("Download card: Success");
                        ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) rVar.getView()).B6(((k) rVar.f0()).d(), ((k) rVar.f0()).l());
                    } else if (lVar instanceof aq2.l.a) {
                        Logger logger6 = r.f139345c;
                        Throwable th3 = ((aq2.l.a) lVar).f12512a;
                        logger6.debug("Download card: Failure", th3);
                        if (th3 instanceof MaintenanceException) {
                            ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) rVar.getView()).c2(new q(rVar, 6));
                        } else if (th3 instanceof ProviderErrorCodeException) {
                            ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) rVar.getView()).g9(new q(rVar, 7), ((ProviderErrorCodeException) th3).getErrorCode());
                        } else if (th3 instanceof TimeoutException) {
                            ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) rVar.getView()).B5(new q(rVar, 8), ((k) rVar.f0()).d());
                        } else {
                            ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) rVar.getView()).g9(new q(rVar, 9), null);
                        }
                    } else {
                        if (!(lVar instanceof aq2.l.c)) {
                            lc.u0.r();
                            return null;
                        }
                        Logger logger7 = r.f139345c;
                        int i15 = ((aq2.l.c) lVar).f12514a;
                        logger7.debug("Download card: Progress: " + i15);
                        ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) rVar.getView()).s(i15);
                    }
                }
                return Unit.INSTANCE;
            case 6:
                ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) rVar.getView()).c();
                return Unit.INSTANCE;
            case 7:
                ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) rVar.getView()).c();
                return Unit.INSTANCE;
            case 8:
                ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) rVar.getView()).c();
                return Unit.INSTANCE;
            default:
                ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) rVar.getView()).c();
                return Unit.INSTANCE;
        }
    }
}
