package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.amap.api.maps.model.CameraPosition;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;

/* JADX INFO: loaded from: classes2.dex */
public final class ff extends LinearLayout {
    public Bitmap a;
    public Bitmap b;
    public Bitmap c;
    public ImageView d;
    public IAMapDelegate e;
    public Matrix f;

    public ff(Context context, IAMapDelegate iAMapDelegate) {
        super(context);
        this.f = new Matrix();
        this.e = iAMapDelegate;
        try {
            Bitmap bitmapA = er.a(context, "maps_dav_compass_needle_large.png");
            this.c = bitmapA;
            this.b = er.a(bitmapA, l.a * 0.8f);
            Bitmap bitmapA2 = er.a(this.c, l.a * 0.7f);
            this.c = bitmapA2;
            Bitmap bitmap = this.b;
            if (bitmap != null && bitmapA2 != null) {
                this.a = Bitmap.createBitmap(bitmap.getWidth(), this.b.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(this.a);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setFilterBitmap(true);
                canvas.drawBitmap(this.c, (this.b.getWidth() - this.c.getWidth()) / 2.0f, (this.b.getHeight() - this.c.getHeight()) / 2.0f, paint);
                ImageView imageView = new ImageView(context);
                this.d = imageView;
                imageView.setScaleType(ImageView.ScaleType.MATRIX);
                this.d.setImageBitmap(this.a);
                this.d.setClickable(true);
                b();
                this.d.setOnTouchListener(new View.OnTouchListener() { // from class: com.amap.api.mapcore.util.ff.1
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        try {
                            if (!ff.this.e.isMaploaded()) {
                                return false;
                            }
                            if (motionEvent.getAction() == 0) {
                                ff ffVar = ff.this;
                                ffVar.d.setImageBitmap(ffVar.b);
                            } else if (motionEvent.getAction() == 1) {
                                ff ffVar2 = ff.this;
                                ffVar2.d.setImageBitmap(ffVar2.a);
                                CameraPosition cameraPosition = ff.this.e.getCameraPosition();
                                ff.this.e.animateCamera(af.a(new CameraPosition(cameraPosition.target, cameraPosition.zoom, 0.0f, 0.0f)));
                            }
                        } catch (Throwable th) {
                            hn.c(th, "CompassView", "onTouch");
                            th.printStackTrace();
                        }
                        return false;
                    }
                });
                addView(this.d);
            }
        } catch (Throwable th) {
            hn.c(th, "CompassView", "create");
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
            Bitmap bitmap3 = this.c;
            if (bitmap3 != null) {
                er.c(bitmap3);
            }
            Matrix matrix = this.f;
            if (matrix != null) {
                matrix.reset();
                this.f = null;
            }
            this.c = null;
            this.a = null;
            this.b = null;
        } catch (Throwable th) {
            hn.c(th, "CompassView", "destroy");
            th.printStackTrace();
        }
    }

    public final void b() {
        try {
            IAMapDelegate iAMapDelegate = this.e;
            if (iAMapDelegate == null || this.d == null) {
                return;
            }
            float cameraDegree = iAMapDelegate.getCameraDegree(1);
            float mapAngle = this.e.getMapAngle(1);
            if (this.f == null) {
                this.f = new Matrix();
            }
            this.f.reset();
            this.f.postRotate(-mapAngle, this.d.getDrawable().getBounds().width() / 2.0f, this.d.getDrawable().getBounds().height() / 2.0f);
            this.f.postScale(1.0f, (float) Math.cos((((double) cameraDegree) * 3.141592653589793d) / 180.0d), this.d.getDrawable().getBounds().width() / 2.0f, this.d.getDrawable().getBounds().height() / 2.0f);
            this.d.setImageMatrix(this.f);
        } catch (Throwable th) {
            hn.c(th, "CompassView", "invalidateAngle");
            th.printStackTrace();
        }
    }

    public final void a(boolean z) {
        if (z) {
            setVisibility(0);
            b();
        } else {
            setVisibility(8);
        }
    }
}
