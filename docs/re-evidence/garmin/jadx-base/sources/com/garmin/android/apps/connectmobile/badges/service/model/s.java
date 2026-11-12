package com.garmin.android.apps.connectmobile.badges.service.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0013\u001a\u0004\b(\u0010\u0015R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0019\u001a\u0004\b\u0016\u0010\u001bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006+"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/service/model/s;", "Landroid/os/Parcelable;", "", "userHasBadgeId", "badgeId", "", "badgeKey", "badgeUuid", "badgeName", "Lorg/joda/time/DateTime;", "badgeEarnedDate", "", "earnedMultiplier", "badgeAssocTypeId", "badgeAssocDataId", "badgeAssocDataName", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/Long;", "getUserHasBadgeId", "()Ljava/lang/Long;", "b", "getBadgeId", "c", "Ljava/lang/String;", "getBadgeKey", "()Ljava/lang/String;", "d", "getBadgeUuid", JWKParameterNames.RSA_EXPONENT, "getBadgeName", "f", "Lorg/joda/time/DateTime;", "()Lorg/joda/time/DateTime;", "g", "Ljava/lang/Integer;", "getEarnedMultiplier", "()Ljava/lang/Integer;", "h", "getBadgeAssocTypeId", IntegerTokenConverter.CONVERTER_KEY, "j", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userHasBadgeId")
    private final Long userHasBadgeId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeId")
    private final Long badgeId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeKey")
    private final String badgeKey;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeUuid")
    private final String badgeUuid;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeName")
    private final String badgeName;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeEarnedDate")
    @JsonAdapter(GsonUtil.LocalDateTimeTypeAdapter.class)
    private final DateTime badgeEarnedDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("earnedMultiplier")
    private final Integer earnedMultiplier;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeAssocTypeId")
    private final Long badgeAssocTypeId;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeAssocDataId")
    private final String badgeAssocDataId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeAssocDataName")
    private final String badgeAssocDataName;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<s> {
        @Override // android.os.Parcelable.Creator
        public final s createFromParcel(Parcel parcel) {
            parcel.getClass();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            Long l14 = lValueOf2;
            String string2 = parcel.readString();
            Long lValueOf3 = null;
            String string3 = parcel.readString();
            DateTime dateTime = (DateTime) parcel.readSerializable();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                lValueOf3 = Long.valueOf(parcel.readLong());
            }
            return new s(lValueOf, l14, string, string2, string3, dateTime, numValueOf, lValueOf3, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final s[] newArray(int i14) {
            return new s[i14];
        }
    }

    public /* synthetic */ s(Long l14, Long l15, String str, String str2, String str3, DateTime dateTime, Integer num, Long l16, String str4, String str5, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : l15, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : str3, (i14 & 32) != 0 ? null : dateTime, (i14 & 64) != 0 ? null : num, (i14 & 128) != 0 ? null : l16, (i14 & 256) != 0 ? null : str4, (i14 & 512) != 0 ? null : str5);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBadgeAssocDataId() {
        return this.badgeAssocDataId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getBadgeAssocDataName() {
        return this.badgeAssocDataName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return p005kotlin.jvm.internal.s.g(this.userHasBadgeId, sVar.userHasBadgeId) && p005kotlin.jvm.internal.s.g(this.badgeId, sVar.badgeId) && p005kotlin.jvm.internal.s.g(this.badgeKey, sVar.badgeKey) && p005kotlin.jvm.internal.s.g(this.badgeUuid, sVar.badgeUuid) && p005kotlin.jvm.internal.s.g(this.badgeName, sVar.badgeName) && p005kotlin.jvm.internal.s.g(this.badgeEarnedDate, sVar.badgeEarnedDate) && p005kotlin.jvm.internal.s.g(this.earnedMultiplier, sVar.earnedMultiplier) && p005kotlin.jvm.internal.s.g(this.badgeAssocTypeId, sVar.badgeAssocTypeId) && p005kotlin.jvm.internal.s.g(this.badgeAssocDataId, sVar.badgeAssocDataId) && p005kotlin.jvm.internal.s.g(this.badgeAssocDataName, sVar.badgeAssocDataName);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final DateTime getBadgeEarnedDate() {
        return this.badgeEarnedDate;
    }

    public final int hashCode() {
        Long l14 = this.userHasBadgeId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        Long l15 = this.badgeId;
        int iHashCode2 = (iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str = this.badgeKey;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.badgeUuid;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.badgeName;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        DateTime dateTime = this.badgeEarnedDate;
        int iHashCode6 = (iHashCode5 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        Integer num = this.earnedMultiplier;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Long l16 = this.badgeAssocTypeId;
        int iHashCode8 = (iHashCode7 + (l16 == null ? 0 : l16.hashCode())) * 31;
        String str4 = this.badgeAssocDataId;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.badgeAssocDataName;
        return iHashCode9 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        Long l14 = this.userHasBadgeId;
        Long l15 = this.badgeId;
        String str = this.badgeKey;
        String str2 = this.badgeUuid;
        String str3 = this.badgeName;
        DateTime dateTime = this.badgeEarnedDate;
        Integer num = this.earnedMultiplier;
        Long l16 = this.badgeAssocTypeId;
        String str4 = this.badgeAssocDataId;
        String str5 = this.badgeAssocDataName;
        StringBuilder sbJ = f3.j(l14, l15, "RepeatableBadgeDTO(userHasBadgeId=", ", badgeId=", ", badgeKey=");
        sn.a.t(sbJ, str, ", badgeUuid=", str2, ", badgeName=");
        sbJ.append(str3);
        sbJ.append(", badgeEarnedDate=");
        sbJ.append(dateTime);
        sbJ.append(", earnedMultiplier=");
        sbJ.append(num);
        sbJ.append(", badgeAssocTypeId=");
        sbJ.append(l16);
        sbJ.append(", badgeAssocDataId=");
        return e5.h(sbJ, str4, ", badgeAssocDataName=", str5, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.userHasBadgeId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Long l15 = this.badgeId;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        parcel.writeString(this.badgeKey);
        parcel.writeString(this.badgeUuid);
        parcel.writeString(this.badgeName);
        parcel.writeSerializable(this.badgeEarnedDate);
        Integer num = this.earnedMultiplier;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Long l16 = this.badgeAssocTypeId;
        if (l16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l16);
        }
        parcel.writeString(this.badgeAssocDataId);
        parcel.writeString(this.badgeAssocDataName);
    }

    public s(Long l14, Long l15, String str, String str2, String str3, DateTime dateTime, Integer num, Long l16, String str4, String str5) {
        this.userHasBadgeId = l14;
        this.badgeId = l15;
        this.badgeKey = str;
        this.badgeUuid = str2;
        this.badgeName = str3;
        this.badgeEarnedDate = dateTime;
        this.earnedMultiplier = num;
        this.badgeAssocTypeId = l16;
        this.badgeAssocDataId = str4;
        this.badgeAssocDataName = str5;
    }

    public s() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }
}
