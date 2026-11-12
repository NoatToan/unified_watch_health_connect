package com.google.android.exoplayer2.decoder;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes2.dex */
public final class CryptoInfo {
    private final MediaCodec.CryptoInfo a;

    @Nullable
    private final b b;
    public int clearBlocks;
    public int encryptedBlocks;

    @Nullable
    public byte[] iv;

    @Nullable
    public byte[] key;
    public int mode;

    @Nullable
    public int[] numBytesOfClearData;

    @Nullable
    public int[] numBytesOfEncryptedData;
    public int numSubSamples;

    @RequiresApi(24)
    public static final class b {
        private final MediaCodec.CryptoInfo a;
        private final MediaCodec.CryptoInfo.Pattern b;

        /* JADX INFO: Access modifiers changed from: private */
        public void b(int encryptedBlocks, int clearBlocks) {
            this.b.set(encryptedBlocks, clearBlocks);
            this.a.setPattern(this.b);
        }

        private b(MediaCodec.CryptoInfo frameworkCryptoInfo) {
            this.a = frameworkCryptoInfo;
            this.b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoInfo() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.a = cryptoInfo;
        this.b = Util.SDK_INT >= 24 ? new b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo getFrameworkCryptoInfo() {
        return this.a;
    }

    public void increaseClearDataFirstSubSampleBy(int count) {
        if (count == 0) {
            return;
        }
        if (this.numBytesOfClearData == null) {
            int[] iArr = new int[1];
            this.numBytesOfClearData = iArr;
            this.a.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.numBytesOfClearData;
        iArr2[0] = iArr2[0] + count;
    }

    public void set(int numSubSamples, int[] numBytesOfClearData, int[] numBytesOfEncryptedData, byte[] key, byte[] iv, int mode, int encryptedBlocks, int clearBlocks) {
        this.numSubSamples = numSubSamples;
        this.numBytesOfClearData = numBytesOfClearData;
        this.numBytesOfEncryptedData = numBytesOfEncryptedData;
        this.key = key;
        this.iv = iv;
        this.mode = mode;
        this.encryptedBlocks = encryptedBlocks;
        this.clearBlocks = clearBlocks;
        MediaCodec.CryptoInfo cryptoInfo = this.a;
        cryptoInfo.numSubSamples = numSubSamples;
        cryptoInfo.numBytesOfClearData = numBytesOfClearData;
        cryptoInfo.numBytesOfEncryptedData = numBytesOfEncryptedData;
        cryptoInfo.key = key;
        cryptoInfo.iv = iv;
        cryptoInfo.mode = mode;
        if (Util.SDK_INT >= 24) {
            ((b) Assertions.checkNotNull(this.b)).b(encryptedBlocks, clearBlocks);
        }
    }
}
