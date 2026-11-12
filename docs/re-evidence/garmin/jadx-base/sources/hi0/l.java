package hi0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018Bk\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0015\u001a\u0004\b\"\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010'\u001a\u0004\b\u0018\u0010(R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010)\u001a\u0004\b#\u0010*R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010+\u001a\u0004\b!\u0010,¨\u0006-"}, d2 = {"Lhi0/l;", "Landroid/os/Parcelable;", "", "userId", "", FirebaseAnalytics.Param.LOCATION, "fullName", "displayName", "userLevel", "profileVisibility", "Lcom/garmin/android/apps/connectmobile/userprofile/model/j;", "profileImageUrls", "Lhi0/e;", "followStatus", "Lhi0/l$b;", "infoStatus", "Lhi0/g;", "info", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lcom/garmin/android/apps/connectmobile/userprofile/model/j;Lhi0/e;Lhi0/l$b;Lhi0/g;)V", "a", "Ljava/lang/Long;", "j", "()Ljava/lang/Long;", "b", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "c", "d", "getDisplayName", JWKParameterNames.RSA_EXPONENT, JWKParameterNames.OCT_KEY_VALUE, "f", "getProfileVisibility", "g", "Lcom/garmin/android/apps/connectmobile/userprofile/model/j;", IntegerTokenConverter.CONVERTER_KEY, "()Lcom/garmin/android/apps/connectmobile/userprofile/model/j;", "Lhi0/e;", "()Lhi0/e;", "Lhi0/l$b;", "()Lhi0/l$b;", "Lhi0/g;", "()Lhi0/g;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f83843k = com.garmin.android.apps.connectmobile.userprofile.model.j.f46870j;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userId")
    private final Long userId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName(FirebaseAnalytics.Param.LOCATION)
    private final String location;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fullName")
    private final String fullName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayName")
    private final String displayName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userLevel")
    private final Long userLevel;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileVisibility")
    private final Long profileVisibility;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageUrls")
    private final com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("followStatus")
    private final e followStatus;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("infoStatus")
    private final b infoStatus;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("info")
    private final g info;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<l> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final l createFromParcel(Parcel parcel) {
            Long lValueOf;
            Long l14;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                lValueOf = null;
                l14 = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
                l14 = null;
            }
            Long l15 = l14;
            return new l(lValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? l15 : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? l15 : Long.valueOf(parcel.readLong()), (com.garmin.android.apps.connectmobile.userprofile.model.j) parcel.readParcelable(l.class.getClassLoader()), (e) (parcel.readInt() == 0 ? l15 : e.CREATOR.createFromParcel(parcel)), parcel.readInt() == 0 ? l15 : b.valueOf(parcel.readString()), (g) (parcel.readInt() == 0 ? l15 : g.CREATOR.createFromParcel(parcel)));
        }

        @Override // android.os.Parcelable.Creator
        public final l[] newArray(int i14) {
            return new l[i14];
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhi0/l$b;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        FOLLOWED,
        FOLLOWING
    }

    public l(Long l14, String str, String str2, String str3, Long l15, Long l16, com.garmin.android.apps.connectmobile.userprofile.model.j jVar, e eVar, b bVar, g gVar) {
        this.userId = l14;
        this.location = str;
        this.fullName = str2;
        this.displayName = str3;
        this.userLevel = l15;
        this.profileVisibility = l16;
        this.profileImageUrls = jVar;
        this.followStatus = eVar;
        this.infoStatus = bVar;
        this.info = gVar;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final e getFollowStatus() {
        return this.followStatus;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return s.g(this.userId, lVar.userId) && s.g(this.location, lVar.location) && s.g(this.fullName, lVar.fullName) && s.g(this.displayName, lVar.displayName) && s.g(this.userLevel, lVar.userLevel) && s.g(this.profileVisibility, lVar.profileVisibility) && s.g(this.profileImageUrls, lVar.profileImageUrls) && s.g(this.followStatus, lVar.followStatus) && this.infoStatus == lVar.infoStatus && s.g(this.info, lVar.info);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final g getInfo() {
        return this.info;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final b getInfoStatus() {
        return this.infoStatus;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    public final int hashCode() {
        Long l14 = this.userId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.location;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fullName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.displayName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l15 = this.userLevel;
        int iHashCode5 = (iHashCode4 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Long l16 = this.profileVisibility;
        int iHashCode6 = (iHashCode5 + (l16 == null ? 0 : l16.hashCode())) * 31;
        com.garmin.android.apps.connectmobile.userprofile.model.j jVar = this.profileImageUrls;
        int iHashCode7 = (iHashCode6 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        e eVar = this.followStatus;
        int iHashCode8 = (iHashCode7 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        b bVar = this.infoStatus;
        int iHashCode9 = (iHashCode8 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        g gVar = this.info;
        return iHashCode9 + (gVar != null ? gVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final com.garmin.android.apps.connectmobile.userprofile.model.j getProfileImageUrls() {
        return this.profileImageUrls;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Long getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Long getUserLevel() {
        return this.userLevel;
    }

    public final String toString() {
        Long l14 = this.userId;
        String str = this.location;
        String str2 = this.fullName;
        String str3 = this.displayName;
        Long l15 = this.userLevel;
        Long l16 = this.profileVisibility;
        com.garmin.android.apps.connectmobile.userprofile.model.j jVar = this.profileImageUrls;
        e eVar = this.followStatus;
        b bVar = this.infoStatus;
        g gVar = this.info;
        StringBuilder sbJ = b71.i.j("SocialProfileSummaryV3DTO(userId=", ", location=", str, l14, ", fullName=");
        sn.a.t(sbJ, str2, ", displayName=", str3, ", userLevel=");
        kg.f.s(sbJ, l15, ", profileVisibility=", l16, ", profileImageUrls=");
        sbJ.append(jVar);
        sbJ.append(", followStatus=");
        sbJ.append(eVar);
        sbJ.append(", infoStatus=");
        sbJ.append(bVar);
        sbJ.append(", info=");
        sbJ.append(gVar);
        sbJ.append(")");
        return sbJ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.userId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.location);
        parcel.writeString(this.fullName);
        parcel.writeString(this.displayName);
        Long l15 = this.userLevel;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        Long l16 = this.profileVisibility;
        if (l16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l16);
        }
        parcel.writeParcelable(this.profileImageUrls, i14);
        e eVar = this.followStatus;
        if (eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar.writeToParcel(parcel, i14);
        }
        b bVar = this.infoStatus;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(bVar.name());
        }
        g gVar = this.info;
        if (gVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gVar.writeToParcel(parcel, i14);
        }
    }
}
