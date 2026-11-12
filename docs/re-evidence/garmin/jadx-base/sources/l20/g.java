package l20;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.f3;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import j20.x;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001a\u001a\u0004\b'\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010(\u001a\u0004\b+\u0010*R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\"\u0010\u0018R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010(\u001a\u0004\b&\u0010*R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*¨\u00061"}, d2 = {"Ll20/g;", "Landroid/os/Parcelable;", "", "userId", "", "profileImageUrlMedium", "profileImageUrlSmall", FirebaseAnalytics.Param.LOCATION, "fullName", "displayName", "", "userLevel", "profileVisibility", "connectionRequestId", "connectionRequestorId", "connectionStatus", "", "userRoles", "mutualConnectionsCount", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;)V", "a", "Ljava/lang/Long;", "o", "()Ljava/lang/Long;", "b", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "s", "(Ljava/lang/String;)V", "c", JWKParameterNames.OCT_KEY_VALUE, JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "d", "h", JWKParameterNames.RSA_EXPONENT, "g", "f", "getDisplayName", "Ljava/lang/Integer;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "()Ljava/lang/Integer;", "m", IntegerTokenConverter.CONVERTER_KEY, "l", "Ljava/util/List;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "()Ljava/util/List;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userId")
    private final Long userId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageUrlMedium")
    private String profileImageUrlMedium;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageUrlSmall")
    private String profileImageUrlSmall;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName(FirebaseAnalytics.Param.LOCATION)
    private final String location;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fullName")
    private final String fullName;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayName")
    private final String displayName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userLevel")
    private final Integer userLevel;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileVisibility")
    private final Integer profileVisibility;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("connectionRequestId")
    private final Long connectionRequestId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("connectionRequestorId")
    private final Long connectionRequestorId;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("connectionStatus")
    private final Integer connectionStatus;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userRoles")
    private final List<String> userRoles;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("mutualConnectionsCount")
    private final Integer mutualConnectionsCount;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<g> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            Long lValueOf;
            Integer num;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                lValueOf = null;
                num = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
                num = null;
            }
            String string = parcel.readString();
            Integer num2 = num;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Integer numValueOf = num2;
            String string5 = parcel.readString();
            Integer numValueOf2 = parcel.readInt() == 0 ? numValueOf : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? numValueOf : Integer.valueOf(parcel.readInt());
            Object objValueOf = parcel.readInt() == 0 ? numValueOf : Long.valueOf(parcel.readLong());
            Object objValueOf2 = parcel.readInt() == 0 ? numValueOf : Long.valueOf(parcel.readLong());
            Integer numValueOf4 = parcel.readInt() == 0 ? numValueOf : Integer.valueOf(parcel.readInt());
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new g(lValueOf, string, string2, string3, string4, string5, numValueOf2, numValueOf3, objValueOf, objValueOf2, numValueOf4, arrayListCreateStringArrayList, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    public g(Long l14, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, Long l15, Long l16, Integer num3, List<String> list, Integer num4) {
        this.userId = l14;
        this.profileImageUrlMedium = str;
        this.profileImageUrlSmall = str2;
        this.location = str3;
        this.fullName = str4;
        this.displayName = str5;
        this.userLevel = num;
        this.profileVisibility = num2;
        this.connectionRequestId = l15;
        this.connectionRequestorId = l16;
        this.connectionStatus = num3;
        this.userRoles = list;
        this.mutualConnectionsCount = num4;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getConnectionRequestId() {
        return this.connectionRequestId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getConnectionRequestorId() {
        return this.connectionRequestorId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.userId, gVar.userId) && s.g(this.profileImageUrlMedium, gVar.profileImageUrlMedium) && s.g(this.profileImageUrlSmall, gVar.profileImageUrlSmall) && s.g(this.location, gVar.location) && s.g(this.fullName, gVar.fullName) && s.g(this.displayName, gVar.displayName) && s.g(this.userLevel, gVar.userLevel) && s.g(this.profileVisibility, gVar.profileVisibility) && s.g(this.connectionRequestId, gVar.connectionRequestId) && s.g(this.connectionRequestorId, gVar.connectionRequestorId) && s.g(this.connectionStatus, gVar.connectionStatus) && s.g(this.userRoles, gVar.userRoles) && s.g(this.mutualConnectionsCount, gVar.mutualConnectionsCount);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getConnectionStatus() {
        return this.connectionStatus;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    public final int hashCode() {
        Long l14 = this.userId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.profileImageUrlMedium;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.profileImageUrlSmall;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.location;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fullName;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.displayName;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.userLevel;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.profileVisibility;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l15 = this.connectionRequestId;
        int iHashCode9 = (iHashCode8 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Long l16 = this.connectionRequestorId;
        int iHashCode10 = (iHashCode9 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Integer num3 = this.connectionStatus;
        int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<String> list = this.userRoles;
        int iHashCode12 = (iHashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num4 = this.mutualConnectionsCount;
        return iHashCode12 + (num4 != null ? num4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Integer getMutualConnectionsCount() {
        return this.mutualConnectionsCount;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getProfileImageUrlMedium() {
        return this.profileImageUrlMedium;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getProfileImageUrlSmall() {
        return this.profileImageUrlSmall;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Integer getProfileVisibility() {
        return this.profileVisibility;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Long getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Integer getUserLevel() {
        return this.userLevel;
    }

    public final List<String> r() {
        return this.userRoles;
    }

    public final void s(String str) {
        this.profileImageUrlMedium = str;
    }

    public final void t(String str) {
        this.profileImageUrlSmall = str;
    }

    public final String toString() {
        Long l14 = this.userId;
        String str = this.profileImageUrlMedium;
        String str2 = this.profileImageUrlSmall;
        String str3 = this.location;
        String str4 = this.fullName;
        String str5 = this.displayName;
        Integer num = this.userLevel;
        Integer num2 = this.profileVisibility;
        Long l15 = this.connectionRequestId;
        Long l16 = this.connectionRequestorId;
        Integer num3 = this.connectionStatus;
        List<String> list = this.userRoles;
        Integer num4 = this.mutualConnectionsCount;
        StringBuilder sbJ = b71.i.j("ContactSocialProfileDTO(userId=", ", profileImageUrlMedium=", str, l14, ", profileImageUrlSmall=");
        sn.a.t(sbJ, str2, ", location=", str3, ", fullName=");
        sn.a.t(sbJ, str4, ", displayName=", str5, ", userLevel=");
        x.m(sbJ, num, ", profileVisibility=", num2, ", connectionRequestId=");
        kg.f.s(sbJ, l15, ", connectionRequestorId=", l16, ", connectionStatus=");
        sbJ.append(num3);
        sbJ.append(", userRoles=");
        sbJ.append(list);
        sbJ.append(", mutualConnectionsCount=");
        return f3.i(sbJ, num4, ")");
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
        parcel.writeString(this.profileImageUrlMedium);
        parcel.writeString(this.profileImageUrlSmall);
        parcel.writeString(this.location);
        parcel.writeString(this.fullName);
        parcel.writeString(this.displayName);
        Integer num = this.userLevel;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.profileVisibility;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Long l15 = this.connectionRequestId;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        Long l16 = this.connectionRequestorId;
        if (l16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l16);
        }
        Integer num3 = this.connectionStatus;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        parcel.writeStringList(this.userRoles);
        Integer num4 = this.mutualConnectionsCount;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num4);
        }
    }
}
