package ie2;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lie2/c;", "Landroid/os/Parcelable;", "Lcom/garmin/android/library/mapsdkadapter/f;", "target", "", "bearing", "pitch", "zoom", "<init>", "(Lcom/garmin/android/library/mapsdkadapter/f;DDD)V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.library.mapsdkadapter.f f93111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f93112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f93113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f93114d;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(com.garmin.android.library.mapsdkadapter.f.CREATOR.createFromParcel(parcel), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(com.garmin.android.library.mapsdkadapter.f fVar, double d14, double d15, double d16, int i14, p005kotlin.jvm.internal.j jVar) {
        this(fVar, (i14 & 2) != 0 ? 0.0d : d14, (i14 & 4) != 0 ? 0.0d : d15, d16);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return p005kotlin.jvm.internal.s.g(this.f93111a, cVar.f93111a) && Double.compare(this.f93112b, cVar.f93112b) == 0 && Double.compare(this.f93113c, cVar.f93113c) == 0 && Double.compare(this.f93114d, cVar.f93114d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f93114d) + org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(this.f93111a.hashCode() * 31, 31, this.f93112b), 31, this.f93113c);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CameraState(target=");
        sb3.append(this.f93111a);
        sb3.append(", bearing=");
        sb3.append(this.f93112b);
        am.j.x(sb3, ", pitch=", this.f93113c, ", zoom=");
        return c22.t.d(this.f93114d, ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        this.f93111a.writeToParcel(parcel, i14);
        parcel.writeDouble(this.f93112b);
        parcel.writeDouble(this.f93113c);
        parcel.writeDouble(this.f93114d);
    }

    public c(com.garmin.android.library.mapsdkadapter.f fVar, double d14, double d15, double d16) {
        fVar.getClass();
        this.f93111a = fVar;
        this.f93112b = d14;
        this.f93113c = d15;
        this.f93114d = d16;
    }
}
