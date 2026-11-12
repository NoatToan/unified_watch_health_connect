package sq;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.repcounting.model.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\tB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lsq/a;", "Landroid/os/Parcelable;", "", "roundIndex", "Lcom/garmin/android/apps/connectmobile/repcounting/model/e;", "activeExerciseDTO", "restExerciseDTO", "<init>", "(ILcom/garmin/android/apps/connectmobile/repcounting/model/e;Lcom/garmin/android/apps/connectmobile/repcounting/model/e;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f160520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f160521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f160522c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readInt(), (e) parcel.readParcelable(a.class.getClassLoader()), (e) parcel.readParcelable(a.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    static {
        new C3034a(null);
        CREATOR = new b();
    }

    public a(int i14, e eVar, e eVar2) {
        eVar.getClass();
        this.f160520a = i14;
        this.f160521b = eVar;
        this.f160522c = eVar2;
    }

    public static a b(a aVar, e eVar, int i14) {
        int i15 = aVar.f160520a;
        e eVar2 = aVar.f160521b;
        if ((i14 & 4) != 0) {
            eVar = aVar.f160522c;
        }
        aVar.getClass();
        eVar2.getClass();
        return new a(i15, eVar2, eVar);
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
        return this.f160520a == aVar.f160520a && s.g(this.f160521b, aVar.f160521b) && s.g(this.f160522c, aVar.f160522c);
    }

    public final int hashCode() {
        int iHashCode = (this.f160521b.hashCode() + (Integer.hashCode(this.f160520a) * 31)) * 31;
        e eVar = this.f160522c;
        return iHashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        return "ExerciseWithRestDTO(roundIndex=" + this.f160520a + ", activeExerciseDTO=" + this.f160521b + ", restExerciseDTO=" + this.f160522c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f160520a);
        parcel.writeParcelable(this.f160521b, i14);
        parcel.writeParcelable(this.f160522c, i14);
    }

    /* JADX INFO: renamed from: sq.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsq/a$a;", "", "<init>", "()V", "", "INVALID_ROUND_INDEX", "I", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3034a {
        public /* synthetic */ C3034a(j jVar) {
            this();
        }

        private C3034a() {
        }
    }

    public /* synthetic */ a(int i14, e eVar, e eVar2, int i15, j jVar) {
        this(i14, eVar, (i15 & 4) != 0 ? null : eVar2);
    }
}
