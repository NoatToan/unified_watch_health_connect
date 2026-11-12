package com.xiaomi.fitness.devicesettings.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.timepicker.TimeModel;
import defpackage.eui;
import defpackage.i4j;
import defpackage.zqi;
import java.util.Formatter;
import java.util.Locale;
import miuix.pickerwidget.widget.NumberPicker;

/* JADX INFO: loaded from: classes8.dex */
public class CommonThirdSetPicker extends FrameLayout {
    public static final NumberPicker.d e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NumberPicker f12019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NumberPicker f12020b;
    public final NumberPicker c;
    public boolean d;

    public enum Position {
        left,
        center,
        right
    }

    public class a implements NumberPicker.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StringBuilder f12021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Formatter f12022b;
        public final Object[] c;

        public a() {
            StringBuilder sb = new StringBuilder();
            this.f12021a = sb;
            this.f12022b = new Formatter(sb, Locale.US);
            this.c = new Object[1];
        }

        @Override // miuix.pickerwidget.widget.NumberPicker.d
        public String format(int i) {
            this.c[0] = Integer.valueOf(i);
            StringBuilder sb = this.f12021a;
            sb.delete(0, sb.length());
            this.f12022b.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, this.c);
            return this.f12022b.toString();
        }
    }

    public interface b {
    }

    public CommonThirdSetPicker(Context context) {
        this(context, null);
    }

    public final /* synthetic */ void d(NumberPicker numberPicker, int i, int i2) {
        g();
    }

    public final /* synthetic */ void e(NumberPicker numberPicker, int i, int i2) {
        g();
    }

    public final /* synthetic */ void f(NumberPicker numberPicker, int i, int i2) {
        g();
    }

    public final void g() {
        sendAccessibilityEvent(4);
    }

    public int getCurrentCenterValue() {
        return this.f12020b.getValue();
    }

    public int getCurrentLeftValue() {
        return this.f12019a.getValue();
    }

    public int getCurrentRightValue() {
        return this.c.getValue();
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.d;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        if (this.d == z) {
            return;
        }
        super.setEnabled(z);
        this.f12019a.setEnabled(z);
        this.c.setEnabled(z);
        this.f12020b.setEnabled(z);
        this.d = z;
    }

    public void setOnValueChangedListener(b bVar) {
    }

    public CommonThirdSetPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CommonThirdSetPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = true;
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(eui.o1, (ViewGroup) this, true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i4j.I0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(i4j.J0, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(i4j.L0, 20);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(i4j.M0, 16);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(i4j.K0, 10);
        typedArrayObtainStyledAttributes.recycle();
        NumberPicker numberPicker = (NumberPicker) findViewById(zqi.z6);
        this.f12019a = numberPicker;
        NumberPicker.d dVar = e;
        numberPicker.setFormatter(dVar);
        numberPicker.setOnValueChangedListener(new NumberPicker.h() { // from class: m84
            @Override // miuix.pickerwidget.widget.NumberPicker.h
            public final void a(NumberPicker numberPicker2, int i2, int i3) {
                this.f25875a.d(numberPicker2, i2, i3);
            }
        });
        if (!z) {
            ((LinearLayout.LayoutParams) numberPicker.getLayoutParams()).width = -2;
        }
        NumberPicker numberPicker2 = (NumberPicker) findViewById(zqi.y6);
        this.f12020b = numberPicker2;
        numberPicker2.setFormatter(dVar);
        numberPicker2.setOnValueChangedListener(new NumberPicker.h() { // from class: n84
            @Override // miuix.pickerwidget.widget.NumberPicker.h
            public final void a(NumberPicker numberPicker3, int i2, int i3) {
                this.f27642a.e(numberPicker3, i2, i3);
            }
        });
        if (!z) {
            ((LinearLayout.LayoutParams) numberPicker2.getLayoutParams()).width = -2;
        }
        NumberPicker numberPicker3 = (NumberPicker) findViewById(zqi.A6);
        this.c = numberPicker3;
        numberPicker3.setFormatter(dVar);
        numberPicker3.setOnValueChangedListener(new NumberPicker.h() { // from class: o84
            @Override // miuix.pickerwidget.widget.NumberPicker.h
            public final void a(NumberPicker numberPicker4, int i2, int i3) {
                this.f28848a.f(numberPicker4, i2, i3);
            }
        });
        if (!z) {
            ((LinearLayout.LayoutParams) numberPicker3.getLayoutParams()).width = -2;
        }
        if (isEnabled()) {
            return;
        }
        setEnabled(false);
    }
}
