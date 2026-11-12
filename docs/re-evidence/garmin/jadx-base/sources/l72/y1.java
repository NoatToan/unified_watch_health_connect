package l72;

import com.mapbox.maps.MapboxMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ll72/y1;", "", "Lg6/k;", MapboxMap.QFE_OFFSET, "Ll72/w1;", "alignment", "Ll72/x1;", "arrowAlignment", "Lg6/f;", "arrowHeight", "", "tooltipWidthPx", "<init>", "(JLl72/w1;Ll72/x1;FFLkotlin/jvm/internal/j;)V", "components_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f111381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f111382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x1 f111383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f111384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f111385e;

    /* JADX WARN: Illegal instructions before constructor call */
    public y1(long j8, w1 w1Var, x1 x1Var, float f14, float f15, int i14, p005kotlin.jvm.internal.j jVar) {
        long j14;
        float f16;
        if ((i14 & 1) != 0) {
            long j15 = 0;
            j14 = (j15 & 4294967295L) | (j15 << 32);
            g6.k.a aVar = g6.k.f76003b;
        } else {
            j14 = j8;
        }
        w1 w1Var2 = (i14 & 2) != 0 ? w1.TopCenter : w1Var;
        x1 x1Var2 = (i14 & 4) != 0 ? x1.Top : x1Var;
        if ((i14 & 8) != 0) {
            f16 = 8;
            g6.f.a aVar2 = g6.f.f75994b;
        } else {
            f16 = f14;
        }
        this(j14, w1Var2, x1Var2, f16, (i14 & 16) != 0 ? 0.0f : f15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return g6.k.c(this.f111381a, y1Var.f111381a) && this.f111382b == y1Var.f111382b && this.f111383c == y1Var.f111383c && g6.f.c(this.f111384d, y1Var.f111384d) && Float.compare(this.f111385e, y1Var.f111385e) == 0;
    }

    public final int hashCode() {
        g6.k.a aVar = g6.k.f76003b;
        int iHashCode = (this.f111383c.hashCode() + ((this.f111382b.hashCode() + (Long.hashCode(this.f111381a) * 31)) * 31)) * 31;
        g6.f.a aVar2 = g6.f.f75994b;
        return Float.hashCode(this.f111385e) + q6.f.d(this.f111384d, iHashCode, 31);
    }

    public final String toString() {
        String strF = g6.k.f(this.f111381a);
        String strD = g6.f.d(this.f111384d);
        StringBuilder sb3 = new StringBuilder("HintTooltipConfiguration(offset=");
        sb3.append(strF);
        sb3.append(", alignment=");
        sb3.append(this.f111382b);
        sb3.append(", arrowAlignment=");
        sb3.append(this.f111383c);
        sb3.append(", arrowHeight=");
        sb3.append(strD);
        sb3.append(", tooltipWidthPx=");
        return v.e0.e(this.f111385e, ")", sb3);
    }

    private y1(long j8, w1 w1Var, x1 x1Var, float f14, float f15) {
        w1Var.getClass();
        x1Var.getClass();
        this.f111381a = j8;
        this.f111382b = w1Var;
        this.f111383c = x1Var;
        this.f111384d = f14;
        this.f111385e = f15;
    }

    public /* synthetic */ y1(long j8, w1 w1Var, x1 x1Var, float f14, float f15, p005kotlin.jvm.internal.j jVar) {
        this(j8, w1Var, x1Var, f14, f15);
    }
}
