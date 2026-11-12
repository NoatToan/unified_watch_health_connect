package com.google.android.material.color.utilities;

import java.util.function.Function;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class e implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialDynamicColors f53201b;

    public /* synthetic */ e(MaterialDynamicColors materialDynamicColors, int i14) {
        this.f53200a = i14;
        this.f53201b = materialDynamicColors;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f53200a) {
            case 0:
                return this.f53201b.lambda$onPrimaryFixedVariant$116((DynamicScheme) obj);
            case 1:
                return this.f53201b.lambda$tertiaryFixedDim$136((DynamicScheme) obj);
            case 2:
                return this.f53201b.lambda$onTertiary$84((DynamicScheme) obj);
            case 3:
                return this.f53201b.lambda$onError$96((DynamicScheme) obj);
            case 4:
                return this.f53201b.lambda$onPrimaryContainer$62((DynamicScheme) obj);
            case 5:
                return this.f53201b.lambda$onPrimaryContainer$63((DynamicScheme) obj);
            case 6:
                return this.f53201b.lambda$secondaryFixedDim$122((DynamicScheme) obj);
            case 7:
                return this.f53201b.lambda$primaryFixed$105((DynamicScheme) obj);
            case 8:
                return this.f53201b.lambda$primaryFixedDim$108((DynamicScheme) obj);
            case 9:
                return this.f53201b.lambda$tertiaryContainer$87((DynamicScheme) obj);
            default:
                return this.f53201b.highestSurface((DynamicScheme) obj);
        }
    }
}
