package aq;

import android.os.Parcel;
import android.os.Parcelable;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Laq/x;", "Landroid/os/Parcelable;", "", ModelSourceWrapper.POSITION, "Lcom/garmin/android/apps/connectmobile/repcounting/model/e;", "exerciseSetDTO", "Lcom/garmin/android/apps/connectmobile/repcounting/model/d;", "exerciseListItem", "counterPartListItem", "<init>", "(ILcom/garmin/android/apps/connectmobile/repcounting/model/e;Lcom/garmin/android/apps/connectmobile/repcounting/model/d;Lcom/garmin/android/apps/connectmobile/repcounting/model/d;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.repcounting.model.e f12286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.repcounting.model.d f12287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.repcounting.model.d f12288d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<x> {
        @Override // android.os.Parcelable.Creator
        public final x createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new x(parcel.readInt(), (com.garmin.android.apps.connectmobile.repcounting.model.e) parcel.readParcelable(x.class.getClassLoader()), (com.garmin.android.apps.connectmobile.repcounting.model.d) parcel.readParcelable(x.class.getClassLoader()), (com.garmin.android.apps.connectmobile.repcounting.model.d) parcel.readParcelable(x.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final x[] newArray(int i14) {
            return new x[i14];
        }
    }

    public x(int i14, com.garmin.android.apps.connectmobile.repcounting.model.e eVar, com.garmin.android.apps.connectmobile.repcounting.model.d dVar, com.garmin.android.apps.connectmobile.repcounting.model.d dVar2) {
        eVar.getClass();
        this.f12285a = i14;
        this.f12286b = eVar;
        this.f12287c = dVar;
        this.f12288d = dVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f12285a == xVar.f12285a && this.f12286b.equals(xVar.f12286b) && p005kotlin.jvm.internal.s.g(this.f12287c, xVar.f12287c) && p005kotlin.jvm.internal.s.g(this.f12288d, xVar.f12288d);
    }

    public final int hashCode() {
        int iHashCode = (this.f12286b.hashCode() + (Integer.hashCode(this.f12285a) * 31)) * 31;
        com.garmin.android.apps.connectmobile.repcounting.model.d dVar = this.f12287c;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        com.garmin.android.apps.connectmobile.repcounting.model.d dVar2 = this.f12288d;
        return iHashCode2 + (dVar2 != null ? dVar2.hashCode() : 0);
    }

    public final String toString() {
        return "EditExercisesMultiEditData(position=" + this.f12285a + ", exerciseSetDTO=" + this.f12286b + ", exerciseListItem=" + this.f12287c + ", counterPartListItem=" + this.f12288d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f12285a);
        parcel.writeParcelable(this.f12286b, i14);
        parcel.writeParcelable(this.f12287c, i14);
        parcel.writeParcelable(this.f12288d, i14);
    }
}
