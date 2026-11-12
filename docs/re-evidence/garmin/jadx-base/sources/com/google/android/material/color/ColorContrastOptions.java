package com.google.android.material.color;

import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes14.dex */
public class ColorContrastOptions {
    private final int highContrastThemeOverlayResourceId;
    private final int mediumContrastThemeOverlayResourceId;

    public static class Builder {
        private int highContrastThemeOverlayResourceId;
        private int mediumContrastThemeOverlayResourceId;

        public ColorContrastOptions build() {
            return new ColorContrastOptions(this);
        }

        @CanIgnoreReturnValue
        public Builder setHighContrastThemeOverlay(int i14) {
            this.highContrastThemeOverlayResourceId = i14;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMediumContrastThemeOverlay(int i14) {
            this.mediumContrastThemeOverlayResourceId = i14;
            return this;
        }
    }

    private ColorContrastOptions(Builder builder) {
        this.mediumContrastThemeOverlayResourceId = builder.mediumContrastThemeOverlayResourceId;
        this.highContrastThemeOverlayResourceId = builder.highContrastThemeOverlayResourceId;
    }

    public int getHighContrastThemeOverlay() {
        return this.highContrastThemeOverlayResourceId;
    }

    public int getMediumContrastThemeOverlay() {
        return this.mediumContrastThemeOverlayResourceId;
    }
}
