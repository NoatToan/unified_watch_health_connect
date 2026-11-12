package com.huawei.uikit.hwtimepicker.widget;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Outline;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.huawei.uikit.hwtextview.widget.HwTextView;
import com.huawei.uikit.hwtimepicker.R;
import defpackage.xdc;
import defpackage.xft;
import defpackage.xfu;
import defpackage.xgb;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes20.dex */
public class HwTimePickerDialog extends AlertDialog implements HwTimePicker.OnTimeChangedListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f29781b = "HwTimePickerDialog";
    private static int e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Activity f29782a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f29783c;
    private OnButtonClickCallback d;
    private HwTimePicker f;
    private LinearLayout g;
    private HwTextView h;
    private LinearLayout i;
    private LinearLayout j;
    private HwTextView k;
    private View l;
    private String m;
    private HwTextView o;

    public interface OnButtonClickCallback {
        void onNegativeButtonClick(HwTimePicker hwTimePicker);

        void onPositiveButtonClick(HwTimePicker hwTimePicker);
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TypedValue f29785c;
        final /* synthetic */ int d;

        class a extends ViewOutlineProvider {
            a() {
            }

            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), b.this.d);
                HwTimePickerDialog.this.f29783c.getTheme().resolveAttribute(R.attr.hwBackgroundColor, b.this.f29785c, true);
                HwTimePickerDialog.this.l.setBackgroundColor(b.this.f29785c.data);
            }
        }

        b(int i, TypedValue typedValue) {
            this.d = i;
            this.f29785c = typedValue;
        }

        @Override // java.lang.Runnable
        public void run() {
            HwTimePickerDialog.this.l.setOutlineProvider(new a());
            HwTimePickerDialog.this.l.setClipToOutline(true);
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (HwTimePickerDialog.this.o()) {
                HwTimePickerDialog.this.g();
                return;
            }
            HwTimePickerDialog.this.f.c();
            HwTimePickerDialog.this.o.setText(R.string.dialog_button_done_new);
            HwTimePickerDialog.this.k.setText(R.string.dialog_button_last_step);
            HwTimePickerDialog.this.c();
        }
    }

    class d implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Window f29787b;

        d(Window window) {
            this.f29787b = window;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int unused = HwTimePickerDialog.e = HwTimePickerDialog.this.f29783c.getResources().getConfiguration().orientation;
            DisplayMetrics displayMetrics = HwTimePickerDialog.this.f29783c.getResources().getDisplayMetrics();
            WindowManager.LayoutParams attributes = this.f29787b.getAttributes();
            if (xdc.d() || xdc.e(HwTimePickerDialog.this.f29782a) || xdc.b()) {
                HwTimePickerDialog.this.b(attributes, displayMetrics);
            } else if (xgb.a(HwTimePickerDialog.this.f29782a)) {
                HwTimePickerDialog.this.d(attributes, displayMetrics);
            } else if (HwTimePickerDialog.e == 2) {
                HwTimePickerDialog.this.b(true, attributes, displayMetrics);
            } else {
                HwTimePickerDialog.this.b(false, attributes, displayMetrics);
            }
            this.f29787b.setAttributes(attributes);
        }
    }

    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (HwTimePickerDialog.this.l()) {
                HwTimePickerDialog.this.f();
                return;
            }
            HwTimePickerDialog.this.f.b();
            HwTimePickerDialog.this.o.setText(R.string.dialog_button_next_step);
            HwTimePickerDialog.this.k.setText(R.string.discard_label);
            HwTimePickerDialog.this.i();
        }
    }

    public HwTimePickerDialog(Activity activity, OnButtonClickCallback onButtonClickCallback) {
        this(activity, R.style.Theme_Emui_HwTimePickerDialog, onButtonClickCallback);
    }

    private void m() {
        t();
        this.f.b();
        this.f.e();
    }

    private void t() {
        if (xft.c(this.f29783c) == 1 && Float.compare(xfu.d(this.f29783c), 1.75f) >= 0 && !xfu.a(this.f29783c)) {
            this.h.setMaxLines(2);
            this.h.setAutoTextSize(1, 35.0f);
            if (Float.compare(xfu.d(this.f29783c), 2.0f) >= 0) {
                this.h.setAutoTextSize(1, 40.0f);
            }
        }
    }

    public HwTimePicker a() {
        return this.f;
    }

    protected void b() {
        Window window = getWindow();
        if (window == null || this.f29782a == null) {
            return;
        }
        window.getDecorView().addOnLayoutChangeListener(new d(window));
    }

    public void b(int i, int i2, int i3, int i4, int i5) {
        HwTimePicker hwTimePicker = this.f;
        if (hwTimePicker != null) {
            hwTimePicker.a(i, i2, i3, i4, i5);
        }
    }

    public void c(int i) {
        HwTimePicker hwTimePicker = this.f;
        if (hwTimePicker != null) {
            hwTimePicker.setSpinnersSelectorPaintColor(i);
        }
    }

    public void c(boolean z) {
        HwTimePicker hwTimePicker = this.f;
        if (hwTimePicker != null) {
            hwTimePicker.setIsMinuteIntervalFiveMinute(z);
        }
    }

    public void e(int i) {
        HwTextView hwTextView = this.o;
        if (hwTextView != null) {
            hwTextView.setTextColor(i);
        }
        HwTextView hwTextView2 = this.k;
        if (hwTextView2 != null) {
            hwTextView2.setTextColor(i);
        }
    }

    public void e(String str) {
        this.m = str;
    }

    @Override // android.app.Dialog
    public void onRestoreInstanceState(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        super.onRestoreInstanceState(bundle);
        try {
            int i = bundle.getInt("hour");
            int i2 = bundle.getInt("minute");
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.set(11, i);
            gregorianCalendar.set(12, i2);
            HwTimePicker hwTimePicker = this.f;
            if (hwTimePicker != null) {
                hwTimePicker.a(gregorianCalendar, this);
            }
        } catch (BadParcelableException unused) {
            Log.e(f29781b, "onRestoreInstanceState: Bad parcel target.");
        }
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        HwTimePicker hwTimePicker = this.f;
        int hour = hwTimePicker == null ? 1 : hwTimePicker.getHour();
        HwTimePicker hwTimePicker2 = this.f;
        int minute = hwTimePicker2 != null ? hwTimePicker2.getMinute() : 1;
        try {
            bundleOnSaveInstanceState.putInt("hour", hour);
            bundleOnSaveInstanceState.putInt("minute", minute);
            return bundleOnSaveInstanceState;
        } catch (BadParcelableException unused) {
            Log.e(f29781b, "onSaveInstanceState: Bad parcel target.");
            return bundleOnSaveInstanceState;
        }
    }

    @Override // android.app.Dialog
    protected void onStart() {
        b();
    }

    @Override // android.app.Dialog
    protected void onStop() {
    }

    @Override // com.huawei.uikit.hwtimepicker.widget.HwTimePicker.OnTimeChangedListener
    public void onTimeChanged(HwTimePicker hwTimePicker, GregorianCalendar gregorianCalendar, String str) {
        if (hwTimePicker != null && gregorianCalendar != null) {
            hwTimePicker.a(gregorianCalendar, this);
        }
        if (str != null) {
            a(str);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        View view = this.l;
        if (view != null) {
            setContentView(view);
            a(this.m);
            h();
        }
    }

    public HwTimePickerDialog(Activity activity, int i, OnButtonClickCallback onButtonClickCallback) {
        super(activity, i);
        this.m = "设置时间";
        this.d = onButtonClickCallback;
        Context context = getContext();
        this.f29783c = context;
        this.f29782a = activity;
        e = context.getResources().getConfiguration().orientation;
        n();
        if (this.l != null) {
            TypedValue typedValue = new TypedValue();
            this.l.post(new b(getContext().getResources().getDimensionPixelSize(R.dimen.emui_corner_radius_dialog), typedValue));
            j();
            setIcon(0);
            a(this.m);
            this.f.a(new GregorianCalendar(), this);
            m();
            k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (Float.compare(xfu.d(this.f29783c), 2.0f) < 0) {
            return;
        }
        if (e != 2 || xdc.e(this.f29782a) || xdc.d()) {
            this.j.removeView(this.o);
            this.j.addView(this.o);
            e(this.o);
            e(this.k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        dismiss();
        HwTimePicker hwTimePicker = this.f;
        if (hwTimePicker == null || this.d == null) {
            return;
        }
        hwTimePicker.clearFocus();
        this.d.onNegativeButtonClick(this.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        dismiss();
        HwTimePicker hwTimePicker = this.f;
        if (hwTimePicker == null || this.d == null) {
            return;
        }
        hwTimePicker.clearFocus();
        this.d.onPositiveButtonClick(this.f);
    }

    private void h() {
        Window window = getWindow();
        if (window == null || this.f29783c == null) {
            return;
        }
        window.setWindowAnimations(R.style.Animation_Emui_HwTimePickerDialog);
        e = this.f29783c.getResources().getConfiguration().orientation;
        if (this.f29782a == null) {
            return;
        }
        DisplayMetrics displayMetrics = this.f29783c.getResources().getDisplayMetrics();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (xdc.d() || xdc.e(this.f29782a) || xdc.b()) {
            window.setGravity(17);
            b(attributes, displayMetrics);
        } else if (xgb.a(this.f29782a)) {
            window.setGravity(17);
            d(attributes, displayMetrics);
        } else if (e == 2) {
            window.setGravity(17);
            b(true, attributes, displayMetrics);
        } else {
            window.setGravity(80);
            b(false, attributes, displayMetrics);
        }
        window.setAttributes(attributes);
        HwTimePicker hwTimePicker = this.f;
        if (hwTimePicker != null) {
            hwTimePicker.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (Float.compare(xfu.d(this.f29783c), 2.0f) < 0) {
            return;
        }
        if (e != 2 || xdc.e(this.f29782a) || xdc.d()) {
            this.j.removeView(this.k);
            this.j.addView(this.k);
            e(this.o);
            e(this.k);
        }
    }

    private void j() {
        e();
        this.o.setOnClickListener(new c());
        this.k.setOnClickListener(new e());
    }

    private void k() {
        if (xfu.c(this.f29783c) && Float.compare(xfu.d(this.f29783c), 1.75f) >= 0 && !xfu.a(this.f29783c)) {
            this.o.setMaxLines(2);
            this.k.setMaxLines(2);
            this.o.setAutoTextInfo(13, 16, 2);
            this.k.setAutoTextInfo(13, 16, 2);
            c(this.o);
            c(this.k);
            if ((e != 2 || xdc.e(this.f29782a) || xdc.d()) && Float.compare(xfu.d(this.f29783c), 2.0f) >= 0) {
                this.j.setOrientation(!DateFormat.is24HourFormat(this.f29783c) ? 1 : 0);
                this.l.findViewById(R.id.hwtimepicker_dialog_split_line).setVisibility(8);
                if (DateFormat.is24HourFormat(this.f29783c)) {
                    c(this.o);
                    c(this.k);
                } else {
                    this.j.removeView(this.k);
                    this.j.addView(this.k);
                    e(this.o);
                    e(this.k);
                }
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
    public boolean l() {
        if (Float.compare(xfu.d(this.f29783c), 1.75f) < 0) {
            return true;
        }
        return this.f29783c.getResources().getString(R.string.discard_label).contentEquals(this.k.getText());
    }

    private void n() {
        View viewInflate = View.inflate(this.f29783c, R.layout.hwtimepicker_dialog, null);
        this.l = viewInflate;
        this.g = (LinearLayout) viewInflate.findViewById(R.id.hwtimepicker_title_layout);
        this.i = (LinearLayout) this.l.findViewById(R.id.hwtimepicker_dialog_content_layout);
        this.j = (LinearLayout) this.l.findViewById(R.id.hwtimepicker_button_layout);
        this.h = (HwTextView) this.l.findViewById(R.id.hwtimepicker_title);
        this.f = (HwTimePicker) this.l.findViewById(R.id.hwtimepicker);
        this.o = (HwTextView) this.l.findViewById(R.id.hwtimepicker_positive_btn);
        this.k = (HwTextView) this.l.findViewById(R.id.hwtimepicker_negative_btn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o() {
        if (Float.compare(xfu.d(this.f29783c), 1.75f) < 0) {
            return true;
        }
        return this.f29783c.getResources().getString(R.string.dialog_button_done_new).contentEquals(this.o.getText());
    }

    private void c(View view) {
        if (view.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            layoutParams.topMargin = (int) TypedValue.applyDimension(1, 8.0f, this.f29783c.getResources().getDisplayMetrics());
            layoutParams.bottomMargin = (int) TypedValue.applyDimension(1, 8.0f, this.f29783c.getResources().getDisplayMetrics());
            view.setLayoutParams(layoutParams);
        }
    }

    private void e(View view) {
        if (view.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            layoutParams.weight = 0.0f;
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
            layoutParams.topMargin = (int) TypedValue.applyDimension(1, 8.0f, this.f29783c.getResources().getDisplayMetrics());
            layoutParams.bottomMargin = 0;
            if (view == this.j.getChildAt(2)) {
                layoutParams.bottomMargin = (int) TypedValue.applyDimension(1, 8.0f, this.f29783c.getResources().getDisplayMetrics());
            }
            layoutParams.height = -2;
            layoutParams.width = -1;
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(WindowManager.LayoutParams layoutParams, DisplayMetrics displayMetrics) {
        if (layoutParams == null || displayMetrics == null) {
            return;
        }
        layoutParams.width = displayMetrics.widthPixels;
    }

    private void e() {
        if (xfu.c(this.f29783c) && Float.compare(xfu.d(this.f29783c), 1.75f) >= 0 && !xfu.a(this.f29783c) && !DateFormat.is24HourFormat(this.f29783c)) {
            this.o.setText(R.string.dialog_button_next_step);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(WindowManager.LayoutParams layoutParams, DisplayMetrics displayMetrics) {
        Activity activity = this.f29782a;
        if (activity == null || layoutParams == null || displayMetrics == null) {
            return;
        }
        layoutParams.width = Math.min((int) activity.getResources().getDimension(R.dimen.hwtimepicker_alert_dialog_width_in_tablet), displayMetrics.widthPixels);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z, WindowManager.LayoutParams layoutParams, DisplayMetrics displayMetrics) {
        if (layoutParams == null || displayMetrics == null) {
            return;
        }
        if (z) {
            layoutParams.width = (int) (((double) displayMetrics.widthPixels) * 0.65d);
        } else {
            layoutParams.width = displayMetrics.widthPixels;
        }
    }

    private void a(String str) {
        HwTextView hwTextView;
        if (str == null || (hwTextView = this.h) == null) {
            return;
        }
        hwTextView.setText(str);
    }
}
