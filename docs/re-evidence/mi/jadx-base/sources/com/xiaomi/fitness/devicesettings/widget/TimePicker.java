package com.xiaomi.fitness.devicesettings.widget;

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
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.material.timepicker.TimeModel;
import defpackage.eui;
import defpackage.zqi;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;
import miuix.pickerwidget.widget.NumberPicker;

/* JADX INFO: loaded from: classes8.dex */
public class TimePicker extends FrameLayout {
    public static final h l = new a();
    public static final NumberPicker.d m = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f12033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12034b;
    public final NumberPicker c;
    public final NumberPicker d;
    public final NumberPicker e;
    public final Button f;
    public final String[] g;
    public boolean h;
    public h i;
    public Calendar j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Locale f12035k;

    public class a implements h {
        @Override // com.xiaomi.fitness.devicesettings.widget.TimePicker.h
        public void onTimeChanged(TimePicker timePicker, int i, int i2) {
        }
    }

    public class b implements NumberPicker.h {
        public b() {
        }

        @Override // miuix.pickerwidget.widget.NumberPicker.h
        public void a(NumberPicker numberPicker, int i, int i2) {
            if (!TimePicker.this.h() && ((i == 11 && i2 == 12) || (i == 12 && i2 == 11))) {
                TimePicker timePicker = TimePicker.this;
                timePicker.f12034b = !timePicker.f12034b;
                TimePicker.this.k();
            }
            TimePicker.this.i();
        }
    }

    public class c implements NumberPicker.h {
        public c() {
        }

        @Override // miuix.pickerwidget.widget.NumberPicker.h
        public void a(NumberPicker numberPicker, int i, int i2) {
            int minValue = TimePicker.this.d.getMinValue();
            int maxValue = TimePicker.this.d.getMaxValue();
            if (i == maxValue && i2 == minValue) {
                int value = TimePicker.this.c.getValue() + 1;
                if (!TimePicker.this.h() && value == 12) {
                    TimePicker timePicker = TimePicker.this;
                    timePicker.f12034b = !timePicker.f12034b;
                    TimePicker.this.k();
                }
                TimePicker.this.c.setValue(value);
            } else if (i == minValue && i2 == maxValue) {
                int value2 = TimePicker.this.c.getValue() - 1;
                if (!TimePicker.this.h() && value2 == 11) {
                    TimePicker timePicker2 = TimePicker.this;
                    timePicker2.f12034b = !timePicker2.f12034b;
                    TimePicker.this.k();
                }
                TimePicker.this.c.setValue(value2);
            }
            TimePicker.this.i();
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            view.requestFocus();
            TimePicker timePicker = TimePicker.this;
            timePicker.f12034b = !timePicker.f12034b;
            TimePicker.this.k();
            TimePicker.this.i();
        }
    }

    public class e implements NumberPicker.h {
        public e() {
        }

        @Override // miuix.pickerwidget.widget.NumberPicker.h
        public void a(NumberPicker numberPicker, int i, int i2) {
            numberPicker.requestFocus();
            TimePicker timePicker = TimePicker.this;
            timePicker.f12034b = !timePicker.f12034b;
            TimePicker.this.k();
            TimePicker.this.i();
        }
    }

    public class f implements NumberPicker.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StringBuilder f12042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Formatter f12043b;
        public final Object[] c;

        public f() {
            StringBuilder sb = new StringBuilder();
            this.f12042a = sb;
            this.f12043b = new Formatter(sb, Locale.US);
            this.c = new Object[1];
        }

