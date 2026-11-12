package tb;

import bb.i;
import com.google.common.primitives.UnsignedBytes;
import fa.r;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f163581a = new r(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f163582b;

    public final long a(i iVar) {
        r rVar = this.f163581a;
        int i14 = 0;
        iVar.peekFully(rVar.f70054a, 0, 1, false);
        int i15 = rVar.f70054a[0] & UnsignedBytes.MAX_VALUE;
        if (i15 == 0) {
            return Long.MIN_VALUE;
        }
        int i16 = 128;
        int i17 = 0;
        while ((i15 & i16) == 0) {
            i16 >>= 1;
            i17++;
        }
        int i18 = i15 & (~i16);
        iVar.peekFully(rVar.f70054a, 1, i17, false);
        while (i14 < i17) {
            i14++;
            i18 = (rVar.f70054a[i14] & UnsignedBytes.MAX_VALUE) + (i18 << 8);
        }
        this.f163582b = i17 + 1 + this.f163582b;
        return i18;
    }
}
