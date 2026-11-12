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
import com.amap.api.maps.interfaces.IGlOverlayLayer;
import com.amap.api.maps.model.BasePointOverlay;
import com.amap.api.maps.model.CameraPosition;
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
public final class fi extends ViewGroup implements fj {
    public fl a;
    public ap b;
    private IAMapDelegate c;
    private IGlOverlayLayer d;
    private Context e;
    private fn f;
    private fh g;
    private ff h;
    private fm i;
    private fe j;
    private fg k;
    private fo l;
    private View m;
    private BasePointOverlay n;
    private Drawable o;
    private boolean p;
    private View q;
    private boolean r;
    private boolean s;
    private boolean t;

    public static class a extends ViewGroup.LayoutParams {
        public FPoint a;
        public boolean b;
        public int c;
        public int d;
        public int e;

        public a(FPoint fPoint, int i) {
            this(-2, -2, ((PointF) fPoint).x, ((PointF) fPoint).y, 0, 0, i);
        }

        public a(int i, int i2, float f, float f2, int i3, int i4, int i5) {
            super(i, i2);
            FPoint fPoint = new FPoint();
            this.a = fPoint;
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = 51;
            ((PointF) fPoint).x = f;
            ((PointF) fPoint).y = f2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
        }
    }

    public fi(Context context, IAMapDelegate iAMapDelegate, IGlOverlayLayer iGlOverlayLayer) {
        super(context);
        this.o = null;
        int i = 1;
        this.p = true;
        this.s = true;
        this.t = true;
        try {
            this.d = iGlOverlayLayer;
            this.c = iAMapDelegate;
            this.e = context;
            this.a = new fl();
            this.j = new fe(context);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (this.c.getGLMapView() != null) {
                addView(this.c.getGLMapView(), 0, layoutParams);
            } else {
                i = 0;
            }
            addView(this.j, i, layoutParams);
            if (this.s) {
                return;
            }
            a(context);
        } catch (Throwable th) {
            th.printStackTrace();
            er.a(th);
        }
    }

    public static /* synthetic */ View f(fi fiVar) {
        fiVar.m = null;
        return null;
    }

