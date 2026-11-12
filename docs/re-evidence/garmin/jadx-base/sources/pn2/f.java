package pn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u000e\u0010\r¨\u0006\u0014"}, d2 = {"Lpn2/f;", "Lpn2/d;", "", "order", "valid", "Lpn2/k;", "record", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lpn2/k;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getOrder", "()Ljava/lang/String;", "b", "f", "c", "Lpn2/k;", "d", "()Lpn2/k;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f implements d {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("order")
    private final String order;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("valid")
    private final String valid;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("record")
    private final k record;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("message")
    private final String message;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new f(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : k.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public f(String str, String str2, k kVar, String str3) {
        str.getClass();
        str2.getClass();
        this.order = str;
        this.valid = str2;
        this.record = kVar;
        this.message = str3;
        int length = str.length();
        if (1 > length || length >= 4) {
            vb.h.x(am.j.h(str.length(), "order length(1-3): "));
            throw null;
        }
        if (str2.length() != 1) {
            vb.h.x(am.j.h(str2.length(), "valid length(1): "));
            throw null;
        }
        if (str3 != null) {
            int length2 = str3.length();
            if (1 > length2 || length2 >= 1025) {
                vb.h.x(am.j.h(str3.length(), "message length(1-1024): "));
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final k getRecord() {
        return this.record;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return p005kotlin.jvm.internal.s.g(this.order, fVar.order) && p005kotlin.jvm.internal.s.g(this.valid, fVar.valid) && p005kotlin.jvm.internal.s.g(this.record, fVar.record) && p005kotlin.jvm.internal.s.g(this.message, fVar.message);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getValid() {
        return this.valid;
    }

    public final int hashCode() {
        int iJ = wr.g.j(this.order.hashCode() * 31, 31, this.valid);
        k kVar = this.record;
        int iHashCode = (iJ + (kVar == null ? 0 : kVar.hashCode())) * 31;
        String str = this.message;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String str = this.order;
        String str2 = this.valid;
        k kVar = this.record;
        String str3 = this.message;
        StringBuilder sbI = p6.b.i("FNHistoryItemDto(order='", str, "', valid='", str2, "', record=");
        sbI.append(kVar);
        sbI.append(", message='");
        sbI.append(str3);
        sbI.append("')");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.order);
        parcel.writeString(this.valid);
        k kVar = this.record;
        if (kVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            kVar.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.message);
    }
}
