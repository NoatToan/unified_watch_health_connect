package com.airbnb.lottie;

/* JADX INFO: loaded from: classes7.dex */
public enum RenderMode {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    public boolean useSoftwareRendering(int i14, boolean z14, int i15) {
        int iOrdinal = ordinal();
        if (iOrdinal == 1) {
            return false;
        }
        if (iOrdinal != 2) {
            return (z14 && i14 < 28) || i15 > 4 || i14 <= 25;
        }
        return true;
    }
}
