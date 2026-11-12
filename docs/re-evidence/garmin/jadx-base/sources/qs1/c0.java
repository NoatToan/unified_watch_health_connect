package qs1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0015R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u0015¨\u0006\u001e"}, d2 = {"Lqs1/c0;", "Landroid/os/Parcelable;", "", "profileName", "profileImageMedium", "", "reviewCount", "", "reviewAvgRating", "tripReportHelpfulCount", "photoHelpfulCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Number;II)V", "a", "Ljava/lang/String;", "getProfileName", "()Ljava/lang/String;", "b", "getProfileImageMedium", "c", "I", "()I", "d", "Ljava/lang/Number;", "getReviewAvgRating", "()Ljava/lang/Number;", JWKParameterNames.RSA_EXPONENT, "getTripReportHelpfulCount", "f", "getPhotoHelpfulCount", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c0 implements Parcelable {
    public static final Parcelable.Creator<c0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileName")
    private final String profileName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageMedium")
    private final String profileImageMedium;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("reviewCount")
    private final int reviewCount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("reviewAvgRating")
    private final Number reviewAvgRating;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tripReportHelpfulCount")
    private final int tripReportHelpfulCount;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("photoHelpfulCount")
    private final int photoHelpfulCount;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c0> {
        @Override // android.os.Parcelable.Creator
        public final c0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c0(parcel.readString(), parcel.readString(), parcel.readInt(), (Number) parcel.readSerializable(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final c0[] newArray(int i14) {
            return new c0[i14];
        }
    }

    public /* synthetic */ c0(String str, String str2, int i14, Number number, int i15, int i16, int i17, p005kotlin.jvm.internal.j jVar) {
        this((i17 & 1) != 0 ? null : str, (i17 & 2) != 0 ? null : str2, i14, number, i15, i16);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getReviewCount() {
        return this.reviewCount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return p005kotlin.jvm.internal.s.g(this.profileName, c0Var.profileName) && p005kotlin.jvm.internal.s.g(this.profileImageMedium, c0Var.profileImageMedium) && this.reviewCount == c0Var.reviewCount && p005kotlin.jvm.internal.s.g(this.reviewAvgRating, c0Var.reviewAvgRating) && this.tripReportHelpfulCount == c0Var.tripReportHelpfulCount && this.photoHelpfulCount == c0Var.photoHelpfulCount;
    }

    public final int hashCode() {
        String str = this.profileName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.profileImageMedium;
        return Integer.hashCode(this.photoHelpfulCount) + q2.d(this.tripReportHelpfulCount, (this.reviewAvgRating.hashCode() + q2.d(this.reviewCount, (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        String str = this.profileName;
        String str2 = this.profileImageMedium;
        int i14 = this.reviewCount;
        Number number = this.reviewAvgRating;
        int i15 = this.tripReportHelpfulCount;
        int i16 = this.photoHelpfulCount;
        StringBuilder sbI = p6.b.i("UserTripReportStatsDTO(profileName=", str, ", profileImageMedium=", str2, ", reviewCount=");
        sbI.append(i14);
        sbI.append(", reviewAvgRating=");
        sbI.append(number);
        sbI.append(", tripReportHelpfulCount=");
        return androidx.core.view.j.e(i15, i16, ", photoHelpfulCount=", ")", sbI);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.profileName);
        parcel.writeString(this.profileImageMedium);
        parcel.writeInt(this.reviewCount);
        parcel.writeSerializable(this.reviewAvgRating);
        parcel.writeInt(this.tripReportHelpfulCount);
        parcel.writeInt(this.photoHelpfulCount);
    }

    public c0(String str, String str2, int i14, Number number, int i15, int i16) {
        number.getClass();
        this.profileName = str;
        this.profileImageMedium = str2;
        this.reviewCount = i14;
        this.reviewAvgRating = number;
        this.tripReportHelpfulCount = i15;
        this.photoHelpfulCount = i16;
    }
}
