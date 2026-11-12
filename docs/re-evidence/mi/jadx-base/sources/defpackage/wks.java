package defpackage;

import com.autonavi.amap.mapcore.DPoint;

/* JADX INFO: loaded from: classes4.dex */
public final class wks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f38075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f38076b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;

    public wks(double d, double d2, double d3, double d4) {
        this.f38075a = d;
        this.f38076b = d3;
        this.c = d2;
        this.d = d4;
        this.e = (d + d2) / 2.0d;
        this.f = (d3 + d4) / 2.0d;
    }

    public final boolean a(double d, double d2) {
        return this.f38075a <= d && d <= this.c && this.f38076b <= d2 && d2 <= this.d;
    }

    public final boolean b(double d, double d2, double d3, double d4) {
        return d < this.c && this.f38075a < d2 && d3 < this.d && this.f38076b < d4;
    }

    public final boolean c(DPoint dPoint) {
        return a(dPoint.x, dPoint.y);
    }

    public final boolean d(wks wksVar) {
        return b(wksVar.f38075a, wksVar.c, wksVar.f38076b, wksVar.d);
    }

    public final boolean e(wks wksVar) {
        return wksVar.f38075a >= this.f38075a && wksVar.c <= this.c && wksVar.f38076b >= this.f38076b && wksVar.d <= this.d;
    }
}
