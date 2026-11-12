package hi0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016Ba\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u0016\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b \u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010&\u001a\u0004\b\"\u0010'¨\u0006("}, d2 = {"Lhi0/e;", "Landroid/os/Parcelable;", "Lhi0/e$b;", "relationshipStatus", "Lhi0/c;", "sentRequest", "receivedRequest", "", "blocking", "blocked", "muting", "favorite", "", "infoFullName", "", "infoCount", "<init>", "(Lhi0/e$b;Lhi0/c;Lhi0/c;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;)V", "a", "Lhi0/e$b;", JWKParameterNames.OCT_KEY_VALUE, "()Lhi0/e$b;", "b", "Lhi0/c;", "m", "()Lhi0/c;", "c", "j", "d", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", JWKParameterNames.RSA_EXPONENT, "f", IntegerTokenConverter.CONVERTER_KEY, "g", "h", "Ljava/lang/String;", "()Ljava/lang/String;", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("relationshipStatus")
    private final b relationshipStatus;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sentRequest")
    private final c sentRequest;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("receivedRequest")
    private final c receivedRequest;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("blocking")
    private final Boolean blocking;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("blocked")
    private final Boolean blocked;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("muting")
    private final Boolean muting;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("favorite")
    private final Boolean favorite;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("infoFullName")
    private final String infoFullName;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("infoCount")
    private final Integer infoCount;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Integer num;
            Boolean bool;
            Integer numValueOf;
            parcel.getClass();
            b bVarValueOf = parcel.readInt() == 0 ? null : b.valueOf(parcel.readString());
            c cVarCreateFromParcel = parcel.readInt() == 0 ? null : c.CREATOR.createFromParcel(parcel);
            c cVarCreateFromParcel2 = parcel.readInt() == 0 ? null : c.CREATOR.createFromParcel(parcel);
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
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                num = null;
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
                num = null;
            }
            Boolean bool2 = boolValueOf;
            Boolean bool3 = boolValueOf2;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                Boolean bool4 = boolValueOf3;
                numValueOf = num;
                bool = bool4;
            } else {
                bool = boolValueOf3;
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new e(bVarValueOf, cVarCreateFromParcel, cVarCreateFromParcel2, bool2, bool3, bool, boolValueOf4, string, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhi0/e$b;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        NONE,
        FOLLOWING,
        FOLLOWED,
        MUTUAL
    }

    public e(b bVar, c cVar, c cVar2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, Integer num) {
        this.relationshipStatus = bVar;
        this.sentRequest = cVar;
        this.receivedRequest = cVar2;
        this.blocking = bool;
        this.blocked = bool2;
        this.muting = bool3;
        this.favorite = bool4;
        this.infoFullName = str;
        this.infoCount = num;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getBlocked() {
        return this.blocked;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getBlocking() {
        return this.blocking;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.relationshipStatus == eVar.relationshipStatus && s.g(this.sentRequest, eVar.sentRequest) && s.g(this.receivedRequest, eVar.receivedRequest) && s.g(this.blocking, eVar.blocking) && s.g(this.blocked, eVar.blocked) && s.g(this.muting, eVar.muting) && s.g(this.favorite, eVar.favorite) && s.g(this.infoFullName, eVar.infoFullName) && s.g(this.infoCount, eVar.infoCount);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Boolean getFavorite() {
        return this.favorite;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getInfoCount() {
        return this.infoCount;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getInfoFullName() {
        return this.infoFullName;
    }

    public final int hashCode() {
        b bVar = this.relationshipStatus;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        c cVar = this.sentRequest;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        c cVar2 = this.receivedRequest;
        int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        Boolean bool = this.blocking;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.blocked;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.muting;
        int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.favorite;
        int iHashCode7 = (iHashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str = this.infoFullName;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.infoCount;
        return iHashCode8 + (num != null ? num.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Boolean getMuting() {
        return this.muting;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final c getReceivedRequest() {
        return this.receivedRequest;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final b getRelationshipStatus() {
        return this.relationshipStatus;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final c getSentRequest() {
        return this.sentRequest;
    }

    public final String toString() {
        b bVar = this.relationshipStatus;
        c cVar = this.sentRequest;
        c cVar2 = this.receivedRequest;
        Boolean bool = this.blocking;
        Boolean bool2 = this.blocked;
        Boolean bool3 = this.muting;
        Boolean bool4 = this.favorite;
        String str = this.infoFullName;
        Integer num = this.infoCount;
        StringBuilder sb3 = new StringBuilder("FollowStatusDTO(relationshipStatus=");
        sb3.append(bVar);
        sb3.append(", sentRequest=");
        sb3.append(cVar);
        sb3.append(", receivedRequest=");
        sb3.append(cVar2);
        sb3.append(", blocking=");
        sb3.append(bool);
        sb3.append(", blocked=");
        b71.i.o(bool2, bool3, ", muting=", ", favorite=", sb3);
        b71.i.s(sb3, bool4, ", infoFullName=", str, ", infoCount=");
        return f3.i(sb3, num, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        b bVar = this.relationshipStatus;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(bVar.name());
        }
        c cVar = this.sentRequest;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cVar.writeToParcel(parcel, i14);
        }
        c cVar2 = this.receivedRequest;
        if (cVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cVar2.writeToParcel(parcel, i14);
        }
        Boolean bool = this.blocking;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        Boolean bool2 = this.blocked;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool2);
        }
        Boolean bool3 = this.muting;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool3);
        }
        Boolean bool4 = this.favorite;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool4);
        }
        parcel.writeString(this.infoFullName);
        Integer num = this.infoCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
    }
}
