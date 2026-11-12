package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.StarRating;
import com.google.android.exoplayer2.util.Assertions;
import com.google.common.base.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class StarRating extends Rating {
    public static final Bundleable.Creator<StarRating> CREATOR = new Bundleable.Creator() { // from class: ne7
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return StarRating.e(bundle);
        }
    };
    private static final int i = 2;
    private static final int j = 5;
    private static final int k = 1;
    private static final int l = 2;

    @IntRange(from = 1)
    private final int g;
    private final float h;

    public StarRating(@IntRange(from = 1) int maxStars) {
        Assertions.checkArgument(maxStars > 0, "maxStars must be a positive integer");
        this.g = maxStars;
        this.h = -1.0f;
    }

    private static String c(int field) {
        return Integer.toString(field, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static StarRating e(Bundle bundle) {
        Assertions.checkArgument(bundle.getInt(c(0), -1) == 2);
        int i2 = bundle.getInt(c(1), 5);
        float f = bundle.getFloat(c(2), -1.0f);
        return f == -1.0f ? new StarRating(i2) : new StarRating(i2, f);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof StarRating)) {
            return false;
        }
        StarRating starRating = (StarRating) obj;
        return this.g == starRating.g && this.h == starRating.h;
    }

    @IntRange(from = 1)
    public int getMaxStars() {
        return this.g;
    }

    public float getStarRating() {
        return this.h;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.g), Float.valueOf(this.h));
    }

    @Override // com.google.android.exoplayer2.Rating
    public boolean isRated() {
        return this.h != -1.0f;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(c(0), 2);
        bundle.putInt(c(1), this.g);
        bundle.putFloat(c(2), this.h);
        return bundle;
    }

    public StarRating(@IntRange(from = 1) int maxStars, @FloatRange(from = 0.0d) float starRating) {
        Assertions.checkArgument(maxStars > 0, "maxStars must be a positive integer");
        Assertions.checkArgument(starRating >= 0.0f && starRating <= ((float) maxStars), "starRating is out of range [0, maxStars]");
        this.g = maxStars;
        this.h = starRating;
    }
}
