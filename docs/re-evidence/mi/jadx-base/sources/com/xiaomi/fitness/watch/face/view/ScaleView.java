package com.xiaomi.fitness.watch.face.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import androidx.appcompat.widget.AppCompatImageView;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.watch.face.edit.photo.crop.OnImageLoadListener;
import com.xiaomi.fitness.watch.face.edit.photo.crop.OnPortraitScaleListener;
import com.xiaomi.fitness.watch.face.export.exportview.FaceIcon;
import com.xiaomi.fitness.watch.face.export.exportview.RectView;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import defpackage.dh8;
import java.io.File;

/* JADX INFO: loaded from: classes10.dex */
public class ScaleView extends AppCompatImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetector f13390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f13391b;
    public final Matrix c;
    public final ScaleGestureDetector d;
    public int e;
    public int f;
    public float g;
    public final float h;
    public final RectF i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Paint f13392k;
    public final Paint l;
    public PorterDuffXfermode m;
    public Bitmap n;
    public boolean o;
    public OnPortraitScaleListener p;
    public OnImageLoadListener q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f13393r;
    public final RectF s;

    public class a extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public a() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            if (ScaleView.this.getDrawable() == null) {
                return true;
            }
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            float scale = ScaleView.this.getScale();
            Logger.d("ScaleView", "onScale2222: " + scale + "  " + scaleFactor + "  " + ScaleView.this.g);
            if (scaleFactor * scale < ScaleView.this.g) {
                scaleFactor = ScaleView.this.g / scale;
            }
            ScaleView.this.c.postScale(scaleFactor, scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            ScaleView scaleView = ScaleView.this;
            scaleView.setImageMatrix(scaleView.c);
            if (ScaleView.this.p != null) {
                ScaleView.this.p.onScale(scaleFactor, scaleGestureDetector);
            }
            return true;
        }
    }

    public class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (ScaleView.this.getDrawable() == null) {
                return true;
            }
            float f3 = -f;
            float f4 = -f2;
            ScaleView.this.c.postTranslate(f3, f4);
            ScaleView.this.validateSide();
            if (ScaleView.this.p != null) {
                ScaleView.this.p.onMove(f3, f4);
            }
            ScaleView scaleView = ScaleView.this;
            scaleView.setImageMatrix(scaleView.c);
            Logger.d("ScaleView", "onScroll: " + f + "  " + f2);
            return true;
        }
    }

    public ScaleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float[] fArr = new float[9];
        this.f13391b = fArr;
        this.o = false;
        this.f13393r = true;
        this.s = new RectF();
        this.h = (DisplayUtil.getScreenWidth() - RectView.f13382b) / 2.0f;
        Matrix imageMatrix = getImageMatrix();
        this.c = imageMatrix;
        imageMatrix.getValues(fArr);
        this.i = new RectF();
        Paint paint = new Paint(1);
        this.f13392k = paint;
        this.l = new Paint(1);
        this.m = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        paint.setColor(2130706432);
        this.d = new ScaleGestureDetector(context, new a());
        this.f13390a = new GestureDetector(context, new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getScale() {
        this.c.getValues(this.f13391b);
        return this.f13391b[0];
    }

    public final RectF getMatrixRectF(Matrix matrix) {
        Drawable drawable = getDrawable();
        this.s.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        matrix.mapRect(this.s);
        return this.s;
    }

    public Bitmap h(boolean z, int i) {
        Product.Size size;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (size = DeviceModelExtKt.getSize(wearableDeviceModel)) == null) {
            return null;
        }
        if (AppUtil.INSTANCE.isDevChannel() && this.n.getHeight() == size.getHeight() && this.n.getWidth() == size.getWidth()) {
            return this.n;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), i == 2 || i == 3 || i == 8 || i == 7 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Path path = new Path();
        RectF rectF = this.i;
        float f = RectView.d;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.clipPath(path);
        draw(canvas);
        RectF rectF2 = this.i;
        int i2 = (int) rectF2.left;
        int i3 = (int) rectF2.top;
        if (i2 <= 0 || i3 <= 0) {
            return null;
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, i2, i3, Math.min((int) rectF2.width(), bitmapCreateBitmap.getWidth() - i2), Math.min((int) this.i.height(), bitmapCreateBitmap.getHeight() - i3));
        Logger.d(FaceIcon.TAG, "crop: " + bitmapCreateBitmap2.getWidth() + "; " + bitmapCreateBitmap2.getHeight());
        return z ? bitmapCreateBitmap2 : Bitmap.createScaledBitmap(bitmapCreateBitmap2, (int) (size.getWidth() * 1.0f), (int) (size.getHeight() * 1.0f), true);
    }

    public int i(int i, int i2, BitmapFactory.Options options, boolean z) {
        int i3 = z ? options.outHeight : options.outWidth;
        int i4 = z ? options.outWidth : options.outHeight;
        if (i3 > i4) {
            i2 = i;
            i = i2;
        }
        int iRound = (i3 > i || i4 > i2) ? Math.round(Math.min(i3 / i, i4 / i2)) : 1;
        Logger.d("ScaleView", "getFitInSampleSize: " + i3 + "  " + i4 + "  " + iRound);
        return iRound;
    }

    public Bitmap j(String str) {
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            return null;
        }
        int iA = dh8.a(str);
        boolean zB = dh8.b(iA);
        Logger.d("ScaleView", "getFitSampleBitmap: path=" + str + "  " + iA + "; rotate = " + zB);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = i(HMSedentaryConfig.INGORE_START_INDEX, Constants.FHD_WIDTH, options, zB);
        options.inMutable = true;
        options.inJustDecodeBounds = false;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
        if (bitmapDecodeFile == null) {
            return null;
        }
        Logger.d("ScaleView", "getFitSampleBitmap: pre = " + options.outWidth + ";" + options.outHeight + "-----" + bitmapDecodeFile.getWidth() + ";" + bitmapDecodeFile.getHeight());
        if (!zB) {
            return bitmapDecodeFile;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(iA);
        return Bitmap.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix, false);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.n;
        if (bitmap == null) {
            return;
        }
        if (this.o) {
            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
            this.l.setColor(-16711936);
            this.l.setXfermode(this.m);
            if (this.f13393r) {
                canvas.drawRect(0.0f, 0.0f, this.e, this.f, this.f13392k);
                RectF rectF = this.i;
                float f = RectView.d;
                canvas.drawRoundRect(rectF, f, f, this.l);
            }
            this.l.setXfermode(null);
            canvas.restoreToCount(iSaveLayer);
            return;
        }
        this.o = true;
        int height = bitmap.getHeight();
        int width = this.n.getWidth();
        float f2 = width;
        float f3 = RectView.f13382b / f2;
        float f4 = height;
        float f5 = RectView.c / f4;
        Logger.d("ScaleView", "onMeasure: inH = " + height + "; inW = " + width + "; scaleX = " + f3 + "; scaleY = " + f5);
        float fMax = Math.max(f3, f5);
        this.g = fMax;
        if (f3 <= f5) {
            this.c.postScale(fMax, fMax);
            float f6 = ((f2 * this.g) - this.e) / 2.0f;
            Logger.d("ScaleView", "onMeasure: transx = " + f6);
            this.c.postTranslate(-f6, this.j);
        } else {
            this.c.postScale(fMax, fMax);
            float f7 = this.j - (((f4 * this.g) - RectView.c) / 2.0f);
            Logger.d("ScaleView", "onMeasure: transy = " + f7);
            this.c.postTranslate(this.h, f7);
        }
        RectF rectF2 = this.i;
        float f8 = this.h;
        float f9 = this.j;
        rectF2.set((int) f8, (int) f9, (int) (f8 + RectView.f13382b), (int) (f9 + RectView.c));
        setImageMatrix(this.c);
        setImageBitmap(this.n);
        OnImageLoadListener onImageLoadListener = this.q;
        if (onImageLoadListener != null) {
            onImageLoadListener.onLoadDone();
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.e = getWidth();
        int height = getHeight();
        this.f = height;
        this.j = (height - RectView.c) / 2.0f;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.p != null && motionEvent.getActionMasked() == 1) {
            this.p.onchangeEnd();
        }
        this.f13390a.onTouchEvent(motionEvent);
        return this.d.onTouchEvent(motionEvent);
    }

    public void setImage(Bitmap bitmap) {
        this.n = bitmap;
        invalidate();
    }

    public void setNeedDst(boolean z) {
        this.f13393r = z;
        invalidate();
    }

    public void setOnImageLoadListener(OnImageLoadListener onImageLoadListener) {
        this.q = onImageLoadListener;
    }

    public void setOnPortraitScaleListener(OnPortraitScaleListener onPortraitScaleListener) {
        this.p = onPortraitScaleListener;
    }

    public final void validateSide() {
        float f;
        RectF matrixRectF = getMatrixRectF(this.c);
        int i = this.e;
        float f2 = matrixRectF.left;
        float f3 = this.h;
        float f4 = 0.0f;
        if (f2 > f3) {
            f = (-f2) + f3;
        } else {
            float f5 = matrixRectF.right;
            float f6 = i;
            f = f5 < f6 - f3 ? (f6 - f3) - f5 : 0.0f;
        }
        float f7 = matrixRectF.top;
        float f8 = this.j;
        if (f7 > f8) {
            f4 = (-f7) + f8;
        } else {
            float f9 = matrixRectF.bottom;
            float f10 = RectView.c;
            if (f9 < f8 + f10) {
                f4 = (f8 + f10) - f9;
            }
        }
        this.c.postTranslate(f, f4);
        OnPortraitScaleListener onPortraitScaleListener = this.p;
        if (onPortraitScaleListener != null) {
            onPortraitScaleListener.onMove(f, f4);
        }
    }

    public ScaleView(Context context) {
        this(context, null);
    }

    public ScaleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
