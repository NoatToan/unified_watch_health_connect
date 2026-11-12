package com.google.android.exoplayer2.extractor.mp3;

import com.google.android.exoplayer2.audio.MpegAudioUtil;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes13.dex */
final class VbriSeeker implements Seeker {
    private static final String TAG = "VbriSeeker";
    private final long dataEndPosition;
    private final long durationUs;
    private final long[] positions;
    private final long[] timesUs;

    private VbriSeeker(long[] jArr, long[] jArr2, long j8, long j14) {
        this.timesUs = jArr;
        this.positions = jArr2;
        this.durationUs = j8;
        this.dataEndPosition = j14;
    }

    public static VbriSeeker create(long j8, long j14, MpegAudioUtil.Header header, ParsableByteArray parsableByteArray) {
        int unsignedByte;
        parsableByteArray.skipBytes(10);
        int i14 = parsableByteArray.readInt();
        VbriSeeker vbriSeeker = null;
        if (i14 <= 0) {
            return null;
        }
        int i15 = header.sampleRate;
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(i14, ((long) (i15 >= 32000 ? 1152 : 576)) * 1000000, i15);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int unsignedShort2 = parsableByteArray.readUnsignedShort();
        int unsignedShort3 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(2);
        long j15 = j14 + ((long) header.frameSize);
        long[] jArr = new long[unsignedShort];
        long[] jArr2 = new long[unsignedShort];
        int i16 = 0;
        long j16 = j14;
        while (i16 < unsignedShort) {
            VbriSeeker vbriSeeker2 = vbriSeeker;
            int i17 = unsignedShort2;
            long[] jArr3 = jArr;
            jArr3[i16] = (((long) i16) * jScaleLargeTimestamp) / ((long) unsignedShort);
            jArr2[i16] = Math.max(j16, j15);
            if (unsignedShort3 == 1) {
                unsignedByte = parsableByteArray.readUnsignedByte();
            } else if (unsignedShort3 == 2) {
                unsignedByte = parsableByteArray.readUnsignedShort();
            } else if (unsignedShort3 == 3) {
                unsignedByte = parsableByteArray.readUnsignedInt24();
            } else {
                if (unsignedShort3 != 4) {
                    return vbriSeeker2;
                }
                unsignedByte = parsableByteArray.readUnsignedIntToInt();
            }
            j16 += (long) (unsignedByte * i17);
            i16++;
            vbriSeeker = vbriSeeker2;
            unsignedShort2 = i17;
            jArr = jArr3;
        }
        long[] jArr4 = jArr;
        if (j8 != -1 && j8 != j16) {
            StringBuilder sb3 = new StringBuilder(67);
            sb3.append("VBRI data size mismatch: ");
            sb3.append(j8);
            sb3.append(", ");
            sb3.append(j16);
            Log.w(TAG, sb3.toString());
        }
        return new VbriSeeker(jArr4, jArr2, jScaleLargeTimestamp, j16);
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.dataEndPosition;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j8) {
        int iBinarySearchFloor = Util.binarySearchFloor(this.timesUs, j8, true, true);
        SeekPoint seekPoint = new SeekPoint(this.timesUs[iBinarySearchFloor], this.positions[iBinarySearchFloor]);
        if (seekPoint.timeUs >= j8 || iBinarySearchFloor == this.timesUs.length - 1) {
            return new SeekMap.SeekPoints(seekPoint);
        }
        int i14 = iBinarySearchFloor + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(this.timesUs[i14], this.positions[i14]));
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getTimeUs(long j8) {
        return this.timesUs[Util.binarySearchFloor(this.positions, j8, true, true)];
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }
}
