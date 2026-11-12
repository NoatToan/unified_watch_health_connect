package com.garmin.android.apps.connectmobile.leaderboard.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\b\u0087\b\u0018\u00002\u00020\u0001BÙ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010'\u001a\u0004\b!\u0010(R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010$R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\"\u001a\u0004\b,\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b\f\u0010/R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b0\u0010$R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\"\u001a\u0004\b2\u0010$R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b1\u00105R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u00104\u001a\u0004\b6\u00105R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b3\u0010:R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010.\u001a\u0004\b;\u0010/R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u00104\u001a\u0004\b-\u00105R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010.\u001a\u0004\b?\u0010/R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b+\u0010B¨\u0006C"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/i0;", "Landroid/os/Parcelable;", "", "userProfileId", "", "fullName", "displayName", "", "avatarId", "profileImageSmall", "profileImageMedium", "", "isProUser", "teamUuid", "teamName", "ranking", "familyId", "", "todayNumber", "totalNumber", "isAcceptedChallenge", "playerType", "hasDevice", "Lorg/joda/time/DateTime;", "lastSyncTime", "Lb12/b;", "profileImageData", "<init>", "(JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Lorg/joda/time/DateTime;Lb12/b;)V", "a", "J", JWKParameterNames.OCT_KEY_VALUE, "()J", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "getDisplayName", "I", "()I", JWKParameterNames.RSA_EXPONENT, "getProfileImageSmall", "f", "h", "g", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getTeamUuid", IntegerTokenConverter.CONVERTER_KEY, "getTeamName", "j", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "getFamilyId", "l", "Ljava/lang/Double;", "getTodayNumber", "()Ljava/lang/Double;", "m", JWKParameterNames.RSA_MODULUS, "o", "p", "getHasDevice", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "Lorg/joda/time/DateTime;", "()Lorg/joda/time/DateTime;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i0 implements Parcelable {
    public static final Parcelable.Creator<i0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfileId")
    private final long userProfileId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fullName")
    private final String fullName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayName")
    private final String displayName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avatarId")
    private final int avatarId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageSmall")
    private final String profileImageSmall;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageMedium")
    private final String profileImageMedium;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isProUser")
    private final Boolean isProUser;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("teamUuid")
    private final String teamUuid;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("teamName")
    private final String teamName;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ranking")
    private final Integer ranking;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("familyId")
    private final Integer familyId;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("todayNumber")
    private final Double todayNumber;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalNumber")
    private final Double totalNumber;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isAcceptedChallenge")
    private final Boolean isAcceptedChallenge;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("playerType")
    private final Integer playerType;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasDevice")
    private final Boolean hasDevice;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastSyncTime")
    @JsonAdapter(GsonUtil.UtcDateTimeTypeAdapter.class)
    private final DateTime lastSyncTime;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public transient b12.b f38208r;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<i0> {
        @Override // android.os.Parcelable.Creator
        public final i0 createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            parcel.getClass();
            long j8 = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i14 = parcel.readInt();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Boolean boolValueOf3 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            boolean z14 = false;
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z14 = true;
                }
                boolValueOf3 = Boolean.valueOf(z14);
            }
            return new i0(j8, string, string2, i14, string3, string4, boolValueOf, string5, string6, numValueOf, numValueOf2, dValueOf, dValueOf2, boolValueOf2, numValueOf3, boolValueOf3, (DateTime) parcel.readSerializable(), (b12.b) parcel.readParcelable(i0.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final i0[] newArray(int i14) {
            return new i0[i14];
        }
    }

    public /* synthetic */ i0(long j8, String str, String str2, int i14, String str3, String str4, Boolean bool, String str5, String str6, Integer num, Integer num2, Double d14, Double d15, Boolean bool2, Integer num3, Boolean bool3, DateTime dateTime, b12.b bVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? -1L : j8, (i15 & 2) != 0 ? null : str, (i15 & 4) != 0 ? "" : str2, (i15 & 8) != 0 ? -1 : i14, (i15 & 16) != 0 ? null : str3, (i15 & 32) != 0 ? null : str4, (i15 & 64) != 0 ? null : bool, (i15 & 128) != 0 ? null : str5, (i15 & 256) != 0 ? null : str6, (i15 & 512) != 0 ? null : num, (i15 & 1024) != 0 ? null : num2, (i15 & 2048) != 0 ? null : d14, (i15 & 4096) != 0 ? null : d15, (i15 & 8192) != 0 ? null : bool2, (i15 & 16384) != 0 ? null : num3, (32768 & i15) != 0 ? null : bool3, (i15 & 65536) != 0 ? null : dateTime, (i15 & 131072) != 0 ? null : bVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getAvatarId() {
        return this.avatarId;
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
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.userProfileId == i0Var.userProfileId && p005kotlin.jvm.internal.s.g(this.fullName, i0Var.fullName) && p005kotlin.jvm.internal.s.g(this.displayName, i0Var.displayName) && this.avatarId == i0Var.avatarId && p005kotlin.jvm.internal.s.g(this.profileImageSmall, i0Var.profileImageSmall) && p005kotlin.jvm.internal.s.g(this.profileImageMedium, i0Var.profileImageMedium) && p005kotlin.jvm.internal.s.g(this.isProUser, i0Var.isProUser) && p005kotlin.jvm.internal.s.g(this.teamUuid, i0Var.teamUuid) && p005kotlin.jvm.internal.s.g(this.teamName, i0Var.teamName) && p005kotlin.jvm.internal.s.g(this.ranking, i0Var.ranking) && p005kotlin.jvm.internal.s.g(this.familyId, i0Var.familyId) && p005kotlin.jvm.internal.s.g(this.todayNumber, i0Var.todayNumber) && p005kotlin.jvm.internal.s.g(this.totalNumber, i0Var.totalNumber) && p005kotlin.jvm.internal.s.g(this.isAcceptedChallenge, i0Var.isAcceptedChallenge) && p005kotlin.jvm.internal.s.g(this.playerType, i0Var.playerType) && p005kotlin.jvm.internal.s.g(this.hasDevice, i0Var.hasDevice) && p005kotlin.jvm.internal.s.g(this.lastSyncTime, i0Var.lastSyncTime) && p005kotlin.jvm.internal.s.g(this.f38208r, i0Var.f38208r);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final DateTime getLastSyncTime() {
        return this.lastSyncTime;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getPlayerType() {
        return this.playerType;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getProfileImageMedium() {
        return this.profileImageMedium;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.userProfileId) * 31;
        String str = this.fullName;
        int iD = q2.d(this.avatarId, wr.g.j((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.displayName), 31);
        String str2 = this.profileImageSmall;
        int iHashCode2 = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.profileImageMedium;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isProUser;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.teamUuid;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.teamName;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.ranking;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.familyId;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d14 = this.todayNumber;
        int iHashCode9 = (iHashCode8 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.totalNumber;
        int iHashCode10 = (iHashCode9 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Boolean bool2 = this.isAcceptedChallenge;
        int iHashCode11 = (iHashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num3 = this.playerType;
        int iHashCode12 = (iHashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool3 = this.hasDevice;
        int iHashCode13 = (iHashCode12 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        DateTime dateTime = this.lastSyncTime;
        int iHashCode14 = (iHashCode13 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        b12.b bVar = this.f38208r;
        return iHashCode14 + (bVar != null ? bVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Integer getRanking() {
        return this.ranking;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Double getTotalNumber() {
        return this.totalNumber;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getUserProfileId() {
        return this.userProfileId;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Boolean getIsAcceptedChallenge() {
        return this.isAcceptedChallenge;
    }

    public final boolean o() {
        return this.avatarId != -1;
    }

    public final String toString() {
        long j8 = this.userProfileId;
        String str = this.fullName;
        String str2 = this.displayName;
        int i14 = this.avatarId;
        String str3 = this.profileImageSmall;
        String str4 = this.profileImageMedium;
        Boolean bool = this.isProUser;
        String str5 = this.teamUuid;
        String str6 = this.teamName;
        Integer num = this.ranking;
        Integer num2 = this.familyId;
        Double d14 = this.todayNumber;
        Double d15 = this.totalNumber;
        Boolean bool2 = this.isAcceptedChallenge;
        Integer num3 = this.playerType;
        Boolean bool3 = this.hasDevice;
        DateTime dateTime = this.lastSyncTime;
        b12.b bVar = this.f38208r;
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j8, "VivoKidTeamChallengePlayerDTO(userProfileId=", ", fullName=", str);
        sbK.append(", displayName=");
        sbK.append(str2);
        sbK.append(", avatarId=");
        sbK.append(i14);
        sn.a.t(sbK, ", profileImageSmall=", str3, ", profileImageMedium=", str4);
        sbK.append(", isProUser=");
        sbK.append(bool);
        sbK.append(", teamUuid=");
        sbK.append(str5);
        sbK.append(", teamName=");
        sbK.append(str6);
        sbK.append(", ranking=");
        sbK.append(num);
        sbK.append(", familyId=");
        sbK.append(num2);
        sbK.append(", todayNumber=");
        sbK.append(d14);
        sbK.append(", totalNumber=");
        sbK.append(d15);
        sbK.append(", isAcceptedChallenge=");
        sbK.append(bool2);
        sbK.append(", playerType=");
        sbK.append(num3);
        sbK.append(", hasDevice=");
        sbK.append(bool3);
        sbK.append(", lastSyncTime=");
        sbK.append(dateTime);
        sbK.append(", profileImageData=");
        sbK.append(bVar);
        sbK.append(")");
        return sbK.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.userProfileId);
        parcel.writeString(this.fullName);
        parcel.writeString(this.displayName);
        parcel.writeInt(this.avatarId);
        parcel.writeString(this.profileImageSmall);
        parcel.writeString(this.profileImageMedium);
        Boolean bool = this.isProUser;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        parcel.writeString(this.teamUuid);
        parcel.writeString(this.teamName);
        Integer num = this.ranking;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.familyId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Double d14 = this.todayNumber;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.totalNumber;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Boolean bool2 = this.isAcceptedChallenge;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool2);
        }
        Integer num3 = this.playerType;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        Boolean bool3 = this.hasDevice;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool3);
        }
        parcel.writeSerializable(this.lastSyncTime);
        parcel.writeParcelable(this.f38208r, i14);
    }

    public i0(long j8, String str, String str2, int i14, String str3, String str4, Boolean bool, String str5, String str6, Integer num, Integer num2, Double d14, Double d15, Boolean bool2, Integer num3, Boolean bool3, DateTime dateTime, b12.b bVar) {
        str2.getClass();
        this.userProfileId = j8;
        this.fullName = str;
        this.displayName = str2;
        this.avatarId = i14;
        this.profileImageSmall = str3;
        this.profileImageMedium = str4;
        this.isProUser = bool;
        this.teamUuid = str5;
        this.teamName = str6;
        this.ranking = num;
        this.familyId = num2;
        this.todayNumber = d14;
        this.totalNumber = d15;
        this.isAcceptedChallenge = bool2;
        this.playerType = num3;
        this.hasDevice = bool3;
        this.lastSyncTime = dateTime;
        this.f38208r = bVar;
    }

    public i0() {
        this(0L, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
    }
}
