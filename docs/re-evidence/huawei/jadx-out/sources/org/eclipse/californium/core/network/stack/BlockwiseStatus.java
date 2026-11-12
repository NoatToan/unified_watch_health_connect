package org.eclipse.californium.core.network.stack;

import defpackage.zuv;
import defpackage.zwp;
import defpackage.zwt;
import defpackage.zxt;
import java.nio.ByteBuffer;
import org.eclipse.californium.core.coap.CoAP;
import org.eclipse.californium.core.coap.Message;
import org.eclipse.californium.core.coap.MessageObserver;
import org.eclipse.californium.core.coap.MessageObserverAdapter;
import org.eclipse.californium.core.network.Exchange;
import org.eclipse.californium.elements.EndpointContext;

/* JADX INFO: loaded from: classes20.dex */
public abstract class BlockwiseStatus {
    private final ByteBuffer buf;
    private boolean complete;
    private final int contentFormat;
    private int currentNum;
    private int currentSzx;
    private Exchange exchange;
    public final Message firstMessage;
    private EndpointContext followUpEndpointContext;
    private final zwt keyUri;
    private final int maxTcpBertBulkBlocks;
    private int messageSize;
    private final MessageObserver removeObserver;

    public interface RemoveHandler {
        void remove(BlockwiseStatus blockwiseStatus);
    }

    public BlockwiseStatus(zwt zwtVar, final RemoveHandler removeHandler, Exchange exchange, Message message, int i, int i2) {
        if (zwtVar == null) {
            throw new NullPointerException("Key URI must not be null!");
        }
        if (removeHandler == null) {
            throw new NullPointerException("Remove handler must not be null!");
        }
        if (message == null) {
            throw new NullPointerException("First message must not be null!");
        }
        if (i == 0) {
            throw new IllegalArgumentException("max. size must not be 0!");
        }
        this.keyUri = zwtVar;
        this.removeObserver = new MessageObserverAdapter() { // from class: org.eclipse.californium.core.network.stack.BlockwiseStatus.5
            @Override // org.eclipse.californium.core.coap.MessageObserverAdapter, org.eclipse.californium.core.coap.MessageObserver
            public void onCancel() {
                removeHandler.remove(BlockwiseStatus.this);
            }

            @Override // org.eclipse.californium.core.coap.MessageObserverAdapter
            public void failed() {
                removeHandler.remove(BlockwiseStatus.this);
            }
        };
        this.firstMessage = message;
        message.setProtectFromOffload();
        this.exchange = exchange;
        this.contentFormat = message.getOptions().h();
        this.buf = ByteBuffer.allocate(i);
        this.maxTcpBertBulkBlocks = i2;
        if (i2 > 1) {
            this.currentSzx = 7;
        }
    }

    public zwt getKeyUri() {
        return this.keyUri;
    }

    public boolean isStarting() {
        boolean z;
        synchronized (this) {
            z = this.currentNum == 0;
        }
        return z;
    }

    protected Exchange getExchange(boolean z) {
        Exchange exchange;
        synchronized (this) {
            exchange = this.exchange;
            if (z) {
                this.exchange = null;
                this.followUpEndpointContext = null;
            }
        }
        return exchange;
    }

    protected final int getCurrentOffset() {
        return this.currentNum * zuv.d(this.currentSzx);
    }

    protected final int getCurrentNum() {
        return this.currentNum;
    }

    protected final void setCurrentNum(int i) {
        this.currentNum = i;
    }

    protected final int getCurrentSzx() {
        return this.currentSzx;
    }

    protected final int getCurrentSize() {
        return zuv.d(this.currentSzx);
    }

    protected final int getCurrentPayloadSize() {
        int currentSize = getCurrentSize();
        return this.currentSzx == 7 ? currentSize * this.maxTcpBertBulkBlocks : currentSize;
    }

    protected final void setCurrentSzx(int i) {
        this.currentSzx = i;
    }

    public final boolean hasContentFormat(int i) {
        return this.contentFormat == i;
    }

    public final boolean isComplete() {
        boolean z;
        synchronized (this) {
            z = this.complete;
        }
        return z;
    }

    protected final void setComplete(boolean z) {
        this.complete = z;
    }

    public final boolean complete() {
        boolean z;
        synchronized (this) {
            z = this.complete;
            if (!z) {
                this.complete = true;
            }
        }
        return !z;
    }

    public void restart() {
        synchronized (this) {
            this.messageSize = 0;
            this.buf.position(0);
        }
    }

    protected int getCurrentPosition() {
        return this.buf.position();
    }

    public final void flipBlocksBuffer() {
        this.buf.flip();
    }

    protected final byte[] getBlock(int i, int i2) {
        this.buf.position(i);
        int iMin = Math.min(i2, this.buf.remaining());
        byte[] bArr = new byte[iMin];
        this.buf.get(bArr, 0, iMin);
        return bArr;
    }

