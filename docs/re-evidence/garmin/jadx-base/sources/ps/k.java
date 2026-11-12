package ps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lps/k;", "Landroid/os/Parcelable;", "Lps/m;", "polylineDTO", "Lps/h;", "heatmapDTO", "<init>", "(Lps/m;Lps/h;)V", "a", "Lps/m;", "d", "()Lps/m;", "b", "Lps/h;", "()Lps/h;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gPolyline")
    private final m polylineDTO;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityHeatMapDTO")
    private final h heatmapDTO;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new k(parcel.readInt() == 0 ? null : m.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? h.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i14) {
            return new k[i14];
        }
    }

    public k(m mVar, h hVar) {
        this.polylineDTO = mVar;
        this.heatmapDTO = hVar;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final h getHeatmapDTO() {
        return this.heatmapDTO;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final m getPolylineDTO() {
        return this.polylineDTO;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return p005kotlin.jvm.internal.s.g(this.polylineDTO, kVar.polylineDTO) && p005kotlin.jvm.internal.s.g(this.heatmapDTO, kVar.heatmapDTO);
    }

    public final int hashCode() {
        m mVar = this.polylineDTO;
        int iHashCode = (mVar == null ? 0 : mVar.hashCode()) * 31;
        h hVar = this.heatmapDTO;
        return iHashCode + (hVar != null ? hVar.hashCode() : 0);
    }

    public final String toString() {
        return "ActivityMapDetailsDTO(polylineDTO=" + this.polylineDTO + ", heatmapDTO=" + this.heatmapDTO + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        m mVar = this.polylineDTO;
        if (mVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mVar.writeToParcel(parcel, i14);
        }
        h hVar = this.heatmapDTO;
        if (hVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hVar.writeToParcel(parcel, i14);
        }
    }
}
