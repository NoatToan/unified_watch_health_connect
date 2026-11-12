package to;

import com.google.gson.annotations.SerializedName;
import i3.e5;
import p005kotlin.Metadata;
import r1.q2;
import v.e0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\n\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lto/l;", "", "", "frontGearTeeth", "rearGearTeeth", "", "timeInGearSeconds", "<init>", "(IIF)V", "a", "I", "()I", "b", "c", "F", "()F", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("frontGearTeeth")
    private final int frontGearTeeth;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("rearGearTeeth")
    private final int rearGearTeeth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("timeInGearSeconds")
    private final float timeInGearSeconds;

    public l(int i14, int i15, float f14) {
        this.frontGearTeeth = i14;
        this.rearGearTeeth = i15;
        this.timeInGearSeconds = f14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getFrontGearTeeth() {
        return this.frontGearTeeth;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getRearGearTeeth() {
        return this.rearGearTeeth;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getTimeInGearSeconds() {
        return this.timeInGearSeconds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.frontGearTeeth == lVar.frontGearTeeth && this.rearGearTeeth == lVar.rearGearTeeth && Float.compare(this.timeInGearSeconds, lVar.timeInGearSeconds) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.timeInGearSeconds) + q2.d(this.rearGearTeeth, Integer.hashCode(this.frontGearTeeth) * 31, 31);
    }

    public final String toString() {
        return e0.e(this.timeInGearSeconds, ")", e5.j(this.frontGearTeeth, this.rearGearTeeth, "TimeInGearDTO(frontGearTeeth=", ", rearGearTeeth=", ", timeInGearSeconds="));
    }
}
