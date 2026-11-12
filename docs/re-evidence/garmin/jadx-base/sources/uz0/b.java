package uz0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0019\u0010$R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b(\u0010\u0018R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b,\u0010+R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u001d\u001a\u0004\b.\u0010\u001f¨\u0006/"}, d2 = {"Luz0/b;", "Landroid/os/Parcelable;", "", "groupName", "displayName", "fullName", "", "groupInviteId", "groupMemberRequestId", "Lorg/joda/time/DateTime;", "createDate", "groupId", "Luz0/a;", "groupVisibility", "profileImageUrlSmall", "", "requestViewed", "pro", "userProfileId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lorg/joda/time/DateTime;Ljava/lang/Long;Luz0/a;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;)V", "a", "Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "b", "getDisplayName", "c", "d", "Ljava/lang/Long;", "g", "()Ljava/lang/Long;", JWKParameterNames.RSA_EXPONENT, "h", "f", "Lorg/joda/time/DateTime;", "()Lorg/joda/time/DateTime;", "Luz0/a;", "j", "()Luz0/a;", JWKParameterNames.OCT_KEY_VALUE, "Ljava/lang/Boolean;", "m", "()Ljava/lang/Boolean;", "getPro", "l", "o", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("groupName")
    private final String groupName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayName")
    private final String displayName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fullName")
    private final String fullName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("groupInviteId")
    private final Long groupInviteId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("groupMemberRequestId")
    private final Long groupMemberRequestId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("createDate")
    @JsonAdapter(GsonUtil.UtcDateTimeTypeAdapter.class)
    private final DateTime createDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("groupId")
    private final Long groupId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("groupVisibility")
    private final uz0.a groupVisibility;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageUrlSmall")
    private final String profileImageUrlSmall;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("requestViewed")
    private final Boolean requestViewed;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pro")
    private final Boolean pro;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfileId")
    private final Long userProfileId;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            DateTime dateTime = (DateTime) parcel.readSerializable();
            Long lValueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            uz0.a aVarValueOf = parcel.readInt() == 0 ? null : uz0.a.valueOf(parcel.readString());
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new b(string, string2, string3, lValueOf, lValueOf2, dateTime, lValueOf3, aVarValueOf, string4, boolValueOf, boolValueOf2, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public /* synthetic */ b(String str, String str2, String str3, Long l14, Long l15, DateTime dateTime, Long l16, uz0.a aVar, String str4, Boolean bool, Boolean bool2, Long l17, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, str3, l14, l15, (i14 & 32) != 0 ? null : dateTime, l16, (i14 & 128) != 0 ? uz0.a.VISIBLE : aVar, str4, bool, bool2, l17);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final DateTime getCreateDate() {
        return this.createDate;
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
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.groupName, bVar.groupName) && s.g(this.displayName, bVar.displayName) && s.g(this.fullName, bVar.fullName) && s.g(this.groupInviteId, bVar.groupInviteId) && s.g(this.groupMemberRequestId, bVar.groupMemberRequestId) && s.g(this.createDate, bVar.createDate) && s.g(this.groupId, bVar.groupId) && this.groupVisibility == bVar.groupVisibility && s.g(this.profileImageUrlSmall, bVar.profileImageUrlSmall) && s.g(this.requestViewed, bVar.requestViewed) && s.g(this.pro, bVar.pro) && s.g(this.userProfileId, bVar.userProfileId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getGroupId() {
        return this.groupId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getGroupInviteId() {
        return this.groupInviteId;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Long getGroupMemberRequestId() {
        return this.groupMemberRequestId;
    }

    public final int hashCode() {
        String str = this.groupName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.displayName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fullName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l14 = this.groupInviteId;
        int iHashCode4 = (iHashCode3 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.groupMemberRequestId;
        int iHashCode5 = (iHashCode4 + (l15 == null ? 0 : l15.hashCode())) * 31;
        DateTime dateTime = this.createDate;
        int iHashCode6 = (iHashCode5 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        Long l16 = this.groupId;
        int iHashCode7 = (iHashCode6 + (l16 == null ? 0 : l16.hashCode())) * 31;
        uz0.a aVar = this.groupVisibility;
        int iHashCode8 = (iHashCode7 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str4 = this.profileImageUrlSmall;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.requestViewed;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.pro;
        int iHashCode11 = (iHashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l17 = this.userProfileId;
        return iHashCode11 + (l17 != null ? l17.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getGroupName() {
        return this.groupName;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final uz0.a getGroupVisibility() {
        return this.groupVisibility;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getProfileImageUrlSmall() {
        return this.profileImageUrlSmall;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Boolean getRequestViewed() {
        return this.requestViewed;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Long getUserProfileId() {
        return this.userProfileId;
    }

    public final String toString() {
        String str = this.groupName;
        String str2 = this.displayName;
        String str3 = this.fullName;
        Long l14 = this.groupInviteId;
        Long l15 = this.groupMemberRequestId;
        DateTime dateTime = this.createDate;
        Long l16 = this.groupId;
        uz0.a aVar = this.groupVisibility;
        String str4 = this.profileImageUrlSmall;
        Boolean bool = this.requestViewed;
        Boolean bool2 = this.pro;
        Long l17 = this.userProfileId;
        StringBuilder sbI = p6.b.i("InboxGroupInviteRequestDTO(groupName=", str, ", displayName=", str2, ", fullName=");
        n23.j.q(l14, str3, ", groupInviteId=", ", groupMemberRequestId=", sbI);
        sbI.append(l15);
        sbI.append(", createDate=");
        sbI.append(dateTime);
        sbI.append(", groupId=");
        sbI.append(l16);
        sbI.append(", groupVisibility=");
        sbI.append(aVar);
        sbI.append(", profileImageUrlSmall=");
        b71.i.w(sbI, str4, ", requestViewed=", bool, ", pro=");
        sbI.append(bool2);
        sbI.append(", userProfileId=");
        sbI.append(l17);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.groupName);
        parcel.writeString(this.displayName);
        parcel.writeString(this.fullName);
        Long l14 = this.groupInviteId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Long l15 = this.groupMemberRequestId;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        parcel.writeSerializable(this.createDate);
        Long l16 = this.groupId;
        if (l16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l16);
        }
        uz0.a aVar = this.groupVisibility;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(aVar.name());
        }
        parcel.writeString(this.profileImageUrlSmall);
        Boolean bool = this.requestViewed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        Boolean bool2 = this.pro;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool2);
        }
        Long l17 = this.userProfileId;
        if (l17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l17);
        }
    }

    public b(String str, String str2, String str3, Long l14, Long l15, DateTime dateTime, Long l16, uz0.a aVar, String str4, Boolean bool, Boolean bool2, Long l17) {
        this.groupName = str;
        this.displayName = str2;
        this.fullName = str3;
        this.groupInviteId = l14;
        this.groupMemberRequestId = l15;
        this.createDate = dateTime;
        this.groupId = l16;
        this.groupVisibility = aVar;
        this.profileImageUrlSmall = str4;
        this.requestViewed = bool;
        this.pro = bool2;
        this.userProfileId = l17;
    }
}
