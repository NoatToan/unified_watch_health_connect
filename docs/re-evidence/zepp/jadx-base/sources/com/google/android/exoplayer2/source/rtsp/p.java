package com.google.android.exoplayer2.source.rtsp;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class p {
    public final int a;
    public final ImmutableList<Integer> b;

    public p(int status, List<Integer> supportedMethods) {
        this.a = status;
        this.b = ImmutableList.copyOf((Collection) supportedMethods);
    }
}
