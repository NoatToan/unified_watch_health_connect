package com.huawei.health.ecologydevice.manager;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.ecologydevice.R;
import com.huawei.health.ecologydevice.callback.PickerChooseCallback;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.edittext.HealthEditText;
import com.huawei.ui.commonui.edittext.HealthErrorTipTextLayout;
import com.huawei.ui.commonui.numberpicker.HealthMultiNumberPicker;
import com.huawei.ui.commonui.numberpicker.HealthNumberPicker;
import defpackage.qpx;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.UnitUtil;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class EcologyDevicePickerManager implements HealthMultiNumberPicker.OnValueChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f6527a;
    private final String ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f6528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f6529c;
    private CustomViewDialog d;
    private final Context e;
    private int f;
    private final int g;
    private int h;
    private double i;
    private int j;
    private int k;
    private final int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private CustomViewDialog r;
    private int s;
    private final int t;
    private double u;
    private final PickerChooseCallback v;
    private CustomViewDialog w;
    private int[] x = {0, 0};
    private int y;

    private boolean c(int i, int i2, int i3, int i4) {
        return (i == i3 && i2 == i4) ? false : true;
    }

    public EcologyDevicePickerManager(Builder builder) {
        this.e = builder.f6533b;
        this.f6527a = builder.d;
        this.f6528b = builder.f6532a;
        this.f6529c = builder.f6534c;
        this.ad = builder.g;
        this.g = builder.e;
        this.l = builder.f;
        this.t = builder.h;
        this.i = builder.j;
        this.v = builder.i;
    }

    public void e(final int[] iArr, final int i, final int i2, int i3) {
        if (this.e == null) {
            LogUtil.j("EcologyDevicePickerManager", "showNormalPickerDialog() mContext == null");
            return;
        }
        CustomViewDialog customViewDialog = this.w;
        if (customViewDialog != null) {
            customViewDialog.show();
            return;
        }
        if (iArr == null || iArr.length == 0) {
            LogUtil.j("EcologyDevicePickerManager", "showNormalPickerDialog() numbers array is null or length is 0");
            return;
        }
        this.y = i;
        String[] strArrA = a(iArr, i2);
        if (i3 > strArrA.length - 1 || i3 < 0) {
            LogUtil.j("EcologyDevicePickerManager", "showNormalPickerDialog() defalutSelectIndex is outOfIndex");
            i3 = 0;
        }
        HealthNumberPicker healthNumberPickerD = d(strArrA, i3);
        healthNumberPickerD.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        healthNumberPickerD.setOnValuePickedListener(new HealthNumberPicker.OnPickedListener() { // from class: eko
            @Override // com.huawei.ui.commonui.numberpicker.HealthNumberPicker.OnPickedListener
            public final void onValuePicked(int i4, int i5) {
                this.d.e(i4, i5);
            }
        });
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.e);
        builder.d(healthNumberPickerD);
        builder.a(this.ad);
        builder.d(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: ekq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f33083a.c(i, i2, iArr, view);
            }
        });
        builder.c(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: ekm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f33081c.a(view);
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        this.w = customViewDialogD;
        customViewDialogD.show();
    }

    public /* synthetic */ void e(int i, int i2) {
        this.s = i2;
    }

    public /* synthetic */ void c(int i, int i2, int[] iArr, View view) {
        a(this.w);
        if (this.s != 0) {
            e(iArr, i);
        } else if (i == 0) {
            c();
        } else {
            e(i2);
        }
    }

    public /* synthetic */ void a(View view) {
        a(this.w);
    }

    private void e(int[] iArr, int i) {
        int iIntValue;
        PickerChooseCallback pickerChooseCallback = this.v;
        if (pickerChooseCallback != null) {
            double d = iArr[this.s - 1];
            this.u = d;
            if (d == -2.0d) {
                this.f6529c = 21.0975d;
            } else if (d == -3.0d) {
                this.f6529c = 42.195d;
            } else {
                this.f6529c = d;
            }
            this.i = 60.0d * d;
            if (i == 1) {
                pickerChooseCallback.onValueSelected(Double.valueOf(d), this.s);
                return;
            }
            if (i == 0) {
                iIntValue = Double.valueOf(d).intValue() * 60;
            } else {
                iIntValue = Double.valueOf(d).intValue();
            }
            pickerChooseCallback.onValueSelected(Integer.valueOf(iIntValue), this.s);
        }
    }

    private HealthNumberPicker d(String[] strArr, int i) {
        HealthNumberPicker healthNumberPicker = new HealthNumberPicker(this.e);
        healthNumberPicker.setDisplayedValues(strArr);
        healthNumberPicker.setMaxValue(strArr.length - 1);
        healthNumberPicker.setMinValue(0);
        healthNumberPicker.setValue(i);
        this.s = i;
        healthNumberPicker.setWrapSelectorWheel(false);
        return healthNumberPicker;
    }

    private String[] a(int[] iArr, int i) {
        String[] strArr = new String[iArr.length + 1];
        strArr[0] = this.e.getString(R.string.IDS_start_track_target_custom);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            if (i3 == -2) {
                strArr[i2 + 1] = this.e.getString(R.string.IDS_start_track_show_distance_half_marathon);
            } else if (i3 == -3) {
                strArr[i2 + 1] = this.e.getString(R.string.IDS_start_track_show_distance_marathon);
            } else {
                Resources resources = this.e.getResources();
                int i4 = iArr[i2];
                strArr[i2 + 1] = resources.getQuantityString(i, i4, Integer.valueOf(i4));
            }
        }
        return strArr;
    }

    private void e(int i) {
        View viewInflate = LayoutInflater.from(this.e).inflate(R.layout.skiping_custom_target_item, (ViewGroup) null);
        HealthEditText healthEditText = (HealthEditText) viewInflate.findViewById(R.id.edit);
        c(healthEditText);
        final HealthErrorTipTextLayout healthErrorTipTextLayout = (HealthErrorTipTextLayout) viewInflate.findViewById(R.id.error_tip_text_layout);
        Resources resources = this.e.getResources();
        int i2 = R.string.IDS_start_track_target_custom_valid_range_float;
        healthErrorTipTextLayout.setErrorImmediately(resources.getString(i2, UnitUtil.e(this.f6527a, 1, this.y == 1 ? 1 : 0), Integer.valueOf(Double.valueOf(this.f6528b).intValue()), this.e.getResources().getQuantityString(i, Double.valueOf(this.f6528b).intValue(), "")));
        healthErrorTipTextLayout.setErrorColor(false);
        final CustomViewDialog.Builder builderE = e(this.e, viewInflate);
        this.d.show();
        c(builderE, healthErrorTipTextLayout);
        healthEditText.addTextChangedListener(new TextWatcher() { // from class: com.huawei.health.ecologydevice.manager.EcologyDevicePickerManager.5
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
                if (EcologyDevicePickerManager.this.y == 1) {
                    EcologyDevicePickerManager.this.d(editable);
                }
                String string = editable.toString();
                EcologyDevicePickerManager.this.u = CommonUtil.a(string);
                EcologyDevicePickerManager.this.c(builderE, healthErrorTipTextLayout);
            }
        });
    }

    private void c(HealthEditText healthEditText) {
        String string;
        if (this.y != 1) {
            healthEditText.setInputType(2);
        }
        double d = this.f6529c;
        if (d == 0.0d && this.u == 0.0d) {
            if (this.y == 1) {
                string = this.e.getString(R.string.IDS_start_track_target_custom_valid_range_hint);
            } else {
                string = this.e.getResources().getString(R.string.IDS_indoor_skipper_custom_number, Integer.valueOf(WorkoutRecord.COURSE_TYPE_FREE_RUN));
            }
            healthEditText.setHint(string);
        } else {
            double d2 = this.u;
            if (d2 == 0.0d) {
                this.u = d;
            } else if (d2 == -2.0d) {
                this.u = 21.0975d;
            } else if (d2 == -3.0d) {
                this.u = 42.195d;
            }
            healthEditText.setText(this.y == 1 ? String.valueOf(this.u) : String.valueOf(Double.valueOf(this.u).intValue()));
        }
        int length = String.valueOf(this.f6528b).length();
        InputFilter[] inputFilterArr = new InputFilter[1];
        if (this.y == 1) {
            length++;
        }
        inputFilterArr[0] = new InputFilter.LengthFilter(length);
        healthEditText.setFilters(inputFilterArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(CustomViewDialog.Builder builder, HealthErrorTipTextLayout healthErrorTipTextLayout) {
        double d = this.u;
        boolean z = d <= this.f6528b && d >= this.f6527a;
        healthErrorTipTextLayout.setErrorColor(!z);
        builder.a(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Editable editable) {
        String string = editable.toString();
        if (string.length() > 1 && !c(string)) {
            editable.delete(string.length() - 1, string.length());
            return;
        }
        int iA = a(string);
        if (iA >= 0 && (string.length() - iA) - 1 > 2) {
            editable.delete(iA + 3, iA + 4);
        }
    }

    private static boolean c(String str) {
        return b(str) || e(str);
    }

    private static boolean b(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    private static boolean e(String str) {
        try {
            Float.parseFloat(str);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    private static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        char[] charArray = str.toCharArray();
        int i = 0;
        while (i < charArray.length) {
            int i2 = i + 1;
            if (!b(str.substring(i, i2))) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    private CustomViewDialog.Builder e(Context context, View view) {
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(context);
        builder.d(view);
        builder.b(this.g);
        builder.d(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: ekv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f33087a.c(view2);
            }
        });
        builder.c(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: eku
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f33086c.e(view2);
            }
        });
        this.d = builder.d();
        return builder;
    }

    public /* synthetic */ void c(View view) {
        PickerChooseCallback pickerChooseCallback = this.v;
        if (pickerChooseCallback != null) {
            double d = this.u;
            this.f6529c = d;
            if (this.y == 1) {
                pickerChooseCallback.onValueSelected(Double.valueOf(d), this.s);
            } else {
                pickerChooseCallback.onValueSelected(Integer.valueOf(Double.valueOf(d).intValue()), this.s);
            }
        }
        a(this.d);
    }

    public /* synthetic */ void e(View view) {
        a(this.d);
    }

    public void c() {
        if (this.e == null) {
            LogUtil.j("EcologyDevicePickerManager", "showMutilPickerDialog() mContext == null");
            return;
        }
        if (!e()) {
            LogUtil.e("EcologyDevicePickerManager", "params is error");
            return;
        }
        a();
        final HealthMultiNumberPicker healthMultiNumberPicker = new HealthMultiNumberPicker(BaseApplication.getContext());
        if (this.l < 3600) {
            g(healthMultiNumberPicker);
        } else {
            j(healthMultiNumberPicker);
        }
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.e);
        builder.a(this.ad).d((View) healthMultiNumberPicker).d(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: ekp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.e(healthMultiNumberPicker, view);
            }
        }).c(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: eks
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f33085b.b(view);
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        this.r = customViewDialogD;
        customViewDialogD.show();
    }

    public /* synthetic */ void e(HealthMultiNumberPicker healthMultiNumberPicker, View view) {
        int iB;
        if (this.l < 3600) {
            iB = c(healthMultiNumberPicker);
        } else {
            iB = b(healthMultiNumberPicker);
        }
        if (iB == 0) {
            qpx.e(this.e, R.string.IDS_hwh_input_history_data_fill_complete_information_toast);
            return;
        }
        PickerChooseCallback pickerChooseCallback = this.v;
        if (pickerChooseCallback != null) {
            this.i = iB;
            pickerChooseCallback.onValueSelected(Integer.valueOf(iB), 0);
        }
        a(this.r);
    }

    public /* synthetic */ void b(View view) {
        a(this.r);
    }

    private boolean e() {
        int i;
        int i2 = this.t;
        if (i2 > 0 && (i = this.l) > 0) {
            double d = this.i;
            if (d > 0.0d) {
                if (i2 < 86400 && i < 86400) {
                    return i2 <= i && d <= ((double) i) && d >= ((double) i2);
                }
                LogUtil.e("EcologyDevicePickerManager", "mMinTimeMillis or mMaxTimeMillis bigger than one day");
                return false;
            }
        }
        LogUtil.e("EcologyDevicePickerManager", "mMinTimeMillis or mMaxTimeMillis or mDefaultMillis <= 0");
        return false;
    }

    private void g(HealthMultiNumberPicker healthMultiNumberPicker) {
        this.x = new int[]{0, 0};
        HashMap map = new HashMap(2);
        String[] strArrC = healthMultiNumberPicker.c(this.p, this.o, this.e.getResources().getString(R.string.IDS_min));
        this.x[0] = b(this.f, strArrC);
        String[] strArrI = i(healthMultiNumberPicker);
        this.x[1] = b(this.j, strArrI);
        map.put(0, strArrC);
        map.put(1, strArrI);
        healthMultiNumberPicker.setDataContent(2, map, new boolean[]{true, true}, this.x);
        healthMultiNumberPicker.setOnValueChangeListener(this);
    }

    private String[] i(HealthMultiNumberPicker healthMultiNumberPicker) {
        int i = this.f;
        return healthMultiNumberPicker.c(i == this.p ? this.q : 0, i == this.o ? this.n : 59, this.e.getString(R.string.IDS_second));
    }

    private void j(HealthMultiNumberPicker healthMultiNumberPicker) {
        this.x = new int[3];
        String[] strArrC = healthMultiNumberPicker.c(this.k, this.m, this.e.getString(R.string.IDS_messagecenter_time_hour_value));
        this.x[0] = b(this.h, strArrC);
        String[] strArrH = h(healthMultiNumberPicker);
        this.x[1] = b(this.f, strArrH);
        String[] strArrF = f(healthMultiNumberPicker);
        this.x[2] = b(this.j, strArrF);
        HashMap map = new HashMap(3);
        map.put(0, strArrC);
        map.put(1, strArrH);
        map.put(2, strArrF);
        LogUtil.a("EcologyDevicePickerManager", "showThreePickerDialog() mThreePickerLocation", Arrays.toString(this.x));
        healthMultiNumberPicker.setDataContent(3, map, new boolean[]{true, true, true}, this.x);
        healthMultiNumberPicker.setOnValueChangeListener(this);
    }

    private String[] h(HealthMultiNumberPicker healthMultiNumberPicker) {
        int i = this.h;
        return healthMultiNumberPicker.c(i == this.k ? this.p : 0, i == this.m ? this.o : 59, this.e.getString(R.string.IDS_min));
    }

    private String[] f(HealthMultiNumberPicker healthMultiNumberPicker) {
        int i = this.h;
        return healthMultiNumberPicker.c((i == this.k && this.f == this.p) ? this.q : 0, (i == this.m && this.f == this.o) ? this.n : 59, this.e.getString(R.string.IDS_second));
    }

    private void a() {
        this.m = c(this.l);
        this.o = d(this.l);
        int iA = a(this.l);
        this.n = iA;
        LogUtil.a("EcologyDevicePickerManager", "maxHour is", Integer.valueOf(this.m), " mMaxMinute is ", Integer.valueOf(this.o), " mMaxSecond is ", Integer.valueOf(iA));
        this.k = c(this.t);
        this.p = d(this.t);
        int iA2 = a(this.t);
        this.q = iA2;
        LogUtil.a("EcologyDevicePickerManager", "mMinHour is", Integer.valueOf(this.k), " mMinMinute is ", Integer.valueOf(this.p), " mMinSecond is ", Integer.valueOf(iA2));
        this.h = c(Double.valueOf(this.i).intValue());
        this.f = d(Double.valueOf(this.i).intValue());
        int iA3 = a(Double.valueOf(this.i).intValue());
        this.j = iA3;
        LogUtil.a("EcologyDevicePickerManager", "mDefaultHour is", Integer.valueOf(this.h), " mDefaultMinute is ", Integer.valueOf(this.f), " mDefaultSecond is ", Integer.valueOf(iA3));
    }

    private int c(int i) {
        return i / 3600;
    }

    private int d(int i) {
        return (i % 3600) / 60;
    }

    private int a(int i) {
        return i % 60;
    }

    private int c(HealthMultiNumberPicker healthMultiNumberPicker) {
        int[] selectedLocations = healthMultiNumberPicker.getSelectedLocations();
        if (selectedLocations.length < 2) {
            LogUtil.d("EcologyDevicePickerManager", "the minute and second SelectedLocation Value is empty");
            return 0;
        }
        int i = selectedLocations[0];
        int i2 = selectedLocations[1];
        this.x = selectedLocations;
        return (CommonUtil.j(healthMultiNumberPicker.d(0)[i]) * 60) + CommonUtil.j(healthMultiNumberPicker.d(1)[i2]);
    }

    private int b(HealthMultiNumberPicker healthMultiNumberPicker) {
        int[] selectedLocations = healthMultiNumberPicker.getSelectedLocations();
        if (selectedLocations.length < 3) {
            LogUtil.d("EcologyDevicePickerManager", "hour minute second SelectedLocation Value is empty");
            return 0;
        }
        LogUtil.a("EcologyDevicePickerManager", "formateThreePickerSelectTime selectedLocations is ", Arrays.toString(selectedLocations));
        int i = selectedLocations[0];
        int i2 = selectedLocations[1];
        int i3 = selectedLocations[2];
        this.x = selectedLocations;
        return (CommonUtil.j(healthMultiNumberPicker.d(0)[i]) * 3600) + (CommonUtil.j(healthMultiNumberPicker.d(1)[i2]) * 60) + CommonUtil.j(healthMultiNumberPicker.d(2)[i3]);
    }

    private void d(HealthMultiNumberPicker healthMultiNumberPicker) {
        int[] selectedLocations = healthMultiNumberPicker.getSelectedLocations();
        String[] strArrD = healthMultiNumberPicker.d(0);
        int i = selectedLocations[0];
        if (i == 0) {
            d(healthMultiNumberPicker, 59, this.q);
        } else if (i == strArrD.length - 1) {
            d(healthMultiNumberPicker, this.n, 0);
        } else {
            d(healthMultiNumberPicker, 59, 0);
        }
    }

    private void d(HealthMultiNumberPicker healthMultiNumberPicker, int i, int i2) {
        int[] selectedLocations = healthMultiNumberPicker.getSelectedLocations();
        String[] strArrD = healthMultiNumberPicker.d(1);
        int iJ = CommonUtil.j(strArrD[0]);
        int iJ2 = CommonUtil.j(strArrD[strArrD.length - 1]);
        int i3 = selectedLocations[1];
        if (c(iJ2, iJ, i, i2)) {
            String[] strArrC = healthMultiNumberPicker.c(i2, i, this.e.getString(R.string.IDS_second));
            healthMultiNumberPicker.setDisplayedValues(1, strArrC, b(CommonUtil.j(strArrD[i3]), strArrC));
        }
    }

    private void a(HealthMultiNumberPicker healthMultiNumberPicker) {
        int[] selectedLocations = healthMultiNumberPicker.getSelectedLocations();
        String[] strArrD = healthMultiNumberPicker.d(0);
        String[] strArrD2 = healthMultiNumberPicker.d(1);
        int i = selectedLocations[0];
        int i2 = selectedLocations[1];
        if (CommonUtil.j(strArrD2[i2]) == this.p && i == 0) {
            a(healthMultiNumberPicker, 2, 59, this.q);
        } else if (CommonUtil.j(strArrD2[i2]) == this.o && i == strArrD.length - 1) {
            a(healthMultiNumberPicker, 2, this.n, 0);
        } else {
            a(healthMultiNumberPicker, 2, 59, 0);
        }
    }

    private void e(HealthMultiNumberPicker healthMultiNumberPicker) {
        int[] selectedLocations = healthMultiNumberPicker.getSelectedLocations();
        String[] strArrD = healthMultiNumberPicker.d(0);
        String[] strArrD2 = healthMultiNumberPicker.d(1);
        int i = selectedLocations[0];
        int i2 = selectedLocations[1];
        if (CommonUtil.j(strArrD[i]) == this.m) {
            a(healthMultiNumberPicker, 1, this.o, 0);
            if (CommonUtil.j(strArrD2[i2]) >= this.o) {
                a(healthMultiNumberPicker, 2, this.n, 0);
                return;
            } else {
                a(healthMultiNumberPicker, 2, 59, 0);
                return;
            }
        }
        if (CommonUtil.j(strArrD[i]) == this.k) {
            a(healthMultiNumberPicker, 1, 59, this.p);
            if (CommonUtil.j(strArrD2[i2]) <= this.p) {
                a(healthMultiNumberPicker, 2, 59, this.q);
                return;
            } else {
                a(healthMultiNumberPicker, 2, 59, 0);
                return;
            }
        }
        a(healthMultiNumberPicker, 1, 59, 0);
        a(healthMultiNumberPicker, 2, 59, 0);
    }

    private void a(HealthMultiNumberPicker healthMultiNumberPicker, int i, int i2, int i3) {
        int[] selectedLocations = healthMultiNumberPicker.getSelectedLocations();
        String[] strArrD = healthMultiNumberPicker.d(1);
        String[] strArrD2 = healthMultiNumberPicker.d(2);
        int i4 = selectedLocations[1];
        int i5 = selectedLocations[2];
        int iJ = CommonUtil.j(strArrD[strArrD.length - 1]);
        int iJ2 = CommonUtil.j(strArrD[0]);
        int iJ3 = CommonUtil.j(strArrD2[strArrD2.length - 1]);
        int iJ4 = CommonUtil.j(strArrD2[0]);
        if (i == 1) {
            if (c(iJ, iJ2, i2, i3)) {
                String[] strArrC = healthMultiNumberPicker.c(i3, i2, this.e.getString(R.string.IDS_min));
                healthMultiNumberPicker.setDisplayedValues(i, strArrC, b(CommonUtil.j(strArrD[i4]), strArrC));
                return;
            }
            return;
        }
        if (c(iJ3, iJ4, i2, i3)) {
            String[] strArrC2 = healthMultiNumberPicker.c(i3, i2, this.e.getString(R.string.IDS_second));
            healthMultiNumberPicker.setDisplayedValues(i, strArrC2, b(CommonUtil.j(strArrD2[i5]), strArrC2));
        }
    }

    private int b(int i, String[] strArr) {
        if (i > CommonUtils.j(strArr[strArr.length - 1])) {
            return strArr.length - 1;
        }
        if (i < CommonUtils.j(strArr[0])) {
            return 0;
        }
        return i - CommonUtils.j(strArr[0]);
    }

    private void a(CustomViewDialog customViewDialog) {
        if (customViewDialog != null) {
            customViewDialog.dismiss();
        }
    }

    @Override // com.huawei.ui.commonui.numberpicker.HealthMultiNumberPicker.OnValueChangeListener
    public void onValueChange(int i, HealthMultiNumberPicker healthMultiNumberPicker, int i2, int i3) {
        if (this.l < 3600) {
            d(healthMultiNumberPicker);
            return;
        }
        if (i == 2) {
            return;
        }
        if (i == 0) {
            e(healthMultiNumberPicker);
        } else if (i == 1) {
            a(healthMultiNumberPicker);
        }
    }

    public static class Builder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Context f6533b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private double f6534c;
        private int e;
        private String g;
        private PickerChooseCallback i;
        private double d = 50.0d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private double f6532a = 10000.0d;
        private int f = 86399;
        private int h = 60;
        private int j = 60;

        public Builder(Context context) {
            this.f6533b = context;
        }

        public Builder a(double d) {
            this.d = d;
            return this;
        }

        public Builder e(double d) {
            this.f6532a = d;
            return this;
        }

        public Builder b(double d) {
            this.f6534c = d;
            return this;
        }

        public Builder a(String str) {
            this.g = str;
            return this;
        }

        public Builder c(int i) {
            this.e = i;
            return this;
        }

        public Builder e(int i) {
            this.f = i;
            return this;
        }

        public Builder a(int i) {
            this.h = i;
            return this;
        }

        public Builder d(int i) {
            this.j = i;
            return this;
        }

        public Builder e(PickerChooseCallback pickerChooseCallback) {
            this.i = pickerChooseCallback;
            return this;
        }

        public EcologyDevicePickerManager e() {
            return new EcologyDevicePickerManager(this);
        }
    }
}
