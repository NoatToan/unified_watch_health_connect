package com.garmin.android.apps.connectmobile.badges.service.model;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30560a;

    public /* synthetic */ c(int i14) {
        this.f30560a = i14;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f30560a) {
            case 0:
                return Integer.valueOf(((d) obj).f30563a);
            case 1:
                return ((DynamicScheme) obj).neutralPalette;
            case 2:
                return ((DynamicScheme) obj).secondaryPalette;
            case 3:
                return MaterialDynamicColors.lambda$onSecondary$71((DynamicScheme) obj);
            case 4:
                return ((DynamicScheme) obj).secondaryPalette;
            case 5:
                return MaterialDynamicColors.lambda$secondary$68((DynamicScheme) obj);
            case 6:
                return ((DynamicScheme) obj).neutralPalette;
            case 7:
                return MaterialDynamicColors.lambda$surfaceContainerLowest$22((DynamicScheme) obj);
            case 8:
                return ((DynamicScheme) obj).neutralVariantPalette;
            case 9:
                return MaterialDynamicColors.lambda$outline$43((DynamicScheme) obj);
            case 10:
                return ((DynamicScheme) obj).neutralPalette;
            case 11:
                return ((DynamicScheme) obj).primaryPalette;
            case 12:
                return MaterialDynamicColors.lambda$surfaceTint$51((DynamicScheme) obj);
            case 13:
                return ((DynamicScheme) obj).secondaryPalette;
            case 14:
                return MaterialDynamicColors.lambda$onSecondaryFixed$124((DynamicScheme) obj);
            case 15:
                return ((DynamicScheme) obj).neutralPalette;
            case 16:
                return MaterialDynamicColors.lambda$inverseOnSurface$40((DynamicScheme) obj);
            case 17:
                return ((DynamicScheme) obj).tertiaryPalette;
            case 18:
                return MaterialDynamicColors.lambda$neutralPaletteKeyColor$7((DynamicScheme) obj);
            case 19:
                return ((DynamicScheme) obj).secondaryPalette;
            case 20:
                return ((DynamicScheme) obj).primaryPalette;
            case 21:
                return MaterialDynamicColors.lambda$onPrimaryFixed$110((DynamicScheme) obj);
            case 22:
                return ((DynamicScheme) obj).errorPalette;
            case 23:
                return ((DynamicScheme) obj).neutralPalette;
            case 24:
                return MaterialDynamicColors.lambda$error$92((DynamicScheme) obj);
            case 25:
                return ((DynamicScheme) obj).neutralPalette;
            case 26:
                return MaterialDynamicColors.lambda$textPrimaryInverse$153((DynamicScheme) obj);
            case 27:
                return ((DynamicScheme) obj).neutralPalette;
            case 28:
                return MaterialDynamicColors.lambda$surfaceContainer$26((DynamicScheme) obj);
            default:
                return ((DynamicScheme) obj).neutralVariantPalette;
        }
    }
}
