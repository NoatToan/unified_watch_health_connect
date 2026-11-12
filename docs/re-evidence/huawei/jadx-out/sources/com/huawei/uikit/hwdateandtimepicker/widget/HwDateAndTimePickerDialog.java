package com.huawei.uikit.hwdateandtimepicker.widget;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Outline;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.huawei.uikit.hwdateandtimepicker.R;
import com.huawei.uikit.hwtextview.widget.HwTextView;
import defpackage.xdc;
import defpackage.xdf;
import defpackage.xem;
import defpackage.xft;
import defpackage.xfu;
import java.io.Serializable;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes44.dex */
public class HwDateAndTimePickerDialog extends AlertDialog implements HwDateAndTimePicker.OnDateChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f29375a = 0;
    private static final String e = "HwDateAndTimePickerDialog";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HwTextView f29376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OnButtonClickCallback f29377c;
    private Context d;
    private Activity f;
    private HwDateAndTimePicker g;
    private LinearLayout h;
    private LinearLayout i;
    private LinearLayout j;
    private View k;
    private HwTextView l;
    private GregorianCalendar m;
    private HwTextView o;

    public interface OnButtonClickCallback {
        void onNegativeButtonClick(HwDateAndTimePicker hwDateAndTimePicker);

        void onPositiveButtonClick(HwDateAndTimePicker hwDateAndTimePicker);
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (HwDateAndTimePickerDialog.this.o()) {
                HwDateAndTimePickerDialog.this.h();
                return;
            }
            HwDateAndTimePickerDialog.this.g.e();
            HwDateAndTimePickerDialog.this.o.setText(R.string.dialog_button_next_step);
            HwDateAndTimePickerDialog.this.l.setText(R.string.hwdateandtimepicker_discard_label);
            HwDateAndTimePickerDialog.this.b();
        }
    }

    class b implements View.OnLayoutChangeListener {
        final /* synthetic */ Window e;

        b(Window window) {
            this.e = window;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int unused = HwDateAndTimePickerDialog.f29375a = HwDateAndTimePickerDialog.this.d.getResources().getConfiguration().orientation;
            DisplayMetrics displayMetrics = HwDateAndTimePickerDialog.this.d.getResources().getDisplayMetrics();
            WindowManager.LayoutParams attributes = this.e.getAttributes();
            if (xdc.d() || xdc.e(HwDateAndTimePickerDialog.this.f) || xdc.b()) {
                HwDateAndTimePickerDialog.this.c(attributes, displayMetrics);
            } else if (xem.c(HwDateAndTimePickerDialog.this.f)) {
                HwDateAndTimePickerDialog.this.a(attributes, displayMetrics);
            } else if (HwDateAndTimePickerDialog.f29375a == 2) {
                HwDateAndTimePickerDialog.this.c(true, attributes, displayMetrics);
            } else {
                HwDateAndTimePickerDialog.this.c(false, attributes, displayMetrics);
            }
            this.e.setAttributes(attributes);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TypedValue f29380b;
        final /* synthetic */ int e;

        class d extends ViewOutlineProvider {
            d() {
            }

            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), c.this.e);
                HwDateAndTimePickerDialog.this.d.getTheme().resolveAttribute(R.attr.hwBackgroundColor, c.this.f29380b, true);
                HwDateAndTimePickerDialog.this.k.setBackgroundColor(c.this.f29380b.data);
            }
        }

        c(int i, TypedValue typedValue) {
            this.e = i;
            this.f29380b = typedValue;
        }

        @Override // java.lang.Runnable
        public void run() {
            HwDateAndTimePickerDialog.this.k.setOutlineProvider(new d());
            HwDateAndTimePickerDialog.this.k.setClipToOutline(true);
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (HwDateAndTimePickerDialog.this.n()) {
                HwDateAndTimePickerDialog.this.i();
                return;
            }
            HwDateAndTimePickerDialog.this.g.g();
            HwDateAndTimePickerDialog.this.o.setText(R.string.hwdateandtimepicker_dialog_button_done);
            HwDateAndTimePickerDialog.this.l.setText(R.string.dialog_button_last_step);
            HwDateAndTimePickerDialog.this.e();
        }
    }

    public HwDateAndTimePickerDialog(Activity activity, OnButtonClickCallback onButtonClickCallback) {
        this(activity, R.style.Widget_Emui_HwDateAndTimePickerDialogStyle, onButtonClickCallback);
    }

    private void k() {
        l();
        this.g.e();
        this.g.h();
    }

    private void l() {
        if (xft.c(this.d) == 1 && Float.compare(xfu.d(this.d), 1.75f) >= 0 && !xfu.a(this.d)) {
            this.f29376b.setMaxLines(2);
            this.f29376b.setAutoTextSize(1, 35.0f);
            if (Float.compare(xfu.d(this.d), 2.0f) >= 0) {
                this.f29376b.setAutoTextSize(1, 40.0f);
            }
        }
    }

    public void a(boolean z) {
        HwDateAndTimePicker hwDateAndTimePicker = this.g;
        if (hwDateAndTimePicker != null) {
            hwDateAndTimePicker.setIsMinuteIntervalFiveMinute(z);
        }
    }

    public void b(boolean z) {
        HwDateAndTimePicker hwDateAndTimePicker = this.g;
        if (hwDateAndTimePicker != null) {
            hwDateAndTimePicker.setLunarOrWestern(z);
        }
    }

    public void c(int i, int i2, int i3, int i4, int i5) {
        HwDateAndTimePicker hwDateAndTimePicker = this.g;
        if (hwDateAndTimePicker != null) {
            hwDateAndTimePicker.b(i, i2, i3, i4, i5);
        }
    }

    protected void d() {
        Window window = getWindow();
        if (this.f == null || window == null) {
            return;
        }
        window.getDecorView().addOnLayoutChangeListener(new b(window));
    }

    public void d(boolean z) {
        HwDateAndTimePicker hwDateAndTimePicker = this.g;
        if (hwDateAndTimePicker != null) {
            hwDateAndTimePicker.setIsLunarEnabled(z);
        }
    }

    public void e(GregorianCalendar gregorianCalendar) {
        HwDateAndTimePicker hwDateAndTimePicker = this.g;
        if (hwDateAndTimePicker == null || gregorianCalendar == null) {
            return;
        }
        hwDateAndTimePicker.setCustomArbitraryUpperBounds(gregorianCalendar);
    }

    @Override // com.huawei.uikit.hwdateandtimepicker.widget.HwDateAndTimePicker.OnDateChangedListener
    public void onDateChanged(HwDateAndTimePicker hwDateAndTimePicker, GregorianCalendar gregorianCalendar, String str) {
        if (hwDateAndTimePicker != null && gregorianCalendar != null) {
            hwDateAndTimePicker.d(gregorianCalendar, this);
        }
        if (str != null) {
            b(str);
        }
    }

    @Override // android.app.Dialog
    public void onRestoreInstanceState(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        super.onRestoreInstanceState(bundle);
        try {
            boolean z = bundle.getBoolean("is_from_today");
            boolean z2 = bundle.getBoolean("is_lunar_enabled");
            boolean z3 = bundle.getBoolean("is_western");
            boolean z4 = bundle.getBoolean("is_minute_interval_five_minute");
            Serializable serializable = bundle.getSerializable("custom_upper_bounds");
            HwDateAndTimePicker hwDateAndTimePicker = this.g;
            if (hwDateAndTimePicker != null) {
                hwDateAndTimePicker.setIsFromToday(z);
                this.g.setIsLunarEnabled(z2);
                this.g.setLunarOrWestern(!z3);
                this.g.setIsMinuteIntervalFiveMinute(z4);
                if (serializable instanceof GregorianCalendar) {
                    this.g.setCustomArbitraryUpperBounds((GregorianCalendar) serializable);
                }
            }
        } catch (BadParcelableException unused) {
            Log.e(e, "onRestoreInstanceState: Bad parcel target when get time info.");
        }
        try {
            int i = bundle.getInt("year");
            int i2 = bundle.getInt("month");
            int i3 = bundle.getInt("day");
            int i4 = bundle.getInt("hour");
            int i5 = bundle.getInt("minute");
            if (this.m == null) {
                this.m = new GregorianCalendar();
            }
            this.m.set(i, i2, i3, i4, i5);
            HwDateAndTimePicker hwDateAndTimePicker2 = this.g;
            if (hwDateAndTimePicker2 != null) {
                hwDateAndTimePicker2.d(this.m, this);
            }
            b(DateUtils.formatDateTime(this.f, this.m.getTimeInMillis(), d(this.f)));
        } catch (BadParcelableException unused2) {
            Log.e(e, "onRestoreInstanceState: Bad parcel target when get time zone info.");
        }
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        HwDateAndTimePicker hwDateAndTimePicker = this.g;
        int year = hwDateAndTimePicker == null ? 1 : hwDateAndTimePicker.getYear();
        HwDateAndTimePicker hwDateAndTimePicker2 = this.g;
        int month = hwDateAndTimePicker2 == null ? 1 : hwDateAndTimePicker2.getMonth();
        HwDateAndTimePicker hwDateAndTimePicker3 = this.g;
        int dayOfMonth = hwDateAndTimePicker3 == null ? 1 : hwDateAndTimePicker3.getDayOfMonth();
        HwDateAndTimePicker hwDateAndTimePicker4 = this.g;
        int hour = hwDateAndTimePicker4 == null ? 1 : hwDateAndTimePicker4.getHour();
        HwDateAndTimePicker hwDateAndTimePicker5 = this.g;
        int minute = hwDateAndTimePicker5 == null ? 1 : hwDateAndTimePicker5.getMinute();
        try {
            bundleOnSaveInstanceState.putInt("year", year);
            bundleOnSaveInstanceState.putInt("month", month);
            bundleOnSaveInstanceState.putInt("day", dayOfMonth);
            bundleOnSaveInstanceState.putInt("hour", hour);
            bundleOnSaveInstanceState.putInt("minute", minute);
        } catch (BadParcelableException unused) {
            Log.e(e, "Bad Parcel target when put time info calling onSaveInstanceState.");
        }
        HwDateAndTimePicker hwDateAndTimePicker6 = this.g;
        boolean z = hwDateAndTimePicker6 != null && hwDateAndTimePicker6.d();
        HwDateAndTimePicker hwDateAndTimePicker7 = this.g;
        boolean z2 = hwDateAndTimePicker7 != null && hwDateAndTimePicker7.c();
        HwDateAndTimePicker hwDateAndTimePicker8 = this.g;
        boolean z3 = hwDateAndTimePicker8 != null && hwDateAndTimePicker8.j();
        HwDateAndTimePicker hwDateAndTimePicker9 = this.g;
        boolean z4 = hwDateAndTimePicker9 != null && hwDateAndTimePicker9.f();
        HwDateAndTimePicker hwDateAndTimePicker10 = this.g;
        GregorianCalendar customArbitraryUpperBounds = hwDateAndTimePicker10 == null ? null : hwDateAndTimePicker10.getCustomArbitraryUpperBounds();
        try {
            bundleOnSaveInstanceState.putBoolean("is_from_today", z);
            bundleOnSaveInstanceState.putBoolean("is_lunar_enabled", z2);
            bundleOnSaveInstanceState.putBoolean("is_western", z3);
            bundleOnSaveInstanceState.putBoolean("is_minute_interval_five_minute", z4);
            bundleOnSaveInstanceState.putSerializable("custom_upper_bounds", customArbitraryUpperBounds);
        } catch (BadParcelableException unused2) {
            Log.e(e, "Bad Parcel target when put time zone info calling onSaveInstanceState.");
        }
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected void onStart() {
        d();
    }

    @Override // android.app.Dialog
    protected void onStop() {
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        setContentView(this.k);
        g();
    }

    public HwDateAndTimePickerDialog(Activity activity, int i, OnButtonClickCallback onButtonClickCallback) {
        super(activity, i);
        this.f29377c = onButtonClickCallback;
        Context context = getContext();
        this.d = context;
        this.f = activity;
        f29375a = context.getResources().getConfiguration().orientation;
        j();
        if (this.k != null) {
            TypedValue typedValue = new TypedValue();
            this.k.post(new c(getContext().getResources().getDimensionPixelSize(R.dimen.emui_corner_radius_dialog), typedValue));
            f();
            setIcon(0);
            this.m = new GregorianCalendar();
            b(DateUtils.formatDateTime(activity, this.m.getTimeInMillis(), d(activity)));
            this.g.d(this.m, this);
            k();
            m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (Float.compare(xfu.d(this.d), 2.0f) < 0) {
            return;
        }
        if (f29375a != 2 || xdc.e(this.f) || xdc.d()) {
            this.j.removeView(this.l);
            this.j.addView(this.l);
            b(this.o);
            b(this.l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (Float.compare(xfu.d(this.d), 2.0f) < 0) {
            return;
        }
        if (f29375a != 2 || xdc.e(this.f) || xdc.d()) {
            this.j.removeView(this.o);
            this.j.addView(this.o);
            b(this.o);
            b(this.l);
        }
    }

    private void f() {
        a();
        this.o.setOnClickListener(new d());
        this.l.setOnClickListener(new a());
    }

    private void g() {
        Resources resources;
        Configuration configuration;
        Context context = this.d;
        if (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null) {
            return;
        }
        f29375a = configuration.orientation;
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.setWindowAnimations(R.style.Widget_Emui_HwDateAndTimePickerDialogAnim);
        if (this.f == null) {
            return;
        }
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (xdc.d() || xdc.e(this.f) || xdc.b()) {
            window.setGravity(17);
            c(attributes, displayMetrics);
        } else if (xem.c(this.f)) {
            window.setGravity(17);
            a(attributes, displayMetrics);
        } else if (f29375a == 2) {
            window.setGravity(17);
            c(true, attributes, displayMetrics);
        } else {
            window.setGravity(80);
            c(false, attributes, displayMetrics);
        }
        window.setAttributes(attributes);
        HwDateAndTimePicker hwDateAndTimePicker = this.g;
        if (hwDateAndTimePicker != null) {
            hwDateAndTimePicker.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        dismiss();
        HwDateAndTimePicker hwDateAndTimePicker = this.g;
        if (hwDateAndTimePicker == null || this.f29377c == null) {
            return;
        }
        hwDateAndTimePicker.clearFocus();
        this.f29377c.onNegativeButtonClick(this.g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        dismiss();
        HwDateAndTimePicker hwDateAndTimePicker = this.g;
        if (hwDateAndTimePicker == null || this.f29377c == null) {
            return;
        }
        hwDateAndTimePicker.clearFocus();
        this.f29377c.onPositiveButtonClick(this.g);
    }

    private void j() {
        View viewInflate = View.inflate(this.d, R.layout.hwdateandtimepicker_dialog, null);
        this.k = viewInflate;
        this.i = (LinearLayout) viewInflate.findViewById(R.id.hwdateandtimepicker_dialog_title_layout);
        this.h = (LinearLayout) this.k.findViewById(R.id.hwdateandtimepicker_dialog_content_layout);
        this.j = (LinearLayout) this.k.findViewById(R.id.hwdateandtimepicker_dialog_button_layout);
        this.f29376b = (HwTextView) this.k.findViewById(R.id.hwdateandtimepicker_dialog_title);
        this.g = (HwDateAndTimePicker) this.k.findViewById(R.id.hwdateandtimepicker_dialog_dateandtimepicker);
        this.o = (HwTextView) this.k.findViewById(R.id.hwdateandtimepicker_dialog_positive_btn);
        this.l = (HwTextView) this.k.findViewById(R.id.hwdateandtimepicker_dialog_negative_btn);
    }

    private void m() {
        if (xfu.c(this.d) && Float.compare(xfu.d(this.d), 1.75f) >= 0 && !xfu.a(this.d)) {
            this.o.setMaxLines(2);
            this.l.setMaxLines(2);
            this.o.setAutoTextInfo(13, 16, 2);
            this.l.setAutoTextInfo(13, 16, 2);
            e(this.o);
            e(this.l);
            if ((f29375a != 2 || xdc.e(this.f) || xdc.d()) && Float.compare(xfu.d(this.d), 2.0f) >= 0) {
                this.j.setOrientation(1);
                this.k.findViewById(R.id.hwdateandtimepicker_dialog_split_line).setVisibility(8);
                this.j.removeView(this.l);
                this.j.addView(this.l);
                b(this.o);
                b(this.l);
                if (this.j.getLayoutParams() instanceof LinearLayout.LayoutParams) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.j.getLayoutParams();
                    layoutParams.weight = 0.0f;
                    layoutParams.height = -2;
                    layoutParams.width = -1;
                    this.j.setLayoutParams(layoutParams);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n() {
        if (Float.compare(xfu.d(this.d), 1.75f) < 0) {
            return true;
        }
        return this.d.getResources().getString(R.string.hwdateandtimepicker_dialog_button_done).contentEquals(this.o.getText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o() {
        if (Float.compare(xfu.d(this.d), 1.75f) < 0) {
            return true;
        }
        return this.d.getResources().getString(R.string.hwdateandtimepicker_discard_label).contentEquals(this.l.getText());
    }

    private void e(View view) {
        if (view.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            layoutParams.topMargin = (int) TypedValue.applyDimension(1, 8.0f, this.d.getResources().getDisplayMetrics());
            layoutParams.bottomMargin = (int) TypedValue.applyDimension(1, 8.0f, this.d.getResources().getDisplayMetrics());
            view.setLayoutParams(layoutParams);
        }
    }

    private void b(View view) {
        if (view.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            layoutParams.weight = 0.0f;
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
            layoutParams.topMargin = (int) TypedValue.applyDimension(1, 8.0f, this.d.getResources().getDisplayMetrics());
            layoutParams.bottomMargin = 0;
            if (view == this.j.getChildAt(2)) {
                layoutParams.bottomMargin = (int) TypedValue.applyDimension(1, 8.0f, this.d.getResources().getDisplayMetrics());
            }
            layoutParams.height = -2;
            layoutParams.width = -1;
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(WindowManager.LayoutParams layoutParams, DisplayMetrics displayMetrics) {
        Activity activity = this.f;
        if (activity == null || layoutParams == null || displayMetrics == null) {
            return;
        }
        layoutParams.width = Math.min((int) activity.getResources().getDimension(R.dimen.hwdateandtimepicker_alert_dialog_width_in_tablet), displayMetrics.widthPixels);
    }

    private void a() {
        if (xfu.c(this.d) && Float.compare(xfu.d(this.d), 1.75f) >= 0 && !xfu.a(this.d)) {
            this.o.setText(R.string.dialog_button_next_step);
        }
    }

    private int d(Activity activity) {
        return (activity == null || xdf.a(activity)) ? 65558 : 98326;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(WindowManager.LayoutParams layoutParams, DisplayMetrics displayMetrics) {
        if (layoutParams == null || displayMetrics == null) {
            return;
        }
        layoutParams.width = displayMetrics.widthPixels;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z, WindowManager.LayoutParams layoutParams, DisplayMetrics displayMetrics) {
        if (layoutParams == null || displayMetrics == null) {
            return;
        }
        if (z) {
            layoutParams.width = (int) (((double) displayMetrics.widthPixels) * 0.65d);
        } else {
            layoutParams.width = displayMetrics.widthPixels;
        }
    }

    private void b(String str) {
        HwTextView hwTextView;
        if (str == null || (hwTextView = this.f29376b) == null) {
            return;
        }
        hwTextView.setText(str);
        this.f29376b.requestLayout();
    }
}
