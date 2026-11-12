package ml2;

import com.garmin.feature.garminpay.providers.gpay.sync.NewFitPayCreditCardSync;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d0 implements AsyncFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f119325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f119326c;

    public /* synthetic */ d0(int i14, Object obj, Object obj2) {
        this.f119324a = i14;
        this.f119325b = obj;
        this.f119326c = obj2;
    }

    @Override // com.google.common.util.concurrent.AsyncFunction
    public final ListenableFuture apply(Object obj) {
        int i14 = this.f119324a;
        Object obj2 = this.f119326c;
        Object obj3 = this.f119325b;
        switch (i14) {
            case 0:
                ((e0) obj3).f119329a.trace("Close All Result: {}", Integer.valueOf(((nl2.a) obj).f126501d));
                return ((nl2.d) obj2).f(q.REGISTRATION.f119440a, 0);
            default:
                wl2.b bVar = (wl2.b) obj2;
                com.garmin.device.nfc.h[] hVarArr = (com.garmin.device.nfc.h[]) obj;
                Logger logger = NewFitPayCreditCardSync.f51340f;
                com.garmin.device.nfc.h[] hVarArrD = ((yo2.b) obj3).d();
                if (hVarArrD != null && hVarArrD.length == 10 && hVarArr != null) {
                    return bVar.j((com.garmin.device.nfc.h[]) p13.s.t(hVarArr, hVarArrD), 120000L);
                }
                NewFitPayCreditCardSync.f51340f.warn("addCreditCard: failed to generate tlvs for metadata or image");
                return Futures.immediateFuture(Boolean.TRUE);
        }
    }
}
