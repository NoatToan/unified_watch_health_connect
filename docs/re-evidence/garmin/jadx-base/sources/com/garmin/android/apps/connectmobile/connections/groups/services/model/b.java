package com.garmin.android.apps.connectmobile.connections.groups.services.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.s1;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import li0.d0;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001aB·\u0001\b\u0007\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR$\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR$\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001b\u001a\u0004\b'\u0010\u001d\"\u0004\b(\u0010\u001fR$\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001b\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010\u001fR$\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010\u001b\u001a\u0004\b-\u0010\u001d\"\u0004\b.\u0010\u001fR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b5\u0010\u001b\u001a\u0004\b6\u0010\u001d\"\u0004\b7\u0010\u001fR$\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u0010\u001b\u001a\u0004\b9\u0010\u001d\"\u0004\b:\u0010\u001fR$\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b;\u0010\u001b\u001a\u0004\b<\u0010\u001d\"\u0004\b=\u0010\u001fR$\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b>\u0010\u001b\u001a\u0004\b?\u0010\u001d\"\u0004\b@\u0010\u001fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bA\u0010<\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E¨\u0006F"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/b;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "", TtmlNode.ATTR_ID, "groupId", "userProfileId", "displayName", FirebaseAnalytics.Param.LOCATION, "joinDate", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupDTO$c;", "groupRole", "fullName", "profileImageLarge", "profileImageMedium", "profileImageSmall", "", "userLevel", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/c;", "connectionStatus", "", "hasPremiumSocialIcon", "Lli0/d0;", "followItemViewData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupDTO$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/garmin/android/apps/connectmobile/connections/groups/services/model/c;ZLli0/d0;)V", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "b", "F", "e0", "c", "Z", "o0", "d", "getDisplayName", "a0", JWKParameterNames.RSA_EXPONENT, "H", "h0", "f", "getJoinDate", "g0", "g", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupDTO$c;", "G", "()Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupDTO$c;", "f0", "(Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupDTO$c;)V", "h", "D", "c0", IntegerTokenConverter.CONVERTER_KEY, "getProfileImageLarge", "i0", "j", "I", "j0", JWKParameterNames.OCT_KEY_VALUE, "getProfileImageSmall", "k0", "l", "M", "()I", "n0", "(I)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b extends s1 implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(TtmlNode.ATTR_ID)
    private String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("groupId")
    private String groupId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfileId")
    private String userProfileId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayName")
    private String displayName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName(FirebaseAnalytics.Param.LOCATION)
    private String location;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("joinDate")
    private String joinDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("groupRole")
    private GroupDTO.c groupRole;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fullName")
    private String fullName;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageLarge")
    private String profileImageLarge;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageMedium")
    private String profileImageMedium;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageSmall")
    private String profileImageSmall;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userLevel")
    private int userLevel;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public transient c f31625m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final transient boolean f31626n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public transient d0 f31627o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public transient b12.b f31628p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f31611q = new a(null);
    public static final Parcelable.Creator<b> CREATOR = new C0516b();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f31612r = 8;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.connections.groups.services.model.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C0516b implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            GroupDTO.c cVarValueOf = parcel.readInt() == 0 ? null : GroupDTO.c.valueOf(parcel.readString());
            return new b(string, string2, string3, string4, string5, string6, cVarValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), c.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() == 0 ? null : d0.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public /* synthetic */ b(String str, String str2, String str3, String str4, String str5, String str6, GroupDTO.c cVar, String str7, String str8, String str9, String str10, int i14, c cVar2, boolean z14, d0 d0Var, int i15, j jVar) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? null : str2, (i15 & 4) != 0 ? null : str3, (i15 & 8) != 0 ? null : str4, (i15 & 16) != 0 ? null : str5, (i15 & 32) != 0 ? null : str6, (i15 & 64) != 0 ? null : cVar, (i15 & 128) != 0 ? null : str7, (i15 & 256) != 0 ? null : str8, (i15 & 512) != 0 ? null : str9, (i15 & 1024) != 0 ? null : str10, (i15 & 2048) != 0 ? 0 : i14, (i15 & 4096) != 0 ? new c(null, null, null, null, 15, null) : cVar2, (i15 & 8192) == 0 ? z14 : false, (i15 & 16384) != 0 ? null : d0Var);
    }

    public static b C(b bVar, GroupDTO.c cVar, d0 d0Var, int i14) {
        String str = bVar.id;
        String str2 = bVar.groupId;
        String str3 = bVar.userProfileId;
        String str4 = bVar.displayName;
        String str5 = bVar.location;
        String str6 = bVar.joinDate;
        GroupDTO.c cVar2 = (i14 & 64) != 0 ? bVar.groupRole : cVar;
        String str7 = bVar.fullName;
        GroupDTO.c cVar3 = cVar2;
        String str8 = bVar.profileImageLarge;
        String str9 = bVar.profileImageMedium;
        String str10 = bVar.profileImageSmall;
        int i15 = bVar.userLevel;
        c cVar4 = bVar.f31625m;
        boolean z14 = bVar.f31626n;
        d0 d0Var2 = (i14 & 16384) != 0 ? bVar.f31627o : d0Var;
        bVar.getClass();
        cVar4.getClass();
        return new b(str, str2, str3, str4, str5, str6, cVar3, str7, str8, str9, str10, i15, cVar4, z14, d0Var2);
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final GroupDTO.c getGroupRole() {
        return this.groupRole;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final String getProfileImageMedium() {
        return this.profileImageMedium;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final int getUserLevel() {
        return this.userLevel;
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final String getUserProfileId() {
        return this.userProfileId;
    }

    public final void a0(String str) {
        this.displayName = str;
    }

    public final void c0(String str) {
        this.fullName = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e0(String str) {
        this.groupId = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.id, bVar.id) && s.g(this.groupId, bVar.groupId) && s.g(this.userProfileId, bVar.userProfileId) && s.g(this.displayName, bVar.displayName) && s.g(this.location, bVar.location) && s.g(this.joinDate, bVar.joinDate) && this.groupRole == bVar.groupRole && s.g(this.fullName, bVar.fullName) && s.g(this.profileImageLarge, bVar.profileImageLarge) && s.g(this.profileImageMedium, bVar.profileImageMedium) && s.g(this.profileImageSmall, bVar.profileImageSmall) && this.userLevel == bVar.userLevel && s.g(this.f31625m, bVar.f31625m) && this.f31626n == bVar.f31626n && s.g(this.f31627o, bVar.f31627o);
    }

    public final void f0(GroupDTO.c cVar) {
        this.groupRole = cVar;
    }

    public final void g0(String str) {
        this.joinDate = str;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final void h0(String str) {
        this.location = str;
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.groupId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userProfileId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.displayName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.location;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.joinDate;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        GroupDTO.c cVar = this.groupRole;
        int iHashCode7 = (iHashCode6 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str7 = this.fullName;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.profileImageLarge;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.profileImageMedium;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.profileImageSmall;
        int iG = q6.f.g((this.f31625m.hashCode() + q2.d(this.userLevel, (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31, 31)) * 31, 31, this.f31626n);
        d0 d0Var = this.f31627o;
        return iG + (d0Var != null ? d0Var.hashCode() : 0);
    }

    public final void i0(String str) {
        this.profileImageLarge = str;
    }

    public final void j0(String str) {
        this.profileImageMedium = str;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.id = s1.u(jSONObject, TtmlNode.ATTR_ID);
        this.groupId = s1.u(jSONObject, "groupId");
        this.userProfileId = s1.u(jSONObject, "userProfileId");
        this.displayName = s1.u(jSONObject, "displayName");
        this.location = s1.u(jSONObject, FirebaseAnalytics.Param.LOCATION);
        this.joinDate = s1.u(jSONObject, "joinDate");
        String strU = s1.u(jSONObject, "groupRole");
        this.groupRole = (strU == null || strU.length() == 0) ? GroupDTO.c.NOT_DEFINED : GroupDTO.c.valueOf(strU);
        this.fullName = s1.u(jSONObject, "fullName");
        this.profileImageLarge = s1.u(jSONObject, "profileImageLarge");
        this.profileImageMedium = s1.u(jSONObject, "profileImageMedium");
        this.profileImageSmall = s1.u(jSONObject, "profileImageSmall");
        Integer numR = s1.r(jSONObject, "userLevel");
        this.userLevel = numR != null ? numR.intValue() : 0;
    }

    public final void k0(String str) {
        this.profileImageSmall = str;
    }

    public final void n0(int i14) {
        this.userLevel = i14;
    }

    public final void o0(String str) {
        this.userProfileId = str;
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.groupId;
        String str3 = this.userProfileId;
        String str4 = this.displayName;
        String str5 = this.location;
        String str6 = this.joinDate;
        GroupDTO.c cVar = this.groupRole;
        String str7 = this.fullName;
        String str8 = this.profileImageLarge;
        String str9 = this.profileImageMedium;
        String str10 = this.profileImageSmall;
        int i14 = this.userLevel;
        c cVar2 = this.f31625m;
        d0 d0Var = this.f31627o;
        StringBuilder sbI = p6.b.i("GroupConnectionDTO(id=", str, ", groupId=", str2, ", userProfileId=");
        sn.a.t(sbI, str3, ", displayName=", str4, ", location=");
        sn.a.t(sbI, str5, ", joinDate=", str6, ", groupRole=");
        sbI.append(cVar);
        sbI.append(", fullName=");
        sbI.append(str7);
        sbI.append(", profileImageLarge=");
        sn.a.t(sbI, str8, ", profileImageMedium=", str9, ", profileImageSmall=");
        q6.f.q(i14, str10, ", userLevel=", ", connectionStatus=", sbI);
        sbI.append(cVar2);
        sbI.append(", hasPremiumSocialIcon=");
        sbI.append(this.f31626n);
        sbI.append(", followItemViewData=");
        sbI.append(d0Var);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.id);
        parcel.writeString(this.groupId);
        parcel.writeString(this.userProfileId);
        parcel.writeString(this.displayName);
        parcel.writeString(this.location);
        parcel.writeString(this.joinDate);
        GroupDTO.c cVar = this.groupRole;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(cVar.name());
        }
        parcel.writeString(this.fullName);
        parcel.writeString(this.profileImageLarge);
        parcel.writeString(this.profileImageMedium);
        parcel.writeString(this.profileImageSmall);
        parcel.writeInt(this.userLevel);
        this.f31625m.writeToParcel(parcel, i14);
        parcel.writeInt(this.f31626n ? 1 : 0);
        d0 d0Var = this.f31627o;
        if (d0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            d0Var.writeToParcel(parcel, i14);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/b$a;", "", "<init>", "()V", "", "PK_ID", "Ljava/lang/String;", "PK_GROUP_ID", "PK_USER_PROFILE_ID", "PK_DISPLAY_NAME", "PK_LOCATION", "PK_JOIN_DATE", "PK_GROUP_ROLE", "PK_FULL_NAME", "PK_PROFILE_IMAGE_LARGE", "PK_PROFILE_IMAGE_MEDIUM", "PK_PROFILE_IMAGE_SMALL", "PK_USER_LEVEL", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public b(String str) {
        this(str, null, null, null, null, null, null, null, null, null, null, 0, null, false, null, 32766, null);
    }

    public b(String str, String str2) {
        this(str, str2, null, null, null, null, null, null, null, null, null, 0, null, false, null, 32764, null);
    }

    public b(String str, String str2, String str3) {
        this(str, str2, str3, null, null, null, null, null, null, null, null, 0, null, false, null, 32760, null);
    }

    public b(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, null, null, null, null, null, null, null, 0, null, false, null, 32752, null);
    }

    public b(String str, String str2, String str3, String str4, String str5) {
        this(str, str2, str3, str4, str5, null, null, null, null, null, null, 0, null, false, null, 32736, null);
    }

    public b(String str, String str2, String str3, String str4, String str5, String str6) {
        this(str, str2, str3, str4, str5, str6, null, null, null, null, null, 0, null, false, null, 32704, null);
    }

    public b(String str, String str2, String str3, String str4, String str5, String str6, GroupDTO.c cVar) {
        this(str, str2, str3, str4, str5, str6, cVar, null, null, null, null, 0, null, false, null, 32640, null);
    }

    public b(String str, String str2, String str3, String str4, String str5, String str6, GroupDTO.c cVar, String str7) {
        this(str, str2, str3, str4, str5, str6, cVar, str7, null, null, null, 0, null, false, null, 32512, null);
    }

    public b(String str, String str2, String str3, String str4, String str5, String str6, GroupDTO.c cVar, String str7, String str8) {
        this(str, str2, str3, str4, str5, str6, cVar, str7, str8, null, null, 0, null, false, null, 32256, null);
    }

    public b(String str, String str2, String str3, String str4, String str5, String str6, GroupDTO.c cVar, String str7, String str8, String str9) {
        this(str, str2, str3, str4, str5, str6, cVar, str7, str8, str9, null, 0, null, false, null, 31744, null);
    }

    public b(String str, String str2, String str3, String str4, String str5, String str6, GroupDTO.c cVar, String str7, String str8, String str9, String str10) {
        this(str, str2, str3, str4, str5, str6, cVar, str7, str8, str9, str10, 0, null, false, null, 30720, null);
    }

    public b(String str, String str2, String str3, String str4, String str5, String str6, GroupDTO.c cVar, String str7, String str8, String str9, String str10, int i14) {
        this(str, str2, str3, str4, str5, str6, cVar, str7, str8, str9, str10, i14, null, false, null, 28672, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String str, String str2, String str3, String str4, String str5, String str6, GroupDTO.c cVar, String str7, String str8, String str9, String str10, int i14, c cVar2) {
        this(str, str2, str3, str4, str5, str6, cVar, str7, str8, str9, str10, i14, cVar2, false, null, 24576, null);
        cVar2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String str, String str2, String str3, String str4, String str5, String str6, GroupDTO.c cVar, String str7, String str8, String str9, String str10, int i14, c cVar2, boolean z14) {
        this(str, str2, str3, str4, str5, str6, cVar, str7, str8, str9, str10, i14, cVar2, z14, null, 16384, null);
        cVar2.getClass();
    }

    public b(String str, String str2, String str3, String str4, String str5, String str6, GroupDTO.c cVar, String str7, String str8, String str9, String str10, int i14, c cVar2, boolean z14, d0 d0Var) {
        cVar2.getClass();
        this.id = str;
        this.groupId = str2;
        this.userProfileId = str3;
        this.displayName = str4;
        this.location = str5;
        this.joinDate = str6;
        this.groupRole = cVar;
        this.fullName = str7;
        this.profileImageLarge = str8;
        this.profileImageMedium = str9;
        this.profileImageSmall = str10;
        this.userLevel = i14;
        this.f31625m = cVar2;
        this.f31626n = z14;
        this.f31627o = d0Var;
        this.f31628p = b12.b.f14386g;
    }

    public b() {
        this(null, null, null, null, null, null, null, null, null, null, null, 0, null, false, null, 32767, null);
    }
}
