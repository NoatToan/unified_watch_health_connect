package yo1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u001eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010'\u001a\u0004\b0\u0010)R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u001c\u001a\u0004\b2\u0010\u001eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010'\u001a\u0004\b$\u0010)R\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b&\u00106R\u001a\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b\u001b\u00109¨\u0006:"}, d2 = {"Lyo1/e;", "Landroid/os/Parcelable;", "", "userPk", "", "displayName", "fullName", "updatedTimestamp", "garminGUID", "relationship", "", "mutualConnections", "connectionRequestId", "connectionRequestorId", "userLevel", FirebaseAnalytics.Param.LOCATION, "ranking", "Lyo1/g;", "rideData", "", "final", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lyo1/g;Z)V", "a", "J", "h", "()J", "b", "Ljava/lang/String;", "getDisplayName", "()Ljava/lang/String;", "c", "d", "getUpdatedTimestamp", JWKParameterNames.RSA_EXPONENT, "getGarminGUID", "f", "getRelationship", "g", "Ljava/lang/Integer;", "getMutualConnections", "()Ljava/lang/Integer;", "Ljava/lang/Long;", "getConnectionRequestId", "()Ljava/lang/Long;", IntegerTokenConverter.CONVERTER_KEY, "getConnectionRequestorId", "j", "getUserLevel", JWKParameterNames.OCT_KEY_VALUE, "getLocation", "l", "m", "Lyo1/g;", "()Lyo1/g;", JWKParameterNames.RSA_MODULUS, "Z", "()Z", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

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
    private final String relationship;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("mutualConnections")
    private final Integer mutualConnections;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("connectionRequestId")
    private final Long connectionRequestId;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("connectionRequestorId")
    private final Long connectionRequestorId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userLevel")
    private final Integer userLevel;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName(FirebaseAnalytics.Param.LOCATION)
    private final String location;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ranking")
    private final Integer ranking;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("rideData")
    private final g rideData;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("final")
    private final boolean final;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f198450o;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new e(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, g.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public e(long j8, String str, String str2, String str3, String str4, String str5, Integer num, Long l14, Long l15, Integer num2, String str6, Integer num3, g gVar, boolean z14) {
        str3.getClass();
        gVar.getClass();
        this.userPk = j8;
        this.displayName = str;
        this.fullName = str2;
        this.updatedTimestamp = str3;
        this.garminGUID = str4;
        this.relationship = str5;
        this.mutualConnections = num;
        this.connectionRequestId = l14;
        this.connectionRequestorId = l15;
        this.userLevel = num2;
        this.location = str6;
        this.ranking = num3;
        this.rideData = gVar;
        this.final = z14;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getFinal() {
        return this.final;
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
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.userPk == eVar.userPk && s.g(this.displayName, eVar.displayName) && s.g(this.fullName, eVar.fullName) && s.g(this.updatedTimestamp, eVar.updatedTimestamp) && s.g(this.garminGUID, eVar.garminGUID) && s.g(this.relationship, eVar.relationship) && s.g(this.mutualConnections, eVar.mutualConnections) && s.g(this.connectionRequestId, eVar.connectionRequestId) && s.g(this.connectionRequestorId, eVar.connectionRequestorId) && s.g(this.userLevel, eVar.userLevel) && s.g(this.location, eVar.location) && s.g(this.ranking, eVar.ranking) && s.g(this.rideData, eVar.rideData) && this.final == eVar.final;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getRanking() {
        return this.ranking;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final g getRideData() {
        return this.rideData;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getUserPk() {
        return this.userPk;
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
        Long l14 = this.connectionRequestId;
        int iHashCode6 = (iHashCode5 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.connectionRequestorId;
        int iHashCode7 = (iHashCode6 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Integer num2 = this.userLevel;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.location;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num3 = this.ranking;
        return Boolean.hashCode(this.final) + ((this.rideData.hashCode() + ((iHashCode9 + (num3 != null ? num3.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        long j8 = this.userPk;
        String str = this.displayName;
        String str2 = this.fullName;
        String str3 = this.updatedTimestamp;
        String str4 = this.garminGUID;
        String str5 = this.relationship;
        Integer num = this.mutualConnections;
        Long l14 = this.connectionRequestId;
        Long l15 = this.connectionRequestorId;
        Integer num2 = this.userLevel;
        String str6 = this.location;
        Integer num3 = this.ranking;
        g gVar = this.rideData;
        boolean z14 = this.final;
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j8, "SocialGroupRideCompetitionParticipantDTO(userPk=", ", displayName=", str);
        sn.a.t(sbK, ", fullName=", str2, ", updatedTimestamp=", str3);
        sn.a.t(sbK, ", garminGUID=", str4, ", relationship=", str5);
        sbK.append(", mutualConnections=");
        sbK.append(num);
        sbK.append(", connectionRequestId=");
        sbK.append(l14);
        sbK.append(", connectionRequestorId=");
        sbK.append(l15);
        sbK.append(", userLevel=");
        sbK.append(num2);
        sbK.append(", location=");
        sbK.append(str6);
        sbK.append(", ranking=");
        sbK.append(num3);
        sbK.append(", rideData=");
        sbK.append(gVar);
        sbK.append(", final=");
        sbK.append(z14);
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
        Integer num2 = this.userLevel;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        parcel.writeString(this.location);
        Integer num3 = this.ranking;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        this.rideData.writeToParcel(parcel, i14);
        parcel.writeInt(this.final ? 1 : 0);
    }
}
