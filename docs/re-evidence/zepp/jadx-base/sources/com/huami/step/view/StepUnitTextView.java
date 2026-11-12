package com.huami.step.view;

import android.annotation.TargetApi;
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
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.material.timepicker.TimeModel;
import com.huami.chart.util.ChartUtil;
import com.huami.step.R;
import com.huami.step.utils.ViewUtils;
import com.huami.widget.typeface.Font;
import com.huami.widget.typeface.TypefaceManager;
import com.loc.z;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 Z2\u00020\u0001:\u0001ZB'\b\u0007\u0012\u0006\u0010;\u001a\u000209\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bX\u0010YJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0006H\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000eH\u0002J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u001c\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aJ\u000e\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0004J\u000e\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0004J\u0016\u0010#\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u0004J\u000e\u0010$\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0016J\u0016\u0010%\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u0004J\u0010\u0010'\u001a\u00020\u00062\b\b\u0001\u0010&\u001a\u00020\u0004J\u0010\u0010(\u001a\u00020\u00062\b\b\u0001\u0010&\u001a\u00020\u0004J\b\u0010)\u001a\u00020\u0006H\u0016J\u000e\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*J\u0018\u0010.\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0004H\u0014J!\u00101\u001a\u00020\u00062\u0012\u00100\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0/\"\u00020\u000e¢\u0006\u0004\b1\u00102J\u000e\u00104\u001a\u00020\u00062\u0006\u00103\u001a\u00020*J\u0010\u00105\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0014J\u000e\u00106\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eJ\u0010\u00106\u001a\u00020\u00062\b\b\u0001\u00107\u001a\u00020\u0004J\u000e\u00108\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000eJ\u0010\u00108\u001a\u00020\u00062\b\b\u0001\u00107\u001a\u00020\u0004J\u0016\u00106\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000eJ\u0016\u00106\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000eJ\u0016\u00106\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eR\u0016\u0010;\u001a\u0002098\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010:R\u0016\u0010=\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010<R\u0016\u0010>\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010<R\u0016\u0010?\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010<R\u0016\u0010@\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010<R\u0018\u0010C\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010BR\u0018\u0010F\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010BR\u0016\u0010H\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010<R\u0016\u0010J\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010<R\u0016\u0010L\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010<R\u0016\u0010O\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR \u0010R\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010T\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010NR\u0013\u0010W\u001a\u00020\u00168F@\u0006¢\u0006\u0006\u001a\u0004\bU\u0010V¨\u0006["}, d2 = {"Lcom/huami/step/view/StepUnitTextView;", "Landroid/view/View;", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "", "i", "index", "setTypefaceFromAttrs", "g", "h", "widthMeasureSpec", "b", "", "value", "unit", "e", "Landroid/graphics/Canvas;", "canvas", "baseLine", "a", "", "c", GoogleApiAvailabilityLight.a, "f", "Landroid/graphics/Typeface;", "style", "setTypeFace", "spacing", "setSpacing", "unitSpace", "setUnitSpace", "textSize", "textColor", "setValueStyle", "setValueSize", "setUnitStyle", "color", "setValueColor", "setUnitColor", "invalidate", "", "centerByFirst", "setCenterByFirst", "heightMeasureSpec", "onMeasure", "", "values", "setValues", "([Ljava/lang/String;)V", "capital", "setFristCapital", "onDraw", "setValue", "stringRes", "setUnit", "Landroid/content/Context;", "Landroid/content/Context;", "mContext", LogUtil.I, "mValueSize", "mValueColor", "mUnitSize", "mUnitColor", "Landroid/text/TextPaint;", "Landroid/text/TextPaint;", "mValuePaint", "Landroid/graphics/Paint$FontMetrics;", "Landroid/graphics/Paint$FontMetrics;", "mFontMetrics", "mUnitPaint", "mAscent", z.j, "mUnitSpacing", hl.k, "mSpacing", "l", "Z", "isCenterByFirst", "m", "[Ljava/lang/String;", "mValues", GoogleApiAvailabilityLight.b, "mCapital", "getLastUnitWidth", "()F", "lastUnitWidth", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "step_release"}, k = 1, mv = {1, 5, 1})
@TargetApi(17)
public final class StepUnitTextView extends View {
    private static final int q = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context mContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int mValueSize;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int mValueColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int mUnitSize;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int mUnitColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private TextPaint mValuePaint;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private Paint.FontMetrics mFontMetrics;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private TextPaint mUnitPaint;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int mAscent;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int mUnitSpacing;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int mSpacing;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private boolean isCenterByFirst;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private String[] mValues;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean mCapital;

