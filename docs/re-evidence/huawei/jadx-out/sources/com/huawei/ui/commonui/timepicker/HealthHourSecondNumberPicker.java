package com.huawei.ui.commonui.timepicker;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.numberpicker.HealthMultiNumberPicker;
import health.compact.a.CommonUtils;

/* JADX INFO: loaded from: classes16.dex */
public class HealthHourSecondNumberPicker extends LinearLayout implements HealthMultiNumberPicker.OnValueChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f23919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23920c;
    private int d;
    private HealthMultiNumberPicker e;
    private LinearLayout g;

    private boolean a(int i, int i2) {
        if (i2 == 1) {
            return true;
        }
        return i2 >= 2 && i == 0;
    }

    private boolean c(int i, int i2) {
        if (i2 == 1) {
            return true;
        }
        return i2 >= 2 && i == i2 - 1;
    }

    private int d(int i, int i2, int i3) {
        if (i3 >= 2 && i2 == i3 - 1) {
            return 0;
        }
        if (i3 <= 2 || i2 == 0 || i2 == i3 - 1) {
            return i;
        }
        return 0;
    }

    private int e(int i, int i2, int i3) {
        if ((i3 < 2 || i2 != 0) && (i3 <= 2 || i2 == i3 - 1)) {
            return i;
        }
        return 59;
    }

    public HealthHourSecondNumberPicker(Context context) {
        super(context);
    }

    public HealthHourSecondNumberPicker(Context context, int i, int i2, int i3) {
        super(context, null);
        if (i3 < i || i3 > i2) {
            LogUtil.e("HealthHourSecondNumberPicker", "setTimeRange, the input parameter is incorrect.");
            return;
        }
        this.f23919b = context;
        this.g = (LinearLayout) View.inflate(context, R.layout.health_hour_second_number_picker, this).findViewById(R.id.hour_second_number_picker);
        this.f23920c = i;
        this.f23918a = i2;
        this.d = i3;
        c();
    }

    private void c() {
        HealthMultiNumberPicker healthMultiNumberPicker = new HealthMultiNumberPicker(this.f23919b);
        this.e = healthMultiNumberPicker;
        if (this.f23918a < 3600) {
            healthMultiNumberPicker.setPickerCount(2, new boolean[]{false, true});
            this.e.setColonAndUnit(2);
            String[] strArr = get2ColumnMinuteValues();
            int iJ = (this.d / 60) - CommonUtils.j(strArr[0]);
            this.e.setDisplayedValues(0, strArr, iJ);
            String[] strArrE = e(iJ, strArr.length);
            int i = this.d;
            this.e.setDisplayedValues(1, strArrE, (i % 60) - CommonUtils.j(strArrE[0]));
        } else {
            healthMultiNumberPicker.setPickerCount(3, new boolean[]{false, true, true});
            this.e.setColonAndUnit(3);
            String[] strArr2 = get3ColumnHourValues();
            int iJ2 = (this.d / 3600) - CommonUtils.j(strArr2[0]);
            this.e.setDisplayedValues(0, strArr2, iJ2);
            String[] strArrD = d(iJ2, strArr2.length);
            int iJ3 = ((this.d % 3600) / 60) - CommonUtils.j(strArrD[0]);
            this.e.setDisplayedValues(1, strArrD, iJ3);
            String[] strArrA = a(iJ2, strArr2.length, iJ3, strArrD.length);
            int i2 = this.d;
            this.e.setDisplayedValues(2, strArrA, (i2 % 60) - CommonUtils.j(strArrA[0]));
        }
        this.e.setOnValueChangeListener(this);
        this.g.addView(this.e);
    }

    private String[] get2ColumnMinuteValues() {
        return this.e.c(this.f23920c / 60, this.f23918a / 60, this.f23919b.getString(R.string.IDS_messagecenter_time_minute_value));
    }

    private String[] e(int i, int i2) {
        int i3 = this.f23920c;
        int i4 = this.f23918a;
        return this.e.c(d(i3 % 60, i, i2), e(i4 % 60, i, i2), this.f23919b.getString(R.string.IDS_second));
    }

    private String[] get3ColumnHourValues() {
        return this.e.c(this.f23920c / 3600, this.f23918a / 3600, this.f23919b.getString(R.string.IDS_messagecenter_time_hour_value));
    }

    private String[] d(int i, int i2) {
        int i3 = (this.f23920c % 3600) / 60;
        int iE = e((this.f23918a % 3600) / 60, i, i2);
        return this.e.c(d(i3, i, i2), iE, this.f23919b.getString(R.string.IDS_messagecenter_time_minute_value));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x003e  */
    private String[] a(int i, int i2, int i3, int i4) {
        int i5 = this.f23920c % 60;
        int i6 = this.f23918a % 60;
        boolean zC = c(i, i2);
        boolean zC2 = c(i3, i4);
        int i7 = 0;
        if (zC && zC2) {
            i5 = 0;
        }
        boolean zA = a(i, i2);
        boolean zA2 = a(i3, i4);
        int i8 = 59;
        if (zA && zA2) {
            i6 = 59;
        }
        boolean z = true;
        if (i2 != 1) {
            if ((!zC || zC2) && (!zA || zA2)) {
                z = false;
            }
            if ((zC || zA) && !z) {
                i7 = i5;
                i8 = i6;
            }
        } else if (zC2 || zA2) {
            i7 = i5;
            i8 = i6;
        }
        return this.e.c(i7, i8, this.f23919b.getString(R.string.IDS_second));
    }

    @Override // com.huawei.ui.commonui.numberpicker.HealthMultiNumberPicker.OnValueChangeListener
    public void onValueChange(int i, HealthMultiNumberPicker healthMultiNumberPicker, int i2, int i3) {
        String[] strArrA;
        if (this.f23918a < 3600) {
            b(i, healthMultiNumberPicker);
            return;
        }
        String[] strArrD = healthMultiNumberPicker.d(0);
        if (i == 2 || (i == 0 && strArrD.length <= 1)) {
            LogUtil.a("HealthHourSecondNumberPicker", "other pickers do not need to be changed.");
            return;
        }
        int[] selectedLocations = healthMultiNumberPicker.getSelectedLocations();
        int i4 = selectedLocations[0];
        int i5 = selectedLocations[1];
        String[] strArrD2 = healthMultiNumberPicker.d(1);
        int iJ = CommonUtils.j(strArrD2[0]);
        int i6 = selectedLocations[2];
        String[] strArrD3 = healthMultiNumberPicker.d(2);
        int iJ2 = CommonUtils.j(strArrD3[0]);
        if (i == 0) {
            String[] strArrD4 = d(i4, strArrD.length);
            int iC = c(iJ + i5, strArrD4);
            if (!strArrD2[0].equals(strArrD4[0]) || !strArrD2[strArrD2.length - 1].equals(strArrD4[strArrD4.length - 1])) {
                healthMultiNumberPicker.setDisplayedValues(1, strArrD4, iC);
            }
            strArrA = a(i4, strArrD.length, iC, strArrD4.length);
        } else {
            strArrA = a(i4, strArrD.length, i5, strArrD2.length);
        }
        int iC2 = c(i6 + iJ2, strArrA);
        if (strArrD3[0].equals(strArrA[0]) && strArrD3[strArrD3.length - 1].equals(strArrA[strArrA.length - 1])) {
            return;
        }
        healthMultiNumberPicker.setDisplayedValues(2, strArrA, iC2);
    }

    private void b(int i, HealthMultiNumberPicker healthMultiNumberPicker) {
        String[] strArrD = healthMultiNumberPicker.d(0);
        String[] strArrD2 = healthMultiNumberPicker.d(1);
        if (i == 1 || (i == 0 && strArrD.length <= 1)) {
            LogUtil.a("HealthHourSecondNumberPicker", "other pickers do not need to be changed.");
            return;
        }
        int[] selectedLocations = healthMultiNumberPicker.getSelectedLocations();
        int i2 = selectedLocations[0];
        int i3 = selectedLocations[1];
        int iJ = CommonUtils.j(healthMultiNumberPicker.d(1)[0]);
        String[] strArrE = e(i2, strArrD.length);
        int iC = c(i3 + iJ, strArrE);
        if (strArrD2[0].equals(strArrE[0]) && strArrD2[strArrD2.length - 1].equals(strArrE[strArrE.length - 1])) {
            return;
        }
        healthMultiNumberPicker.setDisplayedValues(1, strArrE, iC);
    }

    private int c(int i, String[] strArr) {
        if (i > CommonUtils.j(strArr[strArr.length - 1])) {
            return strArr.length - 1;
        }
        if (i < CommonUtils.j(strArr[0])) {
            return 0;
        }
        return i - CommonUtils.j(strArr[0]);
    }

    public int getSelectedTime() {
        int iJ;
        int i;
        int[] selectedLocations = this.e.getSelectedLocations();
        if (this.f23918a < 3600) {
            int i2 = selectedLocations[0];
            int iJ2 = CommonUtils.j(this.e.d(0)[0]);
            iJ = selectedLocations[1] + CommonUtils.j(this.e.d(1)[0]);
            i = (i2 + iJ2) * 60;
        } else {
            int i3 = selectedLocations[0];
            int iJ3 = CommonUtils.j(this.e.d(0)[0]);
            int i4 = selectedLocations[1];
            int iJ4 = CommonUtils.j(this.e.d(1)[0]);
            iJ = selectedLocations[2] + CommonUtils.j(this.e.d(2)[0]);
            i = ((i3 + iJ3) * 3600) + ((i4 + iJ4) * 60);
        }
        return i + iJ;
    }
}
