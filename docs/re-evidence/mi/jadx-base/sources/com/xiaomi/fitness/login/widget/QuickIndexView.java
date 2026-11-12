package com.xiaomi.fitness.login.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.xiaomi.onetrack.api.c;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.clb;
import defpackage.kli;

/* JADX INFO: loaded from: classes9.dex */
public class QuickIndexView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String[] f12369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12370b;
    public int c;
    public String d;
    public String e;
    public String f;
    public int g;
    public a h;
    public Paint i;
    public int j;

    public interface a {
        void onSelect(String str);

        void onSelectOver();
    }

    public QuickIndexView(Context context) {
        this(context, null);
    }

    public static int b(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public final void a() {
        Paint paint = new Paint();
        this.i = paint;
        paint.setColor(Color.parseColor(this.e));
        b(getContext(), 8.66f);
        this.i.setTextSize(30.0f);
        this.i.setTextAlign(Paint.Align.CENTER);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.i.getFontMetrics().bottom;
        float length = this.c / this.f12369a.length;
        for (int i = 0; i < this.f12369a.length; i++) {
            if (i == this.g) {
                this.i.setColor(Color.parseColor(this.f));
            } else {
                this.i.setColor(Color.parseColor(this.e));
            }
            canvas.drawText(this.f12369a[i], this.f12370b / 2.0f, (i * length) + (length / 2.0f) + f, this.i);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f12370b = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.c = measuredHeight;
        int i3 = this.j;
        if (measuredHeight > i3) {
            this.c = i3;
            setMeasuredDimension(this.f12370b, i3);
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                this.h.onSelectOver();
                invalidate();
            } else if (action == 2) {
            }
            return true;
        }
        clb.a(getContext());
        float y = motionEvent.getY();
        int i = this.c;
        String[] strArr = this.f12369a;
        int length = (int) (y / (i / strArr.length));
        if (length > strArr.length - 1 || length < 0 || this.d.equals(strArr[length])) {
            return true;
        }
        this.d = this.f12369a[length];
        this.g = length;
        this.h.onSelect(this.f12369a[length]);
        clb.a(getContext());
        return true;
    }

    public void setOnLetterSelectListener(a aVar) {
        this.h = aVar;
    }

    public QuickIndexView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public QuickIndexView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12369a = new String[]{"A", c.f13755a, "C", "D", "E", "F", "G", c.f13756b, "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX};
        this.f12370b = 0;
        this.c = 0;
        this.d = "";
        this.e = "#3F3F3F";
        this.f = "#000000";
        this.g = 0;
        this.j = getResources().getDimensionPixelSize(kli.f23963a);
        a();
    }
}
