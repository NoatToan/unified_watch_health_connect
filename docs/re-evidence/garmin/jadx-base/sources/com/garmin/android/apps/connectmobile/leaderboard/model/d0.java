package com.garmin.android.apps.connectmobile.leaderboard.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001c\u0010&R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/d0;", "Landroid/os/Parcelable;", "", "userProfileId", "", "startDate", "endDate", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/k0;", "wellnessLeaderBoardMetricType", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/a;", "activityLeaderBoardMetricType", "", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/f0;", "userStats", "", "userRank", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/leaderboard/model/k0;Lcom/garmin/android/apps/connectmobile/leaderboard/model/a;Ljava/util/List;Ljava/lang/Integer;)V", "a", "Ljava/lang/Long;", "getUserProfileId", "()Ljava/lang/Long;", "b", "Ljava/lang/String;", "getStartDate", "()Ljava/lang/String;", "c", "getEndDate", "d", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/k0;", "getWellnessLeaderBoardMetricType", "()Lcom/garmin/android/apps/connectmobile/leaderboard/model/k0;", JWKParameterNames.RSA_EXPONENT, "Lcom/garmin/android/apps/connectmobile/leaderboard/model/a;", "getActivityLeaderBoardMetricType", "()Lcom/garmin/android/apps/connectmobile/leaderboard/model/a;", "f", "Ljava/util/List;", "()Ljava/util/List;", "g", "Ljava/lang/Integer;", "getUserRank", "()Ljava/lang/Integer;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d0 implements Parcelable {
    public static final Parcelable.Creator<d0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfileId")
    private final Long userProfileId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startDate")
    private final String startDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endDate")
    private final String endDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("wellnessLeaderBoardMetricType")
    private final k0 wellnessLeaderBoardMetricType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityLeaderBoardMetricType")
    private final com.garmin.android.apps.connectmobile.leaderboard.model.a activityLeaderBoardMetricType;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userStats")
    private final List<f0> userStats;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userRank")
    private final Integer userRank;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d0> {
        @Override // android.os.Parcelable.Creator
        public final d0 createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            String string2 = parcel.readString();
            k0 k0VarValueOf = parcel.readInt() == 0 ? null : k0.valueOf(parcel.readString());
            com.garmin.android.apps.connectmobile.leaderboard.model.a aVarValueOf = parcel.readInt() == 0 ? null : com.garmin.android.apps.connectmobile.leaderboard.model.a.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(f0.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new d0(lValueOf, string, string2, k0VarValueOf, aVarValueOf, arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final d0[] newArray(int i14) {
            return new d0[i14];
        }
    }

    public /* synthetic */ d0(Long l14, String str, String str2, k0 k0Var, com.garmin.android.apps.connectmobile.leaderboard.model.a aVar, List list, Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : k0Var, (i14 & 16) != 0 ? null : aVar, (i14 & 32) != 0 ? null : list, (i14 & 64) != 0 ? null : num);
    }

    public static d0 b(d0 d0Var, List list) {
        Long l14 = d0Var.userProfileId;
        String str = d0Var.startDate;
        String str2 = d0Var.endDate;
        k0 k0Var = d0Var.wellnessLeaderBoardMetricType;
        com.garmin.android.apps.connectmobile.leaderboard.model.a aVar = d0Var.activityLeaderBoardMetricType;
        Integer num = d0Var.userRank;
        d0Var.getClass();
        return new d0(l14, str, str2, k0Var, aVar, list, num);
    }

    public final List<f0> d() {
        return this.userStats;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return p005kotlin.jvm.internal.s.g(this.userProfileId, d0Var.userProfileId) && p005kotlin.jvm.internal.s.g(this.startDate, d0Var.startDate) && p005kotlin.jvm.internal.s.g(this.endDate, d0Var.endDate) && this.wellnessLeaderBoardMetricType == d0Var.wellnessLeaderBoardMetricType && this.activityLeaderBoardMetricType == d0Var.activityLeaderBoardMetricType && p005kotlin.jvm.internal.s.g(this.userStats, d0Var.userStats) && p005kotlin.jvm.internal.s.g(this.userRank, d0Var.userRank);
    }

    public final int hashCode() {
        Long l14 = this.userProfileId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.startDate;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.endDate;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        k0 k0Var = this.wellnessLeaderBoardMetricType;
        int iHashCode4 = (iHashCode3 + (k0Var == null ? 0 : k0Var.hashCode())) * 31;
        com.garmin.android.apps.connectmobile.leaderboard.model.a aVar = this.activityLeaderBoardMetricType;
        int iHashCode5 = (iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        List<f0> list = this.userStats;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.userRank;
        return iHashCode6 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        Long l14 = this.userProfileId;
        String str = this.startDate;
        String str2 = this.endDate;
        k0 k0Var = this.wellnessLeaderBoardMetricType;
        com.garmin.android.apps.connectmobile.leaderboard.model.a aVar = this.activityLeaderBoardMetricType;
        List<f0> list = this.userStats;
        Integer num = this.userRank;
        StringBuilder sbJ = b71.i.j("LeaderboardDTO(userProfileId=", ", startDate=", str, l14, ", endDate=");
        sbJ.append(str2);
        sbJ.append(", wellnessLeaderBoardMetricType=");
        sbJ.append(k0Var);
        sbJ.append(", activityLeaderBoardMetricType=");
        sbJ.append(aVar);
        sbJ.append(", userStats=");
        sbJ.append(list);
        sbJ.append(", userRank=");
        return f3.i(sbJ, num, ")");
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
        parcel.writeString(this.startDate);
        parcel.writeString(this.endDate);
        k0 k0Var = this.wellnessLeaderBoardMetricType;
        if (k0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(k0Var.name());
        }
        com.garmin.android.apps.connectmobile.leaderboard.model.a aVar = this.activityLeaderBoardMetricType;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(aVar.name());
        }
        List<f0> list = this.userStats;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((f0) itO.next()).writeToParcel(parcel, i14);
            }
        }
        Integer num = this.userRank;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
    }

    public d0(Long l14, String str, String str2, k0 k0Var, com.garmin.android.apps.connectmobile.leaderboard.model.a aVar, List<f0> list, Integer num) {
        this.userProfileId = l14;
        this.startDate = str;
        this.endDate = str2;
        this.wellnessLeaderBoardMetricType = k0Var;
        this.activityLeaderBoardMetricType = aVar;
        this.userStats = list;
        this.userRank = num;
    }

    public d0() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
