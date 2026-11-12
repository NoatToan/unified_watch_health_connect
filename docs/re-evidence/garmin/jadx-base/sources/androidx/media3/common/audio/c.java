package androidx.media3.common.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes.dex */
public class c implements AudioProcessor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f8139c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f8140d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AudioProcessor.a f8141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AudioProcessor.a f8142f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AudioProcessor.a f8143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AudioProcessor.a f8144h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f8145i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public da.a f8146j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ByteBuffer f8147k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ShortBuffer f8148l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ByteBuffer f8149m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f8150n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f8151o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f8152p;

    public c() {
        AudioProcessor.a aVar = AudioProcessor.a.f8122e;
        this.f8141e = aVar;
        this.f8142f = aVar;
        this.f8143g = aVar;
        this.f8144h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f8121a;
        this.f8147k = byteBuffer;
        this.f8148l = byteBuffer.asShortBuffer();
        this.f8149m = byteBuffer;
        this.f8138b = -1;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final AudioProcessor.a a(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f8125c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        int i14 = this.f8138b;
        if (i14 == -1) {
            i14 = aVar.f8123a;
        }
        this.f8141e = aVar;
        AudioProcessor.a aVar2 = new AudioProcessor.a(i14, aVar.f8124b, 2);
        this.f8142f = aVar2;
        this.f8145i = true;
        return aVar2;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush() {
        if (isActive()) {
            AudioProcessor.a aVar = this.f8141e;
            this.f8143g = aVar;
            AudioProcessor.a aVar2 = this.f8142f;
            this.f8144h = aVar2;
            if (this.f8145i) {
                this.f8146j = new da.a(aVar.f8123a, aVar.f8124b, this.f8139c, this.f8140d, aVar2.f8123a);
            } else {
                da.a aVar3 = this.f8146j;
                if (aVar3 != null) {
                    aVar3.f58646k = 0;
                    aVar3.f58648m = 0;
                    aVar3.f58650o = 0;
                    aVar3.f58651p = 0;
                    aVar3.f58652q = 0;
                    aVar3.f58653r = 0;
                    aVar3.f58654s = 0;
                    aVar3.f58655t = 0;
                    aVar3.f58656u = 0;
                    aVar3.f58657v = 0;
                    aVar3.f58658w = 0.0d;
                }
            }
        }
        this.f8149m = AudioProcessor.f8121a;
        this.f8150n = 0L;
        this.f8151o = 0L;
        this.f8152p = false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final ByteBuffer getOutput() {
        da.a aVar = this.f8146j;
        if (aVar != null) {
            int i14 = aVar.f58637b;
            int i15 = aVar.f58648m * i14 * 2;
            if (i15 > 0) {
                if (this.f8147k.capacity() < i15) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i15).order(ByteOrder.nativeOrder());
                    this.f8147k = byteBufferOrder;
                    this.f8148l = byteBufferOrder.asShortBuffer();
                } else {
                    this.f8147k.clear();
                    this.f8148l.clear();
                }
                ShortBuffer shortBuffer = this.f8148l;
                int iMin = Math.min(shortBuffer.remaining() / i14, aVar.f58648m);
                int i16 = iMin * i14;
                shortBuffer.put(aVar.f58647l, 0, i16);
                int i17 = aVar.f58648m - iMin;
                aVar.f58648m = i17;
                short[] sArr = aVar.f58647l;
                System.arraycopy(sArr, i16, sArr, 0, i17 * i14);
                this.f8151o += (long) i15;
                this.f8147k.limit(i15);
                this.f8149m = this.f8147k;
            }
        }
        ByteBuffer byteBuffer = this.f8149m;
        this.f8149m = AudioProcessor.f8121a;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean isActive() {
        if (this.f8142f.f8123a != -1) {
            return Math.abs(this.f8139c - 1.0f) >= 1.0E-4f || Math.abs(this.f8140d - 1.0f) >= 1.0E-4f || this.f8142f.f8123a != this.f8141e.f8123a;
        }
        return false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean isEnded() {
        if (!this.f8152p) {
            return false;
        }
        da.a aVar = this.f8146j;
        return aVar == null || (aVar.f58648m * aVar.f58637b) * 2 == 0;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueEndOfStream() {
        da.a aVar = this.f8146j;
        if (aVar != null) {
            int i14 = aVar.f58646k;
            float f14 = aVar.f58638c;
            float f15 = aVar.f58639d;
            double d14 = f14 / f15;
            double d15 = aVar.f58640e * f15;
            int i15 = aVar.f58653r;
            int i16 = aVar.f58648m + ((int) ((((((((double) (i14 - i15)) / d14) + ((double) i15)) + aVar.f58658w) + ((double) aVar.f58650o)) / d15) + 0.5d));
            aVar.f58658w = 0.0d;
            short[] sArr = aVar.f58645j;
            int i17 = aVar.f58643h * 2;
            aVar.f58645j = aVar.c(sArr, i14, i17 + i14);
            int i18 = 0;
            while (true) {
                int i19 = aVar.f58637b;
                if (i18 >= i17 * i19) {
                    break;
                }
                aVar.f58645j[(i19 * i14) + i18] = 0;
                i18++;
            }
            aVar.f58646k = i17 + aVar.f58646k;
            aVar.f();
            if (aVar.f58648m > i16) {
                aVar.f58648m = i16;
            }
            aVar.f58646k = 0;
            aVar.f58653r = 0;
            aVar.f58650o = 0;
        }
        this.f8152p = true;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            da.a aVar = this.f8146j;
            aVar.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f8150n += (long) iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i14 = aVar.f58637b;
            int i15 = iRemaining2 / i14;
            short[] sArrC = aVar.c(aVar.f58645j, aVar.f58646k, i15);
            aVar.f58645j = sArrC;
            shortBufferAsShortBuffer.get(sArrC, aVar.f58646k * i14, ((i15 * i14) * 2) / 2);
            aVar.f58646k += i15;
            aVar.f();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        this.f8139c = 1.0f;
        this.f8140d = 1.0f;
        AudioProcessor.a aVar = AudioProcessor.a.f8122e;
        this.f8141e = aVar;
        this.f8142f = aVar;
        this.f8143g = aVar;
        this.f8144h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f8121a;
        this.f8147k = byteBuffer;
        this.f8148l = byteBuffer.asShortBuffer();
        this.f8149m = byteBuffer;
        this.f8138b = -1;
        this.f8145i = false;
        this.f8146j = null;
        this.f8150n = 0L;
        this.f8151o = 0L;
        this.f8152p = false;
    }
}
