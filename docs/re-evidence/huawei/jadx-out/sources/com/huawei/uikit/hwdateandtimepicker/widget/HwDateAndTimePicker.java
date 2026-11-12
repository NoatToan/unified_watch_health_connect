package com.huawei.uikit.hwdateandtimepicker.widget;

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
import android.view.ContextThemeWrapper;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver;
import com.huawei.uikit.hwadvancednumberpicker.widget.HwAdvancedNumberPicker;
import com.huawei.uikit.hwadvancednumberpicker.widget.HwPickerScrollListener;
import com.huawei.uikit.hwcheckbox.widget.HwCheckBox;
import com.huawei.uikit.hwdateandtimepicker.R;
import com.huawei.uikit.hwlunar.utils.HwLunarCalendar;
import defpackage.xdf;
import defpackage.xdj;
import defpackage.xew;
import defpackage.xfs;
import defpackage.xft;
import defpackage.xfu;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes44.dex */
public class HwDateAndTimePicker extends FrameLayout {
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private HwCheckBox ae;
    private int af;
    private int ag;
    private OnDateChangedListener ah;
    private Locale ai;
    private int aj;
    private GregorianCalendar ak;
    private int al;
    private int am;
    private GregorianCalendar an;
    private String ao;
    private GregorianCalendar ap;
    private int aq;
    private GregorianCalendar ar;
    private boolean as;
    private boolean at;
    private float au;
    private GregorianCalendar av;
    private float aw;
    private LinearLayout ax;
    private Drawable ay;
    private Drawable az;
    private HwAdvancedNumberPicker ba;
    private HwAdvancedNumberPicker bb;
    private HwAdvancedNumberPicker bc;
    private Drawable bd;
    private int be;
    private HwAdvancedNumberPicker bf;
    private int bg;
    private int bh;
    private boolean bi;
    private Drawable bj;
    private boolean bk;
    private HwLunarCalendar bl;
    private boolean bm;
    private final Context bn;
    private String[] bo;
    private String bp;
    private final String[] bq;
    protected int e;
    private GestureDetector f;
    private final List<HwAdvancedNumberPicker> g;
    private GregorianCalendar h;
    private String[] i;
    private boolean j;
    private HwAdvancedNumberPicker.OnColorChangeListener k;
    private CompoundButton.OnCheckedChangeListener l;
    private boolean m;
    private HwAdvancedNumberPicker.OnValueChangeListener n;
    private String[] o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private LinearLayout z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f29365a = {"12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f29367c = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", HealthZonePushReceiver.DEAUTH_EVENT_NOTIFY, "21", "22", "23"};
    private static final String[] d = {"00", "05", "10", "15", HealthZonePushReceiver.DEAUTH_EVENT_NOTIFY, "25", HealthZonePushReceiver.SLEEP_SCORE_NOTIFY, HealthZonePushReceiver.BODY_TEMPERATURE_LOW_NOTIFY, HealthZonePushReceiver.FAMILY_CARE_NOTIFY, "45", "50", "55"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f29366b = {"00", HiAnalyticsConstant.KeyAndValue.NUMBER_01, com.huawei.hms.ads.dynamic.a.t, "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", HealthZonePushReceiver.DEAUTH_EVENT_NOTIFY, "21", "22", "23", "24", "25", "26", HealthZonePushReceiver.BLOOD_SUGAR_DAWN_NOTIFY, "28", HealthZonePushReceiver.SLEEP_TIME_NOTIFY, HealthZonePushReceiver.SLEEP_SCORE_NOTIFY, "31", HealthZonePushReceiver.PRESSURE_NOTIFY, HealthZonePushReceiver.CYCLE_BLOOD_OXYGEN_NOTIFY, HealthZonePushReceiver.BODY_TEMPERATURE_HIGH_NOTIFY, HealthZonePushReceiver.BODY_TEMPERATURE_LOW_NOTIFY, HealthZonePushReceiver.DATA_POST_COMMENTS_NOTIFY, HealthZonePushReceiver.PROACTIVE_SHARING_NOTIFY, HealthZonePushReceiver.COMMENT_FAILED_NOTIFY, "39", HealthZonePushReceiver.FAMILY_CARE_NOTIFY, HealthZonePushReceiver.SOS_LOCATION_NOTIFY, "42", HealthZonePushReceiver.ECG_MEASUREMENT_ABNORMAL, "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"};

    public interface OnDateChangedListener {
        void onDateChanged(HwDateAndTimePicker hwDateAndTimePicker, GregorianCalendar gregorianCalendar, String str);
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HwDateAndTimePicker.this.ae.setChecked(!HwDateAndTimePicker.this.ae.isChecked());
        }
    }

