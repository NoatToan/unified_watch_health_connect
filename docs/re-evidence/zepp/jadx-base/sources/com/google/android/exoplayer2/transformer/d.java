package com.google.android.exoplayer2.transformer;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes3.dex */
final class d implements c {

    @VisibleForTesting
    public static final int j = 30;
    private static final int k = 30;
    private static final int l = NalUnitUtil.NAL_START_CODE.length;
    private static final int m = 14;
    private final byte[] a = new byte[l];

    @Nullable
    private final SlowMotionData b;
    private final Iterator<SlowMotionData.Segment> c;
    private final float d;
    private final int e;
    private final int f;

    @Nullable
    private b g;

    @Nullable
    private b h;
    private long i;

    public static final class a {
        public float a = -3.4028235E38f;
        public int b = -1;
        public int c = -1;

        @Nullable
        public SlowMotionData d;
    }

    public static final class b {
        public final long a;
        public final long b;
        public final int c;
        public final int d;

        public b(SlowMotionData.Segment segment, int inputMaxLayer, int normalSpeedLayer) {
            this.a = C.msToUs(segment.startTimeMs);
            this.b = C.msToUs(segment.endTimeMs);
            int i = segment.speedDivisor;
            this.c = i;
            this.d = a(i, inputMaxLayer, normalSpeedLayer);
        }

        private static int a(int speedDivisor, int inputMaxLayer, int normalSpeedMaxLayer) {
            for (int i = speedDivisor; i > 0; i >>= 1) {
                if ((i & 1) == 1) {
                    boolean z = (i >> 1) == 0;
                    StringBuilder sb = new StringBuilder(34);
                    sb.append("Invalid speed divisor: ");
                    sb.append(speedDivisor);
                    Assertions.checkState(z, sb.toString());
                    break;
                }
                normalSpeedMaxLayer++;
            }
            return Math.min(normalSpeedMaxLayer, inputMaxLayer);
        }
    }

    public d(Format format) {
        a aVarD = d(format.metadata);
        SlowMotionData slowMotionData = aVarD.d;
        this.b = slowMotionData;
        Iterator<SlowMotionData.Segment> it2 = (slowMotionData != null ? slowMotionData.segments : ImmutableList.of()).iterator();
        this.c = it2;
        this.d = aVarD.a;
        int i = aVarD.b;
        this.e = i;
        int i2 = aVarD.c;
        this.f = i2;
        this.h = it2.hasNext() ? new b(it2.next(), i, i2) : null;
        if (slowMotionData != null) {
            boolean zEquals = MimeTypes.VIDEO_H264.equals(format.sampleMimeType);
            String strValueOf = String.valueOf(format.sampleMimeType);
            Assertions.checkArgument(zEquals, strValueOf.length() != 0 ? "Unsupported MIME type for SEF slow motion video track: ".concat(strValueOf) : new String("Unsupported MIME type for SEF slow motion video track: "));
        }
    }

    private void b() {
        if (this.g != null) {
            e();
        }
        this.g = this.h;
        this.h = this.c.hasNext() ? new b(this.c.next(), this.e, this.f) : null;
    }

