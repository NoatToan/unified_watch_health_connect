package org.eclipse.californium.core.network.stack;

import defpackage.aaex;
import defpackage.zvd;
import defpackage.zvf;
import defpackage.zvg;
import defpackage.zwx;
import defpackage.zxt;
import java.util.Random;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.eclipse.californium.core.coap.CoAP;
import org.eclipse.californium.core.coap.Message;
import org.eclipse.californium.core.coap.MessageObserverAdapter;
import org.eclipse.californium.core.config.CoapConfig;
import org.eclipse.californium.core.network.Exchange;
import org.eclipse.californium.elements.EndpointContext;
import org.eclipse.californium.elements.config.Configuration;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class ReliabilityLayer extends AbstractLayer {

    @Deprecated
    protected static final Logger LOGGER = aaex.a((Class<?>) ReliabilityLayer.class);
    protected final zwx defaultReliabilityLayerParameters;
    private final int maxLeisureMillis;
    private final Random rand = new Random();
    private final AtomicInteger counter = new AtomicInteger();

    public ReliabilityLayer(Configuration configuration) {
        zwx zwxVarE = zwx.e().a(configuration).e();
        this.defaultReliabilityLayerParameters = zwxVarE;
        int iD = configuration.d(CoapConfig.w, TimeUnit.MILLISECONDS);
        this.maxLeisureMillis = iD;
        Logger logger = LOGGER;
        logger.trace("Max. leisure for multicast server={}ms", Integer.valueOf(iD));
        logger.trace("ReliabilityLayer uses ACK_TIMEOUT={}ms, MAX_ACK_TIMEOUT={}ms, ACK_RANDOM_FACTOR={}, and ACK_TIMEOUT_SCALE={} as default", Integer.valueOf(zwxVarE.c()), Integer.valueOf(zwxVarE.a()), Float.valueOf(zwxVarE.d()), Float.valueOf(zwxVarE.b()));
    }

    @Override // org.eclipse.californium.core.network.stack.AbstractLayer, org.eclipse.californium.core.network.stack.Layer
    public void sendRequest(Exchange exchange, zvg zvgVar) {
        LOGGER.debug("{} send request", exchange);
        prepareRequest(exchange, zvgVar);
        lower().sendRequest(exchange, zvgVar);
    }

    protected void prepareRequest(Exchange exchange, zvg zvgVar) {
        if (zvgVar.getType() == null) {
            zvgVar.setType(CoAP.Type.CON);
        }
        if (zvgVar.getType() == CoAP.Type.CON) {
            LOGGER.debug("{} prepare retransmission for {}", exchange, zvgVar);
            prepareRetransmission(exchange, new RetransmissionTask(exchange, zvgVar) { // from class: org.eclipse.californium.core.network.stack.ReliabilityLayer.5
                @Override // org.eclipse.californium.core.network.stack.ReliabilityLayer.RetransmissionTask
                public void retransmit() {
                    zvg zvgVar2 = (zvg) this.message;
                    if (zvgVar2.getEffectiveDestinationContext() != zvgVar2.getDestinationContext()) {
                        this.exchange.ab();
                    }
                    ReliabilityLayer.LOGGER.debug("{} send request, failed transmissions: {}", this.exchange, Integer.valueOf(this.exchange.m()));
                    ReliabilityLayer.this.updateRetransmissionTimeout(this.exchange, getReliabilityLayerParameters());
                    ReliabilityLayer.this.lower().sendRequest(this.exchange, zvgVar2);
                }
            });
        }
    }

    @Override // org.eclipse.californium.core.network.stack.AbstractLayer, org.eclipse.californium.core.network.stack.Layer
    public void sendResponse(Exchange exchange, zvf zvfVar) {
        int iNextInt;
        LOGGER.debug("{} send response {}", exchange, zvfVar);
        prepareResponse(exchange, zvfVar);
        if (exchange.f().j() && zvfVar.getType() == CoAP.Type.NON) {
            synchronized (this.rand) {
                iNextInt = this.rand.nextInt(this.maxLeisureMillis);
            }
            exchange.a(this.executor.schedule(new c(exchange, zvfVar), iNextInt, TimeUnit.MILLISECONDS));
            return;
        }
        lower().sendResponse(exchange, zvfVar);
    }

    protected void prepareResponse(Exchange exchange, zvf zvfVar) {
        zvg zvgVarF = exchange.f();
        CoAP.Type type = zvfVar.getType();
        if (type == null) {
            CoAP.Type type2 = zvgVarF.getType();
            if (zvgVarF.acknowledge()) {
                zvfVar.setType(CoAP.Type.ACK);
            } else {
                zvfVar.setType(type2);
            }
            CoAP.Type type3 = zvfVar.getType();
            LOGGER.trace("{} set response type to {} (request was {})", exchange, type3, type2);
            type = type3;
        } else if (type == CoAP.Type.RST) {
            zvgVarF.setRejected(true);
        } else if (type == CoAP.Type.ACK) {
            zvgVarF.acknowledge();
        } else {
            zvgVarF.setAcknowledged(true);
        }
        if (type == CoAP.Type.ACK || type == CoAP.Type.RST) {
            zvfVar.setMID(zvgVarF.getMID());
        }
        if (type == CoAP.Type.CON) {
            LOGGER.debug("{} prepare retransmission for {}", exchange, zvfVar);
            prepareRetransmission(exchange, new RetransmissionTask(exchange, zvfVar) { // from class: org.eclipse.californium.core.network.stack.ReliabilityLayer.3
                @Override // org.eclipse.californium.core.network.stack.ReliabilityLayer.RetransmissionTask
                public void retransmit() {
                    zvf zvfVar2 = (zvf) this.message;
                    ReliabilityLayer.LOGGER.debug("{} send response {}, failed transmissions: {}", this.exchange, zvfVar2, Integer.valueOf(this.exchange.m()));
                    ReliabilityLayer.this.updateRetransmissionTimeout(this.exchange, getReliabilityLayerParameters());
                    ReliabilityLayer.this.lower().sendResponse(this.exchange, zvfVar2);
                }
            });
        }
    }

    private void prepareRetransmission(Exchange exchange, RetransmissionTask retransmissionTask) {
        if (this.executor.isShutdown()) {
            LOGGER.info("Endpoint is being destroyed: skipping retransmission");
            return;
        }
        exchange.a((ScheduledFuture<?>) null);
        updateRetransmissionTimeout(exchange, retransmissionTask.getReliabilityLayerParameters());
        retransmissionTask.message.addMessageObserver(retransmissionTask);
    }

    @Override // org.eclipse.californium.core.network.stack.AbstractLayer, org.eclipse.californium.core.network.stack.Layer
    public void receiveRequest(Exchange exchange, zvg zvgVar) {
        if (zvgVar.isDuplicate()) {
            zvf zvfVarJ = exchange.j();
            zvg zvgVarF = exchange.f();
            if (zvfVarJ != null) {
                if (zvfVarJ.getSendError() == null) {
                    long jU = exchange.u();
                    if (jU == 0 || jU - zvgVar.getNanoTimestamp() > 0) {
                        LOGGER.debug("{}: {} duplicate request {}, server sent response delayed, ignore request", Integer.valueOf(this.counter.incrementAndGet()), exchange, zvgVar);
                        return;
                    }
                } else {
                    zvfVarJ.setSendError(null);
                }
            }
            exchange.aa();
            if (zvfVarJ != null) {
                EndpointContext sourceContext = zvgVar.getSourceContext();
                if (!zvfVarJ.getEffectiveDestinationContext().getPeerAddress().equals(sourceContext.getPeerAddress())) {
                    zvfVarJ.setEffectiveDestinationContext(sourceContext);
                }
                CoAP.Type type = zvfVarJ.getType();
                if (type == CoAP.Type.NON || type == CoAP.Type.CON) {
                    if (zvgVar.acknowledge()) {
                        sendEmptyMessage(exchange, zvd.a(zvgVar));
                    }
                    if (type == CoAP.Type.CON) {
                        if (zvfVarJ.isAcknowledged()) {
                            LOGGER.debug("{} request duplicate: ignore, response already acknowledged!", exchange);
                            return;
                        }
                        LOGGER.debug("{} request duplicate: retransmit response, failed: {}, response: {}", exchange, Integer.valueOf(exchange.x()), zvfVarJ);
                        zvfVarJ.retransmitting();
                        sendResponse(exchange, zvfVarJ);
                        return;
                    }
                    if (zvfVarJ.g()) {
                        exchange.x();
                    }
                }
                LOGGER.debug("{} respond with the current response to the duplicate request", exchange);
                lower().sendResponse(exchange, zvfVarJ);
                return;
            }
            if (zvgVarF.isAcknowledged()) {
                LOGGER.debug("{} duplicate request was acknowledged but no response computed yet. Retransmit ACK", exchange);
                sendEmptyMessage(exchange, zvd.a(zvgVar));
                return;
            } else if (zvgVarF.isRejected()) {
                LOGGER.debug("{} duplicate request was rejected. Reject again", exchange);
                sendEmptyMessage(exchange, zvd.d(zvgVar));
                return;
            } else {
                LOGGER.debug("{} server has not yet decided what to do with the request. We ignore the duplicate.", exchange);
                return;
            }
        }
        exchange.d(zvgVar);
        upper().receiveRequest(exchange, zvgVar);
    }

    @Override // org.eclipse.californium.core.network.stack.AbstractLayer, org.eclipse.californium.core.network.stack.Layer
    public void receiveResponse(Exchange exchange, zvf zvfVar) {
        if (processResponse(exchange, zvfVar)) {
            upper().receiveResponse(exchange, zvfVar);
        }
    }

    protected boolean processResponse(Exchange exchange, zvf zvfVar) {
        zvd zvdVarA;
        exchange.a((ScheduledFuture<?>) null);
        if (zvfVar.getType() == CoAP.Type.CON) {
            if (zvfVar.isDuplicate()) {
                long jU = exchange.u();
                if (jU == 0 || jU - zvfVar.getNanoTimestamp() > 0) {
                    LOGGER.debug("{}: {} duplicate response {}, server sent ACK delayed, ignore response", Integer.valueOf(this.counter.incrementAndGet()), exchange, zvfVar);
                    return false;
                }
                if (zvfVar.isRejected()) {
                    LOGGER.debug("{} reject duplicate CON response, request canceled.", exchange);
                    zvdVarA = zvd.d(zvfVar);
                    zvfVar.setRejected(true);
                } else {
                    LOGGER.debug("{} acknowledging duplicate CON response", exchange);
                    zvdVarA = zvd.a(zvfVar);
                    zvfVar.setAcknowledged(true);
                }
            } else if (exchange.p().isCanceled()) {
                LOGGER.debug("{} reject CON response, request canceled.", exchange);
                zvdVarA = zvd.d(zvfVar);
                zvfVar.setRejected(true);
            } else {
                LOGGER.debug("{} acknowledging CON response", exchange);
                zvdVarA = zvd.a(zvfVar);
                zvfVar.setAcknowledged(true);
            }
            sendEmptyMessage(exchange, zvdVarA);
        }
        if (zvfVar.isDuplicate()) {
            if (zvfVar.getType() != CoAP.Type.CON) {
                LOGGER.debug("{} ignoring duplicate response", exchange);
            }
            return false;
        }
        exchange.f().setAcknowledged(true);
        exchange.a(zvfVar);
        return true;
    }

    @Override // org.eclipse.californium.core.network.stack.AbstractLayer, org.eclipse.californium.core.network.stack.Layer
    public void receiveEmptyMessage(Exchange exchange, zvd zvdVar) {
        if (processEmptyMessage(exchange, zvdVar)) {
            upper().receiveEmptyMessage(exchange, zvdVar);
        }
    }

    protected boolean processEmptyMessage(Exchange exchange, zvd zvdVar) {
        Message messageJ;
        String str;
        exchange.a((ScheduledFuture<?>) null);
        if (exchange.ac()) {
            messageJ = exchange.f();
            str = "request";
        } else {
            messageJ = exchange.j();
            str = "response";
        }
        int size = messageJ.getMessageObservers().size();
        if (zvdVar.getType() == CoAP.Type.ACK) {
            LOGGER.debug("{} acknowledge {} for {} {} ({} msg observer)", exchange, zvdVar, str, messageJ, Integer.valueOf(size));
            messageJ.acknowledge();
        } else if (zvdVar.getType() == CoAP.Type.RST) {
            LOGGER.debug("{} reject {} for {} {} ({} msg observer)", exchange, zvdVar, str, messageJ, Integer.valueOf(size));
            messageJ.setRejected(true);
        } else {
            LOGGER.warn("{} received empty message that is neither ACK nor RST: {}", exchange, zvdVar);
            return false;
        }
        return true;
    }

    protected void updateRetransmissionTimeout(Exchange exchange, zwx zwxVar) {
        int iV;
        if (exchange.m() == 0) {
            exchange.e(zwxVar.b());
            iV = getRandomTimeout(zwxVar.c(), zwxVar.d());
        } else {
            iV = (int) (exchange.v() * exchange.g());
        }
        exchange.e(Math.min(zwxVar.a(), iV));
    }

    protected int getRandomTimeout(int i, float f) {
        int iNextInt;
        if (f <= 1.0d) {
            return i;
        }
        int i2 = (int) (i * f);
        synchronized (this.rand) {
            iNextInt = this.rand.nextInt((i2 - i) + 1);
        }
        return i + iNextInt;
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final zvf f44452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final Exchange f44453b;

        private c(Exchange exchange, zvf zvfVar) {
            this.f44453b = exchange;
            this.f44452a = zvfVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f44453b.d(new Runnable() { // from class: org.eclipse.californium.core.network.stack.ReliabilityLayer.c.1
                @Override // java.lang.Runnable
                public void run() {
                    ReliabilityLayer.this.lower().sendResponse(c.this.f44453b, c.this.f44452a);
                }
            });
        }
    }

    protected abstract class RetransmissionTask extends MessageObserverAdapter implements Runnable {
        protected final Exchange exchange;
        protected final Message message;

        public abstract void retransmit();

        private RetransmissionTask(Exchange exchange, Message message) {
            super(true);
            this.exchange = exchange;
            this.message = message;
        }

        public zwx getReliabilityLayerParameters() {
            zwx reliabilityLayerParameters = this.message.getReliabilityLayerParameters();
            return reliabilityLayerParameters == null ? ReliabilityLayer.this.defaultReliabilityLayerParameters : reliabilityLayerParameters;
        }

        private boolean isInTransit() {
            Message messageJ;
            if (this.message.isAcknowledged() || this.exchange.y()) {
                return false;
            }
            if (this.exchange.ac()) {
                messageJ = this.exchange.f();
            } else {
                messageJ = this.exchange.j();
            }
            return this.message == messageJ;
        }

        @Override // org.eclipse.californium.core.coap.MessageObserverAdapter, org.eclipse.californium.core.coap.MessageObserver
        public void onSent(boolean z) {
            if (isInTransit()) {
                this.exchange.d(new Runnable() { // from class: org.eclipse.californium.core.network.stack.ReliabilityLayer.RetransmissionTask.1
                    @Override // java.lang.Runnable
                    public void run() {
                        RetransmissionTask.this.startTimer();
                    }
                });
            }
        }

        public void startTimer() {
            if (isInTransit()) {
                this.exchange.a(ReliabilityLayer.this.executor.schedule(this, this.exchange.g(), TimeUnit.MILLISECONDS));
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.exchange.d(new Runnable() { // from class: org.eclipse.californium.core.network.stack.ReliabilityLayer.RetransmissionTask.5
                @Override // java.lang.Runnable
                public void run() {
                    RetransmissionTask.this.retry();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public void retry() {
            Message messageJ;
            try {
                this.exchange.a((ScheduledFuture<?>) null);
                if (this.exchange.y()) {
                    ReliabilityLayer.LOGGER.debug("Timeout: for {}, {}", this.exchange, this.message);
                    return;
                }
                if (this.exchange.ac()) {
                    messageJ = this.exchange.f();
                } else {
                    messageJ = this.exchange.j();
                }
                Message message = this.message;
                if (message != messageJ) {
                    ReliabilityLayer.LOGGER.debug("Timeout: for {}, message has changed!", this.exchange);
                    return;
                }
                if (message.isAcknowledged()) {
                    ReliabilityLayer.LOGGER.trace("Timeout: for {} message already acknowledged, cancel retransmission of {}", this.exchange, this.message);
                    return;
                }
                if (this.message.isRejected()) {
                    ReliabilityLayer.LOGGER.trace("Timeout: for {} message already rejected, cancel retransmission of {}", this.exchange, this.message);
                    return;
                }
                if (this.message.isCanceled()) {
                    ReliabilityLayer.LOGGER.trace("Timeout: for {}, {} is canceled, do not retransmit", this.exchange, this.message);
                    return;
                }
                int iX = this.exchange.x();
                if (iX == 1) {
                    this.message.setEffectiveDestinationContext(zxt.c(this.message.getDestinationContext(), this.exchange.h()));
                }
                ReliabilityLayer.LOGGER.debug("Timeout: for {} retry {} of {}", this.exchange, Integer.valueOf(iX), this.message);
                int i = getReliabilityLayerParameters().i();
                if (iX <= i) {
                    ReliabilityLayer.LOGGER.debug("Timeout: for {} retransmit message, failed-count: {}, message: {}", this.exchange, Integer.valueOf(iX), this.message);
                    this.message.retransmitting();
                    if (this.message.isCanceled()) {
                        ReliabilityLayer.LOGGER.trace("Timeout: for {}, {} got canceled, do not retransmit", this.exchange, this.message);
                        return;
                    } else if (this.exchange.y()) {
                        ReliabilityLayer.LOGGER.debug("Timeout: for {}, {} got completed, do not retransmit", this.exchange, this.message);
                        return;
                    } else {
                        retransmit();
                        return;
                    }
                }
                Logger logger = ReliabilityLayer.LOGGER;
                Exchange exchange = this.exchange;
                logger.debug("Timeout: for {} retransmission limit {} reached, exchange failed with timeout {} ms, message: {}", exchange, Integer.valueOf(i), Integer.valueOf(exchange.g()), this.message);
                this.exchange.d(this.message);
            } catch (Exception e) {
                ReliabilityLayer.LOGGER.error("Exception for {} in MessageObserver: {}", this.exchange, e.getMessage(), e);
            }
        }
    }
}
