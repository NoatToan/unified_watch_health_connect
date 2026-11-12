package ka;

import androidx.media3.common.audio.AudioProcessor;
import fa.z;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class p extends androidx.media3.common.audio.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f103722i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f103723j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f103724k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f103725l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f103726m = z.f70076f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f103727n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f103728o;

    @Override // androidx.media3.common.audio.b
    public final AudioProcessor.a b(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f8125c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        this.f103724k = true;
        return (this.f103722i == 0 && this.f103723j == 0) ? AudioProcessor.a.f8122e : aVar;
    }

    @Override // androidx.media3.common.audio.b
    public final void c() {
        if (this.f103724k) {
            this.f103724k = false;
            int i14 = this.f103723j;
            int i15 = this.f8131b.f8126d;
            this.f103726m = new byte[i14 * i15];
            this.f103725l = this.f103722i * i15;
        }
        this.f103727n = 0;
    }

    @Override // androidx.media3.common.audio.b
    public final void d() {
        if (this.f103724k) {
            int i14 = this.f103727n;
            if (i14 > 0) {
                this.f103728o += (long) (i14 / this.f8131b.f8126d);
            }
            this.f103727n = 0;
        }
    }

    @Override // androidx.media3.common.audio.b
    public final void e() {
        this.f103726m = z.f70076f;
    }

    @Override // androidx.media3.common.audio.b, androidx.media3.common.audio.AudioProcessor
    public final ByteBuffer getOutput() {
        int i14;
        if (super.isEnded() && (i14 = this.f103727n) > 0) {
            f(i14).put(this.f103726m, 0, this.f103727n).flip();
            this.f103727n = 0;
        }
        return super.getOutput();
    }

    @Override // androidx.media3.common.audio.b, androidx.media3.common.audio.AudioProcessor
    public final boolean isEnded() {
        return super.isEnded() && this.f103727n == 0;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i14 = iLimit - iPosition;
        if (i14 == 0) {
            return;
        }
        int iMin = Math.min(i14, this.f103725l);
        this.f103728o += (long) (iMin / this.f8131b.f8126d);
        this.f103725l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f103725l > 0) {
            return;
        }
        int i15 = i14 - iMin;
        int length = (this.f103727n + i15) - this.f103726m.length;
        ByteBuffer byteBufferF = f(length);
        int i16 = z.i(length, 0, this.f103727n);
        byteBufferF.put(this.f103726m, 0, i16);
        int i17 = z.i(length - i16, 0, i15);
        byteBuffer.limit(byteBuffer.position() + i17);
        byteBufferF.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i18 = i15 - i17;
        int i19 = this.f103727n - i16;
        this.f103727n = i19;
        byte[] bArr = this.f103726m;
        System.arraycopy(bArr, i16, bArr, 0, i19);
        byteBuffer.get(this.f103726m, this.f103727n, i18);
        this.f103727n += i18;
        byteBufferF.flip();
    }
}
