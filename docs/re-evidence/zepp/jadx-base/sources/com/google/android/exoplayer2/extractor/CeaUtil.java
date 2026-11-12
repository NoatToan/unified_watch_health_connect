package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* JADX INFO: loaded from: classes2.dex */
public final class CeaUtil {
    public static final int USER_DATA_IDENTIFIER_GA94 = 1195456820;
    public static final int USER_DATA_TYPE_CODE_MPEG_CC = 3;
    private static final String a = "CeaUtil";
    private static final int b = 4;
    private static final int c = 181;
    private static final int d = 49;
    private static final int e = 47;

    private CeaUtil() {
    }

    private static int a(ParsableByteArray buffer) {
        int i = 0;
        while (buffer.bytesLeft() != 0) {
            int unsignedByte = buffer.readUnsignedByte();
            i += unsignedByte;
            if (unsignedByte != 255) {
                return i;
            }
        }
        return -1;
    }

    public static void consume(long presentationTimeUs, ParsableByteArray seiBuffer, TrackOutput[] outputs) {
        while (true) {
            if (seiBuffer.bytesLeft() <= 1) {
                return;
            }
            int iA = a(seiBuffer);
            int iA2 = a(seiBuffer);
            int position = seiBuffer.getPosition() + iA2;
            if (iA2 == -1 || iA2 > seiBuffer.bytesLeft()) {
                Log.w(a, "Skipping remainder of malformed SEI NAL unit.");
                position = seiBuffer.limit();
            } else if (iA == 4 && iA2 >= 8) {
                int unsignedByte = seiBuffer.readUnsignedByte();
                int unsignedShort = seiBuffer.readUnsignedShort();
                int i = unsignedShort == 49 ? seiBuffer.readInt() : 0;
                int unsignedByte2 = seiBuffer.readUnsignedByte();
                if (unsignedShort == 47) {
                    seiBuffer.skipBytes(1);
                }
                boolean z = unsignedByte == 181 && (unsignedShort == 49 || unsignedShort == 47) && unsignedByte2 == 3;
                if (unsignedShort == 49) {
                    z &= i == 1195456820;
                }
                if (z) {
                    consumeCcData(presentationTimeUs, seiBuffer, outputs);
                }
            }
            seiBuffer.setPosition(position);
        }
    }

    public static void consumeCcData(long presentationTimeUs, ParsableByteArray ccDataBuffer, TrackOutput[] outputs) {
        int unsignedByte = ccDataBuffer.readUnsignedByte();
        if ((unsignedByte & 64) != 0) {
            ccDataBuffer.skipBytes(1);
            int i = (unsignedByte & 31) * 3;
            int position = ccDataBuffer.getPosition();
            for (TrackOutput trackOutput : outputs) {
                ccDataBuffer.setPosition(position);
                trackOutput.sampleData(ccDataBuffer, i);
                trackOutput.sampleMetadata(presentationTimeUs, 1, i, 0, null);
            }
        }
    }
}
