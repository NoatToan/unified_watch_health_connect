package sk0;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0083\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lsk0/o0;", "Landroid/os/Parcelable;", "", "brandRequired", "brandInvalid", "nicknameInvalid", "distanceInvalid", "durationInvalid", "<init>", "(ZZZZZ)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o0 implements Parcelable {
    public static final Parcelable.Creator<o0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f159789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f159790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f159791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f159792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f159793e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<o0> {
        @Override // android.os.Parcelable.Creator
        public final o0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            boolean z14 = false;
            boolean z15 = true;
            boolean z16 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z14 = true;
            }
            if (parcel.readInt() == 0) {
                z15 = z14;
            }
            if (parcel.readInt() != 0) {
                z14 = true;
            }
            return new o0(z16, z14, z15, z14, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final o0[] newArray(int i14) {
            return new o0[i14];
        }
    }

    public /* synthetic */ o0(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? false : z16, (i14 & 8) != 0 ? false : z17, (i14 & 16) != 0 ? false : z18);
    }

    public static o0 b(o0 o0Var, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, int i14) {
        if ((i14 & 1) != 0) {
            z14 = o0Var.f159789a;
        }
        boolean z19 = z14;
        if ((i14 & 2) != 0) {
            z15 = o0Var.f159790b;
        }
        boolean z24 = z15;
        if ((i14 & 4) != 0) {
            z16 = o0Var.f159791c;
        }
        boolean z25 = z16;
        if ((i14 & 8) != 0) {
            z17 = o0Var.f159792d;
        }
        boolean z26 = z17;
        if ((i14 & 16) != 0) {
            z18 = o0Var.f159793e;
        }
        o0Var.getClass();
        return new o0(z19, z24, z25, z26, z18);
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
        return this.f159789a == o0Var.f159789a && this.f159790b == o0Var.f159790b && this.f159791c == o0Var.f159791c && this.f159792d == o0Var.f159792d && this.f159793e == o0Var.f159793e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f159793e) + q6.f.g(q6.f.g(q6.f.g(Boolean.hashCode(this.f159789a) * 31, 31, this.f159790b), 31, this.f159791c), 31, this.f159792d);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("CreateGearValidation(brandRequired=", ", brandInvalid=", ", nicknameInvalid=", this.f159789a, this.f159790b);
        kg.f.q(", distanceInvalid=", ", durationInvalid=", sbM, this.f159791c, this.f159792d);
        return hb.a.k(sbM, this.f159793e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f159789a ? 1 : 0);
        parcel.writeInt(this.f159790b ? 1 : 0);
        parcel.writeInt(this.f159791c ? 1 : 0);
        parcel.writeInt(this.f159792d ? 1 : 0);
        parcel.writeInt(this.f159793e ? 1 : 0);
    }

    public o0(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
        this.f159789a = z14;
        this.f159790b = z15;
        this.f159791c = z16;
        this.f159792d = z17;
        this.f159793e = z18;
    }

    public o0() {
        this(false, false, false, false, false, 31, null);
    }
}
