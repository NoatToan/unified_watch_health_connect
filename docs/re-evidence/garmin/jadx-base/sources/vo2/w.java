package vo2;

import com.garmin.feature.garminpay.providers.gpay.sync.NewFitPayCreditCardSync;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NewFitPayCreditCardSync f179217a;

    public w(NewFitPayCreditCardSync newFitPayCreditCardSync) {
        this.f179217a = newFitPayCreditCardSync;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f179217a.f51343c.shutdown();
    }
}
