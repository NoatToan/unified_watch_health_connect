package w50;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.j;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lw50/b;", "Landroid/os/Parcelable;", "", "courseId", "", "markerResId", "Landroid/graphics/Bitmap;", "markerBitmap", "markerBackgroundResId", "<init>", "(Ljava/lang/String;ILandroid/graphics/Bitmap;I)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f182187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f182188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bitmap f182189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f182190d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readString(), parcel.readInt(), (Bitmap) parcel.readParcelable(b.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(String str, int i14, Bitmap bitmap, int i15) {
        str.getClass();
        this.f182187a = str;
        this.f182188b = i14;
        this.f182189c = bitmap;
        this.f182190d = i15;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f182187a, bVar.f182187a) && this.f182188b == bVar.f182188b && s.g(this.f182189c, bVar.f182189c) && this.f182190d == bVar.f182190d;
    }

    public final int hashCode() {
        int iD = q2.d(this.f182188b, this.f182187a.hashCode() * 31, 31);
        Bitmap bitmap = this.f182189c;
        return Integer.hashCode(this.f182190d) + ((iD + (bitmap == null ? 0 : bitmap.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbK = j.k(this.f182188b, "CourseMarkerTag(courseId=", this.f182187a, ", markerResId=", ", markerBitmap=");
        sbK.append(this.f182189c);
        sbK.append(", markerBackgroundResId=");
        sbK.append(this.f182190d);
        sbK.append(")");
        return sbK.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f182187a);
        parcel.writeInt(this.f182188b);
        parcel.writeParcelable(this.f182189c, i14);
        parcel.writeInt(this.f182190d);
    }

    public /* synthetic */ b(String str, int i14, Bitmap bitmap, int i15, int i16, p005kotlin.jvm.internal.j jVar) {
        this(str, (i16 & 2) != 0 ? 0 : i14, bitmap, i15);
    }
}
