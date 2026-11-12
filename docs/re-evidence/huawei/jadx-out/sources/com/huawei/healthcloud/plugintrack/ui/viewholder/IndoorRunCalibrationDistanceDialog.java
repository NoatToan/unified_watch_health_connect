package com.huawei.healthcloud.plugintrack.ui.viewholder;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.edittext.HealthEditText;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.jxk;
import defpackage.qre;
import health.compact.a.CommonUtil;
import health.compact.a.UnitUtil;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes10.dex */
public class IndoorRunCalibrationDistanceDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f11390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CustomViewDialog f11391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f11392c;
    private CustomViewDialog.Builder d;
    private HealthEditText e;
    private IndoorRunCalibrationDistanceInterface f;
    private float g;
    private float h;
    private HealthTextView i;
    private float j;
    private IndoorRunCalibrationDistanceInterface k;
    private String l = null;
    private String m;
    private final Context n;
    private HealthButton o;

    public interface IndoorRunCalibrationDistanceInterface {
        void onClick(Dialog dialog, float f);
    }

    public IndoorRunCalibrationDistanceDialog(Context context, Context context2, float f) {
        this.f11392c = context;
        this.n = context2 != null ? context2 : context;
        this.h = f;
        b();
        c();
        a();
    }

    private void b() {
        View viewInflate = View.inflate(this.f11392c, R.layout.dialog_indoor_run_calibration_distance, null);
        this.f11390a = viewInflate;
        HealthEditText healthEditText = (HealthEditText) viewInflate.findViewById(R.id.custom_target_editText);
        this.e = healthEditText;
        healthEditText.setTextColor(qre.e(this.n, R.color.hwedittext_selector_text_color));
        this.e.setInputType(8194);
        new Timer("Track_IndoorRunCalibrationDistanceDialog").schedule(new TimerTask() { // from class: com.huawei.healthcloud.plugintrack.ui.viewholder.IndoorRunCalibrationDistanceDialog.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                Object systemService = IndoorRunCalibrationDistanceDialog.this.e.getContext().getSystemService("input_method");
                if (!(systemService instanceof InputMethodManager)) {
                    LogUtil.a("Track_IndoorRunCalibrationDistanceDialog", "object is not instanceof InputMethodManager");
                } else {
                    ((InputMethodManager) systemService).showSoftInput(IndoorRunCalibrationDistanceDialog.this.e, 0);
                }
            }
        }, 300L);
        HealthTextView healthTextView = (HealthTextView) this.f11390a.findViewById(R.id.custom_target_tip);
        this.i = healthTextView;
        jxk.e(this.n, healthTextView, R.color.textColorSecondary);
        this.f11390a.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        jxk.e(this.n, (ImageView) this.f11390a.findViewById(R.id.custom_target_under_line), R.color.listDivider);
    }

    private void j() {
        this.e.addTextChangedListener(new TextWatcher() { // from class: com.huawei.healthcloud.plugintrack.ui.viewholder.IndoorRunCalibrationDistanceDialog.3
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (editable == null) {
                    return;
                }
                if (!TextUtils.isEmpty(editable.toString())) {
                    IndoorRunCalibrationDistanceDialog.this.d.a(true);
                } else {
                    IndoorRunCalibrationDistanceDialog.this.d.a(false);
                }
                IndoorRunCalibrationDistanceDialog.this.b(editable);
                IndoorRunCalibrationDistanceDialog.this.c(editable);
            }
        });
    }

    private void a() {
        String strG = g();
        float fRound = (Math.round(Double.parseDouble(String.valueOf(this.h)) * 100.0d) * 1.0f) / 100.0f;
        this.h = fRound;
        String string = Float.toString((float) UnitUtil.d(fRound, 2));
        if (!TextUtils.isEmpty(string) && string.length() <= 6) {
            this.e.setText(string);
            this.e.setSelection(string.length());
            this.e.requestFocus();
            this.d.a(true);
        }
        if (strG != null) {
            this.i.setText(strG);
        }
    }

    private void c() {
        Resources resources = BaseApplication.getContext().getResources();
        if (resources == null) {
            LogUtil.j("Track_IndoorRunCalibrationDistanceDialog", "initData resources is null");
            return;
        }
        this.m = resources.getString(R.string.IDS_indoor_run_confirm_distance);
        CustomViewDialog.Builder builderE = new CustomViewDialog.Builder(this.f11392c).c(this.n).e(true);
        this.d = builderE;
        builderE.c(false);
        CustomViewDialog customViewDialogD = this.d.d(this.f11390a).a(this.m).c(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.viewholder.IndoorRunCalibrationDistanceDialog.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Track_IndoorRunCalibrationDistanceDialog", "dialog cancel");
                if (IndoorRunCalibrationDistanceDialog.this.f != null) {
                    IndoorRunCalibrationDistanceDialog.this.f.onClick(IndoorRunCalibrationDistanceDialog.this.f11391b, 0.0f);
                }
            }
        }).d(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.viewholder.IndoorRunCalibrationDistanceDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Track_IndoorRunCalibrationDistanceDialog", "dialog ok");
                IndoorRunCalibrationDistanceDialog indoorRunCalibrationDistanceDialog = IndoorRunCalibrationDistanceDialog.this;
                indoorRunCalibrationDistanceDialog.l = indoorRunCalibrationDistanceDialog.e.getText().toString().trim();
                if (!TextUtils.isEmpty(IndoorRunCalibrationDistanceDialog.this.l)) {
                    if (!IndoorRunCalibrationDistanceDialog.e(IndoorRunCalibrationDistanceDialog.this.l)) {
                        IndoorRunCalibrationDistanceDialog.this.a(false);
                        return;
                    }
                    float f = CommonUtil.f(IndoorRunCalibrationDistanceDialog.this.l);
                    if (IndoorRunCalibrationDistanceDialog.this.b(f)) {
                        IndoorRunCalibrationDistanceDialog.this.a(false);
                        return;
                    } else {
                        if (IndoorRunCalibrationDistanceDialog.this.k != null) {
                            IndoorRunCalibrationDistanceDialog.this.k.onClick(IndoorRunCalibrationDistanceDialog.this.f11391b, f);
                            return;
                        }
                        return;
                    }
                }
                IndoorRunCalibrationDistanceDialog.this.e();
            }
        }).d();
        this.f11391b = customViewDialogD;
        customViewDialogD.setCanceledOnTouchOutside(false);
        j();
        this.o = this.d.b();
    }

    public IndoorRunCalibrationDistanceDialog c(IndoorRunCalibrationDistanceInterface indoorRunCalibrationDistanceInterface) {
        this.k = indoorRunCalibrationDistanceInterface;
        return this;
    }

    public IndoorRunCalibrationDistanceDialog a(IndoorRunCalibrationDistanceInterface indoorRunCalibrationDistanceInterface) {
        this.f = indoorRunCalibrationDistanceInterface;
        return this;
    }

    private String g() {
        String quantityString;
        a(6);
        float f = this.h;
        float f2 = 0.35f * f;
        this.j = (float) UnitUtil.d(f - f2, 2);
        this.g = (float) UnitUtil.d(this.h + f2, 2);
        if (UnitUtil.f()) {
            if (this.j < 0.07f) {
                this.j = 0.07f;
            }
            if (this.g > 620.0f) {
                this.g = 620.0f;
            }
        } else {
            if (this.j < 0.1f) {
                this.j = 0.1f;
            }
            if (this.g > 999.99f) {
                this.g = 999.99f;
            }
        }
        String strE = UnitUtil.e(this.j, 1, 2);
        String strE2 = UnitUtil.e(this.g, 1, 2);
        if (UnitUtil.f()) {
            quantityString = this.f11392c.getResources().getQuantityString(R.plurals.IDS_indoor_run_mi, (int) this.g, strE2);
        } else {
            quantityString = this.f11392c.getResources().getQuantityString(R.plurals.IDS_indoor_run_km, (int) this.g, strE2);
        }
        String str = String.format(Locale.ENGLISH, this.f11392c.getResources().getString(R.string.IDS_indoor_run_end_valid_range), strE, quantityString);
        this.e.setInputType(8194);
        return str;
    }

    public void a(int i) {
        if (i > 0) {
            this.e.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Editable editable) {
        if (this.o.isEnabled() || TextUtils.isEmpty(editable) || !e(editable.toString()) || b(CommonUtil.f(editable.toString()))) {
            return;
        }
        a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        if (z) {
            if (this.f11392c == null) {
                LogUtil.e("Track_IndoorRunCalibrationDistanceDialog", "mContext is null");
                return;
            } else {
                jxk.e(this.n, this.i, R.color.textColorSecondary);
                this.d.a(true);
                return;
            }
        }
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.f11392c == null) {
            LogUtil.e("Track_IndoorRunCalibrationDistanceDialog", "mContext is null");
        } else {
            jxk.e(this.n, this.i, R.color.colorError);
            this.d.a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(float f) {
        LogUtil.a("Track_IndoorRunCalibrationDistanceDialog", "isValueInRange tmpValue:", Float.valueOf(f));
        return f < this.j || f > this.g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Editable editable) {
        String string = editable.toString();
        if (string.length() > 1 && !e(string)) {
            editable.delete(string.length() - 1, string.length());
            return;
        }
        int iC = c(string);
        if (iC >= 0 && (string.length() - iC) - 1 > 2) {
            editable.delete(iC + 3, iC + 4);
        }
    }

    public static int c(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        char[] charArray = str.toCharArray();
        int i = 0;
        while (i < charArray.length) {
            int i2 = i + 1;
            if (!a(str.substring(i, i2))) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e(String str) {
        LogUtil.a("Track_IndoorRunCalibrationDistanceDialog", " isNumber = ", str, " , isInteger is ", Boolean.valueOf(a(str)), " ,isFloat is ", Boolean.valueOf(d(str)));
        return a(str) || d(str);
    }

    private static boolean a(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    private static boolean d(String str) {
        try {
            Float.parseFloat(str);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public void d() {
        CustomViewDialog customViewDialog = this.f11391b;
        if (customViewDialog == null || customViewDialog.isShowing()) {
            return;
        }
        this.f11391b.show();
    }
}
