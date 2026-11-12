package com.garmin.android.apps.connectmobile.userprofile.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import ds.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b?\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bBÁ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001c\u001a\u0004\b(\u0010\u001e\"\u0004\b)\u0010 R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u0010\u001c\u001a\u0004\b1\u0010\u001e\"\u0004\b2\u0010 R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u0010\u001c\u001a\u0004\b4\u0010\u001e\"\u0004\b5\u0010 R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b6\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b9\u00108R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b:\u00108R\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\b;\u0010C\"\u0004\bD\u0010ER*\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\b3\u0010H\"\u0004\bI\u0010JR$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\b7\u0010M\"\u0004\bN\u0010OR$\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010L\u001a\u0004\b6\u0010M\"\u0004\bP\u0010OR$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bQ\u0010L\u001a\u0004\b*\u0010M\"\u0004\bR\u0010O¨\u0006S"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/model/q;", "Landroid/os/Parcelable;", "", "userId", "Lcom/garmin/android/apps/connectmobile/userprofile/model/c;", "userInfo", "connectionRequestId", "", "connectionRequestorId", "connectionCount", "mutualConnectionCount", "userConnectionStatus", "", "profileVisibility", "activityVisibility", "badgesVisibility", "", "hasPremiumSocialIcon", "Lhi0/a;", "userFollowProfile", "", "followByInfo", "followingCount", "followerCount", "followByCount", "<init>", "(ILcom/garmin/android/apps/connectmobile/userprofile/model/c;ILjava/lang/Long;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLhi0/a;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "I", "o", "()I", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "(I)V", "b", "Lcom/garmin/android/apps/connectmobile/userprofile/model/c;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "()Lcom/garmin/android/apps/connectmobile/userprofile/model/c;", "u", "(Lcom/garmin/android/apps/connectmobile/userprofile/model/c;)V", "c", "getConnectionRequestId", "setConnectionRequestId", "d", "Ljava/lang/Long;", "getConnectionRequestorId", "()Ljava/lang/Long;", "setConnectionRequestorId", "(Ljava/lang/Long;)V", JWKParameterNames.RSA_EXPONENT, "getConnectionCount", "setConnectionCount", "f", "getMutualConnectionCount", "setMutualConnectionCount", "g", "h", "Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "j", JWKParameterNames.OCT_KEY_VALUE, "Z", "getHasPremiumSocialIcon", "()Z", "setHasPremiumSocialIcon", "(Z)V", "l", "Lhi0/a;", "()Lhi0/a;", "setUserFollowProfile", "(Lhi0/a;)V", "m", "Ljava/util/List;", "()Ljava/util/List;", "setFollowByInfo", "(Ljava/util/List;)V", JWKParameterNames.RSA_MODULUS, "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "setFollowingCount", "(Ljava/lang/Integer;)V", "setFollowerCount", "p", "setFollowByCount", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q implements Parcelable {
    public static final Parcelable.Creator<q> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userId")
    private int userId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userInfo")
    private c userInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("connectionRequestId")
    private int connectionRequestId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("connectionRequestorId")
    private Long connectionRequestorId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalConnection")
    private int connectionCount;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("mutualConnection")
    private int mutualConnectionCount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userConnectionStatus")
    private int userConnectionStatus;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileVisibility")
    private String profileVisibility;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityVisibility")
    private String activityVisibility;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeVisibility")
    private String badgesVisibility;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasPremiumSocialIcon")
    private boolean hasPremiumSocialIcon;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userFollowProfile")
    private hi0.a userFollowProfile;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("followByInfo")
    private List<hi0.a> followByInfo;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("followingCount")
    private Integer followingCount;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("followerCount")
    private Integer followerCount;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("followByCount")
    private Integer followByCount;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<q> {
        @Override // android.os.Parcelable.Creator
        public final q createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            int i14 = parcel.readInt();
            c cVarCreateFromParcel = parcel.readInt() == 0 ? null : c.CREATOR.createFromParcel(parcel);
            int i15 = parcel.readInt();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            int i16 = parcel.readInt();
            Long l14 = lValueOf;
            int i17 = parcel.readInt();
            int i18 = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z14 = parcel.readInt() != 0;
            hi0.a aVar = (hi0.a) parcel.readParcelable(q.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i19 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i19);
                int iD = 0;
                while (iD != i19) {
                    iD = u0.d(q.class, parcel, arrayList2, iD, 1);
                    cVarCreateFromParcel = cVarCreateFromParcel;
                }
                arrayList = arrayList2;
            }
            return new q(i14, cVarCreateFromParcel, i15, l14, i16, i17, i18, string, string2, string3, z14, aVar, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final q[] newArray(int i14) {
            return new q[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public /* synthetic */ q(int i14, c cVar, int i15, Long l14, int i16, int i17, int i18, String str, String str2, String str3, boolean z14, hi0.a aVar, List list, Integer num, Integer num2, Integer num3, int i19, p005kotlin.jvm.internal.j jVar) {
        this((i19 & 1) != 0 ? 0 : i14, (i19 & 2) != 0 ? null : cVar, (i19 & 4) != 0 ? 0 : i15, (i19 & 8) != 0 ? null : l14, (i19 & 16) != 0 ? 0 : i16, (i19 & 32) != 0 ? 0 : i17, (i19 & 64) != 0 ? 0 : i18, (i19 & 128) != 0 ? null : str, (i19 & 256) != 0 ? null : str2, (i19 & 512) != 0 ? null : str3, (i19 & 1024) == 0 ? z14 : false, (i19 & 2048) != 0 ? null : aVar, (i19 & 4096) != 0 ? null : list, (i19 & 8192) != 0 ? null : num, (i19 & 16384) != 0 ? null : num2, (i19 & 32768) != 0 ? null : num3);
    }

    public final n b() {
        n.a aVar = n.f46925b;
        String str = this.badgesVisibility;
        aVar.getClass();
        return n.a.a(str);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getFollowByCount() {
        return this.followByCount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.userId == qVar.userId && s.g(this.userInfo, qVar.userInfo) && this.connectionRequestId == qVar.connectionRequestId && s.g(this.connectionRequestorId, qVar.connectionRequestorId) && this.connectionCount == qVar.connectionCount && this.mutualConnectionCount == qVar.mutualConnectionCount && this.userConnectionStatus == qVar.userConnectionStatus && s.g(this.profileVisibility, qVar.profileVisibility) && s.g(this.activityVisibility, qVar.activityVisibility) && s.g(this.badgesVisibility, qVar.badgesVisibility) && this.hasPremiumSocialIcon == qVar.hasPremiumSocialIcon && s.g(this.userFollowProfile, qVar.userFollowProfile) && s.g(this.followByInfo, qVar.followByInfo) && s.g(this.followingCount, qVar.followingCount) && s.g(this.followerCount, qVar.followerCount) && s.g(this.followByCount, qVar.followByCount);
    }

    public final List<hi0.a> f() {
        return this.followByInfo;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getFollowerCount() {
        return this.followerCount;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Integer getFollowingCount() {
        return this.followingCount;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.userId) * 31;
        c cVar = this.userInfo;
        int iD = q2.d(this.connectionRequestId, (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31, 31);
        Long l14 = this.connectionRequestorId;
        int iD2 = q2.d(this.userConnectionStatus, q2.d(this.mutualConnectionCount, q2.d(this.connectionCount, (iD + (l14 == null ? 0 : l14.hashCode())) * 31, 31), 31), 31);
        String str = this.profileVisibility;
        int iHashCode2 = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.activityVisibility;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.badgesVisibility;
        int iG = q6.f.g((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.hasPremiumSocialIcon);
        hi0.a aVar = this.userFollowProfile;
        int iHashCode4 = (iG + (aVar == null ? 0 : aVar.hashCode())) * 31;
        List<hi0.a> list = this.followByInfo;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.followingCount;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.followerCount;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.followByCount;
        return iHashCode7 + (num3 != null ? num3.hashCode() : 0);
    }

    public final n i() {
        n.a aVar = n.f46925b;
        String str = this.profileVisibility;
        aVar.getClass();
        return n.a.a(str);
    }

    public final Long j() {
        hi0.e eVarD;
        hi0.c receivedRequest;
        Integer numB;
        hi0.a aVar = this.userFollowProfile;
        if (aVar == null || (eVarD = aVar.getFollowStatus()) == null || (receivedRequest = eVarD.getReceivedRequest()) == null || (numB = receivedRequest.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String()) == null) {
            return null;
        }
        return Long.valueOf(numB.intValue());
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final hi0.a getUserFollowProfile() {
        return this.userFollowProfile;
    }

    public final hi0.e m() {
        hi0.a aVar = this.userFollowProfile;
        if (aVar != null) {
            return aVar.getFollowStatus();
        }
        return null;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final c getUserInfo() {
        return this.userInfo;
    }

    public final boolean r() {
        Object obj = KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
        obj.getClass();
        if (((f12.b) obj).getUserProfilePk() == this.userId) {
            return true;
        }
        if (i() == n.PRIVATE) {
            return false;
        }
        hi0.e eVarM = m();
        hi0.e.b relationshipStatus = eVarM != null ? eVarM.getRelationshipStatus() : null;
        if (relationshipStatus == hi0.e.b.MUTUAL || relationshipStatus == hi0.e.b.FOLLOWING) {
            return true;
        }
        if (relationshipStatus != hi0.e.b.NONE) {
            if ((eVarM != null ? eVarM.getSentRequest() : null) == null) {
                if ((eVarM != null ? eVarM.getReceivedRequest() : null) == null) {
                    return i().compareTo(n.CONNECTION) > 0;
                }
            }
        }
        return i().compareTo(n.CONNECTION) > 0;
    }

    public final void s(String str) {
        this.profileVisibility = str;
    }

    public final void t(int i14) {
        this.userId = i14;
    }

    public final String toString() {
        int i14 = this.userId;
        c cVar = this.userInfo;
        int i15 = this.connectionRequestId;
        Long l14 = this.connectionRequestorId;
        int i16 = this.connectionCount;
        int i17 = this.mutualConnectionCount;
        int i18 = this.userConnectionStatus;
        String str = this.profileVisibility;
        String str2 = this.activityVisibility;
        String str3 = this.badgesVisibility;
        boolean z14 = this.hasPremiumSocialIcon;
        hi0.a aVar = this.userFollowProfile;
        List<hi0.a> list = this.followByInfo;
        Integer num = this.followingCount;
        Integer num2 = this.followerCount;
        Integer num3 = this.followByCount;
        StringBuilder sb3 = new StringBuilder("UserProfileInfoDTO(userId=");
        sb3.append(i14);
        sb3.append(", userInfo=");
        sb3.append(cVar);
        sb3.append(", connectionRequestId=");
        sb3.append(i15);
        sb3.append(", connectionRequestorId=");
        sb3.append(l14);
        sb3.append(", connectionCount=");
        e0.m(i16, i17, ", mutualConnectionCount=", ", userConnectionStatus=", sb3);
        wr.g.t(i18, ", profileVisibility=", str, ", activityVisibility=", sb3);
        sn.a.t(sb3, str2, ", badgesVisibility=", str3, ", hasPremiumSocialIcon=");
        sb3.append(z14);
        sb3.append(", userFollowProfile=");
        sb3.append(aVar);
        sb3.append(", followByInfo=");
        sb3.append(list);
        sb3.append(", followingCount=");
        sb3.append(num);
        sb3.append(", followerCount=");
        return b71.i.h(sb3, num2, ", followByCount=", num3, ")");
    }

    public final void u(c cVar) {
        this.userInfo = cVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.userId);
        c cVar = this.userInfo;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cVar.writeToParcel(parcel, i14);
        }
        parcel.writeInt(this.connectionRequestId);
        Long l14 = this.connectionRequestorId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeInt(this.connectionCount);
        parcel.writeInt(this.mutualConnectionCount);
        parcel.writeInt(this.userConnectionStatus);
        parcel.writeString(this.profileVisibility);
        parcel.writeString(this.activityVisibility);
        parcel.writeString(this.badgesVisibility);
        parcel.writeInt(this.hasPremiumSocialIcon ? 1 : 0);
        parcel.writeParcelable(this.userFollowProfile, i14);
        List<hi0.a> list = this.followByInfo;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                parcel.writeParcelable((Parcelable) itO.next(), i14);
            }
        }
        Integer num = this.followingCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.followerCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Integer num3 = this.followByCount;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/model/q$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public q(int i14, c cVar, int i15, Long l14, int i16, int i17, int i18, String str, String str2, String str3, boolean z14, hi0.a aVar, List<hi0.a> list, Integer num, Integer num2, Integer num3) {
        this.userId = i14;
        this.userInfo = cVar;
        this.connectionRequestId = i15;
        this.connectionRequestorId = l14;
        this.connectionCount = i16;
        this.mutualConnectionCount = i17;
        this.userConnectionStatus = i18;
        this.profileVisibility = str;
        this.activityVisibility = str2;
        this.badgesVisibility = str3;
        this.hasPremiumSocialIcon = z14;
        this.userFollowProfile = aVar;
        this.followByInfo = list;
        this.followingCount = num;
        this.followerCount = num2;
        this.followByCount = num3;
    }

    public q() {
        this(0, null, 0, null, 0, 0, 0, null, null, null, false, null, null, null, null, null, 65535, null);
    }
}
