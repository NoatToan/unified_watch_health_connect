package jo1;

import android.os.Parcel;
import android.os.Parcelable;
import b71.i;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.userprofile.model.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010&\u001a\u0004\b\"\u0010'R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0018\u001a\u0004\b\u001c\u0010\u0019R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b \u0010+¨\u0006,"}, d2 = {"Ljo1/g;", "Landroid/os/Parcelable;", "", "userProfileId", "", "fullName", "firstName", "lastName", "displayName", "profileImageUrlSmall", "", "recent", "", "userLevel", FirebaseAnalytics.Param.LOCATION, "Lcom/garmin/android/apps/connectmobile/userprofile/model/j;", "profileImageUrls", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Lcom/garmin/android/apps/connectmobile/userprofile/model/j;)V", "a", "Ljava/lang/Long;", "h", "()Ljava/lang/Long;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "getFirstName", "d", "getLastName", JWKParameterNames.RSA_EXPONENT, "getDisplayName", "f", "getProfileImageUrlSmall", "g", "Z", "getRecent", "()Z", "I", "()I", IntegerTokenConverter.CONVERTER_KEY, "j", "Lcom/garmin/android/apps/connectmobile/userprofile/model/j;", "()Lcom/garmin/android/apps/connectmobile/userprofile/model/j;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfileId")
    private final Long userProfileId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fullName")
    private final String fullName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("firstName")
    private final String firstName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastName")
    private final String lastName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayName")
    private final String displayName;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageUrlSmall")
    private final String profileImageUrlSmall;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("recent")
    private final boolean recent;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userLevel")
    private final int userLevel;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName(FirebaseAnalytics.Param.LOCATION)
    private final String location;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageUrls")
    private final j profileImageUrls;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new g(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readString(), (j) parcel.readParcelable(g.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    static {
        Parcelable.Creator<j> creator = j.CREATOR;
    }

    public /* synthetic */ g(Long l14, String str, String str2, String str3, String str4, String str5, boolean z14, int i14, String str6, j jVar, int i15, p005kotlin.jvm.internal.j jVar2) {
        this(l14, str, str2, str3, str4, str5, (i15 & 64) != 0 ? false : z14, (i15 & 128) != 0 ? 1 : i14, str6, jVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.userProfileId, gVar.userProfileId) && s.g(this.fullName, gVar.fullName) && s.g(this.firstName, gVar.firstName) && s.g(this.lastName, gVar.lastName) && s.g(this.displayName, gVar.displayName) && s.g(this.profileImageUrlSmall, gVar.profileImageUrlSmall) && this.recent == gVar.recent && this.userLevel == gVar.userLevel && s.g(this.location, gVar.location) && s.g(this.profileImageUrls, gVar.profileImageUrls);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final j getProfileImageUrls() {
        return this.profileImageUrls;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getUserLevel() {
        return this.userLevel;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Long getUserProfileId() {
        return this.userProfileId;
    }

    public final int hashCode() {
        Long l14 = this.userProfileId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.fullName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.firstName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.displayName;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.profileImageUrlSmall;
        int iD = q2.d(this.userLevel, q6.f.g((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.recent), 31);
        String str6 = this.location;
        int iHashCode6 = (iD + (str6 == null ? 0 : str6.hashCode())) * 31;
        j jVar = this.profileImageUrls;
        return iHashCode6 + (jVar != null ? jVar.hashCode() : 0);
    }

    public final String toString() {
        Long l14 = this.userProfileId;
        String str = this.fullName;
        String str2 = this.firstName;
        String str3 = this.lastName;
        String str4 = this.displayName;
        String str5 = this.profileImageUrlSmall;
        boolean z14 = this.recent;
        int i14 = this.userLevel;
        String str6 = this.location;
        j jVar = this.profileImageUrls;
        StringBuilder sbJ = i.j("TaggingSuggestionDTO(userProfileId=", ", fullName=", str, l14, ", firstName=");
        sn.a.t(sbJ, str2, ", lastName=", str3, ", displayName=");
        sn.a.t(sbJ, str4, ", profileImageUrlSmall=", str5, ", recent=");
        sbJ.append(z14);
        sbJ.append(", userLevel=");
        sbJ.append(i14);
        sbJ.append(", location=");
        sbJ.append(str6);
        sbJ.append(", profileImageUrls=");
        sbJ.append(jVar);
        sbJ.append(")");
        return sbJ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.userProfileId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.fullName);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.displayName);
        parcel.writeString(this.profileImageUrlSmall);
        parcel.writeInt(this.recent ? 1 : 0);
        parcel.writeInt(this.userLevel);
        parcel.writeString(this.location);
        parcel.writeParcelable(this.profileImageUrls, i14);
    }

    public g(Long l14, String str, String str2, String str3, String str4, String str5, boolean z14, int i14, String str6, j jVar) {
        this.userProfileId = l14;
        this.fullName = str;
        this.firstName = str2;
        this.lastName = str3;
        this.displayName = str4;
        this.profileImageUrlSmall = str5;
        this.recent = z14;
        this.userLevel = i14;
        this.location = str6;
        this.profileImageUrls = jVar;
    }
}
