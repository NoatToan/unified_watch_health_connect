package uz0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b%\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b!\u0010\u001aR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\u001c\u001a\u0004\b1\u0010\u001eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b&\u00104¨\u00065"}, d2 = {"Luz0/m;", "Landroid/os/Parcelable;", "", "userId", "", "displayName", "fullName", "userLevel", "profileImageUrlSmall", "profileImageUrlMedium", "connectionRequestId", "followRequestId", "", "requestViewed", "", "userRoles", "", "mutualConnectionCount", FirebaseAnalytics.Param.LOCATION, "Lorg/joda/time/DateTime;", "requestStartTime", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lorg/joda/time/DateTime;)V", "a", "Ljava/lang/Long;", JWKParameterNames.OCT_KEY_VALUE, "()Ljava/lang/Long;", "b", "Ljava/lang/String;", "getDisplayName", "()Ljava/lang/String;", "c", "f", "d", "getUserLevel", JWKParameterNames.RSA_EXPONENT, "h", "g", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/Boolean;", "j", "()Ljava/lang/Boolean;", "Ljava/util/List;", "getUserRoles", "()Ljava/util/List;", "Ljava/lang/Integer;", "getMutualConnectionCount", "()Ljava/lang/Integer;", "l", "getLocation", "m", "Lorg/joda/time/DateTime;", "()Lorg/joda/time/DateTime;", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

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
    @SerializedName("profileImageUrlSmall")
    private final String profileImageUrlSmall;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageUrlMedium")
    private final String profileImageUrlMedium;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("connectionRequestId")
    private final Long connectionRequestId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("followRequestId")
    private final Long followRequestId;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("requestViewed")
    private final Boolean requestViewed;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userRoles")
    private final List<String> userRoles;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("mutualConnectionCount")
    private final Integer mutualConnectionCount;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName(FirebaseAnalytics.Param.LOCATION)
    private final String location;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("requestStartTime")
    @JsonAdapter(GsonUtil.UtcDateTimeTypeAdapter.class)
    private final DateTime requestStartTime;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<m> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel parcel) {
            Long lValueOf;
            Long l14;
            Object objValueOf;
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
            Long lValueOf2 = parcel.readInt() == 0 ? l15 : Long.valueOf(parcel.readLong());
            String string3 = parcel.readString();
            Object objValueOf2 = l15;
            Long l16 = lValueOf2;
            String string4 = parcel.readString();
            Object objValueOf3 = parcel.readInt() == 0 ? objValueOf2 : Long.valueOf(parcel.readLong());
            Object objValueOf4 = parcel.readInt() == 0 ? objValueOf2 : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                objValueOf = objValueOf2;
            } else {
                objValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                objValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new m(lValueOf, string, string2, l16, string3, string4, objValueOf3, objValueOf4, objValueOf, arrayListCreateStringArrayList, objValueOf2, parcel.readString(), (DateTime) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i14) {
            return new m[i14];
        }
    }

    public /* synthetic */ m(Long l14, String str, String str2, Long l15, String str3, String str4, Long l16, Long l17, Boolean bool, List list, Integer num, String str5, DateTime dateTime, int i14, p005kotlin.jvm.internal.j jVar) {
        this(l14, str, str2, l15, str3, str4, l16, l17, bool, list, num, str5, (i14 & 4096) != 0 ? null : dateTime);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getConnectionRequestId() {
        return this.connectionRequestId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getFollowRequestId() {
        return this.followRequestId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return s.g(this.userId, mVar.userId) && s.g(this.displayName, mVar.displayName) && s.g(this.fullName, mVar.fullName) && s.g(this.userLevel, mVar.userLevel) && s.g(this.profileImageUrlSmall, mVar.profileImageUrlSmall) && s.g(this.profileImageUrlMedium, mVar.profileImageUrlMedium) && s.g(this.connectionRequestId, mVar.connectionRequestId) && s.g(this.followRequestId, mVar.followRequestId) && s.g(this.requestViewed, mVar.requestViewed) && s.g(this.userRoles, mVar.userRoles) && s.g(this.mutualConnectionCount, mVar.mutualConnectionCount) && s.g(this.location, mVar.location) && s.g(this.requestStartTime, mVar.requestStartTime);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getProfileImageUrlMedium() {
        return this.profileImageUrlMedium;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getProfileImageUrlSmall() {
        return this.profileImageUrlSmall;
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
        String str3 = this.profileImageUrlSmall;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.profileImageUrlMedium;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l16 = this.connectionRequestId;
        int iHashCode7 = (iHashCode6 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Long l17 = this.followRequestId;
        int iHashCode8 = (iHashCode7 + (l17 == null ? 0 : l17.hashCode())) * 31;
        Boolean bool = this.requestViewed;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<String> list = this.userRoles;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.mutualConnectionCount;
        int iHashCode11 = (iHashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.location;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        DateTime dateTime = this.requestStartTime;
        return iHashCode12 + (dateTime != null ? dateTime.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final DateTime getRequestStartTime() {
        return this.requestStartTime;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Boolean getRequestViewed() {
        return this.requestViewed;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Long getUserId() {
        return this.userId;
    }

    public final String toString() {
        Long l14 = this.userId;
        String str = this.displayName;
        String str2 = this.fullName;
        Long l15 = this.userLevel;
        String str3 = this.profileImageUrlSmall;
        String str4 = this.profileImageUrlMedium;
        Long l16 = this.connectionRequestId;
        Long l17 = this.followRequestId;
        Boolean bool = this.requestViewed;
        List<String> list = this.userRoles;
        Integer num = this.mutualConnectionCount;
        String str5 = this.location;
        DateTime dateTime = this.requestStartTime;
        StringBuilder sbJ = b71.i.j("RequestNotificationDTO(userId=", ", displayName=", str, l14, ", fullName=");
        n23.j.q(l15, str2, ", userLevel=", ", profileImageUrlSmall=", sbJ);
        sn.a.t(sbJ, str3, ", profileImageUrlMedium=", str4, ", connectionRequestId=");
        kg.f.s(sbJ, l16, ", followRequestId=", l17, ", requestViewed=");
        sbJ.append(bool);
        sbJ.append(", userRoles=");
        sbJ.append(list);
        sbJ.append(", mutualConnectionCount=");
        p6.b.l(num, ", location=", str5, ", requestStartTime=", sbJ);
        sbJ.append(dateTime);
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
        parcel.writeString(this.profileImageUrlSmall);
        parcel.writeString(this.profileImageUrlMedium);
        Long l16 = this.connectionRequestId;
        if (l16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l16);
        }
        Long l17 = this.followRequestId;
        if (l17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l17);
        }
        Boolean bool = this.requestViewed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        parcel.writeStringList(this.userRoles);
        Integer num = this.mutualConnectionCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.location);
        parcel.writeSerializable(this.requestStartTime);
    }

    public m(Long l14, String str, String str2, Long l15, String str3, String str4, Long l16, Long l17, Boolean bool, List<String> list, Integer num, String str5, DateTime dateTime) {
        this.userId = l14;
        this.displayName = str;
        this.fullName = str2;
        this.userLevel = l15;
        this.profileImageUrlSmall = str3;
        this.profileImageUrlMedium = str4;
        this.connectionRequestId = l16;
        this.followRequestId = l17;
        this.requestViewed = bool;
        this.userRoles = list;
        this.mutualConnectionCount = num;
        this.location = str5;
        this.requestStartTime = dateTime;
    }
}
