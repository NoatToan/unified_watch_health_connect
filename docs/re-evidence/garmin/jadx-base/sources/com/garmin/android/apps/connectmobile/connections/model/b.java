package com.garmin.android.apps.connectmobile.connections.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.o;
import b71.i;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017Bm\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u0017\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0018\u001a\u0004\b&\u0010\u001a\"\u0004\b'\u0010\u001cR$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0018\u001a\u0004\b(\u0010\u001a\"\u0004\b)\u0010\u001cR$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0018\u001a\u0004\b*\u0010\u001a\"\u0004\b+\u0010\u001cR$\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b,\u0010\u001c¨\u0006-"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/model/b;", "Landroid/os/Parcelable;", "", "userProfileId", "", "displayName", "fullName", "", "userLevel", "profileImageUrlLarge", "profileImageUrlMedium", "profileImageUrlSmall", FirebaseAnalytics.Param.LOCATION, "Lb12/b;", "userProfileImageData", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb12/b;)V", "a", "Ljava/lang/Long;", "h", "()Ljava/lang/Long;", "setUserProfileId", "(Ljava/lang/Long;)V", "b", "Ljava/lang/String;", "getDisplayName", "()Ljava/lang/String;", "setDisplayName", "(Ljava/lang/String;)V", "c", "setFullName", "d", "I", "g", "()I", "setUserLevel", "(I)V", JWKParameterNames.RSA_EXPONENT, "getProfileImageUrlLarge", "setProfileImageUrlLarge", "f", "setProfileImageUrlMedium", "getProfileImageUrlSmall", "setProfileImageUrlSmall", "setLocation", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfileId")
    private Long userProfileId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayName")
    private String displayName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fullName")
    private String fullName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userLevel")
    private int userLevel;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageUrlLarge")
    private String profileImageUrlLarge;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageUrlMedium")
    private String profileImageUrlMedium;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageUrlSmall")
    private String profileImageUrlSmall;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName(FirebaseAnalytics.Param.LOCATION)
    private String location;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b12.b f31694i;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/connections/model/b$a", "Landroidx/recyclerview/widget/o$f;", "Lcom/garmin/android/apps/connectmobile/connections/model/b;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends o.f<b> {
        @Override // androidx.recyclerview.widget.o.f
        public final boolean a(b bVar, b bVar2) {
            b bVar3 = bVar;
            b bVar4 = bVar2;
            bVar3.getClass();
            bVar4.getClass();
            return bVar3.equals(bVar4);
        }

        @Override // androidx.recyclerview.widget.o.f
        public final boolean b(b bVar, b bVar2) {
            b bVar3 = bVar;
            b bVar4 = bVar2;
            bVar3.getClass();
            bVar4.getClass();
            return s.g(bVar3.getUserProfileId(), bVar4.getUserProfileId());
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (b12.b) parcel.readParcelable(b.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    static {
        new C0517b(null);
        CREATOR = new c();
        new a();
    }

    public /* synthetic */ b(Long l14, String str, String str2, int i14, String str3, String str4, String str5, String str6, b12.b bVar, int i15, j jVar) {
        this(l14, str, (i15 & 4) != 0 ? null : str2, (i15 & 8) != 0 ? 1 : i14, (i15 & 16) != 0 ? null : str3, (i15 & 32) != 0 ? null : str4, (i15 & 64) != 0 ? null : str5, (i15 & 128) != 0 ? null : str6, (i15 & 256) != 0 ? null : bVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.userProfileId, bVar.userProfileId) && s.g(this.displayName, bVar.displayName) && s.g(this.fullName, bVar.fullName) && this.userLevel == bVar.userLevel && s.g(this.profileImageUrlLarge, bVar.profileImageUrlLarge) && s.g(this.profileImageUrlMedium, bVar.profileImageUrlMedium) && s.g(this.profileImageUrlSmall, bVar.profileImageUrlSmall) && s.g(this.location, bVar.location) && s.g(this.f31694i, bVar.f31694i);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getProfileImageUrlMedium() {
        return this.profileImageUrlMedium;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getUserLevel() {
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
        String str = this.displayName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fullName;
        int iD = q2.d(this.userLevel, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.profileImageUrlLarge;
        int iHashCode3 = (iD + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.profileImageUrlMedium;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.profileImageUrlSmall;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.location;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        b12.b bVar = this.f31694i;
        return iHashCode6 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        Long l14 = this.userProfileId;
        String str = this.displayName;
        String str2 = this.fullName;
        int i14 = this.userLevel;
        String str3 = this.profileImageUrlLarge;
        String str4 = this.profileImageUrlMedium;
        String str5 = this.profileImageUrlSmall;
        String str6 = this.location;
        b12.b bVar = this.f31694i;
        StringBuilder sbJ = i.j("MutedUserProfileDTO(userProfileId=", ", displayName=", str, l14, ", fullName=");
        f.q(i14, str2, ", userLevel=", ", profileImageUrlLarge=", sbJ);
        sn.a.t(sbJ, str3, ", profileImageUrlMedium=", str4, ", profileImageUrlSmall=");
        sn.a.t(sbJ, str5, ", location=", str6, ", userProfileImageData=");
        sbJ.append(bVar);
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
        parcel.writeString(this.displayName);
        parcel.writeString(this.fullName);
        parcel.writeInt(this.userLevel);
        parcel.writeString(this.profileImageUrlLarge);
        parcel.writeString(this.profileImageUrlMedium);
        parcel.writeString(this.profileImageUrlSmall);
        parcel.writeString(this.location);
        parcel.writeParcelable(this.f31694i, i14);
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.connections.model.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/model/b$b;", "", "<init>", "()V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0517b {
        public /* synthetic */ C0517b(j jVar) {
            this();
        }

        private C0517b() {
        }
    }

    public b(Long l14, String str, String str2, int i14, String str3, String str4, String str5, String str6, b12.b bVar) {
        this.userProfileId = l14;
        this.displayName = str;
        this.fullName = str2;
        this.userLevel = i14;
        this.profileImageUrlLarge = str3;
        this.profileImageUrlMedium = str4;
        this.profileImageUrlSmall = str5;
        this.location = str6;
        this.f31694i = bVar;
    }
}
