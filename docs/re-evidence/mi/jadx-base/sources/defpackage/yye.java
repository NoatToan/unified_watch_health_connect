package defpackage;

import com.xiaomi.miot.ble.bouncycastle.crypto.DataLengthException;

/* JADX INFO: loaded from: classes11.dex */
public interface yye {
    void a(nw3 nw3Var) throws IllegalArgumentException;

    int doFinal(byte[] bArr, int i) throws IllegalStateException, DataLengthException;

    int getMacSize();

    void update(byte b2) throws IllegalStateException;

    void update(byte[] bArr, int i, int i2) throws IllegalStateException, DataLengthException;
}
