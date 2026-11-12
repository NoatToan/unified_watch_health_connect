package com.amap.api.col.p0003sl;

import android.animation.Animator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.location.Location;
import android.os.RemoteException;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.Circle;
import com.amap.api.maps.model.CircleOptions;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;
import com.amap.api.maps.model.MyLocationStyle;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.base.ae.gmap.GLMapState;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;

/* JADX INFO: loaded from: classes4.dex */
public final class cp {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ValueAnimator f2311b;
    private IAMapDelegate e;
    private Marker f;
    private Circle g;
    private LatLng i;
    private double j;
    private Context k;
    private ai l;
    private MyLocationStyle h = new MyLocationStyle();
    private int m = 4;
    private boolean n = false;
    private boolean o = false;
    private boolean p = false;
    private boolean q = false;
    private boolean r = false;
    private boolean s = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    a f2310a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Animator.AnimatorListener f2312c = new Animator.AnimatorListener() { // from class: com.amap.api.col.3sl.cp.1
        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            cp.this.k();
        }
    };
    ValueAnimator.AnimatorUpdateListener d = new ValueAnimator.AnimatorUpdateListener() { // from class: com.amap.api.col.3sl.cp.2
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            try {
                if (cp.this.g != null) {
                    LatLng latLng = (LatLng) valueAnimator.getAnimatedValue();
                    cp.this.g.setCenter(latLng);
                    cp.this.f.setPosition(latLng);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    };

    public cp(IAMapDelegate iAMapDelegate, Context context) {
        Context applicationContext = context.getApplicationContext();
        this.k = applicationContext;
        this.e = iAMapDelegate;
        this.l = new ai(applicationContext, iAMapDelegate);
        a(4, true);
    }

    public final void a(int i) {
        this.l.a(i);
    }

    public final void a(MyLocationStyle myLocationStyle) {
        try {
            this.h = myLocationStyle;
            a(myLocationStyle.isMyLocationShowing());
            if (!this.h.isMyLocationShowing()) {
                this.l.a(false);
                this.m = this.h.getMyLocationType();
                return;
            }
            l();
            Marker marker = this.f;
            if (marker == null && this.g == null) {
                return;
            }
            this.l.a(marker);
            b(this.h.getMyLocationType());
        } catch (Throwable th) {
            jv.c(th, "MyLocationOverlay", "setMyLocationStyle");
            th.printStackTrace();
        }
    }

    public final MyLocationStyle a() {
        return this.h;
    }

    private void b(int i) {
        a(i, false);
    }

    private void a(int i, boolean z) {
        this.m = i;
        this.n = false;
        this.p = false;
        this.o = false;
        this.r = false;
        this.s = false;
        if (i == 1) {
            this.o = true;
            this.p = true;
            this.q = true;
        } else if (i == 2) {
            this.o = true;
            this.q = true;
        } else {
            if (i == 3) {
                this.o = true;
            } else if (i == 4) {
                this.o = true;
                this.r = true;
                this.q = false;
            } else if (i == 5) {
                this.r = true;
                this.q = false;
            } else if (i == 7) {
            }
            this.s = true;
        }
        if (this.r || this.s) {
            if (this.s) {
                this.l.a(true);
                if (!z) {
                    try {
                        this.e.moveCamera(ap.a(17.0f));
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
                b(45.0f);
            } else {
                this.l.a(false);
            }
            this.l.a();
            Marker marker = this.f;
            if (marker != null) {
                marker.setFlat(true);
                return;
            }
            return;
        }
        Marker marker2 = this.f;
        if (marker2 != null) {
            marker2.setFlat(false);
        }
        i();
        h();
        g();
    }

    public final void b() {
        ai aiVar;
        if (this.m != 3 || (aiVar = this.l) == null) {
            return;
        }
        aiVar.a();
    }

    private void g() {
        this.l.b();
    }

    private void h() {
        b(0.0f);
    }

    private void i() {
        j();
    }

    private void b(float f) {
        IAMapDelegate iAMapDelegate = this.e;
        if (iAMapDelegate == null) {
            return;
        }
        try {
            iAMapDelegate.moveCamera(ap.c(f));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void j() {
        IAMapDelegate iAMapDelegate = this.e;
        if (iAMapDelegate == null) {
            return;
        }
        try {
            iAMapDelegate.moveCamera(ap.d(0.0f));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void a(Location location) {
        if (location == null) {
            return;
        }
        a(this.h.isMyLocationShowing());
        if (this.h.isMyLocationShowing()) {
            this.i = new LatLng(location.getLatitude(), location.getLongitude());
            this.j = location.getAccuracy();
            if (this.f == null && this.g == null) {
                l();
            }
            Circle circle = this.g;
            if (circle != null) {
                try {
                    double d = this.j;
                    if (d != -1.0d) {
                        circle.setRadius(d);
                    }
                } catch (Throwable th) {
                    jv.c(th, "MyLocationOverlay", "setCentAndRadius");
                    th.printStackTrace();
                }
            }
            c(location.getBearing());
            if (!this.i.equals(this.f.getPosition())) {
                a(this.i);
            } else {
                k();
            }
        }
    }

    private void c(float f) {
        if (this.q) {
            float f2 = f % 360.0f;
            if (f2 > 180.0f) {
                f2 -= 360.0f;
            } else if (f2 < -180.0f) {
                f2 += 360.0f;
            }
            Marker marker = this.f;
            if (marker != null) {
                marker.setRotateAngle(-f2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.i != null && this.o) {
            if (this.p && this.n) {
                return;
            }
            this.n = true;
            try {
                IPoint iPointObtain = IPoint.obtain();
                GLMapState.lonlat2Geo(this.i.longitude, this.i.latitude, iPointObtain);
                this.e.animateCamera(ap.a(iPointObtain));
            } catch (Throwable th) {
                jv.c(th, "MyLocationOverlay", "moveMapToLocation");
                th.printStackTrace();
            }
        }
    }

    private void l() {
        MyLocationStyle myLocationStyle = this.h;
        if (myLocationStyle == null) {
            MyLocationStyle myLocationStyle2 = new MyLocationStyle();
            this.h = myLocationStyle2;
            myLocationStyle2.myLocationIcon(BitmapDescriptorFactory.fromAsset("location_map_gps_locked.png"));
        } else if (myLocationStyle.getMyLocationIcon() == null || this.h.getMyLocationIcon().getBitmap() == null) {
            this.h.myLocationIcon(BitmapDescriptorFactory.fromAsset("location_map_gps_locked.png"));
        }
        n();
    }

    public final void c() throws RemoteException {
        m();
        if (this.l != null) {
            g();
            this.l = null;
        }
    }

    private void m() {
        Circle circle = this.g;
        if (circle != null) {
            try {
                this.e.removeGLOverlay(circle.getId());
            } catch (Throwable th) {
                jv.c(th, "MyLocationOverlay", "locationIconRemove");
                th.printStackTrace();
            }
            this.g = null;
        }
        Marker marker = this.f;
        if (marker != null) {
            marker.remove();
            this.f = null;
            this.l.a((Marker) null);
        }
    }

    private void a(boolean z) {
        Circle circle = this.g;
        if (circle != null && circle.isVisible() != z) {
            this.g.setVisible(z);
        }
        Marker marker = this.f;
        if (marker == null || marker.isVisible() == z) {
            return;
        }
        this.f.setVisible(z);
    }

    private void n() {
        try {
            if (this.g == null) {
                this.g = this.e.addCircle(new CircleOptions().zIndex(1.0f));
            }
            Circle circle = this.g;
            if (circle != null) {
                if (circle.getStrokeWidth() != this.h.getStrokeWidth()) {
                    this.g.setStrokeWidth(this.h.getStrokeWidth());
                }
                if (this.g.getFillColor() != this.h.getRadiusFillColor()) {
                    this.g.setFillColor(this.h.getRadiusFillColor());
                }
                if (this.g.getStrokeColor() != this.h.getStrokeColor()) {
                    this.g.setStrokeColor(this.h.getStrokeColor());
                }
                LatLng latLng = this.i;
                if (latLng != null) {
                    this.g.setCenter(latLng);
                }
                this.g.setRadius(this.j);
                this.g.setVisible(true);
                this.g.setZIndex(this.h.getZIndex());
            }
            if (this.f == null) {
                this.f = this.e.addMarker(new MarkerOptions().visible(false));
            }
            Marker marker = this.f;
            if (marker != null) {
                if (marker.getAnchorU() != this.h.getAnchorU() || this.f.getAnchorV() != this.h.getAnchorV()) {
                    this.f.setAnchor(this.h.getAnchorU(), this.h.getAnchorV());
                }
                if (this.f.getIcons() == null || this.f.getIcons().size() == 0) {
                    this.f.setIcon(this.h.getMyLocationIcon());
                } else if (this.h.getMyLocationIcon() != null && !this.f.getIcons().get(0).equals(this.h.getMyLocationIcon())) {
                    this.f.setIcon(this.h.getMyLocationIcon());
                }
                LatLng latLng2 = this.i;
                if (latLng2 != null) {
                    this.f.setPosition(latLng2);
                    this.f.setVisible(true);
                }
                this.f.setZIndex(this.h.getZIndex());
            }
            k();
            this.l.a(this.f);
        } catch (Throwable th) {
            jv.c(th, "MyLocationOverlay", "myLocStyle");
            th.printStackTrace();
        }
    }

    public final void a(float f) {
        Marker marker = this.f;
        if (marker != null) {
            marker.setRotateAngle(f);
        }
    }

    public final String d() {
        Marker marker = this.f;
        if (marker != null) {
            return marker.getId();
        }
        return null;
    }

    public final String e() throws RemoteException {
        Circle circle = this.g;
        if (circle != null) {
            return circle.getId();
        }
        return null;
    }

    public final void f() {
        this.g = null;
        this.f = null;
    }

    private void a(LatLng latLng) {
        LatLng position = this.f.getPosition();
        if (position == null) {
            position = new LatLng(0.0d, 0.0d);
        }
        if (this.f2310a == null) {
            this.f2310a = new a();
        }
        ValueAnimator valueAnimator = this.f2311b;
        if (valueAnimator == null) {
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new a(), position, latLng);
            this.f2311b = valueAnimatorOfObject;
            valueAnimatorOfObject.addListener(this.f2312c);
            this.f2311b.addUpdateListener(this.d);
        } else {
            valueAnimator.setObjectValues(position, latLng);
            this.f2311b.setEvaluator(this.f2310a);
        }
        if (position.latitude == 0.0d && position.longitude == 0.0d) {
            this.f2311b.setDuration(1L);
        } else {
            this.f2311b.setDuration(1000L);
        }
        this.f2311b.start();
    }

    public static final class a implements TypeEvaluator {
        @Override // android.animation.TypeEvaluator
        public final Object evaluate(float f, Object obj, Object obj2) {
            LatLng latLng = (LatLng) obj;
            LatLng latLng2 = (LatLng) obj2;
            double d = f;
            return new LatLng(latLng.latitude + ((latLng2.latitude - latLng.latitude) * d), latLng.longitude + (d * (latLng2.longitude - latLng.longitude)));
        }
    }
}
