package o51;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lo51/c;", "Landroid/os/Parcelable;", "", "planName", "secondRowInfo", "", "planId", "", "activityTypeIconRes", "<init>", "(Ljava/lang/String;Ljava/lang/String;JI)V", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f129219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f129220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f129221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f129222d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public c(String str, String str2, long j8, int i14) {
        str.getClass();
        str2.getClass();
        this.f129219a = str;
        this.f129220b = str2;
        this.f129221c = j8;
        this.f129222d = i14;
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
        return this.f129219a.equals(cVar.f129219a) && this.f129220b.equals(cVar.f129220b) && this.f129221c == cVar.f129221c && this.f129222d == cVar.f129222d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f129222d) + q6.f.e(wr.g.j(this.f129219a.hashCode() * 31, 31, this.f129220b), 31, this.f129221c);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("PaceProListItemState(planName=", this.f129219a, ", secondRowInfo=", this.f129220b, ", planId=");
        sbI.append(this.f129221c);
        sbI.append(", activityTypeIconRes=");
        sbI.append(this.f129222d);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f129219a);
        parcel.writeString(this.f129220b);
        parcel.writeLong(this.f129221c);
        parcel.writeInt(this.f129222d);
    }
}
