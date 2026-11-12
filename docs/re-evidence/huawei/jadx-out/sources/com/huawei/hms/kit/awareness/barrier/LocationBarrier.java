package com.huawei.hms.kit.awareness.barrier;

import com.huawei.hms.kit.awareness.barrier.internal.a.e.a;
import com.huawei.hms.kit.awareness.barrier.internal.type.g;

/* JADX INFO: loaded from: classes34.dex */
public final class LocationBarrier {
    public static AwarenessBarrier stay(double d, double d2, double d3, long j) {
        a aVarA = a.a(d, d2, d3, g.IN, j);
        if (aVarA.j()) {
            return aVarA;
        }
        throw new IllegalArgumentException();
    }

    public static AwarenessBarrier exit(double d, double d2, double d3) {
        a aVarA = a.a(d, d2, d3, g.EXITING, 0L);
        if (aVarA.j()) {
            return aVarA;
        }
        throw new IllegalArgumentException();
    }

    public static AwarenessBarrier enter(double d, double d2, double d3) {
        a aVarA = a.a(d, d2, d3, g.ENTERING, 0L);
        if (aVarA.j()) {
            return aVarA;
        }
        throw new IllegalArgumentException();
    }

    private LocationBarrier() {
    }
}
