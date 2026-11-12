package com.xiaomi.fitness.trail.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import com.google.android.material.timepicker.TimeModel;
import com.xiaomi.fitness.baseui.widget.NumberPickerView;
import defpackage.bsi;
import defpackage.ivi;
import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;
import miuix.pickerwidget.widget.NumberPicker;

/* JADX INFO: loaded from: classes10.dex */
public class TimePicker extends FrameLayout {
    public static final g g = new a();
    public static final NumberPicker.d h = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NumberPickerView f13264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NumberPickerView f13265b;
    public boolean c;
    public g d;
    public Calendar e;
    public Locale f;

    public class a implements g {
        @Override // com.xiaomi.fitness.trail.widget.TimePicker.g
        public void a(TimePicker timePicker, int i, int i2) {
        }
    }

    public class b implements NumberPickerView.d {
        public b() {
        }

        @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.d
        public void onValueChange(NumberPickerView numberPickerView, int i, int i2) {
            TimePicker.this.g();
        }
    }

    public class c implements NumberPickerView.d {
        public c() {
        }

        @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.d
        public void onValueChange(NumberPickerView numberPickerView, int i, int i2) {
            int minValue = TimePicker.this.f13265b.getMinValue();
            int maxValue = TimePicker.this.f13265b.getMaxValue();
            if (i == maxValue && i2 == minValue) {
                TimePicker.this.f13264a.setValue(TimePicker.this.f13264a.getValue() + 1);
            } else if (i == minValue && i2 == maxValue) {
                TimePicker.this.f13264a.setValue(TimePicker.this.f13264a.getValue() - 1);
            }
            TimePicker.this.g();
        }
    }

    public class d implements NumberPickerView.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f13270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f13271b;

        public d(int i, int i2) {
            this.f13270a = i;
            this.f13271b = i2;
        }

        @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.d
        public void onValueChange(NumberPickerView numberPickerView, int i, int i2) {
            if (this.f13270a == TimePicker.this.f13264a.getValue() && i2 == this.f13271b) {
                TimePicker.this.f13265b.h0();
            }
        }
    }

    public class e implements NumberPicker.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StringBuilder f13272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Formatter f13273b;
        public final Object[] c;

        public e() {
            StringBuilder sb = new StringBuilder();
            this.f13272a = sb;
            this.f13273b = new Formatter(sb, Locale.US);
            this.c = new Object[1];
        }

        @Override // miuix.pickerwidget.widget.NumberPicker.d
        public String format(int i) {
            this.c[0] = Integer.valueOf(i);
            StringBuilder sb = this.f13272a;
            sb.delete(0, sb.length());
            this.f13273b.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, this.c);
            return this.f13273b.toString();
        }
    }

    public class f implements NumberPickerView.d {
        public f() {
        }

        @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.d
        public void onValueChange(NumberPickerView numberPickerView, int i, int i2) {
            TimePicker.this.e();
        }
    }

    public interface g {
        void a(TimePicker timePicker, int i, int i2);
    }

    public TimePicker(Context context) {
        this(context, null);
    }

    private void setCurrentLocale(Locale locale) {
        if (locale.equals(this.f)) {
            return;
        }
        this.f = locale;
        this.e = Calendar.getInstance(locale);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public void e() {
        g();
    }

    public final /* synthetic */ void f(int i, NumberPickerView numberPickerView, int i2, int i3) {
        if (i3 == i) {
            this.f13264a.h0();
        }
    }

    public final void g() {
        sendAccessibilityEvent(4);
        g gVar = this.d;
        if (gVar != null) {
            gVar.a(this, getCurrentHour().intValue(), getCurrentMinute().intValue());
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.f13264a.getBaseline();
    }

    public Integer getCurrentHour() {
        return Integer.valueOf(this.f13264a.getValue());
    }

    public Integer getCurrentMinute() {
        return Integer.valueOf(this.f13265b.getValue());
    }

    public void h(final int i, int i2) {
        this.f13264a.setOnValueChangedListener(new NumberPickerView.d() { // from class: jep
            @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.d
            public final void onValueChange(NumberPickerView numberPickerView, int i3, int i4) {
                this.f22714a.f(i, numberPickerView, i3, i4);
            }
        });
        this.f13265b.setOnValueChangedListener(new d(i, i2));
    }

    public final void i() {
        this.f13264a.setMinValue(0);
        this.f13264a.setMaxValue(23);
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.c;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setCurrentLocale(configuration.locale);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(TimePicker.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(TimePicker.class.getName());
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        this.e.set(11, getCurrentHour().intValue());
        this.e.set(12, getCurrentMinute().intValue());
        accessibilityEvent.getText().add(DateUtils.formatDateTime(getContext(), this.e.getTimeInMillis(), 129));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentHour(Integer.valueOf(savedState.a()));
        setCurrentMinute(Integer.valueOf(savedState.c()));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), getCurrentHour().intValue(), getCurrentMinute().intValue());
    }

    public void setCurrentHour(Integer num) {
        if (num == null || num == getCurrentHour()) {
            return;
        }
        this.f13264a.setValue(num.intValue());
        g();
    }

    public void setCurrentMinute(Integer num) {
        if (num == getCurrentMinute()) {
            return;
        }
        this.f13265b.setValue(num.intValue());
        g();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        if (this.c == z) {
            return;
        }
        super.setEnabled(z);
        this.f13265b.setEnabled(z);
        this.f13264a.setEnabled(z);
        this.c = z;
    }

    public void setOnTimeChangedListener(g gVar) {
        this.d = gVar;
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f13266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f13267b;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public int a() {
            return this.f13266a;
        }

        public int c() {
            return this.f13267b;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f13266a);
            parcel.writeInt(this.f13267b);
        }

        public SavedState(Parcelable parcelable, int i, int i2) {
            super(parcelable);
            this.f13266a = i;
            this.f13267b = i2;
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f13266a = parcel.readInt();
            this.f13267b = parcel.readInt();
        }
    }

    public TimePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = true;
        setCurrentLocale(Locale.getDefault());
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(ivi.M2, (ViewGroup) this, true);
        NumberPickerView numberPickerView = (NumberPickerView) findViewById(bsi.k2);
        this.f13264a = numberPickerView;
        numberPickerView.setOnValueChangedListener(new b());
        NumberPickerView numberPickerView2 = (NumberPickerView) findViewById(bsi.r4);
        this.f13265b = numberPickerView2;
        numberPickerView2.setMinValue(0);
        numberPickerView2.setMaxValue(59);
        numberPickerView2.setOnValueChangedListener(new c());
        numberPickerView2.setOnValueChangedListener(new f());
        i();
        setOnTimeChangedListener(g);
        setCurrentHour(Integer.valueOf(this.e.get(11)));
        setCurrentMinute(Integer.valueOf(this.e.get(12)));
        if (!isEnabled()) {
            setEnabled(false);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
