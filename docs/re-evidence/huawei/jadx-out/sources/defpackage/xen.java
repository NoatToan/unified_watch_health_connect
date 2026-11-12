package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.content.ContextCompat;
import com.google.android.material.timepicker.TimeModel;
import com.huawei.uikit.hweventbadge.R;
import java.util.Locale;

/* JADX INFO: loaded from: classes20.dex */
public class xen extends Drawable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f52785c;
    private TextPaint e;
    private float f;
    private float g;
    private int h;
    private float i;
    private float j;
    private int k;
    private int l;
    private int m;
    private int o;
    private Context s;
    private int d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f52784b = 99;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f52783a = "";
    private int n = 2;

    public xen() {
        j();
    }

    private void a(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        this.j = f;
        if (Float.compare(f, 1.75f) < 0 || !xfu.c(this.s)) {
            return;
        }
        this.h = context.getResources().getDimensionPixelSize(R.dimen.hweventbadge_height_large_model);
        this.e.setTextSize(context.getResources().getDimensionPixelSize(R.dimen.emui_text_size_caption_large_model));
        this.o = context.getResources().getDimensionPixelSize(R.dimen.hweventbadge_height_large_model);
    }

    public int a() {
        return this.n;
    }

    public void a(int i) {
        b(i, this.f52784b);
    }

    public int b() {
        return this.f52784b;
    }

    public void b(int i) {
        this.f52785c.setColor(i);
        invalidateSelf();
    }

    public int c() {
        return this.d;
    }

    public void c(int i) {
        if (this.n != i) {
            this.n = i;
            if (Float.compare(this.j, 1.75f) >= 0 && this.n == 2 && xfu.c(this.s)) {
                this.h = this.s.getResources().getDimensionPixelSize(R.dimen.hweventbadge_height_large_model);
                this.e.setTextSize(this.s.getResources().getDimensionPixelSize(R.dimen.emui_text_size_caption_large_model));
                this.o = this.s.getResources().getDimensionPixelSize(R.dimen.hweventbadge_height_large_model);
            } else {
                this.h = this.s.getResources().getDimensionPixelSize(R.dimen.hweventbadge_dot_size);
                this.e.setTextSize(this.s.getResources().getDimensionPixelSize(R.dimen.emui_text_size_caption));
                this.o = this.s.getResources().getDimensionPixelSize(R.dimen.hweventbadge_height);
            }
            d();
        }
    }

    public void c(Context context, AttributeSet attributeSet, int i) {
        c(context, attributeSet, i, R.style.Widget_Emui_HwEventBadge);
    }

    public void d() {
        int i = this.o;
        this.k = i;
        this.l = i;
        int i2 = this.n;
        if (i2 == 1) {
            int i3 = this.h;
            this.k = i3;
            this.l = i3;
        } else if (i2 == 2) {
            float fMeasureText = this.e.measureText(this.f52783a);
            float fDescent = this.e.descent();
            float fAscent = this.e.ascent();
            int i4 = this.d;
            if (i4 > 0 && i4 < 10) {
                int i5 = this.o;
                this.k = i5;
                this.l = i5;
            } else if (i4 >= 10) {
                this.k = Math.round((this.m * 2.0f) + fMeasureText);
                this.l = this.o;
            } else {
                Log.e("HwEventBadgeDrawable", "invalid badge count");
            }
            this.f = (this.k - fMeasureText) / 2.0f;
            this.g = ((this.l - (fDescent - fAscent)) / 2.0f) - this.e.ascent();
        } else {
            Log.e("HwEventBadgeDrawable", "invalid badge mode");
        }
        invalidateSelf();
    }

    public void d(int i) {
        if (this.e.getColor() != i) {
            this.e.setColor(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds;
        if (canvas != null && (bounds = getBounds()) != null && bounds.right > bounds.left && bounds.bottom > bounds.top && this.d > 0) {
            canvas.save();
            int i = this.n;
            if (i == 1) {
                canvas.drawCircle(bounds.left + (bounds.width() / 2.0f), bounds.top + (bounds.height() / 2.0f), this.l / 2.0f, this.f52785c);
            } else if (i == 2) {
                canvas.translate((bounds.width() - this.k) / 2.0f, (bounds.height() - this.l) / 2.0f);
                int i2 = bounds.left;
                int i3 = bounds.top;
                RectF rectF = new RectF(i2, i3, i2 + this.k, i3 + this.l);
                float f = this.i;
                canvas.drawRoundRect(rectF, f, f, this.f52785c);
                canvas.drawText(this.f52783a, bounds.left + this.f, bounds.top + this.g, this.e);
            } else {
                Log.e("HwEventBadgeDrawable", "invalid badge mode");
            }
            canvas.restore();
        }
    }

    public TextPaint e() {
        return this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f52785c.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.l;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return getAlpha() == 0 ? -2 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f52785c.setAlpha(i);
        this.e.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(Rect rect) {
        super.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f52785c.setColorFilter(colorFilter);
        this.e.setColorFilter(colorFilter);
    }

    public void b(int i, int i2) {
        if (i < 0) {
            Log.w("HwEventBadgeDrawable", "setBadgeCount method: param count must be equals or bigger than zero");
            return;
        }
        if (this.d != i) {
            this.d = i;
        }
        if (this.f52784b != i2) {
            this.f52784b = i2;
        }
        if (this.d <= i2) {
            this.f52783a = String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Integer.valueOf(this.d));
        } else {
            this.f52783a = String.format(Locale.getDefault(), "%d+", Integer.valueOf(i2));
        }
        d();
    }

    public void c(Context context, AttributeSet attributeSet, int i, int i2) {
        if (context == null) {
            return;
        }
        this.s = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwEventBadge, i, i2);
        this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwEventBadge_hwEventBadgeDotSize, context.getResources().getDimensionPixelSize(R.dimen.hweventbadge_dot_size));
        this.n = typedArrayObtainStyledAttributes.getInt(R.styleable.HwEventBadge_hwEventBadgeMode, 2);
        this.o = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwEventBadge_hwEventBadgeHeight, context.getResources().getDimensionPixelSize(R.dimen.hweventbadge_height));
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwEventBadge_hwEventBadgeTextMargin, context.getResources().getDimensionPixelSize(R.dimen.hweventbadge_text_margin));
        this.e.setColor(typedArrayObtainStyledAttributes.getColor(R.styleable.HwEventBadge_hwEventBadgeTextColor, ContextCompat.getColor(context, R.color.emui_text_primary_inverse)));
        this.e.setTextSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwEventBadge_hwEventBadgeTextSize, context.getResources().getDimensionPixelSize(R.dimen.emui_text_size_caption)));
        this.f52785c.setColor(typedArrayObtainStyledAttributes.getColor(R.styleable.HwEventBadge_hwEventBadgeBackgroundColor, ContextCompat.getColor(context, R.color.emui_functional_red)));
        d();
        this.i = typedArrayObtainStyledAttributes.getDimension(R.styleable.HwEventBadge_hwEventBadgeTextRadius, this.l / 2.0f);
        a(context);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void j() {
        TextPaint textPaint = new TextPaint();
        this.e = textPaint;
        textPaint.setAntiAlias(true);
        this.e.setFilterBitmap(true);
        Paint paint = new Paint();
        this.f52785c = paint;
        paint.setAntiAlias(true);
    }
}
