package defpackage;

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
public final class nhs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IAMapDelegate f27946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Marker f27947b;
    public Circle c;
    public LatLng e;
    public double f;
    public Context g;
    public r5s h;
    public ValueAnimator q;
    public MyLocationStyle d = new MyLocationStyle();
    public int i = 4;
    public boolean j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f27948k = false;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;
    public boolean o = false;
    public c p = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Animator.AnimatorListener f27949r = new a();
    public ValueAnimator.AnimatorUpdateListener s = new b();

    public class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            nhs.this.x();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            try {
                if (nhs.this.c != null) {
                    LatLng latLng = (LatLng) valueAnimator.getAnimatedValue();
                    nhs.this.c.setCenter(latLng);
                    nhs.this.f27947b.setPosition(latLng);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static class c implements TypeEvaluator {
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

    public nhs(IAMapDelegate iAMapDelegate, Context context) {
        Context applicationContext = context.getApplicationContext();
        this.g = applicationContext;
        this.f27946a = iAMapDelegate;
        this.h = new r5s(applicationContext, iAMapDelegate);
        d(4, true);
    }

    public final void A() {
        try {
            if (this.c == null) {
                this.c = this.f27946a.addCircle(new CircleOptions().zIndex(1.0f));
            }
            Circle circle = this.c;
            if (circle != null) {
                if (circle.getStrokeWidth() != this.d.getStrokeWidth()) {
                    this.c.setStrokeWidth(this.d.getStrokeWidth());
                }
                if (this.c.getFillColor() != this.d.getRadiusFillColor()) {
                    this.c.setFillColor(this.d.getRadiusFillColor());
                }
                if (this.c.getStrokeColor() != this.d.getStrokeColor()) {
                    this.c.setStrokeColor(this.d.getStrokeColor());
                }
                LatLng latLng = this.e;
                if (latLng != null) {
                    this.c.setCenter(latLng);
                }
                this.c.setRadius(this.f);
                this.c.setVisible(true);
                this.c.setZIndex(this.d.getZIndex());
            }
            if (this.f27947b == null) {
                this.f27947b = this.f27946a.addMarker(new MarkerOptions().visible(false));
            }
            Marker marker = this.f27947b;
            if (marker != null) {
                if (marker.getAnchorU() != this.d.getAnchorU() || this.f27947b.getAnchorV() != this.d.getAnchorV()) {
                    this.f27947b.setAnchor(this.d.getAnchorU(), this.d.getAnchorV());
                }
                if (this.f27947b.getIcons() == null || this.f27947b.getIcons().size() == 0) {
                    this.f27947b.setIcon(this.d.getMyLocationIcon());
                } else if (this.d.getMyLocationIcon() != null && !this.f27947b.getIcons().get(0).equals(this.d.getMyLocationIcon())) {
                    this.f27947b.setIcon(this.d.getMyLocationIcon());
                }
                LatLng latLng2 = this.e;
                if (latLng2 != null) {
                    this.f27947b.setPosition(latLng2);
                    this.f27947b.setVisible(true);
                }
                this.f27947b.setZIndex(this.d.getZIndex());
            }
            x();
            this.h.e(this.f27947b);
        } catch (Throwable th) {
            m2t.r(th, "MyLocationOverlay", "myLocStyle");
            th.printStackTrace();
        }
    }

    public final MyLocationStyle a() {
        return this.d;
    }

    public final void b(float f) {
        Marker marker = this.f27947b;
        if (marker != null) {
            marker.setRotateAngle(f);
        }
    }

    public final void c(int i) {
        this.h.d(i);
    }

    public final void d(int i, boolean z) {
        this.i = i;
        this.j = false;
        this.l = false;
        this.f27948k = false;
        this.n = false;
        this.o = false;
        if (i == 1) {
            this.f27948k = true;
            this.l = true;
            this.m = true;
        } else if (i != 2) {
            if (i == 3) {
                this.f27948k = true;
            } else if (i == 4) {
                this.f27948k = true;
                this.n = true;
                this.m = false;
            } else if (i == 5) {
                this.n = true;
                this.m = false;
            } else if (i == 7) {
            }
            this.o = true;
        } else {
            this.f27948k = true;
            this.m = true;
        }
        if (!this.n && !this.o) {
            Marker marker = this.f27947b;
            if (marker != null) {
                marker.setFlat(false);
            }
            v();
            u();
            t();
            return;
        }
        if (this.o) {
            this.h.f(true);
            if (!z) {
                try {
                    this.f27946a.moveCamera(a7s.b(17.0f));
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            l(45.0f);
        } else {
            this.h.f(false);
        }
        this.h.c();
        Marker marker2 = this.f27947b;
        if (marker2 != null) {
            marker2.setFlat(true);
        }
    }

    public final void e(Location location) {
        if (location == null) {
            return;
        }
        i(this.d.isMyLocationShowing());
        if (this.d.isMyLocationShowing()) {
            this.e = new LatLng(location.getLatitude(), location.getLongitude());
            this.f = location.getAccuracy();
            if (this.f27947b == null && this.c == null) {
                y();
            }
            Circle circle = this.c;
            if (circle != null) {
                try {
                    double d = this.f;
                    if (d != -1.0d) {
                        circle.setRadius(d);
                    }
                } catch (Throwable th) {
                    m2t.r(th, "MyLocationOverlay", "setCentAndRadius");
                    th.printStackTrace();
                }
            }
            p(location.getBearing());
            if (this.e.equals(this.f27947b.getPosition())) {
                x();
            } else {
                f(this.e);
            }
        }
    }

    public final void f(LatLng latLng) {
        LatLng position = this.f27947b.getPosition();
        if (position == null) {
            position = new LatLng(0.0d, 0.0d);
        }
        if (this.p == null) {
            this.p = new c();
        }
        ValueAnimator valueAnimator = this.q;
        if (valueAnimator == null) {
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new c(), position, latLng);
            this.q = valueAnimatorOfObject;
            valueAnimatorOfObject.addListener(this.f27949r);
            this.q.addUpdateListener(this.s);
        } else {
            valueAnimator.setObjectValues(position, latLng);
            this.q.setEvaluator(this.p);
        }
        if (position.latitude == 0.0d && position.longitude == 0.0d) {
            this.q.setDuration(1L);
        } else {
            this.q.setDuration(1000L);
        }
        this.q.start();
    }

    public final void g(MyLocationStyle myLocationStyle) {
        try {
            this.d = myLocationStyle;
            i(myLocationStyle.isMyLocationShowing());
            if (!this.d.isMyLocationShowing()) {
                this.h.f(false);
                this.i = this.d.getMyLocationType();
                return;
            }
            y();
            Marker marker = this.f27947b;
            if (marker == null && this.c == null) {
                return;
            }
            this.h.e(marker);
            m(this.d.getMyLocationType());
        } catch (Throwable th) {
            m2t.r(th, "MyLocationOverlay", "setMyLocationStyle");
            th.printStackTrace();
        }
    }

    public final void i(boolean z) {
        Circle circle = this.c;
        if (circle != null && circle.isVisible() != z) {
            this.c.setVisible(z);
        }
        Marker marker = this.f27947b;
        if (marker == null || marker.isVisible() == z) {
            return;
        }
        this.f27947b.setVisible(z);
    }

    public final void k() {
        r5s r5sVar;
        if (this.i != 3 || (r5sVar = this.h) == null) {
            return;
        }
        r5sVar.c();
    }

    public final void l(float f) {
        IAMapDelegate iAMapDelegate = this.f27946a;
        if (iAMapDelegate == null) {
            return;
        }
        try {
            iAMapDelegate.moveCamera(a7s.p(f));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void m(int i) {
        d(i, false);
    }

    public final void o() throws RemoteException {
        z();
        if (this.h != null) {
            t();
            this.h = null;
        }
    }

    public final void p(float f) {
        if (this.m) {
            float f2 = f % 360.0f;
            if (f2 > 180.0f) {
                f2 -= 360.0f;
            } else if (f2 < -180.0f) {
                f2 += 360.0f;
            }
            Marker marker = this.f27947b;
            if (marker != null) {
                marker.setRotateAngle(-f2);
            }
        }
    }

    public final String q() {
        Marker marker = this.f27947b;
        if (marker != null) {
            return marker.getId();
        }
        return null;
    }

    public final String r() throws RemoteException {
        Circle circle = this.c;
        if (circle != null) {
            return circle.getId();
        }
        return null;
    }

    public final void s() {
        this.c = null;
        this.f27947b = null;
    }

    public final void t() {
        this.h.h();
    }

    public final void u() {
        l(0.0f);
    }

    public final void v() {
        w();
    }

    public final void w() {
        IAMapDelegate iAMapDelegate = this.f27946a;
        if (iAMapDelegate == null) {
            return;
        }
        try {
            iAMapDelegate.moveCamera(a7s.q(0.0f));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void x() {
        if (this.e != null && this.f27948k) {
            if (this.l && this.j) {
                return;
            }
            this.j = true;
            try {
                IPoint iPointObtain = IPoint.obtain();
                LatLng latLng = this.e;
                GLMapState.lonlat2Geo(latLng.longitude, latLng.latitude, iPointObtain);
                this.f27946a.animateCamera(a7s.e(iPointObtain));
            } catch (Throwable th) {
                m2t.r(th, "MyLocationOverlay", "moveMapToLocation");
                th.printStackTrace();
            }
        }
    }

    public final void y() {
        MyLocationStyle myLocationStyle = this.d;
        if (myLocationStyle == null) {
            MyLocationStyle myLocationStyle2 = new MyLocationStyle();
            this.d = myLocationStyle2;
            myLocationStyle2.myLocationIcon(BitmapDescriptorFactory.fromAsset("location_map_gps_locked.png"));
        } else if (myLocationStyle.getMyLocationIcon() == null || this.d.getMyLocationIcon().getBitmap() == null) {
            this.d.myLocationIcon(BitmapDescriptorFactory.fromAsset("location_map_gps_locked.png"));
        }
        A();
    }

    public final void z() {
        Circle circle = this.c;
        if (circle != null) {
            try {
                this.f27946a.removeGLOverlay(circle.getId());
            } catch (Throwable th) {
                m2t.r(th, "MyLocationOverlay", "locationIconRemove");
                th.printStackTrace();
            }
            this.c = null;
        }
        Marker marker = this.f27947b;
        if (marker != null) {
            marker.remove();
            this.f27947b = null;
            this.h.e(null);
        }
    }
}
