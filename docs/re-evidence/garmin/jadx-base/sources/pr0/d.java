package pr0;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lpr0/d;", "", "", "Lhz/d;", "chartValues", "", "startValue", "endValue", "weeklyGoal", "<init>", "(Ljava/util/List;FFF)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<hz.d> f139609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f139610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f139611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f139612d;

    public d(List<hz.d> list, float f14, float f15, float f16) {
        list.getClass();
        this.f139609a = list;
        this.f139610b = f14;
        this.f139611c = f15;
        this.f139612d = f16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f139609a.equals(dVar.f139609a) && Float.compare(this.f139610b, dVar.f139610b) == 0 && Float.compare(this.f139611c, dVar.f139611c) == 0 && Float.compare(this.f139612d, dVar.f139612d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f139612d) + q6.f.d(this.f139611c, q6.f.d(this.f139610b, this.f139609a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "IntensityMinutesChartValues(chartValues=" + this.f139609a + ", startValue=" + this.f139610b + ", endValue=" + this.f139611c + ", weeklyGoal=" + this.f139612d + ")";
    }
}
