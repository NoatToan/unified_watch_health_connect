package com.garmin.android.apps.connectmobile.leaderboard.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b \u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0017\u001a\u0004\b'\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b(\u0010\u0019R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b)\u0010#R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b-\u0010#R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/h0;", "Landroid/os/Parcelable;", "", "uuid", "Lorg/joda/time/DateTime;", "startDate", "endDate", "", "challengeTypeId", "challengeStatusId", "challengeActivityTypeId", "teamChallengeName", "teamChallengeDesc", "", "ownerUserProfileId", "durationTypeId", "teamRanking", "", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/j0;", "teams", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "a", "Ljava/lang/String;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getStartDate", "()Lorg/joda/time/DateTime;", "c", "j", "d", "Ljava/lang/Integer;", "h", "()Ljava/lang/Integer;", JWKParameterNames.RSA_EXPONENT, "g", "f", "o", "m", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/Long;", JWKParameterNames.OCT_KEY_VALUE, "()Ljava/lang/Long;", "getTeamRanking", "l", "Ljava/util/List;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "()Ljava/util/List;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h0 implements Parcelable {
    public static final Parcelable.Creator<h0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("uuid")
    private final String uuid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startDate")
    @JsonAdapter(GsonUtil.UtcDateTimeTypeAdapter.class)
    private final DateTime startDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endDate")
    @JsonAdapter(GsonUtil.UtcDateTimeTypeAdapter.class)
    private final DateTime endDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("socialChallengeType")
    private final Integer challengeTypeId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("socialChallengeStatusId")
    private final Integer challengeStatusId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("socialChallengeActivityTypeId")
    private final Integer challengeActivityTypeId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("teamChallengeName")
    private final String teamChallengeName;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("teamChallengeDesc")
    private final String teamChallengeDesc;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ownerUserProfileId")
    private final Long ownerUserProfileId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("durationTypeId")
    private final Integer durationTypeId;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("teamRanking")
    private final Integer teamRanking;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("teams")
    private final List<j0> teams;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<h0> {
        @Override // android.os.Parcelable.Creator
        public final h0 createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            String string = parcel.readString();
            DateTime dateTime = (DateTime) parcel.readSerializable();
            DateTime dateTime2 = (DateTime) parcel.readSerializable();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(j0.CREATOR, parcel, arrayList, iA, 1);
                    numValueOf = numValueOf;
                }
            }
            return new h0(string, dateTime, dateTime2, numValueOf, numValueOf2, numValueOf3, string2, string3, lValueOf, numValueOf4, numValueOf5, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final h0[] newArray(int i14) {
            return new h0[i14];
        }
    }

    public /* synthetic */ h0(String str, DateTime dateTime, DateTime dateTime2, Integer num, Integer num2, Integer num3, String str2, String str3, Long l14, Integer num4, Integer num5, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : dateTime, (i14 & 4) != 0 ? null : dateTime2, num, num2, (i14 & 32) != 0 ? null : num3, (i14 & 64) != 0 ? null : str2, (i14 & 128) != 0 ? null : str3, (i14 & 256) != 0 ? null : l14, (i14 & 512) != 0 ? null : num4, (i14 & 1024) != 0 ? null : num5, (i14 & 2048) != 0 ? null : list);
    }

    public final s b() {
        Integer num = this.challengeActivityTypeId;
        if (num != null) {
            return s.b(num.intValue());
        }
        return null;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getChallengeActivityTypeId() {
        return this.challengeActivityTypeId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return p005kotlin.jvm.internal.s.g(this.uuid, h0Var.uuid) && p005kotlin.jvm.internal.s.g(this.startDate, h0Var.startDate) && p005kotlin.jvm.internal.s.g(this.endDate, h0Var.endDate) && p005kotlin.jvm.internal.s.g(this.challengeTypeId, h0Var.challengeTypeId) && p005kotlin.jvm.internal.s.g(this.challengeStatusId, h0Var.challengeStatusId) && p005kotlin.jvm.internal.s.g(this.challengeActivityTypeId, h0Var.challengeActivityTypeId) && p005kotlin.jvm.internal.s.g(this.teamChallengeName, h0Var.teamChallengeName) && p005kotlin.jvm.internal.s.g(this.teamChallengeDesc, h0Var.teamChallengeDesc) && p005kotlin.jvm.internal.s.g(this.ownerUserProfileId, h0Var.ownerUserProfileId) && p005kotlin.jvm.internal.s.g(this.durationTypeId, h0Var.durationTypeId) && p005kotlin.jvm.internal.s.g(this.teamRanking, h0Var.teamRanking) && p005kotlin.jvm.internal.s.g(this.teams, h0Var.teams);
    }

    public final v f() {
        v.a aVar = v.f38356b;
        Integer num = this.challengeStatusId;
        aVar.getClass();
        return v.a.a(num);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getChallengeStatusId() {
        return this.challengeStatusId;
    }

    public final DateTime getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Integer getChallengeTypeId() {
        return this.challengeTypeId;
    }

    public final int hashCode() {
        String str = this.uuid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        DateTime dateTime = this.startDate;
        int iHashCode2 = (iHashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.endDate;
        int iHashCode3 = (iHashCode2 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        Integer num = this.challengeTypeId;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.challengeStatusId;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.challengeActivityTypeId;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.teamChallengeName;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.teamChallengeDesc;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l14 = this.ownerUserProfileId;
        int iHashCode9 = (iHashCode8 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Integer num4 = this.durationTypeId;
        int iHashCode10 = (iHashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.teamRanking;
        int iHashCode11 = (iHashCode10 + (num5 == null ? 0 : num5.hashCode())) * 31;
        List<j0> list = this.teams;
        return iHashCode11 + (list != null ? list.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Integer getDurationTypeId() {
        return this.durationTypeId;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final DateTime getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Long getOwnerUserProfileId() {
        return this.ownerUserProfileId;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getTeamChallengeDesc() {
        return this.teamChallengeDesc;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getTeamChallengeName() {
        return this.teamChallengeName;
    }

    public final List<j0> q() {
        return this.teams;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    public final String toString() {
        String str = this.uuid;
        DateTime dateTime = this.startDate;
        DateTime dateTime2 = this.endDate;
        Integer num = this.challengeTypeId;
        Integer num2 = this.challengeStatusId;
        Integer num3 = this.challengeActivityTypeId;
        String str2 = this.teamChallengeName;
        String str3 = this.teamChallengeDesc;
        Long l14 = this.ownerUserProfileId;
        Integer num4 = this.durationTypeId;
        Integer num5 = this.teamRanking;
        List<j0> list = this.teams;
        StringBuilder sb3 = new StringBuilder("VivoKidTeamChallengeDTO(uuid=");
        sb3.append(str);
        sb3.append(", startDate=");
        sb3.append(dateTime);
        sb3.append(", endDate=");
        sb3.append(dateTime2);
        sb3.append(", challengeTypeId=");
        sb3.append(num);
        sb3.append(", challengeStatusId=");
        j20.x.m(sb3, num2, ", challengeActivityTypeId=", num3, ", teamChallengeName=");
        sn.a.t(sb3, str2, ", teamChallengeDesc=", str3, ", ownerUserProfileId=");
        sb3.append(l14);
        sb3.append(", durationTypeId=");
        sb3.append(num4);
        sb3.append(", teamRanking=");
        sb3.append(num5);
        sb3.append(", teams=");
        sb3.append(list);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.uuid);
        parcel.writeSerializable(this.startDate);
        parcel.writeSerializable(this.endDate);
        Integer num = this.challengeTypeId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.challengeStatusId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Integer num3 = this.challengeActivityTypeId;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        parcel.writeString(this.teamChallengeName);
        parcel.writeString(this.teamChallengeDesc);
        Long l14 = this.ownerUserProfileId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Integer num4 = this.durationTypeId;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num4);
        }
        Integer num5 = this.teamRanking;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num5);
        }
        List<j0> list = this.teams;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            ((j0) itO.next()).writeToParcel(parcel, i14);
        }
    }

    public h0(String str, DateTime dateTime, DateTime dateTime2, Integer num, Integer num2, Integer num3, String str2, String str3, Long l14, Integer num4, Integer num5, List<j0> list) {
        this.uuid = str;
        this.startDate = dateTime;
        this.endDate = dateTime2;
        this.challengeTypeId = num;
        this.challengeStatusId = num2;
        this.challengeActivityTypeId = num3;
        this.teamChallengeName = str2;
        this.teamChallengeDesc = str3;
        this.ownerUserProfileId = l14;
        this.durationTypeId = num4;
        this.teamRanking = num5;
        this.teams = list;
    }
}