        @Override // miuix.pickerwidget.widget.NumberPicker.d
        public String format(int i) {
            this.c[0] = Integer.valueOf(i);
            StringBuilder sb = this.f12042a;
            sb.delete(0, sb.length());
            this.f12043b.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, this.c);
            return this.f12043b.toString();
        }
    }

    public class g implements NumberPicker.h {
        public g() {
        }

        @Override // miuix.pickerwidget.widget.NumberPicker.h
        public void a(NumberPicker numberPicker, int i, int i2) {
            TimePicker.this.g();
        }
    }

    public interface h {
        void onTimeChanged(TimePicker timePicker, int i, int i2);
    }

    public TimePicker(Context context) {
        this(context, null);
    }

    private void setCurrentLocale(Locale locale) {
        if (locale.equals(this.f12035k)) {
            return;
        }
        this.f12035k = locale;
        this.j = Calendar.getInstance(locale);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public void g() {
        i();
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.c.getBaseline();
    }

    public Integer getCurrentHour() {
        int value = this.c.getValue();
        if (h()) {
            return Integer.valueOf(value);
        }
        return this.f12034b ? Integer.valueOf(value % 12) : Integer.valueOf((value % 12) + 12);
    }

    public Integer getCurrentMinute() {
        return Integer.valueOf(this.d.getValue());
    }

    public boolean h() {
        return this.f12033a;
    }

    public final void i() {
        sendAccessibilityEvent(4);
        h hVar = this.i;
        if (hVar != null) {
            hVar.onTimeChanged(this, getCurrentHour().intValue(), getCurrentMinute().intValue());
        }
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.h;
    }

    public void j(int i, int i2) {
        if (i != 0) {
            this.c.setLabel(getContext().getString(i));
        }
        if (i2 != 0) {
            this.d.setLabel(getContext().getString(i2));
        }
    }

    public final void k() {
        if (h()) {
            NumberPicker numberPicker = this.e;
            if (numberPicker != null) {
                numberPicker.setVisibility(8);
            } else {
                this.f.setVisibility(8);
            }
        } else {
            int i = !this.f12034b ? 1 : 0;
            NumberPicker numberPicker2 = this.e;
            if (numberPicker2 != null) {
                numberPicker2.setValue(i);
                this.e.setVisibility(0);
            } else {
                this.f.setText(this.g[i]);
                this.f.setVisibility(0);
            }
        }
        sendAccessibilityEvent(4);
    }

    public final void l() {
        if (h()) {
            this.c.setMinValue(0);
            this.c.setMaxValue(23);
            this.c.setFormatter(m);
        } else {
            this.c.setMinValue(1);
            this.c.setMaxValue(12);
            this.c.setFormatter(null);
        }
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
        int i = this.f12033a ? 129 : 65;
        this.j.set(11, getCurrentHour().intValue());
        this.j.set(12, getCurrentMinute().intValue());
        accessibilityEvent.getText().add(DateUtils.formatDateTime(getContext(), this.j.getTimeInMillis(), i));
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
        if (!h()) {
            if (num.intValue() >= 12) {
                this.f12034b = false;
                if (num.intValue() > 12) {
                    num = Integer.valueOf(num.intValue() - 12);
                }
            } else {
                this.f12034b = true;
                if (num.intValue() == 0) {
                    num = 12;
                }
            }
            k();
        }
        this.c.setValue(num.intValue());
        i();
    }

    public void setCurrentMinute(Integer num) {
        if (num == getCurrentMinute()) {
            return;
        }
        this.d.setValue(num.intValue());
        i();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        if (this.h == z) {
            return;
        }
        super.setEnabled(z);
        this.d.setEnabled(z);
        this.c.setEnabled(z);
        NumberPicker numberPicker = this.e;
        if (numberPicker != null) {
            numberPicker.setEnabled(z);
        } else {
            this.f.setEnabled(z);
        }
        this.h = z;
    }

    public void setHourSpinnerVisible(int i) {
        this.c.setVisibility(i);
    }

    public void setIs24HourView(Boolean bool) {
        if (this.f12033a == bool.booleanValue()) {
            return;
        }
        this.f12033a = bool.booleanValue();
        Integer currentHour = getCurrentHour();
        currentHour.intValue();
        l();
        setCurrentHour(currentHour);
        k();
    }

    public void setIs24HourViewMinute(Boolean bool) {
        if (this.f12033a == bool.booleanValue()) {
            return;
        }
        this.f12033a = bool.booleanValue();
        Integer currentHour = getCurrentHour();
        currentHour.intValue();
        l();
        setCurrentHour(currentHour);
        k();
    }

    public void setMinSpinnerVisible(int i) {
        this.d.setVisibility(i);
    }

    public void setOnTimeChangedListener(h hVar) {
        this.i = hVar;
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f12036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f12037b;

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
            return this.f12036a;
        }

        public int c() {
            return this.f12037b;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f12036a);
            parcel.writeInt(this.f12037b);
        }

        public SavedState(Parcelable parcelable, int i, int i2) {
            super(parcelable);
            this.f12036a = i;
            this.f12037b = i2;
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f12036a = parcel.readInt();
            this.f12037b = parcel.readInt();
        }
    }

    public TimePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = true;
        setCurrentLocale(Locale.getDefault());
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(eui.k2, (ViewGroup) this, true);
        NumberPicker numberPicker = (NumberPicker) findViewById(zqi.z3);
        this.c = numberPicker;
        numberPicker.setOnValueChangedListener(new b());
        NumberPicker numberPicker2 = (NumberPicker) findViewById(zqi.i5);
        this.d = numberPicker2;
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(59);
        numberPicker2.setOnLongPressUpdateInterval(100L);
        numberPicker2.setFormatter(m);
        numberPicker2.setOnValueChangedListener(new c());
        numberPicker2.setOnValueChangedListener(new g());
        String[] amPmStrings = new DateFormatSymbols().getAmPmStrings();
        this.g = amPmStrings;
        View viewFindViewById = findViewById(zqi.v);
        if (viewFindViewById instanceof Button) {
            this.e = null;
            Button button = (Button) viewFindViewById;
            this.f = button;
            button.setOnClickListener(new d());
        } else {
            this.f = null;
            NumberPicker numberPicker3 = (NumberPicker) viewFindViewById;
            this.e = numberPicker3;
            numberPicker3.setMinValue(0);
            numberPicker3.setMaxValue(1);
            numberPicker3.setDisplayedValues(amPmStrings);
            numberPicker3.setOnValueChangedListener(new e());
        }
        l();
        k();
        setOnTimeChangedListener(l);
        setCurrentHour(Integer.valueOf(this.j.get(11)));
        setCurrentMinute(Integer.valueOf(this.j.get(12)));
        if (!isEnabled()) {
            setEnabled(false);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
