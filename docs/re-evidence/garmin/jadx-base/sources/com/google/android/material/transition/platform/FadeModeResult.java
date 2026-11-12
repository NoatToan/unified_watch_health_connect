package com.google.android.material.transition.platform;

/* JADX INFO: loaded from: classes14.dex */
class FadeModeResult {
    final int endAlpha;
    final boolean endOnTop;
    final int startAlpha;

    private FadeModeResult(int i14, int i15, boolean z14) {
        this.startAlpha = i14;
        this.endAlpha = i15;
        this.endOnTop = z14;
    }

    public static FadeModeResult endOnTop(int i14, int i15) {
        return new FadeModeResult(i14, i15, true);
    }

    public static FadeModeResult startOnTop(int i14, int i15) {
        return new FadeModeResult(i14, i15, false);
    }
}
