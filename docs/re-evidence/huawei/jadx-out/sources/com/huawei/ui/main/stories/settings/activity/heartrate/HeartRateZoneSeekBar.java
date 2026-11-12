package com.huawei.ui.main.stories.settings.activity.heartrate;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.ui.main.R;
import defpackage.ltc;
import defpackage.wlw;
import health.compact.a.LanguageUtil;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class HeartRateZoneSeekBar extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f28812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private wlw f28813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f28814c;
    private float d;
    private float e;
    private float f;
    private Paint g;
    private int h;
    private Path i;
    private boolean j;
    private float k;
    private float l;
    private int o;

    public HeartRateZoneSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28812a = false;
        this.j = false;
        this.g = new Paint();
        this.i = new Path();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HeartRateZoneSeekBar);
        this.e = typedArrayObtainStyledAttributes.getDimension(R.styleable.HeartRateZoneSeekBar_seekbarHeight, getResources().getDimension(R.dimen.common_switch_button_height));
        this.l = typedArrayObtainStyledAttributes.getDimension(R.styleable.HeartRateZoneSeekBar_numberSize, getResources().getDimension(R.dimen.textSizeCaption));
        this.j = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HeartRateZoneSeekBar_toShowTips, false);
        this.o = typedArrayObtainStyledAttributes.getColor(R.styleable.HeartRateZoneSeekBar_tipsTextColor, getResources().getColor(R.color.textColorSecondary));
        this.h = typedArrayObtainStyledAttributes.getColor(R.styleable.HeartRateZoneSeekBar_tipsMarkColor, getResources().getColor(R.color.listDivider));
        this.d = typedArrayObtainStyledAttributes.getDimension(R.styleable.HeartRateZoneSeekBar_dotLineHeight, 0.0f);
        this.f28814c = typedArrayObtainStyledAttributes.getDimension(R.styleable.HeartRateZoneSeekBar_dotLineWidth, 0.0f);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R.styleable.HeartRateZoneSeekBar_marginToBar, 0.0f);
        this.f = dimension;
        this.k = this.e + this.l + this.d + dimension;
        this.f28812a = LanguageUtil.ba(getContext());
        typedArrayObtainStyledAttributes.recycle();
    }

    public void e() {
        postInvalidate();
    }

    public void b(wlw wlwVar) {
        this.f28813b = wlwVar;
        e();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f28813b == null) {
            return;
        }
        this.g.setStyle(Paint.Style.FILL);
        if (this.f28812a) {
            c(canvas);
        } else {
            d(canvas);
        }
        if (!this.j || this.f28813b.d() == null || this.f28813b.d().length <= 0) {
            return;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(this.l);
        textPaint.setAntiAlias(true);
        textPaint.setColor(this.o);
        c(canvas, textPaint);
    }

    private void c(Canvas canvas) {
        float measuredWidth = getMeasuredWidth();
        float f = this.e / 2.0f;
        this.g.setColor(this.f28813b.a());
        if (!this.f28813b.j()) {
            a(canvas, measuredWidth, f);
            return;
        }
        wlw.c cVar = this.f28813b.e().get(0);
        wlw.c cVar2 = this.f28813b.e().get(this.f28813b.e().size() - 1);
        float fB = (measuredWidth - this.e) / (this.f28813b.b() - this.f28813b.c());
        if (this.f28813b.b() - cVar2.c() < 0.01f) {
            this.g.setColor(cVar2.e());
            float f2 = this.e;
            canvas.drawArc(0.0f, 0.0f, f2, f2, -90.0f, -180.0f, true, this.g);
        } else {
            this.g.setColor(this.f28813b.a());
            float f3 = this.e;
            canvas.drawArc(0.0f, 0.0f, f3, f3, -90.0f, -180.0f, true, this.g);
            c(canvas, f, ((this.f28813b.b() - cVar2.c()) * fB) + f, this.f28813b.a());
        }
        List<wlw.c> listE = this.f28813b.e();
        for (int size = listE.size() - 1; size >= 0; size--) {
            wlw.c cVar3 = listE.get(size);
            float fB2 = ((this.f28813b.b() - cVar3.c()) * fB) + f;
            c(canvas, fB2, ((cVar3.c() - cVar3.b()) * fB) + fB2, cVar3.e());
        }
        if (cVar.b() - this.f28813b.c() < 0.01f) {
            this.g.setColor(cVar.e());
            float f4 = this.e;
            canvas.drawArc(measuredWidth - f4, 0.0f, measuredWidth, f4, 270.0f, 180.0f, true, this.g);
        } else {
            c(canvas, ((this.f28813b.b() - cVar.b()) * fB) + f, measuredWidth - f, this.f28813b.a());
            float f5 = this.e;
            canvas.drawArc(measuredWidth - f5, 0.0f, measuredWidth, f5, 270.0f, 180.0f, true, this.g);
        }
    }

    private void c(Canvas canvas, float f, float f2, int i) {
        this.g.setColor(i);
        this.i.reset();
        this.i.moveTo(f, 0.0f);
        this.i.lineTo(f2, 0.0f);
        this.i.lineTo(f2, this.e);
        this.i.lineTo(f, this.e);
        this.i.lineTo(f, 0.0f);
        canvas.drawPath(this.i, this.g);
    }

    private void a(Canvas canvas, float f, float f2) {
        c(canvas, f2, f - f2, this.f28813b.a());
        float f3 = this.e;
        canvas.drawArc(0.0f, 0.0f, f3, f3, -90.0f, -180.0f, true, this.g);
        float f4 = this.e;
        canvas.drawArc(f - f4, 0.0f, f, f4, 270.0f, 180.0f, true, this.g);
    }

    private void c(Canvas canvas, TextPaint textPaint) {
        float fC;
        float width = (getWidth() - this.e) / (this.f28813b.b() - this.f28813b.c());
        Rect rect = new Rect();
        for (float f : this.f28813b.d()) {
            if (this.f28812a) {
                fC = this.f28813b.b() - f;
            } else {
                fC = f - this.f28813b.c();
            }
            float f2 = fC * width;
            this.g.setColor(this.h);
            this.g.setStrokeWidth(this.f28814c);
            float f3 = this.e;
            float f4 = f2 + (f3 / 2.0f);
            canvas.drawLine(f4, f3 + 0.1f, f4, f3 + this.d, this.g);
            String strC = ltc.c(f, 2, 0);
            textPaint.getTextBounds(strC, 0, strC.length(), rect);
            textPaint.setTextAlign(Paint.Align.CENTER);
            canvas.drawText(strC, ((float) rect.width()) + f2 < ((float) getWidth()) ? f2 + (rect.width() / 2.0f) : (getWidth() - (rect.width() / 2)) - 2, this.e + rect.height() + this.d + this.f, textPaint);
        }
    }

    private void d(Canvas canvas) {
        float measuredWidth = getMeasuredWidth();
        float f = this.e / 2.0f;
        this.g.setColor(this.f28813b.a());
        if (!this.f28813b.j()) {
            a(canvas, measuredWidth, f);
            return;
        }
        wlw.c cVar = this.f28813b.e().get(0);
        wlw.c cVar2 = this.f28813b.e().get(this.f28813b.e().size() - 1);
        float fB = (measuredWidth - this.e) / (this.f28813b.b() - this.f28813b.c());
        if (cVar.b() - this.f28813b.c() < 0.01f) {
            this.g.setColor(cVar.e());
            float f2 = this.e;
            canvas.drawArc(0.0f, 0.0f, f2, f2, -90.0f, -180.0f, true, this.g);
        } else {
            this.g.setColor(this.f28813b.a());
            float f3 = this.e;
            canvas.drawArc(0.0f, 0.0f, f3, f3, -90.0f, -180.0f, true, this.g);
            c(canvas, f, ((cVar.b() - this.f28813b.c()) * fB) + f, this.f28813b.a());
        }
        for (wlw.c cVar3 : this.f28813b.e()) {
            float fB2 = ((cVar3.b() - this.f28813b.c()) * fB) + f;
            c(canvas, fB2, ((cVar3.c() - cVar3.b()) * fB) + fB2, cVar3.e());
        }
        if (this.f28813b.b() - cVar2.c() < 0.01f) {
            this.g.setColor(cVar2.e());
            float f4 = this.e;
            canvas.drawArc(measuredWidth - f4, 0.0f, measuredWidth, f4, 270.0f, 180.0f, true, this.g);
        } else {
            c(canvas, ((cVar2.c() - this.f28813b.c()) * fB) + f, measuredWidth - f, this.f28813b.a());
            float f5 = this.e;
            canvas.drawArc(measuredWidth - f5, 0.0f, measuredWidth, f5, 270.0f, 180.0f, true, this.g);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        float f;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            f = this.k;
        } else {
            if (mode != Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
                f = this.k;
            }
            setMeasuredDimension(size, size2);
        }
        size2 = (int) f;
        setMeasuredDimension(size, size2);
    }
}
