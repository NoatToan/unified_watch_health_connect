package com.garmin.android.apps.connectmobile.leaderboard.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\fB;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/b0;", "Landroid/os/Parcelable;", "", "userProfileId", "", "displayName", "fullName", "", "ranking", "playerType", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "Ljava/lang/Long;", "getUserProfileId", "()Ljava/lang/Long;", "b", "Ljava/lang/String;", "getDisplayName", "()Ljava/lang/String;", "c", "d", "Ljava/lang/Integer;", "getRanking", "()Ljava/lang/Integer;", JWKParameterNames.RSA_EXPONENT, "getPlayerType", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b0 implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfileId")
    private final Long userProfileId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayName")
    private final String displayName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fullName")
    private final String fullName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ranking")
    private final Integer ranking;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("playerType")
    private final Integer playerType;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f38082f = new a(null);
    public static final Parcelable.Creator<b0> CREATOR = new b();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<b0> {
        @Override // android.os.Parcelable.Creator
        public final b0 createFromParcel(Parcel parcel) {
            Long lValueOf;
            Integer num;
            Integer num2;
            Integer numValueOf;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                lValueOf = null;
                num = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
                num = null;
            }
            String string = parcel.readString();
            Integer num3 = num;
            String string2 = parcel.readString();
            Integer numValueOf2 = parcel.readInt() == 0 ? num3 : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                Integer num4 = numValueOf2;
                numValueOf = num3;
                num2 = num4;
            } else {
                num2 = numValueOf2;
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new b0(lValueOf, string, string2, num2, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final b0[] newArray(int i14) {
            return new b0[i14];
        }
    }

    public /* synthetic */ b0(Long l14, String str, String str2, Integer num, Integer num2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(l14, str, str2, num, (i14 & 16) != 0 ? null : num2);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
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
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return p005kotlin.jvm.internal.s.g(this.userProfileId, b0Var.userProfileId) && p005kotlin.jvm.internal.s.g(this.displayName, b0Var.displayName) && p005kotlin.jvm.internal.s.g(this.fullName, b0Var.fullName) && p005kotlin.jvm.internal.s.g(this.ranking, b0Var.ranking) && p005kotlin.jvm.internal.s.g(this.playerType, b0Var.playerType);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final int hashCode() {
        Long l14 = this.userProfileId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.displayName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fullName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.ranking;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.playerType;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        Long l14 = this.userProfileId;
        String str = this.displayName;
        String str2 = this.fullName;
        Integer num = this.ranking;
        Integer num2 = this.playerType;
        StringBuilder sbJ = b71.i.j("LeaderboardChallengePlayerDTO(userProfileId=", ", displayName=", str, l14, ", fullName=");
        fb1.c.u(num, str2, ", ranking=", ", playerType=", sbJ);
        return f3.i(sbJ, num2, ")");
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
        parcel.writeString(this.displayName);
        parcel.writeString(this.fullName);
        Integer num = this.ranking;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.playerType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/b0$a;", "", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public b0(Long l14, String str, String str2, Integer num, Integer num2) {
        this.userProfileId = l14;
        this.displayName = str;
        this.fullName = str2;
        this.ranking = num;
        this.playerType = num2;
    }
}
