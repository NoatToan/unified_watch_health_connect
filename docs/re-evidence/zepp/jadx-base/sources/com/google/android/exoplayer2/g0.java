package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes2.dex */
final class g0 {
    public final MediaSource.MediaPeriodId a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public g0(MediaSource.MediaPeriodId id, long startPositionUs, long requestedContentPositionUs, long endPositionUs, long durationUs, boolean isFollowedByTransitionToSameStream, boolean isLastInTimelinePeriod, boolean isLastInTimelineWindow, boolean isFinal) {
        boolean z = false;
        Assertions.checkArgument(!isFinal || isLastInTimelinePeriod);
        Assertions.checkArgument(!isLastInTimelineWindow || isLastInTimelinePeriod);
        if (!isFollowedByTransitionToSameStream || (!isLastInTimelinePeriod && !isLastInTimelineWindow && !isFinal)) {
            z = true;
        }
        Assertions.checkArgument(z);
        this.a = id;
        this.b = startPositionUs;
        this.c = requestedContentPositionUs;
        this.d = endPositionUs;
        this.e = durationUs;
        this.f = isFollowedByTransitionToSameStream;
        this.g = isLastInTimelinePeriod;
        this.h = isLastInTimelineWindow;
        this.i = isFinal;
    }

    public g0 a(long requestedContentPositionUs) {
        return requestedContentPositionUs == this.c ? this : new g0(this.a, this.b, requestedContentPositionUs, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public g0 b(long startPositionUs) {
        return startPositionUs == this.b ? this : new g0(this.a, startPositionUs, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public boolean equals(@Nullable Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || g0.class != o.getClass()) {
            return false;
        }
        g0 g0Var = (g0) o;
        return this.b == g0Var.b && this.c == g0Var.c && this.d == g0Var.d && this.e == g0Var.e && this.f == g0Var.f && this.g == g0Var.g && this.h == g0Var.h && this.i == g0Var.i && Util.areEqual(this.a, g0Var.a);
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.a.hashCode()) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
