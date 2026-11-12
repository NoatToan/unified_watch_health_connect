package defpackage;

import org.eclipse.californium.core.coap.CoAP;
import org.eclipse.californium.core.coap.MessageObserverAdapter;
import org.eclipse.californium.core.network.Exchange;
import org.eclipse.californium.core.network.stack.AbstractLayer;
import org.eclipse.californium.core.observe.ObserveRelation;
import org.eclipse.californium.elements.config.Configuration;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class zwy extends AbstractLayer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f54708b = aaex.a((Class<?>) zwy.class);

    public zwy(Configuration configuration) {
    }

    @Override // org.eclipse.californium.core.network.stack.AbstractLayer, org.eclipse.californium.core.network.stack.Layer
    public void sendResponse(Exchange exchange, zvf zvfVar) {
        CoAP.Type typeG;
        ObserveRelation observeRelationS = exchange.s();
        ObserveRelation.State stateD = ObserveRelation.d(observeRelationS, zvfVar);
        if (stateD == ObserveRelation.State.INIT || stateD == ObserveRelation.State.ESTABILSHED) {
            if (zvfVar.getType() == null) {
                if (stateD == ObserveRelation.State.INIT) {
                    zvg zvgVarF = exchange.f();
                    if (zvgVarF.acknowledge()) {
                        zvfVar.setType(CoAP.Type.ACK);
                    } else if (zvgVarF.isConfirmable()) {
                        zvfVar.setType(observeRelationS.g());
                    } else {
                        zvfVar.setType(CoAP.Type.NON);
                    }
                    f54708b.trace("{} set initial notify type to {}", exchange, zvfVar.getType());
                } else if (stateD == ObserveRelation.State.ESTABILSHED) {
                    if (zvfVar.i()) {
                        typeG = observeRelationS.g();
                    } else {
                        typeG = CoAP.Type.CON;
                    }
                    zvfVar.setType(typeG);
                    f54708b.trace("{} set notify type to {}", exchange, zvfVar.getType());
                }
            }
            if (zvfVar.getType() == CoAP.Type.CON) {
                c(exchange, zvfVar);
            }
            if (observeRelationS.c(zvfVar)) {
                f54708b.debug("a former notification is still in transit. Postponing {}", zvfVar);
                return;
            }
        } else if (observeRelationS != null) {
            if (exchange.y()) {
                f54708b.debug("drop notification {}, relation was canceled!", zvfVar);
                zvfVar.setCanceled(true);
                return;
            } else {
                CoAP.Type type = zvfVar.getType();
                if (type == null || type == CoAP.Type.CON) {
                    zvfVar.addMessageObserver(new zwn(exchange));
                }
            }
        }
        lower().sendResponse(exchange, zvfVar);
    }

    @Override // org.eclipse.californium.core.network.stack.AbstractLayer, org.eclipse.californium.core.network.stack.Layer
    public void receiveResponse(Exchange exchange, zvf zvfVar) {
        if (zvfVar.g() && exchange.p().isCanceled()) {
            f54708b.debug("rejecting notification for canceled Exchange");
            sendEmptyMessage(exchange, zvd.d(zvfVar));
        } else {
            upper().receiveResponse(exchange, zvfVar);
        }
    }

    @Override // org.eclipse.californium.core.network.stack.AbstractLayer, org.eclipse.californium.core.network.stack.Layer
    public void receiveEmptyMessage(Exchange exchange, zvd zvdVar) {
        ObserveRelation observeRelationS = exchange.s();
        if (observeRelationS != null && zvdVar.getType() == CoAP.Type.RST && exchange.k() == Exchange.Origin.REMOTE && exchange.j().g()) {
            observeRelationS.l();
        }
        upper().receiveEmptyMessage(exchange, zvdVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Exchange exchange, zvf zvfVar) {
        zvfVar.addMessageObserver(new c(exchange, zvfVar));
    }

    class c extends MessageObserverAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Exchange f54710b;
        private final zvf d;

        @Override // org.eclipse.californium.core.coap.MessageObserverAdapter, org.eclipse.californium.core.coap.MessageObserver
        public boolean isInternal() {
            return true;
        }

        public c(Exchange exchange, zvf zvfVar) {
            this.f54710b = exchange;
            this.d = zvfVar;
        }

        @Override // org.eclipse.californium.core.coap.MessageObserverAdapter, org.eclipse.californium.core.coap.MessageObserver
        public void onCancel() {
            this.f54710b.d(new Runnable() { // from class: zwy.c.1
                @Override // java.lang.Runnable
                public void run() {
                    zvf zvfVarC = c.this.f54710b.s().c(c.this.d, true);
                    if (zvfVarC != null) {
                        zvfVarC.cancel();
                    }
                }
            });
        }

        @Override // org.eclipse.californium.core.coap.MessageObserverAdapter, org.eclipse.californium.core.coap.MessageObserver
        public void onAcknowledgement() {
            this.f54710b.d(new Runnable() { // from class: zwy.c.4
                @Override // java.lang.Runnable
                public void run() {
                    ObserveRelation observeRelationS = c.this.f54710b.s();
                    boolean zI = observeRelationS.i();
                    zvf zvfVarC = observeRelationS.c(c.this.d, true);
                    if (zvfVarC != null) {
                        zwy.f54708b.debug("notification has been acknowledged, send the next one");
                        if (!zI) {
                            zwy.super.sendResponse(c.this.f54710b, zvfVarC);
                        } else {
                            zvfVarC.cancel();
                        }
                    }
                }
            });
        }

        @Override // org.eclipse.californium.core.coap.MessageObserverAdapter, org.eclipse.californium.core.coap.MessageObserver
        public void onRetransmission() {
            ObserveRelation observeRelationS = this.f54710b.s();
            boolean zI = observeRelationS.i();
            zvf zvfVarC = observeRelationS.c(this.d, false);
            if (zI) {
                this.d.cancel();
                if (zvfVarC != null) {
                    zvfVarC.cancel();
                    zvfVarC = null;
                }
            }
            if (zvfVarC != null) {
                zwy.f54708b.debug("notification has timed out and there is a fresher notification for the retransmission");
                if (zvfVarC.getType() != CoAP.Type.CON) {
                    zvfVarC.setType(CoAP.Type.CON);
                    zwy.this.c(this.f54710b, zvfVarC);
                }
                this.d.cancel();
                zwy.super.sendResponse(this.f54710b, zvfVarC);
            }
        }

        @Override // org.eclipse.californium.core.coap.MessageObserverAdapter, org.eclipse.californium.core.coap.MessageObserver
        public void onTimeout() {
            ObserveRelation observeRelationS = this.f54710b.s();
            zwy.f54708b.info("notification for token [{}] timed out. Canceling all relations with source [{}]", observeRelationS.d().p().getToken(), zzp.e(observeRelationS.h()));
            observeRelationS.c();
        }

        @Override // org.eclipse.californium.core.coap.MessageObserverAdapter
        public void failed() {
            ObserveRelation observeRelationS = this.f54710b.s();
            zwy.f54708b.info("notification for token [{}] failed. Source [{}].", observeRelationS.d().p().getToken(), zzp.e(observeRelationS.h()));
            observeRelationS.e();
        }
    }
}
