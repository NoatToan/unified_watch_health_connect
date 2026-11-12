package ue0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u009d\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b%\u0010\u001eR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b)\u0010\u0018\u001a\u0004\b*\u0010\u001aR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b/\u0010\u001c\u001a\u0004\b0\u0010\u001eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u001c\u001a\u0004\b!\u0010\u001e¨\u00062"}, d2 = {"Lue0/l;", "Lue0/d;", "Landroid/os/Parcelable;", "", "userId", "", "fullName", "profileImageUrlSmall", "profileImageUrlMedium", "profileImageUrlLarge", "displayName", "Lue0/m;", "memberRole", "userLevel", "Lorg/joda/time/DateTime;", "acceptedDate", "inviteId", FirebaseAnalytics.Param.LOCATION, RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "Lcom/garmin/android/apps/connectmobile/userprofile/model/l;", "simplePublicSocialProfile", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lue0/m;Ljava/lang/Long;Lorg/joda/time/DateTime;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/userprofile/model/l;)V", "a", "Ljava/lang/Long;", "getUserId", "()Ljava/lang/Long;", "b", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "c", "l2", "d", "H3", JWKParameterNames.RSA_EXPONENT, "f4", "getDisplayName", "g", "Lue0/m;", "()Lue0/m;", "h", "j", IntegerTokenConverter.CONVERTER_KEY, "Lorg/joda/time/DateTime;", "C", "()Lorg/joda/time/DateTime;", JWKParameterNames.OCT_KEY_VALUE, "getLocation", "l", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l implements d, Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f170195n = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfileId")
    private final Long userId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fullName")
    private final String fullName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageUrlSmall")
    private final String profileImageUrlSmall;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageUrlMedium")
    private final String profileImageUrlMedium;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageUrlLarge")
    private final String profileImageUrlLarge;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayName")
    private final String displayName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("memberRole")
    private final m memberRole;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("inviteeUserLevel")
    private final Long userLevel;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("acceptedDate")
    @JsonAdapter(GsonUtil.IsoDateTimeTypeAdapter.class)
    private final DateTime acceptedDate;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f170205j;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName(FirebaseAnalytics.Param.LOCATION)
    private final String location;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE)
    private final String countryCode;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.userprofile.model.l f170208m;

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
            String string = parcel.readString();
            Long l15 = l14;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Long lValueOf2 = l15;
            String string5 = parcel.readString();
            Object objValueOf = parcel.readInt() == 0 ? lValueOf2 : m.valueOf(parcel.readString());
            Long lValueOf3 = parcel.readInt() == 0 ? lValueOf2 : Long.valueOf(parcel.readLong());
            DateTime dateTime = (DateTime) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                lValueOf2 = Long.valueOf(parcel.readLong());
            }
            return new l(lValueOf, string, string2, string3, string4, string5, objValueOf, lValueOf3, dateTime, lValueOf2, parcel.readString(), parcel.readString(), (com.garmin.android.apps.connectmobile.userprofile.model.l) parcel.readParcelable(l.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final l[] newArray(int i14) {
            return new l[i14];
        }
    }

    public /* synthetic */ l(Long l14, String str, String str2, String str3, String str4, String str5, m mVar, Long l15, DateTime dateTime, Long l16, String str6, String str7, com.garmin.android.apps.connectmobile.userprofile.model.l lVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(l14, str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? null : str5, mVar, (i14 & 128) != 0 ? null : l15, (i14 & 256) != 0 ? null : dateTime, (i14 & 512) != 0 ? null : l16, (i14 & 1024) != 0 ? null : str6, (i14 & 2048) != 0 ? null : str7, (i14 & 4096) != 0 ? null : lVar);
    }

    public static l b(l lVar, com.garmin.android.apps.connectmobile.userprofile.model.l lVar2) {
        Long l14 = lVar.userId;
        String str = lVar.fullName;
        String str2 = lVar.profileImageUrlSmall;
        String str3 = lVar.profileImageUrlMedium;
        String str4 = lVar.profileImageUrlLarge;
        String str5 = lVar.displayName;
        m mVar = lVar.memberRole;
        Long l15 = lVar.userLevel;
        DateTime dateTime = lVar.acceptedDate;
        Long l16 = lVar.f170205j;
        String str6 = lVar.location;
        String str7 = lVar.countryCode;
        lVar.getClass();
        return new l(l14, str, str2, str3, str4, str5, mVar, l15, dateTime, l16, str6, str7, lVar2);
    }

    @Override // ue0.d
    /* JADX INFO: renamed from: C, reason: from getter */
    public final DateTime getAcceptedDate() {
        return this.acceptedDate;
    }

    @Override // ue0.d
    /* JADX INFO: renamed from: H2, reason: from getter */
    public final Long getF170205j() {
        return this.f170205j;
    }

    @Override // ue0.d
    /* JADX INFO: renamed from: H3, reason: from getter */
    public final String getProfileImageUrlMedium() {
        return this.profileImageUrlMedium;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
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
        return s.g(this.userId, lVar.userId) && s.g(this.fullName, lVar.fullName) && s.g(this.profileImageUrlSmall, lVar.profileImageUrlSmall) && s.g(this.profileImageUrlMedium, lVar.profileImageUrlMedium) && s.g(this.profileImageUrlLarge, lVar.profileImageUrlLarge) && s.g(this.displayName, lVar.displayName) && this.memberRole == lVar.memberRole && s.g(this.userLevel, lVar.userLevel) && s.g(this.acceptedDate, lVar.acceptedDate) && s.g(this.f170205j, lVar.f170205j) && s.g(this.location, lVar.location) && s.g(this.countryCode, lVar.countryCode) && s.g(this.f170208m, lVar.f170208m);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    @Override // ue0.d
    /* JADX INFO: renamed from: f0 */
    public final DateTime getInviteDate() {
        return this.acceptedDate;
    }

    @Override // ue0.d
    /* JADX INFO: renamed from: f4, reason: from getter */
    public final String getProfileImageUrlLarge() {
        return this.profileImageUrlLarge;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final m getMemberRole() {
        return this.memberRole;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    @Override // ue0.d
    public final String getLocation() {
        return this.location;
    }

    @Override // ue0.d
    public final String getName() {
        return this.fullName;
    }

    @Override // ue0.d
    public final c getStatus() {
        return c.ACCEPTED;
    }

    @Override // ue0.d
    public final Long getUserId() {
        return this.userId;
    }

    public final int hashCode() {
        Long l14 = this.userId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.fullName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.profileImageUrlSmall;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.profileImageUrlMedium;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.profileImageUrlLarge;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.displayName;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        m mVar = this.memberRole;
        int iHashCode7 = (iHashCode6 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        Long l15 = this.userLevel;
        int iHashCode8 = (iHashCode7 + (l15 == null ? 0 : l15.hashCode())) * 31;
        DateTime dateTime = this.acceptedDate;
        int iHashCode9 = (iHashCode8 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        Long l16 = this.f170205j;
        int iHashCode10 = (iHashCode9 + (l16 == null ? 0 : l16.hashCode())) * 31;
        String str6 = this.location;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.countryCode;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        com.garmin.android.apps.connectmobile.userprofile.model.l lVar = this.f170208m;
        return iHashCode12 + (lVar != null ? lVar.hashCode() : 0);
    }

    @Override // ue0.d
    /* JADX INFO: renamed from: j, reason: from getter */
    public final Long getUserLevel() {
        return this.userLevel;
    }

    @Override // ue0.d
    /* JADX INFO: renamed from: l2, reason: from getter */
    public final String getProfileImageUrlSmall() {
        return this.profileImageUrlSmall;
    }

    public final String toString() {
        Long l14 = this.userId;
        String str = this.fullName;
        String str2 = this.profileImageUrlSmall;
        String str3 = this.profileImageUrlMedium;
        String str4 = this.profileImageUrlLarge;
        String str5 = this.displayName;
        m mVar = this.memberRole;
        Long l15 = this.userLevel;
        DateTime dateTime = this.acceptedDate;
        String str6 = this.location;
        String str7 = this.countryCode;
        StringBuilder sbJ = b71.i.j("ManagedAccountsMemberDTO(userId=", ", fullName=", str, l14, ", profileImageUrlSmall=");
        sn.a.t(sbJ, str2, ", profileImageUrlMedium=", str3, ", profileImageUrlLarge=");
        sn.a.t(sbJ, str4, ", displayName=", str5, ", memberRole=");
        sbJ.append(mVar);
        sbJ.append(", userLevel=");
        sbJ.append(l15);
        sbJ.append(", acceptedDate=");
        sbJ.append(dateTime);
        sbJ.append(", inviteId=");
        sbJ.append(this.f170205j);
        sbJ.append(", location=");
        sn.a.t(sbJ, str6, ", countryCode=", str7, ", simplePublicSocialProfile=");
        sbJ.append(this.f170208m);
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
        parcel.writeString(this.fullName);
        parcel.writeString(this.profileImageUrlSmall);
        parcel.writeString(this.profileImageUrlMedium);
        parcel.writeString(this.profileImageUrlLarge);
        parcel.writeString(this.displayName);
        m mVar = this.memberRole;
        if (mVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(mVar.name());
        }
        Long l15 = this.userLevel;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        parcel.writeSerializable(this.acceptedDate);
        Long l16 = this.f170205j;
        if (l16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l16);
        }
        parcel.writeString(this.location);
        parcel.writeString(this.countryCode);
        parcel.writeParcelable(this.f170208m, i14);
    }

    public l(Long l14, String str, String str2, String str3, String str4, String str5, m mVar, Long l15, DateTime dateTime, Long l16, String str6, String str7, com.garmin.android.apps.connectmobile.userprofile.model.l lVar) {
        this.userId = l14;
        this.fullName = str;
        this.profileImageUrlSmall = str2;
        this.profileImageUrlMedium = str3;
        this.profileImageUrlLarge = str4;
        this.displayName = str5;
        this.memberRole = mVar;
        this.userLevel = l15;
        this.acceptedDate = dateTime;
        this.f170205j = l16;
        this.location = str6;
        this.countryCode = str7;
        this.f170208m = lVar;
    }
}
