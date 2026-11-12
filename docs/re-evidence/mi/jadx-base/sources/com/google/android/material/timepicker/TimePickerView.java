package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import defpackage.iqi;
import defpackage.kwi;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
class TimePickerView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Chip f8942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Chip f8943b;
    public final ClockHandView c;
    public final ClockFaceView d;
    public final MaterialButtonToggleGroup e;
    public final View.OnClickListener f;
    public f g;
    public g h;
    public e i;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TimePickerView.this.h != null) {
                TimePickerView.this.h.d(((Integer) view.getTag(iqi.W)).intValue());
            }
        }
    }

    public class b implements MaterialButtonToggleGroup.d {
        public b() {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
        public void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
            int i2 = i == iqi.n ? 1 : 0;
            if (TimePickerView.this.g == null || !z) {
                return;
            }
            TimePickerView.this.g.c(i2);
        }
    }

    public class c extends GestureDetector.SimpleOnGestureListener {
        public c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            e eVar = TimePickerView.this.i;
            if (eVar == null) {
                return false;
            }
            eVar.d();
            return true;
        }
    }

    public class d implements View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ GestureDetector f8947a;

        public d(GestureDetector gestureDetector) {
            this.f8947a = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f8947a.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    public interface e {
        void d();
    }

    public interface f {
        void c(int i);
    }

    public interface g {
        void d(int i);
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void addOnRotateListener(ClockHandView.d dVar) {
        this.c.addOnRotateListener(dVar);
    }

    public void d(int i) {
        o(this.f8942a, i == 12);
        o(this.f8943b, i == 10);
    }

    public void e(boolean z) {
        this.c.i(z);
    }

    public void f(float f2, boolean z) {
        this.c.l(f2, z);
    }

    public void h(androidx.core.view.a aVar) {
        androidx.core.view.c.r0(this.f8942a, aVar);
    }

    public void i(androidx.core.view.a aVar) {
        androidx.core.view.c.r0(this.f8943b, aVar);
    }

    public void j(g gVar) {
        this.h = gVar;
    }

    public final void k() {
        this.f8942a.setTag(iqi.W, 12);
        this.f8943b.setTag(iqi.W, 10);
        this.f8942a.setOnClickListener(this.f);
        this.f8943b.setOnClickListener(this.f);
        this.f8942a.setAccessibilityClassName("android.view.View");
        this.f8943b.setAccessibilityClassName("android.view.View");
    }

    public void l(String[] strArr, int i) {
        this.d.n(strArr, i);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void m() {
        d dVar = new d(new GestureDetector(getContext(), new c()));
        this.f8942a.setOnTouchListener(dVar);
        this.f8943b.setOnTouchListener(dVar);
    }

    public void n() {
        this.e.setVisibility(0);
    }

    public final void o(Chip chip, boolean z) {
        chip.setChecked(z);
        androidx.core.view.c.t0(chip, z ? 2 : 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        q();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            q();
        }
    }

    @SuppressLint({"DefaultLocale"})
    public void p(int i, int i2, int i3) {
        this.e.d(i == 1 ? iqi.n : iqi.m);
        Locale locale = getResources().getConfiguration().locale;
        String str = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i3));
        String str2 = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i2));
        if (!TextUtils.equals(this.f8942a.getText(), str)) {
            this.f8942a.setText(str);
        }
        if (TextUtils.equals(this.f8943b.getText(), str2)) {
            return;
        }
        this.f8943b.setText(str2);
    }

    public final void q() {
        if (this.e.getVisibility() == 0) {
            androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
            aVar.s(this);
            aVar.q(iqi.j, androidx.core.view.c.A(this) == 0 ? 2 : 1);
            aVar.i(this);
        }
    }

    public void setOnActionUpListener(ClockHandView.c cVar) {
        this.c.setOnActionUpListener(cVar);
    }

    public void setOnDoubleTapListener(e eVar) {
        this.i = eVar;
    }

    public void setOnPeriodChangeListener(f fVar) {
        this.g = fVar;
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = new a();
        LayoutInflater.from(context).inflate(kwi.t, this);
        this.d = (ClockFaceView) findViewById(iqi.f21996k);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(iqi.o);
        this.e = materialButtonToggleGroup;
        materialButtonToggleGroup.addOnButtonCheckedListener(new b());
        this.f8942a = (Chip) findViewById(iqi.t);
        this.f8943b = (Chip) findViewById(iqi.q);
        this.c = (ClockHandView) findViewById(iqi.l);
        m();
        k();
    }
}
