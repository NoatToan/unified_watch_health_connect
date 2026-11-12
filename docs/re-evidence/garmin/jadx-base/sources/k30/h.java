package k30;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0007B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lk30/h;", "Landroid/os/Parcelable;", "", "hasLapCoursePoints", "hasCoursePlannerData", "<init>", "(ZZ)V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f102549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f102550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f102548c = new a(null);
    public static final Parcelable.Creator<h> CREATOR = new b();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new h(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i14) {
            return new h[i14];
        }
    }

    public /* synthetic */ h(boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
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
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f102549a == hVar.f102549a && this.f102550b == hVar.f102550b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f102550b) + (Boolean.hashCode(this.f102549a) * 31);
    }

    public final String toString() {
        return com.airbnb.lottie.animation.keyframe.a.e("CourseFeaturePreferences(hasLapCoursePoints=", ", hasCoursePlannerData=", ")", this.f102549a, this.f102550b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f102549a ? 1 : 0);
        parcel.writeInt(this.f102550b ? 1 : 0);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk30/h$a;", "", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public h(boolean z14, boolean z15) {
        this.f102549a = z14;
        this.f102550b = z15;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h() {
        boolean z14 = false;
        this(z14, z14, 3, null);
    }
}
