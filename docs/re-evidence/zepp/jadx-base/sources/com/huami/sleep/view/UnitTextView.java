package com.huami.sleep.view;

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
import com.huami.sleep.R;
import com.huami.sleep.util.ViewUtils;
import com.huami.widget.typeface.Font;
import com.huami.widget.typeface.TypefaceManager;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
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
    private final Context e;
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

    private void a(Canvas canvas, int baseLine) {
        String[] strArr = this.m;
        if (strArr == null || strArr.length == 0) {
            return;
        }
        int length = strArr.length;
        float paddingStart = getPaddingStart();
        if (this.l) {
            paddingStart = getLastUnitWidth();
        }
        int i = 0;
        if (!ViewUtils.isRTL()) {
            while (i < length) {
                float f = baseLine;
                canvas.drawText(this.m[i], paddingStart, f, this.f);
                String[] strArr2 = this.m;
                int i2 = i + 1;
                canvas.drawText(strArr2[i2], c(strArr2[i]) + paddingStart, f, this.h);
                paddingStart = paddingStart + getPaddingStart() + c(this.m[i]) + d(this.m[i2]) + this.k;
                i += 2;
            }
            return;
        }
        float measuredWidth = getMeasuredWidth() - paddingStart;
        while (i < length) {
            float f2 = measuredWidth - f(this.m[i]);
            float f3 = baseLine;
            canvas.drawText(this.m[i], f2, f3, this.f);
            int i3 = i + 1;
            float fMeasureText = f2 - (this.j + this.h.measureText(this.m[i3]));
            canvas.drawText(this.m[i3], fMeasureText, f3, this.h);
            measuredWidth = fMeasureText - this.k;
            i += 2;
        }
    }

    private int b(int widthMeasureSpec) {
        int length = this.m.length;
        int lastUnitWidth = this.l ? (int) getLastUnitWidth() : 0;
        for (int i = 0; i < length; i += 2) {
            String[] strArr = this.m;
            lastUnitWidth += e(strArr[i], strArr[i + 1]);
        }
        return View.resolveSize(lastUnitWidth + (this.k * ((length / 2) - 1)) + getPaddingStart() + getPaddingEnd(), widthMeasureSpec);
    }

    private float c(String value) {
        return this.f.measureText(value) + this.j;
    }

    private float d(String unit) {
        return this.h.measureText(unit);
    }

    private int e(String value, String unit) {
        int iMeasureText = !TextUtils.isEmpty(value) ? (int) this.f.measureText(value) : 0;
        return !TextUtils.isEmpty(unit) ? iMeasureText + this.j + ((int) this.h.measureText(unit)) : iMeasureText;
    }

    private float f(String value) {
        return this.f.measureText(value);
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

    private void i(AttributeSet attrs, int defStyleAttr) {
        TypedArray typedArrayObtainStyledAttributes = this.e.obtainStyledAttributes(attrs, R.styleable.UnitText, 0, defStyleAttr);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.UnitText_android_textSize, (int) ViewUtils.sp2px(this.e, 26.0f));
        this.b = typedArrayObtainStyledAttributes.getColor(R.styleable.UnitText_android_textColor, -16777216);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.UnitText_android_text);
        this.j = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.UnitText_unitSpacing, (int) ViewUtils.dp2px(this.e, 2.0f));
        String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.UnitText_unit);
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.UnitText_unitSize, (int) ViewUtils.sp2px(this.e, 12.0f));
        this.d = typedArrayObtainStyledAttributes.getColor(R.styleable.UnitText_unitColor, -16777216);
        int i = typedArrayObtainStyledAttributes.getInt(R.styleable.UnitText_typeface, -1);
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
        setTypefaceFromAttrs(i);
    }

    private void setTypefaceFromAttrs(int index) {
        Font font;
        if (index == 0) {
            font = Font.KM;
        } else if (index == 1) {
            font = Font.OSWALD;
        } else if (index != 2) {
            font = index != 3 ? null : Font.LT_BOLD;
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
        a(canvas, getPaddingTop() + Math.max(Math.abs(this.i), Math.abs((int) fontMetrics.top)));
        setContentDescription(Arrays.toString(this.m));
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int iB = b(widthMeasureSpec);
        boolean z = this.a >= this.c;
        this.g = (z ? this.f : this.h).getFontMetrics();
        int iAscent = (int) (z ? this.f : this.h).ascent();
        this.i = iAscent;
        setMeasuredDimension(iB, View.resolveSize(((int) (Math.max(Math.abs(iAscent), Math.abs((int) this.g.top)) + (z ? this.f : this.h).descent())) + getPaddingTop() + getPaddingBottom(), heightMeasureSpec));
    }

    public void setCenterByFirst(boolean centerByFirst) {
        this.l = centerByFirst;
        postInvalidate();
    }

    public void setColor(@ColorInt int color) {
        this.b = color;
        this.d = color;
        invalidate();
    }

    public void setSpacing(int spacing) {
        this.j = spacing;
        invalidate();
    }

    public void setTypeFace(Typeface style) {
        if (style != null) {
            this.f.setTypeface(style);
            invalidate();
        }
    }

    public void setUnit(String unit) {
        if (TextUtils.equals(unit, this.m[1])) {
            return;
        }
        this.m[1] = unit;
        requestLayout();
        invalidate();
    }

    public void setUnitColor(@ColorInt int color) {
        this.d = color;
        invalidate();
    }

    public void setUnitPxSize(float textPxSize) {
        this.c = Math.round(textPxSize);
        invalidate();
    }

    public void setUnitSpace(int unitSpace) {
        this.j = unitSpace;
        invalidate();
    }

    public void setUnitStyle(float textSize, int textColor) {
        this.c = Math.round(ViewUtils.dp2px(this.e, textSize));
        this.d = textColor;
        invalidate();
    }

    public void setValue(String value) {
        if (TextUtils.equals(value, this.m[0])) {
            return;
        }
        this.m[0] = value;
        requestLayout();
        invalidate();
    }

    public void setValueColor(@ColorInt int color) {
        this.b = color;
        invalidate();
    }

    public void setValuePxSize(float pxSize) {
        this.a = Math.round(pxSize);
        invalidate();
    }

    public void setValueSize(float textSize) {
        this.a = Math.round(ViewUtils.dp2px(this.e, textSize));
        invalidate();
    }

    public void setValueStyle(float textSize, int textColor) {
        this.a = Math.round(ViewUtils.dp2px(this.e, textSize));
        this.b = textColor;
        invalidate();
    }

    public void setValues(String... values) {
        int length = values.length;
        if (length % 2 != 0) {
            throw new IllegalArgumentException("参数个数必须为偶数");
        }
        String[] strArr = new String[length];
        this.m = strArr;
        System.arraycopy(values, 0, strArr, 0, length);
        requestLayout();
        invalidate();
    }

    public UnitTextView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public UnitTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.l = false;
        this.e = context;
        g();
        i(attrs, defStyleAttr);
    }

    public void setUnit(@StringRes int stringRes) {
        setUnit(this.e.getString(stringRes));
    }

    public void setValue(@StringRes int stringRes) {
        setValue(this.e.getString(stringRes));
    }

    public void setValue(float value, String unit) {
        setValue(String.format(Locale.getDefault(), "%.1f", Float.valueOf(value)));
        setUnit(unit);
    }

    public void setValue(int value, String unit) {
        setValue(String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Integer.valueOf(value)));
        setUnit(unit);
    }

    public void setValue(String value, String unit) {
        if (TextUtils.equals(value, this.m[0]) && TextUtils.equals(unit, this.m[1])) {
            return;
        }
        String[] strArr = this.m;
        strArr[0] = value;
        strArr[1] = unit;
        requestLayout();
        invalidate();
    }
}
