package com.garmin.android.apps.connectmobile.leaderboard.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u0013\u0010\u001f¨\u0006 "}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/j0;", "Landroid/os/Parcelable;", "", "teamName", "teamUuid", "profileImageUrl", "", "teamRanking", "", FirebaseAnalytics.Param.SCORE, "", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/i0;", "players", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/util/List;)V", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "b", IntegerTokenConverter.CONVERTER_KEY, "c", "d", "Ljava/lang/Integer;", "h", "()Ljava/lang/Integer;", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Double;", "f", "()Ljava/lang/Double;", "Ljava/util/List;", "()Ljava/util/List;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j0 implements Parcelable {
    public static final Parcelable.Creator<j0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("teamName")
    private final String teamName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("teamUuid")
    private final String teamUuid;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImgUrl")
    private final String profileImageUrl;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("teamRanking")
    private final Integer teamRanking;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName(FirebaseAnalytics.Param.SCORE)
    private final Double score;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("players")
    private final List<i0> players;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<j0> {
        @Override // android.os.Parcelable.Creator
        public final j0 createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(i0.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            return new j0(string, string2, string3, numValueOf, dValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final j0[] newArray(int i14) {
            return new j0[i14];
        }
    }

    public /* synthetic */ j0(String str, String str2, String str3, Integer num, Double d14, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : num, (i14 & 16) != 0 ? null : d14, (i14 & 32) != 0 ? null : list);
    }

    public final List<i0> b() {
        return this.players;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getProfileImageUrl() {
        return this.profileImageUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return p005kotlin.jvm.internal.s.g(this.teamName, j0Var.teamName) && p005kotlin.jvm.internal.s.g(this.teamUuid, j0Var.teamUuid) && p005kotlin.jvm.internal.s.g(this.profileImageUrl, j0Var.profileImageUrl) && p005kotlin.jvm.internal.s.g(this.teamRanking, j0Var.teamRanking) && p005kotlin.jvm.internal.s.g(this.score, j0Var.score) && p005kotlin.jvm.internal.s.g(this.players, j0Var.players);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Double getScore() {
        return this.score;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTeamName() {
        return this.teamName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Integer getTeamRanking() {
        return this.teamRanking;
    }

    public final int hashCode() {
        String str = this.teamName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.teamUuid;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.profileImageUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.teamRanking;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Double d14 = this.score;
        int iHashCode5 = (iHashCode4 + (d14 == null ? 0 : d14.hashCode())) * 31;
        List<i0> list = this.players;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTeamUuid() {
        return this.teamUuid;
    }

    public final String toString() {
        String str = this.teamName;
        String str2 = this.teamUuid;
        String str3 = this.profileImageUrl;
        Integer num = this.teamRanking;
        Double d14 = this.score;
        List<i0> list = this.players;
        StringBuilder sbI = p6.b.i("VivoKidTeamDTO(teamName=", str, ", teamUuid=", str2, ", profileImageUrl=");
        fb1.c.u(num, str3, ", teamRanking=", ", score=", sbI);
        sbI.append(d14);
        sbI.append(", players=");
        sbI.append(list);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.teamName);
        parcel.writeString(this.teamUuid);
        parcel.writeString(this.profileImageUrl);
        Integer num = this.teamRanking;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Double d14 = this.score;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        List<i0> list = this.players;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            ((i0) itO.next()).writeToParcel(parcel, i14);
        }
    }

    public j0(String str, String str2, String str3, Integer num, Double d14, List<i0> list) {
        this.teamName = str;
        this.teamUuid = str2;
        this.profileImageUrl = str3;
        this.teamRanking = num;
        this.score = d14;
        this.players = list;
    }

    public j0() {
        this(null, null, null, null, null, null, 63, null);
    }
}
