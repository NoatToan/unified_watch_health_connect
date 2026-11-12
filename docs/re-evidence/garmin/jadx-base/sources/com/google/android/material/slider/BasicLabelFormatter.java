package com.google.android.material.slider;

import java.util.Locale;

/* JADX INFO: loaded from: classes14.dex */
public final class BasicLabelFormatter implements LabelFormatter {
    private static final int BILLION = 1000000000;
    private static final int MILLION = 1000000;
    private static final int THOUSAND = 1000;
    private static final long TRILLION = 1000000000000L;

    @Override // com.google.android.material.slider.LabelFormatter
    public String getFormattedValue(float f14) {
        if (f14 >= 1.0E12f) {
            return String.format(Locale.US, "%.1fT", Float.valueOf(f14 / 1.0E12f));
        }
        if (f14 >= 1.0E9f) {
            return String.format(Locale.US, "%.1fB", Float.valueOf(f14 / 1.0E9f));
        }
        if (f14 >= 1000000.0f) {
            return String.format(Locale.US, "%.1fM", Float.valueOf(f14 / 1000000.0f));
        }
        return f14 >= 1000.0f ? String.format(Locale.US, "%.1fK", Float.valueOf(f14 / 1000.0f)) : String.format(Locale.US, "%.0f", Float.valueOf(f14));
    }
}
