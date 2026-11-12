package com.xiaomi.fitness.baseui.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.timepicker.TimeModel;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import defpackage.gsi;
import defpackage.mvi;
import defpackage.n1j;
import defpackage.z4j;
import java.text.DateFormatSymbols;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class SpinnerDatePicker extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f11718a;

    public static abstract class AbstractDatePickerDelegate implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SpinnerDatePicker f11719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Context f11720b;
        public Calendar c;
        public Locale d;
        public d e;

        public static class SavedState extends View.BaseSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f11721a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f11722b;
            public final int c;
            public final long d;
            public final long e;
            public final int f;
            public final int g;
            public final int h;

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

            public long a() {
                return this.e;
            }

            public long c() {
                return this.d;
            }

            public int d() {
                return this.c;
            }

            public int e() {
                return this.f11722b;
            }

            public int f() {
                return this.f11721a;
            }

            @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f11721a);
                parcel.writeInt(this.f11722b);
                parcel.writeInt(this.c);
                parcel.writeLong(this.d);
                parcel.writeLong(this.e);
                parcel.writeInt(this.f);
                parcel.writeInt(this.g);
                parcel.writeInt(this.h);
            }

            public SavedState(Parcelable parcelable, int i, int i2, int i3, long j, long j2) {
                this(parcelable, i, i2, i3, j, j2, 0, 0, 0);
            }

            public SavedState(Parcelable parcelable, int i, int i2, int i3, long j, long j2, int i4, int i5, int i6) {
                super(parcelable);
                this.f11721a = i;
                this.f11722b = i2;
                this.c = i3;
                this.d = j;
                this.e = j2;
                this.f = i4;
                this.g = i5;
                this.h = i6;
            }

            public SavedState(Parcel parcel) {
                super(parcel);
                this.f11721a = parcel.readInt();
                this.f11722b = parcel.readInt();
                this.c = parcel.readInt();
                this.d = parcel.readLong();
                this.e = parcel.readLong();
                this.f = parcel.readInt();
                this.g = parcel.readInt();
                this.h = parcel.readInt();
            }
        }

        public AbstractDatePickerDelegate(SpinnerDatePicker spinnerDatePicker, Context context) {
            this.f11719a = spinnerDatePicker;
            this.f11720b = context;
            l(Locale.getDefault());
        }

        public void k(Locale locale) {
        }

        public void l(Locale locale) {
            if (locale.equals(this.d)) {
                return;
            }
            this.d = locale;
            k(locale);
        }

        @Override // com.xiaomi.fitness.baseui.widget.SpinnerDatePicker.a
        public void setOnDateChangedListener(d dVar) {
            this.e = dVar;
        }
    }

    public interface a {
        Calendar a();

        void b(long j);

        Calendar c();

        int d();

        void e(long j);

        void f(long j, long j2);

        void g(int i, int i2, int i3);

        Parcelable h(Parcelable parcelable);

        int i();

        boolean isEnabled();

        int j();

        void onConfigurationChanged(Configuration configuration);

        void onRestoreInstanceState(Parcelable parcelable);

        void setEnabled(boolean z);

        void setOnDateChangedListener(d dVar);
    }

    public static class b extends AbstractDatePickerDelegate {
        public final NumberPickerView f;
        public final NumberPickerView g;
        public final NumberPickerView h;
        public String[] i;
        public int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Calendar f11723k;
        public Calendar l;
        public Calendar m;
        public boolean n;
        public int o;
        public c p;

        public class a implements NumberPickerView.d {
            public a() {
            }

            @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.d
            public void onValueChange(NumberPickerView numberPickerView, int i, int i2) {
                int i3 = b.this.c.get(1);
                int i4 = b.this.c.get(2);
                int i5 = b.this.c.get(5);
                if (numberPickerView != b.this.f) {
                    if (numberPickerView == b.this.g) {
                        i4 = i2;
                    } else if (numberPickerView != b.this.h) {
                        throw new IllegalArgumentException();
                    }
                    b.this.w(i2, i4, i5);
                    b.this.B();
                    b.this.v();
                    b.this.x(i2, i4, i5);
                }
                i5 = i2;
                i2 = i3;
                b.this.w(i2, i4, i5);
                b.this.B();
                b.this.v();
                b.this.x(i2, i4, i5);
            }
        }

        public b(SpinnerDatePicker spinnerDatePicker, Context context, AttributeSet attributeSet, int i, int i2) {
            super(spinnerDatePicker, context);
            this.n = true;
            this.o = mvi.z;
            this.f11719a = spinnerDatePicker;
            this.f11720b = context;
            this.p = new c();
            l(Locale.getDefault());
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z4j.n5);
            this.o = typedArrayObtainStyledAttributes.getResourceId(z4j.o5, this.o);
            typedArrayObtainStyledAttributes.recycle();
            ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(this.o, (ViewGroup) this.f11719a, true).setSaveFromParentEnabled(false);
            a aVar = new a();
            NumberPickerView numberPickerView = (NumberPickerView) this.f11719a.findViewById(gsi.e);
            this.f = numberPickerView;
            if (numberPickerView != null) {
                numberPickerView.setOnValueChangedListener(aVar);
                if (LocaleUtil.isCN()) {
                    numberPickerView.setHintText(context.getString(n1j.e));
                }
            }
            NumberPickerView numberPickerView2 = (NumberPickerView) this.f11719a.findViewById(gsi.L);
            this.g = numberPickerView2;
            if (numberPickerView2 != null) {
                numberPickerView2.setMinValue(0);
                numberPickerView2.setMaxValue(this.j - 1);
                numberPickerView2.setDisplayedValues(this.i);
                numberPickerView2.setOnValueChangedListener(aVar);
                if (LocaleUtil.isCN()) {
                    numberPickerView2.setHintText(context.getString(n1j.h));
                }
            }
            NumberPickerView numberPickerView3 = (NumberPickerView) this.f11719a.findViewById(gsi.z0);
            this.h = numberPickerView3;
            if (numberPickerView3 != null) {
                numberPickerView3.setOnValueChangedListener(aVar);
                if (LocaleUtil.isCN()) {
                    numberPickerView3.setHintText(context.getString(n1j.V));
                }
            }
            this.f11723k.clear();
            this.f11723k.set(1900, 0, 1);
            long timeInMillis = this.f11723k.getTimeInMillis();
            this.f11723k.clear();
            this.f11723k.set(2100, 11, 31);
            f(timeInMillis, this.f11723k.getTimeInMillis());
            this.c.setTimeInMillis(System.currentTimeMillis());
            u(this.c.get(1), this.c.get(2), this.c.get(5), null);
        }

        public final void A(int i) {
            this.h.setContentDescription(this.f11720b.getResources().getString(n1j.z, Integer.valueOf(i)));
        }

        public final void B() {
            NumberPickerView numberPickerView = this.f;
            if (numberPickerView != null) {
                numberPickerView.setDisplayedValues(null);
                this.f.setMinValue(this.p.c[0]);
                this.f.setMaxValue(this.p.c[1]);
                this.f.setWrapSelectorWheel(true);
                int i = this.c.get(5);
                this.f.setValue(i);
                y(i);
            }
            NumberPickerView numberPickerView2 = this.g;
            if (numberPickerView2 != null) {
                numberPickerView2.setDisplayedValues(null);
                this.g.setMinValue(this.p.f11726b[0]);
                this.g.setMaxValue(this.p.f11726b[1]);
                this.g.setWrapSelectorWheel(true);
                this.g.setDisplayedValues((String[]) Arrays.copyOfRange(this.i, this.g.getMinValue(), this.g.getMaxValue() + 1));
                int i2 = this.c.get(2);
                this.g.setValue(i2);
                z(i2);
            }
            NumberPickerView numberPickerView3 = this.h;
            if (numberPickerView3 != null) {
                numberPickerView3.setMinValue(this.p.f11725a[0]);
                this.h.setMaxValue(this.p.f11725a[1]);
                this.h.setWrapSelectorWheel(false);
                int i3 = this.c.get(1);
                this.h.setValue(i3);
                A(i3);
            }
        }

        @Override // com.xiaomi.fitness.baseui.widget.SpinnerDatePicker.a
        public Calendar a() {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(this.m.getTimeInMillis());
            return calendar;
        }

        @Override // com.xiaomi.fitness.baseui.widget.SpinnerDatePicker.a
        public void b(long j) {
            this.f11723k.setTimeInMillis(j);
            if (this.f11723k.get(1) == this.m.get(1) && this.f11723k.get(6) == this.m.get(6)) {
                return;
            }
            this.m.setTimeInMillis(j);
            if (this.c.after(this.m)) {
                this.c.setTimeInMillis(this.m.getTimeInMillis());
            }
        }

        @Override // com.xiaomi.fitness.baseui.widget.SpinnerDatePicker.a
        public Calendar c() {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(this.l.getTimeInMillis());
            return calendar;
        }

        @Override // com.xiaomi.fitness.baseui.widget.SpinnerDatePicker.a
        public int d() {
            return this.c.get(1);
        }

        @Override // com.xiaomi.fitness.baseui.widget.SpinnerDatePicker.a
        public void e(long j) {
            this.f11723k.setTimeInMillis(j);
            if (this.f11723k.get(1) == this.l.get(1) && this.f11723k.get(6) == this.l.get(6)) {
                return;
            }
            this.l.setTimeInMillis(j);
            if (this.c.before(this.l)) {
                this.c.setTimeInMillis(this.l.getTimeInMillis());
            }
        }

        @Override // com.xiaomi.fitness.baseui.widget.SpinnerDatePicker.a
        public void f(long j, long j2) {
            this.p.d(j, j2);
            b(j2);
            e(j);
        }

        @Override // com.xiaomi.fitness.baseui.widget.SpinnerDatePicker.a
        public void g(int i, int i2, int i3) {
            w(i, i2, i3);
            B();
            v();
        }

        @Override // com.xiaomi.fitness.baseui.widget.SpinnerDatePicker.a
        public Parcelable h(Parcelable parcelable) {
            return new AbstractDatePickerDelegate.SavedState(parcelable, d(), i(), j(), c().getTimeInMillis(), a().getTimeInMillis());
        }

        @Override // com.xiaomi.fitness.baseui.widget.SpinnerDatePicker.a
        public int i() {
            return this.c.get(2);
        }

        @Override // com.xiaomi.fitness.baseui.widget.SpinnerDatePicker.a
        public boolean isEnabled() {
            return this.n;
        }

        @Override // com.xiaomi.fitness.baseui.widget.SpinnerDatePicker.a
        public int j() {
            return this.c.get(5);
        }

        @Override // com.xiaomi.fitness.baseui.widget.SpinnerDatePicker.AbstractDatePickerDelegate
        public void l(Locale locale) {
            super.l(locale);
            this.f11723k = t(this.f11723k, locale);
            this.l = t(this.l, locale);
            this.m = t(this.m, locale);
            this.c = t(this.c, locale);
            this.j = this.f11723k.getActualMaximum(2) + 1;
            this.i = new DateFormatSymbols().getShortMonths();
            this.i = new String[this.j];
            int i = 0;
            while (i < this.j) {
                int i2 = i + 1;
                this.i[i] = String.format(TimeModel.NUMBER_FORMAT, Integer.valueOf(i2));
                i = i2;
            }
        }

        @Override // com.xiaomi.fitness.baseui.widget.SpinnerDatePicker.a
        public void onConfigurationChanged(Configuration configuration) {
            l(configuration.locale);
        }

        @Override // com.xiaomi.fitness.baseui.widget.SpinnerDatePicker.a
        public void onRestoreInstanceState(Parcelable parcelable) {
            if (parcelable instanceof AbstractDatePickerDelegate.SavedState) {
                AbstractDatePickerDelegate.SavedState savedState = (AbstractDatePickerDelegate.SavedState) parcelable;
                f(savedState.c(), savedState.a());
                w(savedState.f(), savedState.e(), savedState.d());
                B();
            }
        }

        @Override // com.xiaomi.fitness.baseui.widget.SpinnerDatePicker.a
        public void setEnabled(boolean z) {
            this.f.setEnabled(z);
            this.g.setEnabled(z);
            this.h.setEnabled(z);
            this.n = z;
        }

        public final Calendar t(Calendar calendar, Locale locale) {
            if (calendar == null) {
                return Calendar.getInstance(locale);
            }
            long timeInMillis = calendar.getTimeInMillis();
            Calendar calendar2 = Calendar.getInstance(locale);
            calendar2.setTimeInMillis(timeInMillis);
            return calendar2;
        }

        public void u(int i, int i2, int i3, d dVar) {
            w(i, i2, i3);
            B();
            this.e = dVar;
        }

        public final void v() {
            d dVar = this.e;
            if (dVar != null) {
                dVar.a(this.f11719a, d(), i(), j());
            }
            this.f11719a.sendAccessibilityEvent(4);
        }

        public final void w(int i, int i2, int i3) {
            this.p.h(i, i2, i3);
            c cVar = this.p;
            this.c.set(cVar.d, cVar.e, cVar.f);
            if (this.c.before(this.l)) {
                this.c.setTimeInMillis(this.l.getTimeInMillis());
                this.p.i(this.c);
            } else if (this.c.after(this.m)) {
                this.c.setTimeInMillis(this.m.getTimeInMillis());
                this.p.i(this.c);
            }
        }

        public final void x(int i, int i2, int i3) {
            A(i);
            z(i2);
            y(i3);
        }

        public final void y(int i) {
            this.f.setContentDescription(this.f11720b.getResources().getString(n1j.x, Integer.valueOf(i)));
        }

        public final void z(int i) {
            this.g.setContentDescription(this.f11720b.getResources().getString(n1j.y, Integer.valueOf(i + 1)));
        }
    }

    public static class c {
        public int d;
        public int e;
        public int f;
        public long j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f11727k;
        public int l;
        public int m;
        public int n;
        public int q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f11728r;
        public int s;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int[] f11725a = new int[2];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int[] f11726b = new int[2];
        public int[] c = new int[2];
        public Calendar g = Calendar.getInstance();
        public Calendar h = Calendar.getInstance();
        public Calendar i = Calendar.getInstance();
        public int[] o = new int[2];
        public int[] p = new int[2];
        public int[] t = new int[2];
        public int[] u = new int[2];

        public final void a() {
            if (this.l != this.q) {
                int[] iArr = this.o;
                iArr[0] = this.m;
                iArr[1] = this.g.getActualMaximum(2);
                int[] iArr2 = this.p;
                iArr2[0] = this.n;
                iArr2[1] = this.g.getActualMaximum(5);
                this.t[0] = this.h.getActualMinimum(2);
                this.t[1] = this.f11728r;
                this.u[0] = this.h.getActualMinimum(5);
                this.u[1] = this.s;
                return;
            }
            int i = this.m;
            int i2 = this.f11728r;
            if (i != i2) {
                int[] iArr3 = this.o;
                int[] iArr4 = this.t;
                iArr4[0] = i;
                iArr3[0] = i;
                iArr4[1] = i2;
                iArr3[1] = i2;
                int[] iArr5 = this.p;
                iArr5[0] = this.n;
                iArr5[1] = this.g.getActualMaximum(5);
                this.u[0] = this.h.getActualMinimum(5);
                this.u[1] = this.s;
                return;
            }
            int[] iArr6 = this.o;
            iArr6[1] = i;
            iArr6[0] = i;
            int[] iArr7 = this.t;
            iArr7[1] = i;
            iArr7[0] = i;
            int[] iArr8 = this.p;
            int[] iArr9 = this.u;
            int i3 = this.n;
            iArr9[0] = i3;
            iArr8[0] = i3;
            int i4 = this.s;
            iArr9[1] = i4;
            iArr8[1] = i4;
        }

        public final void b() {
            this.h.setTimeInMillis(this.f11727k);
            this.q = this.h.get(1);
            this.f11728r = this.h.get(2);
            this.s = this.h.get(5);
        }

        public final void c() {
            this.g.setTimeInMillis(this.j);
            this.l = this.g.get(1);
            this.m = this.g.get(2);
            this.n = this.g.get(5);
        }

        public void d(long j, long j2) {
            if (j > j2) {
                throw new IllegalArgumentException("invalidate arguments");
            }
            this.j = j;
            this.f11727k = j2;
            c();
            b();
            a();
            i(Calendar.getInstance());
        }

        public final void e(int i, int i2, int i3) {
            this.i.clear();
            this.i.set(1, i);
            this.i.set(2, i2);
            this.c[0] = this.i.getActualMinimum(5);
            this.c[1] = this.i.getActualMaximum(5);
            int[] iArr = this.c;
            int i4 = iArr[0];
            if (i3 < i4) {
                this.f = i4;
                return;
            }
            int i5 = iArr[1];
            if (i3 > i5) {
                this.f = i5;
            } else {
                this.f = i3;
            }
        }

        public final void f(int i, int i2, int i3) {
            int i4 = this.e;
            if (i4 == this.t[1]) {
                int[] iArr = this.c;
                int[] iArr2 = this.u;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
                int i5 = iArr2[0];
                if (i3 < i5) {
                    this.f = i5;
                    return;
                }
                int i6 = iArr2[1];
                if (i3 > i6) {
                    this.f = i6;
                    return;
                } else {
                    this.f = i3;
                    return;
                }
            }
            if (i4 == this.o[0]) {
                int[] iArr3 = this.c;
                int[] iArr4 = this.p;
                iArr3[0] = iArr4[0];
                iArr3[1] = iArr4[1];
                int i7 = iArr4[0];
                if (i3 < i7) {
                    this.f = i7;
                    return;
                }
                int i8 = iArr4[1];
                if (i3 > i8) {
                    this.f = i8;
                    return;
                } else {
                    this.f = i3;
                    return;
                }
            }
            this.i.clear();
            this.i.set(1, i);
            this.i.set(2, i2);
            this.c[0] = this.i.getActualMinimum(5);
            this.c[1] = this.i.getActualMaximum(5);
            int[] iArr5 = this.c;
            int i9 = iArr5[0];
            if (i3 < i9) {
                this.f = i9;
                return;
            }
            int i10 = iArr5[1];
            if (i3 > i10) {
                this.f = i10;
            } else {
                this.f = i3;
            }
        }

        public final void g(int i, int i2, int i3) {
            int i4 = this.e;
            if (i4 == this.o[0]) {
                int[] iArr = this.c;
                int[] iArr2 = this.p;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
                int i5 = iArr2[0];
                if (i3 < i5) {
                    this.f = i5;
                    return;
                }
                int i6 = iArr2[1];
                if (i3 > i6) {
                    this.f = i6;
                    return;
                } else {
                    this.f = i3;
                    return;
                }
            }
            if (i4 == this.t[1]) {
                int[] iArr3 = this.c;
                int[] iArr4 = this.u;
                iArr3[0] = iArr4[0];
                iArr3[1] = iArr4[1];
                int i7 = iArr4[0];
                if (i3 < i7) {
                    this.f = i7;
                    return;
                }
                int i8 = iArr4[1];
                if (i3 > i8) {
                    this.f = i8;
                    return;
                } else {
                    this.f = i3;
                    return;
                }
            }
            this.i.clear();
            this.i.set(1, i);
            this.i.set(2, i2);
            this.c[0] = this.i.getActualMinimum(5);
            this.c[1] = this.i.getActualMaximum(5);
            int[] iArr5 = this.c;
            int i9 = iArr5[0];
            if (i3 < i9) {
                this.f = i9;
                return;
            }
            int i10 = iArr5[1];
            if (i3 > i10) {
                this.f = i10;
            } else {
                this.f = i3;
            }
        }

        public void h(int i, int i2, int i3) {
            int[] iArr = this.f11725a;
            int i4 = this.l;
            iArr[0] = i4;
            int i5 = this.q;
            iArr[1] = i5;
            if (i < i4) {
                this.d = i4;
            } else if (i > i5) {
                this.d = i5;
            } else {
                this.d = i;
            }
            int i6 = this.d;
            if (i6 == i4) {
                int[] iArr2 = this.f11726b;
                int[] iArr3 = this.o;
                int i7 = iArr3[0];
                iArr2[0] = i7;
                iArr2[1] = iArr3[1];
                if (i2 < iArr3[0]) {
                    this.e = i7;
                } else {
                    int i8 = iArr3[1];
                    if (i2 > i8) {
                        this.e = i8;
                    } else {
                        this.e = i2;
                    }
                }
                g(i6, this.e, i3);
                return;
            }
            if (i6 != i5) {
                this.e = i2;
                this.i.clear();
                this.i.set(1, i);
                this.f11726b[0] = this.i.getActualMinimum(2);
                this.f11726b[1] = this.i.getActualMaximum(2);
                e(this.d, this.e, i3);
                return;
            }
            int[] iArr4 = this.f11726b;
            int[] iArr5 = this.t;
            iArr4[0] = iArr5[0];
            iArr4[1] = iArr5[1];
            int i9 = iArr5[0];
            if (i2 < i9) {
                this.e = i9;
            } else {
                int i10 = iArr5[1];
                if (i2 > i10) {
                    this.e = i10;
                } else {
                    this.e = i2;
                }
            }
            f(i6, this.e, i3);
        }

        public void i(Calendar calendar) {
            h(calendar.get(1), calendar.get(2), calendar.get(5));
        }

        public String toString() {
            return "year = [" + this.f11725a[0] + "," + this.f11725a[1] + "],\nmonth = [" + this.f11726b[0] + "," + this.f11726b[1] + "],\nday = [" + this.c[0] + ',' + this.c[1] + "]\n";
        }
    }

    public interface d {
        void a(SpinnerDatePicker spinnerDatePicker, int i, int i2, int i3);
    }

    public SpinnerDatePicker(Context context) {
        this(context, null);
    }

    public final a a(Context context, AttributeSet attributeSet, int i, int i2) {
        return new b(this, context, attributeSet, i, i2);
    }

    public void b(long j, long j2) {
        this.f11718a.f(j, j2);
    }

    public void c(int i, int i2, int i3) {
        this.f11718a.g(i, i2, i3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return SpinnerDatePicker.class.getName();
    }

    public int getDayOfMonth() {
        return this.f11718a.j();
    }

    public long getMaxDate() {
        return this.f11718a.a().getTimeInMillis();
    }

    public long getMinDate() {
        return this.f11718a.c().getTimeInMillis();
    }

    public int getMonth() {
        return this.f11718a.i();
    }

    public int getYear() {
        return this.f11718a.d();
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.f11718a.isEnabled();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f11718a.onConfigurationChanged(configuration);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        View.BaseSavedState baseSavedState = (View.BaseSavedState) parcelable;
        super.onRestoreInstanceState(baseSavedState.getSuperState());
        this.f11718a.onRestoreInstanceState(baseSavedState);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return this.f11718a.h(super.onSaveInstanceState());
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        if (this.f11718a.isEnabled() == z) {
            return;
        }
        super.setEnabled(z);
        this.f11718a.setEnabled(z);
    }

    public void setMaxDate(long j) {
        this.f11718a.b(j);
    }

    public void setMinDate(long j) {
        this.f11718a.e(j);
    }

    public void setOnDateChangedListener(d dVar) {
        this.f11718a.setOnDateChangedListener(dVar);
    }

    public SpinnerDatePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SpinnerDatePicker(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SpinnerDatePicker(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.f11718a = a(context, attributeSet, i, i2);
    }
}
