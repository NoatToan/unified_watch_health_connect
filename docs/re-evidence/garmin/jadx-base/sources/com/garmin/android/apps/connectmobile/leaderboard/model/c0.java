package com.garmin.android.apps.connectmobile.leaderboard.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.userprofile.model.ProfileInfoJsonAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lc.u0;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001BÓ\u0001\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0018\b\u0002\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR$\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001cR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u001cR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010'\u001a\u0004\b*\u0010)R\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010&R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b.\u0010)R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b+\u00101R*\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u00102\u001a\u0004\b-\u00103¨\u00064"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/c0;", "Landroid/os/Parcelable;", "", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/a0;", "activeChallengeList", "invitedChallengeList", "Lot0/g;", "availableChallengeTypeList", "completedChallengeList", "availableVirtualChallengeList", "availableBadgeChallengeList", "", "weeklyLeaderboardConnectionCount", "", "weeklyLeaderboardWinnerImageUrl", "connectionLeaderBoardWinnerUserId", "weeklyLeaderboardFollowingCount", "followerLeaderBoardWinnerUserId", "", "joinedActiveAutoChallenge", "", "Lcom/garmin/android/apps/connectmobile/userprofile/model/l;", "multipleProfileInfoMap", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)V", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", IntegerTokenConverter.CONVERTER_KEY, "c", "f", "d", "h", JWKParameterNames.RSA_EXPONENT, "g", "I", "getWeeklyLeaderboardConnectionCount", "()I", "Ljava/lang/String;", "getWeeklyLeaderboardWinnerImageUrl", "()Ljava/lang/String;", "getConnectionLeaderBoardWinnerUserId", "j", "m", JWKParameterNames.OCT_KEY_VALUE, "getFollowerLeaderBoardWinnerUserId", "l", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Ljava/util/Map;", "()Ljava/util/Map;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c0 implements Parcelable {
    public static final Parcelable.Creator<c0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activeChallengeList")
    private final List<a0> activeChallengeList;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("challengeInviteList")
    private final List<a0> invitedChallengeList;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("availableChallengeTypeList")
    private final List<ot0.g> availableChallengeTypeList;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("completedChallengeList")
    private final List<a0> completedChallengeList;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("availableVirtualChallengeList")
    private final List<a0> availableVirtualChallengeList;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("availableBadgeChallengeList")
    private final List<a0> availableBadgeChallengeList;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("connectionCount")
    private final int weeklyLeaderboardConnectionCount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("connectionLeaderBoardWinnerImgUrl")
    private final String weeklyLeaderboardWinnerImageUrl;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("connectionLeaderBoardWinnerUserId")
    private final String connectionLeaderBoardWinnerUserId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("followingCount")
    private final int weeklyLeaderboardFollowingCount;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("followerLeaderBoardWinnerUserId")
    private final String followerLeaderBoardWinnerUserId;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("joinedActiveAutoChallenge")
    private final Boolean joinedActiveAutoChallenge;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileInfos")
    @JsonAdapter(ProfileInfoJsonAdapter.class)
    private final Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> multipleProfileInfoMap;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c0> {
        @Override // android.os.Parcelable.Creator
        public final c0 createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            parcel.getClass();
            LinkedHashMap linkedHashMap = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(a0.CREATOR, parcel, arrayList7, iA, 1);
                }
                arrayList = arrayList7;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i15);
                int iA2 = 0;
                while (iA2 != i15) {
                    iA2 = kg.f.a(a0.CREATOR, parcel, arrayList8, iA2, 1);
                }
                arrayList2 = arrayList8;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i16 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(i16);
                for (int i17 = 0; i17 != i16; i17++) {
                    arrayList9.add(parcel.readInt() == 0 ? null : ot0.g.valueOf(parcel.readString()));
                }
                arrayList3 = arrayList9;
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i18 = parcel.readInt();
                ArrayList arrayList10 = new ArrayList(i18);
                int iA3 = 0;
                while (iA3 != i18) {
                    iA3 = kg.f.a(a0.CREATOR, parcel, arrayList10, iA3, 1);
                }
                arrayList4 = arrayList10;
            }
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int i19 = parcel.readInt();
                ArrayList arrayList11 = new ArrayList(i19);
                int iA4 = 0;
                while (iA4 != i19) {
                    iA4 = kg.f.a(a0.CREATOR, parcel, arrayList11, iA4, 1);
                }
                arrayList5 = arrayList11;
            }
            if (parcel.readInt() == 0) {
                arrayList6 = null;
            } else {
                int i24 = parcel.readInt();
                ArrayList arrayList12 = new ArrayList(i24);
                int iA5 = 0;
                while (iA5 != i24) {
                    iA5 = kg.f.a(a0.CREATOR, parcel, arrayList12, iA5, 1);
                }
                arrayList6 = arrayList12;
            }
            int i25 = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i26 = parcel.readInt();
            String string3 = parcel.readString();
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() != 0) {
                int i27 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i27);
                for (int i28 = 0; i28 != i27; i28++) {
                    linkedHashMap.put(Integer.valueOf(parcel.readInt()), parcel.readParcelable(c0.class.getClassLoader()));
                }
            }
            return new c0(arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, i25, string, string2, i26, string3, boolValueOf, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final c0[] newArray(int i14) {
            return new c0[i14];
        }
    }

    public /* synthetic */ c0(List list, List list2, List list3, List list4, List list5, List list6, int i14, String str, String str2, int i15, String str3, Boolean bool, Map map, int i16, p005kotlin.jvm.internal.j jVar) {
        this((i16 & 1) != 0 ? null : list, (i16 & 2) != 0 ? null : list2, (i16 & 4) != 0 ? null : list3, (i16 & 8) != 0 ? null : list4, (i16 & 16) != 0 ? null : list5, (i16 & 32) != 0 ? null : list6, (i16 & 64) != 0 ? 0 : i14, (i16 & 128) != 0 ? null : str, (i16 & 256) != 0 ? null : str2, (i16 & 512) == 0 ? i15 : 0, (i16 & 1024) != 0 ? null : str3, (i16 & 2048) != 0 ? Boolean.FALSE : bool, (i16 & 4096) != 0 ? null : map);
    }

    public final List<a0> b() {
        return this.activeChallengeList;
    }

    public final List<a0> d() {
        return this.availableBadgeChallengeList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return p005kotlin.jvm.internal.s.g(this.activeChallengeList, c0Var.activeChallengeList) && p005kotlin.jvm.internal.s.g(this.invitedChallengeList, c0Var.invitedChallengeList) && p005kotlin.jvm.internal.s.g(this.availableChallengeTypeList, c0Var.availableChallengeTypeList) && p005kotlin.jvm.internal.s.g(this.completedChallengeList, c0Var.completedChallengeList) && p005kotlin.jvm.internal.s.g(this.availableVirtualChallengeList, c0Var.availableVirtualChallengeList) && p005kotlin.jvm.internal.s.g(this.availableBadgeChallengeList, c0Var.availableBadgeChallengeList) && this.weeklyLeaderboardConnectionCount == c0Var.weeklyLeaderboardConnectionCount && p005kotlin.jvm.internal.s.g(this.weeklyLeaderboardWinnerImageUrl, c0Var.weeklyLeaderboardWinnerImageUrl) && p005kotlin.jvm.internal.s.g(this.connectionLeaderBoardWinnerUserId, c0Var.connectionLeaderBoardWinnerUserId) && this.weeklyLeaderboardFollowingCount == c0Var.weeklyLeaderboardFollowingCount && p005kotlin.jvm.internal.s.g(this.followerLeaderBoardWinnerUserId, c0Var.followerLeaderBoardWinnerUserId) && p005kotlin.jvm.internal.s.g(this.joinedActiveAutoChallenge, c0Var.joinedActiveAutoChallenge) && p005kotlin.jvm.internal.s.g(this.multipleProfileInfoMap, c0Var.multipleProfileInfoMap);
    }

    public final List<ot0.g> f() {
        return this.availableChallengeTypeList;
    }

    public final List<a0> g() {
        return this.availableVirtualChallengeList;
    }

    public final List<a0> h() {
        return this.completedChallengeList;
    }

    public final int hashCode() {
        List<a0> list = this.activeChallengeList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<a0> list2 = this.invitedChallengeList;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<ot0.g> list3 = this.availableChallengeTypeList;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<a0> list4 = this.completedChallengeList;
        int iHashCode4 = (iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<a0> list5 = this.availableVirtualChallengeList;
        int iHashCode5 = (iHashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<a0> list6 = this.availableBadgeChallengeList;
        int iD = q2.d(this.weeklyLeaderboardConnectionCount, (iHashCode5 + (list6 == null ? 0 : list6.hashCode())) * 31, 31);
        String str = this.weeklyLeaderboardWinnerImageUrl;
        int iHashCode6 = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.connectionLeaderBoardWinnerUserId;
        int iD2 = q2.d(this.weeklyLeaderboardFollowingCount, (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.followerLeaderBoardWinnerUserId;
        int iHashCode7 = (iD2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.joinedActiveAutoChallenge;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> map = this.multipleProfileInfoMap;
        return iHashCode8 + (map != null ? map.hashCode() : 0);
    }

    public final List<a0> i() {
        return this.invitedChallengeList;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Boolean getJoinedActiveAutoChallenge() {
        return this.joinedActiveAutoChallenge;
    }

    public final Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> k() {
        return this.multipleProfileInfoMap;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getWeeklyLeaderboardFollowingCount() {
        return this.weeklyLeaderboardFollowingCount;
    }

    public final String o() {
        com.garmin.android.apps.connectmobile.userprofile.model.l lVar;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        String str = this.followerLeaderBoardWinnerUserId;
        if (str != null) {
            int i14 = Integer.parseInt(str);
            Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> map = this.multipleProfileInfoMap;
            String str2 = (map == null || (lVar = map.get(Integer.valueOf(i14))) == null || (profileImageUrls = lVar.getProfileImageUrls()) == null) ? null : profileImageUrls.f46876e;
            if (str2 != null) {
                return str2;
            }
        }
        return this.weeklyLeaderboardWinnerImageUrl;
    }

    public final String toString() {
        List<a0> list = this.activeChallengeList;
        List<a0> list2 = this.invitedChallengeList;
        List<ot0.g> list3 = this.availableChallengeTypeList;
        List<a0> list4 = this.completedChallengeList;
        List<a0> list5 = this.availableVirtualChallengeList;
        List<a0> list6 = this.availableBadgeChallengeList;
        int i14 = this.weeklyLeaderboardConnectionCount;
        String str = this.weeklyLeaderboardWinnerImageUrl;
        String str2 = this.connectionLeaderBoardWinnerUserId;
        int i15 = this.weeklyLeaderboardFollowingCount;
        String str3 = this.followerLeaderBoardWinnerUserId;
        Boolean bool = this.joinedActiveAutoChallenge;
        Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> map = this.multipleProfileInfoMap;
        StringBuilder sbK = f3.k("LeaderboardChallengeResultDTO(activeChallengeList=", ", invitedChallengeList=", ", availableChallengeTypeList=", list, list2);
        n23.j.z(sbK, list3, ", completedChallengeList=", list4, ", availableVirtualChallengeList=");
        n23.j.z(sbK, list5, ", availableBadgeChallengeList=", list6, ", weeklyLeaderboardConnectionCount=");
        wr.g.t(i14, ", weeklyLeaderboardWinnerImageUrl=", str, ", connectionLeaderBoardWinnerUserId=", sbK);
        q6.f.q(i15, str2, ", weeklyLeaderboardFollowingCount=", ", followerLeaderBoardWinnerUserId=", sbK);
        b71.i.w(sbK, str3, ", joinedActiveAutoChallenge=", bool, ", multipleProfileInfoMap=");
        return am.j.s(sbK, map, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        List<a0> list = this.activeChallengeList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((a0) itO.next()).writeToParcel(parcel, i14);
            }
        }
        List<a0> list2 = this.invitedChallengeList;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO2 = u0.o(parcel, list2, 1);
            while (itO2.hasNext()) {
                ((a0) itO2.next()).writeToParcel(parcel, i14);
            }
        }
        List<ot0.g> list3 = this.availableChallengeTypeList;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO3 = u0.o(parcel, list3, 1);
            while (itO3.hasNext()) {
                ot0.g gVar = (ot0.g) itO3.next();
                if (gVar == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(gVar.name());
                }
            }
        }
        List<a0> list4 = this.completedChallengeList;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO4 = u0.o(parcel, list4, 1);
            while (itO4.hasNext()) {
                ((a0) itO4.next()).writeToParcel(parcel, i14);
            }
        }
        List<a0> list5 = this.availableVirtualChallengeList;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO5 = u0.o(parcel, list5, 1);
            while (itO5.hasNext()) {
                ((a0) itO5.next()).writeToParcel(parcel, i14);
            }
        }
        List<a0> list6 = this.availableBadgeChallengeList;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO6 = u0.o(parcel, list6, 1);
            while (itO6.hasNext()) {
                ((a0) itO6.next()).writeToParcel(parcel, i14);
            }
        }
        parcel.writeInt(this.weeklyLeaderboardConnectionCount);
        parcel.writeString(this.weeklyLeaderboardWinnerImageUrl);
        parcel.writeString(this.connectionLeaderBoardWinnerUserId);
        parcel.writeInt(this.weeklyLeaderboardFollowingCount);
        parcel.writeString(this.followerLeaderBoardWinnerUserId);
        Boolean bool = this.joinedActiveAutoChallenge;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> map = this.multipleProfileInfoMap;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> entry : map.entrySet()) {
            parcel.writeInt(entry.getKey().intValue());
            parcel.writeParcelable(entry.getValue(), i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c0(List<a0> list, List<a0> list2, List<? extends ot0.g> list3, List<a0> list4, List<a0> list5, List<a0> list6, int i14, String str, String str2, int i15, String str3, Boolean bool, Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> map) {
        this.activeChallengeList = list;
        this.invitedChallengeList = list2;
        this.availableChallengeTypeList = list3;
        this.completedChallengeList = list4;
        this.availableVirtualChallengeList = list5;
        this.availableBadgeChallengeList = list6;
        this.weeklyLeaderboardConnectionCount = i14;
        this.weeklyLeaderboardWinnerImageUrl = str;
        this.connectionLeaderBoardWinnerUserId = str2;
        this.weeklyLeaderboardFollowingCount = i15;
        this.followerLeaderBoardWinnerUserId = str3;
        this.joinedActiveAutoChallenge = bool;
        this.multipleProfileInfoMap = map;
    }

    public c0() {
        this(null, null, null, null, null, null, 0, null, null, 0, null, null, null, 8191, null);
    }
}
