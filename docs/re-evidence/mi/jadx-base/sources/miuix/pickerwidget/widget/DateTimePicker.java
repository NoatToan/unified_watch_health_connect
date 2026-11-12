package miuix.pickerwidget.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.annotation.IntRange;
import defpackage.ati;
import defpackage.b2j;
import defpackage.bii;
import defpackage.ewi;
import defpackage.l5j;
import defpackage.zq5;
import java.util.Locale;
import miuix.pickerwidget.date.Calendar;

/* JADX INFO: loaded from: classes3.dex */
public class DateTimePicker extends LinearLayout {
    public static b o;
    public static final ThreadLocal<Calendar> p = new ThreadLocal<>();
    public static ThreadLocal<Calendar> q = new ThreadLocal<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NumberPicker f26713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public NumberPicker f26714b;
    public NumberPicker c;
    public String[] d;
    public b e;
    public b f;
    public d g;
    public Calendar h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Calendar f26715k;
    public Calendar l;
    public String[] m;
    public boolean n;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f26718a;

        public b(Context context) {
            this.f26718a = context.getApplicationContext();
        }

        public String a(int i, int i2, int i3) {
            Calendar calendar = (Calendar) DateTimePicker.q.get();
            if (calendar == null) {
                calendar = new Calendar();
                DateTimePicker.q.set(calendar);
            }
            calendar.set(1, i);
            calendar.set(5, i2);
            calendar.set(9, i3);
            if (!Locale.getDefault().getLanguage().equals(Locale.CHINESE.getLanguage())) {
                return zq5.a(this.f26718a, calendar.getTimeInMillis(), 13696);
            }
            String strA = zq5.a(this.f26718a, calendar.getTimeInMillis(), 4480);
            return strA.replace(" ", "") + " " + zq5.a(this.f26718a, calendar.getTimeInMillis(), 9216);
        }
    }

    public static class c extends b {
        public c(Context context) {
            super(context);
        }

        @Override // miuix.pickerwidget.widget.DateTimePicker.b
        public String a(int i, int i2, int i3) {
            Calendar calendar = (Calendar) DateTimePicker.q.get();
            if (calendar == null) {
                calendar = new Calendar();
                DateTimePicker.q.set(calendar);
            }
            calendar.set(1, i);
            calendar.set(5, i2);
            calendar.set(9, i3);
            Context context = this.f26718a;
            return calendar.format(context, context.getString(b2j.f));
        }
    }

    public interface d {
        void e(DateTimePicker dateTimePicker, long j);
    }

    public class e implements NumberPicker.h {
        public e() {
        }

        @Override // miuix.pickerwidget.widget.NumberPicker.h
        public void a(NumberPicker numberPicker, int i, int i2) {
            if (numberPicker == DateTimePicker.this.f26713a) {
                DateTimePicker.this.h.add(12, ((numberPicker.getValue() - DateTimePicker.this.j) + 5) % 5 != 1 ? -1 : 1);
                DateTimePicker.this.j = numberPicker.getValue();
            } else if (numberPicker == DateTimePicker.this.f26714b) {
                DateTimePicker.this.h.set(18, DateTimePicker.this.f26714b.getValue());
            } else if (numberPicker == DateTimePicker.this.c) {
                DateTimePicker.this.h.set(20, DateTimePicker.this.i * DateTimePicker.this.c.getValue());
            }
            DateTimePicker.this.o();
            DateTimePicker.this.u(false);
            DateTimePicker.this.v();
            DateTimePicker.this.w();
            b(DateTimePicker.this);
        }

        public final void b(DateTimePicker dateTimePicker) {
            DateTimePicker.this.sendAccessibilityEvent(4);
            if (DateTimePicker.this.g != null) {
                DateTimePicker.this.g.e(dateTimePicker, DateTimePicker.this.getTimeInMillis());
            }
        }
    }

    public DateTimePicker(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public long getTimeInMillis() {
        return this.h.getTimeInMillis();
    }

    public final void n(Calendar calendar, boolean z) {
        calendar.set(22, 0);
        calendar.set(21, 0);
        int i = calendar.get(20) % this.i;
        if (i != 0) {
            if (!z) {
                calendar.add(20, -i);
                return;
            }
            int i2 = calendar.get(20);
            int i3 = this.i;
            if ((i2 + i3) - i < 60) {
                calendar.add(20, i3 - i);
            } else {
                calendar.add(18, 1);
                calendar.set(20, 0);
            }
        }
    }

    public final void o() {
        Calendar calendar = this.f26715k;
        if (calendar != null && calendar.getTimeInMillis() > this.h.getTimeInMillis()) {
            this.h.setSafeTimeInMillis(this.f26715k.getTimeInMillis(), this.n);
        }
        Calendar calendar2 = this.l;
        if (calendar2 == null || calendar2.getTimeInMillis() >= this.h.getTimeInMillis()) {
            return;
        }
        this.h.setSafeTimeInMillis(this.l.getTimeInMillis(), this.n);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(DateTimePicker.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(DateTimePicker.class.getName());
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.getText().add(zq5.a(getContext(), this.h.getTimeInMillis(), 1420));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.n = savedState.f26717b;
        t(savedState.c());
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), getTimeInMillis(), this.n);
    }

    public final void p(NumberPicker numberPicker, int i, int i2) {
        String[] displayedValues = numberPicker.getDisplayedValues();
        if (displayedValues == null || displayedValues.length >= (i2 - i) + 1) {
            return;
        }
        numberPicker.setDisplayedValues(null);
    }

    public final int q(Calendar calendar, Calendar calendar2) {
        Calendar calendar3 = (Calendar) calendar.clone();
        Calendar calendar4 = (Calendar) calendar2.clone();
        calendar3.set(18, 0);
        calendar3.set(20, 0);
        calendar3.set(21, 0);
        calendar3.set(22, 0);
        calendar4.set(18, 0);
        calendar4.set(20, 0);
        calendar4.set(21, 0);
        calendar4.set(22, 0);
        return (int) (((((calendar3.getTimeInMillis() / 1000) / 60) / 60) / 24) - ((((calendar4.getTimeInMillis() / 1000) / 60) / 60) / 24));
    }

    public final String r(int i, int i2, int i3) {
        b bVar = o;
        if (this.n) {
            if (this.f == null) {
                this.f = new c(getContext());
            }
            bVar = this.f;
        }
        b bVar2 = this.e;
        if (bVar2 != null) {
            bVar = bVar2;
        }
        return bVar.a(i, i2, i3);
    }

    public final void s() {
        Resources resources = getResources();
        boolean z = resources.getConfiguration().getLayoutDirection() == 1;
        boolean zStartsWith = resources.getString(b2j.C).startsWith("h");
        if (!(zStartsWith && z) && (zStartsWith || z)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.f26714b.getParent();
        viewGroup.removeView(this.f26714b);
        viewGroup.addView(this.f26714b, viewGroup.getChildCount());
    }

    public void setDayFormatter(b bVar) {
        this.e = bVar;
        u(true);
    }

    public void setLunarMode(boolean z) {
        boolean z2 = this.n;
        this.n = z;
        u(true);
        if (z2 != this.n) {
            this.f26713a.requestLayout();
        }
    }

    public void setMaxDateTime(long j) {
        if (j <= 0) {
            this.l = null;
        } else {
            Calendar calendar = new Calendar();
            this.l = calendar;
            calendar.setSafeTimeInMillis(j, this.n);
            n(this.l, false);
            Calendar calendar2 = this.f26715k;
            if (calendar2 != null && calendar2.getTimeInMillis() > this.l.getTimeInMillis()) {
                this.l.setSafeTimeInMillis(this.f26715k.getTimeInMillis(), this.n);
            }
        }
        o();
        u(true);
        v();
        w();
    }

    public void setMinDateTime(long j) {
        if (j <= 0) {
            this.f26715k = null;
        } else {
            Calendar calendar = new Calendar();
            this.f26715k = calendar;
            calendar.setSafeTimeInMillis(j, this.n);
            if (this.f26715k.get(21) != 0 || this.f26715k.get(22) != 0) {
                this.f26715k.add(20, 1);
            }
            n(this.f26715k, true);
            Calendar calendar2 = this.l;
            if (calendar2 != null && calendar2.getTimeInMillis() < this.f26715k.getTimeInMillis()) {
                this.f26715k.setSafeTimeInMillis(this.l.getTimeInMillis(), this.n);
            }
        }
        o();
        u(true);
        v();
        w();
    }

    public void setMinuteInterval(@IntRange(from = 1, to = 30) int i) {
        if (this.i == i) {
            return;
        }
        this.i = i;
        n(this.h, true);
        o();
        v();
        w();
    }

    public void setOnTimeChangedListener(d dVar) {
        this.g = dVar;
    }

    public void t(long j) {
        this.h.setSafeTimeInMillis(j, this.n);
        n(this.h, true);
        o();
        u(true);
        v();
        w();
    }

    public final void u(boolean z) {
        String[] strArr;
        Calendar calendar = this.f26715k;
        int iQ = calendar == null ? Integer.MAX_VALUE : q(this.h, calendar);
        Calendar calendar2 = this.l;
        int iQ2 = calendar2 != null ? q(calendar2, this.h) : Integer.MAX_VALUE;
        if (iQ > 1 || iQ2 > 1) {
            p(this.f26713a, 0, 4);
            this.f26713a.setMinValue(0);
            this.f26713a.setMaxValue(4);
            if (iQ <= 1) {
                this.f26713a.setValue(iQ);
                this.j = iQ;
                this.f26713a.setWrapSelectorWheel(false);
            }
            if (iQ2 <= 1) {
                int i = 4 - iQ2;
                this.j = i;
                this.f26713a.setValue(i);
                this.f26713a.setWrapSelectorWheel(false);
            }
            if (iQ > 1 && iQ2 > 1) {
                this.f26713a.setWrapSelectorWheel(true);
            }
        } else {
            int iQ3 = q(this.l, this.f26715k);
            p(this.f26713a, 0, iQ3);
            this.f26713a.setMinValue(0);
            this.f26713a.setMaxValue(iQ3);
            this.f26713a.setValue(iQ);
            this.j = iQ;
            this.f26713a.setWrapSelectorWheel(false);
        }
        int maxValue = (this.f26713a.getMaxValue() - this.f26713a.getMinValue()) + 1;
        if (z || (strArr = this.m) == null || strArr.length != maxValue) {
            this.m = new String[maxValue];
        }
        int value = this.f26713a.getValue();
        ThreadLocal<Calendar> threadLocal = p;
        Calendar calendar3 = threadLocal.get();
        if (calendar3 == null) {
            calendar3 = new Calendar();
            threadLocal.set(calendar3);
        }
        calendar3.setSafeTimeInMillis(this.h.getTimeInMillis(), this.n);
        this.m[value] = r(calendar3.get(1), calendar3.get(5), calendar3.get(9));
        for (int i2 = 1; i2 <= 2; i2++) {
            calendar3.add(12, 1);
            int i3 = (value + i2) % 5;
            String[] strArr2 = this.m;
            if (i3 >= strArr2.length) {
                break;
            }
            strArr2[i3] = r(calendar3.get(1), calendar3.get(5), calendar3.get(9));
        }
        calendar3.setSafeTimeInMillis(this.h.getTimeInMillis(), this.n);
        for (int i4 = 1; i4 <= 2; i4++) {
            calendar3.add(12, -1);
            int i5 = ((value - i4) + 5) % 5;
            String[] strArr3 = this.m;
            if (i5 >= strArr3.length) {
                break;
            }
            strArr3[i5] = r(calendar3.get(1), calendar3.get(5), calendar3.get(9));
        }
        this.f26713a.setDisplayedValues(this.m);
    }

    public final void v() {
        boolean z;
        Calendar calendar = this.l;
        if (calendar == null || q(this.h, calendar) != 0) {
            z = false;
        } else {
            this.f26714b.setMaxValue(this.l.get(18));
            this.f26714b.setWrapSelectorWheel(false);
            z = true;
        }
        Calendar calendar2 = this.f26715k;
        if (calendar2 != null && q(this.h, calendar2) == 0) {
            this.f26714b.setMinValue(this.f26715k.get(18));
            this.f26714b.setWrapSelectorWheel(false);
        } else if (!z) {
            this.f26714b.setMinValue(0);
            this.f26714b.setMaxValue(23);
            this.f26714b.setWrapSelectorWheel(true);
        }
        this.f26714b.setValue(this.h.get(18));
    }

    public final void w() {
        boolean z;
        Calendar calendar = this.l;
        if (calendar != null && q(this.h, calendar) == 0 && this.h.get(18) == this.l.get(18)) {
            int i = this.l.get(20);
            this.c.setMinValue(0);
            this.c.setMaxValue(i / this.i);
            this.c.setWrapSelectorWheel(false);
            z = true;
        } else {
            z = false;
        }
        Calendar calendar2 = this.f26715k;
        if (calendar2 != null && q(this.h, calendar2) == 0 && this.h.get(18) == this.f26715k.get(18)) {
            this.c.setMinValue(this.f26715k.get(20) / this.i);
            this.c.setWrapSelectorWheel(false);
        } else if (!z) {
            int i2 = this.i;
            int i3 = 60 / i2;
            if (60 % i2 == 0) {
                i3--;
            }
            p(this.c, 0, i3);
            this.c.setMinValue(0);
            this.c.setMaxValue(i3);
            this.c.setWrapSelectorWheel(true);
        }
        int maxValue = (this.c.getMaxValue() - this.c.getMinValue()) + 1;
        String[] strArr = this.d;
        if (strArr == null || strArr.length != maxValue) {
            this.d = new String[maxValue];
            for (int i4 = 0; i4 < maxValue; i4++) {
                this.d[i4] = NumberPicker.A0.format((this.c.getMinValue() + i4) * this.i);
            }
            this.c.setDisplayedValues(this.d);
        }
        this.c.setValue(this.h.get(20) / this.i);
    }

    public DateTimePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, bii.f4254b);
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f26716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f26717b;

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

        public SavedState(Parcelable parcelable, long j, boolean z) {
            super(parcelable);
            this.f26716a = j;
            this.f26717b = z;
        }

        public long c() {
            return this.f26716a;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeLong(this.f26716a);
            parcel.writeInt(this.f26717b ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f26716a = parcel.readLong();
            this.f26717b = parcel.readInt() == 1;
        }
    }

    public DateTimePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = 1;
        this.f26715k = null;
        this.l = null;
        this.m = null;
        this.n = false;
        o = new b(getContext());
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(ewi.f17131b, (ViewGroup) this, true);
        e eVar = new e();
        Calendar calendar = new Calendar();
        this.h = calendar;
        n(calendar, true);
        ThreadLocal<Calendar> threadLocal = p;
        Calendar calendar2 = threadLocal.get();
        if (calendar2 == null) {
            calendar2 = new Calendar();
            threadLocal.set(calendar2);
        }
        calendar2.setSafeTimeInMillis(0L, this.n);
        this.f26713a = (NumberPicker) findViewById(ati.f3437b);
        this.f26714b = (NumberPicker) findViewById(ati.c);
        this.c = (NumberPicker) findViewById(ati.d);
        this.f26713a.setOnValueChangedListener(eVar);
        this.f26713a.setMaxFlingSpeedFactor(3.0f);
        this.f26714b.setOnValueChangedListener(eVar);
        this.c.setOnValueChangedListener(eVar);
        this.c.setMinValue(0);
        this.c.setMaxValue(59);
        this.f26714b.setFormatter(NumberPicker.A0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l5j.E, i, 0);
        this.n = typedArrayObtainStyledAttributes.getBoolean(l5j.F, false);
        typedArrayObtainStyledAttributes.recycle();
        s();
        o();
        u(true);
        v();
        w();
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
