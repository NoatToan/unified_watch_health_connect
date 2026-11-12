package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.util.Assertions;
import com.google.common.base.Objects;

/* JADX INFO: loaded from: classes13.dex */
public final class PercentageRating extends Rating {
    public static final Bundleable.Creator<PercentageRating> CREATOR = new v(15);
    private static final int FIELD_PERCENT = 1;
    private static final int TYPE = 1;
    private final float percent;

    public PercentageRating(float f14) {
        Assertions.checkArgument(f14 >= 0.0f && f14 <= 100.0f, "percent must be in the range of [0, 100]");
        this.percent = f14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static PercentageRating fromBundle(Bundle bundle) {
        Assertions.checkArgument(bundle.getInt(keyForField(0), -1) == 1);
        float f14 = bundle.getFloat(keyForField(1), -1.0f);
        return f14 == -1.0f ? new PercentageRating() : new PercentageRating(f14);
    }

    private static String keyForField(int i14) {
        return Integer.toString(i14, 36);
    }

    public boolean equals(Object obj) {
        return (obj instanceof PercentageRating) && this.percent == ((PercentageRating) obj).percent;
    }

    public float getPercent() {
        return this.percent;
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.percent));
    }

    @Override // com.google.android.exoplayer2.Rating
    public boolean isRated() {
        return this.percent != -1.0f;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(keyForField(0), 1);
        bundle.putFloat(keyForField(1), this.percent);
        return bundle;
    }

    public PercentageRating() {
        this.percent = -1.0f;
    }
}
