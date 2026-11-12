package defpackage;

import com.huawei.sim.esimhandler.BaseHandler;
import com.huawei.sim.esimhandler.EsimChainHandler;

/* JADX INFO: loaded from: classes15.dex */
public class pwj extends BaseHandler implements EsimChainHandler {
    protected EsimChainHandler d = null;

    @Override // com.huawei.sim.esimhandler.EsimChainHandler
    public void setNext(EsimChainHandler esimChainHandler) {
        this.d = esimChainHandler;
    }

    @Override // com.huawei.sim.esimhandler.EsimChainHandler
    public EsimChainHandler getNext() {
        return this.d;
    }

    @Override // com.huawei.sim.esimhandler.EsimChainHandler
    public EsimChainHandler getTailHandler() {
        EsimChainHandler next = this;
        while (next.getNext() != null) {
            next = next.getNext();
        }
        return next;
    }

    @Override // com.huawei.sim.esimhandler.EsimHandler
    public void handle(pxp pxpVar) {
        EsimChainHandler esimChainHandler;
        if (pxpVar == null || (esimChainHandler = this.d) == null) {
            return;
        }
        esimChainHandler.handle(pxpVar);
    }
}
