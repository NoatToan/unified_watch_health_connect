package p71;

import android.os.Parcel;
import android.os.Parcelable;
import n71.g;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lp71/b;", "Lp71/f;", "Lcom/garmin/android/apps/connectmobile/performance/dto/c;", "exerciseKeyPair", "<init>", "(Lcom/garmin/android/apps/connectmobile/performance/dto/c;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements f {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.performance.dto.c f136303a;

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
        this.f136303a = cVar;
    }

    @Override // p71.f
    public final boolean B0(com.garmin.android.apps.connectmobile.performance.dto.c cVar) {
        cVar.getClass();
        return this.f136303a.equals(cVar);
    }

    @Override // p71.f
    public final g I0() {
        return new g.b(this.f136303a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f136303a.equals(((b) obj).f136303a);
    }

    public final int hashCode() {
        return this.f136303a.hashCode();
    }

    public final String toString() {
        return "ExerciseFilter(exerciseKeyPair=" + this.f136303a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeParcelable(this.f136303a, i14);
    }
}
