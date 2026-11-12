package miuix.pickerwidget.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import defpackage.ati;
import defpackage.b2j;
import defpackage.ewi;
import defpackage.u93;
import defpackage.zq5;
import java.util.Locale;
import miuix.pickerwidget.date.Calendar;
import miuix.pickerwidget.internal.widget.ProperPaddingViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public class TimePicker extends FrameLayout {
    public static final f l = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f26738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26739b;
    public final NumberPicker c;
    public final NumberPicker d;
    public final NumberPicker e;
    public final Button f;
    public boolean g;
    public f h;
    public Calendar i;
    public Locale j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ProperPaddingViewGroup f26740k;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f26741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f26742b;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        public int a() {
            return this.f26741a;
        }

        public int c() {
            return this.f26742b;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f26741a);
            parcel.writeInt(this.f26742b);
        }

        public /* synthetic */ SavedState(Parcelable parcelable, int i, int i2, a aVar) {
            this(parcelable, i, i2);
        }

        public SavedState(Parcelable parcelable, int i, int i2) {
            super(parcelable);
            this.f26741a = i;
            this.f26742b = i2;
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f26741a = parcel.readInt();
            this.f26742b = parcel.readInt();
        }
    }

    public class a implements f {
        @Override // miuix.pickerwidget.widget.TimePicker.f
        public void a(TimePicker timePicker, int i, int i2) {
        }
    }

    public class b implements NumberPicker.h {
        public b() {
        }

        @Override // miuix.pickerwidget.widget.NumberPicker.h
        public void a(NumberPicker numberPicker, int i, int i2) {
            if (!TimePicker.this.e() && ((i == 11 && i2 == 12) || (i == 12 && i2 == 11))) {
                TimePicker timePicker = TimePicker.this;
                timePicker.f26739b = !timePicker.f26739b;
                TimePicker.this.h();
            }
            TimePicker.this.g();
        }
    }

    public class c implements NumberPicker.h {
        public c() {
        }

        @Override // miuix.pickerwidget.widget.NumberPicker.h
        public void a(NumberPicker numberPicker, int i, int i2) {
            TimePicker.this.g();
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            view.requestFocus();
            TimePicker timePicker = TimePicker.this;
            timePicker.f26739b = !timePicker.f26739b;
            TimePicker.this.h();
            TimePicker.this.g();
        }
    }

    public class e implements NumberPicker.h {
        public e() {
        }

        @Override // miuix.pickerwidget.widget.NumberPicker.h
        public void a(NumberPicker numberPicker, int i, int i2) {
            numberPicker.requestFocus();
            TimePicker timePicker = TimePicker.this;
            timePicker.f26739b = !timePicker.f26739b;
            TimePicker.this.h();
            TimePicker.this.g();
        }
    }

    public interface f {
        void a(TimePicker timePicker, int i, int i2);
    }

    public TimePicker(Context context) {
        this(context, null);
    }

    private void setCurrentLocale(Locale locale) {
        if (locale.equals(this.j)) {
            return;
        }
        this.j = locale;
        if (this.i == null) {
            this.i = new Calendar();
        }
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public boolean e() {
        return this.f26738a;
    }

    public final boolean f() {
        return getContext().getString(b2j.I).startsWith(PluginDeviceInfo.FMODEL);
    }

    public final void g() {
        sendAccessibilityEvent(4);
        f fVar = this.h;
        if (fVar != null) {
            fVar.a(this, getCurrentHour().intValue(), getCurrentMinute().intValue());
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.c.getBaseline();
    }

    public Integer getCurrentHour() {
        int value = this.c.getValue();
        if (e()) {
            return Integer.valueOf(value);
        }
        return this.f26739b ? Integer.valueOf(value % 12) : Integer.valueOf((value % 12) + 12);
    }

    public Integer getCurrentMinute() {
        return Integer.valueOf(this.d.getValue());
    }

    public final void h() {
        if (e()) {
            NumberPicker numberPicker = this.e;
            if (numberPicker != null) {
                numberPicker.setVisibility(8);
            } else {
                this.f.setVisibility(8);
            }
        } else {
            int i = !this.f26739b ? 1 : 0;
            NumberPicker numberPicker2 = this.e;
            if (numberPicker2 != null) {
                numberPicker2.setValue(i);
                this.e.setVisibility(0);
            } else {
                this.f.setText(u93.n(getContext()).b()[i]);
                this.f.setVisibility(0);
            }
        }
        sendAccessibilityEvent(4);
    }

    public final void i() {
        if (e()) {
            this.c.setMinValue(0);
            this.c.setMaxValue(23);
            this.c.setFormatter(NumberPicker.A0);
        } else {
            this.c.setMinValue(1);
            this.c.setMaxValue(12);
            this.c.setFormatter(null);
        }
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.g;
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
        int i = this.f26738a ? 44 : 28;
        this.i.set(18, getCurrentHour().intValue());
        this.i.set(20, getCurrentMinute().intValue());
        accessibilityEvent.getText().add(zq5.a(getContext(), this.i.getTimeInMillis(), i));
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
        return new SavedState(super.onSaveInstanceState(), getCurrentHour().intValue(), getCurrentMinute().intValue(), null);
    }

    public void set24HourView(Boolean bool) {
        if (this.f26738a == bool.booleanValue()) {
            return;
        }
        this.f26738a = bool.booleanValue();
        Integer currentHour = getCurrentHour();
        currentHour.intValue();
        i();
        setCurrentHour(currentHour);
        h();
    }

    public void setCurrentHour(Integer num) {
        if (num == null || num.equals(getCurrentHour())) {
            return;
        }
        if (!e()) {
            if (num.intValue() >= 12) {
                this.f26739b = false;
                if (num.intValue() > 12) {
                    num = Integer.valueOf(num.intValue() - 12);
                }
            } else {
                this.f26739b = true;
                if (num.intValue() == 0) {
                    num = 12;
                }
            }
            h();
        }
        this.c.setValue(num.intValue());
        g();
    }

    public void setCurrentMinute(Integer num) {
        if (num.equals(getCurrentMinute())) {
            return;
        }
        this.d.setValue(num.intValue());
        g();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        if (this.g == z) {
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
        this.g = z;
    }

    public void setOnTimeChangedListener(f fVar) {
        this.h = fVar;
    }

    public TimePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = true;
        setCurrentLocale(Locale.getDefault());
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(ewi.d, (ViewGroup) this, true);
        this.f26740k = (ProperPaddingViewGroup) findViewById(ati.g);
        NumberPicker numberPicker = (NumberPicker) findViewById(ati.c);
        this.c = numberPicker;
        numberPicker.setOnValueChangedListener(new b());
        ((EditText) numberPicker.findViewById(ati.number_picker_input)).setImeOptions(5);
        NumberPicker numberPicker2 = (NumberPicker) findViewById(ati.d);
        this.d = numberPicker2;
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(59);
        numberPicker2.setOnLongPressUpdateInterval(100L);
        numberPicker2.setFormatter(NumberPicker.A0);
        numberPicker2.setOnValueChangedListener(new c());
        ((EditText) numberPicker2.findViewById(ati.number_picker_input)).setImeOptions(5);
        View viewFindViewById = findViewById(ati.f3436a);
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
            numberPicker3.setDisplayedValues(u93.n(getContext()).b());
            numberPicker3.setOnValueChangedListener(new e());
            ((EditText) numberPicker3.findViewById(ati.number_picker_input)).setImeOptions(6);
        }
        if (f()) {
            ViewGroup viewGroup = (ViewGroup) findViewById(ati.h);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(viewFindViewById, 0);
        }
        i();
        h();
        setOnTimeChangedListener(l);
        setCurrentHour(Integer.valueOf(this.i.get(18)));
        setCurrentMinute(Integer.valueOf(this.i.get(20)));
        if (!isEnabled()) {
            setEnabled(false);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
