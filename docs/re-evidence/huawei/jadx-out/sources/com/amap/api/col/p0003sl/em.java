package com.amap.api.col.p0003sl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
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
import com.amap.api.maps.model.Marker;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.base.ae.gmap.GLMapState;
import com.autonavi.base.ae.gmap.listener.AMapWidgetListener;
import com.autonavi.base.amap.api.mapcore.BaseOverlayImp;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.autonavi.base.amap.api.mapcore.IGLSurfaceView;
import com.autonavi.base.amap.mapcore.FPoint;
import com.autonavi.base.amap.mapcore.MapConfig;

/* JADX INFO: loaded from: classes4.dex */
public final class em extends ViewGroup implements en {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    eo f2447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    az f2448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IAMapDelegate f2449c;
    private IGlOverlayLayer d;
    private INativeOverlayLayer e;
    private Context f;
    private eq g;
    private el h;
    private ej i;
    private ep j;
    private ei k;
    private ek l;
    private er m;
    private View n;
    private BasePointOverlay o;
    private Drawable p;
    private boolean q;
    private View r;
    private boolean s;
    private boolean t;
    private boolean u;

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final boolean isInfoWindowShown() {
        return false;
    }

    @Override // com.amap.api.col.p0003sl.en
    public final View j() {
        return this;
    }

    static /* synthetic */ View f(em emVar) {
        emVar.n = null;
        return null;
    }

    public em(Context context, IAMapDelegate iAMapDelegate, IGlOverlayLayer iGlOverlayLayer, INativeOverlayLayer iNativeOverlayLayer) {
        super(context);
        this.p = null;
        int i = 1;
        this.q = true;
        this.t = true;
        this.u = true;
        try {
            this.d = iGlOverlayLayer;
            this.e = iNativeOverlayLayer;
            this.f2449c = iAMapDelegate;
            this.f = context;
            this.f2447a = new eo();
            this.k = new ei(context);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (this.f2449c.getGLMapView() != null) {
                addView(this.f2449c.getGLMapView(), 0, layoutParams);
            } else {
                i = 0;
            }
            addView(this.k, i, layoutParams);
            addView((ae) this.e, layoutParams);
            if (this.t) {
                return;
            }
            a(context);
        } catch (Throwable th) {
            th.printStackTrace();
            eb.a(th);
        }
    }

