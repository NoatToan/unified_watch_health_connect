package ww1;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lww1/g;", "Landroid/os/Parcelable;", "", "hasActivePlan", "", "activeTrainingPlanID", "Lww1/i;", "activeTrainingPlan", "Lxw1/d;", "activeAtpPlan", "Lfg0/k;", "planLinkedEventDTO", "<init>", "(ZLjava/lang/Long;Lww1/i;Lxw1/d;Lfg0/k;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f187762f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f187763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f187764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f187765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xw1.d f187766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fg0.k f187767e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new g(parcel.readInt() != 0, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : i.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : xw1.d.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? fg0.k.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    public g(boolean z14, Long l14, i iVar, xw1.d dVar, fg0.k kVar) {
        this.f187763a = z14;
        this.f187764b = l14;
        this.f187765c = iVar;
        this.f187766d = dVar;
        this.f187767e = kVar;
    }

    public final String b() {
        String trainingPlanName;
        i iVar = this.f187765c;
        if (iVar != null && (trainingPlanName = iVar.getTrainingPlanName()) != null) {
            return trainingPlanName;
        }
        xw1.d dVar = this.f187766d;
        if (dVar == null) {
            return null;
        }
        vt1.a.C3360a c3360a = vt1.a.f180073b;
        int workoutPlanId = (int) dVar.getWorkoutPlanId();
        c3360a.getClass();
        return vt1.a.C3360a.a(workoutPlanId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f187763a == gVar.f187763a && p005kotlin.jvm.internal.s.g(this.f187764b, gVar.f187764b) && p005kotlin.jvm.internal.s.g(this.f187765c, gVar.f187765c) && p005kotlin.jvm.internal.s.g(this.f187766d, gVar.f187766d) && p005kotlin.jvm.internal.s.g(this.f187767e, gVar.f187767e);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f187763a) * 31;
        Long l14 = this.f187764b;
        int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        i iVar = this.f187765c;
        int iHashCode3 = (iHashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        xw1.d dVar = this.f187766d;
        int iHashCode4 = (iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        fg0.k kVar = this.f187767e;
        return iHashCode4 + (kVar != null ? kVar.hashCode() : 0);
    }

    public final String toString() {
        return "ActiveTrainingPlanDTO(hasActivePlan=" + this.f187763a + ", activeTrainingPlanID=" + this.f187764b + ", activeTrainingPlan=" + this.f187765c + ", activeAtpPlan=" + this.f187766d + ", planLinkedEventDTO=" + this.f187767e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f187763a ? 1 : 0);
        Long l14 = this.f187764b;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        i iVar = this.f187765c;
        if (iVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iVar.writeToParcel(parcel, i14);
        }
        xw1.d dVar = this.f187766d;
        if (dVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dVar.writeToParcel(parcel, i14);
        }
        fg0.k kVar = this.f187767e;
        if (kVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            kVar.writeToParcel(parcel, i14);
        }
    }
}
