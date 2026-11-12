package n71;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes9.dex */
public interface g extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln71/g$a;", "Ln71/g;", "", "stringRes", "<init>", "(I)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements g {
        public static final Parcelable.Creator<a> CREATOR = new C2400a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f124840a;

        /* JADX INFO: renamed from: n71.g$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C2400a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new a(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i14) {
                return new a[i14];
            }
        }

        public a(int i14) {
            this.f124840a = i14;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f124840a == ((a) obj).f124840a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f124840a);
        }

        public final String toString() {
            return e0.f(this.f124840a, "App(stringRes=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(this.f124840a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln71/g$b;", "Ln71/g;", "Lcom/garmin/android/apps/connectmobile/performance/dto/c;", "exerciseKey", "<init>", "(Lcom/garmin/android/apps/connectmobile/performance/dto/c;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements g {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.performance.dto.c f124841a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new b((com.garmin.android.apps.connectmobile.performance.dto.c) parcel.readParcelable(b.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }
        }

        static {
            Parcelable.Creator<com.garmin.android.apps.connectmobile.performance.dto.c> creator = com.garmin.android.apps.connectmobile.performance.dto.c.CREATOR;
        }

        public b(com.garmin.android.apps.connectmobile.performance.dto.c cVar) {
            cVar.getClass();
            this.f124841a = cVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f124841a.equals(((b) obj).f124841a);
        }

        public final int hashCode() {
            return this.f124841a.hashCode();
        }

        public final String toString() {
            return "Exercise(exerciseKey=" + this.f124841a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeParcelable(this.f124841a, i14);
        }
    }
}
