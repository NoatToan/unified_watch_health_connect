package com.amap.api.col.p0003sl;

import android.graphics.Rect;
import android.view.View;
import com.amap.api.maps.model.BaseOverlay;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;
import com.autonavi.amap.mapcore.DPoint;

/* JADX INFO: loaded from: classes4.dex */
public final class af {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Marker f2199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2200b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2201c = 0;
    private int d = 0;
    private int e = 0;
    private boolean f = false;
    private boolean g = false;

    public af(Marker marker, int i, int i2) {
        this.f2199a = marker;
        a(i, i2);
    }

    public final BaseOverlay a() {
        return this.f2199a;
    }

    public final View b() {
        MarkerOptions options = this.f2199a.getOptions();
        if (options == null) {
            return null;
        }
        return options.getIconView();
    }

    public final int c() {
        return this.d;
    }

    public final int d() {
        return this.e;
    }

    public final void a(int i, int i2) {
        int width;
        int height;
        MarkerOptions options = this.f2199a.getOptions();
        if (options == null) {
            return;
        }
        float anchorU = options.getAnchorU();
        float anchorV = options.getAnchorV();
        View iconView = options.getIconView();
        if (iconView != null) {
            width = (int) (iconView.getWidth() * anchorU);
            height = (int) (iconView.getHeight() * anchorV);
        } else {
            width = 0;
            height = 0;
        }
        if (Math.abs(this.f2200b - i) > 2) {
            this.d = i - width;
            this.f = true;
        }
        if (Math.abs(this.f2201c - i2) > 2) {
            this.e = i2 - height;
            this.f = true;
        }
    }

    public final void e() {
        MarkerOptions options;
        View iconView;
        if (!this.f || (options = this.f2199a.getOptions()) == null || (iconView = options.getIconView()) == null) {
            return;
        }
        iconView.setX(this.d);
        iconView.setY(this.e);
        iconView.setZ(options.getZIndex());
        this.f2200b = this.d;
        this.f2201c = this.e;
        this.f = false;
    }

    public final void f() {
        View iconView;
        MarkerOptions options = this.f2199a.getOptions();
        if (options == null || (iconView = options.getIconView()) == null) {
            return;
        }
        iconView.setVisibility(options.isVisible() ? 0 : 8);
    }

    public final void a(boolean z) {
        this.g = z;
    }

    public final boolean g() {
        return this.g;
    }

    public final boolean a(DPoint dPoint) {
        View iconView = this.f2199a.getOptions().getIconView();
        Rect rect = new Rect();
        if (iconView != null) {
            iconView.getHitRect(rect);
        }
        return rect.contains((int) dPoint.x, (int) dPoint.y);
    }
}
