package ag0;

import androidx.core.view.j;
import i3.e5;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lag0/h;", "", "", "minWhole", "minDecimal", "maxWhole", "maxDecimal", "<init>", "(IIII)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3156d;

    public h(int i14, int i15, int i16, int i17) {
        this.f3153a = i14;
        this.f3154b = i15;
        this.f3155c = i16;
        this.f3156d = i17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f3153a == hVar.f3153a && this.f3154b == hVar.f3154b && this.f3155c == hVar.f3155c && this.f3156d == hVar.f3156d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3156d) + q2.d(this.f3155c, q2.d(this.f3154b, Integer.hashCode(this.f3153a) * 31, 31), 31);
    }

    public final String toString() {
        return j.e(this.f3155c, this.f3156d, ", maxDecimal=", ")", e5.j(this.f3153a, this.f3154b, "SpeedPickerLimits(minWhole=", ", minDecimal=", ", maxWhole="));
    }
}
