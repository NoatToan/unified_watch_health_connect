package kw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lkw/q;", "Landroid/os/Parcelable;", "", "category", "Lkw/s;", "systolic", "Lkw/r;", "diastolic", "<init>", "(Ljava/lang/String;Lkw/s;Lkw/r;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lkw/s;", "f", "()Lkw/s;", "c", "Lkw/r;", "d", "()Lkw/r;", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q implements Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("category")
    private final String category;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("systolic")
    private final s systolic;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("diastolic")
    private final r diastolic;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<q> {
        @Override // android.os.Parcelable.Creator
        public final q createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new q(parcel.readString(), parcel.readInt() == 0 ? null : s.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? r.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final q[] newArray(int i14) {
            return new q[i14];
        }
    }

    public /* synthetic */ q(String str, s sVar, r rVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : sVar, (i14 & 4) != 0 ? null : rVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final r getDiastolic() {
        return this.diastolic;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return p005kotlin.jvm.internal.s.g(this.category, qVar.category) && p005kotlin.jvm.internal.s.g(this.systolic, qVar.systolic) && p005kotlin.jvm.internal.s.g(this.diastolic, qVar.diastolic);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final s getSystolic() {
        return this.systolic;
    }

    public final int hashCode() {
        String str = this.category;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        s sVar = this.systolic;
        int iHashCode2 = (iHashCode + (sVar == null ? 0 : sVar.hashCode())) * 31;
        r rVar = this.diastolic;
        return iHashCode2 + (rVar != null ? rVar.hashCode() : 0);
    }

    public final String toString() {
        return "MeasurementCategoryDTO(category=" + this.category + ", systolic=" + this.systolic + ", diastolic=" + this.diastolic + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.category);
        s sVar = this.systolic;
        if (sVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sVar.writeToParcel(parcel, i14);
        }
        r rVar = this.diastolic;
        if (rVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rVar.writeToParcel(parcel, i14);
        }
    }

    public q(String str, s sVar, r rVar) {
        this.category = str;
        this.systolic = sVar;
        this.diastolic = rVar;
    }

    public q() {
        this(null, null, null, 7, null);
    }
}
