package defpackage;

import androidx.annotation.IntRange;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class yg2 extends DecoderInputBuffer {
    public long i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f40147k;

    public yg2() {
        super(2);
        this.f40147k = 32;
    }

    public final boolean A(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        if (!E()) {
            return true;
        }
        if (this.j >= this.f40147k || decoderInputBuffer.m() != m()) {
            return false;
        }
        ByteBuffer byteBuffer2 = decoderInputBuffer.c;
        return byteBuffer2 == null || (byteBuffer = this.c) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    public long B() {
        return this.e;
    }

    public long C() {
        return this.i;
    }

    public int D() {
        return this.j;
    }

    public boolean E() {
        return this.j > 0;
    }

    public void F(@IntRange(from = 1) int i) {
        rk1.a(i > 0);
        this.f40147k = i;
    }

    @Override // com.google.android.exoplayer2.decoder.DecoderInputBuffer, defpackage.u53
    public void h() {
        super.h();
        this.j = 0;
    }

    public boolean z(DecoderInputBuffer decoderInputBuffer) {
        rk1.a(!decoderInputBuffer.w());
        rk1.a(!decoderInputBuffer.l());
        rk1.a(!decoderInputBuffer.n());
        if (!A(decoderInputBuffer)) {
            return false;
        }
        int i = this.j;
        this.j = i + 1;
        if (i == 0) {
            this.e = decoderInputBuffer.e;
            if (decoderInputBuffer.o()) {
                p(1);
            }
        }
        if (decoderInputBuffer.m()) {
            p(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer = decoderInputBuffer.c;
        if (byteBuffer != null) {
            s(byteBuffer.remaining());
            this.c.put(byteBuffer);
        }
        this.i = decoderInputBuffer.e;
        return true;
    }
}
