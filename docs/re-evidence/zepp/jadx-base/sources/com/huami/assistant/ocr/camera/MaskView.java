package com.huami.assistant.ocr.camera;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.core.content.res.ResourcesCompat;
import com.huami.assistant.R;
import com.huami.moving.ui.utils.SportDeviceUtils;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public class MaskView extends View {
    public static final int MASK_TYPE_BANK_CARD = 11;
    public static final int MASK_TYPE_ID_CARD_BACK = 2;
    public static final int MASK_TYPE_ID_CARD_FRONT = 1;
    public static final int MASK_TYPE_NONE = 0;
    public static final int MASK_TYPE_PASSPORT = 21;
    private int a;
    private int b;
    private int c;
    private Paint d;
    private Paint e;
    private Rect f;
    private Rect g;
    private Drawable h;
    private Path i;

    public @interface MaskType {
    }

    public MaskView(Context context) {
        super(context);
        this.a = -1;
        this.b = 1;
        this.c = Color.argb(100, 0, 0, 0);
        this.d = new Paint(1);
        this.e = new Paint(1);
        this.f = new Rect();
        this.g = new Rect();
        this.i = new Path();
        setLayerType(1, null);
        this.e.setColor(-1);
        this.e.setStyle(Paint.Style.STROKE);
        this.e.setStrokeWidth(6.0f);
        this.d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        c();
    }

    private void a(File file) {
    }

    private void b(float left, float top, float right, float bottom, float rx2, float ry, boolean conformToOriginalPost) {
        this.i.reset();
        if (rx2 < 0.0f) {
            rx2 = 0.0f;
        }
        if (ry < 0.0f) {
            ry = 0.0f;
        }
        float f = right - left;
        float f2 = bottom - top;
        float f3 = f / 2.0f;
        if (rx2 > f3) {
            rx2 = f3;
        }
        float f4 = f2 / 2.0f;
        if (ry > f4) {
            ry = f4;
        }
        float f5 = f - (rx2 * 2.0f);
        float f6 = f2 - (2.0f * ry);
        this.i.moveTo(right, top + ry);
        float f7 = -ry;
        float f8 = -rx2;
        this.i.rQuadTo(0.0f, f7, f8, f7);
        this.i.rLineTo(-f5, 0.0f);
        this.i.rQuadTo(f8, 0.0f, f8, ry);
        this.i.rLineTo(0.0f, f6);
        if (conformToOriginalPost) {
            this.i.rLineTo(0.0f, ry);
            this.i.rLineTo(f, 0.0f);
            this.i.rLineTo(0.0f, f7);
        } else {
            this.i.rQuadTo(0.0f, ry, rx2, ry);
            this.i.rLineTo(f5, 0.0f);
            this.i.rQuadTo(rx2, 0.0f, rx2, f7);
        }
        this.i.rLineTo(0.0f, -f6);
        this.i.close();
    }

    private void c() {
        this.h = ResourcesCompat.getDrawable(getResources(), R.drawable.bd_ocr_id_card_locator_front, null);
    }

    public Rect getFrameRect() {
        int i = this.b;
        if (i == 0) {
            return new Rect(0, 0, getWidth(), getHeight());
        }
        return i == 21 ? new Rect(this.g) : new Rect(this.f);
    }

    public Rect getFrameRectExtend() {
        Rect rect = new Rect(this.f);
        Rect rect2 = this.f;
        int i = (int) ((rect2.right - rect2.left) * 0.02f);
        int i2 = (int) ((rect2.bottom - rect2.top) * 0.02f);
        rect.left -= i;
        rect.right += i;
        rect.top -= i2;
        rect.bottom += i2;
        return rect;
    }

    public int getMaskType() {
        return this.b;
    }

    @Override // android.view.View
    @RequiresApi(api = 21)
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect rect = this.f;
        if (this.b == 21) {
            rect = this.g;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        canvas.drawColor(this.c);
        float f = i;
        float f2 = i2;
        b(f, f2, i3, i4, 30.0f, 30.0f, false);
        canvas.drawPath(this.i, this.e);
        canvas.drawPath(this.i, this.d);
        int i5 = this.b;
        if (i5 == 1) {
            float f3 = iWidth;
            float f4 = iHeight;
            this.h.setBounds((int) ((0.5974155f * f3) + f), (int) ((0.17405063f * f4) + f2), (int) (f + (f3 * 0.95725644f)), (int) (f2 + (f4 * 0.7531645f)));
        } else if (i5 == 2) {
            float f5 = iWidth;
            float f6 = iHeight;
            this.h.setBounds((int) ((0.050695825f * f5) + f), (int) ((0.07594936f * f6) + f2), (int) (f + (f5 * 0.24850895f)), (int) (f2 + (f6 * 0.41455695f)));
        } else if (i5 == 21) {
            float f7 = iWidth;
            float f8 = iHeight;
            this.h.setBounds((int) ((0.029821074f * f7) + f), (int) ((0.03164557f * f8) + f2), (int) (f + (f7 * 0.30119285f)), (int) (f2 + (f8 * 0.65822786f)));
        }
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if (w <= 0 || h <= 0) {
            return;
        }
        if (this.b != 21) {
            int i = (int) (w * (h <= w ? 0.72f : 0.9f));
            int i2 = (i * 400) / 620;
            int i3 = (w - i) / 2;
            int i4 = (h - i2) / 2;
            Rect rect = this.f;
            rect.left = i3;
            rect.top = i4;
            rect.right = i + i3;
            rect.bottom = i2 + i4;
            return;
        }
        int i5 = (int) (w * 0.9f);
        int i6 = (i5 * SportDeviceUtils.SOURCE_MADRID_W) / 470;
        int i7 = (w - i5) / 2;
        int i8 = (h - i6) / 2;
        Rect rect2 = this.g;
        rect2.left = i7;
        rect2.top = i8;
        rect2.right = i5 + i7;
        rect2.bottom = i6 + i8;
    }

    public void setLineColor(int lineColor) {
        this.a = lineColor;
    }

    public void setMaskColor(int maskColor) {
        this.c = maskColor;
    }

    public void setMaskType(@MaskType int maskType) {
        this.b = maskType;
        if (maskType == 1) {
            this.h = ResourcesCompat.getDrawable(getResources(), R.drawable.bd_ocr_id_card_locator_front, null);
        } else if (maskType == 2) {
            this.h = ResourcesCompat.getDrawable(getResources(), R.drawable.bd_ocr_id_card_locator_back, null);
        } else if (maskType == 21) {
            this.h = ResourcesCompat.getDrawable(getResources(), R.drawable.bd_ocr_passport_locator, null);
        }
        invalidate();
    }

    public void setOrientation(@CameraView.Orientation int orientation) {
    }

    public MaskView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.a = -1;
        this.b = 1;
        this.c = Color.argb(100, 0, 0, 0);
        this.d = new Paint(1);
        this.e = new Paint(1);
        this.f = new Rect();
        this.g = new Rect();
        this.i = new Path();
        setLayerType(1, null);
        this.e.setColor(-1);
        this.e.setStyle(Paint.Style.STROKE);
        this.e.setStrokeWidth(6.0f);
        this.d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        c();
    }

    public MaskView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.a = -1;
        this.b = 1;
        this.c = Color.argb(100, 0, 0, 0);
        this.d = new Paint(1);
        this.e = new Paint(1);
        this.f = new Rect();
        this.g = new Rect();
        this.i = new Path();
        setLayerType(1, null);
        this.e.setColor(-1);
        this.e.setStyle(Paint.Style.STROKE);
        this.e.setStrokeWidth(6.0f);
        this.d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        c();
    }
}
