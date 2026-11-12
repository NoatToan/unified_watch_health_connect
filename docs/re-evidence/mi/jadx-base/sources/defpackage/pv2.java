package defpackage;

import org.bouncycastle.crypto.DataLengthException;

/* JADX INFO: loaded from: classes3.dex */
public interface pv2 {
    void a(boolean z, lw3 lw3Var) throws IllegalArgumentException;

    String getAlgorithmName();

    int getBlockSize();

    int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException;

    void reset();
}
