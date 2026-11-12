package com.google.common.graph;

import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class Graphs {

    enum NodeVisitState {
        PENDING,
        COMPLETE
    }

    static int d(int i) {
        Preconditions.checkArgument(i >= 0, "Not true that %s is non-negative.", i);
        return i;
    }

    static int b(int i) {
        Preconditions.checkArgument(i > 0, "Not true that %s is positive.", i);
        return i;
    }
}
