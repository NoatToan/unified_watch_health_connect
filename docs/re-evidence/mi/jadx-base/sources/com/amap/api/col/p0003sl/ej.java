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
import defpackage.a7s;
import defpackage.m2t;
import defpackage.ugt;
import defpackage.zns;

/* JADX INFO: loaded from: classes4.dex */
public final class ej extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bitmap f6017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bitmap f6018b;
    public Bitmap c;
    public ImageView d;
    public IAMapDelegate e;
    public Matrix f;

    public class a implements View.OnTouchListener {
        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            try {
                if (!ej.this.e.isMaploaded()) {
                    return false;
                }
                if (motionEvent.getAction() == 0) {
                    ej ejVar = ej.this;
                    ejVar.d.setImageBitmap(ejVar.f6018b);
                } else if (motionEvent.getAction() == 1) {
                    ej ejVar2 = ej.this;
                    ejVar2.d.setImageBitmap(ejVar2.f6017a);
                    CameraPosition cameraPosition = ej.this.e.getCameraPosition();
                    ej.this.e.animateCamera(a7s.f(new CameraPosition(cameraPosition.target, cameraPosition.zoom, 0.0f, 0.0f)));
                }
            } catch (Throwable th) {
                m2t.r(th, "CompassView", "onTouch");
                th.printStackTrace();
            }
            return false;
        }
    }

    public ej(Context context, IAMapDelegate iAMapDelegate) {
        super(context);
        this.f = new Matrix();
        this.e = iAMapDelegate;
        try {
            Bitmap bitmapL = zns.l(context, "maps_dav_compass_needle_large.png");
            this.c = bitmapL;
            this.f6018b = zns.m(bitmapL, ugt.f35750b * 0.8f);
            Bitmap bitmapM = zns.m(this.c, ugt.f35750b * 0.7f);
            this.c = bitmapM;
            Bitmap bitmap = this.f6018b;
            if (bitmap != null && bitmapM != null) {
                this.f6017a = Bitmap.createBitmap(bitmap.getWidth(), this.f6018b.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(this.f6017a);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setFilterBitmap(true);
                canvas.drawBitmap(this.c, (this.f6018b.getWidth() - this.c.getWidth()) / 2.0f, (this.f6018b.getHeight() - this.c.getHeight()) / 2.0f, paint);
                ImageView imageView = new ImageView(context);
                this.d = imageView;
                imageView.setScaleType(ImageView.ScaleType.MATRIX);
                this.d.setImageBitmap(this.f6017a);
                this.d.setClickable(true);
                c();
                this.d.setOnTouchListener(new a());
                addView(this.d);
            }
        } catch (Throwable th) {
            m2t.r(th, "CompassView", "create");
            th.printStackTrace();
        }
    }

    public final void a() {
        try {
            removeAllViews();
            Bitmap bitmap = this.f6017a;
            if (bitmap != null) {
                zns.C(bitmap);
            }
            Bitmap bitmap2 = this.f6018b;
            if (bitmap2 != null) {
                zns.C(bitmap2);
            }
            Bitmap bitmap3 = this.c;
            if (bitmap3 != null) {
                zns.C(bitmap3);
            }
            Matrix matrix = this.f;
            if (matrix != null) {
                matrix.reset();
                this.f = null;
            }
            this.c = null;
            this.f6017a = null;
            this.f6018b = null;
        } catch (Throwable th) {
            m2t.r(th, "CompassView", "destroy");
            th.printStackTrace();
        }
    }

    public final void b(boolean z) {
        if (!z) {
            setVisibility(8);
        } else {
            setVisibility(0);
            c();
        }
    }

    public final void c() {
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
            m2t.r(th, "CompassView", "invalidateAngle");
            th.printStackTrace();
        }
    }
}
