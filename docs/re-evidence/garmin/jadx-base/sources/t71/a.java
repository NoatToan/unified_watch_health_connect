package t71;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lt71/a;", "Landroid/os/Parcelable;", "", FirebaseAnalytics.Param.SCORE, "Lorg/joda/time/LocalDate;", "calendarDate", "", "qualifier", "<init>", "(ILorg/joda/time/LocalDate;Ljava/lang/String;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C3069a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f163083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f163084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f163085c;

    /* JADX INFO: renamed from: t71.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3069a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readInt(), (LocalDate) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(int i14, LocalDate localDate, String str) {
        localDate.getClass();
        str.getClass();
        this.f163083a = i14;
        this.f163084b = localDate;
        this.f163085c = str;
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
        return this.f163083a == aVar.f163083a && this.f163084b.equals(aVar.f163084b) && this.f163085c.equals(aVar.f163085c);
    }

    public final int hashCode() {
        return this.f163085c.hashCode() + ((this.f163084b.hashCode() + (Integer.hashCode(this.f163083a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PerformanceScoreChartDataPoint(score=");
        sb3.append(this.f163083a);
        sb3.append(", calendarDate=");
        sb3.append(this.f163084b);
        sb3.append(", qualifier=");
        return j.o(this.f163085c, ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f163083a);
        parcel.writeSerializable(this.f163084b);
        parcel.writeString(this.f163085c);
    }
}
