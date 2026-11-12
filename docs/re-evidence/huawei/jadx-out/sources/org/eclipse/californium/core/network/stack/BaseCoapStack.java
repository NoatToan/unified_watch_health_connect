package org.eclipse.californium.core.network.stack;

import defpackage.aaex;
import defpackage.zuv;
import defpackage.zvd;
import defpackage.zvf;
import defpackage.zvg;
import defpackage.zvp;
import defpackage.zxp;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import org.eclipse.californium.core.network.Exchange;
import org.eclipse.californium.core.network.Outbox;
import org.eclipse.californium.core.server.MessageDeliverer;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public abstract class BaseCoapStack implements CoapStack, ExtendedCoapStack {
    private static final Logger LOGGER = aaex.a((Class<?>) BaseCoapStack.class);
    private final e bottom;
    private MessageDeliverer deliverer;
    private List<Layer> layers;
    private final Outbox outbox;
    private final b top;

    public BaseCoapStack(Outbox outbox) {
        this.top = new b();
        this.bottom = new e();
        this.outbox = outbox;
    }

    protected final void setLayers(Layer[] layerArr) {
        Layer.c cVarD = new Layer.c().d(this.top);
        for (Layer layer : layerArr) {
            cVarD.d(layer);
        }
        cVarD.d(this.bottom);
        this.layers = cVarD.b();
    }

    @Override // org.eclipse.californium.core.network.stack.CoapStack
    public void sendRequest(Exchange exchange, zvg zvgVar) {
        try {
            this.top.sendRequest(exchange, zvgVar);
        } catch (zxp e2) {
            LOGGER.debug("error send request {} - {}", zvgVar, e2.getMessage());
            zvgVar.setSendError(e2);
        } catch (RuntimeException e3) {
            LOGGER.warn("error send request {}", zvgVar, e3);
            zvgVar.setSendError(e3);
        }
    }

    @Override // org.eclipse.californium.core.network.stack.CoapStack
    public void sendResponse(Exchange exchange, zvf zvfVar) {
        try {
            this.top.sendResponse(exchange, zvfVar);
        } catch (zvp e2) {
            LOGGER.warn("error send response {}", zvfVar, e2);
            zvfVar.setSendError(e2);
        } catch (RuntimeException e3) {
            LOGGER.warn("error send response {}", zvfVar, e3);
            exchange.af();
            zvfVar.setSendError(e3);
        }
    }

    @Override // org.eclipse.californium.core.network.stack.CoapStack
    public void sendEmptyMessage(Exchange exchange, zvd zvdVar) {
        try {
            this.top.sendEmptyMessage(exchange, zvdVar);
        } catch (RuntimeException e2) {
            LOGGER.warn("error send empty message {}", zvdVar, e2);
            zvdVar.setSendError(e2);
        }
    }

    @Override // org.eclipse.californium.core.network.stack.CoapStack
    public void receiveRequest(Exchange exchange, zvg zvgVar) {
        this.bottom.receiveRequest(exchange, zvgVar);
    }

    @Override // org.eclipse.californium.core.network.stack.CoapStack
    public void receiveResponse(Exchange exchange, zvf zvfVar) {
        this.bottom.receiveResponse(exchange, zvfVar);
    }

    @Override // org.eclipse.californium.core.network.stack.CoapStack
    public void receiveEmptyMessage(Exchange exchange, zvd zvdVar) {
        this.bottom.receiveEmptyMessage(exchange, zvdVar);
    }

    @Override // org.eclipse.californium.core.network.stack.CoapStack
    public final void setExecutors(ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2) {
        Iterator<Layer> it = this.layers.iterator();
        while (it.hasNext()) {
            it.next().setExecutors(scheduledExecutorService, scheduledExecutorService2);
        }
    }

    @Override // org.eclipse.californium.core.network.stack.CoapStack
    public final void setDeliverer(MessageDeliverer messageDeliverer) {
        this.deliverer = messageDeliverer;
    }

    @Override // org.eclipse.californium.core.network.stack.CoapStack
    public final boolean hasDeliverer() {
        return this.deliverer != null;
    }

    @Override // org.eclipse.californium.core.network.stack.ExtendedCoapStack
    public <T extends Layer> T getLayer(Class<T> cls) {
        Iterator<Layer> it = this.layers.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (cls.isInstance(t)) {
                return t;
            }
        }
        return null;
    }

    @Override // org.eclipse.californium.core.network.stack.CoapStack
    public void start() {
        Iterator<Layer> it = this.layers.iterator();
        while (it.hasNext()) {
            it.next().start();
        }
    }

    @Override // org.eclipse.californium.core.network.stack.CoapStack
    public void destroy() {
        Iterator<Layer> it = this.layers.iterator();
        while (it.hasNext()) {
            it.next().destroy();
        }
    }

    class b extends AbstractLayer {
        @Override // org.eclipse.californium.core.network.stack.AbstractLayer, org.eclipse.californium.core.network.stack.Layer
        public void receiveEmptyMessage(Exchange exchange, zvd zvdVar) {
        }

        private b() {
        }

        @Override // org.eclipse.californium.core.network.stack.AbstractLayer, org.eclipse.californium.core.network.stack.Layer
        public void sendRequest(Exchange exchange, zvg zvgVar) {
            exchange.a(zvgVar);
            lower().sendRequest(exchange, zvgVar);
        }

        @Override // org.eclipse.californium.core.network.stack.AbstractLayer, org.eclipse.californium.core.network.stack.Layer
        public void sendResponse(Exchange exchange, zvf zvfVar) {
            exchange.c(zvfVar);
            lower().sendResponse(exchange, zvfVar);
        }

        @Override // org.eclipse.californium.core.network.stack.AbstractLayer, org.eclipse.californium.core.network.stack.Layer
        public void receiveRequest(Exchange exchange, zvg zvgVar) {
            if (exchange.p() == null) {
                exchange.a(zvgVar);
            }
            if (BaseCoapStack.this.hasDeliverer()) {
                BaseCoapStack.this.deliverer.deliverRequest(exchange);
            } else {
                BaseCoapStack.LOGGER.error("Top of CoAP stack has no deliverer to deliver request");
            }
        }

        @Override // org.eclipse.californium.core.network.stack.AbstractLayer, org.eclipse.californium.core.network.stack.Layer
        public void receiveResponse(Exchange exchange, zvf zvfVar) {
            if (BaseCoapStack.this.hasDeliverer()) {
                BaseCoapStack.this.deliverer.deliverResponse(exchange, zvfVar);
            } else {
                BaseCoapStack.LOGGER.error("Top of CoAP stack has no deliverer to deliver response");
            }
        }
    }

    class e extends AbstractLayer {
        private e() {
        }

        @Override // org.eclipse.californium.core.network.stack.AbstractLayer, org.eclipse.californium.core.network.stack.Layer
        public void sendRequest(Exchange exchange, zvg zvgVar) {
            BaseCoapStack.this.outbox.sendRequest(exchange, zvgVar);
        }

        @Override // org.eclipse.californium.core.network.stack.AbstractLayer, org.eclipse.californium.core.network.stack.Layer
        public void sendResponse(Exchange exchange, zvf zvfVar) {
            BaseCoapStack.this.outbox.sendResponse(exchange, zvfVar);
            zuv zuvVarJ = zvfVar.getOptions().j();
            if (zuvVarJ == null || !zuvVarJ.j()) {
                zvfVar.onTransferComplete();
            }
        }

        @Override // org.eclipse.californium.core.network.stack.AbstractLayer, org.eclipse.californium.core.network.stack.Layer
        public void sendEmptyMessage(Exchange exchange, zvd zvdVar) {
            BaseCoapStack.this.outbox.sendEmptyMessage(exchange, zvdVar);
        }
    }
}
