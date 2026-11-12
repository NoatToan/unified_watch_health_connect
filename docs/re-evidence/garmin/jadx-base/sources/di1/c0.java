package di1;

import com.google.common.primitives.UnsignedBytes;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ldi1/c0;", "", "<init>", "()V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f59741a = new int[64];

    static {
        new a(null);
    }

    public final void a(byte[] bArr) {
        int[] iArr = new int[4];
        int i14 = 0;
        int i15 = 0;
        while (i15 < 16) {
            int i16 = i15 / 4;
            int i17 = i15 + 3;
            int i18 = (bArr[i15] & UnsignedBytes.MAX_VALUE) + ((bArr[i15 + 1] & UnsignedBytes.MAX_VALUE) << 8) + ((bArr[i15 + 2] & UnsignedBytes.MAX_VALUE) << 16);
            i15 += 4;
            iArr[i16] = i18 + ((bArr[i17] & UnsignedBytes.MAX_VALUE) << 24);
        }
        int i19 = 0;
        while (i14 < 64) {
            int i24 = i14 + 1;
            int i25 = iArr[i19 & 3] + i19;
            int[] iArr2 = this.f59741a;
            iArr2[i14] = i25;
            i19 -= 1640531527;
            i14 += 2;
            iArr2[i24] = iArr[(i19 >>> 11) & 3] + i19;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ldi1/c0$a;", "", "<init>", "()V", "", "DELTA", "I", "ROUNDS", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
