package com.github.mikephil.chartingv2.utils;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public final class FSize {
    public final float height;
    public final float width;

    public FSize(float f14, float f15) {
        this.width = f14;
        this.height = f15;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof FSize) {
            FSize fSize = (FSize) obj;
            if (this.width == fSize.width && this.height == fSize.height) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.width) ^ Float.floatToIntBits(this.height);
    }

    public String toString() {
        return this.width + "x" + this.height;
    }
}
