package com.huawei.uikit.hwdatepicker.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.huawei.uikit.hwadvancednumberpicker.widget.HwAdvancedNumberPicker;
import com.huawei.uikit.hwcheckbox.widget.HwCheckBox;
import com.huawei.uikit.hwdatepicker.R;
import com.huawei.uikit.hwlunar.utils.HwLunarCalendar;
import defpackage.xdf;
import defpackage.xej;
import defpackage.xek;
import defpackage.xex;
import defpackage.xfa;
import defpackage.xfs;
import defpackage.xft;
import defpackage.xfu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class HwDatePicker extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f29386a;
    private float aa;
    private boolean ab;
    private boolean ac;
    private LinearLayout ad;
    private LinearLayout ae;
    private Drawable af;
    private Drawable ag;
    private Drawable ah;
    private LinearLayout ai;
    private String[] aj;
    private HwCheckBox ak;
    private Locale al;
    private String[] am;
    private OnDateChangedListener an;
    private GregorianCalendar ao;
    private GregorianCalendar ap;
    private int aq;
    private GregorianCalendar ar;
    private GregorianCalendar as;
    private Drawable at;
    private int au;
    private int av;
    private int aw;
    private int ax;
    private boolean ay;
    private boolean az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f29387b;
    private boolean ba;
    private boolean bb;
    private boolean bc;
    private HwLunarCalendar bd;
    private boolean bf;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected HwAdvancedNumberPicker f29388c;
    protected HwAdvancedNumberPicker d;
    protected HwAdvancedNumberPicker e;
    private String f;
    private String[] g;
    private xex h;
    private String[] i;
    private String j;
    private String[] k;
    private String[] l;
    private String[] m;
    private String[] n;
    private String[] o;
    private String[] p;
    private String[] q;
    private String[] r;
    private String s;
    private String t;
    private Context u;
    private int v;
    private String[] w;
    private List<HwAdvancedNumberPicker> x;
    private int y;
    private LinearLayout z;

    public interface OnDateChangedListener {
        void onDateChanged(HwDatePicker hwDatePicker, int i, int i2, int i3, GregorianCalendar gregorianCalendar);
    }

    class a implements HwAdvancedNumberPicker.OnColorChangeListener {
        a() {
        }

        @Override // com.huawei.uikit.hwadvancednumberpicker.widget.HwAdvancedNumberPicker.OnColorChangeListener
        public void onColorChange(HwAdvancedNumberPicker hwAdvancedNumberPicker) {
        }
    }

    static class avpbg extends View.BaseSavedState {
        public static final Parcelable.Creator<avpbg> CREATOR = new d();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f29389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f29390b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f29391c;

        class d implements Parcelable.Creator<avpbg> {
            d() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public avpbg createFromParcel(Parcel parcel) {
                return new avpbg(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public avpbg[] newArray(int i) {
                return new avpbg[i];
            }
        }

        /* synthetic */ avpbg(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            if (parcel != null) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f29389a);
                parcel.writeInt(this.f29390b);
                parcel.writeInt(this.f29391c);
            }
        }

        /* synthetic */ avpbg(Parcelable parcelable, int i, int i2, int i3, a aVar) {
            this(parcelable, i, i2, i3);
        }

        private avpbg(Parcelable parcelable, int i, int i2, int i3) {
            super(parcelable);
            this.f29389a = i;
            this.f29390b = i2;
            this.f29391c = i3;
        }

        private avpbg(Parcel parcel) {
            super(parcel);
            this.f29389a = parcel.readInt();
            this.f29390b = parcel.readInt();
            this.f29391c = parcel.readInt();
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HwDatePicker.this.ak.setChecked(!HwDatePicker.this.ak.isChecked());
        }
    }

    class d implements HwAdvancedNumberPicker.OnValueChangeListener {
        d() {
        }

        @Override // com.huawei.uikit.hwadvancednumberpicker.widget.HwAdvancedNumberPicker.OnValueChangeListener
        public void onValueChange(HwAdvancedNumberPicker hwAdvancedNumberPicker, int i, int i2) {
            HwDatePicker.this.d(hwAdvancedNumberPicker, i, i2);
            HwDatePicker hwDatePicker = HwDatePicker.this;
            hwDatePicker.c(hwDatePicker.ao.get(1), HwDatePicker.this.ao.get(2), HwDatePicker.this.ao.get(5));
            HwDatePicker.this.ah();
            HwDatePicker.this.ac();
        }
    }

    class e implements CompoundButton.OnCheckedChangeListener {
        e() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            HwDatePicker.this.bc = !z;
            if (xdf.a(HwDatePicker.this.u)) {
                HwDatePicker.this.y();
            }
            HwDatePicker.this.ah();
            HwDatePicker.this.ac();
        }
    }

    public HwDatePicker(Context context) {
        this(context, null);
    }

    private void aa() {
        if (!this.bb) {
            Log.w("HwDatePicker", "no need to reset LunarYearMonthDay.");
            return;
        }
        this.bd.e(this.ar.get(1), this.ar.get(2) + 1, this.ar.get(5));
        this.f29386a = this.bd.d();
        this.f = this.bd.a();
        this.j = this.bd.b();
    }

    private void ab() {
        this.z.removeAllViews();
        char[] cArrC = xej.c(DateFormat.getBestDateTimePattern(Locale.getDefault(), "yyyyMMMdd"));
        int length = cArrC.length;
        for (int i = 0; i < length; i++) {
            char c2 = cArrC[i];
            if (c2 == 'M') {
                this.z.addView(this.e);
                a(i, this.e);
            } else if (c2 == 'd') {
                this.z.addView(this.f29388c);
                a(i, this.f29388c);
            } else if (c2 != 'y') {
                Log.e("HwDatePicker", "reorderSpinners: ");
                return;
            } else {
                this.z.addView(this.d);
                a(i, this.d);
            }
        }
        e(this.z.getChildAt(0), this.z.getChildAt(1), this.z.getChildAt(length - 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac() {
        String str = ",   " + getShowString();
        this.d.setAnnouncedSuffix(str);
        this.e.setAnnouncedSuffix(str);
        this.f29388c.setAnnouncedSuffix(str);
        this.d.setAccessibilityOptimizationEnabled(true);
        this.e.setAccessibilityOptimizationEnabled(true);
        this.f29388c.setAccessibilityOptimizationEnabled(true);
        OnDateChangedListener onDateChangedListener = this.an;
        if (onDateChangedListener != null) {
            onDateChangedListener.onDateChanged(this, getYear(), getMonth(), getDayOfMonth(), this.ar);
        }
    }

    private void ad() {
        a aVar = new a();
        this.f29388c.setOnColorChangeListener(aVar);
        this.e.setOnColorChangeListener(aVar);
        this.d.setOnColorChangeListener(aVar);
    }

    private void ae() {
        int i;
        this.ao.clear();
        this.ao.set(1, 0, 1);
        setMinDate(this.ao.getTimeInMillis());
        if (this.ba) {
            i = 5000;
        } else {
            i = this.av + 1;
            this.au = i;
        }
        this.ao.clear();
        this.ao.set(i, 11, 31);
        setMaxDate(this.ao.getTimeInMillis());
    }

    private void af() {
        if (xdf.a(this.u) && this.az) {
            this.ae.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.ae.setVisibility(0);
        } else {
            this.ae.setVisibility(8);
        }
        if (!this.ac) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams.weight = 3.0f;
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -1);
            layoutParams2.weight = 2.0f;
            this.d.setLayoutParams(layoutParams);
            this.e.setLayoutParams(layoutParams2);
            this.f29388c.setLayoutParams(layoutParams2);
        }
        ah();
    }

    private void ag() {
        int i = this.ar.get(1);
        int i2 = this.ar.get(2);
        int i3 = this.ar.get(5);
        if (i == this.ap.get(1) && i2 == this.ap.get(2)) {
            f(i3);
        } else if (i == this.as.get(1) && i2 == this.as.get(2)) {
            i(i3);
        } else {
            o();
        }
        this.e.setDisplayedValues((String[]) Arrays.copyOfRange(this.am, this.e.getMinValue(), this.e.getMaxValue() + 1));
        this.f29388c.setDisplayedValues((String[]) Arrays.copyOfRange(this.aj, this.f29388c.getMinValue() - 1, this.f29388c.getMaxValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ah() {
        if (w()) {
            if (this.bc) {
                j();
            } else {
                if (!this.bf) {
                    this.h = xex.e(this.u);
                    this.bd = new HwLunarCalendar(this.u);
                    this.bf = true;
                }
                ai();
            }
            this.d.postInvalidate();
            this.e.postInvalidate();
            this.f29388c.postInvalidate();
        }
    }

    private void ai() {
        if (this.ba) {
            ak();
        } else {
            al();
        }
    }

    private void aj() {
        int i;
        this.i = this.h.e();
        int i2 = this.au;
        String[] strArr = new String[i2 - 1899];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = i2 - 1900;
            if (i4 >= i) {
                break;
            }
            strArr[i4] = this.i[i4 + 2];
            i4++;
        }
        strArr[i] = "-- --";
        this.l = xfa.d;
        String[] strArr2 = xfa.e;
        this.o = strArr2;
        this.p = strArr2;
        this.d.setDisplayedValues(null);
        this.d.setMinValue(1900);
        this.d.setMaxValue(this.au);
        this.d.setDisplayedValues(strArr);
        this.d.setValue(i2 + 1);
        this.d.setWrapSelectorWheel(false);
        String str = this.f;
        int i5 = 0;
        while (true) {
            String[] strArr3 = this.l;
            if (i5 >= strArr3.length || str.equals(strArr3[i5])) {
                break;
            } else {
                i5++;
            }
        }
        this.v = i5 + 1;
        this.e.setDisplayedValues(null);
        this.e.setMinValue(1);
        this.e.setMaxValue(this.l.length);
        this.e.setValue(this.v);
        this.e.setDisplayedValues(this.l);
        this.e.setWrapSelectorWheel(true);
        String str2 = this.j;
        while (true) {
            String[] strArr4 = this.o;
            if (i3 >= strArr4.length || str2.equals(strArr4[i3])) {
                break;
            } else {
                i3++;
            }
        }
        this.y = i3 + 1;
        this.f29388c.setDisplayedValues(null);
        this.f29388c.setMinValue(1);
        this.f29388c.setMaxValue(this.o.length);
        this.f29388c.setValue(this.y);
        this.f29388c.setDisplayedValues(this.o);
        this.f29388c.setWrapSelectorWheel(true);
    }

    private void ak() {
        GregorianCalendar gregorianCalendarA = xex.a();
        GregorianCalendar gregorianCalendarC = xex.c();
        boolean zC = c(gregorianCalendarA);
        boolean zD = d(gregorianCalendarC);
        aa();
        String string = this.u.getString(R.string.la_yue);
        String string2 = this.u.getString(R.string.la_yue1);
        if (string.equals(this.f)) {
            this.f = string2;
        }
        String string3 = this.u.getString(R.string.run_yue);
        String string4 = this.u.getString(R.string.run_yue1);
        if (this.f.length() == 3 && string3.equals(this.f.substring(0, 1))) {
            this.f = this.f.replace(string3, string4);
        }
        int iIntValue = this.h.i().get(this.f29386a).intValue();
        String str = this.s;
        if (str == null || !str.equals(this.f29386a)) {
            this.h.e(iIntValue);
        }
        Map<String, Integer> mapD = this.h.d();
        int iIntValue2 = mapD != null ? mapD.get(this.f29386a).intValue() : 0;
        b(iIntValue);
        int iA = xfa.a(this.f, this.l);
        this.k = xek.b(iA, this.l, this.n, this.m);
        s();
        int iA2 = xfa.a(this.j, this.o);
        this.p = xek.b(iA2, this.o, this.r, this.q);
        int iD = d(iIntValue2, zC, zD);
        int iC = c(iA, zC, zD);
        int iA3 = a(iA2, zC, zD);
        String[] strArr = (String[]) this.i.clone();
        e(iD, strArr);
        e(this.d, iD, strArr, true);
        String[] strArrE = e(string, string2, string3, string4);
        this.e.setValue(iC);
        e(this.f29388c, iA3, strArrE, true);
        this.s = this.f29386a;
        this.t = this.f29386a + this.f;
    }

    private void al() {
        aa();
        String string = this.u.getString(R.string.la_yue);
        String string2 = this.u.getString(R.string.la_yue1);
        if (string.equals(this.f)) {
            this.f = string2;
        }
        String string3 = this.u.getString(R.string.run_yue);
        String string4 = this.u.getString(R.string.run_yue1);
        if (this.f.length() == 3 && string3.equals(this.f.substring(0, 1))) {
            this.f = this.f.replace(string3, string4);
        }
        int iIntValue = this.h.i().get(this.f29386a).intValue();
        if (this.bb) {
            j(iIntValue);
        } else {
            aj();
        }
        this.s = this.f29386a;
        this.t = this.f29386a + this.f;
    }

    private boolean b(int i, int i2, int i3) {
        return i == i3 && i2 == 0;
    }

    private String getShowString() {
        if (this.bc) {
            return DateUtils.formatDateTime(this.u, this.ar.getTimeInMillis(), this.bb ? 20 : 24);
        }
        if (this.bb) {
            return getWholeLunarStrings();
        }
        return this.f + this.j;
    }

    private String getWholeLunarStrings() {
        String str = this.f29386a;
        if (str == null) {
            return "";
        }
        String[] strArrSplit = str.split("年");
        if (strArrSplit.length != 2) {
            return "";
        }
        return strArrSplit[1] + "年" + this.f + this.j;
    }

    private void j() {
        if (this.ba) {
            k();
        } else {
            n();
        }
    }

    private boolean j(int i, int i2, int i3) {
        return i == 0 && i2 == i3;
    }

    private void k() {
        ag();
        this.d.setDisplayedValues(null);
        this.d.setMinValue(this.ap.get(1));
        this.d.setMaxValue(this.as.get(1));
        this.d.setWrapSelectorWheel(false);
        this.d.setValue(this.ar.get(1));
        this.e.setValue(this.ar.get(2));
        this.f29388c.setValue(this.ar.get(5));
    }

    private void l() {
        this.d.setDisplayedValues(null);
        this.d.setMinValue(this.ap.get(1));
        this.d.setMaxValue(this.au);
        String[] displayedValues = this.d.getDisplayedValues();
        displayedValues[displayedValues.length - 1] = "-- --";
        this.d.setDisplayedValues(displayedValues);
        this.d.setWrapSelectorWheel(false);
        this.e.setDisplayedValues(null);
        this.e.setDisplayedValues((String[]) Arrays.copyOfRange(this.am, this.e.getMinValue(), this.e.getMaxValue() + 1));
        this.f29388c.setDisplayedValues(null);
        int[] iArr = xek.f52780a;
        int i = iArr[this.v % iArr.length];
        String[] strArr = new String[i];
        System.arraycopy(this.aj, 0, strArr, 0, i);
        this.f29388c.setMinValue(1);
        this.f29388c.setMaxValue(i);
        this.f29388c.setDisplayedValues(strArr);
        this.d.setValue(this.au);
        this.e.setValue(this.v);
        this.f29388c.setValue(this.y);
    }

    private void m() {
        ag();
        this.d.setDisplayedValues(null);
        this.d.setMinValue(this.ap.get(1));
        this.d.setMaxValue(this.au);
        String[] displayedValues = this.d.getDisplayedValues();
        displayedValues[displayedValues.length - 1] = "-- --";
        this.d.setDisplayedValues(displayedValues);
        this.d.setWrapSelectorWheel(false);
        this.d.setValue(this.ar.get(1));
        this.e.setValue(this.ar.get(2));
        this.f29388c.setValue(this.ar.get(5));
    }

    private void n() {
        if (this.bb) {
            m();
        } else {
            l();
        }
    }

    private void o() {
        this.f29388c.setDisplayedValues(null);
        this.f29388c.setMinValue(1);
        this.f29388c.setMaxValue(this.ar.getActualMaximum(5));
        this.f29388c.setWrapSelectorWheel(true);
        this.e.setDisplayedValues(null);
        this.e.setMinValue(0);
        this.e.setMaxValue(11);
        this.e.setWrapSelectorWheel(true);
    }

    private void setCurrentLocale(Locale locale) {
        if (locale.equals(this.al)) {
            return;
        }
        this.al = locale;
        this.ao = e(this.ao, locale);
        this.ap = e(this.ap, locale);
        this.as = e(this.as, locale);
        this.ar = e(this.ar, locale);
        int actualMaximum = this.ao.getActualMaximum(2) + 1;
        this.aq = actualMaximum;
        this.am = new String[actualMaximum];
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(5, 1);
        int i = 0;
        for (int i2 = 0; i2 < this.aq; i2++) {
            gregorianCalendar.set(2, i2);
            this.am[i2] = DateUtils.formatDateTime(this.u, gregorianCalendar.getTimeInMillis(), 65592);
        }
        this.aj = new String[31];
        String bestDateTimePattern = DateFormat.getBestDateTimePattern(locale, "d");
        Object objClone = this.ao.clone();
        if (objClone instanceof GregorianCalendar) {
            GregorianCalendar gregorianCalendar2 = (GregorianCalendar) objClone;
            gregorianCalendar2.set(2, 0);
            while (i < 31) {
                int i3 = i + 1;
                gregorianCalendar2.set(5, i3);
                this.aj[i] = DateFormat.format(bestDateTimePattern, gregorianCalendar2).toString();
                i = i3;
            }
        }
    }

    private void setMaxDate(long j) {
        this.ao.setTimeInMillis(j);
        this.as.setTimeInMillis(j);
        t();
        ah();
    }

    private void setMinDate(long j) {
        this.ao.setTimeInMillis(j);
        this.ap.setTimeInMillis(j);
        t();
        ah();
    }

    private void setSpinnersMiddleDrawable(int i) {
        HwAdvancedNumberPicker hwAdvancedNumberPicker = this.d;
        if (hwAdvancedNumberPicker != null) {
            hwAdvancedNumberPicker.setMiddleStateDrawable(i);
        }
        HwAdvancedNumberPicker hwAdvancedNumberPicker2 = this.e;
        if (hwAdvancedNumberPicker2 != null) {
            hwAdvancedNumberPicker2.setMiddleStateDrawable(i);
        }
        HwAdvancedNumberPicker hwAdvancedNumberPicker3 = this.f29388c;
        if (hwAdvancedNumberPicker3 != null) {
            hwAdvancedNumberPicker3.setMiddleStateDrawable(i);
        }
    }

    private void setSpinnersSelectionDividerHeight(int i) {
        HwAdvancedNumberPicker hwAdvancedNumberPicker = this.d;
        if (hwAdvancedNumberPicker != null) {
            hwAdvancedNumberPicker.setSelectionDividerHeight(i);
        }
        HwAdvancedNumberPicker hwAdvancedNumberPicker2 = this.e;
        if (hwAdvancedNumberPicker2 != null) {
            hwAdvancedNumberPicker2.setSelectionDividerHeight(i);
        }
        HwAdvancedNumberPicker hwAdvancedNumberPicker3 = this.f29388c;
        if (hwAdvancedNumberPicker3 != null) {
            hwAdvancedNumberPicker3.setSelectionDividerHeight(i);
        }
    }

    private void u() {
        this.ad = (LinearLayout) findViewById(R.id.hwdatepicker_pickers_Layout);
        this.z = (LinearLayout) findViewById(R.id.hwdatepicker_pickers);
        HwAdvancedNumberPicker hwAdvancedNumberPicker = (HwAdvancedNumberPicker) findViewById(R.id.hwdatepicker_day);
        this.f29388c = hwAdvancedNumberPicker;
        hwAdvancedNumberPicker.setOnLongPressUpdateInterval(100L);
        HwAdvancedNumberPicker hwAdvancedNumberPicker2 = (HwAdvancedNumberPicker) findViewById(R.id.hwdatepicker_month);
        this.e = hwAdvancedNumberPicker2;
        hwAdvancedNumberPicker2.setMinValue(0);
        this.e.setMaxValue(this.aq - 1);
        this.e.setDisplayedValues(this.am);
        this.e.setOnLongPressUpdateInterval(100L);
        HwAdvancedNumberPicker hwAdvancedNumberPicker3 = (HwAdvancedNumberPicker) findViewById(R.id.hwdatepicker_year);
        this.d = hwAdvancedNumberPicker3;
        hwAdvancedNumberPicker3.setOnLongPressUpdateInterval(100L);
        this.d.setFlingAnnounceType(3);
        this.e.setFlingAnnounceType(1);
        this.f29388c.setFlingAnnounceType(3);
        this.d.setIsSupportRichTap(false);
        this.e.setIsSupportRichTap(false);
        this.f29388c.setIsSupportRichTap(false);
        d();
    }

    private boolean v() {
        return xft.c(this.u) != 1 || Float.compare(this.aa, 1.75f) < 0;
    }

    private boolean w() {
        return (this.f29388c == null || this.e == null || this.d == null) ? false : true;
    }

    private void x() {
        this.ae = (LinearLayout) findViewById(R.id.hwdatepicker_lunar_or_western);
        HwCheckBox hwCheckBox = (HwCheckBox) findViewById(R.id.hwdatepicker_checkbox);
        this.ak = hwCheckBox;
        if (hwCheckBox != null) {
            hwCheckBox.setChecked(false);
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.hwdatepicker_switch_button);
        this.ai = linearLayout;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new c());
        }
        e eVar = new e();
        HwCheckBox hwCheckBox2 = this.ak;
        if (hwCheckBox2 != null) {
            hwCheckBox2.setOnCheckedChangeListener(eVar);
        }
    }

    private void z() {
        d dVar = new d();
        this.f29388c.setOnValueChangedListener(dVar);
        this.e.setOnValueChangedListener(dVar);
        this.d.setOnValueChangedListener(dVar);
    }

    public void a() {
        af();
        boolean z = !this.ac && getResources().getConfiguration().orientation == 2;
        this.f29388c.d(z);
        this.e.d(z);
        this.d.d(z);
    }

    public final void b(int i, int i2, int i3, OnDateChangedListener onDateChangedListener) {
        c(i, i2, i3);
        ah();
        this.an = onDateChangedListener;
    }

    public boolean b() {
        return this.ba;
    }

    public boolean c() {
        return this.az;
    }

    protected void d() {
        this.f29387b = 0;
    }

    public void d(int i, int i2, int i3) {
        if (e(i, i2, i3)) {
            c(i, i2, i3);
            ah();
            ac();
        }
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public void e(int i, int i2) {
        if (i < 1) {
            i = 1;
        }
        this.ao.clear();
        this.ao.set(i, 0, 1);
        setMinDate(this.ao.getTimeInMillis());
        if (i2 > 5000) {
            i2 = 5000;
        }
        this.ao.clear();
        this.ao.set(i2, 11, 31);
        setMaxDate(this.ao.getTimeInMillis());
    }

    protected void e(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwDatePicker, i, 0);
        try {
            setEnabled(typedArrayObtainStyledAttributes.getBoolean(R.styleable.HwDatePicker_android_enabled, true));
            if (this.f29387b == 1) {
                this.ah = typedArrayObtainStyledAttributes.getDrawable(R.styleable.HwDatePicker_hwSelectionDividerRectLeft);
                this.af = typedArrayObtainStyledAttributes.getDrawable(R.styleable.HwDatePicker_hwSelectionDividerRectCenter);
                this.ag = typedArrayObtainStyledAttributes.getDrawable(R.styleable.HwDatePicker_hwSelectionDividerRectRight);
            } else {
                setSpinnersSelectionDivider(typedArrayObtainStyledAttributes.getDrawable(R.styleable.HwDatePicker_hwNumberPickerSelectionDivider));
                setSpinnersSelectionDividerHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwDatePicker_hwNumberPickerSelectionDividerHeight, 0));
            }
        } catch (Resources.NotFoundException unused) {
            Log.w("HwDatePicker", "TypedArray get resource error");
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    protected void e(View view, View view2, View view3) {
    }

    public void e(GregorianCalendar gregorianCalendar, GregorianCalendar gregorianCalendar2) {
        if (gregorianCalendar != null) {
            int i = gregorianCalendar.get(1);
            int i2 = gregorianCalendar.get(2);
            int i3 = gregorianCalendar.get(5);
            if (i < 1) {
                i = 1;
            }
            this.ao.clear();
            this.ao.set(i, i2, i3);
            setMinDate(this.ao.getTimeInMillis());
        }
        if (gregorianCalendar2 != null) {
            int i4 = gregorianCalendar2.get(1);
            int i5 = gregorianCalendar2.get(2);
            int i6 = gregorianCalendar2.get(5);
            int i7 = i4 >= 1 ? i4 : 1;
            this.ao.clear();
            this.ao.set(i7, i5, i6);
            setMaxDate(this.ao.getTimeInMillis());
        }
    }

    public boolean e() {
        return this.bb;
    }

    void f() {
        if (v() || xfu.a(this.u)) {
            return;
        }
        this.d.setVisibility(0);
        this.e.setVisibility(8);
        this.f29388c.setVisibility(8);
    }

    void g() {
        if (v()) {
            return;
        }
        if (xfu.a(this.u)) {
            this.ak.setTextSize(1, 16.0f);
            return;
        }
        for (HwAdvancedNumberPicker hwAdvancedNumberPicker : this.x) {
            hwAdvancedNumberPicker.setUnselectedItemTextSize(28.0f);
            hwAdvancedNumberPicker.setSelectedItemTextSize(35.0f);
            hwAdvancedNumberPicker.setSelectedItemHeight(48.0f);
        }
        if (Float.compare(this.aa, 2.0f) >= 0) {
            this.ak.setTextSize(1, 32.0f);
        }
    }

    public int getDayOfMonth() {
        return this.bb ? this.ar.get(5) : this.y;
    }

    public String getDisplayedString() {
        return !this.bc ? getWholeLunarStrings() : "";
    }

    public int getMonth() {
        return this.bb ? this.ar.get(2) : this.v;
    }

    public String[] getShortMonthDays() {
        return this.aj;
    }

    public String[] getShortMonths() {
        return this.am;
    }

    public Drawable getSpinnersSelectionDivider() {
        return this.at;
    }

    public int getSpinnersSelectorPaintColor() {
        return this.ax;
    }

    public boolean getSpinnersShown() {
        return this.z.isShown();
    }

    public int getSpinnersUnselectedPaintColor() {
        return this.aw;
    }

    public int getYear() {
        return this.ar.get(1);
    }

    public boolean h() {
        return this.bc;
    }

    void i() {
        if (v() || xfu.a(this.u)) {
            return;
        }
        this.d.setVisibility(8);
        this.e.setVisibility(0);
        this.f29388c.setVisibility(0);
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.ay;
    }

    @Override // android.view.View
    public boolean isHapticFeedbackEnabled() {
        return super.isHapticFeedbackEnabled();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setCurrentLocale(configuration.locale);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent == null) {
            return;
        }
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.getText().add(DateUtils.formatDateTime(this.u, this.ar.getTimeInMillis(), 20));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof avpbg) {
            avpbg avpbgVar = (avpbg) parcelable;
            super.onRestoreInstanceState(avpbgVar.getSuperState());
            c(avpbgVar.f29389a, avpbgVar.f29390b, avpbgVar.f29391c);
            ah();
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new avpbg(super.onSaveInstanceState(), getYear(), getMonth(), getDayOfMonth(), null);
    }

    public void setDayDisplayValueIndex(int i) {
        this.y = i;
    }

    public void setDialogStyle() {
        af();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        if (!w() || this.ay == z) {
            return;
        }
        this.ay = z;
        this.f29388c.setEnabled(z);
        this.e.setEnabled(z);
        this.d.setEnabled(z);
    }

    @Override // android.view.View
    public void setHapticFeedbackEnabled(boolean z) {
        super.setHapticFeedbackEnabled(z);
        HwAdvancedNumberPicker hwAdvancedNumberPicker = this.f29388c;
        if (hwAdvancedNumberPicker == null || this.e == null || this.d == null) {
            return;
        }
        hwAdvancedNumberPicker.setHapticFeedbackEnabled(z);
        this.e.setHapticFeedbackEnabled(z);
        this.d.setHapticFeedbackEnabled(z);
    }

    public void setIsShowAllYears(boolean z) {
        this.ba = z;
        if (z) {
            return;
        }
        this.au = this.av + 1;
    }

    public void setLinkageScrollEnabled(boolean z) {
        this.ab = z;
    }

    public void setLunarOrWestern(boolean z) {
        this.ak.setChecked(z);
    }

    public void setMonthDisplayValueIndex(int i) {
        this.v = i;
    }

    public void setSelectYear(boolean z) {
        this.bb = z;
    }

    public void setSpinnersSelectionDivider(Drawable drawable) {
        Drawable drawable2 = this.at;
        if (drawable2 == null || !drawable2.equals(drawable)) {
            this.at = drawable;
            HwAdvancedNumberPicker hwAdvancedNumberPicker = this.d;
            if (hwAdvancedNumberPicker != null) {
                hwAdvancedNumberPicker.setSelectionDivider(drawable);
            }
            HwAdvancedNumberPicker hwAdvancedNumberPicker2 = this.e;
            if (hwAdvancedNumberPicker2 != null) {
                hwAdvancedNumberPicker2.setSelectionDivider(drawable);
            }
            HwAdvancedNumberPicker hwAdvancedNumberPicker3 = this.f29388c;
            if (hwAdvancedNumberPicker3 != null) {
                hwAdvancedNumberPicker3.setSelectionDivider(drawable);
            }
        }
    }

    public void setSpinnersSelectorPaintColor(int i) {
        if (this.ax == i) {
            return;
        }
        this.ax = i;
        HwAdvancedNumberPicker hwAdvancedNumberPicker = this.d;
        if (hwAdvancedNumberPicker != null) {
            hwAdvancedNumberPicker.setSelectorPaintColor(i);
        }
        HwAdvancedNumberPicker hwAdvancedNumberPicker2 = this.e;
        if (hwAdvancedNumberPicker2 != null) {
            hwAdvancedNumberPicker2.setSelectorPaintColor(i);
        }
        HwAdvancedNumberPicker hwAdvancedNumberPicker3 = this.f29388c;
        if (hwAdvancedNumberPicker3 != null) {
            hwAdvancedNumberPicker3.setSelectorPaintColor(i);
        }
    }

    public final void setSpinnersShown() {
        this.z.setVisibility(0);
    }

    public void setSpinnersUnselectedPaintColor(int i) {
        if (this.aw == i) {
            return;
        }
        this.aw = i;
        HwAdvancedNumberPicker hwAdvancedNumberPicker = this.d;
        if (hwAdvancedNumberPicker != null) {
            hwAdvancedNumberPicker.setSecondaryPaintColor(i);
        }
        HwAdvancedNumberPicker hwAdvancedNumberPicker2 = this.e;
        if (hwAdvancedNumberPicker2 != null) {
            hwAdvancedNumberPicker2.setSecondaryPaintColor(i);
        }
        HwAdvancedNumberPicker hwAdvancedNumberPicker3 = this.f29388c;
        if (hwAdvancedNumberPicker3 != null) {
            hwAdvancedNumberPicker3.setSecondaryPaintColor(i);
        }
    }

    public void setmIsSupportLunarSwitch(boolean z) {
        HwCheckBox hwCheckBox;
        this.az = z;
        if (!z && (hwCheckBox = this.ak) != null) {
            hwCheckBox.setChecked(false);
        }
        setDialogStyle();
    }

    public void setmIsWestern(boolean z) {
        if (!xdf.a(this.u)) {
            this.bc = true;
            return;
        }
        this.bc = z;
        if (this.az) {
            setLunarOrWestern(!z);
        }
        y();
    }

    public HwDatePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwDatePickerStyle);
    }

    private void a(int i, int i2, int i3) {
        if (i == i3 && i2 == 1) {
            this.ao.add(5, this.ba ? 1 : 1 - i3);
        } else if (i == 1 && i2 == i3) {
            this.ao.add(5, this.ba ? -1 : i3 - 1);
        } else {
            this.ao.add(5, i2 - i);
        }
    }

    private void d(int i, int i2) {
        int i3 = this.au;
        if (i2 == i3) {
            this.bb = false;
            this.v = this.ar.get(2);
            this.y = this.ar.get(5);
        } else {
            if (i2 != i3 - 1 || i != i3) {
                Log.w("HwDatePicker", "mIsSelectYear status not change.");
                return;
            }
            this.bb = true;
            this.ao.set(2, this.v);
            this.ao.set(5, this.y);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(HwAdvancedNumberPicker hwAdvancedNumberPicker, int i, int i2) {
        if (!this.bc) {
            if (this.ba) {
                a(hwAdvancedNumberPicker, i, i2);
                return;
            } else {
                d(hwAdvancedNumberPicker, i2);
                return;
            }
        }
        this.ao.setTimeInMillis(this.ar.getTimeInMillis());
        if (hwAdvancedNumberPicker == this.f29388c) {
            this.y = this.ba ? this.y : i2;
            if (this.ab) {
                a(i, i2, this.ao.getActualMaximum(5));
                return;
            } else {
                this.ao.set(5, i2);
                return;
            }
        }
        if (hwAdvancedNumberPicker == this.e) {
            this.v = this.ba ? this.v : i2;
            if (this.ab) {
                a(i, i2);
                return;
            } else {
                f(i, i2);
                return;
            }
        }
        if (hwAdvancedNumberPicker != this.d) {
            Log.e("HwDatePicker", "invalid picker");
            return;
        }
        if (!this.ba) {
            d(i, i2);
        }
        this.ao.add(1, i2 - i);
    }

    private void f(int i) {
        this.f29388c.setDisplayedValues(null);
        if (i == this.ap.get(5)) {
            this.f29388c.setMinValue(this.ap.get(5));
            this.f29388c.setMaxValue(this.ar.getActualMaximum(5));
            this.f29388c.setWrapSelectorWheel(false);
        } else {
            this.f29388c.setMinValue(this.ar.getActualMinimum(5));
            this.f29388c.setMaxValue(this.ar.getActualMaximum(5));
            this.f29388c.setWrapSelectorWheel(true);
        }
        this.e.setDisplayedValues(null);
        this.e.setMinValue(this.ar.get(2));
        this.e.setMaxValue(this.ar.getActualMaximum(2));
        this.e.setWrapSelectorWheel(false);
    }

    private void p() {
        this.ar.setTimeInMillis(Calendar.getInstance().getTimeInMillis());
        this.av = this.ar.get(1);
        ae();
        b(this.ar.get(1), this.ar.get(2), this.ar.get(5), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        if (this.bc) {
            this.f29388c.a(getResources().getString(R.string.day_view), true);
        } else {
            this.f29388c.a("", false);
        }
    }

    public HwDatePicker(Context context, AttributeSet attributeSet, int i) {
        super(c(context, i), attributeSet, i);
        this.au = 2100;
        this.ay = true;
        this.az = true;
        this.bc = true;
        this.ba = true;
        this.bb = true;
        this.bf = false;
        this.u = getContext();
        this.x = new ArrayList(10);
        this.v = 0;
        this.y = 0;
        Context context2 = super.getContext();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.hwTheme});
        if (typedArrayObtainStyledAttributes != null) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            context2 = resourceId != 0 ? new ContextThemeWrapper(super.getContext(), resourceId) : context2;
            typedArrayObtainStyledAttributes.recycle();
        }
        this.ac = this.u.getResources().getInteger(R.integer.emui_device_type) == 2;
        setCurrentLocale(Locale.getDefault());
        d(context2);
        u();
        z();
        x();
        if (xdf.e(this.u)) {
            this.d.a(getResources().getString(R.string.year_view), true);
        }
        if (xdf.a(this.u)) {
            y();
            if (!this.az) {
                this.ae.setVisibility(8);
            }
        }
        setSpinnersShown();
        d(context2, attributeSet, i);
        p();
        this.x.add(this.f29388c);
        this.x.add(this.e);
        this.x.add(this.d);
        ad();
        try {
            if (!Locale.getDefault().getLanguage().contains("ar") && !Locale.getDefault().getLanguage().contains("fa") && !Locale.getDefault().getLanguage().contains("iw")) {
                ab();
            }
        } catch (IllegalArgumentException unused) {
            Log.e("HwDatePicker", "Exception catched");
        }
        af();
    }

    private void d(Context context, AttributeSet attributeSet, int i) {
        e(context, attributeSet, i);
    }

    private void i(int i) {
        if (this.ba) {
            this.f29388c.setDisplayedValues(null);
            this.f29388c.setMinValue(this.ar.getActualMinimum(5));
            if (i == this.as.get(5)) {
                this.f29388c.setMaxValue(this.as.get(5));
                this.f29388c.setWrapSelectorWheel(false);
            } else {
                this.f29388c.setMaxValue(this.ar.getActualMaximum(5));
                this.f29388c.setWrapSelectorWheel(true);
            }
            this.e.setDisplayedValues(null);
            this.e.setMinValue(this.ar.getActualMinimum(2));
            this.e.setMaxValue(this.ar.get(2));
            this.e.setWrapSelectorWheel(false);
            return;
        }
        this.f29388c.setDisplayedValues(null);
        this.f29388c.setMinValue(this.ar.getActualMinimum(5));
        this.f29388c.setMaxValue(this.ar.getActualMaximum(5));
        this.f29388c.setWrapSelectorWheel(true);
        this.e.setDisplayedValues(null);
        this.e.setMinValue(this.ar.getActualMinimum(2));
        this.e.setMaxValue(this.ar.get(2));
        this.e.setWrapSelectorWheel(true);
    }

    private static Context c(Context context, int i) {
        return xfs.c(context, i, R.style.Theme_Emui_HwDatePicker);
    }

    private GregorianCalendar g(int i) {
        int i2 = this.au;
        if (i == i2) {
            this.bb = false;
        } else if (i == i2 - 1) {
            this.bb = true;
        } else {
            Log.w("HwDatePicker", "mIsSelectYear status not change.");
        }
        if (i < 1898) {
            return null;
        }
        int i3 = i - 1898;
        String[] strArr = this.g;
        if (i3 > strArr.length) {
            return null;
        }
        GregorianCalendar gregorianCalendarE = this.h.e(strArr[i3], this.f, this.j, 0, true);
        boolean z = gregorianCalendarE == null && this.j.equals("三十");
        if (this.bb && z) {
            gregorianCalendarE = this.h.e(this.g[i3], this.f, "廿九", 1, true);
        }
        boolean z2 = gregorianCalendarE == null && this.f.contains("闰");
        if (this.bb && z2) {
            gregorianCalendarE = this.h.e(this.g[i3], this.f.replace("闰", ""), this.j, 1, true);
        }
        boolean z3 = gregorianCalendarE == null && this.f.contains("闰") && this.j.equals("三十");
        if (this.bb && z3) {
            return this.h.e(this.g[i3], this.f.replace("闰", ""), "廿九", 1, true);
        }
        return gregorianCalendarE;
    }

    private void d(Context context) {
        this.w = xfa.d;
        this.aa = xfu.d(context);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        if (layoutInflater != null) {
            layoutInflater.cloneInContext(context).inflate(R.layout.hwdatepicker, (ViewGroup) this, true);
        }
    }

    private void a(int i, int i2) {
        if (b(i, i2, 11)) {
            this.ao.add(2, this.ba ? 1 : -11);
        } else if (i == 0 && i2 == 11) {
            this.ao.add(2, this.ba ? -1 : 11);
        } else {
            this.ao.add(2, i2 - i);
        }
    }

    private void f(int i, int i2) {
        if (i == 0 && i2 == 11) {
            this.ao.add(2, 11);
        } else if (i == 11 && i2 == 0) {
            this.ao.add(2, -11);
        } else {
            this.ao.add(2, i2 - i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, int i2, int i3) {
        this.ar.set(i, i2, i3);
        t();
    }

    private void a(int i, HwAdvancedNumberPicker hwAdvancedNumberPicker) {
        if (this.f29387b == 1) {
            if (i == 0) {
                hwAdvancedNumberPicker.setSelectionRectDivider(this.ah);
                return;
            }
            if (i == 1) {
                hwAdvancedNumberPicker.setSelectionRectDivider(this.af);
            } else if (i == 2) {
                hwAdvancedNumberPicker.setSelectionRectDivider(this.ag);
            } else {
                Log.i("HwDatePicker", "Invalid index.");
            }
        }
    }

    private void q() {
        String[] strArrA;
        Map<String, List<String>> mapN = this.h.n();
        Map<Integer, String> mapB = this.h.b();
        Map<String, Integer> mapG = this.h.g();
        if (mapN != null && mapB != null && mapG != null) {
            if (this.bb) {
                strArrA = xfa.a(mapN.get(this.f29386a + this.f));
            } else {
                strArrA = xfa.e;
            }
            this.o = strArrA;
            return;
        }
        Log.e("HwDatePicker", "yearMonthToDays || indexYearMonth || yearMonthIndex is null");
    }

    private GregorianCalendar d(int i) {
        String str;
        String[] strArr = this.k;
        if (strArr.length == 0) {
            return null;
        }
        int i2 = i - 1;
        String str2 = strArr[i2 % strArr.length];
        GregorianCalendar gregorianCalendarE = this.h.e(this.f29386a, str2, this.j, 1, true);
        if (this.bb && gregorianCalendarE == null && this.j.equals("三十")) {
            this.j = "廿九";
            gregorianCalendarE = this.h.e(this.f29386a, str2, "廿九", 1, true);
        }
        if (this.bb) {
            str = this.f;
        } else {
            String[] strArr2 = this.k;
            str = strArr2[i2 % strArr2.length];
        }
        this.f = str;
        return gregorianCalendarE;
    }

    private void r() {
        this.g = this.h.h();
        this.i = this.h.e();
        this.l = this.bb ? xfa.a(this.h.f().get(this.f29386a)) : xfa.d;
    }

    private GregorianCalendar e(GregorianCalendar gregorianCalendar, Locale locale) {
        if (gregorianCalendar == null) {
            return new GregorianCalendar(locale);
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar(locale);
        gregorianCalendar2.setTimeInMillis(timeInMillis);
        return gregorianCalendar2;
    }

    private GregorianCalendar a(int i) {
        GregorianCalendar gregorianCalendarE = this.h.e(this.f29386a, this.k[i], this.j, 1, true);
        if (!this.bb || gregorianCalendarE != null || !this.j.equals("三十")) {
            return gregorianCalendarE;
        }
        this.j = "廿九";
        return this.h.e(this.f29386a, this.k[i], "廿九", 1, true);
    }

    private void j(int i) {
        int i2;
        String str = this.s;
        if (str == null || !str.equals(this.f29386a)) {
            this.h.e(i);
        }
        r();
        this.k = this.l;
        q();
        this.p = this.o;
        int i3 = this.au;
        String[] strArr = new String[i3 - 1899];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i2 = i3 - 1900;
            if (i5 >= i2) {
                break;
            }
            strArr[i5] = this.i[i5 + 2];
            i5++;
        }
        strArr[i2] = "-- --";
        this.d.setDisplayedValues(null);
        this.d.setMinValue(1900);
        this.d.setMaxValue(this.au);
        this.d.setValue(i);
        this.d.setDisplayedValues(strArr);
        this.d.setWrapSelectorWheel(false);
        String str2 = this.f;
        int i6 = 0;
        while (true) {
            String[] strArr2 = this.l;
            if (i6 >= strArr2.length || str2.equals(strArr2[i6])) {
                break;
            } else {
                i6++;
            }
        }
        this.e.setDisplayedValues(null);
        this.e.setMinValue(1);
        this.e.setMaxValue(this.l.length);
        this.e.setValue(i6 + 1);
        this.e.setDisplayedValues(this.l);
        this.e.setWrapSelectorWheel(true);
        String str3 = this.j;
        while (true) {
            String[] strArr3 = this.o;
            if (i4 >= strArr3.length || str3.equals(strArr3[i4])) {
                break;
            } else {
                i4++;
            }
        }
        this.f29388c.setDisplayedValues(null);
        this.f29388c.setMinValue(1);
        this.f29388c.setMaxValue(this.o.length);
        this.f29388c.setValue(i4 + 1);
        this.f29388c.setDisplayedValues(this.o);
        this.f29388c.setWrapSelectorWheel(true);
    }

    private int d(int i, boolean z, boolean z2) {
        if (z) {
            String[] strArrC = c(i, this.g, this.i);
            this.g = strArrC;
            int iA = xfa.a(this.f29386a, strArrC);
            this.d.setDisplayedValues(null);
            this.d.setMinValue(0);
            this.d.setMaxValue(this.g.length - 1);
            this.d.setWrapSelectorWheel(false);
            return iA;
        }
        if (z2) {
            String[] strArrB = b(i, this.g, this.i);
            this.g = strArrB;
            int iA2 = xfa.a(this.f29386a, strArrB);
            this.d.setDisplayedValues(null);
            this.d.setMinValue(0);
            this.d.setMaxValue(this.g.length - 1);
            this.d.setWrapSelectorWheel(false);
            return iA2;
        }
        this.d.setDisplayedValues(null);
        this.d.setMinValue(0);
        this.d.setMaxValue(this.g.length - 1);
        this.d.setWrapSelectorWheel(false);
        return i;
    }

    private boolean e(int i, int i2, int i3) {
        boolean z = this.ar.get(1) != i;
        boolean z2 = this.ar.get(2) != i3;
        boolean z3 = this.ar.get(5) != i2;
        Boolean.valueOf(z).getClass();
        if (!z) {
            Boolean.valueOf(z2).getClass();
            if (!z2) {
                Boolean.valueOf(z3).getClass();
                if (!z3) {
                    return false;
                }
            }
        }
        return true;
    }

    private GregorianCalendar h(int i) {
        if (i < 0) {
            return null;
        }
        String[] strArr = this.g;
        if (i >= strArr.length) {
            return null;
        }
        GregorianCalendar gregorianCalendarE = this.h.e(strArr[i], this.f, this.j, 0, true);
        if (gregorianCalendarE == null && this.j.equals("三十")) {
            this.j = "廿九";
            gregorianCalendarE = this.h.e(this.g[i], this.f, "廿九", 1, true);
        }
        if (gregorianCalendarE != null || !this.f.contains("闰")) {
            return gregorianCalendarE;
        }
        return this.h.e(this.g[i], this.f.replace("闰", ""), this.j, 1, true);
    }

    private void t() {
        if (this.ar.before(this.ap)) {
            this.ar.setTimeInMillis(this.ap.getTimeInMillis());
        } else if (this.ar.after(this.as)) {
            this.ar.setTimeInMillis(this.as.getTimeInMillis());
        } else {
            Log.w("HwDatePicker", "normal date");
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x007b  */
    /* JADX WARN: Instruction removed from duplicated block: B:11:0x007b, please report this as an issue */
    private void s() {
        Map<String, Integer> mapG = this.h.g();
        Map<String, List<String>> mapN = this.h.n();
        Map<Integer, String> mapB = this.h.b();
        if (mapN != null && mapB != null && mapG != null) {
            int iIntValue = mapG.get(this.f29386a + "_" + this.f).intValue();
            String strB = xfa.b(mapB.get(Integer.valueOf(iIntValue + (-1))));
            String strB2 = xfa.b(mapB.get(Integer.valueOf(iIntValue + 1)));
            String str = this.t;
            if (str != null) {
                if (!str.equals(this.f29386a + this.f)) {
                    this.o = xfa.a(mapN.get(this.f29386a + this.f));
                    this.r = xfa.a(mapN.get(strB));
                    this.q = xfa.a(mapN.get(strB2));
                }
            } else {
                this.o = xfa.a(mapN.get(this.f29386a + this.f));
                this.r = xfa.a(mapN.get(strB));
                this.q = xfa.a(mapN.get(strB2));
            }
            if (this.o.length == 0 || this.r.length == 0 || this.q.length == 0) {
                Log.w("HwDatePicker", "mCurrentMonthDays maybe not found ");
                this.bc = true;
                HwCheckBox hwCheckBox = this.ak;
                if (hwCheckBox != null) {
                    hwCheckBox.setChecked(false);
                    return;
                }
                return;
            }
            return;
        }
        Log.e("HwDatePicker", "yearMonthToDays or indexYearMonth or yearMonthIndex is null.");
    }

    private void e(HwAdvancedNumberPicker hwAdvancedNumberPicker, int i, String[] strArr, boolean z) {
        hwAdvancedNumberPicker.setDisplayedValues(strArr);
        hwAdvancedNumberPicker.setValue(i);
        hwAdvancedNumberPicker.setEnabled(z);
    }

    private void b(int i) {
        this.g = this.h.h();
        this.i = this.h.e();
        SparseArray<String> sparseArrayJ = this.h.j();
        String str = sparseArrayJ.get(i - 1);
        String str2 = sparseArrayJ.get(i + 1);
        Map<String, List<String>> mapF = this.h.f();
        String str3 = this.s;
        if (str3 == null || !str3.equals(this.f29386a)) {
            this.l = xfa.a(mapF.get(this.f29386a));
            this.n = xfa.a(mapF.get(str));
            this.m = xfa.a(mapF.get(str2));
        }
        if (this.l.length == 0 || this.n.length == 0 || this.m.length == 0) {
            Log.w("HwDatePicker", "mCurrentYearMonths maybe not found ");
            this.bc = true;
            HwCheckBox hwCheckBox = this.ak;
            if (hwCheckBox != null) {
                hwCheckBox.setChecked(false);
            }
        }
    }

    private GregorianCalendar e(int i) {
        String str;
        String[] strArr = this.p;
        if (strArr.length == 0) {
            return null;
        }
        int i2 = i - 1;
        GregorianCalendar gregorianCalendarD = this.h.d(this.f29386a, this.f, strArr[i2 % strArr.length], true);
        if (this.bb) {
            str = this.j;
        } else {
            String[] strArr2 = this.p;
            str = strArr2[i2 % strArr2.length];
        }
        this.j = str;
        return gregorianCalendarD;
    }

    private int c(int i, boolean z, boolean z2) {
        if (z) {
            String[] strArrB = xfa.b(i, this.k);
            this.k = strArrB;
            int iA = xfa.a(this.f, strArrB);
            this.e.setDisplayedValues(null);
            this.e.setMinValue(0);
            this.e.setMaxValue(this.k.length - 1);
            this.e.setWrapSelectorWheel(false);
            return iA;
        }
        if (z2) {
            String[] strArrC = xfa.c(i, this.k);
            this.k = strArrC;
            int iA2 = xfa.a(this.f, strArrC);
            this.e.setDisplayedValues(null);
            this.e.setMinValue(0);
            this.e.setMaxValue(this.k.length - 1);
            this.e.setWrapSelectorWheel(false);
            return iA2;
        }
        this.e.setDisplayedValues(null);
        this.e.setMinValue(0);
        this.e.setMaxValue(this.k.length - 1);
        this.e.setWrapSelectorWheel(true);
        return i;
    }

    private String[] e(String str, String str2, String str3, String str4) {
        String country = Locale.getDefault().getCountry();
        String[] strArr = (String[]) this.p.clone();
        String[] strArr2 = (String[]) this.k.clone();
        a(strArr, strArr2);
        boolean z = "hk".equals(country) || "HK".equals(country);
        boolean z2 = "tw".equals(country) || "TW".equals(country);
        boolean z3 = TextUtils.equals("MO", country) || TextUtils.equals("mo", country);
        if (z || z2 || z3) {
            String[] strArr3 = (String[]) strArr2.clone();
            int length = strArr2.length;
            for (int i = 0; i < length; i++) {
                if (strArr3[i].equals(str2)) {
                    strArr3[i] = str;
                } else if (strArr3[i].length() == 3 && str4.equals(strArr3[i].substring(0, 1))) {
                    strArr3[i] = strArr3[i].replace(str4, str3);
                }
            }
            this.e.setDisplayedValues(strArr3);
        } else {
            this.e.setDisplayedValues(strArr2);
        }
        return (String[]) strArr.clone();
    }

    private boolean c(GregorianCalendar gregorianCalendar) {
        if (!this.ar.before(gregorianCalendar)) {
            return false;
        }
        this.ar.set(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
        return true;
    }

    private GregorianCalendar b(int i, int i2) {
        int length = this.k.length - 1;
        String str = "";
        if (b(i, i2, length)) {
            String str2 = this.h.j().get(this.h.i().get(this.f29386a).intValue() + 1);
            if (i2 >= 0) {
                String[] strArr = this.k;
                if (i2 < strArr.length) {
                    str = strArr[i2];
                }
            }
            GregorianCalendar gregorianCalendarE = this.h.e(str2, str, this.j, 1, true);
            if (!this.bb || gregorianCalendarE != null || !this.j.equals("三十")) {
                return gregorianCalendarE;
            }
            this.j = "廿九";
            return this.h.e(str2, str, "廿九", 1, true);
        }
        if (i == 0 && i2 == length) {
            String str3 = this.h.j().get(this.h.i().get(this.f29386a).intValue() - 1);
            if (i2 >= 0) {
                String[] strArr2 = this.k;
                if (i2 < strArr2.length) {
                    str = strArr2[i2];
                }
            }
            GregorianCalendar gregorianCalendarE2 = this.h.e(str3, str, this.j, 1, true);
            if (!this.bb || gregorianCalendarE2 != null || !this.j.equals("三十")) {
                return gregorianCalendarE2;
            }
            this.j = "廿九";
            return this.h.e(str3, str, "廿九", 1, true);
        }
        if (i2 >= 0) {
            String[] strArr3 = this.k;
            if (i2 < strArr3.length) {
                str = strArr3[i2];
            }
        }
        GregorianCalendar gregorianCalendarE3 = this.h.e(this.f29386a, str, this.j, 1, true);
        if (!this.bb || gregorianCalendarE3 != null || !this.j.equals("三十")) {
            return gregorianCalendarE3;
        }
        this.j = "廿九";
        return this.h.e(this.f29386a, str, "廿九", 1, true);
    }

    private int a(int i, boolean z, boolean z2) {
        if (z) {
            String[] strArrB = xfa.b(i, this.p);
            this.p = strArrB;
            int iA = xfa.a(this.j, strArrB);
            this.f29388c.setDisplayedValues(null);
            this.f29388c.setMinValue(0);
            this.f29388c.setMaxValue(this.p.length - 1);
            this.f29388c.setWrapSelectorWheel(false);
            return iA;
        }
        if (z2) {
            String[] strArrC = xfa.c(i, this.p);
            this.p = strArrC;
            int iA2 = xfa.a(this.j, strArrC);
            this.f29388c.setDisplayedValues(null);
            this.f29388c.setMinValue(0);
            this.f29388c.setMaxValue(this.p.length - 1);
            this.f29388c.setWrapSelectorWheel(false);
            return iA2;
        }
        this.f29388c.setDisplayedValues(null);
        this.f29388c.setMinValue(0);
        this.f29388c.setMaxValue(this.p.length - 1);
        this.f29388c.setWrapSelectorWheel(true);
        return i;
    }

    private boolean d(GregorianCalendar gregorianCalendar) {
        if (!this.ar.after(gregorianCalendar)) {
            return false;
        }
        this.ar.set(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5) + 1);
        return true;
    }

    private void e(int i, String[] strArr) {
        if (this.bd.f() == 1900 && i == 2) {
            strArr[0] = "";
            strArr[1] = "";
        } else if (this.bd.f() == 1901 && i == 3) {
            strArr[1] = "";
        } else {
            Log.w("HwDatePicker", "no need to hide year.");
        }
    }

    private void a(String[] strArr, String[] strArr2) {
        if (this.bd.f() == 1900) {
            if (this.bd.e() == 1 && this.bd.c() == 2 && strArr.length > 28) {
                strArr[28] = "";
            }
            if ((this.bd.e() == 1 || this.bd.e() == 2) && strArr2.length > 12) {
                strArr2[11] = "";
                strArr2[12] = "";
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000a  */
    private GregorianCalendar c(int i) {
        String str;
        if (i >= 0) {
            String[] strArr = this.p;
            if (i < strArr.length) {
                str = strArr[i];
            } else {
                str = "";
            }
        } else {
            str = "";
        }
        GregorianCalendar gregorianCalendarD = this.h.d(this.f29386a, this.f, str, false);
        if (!this.bb || gregorianCalendarD != null || !this.j.equals("初一")) {
            return gregorianCalendarD;
        }
        this.j = "三十";
        GregorianCalendar gregorianCalendarD2 = this.h.d(this.f29386a, this.f, "三十", false);
        if (gregorianCalendarD2 != null) {
            return gregorianCalendarD2;
        }
        this.j = "廿九";
        return this.h.d(this.f29386a, this.f, "廿九", true);
    }

    private void a(HwAdvancedNumberPicker hwAdvancedNumberPicker, int i, int i2) {
        GregorianCalendar gregorianCalendarC;
        GregorianCalendar gregorianCalendar;
        GregorianCalendar gregorianCalendar2 = this.ao;
        if (gregorianCalendar2 != null && (gregorianCalendar = this.ar) != null) {
            gregorianCalendar2.setTimeInMillis(gregorianCalendar.getTimeInMillis());
        }
        if (hwAdvancedNumberPicker == this.d && this.g != null) {
            gregorianCalendarC = h(i2);
        } else if (hwAdvancedNumberPicker == this.e && this.k != null) {
            if (!this.ab) {
                gregorianCalendarC = a(i2);
            } else {
                gregorianCalendarC = b(i, i2);
            }
        } else if (hwAdvancedNumberPicker == this.f29388c && this.p != null) {
            if (!this.ab) {
                gregorianCalendarC = c(i2);
            } else {
                gregorianCalendarC = c(i, i2);
            }
        } else {
            Log.w("HwDatePicker", "error spinner value change");
            gregorianCalendarC = null;
        }
        GregorianCalendar gregorianCalendar3 = this.ao;
        if (gregorianCalendar3 != null && gregorianCalendarC != null) {
            gregorianCalendar3.setTimeInMillis(gregorianCalendarC.getTimeInMillis());
        } else {
            Log.w("HwDatePicker", "error date");
        }
    }

    private String[] c(int i, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList(10);
        ArrayList arrayList2 = new ArrayList(10);
        xfa.e(i, strArr, strArr2, arrayList, arrayList2);
        String[] strArr3 = new String[arrayList.size()];
        String[] strArr4 = new String[arrayList.size()];
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            strArr3[i2] = (String) arrayList.get(i2);
            strArr4[i2] = (String) arrayList2.get(i2);
        }
        this.i = strArr4;
        return strArr3;
    }

    private void d(HwAdvancedNumberPicker hwAdvancedNumberPicker, int i) {
        GregorianCalendar gregorianCalendarE;
        GregorianCalendar gregorianCalendar;
        GregorianCalendar gregorianCalendar2 = this.ao;
        if (gregorianCalendar2 != null && (gregorianCalendar = this.ar) != null) {
            gregorianCalendar2.setTimeInMillis(gregorianCalendar.getTimeInMillis());
        }
        if (hwAdvancedNumberPicker == this.d && this.g != null) {
            gregorianCalendarE = g(i);
        } else if (hwAdvancedNumberPicker == this.e && this.k != null) {
            gregorianCalendarE = d(i);
        } else if (hwAdvancedNumberPicker == this.f29388c && this.p != null) {
            gregorianCalendarE = e(i);
        } else {
            Log.w("HwDatePicker", "error spinner value change");
            gregorianCalendarE = null;
        }
        GregorianCalendar gregorianCalendar3 = this.ao;
        if (gregorianCalendar3 == null || gregorianCalendarE == null) {
            return;
        }
        gregorianCalendar3.setTimeInMillis(gregorianCalendarE.getTimeInMillis());
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00cc  */
    private GregorianCalendar c(int i, int i2) {
        String str;
        int length = this.p.length - 1;
        if (b(i, i2, length)) {
            int iIntValue = this.h.g().get(this.f29386a + "_" + this.f).intValue();
            if (this.ba) {
                iIntValue++;
            }
            String[] strArrSplit = this.h.b().get(Integer.valueOf(iIntValue)).split("_");
            if (strArrSplit.length <= 1) {
                return null;
            }
            String[] strArr = this.p;
            if (strArr.length > i2) {
                return this.h.d(strArrSplit[0], strArrSplit[1], strArr[i2], true);
            }
            return null;
        }
        if (!j(i, i2, length)) {
            if (i2 >= 0) {
                String[] strArr2 = this.p;
                if (i2 < strArr2.length) {
                    str = strArr2[i2];
                } else {
                    str = "";
                }
            } else {
                str = "";
            }
            return this.h.d(this.f29386a, this.f, str, true);
        }
        int iIntValue2 = this.h.g().get(this.f29386a + "_" + this.f).intValue();
        if (this.ba) {
            iIntValue2--;
        }
        String[] strArrSplit2 = this.h.b().get(Integer.valueOf(iIntValue2)).split("_");
        if (strArrSplit2.length <= 1) {
            return null;
        }
        String[] strArr3 = this.p;
        if (strArr3.length <= i2 || i2 < 0) {
            return null;
        }
        return this.h.d(strArrSplit2[0], strArrSplit2[1], strArr3[i2], true);
    }

    private String[] b(int i, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList(10);
        ArrayList arrayList2 = new ArrayList(10);
        xfa.d(i, strArr, strArr2, arrayList, arrayList2);
        String[] strArr3 = new String[arrayList.size()];
        String[] strArr4 = new String[arrayList.size()];
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            strArr3[i2] = (String) arrayList.get(i2);
            strArr4[i2] = (String) arrayList2.get(i2);
        }
        this.i = strArr4;
        return strArr3;
    }
}
