package com.google.android.exoplayer2.transformer;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import com.google.android.exoplayer2.util.Assertions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSortedMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
class e implements f {
    private static final int c = 30;
    private final ImmutableSortedMap<Long, Float> a;
    private final float b;

    public e(Format format) {
        float fD = d(format);
        float f = fD == -3.4028235E38f ? 1.0f : fD / 30.0f;
        this.b = f;
        this.a = b(format, f);
    }

    private static ImmutableSortedMap<Long, Float> b(Format format, float baseSpeed) {
        ImmutableList<SlowMotionData.Segment> immutableListC = c(format);
        if (immutableListC.isEmpty()) {
            return ImmutableSortedMap.of();
        }
        TreeMap treeMap = new TreeMap();
        for (int i = 0; i < immutableListC.size(); i++) {
            SlowMotionData.Segment segment = immutableListC.get(i);
            treeMap.put(Long.valueOf(C.msToUs(segment.startTimeMs)), Float.valueOf(baseSpeed / segment.speedDivisor));
        }
        for (int i2 = 0; i2 < immutableListC.size(); i2++) {
            SlowMotionData.Segment segment2 = immutableListC.get(i2);
            if (!treeMap.containsKey(Long.valueOf(C.msToUs(segment2.endTimeMs)))) {
                treeMap.put(Long.valueOf(C.msToUs(segment2.endTimeMs)), Float.valueOf(baseSpeed));
            }
        }
        return ImmutableSortedMap.copyOf((Map) treeMap);
    }

    private static ImmutableList<SlowMotionData.Segment> c(Format format) {
        ArrayList arrayList = new ArrayList();
        Metadata metadata = format.metadata;
        if (metadata != null) {
            for (int i = 0; i < metadata.length(); i++) {
                Metadata.Entry entry = metadata.get(i);
                if (entry instanceof SlowMotionData) {
                    arrayList.addAll(((SlowMotionData) entry).segments);
                }
            }
        }
        return ImmutableList.sortedCopyOf(SlowMotionData.Segment.BY_START_THEN_END_THEN_DIVISOR, arrayList);
    }

    private static float d(Format format) {
        Metadata metadata = format.metadata;
        if (metadata == null) {
            return -3.4028235E38f;
        }
        for (int i = 0; i < metadata.length(); i++) {
            Metadata.Entry entry = metadata.get(i);
            if (entry instanceof SmtaMetadataEntry) {
                return ((SmtaMetadataEntry) entry).captureFrameRate;
            }
        }
        return -3.4028235E38f;
    }

    @Override // com.google.android.exoplayer2.transformer.f
    public float a(long timeUs) {
        Assertions.checkArgument(timeUs >= 0);
        Map.Entry<Long, Float> entryFloorEntry = this.a.floorEntry(Long.valueOf(timeUs));
        return entryFloorEntry != null ? entryFloorEntry.getValue().floatValue() : this.b;
    }
}
