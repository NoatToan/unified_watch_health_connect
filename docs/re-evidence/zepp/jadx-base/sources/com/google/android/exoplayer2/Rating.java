package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.Rating;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Rating implements Bundleable {
    public static final Bundleable.Creator<Rating> CREATOR = new Bundleable.Creator() { // from class: w66
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return Rating.b(bundle);
        }
    };
    public static final float RATING_UNSET = -1.0f;
    public static final int a = -1;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public static Rating b(Bundle bundle) {
        int i = bundle.getInt(c(0), -1);
        if (i == 0) {
            return (Rating) HeartRating.CREATOR.fromBundle(bundle);
        }
        if (i == 1) {
            return (Rating) PercentageRating.CREATOR.fromBundle(bundle);
        }
        if (i == 2) {
            return (Rating) StarRating.CREATOR.fromBundle(bundle);
        }
        if (i == 3) {
            return (Rating) ThumbRating.CREATOR.fromBundle(bundle);
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Encountered unknown rating type: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    private static String c(int field) {
        return Integer.toString(field, 36);
    }

    public abstract boolean isRated();
}
