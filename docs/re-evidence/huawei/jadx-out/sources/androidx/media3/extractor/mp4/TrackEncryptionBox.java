package androidx.media3.extractor.mp4;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.extractor.TrackOutput;

/* JADX INFO: loaded from: classes4.dex */
public final class TrackEncryptionBox {
    private static final String TAG = "TrackEncryptionBox";
    public final TrackOutput.CryptoData cryptoData;
    public final byte[] defaultInitializationVector;
    public final boolean isEncrypted;
    public final int perSampleIvSize;
    public final String schemeType;

    public TrackEncryptionBox(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        Assertions.checkArgument((bArr2 == null) ^ (i == 0));
        this.isEncrypted = z;
        this.schemeType = str;
        this.perSampleIvSize = i;
        this.defaultInitializationVector = bArr2;
        this.cryptoData = new TrackOutput.CryptoData(schemeToCryptoMode(str), bArr, i2, i3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x003d  */
    private static int schemeToCryptoMode(String str) {
        byte b2;
        if (str == null) {
            return 1;
        }
        str.hashCode();
        switch (str) {
            case "cbc1":
                b2 = 0;
                break;
            case "cbcs":
                b2 = 1;
                break;
            case "cenc":
                b2 = 2;
                break;
            case "cens":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0 || b2 == 1) {
            return 2;
        }
        if (b2 != 2 && b2 != 3) {
            Log.w(TAG, "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
        }
        return 1;
    }
}
