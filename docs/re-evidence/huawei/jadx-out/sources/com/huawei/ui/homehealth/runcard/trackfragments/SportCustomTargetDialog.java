package com.huawei.ui.homehealth.runcard.trackfragments;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.ConfigMapDefValues;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.edittext.HealthEditText;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.homehealth.R;
import defpackage.lmf;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes17.dex */
public class SportCustomTargetDialog extends BaseDialog {
    public SportCustomTargetDialog(Context context) {
        super(context);
    }

    public SportCustomTargetDialog(Context context, int i) {
        super(context, i);
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f25901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Context f25902b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthEditText f25903c;
        private HealthButton d;
        private HealthTextView e;
        private double h;
        private int j = 0;
        private int i = 0;
        private String f = null;
        private int g = 258;

        public c(Context context, Handler handler) {
            this.f25902b = context;
            this.f25901a = handler;
        }

        public void e(double d) {
            this.h = d;
        }

        public SportCustomTargetDialog d(int i, int i2) {
            this.j = i;
            Object systemService = this.f25902b.getSystemService("layout_inflater");
            if (!(systemService instanceof LayoutInflater)) {
                LogUtil.a("Track_SportCustomTargetDialog", "object is not instanceof Inflater");
                return null;
            }
            View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.sport_dialog_custom_target_item, (ViewGroup) null);
            this.g = i2;
            HealthButton healthButton = (HealthButton) viewInflate.findViewById(R.id.ok);
            this.d = healthButton;
            healthButton.setEnabled(false);
            d(i, viewInflate, i2);
            HealthButton healthButton2 = (HealthButton) viewInflate.findViewById(R.id.cancel);
            final SportCustomTargetDialog sportCustomTargetDialog = new SportCustomTargetDialog(this.f25902b, R.style.TrackDialog);
            healthButton2.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportCustomTargetDialog.c.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    sportCustomTargetDialog.dismiss();
                }
            });
            this.f25903c.addTextChangedListener(new TextWatcher() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportCustomTargetDialog.c.3
                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    if (editable == null) {
                        return;
                    }
                    if (!TextUtils.isEmpty(editable.toString())) {
                        c.this.d.setEnabled(true);
                    } else {
                        c.this.d.setEnabled(false);
                    }
                    c.this.e(editable);
                    c.this.a(editable);
                }
            });
            b(sportCustomTargetDialog);
            sportCustomTargetDialog.addContentView(viewInflate, new ViewGroup.LayoutParams(-1, -2));
            sportCustomTargetDialog.setContentView(viewInflate);
            return sportCustomTargetDialog;
        }

        private void b(final SportCustomTargetDialog sportCustomTargetDialog) {
            this.d.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportCustomTargetDialog.c.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    float f;
                    c.this.b();
                    float fA = c.this.a();
                    int i = c.this.i;
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 5 && c.this.d(5, fA)) {
                                    c.this.e(false);
                                    return;
                                }
                            } else {
                                if (c.this.d(2, fA)) {
                                    c.this.e(false);
                                    return;
                                }
                                f = 1000.0f;
                            }
                        } else if (c.this.d(1, fA)) {
                            c.this.e(false);
                            return;
                        } else if (UnitUtil.f()) {
                            fA = (float) UnitUtil.c(fA, 3);
                            c.this.f = fA + "";
                        }
                        c.this.e(fA, sportCustomTargetDialog);
                    }
                    if (c.this.d(0, fA)) {
                        c.this.e(false);
                        return;
                    }
                    f = 60.0f;
                    fA *= f;
                    c.this.e(fA, sportCustomTargetDialog);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            this.i = this.j;
            String strReplaceAll = this.f25903c.getText().toString().trim().replaceAll(",", "");
            this.f = strReplaceAll;
            if (TextUtils.isEmpty(strReplaceAll)) {
                c();
            } else {
                if (this.i != 1 || d(this.f)) {
                    return;
                }
                e(false);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float a() {
            try {
                return Float.parseFloat(this.f);
            } catch (NumberFormatException e) {
                LogUtil.e("Track_SportCustomTargetDialog", e.getMessage());
                return 0.0f;
            }
        }

        private void c() {
            Context context = this.f25902b;
            if (context == null) {
                LogUtil.a("Track_SportCustomTargetDialog", "mContext is null");
            } else {
                this.e.setTextColor(context.getResources().getColor(R.color.colorError));
                this.d.setEnabled(false);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(float f, SportCustomTargetDialog sportCustomTargetDialog) {
            Handler handler = this.f25901a;
            if (handler == null) {
                LogUtil.a("Track_SportCustomTargetDialog", "mHandler is null");
                return;
            }
            Message messageObtainMessage = handler.obtainMessage(1, this.i, 0, Float.valueOf(f));
            LogUtil.a("Track_SportCustomTargetDialog", " mTargetType = ", Integer.valueOf(this.i), " mTargetValueString = ", Float.valueOf(f));
            this.f25901a.sendMessage(messageObtainMessage);
            a((int) f);
            sportCustomTargetDialog.dismiss();
        }

        private void a(int i) {
            HashMap map = new HashMap(2);
            map.put("click", 1);
            map.put("goalType", Integer.valueOf(this.i));
            if (!Utils.o()) {
                map.put("goalValue", Integer.valueOf(i));
            }
            lmf.d().c(this.f25902b, AnalyticsValue.BI_TRACK_SPORT_GOAL_ACTION_KEY.value(), map, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean d(int i, float f) {
            int i2;
            float f2;
            if (i == 0) {
                return f < 10.0f || f > 1440.0f;
            }
            if (i != 1) {
                if (i == 2) {
                    return f < 100.0f || f > 5000.0f;
                }
                if (i != 5) {
                    return false;
                }
                return f < 50.0f || f > 10000.0f;
            }
            if (UnitUtil.f()) {
                i2 = 62;
                f2 = 0.06f;
            } else {
                i2 = 100;
                f2 = 0.1f;
            }
            if (this.g == 259) {
                i2 *= 2;
            }
            return f < f2 || f > ((float) i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(Editable editable) {
            if (this.d.isEnabled() || TextUtils.isEmpty(editable)) {
                return;
            }
            if (this.i != 1 || d(editable.toString())) {
                float f = CommonUtil.f(editable.toString());
                int i = this.i;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            if (d(2, f)) {
                                return;
                            }
                        } else if (i == 5 && d(5, f)) {
                            return;
                        }
                    } else if (d(1, f)) {
                        return;
                    }
                } else if (d(0, f)) {
                    return;
                }
                e(true);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(Editable editable) {
            if (this.j == 1) {
                String string = editable.toString();
                if (string.length() > 1 && !d(string)) {
                    editable.delete(string.length() - 1, string.length());
                    return;
                }
                int iC = c(string);
                if (iC >= 0 && (string.length() - iC) - 1 > 2) {
                    editable.delete(iC + 3, iC + 4);
                }
            }
        }

        private void d(int i, View view, int i2) {
            String strB;
            HealthEditText healthEditText = (HealthEditText) view.findViewById(R.id.custom_target_editText);
            this.f25903c = healthEditText;
            healthEditText.setInputType(2);
            new Timer("Track_SportCustomTargetDialog").schedule(new TimerTask() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportCustomTargetDialog.c.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    Object systemService = c.this.f25903c.getContext().getSystemService("input_method");
                    if (systemService instanceof InputMethodManager) {
                        ((InputMethodManager) systemService).showSoftInput(c.this.f25903c, 0);
                    } else {
                        LogUtil.a("Track_SportCustomTargetDialog", "object is not instanceof InputMethodManager");
                    }
                }
            }, 300L);
            HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.custom_target_unit);
            this.e = (HealthTextView) view.findViewById(R.id.custom_target_tip);
            String string = this.f25902b.getResources().getString(R.string.IDS_start_track_target_custom_valid_range);
            HealthTextView healthTextView2 = (HealthTextView) view.findViewById(R.id.dialog_title);
            if (i == 0) {
                strB = b(healthTextView2, healthTextView, string);
            } else if (i == 1) {
                strB = c(i2, healthTextView2, healthTextView);
            } else if (i == 2) {
                strB = d(healthTextView2, healthTextView, string);
            } else {
                strB = i != 5 ? null : e(healthTextView2, healthTextView, this.f25902b.getResources().getString(R.string.IDS_track_skip_input_range_tips));
            }
            e();
            if (strB != null) {
                this.e.setText(strB);
            }
        }

        private void e() {
            String strE;
            double d = this.h;
            if (d == -1.0d || Math.abs(d) <= 1.0E-6d) {
                return;
            }
            int i = this.j;
            if (i == 0) {
                strE = UnitUtil.e(this.h / 60.0d, 1, 0);
            } else if (i == 1) {
                if (UnitUtil.f()) {
                    this.h = (float) UnitUtil.e(this.h, 3);
                }
                strE = UnitUtil.e(this.h, 1, 2);
            } else if (i == 2) {
                strE = UnitUtil.e(this.h / 1000.0d, 1, 0);
            } else {
                strE = i != 5 ? "" : UnitUtil.e(this.h, 1, 0);
            }
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            this.f25903c.setText(strE.replaceAll(",", "."));
            this.f25903c.setSelection(strE.length() - 1);
            this.d.setEnabled(true);
        }

        private String b(HealthTextView healthTextView, HealthTextView healthTextView2, String str) {
            b(4);
            String string = this.f25902b.getResources().getString(R.string.IDS_min);
            healthTextView2.setText(string);
            healthTextView.setText(this.f25902b.getResources().getString(R.string.IDS_start_track_target_type_time));
            return String.format(str, 10, Integer.valueOf(ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL), string).replace("1440", UnitUtil.e(1440.0d, 1, 0));
        }

        private String c(int i, HealthTextView healthTextView, HealthTextView healthTextView2) {
            int i2;
            int i3;
            String str;
            String string = this.f25902b.getResources().getString(R.string.IDS_start_track_target_custom_valid_range_float);
            if (LanguageUtil.l(this.f25902b.getApplicationContext())) {
                SpannableString spannableString = new SpannableString(this.f25902b.getResources().getString(R.string.IDS_start_track_target_custom_valid_range_hint));
                spannableString.setSpan(new AbsoluteSizeSpan(15, true), 0, spannableString.length(), 33);
                this.f25903c.setHint(new SpannedString(spannableString));
            }
            b(6);
            if (i == 259) {
                i2 = 200;
                i3 = 124;
            } else {
                i2 = 100;
                i3 = 62;
            }
            String strE = UnitUtil.e(0.10000000149011612d, 1, 1);
            String strE2 = UnitUtil.e(0.05999999865889549d, 1, 2);
            if (UnitUtil.f()) {
                String string2 = this.f25902b.getResources().getString(R.string.IDS_band_data_sport_distance_unit_en);
                healthTextView2.setText(string2);
                healthTextView.setText(this.f25902b.getResources().getString(R.string.IDS_sport_distance));
                str = String.format(string, strE2, Integer.valueOf(i3), string2);
            } else {
                String string3 = this.f25902b.getResources().getString(R.string.IDS_band_data_sport_distance_unit);
                healthTextView2.setText(string3);
                healthTextView.setText(this.f25902b.getResources().getString(R.string.IDS_sport_distance));
                str = String.format(string, strE, Integer.valueOf(i2), string3);
            }
            this.f25903c.setInputType(8194);
            return str;
        }

        private String d(HealthTextView healthTextView, HealthTextView healthTextView2, String str) {
            b(4);
            String string = this.f25902b.getResources().getString(R.string.IDS_band_data_sport_energy_unit);
            healthTextView2.setText(string);
            healthTextView.setText(this.f25902b.getResources().getString(R.string.IDS_start_track_target_type_calorie));
            return String.format(str, 100, 5000, string).replace("5000", UnitUtil.e(5000.0d, 1, 0));
        }

        private String e(HealthTextView healthTextView, HealthTextView healthTextView2, String str) {
            b(5);
            String quantityString = this.f25902b.getResources().getQuantityString(R.plurals.IDS_indoor_skipper_number_unit_value, 50, "");
            if (!TextUtils.isEmpty(quantityString)) {
                healthTextView2.setText(quantityString);
                healthTextView2.setVisibility(0);
            }
            healthTextView.setText(this.f25902b.getResources().getString(R.string.IDS_track_skip_jump_number));
            if (LanguageUtil.l(this.f25902b.getApplicationContext())) {
                SpannableString spannableString = new SpannableString(this.f25902b.getResources().getString(R.string.IDS_track_skip_enter_number));
                spannableString.setSpan(new AbsoluteSizeSpan(15, true), 0, spannableString.length(), 33);
                this.f25903c.setHint(new SpannedString(spannableString));
                this.f25903c.setInputType(2);
            }
            return String.format(str, UnitUtil.e(50.0d, 1, 0), UnitUtil.e(10000.0d, 1, 0), quantityString);
        }

        public void e(boolean z) {
            if (z) {
                Context context = this.f25902b;
                if (context == null) {
                    LogUtil.a("Track_SportCustomTargetDialog", "mContext is null");
                    return;
                } else {
                    this.e.setTextColor(context.getResources().getColor(R.color.textColorSecondary));
                    this.d.setEnabled(true);
                    return;
                }
            }
            c();
        }

        public void b(int i) {
            if (i > 0) {
                this.f25903c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
            }
        }

        public static boolean d(String str) {
            LogUtil.a("Track_SportCustomTargetDialog", " isNumber = ", str, " , isInteger is ", Boolean.valueOf(a(str)), " ,isFloat is ", Boolean.valueOf(b(str)));
            return a(str) || b(str);
        }

        public static boolean a(String str) {
            try {
                Integer.parseInt(str);
                return true;
            } catch (NumberFormatException unused) {
                return false;
            }
        }

        public static boolean b(String str) {
            try {
                Float.parseFloat(str);
                return true;
            } catch (NumberFormatException unused) {
                return false;
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
    }
}
