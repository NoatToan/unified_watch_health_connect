package com.google.android.material.color.utilities;

import java.util.function.Function;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class a implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialDynamicColors f53196b;

    public /* synthetic */ a(MaterialDynamicColors materialDynamicColors, int i14) {
        this.f53195a = i14;
        this.f53196b = materialDynamicColors;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f53195a) {
            case 0:
                return this.f53196b.lambda$onSecondary$72((DynamicScheme) obj);
            case 1:
                return this.f53196b.lambda$secondary$69((DynamicScheme) obj);
            case 2:
                return this.f53196b.lambda$onSecondaryFixed$125((DynamicScheme) obj);
            case 3:
                return this.f53196b.lambda$onSecondaryFixed$126((DynamicScheme) obj);
            case 4:
                return this.f53196b.lambda$inverseOnSurface$41((DynamicScheme) obj);
            case 5:
                return this.f53196b.lambda$onTertiaryContainer$89((DynamicScheme) obj);
            case 6:
                return this.f53196b.lambda$onTertiaryContainer$90((DynamicScheme) obj);
            case 7:
                return this.f53196b.lambda$onSecondaryContainer$77((DynamicScheme) obj);
            case 8:
                return this.f53196b.lambda$onSecondaryContainer$78((DynamicScheme) obj);
            case 9:
                return this.f53196b.lambda$onPrimaryFixed$111((DynamicScheme) obj);
            case 10:
                return this.f53196b.lambda$onPrimaryFixed$112((DynamicScheme) obj);
            case 11:
                return this.f53196b.lambda$error$93((DynamicScheme) obj);
            case 12:
                return this.f53196b.lambda$onErrorContainer$102((DynamicScheme) obj);
            case 13:
                return this.f53196b.lambda$errorContainer$99((DynamicScheme) obj);
            case 14:
                return this.f53196b.lambda$tertiaryFixed$133((DynamicScheme) obj);
            case 15:
                return this.f53196b.lambda$primary$54((DynamicScheme) obj);
            case 16:
                return this.f53196b.lambda$onSecondaryFixedVariant$129((DynamicScheme) obj);
            case 17:
                return this.f53196b.lambda$onSecondaryFixedVariant$130((DynamicScheme) obj);
            case 18:
                return this.f53196b.lambda$tertiary$81((DynamicScheme) obj);
            case 19:
                return this.f53196b.lambda$onTertiaryFixedVariant$143((DynamicScheme) obj);
            case 20:
                return this.f53196b.lambda$onTertiaryFixedVariant$144((DynamicScheme) obj);
            case 21:
                return this.f53196b.lambda$secondaryContainer$75((DynamicScheme) obj);
            case 22:
                return this.f53196b.lambda$onTertiaryFixed$139((DynamicScheme) obj);
            case 23:
                return this.f53196b.lambda$onTertiaryFixed$140((DynamicScheme) obj);
            case 24:
                return this.f53196b.lambda$primaryContainer$60((DynamicScheme) obj);
            case 25:
                return this.f53196b.lambda$onBackground$14((DynamicScheme) obj);
            case 26:
                return this.f53196b.lambda$onPrimary$57((DynamicScheme) obj);
            case 27:
                return this.f53196b.lambda$inversePrimary$66((DynamicScheme) obj);
            case 28:
                return this.f53196b.lambda$secondaryFixed$119((DynamicScheme) obj);
            default:
                return this.f53196b.lambda$onPrimaryFixedVariant$115((DynamicScheme) obj);
        }
    }
}
