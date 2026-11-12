package org.eclipse.californium.core.coap;

import androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0;
import com.huawei.operation.utils.Constants;
import defpackage.aaex;
import defpackage.zuv;
import defpackage.zve;
import defpackage.zvi;
import defpackage.zwx;
import defpackage.zzg;
import defpackage.zzp;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.eclipse.californium.elements.EndpointContext;
import org.eclipse.californium.elements.util.ClockUtil;
import org.eclipse.californium.elements.util.NetworkInterfacesUtil;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public abstract class Message {

    @Deprecated
    protected static final Logger LOGGER = aaex.a((Class<?>) Message.class);
    public static final int MAX_MID = 65535;
    public static final int NONE = -1;
    private volatile byte[] bytes;
    private volatile boolean canceled;
    private volatile EndpointContext destinationContext;
    private volatile boolean duplicate;
    private volatile EndpointContext effectiveDestinationContext;
    private InetSocketAddress localAddress;
    private int maxResourceBodySize;
    private volatile int messageSize;
    private volatile long nanoTimestamp;
    private volatile OffloadMode offload;
    private zvi options;
    private volatile zwx parameters;
    private volatile boolean protectFromOffload;
    private volatile boolean rejected;
    private volatile Throwable sendError;
    private volatile boolean sent;
    private volatile EndpointContext sourceContext;
    private volatile boolean timedOut;
    private volatile boolean transferComplete;
    private CoAP.Type type;
    private boolean unintendedPayload;
    private volatile int mid = -1;
    private volatile zve token = null;
    private byte[] payload = zzg.f54809a;
    private final AtomicBoolean acknowledged = new AtomicBoolean();
    private final AtomicReference<List<MessageObserver>> messageObservers = new AtomicReference<>();
    private volatile List<MessageObserver> unmodifiableMessageObserversFacade = null;

    public enum OffloadMode {
        PAYLOAD,
        FULL
    }

    public abstract void assertPayloadMatchsBlocksize();

    public abstract int getRawCode();

    public abstract boolean hasBlock(zuv zuvVar);

    public boolean isIntendedPayload() {
        return true;
    }

    public Message() {
    }

    protected String toTracingString(String str) {
        OffloadMode offloadMode;
        zvi zviVar;
        String statusTracingString = getStatusTracingString();
        String payloadTracingString = getPayloadTracingString();
        synchronized (this.acknowledged) {
            offloadMode = this.offload;
            zviVar = this.options;
        }
        if (offloadMode == OffloadMode.FULL) {
            CoAP.Type type = getType();
            int mid = getMID();
            return String.format("%s-%-6s MID=%5d, Token=%s %s(offloaded!)", type, str, Integer.valueOf(mid), getTokenString(), statusTracingString);
        }
        if (offloadMode == OffloadMode.PAYLOAD) {
            CoAP.Type type2 = getType();
            int mid2 = getMID();
            return String.format("%s-%-6s MID=%5d, Token=%s, OptionSet=%s, %s(offloaded!)", type2, str, Integer.valueOf(mid2), getTokenString(), zviVar, statusTracingString);
        }
        CoAP.Type type3 = getType();
        int mid3 = getMID();
        return String.format("%s-%-6s MID=%5d, Token=%s, OptionSet=%s, %s%s", type3, str, Integer.valueOf(mid3), getTokenString(), zviVar, statusTracingString, payloadTracingString);
    }

    public Message(CoAP.Type type) {
        this.type = type;
    }

    public CoAP.Type getType() {
        return this.type;
    }

    public Message setType(CoAP.Type type) {
        this.type = type;
        return this;
    }

    public boolean isConfirmable() {
        return getType() == CoAP.Type.CON;
    }

    public Message setConfirmable(boolean z) {
        setType(z ? CoAP.Type.CON : CoAP.Type.NON);
        return this;
    }

    public void setUnintendedPayload() {
        if (isIntendedPayload()) {
            throw new IllegalStateException("Message is already intended to have payload!");
        }
        this.unintendedPayload = true;
    }

    public boolean isUnintendedPayload() {
        return this.unintendedPayload;
    }

    public void setReliabilityLayerParameters(zwx zwxVar) {
        this.parameters = zwxVar;
    }

    public zwx getReliabilityLayerParameters() {
        return this.parameters;
    }

    public int getMID() {
        return this.mid;
    }

    public boolean hasMID() {
        return this.mid != -1;
    }

    public Message setMID(int i) {
        if (i > 65535 || i < -1) {
            throw new IllegalArgumentException("The MID must be an unsigned 16-bit number but was " + i);
        }
        if (this.bytes != null) {
            throw new IllegalStateException("already serialized!");
        }
        this.mid = i;
        return this;
    }

    public void removeMID() {
        setMID(-1);
    }

    public boolean hasEmptyToken() {
        return this.token == null || this.token.b();
    }

    public zve getToken() {
        return this.token;
    }

    public byte[] getTokenBytes() {
        if (this.token == null) {
            return null;
        }
        return this.token.d();
    }

    public String getTokenString() {
        return this.token == null ? Constants.NULL : this.token.a();
    }

    public Message setToken(byte[] bArr) {
        return setToken(bArr != null ? new zve(bArr) : null);
    }

    public Message setToken(zve zveVar) {
        this.token = zveVar;
        if (this.bytes == null) {
            return this;
        }
        throw new IllegalStateException("already serialized!");
    }

    public zvi getOptions() {
        zvi zviVar;
        synchronized (this.acknowledged) {
            if (this.offload == OffloadMode.FULL) {
                throw new IllegalStateException("message " + this.offload + " offloaded! " + this);
            }
            if (this.options == null) {
                this.options = new zvi();
            }
            zviVar = this.options;
        }
        return zviVar;
    }

    public Message setOptions(zvi zviVar) {
        this.options = new zvi(zviVar);
        return this;
    }

    public int getMaxResourceBodySize() {
        return this.maxResourceBodySize;
    }

    public void setMaxResourceBodySize(int i) {
        this.maxResourceBodySize = i;
    }

    public int getPayloadSize() {
        return this.payload.length;
    }

    public byte[] getPayload() {
        if (this.offload != null) {
            throw new IllegalStateException("message " + this.offload + " offloaded!");
        }
        return this.payload;
    }

    public String getPayloadString() {
        if (this.offload != null) {
            throw new IllegalStateException("message " + this.offload + " offloaded!");
        }
        byte[] bArr = this.payload;
        if (bArr.length == 0) {
            return "";
        }
        return new String(bArr, CoAP.f44404a);
    }

    protected String getPayloadTracingString() {
        return zzp.d(this.payload, 32);
    }

    public Message setPayload(String str) {
        if (str == null || str.isEmpty()) {
            this.payload = zzg.f54809a;
            return this;
        }
        setPayload(str.getBytes(CoAP.f44404a));
        return this;
    }

    public Message setPayload(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            this.payload = zzg.f54809a;
            return this;
        }
        if (!isIntendedPayload() && !isUnintendedPayload()) {
            throw new IllegalArgumentException("Message must not have payload!");
        }
        this.payload = bArr;
        return this;
    }

    public EndpointContext getDestinationContext() {
        return this.destinationContext;
    }

    public EndpointContext getEffectiveDestinationContext() {
        return this.effectiveDestinationContext;
    }

    public EndpointContext getSourceContext() {
        return this.sourceContext;
    }

    public Message setDestinationContext(EndpointContext endpointContext) {
        if (endpointContext != null) {
            InetAddress address = endpointContext.getPeerAddress().getAddress();
            if (NetworkInterfacesUtil.c(address)) {
                throw new IllegalArgumentException("Broadcast destination " + zzp.d(address) + " only supported for request!");
            }
            if (NetworkInterfacesUtil.a(address)) {
                throw new IllegalArgumentException("Multicast destination " + zzp.d(address) + " only supported for request!");
            }
        }
        this.destinationContext = endpointContext;
        this.effectiveDestinationContext = endpointContext;
        return this;
    }

    public void setEffectiveDestinationContext(EndpointContext endpointContext) {
        this.effectiveDestinationContext = endpointContext;
    }

    public void setRequestDestinationContext(EndpointContext endpointContext) {
        this.destinationContext = endpointContext;
        this.effectiveDestinationContext = endpointContext;
    }

    public Message setSourceContext(EndpointContext endpointContext) {
        this.sourceContext = endpointContext;
        return this;
    }

    public void setLocalAddress(InetSocketAddress inetSocketAddress) {
        this.localAddress = inetSocketAddress;
    }

    public InetSocketAddress getLocalAddress() {
        return this.localAddress;
    }

    public boolean isAcknowledged() {
        return this.acknowledged.get();
    }

    public void setAcknowledged(boolean z) {
        this.acknowledged.set(z);
    }

    public boolean acknowledge() {
        if (!isConfirmable() || !this.acknowledged.compareAndSet(false, true)) {
            return false;
        }
        Iterator<MessageObserver> it = getMessageObservers().iterator();
        while (it.hasNext()) {
            it.next().onAcknowledgement();
        }
        return true;
    }

    public boolean isRejected() {
        return this.rejected;
    }

    public void setRejected(boolean z) {
        this.rejected = z;
        if (z) {
            Iterator<MessageObserver> it = getMessageObservers().iterator();
            while (it.hasNext()) {
                it.next().onReject();
            }
        }
    }

    public boolean isTimedOut() {
        return this.timedOut;
    }

    public void setTimedOut(boolean z) {
        this.timedOut = z;
        if (z) {
            Iterator<MessageObserver> it = getMessageObservers().iterator();
            while (it.hasNext()) {
                it.next().onTimeout();
            }
        }
    }

    public boolean isCanceled() {
        return this.canceled;
    }

    public void setCanceled(boolean z) {
        this.canceled = z;
        if (z) {
            Iterator<MessageObserver> it = getMessageObservers().iterator();
            while (it.hasNext()) {
                it.next().onCancel();
            }
        }
    }

    public void setReadyToSend() {
        Iterator<MessageObserver> it = getMessageObservers().iterator();
        while (it.hasNext()) {
            it.next().onReadyToSend();
        }
    }

    public void onConnecting() {
        Iterator<MessageObserver> it = getMessageObservers().iterator();
        while (it.hasNext()) {
            it.next().onConnecting();
        }
    }

    public void onDtlsRetransmission(int i) {
        Iterator<MessageObserver> it = getMessageObservers().iterator();
        while (it.hasNext()) {
            it.next().onDtlsRetransmission(i);
        }
    }

    public boolean isSent() {
        return this.sent;
    }

    public void setSent(boolean z) {
        boolean z2 = this.sent;
        this.sent = z;
        if (z) {
            Iterator<MessageObserver> it = getMessageObservers().iterator();
            while (it.hasNext()) {
                it.next().onSent(z2);
            }
        }
    }

    public Throwable getSendError() {
        return this.sendError;
    }

    public void setSendError(Throwable th) {
        this.sendError = th;
        if (th != null) {
            Iterator<MessageObserver> it = getMessageObservers().iterator();
            while (it.hasNext()) {
                it.next().onSendError(th);
            }
        }
    }

    public void onContextEstablished(EndpointContext endpointContext) {
        if (endpointContext != null) {
            Iterator<MessageObserver> it = getMessageObservers().iterator();
            while (it.hasNext()) {
                it.next().onContextEstablished(endpointContext);
            }
        }
    }

    public void onTransferComplete() {
        if (this.transferComplete) {
            return;
        }
        this.transferComplete = true;
        LOGGER.trace("Message transfer completed {}", this);
        Iterator<MessageObserver> it = getMessageObservers().iterator();
        while (it.hasNext()) {
            it.next().onTransferComplete();
        }
    }

    public boolean waitForSent(long j) throws InterruptedException {
        boolean z;
        long jC = ClockUtil.c();
        long nanos = TimeUnit.MILLISECONDS.toNanos(j);
        synchronized (this) {
            long millis = j;
            while (!this.sent && !isCanceled() && !isTimedOut() && getSendError() == null) {
                wait(millis);
                if (j > 0) {
                    long jC2 = (jC + nanos) - ClockUtil.c();
                    if (jC2 <= 0) {
                        break;
                    }
                    millis = TimeUnit.NANOSECONDS.toMillis(jC2) + 1;
                }
            }
            z = this.sent;
        }
        return z;
    }

    public boolean isDuplicate() {
        return this.duplicate;
    }

    public void setDuplicate(boolean z) {
        this.duplicate = z;
    }

    protected String getStatusTracingString() {
        if (this.canceled) {
            return "canceled ";
        }
        if (this.sendError != null) {
            return this.sendError.getMessage() + " ";
        }
        if (this.rejected) {
            return "rejected ";
        }
        if (this.acknowledged.get()) {
            return "acked ";
        }
        if (this.timedOut) {
            return "timeout ";
        }
        return "";
    }

    public byte[] getBytes() {
        if (this.offload == OffloadMode.FULL) {
            throw new IllegalStateException("message offloaded!");
        }
        return this.bytes;
    }

    public void setBytes(byte[] bArr) {
        this.bytes = bArr;
        this.messageSize = bArr == null ? 0 : bArr.length;
    }

    public void addMessageSize(int i) {
        this.messageSize += i;
    }

    public int getMessageSize() {
        return this.messageSize;
    }

    protected boolean hasBlock(zuv zuvVar, zuv zuvVar2) {
        int iD = zuvVar.d();
        if (zuvVar2 != null) {
            iD -= zuvVar2.d();
        }
        return iD >= 0 && iD <= getPayloadSize();
    }

    public long getNanoTimestamp() {
        return this.nanoTimestamp;
    }

    public void setNanoTimestamp(long j) {
        this.nanoTimestamp = j;
    }

    public void cancel() {
        setCanceled(true);
    }

    public void retransmitting() {
        Iterator<MessageObserver> it = getMessageObservers().iterator();
        while (it.hasNext()) {
            try {
                it.next().onRetransmission();
            } catch (Exception e) {
                LOGGER.error("Faulty MessageObserver for retransmitting events", (Throwable) e);
            }
        }
    }

    public void offload(OffloadMode offloadMode) {
        if (this.protectFromOffload) {
            return;
        }
        synchronized (this.acknowledged) {
            this.offload = offloadMode;
            if (offloadMode != null) {
                this.payload = zzg.f54809a;
                if (offloadMode == OffloadMode.FULL) {
                    this.bytes = null;
                    zvi zviVar = this.options;
                    if (zviVar != null) {
                        zviVar.a();
                        this.options = null;
                    }
                }
            }
        }
    }

    public OffloadMode getOffloadMode() {
        return this.offload;
    }

    public void setProtectFromOffload() {
        this.protectFromOffload = true;
    }

    public List<MessageObserver> getMessageObservers() {
        if (this.unmodifiableMessageObserversFacade == null) {
            return Collections.EMPTY_LIST;
        }
        return this.unmodifiableMessageObserversFacade;
    }

    public <T extends MessageObserver> T getMessageObserver(Class<T> cls) {
        List<MessageObserver> list = this.unmodifiableMessageObserversFacade;
        if (list == null) {
            return null;
        }
        Iterator<MessageObserver> it = list.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (cls.isInstance(t)) {
                return t;
            }
        }
        return null;
    }

    public void addMessageObserver(MessageObserver messageObserver) {
        messageObserver.getClass();
        ensureMessageObserverList().add(messageObserver);
    }

    public void addMessageObserver(int i, MessageObserver messageObserver) {
        messageObserver.getClass();
        ensureMessageObserverList().add(i, messageObserver);
    }

    public void addMessageObservers(List<MessageObserver> list) {
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        ensureMessageObserverList().addAll(list);
    }

    public void removeMessageObserver(MessageObserver messageObserver) {
        messageObserver.getClass();
        List<MessageObserver> list = this.messageObservers.get();
        if (list != null) {
            list.remove(messageObserver);
        }
    }

    private List<MessageObserver> ensureMessageObserverList() {
        List<MessageObserver> list = this.messageObservers.get();
        if (list != null) {
            return list;
        }
        boolean zM = LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(this.messageObservers, null, new CopyOnWriteArrayList());
        List<MessageObserver> list2 = this.messageObservers.get();
        if (zM) {
            this.unmodifiableMessageObserversFacade = Collections.unmodifiableList(list2);
        }
        return list2;
    }
}
