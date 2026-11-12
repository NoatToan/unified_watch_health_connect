package fu1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lfu1/d;", "Landroid/os/Parcelable;", "", "date", "Lfu1/q;", "gradedWorkout", "Lxw1/i;", "tip", "<init>", "(Ljava/lang/String;Lfu1/q;Lxw1/i;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lfu1/q;", "f", "()Lfu1/q;", "c", "Lxw1/i;", "g", "()Lxw1/i;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("date")
    private final String date;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gradedWorkout")
    private final q gradedWorkout;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tip")
    private final xw1.i tip;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d(parcel.readString(), parcel.readInt() == 0 ? null : q.CREATOR.createFromParcel(parcel), (xw1.i) parcel.readParcelable(d.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    static {
        Parcelable.Creator<xw1.i> creator = xw1.i.CREATOR;
    }

    public /* synthetic */ d(String str, q qVar, xw1.i iVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? null : qVar, (i14 & 4) != 0 ? null : iVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    public final DateTime d() {
        return g22.k.p(this.date, "yyyy-MM-dd'T'HH:mm:ss.SSSZ", null);
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
        return p005kotlin.jvm.internal.s.g(this.date, dVar.date) && p005kotlin.jvm.internal.s.g(this.gradedWorkout, dVar.gradedWorkout) && p005kotlin.jvm.internal.s.g(this.tip, dVar.tip);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final q getGradedWorkout() {
        return this.gradedWorkout;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final xw1.i getTip() {
        return this.tip;
    }

    public final int hashCode() {
        int iHashCode = this.date.hashCode() * 31;
        q qVar = this.gradedWorkout;
        int iHashCode2 = (iHashCode + (qVar == null ? 0 : qVar.hashCode())) * 31;
        xw1.i iVar = this.tip;
        return iHashCode2 + (iVar != null ? iVar.hashCode() : 0);
    }

    public final String toString() {
        return "ATPFeedItemDTO(date=" + this.date + ", gradedWorkout=" + this.gradedWorkout + ", tip=" + this.tip + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.date);
        q qVar = this.gradedWorkout;
        if (qVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            qVar.writeToParcel(parcel, i14);
        }
        parcel.writeParcelable(this.tip, i14);
    }

    public d(String str, q qVar, xw1.i iVar) {
        str.getClass();
        this.date = str;
        this.gradedWorkout = qVar;
        this.tip = iVar;
    }
}
