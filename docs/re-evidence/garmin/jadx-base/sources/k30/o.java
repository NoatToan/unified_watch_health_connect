package k30;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lk30/o;", "Landroid/os/Parcelable;", "Lcom/garmin/android/apps/connectmobile/courses/model/i;", "courseType", "", "isSelected", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/i;Z)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.courses.model.i f102579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f102580b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<o> {
        @Override // android.os.Parcelable.Creator
        public final o createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new o(com.garmin.android.apps.connectmobile.courses.model.i.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final o[] newArray(int i14) {
            return new o[i14];
        }
    }

    public o(com.garmin.android.apps.connectmobile.courses.model.i iVar, boolean z14) {
        iVar.getClass();
        this.f102579a = iVar;
        this.f102580b = z14;
    }

    public static o b(o oVar, boolean z14, int i14) {
        com.garmin.android.apps.connectmobile.courses.model.i iVar = oVar.f102579a;
        if ((i14 & 2) != 0) {
            z14 = oVar.f102580b;
        }
        oVar.getClass();
        return new o(iVar, z14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f102579a == oVar.f102579a && this.f102580b == oVar.f102580b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f102580b) + (this.f102579a.hashCode() * 31);
    }

    public final String toString() {
        return "CourseTypeFilterItem(courseType=" + this.f102579a + ", isSelected=" + this.f102580b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f102579a.name());
        parcel.writeInt(this.f102580b ? 1 : 0);
    }
}
