package ka;

import androidx.media3.common.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import fa.z;
import j20.x;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class n extends androidx.media3.common.audio.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f103707i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final short f103708j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f103709k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f103710l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f103711m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f103712n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f103713o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f103714p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f103715q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f103716r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public byte[] f103717s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f103718t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f103719u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte[] f103720v;

    public n(long j8, float f14, long j14, int i14, short s8) {
        boolean z14 = false;
        this.f103716r = 0;
        this.f103718t = 0;
        this.f103719u = 0;
        if (f14 >= 0.0f && f14 <= 1.0f) {
            z14 = true;
        }
        fa.a.a(z14);
        this.f103710l = j8;
        this.f103707i = f14;
        this.f103711m = j14;
        this.f103709k = i14;
        this.f103708j = s8;
        byte[] bArr = z.f70076f;
        this.f103717s = bArr;
        this.f103720v = bArr;
    }

    @Override // androidx.media3.common.audio.b
    public final AudioProcessor.a b(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f8125c == 2) {
            return aVar.f8123a == -1 ? AudioProcessor.a.f8122e : aVar;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // androidx.media3.common.audio.b
    public final void c() {
        if (isActive()) {
            AudioProcessor.a aVar = this.f8131b;
            int i14 = aVar.f8124b * 2;
            this.f103712n = i14;
            int i15 = ((((int) ((this.f103710l * ((long) aVar.f8123a)) / 1000000)) / 2) / i14) * i14 * 2;
            if (this.f103717s.length != i15) {
                this.f103717s = new byte[i15];
                this.f103720v = new byte[i15];
            }
        }
        this.f103714p = 0;
        this.f103715q = 0L;
        this.f103716r = 0;
        this.f103718t = 0;
        this.f103719u = 0;
    }

    @Override // androidx.media3.common.audio.b
    public final void d() {
        if (this.f103719u > 0) {
            h(true);
            this.f103716r = 0;
        }
    }

    @Override // androidx.media3.common.audio.b
    public final void e() {
        this.f103713o = false;
        byte[] bArr = z.f70076f;
        this.f103717s = bArr;
        this.f103720v = bArr;
    }

    public final int g(int i14) {
        int length = ((((int) ((this.f103711m * ((long) this.f8131b.f8123a)) / 1000000)) - this.f103716r) * this.f103712n) - (this.f103717s.length / 2);
        fa.a.d(length >= 0);
        int iMin = (int) Math.min((i14 * this.f103707i) + 0.5f, length);
        int i15 = this.f103712n;
        return (iMin / i15) * i15;
    }

    public final void h(boolean z14) {
        int length;
        int iG;
        int i14 = this.f103719u;
        byte[] bArr = this.f103717s;
        if (i14 == bArr.length || z14) {
            if (this.f103716r == 0) {
                if (z14) {
                    i(i14, 3);
                    length = i14;
                } else {
                    fa.a.d(i14 >= bArr.length / 2);
                    length = this.f103717s.length / 2;
                    i(length, 0);
                }
                iG = length;
            } else if (z14) {
                int length2 = i14 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iG2 = g(length2) + (this.f103717s.length / 2);
                i(iG2, 2);
                iG = iG2;
                length = length3;
            } else {
                length = i14 - (bArr.length / 2);
                iG = g(length);
                i(iG, 1);
            }
            fa.a.e(length % this.f103712n == 0, "bytesConsumed is not aligned to frame size: %s" + length);
            fa.a.d(i14 >= iG);
            this.f103719u -= length;
            int i15 = this.f103718t + length;
            this.f103718t = i15;
            this.f103718t = i15 % this.f103717s.length;
            int i16 = this.f103716r;
            int i17 = this.f103712n;
            this.f103716r = (iG / i17) + i16;
            this.f103715q += (long) ((length - iG) / i17);
        }
    }

    public final void i(int i14, int i15) {
        if (i14 == 0) {
            return;
        }
        fa.a.a(this.f103719u >= i14);
        int i16 = this.f103718t;
        if (i15 == 2) {
            int i17 = this.f103719u;
            int i18 = i16 + i17;
            byte[] bArr = this.f103717s;
            if (i18 <= bArr.length) {
                System.arraycopy(bArr, i18 - i14, this.f103720v, 0, i14);
            } else {
                int length = i17 - (bArr.length - i16);
                byte[] bArr2 = this.f103720v;
                if (length >= i14) {
                    System.arraycopy(bArr, length - i14, bArr2, 0, i14);
                } else {
                    int i19 = i14 - length;
                    System.arraycopy(bArr, bArr.length - i19, bArr2, 0, i19);
                    System.arraycopy(this.f103717s, 0, this.f103720v, i19, length);
                }
            }
        } else {
            int i24 = i16 + i14;
            byte[] bArr3 = this.f103717s;
            int length2 = bArr3.length;
            byte[] bArr4 = this.f103720v;
            if (i24 <= length2) {
                System.arraycopy(bArr3, i16, bArr4, 0, i14);
            } else {
                int length3 = bArr3.length - i16;
                System.arraycopy(bArr3, i16, bArr4, 0, length3);
                System.arraycopy(this.f103717s, 0, this.f103720v, length3, i14 - length3);
            }
        }
        fa.a.b(i14 % this.f103712n == 0, "sizeToOutput is not aligned to frame size: " + i14);
        fa.a.d(this.f103718t < this.f103717s.length);
        byte[] bArr5 = this.f103720v;
        fa.a.b(i14 % this.f103712n == 0, "byteOutput size is not aligned to frame size " + i14);
        if (i15 != 3) {
            for (int i25 = 0; i25 < i14; i25 += 2) {
                int i26 = i25 + 1;
                int i27 = (bArr5[i26] << 8) | (bArr5[i25] & UnsignedBytes.MAX_VALUE);
                int i28 = this.f103709k;
                if (i15 == 0) {
                    i28 = ((((i25 * 1000) / (i14 - 1)) * (i28 - 100)) / 1000) + 100;
                } else if (i15 == 2) {
                    i28 += (((i25 * 1000) * (100 - i28)) / (i14 - 1)) / 1000;
                }
                int i29 = (i27 * i28) / 100;
                if (i29 >= 32767) {
                    bArr5[i25] = -1;
                    bArr5[i26] = Ascii.DEL;
                } else if (i29 <= -32768) {
                    bArr5[i25] = 0;
                    bArr5[i26] = UnsignedBytes.MAX_POWER_OF_TWO;
                } else {
                    bArr5[i25] = (byte) (i29 & 255);
                    bArr5[i26] = (byte) (i29 >> 8);
                }
            }
        }
        f(i14).put(bArr5, 0, i14).flip();
    }

    @Override // androidx.media3.common.audio.b, androidx.media3.common.audio.AudioProcessor
    public final boolean isActive() {
        return super.isActive() && this.f103713o;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f8136g.hasRemaining()) {
            int i14 = this.f103714p;
            short s8 = this.f103708j;
            if (i14 == 0) {
                int iLimit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit2, byteBuffer.position() + this.f103717s.length));
                int iLimit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit3 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iLimit3) << 8) | (byteBuffer.get(iLimit3 - 1) & UnsignedBytes.MAX_VALUE)) > s8) {
                        int i15 = this.f103712n;
                        iPosition = androidx.core.view.j.v(iLimit3, i15, i15, i15);
                        break;
                    }
                    iLimit3 -= 2;
                }
                if (iPosition == byteBuffer.position()) {
                    this.f103714p = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    f(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit2);
            } else {
                if (i14 != 1) {
                    x.h();
                    return;
                }
                fa.a.d(this.f103718t < this.f103717s.length);
                int iLimit4 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iPosition2) << 8) | (byteBuffer.get(iPosition2 - 1) & UnsignedBytes.MAX_VALUE)) > s8) {
                        int i16 = this.f103712n;
                        iLimit = (iPosition2 / i16) * i16;
                        break;
                    }
                    iPosition2 += 2;
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int length = this.f103718t;
                int i17 = this.f103719u;
                int length2 = length + i17;
                byte[] bArr = this.f103717s;
                if (length2 < bArr.length) {
                    length = bArr.length;
                } else {
                    length2 = i17 - (bArr.length - length);
                }
                int i18 = length - length2;
                boolean z14 = iLimit < iLimit4;
                int iMin = Math.min(iPosition3, i18);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.f103717s, length2, iMin);
                int i19 = this.f103719u + iMin;
                this.f103719u = i19;
                fa.a.d(i19 <= this.f103717s.length);
                boolean z15 = z14 && iPosition3 < i18;
                h(z15);
                if (z15) {
                    this.f103714p = 0;
                    this.f103716r = 0;
                }
                byteBuffer.limit(iLimit4);
            }
        }
    }

    @Deprecated
    public n(long j8, long j14, short s8) {
        this(j8, j14 / j8, j8, 0, s8);
    }

    public n() {
        this(100000L, 0.2f, 2000000L, 10, SilenceSkippingAudioProcessor.DEFAULT_SILENCE_THRESHOLD_LEVEL);
    }
}
