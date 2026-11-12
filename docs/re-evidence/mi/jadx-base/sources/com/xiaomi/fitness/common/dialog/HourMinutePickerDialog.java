package com.xiaomi.fitness.common.dialog;

import android.os.Bundle;
import android.view.View;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.widget.NumberPickerView;
import com.xiaomi.fitness.health.sleep.rhythm.view.PickSleepTimeDialog;
import defpackage.c0j;
import defpackage.clb;
import defpackage.eri;
import defpackage.qxi;

/* JADX INFO: loaded from: classes6.dex */
public class HourMinutePickerDialog extends CommonDialog<DialogParams> {
    public static final int[] j = {0, 23};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f11795k = {0, 10, 20, 30, 40, 50};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NumberPickerView f11796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public NumberPickerView f11797b;
    public View c;
    public int d = -1;
    public int e = -1;
    public boolean f;
    public int[] g;
    public int[] h;
    public boolean i;

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
    public /* synthetic */ void C(NumberPickerView numberPickerView, int i, int i2) {
        if (!this.i && this.f11796a.getValue() == this.f11797b.getValue() && this.f11797b.getValue() == this.h[0]) {
            this.f11797b.d0(1);
        }
        updatePickerOnValueChange(numberPickerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(NumberPickerView numberPickerView, int i, int i2) {
        clb.a(getContext());
    }

    public void B(boolean z) {
        this.i = z;
    }

    public final /* synthetic */ void E(NumberPickerView numberPickerView, int i, int i2) {
        clb.a(getContext());
    }

    public int getHourValue() {
        NumberPickerView numberPickerView = this.f11796a;
        if (numberPickerView != null) {
            return numberPickerView.getValue();
        }
        return -1;
    }

    public int getMinuteValue() {
        NumberPickerView numberPickerView = this.f11797b;
        if (numberPickerView == null) {
            return this.e;
        }
        int pickedIndexRelativeToRaw = numberPickerView.getPickedIndexRelativeToRaw();
        int[] iArr = this.h;
        return pickedIndexRelativeToRaw < iArr.length ? iArr[pickedIndexRelativeToRaw] : this.e;
    }

    public final String[] getMinutesData() {
        int[] iArr = this.h;
        int length = iArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = String.valueOf(iArr[i]);
        }
        return strArr;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomView(View view) {
        super.initCustomView(view);
        this.c = view.findViewById(eri.Va);
        this.f11796a = (NumberPickerView) view.findViewById(eri.Jc);
        this.f11797b = (NumberPickerView) view.findViewById(eri.Kc);
        int[] iArr = this.g;
        if (iArr == null) {
            iArr = j;
        }
        this.g = iArr;
        int[] iArr2 = this.h;
        if (iArr2 == null) {
            iArr2 = f11795k;
        }
        this.h = iArr2;
        this.f11796a.setMinValue(iArr[0]);
        NumberPickerView numberPickerView = this.f11796a;
        int[] iArr3 = this.g;
        numberPickerView.setMaxValue(iArr3[iArr3.length - 1]);
        this.f11797b.setDisplayedValues(getMinutesData());
        this.f11797b.setMinValue(0);
        this.f11797b.setMaxValue(getMinutesData().length - 1);
        NumberPickerView.d dVar = new NumberPickerView.d() { // from class: jbc
            @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.d
            public final void onValueChange(NumberPickerView numberPickerView2, int i, int i2) {
                this.f22615a.C(numberPickerView2, i, i2);
            }
        };
        this.f11796a.setOnValueChangedListener(dVar);
        this.f11797b.setOnValueChangedListener(dVar);
        this.f = true;
        this.f11796a.setOnValueChangeListenerInScrolling(new NumberPickerView.e() { // from class: lbc
            @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.e
            public final void a(NumberPickerView numberPickerView2, int i, int i2) {
                this.f24858a.D(numberPickerView2, i, i2);
            }
        });
        this.f11797b.setOnValueChangeListenerInScrolling(new NumberPickerView.e() { // from class: nbc
            @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.e
            public final void a(NumberPickerView numberPickerView2, int i, int i2) {
                this.f27750a.E(numberPickerView2, i, i2);
            }
        });
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        int i;
        super.onActivityCreated(bundle);
        if (bundle != null) {
            this.d = bundle.getInt(PickSleepTimeDialog.KEY_SELECT_HOUR, -1);
            this.e = bundle.getInt(PickSleepTimeDialog.KEY_SELECT_MINUTE, -1);
        }
        int i2 = this.d;
        if (i2 == -1 || (i = this.e) == -1) {
            return;
        }
        updateValue(i2, i);
        this.d = -1;
        this.e = -1;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f = false;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void onDialogDismiss(int i) {
        super.onDialogDismiss(i);
        if (i == -1) {
            Bundle bundle = new Bundle();
            bundle.putInt(PickSleepTimeDialog.KEY_SELECT_HOUR, getHourValue());
            bundle.putInt(PickSleepTimeDialog.KEY_SELECT_MINUTE, getMinuteValue());
            setResultData(-1, bundle);
        }
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        NumberPickerView numberPickerView = this.f11796a;
        if (numberPickerView == null || this.f11797b == null) {
            return;
        }
        bundle.putInt(PickSleepTimeDialog.KEY_SELECT_HOUR, numberPickerView.getValue());
        bundle.putInt(PickSleepTimeDialog.KEY_SELECT_MINUTE, this.f11797b.getValue());
    }

    public void setHourRange(int[] iArr) {
        this.g = iArr;
    }

    public void setMinuteData(int[] iArr) {
        this.h = iArr;
    }

    public void setValue(int i, int i2) {
        int[] iArr = this.g;
        if (iArr == null) {
            iArr = j;
        }
        this.g = iArr;
        int i3 = iArr[0];
        if (i < i3) {
            i = i3;
        }
        int iMin = Math.min(i, iArr[iArr.length - 1]);
        int[] iArr2 = f11795k;
        int i4 = iArr2[0];
        if (i2 < i4) {
            i2 = i4;
        }
        int i5 = iArr2[iArr2.length - 1];
        if (i2 > i5) {
            i2 = i5;
        }
        if (this.f && this.f11796a != null && this.f11797b != null) {
            updateValue(iMin, i2);
        } else {
            this.d = iMin;
            this.e = i2;
        }
    }

    public final void updateFocusContentDescription(int i, int i2) {
        if (getContext() == null) {
            return;
        }
        String quantityString = getResources().getQuantityString(qxi.O1, i, Integer.valueOf(i));
        String quantityString2 = getResources().getQuantityString(qxi.Q1, i2, Integer.valueOf(i2));
        this.c.setContentDescription(getString(c0j.Ul, quantityString + quantityString2));
        this.f11796a.setContentDescription(getString(c0j.Ul, quantityString));
        this.f11797b.setContentDescription(getString(c0j.Ul, quantityString2));
    }

    public final void updatePickerOnValueChange(NumberPickerView numberPickerView) {
        if (getContext() == null) {
            return;
        }
        String quantityString = getResources().getQuantityString(qxi.O1, getHourValue(), Integer.valueOf(getHourValue()));
        String quantityString2 = getResources().getQuantityString(qxi.Q1, getMinuteValue(), Integer.valueOf(getMinuteValue()));
        this.c.setContentDescription(getString(c0j.Ul, quantityString + quantityString2));
        numberPickerView.setContentDescription(getString(c0j.Ul, quantityString + quantityString2));
    }

    public final void updateValue(int i, int i2) {
        NumberPickerView numberPickerView = this.f11796a;
        if (numberPickerView == null || this.f11797b == null) {
            return;
        }
        numberPickerView.setValue(i);
        int[] iArr = this.h;
        if (iArr[this.f11797b.getMaxValue()] >= i2) {
            int i3 = 0;
            for (int i4 : iArr) {
                if (i4 == i2) {
                    this.f11797b.setValue(i3);
                    break;
                }
                i3++;
            }
        } else {
            NumberPickerView numberPickerView2 = this.f11797b;
            numberPickerView2.setValue(numberPickerView2.getMaxValue());
        }
        updateFocusContentDescription(i, i2);
    }
}
