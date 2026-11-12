package com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.crypto.modes;

import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.crypto.BlockCipher;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.crypto.CipherParameters;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.crypto.DataLengthException;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.crypto.params.ParametersWithIV;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class CBCBlockCipher implements BlockCipher {
    private byte[] IV;
    private int blockSize;
    private byte[] cbcNextV;
    private byte[] cbcV;
    private BlockCipher cipher;
    private boolean encrypting;

    public CBCBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.IV = new byte[blockSize];
        this.cbcV = new byte[blockSize];
        this.cbcNextV = new byte[blockSize];
    }

    private int decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        int i3 = this.blockSize;
        if (i + i3 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        System.arraycopy(bArr, i, this.cbcNextV, 0, i3);
        int iProcessBlock = this.cipher.processBlock(bArr, i, bArr2, i2);
        for (int i4 = 0; i4 < this.blockSize; i4++) {
            int i5 = i2 + i4;
            bArr2[i5] = (byte) (bArr2[i5] ^ this.cbcV[i4]);
        }
        byte[] bArr3 = this.cbcV;
        this.cbcV = this.cbcNextV;
        this.cbcNextV = bArr3;
        return iProcessBlock;
    }

    private int encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        if (this.blockSize + i > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        for (int i3 = 0; i3 < this.blockSize; i3++) {
            byte[] bArr3 = this.cbcV;
            bArr3[i3] = (byte) (bArr3[i3] ^ bArr[i + i3]);
        }
        int iProcessBlock = this.cipher.processBlock(this.cbcV, 0, bArr2, i2);
        byte[] bArr4 = this.cbcV;
        System.arraycopy(bArr2, i2, bArr4, 0, bArr4.length);
        return iProcessBlock;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/CBC";
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
        boolean z2 = this.encrypting;
        this.encrypting = z;
        if (!(cipherParameters instanceof ParametersWithIV)) {
            reset();
            if (cipherParameters != null) {
                this.cipher.init(z, cipherParameters);
                return;
            } else {
                if (z2 != z) {
                    throw new IllegalArgumentException("cannot change encrypting state without providing key.");
                }
                return;
            }
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        if (iv.length != this.blockSize) {
            throw new IllegalArgumentException("initialisation vector must be the same length as block size");
        }
        System.arraycopy(iv, 0, this.IV, 0, iv.length);
        reset();
        if (parametersWithIV.getParameters() != null) {
            this.cipher.init(z, parametersWithIV.getParameters());
        } else if (z2 != z) {
            throw new IllegalArgumentException("cannot change encrypting state without providing key.");
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        return this.encrypting ? encryptBlock(bArr, i, bArr2, i2) : decryptBlock(bArr, i, bArr2, i2);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.crypto.BlockCipher
    public void reset() {
        byte[] bArr = this.IV;
        System.arraycopy(bArr, 0, this.cbcV, 0, bArr.length);
        Arrays.fill(this.cbcNextV, (byte) 0);
        this.cipher.reset();
    }
}
