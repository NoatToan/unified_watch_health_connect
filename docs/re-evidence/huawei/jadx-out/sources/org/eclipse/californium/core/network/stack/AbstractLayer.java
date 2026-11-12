package org.eclipse.californium.core.network.stack;

import defpackage.aaex;
import defpackage.zvd;
import defpackage.zvf;
import defpackage.zvg;
import java.util.concurrent.ScheduledExecutorService;
import org.eclipse.californium.core.coap.CoAP;
import org.eclipse.californium.core.coap.Message;
import org.eclipse.californium.core.network.Exchange;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public abstract class AbstractLayer implements Layer {
    private static final Logger LOGGER = aaex.a((Class<?>) AbstractLayer.class);
    protected ScheduledExecutorService executor;
    protected ScheduledExecutorService secondaryExecutor;
    private Layer upperLayer = a.d();
    private Layer lowerLayer = a.d();

    @Override // org.eclipse.californium.core.network.stack.Layer
    public void destroy() {
    }

    @Override // org.eclipse.californium.core.network.stack.Layer
    public void start() {
    }

    @Override // org.eclipse.californium.core.network.stack.Layer
    public void sendRequest(Exchange exchange, zvg zvgVar) {
        this.lowerLayer.sendRequest(exchange, zvgVar);
    }

    @Override // org.eclipse.californium.core.network.stack.Layer
    public void sendResponse(Exchange exchange, zvf zvfVar) {
        this.lowerLayer.sendResponse(exchange, zvfVar);
    }

    @Override // org.eclipse.californium.core.network.stack.Layer
    public void sendEmptyMessage(Exchange exchange, zvd zvdVar) {
        this.lowerLayer.sendEmptyMessage(exchange, zvdVar);
    }

    @Override // org.eclipse.californium.core.network.stack.Layer
    public void receiveRequest(Exchange exchange, zvg zvgVar) {
        this.upperLayer.receiveRequest(exchange, zvgVar);
    }

    @Override // org.eclipse.californium.core.network.stack.Layer
    public void receiveResponse(Exchange exchange, zvf zvfVar) {
        this.upperLayer.receiveResponse(exchange, zvfVar);
    }

    @Override // org.eclipse.californium.core.network.stack.Layer
    public void receiveEmptyMessage(Exchange exchange, zvd zvdVar) {
        this.upperLayer.receiveEmptyMessage(exchange, zvdVar);
    }

    @Override // org.eclipse.californium.core.network.stack.Layer
    public final void setLowerLayer(Layer layer) {
        Layer layer2 = this.lowerLayer;
        if (layer2 != layer) {
            if (layer2 != null) {
                layer2.setUpperLayer(null);
            }
            this.lowerLayer = layer;
            layer.setUpperLayer(this);
        }
    }

    protected final Layer lower() {
        return this.lowerLayer;
    }

    @Override // org.eclipse.californium.core.network.stack.Layer
    public final void setUpperLayer(Layer layer) {
        Layer layer2 = this.upperLayer;
        if (layer2 != layer) {
            if (layer2 != null) {
                layer2.setLowerLayer(null);
            }
            this.upperLayer = layer;
            layer.setLowerLayer(this);
        }
    }

    protected final Layer upper() {
        return this.upperLayer;
    }

    @Override // org.eclipse.californium.core.network.stack.Layer
    public final void setExecutors(ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2) {
        this.executor = scheduledExecutorService;
        this.secondaryExecutor = scheduledExecutorService2;
    }

    public final void reject(Exchange exchange, Message message) {
        if (message.getType() == CoAP.Type.ACK || message.getType() == CoAP.Type.RST) {
            throw new IllegalArgumentException("Can only reject CON/NON messages");
        }
        lower().sendEmptyMessage(exchange, zvd.d(message));
    }

    public static final class a implements Layer {
        private static final a d = new a();

        @Override // org.eclipse.californium.core.network.stack.Layer
        public void destroy() {
        }

        @Override // org.eclipse.californium.core.network.stack.Layer
        public void setExecutors(ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2) {
        }

        @Override // org.eclipse.californium.core.network.stack.Layer
        public void setLowerLayer(Layer layer) {
        }

        @Override // org.eclipse.californium.core.network.stack.Layer
        public void setUpperLayer(Layer layer) {
        }

        @Override // org.eclipse.californium.core.network.stack.Layer
        public void start() {
        }

        public static a d() {
            return d;
        }

        @Override // org.eclipse.californium.core.network.stack.Layer
        public void sendRequest(Exchange exchange, zvg zvgVar) {
            AbstractLayer.LOGGER.error("No lower layer set for sending request [{}]", zvgVar);
        }

        @Override // org.eclipse.californium.core.network.stack.Layer
        public void sendResponse(Exchange exchange, zvf zvfVar) {
            AbstractLayer.LOGGER.error("No lower layer set for sending response [{}]", zvfVar);
        }

        @Override // org.eclipse.californium.core.network.stack.Layer
        public void sendEmptyMessage(Exchange exchange, zvd zvdVar) {
            AbstractLayer.LOGGER.error("No lower layer set for sending empty message [{}]", zvdVar);
        }

        @Override // org.eclipse.californium.core.network.stack.Layer
        public void receiveRequest(Exchange exchange, zvg zvgVar) {
            AbstractLayer.LOGGER.error("No upper layer set for receiving request [{}]", zvgVar);
        }

        @Override // org.eclipse.californium.core.network.stack.Layer
        public void receiveResponse(Exchange exchange, zvf zvfVar) {
            AbstractLayer.LOGGER.error("No lower layer set for receiving response [{}]", zvfVar);
        }

        @Override // org.eclipse.californium.core.network.stack.Layer
        public void receiveEmptyMessage(Exchange exchange, zvd zvdVar) {
            AbstractLayer.LOGGER.error("No lower layer set for receiving empty message [{}]", zvdVar);
        }
    }
}
