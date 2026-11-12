package defpackage;

import ohos.ace.plugin.taskmanagerplugin.EventType;
import org.eclipse.californium.core.coap.MessageObserverAdapter;
import org.eclipse.californium.core.network.Exchange;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class zwn extends MessageObserverAdapter {
    protected static final Logger e = aaex.a((Class<?>) zwn.class);
    protected final Exchange d;

    @Override // org.eclipse.californium.core.coap.MessageObserverAdapter, org.eclipse.californium.core.coap.MessageObserver
    public boolean isInternal() {
        return true;
    }

    protected zwn(Exchange exchange) {
        super(true);
        this.d = exchange;
    }

    @Override // org.eclipse.californium.core.coap.MessageObserverAdapter, org.eclipse.californium.core.coap.MessageObserver
    public void onCancel() {
        c("canceled");
    }

    @Override // org.eclipse.californium.core.coap.MessageObserverAdapter
    public void failed() {
        c(EventType.FAILED);
    }

    protected void c(String str) {
        if (this.d.a()) {
            if (this.d.ac()) {
                zvg zvgVarF = this.d.f();
                Logger logger = e;
                Exchange exchange = this.d;
                int mid = zvgVarF.getMID();
                logger.debug("{}, {} request [MID={}, {}]", str, exchange, Integer.valueOf(mid), zvgVarF.getToken());
                return;
            }
            zvf zvfVarJ = this.d.j();
            Logger logger2 = e;
            Exchange exchange2 = this.d;
            int mid2 = zvfVarJ.getMID();
            logger2.debug("{}, {} response [MID={}, {}]", str, exchange2, Integer.valueOf(mid2), zvfVarJ.getToken());
        }
    }
}
