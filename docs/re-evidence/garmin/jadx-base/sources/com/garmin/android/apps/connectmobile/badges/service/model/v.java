package com.garmin.android.apps.connectmobile.badges.service.model;

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
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B©\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\u0012\b\u0002\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b'\u0010\u001eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b(\u0010\u001eR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0018\u001a\u0004\b)\u0010\u001aR\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0018\u001a\u0004\b*\u0010\u001aR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0018\u001a\u0004\b+\u0010\u001aR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u001c\u001a\u0004\b,\u0010\u001eR\u001a\u0010\u0010\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\"\u001a\u0004\b\u0010\u0010$R\u001a\u0010\u0011\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b\u0011\u0010$R$\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b!\u00100¨\u00061"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/service/model/v;", "Landroid/os/Parcelable;", "", "userProfileId", "", "fullName", "displayName", "", "userPro", "profileImageUrlLarge", "profileImageUrlMedium", "profileImageUrlSmall", "userLevel", "userPoints", "nextLevelPoints", "lastLevelUpDate", "isLevelUpNotified", "isHasPrivate", "", "Lcom/garmin/android/apps/connectmobile/badges/service/model/m;", "badges", "<init>", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;ZZLjava/util/List;)V", "a", "I", "m", "()I", "b", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "c", "getDisplayName", "d", "Z", "getUserPro", "()Z", JWKParameterNames.RSA_EXPONENT, "g", "h", IntegerTokenConverter.CONVERTER_KEY, "j", JWKParameterNames.OCT_KEY_VALUE, "getNextLevelPoints", "getLastLevelUpDate", "l", JWKParameterNames.RSA_MODULUS, "Ljava/util/List;", "()Ljava/util/List;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfileId")
    private final int userProfileId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fullName")
    private final String fullName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayName")
    private final String displayName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userPro")
    private final boolean userPro;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageUrlLarge")
    private final String profileImageUrlLarge;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageUrlMedium")
    private final String profileImageUrlMedium;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageUrlSmall")
    private final String profileImageUrlSmall;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userLevel")
    private final int userLevel;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userPoint")
    private final int userPoints;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("levelPointThreshold")
    private final int nextLevelPoints;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("levelUpdateDate")
    private final String lastLevelUpDate;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("levelIsViewed")
    private final boolean isLevelUpNotified;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasPrivate")
    private final boolean isHasPrivate;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badges")
    private final List<m> badges;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<v> {
        @Override // android.os.Parcelable.Creator
        public final v createFromParcel(Parcel parcel) {
            boolean z14;
            ArrayList arrayList;
            parcel.getClass();
            int i14 = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z15 = false;
            if (parcel.readInt() != 0) {
                z15 = true;
                z14 = true;
            } else {
                z14 = true;
            }
            String string3 = parcel.readString();
            boolean z16 = z14;
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i15 = parcel.readInt();
            int i16 = parcel.readInt();
            int i17 = parcel.readInt();
            boolean z17 = z16;
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                z17 = z15;
            }
            if (parcel.readInt() == 0) {
                z17 = false;
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i18 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i18);
                int i19 = 0;
                while (i19 != i18) {
                    arrayList2.add(parcel.readInt() == 0 ? null : m.CREATOR.createFromParcel(parcel));
                    i19++;
                    i14 = i14;
                    string = string;
                }
                arrayList = arrayList2;
            }
            return new v(i14, string, string2, z15, string3, string4, string5, i15, i16, i17, string6, z17, z17, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final v[] newArray(int i14) {
            return new v[i14];
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30701a;

        static {
            int[] iArr = new int[com.garmin.android.apps.connectmobile.userprofile.model.k.values().length];
            try {
                iArr[com.garmin.android.apps.connectmobile.userprofile.model.k.PROFILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.userprofile.model.k.FRAMED_PROFILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_PROFILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.userprofile.model.k.PROFILE_FRIEND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.userprofile.model.k.FRAMED_FRIEND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.userprofile.model.k.PROFILE_THUMBNAIL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.userprofile.model.k.FRAMED_THUMBNAIL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_THUMBNAIL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f30701a = iArr;
        }
    }

    public /* synthetic */ v(int i14, String str, String str2, boolean z14, String str3, String str4, String str5, int i15, int i16, int i17, String str6, boolean z15, boolean z16, List list, int i18, p005kotlin.jvm.internal.j jVar) {
        this((i18 & 1) != 0 ? 0 : i14, (i18 & 2) != 0 ? null : str, (i18 & 4) != 0 ? null : str2, (i18 & 8) != 0 ? false : z14, (i18 & 16) != 0 ? null : str3, (i18 & 32) != 0 ? null : str4, (i18 & 64) != 0 ? null : str5, (i18 & 128) != 0 ? 0 : i15, (i18 & 256) != 0 ? 0 : i16, (i18 & 512) != 0 ? 0 : i17, (i18 & 1024) != 0 ? null : str6, (i18 & 2048) != 0 ? false : z15, (i18 & 4096) == 0 ? z16 : false, (i18 & 8192) != 0 ? null : list);
    }

    public static v b(v vVar, String str, String str2) {
        return new v(vVar.userProfileId, vVar.fullName, vVar.displayName, vVar.userPro, str, vVar.profileImageUrlMedium, str2, vVar.userLevel, vVar.userPoints, vVar.nextLevelPoints, vVar.lastLevelUpDate, vVar.isLevelUpNotified, vVar.isHasPrivate, vVar.badges);
    }

    public final List<m> d() {
        return this.badges;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.userProfileId == vVar.userProfileId && p005kotlin.jvm.internal.s.g(this.fullName, vVar.fullName) && p005kotlin.jvm.internal.s.g(this.displayName, vVar.displayName) && this.userPro == vVar.userPro && p005kotlin.jvm.internal.s.g(this.profileImageUrlLarge, vVar.profileImageUrlLarge) && p005kotlin.jvm.internal.s.g(this.profileImageUrlMedium, vVar.profileImageUrlMedium) && p005kotlin.jvm.internal.s.g(this.profileImageUrlSmall, vVar.profileImageUrlSmall) && this.userLevel == vVar.userLevel && this.userPoints == vVar.userPoints && this.nextLevelPoints == vVar.nextLevelPoints && p005kotlin.jvm.internal.s.g(this.lastLevelUpDate, vVar.lastLevelUpDate) && this.isLevelUpNotified == vVar.isLevelUpNotified && this.isHasPrivate == vVar.isHasPrivate && p005kotlin.jvm.internal.s.g(this.badges, vVar.badges);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getProfileImageUrlLarge() {
        return this.profileImageUrlLarge;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getProfileImageUrlMedium() {
        return this.profileImageUrlMedium;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.userProfileId) * 31;
        String str = this.fullName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.displayName;
        int iG = q6.f.g((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.userPro);
        String str3 = this.profileImageUrlLarge;
        int iHashCode3 = (iG + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.profileImageUrlMedium;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.profileImageUrlSmall;
        int iD = q2.d(this.nextLevelPoints, q2.d(this.userPoints, q2.d(this.userLevel, (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31), 31), 31);
        String str6 = this.lastLevelUpDate;
        int iG2 = q6.f.g(q6.f.g((iD + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.isLevelUpNotified), 31, this.isHasPrivate);
        List<m> list = this.badges;
        return iG2 + (list != null ? list.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getProfileImageUrlSmall() {
        return this.profileImageUrlSmall;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getUserLevel() {
        return this.userLevel;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getUserPoints() {
        return this.userPoints;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getUserProfileId() {
        return this.userProfileId;
    }

    public final b12.b o(com.garmin.android.apps.connectmobile.userprofile.model.k kVar) {
        String str;
        kVar.getClass();
        switch (b.f30701a[kVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
                str = this.profileImageUrlLarge;
                break;
            case 4:
            case 5:
            case 6:
                str = this.profileImageUrlMedium;
                break;
            case 7:
            case 8:
            case 9:
                str = this.profileImageUrlSmall;
                break;
            default:
                str = this.profileImageUrlLarge;
                break;
        }
        return new b12.b(str, null, null, null, null, 24, null);
    }

    public final String toString() {
        int i14 = this.userProfileId;
        String str = this.fullName;
        String str2 = this.displayName;
        boolean z14 = this.userPro;
        String str3 = this.profileImageUrlLarge;
        String str4 = this.profileImageUrlMedium;
        String str5 = this.profileImageUrlSmall;
        int i15 = this.userLevel;
        int i16 = this.userPoints;
        int i17 = this.nextLevelPoints;
        String str6 = this.lastLevelUpDate;
        boolean z15 = this.isLevelUpNotified;
        boolean z16 = this.isHasPrivate;
        List<m> list = this.badges;
        StringBuilder sbR = wr.g.r(i14, "UserProfileBadgeDTO(userProfileId=", ", fullName=", str, ", displayName=");
        v.h.C(str2, ", userPro=", ", profileImageUrlLarge=", sbR, z14);
        sn.a.t(sbR, str3, ", profileImageUrlMedium=", str4, ", profileImageUrlSmall=");
        q6.f.q(i15, str5, ", userLevel=", ", userPoints=", sbR);
        e0.m(i16, i17, ", nextLevelPoints=", ", lastLevelUpDate=", sbR);
        v.h.C(str6, ", isLevelUpNotified=", ", isHasPrivate=", sbR, z15);
        sbR.append(z16);
        sbR.append(", badges=");
        sbR.append(list);
        sbR.append(")");
        return sbR.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.userProfileId);
        parcel.writeString(this.fullName);
        parcel.writeString(this.displayName);
        parcel.writeInt(this.userPro ? 1 : 0);
        parcel.writeString(this.profileImageUrlLarge);
        parcel.writeString(this.profileImageUrlMedium);
        parcel.writeString(this.profileImageUrlSmall);
        parcel.writeInt(this.userLevel);
        parcel.writeInt(this.userPoints);
        parcel.writeInt(this.nextLevelPoints);
        parcel.writeString(this.lastLevelUpDate);
        parcel.writeInt(this.isLevelUpNotified ? 1 : 0);
        parcel.writeInt(this.isHasPrivate ? 1 : 0);
        List<m> list = this.badges;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            m mVar = (m) itO.next();
            if (mVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                mVar.writeToParcel(parcel, i14);
            }
        }
    }

    public v(int i14, String str, String str2, boolean z14, String str3, String str4, String str5, int i15, int i16, int i17, String str6, boolean z15, boolean z16, List<m> list) {
        this.userProfileId = i14;
        this.fullName = str;
        this.displayName = str2;
        this.userPro = z14;
        this.profileImageUrlLarge = str3;
        this.profileImageUrlMedium = str4;
        this.profileImageUrlSmall = str5;
        this.userLevel = i15;
        this.userPoints = i16;
        this.nextLevelPoints = i17;
        this.lastLevelUpDate = str6;
        this.isLevelUpNotified = z15;
        this.isHasPrivate = z16;
        this.badges = list;
    }

    public v() {
        this(0, null, null, false, null, null, null, 0, 0, 0, null, false, false, null, 16383, null);
    }
}
