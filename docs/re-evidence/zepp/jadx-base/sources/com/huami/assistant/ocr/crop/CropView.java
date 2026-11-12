package com.huami.assistant.ocr.crop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.WindowManager;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.huami.assistant.ocr.util.ImageUtil;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class CropView extends View {
    private float a;
    private float b;
    private float[] c;
    private Matrix d;
    private Bitmap e;
    private GestureDetector f;
    private ScaleGestureDetector g;
    private ScaleGestureDetector.OnScaleGestureListener h;
    public int i;
    private Rect j;

    public class a implements ScaleGestureDetector.OnScaleGestureListener {
        public a() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector detector) {
            CropView.this.f(detector);
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector detector) {
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector detector) {
            float scaleFactor = detector.getScaleFactor();
            CropView.this.d.postScale(scaleFactor, scaleFactor);
            CropView.this.invalidate();
        }
    }

    public class b implements GestureDetector.OnGestureListener {
        public b() {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent e) {
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent e) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            CropView.this.g(distanceX, distanceY);
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent e) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent e) {
            return false;
        }
    }

    public CropView(Context context) {
        super(context);
        this.a = 0.2f;
        this.b = 4.0f;
        this.c = new float[9];
        this.d = new Matrix();
        this.h = new a();
        this.i = 0;
        e();
    }

    private void d(int width, int height) {
        Bitmap bitmap;
        if (width <= 0 || height <= 0 || (bitmap = this.e) == null) {
            return;
        }
        float fMin = Math.min((height * 1.0f) / bitmap.getHeight(), (width * 1.0f) / this.e.getWidth());
        float width2 = (width - this.e.getWidth()) / 2;
        float height2 = (height - this.e.getHeight()) / 2;
        this.d.setTranslate(0.0f, 0.0f);
        this.d.setScale(fMin, fMin, this.e.getWidth() / 2, this.e.getHeight() / 2);
        this.d.postTranslate(width2, height2);
        invalidate();
    }

    private void e() {
        this.g = new ScaleGestureDetector(getContext(), this.h);
        this.f = new GestureDetector(getContext(), new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(ScaleGestureDetector detector) {
        float scaleFactor = detector.getScaleFactor();
        float scale = getScale();
        float f = scale * scaleFactor;
        float f2 = this.a;
        if (f < f2) {
            scaleFactor = f2 / scale;
        }
        float f3 = scale * scaleFactor;
        float f4 = this.b;
        if (f3 > f4) {
            scaleFactor = f4 / scale;
        }
        this.d.postScale(scaleFactor, scaleFactor, detector.getFocusX(), detector.getFocusY());
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(float distanceX, float distanceY) {
        this.d.getValues(this.c);
        float[] fArr = this.c;
        float f = fArr[2];
        float f2 = fArr[5];
        Rect restrictedBound = getRestrictedBound();
        if (restrictedBound != null) {
            float scale = getScale();
            float width = ((int) (this.e.getWidth() / scale)) + f;
            float height = ((int) (this.e.getHeight() / scale)) + f2;
            float f3 = f - distanceX;
            int i = restrictedBound.left;
            if (f3 > i) {
                distanceX = f - i;
            }
            float f4 = f2 - distanceY;
            int i2 = restrictedBound.top;
            if (f4 > i2) {
                distanceY = f2 - i2;
            }
            if (distanceX > 0.0f) {
                float f5 = width - distanceX;
                int i3 = restrictedBound.right;
                if (f5 < i3) {
                    distanceX = width - i3;
                }
            }
            if (distanceY > 0.0f) {
                float f6 = height - distanceY;
                int i4 = restrictedBound.bottom;
                if (f6 < i4) {
                    distanceY = height - i4;
                }
            }
        }
        this.d.postTranslate(-distanceX, -distanceY);
        invalidate();
    }

    private Rect getRestrictedBound() {
        return this.j;
    }

    private float getScale() {
        this.d.getValues(this.c);
        float f = this.c[0];
        if (Math.abs(f) <= 0.1d) {
            f = this.c[1];
        }
        return Math.abs(f);
    }

    private void setBitmap(Bitmap bitmap) {
        this.e = bitmap;
        this.d.reset();
        d(getWidth(), getHeight());
        this.i = 0;
        invalidate();
    }

    public Bitmap crop(Rect frame) {
        float scale = getScale();
        float[] fArr = {frame.left, frame.top};
        float[] fArr2 = {0.0f, 0.0f};
        Matrix matrix = new Matrix();
        this.d.invert(matrix);
        matrix.mapPoints(fArr2, fArr);
        Matrix matrix2 = new Matrix();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (frame.width() / scale), (int) (frame.height() / scale), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Bitmap bitmap = this.e;
        matrix2.postTranslate(-fArr2[0], -fArr2[1]);
        canvas.drawBitmap(bitmap, matrix2, null);
        return bitmapCreateBitmap;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.e;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, this.d, null);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        d(w, h);
        invalidate();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        return (this.f.onTouchEvent(event) || this.g.onTouchEvent(event)) || super.onTouchEvent(event);
    }

    public void rotate(int degrees) {
        if (this.e == null) {
            return;
        }
        Matrix matrix = new Matrix();
        int width = this.e.getWidth() / 2;
        int height = this.e.getHeight() / 2;
        matrix.postTranslate(-width, -height);
        matrix.postRotate(degrees);
        matrix.postTranslate(height, width);
        Bitmap bitmap = this.e;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getHeight(), bitmap.getWidth(), Bitmap.Config.RGB_565);
        new Canvas(bitmapCreateBitmap).drawBitmap(this.e, matrix, null);
        this.e.recycle();
        this.e = bitmapCreateBitmap;
        d(getWidth(), getHeight());
        invalidate();
    }

    public void setFilePath(String path) {
        Bitmap bitmap = this.e;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.e.recycle();
        }
        if (path == null) {
            return;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(path, options);
        try {
            int attributeInt = new ExifInterface(path).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
            Matrix matrix = new Matrix();
            int iExifToDegrees = ImageUtil.exifToDegrees(attributeInt);
            if (attributeInt != 0.0f) {
                matrix.preRotate(iExifToDegrees);
            }
            int iMin = Math.min(Math.min(options.outWidth, options.outHeight), RaceId.RACE_NVKEY_READFULLKEY);
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            Point point = new Point();
            windowManager.getDefaultDisplay().getSize(point);
            int iMin2 = Math.min(iMin, (point.x * 2) / 3);
            int iCalculateInSampleSize = ImageUtil.calculateInSampleSize(options, iMin2, iMin2);
            options.inSampleSize = iCalculateInSampleSize;
            options.inScaled = true;
            options.inDensity = options.outWidth;
            options.inTargetDensity = iMin2 * iCalculateInSampleSize;
            options.inPreferredConfig = Bitmap.Config.RGB_565;
            options.inJustDecodeBounds = false;
            this.e = BitmapFactory.decodeFile(path, options);
        } catch (IOException e) {
            e.printStackTrace();
            this.e = bitmapDecodeFile;
        } catch (NullPointerException e2) {
            e2.printStackTrace();
        }
        setBitmap(this.e);
    }

    public void setMaximumScale(float maximumScale) {
        this.b = maximumScale;
    }

    public void setMinimumScale(float setMinimumScale) {
        this.a = setMinimumScale;
    }

    public void setRestrictBound(Rect rect) {
        this.j = rect;
    }

    public CropView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.a = 0.2f;
        this.b = 4.0f;
        this.c = new float[9];
        this.d = new Matrix();
        this.h = new a();
        this.i = 0;
        e();
    }

    public CropView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.a = 0.2f;
        this.b = 4.0f;
        this.c = new float[9];
        this.d = new Matrix();
        this.h = new a();
        this.i = 0;
        e();
    }
}
