package b21;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Lb21/gb;", "Landroid/os/Parcelable;", "Lb11/b;", "consumableTye", "", "_time", "", "mealId", "<init>", "(Lb11/b;Ljava/lang/String;Ljava/lang/Long;)V", "Lb63/v;", "time", "(Lb11/b;Lb63/v;Ljava/lang/Long;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class gb implements Parcelable {
    public static final Parcelable.Creator<gb> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b11.b f14702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f14704c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<gb> {
        @Override // android.os.Parcelable.Creator
        public final gb createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new gb(b11.b.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final gb[] newArray(int i14) {
            return new gb[i14];
        }
    }

    public gb(b11.b bVar, String str, Long l14) {
        bVar.getClass();
        str.getClass();
        this.f14702a = bVar;
        this.f14703b = str;
        this.f14704c = l14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb)) {
            return false;
        }
        gb gbVar = (gb) obj;
        return this.f14702a == gbVar.f14702a && p005kotlin.jvm.internal.s.g(this.f14703b, gbVar.f14703b) && p005kotlin.jvm.internal.s.g(this.f14704c, gbVar.f14704c);
    }

    public final int hashCode() {
        int iJ = wr.g.j(this.f14702a.hashCode() * 31, 31, this.f14703b);
        Long l14 = this.f14704c;
        return iJ + (l14 == null ? 0 : l14.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("QuickAddResult(consumableTye=");
        sb3.append(this.f14702a);
        sb3.append(", _time=");
        sb3.append(this.f14703b);
        sb3.append(", mealId=");
        return p6.b.g(sb3, this.f14704c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f14702a.name());
        parcel.writeString(this.f14703b);
        Long l14 = this.f14704c;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gb(b11.b bVar, b63.v vVar, Long l14) {
        this(bVar, vVar.toString(), l14);
        bVar.getClass();
        vVar.getClass();
    }
}
