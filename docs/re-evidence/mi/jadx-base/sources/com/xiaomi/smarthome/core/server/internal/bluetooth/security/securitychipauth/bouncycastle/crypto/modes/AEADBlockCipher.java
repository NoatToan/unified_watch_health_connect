package com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.crypto.modes;

import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.crypto.BlockCipher;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.crypto.CipherParameters;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.crypto.DataLengthException;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.crypto.InvalidCipherTextException;

/* JADX INFO: loaded from: classes10.dex */
public interface AEADBlockCipher {
    int doFinal(byte[] bArr, int i) throws IllegalStateException, InvalidCipherTextException;

    String getAlgorithmName();

    byte[] getMac();

    int getOutputSize(int i);

    BlockCipher getUnderlyingCipher();

    int getUpdateOutputSize(int i);

    void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException;

    void processAADByte(byte b2);

    void processAADBytes(byte[] bArr, int i, int i2);

    int processByte(byte b2, byte[] bArr, int i) throws DataLengthException;

    int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException;

    void reset();
}
