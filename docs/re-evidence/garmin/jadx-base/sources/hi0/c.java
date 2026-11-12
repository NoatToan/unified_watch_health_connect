package hi0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lhi0/c;", "Landroid/os/Parcelable;", "", TtmlNode.ATTR_ID, "", "requesteeId", "requestorId", "Lhi0/c$b;", "requestStatus", "", "requestStartTime", "requestEndTime", "", "requestViewed", "<init>", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Lhi0/c$b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "a", "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "Ljava/lang/Long;", "getRequesteeId", "()Ljava/lang/Long;", "c", "getRequestorId", "d", "Lhi0/c$b;", "()Lhi0/c$b;", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/String;", "getRequestStartTime", "()Ljava/lang/String;", "f", "getRequestEndTime", "g", "Ljava/lang/Boolean;", "getRequestViewed", "()Ljava/lang/Boolean;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(TtmlNode.ATTR_ID)
    private final Integer id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("requesteeId")
    private final Long requesteeId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("requestorId")
    private final Long requestorId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("requestStatus")
    private final b requestStatus;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("requestStartTime")
    private final String requestStartTime;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("requestEndTime")
    private final String requestEndTime;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("requestViewed")
    private final Boolean requestViewed;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            b bVarValueOf = parcel.readInt() == 0 ? null : b.valueOf(parcel.readString());
            String string = parcel.readString();
            Boolean boolValueOf = null;
            Long l14 = lValueOf;
            Long l15 = lValueOf2;
            b bVar = bVarValueOf;
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new c(numValueOf, l14, l15, bVar, string, string2, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhi0/c$b;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        CREATED,
        ACCEPTED,
        /* JADX INFO: Fake field, exist only in values array */
        DECLINED,
        /* JADX INFO: Fake field, exist only in values array */
        CANCELLED
    }

    public c(Integer num, Long l14, Long l15, b bVar, String str, String str2, Boolean bool) {
        this.id = num;
        this.requesteeId = l14;
        this.requestorId = l15;
        this.requestStatus = bVar;
        this.requestStartTime = str;
        this.requestEndTime = str2;
        this.requestViewed = bool;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b getRequestStatus() {
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
        return s.g(this.id, cVar.id) && s.g(this.requesteeId, cVar.requesteeId) && s.g(this.requestorId, cVar.requestorId) && this.requestStatus == cVar.requestStatus && s.g(this.requestStartTime, cVar.requestStartTime) && s.g(this.requestEndTime, cVar.requestEndTime) && s.g(this.requestViewed, cVar.requestViewed);
    }

    public final int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l14 = this.requesteeId;
        int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.requestorId;
        int iHashCode3 = (iHashCode2 + (l15 == null ? 0 : l15.hashCode())) * 31;
        b bVar = this.requestStatus;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.requestStartTime;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.requestEndTime;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.requestViewed;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.id;
        Long l14 = this.requesteeId;
        Long l15 = this.requestorId;
        b bVar = this.requestStatus;
        String str = this.requestStartTime;
        String str2 = this.requestEndTime;
        Boolean bool = this.requestViewed;
        StringBuilder sb3 = new StringBuilder("FollowRequestDTO(id=");
        sb3.append(num);
        sb3.append(", requesteeId=");
        sb3.append(l14);
        sb3.append(", requestorId=");
        sb3.append(l15);
        sb3.append(", requestStatus=");
        sb3.append(bVar);
        sb3.append(", requestStartTime=");
        sn.a.t(sb3, str, ", requestEndTime=", str2, ", requestViewed=");
        return p6.b.f(sb3, bool, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Long l14 = this.requesteeId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Long l15 = this.requestorId;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        b bVar = this.requestStatus;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(bVar.name());
        }
        parcel.writeString(this.requestStartTime);
        parcel.writeString(this.requestEndTime);
        Boolean bool = this.requestViewed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
    }
}