    @NotNull
    private static final String o = "UnitTextView";

    @NotNull
    private static final String p = "%.1f";
    private static final int r = 1;
    private static final int s = 2;
    private static final int t = 3;

    @JvmOverloads
    public StepUnitTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public StepUnitTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @JvmOverloads
    public StepUnitTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mContext = context;
        this.mCapital = true;
        g();
        i(attributeSet, i);
    }

    private final void a(Canvas canvas, int baseLine) {
        float fMeasureText;
        int i;
        float fC;
        int i2;
        String[] strArr = this.mValues;
        if (strArr == null || strArr.length == 0) {
            return;
        }
        int length = this.mValues.length;
        float paddingStart = getPaddingStart();
        if (this.isCenterByFirst) {
            paddingStart = getLastUnitWidth();
        }
        int i3 = 0;
        if (ViewUtils.isRTL()) {
            float measuredWidth = getMeasuredWidth() - paddingStart;
            while (i3 < length) {
                if (this.mCapital) {
                    String str = this.mValues[i3];
                    if (str == null) {
                        str = "";
                    }
                    float f = measuredWidth - f(str);
                    float f2 = baseLine;
                    canvas.drawText(String.valueOf(this.mValues[i3]), f, f2, this.mValuePaint);
                    int i4 = i3 + 1;
                    fMeasureText = f - (this.mUnitSpacing + this.mUnitPaint.measureText(this.mValues[i4]));
                    canvas.drawText(String.valueOf(this.mValues[i4]), fMeasureText, f2, this.mUnitPaint);
                    i = this.mSpacing;
                } else {
                    String str2 = this.mValues[i3];
                    if (str2 == null) {
                        str2 = "";
                    }
                    float fD = measuredWidth - d(str2);
                    float f3 = baseLine;
                    canvas.drawText(String.valueOf(this.mValues[i3]), fD, f3, this.mUnitPaint);
                    int i5 = i3 + 1;
                    fMeasureText = fD - (this.mUnitSpacing + this.mValuePaint.measureText(this.mValues[i5]));
                    canvas.drawText(String.valueOf(this.mValues[i5]), fMeasureText, f3, this.mValuePaint);
                    i = this.mSpacing;
                }
                measuredWidth = fMeasureText - i;
                i3 += 2;
            }
            return;
        }
        while (i3 < length) {
            if (this.mCapital) {
                float f4 = baseLine;
                canvas.drawText(String.valueOf(this.mValues[i3]), paddingStart, f4, this.mValuePaint);
                int i6 = i3 + 1;
                String strValueOf = String.valueOf(this.mValues[i6]);
                String str3 = this.mValues[i3];
                if (str3 == null) {
                    str3 = "";
                }
                canvas.drawText(strValueOf, c(str3) + paddingStart, f4, this.mUnitPaint);
                float paddingStart2 = paddingStart + getPaddingStart();
                String str4 = this.mValues[i3];
                if (str4 == null) {
                    str4 = "";
                }
                float fC2 = paddingStart2 + c(str4);
                String str5 = this.mValues[i6];
                if (str5 == null) {
                    str5 = "";
                }
                fC = fC2 + d(str5);
                i2 = this.mSpacing;
            } else {
                float f5 = baseLine;
                canvas.drawText(String.valueOf(this.mValues[i3]), paddingStart, f5, this.mUnitPaint);
                int i7 = i3 + 1;
                String strValueOf2 = String.valueOf(this.mValues[i7]);
                String str6 = this.mValues[i3];
                if (str6 == null) {
                    str6 = "";
                }
                canvas.drawText(strValueOf2, d(str6) + paddingStart, f5, this.mValuePaint);
                float paddingStart3 = paddingStart + getPaddingStart();
                String str7 = this.mValues[i3];
                if (str7 == null) {
                    str7 = "";
                }
                float fD2 = paddingStart3 + d(str7);
                String str8 = this.mValues[i7];
                if (str8 == null) {
                    str8 = "";
                }
                fC = fD2 + c(str8);
                i2 = this.mSpacing;
            }
            paddingStart = fC + i2;
            i3 += 2;
        }
    }

    private final int b(int widthMeasureSpec) {
        int length = this.mValues.length;
        int lastUnitWidth = this.isCenterByFirst ? (int) getLastUnitWidth() : 0;
        for (int i = 0; i < length; i += 2) {
            String str = this.mValues[i];
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = this.mValues[i + 1];
            if (str3 != null) {
                str2 = str3;
            }
            lastUnitWidth += e(str, str2);
        }
        return View.resolveSize(lastUnitWidth + (this.mSpacing * ((length / 2) - 1)) + getPaddingStart() + getPaddingEnd(), widthMeasureSpec);
    }

    private final float c(String value) {
        return this.mValuePaint.measureText(value) + this.mUnitSpacing;
    }

    private final float d(String unit) {
        return this.mUnitPaint.measureText(unit);
    }

    private final int e(String value, String unit) {
        if (TextUtils.isEmpty(value)) {
            return 0;
        }
        int iMeasureText = (int) this.mValuePaint.measureText(value);
        return !TextUtils.isEmpty(unit) ? iMeasureText + this.mUnitSpacing + ((int) this.mUnitPaint.measureText(unit)) : iMeasureText;
    }

    private final float f(String value) {
        return this.mValuePaint.measureText(value);
    }

    private final void g() {
        TextPaint textPaint = new TextPaint();
        this.mValuePaint = textPaint;
        textPaint.setAntiAlias(true);
        TextPaint textPaint2 = new TextPaint();
        this.mUnitPaint = textPaint2;
        textPaint2.setAntiAlias(true);
        h();
    }

    private final void h() {
        this.mValuePaint.setTextSize(this.mValueSize);
        this.mValuePaint.setColor(this.mValueColor);
        this.mUnitPaint.setTextSize(this.mUnitSize);
        this.mUnitPaint.setColor(this.mUnitColor);
    }

    private final void i(AttributeSet attrs, int defStyleAttr) {
        TypedArray typedArrayObtainStyledAttributes = this.mContext.obtainStyledAttributes(attrs, R.styleable.StepUnitText, 0, defStyleAttr);
        this.mValueSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.StepUnitText_android_textSize, ChartUtil.sp2px(this.mContext.getApplicationContext(), 26.0f));
        this.mValueColor = typedArrayObtainStyledAttributes.getColor(R.styleable.StepUnitText_android_textColor, -16777216);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.StepUnitText_android_text);
        this.mUnitSpacing = typedArrayObtainStyledAttributes.getInt(R.styleable.StepUnitText_android_spacing, (int) ChartUtil.dp2px(this.mContext.getApplicationContext(), 2.0f));
        String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.StepUnitText_stepUnit);
        this.mUnitSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.StepUnitText_stepUnitSize, ChartUtil.sp2px(this.mContext.getApplicationContext(), 12.0f));
        this.mUnitColor = typedArrayObtainStyledAttributes.getColor(R.styleable.StepUnitText_stepUnitColor, -16777216);
        int i = typedArrayObtainStyledAttributes.getInt(R.styleable.StepUnitText_stepTypeface, -1);
        typedArrayObtainStyledAttributes.recycle();
        this.mSpacing = this.mUnitSpacing;
        if (string == null) {
            string = "";
        }
        if (string2 == null) {
            string2 = "";
        }
        if (this.mValues == null) {
            this.mValues = new String[]{"", ""};
        }
        this.mValues[0] = string;
        this.mValues[1] = string2;
        setTypefaceFromAttrs(i);
    }

    private final void setTypefaceFromAttrs(int index) {
        Font font;
        if (index == q) {
            font = Font.KM;
        } else if (index == r) {
            font = Font.OSWALD;
        } else if (index == s) {
            font = Font.LT;
        } else {
            font = index == t ? Font.LT_BOLD : null;
        }
        if (font == null) {
            return;
        }
        this.mValuePaint.setTypeface(TypefaceManager.get().getTypeface(this.mContext, font));
        invalidate();
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final float getLastUnitWidth() {
        String str = this.mValues[this.mValues.length - 1];
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        return this.mUnitPaint.measureText(str) + this.mUnitSpacing;
    }

    @Override // android.view.View
    public void invalidate() {
        h();
        super.invalidate();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Paint.FontMetrics fontMetrics = this.mValuePaint.getFontMetrics();
        this.mFontMetrics = fontMetrics;
        a(canvas, getPaddingTop() + Math.max(Math.abs(this.mAscent), Math.abs((int) fontMetrics.top)));
        setContentDescription(Arrays.toString(this.mValues));
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int iB = b(widthMeasureSpec) + 10;
        this.mFontMetrics = this.mValuePaint.getFontMetrics();
        this.mAscent = (int) this.mValuePaint.ascent();
        setMeasuredDimension(iB, View.resolveSize(((int) (Math.max(Math.abs(this.mAscent), Math.abs((int) this.mFontMetrics.top)) + this.mValuePaint.descent())) + getPaddingTop() + getPaddingBottom(), heightMeasureSpec));
    }

    public final void setCenterByFirst(boolean centerByFirst) {
        this.isCenterByFirst = centerByFirst;
        postInvalidate();
    }

    public final void setFristCapital(boolean capital) {
        this.mCapital = capital;
    }

    public final void setSpacing(int spacing) {
        this.mUnitSpacing = spacing;
        invalidate();
    }

    public final void setTypeFace(@Nullable Typeface style) {
        if (style != null) {
            this.mValuePaint.setTypeface(style);
            invalidate();
        }
    }

    public final void setUnit(@NotNull String unit) {
        if (TextUtils.equals(unit, this.mValues[1])) {
            return;
        }
        this.mValues[1] = unit;
        requestLayout();
        invalidate();
    }

    public final void setUnitColor(@ColorInt int color) {
        this.mUnitColor = color;
        invalidate();
    }

    public final void setUnitSpace(int unitSpace) {
        this.mUnitSpacing = unitSpace;
        invalidate();
    }

    public final void setUnitStyle(float textSize, int textColor) {
        this.mUnitSize = Math.round(ChartUtil.dp2px(this.mContext, textSize));
        this.mUnitColor = textColor;
        invalidate();
    }

    public final void setValue(@NotNull String value) {
        if (TextUtils.equals(value, this.mValues[0])) {
            return;
        }
        this.mValues[0] = value;
        requestLayout();
        invalidate();
    }

    public final void setValueColor(@ColorInt int color) {
        this.mValueColor = color;
        invalidate();
    }

    public final void setValueSize(float textSize) {
        this.mValueSize = Math.round(ChartUtil.dp2px(this.mContext, textSize));
        invalidate();
    }

    public final void setValueStyle(float textSize, int textColor) {
        this.mValueSize = Math.round(ChartUtil.dp2px(this.mContext, textSize));
        this.mValueColor = textColor;
        invalidate();
    }

    public final void setValues(@NotNull String... values) {
        int length = values.length;
        if (!(length % 2 == 0)) {
            throw new IllegalArgumentException("参数个数必须为偶数".toString());
        }
        String[] strArr = new String[length];
        this.mValues = strArr;
        System.arraycopy(values, 0, strArr, 0, length);
        requestLayout();
        invalidate();
    }

    public /* synthetic */ StepUnitTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void setUnit(@StringRes int stringRes) {
        setUnit(this.mContext.getString(stringRes));
    }

    public final void setValue(@StringRes int stringRes) {
        setValue(this.mContext.getString(stringRes));
    }

    public final void setValue(float value, @NotNull String unit) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        setValue(String.format(Locale.getDefault(), p, Arrays.copyOf(new Object[]{Float.valueOf(value)}, 1)));
        setUnit(unit);
    }

    public final void setValue(int value, @NotNull String unit) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        setValue(String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(value)}, 1)));
        setUnit(unit);
    }

    public final void setValue(@NotNull String value, @NotNull String unit) {
        if (TextUtils.equals(value, this.mValues[0]) && TextUtils.equals(unit, this.mValues[1])) {
            return;
        }
        this.mValues[0] = value;
        this.mValues[1] = unit;
        requestLayout();
        invalidate();
    }
}
