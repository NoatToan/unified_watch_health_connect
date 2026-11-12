package com.google.android.exoplayer2.source.rtsp;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class q {
    public final int a;
    public final t b;
    public final ImmutableList<v> c;

    public q(int status, t sessionTiming, List<v> trackTimingList) {
        this.a = status;
        this.b = sessionTiming;
        this.c = ImmutableList.copyOf((Collection) trackTimingList);
    }
}
