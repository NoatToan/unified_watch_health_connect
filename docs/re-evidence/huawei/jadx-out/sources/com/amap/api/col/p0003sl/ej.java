package com.amap.api.col.p0003sl;

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

/* JADX INFO: loaded from: classes4.dex */
public final class ej extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Bitmap f2426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Bitmap f2427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Bitmap f2428c;
    ImageView d;
    IAMapDelegate e;
    Matrix f;

    public final void a() {
        try {
            removeAllViews();
            Bitmap bitmap = this.f2426a;
            if (bitmap != null) {
                eb.a(bitmap);
            }
            Bitmap bitmap2 = this.f2427b;
            if (bitmap2 != null) {
                eb.a(bitmap2);
            }
            Bitmap bitmap3 = this.f2428c;
            if (bitmap3 != null) {
                eb.a(bitmap3);
            }
            Matrix matrix = this.f;
            if (matrix != null) {
                matrix.reset();
                this.f = null;
            }
            this.f2428c = null;
            this.f2426a = null;
            this.f2427b = null;
        } catch (Throwable th) {
            jv.c(th, "CompassView", "destroy");
            th.printStackTrace();
        }
    }

    public ej(Context context, IAMapDelegate iAMapDelegate) {
        super(context);
        this.f = new Matrix();
        this.e = iAMapDelegate;
        try {
            Bitmap bitmapA = eb.a(context, "maps_dav_compass_needle_large.png");
            this.f2428c = bitmapA;
            this.f2427b = eb.a(bitmapA, y.f3319b * 0.8f);
            Bitmap bitmapA2 = eb.a(this.f2428c, y.f3319b * 0.7f);
            this.f2428c = bitmapA2;
            Bitmap bitmap = this.f2427b;
            if (bitmap != null && bitmapA2 != null) {
                this.f2426a = Bitmap.createBitmap(bitmap.getWidth(), this.f2427b.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(this.f2426a);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setFilterBitmap(true);
                canvas.drawBitmap(this.f2428c, (this.f2427b.getWidth() - this.f2428c.getWidth()) / 2.0f, (this.f2427b.getHeight() - this.f2428c.getHeight()) / 2.0f, paint);
                ImageView imageView = new ImageView(context);
                this.d = imageView;
                imageView.setScaleType(ImageView.ScaleType.MATRIX);
                this.d.setImageBitmap(this.f2426a);
                this.d.setClickable(true);
                b();
                this.d.setOnTouchListener(new View.OnTouchListener() { // from class: com.amap.api.col.3sl.ej.1
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        try {
                            if (!ej.this.e.isMaploaded()) {
                                return false;
                            }
                            if (motionEvent.getAction() == 0) {
                                ej.this.d.setImageBitmap(ej.this.f2427b);
                            } else if (motionEvent.getAction() == 1) {
                                ej.this.d.setImageBitmap(ej.this.f2426a);
                                CameraPosition cameraPosition = ej.this.e.getCameraPosition();
                                ej.this.e.animateCamera(ap.a(new CameraPosition(cameraPosition.target, cameraPosition.zoom, 0.0f, 0.0f)));
                            }
                        } catch (Throwable th) {
                            jv.c(th, "CompassView", "onTouch");
                            th.printStackTrace();
                        }
                        return false;
                    }
                });
                addView(this.d);
            }
        } catch (Throwable th) {
            jv.c(th, "CompassView", "create");
            th.printStackTrace();
        }
    }

    public final void b() {
        try {
            IAMapDelegate iAMapDelegate = this.e;
            if (iAMapDelegate == null || this.d == null) {
                return;
            }
            int engineIDWithType = iAMapDelegate.getGLMapEngine() != null ? this.e.getGLMapEngine().getEngineIDWithType(1) : 0;
            float cameraDegree = this.e.getCameraDegree(engineIDWithType);
            float mapAngle = this.e.getMapAngle(engineIDWithType);
            if (this.f == null) {
                this.f = new Matrix();
            }
            this.f.reset();
            this.f.postRotate(-mapAngle, this.d.getDrawable().getBounds().width() / 2.0f, this.d.getDrawable().getBounds().height() / 2.0f);
            this.f.postScale(1.0f, (float) Math.cos((((double) cameraDegree) * 3.141592653589793d) / 180.0d), this.d.getDrawable().getBounds().width() / 2.0f, this.d.getDrawable().getBounds().height() / 2.0f);
            this.d.setImageMatrix(this.f);
        } catch (Throwable th) {
            jv.c(th, "CompassView", "invalidateAngle");
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
