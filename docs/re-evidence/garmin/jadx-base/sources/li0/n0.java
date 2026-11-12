package li0;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lli0/n0;", "Landroid/os/Parcelable;", "Lhi0/e$b;", "relationshipStatus", "", "blocking", "muting", "favorite", "<init>", "(Lhi0/e$b;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n0 implements Parcelable {
    public static final Parcelable.Creator<n0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hi0.e.b f112816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f112817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f112818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f112819d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<n0> {
        @Override // android.os.Parcelable.Creator
        public final n0 createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            parcel.getClass();
            Boolean boolValueOf3 = null;
            hi0.e.b bVarValueOf = parcel.readInt() == 0 ? null : hi0.e.b.valueOf(parcel.readString());
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
            if (parcel.readInt() != 0) {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new n0(bVarValueOf, boolValueOf, boolValueOf2, boolValueOf3);
        }

        @Override // android.os.Parcelable.Creator
        public final n0[] newArray(int i14) {
            return new n0[i14];
        }
    }

    public n0(hi0.e.b bVar, Boolean bool, Boolean bool2, Boolean bool3) {
        this.f112816a = bVar;
        this.f112817b = bool;
        this.f112818c = bool2;
        this.f112819d = bool3;
    }

    public static n0 b(n0 n0Var, hi0.e.b bVar, Boolean bool, Boolean bool2, int i14) {
        Boolean bool3 = Boolean.FALSE;
        if ((i14 & 1) != 0) {
            bVar = n0Var.f112816a;
        }
        if ((i14 & 2) != 0) {
            bool3 = n0Var.f112817b;
        }
        if ((i14 & 4) != 0) {
            bool = n0Var.f112818c;
        }
        if ((i14 & 8) != 0) {
            bool2 = n0Var.f112819d;
        }
        n0Var.getClass();
        return new n0(bVar, bool3, bool, bool2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.f112816a == n0Var.f112816a && p005kotlin.jvm.internal.s.g(this.f112817b, n0Var.f112817b) && p005kotlin.jvm.internal.s.g(this.f112818c, n0Var.f112818c) && p005kotlin.jvm.internal.s.g(this.f112819d, n0Var.f112819d);
    }

    public final int hashCode() {
        hi0.e.b bVar = this.f112816a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        Boolean bool = this.f112817b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f112818c;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f112819d;
        return iHashCode3 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        return "FollowStatusData(relationshipStatus=" + this.f112816a + ", blocking=" + this.f112817b + ", muting=" + this.f112818c + ", favorite=" + this.f112819d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        hi0.e.b bVar = this.f112816a;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(bVar.name());
        }
        Boolean bool = this.f112817b;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        Boolean bool2 = this.f112818c;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool2);
        }
        Boolean bool3 = this.f112819d;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool3);
        }
    }
}