    private static a d(@Nullable Metadata metadata) {
        a aVar = new a();
        if (metadata == null) {
            return aVar;
        }
        for (int i = 0; i < metadata.length(); i++) {
            Metadata.Entry entry = metadata.get(i);
            if (entry instanceof SmtaMetadataEntry) {
                SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) entry;
                aVar.a = smtaMetadataEntry.captureFrameRate;
                aVar.b = smtaMetadataEntry.svcTemporalLayerCount - 1;
            } else if (entry instanceof SlowMotionData) {
                aVar.d = (SlowMotionData) entry;
            }
        }
        if (aVar.d == null) {
            return aVar;
        }
        Assertions.checkState(aVar.b != -1, "SVC temporal layer count not found.");
        Assertions.checkState(aVar.a != -3.4028235E38f, "Capture frame rate not found.");
        float f = aVar.a;
        boolean z = f % 1.0f == 0.0f && f % 30.0f == 0.0f;
        StringBuilder sb = new StringBuilder(43);
        sb.append("Invalid capture frame rate: ");
        sb.append(f);
        Assertions.checkState(z, sb.toString());
        int i2 = ((int) aVar.a) / 30;
        for (int i3 = aVar.b; i3 >= 0; i3--) {
            if ((i2 & 1) == 1) {
                boolean z2 = (i2 >> 1) == 0;
                float f2 = aVar.a;
                StringBuilder sb2 = new StringBuilder(84);
                sb2.append("Could not compute normal speed max SVC layer for capture frame rate  ");
                sb2.append(f2);
                Assertions.checkState(z2, sb2.toString());
                aVar.c = i3;
                break;
            }
            i2 >>= 1;
        }
        return aVar;
    }

    @RequiresNonNull({"currentSegmentInfo"})
    private void e() {
        long j2 = this.i;
        b bVar = this.g;
        this.i = j2 + ((bVar.b - bVar.a) * ((long) (bVar.c - 1)));
        this.g = null;
    }

    private boolean g(int layer, long timeUs) {
        int i;
        b bVar = this.h;
        if (bVar != null && layer < (i = bVar.d)) {
            long j2 = ((bVar.a - timeUs) * 30) / 1000000;
            float f = (-(1 << (this.e - i))) + 0.45f;
            for (int i2 = 1; i2 < this.h.d && j2 < (1 << (this.e - i2)) + f; i2++) {
                if (layer <= i2) {
                    return true;
                }
            }
        }
        return false;
    }

    private void h(ByteBuffer data) {
        int iPosition = data.position();
        while (true) {
            int iRemaining = data.remaining();
            int i = l;
            if (iRemaining < i) {
                throw new IllegalStateException("Could not find NAL unit start code.");
            }
            data.get(this.a, 0, i);
            if (Arrays.equals(this.a, NalUnitUtil.NAL_START_CODE)) {
                data.position(iPosition);
                return;
            } else {
                iPosition++;
                data.position(iPosition);
            }
        }
    }

    @Override // com.google.android.exoplayer2.transformer.c
    public void a(DecoderInputBuffer buffer) {
        if (this.b == null) {
            return;
        }
        ByteBuffer byteBuffer = (ByteBuffer) Util.castNonNull(buffer.data);
        byteBuffer.position(byteBuffer.position() + l);
        boolean z = false;
        byteBuffer.get(this.a, 0, 4);
        byte[] bArr = this.a;
        int i = bArr[0] & 31;
        boolean z2 = ((bArr[1] & 255) >> 7) == 1;
        if (i == 14 && z2) {
            z = true;
        }
        Assertions.checkState(z, "Missing SVC extension prefix NAL unit.");
        if (!f((this.a[3] & 255) >> 5, buffer.timeUs)) {
            buffer.data = null;
        } else {
            buffer.timeUs = c(buffer.timeUs);
            h(byteBuffer);
        }
    }

    @VisibleForTesting
    public long c(long inputTimeUs) {
        long j2 = this.i + inputTimeUs;
        b bVar = this.g;
        if (bVar != null) {
            j2 += (inputTimeUs - bVar.a) * ((long) (bVar.c - 1));
        }
        return Math.round((j2 * 30) / this.d);
    }

    @VisibleForTesting
    public boolean f(int layer, long timeUs) {
        b bVar;
        while (true) {
            bVar = this.h;
            if (bVar == null || timeUs < bVar.b) {
                break;
            }
            b();
        }
        if (bVar == null || timeUs < bVar.a) {
            b bVar2 = this.g;
            if (bVar2 != null && timeUs >= bVar2.b) {
                e();
            }
        } else {
            b();
        }
        b bVar3 = this.g;
        return layer <= (bVar3 != null ? bVar3.d : this.f) || g(layer, timeUs);
    }
}
