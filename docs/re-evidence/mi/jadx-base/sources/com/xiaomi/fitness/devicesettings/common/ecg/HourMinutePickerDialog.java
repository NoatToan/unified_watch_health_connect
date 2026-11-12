package com.xiaomi.fitness.devicesettings.common.ecg;

import android.os.Bundle;
import android.view.View;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.widget.NumberPickerView;
import com.xiaomi.fitness.health.sleep.rhythm.view.PickSleepTimeDialog;
import defpackage.clb;
import defpackage.qyi;
import defpackage.wzi;
import defpackage.zqi;

/* JADX INFO: loaded from: classes8.dex */
public class HourMinutePickerDialog extends CommonDialog<DialogParams> {
    public static final int[] i = {0, 23};
    public static final int[] j = {0, 10, 20, 30, 40, 50};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NumberPickerView f11995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public NumberPickerView f11996b;
    public View c;
    public int d = -1;
    public int e = -1;
    public boolean f;
    public int[] g;
    public int[] h;

    public static class a extends com.xiaomi.fitness.baseui.dialog.a<a, DialogParams, HourMinutePickerDialog> {
        public a(String str) {
            this(new DialogParams(str));
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a getThis() {
            return this;
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public HourMinutePickerDialog internalCreate() {
            return new HourMinutePickerDialog();
        }

        public a(DialogParams dialogParams) {
            super(dialogParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(NumberPickerView numberPickerView, int i2, int i3) {
        if (this.f11995a.getValue() == this.f11996b.getValue() && this.f11996b.getValue() == this.h[0]) {
            this.f11996b.d0(1);
        }
        updatePickerOnValueChange(numberPickerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(NumberPickerView numberPickerView, int i2, int i3) {
        clb.a(getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(NumberPickerView numberPickerView, int i2, int i3) {
        clb.a(getContext());
    }

    private String[] getMinutesData() {
        int[] iArr = this.h;
        int length = iArr.length;
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            strArr[i2] = String.valueOf(iArr[i2]);
        }
        return strArr;
    }

    private void updateFocusContentDescription(int i2, int i3) {
        if (getContext() == null) {
            return;
        }
        String quantityString = getResources().getQuantityString(qyi.C, i2, Integer.valueOf(i2));
        String quantityString2 = getResources().getQuantityString(qyi.E, i3, Integer.valueOf(i3));
        this.c.setContentDescription(getString(wzi.S2, quantityString + quantityString2));
        this.f11995a.setContentDescription(getString(wzi.S2, quantityString));
        this.f11996b.setContentDescription(getString(wzi.S2, quantityString2));
    }

    private void updatePickerOnValueChange(NumberPickerView numberPickerView) {
        if (getContext() == null) {
            return;
        }
        String quantityString = getResources().getQuantityString(qyi.C, getHourValue(), Integer.valueOf(getHourValue()));
        String quantityString2 = getResources().getQuantityString(qyi.E, getMinuteValue(), Integer.valueOf(getMinuteValue()));
        this.c.setContentDescription(getString(wzi.S2, quantityString + quantityString2));
        numberPickerView.setContentDescription(getString(wzi.S2, quantityString + quantityString2));
    }

    private void updateValue(int i2, int i3) {
        NumberPickerView numberPickerView = this.f11995a;
        if (numberPickerView == null || this.f11996b == null) {
            return;
        }
        numberPickerView.setValue(i2);
        int[] iArr = this.h;
        if (iArr[this.f11996b.getMaxValue()] >= i3) {
            int i4 = 0;
            for (int i5 : iArr) {
                if (i5 == i3) {
                    this.f11996b.setValue(i4);
                    break;
                }
                i4++;
            }
        } else {
            NumberPickerView numberPickerView2 = this.f11996b;
            numberPickerView2.setValue(numberPickerView2.getMaxValue());
        }
        updateFocusContentDescription(i2, i3);
    }

    public int getHourValue() {
        NumberPickerView numberPickerView = this.f11995a;
        if (numberPickerView != null) {
            return numberPickerView.getValue();
        }
        return -1;
    }

    public int getMinuteValue() {
        NumberPickerView numberPickerView = this.f11996b;
        if (numberPickerView == null) {
            return this.e;
        }
        int pickedIndexRelativeToRaw = numberPickerView.getPickedIndexRelativeToRaw();
        int[] iArr = this.h;
        return pickedIndexRelativeToRaw < iArr.length ? iArr[pickedIndexRelativeToRaw] : this.e;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomView(View view) {
        super.initCustomView(view);
        this.c = view.findViewById(zqi.H1);
        this.f11995a = (NumberPickerView) view.findViewById(zqi.M1);
        this.f11996b = (NumberPickerView) view.findViewById(zqi.N1);
        int[] iArr = this.g;
        if (iArr == null) {
            iArr = i;
        }
        this.g = iArr;
        int[] iArr2 = this.h;
        if (iArr2 == null) {
            iArr2 = j;
        }
        this.h = iArr2;
        this.f11995a.setMinValue(iArr[0]);
        NumberPickerView numberPickerView = this.f11995a;
        int[] iArr3 = this.g;
        numberPickerView.setMaxValue(iArr3[iArr3.length - 1]);
        this.f11996b.setDisplayedValues(getMinutesData());
        this.f11996b.setMinValue(0);
        this.f11996b.setMaxValue(getMinutesData().length - 1);
        NumberPickerView.d dVar = new NumberPickerView.d() { // from class: ibc
            @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.d
            public final void onValueChange(NumberPickerView numberPickerView2, int i2, int i3) {
                this.f20967a.B(numberPickerView2, i2, i3);
            }
        };
        this.f11995a.setOnValueChangedListener(dVar);
        this.f11996b.setOnValueChangedListener(dVar);
        this.f = true;
        this.f11995a.setOnValueChangeListenerInScrolling(new NumberPickerView.e() { // from class: kbc
            @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.e
            public final void a(NumberPickerView numberPickerView2, int i2, int i3) {
                this.f23681a.C(numberPickerView2, i2, i3);
            }
        });
        this.f11996b.setOnValueChangeListenerInScrolling(new NumberPickerView.e() { // from class: mbc
            @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.e
            public final void a(NumberPickerView numberPickerView2, int i2, int i3) {
                this.f25969a.D(numberPickerView2, i2, i3);
            }
        });
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        int i2;
        super.onActivityCreated(bundle);
        if (bundle != null) {
            this.d = bundle.getInt(PickSleepTimeDialog.KEY_SELECT_HOUR, -1);
            this.e = bundle.getInt(PickSleepTimeDialog.KEY_SELECT_MINUTE, -1);
        }
        int i3 = this.d;
        if (i3 == -1 || (i2 = this.e) == -1) {
            return;
        }
        updateValue(i3, i2);
        this.d = -1;
        this.e = -1;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f = false;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void onDialogDismiss(int i2) {
        super.onDialogDismiss(i2);
        if (i2 == -1) {
            Bundle bundle = new Bundle();
            bundle.putInt(PickSleepTimeDialog.KEY_SELECT_HOUR, getHourValue());
            bundle.putInt(PickSleepTimeDialog.KEY_SELECT_MINUTE, getMinuteValue());
            setResultData(-1, bundle);
        }
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        NumberPickerView numberPickerView = this.f11995a;
        if (numberPickerView == null || this.f11996b == null) {
            return;
        }
        bundle.putInt(PickSleepTimeDialog.KEY_SELECT_HOUR, numberPickerView.getValue());
        bundle.putInt(PickSleepTimeDialog.KEY_SELECT_MINUTE, this.f11996b.getValue());
    }

    public void setValue(int i2, int i3) {
        int[] iArr = this.g;
        if (iArr == null) {
            iArr = i;
        }
        this.g = iArr;
        int i4 = iArr[0];
        if (i2 < i4) {
            i2 = i4;
        }
        int iMin = Math.min(i2, iArr[iArr.length - 1]);
        int[] iArr2 = j;
        int i5 = iArr2[0];
        if (i3 < i5) {
            i3 = i5;
        }
        int i6 = iArr2[iArr2.length - 1];
        if (i3 > i6) {
            i3 = i6;
        }
        if (this.f && this.f11995a != null && this.f11996b != null) {
            updateValue(iMin, i3);
        } else {
            this.d = iMin;
            this.e = i3;
        }
    }
}