    private void k() {
        fm fmVar = this.i;
        if (fmVar == null) {
            this.a.a(this, new Object[0]);
        } else {
            if (fmVar == null || fmVar.getVisibility() != 0) {
                return;
            }
            this.i.postInvalidate();
        }
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void g(Boolean bool) {
        fn fnVar = this.f;
        if (fnVar == null) {
            this.a.a(this, bool);
            return;
        }
        if (fnVar != null && bool.booleanValue()) {
            this.f.a(true);
            return;
        }
        fn fnVar2 = this.f;
        if (fnVar2 != null) {
            fnVar2.a(false);
        }
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void h() {
        ff ffVar = this.h;
        if (ffVar == null) {
            this.a.a(this, new Object[0]);
        } else {
            ffVar.b();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final void hideInfoWindow() {
        try {
            IAMapDelegate iAMapDelegate = this.c;
            if (iAMapDelegate == null || iAMapDelegate.getMainHandler() == null) {
                return;
            }
            this.c.getMainHandler().post(new Runnable() { // from class: com.amap.api.mapcore.util.fi.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (fi.this.m != null) {
                        fi.this.m.clearFocus();
                        fi fiVar = fi.this;
                        fiVar.removeView(fiVar.m);
                        er.a(fi.this.m.getBackground());
                        er.a(fi.this.o);
                        fi.f(fi.this);
                    }
                }
            });
            BasePointOverlay basePointOverlay = this.n;
            if (basePointOverlay != null) {
                this.d.getNativeProperties(basePointOverlay.getId(), "setInfoWindowShown", new Object[]{Boolean.FALSE});
            }
            this.n = null;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void i(Boolean bool) {
        fg fgVar = this.k;
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
        if (this.f == null) {
            this.a.a(this, bool);
        } else {
            bool.booleanValue();
            this.f.setVisibility(4);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final boolean onInfoWindowTap(MotionEvent motionEvent) {
        return (this.m == null || this.n == null || !er.a(new Rect(this.m.getLeft(), this.m.getTop(), this.m.getRight(), this.m.getBottom()), (int) motionEvent.getX(), (int) motionEvent.getY())) ? false : true;
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
                                FPoint fPoint = aVar.a;
                                ((Point) iPointObtain).x = (int) ((PointF) fPoint).x;
                                ((Point) iPointObtain).y = (int) ((PointF) fPoint).y;
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
            fn fnVar = this.f;
            if (fnVar != null) {
                fnVar.c();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0080 A[Catch: all -> 0x00f6, TryCatch #0 {all -> 0x00f6, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x0012, B:9:0x0017, B:11:0x003a, B:13:0x003e, B:15:0x0044, B:17:0x0048, B:20:0x0064, B:26:0x0099, B:28:0x009d, B:30:0x00a5, B:31:0x00b3, B:33:0x00c4, B:34:0x00d5, B:36:0x00dd, B:37:0x00e2, B:21:0x006c, B:23:0x0080, B:25:0x0086, B:39:0x00e6, B:41:0x00ea, B:43:0x00f0), top: B:48:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0085  */
    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final void redrawInfoWindow() {
        ViewGroup.LayoutParams layoutParams;
        int i;
        int i2;
        try {
            BasePointOverlay basePointOverlay = this.n;
            if (basePointOverlay == null || !this.d.checkInBounds(basePointOverlay.getId())) {
                View view = this.m;
                if (view == null || view.getVisibility() != 0) {
                    return;
                }
                this.m.setVisibility(8);
                return;
            }
            if (this.p) {
                FPoint fPointObtain = FPoint.obtain();
                this.d.getMarkerInfoWindowOffset(this.n.getId(), fPointObtain);
                int i3 = (int) ((PointF) fPointObtain).x;
                int i4 = (int) (((PointF) fPointObtain).y + 2.0f);
                fPointObtain.recycle();
                View viewA = a(this.n);
                if (viewA == null) {
                    View view2 = this.m;
                    if (view2 == null || view2.getVisibility() != 0) {
                        return;
                    }
                    hideInfoWindow();
                    return;
                }
                FPoint fPointObtain2 = FPoint.obtain();
                this.d.getOverlayScreenPos(this.n.getId(), fPointObtain2);
                int i5 = (int) ((PointF) fPointObtain2).x;
                int i6 = (int) ((PointF) fPointObtain2).y;
                View view3 = this.m;
                if (view3 == null) {
                    this.m = viewA;
                    layoutParams = viewA.getLayoutParams();
                    this.m.setDrawingCacheEnabled(true);
                    this.m.setDrawingCacheQuality(0);
                    i = -2;
                    if (layoutParams != null) {
                        i = layoutParams.width;
                        i2 = layoutParams.height;
                    } else {
                        i2 = -2;
                    }
                    addView(this.m, new a(i, i2, i5, i6, i3, i4, 81));
                } else if (viewA != view3) {
                    view3.clearFocus();
                    removeView(this.m);
                    this.m = viewA;
                    layoutParams = viewA.getLayoutParams();
                    this.m.setDrawingCacheEnabled(true);
                    this.m.setDrawingCacheQuality(0);
                    i = -2;
                    if (layoutParams != null) {
                        i = layoutParams.width;
                        i2 = layoutParams.height;
                    } else {
                        i2 = -2;
                    }
                    addView(this.m, new a(i, i2, i5, i6, i3, i4, 81));
                }
                View view4 = this.m;
                if (view4 != null) {
                    a aVar = (a) view4.getLayoutParams();
                    if (aVar != null) {
                        aVar.a = FPoint.obtain(((PointF) fPointObtain2).x, ((PointF) fPointObtain2).y);
                        aVar.c = i3;
                        aVar.d = i4;
                    }
                    onLayout(false, 0, 0, 0, 0);
                    if (this.b.a()) {
                        this.b.a(this.n.getTitle(), this.n.getSnippet());
                    }
                    if (this.m.getVisibility() == 8) {
                        this.m.setVisibility(0);
                    }
                }
                fPointObtain2.recycle();
            }
        } catch (Throwable th) {
            hn.c(th, "MapOverlayViewGroup", "redrawInfoWindow");
            er.a(th);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final void setInfoWindowAdapterManager(ap apVar) {
        this.b = apVar;
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final void showInfoWindow(BasePointOverlay basePointOverlay) {
        if (basePointOverlay == null) {
            return;
        }
        try {
            ap apVar = this.b;
            if (!(apVar != null && apVar.a() && basePointOverlay.getTitle() == null && basePointOverlay.getSnippet() == null) && basePointOverlay.isInfoWindowEnable()) {
                BasePointOverlay basePointOverlay2 = this.n;
                if (basePointOverlay2 != null && !basePointOverlay2.getId().equals(basePointOverlay.getId())) {
                    hideInfoWindow();
                }
                if (this.b != null) {
                    this.n = basePointOverlay;
                    this.r = true;
                    this.d.getNativeProperties(basePointOverlay.getId(), "setInfoWindowShown", new Object[]{Boolean.TRUE});
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void a(Context context) {
        fn fnVar = new fn(context);
        this.f = fnVar;
        fnVar.c(this.t);
        this.i = new fm(context, this.c);
        this.k = new fg(context);
        this.l = new fo(context, this.c);
        this.g = new fh(context, this.c);
        this.h = new ff(context, this.c);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        addView(this.f, layoutParams);
        addView(this.i, layoutParams);
        addView(this.k, new ViewGroup.LayoutParams(-2, -2));
        addView(this.l, new a(new FPoint(0.0f, 0.0f), 83));
        addView(this.g, new a(FPoint.obtain(0.0f, 0.0f), 83));
        addView(this.h, new a(FPoint.obtain(0.0f, 0.0f), 51));
        this.h.setVisibility(8);
        this.c.setMapWidgetListener(new AMapWidgetListener() { // from class: com.amap.api.mapcore.util.fi.1
            @Override // com.autonavi.base.ae.gmap.listener.AMapWidgetListener
            public final void invalidateCompassView() {
                if (fi.this.h == null) {
                    return;
                }
                fi.this.h.post(new Runnable() { // from class: com.amap.api.mapcore.util.fi.1.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        fi.this.h.b();
                    }
                });
            }

            @Override // com.autonavi.base.ae.gmap.listener.AMapWidgetListener
            public final void invalidateScaleView() {
                if (fi.this.i == null) {
                    return;
                }
                fi.this.i.post(new Runnable() { // from class: com.amap.api.mapcore.util.fi.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        fi.this.i.b();
                    }
                });
            }

            @Override // com.autonavi.base.ae.gmap.listener.AMapWidgetListener
            public final void invalidateZoomController(final float f) {
                if (fi.this.l == null) {
                    return;
                }
                fi.this.l.post(new Runnable() { // from class: com.amap.api.mapcore.util.fi.1.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        fi.this.l.a(f);
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
            this.g.setVisibility(8);
        } catch (Throwable th) {
            hn.c(th, "AMapDelegateImpGLSurfaceView", "locationView gone");
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void b(Boolean bool) {
        fo foVar = this.l;
        if (foVar == null) {
            this.a.a(this, bool);
        } else {
            foVar.a(bool.booleanValue());
        }
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void c(Boolean bool) {
        if (this.g == null) {
            this.a.a(this, bool);
        } else if (bool.booleanValue()) {
            this.g.setVisibility(0);
        } else {
            this.g.setVisibility(8);
        }
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void d(Boolean bool) {
        ff ffVar = this.h;
        if (ffVar == null) {
            this.a.a(this, bool);
        } else {
            ffVar.a(bool.booleanValue());
        }
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void e(Boolean bool) {
        fm fmVar = this.i;
        if (fmVar == null) {
            this.a.a(this, bool);
        } else {
            fmVar.a(bool.booleanValue());
        }
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void f(Boolean bool) {
        fn fnVar = this.f;
        if (fnVar == null) {
            this.a.a(this, bool);
        } else {
            fnVar.setVisibility(bool.booleanValue() ? 0 : 8);
        }
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void h(Boolean bool) {
        fh fhVar = this.g;
        if (fhVar == null) {
            this.a.a(this, bool);
        } else {
            fhVar.a(bool.booleanValue());
        }
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void i() {
        Context context;
        if (!this.s || (context = this.e) == null) {
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
        fn fnVar = this.f;
        if (fnVar == null) {
            this.a.a(this, num);
        } else if (fnVar != null) {
            fnVar.a(num.intValue());
            this.f.postInvalidate();
            k();
        }
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void d(Integer num) {
        fn fnVar = this.f;
        if (fnVar == null) {
            this.a.a(this, num);
        } else if (fnVar != null) {
            fnVar.c(num.intValue());
            k();
        }
    }

    @Override // com.amap.api.mapcore.util.fj
    public final fg e() {
        return this.k;
    }

    @Override // com.amap.api.mapcore.util.fj
    public final fn f() {
        return this.f;
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void c(Integer num) {
        fn fnVar = this.f;
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
        er.a(this.o);
        fo foVar = this.l;
        if (foVar != null) {
            foVar.a();
        }
        fm fmVar = this.i;
        if (fmVar != null) {
            fmVar.a();
        }
        fn fnVar = this.f;
        if (fnVar != null) {
            fnVar.a();
        }
        fh fhVar = this.g;
        if (fhVar != null) {
            fhVar.a();
        }
        ff ffVar = this.h;
        if (ffVar != null) {
            ffVar.a();
        }
        fg fgVar = this.k;
        if (fgVar != null) {
            fgVar.a();
        }
        removeAllViews();
        this.q = null;
    }

    @Override // com.amap.api.mapcore.util.fj
    public final fe d() {
        return this.j;
    }

    @Override // com.amap.api.mapcore.util.fj
    public final boolean b() {
        fn fnVar = this.f;
        if (fnVar != null) {
            return fnVar.d();
        }
        return false;
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final void showInfoWindow(BaseOverlayImp baseOverlayImp) {
        if (baseOverlayImp == null) {
            return;
        }
        try {
            ap apVar = this.b;
            if (!(apVar != null && apVar.a() && baseOverlayImp.getTitle() == null && baseOverlayImp.getSnippet() == null) && baseOverlayImp.isInfoWindowEnable()) {
                BasePointOverlay basePointOverlay = this.n;
                if (basePointOverlay != null && !basePointOverlay.getId().equals(baseOverlayImp.getId())) {
                    hideInfoWindow();
                }
                if (this.b != null) {
                    baseOverlayImp.setInfoWindowShown(true);
                    this.r = true;
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void c() {
        fn fnVar = this.f;
        if (fnVar == null) {
            this.a.a(this, new Object[0]);
        } else if (fnVar != null) {
            fnVar.c();
        }
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void a(Boolean bool) {
        fg fgVar = this.k;
        if (fgVar == null) {
            this.a.a(this, bool);
        } else if (fgVar != null && bool.booleanValue() && this.c.canShowIndoorSwitch()) {
            this.k.a(true);
        }
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void a(String str, Boolean bool, Integer num) {
        if (this.f == null) {
            this.a.a(this, str, bool, num);
            return;
        }
        if (num.intValue() == 2) {
            this.f.b(bool.booleanValue());
        } else {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f.a(str, num.intValue());
            this.f.d(bool.booleanValue());
        }
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void a(Float f) {
        fo foVar = this.l;
        if (foVar == null) {
            this.a.a(this, f);
        } else if (foVar != null) {
            foVar.a(f.floatValue());
        }
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void a(Integer num) {
        fo foVar = this.l;
        if (foVar == null) {
            this.a.a(this, num);
        } else if (foVar != null) {
            foVar.a(num.intValue());
        }
    }

    @Override // com.amap.api.mapcore.util.fj
    public final float a(int i) {
        if (this.f == null) {
            return 0.0f;
        }
        k();
        return this.f.d(i);
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void a(Integer num, Float f) {
        fn fnVar = this.f;
        if (fnVar != null) {
            this.a.a(this, num, f);
        } else if (fnVar != null) {
            fnVar.a(num.intValue(), f.floatValue());
            k();
        }
    }

    @Override // com.amap.api.mapcore.util.fj
    public final Point a() {
        fn fnVar = this.f;
        if (fnVar == null) {
            return null;
        }
        return fnVar.b();
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void a(CameraPosition cameraPosition) {
        if (this.f == null) {
            this.a.a(this, cameraPosition);
            return;
        }
        if (this.c.getUiSettings().isLogoEnable()) {
            if (MapsInitializer.isLoadWorldGridMap() && cameraPosition.zoom >= 6.0f) {
                LatLng latLng = cameraPosition.target;
                if (!ek.a(latLng.latitude, latLng.longitude)) {
                    this.f.setVisibility(8);
                    return;
                }
            }
            if (this.c.getMaskLayerType() == -1) {
                this.f.setVisibility(0);
            }
        }
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void a(boolean z) {
        fn fnVar = this.f;
        if (fnVar != null) {
            fnVar.c(z);
        }
        this.t = z;
    }

    private View a(BasePointOverlay basePointOverlay) throws RemoteException {
        View viewA;
        View viewA2;
        View viewA3 = null;
        if (basePointOverlay instanceof Marker) {
            try {
                if (this.o == null) {
                    this.o = eg.a(this.e, "infowindow_bg.9.png");
                }
            } catch (Throwable th) {
                hn.c(th, "MapOverlayViewGroup", "showInfoWindow decodeDrawableFromAsset");
                th.printStackTrace();
            }
            try {
                if (this.r) {
                    viewA = this.b.a(basePointOverlay);
                    if (viewA == null) {
                        try {
                            viewA = this.b.b(basePointOverlay);
                        } catch (Throwable th2) {
                            th = th2;
                            viewA3 = viewA;
                            hn.c(th, "MapOverlayViewGroup", "getInfoWindow or getInfoContents");
                            th.printStackTrace();
                        }
                    }
                    this.q = viewA;
                    this.r = false;
                } else {
                    viewA = this.q;
                }
                if (viewA != null) {
                    viewA3 = viewA;
                } else {
                    if (!this.b.a()) {
                        return null;
                    }
                    viewA3 = this.b.a(basePointOverlay);
                }
                if (viewA3 != null && viewA3.getBackground() == null) {
                    viewA3.setBackground(this.o);
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            try {
                if (this.o == null) {
                    this.o = eg.a(this.e, "infowindow_bg.9.png");
                }
            } catch (Throwable th4) {
                hn.c(th4, "MapOverlayViewGroup", "showInfoWindow decodeDrawableFromAsset");
                th4.printStackTrace();
            }
            try {
                if (this.r) {
                    viewA2 = this.b.a(basePointOverlay);
                    if (viewA2 == null) {
                        try {
                            viewA2 = this.b.b(basePointOverlay);
                        } catch (Throwable th5) {
                            th = th5;
                            viewA3 = viewA2;
                            hn.c(th, "MapOverlayViewGroup", "getInfoWindow or getInfoContents");
                            th.printStackTrace();
                            return viewA3;
                        }
                    }
                    this.q = viewA2;
                    this.r = false;
                } else {
                    viewA2 = this.q;
                }
                if (viewA2 != null) {
                    viewA3 = viewA2;
                } else {
                    if (!this.b.a()) {
                        return null;
                    }
                    viewA3 = this.b.a(basePointOverlay);
                }
                if (viewA3.getBackground() == null) {
                    viewA3.setBackground(this.o);
                }
                return viewA3;
            } catch (Throwable th6) {
                th = th6;
            }
        }
        return viewA3;
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
        View view = this.m;
        if (view == null || this.n == null || (drawingCache = view.getDrawingCache(true)) == null) {
            return;
        }
        canvas.drawBitmap(drawingCache, this.m.getLeft(), this.m.getTop(), new Paint());
    }

    @Override // com.amap.api.mapcore.util.fj
    public final void a(fg.a aVar) {
        fg fgVar = this.k;
        if (fgVar == null) {
            this.a.a(this, aVar);
        } else {
            fgVar.a(aVar);
        }
    }
}