    public final void addBlock(byte[] bArr, int i) throws zwp {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        if (this.buf.remaining() < bArr.length) {
            throw new zwp(String.format("response %d exceeds the left buffer %d", Integer.valueOf(bArr.length), Integer.valueOf(this.buf.remaining())), CoAP.ResponseCode.REQUEST_ENTITY_TOO_LARGE);
        }
        this.buf.put(bArr);
        this.messageSize += i;
    }

    public final int getBufferSize() {
        int iCapacity;
        synchronized (this) {
            iCapacity = this.buf.capacity();
        }
        return iCapacity;
    }

    private final byte[] getBody() {
        this.buf.flip();
        byte[] bArr = new byte[this.buf.remaining()];
        this.buf.get(bArr).clear();
        this.messageSize = 0;
        return bArr;
    }

    public EndpointContext getFollowUpEndpointContext(EndpointContext endpointContext) {
        EndpointContext endpointContext2;
        synchronized (this) {
            EndpointContext endpointContext3 = this.followUpEndpointContext;
            if (endpointContext3 == null || !endpointContext3.getPeerAddress().equals(endpointContext.getPeerAddress())) {
                Exchange exchange = this.exchange;
                if (exchange != null) {
                    this.followUpEndpointContext = zxt.c(exchange.p().getDestinationContext(), endpointContext);
                } else {
                    this.followUpEndpointContext = endpointContext;
                }
            }
            endpointContext2 = this.followUpEndpointContext;
        }
        return endpointContext2;
    }

    public String toString() {
        String str;
        synchronized (this) {
            str = String.format("[%s: currentNum=%d, currentSzx=%d, bufferSize=%d, complete=%b]", this.keyUri, Integer.valueOf(this.currentNum), Integer.valueOf(this.currentSzx), Integer.valueOf(getBufferSize()), Boolean.valueOf(this.complete));
        }
        return str;
    }

    public final void assembleReceivedMessage(Message message) {
        synchronized (this) {
            try {
                if (message == null) {
                    throw new NullPointerException("message must not be null");
                }
                Message message2 = this.firstMessage;
                if (message2 == null) {
                    throw new IllegalStateException("first message is not set");
                }
                if (message2.getSourceContext() == null) {
                    throw new IllegalStateException("first message has no peer context");
                }
                message.setSourceContext(this.firstMessage.getSourceContext());
                message.setLocalAddress(this.firstMessage.getLocalAddress());
                message.setType(this.firstMessage.getType());
                message.setMID(this.firstMessage.getMID());
                message.setToken(this.firstMessage.getToken());
                message.setOptions(this.firstMessage.getOptions());
                message.getOptions().ap();
                message.getOptions().at();
                message.addMessageSize(this.messageSize);
                message.setNanoTimestamp(this.firstMessage.getNanoTimestamp());
                if (this.buf.position() > 0) {
                    if (!message.isIntendedPayload()) {
                        message.setUnintendedPayload();
                    }
                    message.setPayload(getBody());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected void prepareOutgoingMessage(final Message message, final Message message2, boolean z) {
        if (message2 == null) {
            throw new NullPointerException("message must not be null!");
        }
        if (message == null) {
            throw new NullPointerException("initial message must not be null!");
        }
        if (message.getDestinationContext() == null) {
            throw new IllegalArgumentException("initial message has no destinationcontext!");
        }
        message2.setType(message.getType());
        message2.setOptions(message.getOptions());
        message2.setMaxResourceBodySize(message.getMaxResourceBodySize());
        message2.addMessageObservers(message.getMessageObservers());
        if (message.isUnintendedPayload()) {
            message2.setUnintendedPayload();
        }
        if (z && (message.getToken() == null || !message.hasMID())) {
            message2.addMessageObserver(0, new MessageObserverAdapter() { // from class: org.eclipse.californium.core.network.stack.BlockwiseStatus.4
                @Override // org.eclipse.californium.core.coap.MessageObserverAdapter, org.eclipse.californium.core.coap.MessageObserver
                public void onReadyToSend() {
                    if (message.getToken() == null) {
                        message.setToken(message2.getToken());
                    }
                    if (message.hasMID()) {
                        return;
                    }
                    message.setMID(message2.getMID());
                }
            });
        }
        message2.addMessageObserver(this.removeObserver);
    }

    public void timeoutCurrentTranfer() {
        final Exchange exchange = getExchange(true);
        if (exchange == null || exchange.y()) {
            return;
        }
        exchange.d(new Runnable() { // from class: org.eclipse.californium.core.network.stack.BlockwiseStatus.2
            @Override // java.lang.Runnable
            public void run() {
                Exchange exchange2 = exchange;
                exchange2.d((Message) exchange2.f());
            }
        });
    }
}
