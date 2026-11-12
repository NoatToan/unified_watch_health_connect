package yo1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import li0.d0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001dR$\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010&R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b#\u0010)R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u001b\u001a\u0004\b.\u0010\u001dR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00102R\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b\u001a\u0010;¨\u0006<"}, d2 = {"Lyo1/i;", "Landroid/os/Parcelable;", "", "userPk", "", "displayName", "fullName", "updatedTimestamp", "garminGUID", "relationship", "", "mutualConnections", "userLevel", FirebaseAnalytics.Param.LOCATION, "connectionRequestId", "connectionRequestorId", "", "final", "Lhi0/a;", "follow", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;ZLhi0/a;)V", "a", "J", "g", "()J", "b", "Ljava/lang/String;", "getDisplayName", "()Ljava/lang/String;", "c", "d", "getUpdatedTimestamp", JWKParameterNames.RSA_EXPONENT, "getGarminGUID", "f", "getRelationship", "setRelationship", "(Ljava/lang/String;)V", "Ljava/lang/Integer;", "getMutualConnections", "()Ljava/lang/Integer;", "setMutualConnections", "(Ljava/lang/Integer;)V", "h", IntegerTokenConverter.CONVERTER_KEY, "getLocation", "j", "Ljava/lang/Long;", "getConnectionRequestId", "()Ljava/lang/Long;", JWKParameterNames.OCT_KEY_VALUE, "getConnectionRequestorId", "l", "Z", "getFinal", "()Z", "m", "Lhi0/a;", "()Lhi0/a;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f198488o = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userPk")
    private final long userPk;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayName")
    private final String displayName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fullName")
    private final String fullName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("updatedTimestamp")
    private final String updatedTimestamp;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("garminGUID")
    private final String garminGUID;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("relationship")
    private String relationship;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("mutualConnections")
    private Integer mutualConnections;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userLevel")
    private final Integer userLevel;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName(FirebaseAnalytics.Param.LOCATION)
    private final String location;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("connectionRequestId")
    private final Long connectionRequestId;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("connectionRequestorId")
    private final Long connectionRequestorId;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("final")
    private final boolean final;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("follow")
    private final hi0.a follow;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.userprofile.model.j f198502n;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new i(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0, parcel.readInt() != 0 ? hi0.a.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i14) {
            return new i[i14];
        }
    }

    public i(long j8, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, String str6, Long l14, Long l15, boolean z14, hi0.a aVar) {
        str3.getClass();
        this.userPk = j8;
        this.displayName = str;
        this.fullName = str2;
        this.updatedTimestamp = str3;
        this.garminGUID = str4;
        this.relationship = str5;
        this.mutualConnections = num;
        this.userLevel = num2;
        this.location = str6;
        this.connectionRequestId = l14;
        this.connectionRequestorId = l15;
        this.final = z14;
        this.follow = aVar;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final hi0.a getFollow() {
        return this.follow;
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
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.userPk == iVar.userPk && s.g(this.displayName, iVar.displayName) && s.g(this.fullName, iVar.fullName) && s.g(this.updatedTimestamp, iVar.updatedTimestamp) && s.g(this.garminGUID, iVar.garminGUID) && s.g(this.relationship, iVar.relationship) && s.g(this.mutualConnections, iVar.mutualConnections) && s.g(this.userLevel, iVar.userLevel) && s.g(this.location, iVar.location) && s.g(this.connectionRequestId, iVar.connectionRequestId) && s.g(this.connectionRequestorId, iVar.connectionRequestorId) && this.final == iVar.final && s.g(this.follow, iVar.follow);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getUserLevel() {
        return this.userLevel;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getUserPk() {
        return this.userPk;
    }

    public final d0 h() {
        hi0.a aVarB;
        hi0.a aVar = this.follow;
        if (aVar != null) {
            String str = this.displayName;
            String str2 = this.fullName;
            com.garmin.android.apps.connectmobile.userprofile.model.j jVar = this.f198502n;
            Integer num = this.userLevel;
            aVarB = hi0.a.b(aVar, str, str2, num != null ? Long.valueOf(num.intValue()) : null, this.location, jVar);
        } else {
            aVarB = null;
        }
        if (aVarB != null) {
            return hi0.b.a(aVarB);
        }
        return null;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.userPk) * 31;
        String str = this.displayName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fullName;
        int iJ = wr.g.j((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.updatedTimestamp);
        String str3 = this.garminGUID;
        int iHashCode3 = (iJ + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.relationship;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.mutualConnections;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.userLevel;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.location;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l14 = this.connectionRequestId;
        int iHashCode8 = (iHashCode7 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.connectionRequestorId;
        int iG = q6.f.g((iHashCode8 + (l15 == null ? 0 : l15.hashCode())) * 31, 31, this.final);
        hi0.a aVar = this.follow;
        return iG + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        long j8 = this.userPk;
        String str = this.displayName;
        String str2 = this.fullName;
        String str3 = this.updatedTimestamp;
        String str4 = this.garminGUID;
        String str5 = this.relationship;
        Integer num = this.mutualConnections;
        Integer num2 = this.userLevel;
        String str6 = this.location;
        Long l14 = this.connectionRequestId;
        Long l15 = this.connectionRequestorId;
        boolean z14 = this.final;
        hi0.a aVar = this.follow;
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j8, "SocialGroupRideParticipantDTO(userPk=", ", displayName=", str);
        sn.a.t(sbK, ", fullName=", str2, ", updatedTimestamp=", str3);
        sn.a.t(sbK, ", garminGUID=", str4, ", relationship=", str5);
        sbK.append(", mutualConnections=");
        sbK.append(num);
        sbK.append(", userLevel=");
        sbK.append(num2);
        sbK.append(", location=");
        sbK.append(str6);
        sbK.append(", connectionRequestId=");
        sbK.append(l14);
        sbK.append(", connectionRequestorId=");
        sbK.append(l15);
        sbK.append(", final=");
        sbK.append(z14);
        sbK.append(", follow=");
        sbK.append(aVar);
        sbK.append(")");
        return sbK.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.userPk);
        parcel.writeString(this.displayName);
        parcel.writeString(this.fullName);
        parcel.writeString(this.updatedTimestamp);
        parcel.writeString(this.garminGUID);
        parcel.writeString(this.relationship);
        Integer num = this.mutualConnections;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.userLevel;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        parcel.writeString(this.location);
        Long l14 = this.connectionRequestId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Long l15 = this.connectionRequestorId;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        parcel.writeInt(this.final ? 1 : 0);
        hi0.a aVar = this.follow;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aVar.writeToParcel(parcel, i14);
        }
    }
}
