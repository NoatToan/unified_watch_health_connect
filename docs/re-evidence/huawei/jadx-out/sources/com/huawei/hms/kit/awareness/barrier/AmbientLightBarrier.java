package com.huawei.hms.kit.awareness.barrier;

import com.huawei.hms.kit.awareness.barrier.internal.a.d.a;

/* JADX INFO: loaded from: classes34.dex */
public final class AmbientLightBarrier {
    public static AwarenessBarrier range(float f, float f2) {
        a aVarA = a.a(f, f2, 1);
        if (aVarA.j()) {
            return aVarA;
        }
        throw new IllegalArgumentException();
    }

    public static AwarenessBarrier below(float f) {
        a aVarA = a.a(0.0f, f, 0);
        if (aVarA.j()) {
            return aVarA;
        }
        throw new IllegalArgumentException();
    }

    public static AwarenessBarrier above(float f) {
        a aVarA = a.a(f, Float.MAX_VALUE, 2);
        if (aVarA.j()) {
            return aVarA;
        }
        throw new IllegalArgumentException();
    }

    private AmbientLightBarrier() {
    }
}
