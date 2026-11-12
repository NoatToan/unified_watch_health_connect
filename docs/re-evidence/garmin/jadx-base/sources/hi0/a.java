package hi0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b\u001d\u0010+¨\u0006,"}, d2 = {"Lhi0/a;", "Landroid/os/Parcelable;", "", "userId", "", "displayName", "fullName", "userLevel", FirebaseAnalytics.Param.LOCATION, "", "userPoint", "Lcom/garmin/android/apps/connectmobile/userprofile/model/h;", "profileImageType", "Lcom/garmin/android/apps/connectmobile/userprofile/model/j;", "profileImageUrls", "Lhi0/e;", "followStatus", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Lcom/garmin/android/apps/connectmobile/userprofile/model/h;Lcom/garmin/android/apps/connectmobile/userprofile/model/j;Lhi0/e;)V", "a", "Ljava/lang/Long;", "j", "()Ljava/lang/Long;", "b", "Ljava/lang/String;", "getDisplayName", "()Ljava/lang/String;", "c", "f", "d", JWKParameterNames.OCT_KEY_VALUE, JWKParameterNames.RSA_EXPONENT, "g", "Ljava/lang/Integer;", "m", "()Ljava/lang/Integer;", "Lcom/garmin/android/apps/connectmobile/userprofile/model/h;", "h", "()Lcom/garmin/android/apps/connectmobile/userprofile/model/h;", "Lcom/garmin/android/apps/connectmobile/userprofile/model/j;", IntegerTokenConverter.CONVERTER_KEY, "()Lcom/garmin/android/apps/connectmobile/userprofile/model/j;", "Lhi0/e;", "()Lhi0/e;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1656a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userId")
    private final Long userId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayName")
    private final String displayName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fullName")
    private final String fullName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userLevel")
    private final Long userLevel;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName(FirebaseAnalytics.Param.LOCATION)
    private final String location;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userPoint")
    private final Integer userPoint;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageType")
    private final com.garmin.android.apps.connectmobile.userprofile.model.h profileImageType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageUrls")
    private final com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("followStatus")
    private final e followStatus;

    /* JADX INFO: renamed from: hi0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1656a implements Parcelable.Creator<a> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            Long lValueOf;
            Long l14;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                lValueOf = null;
                l14 = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
                l14 = null;
            }
            Long l15 = l14;
            return new a(lValueOf, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? l15 : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? l15 : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? l15 : com.garmin.android.apps.connectmobile.userprofile.model.h.valueOf(parcel.readString()), (com.garmin.android.apps.connectmobile.userprofile.model.j) parcel.readParcelable(a.class.getClassLoader()), (e) (parcel.readInt() == 0 ? l15 : e.CREATOR.createFromParcel(parcel)));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    static {
        int i14 = com.garmin.android.apps.connectmobile.userprofile.model.j.f46870j;
    }

    public /* synthetic */ a(Long l14, String str, String str2, Long l15, String str3, Integer num, com.garmin.android.apps.connectmobile.userprofile.model.h hVar, com.garmin.android.apps.connectmobile.userprofile.model.j jVar, e eVar, int i14, p005kotlin.jvm.internal.j jVar2) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : l15, (i14 & 16) != 0 ? null : str3, (i14 & 32) != 0 ? null : num, (i14 & 64) != 0 ? null : hVar, (i14 & 128) != 0 ? null : jVar, (i14 & 256) != 0 ? null : eVar);
    }

    public static a b(a aVar, String str, String str2, Long l14, String str3, com.garmin.android.apps.connectmobile.userprofile.model.j jVar) {
        Long l15 = aVar.userId;
        Integer num = aVar.userPoint;
        com.garmin.android.apps.connectmobile.userprofile.model.h hVar = aVar.profileImageType;
        e eVar = aVar.followStatus;
        aVar.getClass();
        return new a(l15, str, str2, l14, str3, num, hVar, jVar, eVar);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final e getFollowStatus() {
        return this.followStatus;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.userId, aVar.userId) && s.g(this.displayName, aVar.displayName) && s.g(this.fullName, aVar.fullName) && s.g(this.userLevel, aVar.userLevel) && s.g(this.location, aVar.location) && s.g(this.userPoint, aVar.userPoint) && this.profileImageType == aVar.profileImageType && s.g(this.profileImageUrls, aVar.profileImageUrls) && s.g(this.followStatus, aVar.followStatus);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final com.garmin.android.apps.connectmobile.userprofile.model.h getProfileImageType() {
        return this.profileImageType;
    }

    public final int hashCode() {
        Long l14 = this.userId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.displayName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fullName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l15 = this.userLevel;
        int iHashCode4 = (iHashCode3 + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str3 = this.location;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.userPoint;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        com.garmin.android.apps.connectmobile.userprofile.model.h hVar = this.profileImageType;
        int iHashCode7 = (iHashCode6 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        com.garmin.android.apps.connectmobile.userprofile.model.j jVar = this.profileImageUrls;
        int iHashCode8 = (iHashCode7 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        e eVar = this.followStatus;
        return iHashCode8 + (eVar != null ? eVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final com.garmin.android.apps.connectmobile.userprofile.model.j getProfileImageUrls() {
        return this.profileImageUrls;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Long getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Long getUserLevel() {
        return this.userLevel;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Integer getUserPoint() {
        return this.userPoint;
    }

    public final String toString() {
        Long l14 = this.userId;
        String str = this.displayName;
        String str2 = this.fullName;
        Long l15 = this.userLevel;
        String str3 = this.location;
        Integer num = this.userPoint;
        com.garmin.android.apps.connectmobile.userprofile.model.h hVar = this.profileImageType;
        com.garmin.android.apps.connectmobile.userprofile.model.j jVar = this.profileImageUrls;
        e eVar = this.followStatus;
        StringBuilder sbJ = b71.i.j("FollowDTO(userId=", ", displayName=", str, l14, ", fullName=");
        n23.j.q(l15, str2, ", userLevel=", ", location=", sbJ);
        fb1.c.u(num, str3, ", userPoint=", ", profileImageType=", sbJ);
        sbJ.append(hVar);
        sbJ.append(", profileImageUrls=");
        sbJ.append(jVar);
        sbJ.append(", followStatus=");
        sbJ.append(eVar);
        sbJ.append(")");
        return sbJ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.userId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.displayName);
        parcel.writeString(this.fullName);
        Long l15 = this.userLevel;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        parcel.writeString(this.location);
        Integer num = this.userPoint;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        com.garmin.android.apps.connectmobile.userprofile.model.h hVar = this.profileImageType;
        if (hVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(hVar.name());
        }
        parcel.writeParcelable(this.profileImageUrls, i14);
        e eVar = this.followStatus;
        if (eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar.writeToParcel(parcel, i14);
        }
    }

    public a(Long l14, String str, String str2, Long l15, String str3, Integer num, com.garmin.android.apps.connectmobile.userprofile.model.h hVar, com.garmin.android.apps.connectmobile.userprofile.model.j jVar, e eVar) {
        this.userId = l14;
        this.displayName = str;
        this.fullName = str2;
        this.userLevel = l15;
        this.location = str3;
        this.userPoint = num;
        this.profileImageType = hVar;
        this.profileImageUrls = jVar;
        this.followStatus = eVar;
    }

    public a() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }
}
