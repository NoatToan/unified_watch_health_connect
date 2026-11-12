package ps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lps/a2;", "Landroid/os/Parcelable;", "", "displayName", "fullName", "profileImageUrlLarge", "profileImageUrlMedium", "profileImageUrlSmall", "", "userProfilePk", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "a", "Ljava/lang/String;", "getDisplayName", "()Ljava/lang/String;", "b", "c", "d", "f", JWKParameterNames.RSA_EXPONENT, "g", "Ljava/lang/Long;", "h", "()Ljava/lang/Long;", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a2 implements Parcelable {
    public static final Parcelable.Creator<a2> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayname")
    private final String displayName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fullname")
    private final String fullName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageUrlLarge")
    private final String profileImageUrlLarge;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageUrlMedium")
    private final String profileImageUrlMedium;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageUrlSmall")
    private final String profileImageUrlSmall;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePk")
    private final Long userProfilePk;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<a2> {
        @Override // android.os.Parcelable.Creator
        public final a2 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a2(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final a2[] newArray(int i14) {
            return new a2[i14];
        }
    }

    public /* synthetic */ a2(String str, String str2, String str3, String str4, String str5, Long l14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : str5, (i14 & 32) != 0 ? null : l14);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getProfileImageUrlLarge() {
        return this.profileImageUrlLarge;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return p005kotlin.jvm.internal.s.g(this.displayName, a2Var.displayName) && p005kotlin.jvm.internal.s.g(this.fullName, a2Var.fullName) && p005kotlin.jvm.internal.s.g(this.profileImageUrlLarge, a2Var.profileImageUrlLarge) && p005kotlin.jvm.internal.s.g(this.profileImageUrlMedium, a2Var.profileImageUrlMedium) && p005kotlin.jvm.internal.s.g(this.profileImageUrlSmall, a2Var.profileImageUrlSmall) && p005kotlin.jvm.internal.s.g(this.userProfilePk, a2Var.userProfilePk);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getProfileImageUrlMedium() {
        return this.profileImageUrlMedium;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getProfileImageUrlSmall() {
        return this.profileImageUrlSmall;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Long getUserProfilePk() {
        return this.userProfilePk;
    }

    public final int hashCode() {
        String str = this.displayName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fullName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.profileImageUrlLarge;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.profileImageUrlMedium;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.profileImageUrlSmall;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l14 = this.userProfilePk;
        return iHashCode5 + (l14 != null ? l14.hashCode() : 0);
    }

    public final String toString() {
        String str = this.displayName;
        String str2 = this.fullName;
        String str3 = this.profileImageUrlLarge;
        String str4 = this.profileImageUrlMedium;
        String str5 = this.profileImageUrlSmall;
        Long l14 = this.userProfilePk;
        StringBuilder sbI = p6.b.i("UserInfoDTO(displayName=", str, ", fullName=", str2, ", profileImageUrlLarge=");
        sn.a.t(sbI, str3, ", profileImageUrlMedium=", str4, ", profileImageUrlSmall=");
        sbI.append(str5);
        sbI.append(", userProfilePk=");
        sbI.append(l14);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.displayName);
        parcel.writeString(this.fullName);
        parcel.writeString(this.profileImageUrlLarge);
        parcel.writeString(this.profileImageUrlMedium);
        parcel.writeString(this.profileImageUrlSmall);
        Long l14 = this.userProfilePk;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
    }

    public a2(String str, String str2, String str3, String str4, String str5, Long l14) {
        this.displayName = str;
        this.fullName = str2;
        this.profileImageUrlLarge = str3;
        this.profileImageUrlMedium = str4;
        this.profileImageUrlSmall = str5;
        this.userProfilePk = l14;
    }

    public a2() {
        this(null, null, null, null, null, null, 63, null);
    }
}
