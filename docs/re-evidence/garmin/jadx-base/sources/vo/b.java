package vo;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import i3.e5;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lvo/b;", "Landroid/os/Parcelable;", "", "rangeStart", "rangeEnd", "initialProgress", "<init>", "(III)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f178992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f178993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f178994c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(int i14, int i15, int i16) {
        this.f178992a = i14;
        this.f178993b = i15;
        this.f178994c = i16;
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
        return this.f178992a == bVar.f178992a && this.f178993b == bVar.f178993b && this.f178994c == bVar.f178994c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f178994c) + q2.d(this.f178993b, Integer.hashCode(this.f178992a) * 31, 31);
    }

    public final String toString() {
        return j.q(e5.j(this.f178992a, this.f178993b, "MultisportDivideLegUiData(rangeStart=", ", rangeEnd=", ", initialProgress="), this.f178994c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f178992a);
        parcel.writeInt(this.f178993b);
        parcel.writeInt(this.f178994c);
    }
}
