package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* JADX INFO: loaded from: classes13.dex */
public final class CeaUtil {
    private static final int COUNTRY_CODE = 181;
    private static final int PAYLOAD_TYPE_CC = 4;
    private static final int PROVIDER_CODE_ATSC = 49;
    private static final int PROVIDER_CODE_DIRECTV = 47;
    private static final String TAG = "CeaUtil";
    public static final int USER_DATA_IDENTIFIER_GA94 = 1195456820;
    public static final int USER_DATA_TYPE_CODE_MPEG_CC = 3;

    private CeaUtil() {
    }

    public static void consume(long j8, ParsableByteArray parsableByteArray, TrackOutput[] trackOutputArr) {
        while (true) {
            if (parsableByteArray.bytesLeft() <= 1) {
                return;
            }
            int non255TerminatedValue = readNon255TerminatedValue(parsableByteArray);
            int non255TerminatedValue2 = readNon255TerminatedValue(parsableByteArray);
            int position = parsableByteArray.getPosition() + non255TerminatedValue2;
            if (non255TerminatedValue2 == -1 || non255TerminatedValue2 > parsableByteArray.bytesLeft()) {
                Log.w(TAG, "Skipping remainder of malformed SEI NAL unit.");
                position = parsableByteArray.limit();
            } else if (non255TerminatedValue == 4 && non255TerminatedValue2 >= 8) {
                int unsignedByte = parsableByteArray.readUnsignedByte();
                int unsignedShort = parsableByteArray.readUnsignedShort();
                int i14 = unsignedShort == 49 ? parsableByteArray.readInt() : 0;
                int unsignedByte2 = parsableByteArray.readUnsignedByte();
                if (unsignedShort == 47) {
                    parsableByteArray.skipBytes(1);
                }
                boolean z14 = unsignedByte == COUNTRY_CODE && (unsignedShort == 49 || unsignedShort == 47) && unsignedByte2 == 3;
                if (unsignedShort == 49) {
                    z14 &= i14 == 1195456820;
                }
                if (z14) {
                    consumeCcData(j8, parsableByteArray, trackOutputArr);
                }
            }
            parsableByteArray.setPosition(position);
        }
    }

    public static void consumeCcData(long j8, ParsableByteArray parsableByteArray, TrackOutput[] trackOutputArr) {
        long j14;
        int unsignedByte = parsableByteArray.readUnsignedByte();
        if ((unsignedByte & 64) != 0) {
            parsableByteArray.skipBytes(1);
            int i14 = (unsignedByte & 31) * 3;
            int position = parsableByteArray.getPosition();
            int length = trackOutputArr.length;
            int i15 = 0;
            while (i15 < length) {
                TrackOutput trackOutput = trackOutputArr[i15];
                parsableByteArray.setPosition(position);
                trackOutput.sampleData(parsableByteArray, i14);
                if (j8 != C.TIME_UNSET) {
                    j14 = j8;
                    trackOutput.sampleMetadata(j14, 1, i14, 0, null);
                } else {
                    j14 = j8;
                }
                i15++;
                j8 = j14;
            }
        }
    }

    private static int readNon255TerminatedValue(ParsableByteArray parsableByteArray) {
        int i14 = 0;
        while (parsableByteArray.bytesLeft() != 0) {
            int unsignedByte = parsableByteArray.readUnsignedByte();
            i14 += unsignedByte;
            if (unsignedByte != 255) {
                return i14;
            }
        }
        return -1;
    }
}
