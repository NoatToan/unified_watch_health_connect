package rk0;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lrk0/o0;", "Landroid/os/Parcelable;", "", "gearId", "Lc80/u;", "initialGearType", "", "initialGearRetired", "newGearType", "newGearRetired", "dataChanged", "removedFromActivity", "removedFromCollection", "deleted", "<init>", "(Ljava/lang/String;Lc80/u;Ljava/lang/Boolean;Lc80/u;Ljava/lang/Boolean;ZZZZ)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o0 implements Parcelable {
    public static final Parcelable.Creator<o0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c80.u f153239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f153240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c80.u f153241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f153242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f153243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f153244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f153245h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f153246i;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<o0> {
        @Override // android.os.Parcelable.Creator
        public final o0 createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            boolean z14;
            boolean z15;
            parcel.getClass();
            String string = parcel.readString();
            Boolean boolValueOf2 = null;
            c80.u uVarValueOf = parcel.readInt() == 0 ? null : c80.u.valueOf(parcel.readString());
            boolean z16 = true;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            c80.u uVarValueOf2 = parcel.readInt() == 0 ? null : c80.u.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                z16 = false;
            }
            if (parcel.readInt() != 0) {
                z14 = false;
                z15 = z16;
            } else {
                z14 = false;
                z15 = false;
            }
            if (parcel.readInt() == 0) {
                z16 = z14;
            }
            if (parcel.readInt() != 0) {
                z14 = true;
            }
            return new o0(string, uVarValueOf, boolValueOf, uVarValueOf2, boolValueOf2, z16, z15, z16, z14);
        }

        @Override // android.os.Parcelable.Creator
        public final o0[] newArray(int i14) {
            return new o0[i14];
        }
    }

    public /* synthetic */ o0(String str, c80.u uVar, Boolean bool, c80.u uVar2, Boolean bool2, boolean z14, boolean z15, boolean z16, boolean z17, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, uVar, bool, (i14 & 8) != 0 ? null : uVar2, (i14 & 16) != 0 ? null : bool2, (i14 & 32) != 0 ? false : z14, (i14 & 64) != 0 ? false : z15, (i14 & 128) != 0 ? false : z16, (i14 & 256) != 0 ? false : z17);
    }

    public static o0 b(o0 o0Var, c80.u uVar, Boolean bool, c80.u uVar2, Boolean bool2, boolean z14, int i14) {
        String str = o0Var.f153238a;
        if ((i14 & 2) != 0) {
            uVar = o0Var.f153239b;
        }
        c80.u uVar3 = uVar;
        if ((i14 & 4) != 0) {
            bool = o0Var.f153240c;
        }
        Boolean bool3 = bool;
        if ((i14 & 8) != 0) {
            uVar2 = o0Var.f153241d;
        }
        c80.u uVar4 = uVar2;
        if ((i14 & 16) != 0) {
            bool2 = o0Var.f153242e;
        }
        Boolean bool4 = bool2;
        boolean z15 = (i14 & 32) != 0 ? o0Var.f153243f : true;
        boolean z16 = (i14 & 64) != 0 ? o0Var.f153244g : true;
        boolean z17 = (i14 & 128) != 0 ? o0Var.f153245h : z14;
        boolean z18 = (i14 & 256) != 0 ? o0Var.f153246i : true;
        o0Var.getClass();
        str.getClass();
        return new o0(str, uVar3, bool3, uVar4, bool4, z15, z16, z17, z18);
    }

    public final boolean d() {
        Boolean bool = this.f153242e;
        return !(bool == null || p005kotlin.jvm.internal.s.g(this.f153240c, bool)) || this.f153246i || this.f153245h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return p005kotlin.jvm.internal.s.g(this.f153238a, o0Var.f153238a) && this.f153239b == o0Var.f153239b && p005kotlin.jvm.internal.s.g(this.f153240c, o0Var.f153240c) && this.f153241d == o0Var.f153241d && p005kotlin.jvm.internal.s.g(this.f153242e, o0Var.f153242e) && this.f153243f == o0Var.f153243f && this.f153244g == o0Var.f153244g && this.f153245h == o0Var.f153245h && this.f153246i == o0Var.f153246i;
    }

    public final boolean f() {
        if (this.f153243f) {
            return true;
        }
        c80.u uVar = this.f153241d;
        if (uVar != null && this.f153239b != uVar) {
            return true;
        }
        Boolean bool = this.f153242e;
        return !(bool == null || p005kotlin.jvm.internal.s.g(this.f153240c, bool)) || this.f153246i || this.f153244g;
    }

    public final int hashCode() {
        int iHashCode = this.f153238a.hashCode() * 31;
        c80.u uVar = this.f153239b;
        int iHashCode2 = (iHashCode + (uVar == null ? 0 : uVar.hashCode())) * 31;
        Boolean bool = this.f153240c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        c80.u uVar2 = this.f153241d;
        int iHashCode4 = (iHashCode3 + (uVar2 == null ? 0 : uVar2.hashCode())) * 31;
        Boolean bool2 = this.f153242e;
        return Boolean.hashCode(this.f153246i) + q6.f.g(q6.f.g(q6.f.g((iHashCode4 + (bool2 != null ? bool2.hashCode() : 0)) * 31, 31, this.f153243f), 31, this.f153244g), 31, this.f153245h);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GearEditResult(gearId=");
        sb3.append(this.f153238a);
        sb3.append(", initialGearType=");
        sb3.append(this.f153239b);
        sb3.append(", initialGearRetired=");
        sb3.append(this.f153240c);
        sb3.append(", newGearType=");
        sb3.append(this.f153241d);
        sb3.append(", newGearRetired=");
        sb3.append(this.f153242e);
        sb3.append(", dataChanged=");
        sb3.append(this.f153243f);
        sb3.append(", removedFromActivity=");
        kg.f.q(", removedFromCollection=", ", deleted=", sb3, this.f153244g, this.f153245h);
        return hb.a.k(sb3, this.f153246i, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f153238a);
        c80.u uVar = this.f153239b;
        if (uVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(uVar.name());
        }
        Boolean bool = this.f153240c;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        c80.u uVar2 = this.f153241d;
        if (uVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(uVar2.name());
        }
        Boolean bool2 = this.f153242e;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool2);
        }
        parcel.writeInt(this.f153243f ? 1 : 0);
        parcel.writeInt(this.f153244g ? 1 : 0);
        parcel.writeInt(this.f153245h ? 1 : 0);
        parcel.writeInt(this.f153246i ? 1 : 0);
    }

    public o0(String str, c80.u uVar, Boolean bool, c80.u uVar2, Boolean bool2, boolean z14, boolean z15, boolean z16, boolean z17) {
        str.getClass();
        this.f153238a = str;
        this.f153239b = uVar;
        this.f153240c = bool;
        this.f153241d = uVar2;
        this.f153242e = bool2;
        this.f153243f = z14;
        this.f153244g = z15;
        this.f153245h = z16;
        this.f153246i = z17;
    }
}
