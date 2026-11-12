package defpackage;

import android.media.MediaCodec;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes4.dex */
public final class s45 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f33261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f33262b;
    public int c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public final MediaCodec.CryptoInfo i;
    public final b j;

    @RequiresApi(24)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f33263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaCodec.CryptoInfo.Pattern f33264b;

        public final void b(int i, int i2) {
            this.f33264b.set(i, i2);
            this.f33263a.setPattern(this.f33264b);
        }

        public b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f33263a = cryptoInfo;
            this.f33264b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s45() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        this.j = wlq.f38110a >= 24 ? new b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo a() {
        return this.i;
    }

    public void b(int i) {
        if (i == 0) {
            return;
        }
        if (this.d == null) {
            int[] iArr = new int[1];
            this.d = iArr;
            this.i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.d;
        iArr2[0] = iArr2[0] + i;
    }

    public void c(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f = i;
        this.d = iArr;
        this.e = iArr2;
        this.f33262b = bArr;
        this.f33261a = bArr2;
        this.c = i2;
        this.g = i3;
        this.h = i4;
        MediaCodec.CryptoInfo cryptoInfo = this.i;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        if (wlq.f38110a >= 24) {
            ((b) rk1.e(this.j)).b(i3, i4);
        }
    }
}
