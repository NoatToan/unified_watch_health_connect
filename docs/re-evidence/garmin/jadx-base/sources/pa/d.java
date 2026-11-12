package pa;

import androidx.media3.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class d extends DecoderInputBuffer {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f136698j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f136699k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f136700l;

    public d() {
        super(2);
        this.f136700l = 32;
    }

    @Override // androidx.media3.decoder.DecoderInputBuffer
    public final void c() {
        super.c();
        this.f136699k = 0;
    }

    public final boolean g(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        fa.a.a(!decoderInputBuffer.b(1073741824));
        fa.a.a(!decoderInputBuffer.b(268435456));
        fa.a.a(!decoderInputBuffer.b(4));
        if (h()) {
            if (this.f136699k >= this.f136700l) {
                return false;
            }
            ByteBuffer byteBuffer2 = decoderInputBuffer.f8631d;
            if (byteBuffer2 != null && (byteBuffer = this.f8631d) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i14 = this.f136699k;
        this.f136699k = i14 + 1;
        if (i14 == 0) {
            this.f8633f = decoderInputBuffer.f8633f;
            if (decoderInputBuffer.b(1)) {
                this.f92372a = 1;
            }
        }
        ByteBuffer byteBuffer3 = decoderInputBuffer.f8631d;
        if (byteBuffer3 != null) {
            e(byteBuffer3.remaining());
            this.f8631d.put(byteBuffer3);
        }
        this.f136698j = decoderInputBuffer.f8633f;
        return true;
    }

    public final boolean h() {
        return this.f136699k > 0;
    }
}
