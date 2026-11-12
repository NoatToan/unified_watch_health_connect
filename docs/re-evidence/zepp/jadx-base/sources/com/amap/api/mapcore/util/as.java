package com.amap.api.mapcore.util;

import android.graphics.Point;
import com.autonavi.amap.mapcore.IPoint;

/* JADX INFO: loaded from: classes2.dex */
public final class as {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    public as(int i, int i2, int i3, int i4) {
        a(i, i2, i3, i4);
    }

    public final void a(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i3;
        this.c = i2;
        this.d = i4;
        this.e = (i + i2) / 2;
        this.f = (i3 + i4) / 2;
    }

    public final boolean a(int i, int i2) {
        return this.a <= i && i <= this.c && this.b <= i2 && i2 <= this.d;
    }

    public final boolean a(IPoint iPoint) {
        if (iPoint == null) {
            return false;
        }
        return a(((Point) iPoint).x, ((Point) iPoint).y);
    }

    public final boolean a(as asVar) {
        if (asVar == null) {
            return false;
        }
        return asVar.a < this.c && this.a < asVar.c && asVar.b < this.d && this.b < asVar.d;
    }
}
