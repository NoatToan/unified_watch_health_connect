package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.HeartRating;
import com.google.android.exoplayer2.util.Assertions;
import com.google.common.base.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class HeartRating extends Rating {
    public static final Bundleable.Creator<HeartRating> CREATOR = new Bundleable.Creator() { // from class: n04
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return HeartRating.e(bundle);
        }
    };
    private static final int i = 0;
    private static final int j = 1;
    private static final int k = 2;
    private final boolean g;
    private final boolean h;

    public HeartRating() {
        this.g = false;
        this.h = false;
    }

    private static String c(int field) {
        return Integer.toString(field, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HeartRating e(Bundle bundle) {
        Assertions.checkArgument(bundle.getInt(c(0), -1) == 0);
        return bundle.getBoolean(c(1), false) ? new HeartRating(bundle.getBoolean(c(2), false)) : new HeartRating();
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof HeartRating)) {
            return false;
        }
        HeartRating heartRating = (HeartRating) obj;
        return this.h == heartRating.h && this.g == heartRating.g;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.g), Boolean.valueOf(this.h));
    }

    public boolean isHeart() {
        return this.h;
    }

    @Override // com.google.android.exoplayer2.Rating
    public boolean isRated() {
        return this.g;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(c(0), 0);
        bundle.putBoolean(c(1), this.g);
        bundle.putBoolean(c(2), this.h);
        return bundle;
    }

    public HeartRating(boolean isHeart) {
        this.g = true;
        this.h = isHeart;
    }
}
