package com.amap.api.col.p0003sl;

import android.content.Context;
import android.graphics.Bitmap;
import android.location.Location;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.amap.api.maps.model.LatLng;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;

/* JADX INFO: loaded from: classes4.dex */
public final class el extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Bitmap f2443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Bitmap f2444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Bitmap f2445c;
    Bitmap d;
    Bitmap e;
    Bitmap f;
    ImageView g;
    IAMapDelegate h;
    boolean i;

    public final void a() {
        try {
            removeAllViews();
            Bitmap bitmap = this.f2443a;
            if (bitmap != null) {
                eb.a(bitmap);
            }
            Bitmap bitmap2 = this.f2444b;
            if (bitmap2 != null) {
                eb.a(bitmap2);
            }
            if (this.f2444b != null) {
                eb.a(this.f2445c);
            }
            this.f2443a = null;
            this.f2444b = null;
            this.f2445c = null;
            Bitmap bitmap3 = this.d;
            if (bitmap3 != null) {
                eb.a(bitmap3);
                this.d = null;
            }
            Bitmap bitmap4 = this.e;
            if (bitmap4 != null) {
                eb.a(bitmap4);
                this.e = null;
            }
            Bitmap bitmap5 = this.f;
            if (bitmap5 != null) {
                eb.a(bitmap5);
                this.f = null;
            }
        } catch (Throwable th) {
            jv.c(th, "LocationView", "destroy");
            th.printStackTrace();
        }
    }

    public el(Context context, IAMapDelegate iAMapDelegate) {
        super(context);
        this.i = false;
        this.h = iAMapDelegate;
        try {
            Bitmap bitmapA = eb.a(context, "location_selected.png");
            this.d = bitmapA;
            this.f2443a = eb.a(bitmapA, y.f3319b);
            Bitmap bitmapA2 = eb.a(context, "location_pressed.png");
            this.e = bitmapA2;
            this.f2444b = eb.a(bitmapA2, y.f3319b);
            Bitmap bitmapA3 = eb.a(context, "location_unselected.png");
            this.f = bitmapA3;
            this.f2445c = eb.a(bitmapA3, y.f3319b);
            ImageView imageView = new ImageView(context);
            this.g = imageView;
            imageView.setImageBitmap(this.f2443a);
            this.g.setClickable(true);
            this.g.setPadding(0, 20, 20, 0);
            this.g.setOnTouchListener(new View.OnTouchListener() { // from class: com.amap.api.col.3sl.el.1
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (!el.this.i) {
                        return false;
                    }
                    if (motionEvent.getAction() == 0) {
                        el.this.g.setImageBitmap(el.this.f2444b);
                    } else if (motionEvent.getAction() == 1) {
                        try {
                            el.this.g.setImageBitmap(el.this.f2443a);
                            el.this.h.setMyLocationEnabled(true);
                            Location myLocation = el.this.h.getMyLocation();
                            if (myLocation == null) {
                                return false;
                            }
                            LatLng latLng = new LatLng(myLocation.getLatitude(), myLocation.getLongitude());
                            el.this.h.showMyLocationOverlay(myLocation);
                            el.this.h.moveCamera(ap.a(latLng, el.this.h.getZoomLevel()));
                        } catch (Throwable th) {
                            jv.c(th, "LocationView", "onTouch");
                            th.printStackTrace();
                        }
                    }
                    return false;
                }
            });
            addView(this.g);
        } catch (Throwable th) {
            jv.c(th, "LocationView", "create");
            th.printStackTrace();
        }
    }

    public final void a(boolean z) {
        this.i = z;
        try {
            if (z) {
                this.g.setImageBitmap(this.f2443a);
            } else {
                this.g.setImageBitmap(this.f2445c);
            }
            this.g.invalidate();
        } catch (Throwable th) {
            jv.c(th, "LocationView", "showSelect");
            th.printStackTrace();
        }
    }
}
