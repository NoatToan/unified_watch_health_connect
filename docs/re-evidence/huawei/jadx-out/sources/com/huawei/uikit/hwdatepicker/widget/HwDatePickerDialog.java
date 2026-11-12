package com.huawei.uikit.hwdatepicker.widget;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
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
import com.huawei.uikit.hwdatepicker.R;
import com.huawei.uikit.hwtextview.widget.HwTextView;
import defpackage.xdc;
import defpackage.xdf;
import defpackage.xek;
import defpackage.xfa;
import defpackage.xft;
import defpackage.xfu;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes20.dex */
public class HwDatePickerDialog extends AlertDialog implements HwDatePicker.OnDateChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f29393a = "HwDatePickerDialog";
    private static int e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected OnButtonClickCallback f29394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Context f29395c;
    private HwDatePicker d;
    private LinearLayout f;
    private boolean g;
    private HwTextView h;
    private LinearLayout i;
    private LinearLayout j;
    private HwTextView k;
    private String l;
    private Activity m;
    private boolean n;
    private HwTextView o;
    private View q;
    private boolean s;
    private GregorianCalendar t;

    public interface OnButtonClickCallback {
        void onNegativeButtonClick(HwDatePicker hwDatePicker);

        void onPositiveButtonClick(HwDatePicker hwDatePicker);
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (HwDatePickerDialog.this.k()) {
                HwDatePickerDialog.this.h();
                return;
            }
            HwDatePickerDialog.this.d.f();
            HwDatePickerDialog.this.o.setText(R.string.dialog_button_next_step);
            HwDatePickerDialog.this.k.setText(R.string.discard_label);
            HwDatePickerDialog.this.g();
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TypedValue f29397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f29398b;

        class e extends ViewOutlineProvider {
            e() {
            }

            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), b.this.f29398b);
                HwDatePickerDialog.this.f29395c.getTheme().resolveAttribute(R.attr.hwBackgroundColor, b.this.f29397a, true);
                HwDatePickerDialog.this.q.setBackgroundColor(b.this.f29397a.data);
            }
        }

        b(int i, TypedValue typedValue) {
            this.f29398b = i;
            this.f29397a = typedValue;
        }

        @Override // java.lang.Runnable
        public void run() {
            HwDatePickerDialog.this.q.setOutlineProvider(new e());
            HwDatePickerDialog.this.q.setClipToOutline(true);
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (HwDatePickerDialog.this.l()) {
                HwDatePickerDialog.this.f();
                return;
            }
            HwDatePickerDialog.this.d.i();
            HwDatePickerDialog.this.o.setText(R.string.dialog_button_done_new);
            HwDatePickerDialog.this.k.setText(R.string.dialog_button_last_step);
            HwDatePickerDialog.this.j();
        }
    }

    class d implements View.OnLayoutChangeListener {
        final /* synthetic */ Window e;

        d(Window window) {
            this.e = window;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int unused = HwDatePickerDialog.e = HwDatePickerDialog.this.f29395c.getResources().getConfiguration().orientation;
            DisplayMetrics displayMetrics = HwDatePickerDialog.this.f29395c.getResources().getDisplayMetrics();
            WindowManager.LayoutParams attributes = this.e.getAttributes();
            if (xdc.d() || xdc.e(HwDatePickerDialog.this.m) || xdc.b()) {
                HwDatePickerDialog.this.d(attributes, displayMetrics);
            } else if (xek.e(HwDatePickerDialog.this.m)) {
                HwDatePickerDialog.this.b(attributes, displayMetrics);
            } else if (HwDatePickerDialog.e == 2) {
                HwDatePickerDialog.this.c(true, attributes, displayMetrics);
            } else {
                HwDatePickerDialog.this.c(false, attributes, displayMetrics);
            }
            this.e.setAttributes(attributes);
        }
    }

    public HwDatePickerDialog(Activity activity, OnButtonClickCallback onButtonClickCallback) {
        this(activity, R.style.Widget_Emui_HwDatePickerDialogStyle, onButtonClickCallback, null);
    }

    private void p() {
        r();
        this.d.f();
        this.d.g();
    }

    private void r() {
        if (xft.c(this.f29395c) == 1 && Float.compare(xfu.d(this.f29395c), 1.75f) >= 0 && !xfu.a(this.f29395c)) {
            this.h.setMaxLines(2);
            this.h.setAutoTextSize(1, 35.0f);
            if (Float.compare(xfu.d(this.f29395c), 2.0f) >= 0) {
                this.h.setAutoTextSize(1, 40.0f);
            }
        }
    }

    public void a(GregorianCalendar gregorianCalendar, GregorianCalendar gregorianCalendar2) {
        HwDatePicker hwDatePicker = this.d;
        if (hwDatePicker == null) {
            return;
        }
        hwDatePicker.e(gregorianCalendar, gregorianCalendar2);
    }

    public void a(boolean z) {
        this.g = z;
        HwDatePicker hwDatePicker = this.d;
        if (hwDatePicker != null) {
            hwDatePicker.setLunarOrWestern(z);
        }
    }

    public HwDatePicker b() {
        return this.d;
    }

    public void b(int i) {
        HwTextView hwTextView = this.o;
        if (hwTextView != null) {
            hwTextView.setTextColor(i);
        }
        HwTextView hwTextView2 = this.k;
        if (hwTextView2 != null) {
            hwTextView2.setTextColor(i);
        }
    }

    public void b(int i, int i2, int i3) {
        HwDatePicker hwDatePicker = this.d;
        if (hwDatePicker == null) {
            return;
        }
        hwDatePicker.d(i, i2, i3);
    }

    public void b(String str) {
        HwTextView hwTextView = this.h;
        if (hwTextView != null) {
            hwTextView.setText(str);
            this.h.requestLayout();
        }
    }

    public void b(boolean z) {
        HwDatePicker hwDatePicker = this.d;
        if (hwDatePicker != null) {
            hwDatePicker.setIsShowAllYears(z);
        }
    }

    protected void c() {
        Window window = getWindow();
        if (window == null || this.m == null) {
            return;
        }
        window.getDecorView().addOnLayoutChangeListener(new d(window));
    }

    protected void d() {
        if (this.d != null && "".equals(this.h.getText().toString())) {
            b(e(this.d.getMonth(), this.d.getDayOfMonth(), this.t));
        }
    }

    public void d(int i) {
        HwDatePicker hwDatePicker = this.d;
        if (hwDatePicker != null) {
            hwDatePicker.setSpinnersSelectorPaintColor(i);
        }
        b(i);
    }

    public void d(boolean z) {
        HwDatePicker hwDatePicker = this.d;
        if (hwDatePicker != null) {
            hwDatePicker.setmIsWestern(z);
        }
    }

    protected void e() {
        Window window = getWindow();
        e = this.f29395c.getResources().getConfiguration().orientation;
        if (window != null && this.m != null) {
            window.setWindowAnimations(R.style.Widget_Emui_HwDatePickerDialogAnim);
            DisplayMetrics displayMetrics = this.f29395c.getResources().getDisplayMetrics();
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (xdc.d() || xdc.e(this.m) || xdc.b()) {
                window.setGravity(17);
                d(attributes, displayMetrics);
            } else if (xek.e(this.m)) {
                window.setGravity(17);
                b(attributes, displayMetrics);
            } else if (e == 2) {
                window.setGravity(17);
                c(true, attributes, displayMetrics);
            } else {
                window.setGravity(80);
                c(false, attributes, displayMetrics);
            }
            window.setAttributes(attributes);
        }
        HwDatePicker hwDatePicker = this.d;
        if (hwDatePicker != null) {
            hwDatePicker.a();
        }
    }

    public void e(int i, int i2) {
        HwDatePicker hwDatePicker = this.d;
        if (hwDatePicker == null) {
            return;
        }
        hwDatePicker.e(i, i2);
    }

    public void e(boolean z) {
        HwDatePicker hwDatePicker = this.d;
        if (hwDatePicker != null) {
            hwDatePicker.setmIsSupportLunarSwitch(z);
        }
    }

    public void e(boolean z, String str) {
        if (str == null) {
            this.n = false;
        } else {
            this.n = z;
        }
        if (this.n) {
            this.l = str;
        }
    }

    @Override // com.huawei.uikit.hwdatepicker.widget.HwDatePicker.OnDateChangedListener
    public void onDateChanged(HwDatePicker hwDatePicker, int i, int i2, int i3, GregorianCalendar gregorianCalendar) {
        HwDatePicker hwDatePicker2 = this.d;
        if (hwDatePicker2 == null) {
            return;
        }
        hwDatePicker2.b(i, i2, i3, this);
        if (this.s) {
            return;
        }
        b(e(i2, i3, gregorianCalendar));
    }

    @Override // android.app.Dialog
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        try {
            int i = bundle.getInt("year", 1);
            int i2 = bundle.getInt("month", 0);
            int i3 = bundle.getInt("day", 1);
            if (this.t == null) {
                this.t = new GregorianCalendar();
            }
            this.t.set(i, i2, i3);
            HwDatePicker hwDatePicker = this.d;
            if (hwDatePicker != null) {
                hwDatePicker.b(i, i2, i3, this);
                this.d.setLunarOrWestern(this.g);
            }
            boolean z = bundle.getBoolean("is_support_lunar_switch", false);
            boolean z2 = bundle.getBoolean("is_western", true);
            boolean z3 = bundle.getBoolean("is_show_all_years", true);
            HwDatePicker hwDatePicker2 = this.d;
            if (hwDatePicker2 != null) {
                hwDatePicker2.setmIsSupportLunarSwitch(z);
                this.d.setmIsWestern(z2);
                this.d.setIsShowAllYears(z3);
            }
            if (this.s) {
                return;
            }
            String string = bundle.getString("dialog_title", null);
            if (string == null) {
                string = e(i2, i3, this.t);
            }
            b(string);
        } catch (BadParcelableException unused) {
            Log.e(f29393a, "onRestoreInstanceState: Bad parcel target.");
        }
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        HwTextView hwTextView;
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        try {
            HwDatePicker hwDatePicker = this.d;
            boolean z = true;
            int year = hwDatePicker == null ? 1 : hwDatePicker.getYear();
            HwDatePicker hwDatePicker2 = this.d;
            int month = hwDatePicker2 == null ? 1 : hwDatePicker2.getMonth();
            HwDatePicker hwDatePicker3 = this.d;
            int dayOfMonth = hwDatePicker3 == null ? 1 : hwDatePicker3.getDayOfMonth();
            bundleOnSaveInstanceState.putInt("year", year);
            bundleOnSaveInstanceState.putInt("month", month);
            bundleOnSaveInstanceState.putInt("day", dayOfMonth);
            HwDatePicker hwDatePicker4 = this.d;
            boolean z2 = hwDatePicker4 != null && hwDatePicker4.c();
            HwDatePicker hwDatePicker5 = this.d;
            boolean z3 = hwDatePicker5 != null && hwDatePicker5.h();
            HwDatePicker hwDatePicker6 = this.d;
            if (hwDatePicker6 == null || !hwDatePicker6.b()) {
                z = false;
            }
            bundleOnSaveInstanceState.putBoolean("is_support_lunar_switch", z2);
            bundleOnSaveInstanceState.putBoolean("is_western", z3);
            bundleOnSaveInstanceState.putBoolean("is_show_all_years", z);
            if (!this.s && (hwTextView = this.h) != null) {
                bundleOnSaveInstanceState.putString("dialog_title", hwTextView.getText().toString());
                return bundleOnSaveInstanceState;
            }
        } catch (BadParcelableException unused) {
            Log.e(f29393a, "onSaveInstanceState: Bad parcel target.");
        }
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected void onStart() {
        c();
    }

    @Override // android.app.Dialog
    protected void onStop() {
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        setContentView(this.q);
        e();
        d();
    }

    public HwDatePickerDialog(Activity activity, int i, OnButtonClickCallback onButtonClickCallback, GregorianCalendar gregorianCalendar) {
        super(activity, i);
        this.g = false;
        this.n = false;
        this.l = null;
        this.f29394b = onButtonClickCallback;
        Context context = getContext();
        this.f29395c = context;
        this.m = activity;
        e = context.getResources().getConfiguration().orientation;
        this.s = this.f29395c.getResources().getInteger(R.integer.emui_device_type) == 2;
        n();
        this.q.post(new b(getContext().getResources().getDimensionPixelSize(R.dimen.emui_corner_radius_dialog), new TypedValue()));
        m();
        setIcon(0);
        if (gregorianCalendar == null) {
            this.t = new GregorianCalendar();
        } else {
            this.t = gregorianCalendar;
        }
        this.d.b(this.t.get(1), this.t.get(2), this.t.get(5), this);
        p();
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        dismiss();
        HwDatePicker hwDatePicker = this.d;
        if (hwDatePicker == null || this.f29394b == null) {
            return;
        }
        hwDatePicker.clearFocus();
        this.f29394b.onPositiveButtonClick(this.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if ((e != 2 || xdc.e(this.m) || xdc.d()) && Float.compare(xfu.d(this.f29395c), 2.0f) >= 0) {
            this.f.removeView(this.k);
            this.f.addView(this.k);
            e(this.o);
            e(this.k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        dismiss();
        HwDatePicker hwDatePicker = this.d;
        if (hwDatePicker == null || this.f29394b == null) {
            return;
        }
        hwDatePicker.clearFocus();
        this.f29394b.onNegativeButtonClick(this.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if ((e != 2 || xdc.e(this.m) || xdc.d()) && Float.compare(xfu.d(this.f29395c), 2.0f) >= 0) {
            this.f.removeView(this.o);
            this.f.addView(this.o);
            e(this.o);
            e(this.k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean k() {
        if (Float.compare(xfu.d(this.f29395c), 1.75f) < 0) {
            return true;
        }
        return this.f29395c.getResources().getString(R.string.discard_label).contentEquals(this.k.getText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean l() {
        if (Float.compare(xfu.d(this.f29395c), 1.75f) < 0) {
            return true;
        }
        return this.f29395c.getResources().getString(R.string.dialog_button_done_new).contentEquals(this.o.getText());
    }

    private void m() {
        if (this.s) {
            return;
        }
        i();
        this.o.setOnClickListener(new c());
        this.k.setOnClickListener(new a());
    }

    private void n() {
        View viewInflate = View.inflate(this.f29395c, R.layout.hwdatepicker_dialog, null);
        this.q = viewInflate;
        this.j = (LinearLayout) viewInflate.findViewById(R.id.hwdatepicker_dialog_title_layout);
        this.i = (LinearLayout) this.q.findViewById(R.id.hwdatepicker_dialog_content_layout);
        this.f = (LinearLayout) this.q.findViewById(R.id.hwdatepicker_dialog_button_layout);
        this.h = (HwTextView) this.q.findViewById(R.id.hwdatepicker_dialog_title);
        this.d = (HwDatePicker) this.q.findViewById(R.id.hwdatepicker_dialog_date_picker);
        this.o = (HwTextView) this.q.findViewById(R.id.hwdatepicker_dialog_positive_btn);
        this.k = (HwTextView) this.q.findViewById(R.id.hwdatepicker_dialog_negative_btn);
    }

    private void o() {
        if (!xfu.c(this.f29395c)) {
            Log.i(f29393a, "limitButtonLayout: !AuxiliaryHelper.isAuxiliaryDevice(mThemeContext)");
            return;
        }
        if (Float.compare(xfu.d(this.f29395c), 1.75f) >= 0 && !xfu.a(this.f29395c)) {
            this.o.setMaxLines(2);
            this.k.setMaxLines(2);
            this.o.setAutoTextInfo(13, 16, 2);
            this.k.setAutoTextInfo(13, 16, 2);
            b(this.o);
            b(this.k);
            if ((e != 2 || xdc.e(this.m) || xdc.d()) && Float.compare(xfu.d(this.f29395c), 2.0f) >= 0) {
                this.f.setOrientation(1);
                this.q.findViewById(R.id.hwdatepicker_dialog_split_line).setVisibility(8);
                this.f.removeView(this.k);
                this.f.addView(this.k);
                e(this.o);
                e(this.k);
                if (this.f.getLayoutParams() instanceof LinearLayout.LayoutParams) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f.getLayoutParams();
                    layoutParams.weight = 0.0f;
                    layoutParams.height = -2;
                    layoutParams.width = -1;
                    this.f.setLayoutParams(layoutParams);
                }
            }
        }
    }

    private void b(View view) {
        if (view.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            layoutParams.topMargin = (int) TypedValue.applyDimension(1, 8.0f, this.f29395c.getResources().getDisplayMetrics());
            layoutParams.bottomMargin = (int) TypedValue.applyDimension(1, 8.0f, this.f29395c.getResources().getDisplayMetrics());
            view.setLayoutParams(layoutParams);
        }
    }

    private void e(View view) {
        if (view.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            layoutParams.weight = 0.0f;
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
            layoutParams.topMargin = (int) TypedValue.applyDimension(1, 8.0f, this.f29395c.getResources().getDisplayMetrics());
            layoutParams.bottomMargin = 0;
            if (view == this.f.getChildAt(2)) {
                layoutParams.bottomMargin = (int) TypedValue.applyDimension(1, 8.0f, this.f29395c.getResources().getDisplayMetrics());
            }
            layoutParams.height = -2;
            layoutParams.width = -1;
            view.setLayoutParams(layoutParams);
        }
    }

    private void i() {
        if (Float.compare(xfu.d(this.f29395c), 1.75f) >= 0 && xfu.c(this.f29395c) && !xfu.a(this.f29395c)) {
            this.o.setText(R.string.dialog_button_next_step);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(WindowManager.LayoutParams layoutParams, DisplayMetrics displayMetrics) {
        Activity activity = this.m;
        if (activity == null || layoutParams == null || displayMetrics == null) {
            return;
        }
        layoutParams.width = Math.min((int) activity.getResources().getDimension(R.dimen.hwdatepicker_alert_dialog_width_in_tablet), displayMetrics.widthPixels);
    }

    private int d(Activity activity) {
        return xdf.a(activity) ? 65558 : 98326;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(WindowManager.LayoutParams layoutParams, DisplayMetrics displayMetrics) {
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

    private String e(int i, int i2, GregorianCalendar gregorianCalendar) {
        HwDatePicker hwDatePicker = this.d;
        if (hwDatePicker == null) {
            return "";
        }
        if (!this.n) {
            if (hwDatePicker.e()) {
                if (!this.d.b() && !this.d.h()) {
                    String displayedString = this.d.getDisplayedString();
                    String[] strArr = xek.e;
                    int i3 = gregorianCalendar.get(7) - 1;
                    StringBuilder sb = new StringBuilder();
                    sb.append(displayedString);
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    sb.append(strArr[i3]);
                    return sb.toString();
                }
                return DateUtils.formatDateTime(this.m, gregorianCalendar.getTimeInMillis(), d(this.m));
            }
            if (this.d.h()) {
                String[] shortMonths = this.d.getShortMonths();
                String[] shortMonthDays = this.d.getShortMonthDays();
                return shortMonths[i % shortMonths.length] + shortMonthDays[(i2 - 1) % shortMonthDays.length];
            }
            String[] strArr2 = xfa.d;
            String[] strArr3 = xfa.e;
            return strArr2[(i - 1) % strArr2.length] + strArr3[(i2 - 1) % strArr3.length];
        }
        return this.l;
    }
}
