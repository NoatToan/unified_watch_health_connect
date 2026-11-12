package com.amap.api.col.p0003sl;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;

/* JADX INFO: loaded from: classes4.dex */
final class er extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Bitmap f2471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Bitmap f2472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bitmap f2473c;
    private Bitmap d;
    private Bitmap e;
    private Bitmap f;
    private Bitmap g;
    private Bitmap h;
    private Bitmap i;
    private Bitmap j;
    private Bitmap k;
    private Bitmap l;
    private ImageView m;
    private ImageView n;
    private IAMapDelegate o;

    public final void a() {
        try {
            removeAllViews();
            eb.a(this.f2471a);
            eb.a(this.f2472b);
            eb.a(this.f2473c);
            eb.a(this.d);
            eb.a(this.e);
            eb.a(this.f);
            this.f2471a = null;
            this.f2472b = null;
            this.f2473c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            Bitmap bitmap = this.g;
            if (bitmap != null) {
                eb.a(bitmap);
                this.g = null;
            }
            Bitmap bitmap2 = this.h;
            if (bitmap2 != null) {
                eb.a(bitmap2);
                this.h = null;
            }
            Bitmap bitmap3 = this.i;
            if (bitmap3 != null) {
                eb.a(bitmap3);
                this.i = null;
            }
            Bitmap bitmap4 = this.j;
            if (bitmap4 != null) {
                eb.a(bitmap4);
                this.g = null;
            }
            Bitmap bitmap5 = this.k;
            if (bitmap5 != null) {
                eb.a(bitmap5);
                this.k = null;
            }
            Bitmap bitmap6 = this.l;
            if (bitmap6 != null) {
                eb.a(bitmap6);
                this.l = null;
            }
            this.m = null;
            this.n = null;
        } catch (Throwable th) {
            jv.c(th, "ZoomControllerView", "destory");
            th.printStackTrace();
        }
    }

    public er(Context context, IAMapDelegate iAMapDelegate) {
        super(context);
        this.o = iAMapDelegate;
        try {
            Bitmap bitmapA = eb.a(context, "zoomin_selected.png");
            this.g = bitmapA;
            this.f2471a = eb.a(bitmapA, y.f3319b);
            Bitmap bitmapA2 = eb.a(context, "zoomin_unselected.png");
            this.h = bitmapA2;
            this.f2472b = eb.a(bitmapA2, y.f3319b);
            Bitmap bitmapA3 = eb.a(context, "zoomout_selected.png");
            this.i = bitmapA3;
            this.f2473c = eb.a(bitmapA3, y.f3319b);
            Bitmap bitmapA4 = eb.a(context, "zoomout_unselected.png");
            this.j = bitmapA4;
            this.d = eb.a(bitmapA4, y.f3319b);
            Bitmap bitmapA5 = eb.a(context, "zoomin_pressed.png");
            this.k = bitmapA5;
            this.e = eb.a(bitmapA5, y.f3319b);
            Bitmap bitmapA6 = eb.a(context, "zoomout_pressed.png");
            this.l = bitmapA6;
            this.f = eb.a(bitmapA6, y.f3319b);
            ImageView imageView = new ImageView(context);
            this.m = imageView;
            imageView.setImageBitmap(this.f2471a);
            this.m.setClickable(true);
            ImageView imageView2 = new ImageView(context);
            this.n = imageView2;
            imageView2.setImageBitmap(this.f2473c);
            this.n.setClickable(true);
            this.m.setOnTouchListener(new View.OnTouchListener() { // from class: com.amap.api.col.3sl.er.1
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    try {
                        if (er.this.o.getZoomLevel() < er.this.o.getMaxZoomLevel() && er.this.o.isMaploaded()) {
                            if (motionEvent.getAction() == 0) {
                                er.this.m.setImageBitmap(er.this.e);
                            } else if (motionEvent.getAction() == 1) {
                                er.this.m.setImageBitmap(er.this.f2471a);
                                try {
                                    er.this.o.animateCamera(ap.a());
                                } catch (RemoteException e) {
                                    jv.c(e, "ZoomControllerView", "zoomin ontouch");
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
            });
            this.n.setOnTouchListener(new View.OnTouchListener() { // from class: com.amap.api.col.3sl.er.2
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    try {
                        if (er.this.o.getZoomLevel() > er.this.o.getMinZoomLevel() && er.this.o.isMaploaded()) {
                            if (motionEvent.getAction() == 0) {
                                er.this.n.setImageBitmap(er.this.f);
                            } else if (motionEvent.getAction() == 1) {
                                er.this.n.setImageBitmap(er.this.f2473c);
                                er.this.o.animateCamera(ap.b());
                            }
                            return false;
                        }
                        return false;
                    } catch (Throwable th) {
                        jv.c(th, "ZoomControllerView", "zoomout ontouch");
                        th.printStackTrace();
                    }
                }
            });
            this.m.setPadding(0, 0, 20, -2);
            this.n.setPadding(0, 0, 20, 20);
            setOrientation(1);
            addView(this.m);
            addView(this.n);
        } catch (Throwable th) {
            jv.c(th, "ZoomControllerView", "create");
            th.printStackTrace();
        }
    }

    public final void a(float f) {
        try {
            if (f < this.o.getMaxZoomLevel() && f > this.o.getMinZoomLevel()) {
                this.m.setImageBitmap(this.f2471a);
                this.n.setImageBitmap(this.f2473c);
            } else if (f == this.o.getMinZoomLevel()) {
                this.n.setImageBitmap(this.d);
                this.m.setImageBitmap(this.f2471a);
            } else if (f == this.o.getMaxZoomLevel()) {
                this.m.setImageBitmap(this.f2472b);
                this.n.setImageBitmap(this.f2473c);
            }
        } catch (Throwable th) {
            jv.c(th, "ZoomControllerView", "setZoomBitmap");
            th.printStackTrace();
        }
    }

    public final void a(int i) {
        try {
            em.a aVar = (em.a) getLayoutParams();
            if (i == 1) {
                aVar.e = 16;
            } else if (i == 2) {
                aVar.e = 80;
            }
            setLayoutParams(aVar);
        } catch (Throwable th) {
            jv.c(th, "ZoomControllerView", "setZoomPosition");
            th.printStackTrace();
        }
    }

    public final void a(boolean z) {
        if (z) {
            setVisibility(0);
        } else {
            setVisibility(8);
        }
    }
}
