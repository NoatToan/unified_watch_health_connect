package com.huawei.uikit.hwtimepicker.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
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
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver;
import com.huawei.uikit.hwadvancednumberpicker.widget.HwAdvancedNumberPicker;
import com.huawei.uikit.hwtimepicker.R;
import defpackage.xdf;
import defpackage.xdj;
import defpackage.xfs;
import defpackage.xft;
import defpackage.xfu;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes20.dex */
public class HwTimePicker extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected HwAdvancedNumberPicker f29775a;
    private GestureDetector aa;
    private boolean ab;
    private HwAdvancedNumberPicker.OnValueChangeListener ac;
    private float ad;
    private boolean ae;
    private float af;
    private Drawable ag;
    private boolean ah;
    private Drawable ai;
    private int aj;
    private Drawable ak;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected HwAdvancedNumberPicker f29776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f29777c;
    protected HwAdvancedNumberPicker d;
    protected int e;
    private int h;
    private OnTimeChangedListener k;
    private Locale l;
    private GregorianCalendar m;
    private GregorianCalendar n;
    private int o;
    private int p;
    private Drawable q;
    private LinearLayout r;
    private boolean s;
    private int t;
    private final String[] u;
    private final List<HwAdvancedNumberPicker> v;
    private String[] w;
    private final Context x;
    private String[] y;
    private HwAdvancedNumberPicker.OnColorChangeListener z;
    private static final String[] f = {"12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
    private static final String[] g = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", HealthZonePushReceiver.DEAUTH_EVENT_NOTIFY, "21", "22", "23"};
    private static final String[] j = {"00", HiAnalyticsConstant.KeyAndValue.NUMBER_01, com.huawei.hms.ads.dynamic.a.t, "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", HealthZonePushReceiver.DEAUTH_EVENT_NOTIFY, "21", "22", "23", "24", "25", "26", HealthZonePushReceiver.BLOOD_SUGAR_DAWN_NOTIFY, "28", HealthZonePushReceiver.SLEEP_TIME_NOTIFY, HealthZonePushReceiver.SLEEP_SCORE_NOTIFY, "31", HealthZonePushReceiver.PRESSURE_NOTIFY, HealthZonePushReceiver.CYCLE_BLOOD_OXYGEN_NOTIFY, HealthZonePushReceiver.BODY_TEMPERATURE_HIGH_NOTIFY, HealthZonePushReceiver.BODY_TEMPERATURE_LOW_NOTIFY, HealthZonePushReceiver.DATA_POST_COMMENTS_NOTIFY, HealthZonePushReceiver.PROACTIVE_SHARING_NOTIFY, HealthZonePushReceiver.COMMENT_FAILED_NOTIFY, "39", HealthZonePushReceiver.FAMILY_CARE_NOTIFY, HealthZonePushReceiver.SOS_LOCATION_NOTIFY, "42", HealthZonePushReceiver.ECG_MEASUREMENT_ABNORMAL, "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"};
    private static final String[] i = {"00", "05", "10", "15", HealthZonePushReceiver.DEAUTH_EVENT_NOTIFY, "25", HealthZonePushReceiver.SLEEP_SCORE_NOTIFY, HealthZonePushReceiver.BODY_TEMPERATURE_LOW_NOTIFY, HealthZonePushReceiver.FAMILY_CARE_NOTIFY, "45", "50", "55"};

    public interface OnTimeChangedListener {
        void onTimeChanged(HwTimePicker hwTimePicker, GregorianCalendar gregorianCalendar, String str);
    }

    class a extends GestureDetector.SimpleOnGestureListener {
        private a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (motionEvent == null || !HwTimePicker.this.isEnabled()) {
                return false;
            }
            int[] iArr = new int[2];
            HwTimePicker.this.f29775a.getLocationOnScreen(iArr);
            int i = iArr[0];
            if (motionEvent.getRawX() > i && motionEvent.getRawX() < i + HwTimePicker.this.f29775a.getWidth()) {
                float rawY = motionEvent.getRawY();
                int i2 = iArr[1];
                if (rawY > ((HwTimePicker.this.f29775a.getHeight() / 2) + i2) - HwTimePicker.this.ad && rawY < i2 + (HwTimePicker.this.f29775a.getHeight() / 2) + HwTimePicker.this.ad) {
                    HwTimePicker hwTimePicker = HwTimePicker.this;
                    hwTimePicker.ab = !hwTimePicker.ab;
                    HwTimePicker.this.p();
                    HwTimePicker.this.t();
                }
            }
            return super.onDoubleTapEvent(motionEvent);
        }

        /* synthetic */ a(HwTimePicker hwTimePicker, e eVar) {
            this();
        }
    }

    static class bqmxo extends View.BaseSavedState {
        public static final Parcelable.Creator<bqmxo> CREATOR = new d();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f29778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f29779b;

        class d implements Parcelable.Creator<bqmxo> {
            d() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public bqmxo[] newArray(int i) {
                return new bqmxo[i];
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public bqmxo createFromParcel(Parcel parcel) {
                return new bqmxo(parcel, (e) null);
            }
        }

        /* synthetic */ bqmxo(Parcel parcel, e eVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            if (parcel != null) {
                parcel.writeInt(this.f29778a);
                parcel.writeInt(this.f29779b);
            }
        }

        /* synthetic */ bqmxo(Parcelable parcelable, GregorianCalendar gregorianCalendar, e eVar) {
            this(parcelable, gregorianCalendar);
        }

        private bqmxo(Parcelable parcelable, GregorianCalendar gregorianCalendar) {
            super(parcelable);
            if (gregorianCalendar != null) {
                this.f29778a = gregorianCalendar.get(11);
                this.f29779b = gregorianCalendar.get(12);
            }
        }

        private bqmxo(Parcel parcel) {
            super(parcel);
            if (parcel != null) {
                this.f29778a = parcel.readInt();
                this.f29779b = parcel.readInt();
            }
        }
    }

    class d implements HwAdvancedNumberPicker.OnColorChangeListener {
        d() {
        }

        @Override // com.huawei.uikit.hwadvancednumberpicker.widget.HwAdvancedNumberPicker.OnColorChangeListener
        public void onColorChange(HwAdvancedNumberPicker hwAdvancedNumberPicker) {
        }
    }

    class e implements HwAdvancedNumberPicker.OnValueChangeListener {
        e() {
        }

        @Override // com.huawei.uikit.hwadvancednumberpicker.widget.HwAdvancedNumberPicker.OnValueChangeListener
        public void onValueChange(HwAdvancedNumberPicker hwAdvancedNumberPicker, int i, int i2) {
            if (hwAdvancedNumberPicker == null || HwTimePicker.this.m == null || HwTimePicker.this.n == null) {
                return;
            }
            HwTimePicker hwTimePicker = HwTimePicker.this;
            hwTimePicker.o = hwTimePicker.h != 0 ? HwTimePicker.this.h : HwTimePicker.this.m.get(11);
            HwTimePicker.this.n.clear();
            HwTimePicker.this.n.setTimeInMillis(HwTimePicker.this.m.getTimeInMillis());
            HwTimePicker hwTimePicker2 = HwTimePicker.this;
            if (hwAdvancedNumberPicker == hwTimePicker2.d) {
                hwTimePicker2.h = 0;
                String[] displayedValues = HwTimePicker.this.d.getDisplayedValues();
                if (displayedValues != null && displayedValues.length != 0) {
                    HwTimePicker.this.e(i, i2, displayedValues.length - 1, 1, 11);
                }
            } else if (hwAdvancedNumberPicker == hwTimePicker2.f29775a) {
                if (hwTimePicker2.ab) {
                    HwTimePicker.this.b(i, i2, 11, 5);
                } else {
                    HwTimePicker.this.b(i, i2, 59, 1);
                }
            } else if (hwAdvancedNumberPicker != hwTimePicker2.f29776b) {
                Log.w("HwTimePicker", "onValueChange: IllegalArgumentException");
                return;
            } else {
                hwTimePicker2.n.set(9, i2);
                HwTimePicker.this.f();
            }
            int i3 = HwTimePicker.this.n.get(11);
            if (!HwTimePicker.this.ae && Math.abs(i3 - HwTimePicker.this.o) == 2) {
                HwTimePicker hwTimePicker3 = HwTimePicker.this;
                hwTimePicker3.h = i3 > hwTimePicker3.o ? HwTimePicker.this.o + 1 : HwTimePicker.this.o - 1;
                HwTimePicker.this.n.set(11, HwTimePicker.this.o);
            }
            HwTimePicker hwTimePicker4 = HwTimePicker.this;
            hwTimePicker4.d(hwTimePicker4.n.get(1), HwTimePicker.this.n.get(2), HwTimePicker.this.n.get(5), HwTimePicker.this.n.get(11), HwTimePicker.this.n.get(12));
            HwTimePicker.this.t();
            HwTimePicker.this.m();
        }
    }

    public HwTimePicker(Context context) {
        this(context, null);
    }

    public static long getCurrentMillis() {
        return new GregorianCalendar().getTimeInMillis();
    }

    private void k() {
        this.r.removeAllViews();
        if (xdf.a(this.x) || Locale.getDefault().getLanguage().contains("bo")) {
            e(this.f29776b, this.d, this.f29775a);
            this.r.addView(this.f29776b);
            this.r.addView(this.d);
            this.r.addView(this.f29775a);
            if (this.e == 1) {
                if (this.f29777c) {
                    this.d.setSelectionRectDivider(this.ag);
                    this.f29775a.setSelectionRectDivider(this.ak);
                    return;
                } else {
                    this.f29776b.setSelectionRectDivider(this.ag);
                    this.d.setSelectionRectDivider(this.ai);
                    this.f29775a.setSelectionRectDivider(this.ak);
                    return;
                }
            }
            return;
        }
        e(this.d, this.f29775a, this.f29776b);
        this.r.addView(this.d);
        this.r.addView(this.f29775a);
        this.r.addView(this.f29776b);
        if (this.e == 1) {
            if (this.f29777c) {
                this.d.setSelectionRectDivider(this.ag);
                this.f29775a.setSelectionRectDivider(this.ak);
            } else {
                this.d.setSelectionRectDivider(this.ag);
                this.f29775a.setSelectionRectDivider(this.ai);
                this.f29776b.setSelectionRectDivider(this.ak);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        OnTimeChangedListener onTimeChangedListener = this.k;
        if (onTimeChangedListener == null) {
            return;
        }
        onTimeChangedListener.onTimeChanged(this, this.m, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        if (n()) {
            if (!this.ab) {
                this.f29775a.setDisplayedValues(null);
                this.w = (String[]) j.clone();
                this.f29775a.setMinValue(0);
                this.f29775a.setMaxValue(59);
                this.f29775a.setDisplayedValues(this.w);
                this.f29775a.setValue(this.m.get(12));
                return;
            }
            this.f29775a.setDisplayedValues(null);
            this.w = (String[]) i.clone();
            this.f29775a.setMinValue(0);
            this.f29775a.setMaxValue(11);
            this.f29775a.setDisplayedValues(this.w);
            int iIntValue = new BigDecimal((this.m.get(12) / 5.0f) + "").setScale(0, 4).intValue();
            this.f29775a.setValue(iIntValue);
            int i2 = iIntValue * 5;
            boolean z = i2 == 60;
            if (this.ah || !z) {
                this.m.set(12, i2);
            } else {
                this.m.set(12, 0);
            }
        }
    }

    private void q() {
        String str = ",   " + DateUtils.formatDateTime(this.x, this.m.getTimeInMillis(), this.f29777c ? 129 : 65);
        this.d.setAnnouncedSuffix(str);
        this.f29775a.setAnnouncedSuffix(str);
        this.f29776b.setAnnouncedSuffix(str);
        this.d.setAccessibilityOptimizationEnabled(true);
        this.f29775a.setAccessibilityOptimizationEnabled(true);
        this.f29776b.setAccessibilityOptimizationEnabled(true);
    }

    private void r() {
        setPickersPercentage(0);
    }

    private void s() {
        this.u[0] = DateUtils.getAMPMString(0);
        this.u[1] = DateUtils.getAMPMString(1);
    }

    private void setCurrentLocale(Locale locale) {
        if (locale == null || locale.equals(this.l)) {
            return;
        }
        this.l = locale;
        this.n = b(this.n, locale);
        this.m = b(this.m, locale);
    }

    private void setSpinnersMiddleSelector(int i2) {
        HwAdvancedNumberPicker hwAdvancedNumberPicker = this.f29776b;
        if (hwAdvancedNumberPicker != null) {
            hwAdvancedNumberPicker.setMiddleStateDrawable(i2);
        }
        HwAdvancedNumberPicker hwAdvancedNumberPicker2 = this.d;
        if (hwAdvancedNumberPicker2 != null) {
            hwAdvancedNumberPicker2.setMiddleStateDrawable(i2);
        }
        HwAdvancedNumberPicker hwAdvancedNumberPicker3 = this.f29775a;
        if (hwAdvancedNumberPicker3 != null) {
            hwAdvancedNumberPicker3.setMiddleStateDrawable(i2);
        }
    }

    private void setSpinnersSelectionDividerHeight(int i2) {
        HwAdvancedNumberPicker hwAdvancedNumberPicker = this.f29776b;
        if (hwAdvancedNumberPicker != null) {
            hwAdvancedNumberPicker.setSelectionDividerHeight(i2);
        }
        HwAdvancedNumberPicker hwAdvancedNumberPicker2 = this.d;
        if (hwAdvancedNumberPicker2 != null) {
            hwAdvancedNumberPicker2.setSelectionDividerHeight(i2);
        }
        HwAdvancedNumberPicker hwAdvancedNumberPicker3 = this.f29775a;
        if (hwAdvancedNumberPicker3 != null) {
            hwAdvancedNumberPicker3.setSelectionDividerHeight(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        if (n()) {
            y();
            this.d.postInvalidate();
            this.f29775a.postInvalidate();
            this.f29776b.postInvalidate();
        }
    }

    private void u() {
        List<Integer> listA;
        if (this.d == null || this.f29776b == null || (listA = a(this.m, this.f29777c)) == null || listA.size() == 0) {
            return;
        }
        if (this.f29777c) {
            d(listA);
        } else {
            c(listA);
        }
        this.d.setDisplayedValues(null);
        this.d.setMinValue(0);
        this.d.setDisplayedValues(this.y);
        this.f29776b.setValue(this.m.get(9));
    }

    private void y() {
        this.d.setWrapSelectorWheel(true);
        this.f29775a.setWrapSelectorWheel(true);
        u();
        if (this.ab) {
            String[] strArr = (String[]) i.clone();
            this.w = strArr;
            this.f29775a.setDisplayedValues(strArr);
            int iIntValue = new BigDecimal((this.m.get(12) / 5.0f) + "").setScale(0, 4).intValue();
            this.f29775a.setValue(iIntValue);
            int i2 = iIntValue * 5;
            boolean z = i2 == 60;
            if (this.ah || !z) {
                this.m.set(12, i2);
            } else {
                this.m.set(12, 0);
            }
        } else {
            String[] strArr2 = (String[]) j.clone();
            this.w = strArr2;
            this.f29775a.setDisplayedValues(strArr2);
            this.f29775a.setValue(this.m.get(12));
        }
        this.f29776b.setDisplayedValues(this.u);
        q();
    }

    protected void a() {
        this.e = 0;
    }

    public void a(int i2, int i3, int i4, int i5, int i6) {
        if (a(i5, i6)) {
            d(i2, i3, i4, i5, i6);
            this.aj = -1;
            t();
            m();
        }
    }

    public final void a(GregorianCalendar gregorianCalendar, OnTimeChangedListener onTimeChangedListener) {
        if (gregorianCalendar != null) {
            d(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5), gregorianCalendar.get(11), gregorianCalendar.get(12));
            t();
        }
        if (onTimeChangedListener != null) {
            this.k = onTimeChangedListener;
        }
    }

    public void d() {
        setDialogStyle();
        boolean z = getResources().getConfiguration().orientation == 2;
        this.d.d(z);
        this.f29775a.d(z);
        this.f29776b.d(z);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent == null) {
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
        GestureDetector gestureDetector = this.aa;
        if (gestureDetector == null || !gestureDetector.onTouchEvent(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    protected void e(Context context, AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwTimePicker, i2, 0);
        try {
            setEnabled(typedArrayObtainStyledAttributes.getBoolean(R.styleable.HwTimePicker_android_enabled, true));
            if (this.e == 1) {
                this.ag = typedArrayObtainStyledAttributes.getDrawable(R.styleable.HwTimePicker_hwSelectionDividerRectLeft);
                this.ai = typedArrayObtainStyledAttributes.getDrawable(R.styleable.HwTimePicker_hwSelectionDividerRectCenter);
                this.ak = typedArrayObtainStyledAttributes.getDrawable(R.styleable.HwTimePicker_hwSelectionDividerRectRight);
            } else {
                setSpinnersSelectionDivider(typedArrayObtainStyledAttributes.getDrawable(R.styleable.HwTimePicker_hwNumberPickerSelectionDivider));
                setSpinnersSelectionDividerHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwTimePicker_hwNumberPickerSelectionDividerHeight, 0));
            }
        } catch (Resources.NotFoundException unused) {
            Log.w("HwTimePicker", "TypedArray get resource error");
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    protected void e(View view, View view2, View view3) {
    }

    @Deprecated
    public int getDayOfMonth() {
        GregorianCalendar gregorianCalendar = this.m;
        if (gregorianCalendar == null) {
            return 1;
        }
        return gregorianCalendar.get(5);
    }

    public int getHour() {
        int i2;
        if (!this.ae && (i2 = this.h) != 0) {
            return i2;
        }
        GregorianCalendar gregorianCalendar = this.m;
        if (gregorianCalendar == null) {
            return 0;
        }
        return gregorianCalendar.get(11);
    }

    public int getMinute() {
        GregorianCalendar gregorianCalendar = this.m;
        if (gregorianCalendar == null) {
            return 0;
        }
        return gregorianCalendar.get(12);
    }

    @Deprecated
    public int getMonth() {
        GregorianCalendar gregorianCalendar = this.m;
        if (gregorianCalendar == null) {
            return 1;
        }
        return gregorianCalendar.get(2);
    }

    public OnTimeChangedListener getOnTimeChangedListener() {
        return this.k;
    }

    public Drawable getSpinnersSelectionDivider() {
        return this.q;
    }

    public int getSpinnersSelectorPaintColor() {
        return this.t;
    }

    public int getSpinnersUnselectedPaintColor() {
        return this.p;
    }

    @Deprecated
    public int getYear() {
        GregorianCalendar gregorianCalendar = this.m;
        if (gregorianCalendar == null) {
            return 1;
        }
        return gregorianCalendar.get(1);
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.s;
    }

    @Override // android.view.View
    public boolean isHapticFeedbackEnabled() {
        return super.isHapticFeedbackEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.aa = new GestureDetector(getContext().getApplicationContext(), new a(this, null));
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        if (configuration == null) {
            return;
        }
        super.onConfigurationChanged(configuration);
        setCurrentLocale(configuration.locale);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent == null) {
            return;
        }
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.getText().add(DateUtils.formatDateTime(this.x, this.m.getTimeInMillis(), 20));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof bqmxo) {
            bqmxo bqmxoVar = (bqmxo) parcelable;
            super.onRestoreInstanceState(bqmxoVar.getSuperState());
            d(1, 0, 1, bqmxoVar.f29778a, bqmxoVar.f29779b);
            t();
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new bqmxo(super.onSaveInstanceState(), this.m, null);
    }

    public void setCurrentTime(int i2, int i3) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        a(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5), i2, i3);
    }

    public void setDaylightHourEnabled(boolean z) {
        this.ae = z;
    }

    public void setDialogStyle() {
        if (this.x == null) {
            return;
        }
        r();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        if (!n() || this.s == z) {
            return;
        }
        this.f29776b.setEnabled(z);
        this.f29775a.setEnabled(z);
        this.d.setEnabled(z);
        this.s = z;
    }

    public void setFocusTextColor(int i2) {
    }

    @Override // android.view.View
    public void setHapticFeedbackEnabled(boolean z) {
        super.setHapticFeedbackEnabled(z);
        HwAdvancedNumberPicker hwAdvancedNumberPicker = this.f29776b;
        if (hwAdvancedNumberPicker == null || this.d == null || this.f29775a == null) {
            return;
        }
        hwAdvancedNumberPicker.setHapticFeedbackEnabled(z);
        this.d.setHapticFeedbackEnabled(z);
        this.f29775a.setHapticFeedbackEnabled(z);
    }

    public void setIs24HoursSystem(boolean z) {
        if (this.f29777c == z) {
            return;
        }
        this.f29777c = z;
        r();
        i();
        o();
        y();
    }

    public void setIsMinuteIntervalFiveMinute(boolean z) {
        this.ab = z;
        GregorianCalendar gregorianCalendar = this.m;
        if (gregorianCalendar != null) {
            gregorianCalendar.setTimeInMillis(getCurrentMillis());
        } else {
            this.m = new GregorianCalendar();
        }
        p();
        t();
    }

    public void setLinkageScrollEnabled(boolean z) {
        this.ah = z;
    }

    public void setOnTimeChangedListener(OnTimeChangedListener onTimeChangedListener) {
        this.k = onTimeChangedListener;
    }

    protected void setPickersPercentage(int i2) {
        if (n()) {
            if (this.f29777c) {
                this.f29776b.setVisibility(8);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
                layoutParams.weight = 1.0f;
                this.f29775a.setLayoutParams(layoutParams);
                this.d.setLayoutParams(layoutParams);
                return;
            }
            this.f29776b.setVisibility(0);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -1);
            layoutParams2.weight = 1.0f;
            this.f29775a.setLayoutParams(layoutParams2);
            this.d.setLayoutParams(layoutParams2);
            this.f29776b.setLayoutParams(layoutParams2);
        }
    }

    public void setSpinnersSelectionDivider(Drawable drawable) {
        Drawable drawable2 = this.q;
        if (drawable2 == null || !drawable2.equals(drawable)) {
            this.q = drawable;
            HwAdvancedNumberPicker hwAdvancedNumberPicker = this.f29776b;
            if (hwAdvancedNumberPicker != null) {
                hwAdvancedNumberPicker.setSelectionDivider(drawable);
            }
            HwAdvancedNumberPicker hwAdvancedNumberPicker2 = this.d;
            if (hwAdvancedNumberPicker2 != null) {
                hwAdvancedNumberPicker2.setSelectionDivider(drawable);
            }
            HwAdvancedNumberPicker hwAdvancedNumberPicker3 = this.f29775a;
            if (hwAdvancedNumberPicker3 != null) {
                hwAdvancedNumberPicker3.setSelectionDivider(drawable);
            }
        }
    }

    public void setSpinnersSelectorPaintColor(int i2) {
        if (this.t == i2) {
            return;
        }
        this.t = i2;
        HwAdvancedNumberPicker hwAdvancedNumberPicker = this.f29776b;
        if (hwAdvancedNumberPicker != null) {
            hwAdvancedNumberPicker.setSelectorPaintColor(i2);
        }
        HwAdvancedNumberPicker hwAdvancedNumberPicker2 = this.d;
        if (hwAdvancedNumberPicker2 != null) {
            hwAdvancedNumberPicker2.setSelectorPaintColor(i2);
        }
        HwAdvancedNumberPicker hwAdvancedNumberPicker3 = this.f29775a;
        if (hwAdvancedNumberPicker3 != null) {
            hwAdvancedNumberPicker3.setSelectorPaintColor(i2);
        }
    }

    public final void setSpinnersShown(boolean z) {
        LinearLayout linearLayout = this.r;
        if (linearLayout != null) {
            linearLayout.setVisibility(z ? 0 : 8);
        }
    }

    public void setSpinnersUnselectedPaintColor(int i2) {
        if (this.p == i2) {
            return;
        }
        this.p = i2;
        HwAdvancedNumberPicker hwAdvancedNumberPicker = this.f29776b;
        if (hwAdvancedNumberPicker != null) {
            hwAdvancedNumberPicker.setSecondaryPaintColor(i2);
        }
        HwAdvancedNumberPicker hwAdvancedNumberPicker2 = this.d;
        if (hwAdvancedNumberPicker2 != null) {
            hwAdvancedNumberPicker2.setSecondaryPaintColor(i2);
        }
        HwAdvancedNumberPicker hwAdvancedNumberPicker3 = this.f29775a;
        if (hwAdvancedNumberPicker3 != null) {
            hwAdvancedNumberPicker3.setSecondaryPaintColor(i2);
        }
    }

    public HwTimePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwTimePickerStyle);
    }

    private void g() {
        this.m.setTimeInMillis(getCurrentMillis());
    }

    private void h() {
        this.z = new d();
    }

    private void j() {
        this.ac = new e();
    }

    private boolean l() {
        return xft.c(this.x) != 1 || Float.compare(this.af, 1.75f) < 0 || xfu.a(this.x);
    }

    private boolean n() {
        return (this.f29775a == null || this.d == null || this.f29776b == null) ? false : true;
    }

    private void o() {
        this.r = (LinearLayout) findViewById(R.id.hwtimepicker_ll);
        HwAdvancedNumberPicker hwAdvancedNumberPicker = (HwAdvancedNumberPicker) findViewById(R.id.hwtimepicker_ampm);
        this.f29776b = hwAdvancedNumberPicker;
        hwAdvancedNumberPicker.setOnValueChangedListener(this.ac);
        this.f29776b.setOnLongPressUpdateInterval(100L);
        this.f29776b.setDisplayedValues(this.u);
        this.f29776b.setMaxValue(1);
        this.f29776b.setMinValue(0);
        if (this.f29777c) {
            this.f29776b.setVisibility(8);
        }
        HwAdvancedNumberPicker hwAdvancedNumberPicker2 = (HwAdvancedNumberPicker) findViewById(R.id.hwtimepicker_hour);
        this.d = hwAdvancedNumberPicker2;
        hwAdvancedNumberPicker2.setOnLongPressUpdateInterval(100L);
        this.d.setOnValueChangedListener(this.ac);
        if (this.f29777c) {
            this.d.setMaxValue(23);
            this.d.setMinValue(0);
        } else {
            this.d.setMaxValue(11);
            this.d.setMinValue(0);
        }
        this.d.setFormatter(xdj.f52732b);
        HwAdvancedNumberPicker hwAdvancedNumberPicker3 = (HwAdvancedNumberPicker) findViewById(R.id.hwtimepicker_minute);
        this.f29775a = hwAdvancedNumberPicker3;
        hwAdvancedNumberPicker3.setOnLongPressUpdateInterval(100L);
        this.f29775a.setOnValueChangedListener(this.ac);
        if (this.ab) {
            this.f29775a.setMaxValue(11);
        } else {
            this.f29775a.setMaxValue(59);
        }
        this.f29775a.setMinValue(0);
        this.f29775a.setFormatter(xdj.f52732b);
        this.f29776b.setFlingAnnounceType(4);
        this.d.setFlingAnnounceType(5);
        this.f29775a.setFlingAnnounceType(5);
        this.f29776b.setIsSupportRichTap(false);
        setSpinnersShown(true);
    }

    void b() {
        if (l()) {
            return;
        }
        if (this.f29777c) {
            this.f29776b.setVisibility(8);
            this.d.setVisibility(0);
            this.f29775a.setVisibility(0);
        } else {
            this.f29776b.setVisibility(0);
            this.d.setVisibility(8);
            this.f29775a.setVisibility(8);
        }
    }

    void c() {
        if (l()) {
            return;
        }
        this.d.setVisibility(0);
        this.f29775a.setVisibility(0);
        this.f29776b.setVisibility(8);
    }

    void e() {
        if (l()) {
            return;
        }
        for (HwAdvancedNumberPicker hwAdvancedNumberPicker : this.v) {
            hwAdvancedNumberPicker.setUnselectedItemTextSize(28.0f);
            hwAdvancedNumberPicker.setSelectedItemTextSize(35.0f);
            hwAdvancedNumberPicker.setSelectedItemHeight(48.0f);
        }
    }

    public HwTimePicker(Context context, AttributeSet attributeSet, int i2) {
        super(b(context, i2), attributeSet, i2);
        this.s = true;
        this.x = getContext();
        this.u = new String[2];
        this.v = new ArrayList(4);
        this.ab = true;
        this.ae = true;
        this.aj = -1;
        Context context2 = super.getContext();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.hwTheme});
        if (typedArrayObtainStyledAttributes != null) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            context2 = resourceId != 0 ? new ContextThemeWrapper(super.getContext(), resourceId) : context2;
            typedArrayObtainStyledAttributes.recycle();
        }
        e(context2);
        a(context2);
        d(context2, attributeSet, i2);
        i();
    }

    private void b(List<Integer> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        int size = list.size();
        this.y = new String[size];
        for (int i2 = 0; i2 < size; i2++) {
            this.y[i2] = this.f29777c ? g[list.get(i2).intValue()] : f[list.get(i2).intValue()];
        }
        e(list);
    }

    private void d(List<Integer> list) {
        int i2;
        if (list == null || list.size() == 0) {
            return;
        }
        int size = list.size();
        if (this.ae && size == 25) {
            b(list);
            this.d.setMaxValue(size - 1);
            this.d.setValue(this.aj);
            return;
        }
        this.y = (String[]) g.clone();
        this.d.setMaxValue(23);
        if (!this.ae && (i2 = this.h) != 0) {
            this.d.setValue(i2);
        } else {
            this.d.setValue(this.m.get(11));
        }
        if (size == 25) {
            e(list);
        }
    }

    private void a(Context context) {
        LayoutInflater layoutInflater = (LayoutInflater) this.x.getSystemService("layout_inflater");
        if (layoutInflater != null) {
            layoutInflater.cloneInContext(context).inflate(R.layout.hwtimepicker, (ViewGroup) this, true);
            j();
            h();
            g();
            o();
            a(this.m, (OnTimeChangedListener) null);
        }
    }

    private static Context b(Context context, int i2) {
        return xfs.c(context, i2, R.style.Theme_Emui_HwTimePicker);
    }

    private void e(Context context) {
        this.ad = getResources().getDimension(R.dimen.hwadvancednumberpicker_min_height_half);
        this.f29777c = DateFormat.is24HourFormat(context);
        this.af = xfu.d(context);
        setCurrentLocale(Locale.getDefault());
        s();
        a();
    }

    private void d(Context context, AttributeSet attributeSet, int i2) {
        e(context, attributeSet, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i2, int i3, int i4, int i5, int i6) {
        this.aj = i3;
        boolean z = this.ah;
        if (z && i3 == 0 && i2 == i4) {
            this.n.add(i6, i5);
            return;
        }
        if (z && i2 == 0 && i3 == i4) {
            this.n.add(i6, -i5);
            int iC = c(this.n, this.f29777c);
            boolean z2 = this.n.get(9) != 1 && iC == 13;
            boolean z3 = iC == 25;
            if (z2 || z3) {
                this.aj++;
                return;
            }
            return;
        }
        a(i2, i3, i4, i5, a(this.n, this.f29777c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        List<Integer> listA = a(this.n, this.f29777c);
        if (listA == null || listA.size() == 0) {
            return;
        }
        int i2 = this.n.get(this.f29777c ? 11 : 10);
        if (i2 < 0 || i2 >= listA.size()) {
            return;
        }
        if (listA.get(i2).intValue() < i2) {
            i2++;
        }
        this.aj = i2;
    }

    private int c(GregorianCalendar gregorianCalendar, boolean z) {
        List<Integer> listA = a(gregorianCalendar, z);
        if (listA != null) {
            return listA.size();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i2, int i3, int i4, int i5, int i6) {
        GregorianCalendar gregorianCalendar = this.m;
        if (gregorianCalendar != null) {
            gregorianCalendar.set(i2, i3, i4, i5, i6);
        }
    }

    private void c(List<Integer> list) {
        int i2;
        if (list == null || list.size() == 0) {
            return;
        }
        int size = list.size();
        if (this.m.get(9) != 1) {
            if (this.ae && size == 13) {
                b(list);
                this.d.setMaxValue(size - 1);
                this.d.setValue(this.aj);
                return;
            }
            this.y = (String[]) f.clone();
            this.d.setMaxValue(11);
            if (!this.ae && (i2 = this.h) != 0) {
                this.d.setValue(i2);
            } else {
                this.d.setValue(this.m.get(10));
            }
            if (size == 13) {
                e(list);
                return;
            }
            return;
        }
        this.y = (String[]) f.clone();
        this.d.setMaxValue(11);
        this.d.setValue(this.m.get(10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i2, int i3, int i4, int i5) {
        if (!this.ah) {
            this.n.set(12, i3 * i5);
            return;
        }
        List<Integer> listA = a(this.n, this.f29777c);
        if (listA == null || listA.size() == 0) {
            return;
        }
        int size = listA.size();
        boolean z = this.n.get(9) != 1 && size == 13;
        if (i3 == 0 && i2 == i4) {
            this.h = 0;
            a(i5, listA, size, z);
        } else if (i2 == 0 && i3 == i4) {
            this.h = 0;
            c(i4, i5, listA, size, z);
        } else {
            this.n.add(12, (i3 - i2) * i5);
        }
    }

    private void a(int i2, List<Integer> list, int i3, boolean z) {
        int i4;
        int i5;
        if (list == null || list.size() == 0) {
            return;
        }
        if ((z || i3 == 25) && (i4 = this.aj) != (i5 = i3 - 1)) {
            if (i4 < i5) {
                this.aj = i4 + 1;
            }
            int i6 = this.aj;
            if (list.get(i6).intValue() != i6) {
                i6--;
            }
            this.n.set(this.f29777c ? 11 : 10, i6);
            this.n.set(12, 0);
            return;
        }
        this.n.add(12, i2);
        this.aj = -1;
    }

    private void c(int i2, int i3, List<Integer> list, int i4, boolean z) {
        int i5;
        if (list == null || list.size() == 0) {
            return;
        }
        if ((z || i4 == 25) && (i5 = this.aj) != 0) {
            if (i5 > 0) {
                this.aj = i5 - 1;
            }
            int i6 = this.aj;
            if (list.get(i6).intValue() != i6) {
                i6--;
            }
            this.n.set(this.f29777c ? 11 : 10, i6);
            this.n.set(12, i2 * i3);
            return;
        }
        this.n.add(12, -i3);
        this.aj = -1;
    }

    private void a(int i2, int i3, int i4, int i5, List<Integer> list) {
        if (!this.f29777c && this.n.get(9) == 1) {
            this.n.set(11, (i3 * i5) + 12);
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
                        if (!this.ah) {
                            this.n.set(11, i3 * i5);
                            return;
                        } else {
                            this.n.add(11, (i3 - i2) * i5);
                            return;
                        }
                    }
                }
            }
            if (this.ae) {
                this.n.set(11, list.get(i3).intValue() == i3 ? i3 * i5 : i3 - i5);
                return;
            } else {
                this.n.set(11, i3 * i5);
                return;
            }
        }
        if ((i3 == 0 && i2 == i4) || (i2 == 0 && i3 == i4)) {
            this.n.set(11, i3 * i5);
        } else {
            this.n.add(11, (i3 - i2) * i5);
        }
    }

    private List<Integer> a(GregorianCalendar gregorianCalendar, boolean z) {
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        ArrayList arrayList = new ArrayList();
        if (gregorianCalendar != null) {
            gregorianCalendar2.set(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5), 0, 0);
            int i2 = gregorianCalendar2.get(z ? 11 : 10);
            do {
                arrayList.add(Integer.valueOf(i2));
                gregorianCalendar2.add(z ? 11 : 10, 1);
                i2 = gregorianCalendar2.get(z ? 11 : 10);
            } while (i2 != 0);
        }
        return arrayList;
    }

    private void i() {
        this.v.add(this.d);
        this.v.add(this.f29775a);
        this.v.add(this.f29776b);
        this.d.setOnColorChangeListener(this.z);
        this.f29775a.setOnColorChangeListener(this.z);
        this.f29776b.setOnColorChangeListener(this.z);
        String language = Locale.getDefault().getLanguage();
        if (!language.contains("ar") && !language.contains("fa") && !language.contains("iw")) {
            k();
        }
        if (this.r != null && xdf.b(this)) {
            this.r.removeAllViews();
            e(this.f29775a, this.d, this.f29776b);
            this.r.addView(this.f29775a);
            this.r.addView(this.d);
            this.r.addView(this.f29776b);
            if (this.e == 1) {
                if (this.f29777c) {
                    this.f29775a.setSelectionRectDivider(this.ag);
                    this.d.setSelectionRectDivider(this.ak);
                } else {
                    this.f29775a.setSelectionRectDivider(this.ag);
                    this.d.setSelectionRectDivider(this.ai);
                    this.f29776b.setSelectionRectDivider(this.ak);
                }
            }
        }
        if (this.r != null && (language.contains(Constants.URDU_LANG) || language.contains("ug"))) {
            this.r.removeAllViews();
            e(this.f29776b, this.f29775a, this.d);
            this.r.addView(this.f29776b);
            this.r.addView(this.f29775a);
            this.r.addView(this.d);
            if (this.e == 1) {
                if (this.f29777c) {
                    this.f29775a.setSelectionRectDivider(this.ag);
                    this.d.setSelectionRectDivider(this.ak);
                } else {
                    this.f29776b.setSelectionRectDivider(this.ag);
                    this.f29775a.setSelectionRectDivider(this.ai);
                    this.d.setSelectionRectDivider(this.ak);
                }
            }
        }
        r();
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

    private boolean a(int i2, int i3) {
        return (this.m.get(11) == i2 && this.m.get(12) == i3) ? false : true;
    }

    private void e(List<Integer> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        int i2 = this.m.get(this.f29777c ? 11 : 10);
        if (list.get(i2).intValue() < i2) {
            i2++;
        }
        if (this.aj == -1) {
            this.aj = i2;
        }
    }
}
