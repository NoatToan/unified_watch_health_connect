package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;
import com.tencent.connect.common.Constants;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractExpandedDecoder {
    private final BitArray a;
    private final r b;

    public AbstractExpandedDecoder(BitArray bitArray) {
        this.a = bitArray;
        this.b = new r(bitArray);
    }

    public static AbstractExpandedDecoder createDecoder(BitArray bitArray) {
        if (bitArray.get(1)) {
            return new g(bitArray);
        }
        if (!bitArray.get(2)) {
            return new j(bitArray);
        }
        int iG = r.g(bitArray, 1, 4);
        if (iG == 4) {
            return new a(bitArray);
        }
        if (iG == 5) {
            return new b(bitArray);
        }
        int iG2 = r.g(bitArray, 1, 5);
        if (iG2 == 12) {
            return new c(bitArray);
        }
        if (iG2 == 13) {
            return new d(bitArray);
        }
        switch (r.g(bitArray, 1, 7)) {
            case 56:
                return new e(bitArray, "310", "11");
            case 57:
                return new e(bitArray, "320", "11");
            case 58:
                return new e(bitArray, "310", "13");
            case 59:
                return new e(bitArray, "320", "13");
            case 60:
                return new e(bitArray, "310", Constants.VIA_REPORT_TYPE_WPA_STATE);
            case 61:
                return new e(bitArray, "320", Constants.VIA_REPORT_TYPE_WPA_STATE);
            case 62:
                return new e(bitArray, "310", Constants.VIA_REPORT_TYPE_START_GROUP);
            case 63:
                return new e(bitArray, "320", Constants.VIA_REPORT_TYPE_START_GROUP);
            default:
                throw new IllegalStateException("unknown decoder: ".concat(String.valueOf(bitArray)));
        }
    }

    public final r getGeneralDecoder() {
        return this.b;
    }

    public final BitArray getInformation() {
        return this.a;
    }

    public abstract String parseInformation() throws NotFoundException, FormatException;
}
