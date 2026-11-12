package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import p005kotlin.Metadata;
import w63.b;
import w63.e;
import w63.f0;
import w63.h;
import w63.i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/ws/MessageDeflater;", "Ljava/io/Closeable;", "", "noContextTakeover", "<init>", "(Z)V", "Lw63/e;", "Lw63/h;", "suffix", "endsWith", "(Lw63/e;Lw63/h;)Z", "buffer", "", "deflate", "(Lw63/e;)V", "close", "()V", "Z", "deflatedBytes", "Lw63/e;", "Ljava/util/zip/Deflater;", "deflater", "Ljava/util/zip/Deflater;", "Lw63/i;", "deflaterSink", "Lw63/i;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MessageDeflater implements Closeable {
    private final e deflatedBytes;
    private final Deflater deflater;
    private final i deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean z14) {
        this.noContextTakeover = z14;
        e eVar = new e();
        this.deflatedBytes = eVar;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new i((f0) eVar, deflater);
    }

    private final boolean endsWith(e eVar, h hVar) {
        return eVar.n(hVar.d(), hVar, eVar.f183349b - ((long) hVar.d()));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.deflaterSink.close();
    }

    public final void deflate(e buffer) throws IOException {
        buffer.getClass();
        if (this.deflatedBytes.f183349b != 0) {
            vb.h.s("Failed requirement.");
            return;
        }
        if (this.noContextTakeover) {
            this.deflater.reset();
        }
        this.deflaterSink.write(buffer, buffer.f183349b);
        this.deflaterSink.flush();
        boolean zEndsWith = endsWith(this.deflatedBytes, MessageDeflaterKt.EMPTY_DEFLATE_BLOCK);
        e eVar = this.deflatedBytes;
        if (zEndsWith) {
            long j8 = eVar.f183349b - ((long) 4);
            e.a aVarP = eVar.p(b.f183326a);
            try {
                aVarP.a(j8);
                aVarP.close();
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    jg.b.l(aVarP, th3);
                    throw th4;
                }
            }
        } else {
            eVar.H(0);
        }
        e eVar2 = this.deflatedBytes;
        buffer.write(eVar2, eVar2.f183349b);
    }
}
