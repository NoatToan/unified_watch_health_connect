package j12;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lj12/d;", "Landroid/os/Parcelable;", "Lj12/o;", "wellness", "Lj12/b;", "activities", "<init>", "(Lj12/o;Lj12/b;)V", "a", "Lj12/o;", "d", "()Lj12/o;", "setWellness", "(Lj12/o;)V", "b", "Lj12/b;", "()Lj12/b;", "setActivities", "(Lj12/b;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("wellness")
    private o wellness;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activities")
    private b activities;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d(parcel.readInt() == 0 ? null : o.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? b.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public /* synthetic */ d(o oVar, b bVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : oVar, (i14 & 2) != 0 ? null : bVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getActivities() {
        return this.activities;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final o getWellness() {
        return this.wellness;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.wellness, dVar.wellness) && s.g(this.activities, dVar.activities);
    }

    public final int hashCode() {
        o oVar = this.wellness;
        int iHashCode = (oVar == null ? 0 : oVar.hashCode()) * 31;
        b bVar = this.activities;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        return "LifeTimeGoalDTO(wellness=" + this.wellness + ", activities=" + this.activities + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        o oVar = this.wellness;
        if (oVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            oVar.writeToParcel(parcel, i14);
        }
        b bVar = this.activities;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bVar.writeToParcel(parcel, i14);
        }
    }

    public d(o oVar, b bVar) {
        this.wellness = oVar;
        this.activities = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
