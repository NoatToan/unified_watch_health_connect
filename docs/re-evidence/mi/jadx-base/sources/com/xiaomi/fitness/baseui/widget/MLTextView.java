package com.xiaomi.fitness.baseui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.xiaomi.fitness.common.utils.RomUtils;
import defpackage.sye;

/* JADX INFO: loaded from: classes7.dex */
public class MLTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public sye f11706a;

    public MLTextView(Context context) {
        super(context);
        d();
    }

    public final void d() {
        if (getTypeface() != null && getTypeface().isBold() && RomUtils.isXiaomi()) {
            setTypeface(Typeface.DEFAULT_BOLD);
        }
    }

    @Override // android.widget.TextView
    public TextPaint getPaint() {
        if (this.f11706a == null) {
            this.f11706a = new sye(this, super.getPaint());
        }
        return this.f11706a;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.toString();
        } catch (IndexOutOfBoundsException e2) {
            e2.toString();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        try {
            super.onMeasure(i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        } catch (IndexOutOfBoundsException unused2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        }
    }

    public MLTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d();
    }

    public MLTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d();
    }
}
