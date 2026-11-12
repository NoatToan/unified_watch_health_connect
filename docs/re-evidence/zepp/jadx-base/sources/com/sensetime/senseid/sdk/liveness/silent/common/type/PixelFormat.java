package com.sensetime.senseid.sdk.liveness.silent.common.type;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public enum PixelFormat {
    GRAY8(0, 1),
    YUV420P(1, 1),
    NV12(2, 1),
    NV21(3, 1),
    BGRA8888(4, 4),
    BGR888(5, 3);

    private int mCode;
    private int mStride;

    PixelFormat(int i, int i2) {
        this.mCode = 0;
        this.mStride = 0;
        this.mCode = i;
        this.mStride = i2;
    }

    public final int getCode() {
        return this.mCode;
    }

    public final int getStride() {
        return this.mStride;
    }
}
