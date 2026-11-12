package com.google.android.exoplayer2.video;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class ColorInfo implements Bundleable {
    public static final Bundleable.Creator<ColorInfo> CREATOR = new com.garmin.proto.generated.a(26);
    private static final int FIELD_COLOR_RANGE = 1;
    private static final int FIELD_COLOR_SPACE = 0;
    private static final int FIELD_COLOR_TRANSFER = 2;
    private static final int FIELD_HDR_STATIC_INFO = 3;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    private int hashCode;
    public final byte[] hdrStaticInfo;

    public ColorInfo(int i14, int i15, int i16, byte[] bArr) {
        this.colorSpace = i14;
        this.colorRange = i15;
        this.colorTransfer = i16;
        this.hdrStaticInfo = bArr;
    }

    public static int isoColorPrimariesToColorSpace(int i14) {
        if (i14 == 1) {
            return 1;
        }
        if (i14 != 9) {
            return (i14 == 4 || i14 == 5 || i14 == 6 || i14 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int isoTransferCharacteristicsToColorTransfer(int i14) {
        if (i14 == 1) {
            return 3;
        }
        if (i14 == 16) {
            return 6;
        }
        if (i14 != 18) {
            return (i14 == 6 || i14 == 7) ? 3 : -1;
        }
        return 7;
    }

    private static String keyForField(int i14) {
        return Integer.toString(i14, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ColorInfo lambda$static$0(Bundle bundle) {
        return new ColorInfo(bundle.getInt(keyForField(0), -1), bundle.getInt(keyForField(1), -1), bundle.getInt(keyForField(2), -1), bundle.getByteArray(keyForField(3)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ColorInfo.class == obj.getClass()) {
            ColorInfo colorInfo = (ColorInfo) obj;
            if (this.colorSpace == colorInfo.colorSpace && this.colorRange == colorInfo.colorRange && this.colorTransfer == colorInfo.colorTransfer && Arrays.equals(this.hdrStaticInfo, colorInfo.hdrStaticInfo)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = Arrays.hashCode(this.hdrStaticInfo) + ((((((527 + this.colorSpace) * 31) + this.colorRange) * 31) + this.colorTransfer) * 31);
        }
        return this.hashCode;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(keyForField(0), this.colorSpace);
        bundle.putInt(keyForField(1), this.colorRange);
        bundle.putInt(keyForField(2), this.colorTransfer);
        bundle.putByteArray(keyForField(3), this.hdrStaticInfo);
        return bundle;
    }

    public String toString() {
        int i14 = this.colorSpace;
        int i15 = this.colorRange;
        int i16 = this.colorTransfer;
        boolean z14 = this.hdrStaticInfo != null;
        StringBuilder sb3 = new StringBuilder(55);
        sb3.append("ColorInfo(");
        sb3.append(i14);
        sb3.append(", ");
        sb3.append(i15);
        sb3.append(", ");
        sb3.append(i16);
        sb3.append(", ");
        sb3.append(z14);
        sb3.append(")");
        return sb3.toString();
    }
}
