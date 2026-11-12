package android.support.v4.media;

import android.annotation.SuppressLint;
import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new Parcelable.Creator<RatingCompat>() { // from class: android.support.v4.media.RatingCompat.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RatingCompat[] newArray(int i14) {
            return new RatingCompat[i14];
        }
    };
    public static final int RATING_3_STARS = 3;
    public static final int RATING_4_STARS = 4;
    public static final int RATING_5_STARS = 5;
    public static final int RATING_HEART = 1;
    public static final int RATING_NONE = 0;
    private static final float RATING_NOT_RATED = -1.0f;
    public static final int RATING_PERCENTAGE = 6;
    public static final int RATING_THUMB_UP_DOWN = 2;
    private static final String TAG = "Rating";
    private Object mRatingObj;
    private final int mRatingStyle;
    private final float mRatingValue;

    public static class Api19Impl {
        private Api19Impl() {
        }

        public static float getPercentRating(Rating rating) {
            return rating.getPercentRating();
        }

        public static int getRatingStyle(Rating rating) {
            return rating.getRatingStyle();
        }

        public static float getStarRating(Rating rating) {
            return rating.getStarRating();
        }

        public static boolean hasHeart(Rating rating) {
            return rating.hasHeart();
        }

        public static boolean isRated(Rating rating) {
            return rating.isRated();
        }

        public static boolean isThumbUp(Rating rating) {
            return rating.isThumbUp();
        }

        public static Rating newHeartRating(boolean z14) {
            return Rating.newHeartRating(z14);
        }

        public static Rating newPercentageRating(float f14) {
            return Rating.newPercentageRating(f14);
        }

        public static Rating newStarRating(int i14, float f14) {
            return Rating.newStarRating(i14, f14);
        }

        public static Rating newThumbRating(boolean z14) {
            return Rating.newThumbRating(z14);
        }

        public static Rating newUnratedRating(int i14) {
            return Rating.newUnratedRating(i14);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface StarStyle {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Style {
    }

    public RatingCompat(int i14, float f14) {
        this.mRatingStyle = i14;
        this.mRatingValue = f14;
    }

    public static RatingCompat fromRating(Object obj) {
        RatingCompat ratingCompatNewUnratedRating = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int ratingStyle = Api19Impl.getRatingStyle(rating);
            if (Api19Impl.isRated(rating)) {
                switch (ratingStyle) {
                    case 1:
                        ratingCompatNewUnratedRating = newHeartRating(Api19Impl.hasHeart(rating));
                        break;
                    case 2:
                        ratingCompatNewUnratedRating = newThumbRating(Api19Impl.isThumbUp(rating));
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompatNewUnratedRating = newStarRating(ratingStyle, Api19Impl.getStarRating(rating));
                        break;
                    case 6:
                        ratingCompatNewUnratedRating = newPercentageRating(Api19Impl.getPercentRating(rating));
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompatNewUnratedRating = newUnratedRating(ratingStyle);
            }
            ratingCompatNewUnratedRating.mRatingObj = obj;
        }
        return ratingCompatNewUnratedRating;
    }

    public static RatingCompat newHeartRating(boolean z14) {
        return new RatingCompat(1, z14 ? 1.0f : 0.0f);
    }

    public static RatingCompat newPercentageRating(float f14) {
        if (f14 < 0.0f || f14 > 100.0f) {
            return null;
        }
        return new RatingCompat(6, f14);
    }

    public static RatingCompat newStarRating(int i14, float f14) {
        float f15;
        if (i14 == 3) {
            f15 = 3.0f;
        } else if (i14 == 4) {
            f15 = 4.0f;
        } else {
            if (i14 != 5) {
                return null;
            }
            f15 = 5.0f;
        }
        if (f14 < 0.0f || f14 > f15) {
            return null;
        }
        return new RatingCompat(i14, f14);
    }

    public static RatingCompat newThumbRating(boolean z14) {
        return new RatingCompat(2, z14 ? 1.0f : 0.0f);
    }

    public static RatingCompat newUnratedRating(int i14) {
        switch (i14) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i14, -1.0f);
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.mRatingStyle;
    }

    public float getPercentRating() {
        if (this.mRatingStyle == 6 && isRated()) {
            return this.mRatingValue;
        }
        return -1.0f;
    }

    public Object getRating() {
        if (this.mRatingObj == null) {
            boolean zIsRated = isRated();
            int i14 = this.mRatingStyle;
            if (zIsRated) {
                switch (i14) {
                    case 1:
                        this.mRatingObj = Api19Impl.newHeartRating(hasHeart());
                        break;
                    case 2:
                        this.mRatingObj = Api19Impl.newThumbRating(isThumbUp());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        this.mRatingObj = Api19Impl.newStarRating(i14, getStarRating());
                        break;
                    case 6:
                        this.mRatingObj = Api19Impl.newPercentageRating(getPercentRating());
                        break;
                    default:
                        return null;
                }
            } else {
                this.mRatingObj = Api19Impl.newUnratedRating(i14);
            }
        }
        return this.mRatingObj;
    }

    public int getRatingStyle() {
        return this.mRatingStyle;
    }

    public float getStarRating() {
        int i14 = this.mRatingStyle;
        if ((i14 == 3 || i14 == 4 || i14 == 5) && isRated()) {
            return this.mRatingValue;
        }
        return -1.0f;
    }

    public boolean hasHeart() {
        return this.mRatingStyle == 1 && this.mRatingValue == 1.0f;
    }

    public boolean isRated() {
        return this.mRatingValue >= 0.0f;
    }

    public boolean isThumbUp() {
        return this.mRatingStyle == 2 && this.mRatingValue == 1.0f;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("Rating:style=");
        sb3.append(this.mRatingStyle);
        sb3.append(" rating=");
        float f14 = this.mRatingValue;
        sb3.append(f14 < 0.0f ? "unrated" : String.valueOf(f14));
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(this.mRatingStyle);
        parcel.writeFloat(this.mRatingValue);
    }
}
