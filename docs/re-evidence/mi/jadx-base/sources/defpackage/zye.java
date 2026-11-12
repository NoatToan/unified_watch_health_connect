package defpackage;

import org.bouncycastle.crypto.DataLengthException;

/* JADX INFO: loaded from: classes3.dex */
public interface zye {
    void a(lw3 lw3Var) throws IllegalArgumentException;

    int doFinal(byte[] bArr, int i) throws IllegalStateException, DataLengthException;

    String getAlgorithmName();

    int getMacSize();

    void reset();

    void update(byte b2) throws IllegalStateException;

    void update(byte[] bArr, int i, int i2) throws IllegalStateException, DataLengthException;
}
