package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;
import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes4.dex */
public final class e83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f16375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f16376b;
    public boolean c;

    public final long a(Format format) {
        return (this.f16375a * FolmeCore.NANOS_TO_MS) / ((long) format.z);
    }

    public void b() {
        this.f16375a = 0L;
        this.f16376b = 0L;
        this.c = false;
    }

    public long c(Format format, DecoderInputBuffer decoderInputBuffer) {
        if (this.c) {
            return decoderInputBuffer.e;
        }
        ByteBuffer byteBuffer = (ByteBuffer) rk1.e(decoderInputBuffer.c);
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i = (i << 8) | (byteBuffer.get(i2) & 255);
        }
        int iM = j9g.m(i);
        if (iM == -1) {
            this.c = true;
            toe.h("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return decoderInputBuffer.e;
        }
        if (this.f16375a != 0) {
            long jA = a(format);
            this.f16375a += (long) iM;
            return this.f16376b + jA;
        }
        long j = decoderInputBuffer.e;
        this.f16376b = j;
        this.f16375a = ((long) iM) - 529;
        return j;
    }
}
