package ia;

import android.media.MediaCodec;
import fa.z;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f92373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f92374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f92375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f92376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f92377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f92378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f92379g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f92380h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f92381i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C1763b f92382j;

    /* JADX INFO: renamed from: ia.b$b, reason: collision with other inner class name */
    public static final class C1763b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f92383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaCodec.CryptoInfo.Pattern f92384b;

        private C1763b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f92383a = cryptoInfo;
            this.f92384b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f92381i = cryptoInfo;
        this.f92382j = z.f70071a >= 24 ? new C1763b(cryptoInfo) : null;
    }
}
