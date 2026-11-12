package com.amap.api.col.p0003sl;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import defpackage.a7s;
import defpackage.m2t;
import defpackage.ugt;
import defpackage.zns;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bitmap f6250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bitmap f6251b;
    public Bitmap c;
    public Bitmap d;
    public Bitmap e;
    public Bitmap f;
    public Bitmap g;
    public Bitmap h;
    public Bitmap i;
    public Bitmap j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Bitmap f6252k;
    public Bitmap l;
    public ImageView m;
    public ImageView n;
    public IAMapDelegate o;

    public class a implements View.OnTouchListener {
        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            try {
                if (t.this.o.getZoomLevel() < t.this.o.getMaxZoomLevel() && t.this.o.isMaploaded()) {
                    if (motionEvent.getAction() == 0) {
                        t.this.m.setImageBitmap(t.this.e);
                    } else if (motionEvent.getAction() == 1) {
                        t.this.m.setImageBitmap(t.this.f6250a);
                        try {
                            t.this.o.animateCamera(a7s.a());
                        } catch (RemoteException e) {
                            m2t.r(e, "ZoomControllerView", "zoomin ontouch");
                            e.printStackTrace();
                        }
                    }
                    return false;
                }
                return false;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public class b implements View.OnTouchListener {
        public b() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            try {
                if (t.this.o.getZoomLevel() > t.this.o.getMinZoomLevel() && t.this.o.isMaploaded()) {
                    if (motionEvent.getAction() == 0) {
                        t.this.n.setImageBitmap(t.this.f);
                    } else if (motionEvent.getAction() == 1) {
                        t.this.n.setImageBitmap(t.this.c);
                        t.this.o.animateCamera(a7s.l());
                    }
                    return false;
                }
                return false;
            } catch (Throwable th) {
                m2t.r(th, "ZoomControllerView", "zoomout ontouch");
                th.printStackTrace();
            }
        }
    }

    public t(Context context, IAMapDelegate iAMapDelegate) {
        super(context);
        this.o = iAMapDelegate;
        try {
            Bitmap bitmapL = zns.l(context, "zoomin_selected.png");
            this.g = bitmapL;
            this.f6250a = zns.m(bitmapL, ugt.f35750b);
            Bitmap bitmapL2 = zns.l(context, "zoomin_unselected.png");
            this.h = bitmapL2;
            this.f6251b = zns.m(bitmapL2, ugt.f35750b);
            Bitmap bitmapL3 = zns.l(context, "zoomout_selected.png");
            this.i = bitmapL3;
            this.c = zns.m(bitmapL3, ugt.f35750b);
            Bitmap bitmapL4 = zns.l(context, "zoomout_unselected.png");
            this.j = bitmapL4;
            this.d = zns.m(bitmapL4, ugt.f35750b);
            Bitmap bitmapL5 = zns.l(context, "zoomin_pressed.png");
            this.f6252k = bitmapL5;
            this.e = zns.m(bitmapL5, ugt.f35750b);
            Bitmap bitmapL6 = zns.l(context, "zoomout_pressed.png");
            this.l = bitmapL6;
            this.f = zns.m(bitmapL6, ugt.f35750b);
            ImageView imageView = new ImageView(context);
            this.m = imageView;
            imageView.setImageBitmap(this.f6250a);
            this.m.setClickable(true);
            ImageView imageView2 = new ImageView(context);
            this.n = imageView2;
            imageView2.setImageBitmap(this.c);
            this.n.setClickable(true);
            this.m.setOnTouchListener(new a());
            this.n.setOnTouchListener(new b());
            this.m.setPadding(0, 0, 20, -2);
            this.n.setPadding(0, 0, 20, 20);
            setOrientation(1);
            addView(this.m);
            addView(this.n);
        } catch (Throwable th) {
            m2t.r(th, "ZoomControllerView", "create");
            th.printStackTrace();
        }
    }

    public final void b() {
        try {
            removeAllViews();
            zns.C(this.f6250a);
            zns.C(this.f6251b);
            zns.C(this.c);
            zns.C(this.d);
            zns.C(this.e);
            zns.C(this.f);
            this.f6250a = null;
            this.f6251b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            Bitmap bitmap = this.g;
            if (bitmap != null) {
                zns.C(bitmap);
                this.g = null;
            }
            Bitmap bitmap2 = this.h;
            if (bitmap2 != null) {
                zns.C(bitmap2);
                this.h = null;
            }
            Bitmap bitmap3 = this.i;
            if (bitmap3 != null) {
                zns.C(bitmap3);
                this.i = null;
            }
            Bitmap bitmap4 = this.j;
            if (bitmap4 != null) {
                zns.C(bitmap4);
                this.g = null;
            }
            Bitmap bitmap5 = this.f6252k;
            if (bitmap5 != null) {
                zns.C(bitmap5);
                this.f6252k = null;
            }
            Bitmap bitmap6 = this.l;
            if (bitmap6 != null) {
                zns.C(bitmap6);
                this.l = null;
            }
            this.m = null;
            this.n = null;
        } catch (Throwable th) {
            m2t.r(th, "ZoomControllerView", "destory");
            th.printStackTrace();
        }
    }

    public final void c(float f) {
        try {
            if (f < this.o.getMaxZoomLevel() && f > this.o.getMinZoomLevel()) {
                this.m.setImageBitmap(this.f6250a);
                this.n.setImageBitmap(this.c);
            } else if (f == this.o.getMinZoomLevel()) {
                this.n.setImageBitmap(this.d);
                this.m.setImageBitmap(this.f6250a);
            } else if (f == this.o.getMaxZoomLevel()) {
                this.m.setImageBitmap(this.f6251b);
                this.n.setImageBitmap(this.c);
            }
        } catch (Throwable th) {
            m2t.r(th, "ZoomControllerView", "setZoomBitmap");
            th.printStackTrace();
        }
    }

    public final void d(int i) {
        try {
            em.c cVar = (em.c) getLayoutParams();
            if (i == 1) {
                cVar.e = 16;
            } else if (i == 2) {
                cVar.e = 80;
            }
            setLayoutParams(cVar);
        } catch (Throwable th) {
            m2t.r(th, "ZoomControllerView", "setZoomPosition");
            th.printStackTrace();
        }
    }

    public final void e(boolean z) {
        if (z) {
            setVisibility(0);
        } else {
            setVisibility(8);
        }
    }
}
