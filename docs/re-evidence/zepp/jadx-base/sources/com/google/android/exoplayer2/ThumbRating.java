package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.ThumbRating;
import com.google.android.exoplayer2.util.Assertions;
import com.google.common.base.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ThumbRating extends Rating {
    public static final Bundleable.Creator<ThumbRating> CREATOR = new Bundleable.Creator() { // from class: ko7
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return ThumbRating.e(bundle);
        }
    };
    private static final int i = 3;
    private static final int j = 1;
    private static final int k = 2;
    private final boolean g;
    private final boolean h;

    public ThumbRating() {
        this.g = false;
        this.h = false;
    }

    private static String c(int field) {
        return Integer.toString(field, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ThumbRating e(Bundle bundle) {
        Assertions.checkArgument(bundle.getInt(c(0), -1) == 3);
        return bundle.getBoolean(c(1), false) ? new ThumbRating(bundle.getBoolean(c(2), false)) : new ThumbRating();
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof ThumbRating)) {
            return false;
        }
        ThumbRating thumbRating = (ThumbRating) obj;
        return this.h == thumbRating.h && this.g == thumbRating.g;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.g), Boolean.valueOf(this.h));
    }

    @Override // com.google.android.exoplayer2.Rating
    public boolean isRated() {
        return this.g;
    }

    public boolean isThumbsUp() {
        return this.h;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(c(0), 3);
        bundle.putBoolean(c(1), this.g);
        bundle.putBoolean(c(2), this.h);
        return bundle;
    }

    public ThumbRating(boolean isThumbsUp) {
        this.g = true;
        this.h = isThumbsUp;
    }
}
