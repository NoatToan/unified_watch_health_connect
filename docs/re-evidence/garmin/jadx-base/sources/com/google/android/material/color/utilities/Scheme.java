package com.google.android.material.color.utilities;

import ch.qos.logback.core.CoreConstants;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;
import ds.e0;

/* JADX INFO: loaded from: classes14.dex */
@CheckReturnValue
public class Scheme {
    private int background;
    private int error;
    private int errorContainer;
    private int inverseOnSurface;
    private int inversePrimary;
    private int inverseSurface;
    private int onBackground;
    private int onError;
    private int onErrorContainer;
    private int onPrimary;
    private int onPrimaryContainer;
    private int onSecondary;
    private int onSecondaryContainer;
    private int onSurface;
    private int onSurfaceVariant;
    private int onTertiary;
    private int onTertiaryContainer;
    private int outline;
    private int outlineVariant;
    private int primary;
    private int primaryContainer;
    private int scrim;
    private int secondary;
    private int secondaryContainer;
    private int shadow;
    private int surface;
    private int surfaceVariant;
    private int tertiary;
    private int tertiaryContainer;

    public Scheme(int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i34, int i35, int i36, int i37, int i38, int i39, int i44, int i45, int i46, int i47, int i48, int i49, int i54, int i55, int i56, int i57) {
        this.primary = i14;
        this.onPrimary = i15;
        this.primaryContainer = i16;
        this.onPrimaryContainer = i17;
        this.secondary = i18;
        this.onSecondary = i19;
        this.secondaryContainer = i24;
        this.onSecondaryContainer = i25;
        this.tertiary = i26;
        this.onTertiary = i27;
        this.tertiaryContainer = i28;
        this.onTertiaryContainer = i29;
        this.error = i30;
        this.onError = i34;
        this.errorContainer = i35;
        this.onErrorContainer = i36;
        this.background = i37;
        this.onBackground = i38;
        this.surface = i39;
        this.onSurface = i44;
        this.surfaceVariant = i45;
        this.onSurfaceVariant = i46;
        this.outline = i47;
        this.outlineVariant = i48;
        this.shadow = i49;
        this.scrim = i54;
        this.inverseSurface = i55;
        this.inverseOnSurface = i56;
        this.inversePrimary = i57;
    }

    public static Scheme dark(int i14) {
        return darkFromCorePalette(CorePalette.of(i14));
    }

    public static Scheme darkContent(int i14) {
        return darkFromCorePalette(CorePalette.contentOf(i14));
    }

    private static Scheme darkFromCorePalette(CorePalette corePalette) {
        return new Scheme().withPrimary(corePalette.f53178a1.tone(80)).withOnPrimary(corePalette.f53178a1.tone(20)).withPrimaryContainer(corePalette.f53178a1.tone(30)).withOnPrimaryContainer(corePalette.f53178a1.tone(90)).withSecondary(corePalette.f53179a2.tone(80)).withOnSecondary(corePalette.f53179a2.tone(20)).withSecondaryContainer(corePalette.f53179a2.tone(30)).withOnSecondaryContainer(corePalette.f53179a2.tone(90)).withTertiary(corePalette.f53180a3.tone(80)).withOnTertiary(corePalette.f53180a3.tone(20)).withTertiaryContainer(corePalette.f53180a3.tone(30)).withOnTertiaryContainer(corePalette.f53180a3.tone(90)).withError(corePalette.error.tone(80)).withOnError(corePalette.error.tone(20)).withErrorContainer(corePalette.error.tone(30)).withOnErrorContainer(corePalette.error.tone(80)).withBackground(corePalette.f53181n1.tone(10)).withOnBackground(corePalette.f53181n1.tone(90)).withSurface(corePalette.f53181n1.tone(10)).withOnSurface(corePalette.f53181n1.tone(90)).withSurfaceVariant(corePalette.f53182n2.tone(30)).withOnSurfaceVariant(corePalette.f53182n2.tone(80)).withOutline(corePalette.f53182n2.tone(60)).withOutlineVariant(corePalette.f53182n2.tone(30)).withShadow(corePalette.f53181n1.tone(0)).withScrim(corePalette.f53181n1.tone(0)).withInverseSurface(corePalette.f53181n1.tone(90)).withInverseOnSurface(corePalette.f53181n1.tone(20)).withInversePrimary(corePalette.f53178a1.tone(40));
    }

