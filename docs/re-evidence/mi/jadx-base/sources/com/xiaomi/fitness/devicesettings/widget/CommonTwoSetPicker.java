package com.xiaomi.fitness.devicesettings.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
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
public class CommonTwoSetPicker extends FrameLayout {
    public static final NumberPicker.d d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NumberPicker f12023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NumberPicker f12024b;
    public boolean c;

    public class a implements NumberPicker.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StringBuilder f12025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Formatter f12026b;
        public final Object[] c;

        public a() {
            StringBuilder sb = new StringBuilder();
            this.f12025a = sb;
            this.f12026b = new Formatter(sb, Locale.US);
            this.c = new Object[1];
        }

        @Override // miuix.pickerwidget.widget.NumberPicker.d
        public String format(int i) {
            this.c[0] = Integer.valueOf(i);
            StringBuilder sb = this.f12025a;
            sb.delete(0, sb.length());
            this.f12026b.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, this.c);
            return this.f12026b.toString();
        }
    }

    public interface b {
    }

    public CommonTwoSetPicker(Context context) {
        this(context, null);
    }

    public final /* synthetic */ void c(NumberPicker numberPicker, int i, int i2) {
        e();
    }

    public final /* synthetic */ void d(NumberPicker numberPicker, int i, int i2) {
        e();
    }

    public final void e() {
        sendAccessibilityEvent(4);
    }

    public void f(String[] strArr, int i, boolean z) {
        NumberPicker numberPicker = z ? this.f12023a : this.f12024b;
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(strArr.length - 1);
        numberPicker.setDisplayedValues(strArr);
        numberPicker.setValue(i);
        e();
    }

    public void g(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.f12023a.setLabel(str);
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f12024b.setLabel(str2);
    }

    public int getCurrentLeftValue() {
        return this.f12023a.getValue();
    }

    public int getCurrentRightValue() {
        return this.f12024b.getValue();
    }

    public void h(boolean z, boolean z2) {
        this.f12023a.setVisibility(z ? 0 : 8);
        this.f12024b.setVisibility(z2 ? 0 : 8);
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.c;
    }

    public void setCurrentLeftValue(int i) {
        if (i == getCurrentLeftValue()) {
            return;
        }
        this.f12023a.setValue(i);
        e();
    }

    public void setCurrentRightValue(float f) {
        int i = ((int) f) * 10;
        if (i == getCurrentLeftValue()) {
            return;
        }
        this.f12024b.setValue(i);
        e();
    }

    public void setDataFormatterLeft(NumberPicker.d dVar) {
        this.f12023a.setFormatter(dVar);
    }

    public void setDataFormatterRight(NumberPicker.d dVar) {
        this.f12024b.setFormatter(dVar);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        if (this.c == z) {
            return;
        }
        super.setEnabled(z);
        this.f12023a.setEnabled(z);
        this.f12024b.setEnabled(z);
        this.c = z;
    }

    public void setOnValueChangedListener(b bVar) {
    }

    public CommonTwoSetPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CommonTwoSetPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = true;
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(eui.p3, (ViewGroup) this, true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i4j.N0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(i4j.O0, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(i4j.Q0, 20);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(i4j.R0, 16);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(i4j.P0, 10);
        typedArrayObtainStyledAttributes.recycle();
        NumberPicker numberPicker = (NumberPicker) findViewById(zqi.s4);
        this.f12023a = numberPicker;
        if (!z) {
            ((LinearLayout.LayoutParams) numberPicker.getLayoutParams()).width = -2;
        }
        numberPicker.setOnLongPressUpdateInterval(100L);
        NumberPicker.d dVar = d;
        numberPicker.setFormatter(dVar);
        numberPicker.setOnValueChangedListener(new NumberPicker.h() { // from class: t84
            @Override // miuix.pickerwidget.widget.NumberPicker.h
            public final void a(NumberPicker numberPicker2, int i2, int i3) {
                this.f34442a.c(numberPicker2, i2, i3);
            }
        });
        NumberPicker numberPicker2 = (NumberPicker) findViewById(zqi.x7);
        this.f12024b = numberPicker2;
        if (!z) {
            ((LinearLayout.LayoutParams) numberPicker2.getLayoutParams()).width = -2;
        }
        numberPicker2.setFormatter(dVar);
        numberPicker2.setOnValueChangedListener(new NumberPicker.h() { // from class: u84
            @Override // miuix.pickerwidget.widget.NumberPicker.h
            public final void a(NumberPicker numberPicker3, int i2, int i3) {
                this.f35513a.d(numberPicker3, i2, i3);
            }
        });
        if (isEnabled()) {
            return;
        }
        setEnabled(false);
    }
}
