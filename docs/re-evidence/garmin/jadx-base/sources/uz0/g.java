package uz0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.gncs.NotificationConstants;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b\u0019\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b!\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b*\u0010\u001cR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010+\u001a\u0004\b&\u0010,R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u0016\u001a\u0004\b\"\u0010\u0018R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b/\u0010)¨\u00060"}, d2 = {"Luz0/g;", "Landroid/os/Parcelable;", "", "fromUserId", "", "displayName", "fullName", "attributes", "dateTimeString", "groupName", "Luz0/k;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "viewed", "imageUrl", "Luz0/j;", "relativeNameValue", "notificationId", "pro", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Luz0/k;Ljava/lang/Boolean;Ljava/lang/String;Luz0/j;Ljava/lang/Long;Ljava/lang/Boolean;)V", "a", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "b", "Ljava/lang/String;", "getDisplayName", "()Ljava/lang/String;", "c", "f", "getAttributes", JWKParameterNames.RSA_EXPONENT, "getGroupName", "g", "Luz0/k;", IntegerTokenConverter.CONVERTER_KEY, "()Luz0/k;", "h", "Ljava/lang/Boolean;", "j", "()Ljava/lang/Boolean;", "getImageUrl", "Luz0/j;", "()Luz0/j;", JWKParameterNames.OCT_KEY_VALUE, "l", "getPro", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fromUserId")
    private final Long fromUserId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayName")
    private final String displayName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fullName")
    private final String fullName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("attributes")
    private final String attributes;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dateTimeString")
    private final String dateTimeString;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("groupName")
    private final String groupName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName(NotificationConstants.KEY_DATA_MIME_TYPE)
    private final k type;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("viewed")
    private final Boolean viewed;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("imageUrl")
    private final String imageUrl;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("relativeNameValue")
    private final j relativeNameValue;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("notificationId")
    private final Long notificationId;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pro")
    private final Boolean pro;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<g> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            Long lValueOf;
            Boolean bool;
            Boolean boolValueOf;
            Parcel parcel2;
            Object objCreateFromParcel;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                lValueOf = null;
                bool = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
                bool = null;
            }
            String string = parcel.readString();
            Boolean bool2 = bool;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Boolean boolValueOf2 = bool2;
            String string5 = parcel.readString();
            Object objValueOf = parcel.readInt() == 0 ? boolValueOf2 : k.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf = boolValueOf2;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                parcel2 = parcel;
                objCreateFromParcel = boolValueOf2;
            } else {
                parcel2 = parcel;
                objCreateFromParcel = j.CREATOR.createFromParcel(parcel2);
            }
            j jVar = (j) objCreateFromParcel;
            Object objValueOf2 = parcel2.readInt() == 0 ? boolValueOf2 : Long.valueOf(parcel2.readLong());
            if (parcel2.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel2.readInt() != 0);
            }
            return new g(lValueOf, string, string2, string3, string4, string5, objValueOf, boolValueOf, string6, jVar, objValueOf2, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    public /* synthetic */ g(Long l14, String str, String str2, String str3, String str4, String str5, k kVar, Boolean bool, String str6, j jVar, Long l15, Boolean bool2, int i14, p005kotlin.jvm.internal.j jVar2) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? null : str5, (i14 & 64) != 0 ? null : kVar, (i14 & 128) != 0 ? null : bool, (i14 & 256) != 0 ? null : str6, jVar, (i14 & 1024) != 0 ? null : l15, (i14 & 2048) != 0 ? Boolean.FALSE : bool2);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDateTimeString() {
        return this.dateTimeString;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getFromUserId() {
        return this.fromUserId;
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
        return s.g(this.fromUserId, gVar.fromUserId) && s.g(this.displayName, gVar.displayName) && s.g(this.fullName, gVar.fullName) && s.g(this.attributes, gVar.attributes) && s.g(this.dateTimeString, gVar.dateTimeString) && s.g(this.groupName, gVar.groupName) && this.type == gVar.type && s.g(this.viewed, gVar.viewed) && s.g(this.imageUrl, gVar.imageUrl) && s.g(this.relativeNameValue, gVar.relativeNameValue) && s.g(this.notificationId, gVar.notificationId) && s.g(this.pro, gVar.pro);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getNotificationId() {
        return this.notificationId;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final j getRelativeNameValue() {
        return this.relativeNameValue;
    }

    public final int hashCode() {
        Long l14 = this.fromUserId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.displayName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fullName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.attributes;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dateTimeString;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.groupName;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        k kVar = this.type;
        int iHashCode7 = (iHashCode6 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        Boolean bool = this.viewed;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str6 = this.imageUrl;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        j jVar = this.relativeNameValue;
        int iHashCode10 = (iHashCode9 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        Long l15 = this.notificationId;
        int iHashCode11 = (iHashCode10 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Boolean bool2 = this.pro;
        return iHashCode11 + (bool2 != null ? bool2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final k getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Boolean getViewed() {
        return this.viewed;
    }

    public final String toString() {
        Long l14 = this.fromUserId;
        String str = this.displayName;
        String str2 = this.fullName;
        String str3 = this.attributes;
        String str4 = this.dateTimeString;
        String str5 = this.groupName;
        k kVar = this.type;
        Boolean bool = this.viewed;
        String str6 = this.imageUrl;
        j jVar = this.relativeNameValue;
        Long l15 = this.notificationId;
        Boolean bool2 = this.pro;
        StringBuilder sbJ = b71.i.j("NotificationFullItemDTO(fromUserId=", ", displayName=", str, l14, ", fullName=");
        sn.a.t(sbJ, str2, ", attributes=", str3, ", dateTimeString=");
        sn.a.t(sbJ, str4, ", groupName=", str5, ", type=");
        sbJ.append(kVar);
        sbJ.append(", viewed=");
        sbJ.append(bool);
        sbJ.append(", imageUrl=");
        sbJ.append(str6);
        sbJ.append(", relativeNameValue=");
        sbJ.append(jVar);
        sbJ.append(", notificationId=");
        sbJ.append(l15);
        sbJ.append(", pro=");
        sbJ.append(bool2);
        sbJ.append(")");
        return sbJ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.fromUserId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.displayName);
        parcel.writeString(this.fullName);
        parcel.writeString(this.attributes);
        parcel.writeString(this.dateTimeString);
        parcel.writeString(this.groupName);
        k kVar = this.type;
        if (kVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(kVar.name());
        }
        Boolean bool = this.viewed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        parcel.writeString(this.imageUrl);
        j jVar = this.relativeNameValue;
        if (jVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            jVar.writeToParcel(parcel, i14);
        }
        Long l15 = this.notificationId;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        Boolean bool2 = this.pro;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool2);
        }
    }

    public g(Long l14, String str, String str2, String str3, String str4, String str5, k kVar, Boolean bool, String str6, j jVar, Long l15, Boolean bool2) {
        this.fromUserId = l14;
        this.displayName = str;
        this.fullName = str2;
        this.attributes = str3;
        this.dateTimeString = str4;
        this.groupName = str5;
        this.type = kVar;
        this.viewed = bool;
        this.imageUrl = str6;
        this.relativeNameValue = jVar;
        this.notificationId = l15;
        this.pro = bool2;
    }
}
