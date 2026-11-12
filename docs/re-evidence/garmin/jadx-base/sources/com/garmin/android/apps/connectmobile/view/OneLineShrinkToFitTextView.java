package com.garmin.android.apps.connectmobile.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Parcel;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.text.style.MetricAffectingSpan;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.Array;
import r22.j1;

/* JADX INFO: loaded from: classes10.dex */
public class OneLineShrinkToFitTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f47508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f47509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f47510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f47511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f47512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextPaint f47513f;

    public static class a extends TextAppearanceSpan {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f47514a;

        public a(Parcel parcel) {
            super(parcel);
            this.f47514a = 1.0f;
        }

        @Override // android.text.style.TextAppearanceSpan, android.text.style.MetricAffectingSpan
        public final void updateMeasureState(TextPaint textPaint) {
            super.updateMeasureState(textPaint);
            if (this.f47514a > 0.0f) {
                textPaint.setTextSize(textPaint.getTextSize() * this.f47514a);
            }
        }
    }

    public OneLineShrinkToFitTextView(Context context) {
        super(context);
        this.f47510c = 0.0f;
        c(context, null, 0);
    }

    public final void c(Context context, AttributeSet attributeSet, int i14) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j1.f149715q, i14, 0);
            Context context2 = getContext();
            this.f47509b = typedArrayObtainStyledAttributes.getDimension(1, context2 != null ? (int) (10 * context2.getResources().getDisplayMetrics().scaledDensity) : -1);
            this.f47510c = typedArrayObtainStyledAttributes.getFraction(2, 1, 1, 0.0f);
            this.f47511d = typedArrayObtainStyledAttributes.getBoolean(0, false);
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f47513f = new TextPaint();
        this.f47508a = getTextSize();
        this.f47512e = getPaint().descent();
        float f14 = this.f47510c;
        if (f14 > 0.0f && f14 < 1.0f) {
            this.f47509b = this.f47508a * f14;
        }
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
        setIncludeFontPadding(!this.f47511d);
        setGravity(8388611);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float d(CharSequence charSequence) {
        if (!(charSequence instanceof Spanned)) {
            return this.f47513f.measureText(charSequence, 0, charSequence.length());
        }
        Spanned spanned = (Spanned) charSequence;
        MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(0, spanned.length(), MetricAffectingSpan.class);
        if (metricAffectingSpanArr == 0 || metricAffectingSpanArr.length <= 0) {
            return this.f47513f.measureText(spanned, 0, spanned.length());
        }
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, metricAffectingSpanArr.length, 2);
        for (int i14 = 0; i14 < metricAffectingSpanArr.length; i14++) {
            iArr[i14][0] = spanned.getSpanStart(metricAffectingSpanArr[i14]);
            iArr[i14][1] = spanned.getSpanEnd(metricAffectingSpanArr[i14]);
        }
        TextPaint textPaint = new TextPaint();
        float fMeasureText = 0.0f;
        int i15 = 0;
        while (i15 != spanned.length()) {
            textPaint.set(this.f47513f);
            int iNextSpanTransition = spanned.nextSpanTransition(i15, spanned.length(), MetricAffectingSpan.class);
            for (int i16 = 0; i16 < metricAffectingSpanArr.length; i16++) {
                int[] iArr2 = iArr[i16];
                if (iArr2[0] <= i15 && iArr2[1] >= iNextSpanTransition) {
                    metricAffectingSpanArr[i16].updateMeasureState(textPaint);
                }
            }
            fMeasureText += textPaint.measureText(spanned, i15, iNextSpanTransition);
            i15 = iNextSpanTransition;
        }
        return fMeasureText;
    }

    public final void e(int i14, CharSequence charSequence) {
        if (i14 <= 0 || charSequence == null || charSequence.length() == 0) {
            return;
        }
        int compoundPaddingStart = (i14 - getCompoundPaddingStart()) - getCompoundPaddingEnd();
        this.f47513f.set(getPaint());
        float f14 = this.f47508a;
        float f15 = this.f47509b;
        this.f47513f.setTextSize(f14);
        TransformationMethod transformationMethod = getTransformationMethod();
        CharSequence transformation = transformationMethod != null ? transformationMethod.getTransformation(charSequence, this) : charSequence;
        a[] aVarArr = charSequence instanceof Spanned ? (a[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), a.class) : null;
        float f16 = compoundPaddingStart;
        if (d(transformation) > f16 && f14 > f15) {
            while (f14 - f15 > 0.5f) {
                float f17 = (f14 + f15) / 2.0f;
                if (aVarArr != null && aVarArr.length > 0) {
                    float f18 = f17 / this.f47508a;
                    for (a aVar : aVarArr) {
                        aVar.f47514a = f18;
                    }
                }
                this.f47513f.setTextSize(f17);
                if (d(transformation) >= f16) {
                    f14 = f17;
                } else {
                    f15 = f17;
                }
            }
            f14 = f15;
        }
        setTextSize(0, f14);
        if (aVarArr == null || aVarArr.length <= 0) {
            return;
        }
        float f19 = f14 / this.f47508a;
        for (a aVar2 : aVarArr) {
            aVar2.f47514a = f19;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f47511d) {
            canvas.translate(0.0f, this.f47513f.descent() - this.f47512e);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i14, int i15, int i16, int i17) {
        if (i14 != i16) {
            e(i14, getText());
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        e(getWidth(), charSequence);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) throws Throwable {
        CharSequence charSequence2 = null;
        Parcel parcel = null;
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        if (spanned != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence.toString());
            for (Object obj : spanned.getSpans(0, charSequence.length(), Object.class)) {
                int spanStart = spanned.getSpanStart(obj);
                int spanEnd = spanned.getSpanEnd(obj);
                if (obj instanceof TextAppearanceSpan) {
                    TextAppearanceSpan textAppearanceSpan = (TextAppearanceSpan) obj;
                    try {
                        Parcel parcelObtain = Parcel.obtain();
                        try {
                            textAppearanceSpan.writeToParcel(parcelObtain, 0);
                            parcelObtain.setDataPosition(0);
                            a aVar = new a(parcelObtain);
                            parcelObtain.recycle();
                            spannableStringBuilder.setSpan(aVar, spanStart, spanEnd, 18);
                        } catch (Throwable th3) {
                            th = th3;
                            parcel = parcelObtain;
                            if (parcel != null) {
                                parcel.recycle();
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } else {
                    spannableStringBuilder.setSpan(obj, spanStart, spanEnd, 18);
                }
            }
            charSequence2 = spannableStringBuilder;
        }
        if (charSequence2 != null) {
            charSequence = charSequence2;
        }
        super.setText(charSequence, bufferType);
    }

    public OneLineShrinkToFitTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47510c = 0.0f;
        c(context, attributeSet, 0);
    }

    public OneLineShrinkToFitTextView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.f47510c = 0.0f;
        c(context, attributeSet, i14);
    }
}
