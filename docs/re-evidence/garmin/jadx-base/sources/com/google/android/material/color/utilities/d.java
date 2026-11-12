package com.google.android.material.color.utilities;

import java.util.function.Function;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class d implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53199a;

    public /* synthetic */ d(int i14) {
        this.f53199a = i14;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        DynamicScheme dynamicScheme = (DynamicScheme) obj;
        switch (this.f53199a) {
            case 0:
                return MaterialDynamicColors.lambda$inversePrimary$65(dynamicScheme);
            case 1:
                return MaterialDynamicColors.lambda$onTertiary$83(dynamicScheme);
            case 2:
                return dynamicScheme.secondaryPalette;
            case 3:
                return MaterialDynamicColors.lambda$secondaryFixed$118(dynamicScheme);
            case 4:
                return dynamicScheme.primaryPalette;
            case 5:
                return MaterialDynamicColors.lambda$onPrimaryFixedVariant$114(dynamicScheme);
            case 6:
                return dynamicScheme.tertiaryPalette;
            case 7:
                return MaterialDynamicColors.lambda$tertiaryFixedDim$135(dynamicScheme);
            case 8:
                return dynamicScheme.errorPalette;
            case 9:
                return MaterialDynamicColors.lambda$onError$95(dynamicScheme);
            case 10:
                return dynamicScheme.neutralPalette;
            case 11:
                return MaterialDynamicColors.lambda$textPrimaryInverseDisableOnly$157(dynamicScheme);
            case 12:
                return dynamicScheme.primaryPalette;
            case 13:
                return dynamicScheme.secondaryPalette;
            case 14:
                return MaterialDynamicColors.lambda$secondaryFixedDim$121(dynamicScheme);
            case 15:
                return dynamicScheme.neutralPalette;
            case 16:
                return dynamicScheme.neutralVariantPalette;
            case 17:
                return MaterialDynamicColors.lambda$surfaceVariant$34(dynamicScheme);
            case 18:
                return dynamicScheme.neutralVariantPalette;
            case 19:
                return MaterialDynamicColors.lambda$neutralVariantPaletteKeyColor$9(dynamicScheme);
            case 20:
                return dynamicScheme.neutralPalette;
            case 21:
                return MaterialDynamicColors.lambda$textHintInverse$161(dynamicScheme);
            case 22:
                return dynamicScheme.neutralPalette;
            case 23:
                return MaterialDynamicColors.lambda$shadow$47(dynamicScheme);
            case 24:
                return dynamicScheme.neutralPalette;
            case 25:
                return MaterialDynamicColors.lambda$onSurface$32(dynamicScheme);
            case 26:
                return MaterialDynamicColors.lambda$surfaceContainerHighest$30(dynamicScheme);
            case 27:
                return dynamicScheme.primaryPalette;
            case 28:
                return MaterialDynamicColors.lambda$primaryFixed$104(dynamicScheme);
            default:
                return dynamicScheme.primaryPalette;
        }
    }
}
