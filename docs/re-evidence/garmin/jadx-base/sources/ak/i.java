package ak;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f3542d;

    public static class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            return new i(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i14) {
            return new i[i14];
        }
    }

    public enum c {
        CHANNEL_ID,
        RSSI,
        RX_TIMESTAMP,
        NUMBER_OF_DETAILS
    }

    private i(Parcel parcel) {
        this.f3542d = new b(null);
        int i14 = parcel.readInt();
        int i15 = parcel.readInt();
        c cVar = c.NUMBER_OF_DETAILS;
        boolean[] zArr = new boolean[i15 <= cVar.ordinal() ? cVar.ordinal() : i15];
        parcel.readBooleanArray(zArr);
        this.f3539a = zArr[c.CHANNEL_ID.ordinal()];
        this.f3540b = zArr[c.RSSI.ordinal()];
        this.f3541c = zArr[c.RX_TIMESTAMP.ordinal()];
        if (i14 > 1) {
            Bundle bundle = parcel.readBundle();
            bundle.setClassLoader(b.class.getClassLoader());
            this.f3542d = (b) bundle.getParcelable("com.dsi.ant.message.libconfig.bundledata");
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
        if (obj == null || !(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return iVar.f3539a == this.f3539a && iVar.f3540b == this.f3540b && iVar.f3541c == this.f3541c;
    }

    public final int hashCode() {
        return ((((217 + (this.f3539a ? 1 : 0)) * 31) + (this.f3540b ? 1 : 0)) * 31) + (this.f3541c ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Lib Config: Enabled extended data:");
        if (this.f3539a) {
            sb3.append(" -Channel Id");
        }
        if (this.f3540b) {
            sb3.append(" -RSSI");
        }
        if (this.f3541c) {
            sb3.append(" -Rx Timestamp");
        }
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(2);
        c cVar = c.NUMBER_OF_DETAILS;
        boolean[] zArr = new boolean[cVar.ordinal()];
        zArr[c.CHANNEL_ID.ordinal()] = this.f3539a;
        zArr[c.RSSI.ordinal()] = this.f3540b;
        zArr[c.RX_TIMESTAMP.ordinal()] = this.f3541c;
        parcel.writeInt(cVar.ordinal());
        parcel.writeBooleanArray(zArr);
        if (vj.a.b()) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.dsi.ant.message.libconfig.bundledata", this.f3542d);
            parcel.writeBundle(bundle);
        }
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        public static class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.readInt();
                return new b(null);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ b[] newArray(int i14) {
                return null;
            }
        }

        private b() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.writeInt(1);
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public i() {
        this(false, false, false);
    }

    public i(boolean z14, boolean z15, boolean z16) {
        this.f3542d = new b(null);
        this.f3539a = z14;
        this.f3540b = z15;
        this.f3541c = z16;
    }

    public /* synthetic */ i(Parcel parcel, a aVar) {
        this(parcel);
    }
}
