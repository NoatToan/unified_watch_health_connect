package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes2.dex */
final class h {
    public final Track a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public h(Track track, long[] offsets, int[] sizes, int maximumSize, long[] timestampsUs, int[] flags, long durationUs) {
        Assertions.checkArgument(sizes.length == timestampsUs.length);
        Assertions.checkArgument(offsets.length == timestampsUs.length);
        Assertions.checkArgument(flags.length == timestampsUs.length);
        this.a = track;
        this.c = offsets;
        this.d = sizes;
        this.e = maximumSize;
        this.f = timestampsUs;
        this.g = flags;
        this.h = durationUs;
        this.b = offsets.length;
        if (flags.length > 0) {
            int length = flags.length - 1;
            flags[length] = flags[length] | 536870912;
        }
    }

    public int a(long timeUs) {
        for (int iBinarySearchFloor = Util.binarySearchFloor(this.f, timeUs, true, false); iBinarySearchFloor >= 0; iBinarySearchFloor--) {
            if ((this.g[iBinarySearchFloor] & 1) != 0) {
                return iBinarySearchFloor;
            }
        }
        return -1;
    }

    public int b(long timeUs) {
        for (int iBinarySearchCeil = Util.binarySearchCeil(this.f, timeUs, true, false); iBinarySearchCeil < this.f.length; iBinarySearchCeil++) {
            if ((this.g[iBinarySearchCeil] & 1) != 0) {
                return iBinarySearchCeil;
            }
        }
        return -1;
    }
}
