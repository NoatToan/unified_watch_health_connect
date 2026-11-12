package dh2;

import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes11.dex */
public abstract class l extends v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f59658b;

    public l(byte[] bArr) {
        super(bArr);
        this.f59658b = false;
    }

    public final int e() {
        byte[] bArr = this.f59673a;
        if (bArr == null || bArr.length == 0) {
            return -1;
        }
        return bArr[0] & Ascii.SI;
    }

    public final int f() {
        byte[] bArr = this.f59673a;
        if (bArr == null || bArr.length == 0) {
            return -1;
        }
        return (bArr[0] & 240) >> 4;
    }

    public final void g(int i14) {
        if (i14 <= 0 || i14 > 15) {
            vb.h.s("Connections Ids must be between 1-15");
        } else {
            h(0, i14);
        }
    }

    public final void h(int i14, int i15) {
        for (int i16 = 0; i16 < 4; i16++) {
            int i17 = (i15 >> i16) & 1;
            byte[] bArr = this.f59673a;
            if (i17 == 1) {
                bArr[0] = (byte) (bArr[0] | (1 << (i16 + i14)));
            } else {
                bArr[0] = (byte) (bArr[0] & (~(1 << (i16 + i14))));
            }
        }
    }

    public final void i(int i14) {
        if (i14 < 0 || i14 > 15) {
            vb.h.s("Sequence must be between 0-15");
        } else {
            h(4, i14);
        }
    }

    public l(boolean z14) {
        super(z14);
        this.f59658b = z14;
    }
}
