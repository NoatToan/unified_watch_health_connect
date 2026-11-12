package sk0;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0083\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsk0/m0;", "Landroid/os/Parcelable;", "", "nicknameRequired", "nicknameInvalid", "gearRequired", "<init>", "(ZZZ)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m0 implements Parcelable {
    public static final Parcelable.Creator<m0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f159752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f159753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f159754c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<m0> {
        @Override // android.os.Parcelable.Creator
        public final m0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new m0(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final m0[] newArray(int i14) {
            return new m0[i14];
        }
    }

    public /* synthetic */ m0(boolean z14, boolean z15, boolean z16, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? false : z16);
    }

    public static m0 b(m0 m0Var, boolean z14, boolean z15, boolean z16, int i14) {
        if ((i14 & 1) != 0) {
            z14 = m0Var.f159752a;
        }
        if ((i14 & 2) != 0) {
            z15 = m0Var.f159753b;
        }
        if ((i14 & 4) != 0) {
            z16 = m0Var.f159754c;
        }
        m0Var.getClass();
        return new m0(z14, z15, z16);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.f159752a == m0Var.f159752a && this.f159753b == m0Var.f159753b && this.f159754c == m0Var.f159754c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f159754c) + q6.f.g(Boolean.hashCode(this.f159752a) * 31, 31, this.f159753b);
    }

    public final String toString() {
        return hb.a.k(com.airbnb.lottie.animation.keyframe.a.m("CreateCollectionValidation(nicknameRequired=", ", nicknameInvalid=", ", gearRequired=", this.f159752a, this.f159753b), this.f159754c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f159752a ? 1 : 0);
        parcel.writeInt(this.f159753b ? 1 : 0);
        parcel.writeInt(this.f159754c ? 1 : 0);
    }

    public m0(boolean z14, boolean z15, boolean z16) {
        this.f159752a = z14;
        this.f159753b = z15;
        this.f159754c = z16;
    }

    public m0() {
        this(false, false, false, 7, null);
    }
}