    private void a(Context context) {
        eq eqVar = new eq(context);
        this.g = eqVar;
        eqVar.c(this.u);
        this.j = new ep(context, this.f2449c);
        this.l = new ek(context);
        this.m = new er(context, this.f2449c);
        this.h = new el(context, this.f2449c);
        this.i = new ej(context, this.f2449c);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        addView(this.g, layoutParams);
        addView(this.j, layoutParams);
        addView(this.l, new ViewGroup.LayoutParams(-2, -2));
        addView(this.m, new a(new FPoint(0.0f, 0.0f), 83));
        addView(this.h, new a(FPoint.obtain(0.0f, 0.0f), 83));
        addView(this.i, new a(FPoint.obtain(0.0f, 0.0f), 51));
        this.i.setVisibility(8);
        this.f2449c.setMapWidgetListener(new AMapWidgetListener() { // from class: com.amap.api.col.3sl.em.1
            @Override // com.autonavi.base.ae.gmap.listener.AMapWidgetListener
            public final void setFrontViewVisibility(boolean z) {
            }

            @Override // com.autonavi.base.ae.gmap.listener.AMapWidgetListener
            public final void invalidateScaleView() {
                if (em.this.j == null) {
                    return;
                }
                em.this.j.post(new Runnable() { // from class: com.amap.api.col.3sl.em.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        em.this.j.b();
                    }
                });
            }

            @Override // com.autonavi.base.ae.gmap.listener.AMapWidgetListener
            public final void invalidateCompassView() {
                if (em.this.i == null) {
                    return;
                }
                em.this.i.post(new Runnable() { // from class: com.amap.api.col.3sl.em.1.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        em.this.i.b();
                    }
                });
            }

            @Override // com.autonavi.base.ae.gmap.listener.AMapWidgetListener
            public final void invalidateZoomController(final float f) {
                if (em.this.m == null) {
                    return;
                }
                em.this.m.post(new Runnable() { // from class: com.amap.api.col.3sl.em.1.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        em.this.m.a(f);
                    }
                });
            }
        });
        try {
            if (this.f2449c.getUiSettings().isMyLocationButtonEnabled()) {
                return;
            }
            this.h.setVisibility(8);
        } catch (Throwable th) {
            jv.c(th, "AMapDelegateImpGLSurfaceView", "locationView gone");
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.col.p0003sl.en
    public final void a(Boolean bool) {
        ek ekVar = this.l;
        if (ekVar == null) {
            this.f2447a.a(this, bool);
        } else if (ekVar != null && bool.booleanValue() && this.f2449c.canShowIndoorSwitch()) {
            this.l.a(true);
        }
    }

    @Override // com.amap.api.col.p0003sl.en
    public final void b(Boolean bool) {
        er erVar = this.m;
        if (erVar == null) {
            this.f2447a.a(this, bool);
        } else {
            erVar.a(bool.booleanValue());
        }
    }

    @Override // com.amap.api.col.p0003sl.en
    public final void c(Boolean bool) {
        if (this.h == null) {
            this.f2447a.a(this, bool);
        } else if (bool.booleanValue()) {
            this.h.setVisibility(0);
        } else {
            this.h.setVisibility(8);
        }
    }

    @Override // com.amap.api.col.p0003sl.en
    public final void d(Boolean bool) {
        ej ejVar = this.i;
        if (ejVar == null) {
            this.f2447a.a(this, bool);
        } else {
            ejVar.a(bool.booleanValue());
        }
    }

    @Override // com.amap.api.col.p0003sl.en
    public final void e(Boolean bool) {
        ep epVar = this.j;
        if (epVar == null) {
            this.f2447a.a(this, bool);
        } else {
            epVar.a(bool.booleanValue());
        }
    }

    @Override // com.amap.api.col.p0003sl.en
    public final void f(Boolean bool) {
        eq eqVar = this.g;
        if (eqVar == null) {
            this.f2447a.a(this, bool);
        } else {
            eqVar.setVisibility(bool.booleanValue() ? 0 : 8);
        }
    }

    @Override // com.amap.api.col.p0003sl.en
    public final void a(String str, Boolean bool, Integer num) {
        if (this.g == null) {
            this.f2447a.a(this, str, bool, num);
            return;
        }
        if (num.intValue() == 2) {
            this.g.b(bool.booleanValue());
        } else {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.g.a(str, num.intValue());
            this.g.d(bool.booleanValue());
        }
    }

    @Override // com.amap.api.col.p0003sl.en
    public final void a(Float f) {
        er erVar = this.m;
        if (erVar == null) {
            this.f2447a.a(this, f);
        } else if (erVar != null) {
            erVar.a(f.floatValue());
        }
    }

    @Override // com.amap.api.col.p0003sl.en
    public final void a(Integer num) {
        er erVar = this.m;
        if (erVar == null) {
            this.f2447a.a(this, num);
        } else if (erVar != null) {
            erVar.a(num.intValue());
        }
    }

    @Override // com.amap.api.col.p0003sl.en
    public final void b(Integer num) {
        eq eqVar = this.g;
        if (eqVar == null) {
            this.f2447a.a(this, num);
        } else if (eqVar != null) {
            eqVar.a(num.intValue());
            this.g.postInvalidate();
            k();
        }
    }

    private void k() {
        ep epVar = this.j;
        if (epVar == null) {
            this.f2447a.a(this, new Object[0]);
        } else {
            if (epVar == null || epVar.getVisibility() != 0) {
                return;
            }
            this.j.postInvalidate();
        }
    }

    @Override // com.amap.api.col.p0003sl.en
    public final void c(Integer num) {
        eq eqVar = this.g;
        if (eqVar == null) {
            this.f2447a.a(this, num);
        } else if (eqVar != null) {
            eqVar.b(num.intValue());
            k();
        }
    }

    @Override // com.amap.api.col.p0003sl.en
    public final void d(Integer num) {
        eq eqVar = this.g;
        if (eqVar == null) {
            this.f2447a.a(this, num);
        } else if (eqVar != null) {
            eqVar.c(num.intValue());
            k();
        }
    }

    @Override // com.amap.api.col.p0003sl.en
    public final float a(int i) {
        if (this.g == null) {
            return 0.0f;
        }
        k();
        return this.g.d(i);
    }

    @Override // com.amap.api.col.p0003sl.en
    public final void a(Integer num, Float f) {
        eq eqVar = this.g;
        if (eqVar == null) {
            this.f2447a.a(this, num, f);
        } else if (eqVar != null) {
            eqVar.a(num.intValue(), f.floatValue());
            k();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final void setInfoWindowAdapterManager(az azVar) {
        this.f2448b = azVar;
    }

    @Override // com.amap.api.col.p0003sl.en
    public final Point a() {
        eq eqVar = this.g;
        if (eqVar == null) {
            return null;
        }
        return eqVar.b();
    }

    @Override // com.amap.api.col.p0003sl.en
    public final void g(Boolean bool) {
        eq eqVar = this.g;
        if (eqVar == null) {
            this.f2447a.a(this, bool);
            return;
        }
        if (eqVar != null && bool.booleanValue()) {
            this.g.a(true);
            return;
        }
        eq eqVar2 = this.g;
        if (eqVar2 != null) {
            eqVar2.a(false);
        }
    }

    @Override // com.amap.api.col.p0003sl.en
    public final boolean b() {
        eq eqVar = this.g;
        if (eqVar != null) {
            return eqVar.d();
        }
        return false;
    }

    @Override // com.amap.api.col.p0003sl.en
    public final void c() {
        eq eqVar = this.g;
        if (eqVar == null) {
            this.f2447a.a(this, new Object[0]);
        } else if (eqVar != null) {
            eqVar.c();
        }
    }

    @Override // com.amap.api.col.p0003sl.en
    public final ei d() {
        return this.k;
    }

    @Override // com.amap.api.col.p0003sl.en
    public final ek e() {
        return this.l;
    }

    @Override // com.amap.api.col.p0003sl.en
    public final eq f() {
        return this.g;
    }

    @Override // com.amap.api.col.p0003sl.en
    public final void a(CameraPosition cameraPosition) {
        if (this.g == null) {
            this.f2447a.a(this, cameraPosition);
            return;
        }
        if (this.f2449c.getUiSettings().isLogoEnable()) {
            if (MapsInitializer.isLoadWorldGridMap() && cameraPosition.zoom >= 6.0f && !du.a(cameraPosition.target.latitude, cameraPosition.target.longitude)) {
                this.g.setVisibility(8);
            } else if (this.f2449c.getMaskLayerType() == -1) {
                this.g.setVisibility(0);
            }
        }
    }

    private void l() {
        er erVar = this.m;
        if (erVar != null) {
            erVar.a();
        }
        ep epVar = this.j;
        if (epVar != null) {
            epVar.a();
        }
        eq eqVar = this.g;
        if (eqVar != null) {
            eqVar.a();
        }
        el elVar = this.h;
        if (elVar != null) {
            elVar.a();
        }
        ej ejVar = this.i;
        if (ejVar != null) {
            ejVar.a();
        }
        ek ekVar = this.l;
        if (ekVar != null) {
            ekVar.a();
        }
    }

    @Override // com.amap.api.col.p0003sl.en
    public final void a(boolean z) {
        eq eqVar = this.g;
        if (eqVar != null) {
            eqVar.c(z);
        }
        this.u = z;
    }

    public static final class a extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public FPoint f2456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f2457b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2458c;
        public int d;
        public int e;

        public a(FPoint fPoint, int i) {
            this(-2, -2, fPoint.x, fPoint.y, 0, 0, i);
        }

        public a(int i, int i2, float f, float f2, int i3, int i4, int i5) {
            super(i, i2);
            FPoint fPoint = new FPoint();
            this.f2456a = fPoint;
            this.f2457b = false;
            this.f2458c = 0;
            this.d = 0;
            this.e = 51;
            fPoint.x = f;
            this.f2456a.y = f2;
            this.f2458c = i3;
            this.d = i4;
            this.e = i5;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        try {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt != null) {
                    if (childAt.getLayoutParams() instanceof a) {
                        a(childAt, (a) childAt.getLayoutParams());
                    } else {
                        a(childAt, childAt.getLayoutParams());
                    }
                }
            }
            eq eqVar = this.g;
            if (eqVar != null) {
                eqVar.c();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a(View view, ViewGroup.LayoutParams layoutParams) {
        int[] iArr = new int[2];
        a(view, layoutParams.width, layoutParams.height, iArr);
        if (view instanceof ek) {
            a(view, iArr[0], iArr[1], 20, (this.f2449c.getWaterMarkerPositon().y - 80) - iArr[1], 51);
            return;
        }
        a(view, iArr[0], iArr[1], 0, 0, 51);
    }

    private void a(View view, a aVar) {
        int[] iArr = new int[2];
        a(view, aVar.width, aVar.height, iArr);
        if (view instanceof er) {
            a(view, iArr[0], iArr[1], getWidth() - iArr[0], getHeight(), aVar.e);
            return;
        }
        if (view instanceof el) {
            a(view, iArr[0], iArr[1], getWidth() - iArr[0], iArr[1], aVar.e);
            return;
        }
        if (view instanceof ej) {
            a(view, iArr[0], iArr[1], 0, 0, aVar.e);
            return;
        }
        if (aVar.f2456a != null) {
            IPoint iPointObtain = IPoint.obtain();
            MapConfig mapConfig = this.f2449c.getMapConfig();
            GLMapState mapProjection = this.f2449c.getMapProjection();
            if (mapConfig != null && mapProjection != null) {
                iPointObtain.x = (int) aVar.f2456a.x;
                iPointObtain.y = (int) aVar.f2456a.y;
            }
            iPointObtain.x += aVar.f2458c;
            iPointObtain.y += aVar.d;
            a(view, iArr[0], iArr[1], iPointObtain.x, iPointObtain.y, aVar.e);
            iPointObtain.recycle();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final void showInfoWindow(BasePointOverlay basePointOverlay) {
        if (basePointOverlay == null) {
            return;
        }
        try {
            az azVar = this.f2448b;
            if ((azVar == null || !azVar.a() || basePointOverlay.getTitle() != null || basePointOverlay.getSnippet() != null) && basePointOverlay.isInfoWindowEnable()) {
                BasePointOverlay basePointOverlay2 = this.o;
                if (basePointOverlay2 != null && !basePointOverlay2.getId().equals(basePointOverlay.getId())) {
                    hideInfoWindow();
                }
                if (this.f2448b != null) {
                    this.o = basePointOverlay;
                    this.s = true;
                    this.d.getNativeProperties(basePointOverlay.getId(), "setInfoWindowShown", new Object[]{Boolean.TRUE});
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final void showInfoWindow(BaseOverlayImp baseOverlayImp) {
        if (baseOverlayImp == null) {
            return;
        }
        try {
            az azVar = this.f2448b;
            if ((azVar == null || !azVar.a() || baseOverlayImp.getTitle() != null || baseOverlayImp.getSnippet() != null) && baseOverlayImp.isInfoWindowEnable()) {
                BasePointOverlay basePointOverlay = this.o;
                if (basePointOverlay != null && !basePointOverlay.getId().equals(baseOverlayImp.getId())) {
                    hideInfoWindow();
                }
                if (this.f2448b != null) {
                    baseOverlayImp.setInfoWindowShown(true);
                    this.s = true;
                }
            }
        } catch (Throwable unused) {
        }
    }

    private View a(BasePointOverlay basePointOverlay) throws RemoteException {
        View viewA;
        View viewA2;
        View viewA3 = null;
        if (basePointOverlay instanceof Marker) {
            try {
                if (this.p == null) {
                    this.p = dq.a(this.f, "infowindow_bg.9.png");
                }
            } catch (Throwable th) {
                jv.c(th, "MapOverlayViewGroup", "showInfoWindow decodeDrawableFromAsset");
                th.printStackTrace();
            }
            try {
                if (this.s) {
                    viewA = this.f2448b.a(basePointOverlay);
                    if (viewA == null) {
                        try {
                            viewA = this.f2448b.b(basePointOverlay);
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    this.r = viewA;
                    this.s = false;
                } else {
                    viewA = this.r;
                }
                if (viewA != null) {
                    viewA3 = viewA;
                } else {
                    if (!this.f2448b.a()) {
                        return null;
                    }
                    viewA3 = this.f2448b.a(basePointOverlay);
                }
                if (viewA3 == null || viewA3.getBackground() != null) {
                    return viewA3;
                }
                viewA3.setBackground(this.p);
                return viewA3;
            } catch (Throwable th3) {
                th = th3;
                viewA = viewA3;
            }
            jv.c(th, "MapOverlayViewGroup", "getInfoWindow or getInfoContents");
            th.printStackTrace();
            return viewA;
        }
        try {
            if (this.p == null) {
                this.p = dq.a(this.f, "infowindow_bg.9.png");
            }
        } catch (Throwable th4) {
            jv.c(th4, "MapOverlayViewGroup", "showInfoWindow decodeDrawableFromAsset");
            th4.printStackTrace();
        }
        try {
            if (this.s) {
                viewA2 = this.f2448b.a(basePointOverlay);
                if (viewA2 == null) {
                    try {
                        viewA2 = this.f2448b.b(basePointOverlay);
                    } catch (Throwable th5) {
                        th = th5;
                        viewA3 = viewA2;
                        jv.c(th, "MapOverlayViewGroup", "getInfoWindow or getInfoContents");
                        th.printStackTrace();
                        return viewA3;
                    }
                }
                this.r = viewA2;
                this.s = false;
            } else {
                viewA2 = this.r;
            }
            if (viewA2 != null) {
                viewA3 = viewA2;
            } else {
                if (!this.f2448b.a()) {
                    return null;
                }
                viewA3 = this.f2448b.a(basePointOverlay);
            }
            if (viewA3.getBackground() == null) {
                viewA3.setBackground(this.p);
            }
            return viewA3;
        } catch (Throwable th6) {
            th = th6;
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final void redrawInfoWindow() {
        boolean zCheckInBounds;
        try {
            BasePointOverlay basePointOverlay = this.o;
            if (basePointOverlay instanceof Marker) {
                if (((Marker) basePointOverlay).isIconView()) {
                    zCheckInBounds = this.e.checkInBounds(this.o.getId());
                } else {
                    zCheckInBounds = this.d.checkInBounds(this.o.getId());
                }
            } else {
                zCheckInBounds = this.d.checkInBounds(basePointOverlay.getId());
            }
            if (this.o != null && zCheckInBounds) {
                if (this.q) {
                    FPoint fPointObtain = FPoint.obtain();
                    BasePointOverlay basePointOverlay2 = this.o;
                    if (basePointOverlay2 instanceof Marker) {
                        if (((Marker) basePointOverlay2).isIconView()) {
                            this.e.getMarkerInfoWindowOffset(this.o.getId(), fPointObtain);
                        } else {
                            this.d.getMarkerInfoWindowOffset(this.o.getId(), fPointObtain);
                        }
                    } else {
                        this.d.getMarkerInfoWindowOffset(basePointOverlay2.getId(), fPointObtain);
                    }
                    int i = (int) fPointObtain.x;
                    int i2 = (int) (fPointObtain.y + 2.0f);
                    fPointObtain.recycle();
                    View viewA = a(this.o);
                    if (viewA == null) {
                        View view = this.n;
                        if (view == null || view.getVisibility() != 0) {
                            return;
                        }
                        hideInfoWindow();
                        return;
                    }
                    FPoint fPointObtain2 = FPoint.obtain();
                    BasePointOverlay basePointOverlay3 = this.o;
                    if (basePointOverlay3 instanceof Marker) {
                        if (((Marker) basePointOverlay3).isIconView()) {
                            this.e.getOverlayScreenPos(this.o.getId(), fPointObtain2);
                        } else {
                            this.d.getOverlayScreenPos(this.o.getId(), fPointObtain2);
                        }
                    } else {
                        this.d.getOverlayScreenPos(basePointOverlay3.getId(), fPointObtain2);
                    }
                    a(viewA, (int) fPointObtain2.x, (int) fPointObtain2.y, i, i2);
                    View view2 = this.n;
                    if (view2 != null) {
                        a aVar = (a) view2.getLayoutParams();
                        if (aVar != null) {
                            aVar.f2456a = FPoint.obtain(fPointObtain2.x, fPointObtain2.y);
                            aVar.f2458c = i;
                            aVar.d = i2;
                        }
                        onLayout(false, 0, 0, 0, 0);
                        if (this.f2448b.a()) {
                            this.f2448b.a(this.o.getTitle(), this.o.getSnippet());
                        }
                        if (this.n.getVisibility() == 8) {
                            this.n.setVisibility(0);
                        }
                    }
                    fPointObtain2.recycle();
                    return;
                }
                return;
            }
            View view3 = this.n;
            if (view3 == null || view3.getVisibility() != 0) {
                return;
            }
            this.n.setVisibility(8);
        } catch (Throwable th) {
            jv.c(th, "MapOverlayViewGroup", "redrawInfoWindow");
            eb.a(th);
        }
    }

    private void a(View view, int i, int i2, int i3, int i4) throws RemoteException {
        int i5;
        int i6;
        if (view == null) {
            return;
        }
        View view2 = this.n;
        if (view2 != null) {
            if (view == view2) {
                return;
            }
            view2.clearFocus();
            removeView(this.n);
        }
        this.n = view;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        this.n.setDrawingCacheEnabled(true);
        this.n.setDrawingCacheQuality(0);
        if (layoutParams != null) {
            int i7 = layoutParams.width;
            i6 = layoutParams.height;
            i5 = i7;
        } else {
            i5 = -2;
            i6 = -2;
        }
        addView(this.n, new a(i5, i6, i, i2, i3, i4, 81));
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final void hideInfoWindow() {
        try {
            IAMapDelegate iAMapDelegate = this.f2449c;
            if (iAMapDelegate == null || iAMapDelegate.getMainHandler() == null) {
                return;
            }
            this.f2449c.getMainHandler().post(new Runnable() { // from class: com.amap.api.col.3sl.em.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (em.this.n != null) {
                        em.this.n.clearFocus();
                        em emVar = em.this;
                        emVar.removeView(emVar.n);
                        eb.a(em.this.n.getBackground());
                        eb.a(em.this.p);
                        em.f(em.this);
                    }
                }
            });
            BasePointOverlay basePointOverlay = this.o;
            if (basePointOverlay != null) {
                this.d.getNativeProperties(basePointOverlay.getId(), "setInfoWindowShown", new Object[]{Boolean.FALSE});
            }
            this.o = null;
        } catch (Throwable th) {
            th.printStackTrace();
        }
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
            this.f2449c.changeSize(i, i2);
        }
    }

    @Override // com.amap.api.col.p0003sl.en
    public final void g() {
        hideInfoWindow();
        eb.a(this.p);
        l();
        removeAllViews();
        this.r = null;
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final boolean onInfoWindowTap(MotionEvent motionEvent) {
        View view = this.n;
        return (view == null || this.o == null || !eb.a(new Rect(view.getLeft(), this.n.getTop(), this.n.getRight(), this.n.getBottom()), (int) motionEvent.getX(), (int) motionEvent.getY())) ? false : true;
    }

    @Override // com.amap.api.col.p0003sl.en
    public final void a(Canvas canvas) {
        Bitmap drawingCache;
        View view = this.n;
        if (view == null || this.o == null || (drawingCache = view.getDrawingCache(true)) == null) {
            return;
        }
        canvas.drawBitmap(drawingCache, this.n.getLeft(), this.n.getTop(), new Paint());
    }

    @Override // com.amap.api.col.p0003sl.en
    public final void a(ek.a aVar) {
        ek ekVar = this.l;
        if (ekVar == null) {
            this.f2447a.a(this, aVar);
        } else {
            ekVar.a(aVar);
        }
    }

    @Override // com.amap.api.col.p0003sl.en
    public final void h() {
        ej ejVar = this.i;
        if (ejVar == null) {
            this.f2447a.a(this, new Object[0]);
        } else {
            ejVar.b();
        }
    }

    @Override // com.amap.api.col.p0003sl.en
    public final void h(Boolean bool) {
        el elVar = this.h;
        if (elVar == null) {
            this.f2447a.a(this, bool);
        } else {
            elVar.a(bool.booleanValue());
        }
    }

    @Override // com.amap.api.col.p0003sl.en
    public final void i(Boolean bool) {
        ek ekVar = this.l;
        if (ekVar == null) {
            this.f2447a.a(this, bool);
        } else {
            ekVar.a(bool.booleanValue());
        }
    }

    @Override // com.amap.api.col.p0003sl.en
    public final void i() {
        Context context;
        if (!this.t || (context = this.f) == null) {
            return;
        }
        a(context);
        eo eoVar = this.f2447a;
        if (eoVar != null) {
            eoVar.a();
        }
    }
}
