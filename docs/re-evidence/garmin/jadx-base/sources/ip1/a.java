package ip1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lip1/a;", "Landroid/os/Parcelable;", "", "activityId", "", "activityName", "Lip1/k;", "summaryDTO", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Lip1/k;)V", "a", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "Lip1/k;", "f", "()Lip1/k;", "gcm-solar-charge_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1809a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityId")
    private final Long activityId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityName")
    private final String activityName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("summaryDTO")
    private final k summaryDTO;

    /* JADX INFO: renamed from: ip1.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1809a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0 ? k.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(Long l14, String str, k kVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : kVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getActivityId() {
        return this.activityId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getActivityName() {
        return this.activityName;
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
        return s.g(this.activityId, aVar.activityId) && s.g(this.activityName, aVar.activityName) && s.g(this.summaryDTO, aVar.summaryDTO);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final k getSummaryDTO() {
        return this.summaryDTO;
    }

    public final int hashCode() {
        Long l14 = this.activityId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.activityName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        k kVar = this.summaryDTO;
        return iHashCode2 + (kVar != null ? kVar.hashCode() : 0);
    }

    public final String toString() {
        Long l14 = this.activityId;
        String str = this.activityName;
        k kVar = this.summaryDTO;
        StringBuilder sbJ = b71.i.j("ActivityDTO(activityId=", ", activityName=", str, l14, ", summaryDTO=");
        sbJ.append(kVar);
        sbJ.append(")");
        return sbJ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.activityId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.activityName);
        k kVar = this.summaryDTO;
        if (kVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            kVar.writeToParcel(parcel, i14);
        }
    }

    public a(Long l14, String str, k kVar) {
        this.activityId = l14;
        this.activityName = str;
        this.summaryDTO = kVar;
    }

    public a() {
        this(null, null, null, 7, null);
    }
}
