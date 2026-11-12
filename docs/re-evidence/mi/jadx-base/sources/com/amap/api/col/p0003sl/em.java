package com.amap.api.col.p0003sl;

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
import com.amap.api.maps.interfaces.INativeOverlayLayer;
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
import defpackage.kls;
import defpackage.kps;
import defpackage.m2t;
import defpackage.u8s;
import defpackage.wls;
import defpackage.zns;

/* JADX INFO: loaded from: classes4.dex */
public final class em extends ViewGroup implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IAMapDelegate f6034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IGlOverlayLayer f6035b;
    public INativeOverlayLayer c;
    public Context d;
    public eq e;
    public el f;
    public ej g;
    public ep h;
    public ei i;
    public ek j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public t f6036k;
    public View l;
    public BasePointOverlay m;
    public Drawable n;
    public boolean o;
    public View p;
    public boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public kps f6037r;
    public boolean s;
    public boolean t;
    public u8s u;

    public class a implements AMapWidgetListener {

        /* JADX INFO: renamed from: com.amap.api.col.3sl.em$a$a, reason: collision with other inner class name */
        public class RunnableC0126a implements Runnable {
            public RunnableC0126a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                em.this.h.e();
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                em.this.g.c();
            }
        }

        public class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ float f6041a;

            public c(float f) {
                this.f6041a = f;
            }

            @Override // java.lang.Runnable
            public final void run() {
                em.this.f6036k.c(this.f6041a);
            }
        }

        public a() {
        }

        @Override // com.autonavi.base.ae.gmap.listener.AMapWidgetListener
        public final void invalidateCompassView() {
            if (em.this.g == null) {
                return;
            }
            em.this.g.post(new b());
        }

        @Override // com.autonavi.base.ae.gmap.listener.AMapWidgetListener
        public final void invalidateScaleView() {
            if (em.this.h == null) {
                return;
            }
            em.this.h.post(new RunnableC0126a());
        }

        @Override // com.autonavi.base.ae.gmap.listener.AMapWidgetListener
        public final void invalidateZoomController(float f) {
            if (em.this.f6036k == null) {
                return;
            }
            em.this.f6036k.post(new c(f));
        }

        @Override // com.autonavi.base.ae.gmap.listener.AMapWidgetListener
        public final void setFrontViewVisibility(boolean z) {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (em.this.l != null) {
                em.this.l.clearFocus();
                em emVar = em.this;
                emVar.removeView(emVar.l);
                zns.D(em.this.l.getBackground());
                zns.D(em.this.n);
                em.E(em.this);
            }
        }
    }

    public static class c extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public FPoint f6044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f6045b;
        public int c;
        public int d;
        public int e;

        public c(FPoint fPoint, int i) {
            this(-2, -2, ((PointF) fPoint).x, ((PointF) fPoint).y, 0, 0, i);
        }

        public c(int i, int i2, float f, float f2, int i3, int i4, int i5) {
            super(i, i2);
            FPoint fPoint = new FPoint();
            this.f6044a = fPoint;
            this.f6045b = false;
            ((PointF) fPoint).x = f;
            ((PointF) fPoint).y = f2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
        }
    }

    public em(Context context, IAMapDelegate iAMapDelegate, IGlOverlayLayer iGlOverlayLayer, INativeOverlayLayer iNativeOverlayLayer) {
        super(context);
        this.n = null;
        int i = 1;
        this.o = true;
        this.s = true;
        this.t = true;
        try {
            this.f6035b = iGlOverlayLayer;
            this.c = iNativeOverlayLayer;
            this.f6034a = iAMapDelegate;
            this.d = context;
            this.f6037r = new kps();
            this.i = new ei(context);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (this.f6034a.getGLMapView() != null) {
                addView(this.f6034a.getGLMapView(), 0, layoutParams);
            } else {
                i = 0;
            }
            addView(this.i, i, layoutParams);
            addView((ae) this.c, layoutParams);
            if (this.s) {
                return;
            }
            u(context);
        } catch (Throwable th) {
            th.printStackTrace();
            zns.E(th);
        }
    }

    public static /* synthetic */ View E(em emVar) {
        emVar.l = null;
        return null;
    }

    public final void F() {
        ep epVar = this.h;
        if (epVar == null) {
            this.f6037r.b(this, new Object[0]);
        } else {
            if (epVar == null || epVar.getVisibility() != 0) {
                return;
            }
            this.h.postInvalidate();
        }
    }

    public final void G() {
        t tVar = this.f6036k;
        if (tVar != null) {
            tVar.b();
        }
        ep epVar = this.h;
        if (epVar != null) {
            epVar.a();
        }
        eq eqVar = this.e;
        if (eqVar != null) {
            eqVar.b();
        }
        el elVar = this.f;
        if (elVar != null) {
            elVar.a();
        }
        ej ejVar = this.g;
        if (ejVar != null) {
            ejVar.a();
        }
        ek ekVar = this.j;
        if (ekVar != null) {
            ekVar.e();
        }
    }

    @Override // com.amap.api.col.p0003sl.s
    public final void a(Integer num) {
        t tVar = this.f6036k;
        if (tVar == null) {
            this.f6037r.b(this, num);
        } else if (tVar != null) {
            tVar.d(num.intValue());
        }
    }

    @Override // com.amap.api.col.p0003sl.s
    public final void b(Boolean bool) {
        t tVar = this.f6036k;
        if (tVar == null) {
            this.f6037r.b(this, bool);
        } else {
            tVar.e(bool.booleanValue());
        }
    }

    @Override // com.amap.api.col.p0003sl.s
    public final void c(Boolean bool) {
        ek ekVar = this.j;
        if (ekVar == null) {
            this.f6037r.b(this, bool);
        } else if (ekVar != null && bool.booleanValue() && this.f6034a.canShowIndoorSwitch()) {
            this.j.j(true);
        }
    }

    @Override // com.amap.api.col.p0003sl.s
    public final void d(Integer num) {
        eq eqVar = this.e;
        if (eqVar == null) {
            this.f6037r.b(this, num);
        } else if (eqVar != null) {
            eqVar.i(num.intValue());
            F();
        }
    }

    @Override // com.amap.api.col.p0003sl.s
    public final void e(Boolean bool) {
        ej ejVar = this.g;
        if (ejVar == null) {
            this.f6037r.b(this, bool);
        } else {
            ejVar.b(bool.booleanValue());
        }
    }

    @Override // com.amap.api.col.p0003sl.s
    public final void f(Integer num) {
        eq eqVar = this.e;
        if (eqVar == null) {
            this.f6037r.b(this, num);
        } else if (eqVar != null) {
            eqVar.m(num.intValue());
            F();
        }
    }

    @Override // com.amap.api.col.p0003sl.s
    public final void g(Boolean bool) {
        if (this.f == null) {
            this.f6037r.b(this, bool);
        } else if (bool.booleanValue()) {
            this.f.setVisibility(0);
        } else {
            this.f.setVisibility(8);
        }
    }

    @Override // com.amap.api.col.p0003sl.s
    public final void h(Boolean bool) {
        eq eqVar = this.e;
        if (eqVar == null) {
            this.f6037r.b(this, bool);
        } else {
            eqVar.setVisibility(bool.booleanValue() ? 0 : 8);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final void hideInfoWindow() {
        try {
            IAMapDelegate iAMapDelegate = this.f6034a;
            if (iAMapDelegate == null || iAMapDelegate.getMainHandler() == null) {
                return;
            }
            this.f6034a.getMainHandler().post(new b());
            BasePointOverlay basePointOverlay = this.m;
            if (basePointOverlay != null) {
                this.f6035b.getNativeProperties(basePointOverlay.getId(), "setInfoWindowShown", new Object[]{Boolean.FALSE});
            }
            this.m = null;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.col.p0003sl.s
    public final void i(Integer num) {
        eq eqVar = this.e;
        if (eqVar == null) {
            this.f6037r.b(this, num);
        } else if (eqVar != null) {
            eqVar.c(num.intValue());
            this.e.postInvalidate();
            F();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final boolean isInfoWindowShown() {
        return false;
    }

    @Override // com.amap.api.col.p0003sl.s
    public final View j() {
        return this;
    }

    @Override // com.amap.api.col.p0003sl.s
    public final void k(Canvas canvas) {
        Bitmap drawingCache;
        View view = this.l;
        if (view == null || this.m == null || (drawingCache = view.getDrawingCache(true)) == null) {
            return;
        }
        canvas.drawBitmap(drawingCache, this.l.getLeft(), this.l.getTop(), new Paint());
    }

    @Override // com.amap.api.col.p0003sl.s
    public final void l(Boolean bool) {
        ek ekVar = this.j;
        if (ekVar == null) {
            this.f6037r.b(this, bool);
        } else {
            ekVar.j(bool.booleanValue());
        }
    }

    @Override // com.amap.api.col.p0003sl.s
    public final void m(Boolean bool) {
        eq eqVar = this.e;
        if (eqVar == null) {
            this.f6037r.b(this, bool);
            return;
        }
        if (eqVar != null && bool.booleanValue()) {
            this.e.f(true);
            return;
        }
        eq eqVar2 = this.e;
        if (eqVar2 != null) {
            eqVar2.f(false);
        }
    }

    @Override // com.amap.api.col.p0003sl.s
    public final void n(Boolean bool) {
        el elVar = this.f;
        if (elVar == null) {
            this.f6037r.b(this, bool);
        } else {
            elVar.b(bool.booleanValue());
        }
    }

    @Override // com.amap.api.col.p0003sl.s
    public final void o(String str, Boolean bool, Integer num) {
        if (this.e == null) {
            this.f6037r.b(this, str, bool, num);
            return;
        }
        if (num.intValue() == 2) {
            this.e.j(bool.booleanValue());
        } else {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.e.e(str, num.intValue());
            this.e.p(bool.booleanValue());
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final boolean onInfoWindowTap(MotionEvent motionEvent) {
        return (this.l == null || this.m == null || !zns.K(new Rect(this.l.getLeft(), this.l.getTop(), this.l.getRight(), this.l.getBottom()), (int) motionEvent.getX(), (int) motionEvent.getY())) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        try {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt != null) {
                    if (childAt.getLayoutParams() instanceof c) {
                        z(childAt, (c) childAt.getLayoutParams());
                    } else {
                        y(childAt, childAt.getLayoutParams());
                    }
                }
            }
            eq eqVar = this.e;
            if (eqVar != null) {
                eqVar.l();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.col.p0003sl.s
    public final void p(ek.d dVar) {
        ek ekVar = this.j;
        if (ekVar == null) {
            this.f6037r.b(this, dVar);
        } else {
            ekVar.h(dVar);
        }
    }

    @Override // com.amap.api.col.p0003sl.s
    public final void q(Float f) {
        t tVar = this.f6036k;
        if (tVar == null) {
            this.f6037r.b(this, f);
        } else if (tVar != null) {
            tVar.c(f.floatValue());
        }
    }

    @Override // com.amap.api.col.p0003sl.s
    public final void r(CameraPosition cameraPosition) {
        if (this.e == null) {
            this.f6037r.b(this, cameraPosition);
            return;
        }
        if (this.f6034a.getUiSettings().isLogoEnable()) {
            if (MapsInitializer.isLoadWorldGridMap() && cameraPosition.zoom >= 6.0f) {
                LatLng latLng = cameraPosition.target;
                if (!wls.a(latLng.latitude, latLng.longitude)) {
                    this.e.setVisibility(8);
                    return;
                }
            }
            if (this.f6034a.getMaskLayerType() == -1) {
                this.e.setVisibility(0);
            }
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final void redrawInfoWindow() {
        boolean zCheckInBounds;
        try {
            BasePointOverlay basePointOverlay = this.m;
            if (basePointOverlay instanceof Marker) {
                zCheckInBounds = ((Marker) basePointOverlay).isIconView() ? this.c.checkInBounds(this.m.getId()) : this.f6035b.checkInBounds(this.m.getId());
            } else {
                zCheckInBounds = this.f6035b.checkInBounds(basePointOverlay.getId());
            }
            if (this.m == null || !zCheckInBounds) {
                View view = this.l;
                if (view == null || view.getVisibility() != 0) {
                    return;
                }
                this.l.setVisibility(8);
                return;
            }
            if (this.o) {
                FPoint fPointObtain = FPoint.obtain();
                BasePointOverlay basePointOverlay2 = this.m;
                if (!(basePointOverlay2 instanceof Marker)) {
                    this.f6035b.getMarkerInfoWindowOffset(basePointOverlay2.getId(), fPointObtain);
                } else if (((Marker) basePointOverlay2).isIconView()) {
                    this.c.getMarkerInfoWindowOffset(this.m.getId(), fPointObtain);
                } else {
                    this.f6035b.getMarkerInfoWindowOffset(this.m.getId(), fPointObtain);
                }
                int i = (int) ((PointF) fPointObtain).x;
                int i2 = (int) (((PointF) fPointObtain).y + 2.0f);
                fPointObtain.recycle();
                View viewS = s(this.m);
                if (viewS == null) {
                    View view2 = this.l;
                    if (view2 == null || view2.getVisibility() != 0) {
                        return;
                    }
                    hideInfoWindow();
                    return;
                }
                FPoint fPointObtain2 = FPoint.obtain();
                BasePointOverlay basePointOverlay3 = this.m;
                if (!(basePointOverlay3 instanceof Marker)) {
                    this.f6035b.getOverlayScreenPos(basePointOverlay3.getId(), fPointObtain2);
                } else if (((Marker) basePointOverlay3).isIconView()) {
                    this.c.getOverlayScreenPos(this.m.getId(), fPointObtain2);
                } else {
                    this.f6035b.getOverlayScreenPos(this.m.getId(), fPointObtain2);
                }
                v(viewS, (int) ((PointF) fPointObtain2).x, (int) ((PointF) fPointObtain2).y, i, i2);
                View view3 = this.l;
                if (view3 != null) {
                    c cVar = (c) view3.getLayoutParams();
                    if (cVar != null) {
                        cVar.f6044a = FPoint.obtain(((PointF) fPointObtain2).x, ((PointF) fPointObtain2).y);
                        cVar.c = i;
                        cVar.d = i2;
                    }
                    onLayout(false, 0, 0, 0, 0);
                    if (this.u.n()) {
                        this.u.m(this.m.getTitle(), this.m.getSnippet());
                    }
                    if (this.l.getVisibility() == 8) {
                        this.l.setVisibility(0);
                    }
                }
                fPointObtain2.recycle();
            }
        } catch (Throwable th) {
            m2t.r(th, "MapOverlayViewGroup", "redrawInfoWindow");
            zns.E(th);
        }
    }

    public final View s(BasePointOverlay basePointOverlay) throws RemoteException {
        View viewD;
        View viewD2;
        View viewD3 = null;
        if (basePointOverlay instanceof Marker) {
            try {
                if (this.n == null) {
                    this.n = kls.c(this.d, "infowindow_bg.9.png");
                }
            } catch (Throwable th) {
                m2t.r(th, "MapOverlayViewGroup", "showInfoWindow decodeDrawableFromAsset");
                th.printStackTrace();
            }
            try {
                if (this.q) {
                    viewD = this.u.d(basePointOverlay);
                    if (viewD == null) {
                        try {
                            viewD = this.u.p(basePointOverlay);
                        } catch (Throwable th2) {
                            th = th2;
                            viewD3 = viewD;
                            m2t.r(th, "MapOverlayViewGroup", "getInfoWindow or getInfoContents");
                            th.printStackTrace();
                        }
                    }
                    this.p = viewD;
                    this.q = false;
                } else {
                    viewD = this.p;
                }
                if (viewD != null) {
                    viewD3 = viewD;
                } else {
                    if (!this.u.n()) {
                        return null;
                    }
                    viewD3 = this.u.d(basePointOverlay);
                }
                if (viewD3 != null && viewD3.getBackground() == null) {
                    viewD3.setBackground(this.n);
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            try {
                if (this.n == null) {
                    this.n = kls.c(this.d, "infowindow_bg.9.png");
                }
            } catch (Throwable th4) {
                m2t.r(th4, "MapOverlayViewGroup", "showInfoWindow decodeDrawableFromAsset");
                th4.printStackTrace();
            }
            try {
                if (this.q) {
                    viewD2 = this.u.d(basePointOverlay);
                    if (viewD2 == null) {
                        try {
                            viewD2 = this.u.p(basePointOverlay);
                        } catch (Throwable th5) {
                            th = th5;
                            viewD3 = viewD2;
                            m2t.r(th, "MapOverlayViewGroup", "getInfoWindow or getInfoContents");
                            th.printStackTrace();
                            return viewD3;
                        }
                    }
                    this.p = viewD2;
                    this.q = false;
                } else {
                    viewD2 = this.p;
                }
                if (viewD2 != null) {
                    viewD3 = viewD2;
                } else {
                    if (!this.u.n()) {
                        return null;
                    }
                    viewD3 = this.u.d(basePointOverlay);
                }
                if (viewD3.getBackground() == null) {
                    viewD3.setBackground(this.n);
                }
                return viewD3;
            } catch (Throwable th6) {
                th = th6;
            }
        }
        return viewD3;
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final void setInfoWindowAdapterManager(u8s u8sVar) {
        this.u = u8sVar;
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final void showInfoWindow(BasePointOverlay basePointOverlay) {
        if (basePointOverlay == null) {
            return;
        }
        try {
            u8s u8sVar = this.u;
            if (!(u8sVar != null && u8sVar.n() && basePointOverlay.getTitle() == null && basePointOverlay.getSnippet() == null) && basePointOverlay.isInfoWindowEnable()) {
                BasePointOverlay basePointOverlay2 = this.m;
                if (basePointOverlay2 != null && !basePointOverlay2.getId().equals(basePointOverlay.getId())) {
                    hideInfoWindow();
                }
                if (this.u != null) {
                    this.m = basePointOverlay;
                    this.q = true;
                    this.f6035b.getNativeProperties(basePointOverlay.getId(), "setInfoWindowShown", new Object[]{Boolean.TRUE});
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void u(Context context) {
        eq eqVar = new eq(context);
        this.e = eqVar;
        eqVar.n(this.t);
        this.h = new ep(context, this.f6034a);
        this.j = new ek(context);
        this.f6036k = new t(context, this.f6034a);
        this.f = new el(context, this.f6034a);
        this.g = new ej(context, this.f6034a);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        addView(this.e, layoutParams);
        addView(this.h, layoutParams);
        addView(this.j, new ViewGroup.LayoutParams(-2, -2));
        addView(this.f6036k, new c(new FPoint(0.0f, 0.0f), 83));
        addView(this.f, new c(FPoint.obtain(0.0f, 0.0f), 83));
        addView(this.g, new c(FPoint.obtain(0.0f, 0.0f), 51));
        this.g.setVisibility(8);
        this.f6034a.setMapWidgetListener(new a());
        try {
            if (this.f6034a.getUiSettings().isMyLocationButtonEnabled()) {
                return;
            }
            this.f.setVisibility(8);
        } catch (Throwable th) {
            m2t.r(th, "AMapDelegateImpGLSurfaceView", "locationView gone");
            th.printStackTrace();
        }
    }

    public final void v(View view, int i, int i2, int i3, int i4) throws RemoteException {
        int i5;
        int i6;
        if (view == null) {
            return;
        }
        View view2 = this.l;
        if (view2 != null) {
            if (view == view2) {
                return;
            }
            view2.clearFocus();
            removeView(this.l);
        }
        this.l = view;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        this.l.setDrawingCacheEnabled(true);
        this.l.setDrawingCacheQuality(0);
        if (layoutParams != null) {
            int i7 = layoutParams.width;
            i6 = layoutParams.height;
            i5 = i7;
        } else {
            i5 = -2;
            i6 = -2;
        }
        addView(this.l, new c(i5, i6, i, i2, i3, i4, 81));
    }

    public final void w(View view, int i, int i2, int i3, int i4, int i5) {
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
            this.f6034a.changeSize(i, i2);
        }
    }

    public final void x(View view, int i, int i2, int[] iArr) {
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

    public final void y(View view, ViewGroup.LayoutParams layoutParams) {
        int[] iArr = new int[2];
        x(view, layoutParams.width, layoutParams.height, iArr);
        if (view instanceof ek) {
            w(view, iArr[0], iArr[1], 20, (this.f6034a.getWaterMarkerPositon().y - 80) - iArr[1], 51);
        } else {
            w(view, iArr[0], iArr[1], 0, 0, 51);
        }
    }

    public final void z(View view, c cVar) {
        int[] iArr = new int[2];
        x(view, ((ViewGroup.LayoutParams) cVar).width, ((ViewGroup.LayoutParams) cVar).height, iArr);
        if (view instanceof t) {
            w(view, iArr[0], iArr[1], getWidth() - iArr[0], getHeight(), cVar.e);
            return;
        }
        if (view instanceof el) {
            w(view, iArr[0], iArr[1], getWidth() - iArr[0], iArr[1], cVar.e);
            return;
        }
        if (view instanceof ej) {
            w(view, iArr[0], iArr[1], 0, 0, cVar.e);
            return;
        }
        if (cVar.f6044a != null) {
            IPoint iPointObtain = IPoint.obtain();
            MapConfig mapConfig = this.f6034a.getMapConfig();
            GLMapState mapProjection = this.f6034a.getMapProjection();
            if (mapConfig != null && mapProjection != null) {
                FPoint fPoint = cVar.f6044a;
                ((Point) iPointObtain).x = (int) ((PointF) fPoint).x;
                ((Point) iPointObtain).y = (int) ((PointF) fPoint).y;
            }
            int i = ((Point) iPointObtain).x + cVar.c;
            ((Point) iPointObtain).x = i;
            int i2 = ((Point) iPointObtain).y + cVar.d;
            ((Point) iPointObtain).y = i2;
            w(view, iArr[0], iArr[1], i, i2, cVar.e);
            iPointObtain.recycle();
        }
    }

    @Override // com.amap.api.col.p0003sl.s
    public final void j(Boolean bool) {
        ep epVar = this.h;
        if (epVar == null) {
            this.f6037r.b(this, bool);
        } else {
            epVar.d(bool.booleanValue());
        }
    }

    @Override // com.amap.api.col.p0003sl.s
    public final float a(int i) {
        if (this.e == null) {
            return 0.0f;
        }
        F();
        return this.e.o(i);
    }

    @Override // com.amap.api.col.p0003sl.s
    public final boolean b() {
        eq eqVar = this.e;
        if (eqVar != null) {
            return eqVar.q();
        }
        return false;
    }

    @Override // com.amap.api.col.p0003sl.s
    public final ek e() {
        return this.j;
    }

    @Override // com.amap.api.col.p0003sl.s
    public final void h() {
        ej ejVar = this.g;
        if (ejVar == null) {
            this.f6037r.b(this, new Object[0]);
        } else {
            ejVar.c();
        }
    }

    @Override // com.amap.api.col.p0003sl.s
    public final ei d() {
        return this.i;
    }

    @Override // com.amap.api.col.p0003sl.s
    public final eq f() {
        return this.e;
    }

    @Override // com.amap.api.col.p0003sl.s
    public final void c() {
        eq eqVar = this.e;
        if (eqVar == null) {
            this.f6037r.b(this, new Object[0]);
        } else if (eqVar != null) {
            eqVar.l();
        }
    }

    @Override // com.amap.api.col.p0003sl.s
    public final void g() {
        hideInfoWindow();
        zns.D(this.n);
        G();
        removeAllViews();
        this.p = null;
    }

    @Override // com.amap.api.col.p0003sl.s
    public final void i() {
        Context context;
        if (!this.s || (context = this.d) == null) {
            return;
        }
        u(context);
        kps kpsVar = this.f6037r;
        if (kpsVar != null) {
            kpsVar.a();
        }
    }

    @Override // com.amap.api.col.p0003sl.s
    public final void a(Integer num, Float f) {
        eq eqVar = this.e;
        if (eqVar == null) {
            this.f6037r.b(this, num, f);
        } else if (eqVar != null) {
            eqVar.d(num.intValue(), f.floatValue());
            F();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final void showInfoWindow(BaseOverlayImp baseOverlayImp) {
        if (baseOverlayImp == null) {
            return;
        }
        try {
            u8s u8sVar = this.u;
            if (!(u8sVar != null && u8sVar.n() && baseOverlayImp.getTitle() == null && baseOverlayImp.getSnippet() == null) && baseOverlayImp.isInfoWindowEnable()) {
                BasePointOverlay basePointOverlay = this.m;
                if (basePointOverlay != null && !basePointOverlay.getId().equals(baseOverlayImp.getId())) {
                    hideInfoWindow();
                }
                if (this.u != null) {
                    baseOverlayImp.setInfoWindowShown(true);
                    this.q = true;
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.amap.api.col.p0003sl.s
    public final Point a() {
        eq eqVar = this.e;
        if (eqVar == null) {
            return null;
        }
        return eqVar.h();
    }

    @Override // com.amap.api.col.p0003sl.s
    public final void a(boolean z) {
        eq eqVar = this.e;
        if (eqVar != null) {
            eqVar.n(z);
        }
        this.t = z;
    }
}
