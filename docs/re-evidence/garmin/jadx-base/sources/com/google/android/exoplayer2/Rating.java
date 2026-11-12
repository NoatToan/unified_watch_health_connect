package com.google.android.exoplayer2;

import android.os.Bundle;

/* JADX INFO: loaded from: classes13.dex */
public abstract class Rating implements Bundleable {
    public static final Bundleable.Creator<Rating> CREATOR = new v(20);
    static final int FIELD_RATING_TYPE = 0;
    static final int RATING_TYPE_HEART = 0;
    static final int RATING_TYPE_PERCENTAGE = 1;
    static final int RATING_TYPE_STAR = 2;
    static final int RATING_TYPE_THUMB = 3;
    static final int RATING_TYPE_UNSET = -1;
    public static final float RATING_UNSET = -1.0f;

    /* JADX INFO: Access modifiers changed from: private */
    public static Rating fromBundle(Bundle bundle) {
        int i14 = bundle.getInt(keyForField(0), -1);
        if (i14 == 0) {
            return (Rating) HeartRating.CREATOR.fromBundle(bundle);
        }
        if (i14 == 1) {
            return (Rating) PercentageRating.CREATOR.fromBundle(bundle);
        }
        if (i14 == 2) {
            return (Rating) StarRating.CREATOR.fromBundle(bundle);
        }
        if (i14 == 3) {
            return (Rating) ThumbRating.CREATOR.fromBundle(bundle);
        }
        vb.h.s(v.b(31, i14, "Unknown RatingType: "));
        return null;
    }

    private static String keyForField(int i14) {
        return Integer.toString(i14, 36);
    }

    public abstract boolean isRated();
}
