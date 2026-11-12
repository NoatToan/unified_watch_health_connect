package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.Random;
import p005kotlin.Metadata;
import w63.e;
import w63.f;
import w63.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001a\u0010\u0014J\u001d\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u0014J\u000f\u0010\u001e\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u0016\u0010,\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010 R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u0004\u0018\u0001008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0004\u0018\u0001038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lokhttp3/internal/ws/WebSocketWriter;", "Ljava/io/Closeable;", "", "isClient", "Lw63/f;", "sink", "Ljava/util/Random;", "random", "perMessageDeflate", "noContextTakeover", "", "minimumDeflateSize", "<init>", "(ZLw63/f;Ljava/util/Random;ZZJ)V", "", "opcode", "Lw63/h;", "payload", "", "writeControlFrame", "(ILw63/h;)V", "writePing", "(Lw63/h;)V", "writePong", "code", "reason", "writeClose", "formatOpcode", "data", "writeMessageFrame", "close", "()V", "Z", "Lw63/f;", "getSink", "()Lw63/f;", "Ljava/util/Random;", "getRandom", "()Ljava/util/Random;", "J", "Lw63/e;", "messageBuffer", "Lw63/e;", "sinkBuffer", "writerClosed", "Lokhttp3/internal/ws/MessageDeflater;", "messageDeflater", "Lokhttp3/internal/ws/MessageDeflater;", "", "maskKey", "[B", "Lw63/e$a;", "maskCursor", "Lw63/e$a;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WebSocketWriter implements Closeable {
    private final boolean isClient;
    private final e.a maskCursor;
    private final byte[] maskKey;
    private final e messageBuffer;
    private MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;
    private final Random random;
    private final f sink;
    private final e sinkBuffer;
    private boolean writerClosed;

    public WebSocketWriter(boolean z14, f fVar, Random random, boolean z15, boolean z16, long j8) {
        fVar.getClass();
        random.getClass();
        this.isClient = z14;
        this.sink = fVar;
        this.random = random;
        this.perMessageDeflate = z15;
        this.noContextTakeover = z16;
        this.minimumDeflateSize = j8;
        this.messageBuffer = new e();
        this.sinkBuffer = fVar.getF183323b();
        this.maskKey = z14 ? new byte[4] : null;
        this.maskCursor = z14 ? new e.a() : null;
    }

    private final void writeControlFrame(int opcode, h payload) throws IOException {
        if (this.writerClosed) {
            vb.h.C("closed");
            return;
        }
        int iD = payload.d();
        if (iD > 125) {
            vb.h.s("Payload size must be less than or equal to 125");
            return;
        }
        this.sinkBuffer.H(opcode | 128);
        boolean z14 = this.isClient;
        e eVar = this.sinkBuffer;
        if (z14) {
            eVar.H(iD | 128);
            Random random = this.random;
            byte[] bArr = this.maskKey;
            bArr.getClass();
            random.nextBytes(bArr);
            e eVar2 = this.sinkBuffer;
            byte[] bArr2 = this.maskKey;
            eVar2.getClass();
            bArr2.getClass();
            eVar2.write(bArr2, 0, bArr2.length);
            if (iD > 0) {
                e eVar3 = this.sinkBuffer;
                long j8 = eVar3.f183349b;
                eVar3.E(payload);
                e eVar4 = this.sinkBuffer;
                e.a aVar = this.maskCursor;
                aVar.getClass();
                eVar4.p(aVar);
                this.maskCursor.c(j8);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        } else {
            eVar.H(iD);
            this.sinkBuffer.E(payload);
        }
        this.sink.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        MessageDeflater messageDeflater = this.messageDeflater;
        if (messageDeflater != null) {
            messageDeflater.close();
        }
    }

    public final Random getRandom() {
        return this.random;
    }

    public final f getSink() {
        return this.sink;
    }

    public final void writeClose(int code, h reason) throws EOFException {
        h hVarH0 = h.f183362e;
        if (code != 0 || reason != null) {
            if (code != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(code);
            }
            e eVar = new e();
            eVar.O(code);
            if (reason != null) {
                eVar.E(reason);
            }
            hVarH0 = eVar.h0(eVar.f183349b);
        }
        try {
            writeControlFrame(8, hVarH0);
        } finally {
            this.writerClosed = true;
        }
    }

    public final void writeMessageFrame(int formatOpcode, h data) throws IOException {
        data.getClass();
        if (this.writerClosed) {
            vb.h.C("closed");
            return;
        }
        this.messageBuffer.E(data);
        int i14 = formatOpcode | 128;
        if (this.perMessageDeflate && data.d() >= this.minimumDeflateSize) {
            MessageDeflater messageDeflater = this.messageDeflater;
            if (messageDeflater == null) {
                messageDeflater = new MessageDeflater(this.noContextTakeover);
                this.messageDeflater = messageDeflater;
            }
            messageDeflater.deflate(this.messageBuffer);
            i14 = formatOpcode | 192;
        }
        long j8 = this.messageBuffer.f183349b;
        this.sinkBuffer.H(i14);
        int i15 = this.isClient ? 128 : 0;
        e eVar = this.sinkBuffer;
        if (j8 <= 125) {
            eVar.H(i15 | ((int) j8));
        } else if (j8 <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            eVar.H(i15 | 126);
            this.sinkBuffer.O((int) j8);
        } else {
            eVar.H(i15 | 127);
            this.sinkBuffer.N(j8);
        }
        if (this.isClient) {
            Random random = this.random;
            byte[] bArr = this.maskKey;
            bArr.getClass();
            random.nextBytes(bArr);
            e eVar2 = this.sinkBuffer;
            byte[] bArr2 = this.maskKey;
            eVar2.getClass();
            bArr2.getClass();
            eVar2.write(bArr2, 0, bArr2.length);
            if (j8 > 0) {
                e eVar3 = this.messageBuffer;
                e.a aVar = this.maskCursor;
                aVar.getClass();
                eVar3.p(aVar);
                this.maskCursor.c(0L);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        this.sinkBuffer.write(this.messageBuffer, j8);
        this.sink.l3();
    }

    public final void writePing(h payload) {
        payload.getClass();
        writeControlFrame(9, payload);
    }

    public final void writePong(h payload) throws IOException {
        payload.getClass();
        writeControlFrame(10, payload);
    }
}