    public static Scheme light(int i14) {
        return lightFromCorePalette(CorePalette.of(i14));
    }

    public static Scheme lightContent(int i14) {
        return lightFromCorePalette(CorePalette.contentOf(i14));
    }

    private static Scheme lightFromCorePalette(CorePalette corePalette) {
        return new Scheme().withPrimary(corePalette.f53178a1.tone(40)).withOnPrimary(corePalette.f53178a1.tone(100)).withPrimaryContainer(corePalette.f53178a1.tone(90)).withOnPrimaryContainer(corePalette.f53178a1.tone(10)).withSecondary(corePalette.f53179a2.tone(40)).withOnSecondary(corePalette.f53179a2.tone(100)).withSecondaryContainer(corePalette.f53179a2.tone(90)).withOnSecondaryContainer(corePalette.f53179a2.tone(10)).withTertiary(corePalette.f53180a3.tone(40)).withOnTertiary(corePalette.f53180a3.tone(100)).withTertiaryContainer(corePalette.f53180a3.tone(90)).withOnTertiaryContainer(corePalette.f53180a3.tone(10)).withError(corePalette.error.tone(40)).withOnError(corePalette.error.tone(100)).withErrorContainer(corePalette.error.tone(90)).withOnErrorContainer(corePalette.error.tone(10)).withBackground(corePalette.f53181n1.tone(99)).withOnBackground(corePalette.f53181n1.tone(10)).withSurface(corePalette.f53181n1.tone(99)).withOnSurface(corePalette.f53181n1.tone(10)).withSurfaceVariant(corePalette.f53182n2.tone(90)).withOnSurfaceVariant(corePalette.f53182n2.tone(30)).withOutline(corePalette.f53182n2.tone(50)).withOutlineVariant(corePalette.f53182n2.tone(80)).withShadow(corePalette.f53181n1.tone(0)).withScrim(corePalette.f53181n1.tone(0)).withInverseSurface(corePalette.f53181n1.tone(20)).withInverseOnSurface(corePalette.f53181n1.tone(95)).withInversePrimary(corePalette.f53178a1.tone(80));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scheme) || !super.equals(obj)) {
            return false;
        }
        Scheme scheme = (Scheme) obj;
        return this.primary == scheme.primary && this.onPrimary == scheme.onPrimary && this.primaryContainer == scheme.primaryContainer && this.onPrimaryContainer == scheme.onPrimaryContainer && this.secondary == scheme.secondary && this.onSecondary == scheme.onSecondary && this.secondaryContainer == scheme.secondaryContainer && this.onSecondaryContainer == scheme.onSecondaryContainer && this.tertiary == scheme.tertiary && this.onTertiary == scheme.onTertiary && this.tertiaryContainer == scheme.tertiaryContainer && this.onTertiaryContainer == scheme.onTertiaryContainer && this.error == scheme.error && this.onError == scheme.onError && this.errorContainer == scheme.errorContainer && this.onErrorContainer == scheme.onErrorContainer && this.background == scheme.background && this.onBackground == scheme.onBackground && this.surface == scheme.surface && this.onSurface == scheme.onSurface && this.surfaceVariant == scheme.surfaceVariant && this.onSurfaceVariant == scheme.onSurfaceVariant && this.outline == scheme.outline && this.outlineVariant == scheme.outlineVariant && this.shadow == scheme.shadow && this.scrim == scheme.scrim && this.inverseSurface == scheme.inverseSurface && this.inverseOnSurface == scheme.inverseOnSurface && this.inversePrimary == scheme.inversePrimary;
    }

    public int getBackground() {
        return this.background;
    }

    public int getError() {
        return this.error;
    }

    public int getErrorContainer() {
        return this.errorContainer;
    }

    public int getInverseOnSurface() {
        return this.inverseOnSurface;
    }

    public int getInversePrimary() {
        return this.inversePrimary;
    }

    public int getInverseSurface() {
        return this.inverseSurface;
    }

    public int getOnBackground() {
        return this.onBackground;
    }

    public int getOnError() {
        return this.onError;
    }

    public int getOnErrorContainer() {
        return this.onErrorContainer;
    }

    public int getOnPrimary() {
        return this.onPrimary;
    }

    public int getOnPrimaryContainer() {
        return this.onPrimaryContainer;
    }

    public int getOnSecondary() {
        return this.onSecondary;
    }

    public int getOnSecondaryContainer() {
        return this.onSecondaryContainer;
    }

    public int getOnSurface() {
        return this.onSurface;
    }

    public int getOnSurfaceVariant() {
        return this.onSurfaceVariant;
    }

    public int getOnTertiary() {
        return this.onTertiary;
    }

    public int getOnTertiaryContainer() {
        return this.onTertiaryContainer;
    }

    public int getOutline() {
        return this.outline;
    }

    public int getOutlineVariant() {
        return this.outlineVariant;
    }

    public int getPrimary() {
        return this.primary;
    }

    public int getPrimaryContainer() {
        return this.primaryContainer;
    }

    public int getScrim() {
        return this.scrim;
    }

    public int getSecondary() {
        return this.secondary;
    }

    public int getSecondaryContainer() {
        return this.secondaryContainer;
    }

    public int getShadow() {
        return this.shadow;
    }

    public int getSurface() {
        return this.surface;
    }

    public int getSurfaceVariant() {
        return this.surfaceVariant;
    }

    public int getTertiary() {
        return this.tertiary;
    }

    public int getTertiaryContainer() {
        return this.tertiaryContainer;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((super.hashCode() * 31) + this.primary) * 31) + this.onPrimary) * 31) + this.primaryContainer) * 31) + this.onPrimaryContainer) * 31) + this.secondary) * 31) + this.onSecondary) * 31) + this.secondaryContainer) * 31) + this.onSecondaryContainer) * 31) + this.tertiary) * 31) + this.onTertiary) * 31) + this.tertiaryContainer) * 31) + this.onTertiaryContainer) * 31) + this.error) * 31) + this.onError) * 31) + this.errorContainer) * 31) + this.onErrorContainer) * 31) + this.background) * 31) + this.onBackground) * 31) + this.surface) * 31) + this.onSurface) * 31) + this.surfaceVariant) * 31) + this.onSurfaceVariant) * 31) + this.outline) * 31) + this.outlineVariant) * 31) + this.shadow) * 31) + this.scrim) * 31) + this.inverseSurface) * 31) + this.inverseOnSurface) * 31) + this.inversePrimary;
    }

    public void setBackground(int i14) {
        this.background = i14;
    }

    public void setError(int i14) {
        this.error = i14;
    }

    public void setErrorContainer(int i14) {
        this.errorContainer = i14;
    }

    public void setInverseOnSurface(int i14) {
        this.inverseOnSurface = i14;
    }

    public void setInversePrimary(int i14) {
        this.inversePrimary = i14;
    }

    public void setInverseSurface(int i14) {
        this.inverseSurface = i14;
    }

    public void setOnBackground(int i14) {
        this.onBackground = i14;
    }

    public void setOnError(int i14) {
        this.onError = i14;
    }

    public void setOnErrorContainer(int i14) {
        this.onErrorContainer = i14;
    }

    public void setOnPrimary(int i14) {
        this.onPrimary = i14;
    }

    public void setOnPrimaryContainer(int i14) {
        this.onPrimaryContainer = i14;
    }

    public void setOnSecondary(int i14) {
        this.onSecondary = i14;
    }

    public void setOnSecondaryContainer(int i14) {
        this.onSecondaryContainer = i14;
    }

    public void setOnSurface(int i14) {
        this.onSurface = i14;
    }

    public void setOnSurfaceVariant(int i14) {
        this.onSurfaceVariant = i14;
    }

    public void setOnTertiary(int i14) {
        this.onTertiary = i14;
    }

    public void setOnTertiaryContainer(int i14) {
        this.onTertiaryContainer = i14;
    }

    public void setOutline(int i14) {
        this.outline = i14;
    }

    public void setOutlineVariant(int i14) {
        this.outlineVariant = i14;
    }

    public void setPrimary(int i14) {
        this.primary = i14;
    }

    public void setPrimaryContainer(int i14) {
        this.primaryContainer = i14;
    }

    public void setScrim(int i14) {
        this.scrim = i14;
    }

    public void setSecondary(int i14) {
        this.secondary = i14;
    }

    public void setSecondaryContainer(int i14) {
        this.secondaryContainer = i14;
    }

    public void setShadow(int i14) {
        this.shadow = i14;
    }

    public void setSurface(int i14) {
        this.surface = i14;
    }

    public void setSurfaceVariant(int i14) {
        this.surfaceVariant = i14;
    }

    public void setTertiary(int i14) {
        this.tertiary = i14;
    }

    public void setTertiaryContainer(int i14) {
        this.tertiaryContainer = i14;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("Scheme{primary=");
        sb3.append(this.primary);
        sb3.append(", onPrimary=");
        sb3.append(this.onPrimary);
        sb3.append(", primaryContainer=");
        sb3.append(this.primaryContainer);
        sb3.append(", onPrimaryContainer=");
        sb3.append(this.onPrimaryContainer);
        sb3.append(", secondary=");
        sb3.append(this.secondary);
        sb3.append(", onSecondary=");
        sb3.append(this.onSecondary);
        sb3.append(", secondaryContainer=");
        sb3.append(this.secondaryContainer);
        sb3.append(", onSecondaryContainer=");
        sb3.append(this.onSecondaryContainer);
        sb3.append(", tertiary=");
        sb3.append(this.tertiary);
        sb3.append(", onTertiary=");
        sb3.append(this.onTertiary);
        sb3.append(", tertiaryContainer=");
        sb3.append(this.tertiaryContainer);
        sb3.append(", onTertiaryContainer=");
        sb3.append(this.onTertiaryContainer);
        sb3.append(", error=");
        sb3.append(this.error);
        sb3.append(", onError=");
        sb3.append(this.onError);
        sb3.append(", errorContainer=");
        sb3.append(this.errorContainer);
        sb3.append(", onErrorContainer=");
        sb3.append(this.onErrorContainer);
        sb3.append(", background=");
        sb3.append(this.background);
        sb3.append(", onBackground=");
        sb3.append(this.onBackground);
        sb3.append(", surface=");
        sb3.append(this.surface);
        sb3.append(", onSurface=");
        sb3.append(this.onSurface);
        sb3.append(", surfaceVariant=");
        sb3.append(this.surfaceVariant);
        sb3.append(", onSurfaceVariant=");
        sb3.append(this.onSurfaceVariant);
        sb3.append(", outline=");
        sb3.append(this.outline);
        sb3.append(", outlineVariant=");
        sb3.append(this.outlineVariant);
        sb3.append(", shadow=");
        sb3.append(this.shadow);
        sb3.append(", scrim=");
        sb3.append(this.scrim);
        sb3.append(", inverseSurface=");
        sb3.append(this.inverseSurface);
        sb3.append(", inverseOnSurface=");
        sb3.append(this.inverseOnSurface);
        sb3.append(", inversePrimary=");
        return e0.j(sb3, this.inversePrimary, CoreConstants.CURLY_RIGHT);
    }

    @CanIgnoreReturnValue
    public Scheme withBackground(int i14) {
        this.background = i14;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withError(int i14) {
        this.error = i14;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withErrorContainer(int i14) {
        this.errorContainer = i14;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withInverseOnSurface(int i14) {
        this.inverseOnSurface = i14;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withInversePrimary(int i14) {
        this.inversePrimary = i14;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withInverseSurface(int i14) {
        this.inverseSurface = i14;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnBackground(int i14) {
        this.onBackground = i14;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnError(int i14) {
        this.onError = i14;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnErrorContainer(int i14) {
        this.onErrorContainer = i14;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnPrimary(int i14) {
        this.onPrimary = i14;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnPrimaryContainer(int i14) {
        this.onPrimaryContainer = i14;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnSecondary(int i14) {
        this.onSecondary = i14;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnSecondaryContainer(int i14) {
        this.onSecondaryContainer = i14;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnSurface(int i14) {
        this.onSurface = i14;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnSurfaceVariant(int i14) {
        this.onSurfaceVariant = i14;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnTertiary(int i14) {
        this.onTertiary = i14;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnTertiaryContainer(int i14) {
        this.onTertiaryContainer = i14;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOutline(int i14) {
        this.outline = i14;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOutlineVariant(int i14) {
        this.outlineVariant = i14;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withPrimary(int i14) {
        this.primary = i14;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withPrimaryContainer(int i14) {
        this.primaryContainer = i14;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withScrim(int i14) {
        this.scrim = i14;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withSecondary(int i14) {
        this.secondary = i14;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withSecondaryContainer(int i14) {
        this.secondaryContainer = i14;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withShadow(int i14) {
        this.shadow = i14;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withSurface(int i14) {
        this.surface = i14;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withSurfaceVariant(int i14) {
        this.surfaceVariant = i14;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withTertiary(int i14) {
        this.tertiary = i14;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withTertiaryContainer(int i14) {
        this.tertiaryContainer = i14;
        return this;
    }

    public Scheme() {
    }
}
