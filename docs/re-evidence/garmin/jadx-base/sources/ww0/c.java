package ww0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lww0/c;", "Landroid/os/Parcelable;", "Lww0/l;", "cycleSummary", "Lww0/b;", "log", "Lww0/v;", "weightGoals", "<init>", "(Lww0/l;Lww0/b;Lww0/v;)V", "a", "Lww0/l;", "b", "()Lww0/l;", "Lww0/b;", "d", "()Lww0/b;", "c", "Lww0/v;", "f", "()Lww0/v;", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("daySummary")
    private final l cycleSummary;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dayLog")
    private final b log;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("weightGoals")
    private final v weightGoals;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel.readInt() == 0 ? null : l.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : b.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? v.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(l lVar, b bVar, v vVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : lVar, (i14 & 2) != 0 ? null : bVar, (i14 & 4) != 0 ? null : vVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final l getCycleSummary() {
        return this.cycleSummary;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b getLog() {
        return this.log;
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
        return p005kotlin.jvm.internal.s.g(this.cycleSummary, cVar.cycleSummary) && p005kotlin.jvm.internal.s.g(this.log, cVar.log) && p005kotlin.jvm.internal.s.g(this.weightGoals, cVar.weightGoals);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final v getWeightGoals() {
        return this.weightGoals;
    }

    public final int hashCode() {
        l lVar = this.cycleSummary;
        int iHashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        b bVar = this.log;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        v vVar = this.weightGoals;
        return iHashCode2 + (vVar != null ? vVar.hashCode() : 0);
    }

    public final String toString() {
        return "DetailedMenstrualCycleDayDTO(cycleSummary=" + this.cycleSummary + ", log=" + this.log + ", weightGoals=" + this.weightGoals + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        l lVar = this.cycleSummary;
        if (lVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            lVar.writeToParcel(parcel, i14);
        }
        b bVar = this.log;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bVar.writeToParcel(parcel, i14);
        }
        v vVar = this.weightGoals;
        if (vVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vVar.writeToParcel(parcel, i14);
        }
    }

    public c(l lVar, b bVar, v vVar) {
        this.cycleSummary = lVar;
        this.log = bVar;
        this.weightGoals = vVar;
    }

    public c() {
        this(null, null, null, 7, null);
    }
}
