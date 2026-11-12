package defpackage;

import com.xiaomi.miot.ble.bouncycastle.crypto.DataLengthException;

/* JADX INFO: loaded from: classes11.dex */
public interface qv2 {
    void a(boolean z, nw3 nw3Var) throws IllegalArgumentException;

    int getBlockSize();

    int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException;

    void reset();
}
