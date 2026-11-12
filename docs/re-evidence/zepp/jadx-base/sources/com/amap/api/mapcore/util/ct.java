package com.amap.api.mapcore.util;

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

/* JADX INFO: loaded from: classes2.dex */
public final class ct {
    public ValueAnimator b;
    private IAMapDelegate e;
    private Marker f;
    private Circle g;
    private LatLng i;
    private double j;
    private Context k;
    private y l;
    private MyLocationStyle h = new MyLocationStyle();
    private int m = 4;
    private boolean n = false;
    private boolean o = false;
    private boolean p = false;
    private boolean q = false;
    private boolean r = false;
    private boolean s = false;
    public a a = null;
    public Animator.AnimatorListener c = new Animator.AnimatorListener() { // from class: com.amap.api.mapcore.util.ct.1
        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ct.this.h();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    };
    public ValueAnimator.AnimatorUpdateListener d = new ValueAnimator.AnimatorUpdateListener() { // from class: com.amap.api.mapcore.util.ct.2
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            try {
                if (ct.this.g != null) {
                    LatLng latLng = (LatLng) valueAnimator.getAnimatedValue();
                    ct.this.g.setCenter(latLng);
                    ct.this.f.setPosition(latLng);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    };

    public static class a implements TypeEvaluator {
        @Override // android.animation.TypeEvaluator
        public final Object evaluate(float f, Object obj, Object obj2) {
            LatLng latLng = (LatLng) obj;
            LatLng latLng2 = (LatLng) obj2;
            double d = latLng.latitude;
            double d2 = f;
            double d3 = d + ((latLng2.latitude - d) * d2);
            double d4 = latLng.longitude;
            return new LatLng(d3, d4 + (d2 * (latLng2.longitude - d4)));
        }
    }

    public ct(IAMapDelegate iAMapDelegate, Context context) {
        Context applicationContext = context.getApplicationContext();
        this.k = applicationContext;
        this.e = iAMapDelegate;
        this.l = new y(applicationContext, iAMapDelegate);
        a(4, true);
    }

    private void g() {
        IAMapDelegate iAMapDelegate = this.e;
        if (iAMapDelegate == null) {
            return;
        }
        try {
            iAMapDelegate.moveCamera(af.c(0.0f));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.i != null && this.o) {
            if (this.p && this.n) {
                return;
            }
            this.n = true;
            try {
                IPoint iPointObtain = IPoint.obtain();
                LatLng latLng = this.i;
                GLMapState.lonlat2Geo(latLng.longitude, latLng.latitude, iPointObtain);
                this.e.animateCamera(af.a(iPointObtain));
            } catch (Throwable th) {
                hn.c(th, "MyLocationOverlay", "moveMapToLocation");
                th.printStackTrace();
            }
        }
    }

    private void i() {
        MyLocationStyle myLocationStyle = this.h;
        if (myLocationStyle == null) {
            MyLocationStyle myLocationStyle2 = new MyLocationStyle();
            this.h = myLocationStyle2;
            myLocationStyle2.myLocationIcon(BitmapDescriptorFactory.fromAsset("location_map_gps_locked.png"));
        } else if (myLocationStyle.getMyLocationIcon() == null || this.h.getMyLocationIcon().getBitmap() == null) {
            this.h.myLocationIcon(BitmapDescriptorFactory.fromAsset("location_map_gps_locked.png"));
        }
        j();
    }

    private void j() {
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
            }
            h();
            this.l.a(this.f);
        } catch (Throwable th) {
            hn.c(th, "MyLocationOverlay", "myLocStyle");
            th.printStackTrace();
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

    public final void a(MyLocationStyle myLocationStyle) {
        try {
            this.h = myLocationStyle;
            a(myLocationStyle.isMyLocationShowing());
            if (!this.h.isMyLocationShowing()) {
                this.l.a(false);
                this.m = this.h.getMyLocationType();
                return;
            }
            i();
            Marker marker = this.f;
            if (marker == null && this.g == null) {
                return;
            }
            this.l.a(marker);
            a(this.h.getMyLocationType(), false);
        } catch (Throwable th) {
            hn.c(th, "MyLocationOverlay", "setMyLocationStyle");
            th.printStackTrace();
        }
    }

    public final void b() {
        y yVar;
        if (this.m != 3 || (yVar = this.l) == null) {
            return;
        }
        yVar.a();
    }

    public final void c() throws RemoteException {
        Circle circle = this.g;
        if (circle != null) {
            try {
                this.e.removeGLOverlay(circle.getId());
            } catch (Throwable th) {
                hn.c(th, "MyLocationOverlay", "locationIconRemove");
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
        y yVar = this.l;
        if (yVar != null) {
            yVar.b();
            this.l = null;
        }
    }

    private void b(float f) {
        IAMapDelegate iAMapDelegate = this.e;
        if (iAMapDelegate == null) {
            return;
        }
        try {
            iAMapDelegate.moveCamera(af.b(f));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final MyLocationStyle a() {
        return this.h;
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
        } else if (i != 2) {
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
        } else {
            this.o = true;
            this.q = true;
        }
        if (!this.r && !this.s) {
            Marker marker = this.f;
            if (marker != null) {
                marker.setFlat(false);
            }
            g();
            b(0.0f);
            this.l.b();
            return;
        }
        if (this.s) {
            this.l.a(true);
            if (!z) {
                try {
                    this.e.moveCamera(af.a(17.0f));
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            b(45.0f);
        } else {
            this.l.a(false);
        }
        this.l.a();
        Marker marker2 = this.f;
        if (marker2 != null) {
            marker2.setFlat(true);
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
                i();
            }
            Circle circle = this.g;
            if (circle != null) {
                try {
                    double d = this.j;
                    if (d != -1.0d) {
                        circle.setRadius(d);
                    }
                } catch (Throwable th) {
                    hn.c(th, "MyLocationOverlay", "setCentAndRadius");
                    th.printStackTrace();
                }
            }
            float bearing = location.getBearing();
            if (this.q) {
                float f = bearing % 360.0f;
                if (f > 180.0f) {
                    f -= 360.0f;
                } else if (f < -180.0f) {
                    f += 360.0f;
                }
                Marker marker = this.f;
                if (marker != null) {
                    marker.setRotateAngle(-f);
                }
            }
            if (!this.i.equals(this.f.getPosition())) {
                LatLng latLng = this.i;
                LatLng position = this.f.getPosition();
                if (position == null) {
                    position = new LatLng(0.0d, 0.0d);
                }
                if (this.a == null) {
                    this.a = new a();
                }
                ValueAnimator valueAnimator = this.b;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new a(), position, latLng);
                    this.b = valueAnimatorOfObject;
                    valueAnimatorOfObject.addListener(this.c);
                    this.b.addUpdateListener(this.d);
                } else {
                    valueAnimator.setObjectValues(position, latLng);
                    this.b.setEvaluator(this.a);
                }
                if (position.latitude == 0.0d && position.longitude == 0.0d) {
                    this.b.setDuration(1L);
                } else {
                    this.b.setDuration(1000L);
                }
                this.b.start();
                return;
            }
            h();
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

    public final void a(float f) {
        Marker marker = this.f;
        if (marker != null) {
            marker.setRotateAngle(f);
        }
    }
}
