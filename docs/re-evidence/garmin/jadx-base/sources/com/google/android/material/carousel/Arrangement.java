package com.google.android.material.carousel;

import v.e0;

/* JADX INFO: loaded from: classes14.dex */
final class Arrangement {
    private static final float MEDIUM_ITEM_FLEX_PERCENTAGE = 0.1f;
    final float cost;
    final int largeCount;
    float largeSize;
    int mediumCount;
    float mediumSize;
    final int priority;
    int smallCount;
    float smallSize;

    public Arrangement(int i14, float f14, float f15, float f16, int i15, float f17, int i16, float f18, int i17, float f19) {
        this.priority = i14;
        this.smallSize = g7.a.a(f14, f15, f16);
        this.smallCount = i15;
        this.mediumSize = f17;
        this.mediumCount = i16;
        this.largeSize = f18;
        this.largeCount = i17;
        fit(f19, f15, f16, f18);
        this.cost = cost(f18);
    }

    private float calculateLargeSize(float f14, int i14, float f15, int i15, int i16) {
        if (i14 <= 0) {
            f15 = 0.0f;
        }
        float f16 = i15 / 2.0f;
        return (f14 - ((i14 + f16) * f15)) / (i16 + f16);
    }

    private float cost(float f14) {
        if (isValid()) {
            return Math.abs(f14 - this.largeSize) * this.priority;
        }
        return Float.MAX_VALUE;
    }

    public static Arrangement findLowestCostArrangement(float f14, float f15, float f16, float f17, int[] iArr, float f18, int[] iArr2, float f19, int[] iArr3) {
        Arrangement arrangement = null;
        int i14 = 1;
        for (int i15 : iArr3) {
            int length = iArr2.length;
            int i16 = 0;
            while (i16 < length) {
                int i17 = iArr2[i16];
                int length2 = iArr.length;
                int i18 = 0;
                while (i18 < length2) {
                    int i19 = length;
                    int i24 = i16;
                    int i25 = i14;
                    int i26 = length2;
                    int i27 = i18;
                    Arrangement arrangement2 = new Arrangement(i25, f15, f16, f17, iArr[i18], f18, i17, f19, i15, f14);
                    if (arrangement == null || arrangement2.cost < arrangement.cost) {
                        if (arrangement2.cost == 0.0f) {
                            return arrangement2;
                        }
                        arrangement = arrangement2;
                    }
                    int i28 = i25 + 1;
                    i18 = i27 + 1;
                    i16 = i24;
                    i14 = i28;
                    length = i19;
                    length2 = i26;
                }
                i16++;
                i14 = i14;
                length = length;
            }
        }
        return arrangement;
    }

    private void fit(float f14, float f15, float f16, float f17) {
        float space = f14 - getSpace();
        int i14 = this.smallCount;
        if (i14 > 0 && space > 0.0f) {
            float f18 = this.smallSize;
            this.smallSize = Math.min(space / i14, f16 - f18) + f18;
        } else if (i14 > 0 && space < 0.0f) {
            float f19 = this.smallSize;
            this.smallSize = Math.max(space / i14, f15 - f19) + f19;
        }
        int i15 = this.smallCount;
        float f22 = i15 > 0 ? this.smallSize : 0.0f;
        this.smallSize = f22;
        float fCalculateLargeSize = calculateLargeSize(f14, i15, f22, this.mediumCount, this.largeCount);
        this.largeSize = fCalculateLargeSize;
        float f24 = (this.smallSize + fCalculateLargeSize) / 2.0f;
        this.mediumSize = f24;
        int i16 = this.mediumCount;
        if (i16 <= 0 || fCalculateLargeSize == f17) {
            return;
        }
        float f25 = (f17 - fCalculateLargeSize) * this.largeCount;
        float fMin = Math.min(Math.abs(f25), f24 * 0.1f * i16);
        float f26 = this.mediumSize;
        if (f25 > 0.0f) {
            this.mediumSize = f26 - (fMin / this.mediumCount);
            this.largeSize = (fMin / this.largeCount) + this.largeSize;
        } else {
            this.mediumSize = (fMin / this.mediumCount) + f26;
            this.largeSize -= fMin / this.largeCount;
        }
    }

    private float getSpace() {
        return (this.smallSize * this.smallCount) + (this.mediumSize * this.mediumCount) + (this.largeSize * this.largeCount);
    }

    private boolean isValid() {
        int i14 = this.largeCount;
        if (i14 <= 0 || this.smallCount <= 0 || this.mediumCount <= 0) {
            return i14 <= 0 || this.smallCount <= 0 || this.largeSize > this.smallSize;
        }
        float f14 = this.largeSize;
        float f15 = this.mediumSize;
        return f14 > f15 && f15 > this.smallSize;
    }

    public int getItemCount() {
        return this.smallCount + this.mediumCount + this.largeCount;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("Arrangement [priority=");
        sb3.append(this.priority);
        sb3.append(", smallCount=");
        sb3.append(this.smallCount);
        sb3.append(", smallSize=");
        sb3.append(this.smallSize);
        sb3.append(", mediumCount=");
        sb3.append(this.mediumCount);
        sb3.append(", mediumSize=");
        sb3.append(this.mediumSize);
        sb3.append(", largeCount=");
        sb3.append(this.largeCount);
        sb3.append(", largeSize=");
        sb3.append(this.largeSize);
        sb3.append(", cost=");
        return e0.e(this.cost, "]", sb3);
    }
}
