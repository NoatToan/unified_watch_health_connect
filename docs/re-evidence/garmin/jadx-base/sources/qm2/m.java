package qm2;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lqm2/m;", "Landroid/os/Parcelable;", "Lqm2/l$c;", "setting", "", "initializedValue", "<init>", "(Lqm2/l$c;Ljava/lang/Boolean;)V", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l.c f145778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f145779b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            parcel.getClass();
            l.c cVarValueOf = l.c.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new m(cVarValueOf, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i14) {
            return new m[i14];
        }
    }

    public m(l.c cVar, Boolean bool) {
        cVar.getClass();
        this.f145778a = cVar;
        this.f145779b = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f145778a == mVar.f145778a && s.g(this.f145779b, mVar.f145779b);
    }

    public final int hashCode() {
        int iHashCode = this.f145778a.hashCode() * 31;
        Boolean bool = this.f145779b;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "HandshakeSetting(setting=" + this.f145778a + ", initializedValue=" + this.f145779b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f145778a.name());
        Boolean bool = this.f145779b;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
    }
}
