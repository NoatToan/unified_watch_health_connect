package xm2;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import ds.e0;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C3568a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f191511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f191512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f191513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f191514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f191515e;

    /* JADX INFO: renamed from: xm2.a$a, reason: collision with other inner class name */
    public class C3568a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(Parcel parcel) {
        this.f191512b = parcel.readLong();
        this.f191513c = parcel.readInt();
        this.f191514d = parcel.readInt();
        this.f191515e = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("{timestamp=");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.f191512b);
        sb3.append(String.format(Locale.getDefault(), "%d:%d:%d:%d", Integer.valueOf(calendar.get(10)), Integer.valueOf(calendar.get(12)), Integer.valueOf(calendar.get(13)), Integer.valueOf(calendar.get(14))));
        sb3.append("   ");
        sb3.append((int) this.f191511a);
        sb3.append(", x=");
        sb3.append(this.f191513c);
        sb3.append(", y=");
        sb3.append(this.f191514d);
        sb3.append(", z=");
        return e0.j(sb3, this.f191515e, CoreConstants.CURLY_RIGHT);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeLong(this.f191512b);
        parcel.writeInt(this.f191513c);
        parcel.writeInt(this.f191514d);
        parcel.writeInt(this.f191515e);
    }

    public a(int i14, int i15, int i16, short s8, long j8) {
        this.f191513c = i14;
        this.f191514d = i15;
        this.f191515e = i16;
        this.f191511a = s8;
        this.f191512b = j8;
    }
}
