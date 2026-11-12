package com.xiaomi.fitness.habit.widget;

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
import defpackage.dri;
import defpackage.iui;
import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public class TimePicker extends FrameLayout {
    public static final f g = new a();
    public static final miuix.pickerwidget.widget.NumberPicker.d h = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NumberPickerView f12211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NumberPickerView f12212b;
    public boolean c;
    public f d;
    public Calendar e;
    public Locale f;

    public class a implements f {
        @Override // com.xiaomi.fitness.habit.widget.TimePicker.f
        public void a(TimePicker timePicker, int i, int i2) {
        }
    }

    public class b implements NumberPickerView.d {
        public b() {
        }

        @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.d
        public void onValueChange(NumberPickerView numberPickerView, int i, int i2) {
            TimePicker.this.e();
        }
    }

    public class c implements NumberPickerView.d {
        public c() {
        }

        @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.d
        public void onValueChange(NumberPickerView numberPickerView, int i, int i2) {
            int minValue = TimePicker.this.f12212b.getMinValue();
            int maxValue = TimePicker.this.f12212b.getMaxValue();
            if (i == maxValue && i2 == minValue) {
                TimePicker.this.f12211a.setValue(TimePicker.this.f12211a.getValue() + 1);
            } else if (i == minValue && i2 == maxValue) {
                TimePicker.this.f12211a.setValue(TimePicker.this.f12211a.getValue() - 1);
            }
            TimePicker.this.e();
        }
    }

    public class d implements miuix.pickerwidget.widget.NumberPicker.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StringBuilder f12217a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Formatter f12218b;
        public final Object[] c;

        public d() {
            StringBuilder sb = new StringBuilder();
            this.f12217a = sb;
            this.f12218b = new Formatter(sb, Locale.US);
            this.c = new Object[1];
        }

        @Override // miuix.pickerwidget.widget.NumberPicker.d
        public String format(int i) {
            this.c[0] = Integer.valueOf(i);
            StringBuilder sb = this.f12217a;
            sb.delete(0, sb.length());
            this.f12218b.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, this.c);
            return this.f12218b.toString();
        }
    }

    public class e implements NumberPickerView.d {
        public e() {
        }

        @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.d
        public void onValueChange(NumberPickerView numberPickerView, int i, int i2) {
            TimePicker.this.d();
        }
    }

    public interface f {
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

    public void d() {
        e();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public final void e() {
        sendAccessibilityEvent(4);
        f fVar = this.d;
        if (fVar != null) {
            fVar.a(this, getCurrentHour().intValue(), getCurrentMinute().intValue());
        }
    }

    public final void f() {
        this.f12211a.setMinValue(0);
        this.f12211a.setMaxValue(23);
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.f12211a.getBaseline();
    }

    public Integer getCurrentHour() {
        return Integer.valueOf(this.f12211a.getValue());
    }

    public Integer getCurrentMinute() {
        return Integer.valueOf(this.f12212b.getValue());
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
        this.f12211a.setValue(num.intValue());
        e();
    }

    public void setCurrentMinute(Integer num) {
        if (num == getCurrentMinute()) {
            return;
        }
        this.f12212b.setValue(num.intValue());
        e();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        if (this.c == z) {
            return;
        }
        super.setEnabled(z);
        this.f12212b.setEnabled(z);
        this.f12211a.setEnabled(z);
        this.c = z;
    }

    public void setOnTimeChangedListener(f fVar) {
        this.d = fVar;
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f12213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f12214b;

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
            return this.f12213a;
        }

        public int c() {
            return this.f12214b;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f12213a);
            parcel.writeInt(this.f12214b);
        }

        public SavedState(Parcelable parcelable, int i, int i2) {
            super(parcelable);
            this.f12213a = i;
            this.f12214b = i2;
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f12213a = parcel.readInt();
            this.f12214b = parcel.readInt();
        }
    }

    public TimePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = true;
        setCurrentLocale(Locale.getDefault());
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(iui.v, (ViewGroup) this, true);
        NumberPickerView numberPickerView = (NumberPickerView) findViewById(dri.w);
        this.f12211a = numberPickerView;
        numberPickerView.setOnValueChangedListener(new b());
        NumberPickerView numberPickerView2 = (NumberPickerView) findViewById(dri.E);
        this.f12212b = numberPickerView2;
        numberPickerView2.setMinValue(0);
        numberPickerView2.setMaxValue(59);
        numberPickerView2.setOnValueChangedListener(new c());
        numberPickerView2.setOnValueChangedListener(new e());
        f();
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
