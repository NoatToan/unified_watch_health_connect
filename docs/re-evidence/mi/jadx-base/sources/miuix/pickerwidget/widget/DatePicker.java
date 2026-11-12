package miuix.pickerwidget.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.ati;
import defpackage.b2j;
import defpackage.b3j;
import defpackage.bii;
import defpackage.ewi;
import defpackage.l5j;
import defpackage.u93;
import defpackage.zq5;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import miuix.pickerwidget.date.Calendar;

/* JADX INFO: loaded from: classes3.dex */
public class DatePicker extends FrameLayout {
    public static String[] q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static String[] f26706r;
    public static String[] s;
    public static String t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f26707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NumberPicker f26708b;
    public final NumberPicker c;
    public final NumberPicker d;
    public Locale e;
    public b f;
    public String[] g;
    public char[] h;
    public final DateFormat i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Calendar f26709k;
    public Calendar l;
    public Calendar m;
    public Calendar n;
    public boolean o;
    public boolean p;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f26710a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f26711b;
        public final int c;
        public final boolean d;

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

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f26710a);
            parcel.writeInt(this.f26711b);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d ? 1 : 0);
        }

        public /* synthetic */ SavedState(Parcelable parcelable, int i, int i2, int i3, boolean z, a aVar) {
            this(parcelable, i, i2, i3, z);
        }

        public SavedState(Parcelable parcelable, int i, int i2, int i3, boolean z) {
            super(parcelable);
            this.f26710a = i;
            this.f26711b = i2;
            this.c = i3;
            this.d = z;
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f26710a = parcel.readInt();
            this.f26711b = parcel.readInt();
            this.c = parcel.readInt();
            this.d = parcel.readInt() == 1;
        }
    }

    public class a implements NumberPicker.h {
        public a() {
        }

        @Override // miuix.pickerwidget.widget.NumberPicker.h
        public void a(NumberPicker numberPicker, int i, int i2) {
            DatePicker.this.f26709k.setSafeTimeInMillis(DatePicker.this.n.getTimeInMillis(), DatePicker.this.p);
            if (numberPicker == DatePicker.this.f26708b) {
                DatePicker.this.f26709k.add(DatePicker.this.p ? 10 : 9, i2 - i);
            } else if (numberPicker == DatePicker.this.c) {
                DatePicker.this.f26709k.add(DatePicker.this.p ? 6 : 5, i2 - i);
            } else {
                if (numberPicker != DatePicker.this.d) {
                    throw new IllegalArgumentException();
                }
                DatePicker.this.f26709k.set(DatePicker.this.p ? 2 : 1, i2);
            }
            DatePicker datePicker = DatePicker.this;
            datePicker.t(datePicker.f26709k.get(1), DatePicker.this.f26709k.get(5), DatePicker.this.f26709k.get(9));
            if (numberPicker == DatePicker.this.d) {
                DatePicker.this.s();
            }
            DatePicker.this.x();
            DatePicker.this.p();
        }
    }

    public interface b {
        void a(DatePicker datePicker, int i, int i2, int i3, boolean z);
    }

    public DatePicker(Context context) {
        this(context, null);
    }

    private void setCurrentLocale(Locale locale) {
        if (locale.equals(this.e)) {
            return;
        }
        this.e = locale;
        this.j = this.f26709k.getActualMaximum(5) + 1;
        s();
        w();
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

    public int getDayOfMonth() {
        return this.n.get(this.p ? 10 : 9);
    }

    public long getMaxDate() {
        return this.m.getTimeInMillis();
    }

    public long getMinDate() {
        return this.l.getTimeInMillis();
    }

    public int getMonth() {
        if (this.p) {
            return this.n.isChineseLeapMonth() ? this.n.get(6) + 12 : this.n.get(6);
        }
        return this.n.get(5);
    }

    public boolean getSpinnersShown() {
        return this.f26707a.isShown();
    }

    public int getYear() {
        return this.n.get(this.p ? 2 : 1);
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.o;
    }

    public final int k(Calendar calendar, boolean z) {
        if (!z) {
            return calendar.get(5);
        }
        int i = calendar.get(6);
        int chineseLeapMonth = calendar.getChineseLeapMonth();
        if (chineseLeapMonth >= 0) {
            return (calendar.isChineseLeapMonth() || i > chineseLeapMonth) ? i + 1 : i;
        }
        return i;
    }

    public void l(int i, int i2, int i3, b bVar) {
        t(i, i2, i3);
        x();
        this.f = bVar;
    }

    public final void m() {
        String[] strArr;
        if (q == null) {
            q = u93.n(getContext()).c();
        }
        if (f26706r == null) {
            f26706r = u93.n(getContext()).f();
            Resources resources = getContext().getResources();
            int i = 0;
            while (true) {
                strArr = f26706r;
                if (i >= strArr.length) {
                    break;
                }
                StringBuilder sb = new StringBuilder();
                String[] strArr2 = f26706r;
                sb.append(strArr2[i]);
                sb.append(resources.getString(b2j.f3716a));
                strArr2[i] = sb.toString();
                i++;
            }
            s = new String[strArr.length + 1];
        }
        if (t == null) {
            t = u93.n(getContext()).e()[1];
        }
    }

    public boolean n() {
        return this.p;
    }

    public final boolean o(int i, int i2, int i3) {
        return (this.n.get(1) == i && this.n.get(5) == i3 && this.n.get(9) == i2) ? false : true;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setCurrentLocale(configuration.locale);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(DatePicker.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(DatePicker.class.getName());
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.getText().add(zq5.a(getContext(), this.n.getTimeInMillis(), 896));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        t(savedState.f26710a, savedState.f26711b, savedState.c);
        if (this.p != savedState.d) {
            this.p = savedState.d;
            s();
        }
        x();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.n.get(1), this.n.get(5), this.n.get(9), this.p, null);
    }

    public final void p() {
        sendAccessibilityEvent(4);
        b bVar = this.f;
        if (bVar != null) {
            bVar.a(this, getYear(), getMonth(), getDayOfMonth(), this.p);
        }
    }

    public final boolean q(String str, Calendar calendar) {
        try {
            calendar.setSafeTimeInMillis(this.i.parse(str).getTime(), this.p);
            return true;
        } catch (ParseException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Date: ");
            sb.append(str);
            sb.append(" not in format: ");
            sb.append("MM/dd/yyyy");
            return false;
        }
    }

    public final void r() {
        this.f26707a.removeAllViews();
        char[] dateFormatOrder = this.h;
        if (dateFormatOrder == null) {
            dateFormatOrder = android.text.format.DateFormat.getDateFormatOrder(getContext());
        }
        int length = dateFormatOrder.length;
        for (int i = 0; i < length; i++) {
            char c = dateFormatOrder[i];
            if (c == 'M') {
                this.f26707a.addView(this.c);
                u(this.c, length, i);
            } else if (c == 'd') {
                this.f26707a.addView(this.f26708b);
                u(this.f26708b, length, i);
            } else {
                if (c != 'y') {
                    throw new IllegalArgumentException();
                }
                this.f26707a.addView(this.d);
                u(this.d, length, i);
            }
        }
    }

    public final void s() {
        int i = 0;
        if (this.p) {
            int chineseLeapMonth = this.n.getChineseLeapMonth();
            if (chineseLeapMonth < 0) {
                this.g = f26706r;
                return;
            }
            String[] strArr = s;
            this.g = strArr;
            int i2 = chineseLeapMonth + 1;
            System.arraycopy(f26706r, 0, strArr, 0, i2);
            String[] strArr2 = f26706r;
            System.arraycopy(strArr2, chineseLeapMonth, this.g, i2, strArr2.length - chineseLeapMonth);
            this.g[i2] = t + this.g[i2];
            return;
        }
        if ("en".equals(this.e.getLanguage().toLowerCase())) {
            this.g = u93.n(getContext()).o();
            return;
        }
        this.g = new String[12];
        while (true) {
            String[] strArr3 = this.g;
            if (i >= strArr3.length) {
                return;
            }
            int i3 = i + 1;
            strArr3[i] = NumberPicker.A0.format(i3);
            i = i3;
        }
    }

    public void setDateFormatOrder(char[] cArr) {
        this.h = cArr;
        r();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        if (this.o == z) {
            return;
        }
        super.setEnabled(z);
        this.f26708b.setEnabled(z);
        this.c.setEnabled(z);
        this.d.setEnabled(z);
        this.o = z;
    }

    public void setLunarMode(boolean z) {
        if (z != this.p) {
            this.p = z;
            s();
            x();
        }
    }

    public void setMaxDate(long j) {
        this.f26709k.setSafeTimeInMillis(j, this.p);
        if (this.f26709k.get(1) == this.m.get(1) && this.f26709k.get(12) == this.m.get(12)) {
            return;
        }
        this.m.setSafeTimeInMillis(j, this.p);
        if (this.n.after(this.m)) {
            this.n.setSafeTimeInMillis(this.m.getTimeInMillis(), this.p);
            s();
        }
        x();
    }

    public void setMinDate(long j) {
        this.f26709k.setSafeTimeInMillis(j, this.p);
        if (this.f26709k.get(1) == this.l.get(1) && this.f26709k.get(12) == this.l.get(12)) {
            return;
        }
        this.l.setSafeTimeInMillis(j, this.p);
        if (this.n.before(this.l)) {
            this.n.setSafeTimeInMillis(this.l.getTimeInMillis(), this.p);
            s();
        }
        x();
    }

    public void setSpinnersShown(boolean z) {
        this.f26707a.setVisibility(z ? 0 : 8);
    }

    public final void t(int i, int i2, int i3) {
        this.n.set(i, i2, i3, 12, 0, 0, 0);
        if (this.n.before(this.l)) {
            this.n.setSafeTimeInMillis(this.l.getTimeInMillis(), this.p);
        } else if (this.n.after(this.m)) {
            this.n.setSafeTimeInMillis(this.m.getTimeInMillis(), this.p);
        }
    }

    public final void u(NumberPicker numberPicker, int i, int i2) {
        ((TextView) numberPicker.findViewById(ati.number_picker_input)).setImeOptions(i2 < i + (-1) ? 5 : 6);
    }

    public void v(int i, int i2, int i3) {
        if (o(i, i2, i3)) {
            t(i, i2, i3);
            x();
            p();
        }
    }

    public final void w() {
        NumberPicker numberPicker = this.f26708b;
        if (numberPicker == null || this.d == null) {
            return;
        }
        numberPicker.setFormatter(NumberPicker.A0);
        this.d.setFormatter(new NumberPicker.f());
    }

    public final void x() {
        if (this.p) {
            this.f26708b.setLabel(null);
            this.c.setLabel(null);
            this.d.setLabel(null);
        } else {
            this.f26708b.setLabel(getContext().getString(b2j.f3717b));
            this.c.setLabel(getContext().getString(b2j.c));
            this.d.setLabel(getContext().getString(b2j.d));
        }
        this.f26708b.setDisplayedValues(null);
        this.f26708b.setMinValue(1);
        this.f26708b.setMaxValue(this.p ? this.n.getActualMaximum(10) : this.n.getActualMaximum(9));
        this.f26708b.setWrapSelectorWheel(true);
        this.c.setDisplayedValues(null);
        this.c.setMinValue(0);
        NumberPicker numberPicker = this.c;
        int i = 11;
        if (this.p && this.n.getChineseLeapMonth() >= 0) {
            i = 12;
        }
        numberPicker.setMaxValue(i);
        this.c.setWrapSelectorWheel(true);
        int i2 = this.p ? 2 : 1;
        if (this.n.get(i2) == this.l.get(i2)) {
            this.c.setMinValue(k(this.l, this.p));
            this.c.setWrapSelectorWheel(false);
            int i3 = this.p ? 6 : 5;
            if (this.n.get(i3) == this.l.get(i3)) {
                this.f26708b.setMinValue(this.p ? this.l.get(10) : this.l.get(9));
                this.f26708b.setWrapSelectorWheel(false);
            }
        }
        if (this.n.get(i2) == this.m.get(i2)) {
            this.c.setMaxValue(k(this.m, this.p));
            this.c.setWrapSelectorWheel(false);
            this.c.setDisplayedValues(null);
            int i4 = this.p ? 6 : 5;
            if (this.n.get(i4) == this.m.get(i4)) {
                this.f26708b.setMaxValue(this.p ? this.m.get(10) : this.m.get(9));
                this.f26708b.setWrapSelectorWheel(false);
            }
        }
        this.c.setDisplayedValues((String[]) Arrays.copyOfRange(this.g, this.c.getMinValue(), this.g.length));
        if (this.p) {
            this.f26708b.setDisplayedValues((String[]) Arrays.copyOfRange(q, this.f26708b.getMinValue() - 1, q.length));
        }
        int i5 = n() ? 2 : 1;
        this.d.setMinValue(this.l.get(i5));
        this.d.setMaxValue(this.m.get(i5));
        this.d.setWrapSelectorWheel(false);
        if (this.p) {
            this.d.setValue(this.n.get(2));
            this.c.setValue(k(this.n, true));
            this.f26708b.setValue(this.n.get(10));
        } else {
            this.d.setValue(this.n.get(1));
            this.c.setValue(this.n.get(5));
            this.f26708b.setValue(this.n.get(9));
        }
    }

    public DatePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, bii.f4253a);
    }

    public DatePicker(Context context, AttributeSet attributeSet, int i) {
        int i2;
        String str;
        super(context, attributeSet, i);
        this.i = new SimpleDateFormat("MM/dd/yyyy");
        this.o = true;
        this.p = false;
        m();
        this.f26709k = new Calendar();
        this.l = new Calendar();
        this.m = new Calendar();
        this.n = new Calendar();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l5j.u, i, b3j.f3748a);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(l5j.C, true);
        int i3 = typedArrayObtainStyledAttributes.getInt(l5j.D, 1900);
        int i4 = typedArrayObtainStyledAttributes.getInt(l5j.v, 2100);
        String string = typedArrayObtainStyledAttributes.getString(l5j.y);
        String string2 = typedArrayObtainStyledAttributes.getString(l5j.x);
        int i5 = ewi.f17130a;
        this.p = typedArrayObtainStyledAttributes.getBoolean(l5j.w, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(l5j.B, true);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(l5j.A, true);
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(l5j.z, true);
        typedArrayObtainStyledAttributes.recycle();
        setCurrentLocale(Locale.getDefault());
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(i5, (ViewGroup) this, true);
        a aVar = new a();
        this.f26707a = (LinearLayout) findViewById(ati.f);
        NumberPicker numberPicker = (NumberPicker) findViewById(ati.f3437b);
        this.f26708b = numberPicker;
        numberPicker.setOnLongPressUpdateInterval(100L);
        numberPicker.setOnValueChangedListener(aVar);
        if (!z4) {
            numberPicker.setVisibility(8);
        }
        NumberPicker numberPicker2 = (NumberPicker) findViewById(ati.e);
        this.c = numberPicker2;
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(this.j - 1);
        numberPicker2.setDisplayedValues(this.g);
        numberPicker2.setOnLongPressUpdateInterval(200L);
        numberPicker2.setOnValueChangedListener(aVar);
        if (!z3) {
            numberPicker2.setVisibility(8);
        }
        NumberPicker numberPicker3 = (NumberPicker) findViewById(ati.i);
        this.d = numberPicker3;
        numberPicker3.setOnLongPressUpdateInterval(100L);
        numberPicker3.setOnValueChangedListener(aVar);
        if (!z2) {
            numberPicker3.setVisibility(8);
        }
        w();
        if (!z) {
            i2 = 1;
            setSpinnersShown(true);
        } else {
            i2 = 1;
            setSpinnersShown(z);
        }
        this.n.setSafeTimeInMillis(System.currentTimeMillis(), this.p);
        l(this.n.get(i2), this.n.get(5), this.n.get(9), null);
        this.f26709k.setSafeTimeInMillis(0L, this.p);
        if (!TextUtils.isEmpty(string)) {
            if (q(string, this.f26709k)) {
                str = string2;
            } else {
                str = string2;
                this.f26709k.set(i3, 0, 1, 12, 0, 0, 0);
            }
        } else {
            str = string2;
            if (!q("1/31/1900", this.f26709k)) {
                this.f26709k.set(i3, 0, 1, 12, 0, 0, 0);
            }
        }
        setMinDate(this.f26709k.getTimeInMillis());
        this.f26709k.setSafeTimeInMillis(0L, this.p);
        if (TextUtils.isEmpty(str) || !q(str, this.f26709k)) {
            this.f26709k.set(i4, 11, 31, 12, 0, 0, 0);
        }
        setMaxDate(this.f26709k.getTimeInMillis());
        r();
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
