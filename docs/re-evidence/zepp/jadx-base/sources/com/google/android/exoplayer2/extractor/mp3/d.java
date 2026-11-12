package com.google.android.exoplayer2.extractor.mp3;

import androidx.annotation.Nullable;
import com.airoha.android.lib.fota.fotaState.StageEnum;
import com.google.android.exoplayer2.audio.MpegAudioUtil;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes2.dex */
final class d implements Seeker {
    private static final String e = "VbriSeeker";
    private final long[] a;
    private final long[] b;
    private final long c;
    private final long d;

    private d(long[] timesUs, long[] positions, long durationUs, long dataEndPosition) {
        this.a = timesUs;
        this.b = positions;
        this.c = durationUs;
        this.d = dataEndPosition;
    }

    @Nullable
    public static d a(long inputLength, long position, MpegAudioUtil.Header mpegAudioHeader, ParsableByteArray frame) {
        int unsignedByte;
        frame.skipBytes(10);
        int i = frame.readInt();
        if (i <= 0) {
            return null;
        }
        int i2 = mpegAudioHeader.sampleRate;
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(i, 1000000 * ((long) (i2 >= 32000 ? 1152 : StageEnum.APP_RESULT_FOTA_NV_SUCCESS)), i2);
        int unsignedShort = frame.readUnsignedShort();
        int unsignedShort2 = frame.readUnsignedShort();
        int unsignedShort3 = frame.readUnsignedShort();
        frame.skipBytes(2);
        long j = position + ((long) mpegAudioHeader.frameSize);
        long[] jArr = new long[unsignedShort];
        long[] jArr2 = new long[unsignedShort];
        int i3 = 0;
        long j2 = position;
        while (i3 < unsignedShort) {
            int i4 = unsignedShort2;
            long j3 = j;
            jArr[i3] = (((long) i3) * jScaleLargeTimestamp) / ((long) unsignedShort);
            jArr2[i3] = Math.max(j2, j3);
            if (unsignedShort3 == 1) {
                unsignedByte = frame.readUnsignedByte();
            } else if (unsignedShort3 == 2) {
                unsignedByte = frame.readUnsignedShort();
            } else if (unsignedShort3 == 3) {
                unsignedByte = frame.readUnsignedInt24();
            } else {
                if (unsignedShort3 != 4) {
                    return null;
                }
                unsignedByte = frame.readUnsignedIntToInt();
            }
            j2 += (long) (unsignedByte * i4);
            i3++;
            j = j3;
            unsignedShort2 = i4;
        }
        if (inputLength != -1 && inputLength != j2) {
            StringBuilder sb = new StringBuilder(67);
            sb.append("VBRI data size mismatch: ");
            sb.append(inputLength);
            sb.append(", ");
            sb.append(j2);
            Log.w(e, sb.toString());
        }
        return new d(jArr, jArr2, jScaleLargeTimestamp, j2);
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.d;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.c;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long timeUs) {
        int iBinarySearchFloor = Util.binarySearchFloor(this.a, timeUs, true, true);
        SeekPoint seekPoint = new SeekPoint(this.a[iBinarySearchFloor], this.b[iBinarySearchFloor]);
        if (seekPoint.timeUs >= timeUs || iBinarySearchFloor == this.a.length - 1) {
            return new SeekMap.SeekPoints(seekPoint);
        }
        int i = iBinarySearchFloor + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(this.a[i], this.b[i]));
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getTimeUs(long position) {
        return this.a[Util.binarySearchFloor(this.b, position, true, true)];
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }
}
