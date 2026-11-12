package fu1;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\bB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lfu1/a;", "Landroid/os/Parcelable;", "Lfu1/q;", "gradedWorkout", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDTO;", "workout", "<init>", "(Lfu1/q;Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDTO;)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f73505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WorkoutDTO f73506b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(q.CREATOR.createFromParcel(parcel), (WorkoutDTO) parcel.readParcelable(a.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    static {
        new C1486a(null);
        CREATOR = new b();
    }

    public a(q qVar, WorkoutDTO workoutDTO) {
        qVar.getClass();
        this.f73505a = qVar;
        this.f73506b = workoutDTO;
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
        return p005kotlin.jvm.internal.s.g(this.f73505a, aVar.f73505a) && p005kotlin.jvm.internal.s.g(this.f73506b, aVar.f73506b);
    }

    public final int hashCode() {
        int iHashCode = this.f73505a.hashCode() * 31;
        WorkoutDTO workoutDTO = this.f73506b;
        return iHashCode + (workoutDTO == null ? 0 : workoutDTO.hashCode());
    }

    public final String toString() {
        return "ATPActivePlanWorkout(gradedWorkout=" + this.f73505a + ", workout=" + this.f73506b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        this.f73505a.writeToParcel(parcel, i14);
        parcel.writeParcelable(this.f73506b, i14);
    }

    /* JADX INFO: renamed from: fu1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lfu1/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "DATE_FORMAT", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1486a {
        public /* synthetic */ C1486a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1486a() {
        }
    }

    public /* synthetic */ a(q qVar, WorkoutDTO workoutDTO, int i14, p005kotlin.jvm.internal.j jVar) {
        this(qVar, (i14 & 2) != 0 ? null : workoutDTO);
    }
}
