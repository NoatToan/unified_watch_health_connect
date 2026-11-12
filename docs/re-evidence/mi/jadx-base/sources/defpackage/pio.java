package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pio implements pv2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pv2 f30447a;

    public pio(pv2 pv2Var) {
        this.f30447a = pv2Var;
    }

    public abstract byte b(byte b2);

    public int c(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        int i4 = i + i2;
        if (i4 > bArr.length) {
            throw new DataLengthException("input buffer too small");
        }
        if (i3 + i2 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        while (i < i4) {
            bArr2[i3] = b(bArr[i]);
            i3++;
            i++;
        }
        return i2;
    }
}
