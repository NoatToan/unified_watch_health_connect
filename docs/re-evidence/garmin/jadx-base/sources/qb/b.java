package qb;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.w;
import com.google.common.base.Objects;
import ds.e0;
import fa.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class b implements w.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<C2716b> f143948a;

    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, C2716b.class.getClassLoader());
            return new b(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    /* JADX INFO: renamed from: qb.b$b, reason: collision with other inner class name */
    public static final class C2716b implements Parcelable {
        public static final Parcelable.Creator<C2716b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f143949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f143950b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f143951c;

        /* JADX INFO: renamed from: qb.b$b$a */
        public class a implements Parcelable.Creator<C2716b> {
            @Override // android.os.Parcelable.Creator
            public final C2716b createFromParcel(Parcel parcel) {
                return new C2716b(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final C2716b[] newArray(int i14) {
                return new C2716b[i14];
            }
        }

        public C2716b(long j8, long j14, int i14) {
            fa.a.a(j8 < j14);
            this.f143949a = j8;
            this.f143950b = j14;
            this.f143951c = i14;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C2716b.class == obj.getClass()) {
                C2716b c2716b = (C2716b) obj;
                if (this.f143949a == c2716b.f143949a && this.f143950b == c2716b.f143950b && this.f143951c == c2716b.f143951c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hashCode(Long.valueOf(this.f143949a), Long.valueOf(this.f143950b), Integer.valueOf(this.f143951c));
        }

        public final String toString() {
            int i14 = z.f70071a;
            Locale locale = Locale.US;
            StringBuilder sbK = e0.k(this.f143949a, "Segment: startTimeMs=", ", endTimeMs=");
            sbK.append(this.f143950b);
            sbK.append(", speedDivisor=");
            sbK.append(this.f143951c);
            return sbK.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.writeLong(this.f143949a);
            parcel.writeLong(this.f143950b);
            parcel.writeInt(this.f143951c);
        }
    }

    public b(List<C2716b> list) {
        this.f143948a = list;
        boolean z14 = false;
        if (!list.isEmpty()) {
            long j8 = list.get(0).f143950b;
            for (int i14 = 1; i14 < list.size(); i14++) {
                if (list.get(i14).f143949a < j8) {
                    z14 = true;
                    break;
                }
                j8 = list.get(i14).f143950b;
            }
        }
        fa.a.a(!z14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return this.f143948a.equals(((b) obj).f143948a);
    }

    public final int hashCode() {
        return this.f143948a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f143948a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeList(this.f143948a);
    }
}
