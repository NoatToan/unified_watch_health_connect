package sg1;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsg1/a;", "Landroid/os/Parcelable;", "", "isLoading", "isError", "isSuccessful", "<init>", "(ZZZ)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C3009a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f159188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f159189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f159190c;

    /* JADX INFO: renamed from: sg1.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3009a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(boolean z14, boolean z15, boolean z16, int i14, j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? false : z16);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f159188a == aVar.f159188a && this.f159189b == aVar.f159189b && this.f159190c == aVar.f159190c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f159190c) + q6.f.g(Boolean.hashCode(this.f159188a) * 31, 31, this.f159189b);
    }

    public final String toString() {
        return hb.a.k(com.airbnb.lottie.animation.keyframe.a.m("BackupOperationUiState(isLoading=", ", isError=", ", isSuccessful=", this.f159188a, this.f159189b), this.f159190c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f159188a ? 1 : 0);
        parcel.writeInt(this.f159189b ? 1 : 0);
        parcel.writeInt(this.f159190c ? 1 : 0);
    }

    public a(boolean z14, boolean z15, boolean z16) {
        this.f159188a = z14;
        this.f159189b = z15;
        this.f159190c = z16;
    }

    public a() {
        this(false, false, false, 7, null);
    }
}
