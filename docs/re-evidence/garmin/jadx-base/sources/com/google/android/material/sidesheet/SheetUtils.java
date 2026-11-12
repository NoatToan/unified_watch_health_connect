package com.google.android.material.sidesheet;

/* JADX INFO: loaded from: classes14.dex */
final class SheetUtils {
    private SheetUtils() {
    }

    public static boolean isSwipeMostlyHorizontal(float f14, float f15) {
        return Math.abs(f14) > Math.abs(f15);
    }
}
