package com.amap.api.col.p0003sl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.location.Location;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.amap.api.maps.model.LatLng;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import defpackage.a7s;
import defpackage.m2t;
import defpackage.ugt;
import defpackage.zns;

/* JADX INFO: loaded from: classes4.dex */
public final class el extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bitmap f6031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bitmap f6032b;
    public Bitmap c;
    public Bitmap d;
    public Bitmap e;
    public Bitmap f;
    public ImageView g;
    public IAMapDelegate h;
    public boolean i;

    public class a implements View.OnTouchListener {
        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (!el.this.i) {
                return false;
            }
            if (motionEvent.getAction() == 0) {
                el elVar = el.this;
                elVar.g.setImageBitmap(elVar.f6032b);
            } else if (motionEvent.getAction() == 1) {
                try {
                    el elVar2 = el.this;
                    elVar2.g.setImageBitmap(elVar2.f6031a);
                    el.this.h.setMyLocationEnabled(true);
                    Location myLocation = el.this.h.getMyLocation();
                    if (myLocation == null) {
                        return false;
                    }
                    LatLng latLng = new LatLng(myLocation.getLatitude(), myLocation.getLongitude());
                    el.this.h.showMyLocationOverlay(myLocation);
                    IAMapDelegate iAMapDelegate = el.this.h;
                    iAMapDelegate.moveCamera(a7s.h(latLng, iAMapDelegate.getZoomLevel()));
                } catch (Throwable th) {
                    m2t.r(th, "LocationView", "onTouch");
                    th.printStackTrace();
                }
            }
            return false;
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public el(Context context, IAMapDelegate iAMapDelegate) {
        super(context);
        this.i = false;
        this.h = iAMapDelegate;
        try {
            Bitmap bitmapL = zns.l(context, "location_selected.png");
            this.d = bitmapL;
            this.f6031a = zns.m(bitmapL, ugt.f35750b);
            Bitmap bitmapL2 = zns.l(context, "location_pressed.png");
            this.e = bitmapL2;
            this.f6032b = zns.m(bitmapL2, ugt.f35750b);
            Bitmap bitmapL3 = zns.l(context, "location_unselected.png");
            this.f = bitmapL3;
            this.c = zns.m(bitmapL3, ugt.f35750b);
            ImageView imageView = new ImageView(context);
            this.g = imageView;
            imageView.setImageBitmap(this.f6031a);
            this.g.setClickable(true);
            this.g.setPadding(0, 20, 20, 0);
            this.g.setOnTouchListener(new a());
            addView(this.g);
        } catch (Throwable th) {
            m2t.r(th, "LocationView", "create");
            th.printStackTrace();
        }
    }

    public final void a() {
        try {
            removeAllViews();
            Bitmap bitmap = this.f6031a;
            if (bitmap != null) {
                zns.C(bitmap);
            }
            Bitmap bitmap2 = this.f6032b;
            if (bitmap2 != null) {
                zns.C(bitmap2);
            }
            if (this.f6032b != null) {
                zns.C(this.c);
            }
            this.f6031a = null;
            this.f6032b = null;
            this.c = null;
            Bitmap bitmap3 = this.d;
            if (bitmap3 != null) {
                zns.C(bitmap3);
                this.d = null;
            }
            Bitmap bitmap4 = this.e;
            if (bitmap4 != null) {
                zns.C(bitmap4);
                this.e = null;
            }
            Bitmap bitmap5 = this.f;
            if (bitmap5 != null) {
                zns.C(bitmap5);
                this.f = null;
            }
        } catch (Throwable th) {
            m2t.r(th, "LocationView", "destroy");
            th.printStackTrace();
        }
    }

    public final void b(boolean z) {
        this.i = z;
        try {
            if (z) {
                this.g.setImageBitmap(this.f6031a);
            } else {
                this.g.setImageBitmap(this.c);
            }
            this.g.invalidate();
        } catch (Throwable th) {
            m2t.r(th, "LocationView", "showSelect");
            th.printStackTrace();
        }
    }
}
