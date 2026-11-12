package wj;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f185720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f185721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f185722c;

    public static class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            return new d(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public enum b {
        CONFIGURED,
        IN_PROGRESS,
        NUMBER_OF_DETAILS
    }

    public static final class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        public static class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                parcel.readInt();
                return new c();
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ c[] newArray(int i14) {
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
        }
    }

    private d(Parcel parcel) {
        this.f185722c = new c();
        int i14 = parcel.readInt();
        int i15 = parcel.readInt();
        b bVar = b.NUMBER_OF_DETAILS;
        boolean[] zArr = new boolean[i15 <= bVar.ordinal() ? bVar.ordinal() : i15];
        parcel.readBooleanArray(zArr);
        this.f185720a = zArr[b.CONFIGURED.ordinal()];
        this.f185721b = zArr[b.IN_PROGRESS.ordinal()];
        if (i14 > 1) {
            Bundle bundle = parcel.readBundle();
            bundle.setClassLoader(c.class.getClassLoader());
            this.f185722c = (c) bundle.getParcelable("com.dsi.ant.channel.backgroundscanstate.bundledata");
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
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f185720a == this.f185720a && dVar.f185721b == this.f185721b;
    }

    public final int hashCode() {
        return ((217 + (this.f185720a ? 1 : 0)) * 31) + (this.f185721b ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Background Scan State:");
        if (this.f185721b) {
            sb3.append(" Scan In Progress");
        } else if (this.f185720a) {
            sb3.append(" Channel Configured");
        } else {
            sb3.append(" No Background Scan Channels");
        }
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(2);
        b bVar = b.NUMBER_OF_DETAILS;
        boolean[] zArr = new boolean[bVar.ordinal()];
        zArr[b.CONFIGURED.ordinal()] = this.f185720a;
        zArr[b.IN_PROGRESS.ordinal()] = this.f185721b;
        parcel.writeInt(bVar.ordinal());
        parcel.writeBooleanArray(zArr);
        if (vj.a.b()) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.dsi.ant.channel.backgroundscanstate.bundledata", this.f185722c);
            parcel.writeBundle(bundle);
        }
    }

    public d() {
        this(false, false);
    }

    public d(boolean z14, boolean z15) {
        this.f185722c = new c();
        this.f185720a = z14;
        this.f185721b = z15;
    }

    public /* synthetic */ d(Parcel parcel, a aVar) {
        this(parcel);
    }
}
