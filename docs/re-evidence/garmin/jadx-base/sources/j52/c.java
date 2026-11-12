package j52;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lj52/c;", "Landroid/os/Parcelable;", "Lj52/f;", "cycleSummary", "Lj52/b;", "log", "Lj52/m;", "weightGoals", "<init>", "(Lj52/f;Lj52/b;Lj52/m;)V", "a", "Lj52/f;", "b", "()Lj52/f;", "Lj52/b;", "getLog", "()Lj52/b;", "c", "Lj52/m;", "d", "()Lj52/m;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("daySummary")
    private final f cycleSummary;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dayLog")
    private final b log;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("weightGoals")
    private final m weightGoals;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel.readInt() == 0 ? null : f.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : b.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? m.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(f fVar, b bVar, m mVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : fVar, (i14 & 2) != 0 ? null : bVar, (i14 & 4) != 0 ? null : mVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final f getCycleSummary() {
        return this.cycleSummary;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final m getWeightGoals() {
        return this.weightGoals;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.cycleSummary, cVar.cycleSummary) && s.g(this.log, cVar.log) && s.g(this.weightGoals, cVar.weightGoals);
    }

    public final int hashCode() {
        f fVar = this.cycleSummary;
        int iHashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
        b bVar = this.log;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        m mVar = this.weightGoals;
        return iHashCode2 + (mVar != null ? mVar.hashCode() : 0);
    }

    public final String toString() {
        return "DetailedMenstrualCycleDayDTO(cycleSummary=" + this.cycleSummary + ", log=" + this.log + ", weightGoals=" + this.weightGoals + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        f fVar = this.cycleSummary;
        if (fVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fVar.writeToParcel(parcel, i14);
        }
        b bVar = this.log;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bVar.writeToParcel(parcel, i14);
        }
        m mVar = this.weightGoals;
        if (mVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mVar.writeToParcel(parcel, i14);
        }
    }

    public c(f fVar, b bVar, m mVar) {
        this.cycleSummary = fVar;
        this.log = bVar;
        this.weightGoals = mVar;
    }

    public c() {
        this(null, null, null, 7, null);
    }
}
