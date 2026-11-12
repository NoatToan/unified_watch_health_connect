package com.airbnb.lottie;

/* JADX INFO: loaded from: classes21.dex */
public enum RenderMode {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* JADX INFO: renamed from: com.airbnb.lottie.RenderMode$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[RenderMode.values().length];
            d = iArr;
            try {
                iArr[RenderMode.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[RenderMode.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[RenderMode.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean useSoftwareRendering(int i, boolean z, int i2) {
        int i3 = AnonymousClass5.d[ordinal()];
        if (i3 == 1) {
            return false;
        }
        if (i3 != 2) {
            return (z && i < 28) || i2 > 4 || i <= 25;
        }
        return true;
    }
}
