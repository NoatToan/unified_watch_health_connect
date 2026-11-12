package android.support.v4.media;

import android.annotation.SuppressLint;
import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
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
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    };
    public static final int RATING_3_STARS = 3;
    public static final int RATING_4_STARS = 4;
    public static final int RATING_5_STARS = 5;
    public static final int RATING_HEART = 1;
    public static final int RATING_NONE = 0;
    public static final int RATING_PERCENTAGE = 6;
    public static final int RATING_THUMB_UP_DOWN = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1300b;
    public Object c;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface StarStyle {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface Style {
    }

    public RatingCompat(int i, float f) {
        this.f1299a = i;
        this.f1300b = f;
    }

    public static RatingCompat fromRating(Object obj) {
        RatingCompat ratingCompatNewUnratedRating = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int ratingStyle = rating.getRatingStyle();
            if (rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                        ratingCompatNewUnratedRating = newHeartRating(rating.hasHeart());
                        break;
                    case 2:
                        ratingCompatNewUnratedRating = newThumbRating(rating.isThumbUp());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompatNewUnratedRating = newStarRating(ratingStyle, rating.getStarRating());
                        break;
                    case 6:
                        ratingCompatNewUnratedRating = newPercentageRating(rating.getPercentRating());
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompatNewUnratedRating = newUnratedRating(ratingStyle);
            }
            ratingCompatNewUnratedRating.c = obj;
        }
        return ratingCompatNewUnratedRating;
    }

    public static RatingCompat newHeartRating(boolean z) {
        return new RatingCompat(1, z ? 1.0f : 0.0f);
    }

    public static RatingCompat newPercentageRating(float f) {
        if (f < 0.0f || f > 100.0f) {
            return null;
        }
        return new RatingCompat(6, f);
    }

    public static RatingCompat newStarRating(int i, float f) {
        float f2;
        if (i == 3) {
            f2 = 3.0f;
        } else if (i == 4) {
            f2 = 4.0f;
        } else {
            if (i != 5) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid rating style (");
                sb.append(i);
                sb.append(") for a star rating");
                return null;
            }
            f2 = 5.0f;
        }
        if (f < 0.0f || f > f2) {
            return null;
        }
        return new RatingCompat(i, f);
    }

    public static RatingCompat newThumbRating(boolean z) {
        return new RatingCompat(2, z ? 1.0f : 0.0f);
    }

    public static RatingCompat newUnratedRating(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i, -1.0f);
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f1299a;
    }

    public float getPercentRating() {
        if (this.f1299a == 6 && isRated()) {
            return this.f1300b;
        }
        return -1.0f;
    }

    public Object getRating() {
        if (this.c == null) {
            if (isRated()) {
                int i = this.f1299a;
                switch (i) {
                    case 1:
                        this.c = Rating.newHeartRating(hasHeart());
                        break;
                    case 2:
                        this.c = Rating.newThumbRating(isThumbUp());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        this.c = Rating.newStarRating(i, getStarRating());
                        break;
                    case 6:
                        this.c = Rating.newPercentageRating(getPercentRating());
                        break;
                    default:
                        return null;
                }
            } else {
                this.c = Rating.newUnratedRating(this.f1299a);
            }
        }
        return this.c;
    }

    public int getRatingStyle() {
        return this.f1299a;
    }

    public float getStarRating() {
        int i = this.f1299a;
        if ((i == 3 || i == 4 || i == 5) && isRated()) {
            return this.f1300b;
        }
        return -1.0f;
    }

    public boolean hasHeart() {
        return this.f1299a == 1 && this.f1300b == 1.0f;
    }

    public boolean isRated() {
        return this.f1300b >= 0.0f;
    }

    public boolean isThumbUp() {
        return this.f1299a == 2 && this.f1300b == 1.0f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f1299a);
        sb.append(" rating=");
        float f = this.f1300b;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1299a);
        parcel.writeFloat(this.f1300b);
    }
}
