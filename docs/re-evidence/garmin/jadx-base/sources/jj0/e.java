package jj0;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.garminpayfeature.GarminPayLaunchScreenActivity;
import d53.w;
import java.util.concurrent.atomic.AtomicReference;
import l73.k;
import o13.p;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ljj0/e;", "Lpi2/c;", "<init>", "()V", "Ljj0/d;", "event", "", "postUserAuthSuccessEventReceived", "(Ljj0/d;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements pi2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f98949a;

    public e() {
        int i14 = gt2.c.f79010a;
        this.f98949a = gt2.b.f79005a.h("PAY#PostUserAuthReceiver");
    }

    @k
    public final void postUserAuthSuccessEventReceived(d event) {
        event.getClass();
        this.f98949a.debug("postUserAuthSuccessEventReceived");
        com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a.getClass();
        Logger logger = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51191b;
        logger.debug("handlePushProvData");
        AtomicReference<String> atomicReference = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51201l;
        String str = atomicReference.get();
        if (str != null) {
            logger.debug("handlePushProvData: handling cached push provisioning deep link");
            if (w.z(str, "/payment/push/android/mc", false)) {
                GarminPayLaunchScreenActivity.a aVar = GarminPayLaunchScreenActivity.f35305d;
                Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
                io2.d.f94618i.getClass();
                kj0.a.e eVar = new kj0.a.e(h7.c.a(new p("extra.deep.link.data", io2.d.a.a(str))));
                aVar.getClass();
                Intent intentA = GarminPayLaunchScreenActivity.a.a(contextC, eVar);
                intentA.setFlags(268468224);
                ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().startActivity(intentA);
            }
            logger.debug("handlePushProvData: removing push provisioning deep link data");
            atomicReference.set(null);
        } else {
            logger.debug("handlePushProvData: There is no deep link data cached");
        }
        eo2.d.f64794a.getClass();
        Logger logger2 = eo2.d.f64795b;
        logger2.debug("handleEcomDeepLinkData");
        String str2 = eo2.d.f64798e.get();
        if (str2 == null) {
            logger2.debug("handleEcomDeepLinkData: There is no deep link data cached");
            return;
        }
        logger2.debug("handleEcomDeepLinkData: handling cached ciq deep link");
        if (w.z(str2, "/payment/add", false)) {
            GarminPayLaunchScreenActivity.a aVar2 = GarminPayLaunchScreenActivity.f35305d;
            Context contextC2 = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
            kj0.a.b bVar = kj0.a.b.f104932a;
            aVar2.getClass();
            Intent intentA2 = GarminPayLaunchScreenActivity.a.a(contextC2, bVar);
            intentA2.setFlags(268468224);
            ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().startActivity(intentA2);
        } else if (w.z(str2, "/payment/missingPaymentInfo", false)) {
            GarminPayLaunchScreenActivity.a aVar3 = GarminPayLaunchScreenActivity.f35305d;
            Context contextC3 = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
            kj0.a.f fVar = kj0.a.f.f104939a;
            aVar3.getClass();
            Intent intentA3 = GarminPayLaunchScreenActivity.a.a(contextC3, fVar);
            intentA3.setFlags(268468224);
            ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().startActivity(intentA3);
        }
        logger2.debug("handleEcomDeepLinkData: removing ecom deep link data");
        eo2.d.f64798e.set(null);
    }
}
