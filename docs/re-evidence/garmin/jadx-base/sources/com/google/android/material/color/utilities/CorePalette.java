package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes14.dex */
public final class CorePalette {

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public TonalPalette f53178a1;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public TonalPalette f53179a2;

    /* JADX INFO: renamed from: a3, reason: collision with root package name */
    public TonalPalette f53180a3;
    public TonalPalette error;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public TonalPalette f53181n1;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public TonalPalette f53182n2;

    private CorePalette(int i14, boolean z14) {
        Hct hctFromInt = Hct.fromInt(i14);
        double hue = hctFromInt.getHue();
        double chroma = hctFromInt.getChroma();
        if (z14) {
            this.f53178a1 = TonalPalette.fromHueAndChroma(hue, chroma);
            this.f53179a2 = TonalPalette.fromHueAndChroma(hue, chroma / 3.0d);
            this.f53180a3 = TonalPalette.fromHueAndChroma(60.0d + hue, chroma / 2.0d);
            this.f53181n1 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 12.0d, 4.0d));
            this.f53182n2 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 6.0d, 8.0d));
        } else {
            this.f53178a1 = TonalPalette.fromHueAndChroma(hue, Math.max(48.0d, chroma));
            this.f53179a2 = TonalPalette.fromHueAndChroma(hue, 16.0d);
            this.f53180a3 = TonalPalette.fromHueAndChroma(60.0d + hue, 24.0d);
            this.f53181n1 = TonalPalette.fromHueAndChroma(hue, 4.0d);
            this.f53182n2 = TonalPalette.fromHueAndChroma(hue, 8.0d);
        }
        this.error = TonalPalette.fromHueAndChroma(25.0d, 84.0d);
    }

    public static CorePalette contentOf(int i14) {
        return new CorePalette(i14, true);
    }

    public static CorePalette of(int i14) {
        return new CorePalette(i14, false);
    }
}
