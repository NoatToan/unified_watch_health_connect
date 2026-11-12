package defpackage;

import org.eclipse.californium.core.coap.CoAP;
import org.eclipse.californium.core.network.Exchange;
import org.eclipse.californium.core.network.stack.BlockwiseStatus;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public final class zwq extends BlockwiseStatus {
    private static final Logger e = aaex.a((Class<?>) zwq.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private zvg f54688c;

    private zwq(zwt zwtVar, BlockwiseStatus.RemoveHandler removeHandler, Exchange exchange, zvg zvgVar, int i, int i2) {
        super(zwtVar, removeHandler, exchange, zvgVar, i, i2);
        this.f54688c = zvgVar;
    }

    public static zwq e(zwt zwtVar, BlockwiseStatus.RemoveHandler removeHandler, Exchange exchange, zvg zvgVar, int i) {
        zwq zwqVar = new zwq(zwtVar, removeHandler, exchange, zvgVar, zvgVar.getPayloadSize(), i);
        try {
            zwqVar.addBlock(zvgVar.getPayload(), zvgVar.getMessageSize());
            zwqVar.flipBlocksBuffer();
            return zwqVar;
        } catch (zwp e2) {
            e.warn("buffer overflow on start", (Throwable) e2);
            return zwqVar;
        }
    }

    public static zwq b(zwt zwtVar, BlockwiseStatus.RemoveHandler removeHandler, Exchange exchange, zvg zvgVar, int i, int i2) {
        if (zvgVar.getOptions().ao()) {
            i = zvgVar.getOptions().p().intValue();
        }
        return new zwq(zwtVar, removeHandler, exchange, zvgVar, i, i2);
    }

    public void c(zvg zvgVar) throws zwp {
        synchronized (this) {
            try {
                if (zvgVar == null) {
                    throw new NullPointerException("request block must not be null");
                }
                zuv zuvVarF = zvgVar.getOptions().f();
                if (zuvVarF == null) {
                    throw new IllegalArgumentException("request block has no block1 option");
                }
                int currentPosition = getCurrentPosition();
                int iD = zuvVarF.d();
                if (currentPosition != iD) {
                    throw new zwp("request block1 offset " + iD + " doesn't match the current position " + currentPosition + "!", CoAP.ResponseCode.REQUEST_ENTITY_INCOMPLETE);
                }
                addBlock(zvgVar.getPayload(), zvgVar.getMessageSize());
                if (zuvVarF.j()) {
                    setCurrentSzx(zuvVarF.c());
                    int iA = zuvVarF.a();
                    int currentPosition2 = getCurrentPosition();
                    if (currentPosition2 % iA != 0) {
                        throw new zwp("Block1 buffer position " + currentPosition2 + " doesn't align with blocksize " + iA + "!", CoAP.ResponseCode.REQUEST_ENTITY_INCOMPLETE);
                    }
                    setCurrentNum(currentPosition2 / iA);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zvg c(int i) throws zwp {
        zvg zvgVar;
        byte[] block;
        synchronized (this) {
            setCurrentSzx(i);
            int currentSize = getCurrentSize();
            int currentPosition = getCurrentPosition();
            if (currentPosition % currentSize != 0) {
                throw new zwp("Block1 buffer position " + currentPosition + " doesn't align with blocksize " + currentSize + "!");
            }
            int bufferSize = getBufferSize();
            int i2 = currentPosition / currentSize;
            setCurrentNum(i2);
            zvgVar = new zvg(((zvg) this.firstMessage).a());
            boolean z = false;
            prepareOutgoingMessage(this.firstMessage, zvgVar, i2 == 0);
            if (i2 == 0) {
                if (!zvgVar.getOptions().ao()) {
                    zvgVar.getOptions().g(bufferSize);
                }
            } else {
                zvgVar.getOptions().ax();
                zvgVar.getOptions().b(false);
            }
            if (bufferSize > 0 && currentPosition < bufferSize && (block = getBlock(currentPosition, getCurrentPayloadSize())) != null) {
                z = currentPosition + block.length < bufferSize;
                zvgVar.setPayload(block);
            }
            zvgVar.getOptions().c(i, z, i2);
            setComplete(!z);
            this.f54688c = zvgVar;
        }
        return zvgVar;
    }

    public boolean c() {
        if (!complete()) {
            return false;
        }
        ((zvg) this.firstMessage).cancel();
        return true;
    }

    public boolean b(zvf zvfVar) {
        boolean zEquals;
        synchronized (this) {
            zEquals = zvfVar.getToken().equals(this.f54688c.getToken());
        }
        return zEquals;
    }
}
