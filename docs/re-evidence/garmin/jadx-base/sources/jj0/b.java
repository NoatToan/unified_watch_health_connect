package jj0;

import l73.k;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ljj0/b;", "Lpi2/c;", "<init>", "()V", "Ljj0/a;", "event", "", "initializationFinishedEventReceived", "(Ljj0/a;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements pi2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f98948a;

    public b() {
        int i14 = gt2.c.f79010a;
        this.f98948a = gt2.b.f79005a.h("PAY#InitReceiver");
    }

    @k
    public final void initializationFinishedEventReceived(a event) {
        event.getClass();
        Logger logger = this.f98948a;
        logger.debug("initializationFinishedEventReceived");
        if (event.f98947a == null) {
            kj0.c.f104941a.getClass();
            kj0.c.f104945e.set(kj0.e.FAILED);
            logger.error("firstPageHelperIntent is null, init status set to FAILED");
        } else {
            kj0.c.f104941a.getClass();
            kj0.c.f104945e.set(kj0.e.INITIALIZED);
            logger.debug("init status set to INITIALIZED");
        }
    }
}
