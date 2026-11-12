package defpackage;

import android.graphics.Rect;
import android.view.View;
import com.amap.api.maps.model.BaseOverlay;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;
import com.autonavi.amap.mapcore.DPoint;

/* JADX INFO: loaded from: classes4.dex */
public final class c5s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Marker f4967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4968b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f = false;
    public boolean g = false;

    public c5s(Marker marker, int i, int i2) {
        this.f4967a = marker;
        b(i, i2);
    }

    public final BaseOverlay a() {
        return this.f4967a;
    }

    public final void b(int i, int i2) {
        int width;
        int height;
        MarkerOptions options = this.f4967a.getOptions();
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
        if (Math.abs(this.f4968b - i) > 2) {
            this.d = i - width;
            this.f = true;
        }
        if (Math.abs(this.c - i2) > 2) {
            this.e = i2 - height;
            this.f = true;
        }
    }

    public final void c(boolean z) {
        this.g = z;
    }

    public final boolean d(DPoint dPoint) {
        View iconView = this.f4967a.getOptions().getIconView();
        Rect rect = new Rect();
        if (iconView != null) {
            iconView.getHitRect(rect);
        }
        return rect.contains((int) dPoint.x, (int) dPoint.y);
    }

    public final View e() {
        MarkerOptions options = this.f4967a.getOptions();
        if (options == null) {
            return null;
        }
        return options.getIconView();
    }

    public final int f() {
        return this.d;
    }

    public final int g() {
        return this.e;
    }

    public final void h() {
        MarkerOptions options;
        View iconView;
        if (!this.f || (options = this.f4967a.getOptions()) == null || (iconView = options.getIconView()) == null) {
            return;
        }
        iconView.setX(this.d);
        iconView.setY(this.e);
        iconView.setZ(options.getZIndex());
        this.f4968b = this.d;
        this.c = this.e;
        this.f = false;
    }

    public final void i() {
        View iconView;
        MarkerOptions options = this.f4967a.getOptions();
        if (options == null || (iconView = options.getIconView()) == null) {
            return;
        }
        iconView.setVisibility(options.isVisible() ? 0 : 8);
    }

    public final boolean j() {
        return this.g;
    }
}
