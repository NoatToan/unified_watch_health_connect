package wm0;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.social.conversation.model.DateDeserializer;
import com.garmin.android.apps.connectmobile.social.conversation.model.GCDateTimeDeserializer;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.Date;
import kg.f;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001d\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0010\u001a\u0004\b\u001e\u0010\u0012R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b\u0018\u0010 ¨\u0006!"}, d2 = {"Lwm0/a;", "Landroid/os/Parcelable;", "", "groupInviteId", "userGroupId", "Ljava/util/Date;", "inviteDate", "Lorg/joda/time/DateTime;", "updateDate", "invitorId", "inviteeId", "Lwm0/b;", "inviteStatus", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Date;Lorg/joda/time/DateTime;Ljava/lang/Long;Ljava/lang/Long;Lwm0/b;)V", "a", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "getUserGroupId", "c", "Ljava/util/Date;", "getInviteDate", "()Ljava/util/Date;", "d", "Lorg/joda/time/DateTime;", "g", "()Lorg/joda/time/DateTime;", JWKParameterNames.RSA_EXPONENT, "getInvitorId", "f", "Lwm0/b;", "()Lwm0/b;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C3458a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("groupInviteId")
    private final Long groupInviteId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userGroupId")
    private final Long userGroupId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("inviteDate")
    @JsonAdapter(DateDeserializer.class)
    private final Date inviteDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("updateDate")
    @JsonAdapter(GCDateTimeDeserializer.class)
    private final DateTime updateDate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("invitorId")
    private final Long invitorId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("inviteeId")
    private final Long inviteeId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("inviteStatus")
    private final b inviteStatus;

    /* JADX INFO: renamed from: wm0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3458a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (Date) parcel.readSerializable(), (DateTime) parcel.readSerializable(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? b.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(Long l14, Long l15, Date date, DateTime dateTime, Long l16, Long l17, b bVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : l15, (i14 & 4) != 0 ? null : date, (i14 & 8) != 0 ? null : dateTime, (i14 & 16) != 0 ? null : l16, (i14 & 32) != 0 ? null : l17, (i14 & 64) != 0 ? null : bVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getGroupInviteId() {
        return this.groupInviteId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b getInviteStatus() {
        return this.inviteStatus;
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
        return s.g(this.groupInviteId, aVar.groupInviteId) && s.g(this.userGroupId, aVar.userGroupId) && s.g(this.inviteDate, aVar.inviteDate) && s.g(this.updateDate, aVar.updateDate) && s.g(this.invitorId, aVar.invitorId) && s.g(this.inviteeId, aVar.inviteeId) && this.inviteStatus == aVar.inviteStatus;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getInviteeId() {
        return this.inviteeId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final DateTime getUpdateDate() {
        return this.updateDate;
    }

    public final int hashCode() {
        Long l14 = this.groupInviteId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        Long l15 = this.userGroupId;
        int iHashCode2 = (iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31;
        Date date = this.inviteDate;
        int iHashCode3 = (iHashCode2 + (date == null ? 0 : date.hashCode())) * 31;
        DateTime dateTime = this.updateDate;
        int iHashCode4 = (iHashCode3 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        Long l16 = this.invitorId;
        int iHashCode5 = (iHashCode4 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Long l17 = this.inviteeId;
        int iHashCode6 = (iHashCode5 + (l17 == null ? 0 : l17.hashCode())) * 31;
        b bVar = this.inviteStatus;
        return iHashCode6 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        Long l14 = this.groupInviteId;
        Long l15 = this.userGroupId;
        Date date = this.inviteDate;
        DateTime dateTime = this.updateDate;
        Long l16 = this.invitorId;
        Long l17 = this.inviteeId;
        b bVar = this.inviteStatus;
        StringBuilder sbJ = f3.j(l14, l15, "GroupInviteDTO(groupInviteId=", ", userGroupId=", ", inviteDate=");
        sbJ.append(date);
        sbJ.append(", updateDate=");
        sbJ.append(dateTime);
        sbJ.append(", invitorId=");
        f.s(sbJ, l16, ", inviteeId=", l17, ", inviteStatus=");
        sbJ.append(bVar);
        sbJ.append(")");
        return sbJ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.groupInviteId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Long l15 = this.userGroupId;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        parcel.writeSerializable(this.inviteDate);
        parcel.writeSerializable(this.updateDate);
        Long l16 = this.invitorId;
        if (l16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l16);
        }
        Long l17 = this.inviteeId;
        if (l17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l17);
        }
        b bVar = this.inviteStatus;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(bVar.name());
        }
    }

    public a(Long l14, Long l15, Date date, DateTime dateTime, Long l16, Long l17, b bVar) {
        this.groupInviteId = l14;
        this.userGroupId = l15;
        this.inviteDate = date;
        this.updateDate = dateTime;
        this.invitorId = l16;
        this.inviteeId = l17;
        this.inviteStatus = bVar;
    }

    public a() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
