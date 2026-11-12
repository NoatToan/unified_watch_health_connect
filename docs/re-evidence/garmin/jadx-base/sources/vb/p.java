package vb;

import bb.l0;
import com.google.android.exoplayer2.C;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f176803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f176804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0.a f176805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f176806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f176807e;

    public p(boolean z14, String str, int i14, byte[] bArr, int i15, int i16, byte[] bArr2) {
        byte b14 = 0;
        int i17 = 1;
        fa.a.a((i14 == 0) ^ (bArr2 == null));
        this.f176803a = z14;
        this.f176804b = str;
        this.f176806d = i14;
        this.f176807e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (!str.equals(C.CENC_TYPE_cbc1)) {
                        b14 = -1;
                    }
                    break;
                case 3046671:
                    b14 = !str.equals(C.CENC_TYPE_cbcs) ? (byte) -1 : (byte) 1;
                    break;
                case 3049879:
                    b14 = !str.equals(C.CENC_TYPE_cenc) ? (byte) -1 : (byte) 2;
                    break;
                case 3049895:
                    b14 = !str.equals(C.CENC_TYPE_cens) ? (byte) -1 : (byte) 3;
                    break;
                default:
                    b14 = -1;
                    break;
            }
            switch (b14) {
                case 0:
                case 1:
                    i17 = 2;
                    break;
                case 2:
                case 3:
                    break;
                default:
                    fa.k.g("Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    break;
            }
        }
        this.f176805c = new l0.a(i17, bArr, i15, i16);
    }
}
