package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;

/* JADX INFO: loaded from: classes13.dex */
public final class TrackEncryptionBox {
    private static final String TAG = "TrackEncryptionBox";
    public final TrackOutput.CryptoData cryptoData;
    public final byte[] defaultInitializationVector;
    public final boolean isEncrypted;
    public final int perSampleIvSize;
    public final String schemeType;

    public TrackEncryptionBox(boolean z14, String str, int i14, byte[] bArr, int i15, int i16, byte[] bArr2) {
        Assertions.checkArgument((bArr2 == null) ^ (i14 == 0));
        this.isEncrypted = z14;
        this.schemeType = str;
        this.perSampleIvSize = i14;
        this.defaultInitializationVector = bArr2;
        this.cryptoData = new TrackOutput.CryptoData(schemeToCryptoMode(str), bArr, i15, i16);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static int schemeToCryptoMode(String str) {
        if (str == null) {
            return 1;
        }
        byte b14 = -1;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals(C.CENC_TYPE_cbc1)) {
                    b14 = 0;
                }
                break;
            case 3046671:
                if (str.equals(C.CENC_TYPE_cbcs)) {
                    b14 = 1;
                }
                break;
            case 3049879:
                if (str.equals(C.CENC_TYPE_cenc)) {
                    b14 = 2;
                }
                break;
            case 3049895:
                if (str.equals(C.CENC_TYPE_cens)) {
                    b14 = 3;
                }
                break;
        }
        switch (b14) {
            case 0:
            case 1:
                return 2;
            default:
                StringBuilder sb3 = new StringBuilder(str.length() + 68);
                sb3.append("Unsupported protection scheme type '");
                sb3.append(str);
                sb3.append("'. Assuming AES-CTR crypto mode.");
                Log.w(TAG, sb3.toString());
            case 2:
            case 3:
                return 1;
        }
    }
}
