package defpackage;

import java.util.Arrays;
import org.eclipse.californium.core.network.Exchange;
import org.eclipse.californium.core.network.stack.BlockwiseStatus;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public final class zwo extends BlockwiseStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f54685a = aaex.a((Class<?>) zwo.class);
    private final byte[] d;
    private final zxh e;

    private zwo(zwt zwtVar, BlockwiseStatus.RemoveHandler removeHandler, Exchange exchange, zvf zvfVar, int i, int i2) {
        super(zwtVar, removeHandler, exchange, zvfVar, i, i2);
        Integer numQ = zvfVar.getOptions().q();
        if (numQ != null && zvi.e(numQ.intValue())) {
            this.e = new zxh(numQ.intValue());
            exchange.a(numQ.intValue());
        } else {
            this.e = null;
        }
        if (zvfVar.getOptions().i() > 0) {
            this.d = zvfVar.getOptions().g().get(0);
        } else {
            this.d = null;
        }
    }

    public static zwo c(zwt zwtVar, BlockwiseStatus.RemoveHandler removeHandler, Exchange exchange, zvf zvfVar, int i) {
        int payloadSize = zvfVar.getPayloadSize();
        zwo zwoVar = new zwo(zwtVar, removeHandler, exchange, zvfVar, payloadSize, i);
        if (payloadSize > 0) {
            try {
                zwoVar.addBlock(zvfVar.getPayload(), zvfVar.getMessageSize());
                zwoVar.flipBlocksBuffer();
                return zwoVar;
            } catch (zwp e) {
                f54685a.warn("buffer overflow on start", (Throwable) e);
            }
        }
        return zwoVar;
    }

    public static zwo e(zwt zwtVar, BlockwiseStatus.RemoveHandler removeHandler, Exchange exchange, zvf zvfVar, int i, int i2) {
        if (zvfVar.getOptions().as()) {
            i = zvfVar.getOptions().x().intValue();
        }
        return new zwo(zwtVar, removeHandler, exchange, zvfVar, i, i2);
    }

    public final Integer d() {
        zxh zxhVar = this.e;
        if (zxhVar == null) {
            return null;
        }
        return Integer.valueOf(zxhVar.e());
    }

    public final boolean c(zvf zvfVar) {
        if (zvfVar == null) {
            throw new NullPointerException("response block must not be null");
        }
        if (!zvfVar.getOptions().ak()) {
            return false;
        }
        zxh zxhVar = this.e;
        return zxhVar == null || zxhVar.d(zvfVar);
    }

    public final boolean c(Exchange exchange) {
        zxh zxhVar;
        Integer numO = exchange.o();
        if (numO == null || (zxhVar = this.e) == null) {
            return numO == null && this.e == null;
        }
        return zxhVar.e() == numO.intValue();
    }

    public void d(zvf zvfVar) throws zwp {
        synchronized (this) {
            try {
                if (zvfVar == null) {
                    throw new NullPointerException("response block must not be null");
                }
                if (!zvfVar.getOptions().af()) {
                    throw new IllegalArgumentException("response block has no block2 option");
                }
                int currentPosition = getCurrentPosition();
                int iD = zvfVar.getOptions().j().d();
                if (currentPosition != iD) {
                    throw new zwp(String.format("response offset %d does not match the expected offset %d!", Integer.valueOf(iD), Integer.valueOf(currentPosition)));
                }
                if (this.d != null) {
                    if (zvfVar.getOptions().i() != 1) {
                        throw new zwp("response does not contain a single ETag");
                    }
                    if (!Arrays.equals(this.d, zvfVar.getOptions().g().get(0))) {
                        throw new zwp("response does not contain expected ETag");
                    }
                }
                addBlock(zvfVar.getPayload(), zvfVar.getMessageSize());
                setCurrentNum(getCurrentPosition() / getCurrentSize());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zvg e(int i) throws zwp {
        zvg zvgVar;
        synchronized (this) {
            Exchange exchange = getExchange(false);
            boolean z = true;
            if (exchange == null) {
                throw new zwp("Block2 exchange already completed!", true);
            }
            setCurrentSzx(i);
            int currentSize = getCurrentSize();
            int currentPosition = getCurrentPosition();
            if (currentPosition % currentSize != 0) {
                throw new zwp("Block2 buffer position " + currentPosition + " doesn't align with blocksize " + currentSize + "!");
            }
            int i2 = currentPosition / currentSize;
            setCurrentNum(i2);
            zvg zvgVarP = exchange.p();
            zvgVar = new zvg(zvgVarP.a());
            if (i2 != 0) {
                z = false;
            }
            prepareOutgoingMessage(zvgVarP, zvgVar, z);
            zvgVar.getOptions().aw();
            zvgVar.getOptions().e(i, false, i2);
        }
        return zvgVar;
    }

    public zvf b(zuv zuvVar) {
        zvf zvfVar;
        synchronized (this) {
            try {
                if (zuvVar == null) {
                    throw new NullPointerException("block option must not be null.");
                }
                int iD = zuvVar.d();
                int iC = zuvVar.c();
                int iA = zuvVar.a();
                setCurrentSzx(iC);
                int i = iD / iA;
                setCurrentNum(i);
                zvfVar = new zvf(((zvf) this.firstMessage).d());
                int bufferSize = getBufferSize();
                boolean z = false;
                prepareOutgoingMessage(this.firstMessage, zvfVar, i == 0);
                if (i == 0) {
                    if (!zvfVar.getOptions().as()) {
                        zvfVar.getOptions().h(bufferSize);
                    }
                } else {
                    zvfVar.getOptions().aw();
                    zvfVar.setType(null);
                }
                if (bufferSize > 0 && iD < bufferSize) {
                    byte[] block = getBlock(iD, getCurrentPayloadSize());
                    z = iD + block.length < bufferSize;
                    zvfVar.setPayload(block);
                }
                zvfVar.getOptions().e(iC, z, i);
                if (!z) {
                    setComplete(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zvfVar;
    }

    public final void a(Exchange exchange) {
        Exchange exchange2 = getExchange(true);
        if (exchange2 != null) {
            if (exchange != exchange2) {
                if (exchange2.w()) {
                    exchange2.a();
                    return;
                } else {
                    exchange2.p().setCanceled(true);
                    return;
                }
            }
            exchange2.d(exchange2.p());
        }
    }

    public final void e(Exchange exchange) {
        if (exchange != getExchange(false)) {
            if (exchange.w()) {
                exchange.ai();
            } else {
                exchange.p().setCanceled(true);
            }
        }
    }

    final boolean c() {
        zvf zvfVar;
        if (!complete()) {
            return false;
        }
        synchronized (this) {
            zvfVar = (zvf) this.firstMessage;
        }
        if (zvfVar == null) {
            return false;
        }
        zvfVar.onTransferComplete();
        return true;
    }

    @Override // org.eclipse.californium.core.network.stack.BlockwiseStatus
    public String toString() {
        String string;
        synchronized (this) {
            string = super.toString();
            if (this.e != null) {
                StringBuilder sb = new StringBuilder(string);
                sb.setLength(string.length() - 1);
                sb.append(", observe=");
                sb.append(this.e.e());
                sb.append("]");
                string = sb.toString();
            }
        }
        return string;
    }

    public static final void c(zvf zvfVar, zuv zuvVar, int i) {
        boolean zJ;
        if (zvfVar == null) {
            throw new NullPointerException("response message must not be null");
        }
        if (zuvVar == null) {
            throw new NullPointerException("block option must not be null");
        }
        if (!zvfVar.hasBlock(zuvVar)) {
            throw new IllegalArgumentException("given response does not contain block");
        }
        int payloadSize = zvfVar.getPayloadSize();
        int iD = zuvVar.d();
        int iA = zuvVar.a();
        if (zuvVar.f()) {
            iA *= i;
        }
        if (zvfVar.getOptions().af()) {
            iD -= zvfVar.getOptions().j().d();
            zJ = zvfVar.getOptions().j().j();
        } else {
            zJ = false;
        }
        int iMin = Math.min(iA + iD, payloadSize);
        int i2 = iMin - iD;
        zvfVar.getOptions().e(zuvVar.c(), zJ || iMin < payloadSize, zuvVar.b());
        f54685a.debug("cropping response body [size={}] to block {}", Integer.valueOf(payloadSize), zuvVar);
        if (i2 > 0) {
            byte[] bArr = new byte[i2];
            System.arraycopy(zvfVar.getPayload(), iD, bArr, 0, i2);
            zvfVar.setPayload(bArr);
            return;
        }
        zvfVar.setPayload(zzg.f54809a);
    }
}
