package com.huami.lib.view.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.StringRes;
import com.google.android.material.timepicker.TimeModel;
import com.huami.lib.view.R;
import com.huami.lib.view.ViewUtils;
import com.huami.widget.typeface.Font;
import com.huami.widget.typeface.TypefaceManager;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class UnitTextView extends View {
    private static final String n = "UnitTextView";
    private static final String o = "%.1f";
    private static final int p = 0;
    private static final int q = 1;
    private static final int r = 2;
    private static final int s = 3;
    private int a;
    private int b;
    private int c;
    private int d;
    private Context e;
    private TextPaint f;
    private Paint.FontMetrics g;
    private TextPaint h;
    private int i;
    private int j;
    private int k;
    private boolean l;
    private String[] m;

    public UnitTextView(Context context) {
        this(context, null);
    }

    private void a(Canvas canvas, int i) {
        String[] strArr = this.m;
        if (strArr == null || strArr.length == 0) {
            return;
        }
        int length = strArr.length;
        float paddingStart = getPaddingStart();
        if (this.l) {
            paddingStart = getLastUnitWidth();
        }
        int i2 = 0;
        if (!ViewUtils.isRTL()) {
            while (i2 < length) {
                float f = i;
                canvas.drawText(this.m[i2], paddingStart, f, this.f);
                String[] strArr2 = this.m;
                int i3 = i2 + 1;
                canvas.drawText(strArr2[i3], c(strArr2[i2]) + paddingStart, f, this.h);
                paddingStart = paddingStart + getPaddingStart() + c(this.m[i2]) + d(this.m[i3]) + this.k;
                i2 += 2;
            }
            return;
        }
        float measuredWidth = getMeasuredWidth() - paddingStart;
        while (i2 < length) {
            float f2 = measuredWidth - f(this.m[i2]);
            float f3 = i;
            canvas.drawText(this.m[i2], f2, f3, this.f);
            int i4 = i2 + 1;
            float fMeasureText = f2 - (this.j + this.h.measureText(this.m[i4]));
            canvas.drawText(this.m[i4], fMeasureText, f3, this.h);
            measuredWidth = fMeasureText - this.k;
            i2 += 2;
        }
    }

    private int b(int i) {
        int length = this.m.length;
        int lastUnitWidth = this.l ? (int) getLastUnitWidth() : 0;
        for (int i2 = 0; i2 < length; i2 += 2) {
            String[] strArr = this.m;
            lastUnitWidth += e(strArr[i2], strArr[i2 + 1]);
        }
        return View.resolveSize(lastUnitWidth + (this.k * ((length / 2) - 1)) + getPaddingStart() + getPaddingEnd(), i);
    }

    private float c(String str) {
        return this.f.measureText(str) + this.j;
    }

    private float d(String str) {
        return this.h.measureText(str);
    }

    private int e(String str, String str2) {
        int iMeasureText = !TextUtils.isEmpty(str) ? (int) this.f.measureText(str) : 0;
        return !TextUtils.isEmpty(str2) ? iMeasureText + this.j + ((int) this.h.measureText(str2)) : iMeasureText;
    }

    private float f(String str) {
        return this.f.measureText(str);
    }

    private void g() {
        TextPaint textPaint = new TextPaint();
        this.f = textPaint;
        textPaint.setAntiAlias(true);
        TextPaint textPaint2 = new TextPaint();
        this.h = textPaint2;
        textPaint2.setAntiAlias(true);
        h();
    }

    private void h() {
        this.f.setTextSize(this.a);
        this.f.setColor(this.b);
        this.h.setTextSize(this.c);
        this.h.setColor(this.d);
    }

    private void i() {
        int i = 0;
        while (true) {
            String[] strArr = this.m;
            if (i >= strArr.length) {
                return;
            }
            if (strArr[i] == null) {
                strArr[i] = "";
            }
            i++;
        }
    }

    private void j(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.e.obtainStyledAttributes(attributeSet, R.styleable.UnitText, 0, i);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.UnitText_android_textSize, (int) ViewUtils.sp2px(this.e, 26.0f));
        this.b = typedArrayObtainStyledAttributes.getColor(R.styleable.UnitText_android_textColor, -16777216);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.UnitText_android_text);
        this.j = typedArrayObtainStyledAttributes.getInt(R.styleable.UnitText_android_spacing, (int) ViewUtils.dp2px(this.e, 2.0f));
        String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.UnitText_unit);
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.UnitText_unitSize, (int) ViewUtils.sp2px(this.e, 12.0f));
        this.d = typedArrayObtainStyledAttributes.getColor(R.styleable.UnitText_unitColor, -16777216);
        int i2 = typedArrayObtainStyledAttributes.getInt(R.styleable.UnitText_typeface, -1);
        typedArrayObtainStyledAttributes.recycle();
        this.k = this.j;
        if (string == null) {
            string = "";
        }
        if (string2 == null) {
            string2 = "";
        }
        if (this.m == null) {
            this.m = new String[2];
        }
        String[] strArr = this.m;
        strArr[0] = string;
        strArr[1] = string2;
        setTypefaceFromAttrs(i2);
    }

    private void setTypefaceFromAttrs(int i) {
        Font font;
        if (i == 0) {
            font = Font.KM;
        } else if (i == 1) {
            font = Font.OSWALD;
        } else if (i != 2) {
            font = i != 3 ? null : Font.LT_BOLD;
        } else {
            font = Font.LT;
        }
        if (font == null) {
            return;
        }
        Typeface typeface = TypefaceManager.get().getTypeface(this.e, font);
        this.f.setTypeface(typeface);
        this.h.setTypeface(typeface);
        invalidate();
    }

    public float getLastUnitWidth() {
        String[] strArr = this.m;
        String str = strArr[strArr.length - 1];
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        return this.h.measureText(str) + this.j;
    }

    @Override // android.view.View
    public void invalidate() {
        h();
        super.invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Paint.FontMetrics fontMetrics = (this.a >= this.c ? this.f : this.h).getFontMetrics();
        this.g = fontMetrics;
        int paddingTop = getPaddingTop() + Math.max(Math.abs(this.i), Math.abs((int) fontMetrics.top));
        i();
        a(canvas, paddingTop);
        setContentDescription(Arrays.toString(this.m));
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int iB = b(i);
        boolean z = this.a >= this.c;
        this.g = (z ? this.f : this.h).getFontMetrics();
        int iAscent = (int) (z ? this.f : this.h).ascent();
        this.i = iAscent;
        setMeasuredDimension(iB, View.resolveSize(((int) (Math.max(Math.abs(iAscent), Math.abs((int) this.g.top)) + (z ? this.f : this.h).descent())) + getPaddingTop() + getPaddingBottom(), i2));
    }

    public void setCenterByFirst(boolean z) {
        this.l = z;
        postInvalidate();
    }

    public void setColor(@ColorInt int i) {
        this.b = i;
        this.d = i;
        invalidate();
    }

    public void setSpacing(int i) {
        this.j = i;
        invalidate();
    }

    public void setTypeFace(Typeface typeface) {
        if (typeface != null) {
            this.f.setTypeface(typeface);
            invalidate();
        }
    }

    public void setUnit(String str) {
        if (TextUtils.equals(str, this.m[1])) {
            return;
        }
        this.m[1] = str;
        requestLayout();
        invalidate();
    }

    public void setUnitColor(@ColorInt int i) {
        this.d = i;
        invalidate();
    }

    public void setUnitPxSize(float f) {
        this.c = Math.round(f);
        invalidate();
    }

    public void setUnitSpace(int i) {
        this.j = i;
        invalidate();
    }

    public void setUnitStyle(float f, int i) {
        this.c = Math.round(ViewUtils.dp2px(this.e, f));
        this.d = i;
        invalidate();
    }

    public void setValue(String str) {
        if (TextUtils.equals(str, this.m[0])) {
            return;
        }
        this.m[0] = str;
        requestLayout();
        invalidate();
    }

    public void setValueColor(@ColorInt int i) {
        this.b = i;
        invalidate();
    }

    public void setValuePxSize(float f) {
        this.a = Math.round(f);
        invalidate();
    }

    public void setValueSize(float f) {
        this.a = Math.round(ViewUtils.dp2px(this.e, f));
        invalidate();
    }

    public void setValueStyle(float f, int i) {
        this.a = Math.round(ViewUtils.dp2px(this.e, f));
        this.b = i;
        invalidate();
    }

    public void setValues(String... strArr) {
        int length = strArr.length;
        if (length % 2 != 0) {
            throw new IllegalArgumentException("参数个数必须为偶数");
        }
        String[] strArr2 = new String[length];
        this.m = strArr2;
        System.arraycopy(strArr, 0, strArr2, 0, length);
        requestLayout();
        invalidate();
    }

    public UnitTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public UnitTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.l = false;
        this.e = context;
        g();
        j(attributeSet, i);
    }

    public void setUnit(@StringRes int i) {
        setUnit(this.e.getString(i));
    }

    public void setValue(@StringRes int i) {
        setValue(this.e.getString(i));
    }

    public void setValue(float f, String str) {
        setValue(String.format(Locale.getDefault(), "%.1f", Float.valueOf(f)));
        setUnit(str);
    }

    public void setValue(int i, String str) {
        setValue(String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Integer.valueOf(i)));
        setUnit(str);
    }

    public void setValue(String str, String str2) {
        if (TextUtils.equals(str, this.m[0]) && TextUtils.equals(str2, this.m[1])) {
            return;
        }
        String[] strArr = this.m;
        strArr[0] = str;
        strArr[1] = str2;
        requestLayout();
        invalidate();
    }
}
