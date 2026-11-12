package com.google.android.material.color.utilities;

import java.util.function.Function;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class c implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53198a;

    public /* synthetic */ c(int i14) {
        this.f53198a = i14;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        DynamicScheme dynamicScheme = (DynamicScheme) obj;
        switch (this.f53198a) {
            case 0:
                return MaterialDynamicColors.lambda$secondaryPaletteKeyColor$3(dynamicScheme);
            case 1:
                return dynamicScheme.neutralPalette;
            case 2:
                return MaterialDynamicColors.lambda$surfaceContainerLow$24(dynamicScheme);
            case 3:
                return dynamicScheme.secondaryPalette;
            case 4:
                return MaterialDynamicColors.lambda$secondaryContainer$74(dynamicScheme);
            case 5:
                return dynamicScheme.neutralPalette;
            case 6:
                return dynamicScheme.tertiaryPalette;
            case 7:
                return MaterialDynamicColors.lambda$onTertiaryFixed$138(dynamicScheme);
            case 8:
                return dynamicScheme.tertiaryPalette;
            case 9:
                return MaterialDynamicColors.lambda$tertiaryPaletteKeyColor$5(dynamicScheme);
            case 10:
                return dynamicScheme.neutralPalette;
            case 11:
                return MaterialDynamicColors.lambda$controlHighlight$150(dynamicScheme);
            case 12:
                return MaterialDynamicColors.lambda$controlHighlight$151(dynamicScheme);
            case 13:
                return MaterialDynamicColors.lambda$textSecondaryAndTertiaryInverseDisabled$159(dynamicScheme);
            case 14:
                return dynamicScheme.primaryPalette;
            case 15:
                return MaterialDynamicColors.lambda$primaryContainer$59(dynamicScheme);
            case 16:
                return dynamicScheme.neutralPalette;
            case 17:
                return MaterialDynamicColors.lambda$background$11(dynamicScheme);
            case 18:
                return dynamicScheme.neutralPalette;
            case 19:
                return MaterialDynamicColors.lambda$surfaceContainerHigh$28(dynamicScheme);
            case 20:
                return dynamicScheme.neutralPalette;
            case 21:
                return MaterialDynamicColors.lambda$onBackground$13(dynamicScheme);
            case 22:
                return dynamicScheme.tertiaryPalette;
            case 23:
                return dynamicScheme.neutralVariantPalette;
            case 24:
                return MaterialDynamicColors.lambda$outlineVariant$45(dynamicScheme);
            case 25:
                return dynamicScheme.neutralPalette;
            case 26:
                return MaterialDynamicColors.lambda$surfaceBright$20(dynamicScheme);
            case 27:
                return dynamicScheme.primaryPalette;
            case 28:
                return MaterialDynamicColors.lambda$onPrimary$56(dynamicScheme);
            default:
                return dynamicScheme.primaryPalette;
        }
    }
}
