package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.PercentageRating;
import com.google.android.exoplayer2.util.Assertions;
import com.google.common.base.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class PercentageRating extends Rating {
    public static final Bundleable.Creator<PercentageRating> CREATOR = new Bundleable.Creator() { // from class: ws5
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return PercentageRating.e(bundle);
        }
    };
    private static final int h = 1;
    private static final int i = 1;
    private final float g;

    public PercentageRating() {
        this.g = -1.0f;
    }

    private static String c(int field) {
        return Integer.toString(field, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static PercentageRating e(Bundle bundle) {
        Assertions.checkArgument(bundle.getInt(c(0), -1) == 1);
        float f = bundle.getFloat(c(1), -1.0f);
        return f == -1.0f ? new PercentageRating() : new PercentageRating(f);
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof PercentageRating) && this.g == ((PercentageRating) obj).g;
    }

    public float getPercent() {
        return this.g;
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.g));
    }

    @Override // com.google.android.exoplayer2.Rating
    public boolean isRated() {
        return this.g != -1.0f;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(c(0), 1);
        bundle.putFloat(c(1), this.g);
        return bundle;
    }

    public PercentageRating(@FloatRange(from = 0.0d, to = TextSelectionMouseDetectorKt.ClicksSlop) float percent) {
        Assertions.checkArgument(percent >= 0.0f && percent <= 100.0f, "percent must be in the range of [0, 100]");
        this.g = percent;
    }
}
