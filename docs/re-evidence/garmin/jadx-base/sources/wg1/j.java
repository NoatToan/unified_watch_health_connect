package wg1;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lwg1/j;", "Landroid/os/Parcelable;", "", "privacyEnabled", "alertEnabled", "<init>", "(ZZ)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f185135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f185136b;

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

    public /* synthetic */ j(boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15);
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
        return this.f185135a == jVar.f185135a && this.f185136b == jVar.f185136b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f185136b) + (Boolean.hashCode(this.f185135a) * 31);
    }

    public final String toString() {
        return com.airbnb.lottie.animation.keyframe.a.e("SmartNotificationsValueConfiguration(privacyEnabled=", ", alertEnabled=", ")", this.f185135a, this.f185136b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f185135a ? 1 : 0);
        parcel.writeInt(this.f185136b ? 1 : 0);
    }

    public j(boolean z14, boolean z15) {
        this.f185135a = z14;
        this.f185136b = z15;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j() {
        boolean z14 = false;
        this(z14, z14, 3, null);
    }
}
