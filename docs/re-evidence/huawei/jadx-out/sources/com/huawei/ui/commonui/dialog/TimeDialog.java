package com.huawei.ui.commonui.dialog;

import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.View;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.numberpicker.HealthMultiNumberPicker;
import defpackage.qrj;
import health.compact.a.UnitUtil;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes43.dex */
public class TimeDialog extends DialogFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23484c;
    private CustomViewDialog d;
    private HealthMultiNumberPicker e;
    private int f;
    private OnSelectTimeListener g;
    private String[] h;
    private String[] i;
    private String[] j;
    private int l;
    private int m;
    private int n;
    private qrj o;

    public interface OnSelectTimeListener {
        void onSelectTime(int i);
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        if (this.d == null) {
            this.d = d();
        }
        if (this.o == null) {
            this.o = new qrj();
        }
        b();
        return this.d;
    }

    private CustomViewDialog d() {
        int i = getArguments().getInt("title");
        HealthMultiNumberPicker healthMultiNumberPicker = new HealthMultiNumberPicker(BaseApplication.getContext());
        this.e = healthMultiNumberPicker;
        healthMultiNumberPicker.setPickerCount(3, new boolean[]{false, false, false});
        return new CustomViewDialog.Builder(getActivity()).b(i).d((View) this.e).c(R.string.IDS_settings_button_cancal_ios_btn, new View.OnClickListener() { // from class: com.huawei.ui.commonui.dialog.TimeDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }).d(R.string.IDS_contact_confirm_ios_btn, new View.OnClickListener() { // from class: com.huawei.ui.commonui.dialog.TimeDialog.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (TimeDialog.this.g != null) {
                    TimeDialog.this.g.onSelectTime(TimeDialog.this.l);
                }
            }
        }).d();
    }

    private void b() {
        e();
        c();
        h();
        this.e.setOnValueChangeListener(new HealthMultiNumberPicker.OnValueChangeListener() { // from class: com.huawei.ui.commonui.dialog.TimeDialog.5
            @Override // com.huawei.ui.commonui.numberpicker.HealthMultiNumberPicker.OnValueChangeListener
            public void onValueChange(int i, HealthMultiNumberPicker healthMultiNumberPicker, int i2, int i3) {
                if (i == 0) {
                    TimeDialog.this.d(i3, i2);
                    return;
                }
                if (i == 1) {
                    TimeDialog.this.b(i3, i2);
                } else if (i == 2) {
                    TimeDialog.this.e(i3, i2);
                } else {
                    LogUtil.e("TimeDialog", "the change of numberpicker is invalid");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, int i2) {
        if (i > i2) {
            this.l += 3600;
        } else {
            this.l -= 3600;
        }
        int iE = this.o.e(this.l);
        this.l = iE;
        this.o.f(iE);
        c();
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, int i2) {
        if (i > i2) {
            this.l += 60;
        } else {
            this.l -= 60;
        }
        int iE = this.o.e(this.l);
        this.l = iE;
        this.o.f(iE);
        h();
        e();
        String strB = this.o.b(this.j, i);
        if (strB == null) {
            return;
        }
        if (strB.equals(a(0, 5)) || strB.equals(a(59, 5))) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, int i2) {
        if (i > i2) {
            this.l++;
        } else {
            this.l--;
        }
        int iE = this.o.e(this.l);
        this.l = iE;
        this.o.f(iE);
        e();
        c();
        String strB = this.o.b(this.i, i);
        if (strB == null) {
            return;
        }
        if (strB.equals(a(0, 6)) || strB.equals(a(59, 6))) {
            h();
        }
    }

    private void e() {
        String[] strArrA = a();
        this.h = strArrA;
        this.e.setDisplayedValues(0, strArrA, this.o.d());
    }

    private void c() {
        int iC = this.o.c();
        String[] strArrD = d(iC);
        this.j = strArrD;
        this.e.setDisplayedValues(1, strArrD, this.o.a(iC));
    }

    private void h() {
        int iA = this.o.a();
        String[] strArrB = b(iA);
        this.i = strArrB;
        this.e.setDisplayedValues(2, strArrB, this.o.j(iA));
    }

    private String[] a() {
        int i = (this.f23482a - this.f) + 1;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = a(this.f + i2, 4);
        }
        return strArr;
    }

    private String[] d(int i) {
        int i2 = 0;
        if (i == 1) {
            int i3 = this.n;
            int i4 = 65 - i3;
            String[] strArr = new String[i4];
            while (i2 < i4) {
                if (i2 < 63 - i3) {
                    strArr[i2] = a((this.n + i2) % 60, 5);
                } else {
                    strArr[i2] = "";
                }
                i2++;
            }
            return strArr;
        }
        if (i == 3) {
            int i5 = this.f23484c + 6;
            String[] strArr2 = new String[i5];
            while (i2 < i5) {
                if (i2 < 2) {
                    strArr2[i2] = "";
                } else {
                    strArr2[i2] = a((i2 + 55) % 60, 5);
                }
                i2++;
            }
            return strArr2;
        }
        String[] strArr3 = new String[70];
        while (i2 < 70) {
            strArr3[i2] = a((i2 + 55) % 60, 5);
            i2++;
        }
        return strArr3;
    }

    private String[] b(int i) {
        int i2 = 0;
        if (i == 1) {
            int i3 = this.m;
            int i4 = 65 - i3;
            String[] strArr = new String[i4];
            while (i2 < i4) {
                if (i2 < 63 - i3) {
                    strArr[i2] = a((this.m + i2) % 60, 6);
                } else {
                    strArr[i2] = "";
                }
                i2++;
            }
            return strArr;
        }
        if (i == 3) {
            int i5 = this.f23483b + 6;
            String[] strArr2 = new String[i5];
            while (i2 < i5) {
                if (i2 < 2) {
                    strArr2[i2] = "";
                } else {
                    strArr2[i2] = a((i2 + 55) % 60, 6);
                }
                i2++;
            }
            return strArr2;
        }
        String[] strArr3 = new String[70];
        while (i2 < 70) {
            strArr3[i2] = a((i2 + 55) % 60, 6);
            i2++;
        }
        return strArr3;
    }

    private String a(int i, int i2) {
        String strE = UnitUtil.e(i, 1, 0);
        if (i2 == 4) {
            return getResources().getQuantityString(R.plurals.IDS_plan_run_hour, i, strE);
        }
        if (i2 == 5) {
            return getResources().getQuantityString(R.plurals.IDS_indoor_skipper_time_minute_value, i, Integer.valueOf(i));
        }
        return getResources().getQuantityString(R.plurals.IDS_indoor_skipper_time_second_value, i, Integer.valueOf(i));
    }
}
