package hx2;

import android.os.Parcel;
import android.os.Parcelable;
import b71.i;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import kx2.f;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;
import wr.g;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001e¨\u0006!"}, d2 = {"Lhx2/c;", "Landroid/os/Parcelable;", "", "dataType", "contentType", "", "size", "Lkx2/f;", "duration", "nbrStatusChecks", "httpCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILkx2/f;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "Ljava/lang/String;", "getDataType", "()Ljava/lang/String;", "b", "getContentType", "c", "I", "getSize", "()I", "d", "Lkx2/f;", "getDuration", "()Lkx2/f;", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Integer;", "getNbrStatusChecks", "()Ljava/lang/Integer;", "f", "getHttpCode", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("DataType")
    private final String dataType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ContentType")
    private final String contentType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Size")
    private final int size;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Duration")
    private final f duration;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("CheckbackCount")
    private final Integer nbrStatusChecks;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("HttpCode")
    private final Integer httpCode;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : f.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public c(String str, String str2, int i14, f fVar, Integer num, Integer num2) {
        str.getClass();
        str2.getClass();
        this.dataType = str;
        this.contentType = str2;
        this.size = i14;
        this.duration = fVar;
        this.nbrStatusChecks = num;
        this.httpCode = num2;
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
        return s.g(this.dataType, cVar.dataType) && s.g(this.contentType, cVar.contentType) && this.size == cVar.size && s.g(this.duration, cVar.duration) && s.g(this.nbrStatusChecks, cVar.nbrStatusChecks) && s.g(this.httpCode, cVar.httpCode);
    }

    public final int hashCode() {
        int iD = q2.d(this.size, g.j(this.dataType.hashCode() * 31, 31, this.contentType), 31);
        f fVar = this.duration;
        int iHashCode = (iD + (fVar == null ? 0 : fVar.hashCode())) * 31;
        Integer num = this.nbrStatusChecks;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.httpCode;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.dataType;
        String str2 = this.contentType;
        int i14 = this.size;
        f fVar = this.duration;
        Integer num = this.nbrStatusChecks;
        Integer num2 = this.httpCode;
        StringBuilder sbI = p6.b.i("SaMDFileTransferAnalyticInfo(dataType=", str, ", contentType=", str2, ", size=");
        sbI.append(i14);
        sbI.append(", duration=");
        sbI.append(fVar);
        sbI.append(", nbrStatusChecks=");
        return i.h(sbI, num, ", httpCode=", num2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.dataType);
        parcel.writeString(this.contentType);
        parcel.writeInt(this.size);
        f fVar = this.duration;
        if (fVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fVar.writeToParcel(parcel, i14);
        }
        Integer num = this.nbrStatusChecks;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.httpCode;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
    }
}
