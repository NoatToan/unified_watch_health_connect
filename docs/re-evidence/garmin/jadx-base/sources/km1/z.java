package km1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkm1/z;", "Landroid/os/Parcelable;", "", "value", "", "startGMT", "<init>", "(IJ)V", "a", "I", "d", "()I", "b", "J", "()J", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class z implements Parcelable {
    public static final Parcelable.Creator<z> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("value")
    private final int value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startGMT")
    private final long startGMT;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<z> {
        @Override // android.os.Parcelable.Creator
        public final z createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new z(parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final z[] newArray(int i14) {
            return new z[i14];
        }
    }

    public /* synthetic */ z(int i14, long j8, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 0 : i14, (i15 & 2) != 0 ? 0L : j8);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getStartGMT() {
        return this.startGMT;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.value == zVar.value && this.startGMT == zVar.startGMT;
    }

    public final int hashCode() {
        return Long.hashCode(this.startGMT) + (Integer.hashCode(this.value) * 31);
    }

    public final String toString() {
        return "SleepMetricEpochDTO(value=" + this.value + ", startGMT=" + this.startGMT + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.value);
        parcel.writeLong(this.startGMT);
    }

    public z(int i14, long j8) {
        this.value = i14;
        this.startGMT = j8;
    }

    public z() {
        this(0, 0L, 3, null);
    }
}
