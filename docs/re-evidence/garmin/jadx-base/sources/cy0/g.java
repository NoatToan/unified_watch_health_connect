package cy0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcy0/g;", "Landroid/os/Parcelable;", "", "durationSecondOffset", "", "elevation", "<init>", "(ID)V", "a", "I", "b", "()I", "D", "d", "()D", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("durationSecondOffset")
    private final int durationSecondOffset;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("elevation")
    private final double elevation;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new g(parcel.readInt(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    public g(int i14, double d14) {
        this.durationSecondOffset = i14;
        this.elevation = d14;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getDurationSecondOffset() {
        return this.durationSecondOffset;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getElevation() {
        return this.elevation;
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
        return this.durationSecondOffset == gVar.durationSecondOffset && Double.compare(this.elevation, gVar.elevation) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.elevation) + (Integer.hashCode(this.durationSecondOffset) * 31);
    }

    public final String toString() {
        return "ElevationPoint(durationSecondOffset=" + this.durationSecondOffset + ", elevation=" + this.elevation + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.durationSecondOffset);
        parcel.writeDouble(this.elevation);
    }
}
