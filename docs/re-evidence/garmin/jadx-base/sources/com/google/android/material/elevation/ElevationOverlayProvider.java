package com.google.android.material.elevation;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import c7.d;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialAttributes;

/* JADX INFO: loaded from: classes14.dex */
public class ElevationOverlayProvider {
    private static final float FORMULA_MULTIPLIER = 4.5f;
    private static final float FORMULA_OFFSET = 2.0f;
    private static final int OVERLAY_ACCENT_COLOR_ALPHA = (int) Math.round(5.1000000000000005d);
    private final int colorSurface;
    private final float displayDensity;
    private final int elevationOverlayAccentColor;
    private final int elevationOverlayColor;
    private final boolean elevationOverlayEnabled;

    public ElevationOverlayProvider(Context context) {
        this(MaterialAttributes.resolveBoolean(context, R.attr.elevationOverlayEnabled, false), MaterialColors.getColor(context, R.attr.elevationOverlayColor, 0), MaterialColors.getColor(context, R.attr.elevationOverlayAccentColor, 0), MaterialColors.getColor(context, R.attr.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean isThemeSurfaceColor(int i14) {
        return d.e(i14, 255) == this.colorSurface;
    }

    public int calculateOverlayAlpha(float f14) {
        return Math.round(calculateOverlayAlphaFraction(f14) * 255.0f);
    }

    public float calculateOverlayAlphaFraction(float f14) {
        float f15 = this.displayDensity;
        if (f15 <= 0.0f || f14 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f14 / f15)) * FORMULA_MULTIPLIER) + FORMULA_OFFSET) / 100.0f, 1.0f);
    }

    public int compositeOverlay(int i14, float f14) {
        int i15;
        float fCalculateOverlayAlphaFraction = calculateOverlayAlphaFraction(f14);
        int iAlpha = Color.alpha(i14);
        int iLayer = MaterialColors.layer(d.e(i14, 255), this.elevationOverlayColor, fCalculateOverlayAlphaFraction);
        if (fCalculateOverlayAlphaFraction > 0.0f && (i15 = this.elevationOverlayAccentColor) != 0) {
            iLayer = MaterialColors.layer(iLayer, d.e(i15, OVERLAY_ACCENT_COLOR_ALPHA));
        }
        return d.e(iLayer, iAlpha);
    }

    public int compositeOverlayIfNeeded(int i14, float f14) {
        return (this.elevationOverlayEnabled && isThemeSurfaceColor(i14)) ? compositeOverlay(i14, f14) : i14;
    }

    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f14, View view2) {
        return compositeOverlayWithThemeSurfaceColorIfNeeded(getParentAbsoluteElevation(view2) + f14);
    }

    public float getParentAbsoluteElevation(View view2) {
        return ViewUtils.getParentAbsoluteElevation(view2);
    }

    public int getThemeElevationOverlayColor() {
        return this.elevationOverlayColor;
    }

    public int getThemeSurfaceColor() {
        return this.colorSurface;
    }

    public boolean isThemeElevationOverlayEnabled() {
        return this.elevationOverlayEnabled;
    }

    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f14) {
        return compositeOverlayIfNeeded(this.colorSurface, f14);
    }

    public int compositeOverlayIfNeeded(int i14, float f14, View view2) {
        return compositeOverlayIfNeeded(i14, getParentAbsoluteElevation(view2) + f14);
    }

    public ElevationOverlayProvider(boolean z14, int i14, int i15, int i16, float f14) {
        this.elevationOverlayEnabled = z14;
        this.elevationOverlayColor = i14;
        this.elevationOverlayAccentColor = i15;
        this.colorSurface = i16;
        this.displayDensity = f14;
    }

    public int compositeOverlay(int i14, float f14, View view2) {
        return compositeOverlay(i14, getParentAbsoluteElevation(view2) + f14);
    }
}
