package t82;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lt82/e;", "Landroid/os/Parcelable;", "", "backwardNavEnabled", "forwardNavEnabled", "<init>", "(ZZ)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163168b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new e(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public /* synthetic */ e(boolean z14, boolean z15, int i14, j jVar) {
        this((i14 & 1) != 0 ? true : z14, (i14 & 2) != 0 ? true : z15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f163167a == eVar.f163167a && this.f163168b == eVar.f163168b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f163168b) + (Boolean.hashCode(this.f163167a) * 31);
    }

    public final String toString() {
        return com.airbnb.lottie.animation.keyframe.a.e("RangeControlNavButtonsStatus(backwardNavEnabled=", ", forwardNavEnabled=", ")", this.f163167a, this.f163168b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f163167a ? 1 : 0);
        parcel.writeInt(this.f163168b ? 1 : 0);
    }

    public e(boolean z14, boolean z15) {
        this.f163167a = z14;
        this.f163168b = z15;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e() {
        boolean z14 = false;
        this(z14, z14, 3, null);
    }
}
