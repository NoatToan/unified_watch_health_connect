package defpackage;

import com.xiaomi.miot.ble.bouncycastle.crypto.DataLengthException;

/* JADX INFO: loaded from: classes11.dex */
public abstract class qio implements qv2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qv2 f31554a;

    public qio(qv2 qv2Var) {
        this.f31554a = qv2Var;
    }

    public abstract byte b(byte b2);

    public int c(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        if (i3 + i2 > bArr2.length) {
            throw new DataLengthException("output buffer too short");
        }
        int i4 = i + i2;
        if (i4 > bArr.length) {
            throw new DataLengthException("input buffer too small");
        }
        while (i < i4) {
            bArr2[i3] = b(bArr[i]);
            i3++;
            i++;
        }
        return i2;
    }
}
