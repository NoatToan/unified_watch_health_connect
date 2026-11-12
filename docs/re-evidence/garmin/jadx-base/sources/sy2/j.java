package sy2;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsy2/j;", "Lqy2/b;", "", "useProxyPresenter", "useProxyView", "<init>", "(ZZ)V", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j implements qy2.b {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f161309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f161310b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new j(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i14) {
            return new j[i14];
        }
    }

    public j(boolean z14, boolean z15) {
        this.f161309a = z14;
        this.f161310b = z15;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f161309a == jVar.f161309a && this.f161310b == jVar.f161310b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f161310b) + (Boolean.hashCode(this.f161309a) * 31);
    }

    public final String toString() {
        return com.airbnb.lottie.animation.keyframe.a.e("MVPUIReviewConfig(useProxyPresenter=", ", useProxyView=", ")", this.f161309a, this.f161310b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f161309a ? 1 : 0);
        parcel.writeInt(this.f161310b ? 1 : 0);
    }
}
