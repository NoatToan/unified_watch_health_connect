package rw2;

import android.os.Parcel;
import android.os.Parcelable;
import ds.e0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lrw2/e;", "Landroid/os/Parcelable;", "", "globalVersion", "compositionVersion", "<init>", "(JJ)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f154897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f154898b;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new e(parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public /* synthetic */ e(long j8, long j14, int i14, j jVar) {
        this((i14 & 1) != 0 ? 0L : j8, (i14 & 2) != 0 ? 0L : j14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!e.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        e eVar = (e) obj;
        return this.f154897a == eVar.f154897a && this.f154898b == eVar.f154898b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f154898b) + (Long.hashCode(this.f154897a) * 31);
    }

    public final String toString() {
        return am.j.i(this.f154898b, ")", e0.k(this.f154897a, "VersionData(globalVersion=", ", compositionVersion="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.f154897a);
        parcel.writeLong(this.f154898b);
    }

    public e(long j8, long j14) {
        this.f154897a = j8;
        this.f154898b = j14;
    }

    public e() {
        this(0L, 0L, 3, null);
    }
}
