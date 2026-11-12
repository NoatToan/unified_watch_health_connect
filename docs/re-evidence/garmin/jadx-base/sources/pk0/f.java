package pk0;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lpk0/f;", "Landroid/os/Parcelable;", "", "brandName", "modelName", "", "enterOtherBrand", "enterOtherModel", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f138220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f138221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f138222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f138223d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new f(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public /* synthetic */ f(String str, String str2, boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? false : z14, (i14 & 8) != 0 ? false : z15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.f138220a, fVar.f138220a) && s.g(this.f138221b, fVar.f138221b) && this.f138222c == fVar.f138222c && this.f138223d == fVar.f138223d;
    }

    public final int hashCode() {
        String str = this.f138220a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f138221b;
        return Boolean.hashCode(this.f138223d) + q6.f.g((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f138222c);
    }

    public final String toString() {
        return com.airbnb.lottie.animation.keyframe.a.f(", enterOtherModel=", ")", p6.b.i("BrandModelSelectionResult(brandName=", this.f138220a, ", modelName=", this.f138221b, ", enterOtherBrand="), this.f138222c, this.f138223d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f138220a);
        parcel.writeString(this.f138221b);
        parcel.writeInt(this.f138222c ? 1 : 0);
        parcel.writeInt(this.f138223d ? 1 : 0);
    }

    public f(String str, String str2, boolean z14, boolean z15) {
        this.f138220a = str;
        this.f138221b = str2;
        this.f138222c = z14;
        this.f138223d = z15;
    }

    public f() {
        this(null, null, false, false, 15, null);
    }
}
