package im;

import com.github.mikephil.charting.components.LimitLine;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lim/l;", "Lcom/github/mikephil/charting/components/LimitLine;", "", "xLimit", "yLimit", "<init>", "(FF)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l extends LimitLine {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f94154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f94155b;

    public l(float f14, float f15) {
        super(f14);
        this.f94154a = f14;
        this.f94155b = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Float.compare(this.f94154a, lVar.f94154a) == 0 && Float.compare(this.f94155b, lVar.f94155b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f94155b) + (Float.hashCode(this.f94154a) * 31);
    }

    public final String toString() {
        return am.j.l("ClimbDetailsLimitLine(xLimit=", this.f94154a, ", yLimit=", this.f94155b, ")");
    }
}
