package com.amap.api.mapcore.util;

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

/* JADX INFO: loaded from: classes2.dex */
public final class fh extends LinearLayout {
    public Bitmap a;
    public Bitmap b;
    public Bitmap c;
    public Bitmap d;
    public Bitmap e;
    public Bitmap f;
    public ImageView g;
    public IAMapDelegate h;
    public boolean i;

    @SuppressLint({"ClickableViewAccessibility"})
    public fh(Context context, IAMapDelegate iAMapDelegate) {
        super(context);
        this.i = false;
        this.h = iAMapDelegate;
        try {
            Bitmap bitmapA = er.a(context, "location_selected.png");
            this.d = bitmapA;
            this.a = er.a(bitmapA, l.a);
            Bitmap bitmapA2 = er.a(context, "location_pressed.png");
            this.e = bitmapA2;
            this.b = er.a(bitmapA2, l.a);
            Bitmap bitmapA3 = er.a(context, "location_unselected.png");
            this.f = bitmapA3;
            this.c = er.a(bitmapA3, l.a);
            ImageView imageView = new ImageView(context);
            this.g = imageView;
            imageView.setImageBitmap(this.a);
            this.g.setClickable(true);
            this.g.setPadding(0, 20, 20, 0);
            this.g.setOnTouchListener(new View.OnTouchListener() { // from class: com.amap.api.mapcore.util.fh.1
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (!fh.this.i) {
                        return false;
                    }
                    if (motionEvent.getAction() == 0) {
                        fh fhVar = fh.this;
                        fhVar.g.setImageBitmap(fhVar.b);
                    } else if (motionEvent.getAction() == 1) {
                        try {
                            fh fhVar2 = fh.this;
                            fhVar2.g.setImageBitmap(fhVar2.a);
                            fh.this.h.setMyLocationEnabled(true);
                            Location myLocation = fh.this.h.getMyLocation();
                            if (myLocation == null) {
                                return false;
                            }
                            LatLng latLng = new LatLng(myLocation.getLatitude(), myLocation.getLongitude());
                            fh.this.h.showMyLocationOverlay(myLocation);
                            IAMapDelegate iAMapDelegate2 = fh.this.h;
                            iAMapDelegate2.moveCamera(af.a(latLng, iAMapDelegate2.getZoomLevel()));
                        } catch (Throwable th) {
                            hn.c(th, "LocationView", "onTouch");
                            th.printStackTrace();
                        }
                    }
                    return false;
                }
            });
            addView(this.g);
        } catch (Throwable th) {
            hn.c(th, "LocationView", "create");
            th.printStackTrace();
        }
    }

    public final void a() {
        try {
            removeAllViews();
            Bitmap bitmap = this.a;
            if (bitmap != null) {
                er.c(bitmap);
            }
            Bitmap bitmap2 = this.b;
            if (bitmap2 != null) {
                er.c(bitmap2);
            }
            if (this.b != null) {
                er.c(this.c);
            }
            this.a = null;
            this.b = null;
            this.c = null;
            Bitmap bitmap3 = this.d;
            if (bitmap3 != null) {
                er.c(bitmap3);
                this.d = null;
            }
            Bitmap bitmap4 = this.e;
            if (bitmap4 != null) {
                er.c(bitmap4);
                this.e = null;
            }
            Bitmap bitmap5 = this.f;
            if (bitmap5 != null) {
                er.c(bitmap5);
                this.f = null;
            }
        } catch (Throwable th) {
            hn.c(th, "LocationView", "destroy");
            th.printStackTrace();
        }
    }

    public final void a(boolean z) {
        this.i = z;
        try {
            if (z) {
                this.g.setImageBitmap(this.a);
            } else {
                this.g.setImageBitmap(this.c);
            }
            this.g.invalidate();
        } catch (Throwable th) {
            hn.c(th, "LocationView", "showSelect");
            th.printStackTrace();
        }
    }
}
