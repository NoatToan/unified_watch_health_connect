package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;

/* JADX INFO: loaded from: classes2.dex */
final class fo extends LinearLayout {
    private Bitmap a;
    private Bitmap b;
    private Bitmap c;
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

    public fo(Context context, IAMapDelegate iAMapDelegate) {
        super(context);
        this.o = iAMapDelegate;
        try {
            Bitmap bitmapA = er.a(context, "zoomin_selected.png");
            this.g = bitmapA;
            this.a = er.a(bitmapA, l.a);
            Bitmap bitmapA2 = er.a(context, "zoomin_unselected.png");
            this.h = bitmapA2;
            this.b = er.a(bitmapA2, l.a);
            Bitmap bitmapA3 = er.a(context, "zoomout_selected.png");
            this.i = bitmapA3;
            this.c = er.a(bitmapA3, l.a);
            Bitmap bitmapA4 = er.a(context, "zoomout_unselected.png");
            this.j = bitmapA4;
            this.d = er.a(bitmapA4, l.a);
            Bitmap bitmapA5 = er.a(context, "zoomin_pressed.png");
            this.k = bitmapA5;
            this.e = er.a(bitmapA5, l.a);
            Bitmap bitmapA6 = er.a(context, "zoomout_pressed.png");
            this.l = bitmapA6;
            this.f = er.a(bitmapA6, l.a);
            ImageView imageView = new ImageView(context);
            this.m = imageView;
            imageView.setImageBitmap(this.a);
            this.m.setClickable(true);
            ImageView imageView2 = new ImageView(context);
            this.n = imageView2;
            imageView2.setImageBitmap(this.c);
            this.n.setClickable(true);
            this.m.setOnTouchListener(new View.OnTouchListener() { // from class: com.amap.api.mapcore.util.fo.1
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    try {
                        if (fo.this.o.getZoomLevel() < fo.this.o.getMaxZoomLevel() && fo.this.o.isMaploaded()) {
                            if (motionEvent.getAction() == 0) {
                                fo.this.m.setImageBitmap(fo.this.e);
                            } else if (motionEvent.getAction() == 1) {
                                fo.this.m.setImageBitmap(fo.this.a);
                                try {
                                    fo.this.o.animateCamera(af.a());
                                } catch (RemoteException e) {
                                    hn.c(e, "ZoomControllerView", "zoomin ontouch");
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
            this.n.setOnTouchListener(new View.OnTouchListener() { // from class: com.amap.api.mapcore.util.fo.2
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    try {
                        if (fo.this.o.getZoomLevel() > fo.this.o.getMinZoomLevel() && fo.this.o.isMaploaded()) {
                            if (motionEvent.getAction() == 0) {
                                fo.this.n.setImageBitmap(fo.this.f);
                            } else if (motionEvent.getAction() == 1) {
                                fo.this.n.setImageBitmap(fo.this.c);
                                fo.this.o.animateCamera(af.b());
                            }
                            return false;
                        }
                        return false;
                    } catch (Throwable th) {
                        hn.c(th, "ZoomControllerView", "zoomout ontouch");
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
            hn.c(th, "ZoomControllerView", "create");
            th.printStackTrace();
        }
    }

    public final void a() {
        try {
            removeAllViews();
            er.c(this.a);
            er.c(this.b);
            er.c(this.c);
            er.c(this.d);
            er.c(this.e);
            er.c(this.f);
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            Bitmap bitmap = this.g;
            if (bitmap != null) {
                er.c(bitmap);
                this.g = null;
            }
            Bitmap bitmap2 = this.h;
            if (bitmap2 != null) {
                er.c(bitmap2);
                this.h = null;
            }
            Bitmap bitmap3 = this.i;
            if (bitmap3 != null) {
                er.c(bitmap3);
                this.i = null;
            }
            Bitmap bitmap4 = this.j;
            if (bitmap4 != null) {
                er.c(bitmap4);
                this.g = null;
            }
            Bitmap bitmap5 = this.k;
            if (bitmap5 != null) {
                er.c(bitmap5);
                this.k = null;
            }
            Bitmap bitmap6 = this.l;
            if (bitmap6 != null) {
                er.c(bitmap6);
                this.l = null;
            }
            this.m = null;
            this.n = null;
        } catch (Throwable th) {
            hn.c(th, "ZoomControllerView", "destory");
            th.printStackTrace();
        }
    }

    public final void a(float f) {
        try {
            if (f < this.o.getMaxZoomLevel() && f > this.o.getMinZoomLevel()) {
                this.m.setImageBitmap(this.a);
                this.n.setImageBitmap(this.c);
            } else if (f == this.o.getMinZoomLevel()) {
                this.n.setImageBitmap(this.d);
                this.m.setImageBitmap(this.a);
            } else if (f == this.o.getMaxZoomLevel()) {
                this.m.setImageBitmap(this.b);
                this.n.setImageBitmap(this.c);
            }
        } catch (Throwable th) {
            hn.c(th, "ZoomControllerView", "setZoomBitmap");
            th.printStackTrace();
        }
    }

    public final void a(int i) {
        try {
            fi.a aVar = (fi.a) getLayoutParams();
            if (i == 1) {
                aVar.e = 16;
            } else if (i == 2) {
                aVar.e = 80;
            }
            setLayoutParams(aVar);
        } catch (Throwable th) {
            hn.c(th, "ZoomControllerView", "setZoomPosition");
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
