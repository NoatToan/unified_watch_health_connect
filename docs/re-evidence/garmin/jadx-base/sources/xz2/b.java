package xz2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Calendar;
import java.util.Date;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f192861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f192862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f192863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient Calendar f192864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient Date f192865e;

    public static class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    public b(Date date) {
        Calendar calendar = Calendar.getInstance();
        if (date != null) {
            calendar.setTime(date);
        }
        int i14 = calendar.get(1);
        int i15 = calendar.get(2);
        int i16 = calendar.get(5);
        calendar.clear();
        calendar.set(i14, i15, i16);
        this(calendar);
    }

    public static b b(Calendar calendar) {
        if (calendar == null) {
            return null;
        }
        return new b(calendar.get(1), calendar.get(2), calendar.get(5));
    }

    public static b d(Date date) {
        if (date == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i14 = calendar.get(1);
        int i15 = calendar.get(2);
        int i16 = calendar.get(5);
        calendar.clear();
        calendar.set(i14, i15, i16);
        return b(calendar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f192863c == bVar.f192863c && this.f192862b == bVar.f192862b && this.f192861a == bVar.f192861a) {
                return true;
            }
        }
        return false;
    }

    public final Calendar f() {
        if (this.f192864d == null) {
            Calendar calendarA = g.a();
            this.f192864d = calendarA;
            calendarA.clear();
            calendarA.set(this.f192861a, this.f192862b, this.f192863c);
        }
        return this.f192864d;
    }

    public final Date g() {
        if (this.f192865e == null) {
            this.f192865e = f().getTime();
        }
        return this.f192865e;
    }

    public final boolean h(b bVar) {
        if (bVar == null) {
            vb.h.s("other cannot be null");
            return false;
        }
        int i14 = bVar.f192861a;
        int i15 = this.f192861a;
        if (i15 != i14) {
            return i15 > i14;
        }
        int i16 = bVar.f192862b;
        int i17 = this.f192862b;
        if (i17 == i16) {
            return this.f192863c > bVar.f192863c;
        }
        return i17 > i16;
    }

    public final int hashCode() {
        return fb1.c.d(this.f192862b, 100, this.f192861a * 10000, this.f192863c);
    }

    public final boolean i(b bVar) {
        if (bVar == null) {
            vb.h.s("other cannot be null");
            return false;
        }
        int i14 = bVar.f192861a;
        int i15 = this.f192861a;
        if (i15 != i14) {
            return i15 < i14;
        }
        int i16 = bVar.f192862b;
        int i17 = this.f192862b;
        if (i17 == i16) {
            return this.f192863c < bVar.f192863c;
        }
        return i17 < i16;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CalendarDay{");
        sb3.append(this.f192861a);
        sb3.append("-");
        sb3.append(this.f192862b);
        sb3.append("-");
        return am.j.q(sb3, this.f192863c, StringSubstitutor.DEFAULT_VAR_END);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(this.f192861a);
        parcel.writeInt(this.f192862b);
        parcel.writeInt(this.f192863c);
    }

    @Deprecated
    public b(Calendar calendar) {
        this(calendar.get(1), calendar.get(2), calendar.get(5));
    }

    @Deprecated
    public b() {
        this(g.a());
    }

    @Deprecated
    public b(int i14, int i15, int i16) {
        this.f192861a = i14;
        this.f192862b = i15;
        this.f192863c = i16;
    }

    public b(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
