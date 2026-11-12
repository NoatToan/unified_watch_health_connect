package wm0;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.social.conversation.model.DateDeserializer;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.Date;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019¨\u0006\u001a"}, d2 = {"Lwm0/c;", "Landroid/os/Parcelable;", "", "groupMemberRequestId", "userGroupId", "Ljava/util/Date;", "requestDate", "requestorId", "Lwm0/d;", "requestStatus", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Date;Ljava/lang/Long;Lwm0/d;)V", "a", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "getUserGroupId", "c", "Ljava/util/Date;", "getRequestDate", "()Ljava/util/Date;", "d", "f", JWKParameterNames.RSA_EXPONENT, "Lwm0/d;", "()Lwm0/d;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("groupMemberRequestId")
    private final Long groupMemberRequestId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userGroupId")
    private final Long userGroupId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("requestDate")
    @JsonAdapter(DateDeserializer.class)
    private final Date requestDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("requestorId")
    private final Long requestorId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("requestStatus")
    private final d requestStatus;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (Date) parcel.readSerializable(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? d.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(Long l14, Long l15, Date date, Long l16, d dVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : l15, (i14 & 4) != 0 ? null : date, (i14 & 8) != 0 ? null : l16, (i14 & 16) != 0 ? null : dVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getGroupMemberRequestId() {
        return this.groupMemberRequestId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final d getRequestStatus() {
        return this.requestStatus;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.groupMemberRequestId, cVar.groupMemberRequestId) && s.g(this.userGroupId, cVar.userGroupId) && s.g(this.requestDate, cVar.requestDate) && s.g(this.requestorId, cVar.requestorId) && this.requestStatus == cVar.requestStatus;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getRequestorId() {
        return this.requestorId;
    }

    public final int hashCode() {
        Long l14 = this.groupMemberRequestId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        Long l15 = this.userGroupId;
        int iHashCode2 = (iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31;
        Date date = this.requestDate;
        int iHashCode3 = (iHashCode2 + (date == null ? 0 : date.hashCode())) * 31;
        Long l16 = this.requestorId;
        int iHashCode4 = (iHashCode3 + (l16 == null ? 0 : l16.hashCode())) * 31;
        d dVar = this.requestStatus;
        return iHashCode4 + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        Long l14 = this.groupMemberRequestId;
        Long l15 = this.userGroupId;
        Date date = this.requestDate;
        Long l16 = this.requestorId;
        d dVar = this.requestStatus;
        StringBuilder sbJ = f3.j(l14, l15, "GroupMemberRequestDTO(groupMemberRequestId=", ", userGroupId=", ", requestDate=");
        sbJ.append(date);
        sbJ.append(", requestorId=");
        sbJ.append(l16);
        sbJ.append(", requestStatus=");
        sbJ.append(dVar);
        sbJ.append(")");
        return sbJ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.groupMemberRequestId;
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
        parcel.writeSerializable(this.requestDate);
        Long l16 = this.requestorId;
        if (l16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l16);
        }
        d dVar = this.requestStatus;
        if (dVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(dVar.name());
        }
    }

    public c(Long l14, Long l15, Date date, Long l16, d dVar) {
        this.groupMemberRequestId = l14;
        this.userGroupId = l15;
        this.requestDate = date;
        this.requestorId = l16;
        this.requestStatus = dVar;
    }

    public c() {
        this(null, null, null, null, null, 31, null);
    }
}
