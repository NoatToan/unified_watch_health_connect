package com.amap.api.col.p0003sl;

import com.autonavi.amap.mapcore.DPoint;

/* JADX INFO: loaded from: classes21.dex */
public final class dk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f2375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f2376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f2377c;
    public final double d;
    public final double e;
    public final double f;

    public dk(double d, double d2, double d3, double d4) {
        this.f2375a = d;
        this.f2376b = d3;
        this.f2377c = d2;
        this.d = d4;
        this.e = (d + d2) / 2.0d;
        this.f = (d3 + d4) / 2.0d;
    }

    public final boolean a(double d, double d2) {
        return this.f2375a <= d && d <= this.f2377c && this.f2376b <= d2 && d2 <= this.d;
    }

    public final boolean a(DPoint dPoint) {
        return a(dPoint.x, dPoint.y);
    }

    private boolean a(double d, double d2, double d3, double d4) {
        return d < this.f2377c && this.f2375a < d2 && d3 < this.d && this.f2376b < d4;
    }

    public final boolean a(dk dkVar) {
        return a(dkVar.f2375a, dkVar.f2377c, dkVar.f2376b, dkVar.d);
    }

    public final boolean b(dk dkVar) {
        return dkVar.f2375a >= this.f2375a && dkVar.f2377c <= this.f2377c && dkVar.f2376b >= this.f2376b && dkVar.d <= this.d;
    }
}
