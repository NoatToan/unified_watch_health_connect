package g81;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lg81/d0;", "Landroid/os/Parcelable;", "", "changeSign", "changeIconTint", "", "changeValue", "<init>", "(Ljava/lang/Integer;ILjava/lang/String;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d0 implements Parcelable {
    public static final Parcelable.Creator<d0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f76300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f76301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76302c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d0> {
        @Override // android.os.Parcelable.Creator
        public final d0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d0(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final d0[] newArray(int i14) {
            return new d0[i14];
        }
    }

    public d0(Integer num, int i14, String str) {
        str.getClass();
        this.f76300a = num;
        this.f76301b = i14;
        this.f76302c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return p005kotlin.jvm.internal.s.g(this.f76300a, d0Var.f76300a) && this.f76301b == d0Var.f76301b && this.f76302c.equals(d0Var.f76302c);
    }

    public final int hashCode() {
        Integer num = this.f76300a;
        return this.f76302c.hashCode() + q2.d(this.f76301b, (num == null ? 0 : num.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MarkerChangeState(changeSign=");
        sb3.append(this.f76300a);
        sb3.append(", changeIconTint=");
        sb3.append(this.f76301b);
        sb3.append(", changeValue=");
        return am.j.o(this.f76302c, ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.f76300a;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeInt(this.f76301b);
        parcel.writeString(this.f76302c);
    }
}