    class b implements CompoundButton.OnCheckedChangeListener {
        b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            HwDateAndTimePicker.this.bk = !z;
            HwDateAndTimePicker.this.r();
            HwDateAndTimePicker.this.i();
        }
    }

    static class brnby extends View.BaseSavedState {
        public static final Parcelable.Creator<brnby> CREATOR = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f29369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f29370b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f29371c;
        private int d;
        private int e;

        class b implements Parcelable.Creator<brnby> {
            b() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public brnby createFromParcel(Parcel parcel) {
                return new brnby(parcel, (h) null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public brnby[] newArray(int i) {
                return new brnby[i];
            }
        }

        /* synthetic */ brnby(Parcel parcel, h hVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            if (parcel != null) {
                parcel.writeInt(this.f29369a);
                parcel.writeInt(this.f29370b);
                parcel.writeInt(this.f29371c);
                parcel.writeInt(this.d);
                parcel.writeInt(this.e);
            }
        }

        /* synthetic */ brnby(Parcelable parcelable, GregorianCalendar gregorianCalendar, h hVar) {
            this(parcelable, gregorianCalendar);
        }

        private brnby(Parcelable parcelable, GregorianCalendar gregorianCalendar) {
            super(parcelable);
            if (gregorianCalendar != null) {
                this.f29369a = gregorianCalendar.get(1);
                this.f29370b = gregorianCalendar.get(2);
                this.f29371c = gregorianCalendar.get(5);
                this.d = gregorianCalendar.get(11);
                this.e = gregorianCalendar.get(12);
            }
        }

        private brnby(Parcel parcel) {
            super(parcel);
            this.f29369a = parcel.readInt();
            this.f29370b = parcel.readInt();
            this.f29371c = parcel.readInt();
            this.d = parcel.readInt();
            this.e = parcel.readInt();
        }
    }

    class c implements HwAdvancedNumberPicker.OnColorChangeListener {
        c() {
        }

        @Override // com.huawei.uikit.hwadvancednumberpicker.widget.HwAdvancedNumberPicker.OnColorChangeListener
        public void onColorChange(HwAdvancedNumberPicker hwAdvancedNumberPicker) {
        }
    }

    class d extends HwPickerScrollListener {
        d() {
        }

        @Override // com.huawei.uikit.hwadvancednumberpicker.widget.HwPickerScrollListener
        public void onItemScrollCenter(int i) {
            super.onItemScrollCenter(i);
            if (i == 2) {
                HwDateAndTimePicker hwDateAndTimePicker = HwDateAndTimePicker.this;
                int iE = hwDateAndTimePicker.e(hwDateAndTimePicker.p - 1, HwDateAndTimePicker.this.bo.length);
                HwDateAndTimePicker hwDateAndTimePicker2 = HwDateAndTimePicker.this;
                if (hwDateAndTimePicker2.a(iE, hwDateAndTimePicker2.bo)) {
                    HwDateAndTimePicker.this.bb.h();
                }
            }
        }
    }

    class e extends HwPickerScrollListener {
        e() {
        }

        @Override // com.huawei.uikit.hwadvancednumberpicker.widget.HwPickerScrollListener
        public void onItemScrollCenter(int i) {
            int iE;
            super.onItemScrollCenter(i);
            if (i == 2) {
                if (HwDateAndTimePicker.this.j) {
                    HwDateAndTimePicker hwDateAndTimePicker = HwDateAndTimePicker.this;
                    iE = hwDateAndTimePicker.e((hwDateAndTimePicker.r / 5) - 1, HwDateAndTimePicker.this.i.length);
                } else {
                    HwDateAndTimePicker hwDateAndTimePicker2 = HwDateAndTimePicker.this;
                    iE = hwDateAndTimePicker2.e(hwDateAndTimePicker2.r - 1, HwDateAndTimePicker.this.i.length);
                }
                HwDateAndTimePicker hwDateAndTimePicker3 = HwDateAndTimePicker.this;
                if (hwDateAndTimePicker3.a(iE, hwDateAndTimePicker3.i)) {
                    HwDateAndTimePicker.this.bc.h();
                }
            }
        }
    }

    class g extends GestureDetector.SimpleOnGestureListener {
        private g() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (motionEvent == null || !HwDateAndTimePicker.this.isEnabled()) {
                return false;
            }
            int[] iArr = new int[2];
            HwDateAndTimePicker.this.bc.getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            float rawX = motionEvent.getRawX();
            if (rawX > i && i + HwDateAndTimePicker.this.bc.getWidth() > rawX && motionEvent.getRawY() < HwDateAndTimePicker.this.bc.getHeight() + i2) {
                float rawY = motionEvent.getRawY();
                if (rawY > ((HwDateAndTimePicker.this.bc.getHeight() / 2) + i2) - HwDateAndTimePicker.this.au && rawY < i2 + (HwDateAndTimePicker.this.bc.getHeight() / 2) + HwDateAndTimePicker.this.au) {
                    HwDateAndTimePicker hwDateAndTimePicker = HwDateAndTimePicker.this;
                    hwDateAndTimePicker.j = !hwDateAndTimePicker.j;
                    HwDateAndTimePicker.this.t();
                    HwDateAndTimePicker.this.r();
                }
            }
            return super.onDoubleTapEvent(motionEvent);
        }

        /* synthetic */ g(HwDateAndTimePicker hwDateAndTimePicker, h hVar) {
            this();
        }
    }

    class h implements HwAdvancedNumberPicker.OnValueChangeListener {
        h() {
        }

        @Override // com.huawei.uikit.hwadvancednumberpicker.widget.HwAdvancedNumberPicker.OnValueChangeListener
        public void onValueChange(HwAdvancedNumberPicker hwAdvancedNumberPicker, int i, int i2) {
            HwDateAndTimePicker.this.ak.setTimeInMillis(HwDateAndTimePicker.this.ap.getTimeInMillis());
            HwDateAndTimePicker.this.b(hwAdvancedNumberPicker, i, i2);
            HwDateAndTimePicker hwDateAndTimePicker = HwDateAndTimePicker.this;
            hwDateAndTimePicker.c(hwDateAndTimePicker.ak.get(1), HwDateAndTimePicker.this.ak.get(2), HwDateAndTimePicker.this.ak.get(5), HwDateAndTimePicker.this.ak.get(11), HwDateAndTimePicker.this.ak.get(12));
            HwDateAndTimePicker.this.r();
            HwDateAndTimePicker.this.i();
        }
    }

    public HwDateAndTimePicker(Context context) {
        this(context, null);
    }

    private int a(int i) {
        if (i > 31) {
            return 31;
        }
        if (i < 1) {
            return 1;
        }
        return i;
    }

    private void ae() {
        this.bc.setOnScrollListener(new e());
    }

    private void ah() {
        this.z = (LinearLayout) findViewById(R.id.hwdateandtimepicker_lunar_or_western);
        HwCheckBox hwCheckBox = (HwCheckBox) findViewById(R.id.hwdateandtimepicker_switch);
        this.ae = hwCheckBox;
        hwCheckBox.setChecked(false);
        ((LinearLayout) findViewById(R.id.hwdateandtimepicker_switch_layout)).setOnClickListener(new a());
        this.ae.setOnCheckedChangeListener(this.l);
        if (this.as && xdf.a(this.bn)) {
            return;
        }
        this.z.setVisibility(8);
    }

    private void aj() {
        this.l = new b();
    }

    private void ak() {
        this.ax = (LinearLayout) findViewById(R.id.hwdateandtimepicker_pickers);
        HwAdvancedNumberPicker hwAdvancedNumberPicker = (HwAdvancedNumberPicker) findViewById(R.id.hwdateandtimepicker_date);
        this.bf = hwAdvancedNumberPicker;
        hwAdvancedNumberPicker.setOnLongPressUpdateInterval(100L);
        this.bf.setOnValueChangedListener(this.n);
        HwAdvancedNumberPicker hwAdvancedNumberPicker2 = (HwAdvancedNumberPicker) findViewById(R.id.hwdateandtimepicker_ampm);
        this.ba = hwAdvancedNumberPicker2;
        hwAdvancedNumberPicker2.setOnValueChangedListener(this.n);
        this.ba.setOnLongPressUpdateInterval(100L);
        this.ba.setDisplayedValues(this.bq);
        this.ba.setOnValueChangedListener(this.n);
        if (this.bi) {
            this.ba.setVisibility(8);
        }
        HwAdvancedNumberPicker hwAdvancedNumberPicker3 = (HwAdvancedNumberPicker) findViewById(R.id.hwdateandtimepicker_hour);
        this.bb = hwAdvancedNumberPicker3;
        hwAdvancedNumberPicker3.setOnLongPressUpdateInterval(100L);
        this.bb.setOnValueChangedListener(this.n);
        this.bb.setFormatter(xdj.f52732b);
        ag();
        HwAdvancedNumberPicker hwAdvancedNumberPicker4 = (HwAdvancedNumberPicker) findViewById(R.id.hwdateandtimepicker_minute);
        this.bc = hwAdvancedNumberPicker4;
        hwAdvancedNumberPicker4.setOnLongPressUpdateInterval(100L);
        this.bc.setOnValueChangedListener(this.n);
        this.bc.setFormatter(xdj.f52732b);
        this.bc.setMinValue(0);
        ae();
        af();
        this.bf.setFlingAnnounceType(2);
        this.ba.setFlingAnnounceType(4);
        this.bb.setFlingAnnounceType(3);
        this.bc.setFlingAnnounceType(3);
        this.bf.setIsSupportRichTap(false);
        this.ba.setIsSupportRichTap(false);
        this.bb.setIsSupportRichTap(false);
        this.bc.setIsSupportRichTap(false);
        setSpinnersShown(true);
    }

    private void al() {
        this.n = new h();
    }

    private void am() {
        this.k = new c();
    }

    private boolean an() {
        if (this.j) {
            return this.bc.getValue() == this.am;
        }
        return this.bc.getValue() == this.aq;
    }

    private boolean ao() {
        return (this.bf == null || this.bc == null || this.bb == null || this.ba == null) ? false : true;
    }

    private boolean ap() {
        return xft.c(this.bn) != 1 || Float.compare(this.aw, 1.75f) < 0;
    }

    private boolean ar() {
        if (this.j) {
            return this.bc.getValue() == this.aj;
        }
        return this.bc.getValue() == this.al;
    }

    private int b(int i) {
        if (i > 59) {
            return 59;
        }
        if (i < 0) {
            return 0;
        }
        return i;
    }

    private int c(int i) {
        if (i > 5000) {
            return 5000;
        }
        if (i < 1) {
            return 1;
        }
        return i;
    }

    private int d(int i) {
        if (i > 23) {
            return 23;
        }
        if (i < 0) {
            return 0;
        }
        return i;
    }

    private int e(int i) {
        if (i > 11) {
            return 11;
        }
        if (i < 0) {
            return 0;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        u();
        sendAccessibilityEvent(4);
        String dateTime = DateUtils.formatDateTime(this.bn, this.ap.getTimeInMillis(), !xdf.a(this.bn) ? 98326 : 65558);
        m();
        OnDateChangedListener onDateChangedListener = this.ah;
        if (onDateChangedListener != null) {
            onDateChangedListener.onDateChanged(this, this.ap, dateTime);
        }
    }

    private void k() {
        this.ax.removeAllViews();
        this.ax.addView(this.bf);
        if (xdf.a(this.bn) || Locale.getDefault().getLanguage().contains("bo")) {
            this.ax.addView(this.ba);
            this.ax.addView(this.bb);
            this.ax.addView(this.bc);
            if (this.e == 1) {
                this.bf.setSelectionRectDivider(this.ay);
                this.ba.setSelectionRectDivider(this.az);
                this.bb.setSelectionRectDivider(this.az);
                this.bc.setSelectionRectDivider(this.bd);
                return;
            }
            return;
        }
        this.ax.addView(this.bb);
        this.ax.addView(this.bc);
        this.ax.addView(this.ba);
        if (this.e == 1) {
            if (this.bi) {
                this.bf.setSelectionRectDivider(this.ay);
                this.bb.setSelectionRectDivider(this.az);
                this.bc.setSelectionRectDivider(this.bd);
            } else {
                this.bf.setSelectionRectDivider(this.ay);
                this.bb.setSelectionRectDivider(this.az);
                this.bc.setSelectionRectDivider(this.az);
                this.ba.setSelectionRectDivider(this.bd);
            }
        }
    }

    private void l() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(this.ap.getTimeInMillis());
        gregorianCalendar.add(6, -4);
        this.h.setTimeInMillis(xew.d());
        for (int i = 0; i < 7; i++) {
            gregorianCalendar.add(6, 1);
            int i2 = !xdf.a(this.bn) ? 98328 : 65560;
            if (this.h.get(1) == gregorianCalendar.get(1) && this.h.get(2) == gregorianCalendar.get(2) && this.h.get(5) == gregorianCalendar.get(5)) {
                this.o[i] = this.bp;
            } else if (this.bk) {
                this.o[i] = DateUtils.formatDateTime(this.bn, gregorianCalendar.getTimeInMillis(), i2);
            } else {
                this.bl.e(gregorianCalendar.get(1), gregorianCalendar.get(2) + 1, gregorianCalendar.get(5));
                String strB = this.bl.b();
                String strA = this.bl.a();
                this.o[i] = strA + strB;
            }
            this.ao = this.o[3];
        }
    }

    private void m() {
        String str = ",   " + this.ao + ", " + DateUtils.formatDateTime(this.bn, this.ap.getTimeInMillis(), this.bi ? 129 : 65);
        this.bf.setAnnouncedSuffix(str);
        this.bb.setAnnouncedSuffix(str);
        this.bc.setAnnouncedSuffix(str);
        this.ba.setAnnouncedSuffix(str);
        this.bf.setAccessibilityOptimizationEnabled(true);
        this.bb.setAccessibilityOptimizationEnabled(true);
        this.bc.setAccessibilityOptimizationEnabled(true);
        this.ba.setAccessibilityOptimizationEnabled(true);
    }

    private void n() {
        this.bq[0] = DateUtils.getAMPMString(0);
        this.bq[1] = DateUtils.getAMPMString(1);
    }

    private void o() {
        setPickersPercentage(0);
    }

    private void p() {
        List<Integer> listE = e(this.ap, this.bi);
        if (listE == null || listE.size() == 0) {
            return;
        }
        int size = listE.size();
        if (this.bi) {
            if (size == 25) {
                d(listE);
                this.bb.setMaxValue(size - 1);
                this.bb.setValue(this.be);
            } else {
                this.bo = (String[]) f29367c.clone();
                this.bb.setMaxValue(23);
                this.bb.setValue(this.ap.get(11));
            }
        } else if (this.ap.get(9) == 1 || size != 13) {
            this.bo = (String[]) f29365a.clone();
            this.bb.setMaxValue(11);
            this.bb.setValue(this.ap.get(10));
        } else {
            d(listE);
            this.bb.setMaxValue(size - 1);
            this.bb.setValue(this.be);
        }
        this.bb.setDisplayedValues(null);
        this.bb.setMinValue(0);
        this.bb.setDisplayedValues(this.bo);
        this.ba.setValue(this.ap.get(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        if (ao()) {
            u();
            v();
            s();
            this.bf.setMinValue(0);
            this.bf.setMaxValue(6);
            this.bf.setDisplayedValues(null);
            l();
            w();
            this.bf.setValue(3);
            this.bf.setDisplayedValues(this.o);
            this.bf.setWrapSelectorWheel(false);
            this.bb.postInvalidate();
            this.bc.postInvalidate();
            this.ba.postInvalidate();
            this.bf.postInvalidate();
            this.ak.setTimeInMillis(this.ap.getTimeInMillis());
        }
    }

    private void s() {
        this.bb.setWrapSelectorWheel(true);
        this.bc.setWrapSelectorWheel(true);
        this.ba.setMaxValue(1);
        this.ba.setMinValue(0);
        n();
        this.ba.setDisplayedValues(this.bq);
        p();
        if (!this.j) {
            String[] strArr = (String[]) f29366b.clone();
            this.i = strArr;
            this.bc.setDisplayedValues(strArr);
            this.bc.setValue(this.ap.get(12));
            return;
        }
        String[] strArr2 = (String[]) d.clone();
        this.i = strArr2;
        this.bc.setDisplayedValues(strArr2);
        int iIntValue = new BigDecimal((this.ap.get(12) / 5.0f) + "").setScale(0, 4).intValue();
        this.bc.setValue(iIntValue);
        int i = iIntValue * 5;
        boolean z = i == 60;
        if (this.at || !z) {
            this.ap.set(12, i);
        } else {
            this.ap.set(12, 0);
        }
    }

    private void setCurrentLocale(Locale locale) {
        if (locale == null || locale.equals(this.ai)) {
            return;
        }
        this.ai = locale;
        this.ak = b(this.ak, locale);
        this.an = b(this.an, locale);
        this.ar = b(this.ar, locale);
        this.ap = b(this.ap, locale);
        String[] strArr = new String[31];
        String bestDateTimePattern = DateFormat.getBestDateTimePattern(locale, "d");
        Object objClone = this.ak.clone();
        if (objClone instanceof GregorianCalendar) {
            GregorianCalendar gregorianCalendar = (GregorianCalendar) objClone;
            int i = 0;
            gregorianCalendar.set(2, 0);
            while (i < 31) {
                int i2 = i + 1;
                gregorianCalendar.set(5, i2);
                strArr[i] = DateFormat.format(bestDateTimePattern, gregorianCalendar).toString();
                i = i2;
            }
        }
    }

    private void setMaxDate(long j) {
        this.ak.setTimeInMillis(j);
        this.ar.setTimeInMillis(j);
        if (this.ap.after(this.ar)) {
            this.ap.setTimeInMillis(this.ar.getTimeInMillis());
        }
        r();
    }

    private void setMinDate(long j) {
        this.ak.setTimeInMillis(j);
        this.an.setTimeInMillis(j);
        if (this.ap.before(this.an)) {
            this.ap.setTimeInMillis(this.an.getTimeInMillis());
        }
        r();
    }

    private void setPickersPercentage(int i) {
        if (ao()) {
            if (!this.bi) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
                layoutParams.weight = 4.0f;
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -1);
                layoutParams2.weight = 3.0f;
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -1);
                layoutParams3.weight = 2.0f;
                this.bf.setLayoutParams(layoutParams);
                this.bc.setLayoutParams(layoutParams3);
                this.bb.setLayoutParams(layoutParams3);
                this.ba.setLayoutParams(layoutParams2);
                return;
            }
            this.ba.setVisibility(8);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -1);
            layoutParams4.weight = 3.0f;
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, -1);
            layoutParams5.weight = 2.0f;
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, -1);
            layoutParams6.weight = 0.0f;
            this.bf.setLayoutParams(layoutParams4);
            this.bc.setLayoutParams(layoutParams5);
            this.bb.setLayoutParams(layoutParams5);
            this.ba.setLayoutParams(layoutParams6);
        }
    }

    private void setSpinnersMiddleDrawable(int i) {
        HwAdvancedNumberPicker hwAdvancedNumberPicker = this.bf;
        if (hwAdvancedNumberPicker != null) {
            hwAdvancedNumberPicker.setMiddleStateDrawable(i);
        }
        HwAdvancedNumberPicker hwAdvancedNumberPicker2 = this.ba;
        if (hwAdvancedNumberPicker2 != null) {
            hwAdvancedNumberPicker2.setMiddleStateDrawable(i);
        }
        HwAdvancedNumberPicker hwAdvancedNumberPicker3 = this.bb;
        if (hwAdvancedNumberPicker3 != null) {
            hwAdvancedNumberPicker3.setMiddleStateDrawable(i);
        }
        HwAdvancedNumberPicker hwAdvancedNumberPicker4 = this.bc;
        if (hwAdvancedNumberPicker4 != null) {
            hwAdvancedNumberPicker4.setMiddleStateDrawable(i);
        }
    }

    private void setSpinnersSelectionDividerHeight(int i) {
        HwAdvancedNumberPicker hwAdvancedNumberPicker = this.bf;
        if (hwAdvancedNumberPicker != null) {
            hwAdvancedNumberPicker.setSelectionDividerHeight(i);
        }
        HwAdvancedNumberPicker hwAdvancedNumberPicker2 = this.ba;
        if (hwAdvancedNumberPicker2 != null) {
            hwAdvancedNumberPicker2.setSelectionDividerHeight(i);
        }
        HwAdvancedNumberPicker hwAdvancedNumberPicker3 = this.bb;
        if (hwAdvancedNumberPicker3 != null) {
            hwAdvancedNumberPicker3.setSelectionDividerHeight(i);
        }
        HwAdvancedNumberPicker hwAdvancedNumberPicker4 = this.bc;
        if (hwAdvancedNumberPicker4 != null) {
            hwAdvancedNumberPicker4.setSelectionDividerHeight(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        if (!ao() || this.ak == null) {
            return;
        }
        if (!this.j) {
            this.bc.setDisplayedValues(null);
            this.i = (String[]) f29366b.clone();
            this.bc.setMinValue(0);
            this.bc.setMaxValue(59);
            this.bc.setDisplayedValues(this.i);
            this.bc.setValue(this.ap.get(12));
            this.ak.set(12, this.ap.get(12));
            return;
        }
        this.bc.setDisplayedValues(null);
        this.i = (String[]) d.clone();
        this.bc.setMinValue(0);
        this.bc.setMaxValue(11);
        this.bc.setDisplayedValues(this.i);
        int iIntValue = new BigDecimal((this.ap.get(12) / 5.0f) + "").setScale(0, 4).intValue();
        int i = iIntValue * 5;
        boolean z = i == 60;
        if (this.at || !z) {
            this.ak.set(12, i);
            this.ap.set(12, i);
        } else {
            this.ak.set(12, 0);
            this.ap.set(12, 0);
        }
        this.bc.setValue(iIntValue);
        i();
    }

    public void a() {
        setDialogStyle();
        boolean z = getResources().getConfiguration().orientation == 2;
        this.bf.d(z);
        this.ba.d(z);
        this.bb.d(z);
        this.bc.d(z);
    }

    protected void b() {
        this.e = 0;
    }

    public void b(int i, int i2, int i3, int i4, int i5) {
        int iC = c(i);
        int iE = e(i2);
        int iA = a(i3);
        int iD = d(i4);
        int iB = b(i5);
        if (d(iC, iE, iA, iD, iB)) {
            c(iC, iE, iA, iD, iB);
            this.be = -1;
            r();
            i();
        }
    }

    public boolean c() {
        return this.as;
    }

    public final void d(GregorianCalendar gregorianCalendar, OnDateChangedListener onDateChangedListener) {
        if (gregorianCalendar != null) {
            c(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5), gregorianCalendar.get(11), gregorianCalendar.get(12));
            r();
        }
        if (onDateChangedListener != null) {
            this.ah = onDateChangedListener;
        }
    }

    public boolean d() {
        return this.m;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent == null) {
            Log.i("HwDateAndTimePicker", "dispatchPopulateAccessibilityEvent: dispatchEvent is null.");
            return true;
        }
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return true;
        }
        GestureDetector gestureDetector = this.f;
        if (gestureDetector == null || !gestureDetector.onTouchEvent(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    void e() {
        if (ap() || xfu.a(this.bn)) {
            return;
        }
        this.bf.setVisibility(0);
        this.bb.setVisibility(8);
        this.bc.setVisibility(8);
        if (this.bi) {
            this.ba.setVisibility(8);
        } else {
            this.ba.setVisibility(0);
        }
    }

    public boolean f() {
        return this.j;
    }

    void g() {
        if (ap() || xfu.a(this.bn)) {
            return;
        }
        this.bf.setVisibility(8);
        this.bb.setVisibility(0);
        this.bc.setVisibility(0);
        this.ba.setVisibility(8);
    }

    public GregorianCalendar getCustomArbitraryUpperBounds() {
        return this.av;
    }

    public int getDayOfMonth() {
        GregorianCalendar gregorianCalendar = this.ap;
        if (gregorianCalendar == null) {
            return 1;
        }
        return gregorianCalendar.get(5);
    }

    public int getHour() {
        GregorianCalendar gregorianCalendar = this.ap;
        if (gregorianCalendar == null) {
            return 0;
        }
        return gregorianCalendar.get(11);
    }

    public int getMinute() {
        GregorianCalendar gregorianCalendar = this.ap;
        if (gregorianCalendar == null) {
            return 0;
        }
        return gregorianCalendar.get(12);
    }

    public int getMonth() {
        GregorianCalendar gregorianCalendar = this.ap;
        if (gregorianCalendar == null) {
            return 1;
        }
        return gregorianCalendar.get(2);
    }

    public Drawable getSpinnersSelectionDivider() {
        return this.bj;
    }

    public int getSpinnersSelectorPaintColor() {
        return this.bh;
    }

    public int getSpinnersUnselectedPaintColor() {
        return this.bg;
    }

    public int getYear() {
        GregorianCalendar gregorianCalendar = this.ap;
        if (gregorianCalendar == null) {
            return 1;
        }
        return gregorianCalendar.get(1);
    }

    void h() {
        if (ap()) {
            return;
        }
        if (xfu.a(this.bn)) {
            this.ae.setTextSize(1, 16.0f);
            return;
        }
        for (HwAdvancedNumberPicker hwAdvancedNumberPicker : this.g) {
            hwAdvancedNumberPicker.setUnselectedItemTextSize(28.0f);
            hwAdvancedNumberPicker.setSelectedItemTextSize(35.0f);
            hwAdvancedNumberPicker.setSelectedItemHeight(48.0f);
        }
        if (Float.compare(this.aw, 2.0f) >= 0) {
            this.ae.setTextSize(1, 32.0f);
        }
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.bm;
    }

    @Override // android.view.View
    public boolean isHapticFeedbackEnabled() {
        return super.isHapticFeedbackEnabled();
    }

    public boolean j() {
        return this.bk;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f = new GestureDetector(getContext().getApplicationContext(), new g(this, null));
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        if (configuration == null) {
            Log.i("HwDateAndTimePicker", "onConfigurationChanged: newConfig is null.");
        } else {
            super.onConfigurationChanged(configuration);
            setCurrentLocale(configuration.locale);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent == null) {
            Log.i("HwDateAndTimePicker", "onPopulateAccessibilityEvent: event is null.");
            return;
        }
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.getText().add(DateUtils.formatDateTime(this.bn, this.ap.getTimeInMillis(), 20));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof brnby) {
            brnby brnbyVar = (brnby) parcelable;
            super.onRestoreInstanceState(brnbyVar.getSuperState());
            c(brnbyVar.f29369a, brnbyVar.f29370b, brnbyVar.f29371c, brnbyVar.d, brnbyVar.e);
            r();
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new brnby(super.onSaveInstanceState(), this.ap, null);
    }

    public void setCustomArbitraryUpperBounds(GregorianCalendar gregorianCalendar) {
        if (gregorianCalendar == null) {
            return;
        }
        this.av = gregorianCalendar;
        gregorianCalendar.set(13, 0);
        this.av.set(14, 0);
        r();
        i();
    }

    public void setDialogStyle() {
        Context context = this.bn;
        if (context == null || this.z == null) {
            return;
        }
        if (this.as && xdf.a(context)) {
            this.z.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.z.setVisibility(0);
        } else {
            this.z.setVisibility(8);
        }
        o();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        if (!ao() || this.bm == z) {
            return;
        }
        this.bf.setEnabled(z);
        this.ba.setEnabled(z);
        this.bc.setEnabled(z);
        this.bb.setEnabled(z);
        this.bm = z;
    }

    @Override // android.view.View
    public void setHapticFeedbackEnabled(boolean z) {
        super.setHapticFeedbackEnabled(z);
        HwAdvancedNumberPicker hwAdvancedNumberPicker = this.bc;
        if (hwAdvancedNumberPicker == null || this.ba == null || this.bf == null || this.bb == null) {
            return;
        }
        hwAdvancedNumberPicker.setHapticFeedbackEnabled(z);
        this.ba.setHapticFeedbackEnabled(z);
        this.bf.setHapticFeedbackEnabled(z);
        this.bb.setHapticFeedbackEnabled(z);
    }

    public void setIsFromToday(boolean z) {
        this.m = z;
        r();
    }

    public void setIsLunarEnabled(boolean z) {
        HwCheckBox hwCheckBox;
        this.as = z;
        if (!z && (hwCheckBox = this.ae) != null) {
            hwCheckBox.setChecked(false);
        }
        setDialogStyle();
    }

    public void setIsMinuteIntervalFiveMinute(boolean z) {
        this.j = z;
        GregorianCalendar gregorianCalendar = this.ap;
        if (gregorianCalendar != null) {
            gregorianCalendar.setTimeInMillis(xew.d());
        }
        t();
        r();
    }

    public void setLinkageScrollEnabled(boolean z) {
        this.at = z;
    }

    public void setLunarOrWestern(boolean z) {
        if (this.ae != null) {
            if (this.as && xdf.a(this.bn)) {
                this.ae.setChecked(z);
            } else {
                this.ae.setChecked(false);
            }
        }
    }

    public void setOnDateChangedListener(OnDateChangedListener onDateChangedListener) {
        this.ah = onDateChangedListener;
    }

    public void setSpinnersSelectionDivider(Drawable drawable) {
        Drawable drawable2 = this.bj;
        if (drawable2 == null || !drawable2.equals(drawable)) {
            this.bj = drawable;
            HwAdvancedNumberPicker hwAdvancedNumberPicker = this.bf;
            if (hwAdvancedNumberPicker != null) {
                hwAdvancedNumberPicker.setSelectionDivider(drawable);
            }
            HwAdvancedNumberPicker hwAdvancedNumberPicker2 = this.ba;
            if (hwAdvancedNumberPicker2 != null) {
                hwAdvancedNumberPicker2.setSelectionDivider(drawable);
            }
            HwAdvancedNumberPicker hwAdvancedNumberPicker3 = this.bb;
            if (hwAdvancedNumberPicker3 != null) {
                hwAdvancedNumberPicker3.setSelectionDivider(drawable);
            }
            HwAdvancedNumberPicker hwAdvancedNumberPicker4 = this.bc;
            if (hwAdvancedNumberPicker4 != null) {
                hwAdvancedNumberPicker4.setSelectionDivider(drawable);
            }
        }
    }

    public void setSpinnersSelectorPaintColor(int i) {
        if (this.bh == i) {
            return;
        }
        this.bh = i;
        HwAdvancedNumberPicker hwAdvancedNumberPicker = this.bf;
        if (hwAdvancedNumberPicker != null) {
            hwAdvancedNumberPicker.setSelectorPaintColor(i);
        }
        HwAdvancedNumberPicker hwAdvancedNumberPicker2 = this.ba;
        if (hwAdvancedNumberPicker2 != null) {
            hwAdvancedNumberPicker2.setSelectorPaintColor(i);
        }
        HwAdvancedNumberPicker hwAdvancedNumberPicker3 = this.bb;
        if (hwAdvancedNumberPicker3 != null) {
            hwAdvancedNumberPicker3.setSelectorPaintColor(i);
        }
        HwAdvancedNumberPicker hwAdvancedNumberPicker4 = this.bc;
        if (hwAdvancedNumberPicker4 != null) {
            hwAdvancedNumberPicker4.setSelectorPaintColor(i);
        }
    }

    public final void setSpinnersShown(boolean z) {
        LinearLayout linearLayout = this.ax;
        if (linearLayout != null) {
            linearLayout.setVisibility(z ? 0 : 8);
        }
    }

    public void setSpinnersUnselectedPaintColor(int i) {
        if (this.bg == i) {
            return;
        }
        this.bg = i;
        HwAdvancedNumberPicker hwAdvancedNumberPicker = this.bf;
        if (hwAdvancedNumberPicker != null) {
            hwAdvancedNumberPicker.setSecondaryPaintColor(i);
        }
        HwAdvancedNumberPicker hwAdvancedNumberPicker2 = this.ba;
        if (hwAdvancedNumberPicker2 != null) {
            hwAdvancedNumberPicker2.setSecondaryPaintColor(i);
        }
        HwAdvancedNumberPicker hwAdvancedNumberPicker3 = this.bb;
        if (hwAdvancedNumberPicker3 != null) {
            hwAdvancedNumberPicker3.setSecondaryPaintColor(i);
        }
        HwAdvancedNumberPicker hwAdvancedNumberPicker4 = this.bc;
        if (hwAdvancedNumberPicker4 != null) {
            hwAdvancedNumberPicker4.setSecondaryPaintColor(i);
        }
    }

    public HwDateAndTimePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwDateAndTimePickerStyle);
    }

    private void a(int i, int i2, int i3, int i4, int i5) {
        this.be = i2;
        boolean z = this.at;
        if (z && i2 == 0 && i == i3) {
            this.ak.add(i5, i4);
            return;
        }
        if (!z || i != 0 || i2 != i3) {
            c(i, i2, i3, i4, e(this.ak, this.bi));
            return;
        }
        this.ak.add(i5, -i4);
        int iB = b(this.ak, this.bi);
        boolean z2 = this.ak.get(9) != 1 && iB == 13;
        boolean z3 = iB == 25;
        if (z2 || z3) {
            this.be++;
        }
    }

    private void aa() {
        int iIntValue;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(this.q, this.t, this.s, this.p, this.r, 0);
        gregorianCalendar.set(14, 0);
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        gregorianCalendar2.set(this.aa, this.ad, this.ab, this.ac, this.al, 0);
        gregorianCalendar2.set(14, 0);
        if (this.av.before(gregorianCalendar) || this.av.after(gregorianCalendar2)) {
            return;
        }
        int i = this.av.get(12);
        if (this.j) {
            iIntValue = new BigDecimal((i / 5.0f) + "").setScale(0, 0).intValue() * 5;
        } else {
            iIntValue = this.av.get(12);
        }
        GregorianCalendar gregorianCalendar3 = new GregorianCalendar();
        gregorianCalendar3.setTimeInMillis(this.av.getTimeInMillis());
        gregorianCalendar3.set(12, iIntValue);
        gregorianCalendar3.set(13, 0);
        gregorianCalendar3.set(14, 0);
        if (gregorianCalendar3.after(gregorianCalendar2)) {
            gregorianCalendar3.add(12, -5);
        }
        if (this.ap.before(gregorianCalendar3)) {
            this.ap.setTimeInMillis(gregorianCalendar3.getTimeInMillis());
        }
        this.q = gregorianCalendar3.get(1);
        this.t = gregorianCalendar3.get(2);
        this.s = gregorianCalendar3.get(5);
        this.p = gregorianCalendar3.get(11);
        this.r = gregorianCalendar3.get(12);
        gregorianCalendar3.add(5, 1);
        this.v = gregorianCalendar3.get(1);
        this.w = gregorianCalendar3.get(2);
        this.x = gregorianCalendar3.get(5);
        gregorianCalendar3.add(10, 1);
        this.u = gregorianCalendar3.get(11);
        if (this.j) {
            gregorianCalendar3.add(12, 5);
        } else {
            gregorianCalendar3.add(12, 1);
        }
        this.y = gregorianCalendar3.get(12);
    }

    private void ab() {
        if (this.bk) {
            this.aa = 5000;
            this.ad = 11;
            this.ab = 31;
            this.ac = 23;
            this.af = 30;
            this.ag = 22;
            this.aj = 11;
            this.al = 59;
            this.am = 10;
            this.aq = 58;
            return;
        }
        this.aa = 2101;
        this.ad = 0;
        this.ab = 28;
        this.ac = 23;
        this.af = 27;
        this.ag = 22;
        this.aj = 11;
        this.al = 59;
        this.am = 10;
        this.aq = 58;
    }

    private void ac() {
        this.ak.clear();
        this.ak.set(1, 0, 1);
        this.ap.setTimeInMillis(xew.d());
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        this.h = gregorianCalendar;
        gregorianCalendar.setTimeInMillis(this.ap.getTimeInMillis());
        setMinDate(this.ak.getTimeInMillis());
        this.ak.clear();
        this.ak.set(5000, 11, 31, 23, 59);
        setMaxDate(this.ak.getTimeInMillis());
        this.ap.setTimeInMillis(xew.d());
        i();
    }

    private void ad() {
        this.h.setTimeInMillis(xew.d());
        if (this.h.get(1) < this.q) {
            return;
        }
        this.q = this.h.get(1);
        this.t = this.h.get(2);
        this.s = this.h.get(5);
        this.p = 0;
        this.r = 0;
        this.h.add(5, 1);
        this.v = this.h.get(1);
        this.w = this.h.get(2);
        this.x = this.h.get(5);
        this.u = 1;
        this.y = this.j ? 5 : 1;
    }

    private void af() {
        this.ba.setMaxValue(1);
        this.ba.setMinValue(0);
        int length = this.bi ? 23 : 11;
        this.bb.setMinValue(0);
        String[] strArr = this.bo;
        if (strArr != null && strArr.length != 0) {
            length = strArr.length - 1;
        }
        this.bb.setMaxValue(length);
        this.bb.setIsNeedStopDownScroll(false);
        if (this.j) {
            this.bc.setMaxValue(11);
        } else {
            this.bc.setMaxValue(59);
        }
        this.bc.setIsNeedStopDownScroll(false);
    }

    private void ag() {
        this.bb.setOnScrollListener(new d());
    }

    private void ai() {
        if (this.bk) {
            this.q = 1;
            this.t = 0;
            this.s = 1;
            this.p = 0;
            this.r = 0;
            this.v = 1;
            this.w = 0;
            this.x = 2;
            this.u = 1;
            this.y = this.j ? 5 : 1;
            return;
        }
        this.q = 1900;
        this.t = 0;
        this.s = 31;
        this.p = 0;
        this.r = 0;
        this.v = 1900;
        this.w = 1;
        this.x = 1;
        this.u = 1;
        this.y = this.j ? 5 : 1;
    }

    private void u() {
        if (this.m) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(xew.d());
            gregorianCalendar.set(11, 0);
            gregorianCalendar.set(12, 0);
            gregorianCalendar.set(13, 0);
            gregorianCalendar.set(14, 0);
            if (this.ap.before(gregorianCalendar)) {
                this.ap.setTimeInMillis(gregorianCalendar.getTimeInMillis());
            }
        }
        if (this.bk) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(1, 0, 1);
            if (this.ap.before(calendar)) {
                this.ap.set(1, 0, 1);
                return;
            } else {
                calendar.set(5000, 11, 31, 23, 59);
                a(calendar);
                return;
            }
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(1900, 0, 31);
        if (this.ap.before(calendar2)) {
            this.ap.set(1900, 0, 31);
        } else {
            calendar2.set(2101, 0, 28, 23, 59);
            e(calendar2);
        }
    }

    private void v() {
        ai();
        ab();
        z();
    }

    private void x() {
        if (this.ap.get(11) == this.ac) {
            String[] strArr = this.bo;
            strArr[0] = "";
            strArr[1] = "";
            this.bb.setWrapSelectorWheel(false);
            if (ar()) {
                String[] strArr2 = this.i;
                strArr2[0] = "";
                strArr2[1] = "";
                this.bc.setWrapSelectorWheel(false);
            } else if (an()) {
                this.i[0] = "";
            } else {
                Log.d("HwDateAndTimePicker", "The selected minute is before end boundary.");
            }
            this.bc.setDisplayedValues(this.i);
        } else if (this.ap.get(11) == this.ag) {
            this.bo[0] = "";
        } else {
            Log.d("HwDateAndTimePicker", "The selected hour is before end boundary.");
        }
        this.bb.setDisplayedValues(this.bo);
    }

    private void z() {
        if (this.m) {
            ad();
        } else if (this.av != null) {
            aa();
        } else {
            Log.d("HwDateAndTimePicker", "No custom upper bounds.");
        }
    }

    public HwDateAndTimePicker(Context context, AttributeSet attributeSet, int i) {
        super(a(context, i), attributeSet, i);
        this.ao = "";
        this.bm = true;
        this.bk = true;
        this.bn = getContext();
        this.bq = new String[2];
        this.g = new ArrayList(4);
        this.j = true;
        this.o = new String[7];
        this.as = true;
        this.be = -1;
        Context context2 = super.getContext();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.hwTheme});
        if (typedArrayObtainStyledAttributes != null) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            context2 = resourceId != 0 ? new ContextThemeWrapper(super.getContext(), resourceId) : context2;
            typedArrayObtainStyledAttributes.recycle();
        }
        a(context2);
        a(context2, attributeSet, i);
        q();
    }

    private List<Integer> e(GregorianCalendar gregorianCalendar, boolean z) {
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        ArrayList arrayList = new ArrayList();
        if (gregorianCalendar != null) {
            gregorianCalendar2.set(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5), 0, 0);
            int i = gregorianCalendar2.get(z ? 11 : 10);
            do {
                arrayList.add(Integer.valueOf(i));
                gregorianCalendar2.add(z ? 11 : 10, 1);
                i = gregorianCalendar2.get(z ? 11 : 10);
            } while (i != 0);
        }
        return arrayList;
    }

    private static Context a(Context context, int i) {
        return xfs.c(context, i, R.style.Theme_Emui_HwDateAndTimePicker);
    }

    private void a(Context context) {
        this.bi = DateFormat.is24HourFormat(context);
        setCurrentLocale(Locale.getDefault());
        n();
        this.bp = getResources().getString(R.string.hwdateandtimepicker_calendar_title_today);
        this.au = getResources().getDimension(R.dimen.hwadvancednumberpicker_min_height_half);
        this.bl = new HwLunarCalendar(context);
        this.aw = xfu.d(context);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        if (layoutInflater != null) {
            layoutInflater.cloneInContext(context).inflate(R.layout.hwdateandtimepicker, (ViewGroup) this, true);
            al();
            am();
            aj();
            b();
            ak();
            ah();
            ac();
            d(this.ap, (OnDateChangedListener) null);
        }
    }

    private void a(Calendar calendar) {
        if (calendar != null && this.ap.after(calendar)) {
            if (this.j) {
                this.ap.set(5000, 11, 31, 23, 55);
            } else {
                this.ap.set(5000, 11, 31, 23, 59);
            }
        }
    }

    private int b(GregorianCalendar gregorianCalendar, boolean z) {
        List<Integer> listE = e(gregorianCalendar, z);
        if (listE != null) {
            return listE.size();
        }
        return 0;
    }

    private boolean b(int i, int i2) {
        return (this.ap.get(11) == i && this.ap.get(12) == i2) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, int i2, int i3, int i4, int i5) {
        GregorianCalendar gregorianCalendar = this.ap;
        if (gregorianCalendar != null) {
            gregorianCalendar.set(i, i2, i3, i4, i5);
            u();
        }
    }

    private void w() {
        boolean z;
        af();
        if (this.ap.get(1) == this.q && this.ap.get(2) == this.t && this.ap.get(5) == this.s) {
            String[] strArr = this.o;
            this.o = new String[]{strArr[3], strArr[4], strArr[5], "", "", "", ""};
            this.bf.setMinValue(3);
            this.bf.setWrapSelectorWheel(false);
            y();
            a(true);
            z = true;
        } else {
            if (this.ap.get(1) == this.v && this.ap.get(2) == this.w && this.ap.get(5) == this.x) {
                String[] strArr2 = this.o;
                strArr2[0] = "";
                strArr2[1] = "";
                if (this.u == 0) {
                    a(false);
                }
            } else {
                Log.d("HwDateAndTimePicker", "The selected date is before end boundary.");
            }
            z = false;
        }
        if (this.ap.get(1) == this.aa && this.ap.get(2) == this.ad && this.ap.get(5) == this.ab) {
            String[] strArr3 = this.o;
            strArr3[4] = "";
            strArr3[5] = "";
            strArr3[6] = "";
            this.bf.setMaxValue(3);
            this.bf.setWrapSelectorWheel(false);
            x();
            return;
        }
        if (this.ap.get(1) != this.aa || this.ap.get(2) != this.ad || this.ap.get(5) != this.af) {
            Log.d("HwDateAndTimePicker", "The selected date is before end boundary.");
        } else {
            if (z) {
                this.o[2] = "";
                return;
            }
            String[] strArr4 = this.o;
            strArr4[5] = "";
            strArr4[6] = "";
        }
    }

    private void y() {
        if (this.bi || this.p <= 11) {
            return;
        }
        this.ba.setMaxValue(0);
        this.bq[0] = DateUtils.getAMPMString(1);
        this.ba.setDisplayedValues(this.bq);
    }

    private void e(boolean z) {
        int iE;
        if (this.j) {
            iE = e((this.r / 5) - 1, this.i.length);
        } else {
            iE = e(this.r - 1, this.i.length);
        }
        int iE2 = e(iE - 1, this.i.length);
        int iE3 = e(iE2 - 1, this.i.length);
        if (z && this.ap.get(12) == this.r) {
            if (iE >= 0) {
                String[] strArr = this.i;
                if (iE < strArr.length) {
                    strArr[iE] = "";
                }
            }
            if (iE2 >= 0) {
                String[] strArr2 = this.i;
                if (iE2 < strArr2.length) {
                    strArr2[iE2] = "";
                }
            }
            if (iE3 >= 0) {
                String[] strArr3 = this.i;
                if (iE3 < strArr3.length) {
                    strArr3[iE3] = "";
                }
            }
            this.bc.setIsNeedStopDownScroll(true);
        } else if (this.ap.get(12) != this.y) {
            Log.d("HwDateAndTimePicker", "The selected minute is after start boundary.");
        } else if (iE >= 0) {
            String[] strArr4 = this.i;
            if (iE < strArr4.length) {
                strArr4[iE] = "";
            }
        }
        this.bc.setDisplayedValues(this.i);
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwDateAndTimePicker, i, 0);
        try {
            setEnabled(typedArrayObtainStyledAttributes.getBoolean(R.styleable.HwDateAndTimePicker_android_enabled, true));
            if (this.e == 1) {
                this.ay = typedArrayObtainStyledAttributes.getDrawable(R.styleable.HwDateAndTimePicker_hwSelectionDividerRectLeft);
                this.az = typedArrayObtainStyledAttributes.getDrawable(R.styleable.HwDateAndTimePicker_hwSelectionDividerRectCenter);
                this.bd = typedArrayObtainStyledAttributes.getDrawable(R.styleable.HwDateAndTimePicker_hwSelectionDividerRectRight);
            } else {
                setSpinnersSelectionDivider(typedArrayObtainStyledAttributes.getDrawable(R.styleable.HwDateAndTimePicker_hwNumberPickerSelectionDivider));
                setSpinnersSelectionDividerHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwDateAndTimePicker_hwNumberPickerSelectionDividerHeight, 0));
            }
        } catch (Resources.NotFoundException unused) {
            Log.w("HwDateAndTimePicker", "TypedArray get resource error");
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(HwAdvancedNumberPicker hwAdvancedNumberPicker, int i, int i2) {
        int length;
        if (hwAdvancedNumberPicker == null) {
            return;
        }
        HwAdvancedNumberPicker hwAdvancedNumberPicker2 = this.bb;
        if (hwAdvancedNumberPicker == hwAdvancedNumberPicker2) {
            String[] displayedValues = hwAdvancedNumberPicker2.getDisplayedValues();
            if (displayedValues == null || (length = displayedValues.length) <= 0) {
                return;
            }
            a(i, i2, length - 1, 1, 11);
            return;
        }
        if (hwAdvancedNumberPicker == this.bc) {
            if (this.j) {
                a(i, i2, 11, 5);
                return;
            } else {
                a(i, i2, 59, 1);
                return;
            }
        }
        if (hwAdvancedNumberPicker == this.ba) {
            this.ak.set(9, i2);
            c(this.ak, this.bi);
            return;
        }
        if (hwAdvancedNumberPicker == this.bf) {
            int actualMaximum = this.ak.getActualMaximum(5);
            if (i == actualMaximum && i2 == 1) {
                this.ak.add(5, 1);
            } else if (i == 1 && i2 == actualMaximum) {
                this.ak.add(5, -1);
            } else {
                this.ak.add(5, i2 - i);
            }
            c(this.ak, this.bi);
            return;
        }
        Log.e("HwDateAndTimePicker", "onValueChange: Invalid picker.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int e(int i, int i2) {
        return i - (d(i, i2) * i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i, String[] strArr) {
        int iE = e(i - 1, strArr.length);
        int iE2 = e(iE - 1, strArr.length);
        return i >= 0 && i < strArr.length && iE >= 0 && iE < strArr.length && iE2 >= 0 && iE2 < strArr.length && TextUtils.isEmpty(strArr[i]) && TextUtils.isEmpty(strArr[iE]) && TextUtils.isEmpty(strArr[iE2]);
    }

    private void q() {
        this.g.add(this.bb);
        this.g.add(this.bc);
        this.g.add(this.ba);
        this.g.add(this.bf);
        this.bb.setOnColorChangeListener(this.k);
        this.bc.setOnColorChangeListener(this.k);
        this.ba.setOnColorChangeListener(this.k);
        this.bf.setOnColorChangeListener(this.k);
        String language = Locale.getDefault().getLanguage();
        if (!language.contains("ar") && !language.contains("fa") && !language.contains("iw")) {
            k();
        }
        if (this.ax != null && xdf.b(this)) {
            this.ax.removeAllViews();
            this.ax.addView(this.bf);
            this.ax.addView(this.bc);
            this.ax.addView(this.bb);
            this.ax.addView(this.ba);
            if (this.e == 1) {
                if (this.bi) {
                    this.bf.setSelectionRectDivider(this.ay);
                    this.bc.setSelectionRectDivider(this.az);
                    this.bb.setSelectionRectDivider(this.bd);
                } else {
                    this.bf.setSelectionRectDivider(this.ay);
                    this.bc.setSelectionRectDivider(this.az);
                    this.bb.setSelectionRectDivider(this.az);
                    this.ba.setSelectionRectDivider(this.bd);
                }
            }
        }
        if (this.ax != null) {
            if (language.contains(Constants.URDU_LANG) || language.contains("ug")) {
                this.ax.removeAllViews();
                this.ax.addView(this.bf);
                this.ax.addView(this.ba);
                this.ax.addView(this.bc);
                this.ax.addView(this.bb);
                if (this.e == 1) {
                    this.bf.setSelectionRectDivider(this.ay);
                    this.ba.setSelectionRectDivider(this.az);
                    this.bc.setSelectionRectDivider(this.az);
                    this.bb.setSelectionRectDivider(this.bd);
                }
            }
        }
    }

    private void a(int i, int i2, int i3, int i4) {
        if (!this.at) {
            this.ak.set(12, i2 * i4);
            return;
        }
        List<Integer> listE = e(this.ak, this.bi);
        if (listE == null || listE.size() == 0) {
            return;
        }
        int size = listE.size();
        boolean z = this.ak.get(9) != 1 && size == 13;
        if (i2 == 0 && i == i3) {
            e(i4, listE, size, z);
        } else if (i == 0 && i2 == i3) {
            e(i3, i4, listE, size, z);
        } else {
            this.ak.add(12, (i2 - i) * i4);
        }
    }

    private void e(int i, List<Integer> list, int i2, boolean z) {
        int i3;
        int i4;
        if (list == null || list.size() == 0) {
            return;
        }
        if ((z || i2 == 25) && (i3 = this.be) != (i4 = i2 - 1)) {
            if (i3 < i4) {
                this.be = i3 + 1;
            }
            int i5 = this.be;
            if (i5 < 0 || i5 >= list.size()) {
                return;
            }
            if (list.get(i5).intValue() != i5) {
                i5--;
            }
            this.ak.set(this.bi ? 11 : 10, i5);
            this.ak.set(12, 0);
            return;
        }
        this.ak.add(12, i);
        this.be = -1;
    }

    private void e(int i, int i2, List<Integer> list, int i3, boolean z) {
        int i4;
        if (list == null || list.size() == 0) {
            return;
        }
        if ((z || i3 == 25) && (i4 = this.be) != 0) {
            if (i4 > 0) {
                this.be = i4 - 1;
            }
            int i5 = this.be;
            if (i5 < 0 || i5 >= list.size()) {
                return;
            }
            if (list.get(i5).intValue() != i5) {
                i5--;
            }
            this.ak.set(this.bi ? 11 : 10, i5);
            this.ak.set(12, i * i2);
            return;
        }
        this.ak.add(12, -i2);
        this.be = -1;
    }

    private void c(int i, int i2, int i3, int i4, List<Integer> list) {
        if (!this.bi && this.ak.get(9) == 1) {
            this.ak.set(11, (i2 * i4) + 12);
            return;
        }
        if (list == null || list.size() == 0) {
            return;
        }
        int size = list.size();
        if (size != 11) {
            if (size != 13) {
                if (size != 23) {
                    if (size != 25) {
                        if (!this.at) {
                            this.ak.set(11, i2 * i4);
                            return;
                        } else {
                            this.ak.add(11, (i2 - i) * i4);
                            return;
                        }
                    }
                }
            }
            if (i2 < 0 || i2 >= list.size()) {
                return;
            }
            this.ak.set(11, list.get(i2).intValue() == i2 ? i2 * i4 : i2 - i4);
            return;
        }
        if ((i2 == 0 && i == i3) || (i == 0 && i2 == i3)) {
            this.ak.set(11, i2 * i4);
        } else {
            this.ak.add(11, (i2 - i) * i4);
        }
    }

    private void e(Calendar calendar) {
        if (calendar != null && this.ap.after(calendar)) {
            if (this.j) {
                this.ap.set(2101, 0, 28, 23, 55);
            } else {
                this.ap.set(2101, 0, 28, 23, 59);
            }
        }
    }

    private GregorianCalendar b(GregorianCalendar gregorianCalendar, Locale locale) {
        if (gregorianCalendar == null && locale == null) {
            return new GregorianCalendar(Locale.ENGLISH);
        }
        if (gregorianCalendar == null) {
            return new GregorianCalendar(locale);
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar(locale);
        gregorianCalendar2.setTimeInMillis(timeInMillis);
        return gregorianCalendar2;
    }

    private boolean d(int i, int i2, int i3, int i4, int i5) {
        return (this.ap.get(1) == i && this.ap.get(2) == i3 && this.ap.get(5) == i2 && !b(i4, i5)) ? false : true;
    }

    private void d(List<Integer> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        int size = list.size();
        this.bo = new String[size];
        for (int i = 0; i < size; i++) {
            this.bo[i] = this.bi ? f29367c[list.get(i).intValue()] : f29365a[list.get(i).intValue()];
        }
        int i2 = this.ap.get(this.bi ? 11 : 10);
        if (i2 < 0 || i2 >= list.size()) {
            return;
        }
        if (list.get(i2).intValue() < i2) {
            i2++;
        }
        if (this.be == -1) {
            this.be = i2;
        }
    }

    private void a(boolean z) {
        int iE = e(this.p - 1, this.bo.length);
        int iE2 = e(iE - 1, this.bo.length);
        int iE3 = e(iE2 - 1, this.bo.length);
        if (z && this.ap.get(11) == this.p) {
            if (iE >= 0) {
                String[] strArr = this.bo;
                if (iE < strArr.length) {
                    strArr[iE] = "";
                }
            }
            if (iE2 >= 0) {
                String[] strArr2 = this.bo;
                if (iE2 < strArr2.length) {
                    strArr2[iE2] = "";
                }
            }
            if (iE3 >= 0) {
                String[] strArr3 = this.bo;
                if (iE3 < strArr3.length) {
                    strArr3[iE3] = "";
                }
            }
            this.bb.setIsNeedStopDownScroll(true);
            e(true);
        } else if (this.ap.get(11) == this.u) {
            if (iE >= 0) {
                String[] strArr4 = this.bo;
                if (iE < strArr4.length) {
                    strArr4[iE] = "";
                }
            }
            if (this.y == 0) {
                e(false);
            }
        } else {
            Log.d("HwDateAndTimePicker", "The selected hour is after start boundary.");
        }
        this.bb.setDisplayedValues(this.bo);
    }

    private int d(int i, int i2) {
        int i3;
        if (i2 != 0) {
            i3 = i / i2;
        } else {
            Log.w("HwDateAndTimePicker", "denominator is invalid.");
            i3 = i;
        }
        return ((i ^ i2) >= 0 || i2 * i3 == i) ? i3 : i3 - 1;
    }

    private void c(GregorianCalendar gregorianCalendar, boolean z) {
        List<Integer> listE;
        if (gregorianCalendar == null || (listE = e(gregorianCalendar, z)) == null || listE.size() == 0) {
            return;
        }
        int i = gregorianCalendar.get(z ? 11 : 10);
        if (i < 0 || i >= listE.size()) {
            return;
        }
        if (listE.get(i).intValue() < i) {
            i++;
        }
        this.be = i;
    }
}
