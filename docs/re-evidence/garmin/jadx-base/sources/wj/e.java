package wj;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f185727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f185728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f185729c;

    public static class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            return new e(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f185730a = 10000;

        public static class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.readInt();
                b bVar = new b();
                bVar.f185730a = parcel.readInt();
                return bVar;
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ b[] newArray(int i14) {
                return null;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.writeInt(1);
            parcel.writeInt(this.f185730a);
        }
    }

    public enum c {
        PROCESSING,
        TRANSMIT_IN_PROGRESS,
        NUMBER_OF_DETAILS
    }

    private e(Parcel parcel) {
        this.f185729c = new b();
        int i14 = parcel.readInt();
        int i15 = parcel.readInt();
        c cVar = c.NUMBER_OF_DETAILS;
        boolean[] zArr = new boolean[i15 <= cVar.ordinal() ? cVar.ordinal() : i15];
        parcel.readBooleanArray(zArr);
        this.f185727a = zArr[c.PROCESSING.ordinal()];
        this.f185728b = zArr[c.TRANSMIT_IN_PROGRESS.ordinal()];
        if (i14 > 1) {
            Bundle bundle = parcel.readBundle();
            bundle.setClassLoader(b.class.getClassLoader());
            this.f185729c = (b) bundle.getParcelable("com.dsi.ant.channel.burststate.bundledata");
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return eVar.f185727a == this.f185727a && eVar.f185728b == this.f185728b && eVar.f185729c.f185730a == this.f185729c.f185730a;
    }

    public final int hashCode() {
        return ((((217 + (this.f185727a ? 1 : 0)) * 31) + (this.f185728b ? 1 : 0)) * 31) + this.f185729c.f185730a;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Burst State:");
        if (this.f185728b) {
            sb3.append(" -Transmit In Progress");
        } else {
            sb3.append(" -No Transmit In Progress");
        }
        if (this.f185727a) {
            sb3.append(" -Burst Processing");
        } else {
            sb3.append(" -No Burst Processing");
        }
        sb3.append(" -Max Burst Size: ");
        return am.j.q(sb3, this.f185729c.f185730a, "bytes");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(2);
        c cVar = c.NUMBER_OF_DETAILS;
        boolean[] zArr = new boolean[cVar.ordinal()];
        zArr[c.PROCESSING.ordinal()] = this.f185727a;
        zArr[c.TRANSMIT_IN_PROGRESS.ordinal()] = this.f185728b;
        parcel.writeInt(cVar.ordinal());
        parcel.writeBooleanArray(zArr);
        if (vj.a.b()) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.dsi.ant.channel.burststate.bundledata", this.f185729c);
            parcel.writeBundle(bundle);
        }
    }

    public e() {
        this(false, false);
    }

    public e(boolean z14, boolean z15) {
        this.f185729c = new b();
        this.f185727a = z14;
        this.f185728b = z15;
    }

    public /* synthetic */ e(Parcel parcel, a aVar) {
        this(parcel);
    }
}
