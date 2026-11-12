package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.amap.api.maps.MapsInitializer;
import com.amap.api.maps.model.BasePointOverlay;
import com.amap.api.maps.model.CameraPosition;
import com.amap.api.maps.model.GL3DModel;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.Marker;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.base.ae.gmap.GLMapState;
import com.autonavi.base.ae.gmap.listener.AMapWidgetListener;
import com.autonavi.base.amap.api.mapcore.BaseOverlayImp;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.autonavi.base.amap.api.mapcore.IGLSurfaceView;
import com.autonavi.base.amap.mapcore.FPoint;
import com.autonavi.base.amap.mapcore.MapConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class fk extends ViewGroup implements fj {
    public fl a;
    public ap b;
    private IAMapDelegate c;
    private Context d;
    private fn e;
    private fh f;
    private ff g;
    private fm h;
    private fe i;
    private fg j;
    private fo k;
    private View l;
    private BaseOverlayImp m;
    private Drawable n;
    private boolean o;
    private View p;
    private boolean q;
    private boolean r;
    private boolean s;

    public static class a extends ViewGroup.LayoutParams {
        public FPoint a;
        public boolean b;
        public int c;
        public int d;
        public int e;

        public a(int i, int i2, FPoint fPoint, int i3, int i4, int i5) {
            super(i, i2);
            this.a = null;
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = 51;
            this.a = fPoint;
            this.c = i3;
            this.d = i4;
            this.e = i5;
        }
    }

    public fk(Context context, IAMapDelegate iAMapDelegate) {
        super(context);
        this.n = null;
        int i = 1;
        this.o = true;
        this.r = true;
        this.s = true;
        try {
            this.c = iAMapDelegate;
            this.d = context;
            this.a = new fl();
            this.i = new fe(context);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (this.c.getGLMapView() != null) {
                addView(this.c.getGLMapView(), 0, layoutParams);
            } else {
                i = 0;
            }
            addView(this.i, i, layoutParams);
            if (this.r) {
                return;
            }
            a(context);
        } catch (Throwable th) {
            th.printStackTrace();
            er.a(th);
        }
    }

    public static /* synthetic */ View f(fk fkVar) {
        fkVar.l = null;
        return null;
    }

    private void k() {
        fm fmVar = this.h;
        if (fmVar == null) {
            this.a.a(this, new Object[0]);
        } else {
            if (fmVar == null || fmVar.getVisibility() != 0) {
                return;
            }
            this.h.postInvalidate();
        }
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void g(Boolean bool) {
        fn fnVar = this.e;
        if (fnVar == null) {
            this.a.a(this, bool);
            return;
        }
        if (fnVar != null && bool.booleanValue()) {
            this.e.a(true);
            return;
        }
        fn fnVar2 = this.e;
        if (fnVar2 != null) {
            fnVar2.a(false);
        }
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void h() {
        ff ffVar = this.g;
        if (ffVar == null) {
            this.a.a(this, new Object[0]);
        } else {
            ffVar.b();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final void hideInfoWindow() {
        IAMapDelegate iAMapDelegate = this.c;
        if (iAMapDelegate == null || iAMapDelegate.getMainHandler() == null) {
            return;
        }
        this.c.getMainHandler().post(new Runnable() { // from class: com.amap.api.mapcore.util.fk.2
            @Override // java.lang.Runnable
            public final void run() {
                if (fk.this.l != null) {
                    fk.this.l.clearFocus();
                    fk fkVar = fk.this;
                    fkVar.removeView(fkVar.l);
                    er.a(fk.this.l.getBackground());
                    er.a(fk.this.n);
                    fk.f(fk.this);
                }
            }
        });
        BaseOverlayImp baseOverlayImp = this.m;
        if (baseOverlayImp != null) {
            baseOverlayImp.setInfoWindowShown(false);
        }
        this.m = null;
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void i(Boolean bool) {
        fg fgVar = this.j;
        if (fgVar == null) {
            this.a.a(this, bool);
        } else {
            fgVar.a(bool.booleanValue());
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final boolean isInfoWindowShown() {
        return false;
    }

    @Override // com.amap.api.mapcore.util.fj
    public final View j() {
        return this;
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void j(Boolean bool) {
        if (this.e == null) {
            this.a.a(this, bool);
        } else {
            bool.booleanValue();
            this.e.setVisibility(4);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final boolean onInfoWindowTap(MotionEvent motionEvent) {
        return (this.l == null || this.m == null || !er.a(new Rect(this.l.getLeft(), this.l.getTop(), this.l.getRight(), this.l.getBottom()), (int) motionEvent.getX(), (int) motionEvent.getY())) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        try {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt != null) {
                    if (childAt.getLayoutParams() instanceof a) {
                        a aVar = (a) childAt.getLayoutParams();
                        int[] iArr = new int[2];
                        a(childAt, ((ViewGroup.LayoutParams) aVar).width, ((ViewGroup.LayoutParams) aVar).height, iArr);
                        if (childAt instanceof fo) {
                            a(childAt, iArr[0], iArr[1], getWidth() - iArr[0], getHeight(), aVar.e);
                        } else if (childAt instanceof fh) {
                            a(childAt, iArr[0], iArr[1], getWidth() - iArr[0], iArr[1], aVar.e);
                        } else if (childAt instanceof ff) {
                            a(childAt, iArr[0], iArr[1], 0, 0, aVar.e);
                        } else if (aVar.a != null) {
                            IPoint iPointObtain = IPoint.obtain();
                            MapConfig mapConfig = this.c.getMapConfig();
                            GLMapState mapProjection = this.c.getMapProjection();
                            if (mapConfig != null && mapProjection != null) {
                                FPoint fPointObtain = FPoint.obtain();
                                if (aVar.b) {
                                    FPoint fPoint = aVar.a;
                                    ((PointF) fPointObtain).x = (int) ((PointF) fPoint).x;
                                    ((PointF) fPointObtain).y = (int) ((PointF) fPoint).y;
                                } else {
                                    FPoint fPoint2 = aVar.a;
                                    mapProjection.p20ToScreenPoint((int) ((PointF) fPoint2).x, (int) ((PointF) fPoint2).y, fPointObtain);
                                }
                                ((Point) iPointObtain).x = (int) ((PointF) fPointObtain).x;
                                ((Point) iPointObtain).y = (int) ((PointF) fPointObtain).y;
                                fPointObtain.recycle();
                            }
                            int i6 = ((Point) iPointObtain).x + aVar.c;
                            ((Point) iPointObtain).x = i6;
                            int i7 = ((Point) iPointObtain).y + aVar.d;
                            ((Point) iPointObtain).y = i7;
                            a(childAt, iArr[0], iArr[1], i6, i7, aVar.e);
                            iPointObtain.recycle();
                        }
                    } else {
                        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                        int[] iArr2 = new int[2];
                        a(childAt, layoutParams.width, layoutParams.height, iArr2);
                        if (childAt instanceof fg) {
                            a(childAt, iArr2[0], iArr2[1], 20, (this.c.getWaterMarkerPositon().y - 80) - iArr2[1], 51);
                        } else {
                            a(childAt, iArr2[0], iArr2[1], 0, 0, 51);
                        }
                    }
                }
            }
            fn fnVar = this.e;
            if (fnVar != null) {
                fnVar.c();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005e A[Catch: all -> 0x0103, TryCatch #0 {all -> 0x0103, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x000c, B:9:0x0011, B:12:0x0036, B:15:0x003d, B:21:0x007a, B:23:0x007e, B:25:0x0086, B:27:0x0090, B:29:0x00bf, B:28:0x00a9, B:30:0x00c3, B:32:0x00d4, B:33:0x00e5, B:35:0x00ed, B:16:0x0045, B:18:0x005e, B:20:0x0065, B:37:0x00f3, B:39:0x00f7, B:41:0x00fd), top: B:46:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0064  */
    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final void redrawInfoWindow() {
        ViewGroup.LayoutParams layoutParams;
        int i;
        int i2;
        try {
            BaseOverlayImp baseOverlayImp = this.m;
            if (baseOverlayImp == null || !baseOverlayImp.checkInBounds()) {
                View view = this.l;
                if (view == null || view.getVisibility() != 0) {
                    return;
                }
                this.l.setVisibility(8);
                return;
            }
            if (this.o) {
                int realInfoWindowOffsetX = this.m.getRealInfoWindowOffsetX() + this.m.getInfoWindowOffsetX();
                int realInfoWindowOffsetY = this.m.getRealInfoWindowOffsetY() + this.m.getInfoWindowOffsetY() + 2;
                View viewA = a(this.m);
                if (viewA == null) {
                    return;
                }
                View view2 = this.l;
                if (view2 == null) {
                    this.l = viewA;
                    layoutParams = viewA.getLayoutParams();
                    this.l.setDrawingCacheEnabled(true);
                    this.l.setDrawingCacheQuality(0);
                    this.m.getRect();
                    i = -2;
                    if (layoutParams != null) {
                        i = layoutParams.width;
                        i2 = layoutParams.height;
                    } else {
                        i2 = -2;
                    }
                    addView(this.l, new a(i, i2, this.m.getGeoPosition(), realInfoWindowOffsetX, realInfoWindowOffsetY, 81));
                } else if (viewA != view2) {
                    view2.clearFocus();
                    removeView(this.l);
                    this.l = viewA;
                    layoutParams = viewA.getLayoutParams();
                    this.l.setDrawingCacheEnabled(true);
                    this.l.setDrawingCacheQuality(0);
                    this.m.getRect();
                    i = -2;
                    if (layoutParams != null) {
                        i = layoutParams.width;
                        i2 = layoutParams.height;
                    } else {
                        i2 = -2;
                    }
                    addView(this.l, new a(i, i2, this.m.getGeoPosition(), realInfoWindowOffsetX, realInfoWindowOffsetY, 81));
                }
                View view3 = this.l;
                if (view3 != null) {
                    a aVar = (a) view3.getLayoutParams();
                    if (aVar != null) {
                        boolean zIsViewMode = this.m.isViewMode();
                        aVar.b = zIsViewMode;
                        if (zIsViewMode) {
                            aVar.a = FPoint.obtain(((Point) this.m.getScreenPosition()).x, ((Point) this.m.getScreenPosition()).y);
                        } else {
                            aVar.a = FPoint.obtain(((PointF) this.m.getGeoPosition()).x, ((PointF) this.m.getGeoPosition()).y);
                        }
                        aVar.c = realInfoWindowOffsetX;
                        aVar.d = realInfoWindowOffsetY;
                    }
                    onLayout(false, 0, 0, 0, 0);
                    if (this.b.a()) {
                        this.b.a(this.m.getTitle(), this.m.getSnippet());
                    }
                    if (this.l.getVisibility() == 8) {
                        this.l.setVisibility(0);
                    }
                }
            }
        } catch (Throwable th) {
            hn.c(th, "MapOverlayViewGroup", "redrawInfoWindow");
            th.printStackTrace();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final void setInfoWindowAdapterManager(ap apVar) {
        this.b = apVar;
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final void showInfoWindow(BasePointOverlay basePointOverlay) {
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final void showInfoWindow(BaseOverlayImp baseOverlayImp) {
        if (baseOverlayImp == null) {
            return;
        }
        try {
            ap apVar = this.b;
            if (!(apVar != null && apVar.a() && baseOverlayImp.getTitle() == null && baseOverlayImp.getSnippet() == null) && baseOverlayImp.isInfoWindowEnable()) {
                BaseOverlayImp baseOverlayImp2 = this.m;
                if (baseOverlayImp2 != null && !baseOverlayImp2.getId().equals(baseOverlayImp.getId())) {
                    hideInfoWindow();
                }
                if (this.b != null) {
                    this.m = baseOverlayImp;
                    baseOverlayImp.setInfoWindowShown(true);
                    this.q = true;
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void a(Context context) {
        fn fnVar = new fn(context);
        this.e = fnVar;
        fnVar.c(this.s);
        this.h = new fm(context, this.c);
        this.j = new fg(context);
        this.k = new fo(context, this.c);
        this.f = new fh(context, this.c);
        this.g = new ff(context, this.c);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        addView(this.e, layoutParams);
        addView(this.h, layoutParams);
        addView(this.j, new ViewGroup.LayoutParams(-2, -2));
        addView(this.k, new a(-2, -2, new FPoint(0.0f, 0.0f), 0, 0, 83));
        addView(this.f, new a(-2, -2, FPoint.obtain(0.0f, 0.0f), 0, 0, 83));
        addView(this.g, new a(-2, -2, FPoint.obtain(0.0f, 0.0f), 0, 0, 51));
        this.g.setVisibility(8);
        this.c.setMapWidgetListener(new AMapWidgetListener() { // from class: com.amap.api.mapcore.util.fk.1
            @Override // com.autonavi.base.ae.gmap.listener.AMapWidgetListener
            public final void invalidateCompassView() {
                if (fk.this.g == null) {
                    return;
                }
                fk.this.g.post(new Runnable() { // from class: com.amap.api.mapcore.util.fk.1.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        fk.this.g.b();
                    }
                });
            }

            @Override // com.autonavi.base.ae.gmap.listener.AMapWidgetListener
            public final void invalidateScaleView() {
                if (fk.this.h == null) {
                    return;
                }
                fk.this.h.post(new Runnable() { // from class: com.amap.api.mapcore.util.fk.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        fk.this.h.b();
                    }
                });
            }

            @Override // com.autonavi.base.ae.gmap.listener.AMapWidgetListener
            public final void invalidateZoomController(final float f) {
                if (fk.this.k == null) {
                    return;
                }
                fk.this.k.post(new Runnable() { // from class: com.amap.api.mapcore.util.fk.1.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        fk.this.k.a(f);
                    }
                });
            }

            @Override // com.autonavi.base.ae.gmap.listener.AMapWidgetListener
            public final void setFrontViewVisibility(boolean z) {
            }
        });
        try {
            if (this.c.getUiSettings().isMyLocationButtonEnabled()) {
                return;
            }
            this.f.setVisibility(8);
        } catch (Throwable th) {
            hn.c(th, "AMapDelegateImpGLSurfaceView", "locationView gone");
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void b(Boolean bool) {
        fo foVar = this.k;
        if (foVar == null) {
            this.a.a(this, bool);
        } else {
            foVar.a(bool.booleanValue());
        }
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void c(Boolean bool) {
        if (this.f == null) {
            this.a.a(this, bool);
        } else if (bool.booleanValue()) {
            this.f.setVisibility(0);
        } else {
            this.f.setVisibility(8);
        }
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void d(Boolean bool) {
        ff ffVar = this.g;
        if (ffVar == null) {
            this.a.a(this, bool);
        } else {
            ffVar.a(bool.booleanValue());
        }
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void e(Boolean bool) {
        fm fmVar = this.h;
        if (fmVar == null) {
            this.a.a(this, bool);
        } else {
            fmVar.a(bool.booleanValue());
        }
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void f(Boolean bool) {
        fn fnVar = this.e;
        if (fnVar == null) {
            this.a.a(this, bool);
        } else {
            fnVar.setVisibility(bool.booleanValue() ? 0 : 8);
        }
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void h(Boolean bool) {
        fh fhVar = this.f;
        if (fhVar == null) {
            this.a.a(this, bool);
        } else {
            fhVar.a(bool.booleanValue());
        }
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void i() {
        Context context;
        if (!this.r || (context = this.d) == null) {
            return;
        }
        a(context);
        fl flVar = this.a;
        if (flVar != null) {
            flVar.a();
        }
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void b(Integer num) {
        fn fnVar = this.e;
        if (fnVar == null) {
            this.a.a(this, num);
        } else if (fnVar != null) {
            fnVar.a(num.intValue());
            this.e.postInvalidate();
            k();
        }
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void d(Integer num) {
        fn fnVar = this.e;
        if (fnVar == null) {
            this.a.a(this, num);
        } else if (fnVar != null) {
            fnVar.c(num.intValue());
            k();
        }
    }

    @Override // com.amap.api.mapcore.util.fj
    public final fg e() {
        return this.j;
    }

    @Override // com.amap.api.mapcore.util.fj
    public final fn f() {
        return this.e;
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void c(Integer num) {
        fn fnVar = this.e;
        if (fnVar == null) {
            this.a.a(this, num);
        } else if (fnVar != null) {
            fnVar.b(num.intValue());
            k();
        }
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void g() {
        hideInfoWindow();
        er.a(this.n);
        fo foVar = this.k;
        if (foVar != null) {
            foVar.a();
        }
        fm fmVar = this.h;
        if (fmVar != null) {
            fmVar.a();
        }
        fn fnVar = this.e;
        if (fnVar != null) {
            fnVar.a();
        }
        fh fhVar = this.f;
        if (fhVar != null) {
            fhVar.a();
        }
        ff ffVar = this.g;
        if (ffVar != null) {
            ffVar.a();
        }
        fg fgVar = this.j;
        if (fgVar != null) {
            fgVar.a();
        }
        removeAllViews();
        this.p = null;
    }

    @Override // com.amap.api.mapcore.util.fj
    public final fe d() {
        return this.i;
    }

    @Override // com.amap.api.mapcore.util.fj
    public final boolean b() {
        fn fnVar = this.e;
        if (fnVar != null) {
            return fnVar.d();
        }
        return false;
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void c() {
        fn fnVar = this.e;
        if (fnVar == null) {
            this.a.a(this, new Object[0]);
        } else if (fnVar != null) {
            fnVar.c();
        }
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void a(Boolean bool) {
        fg fgVar = this.j;
        if (fgVar == null) {
            this.a.a(this, bool);
        } else if (fgVar != null && bool.booleanValue() && this.c.canShowIndoorSwitch()) {
            this.j.a(true);
        }
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void a(String str, Boolean bool, Integer num) {
        if (this.e == null) {
            this.a.a(this, str, bool, num);
            return;
        }
        if (num.intValue() == 2) {
            this.e.b(bool.booleanValue());
        } else {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.e.a(str, num.intValue());
            this.e.d(bool.booleanValue());
        }
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void a(Float f) {
        fo foVar = this.k;
        if (foVar == null) {
            this.a.a(this, f);
        } else if (foVar != null) {
            foVar.a(f.floatValue());
        }
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void a(Integer num) {
        fo foVar = this.k;
        if (foVar == null) {
            this.a.a(this, num);
        } else if (foVar != null) {
            foVar.a(num.intValue());
        }
    }

    @Override // com.amap.api.mapcore.util.fj
    public final float a(int i) {
        if (this.e == null) {
            return 0.0f;
        }
        k();
        return this.e.d(i);
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void a(Integer num, Float f) {
        fn fnVar = this.e;
        if (fnVar != null) {
            this.a.a(this, num, f);
        } else if (fnVar != null) {
            fnVar.a(num.intValue(), f.floatValue());
            k();
        }
    }

    @Override // com.amap.api.mapcore.util.fj
    public final Point a() {
        fn fnVar = this.e;
        if (fnVar == null) {
            return null;
        }
        return fnVar.b();
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void a(CameraPosition cameraPosition) {
        if (this.e == null) {
            this.a.a(this, cameraPosition);
            return;
        }
        if (this.c.getUiSettings().isLogoEnable()) {
            if (MapsInitializer.isLoadWorldGridMap() && cameraPosition.zoom >= 6.0f) {
                LatLng latLng = cameraPosition.target;
                if (!ek.a(latLng.latitude, latLng.longitude)) {
                    this.e.setVisibility(8);
                    return;
                }
            }
            if (this.c.getMaskLayerType() == -1) {
                this.e.setVisibility(0);
            }
        }
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void a(boolean z) {
        fn fnVar = this.e;
        if (fnVar != null) {
            fnVar.c(z);
        }
        this.s = z;
    }

    private View a(BaseOverlayImp baseOverlayImp) throws RemoteException {
        View viewA;
        View viewA2;
        View view = null;
        if (baseOverlayImp instanceof cs) {
            Marker marker = new Marker((cs) baseOverlayImp);
            try {
                if (this.n == null) {
                    this.n = eg.a(this.d, "infowindow_bg.9.png");
                }
            } catch (Throwable th) {
                hn.c(th, "MapOverlayViewGroup", "showInfoWindow decodeDrawableFromAsset");
                th.printStackTrace();
            }
            try {
                if (this.q) {
                    viewA2 = this.b.a((BasePointOverlay) marker);
                    if (viewA2 == null) {
                        try {
                            viewA2 = this.b.b((BasePointOverlay) marker);
                        } catch (Throwable th2) {
                            th = th2;
                            view = viewA2;
                            hn.c(th, "MapOverlayViewGroup", "getInfoWindow or getInfoContents");
                            th.printStackTrace();
                        }
                    }
                    this.p = viewA2;
                    this.q = false;
                } else {
                    viewA2 = this.p;
                }
                if (viewA2 == null) {
                    if (!this.b.a()) {
                        return null;
                    }
                    viewA2 = this.b.a((BasePointOverlay) marker);
                }
                view = viewA2;
                if (view != null && view.getBackground() == null) {
                    view.setBackground(this.n);
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            try {
                if (this.n == null) {
                    this.n = eg.a(this.d, "infowindow_bg.9.png");
                }
            } catch (Throwable th4) {
                hn.c(th4, "MapOverlayViewGroup", "showInfoWindow decodeDrawableFromAsset");
                th4.printStackTrace();
            }
            try {
                GL3DModel gL3DModel = new GL3DModel((cp) baseOverlayImp);
                if (this.q) {
                    viewA = this.b.a((BasePointOverlay) gL3DModel);
                    if (viewA == null) {
                        try {
                            viewA = this.b.b(gL3DModel);
                        } catch (Throwable th5) {
                            th = th5;
                            view = viewA;
                            hn.c(th, "MapOverlayViewGroup", "getInfoWindow or getInfoContents");
                            th.printStackTrace();
                            return view;
                        }
                    }
                    this.p = viewA;
                    this.q = false;
                } else {
                    viewA = this.p;
                }
                if (viewA == null) {
                    if (!this.b.a()) {
                        return null;
                    }
                    viewA = this.b.a((BasePointOverlay) gL3DModel);
                }
                view = viewA;
                if (view.getBackground() == null) {
                    view.setBackground(this.n);
                }
                return view;
            } catch (Throwable th6) {
                th = th6;
            }
        }
        return view;
    }

    private void a(View view, int i, int i2, int[] iArr) {
        View view2;
        if ((view instanceof ListView) && (view2 = (View) view.getParent()) != null) {
            iArr[0] = view2.getWidth();
            iArr[1] = view2.getHeight();
        }
        if (i <= 0 || i2 <= 0) {
            view.measure(0, 0);
        }
        if (i == -2) {
            iArr[0] = view.getMeasuredWidth();
        } else if (i == -1) {
            iArr[0] = getMeasuredWidth();
        } else {
            iArr[0] = i;
        }
        if (i2 == -2) {
            iArr[1] = view.getMeasuredHeight();
        } else if (i2 == -1) {
            iArr[1] = getMeasuredHeight();
        } else {
            iArr[1] = i2;
        }
    }

    private void a(View view, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7 = i5 & 7;
        int i8 = i5 & 112;
        if (i7 == 5) {
            i3 -= i;
        } else if (i7 == 1) {
            i3 -= i / 2;
        }
        if (i8 == 80) {
            i4 -= i2;
        } else {
            if (i8 == 17) {
                i6 = i2 / 2;
            } else if (i8 == 16) {
                i4 /= 2;
                i6 = i2 / 2;
            }
            i4 -= i6;
        }
        view.layout(i3, i4, i3 + i, i4 + i2);
        if (view instanceof IGLSurfaceView) {
            this.c.changeSize(i, i2);
        }
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void a(Canvas canvas) {
        Bitmap drawingCache;
        View view = this.l;
        if (view == null || this.m == null || (drawingCache = view.getDrawingCache(true)) == null) {
            return;
        }
        canvas.drawBitmap(drawingCache, this.l.getLeft(), this.l.getTop(), new Paint());
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void a(fg.a aVar) {
        fg fgVar = this.j;
        if (fgVar == null) {
            this.a.a(this, aVar);
        } else {
            fgVar.a(aVar);
        }
    }
}
