package com.garmin.android.apps.connectmobile.badges.service.model;

import android.os.Parcel;
import android.os.Parcelable;
import c22.j0;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001d\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/service/model/p;", "Landroid/os/Parcelable;", "", "userProfileId", "", "fullName", "displayName", "profileImageUrlMedium", "profileImageUrlSmall", "userLevel", "badgeEarnedDate", "", "badgeId", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;)V", "a", "Ljava/lang/Long;", "h", "()Ljava/lang/Long;", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "getDisplayName", "getProfileImageUrlMedium", JWKParameterNames.RSA_EXPONENT, "getProfileImageUrlSmall", "f", "g", "getBadgeEarnedDate", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfileId")
    private final Long userProfileId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fullName")
    private final String fullName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayName")
    private final String displayName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageUrlMedium")
    private final String profileImageUrlMedium;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageUrlSmall")
    private final String profileImageUrlSmall;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userLevel")
    private final Long userLevel;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeEarnedDate")
    private final String badgeEarnedDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient Integer f30652h;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<p> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final p createFromParcel(Parcel parcel) {
            Long lValueOf;
            Long l14;
            String str;
            Integer numValueOf;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                lValueOf = null;
                l14 = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
                l14 = null;
            }
            String string = parcel.readString();
            Long l15 = l14;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Long lValueOf2 = parcel.readInt() == 0 ? l15 : Long.valueOf(parcel.readLong());
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = l15;
                str = string5;
            } else {
                str = string5;
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new p(lValueOf, string, string2, string3, string4, lValueOf2, str, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final p[] newArray(int i14) {
            return new p[i14];
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30653a;

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
            f30653a = iArr;
        }
    }

    public /* synthetic */ p(Long l14, String str, String str2, String str3, String str4, Long l15, String str5, Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? null : l15, (i14 & 64) != 0 ? null : str5, (i14 & 128) != 0 ? null : num);
    }

    public static p b(p pVar, String str, Integer num, int i14) {
        Long l14 = pVar.userProfileId;
        String str2 = pVar.fullName;
        String str3 = pVar.displayName;
        if ((i14 & 8) != 0) {
            str = pVar.profileImageUrlMedium;
        }
        String str4 = str;
        String str5 = pVar.profileImageUrlSmall;
        Long l15 = pVar.userLevel;
        String str6 = pVar.badgeEarnedDate;
        if ((i14 & 128) != 0) {
            num = pVar.f30652h;
        }
        pVar.getClass();
        return new p(l14, str2, str3, str4, str5, l15, str6, num);
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
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return p005kotlin.jvm.internal.s.g(this.userProfileId, pVar.userProfileId) && p005kotlin.jvm.internal.s.g(this.fullName, pVar.fullName) && p005kotlin.jvm.internal.s.g(this.displayName, pVar.displayName) && p005kotlin.jvm.internal.s.g(this.profileImageUrlMedium, pVar.profileImageUrlMedium) && p005kotlin.jvm.internal.s.g(this.profileImageUrlSmall, pVar.profileImageUrlSmall) && p005kotlin.jvm.internal.s.g(this.userLevel, pVar.userLevel) && p005kotlin.jvm.internal.s.g(this.badgeEarnedDate, pVar.badgeEarnedDate) && p005kotlin.jvm.internal.s.g(this.f30652h, pVar.f30652h);
    }

    public final DateTime f() {
        return j0.N(this.badgeEarnedDate, true);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getUserLevel() {
        return this.userLevel;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Long getUserProfileId() {
        return this.userProfileId;
    }

    public final int hashCode() {
        Long l14 = this.userProfileId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.fullName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.displayName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.profileImageUrlMedium;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.profileImageUrlSmall;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l15 = this.userLevel;
        int iHashCode6 = (iHashCode5 + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str5 = this.badgeEarnedDate;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f30652h;
        return iHashCode7 + (num != null ? num.hashCode() : 0);
    }

    public final b12.b i(com.garmin.android.apps.connectmobile.userprofile.model.k kVar, Integer num) {
        String str;
        kVar.getClass();
        f12.u uVarA = num != null ? f12.u.a(num.intValue()) : null;
        switch (b.f30653a[kVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
                str = this.profileImageUrlMedium;
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
                str = this.profileImageUrlMedium;
                break;
        }
        return new b12.b(str, null, uVarA, null, null, 24, null);
    }

    public final String toString() {
        Long l14 = this.userProfileId;
        String str = this.fullName;
        String str2 = this.displayName;
        String str3 = this.profileImageUrlMedium;
        String str4 = this.profileImageUrlSmall;
        Long l15 = this.userLevel;
        String str5 = this.badgeEarnedDate;
        StringBuilder sbJ = b71.i.j("FollowingProfileBadgeDTO(userProfileId=", ", fullName=", str, l14, ", displayName=");
        sn.a.t(sbJ, str2, ", profileImageUrlMedium=", str3, ", profileImageUrlSmall=");
        n23.j.q(l15, str4, ", userLevel=", ", badgeEarnedDate=", sbJ);
        sbJ.append(str5);
        sbJ.append(", badgeId=");
        sbJ.append(this.f30652h);
        sbJ.append(")");
        return sbJ.toString();
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
        parcel.writeString(this.fullName);
        parcel.writeString(this.displayName);
        parcel.writeString(this.profileImageUrlMedium);
        parcel.writeString(this.profileImageUrlSmall);
        Long l15 = this.userLevel;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        parcel.writeString(this.badgeEarnedDate);
        Integer num = this.f30652h;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
    }

    public p(Long l14, String str, String str2, String str3, String str4, Long l15, String str5, Integer num) {
        this.userProfileId = l14;
        this.fullName = str;
        this.displayName = str2;
        this.profileImageUrlMedium = str3;
        this.profileImageUrlSmall = str4;
        this.userLevel = l15;
        this.badgeEarnedDate = str5;
        this.f30652h = num;
    }

    public p() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
