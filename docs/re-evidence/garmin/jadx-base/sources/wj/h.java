package wj;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f185765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f185766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f185763c = new h(2000);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f185764d = new h(0);
    public static final Parcelable.Creator<h> CREATOR = new a();

    public static class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            return new h(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i14) {
            return new h[i14];
        }
    }

    private h(Parcel parcel) {
        this.f185766b = new b(null);
        int i14 = parcel.readInt();
        this.f185765a = parcel.readInt();
        if (i14 > 1) {
            Bundle bundle = parcel.readBundle();
            bundle.setClassLoader(b.class.getClassLoader());
            this.f185766b = (b) bundle.getParcelable("com.dsi.ant.channel.eventbuffersettings.bundledata");
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
        return obj != null && (obj instanceof h) && ((h) obj).f185765a == this.f185765a;
    }

    public final int hashCode() {
        return 217 + this.f185765a;
    }

    public final String toString() {
        return am.j.q(new StringBuilder("Event Buffer Settings: -Buffer Time: "), this.f185765a, "ms");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(2);
        parcel.writeInt(this.f185765a);
        if (vj.a.b()) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.dsi.ant.channel.eventbuffersettings.bundledata", this.f185766b);
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

    public h() {
        this(2000);
    }

    private h(int i14) {
        this.f185766b = new b(null);
        if (ak.k.c(i14, 655350)) {
            this.f185765a = i14;
        } else {
            vb.h.s("Buffer time out of range");
            throw null;
        }
    }

    public /* synthetic */ h(Parcel parcel, a aVar) {
        this(parcel);
    }
}
