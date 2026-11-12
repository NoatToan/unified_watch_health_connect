package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.util.Assertions;
import com.google.common.base.Objects;

/* JADX INFO: loaded from: classes13.dex */
public final class StarRating extends Rating {
    public static final Bundleable.Creator<StarRating> CREATOR = new v(22);
    private static final int FIELD_MAX_STARS = 1;
    private static final int FIELD_STAR_RATING = 2;
    private static final int MAX_STARS_DEFAULT = 5;
    private static final int TYPE = 2;
    private final int maxStars;
    private final float starRating;

    public StarRating(int i14, float f14) {
        boolean z14 = false;
        Assertions.checkArgument(i14 > 0, "maxStars must be a positive integer");
        if (f14 >= 0.0f && f14 <= i14) {
            z14 = true;
        }
        Assertions.checkArgument(z14, "starRating is out of range [0, maxStars]");
        this.maxStars = i14;
        this.starRating = f14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static StarRating fromBundle(Bundle bundle) {
        Assertions.checkArgument(bundle.getInt(keyForField(0), -1) == 2);
        int i14 = bundle.getInt(keyForField(1), 5);
        float f14 = bundle.getFloat(keyForField(2), -1.0f);
        return f14 == -1.0f ? new StarRating(i14) : new StarRating(i14, f14);
    }

    private static String keyForField(int i14) {
        return Integer.toString(i14, 36);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StarRating)) {
            return false;
        }
        StarRating starRating = (StarRating) obj;
        return this.maxStars == starRating.maxStars && this.starRating == starRating.starRating;
    }

    public int getMaxStars() {
        return this.maxStars;
    }

    public float getStarRating() {
        return this.starRating;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.maxStars), Float.valueOf(this.starRating));
    }

    @Override // com.google.android.exoplayer2.Rating
    public boolean isRated() {
        return this.starRating != -1.0f;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(keyForField(0), 2);
        bundle.putInt(keyForField(1), this.maxStars);
        bundle.putFloat(keyForField(2), this.starRating);
        return bundle;
    }

    public StarRating(int i14) {
        Assertions.checkArgument(i14 > 0, "maxStars must be a positive integer");
        this.maxStars = i14;
        this.starRating = -1.0f;
    }
}
