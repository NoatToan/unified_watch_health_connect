package com.xiaomi.fitness.baseui.widget;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.widget.SpinnerDatePicker;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.health.sleep.rhythm.view.PickSleepTimeDialog;
import defpackage.eyi;
import defpackage.gsi;
import defpackage.n1j;
import defpackage.yo2;
import java.util.Calendar;

/* JADX INFO: loaded from: classes7.dex */
public class YearMonthDayDialog extends CommonDialog<DialogParams> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SpinnerDatePicker f11730b;
    public TextView c;
    public TextView d;
    public long[] e;
    public long f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Calendar f11729a = Calendar.getInstance();
    public boolean g = false;
    public boolean h = false;

    public static class a extends com.xiaomi.fitness.baseui.dialog.a<a, DialogParams, YearMonthDayDialog> {
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
        public YearMonthDayDialog internalCreate() {
            return new YearMonthDayDialog();
        }

        public a(DialogParams dialogParams) {
            super(dialogParams);
        }
    }

    public final long[] getDateRange() {
        long[] jArr = this.e;
        if (jArr != null && jArr.length == 2) {
            return jArr;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.add(1, -1);
        calendar.set(2, 0);
        calendar.set(5, 1);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.add(1, 2);
        calendar.set(2, 11);
        calendar.set(5, 31);
        return new long[]{timeInMillis, calendar.getTimeInMillis()};
    }

    public long getSelectTime() {
        return this.f11729a.getTimeInMillis();
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomView(View view) {
        super.initCustomView(view);
        this.c = (TextView) view.findViewById(gsi.n0);
        TextView textView = (TextView) view.findViewById(gsi.m0);
        this.d = textView;
        textView.setVisibility(this.h ? 0 : 8);
        this.f11730b = (SpinnerDatePicker) view.findViewById(gsi.d);
        long[] dateRange = getDateRange();
        this.f11730b.b(dateRange[0], dateRange[1]);
        this.f11729a.setTimeInMillis(this.f);
        int i = this.f11729a.get(1);
        int i2 = this.f11729a.get(2);
        int i3 = this.f11729a.get(5);
        this.f11730b.c(i, i2, i3);
        final NumberPickerView numberPickerView = (NumberPickerView) this.f11730b.findViewById(gsi.z0);
        final NumberPickerView numberPickerView2 = (NumberPickerView) this.f11730b.findViewById(gsi.L);
        final NumberPickerView numberPickerView3 = (NumberPickerView) this.f11730b.findViewById(gsi.e);
        numberPickerView.setContentDescription(getString(n1j.U, Integer.valueOf(i)));
        numberPickerView2.setContentDescription(getString(n1j.T, Integer.valueOf(i2)));
        numberPickerView3.setContentDescription(getString(n1j.S, Integer.valueOf(i3)));
        if (LocaleUtil.isCN()) {
            numberPickerView.setHintText(getString(n1j.V));
            numberPickerView2.setHintText(getString(n1j.h));
            numberPickerView3.setHintText(getString(n1j.e));
        }
        this.f11730b.setOnDateChangedListener(new SpinnerDatePicker.d() { // from class: lzr
            @Override // com.xiaomi.fitness.baseui.widget.SpinnerDatePicker.d
            public final void a(SpinnerDatePicker spinnerDatePicker, int i4, int i5, int i6) {
                this.f25592a.z(numberPickerView, numberPickerView2, numberPickerView3, spinnerDatePicker, i4, i5, i6);
            }
        });
        updateDescIfNeed();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.g = true;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void onDialogDismiss(int i) {
        super.onDialogDismiss(i);
        if (i == -1) {
            Bundle bundle = new Bundle();
            bundle.putLong(PickSleepTimeDialog.KEY_SELECT_TIME, getSelectTime());
            setResultData(-1, bundle);
        }
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putLong(PickSleepTimeDialog.KEY_SELECT_TIME, getSelectTime());
        bundle.putLong("min_time", getDateRange()[0]);
        bundle.putLong("max_time", getDateRange()[1]);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            this.e = new long[]{bundle.getLong("min_time"), 0};
            this.e[1] = bundle.getLong("max_time");
            SpinnerDatePicker spinnerDatePicker = this.f11730b;
            long[] jArr = this.e;
            spinnerDatePicker.b(jArr[0], jArr[1]);
            this.f11729a.setTimeInMillis(bundle.getLong(PickSleepTimeDialog.KEY_SELECT_TIME));
            this.f11730b.c(this.f11729a.get(1), this.f11729a.get(2), this.f11729a.get(5));
        }
    }

    public void setDialogTitle(int i) {
        TextView textView;
        if (!this.g || (textView = this.c) == null || i == 0) {
            return;
        }
        textView.setText(i);
    }

    public void setRange(long[] jArr, long j) {
        if (jArr == null) {
            throw new IllegalArgumentException("range time is null");
        }
        if (jArr.length < 2) {
            throw new IllegalArgumentException("the length of range time is " + jArr.length);
        }
        this.e = jArr;
        this.f = j;
        long j2 = jArr[1];
        if (j > j2) {
            this.f = j2;
            return;
        }
        long j3 = jArr[0];
        if (j < j3) {
            this.f = j3;
        }
    }

    public void setShowBirthDesc(boolean z) {
        this.h = z;
    }

    public final void updateDescIfNeed() {
        if (!this.h || getContext() == null) {
            return;
        }
        String string = getString(n1j.R);
        yo2 yo2Var = new yo2(getSelectTime());
        this.d.setText(TimeUtils.formatDate(string, Long.valueOf(yo2Var.b())) + getContext().getResources().getQuantityString(eyi.f17193a, yo2Var.a(), Integer.valueOf(yo2Var.a())));
    }

    public final /* synthetic */ void z(NumberPickerView numberPickerView, NumberPickerView numberPickerView2, NumberPickerView numberPickerView3, SpinnerDatePicker spinnerDatePicker, int i, int i2, int i3) {
        Context context;
        if (isRemoving() || isDetached() || (context = getContext()) == null) {
            return;
        }
        this.f11729a.set(i, i2, i3);
        updateDescIfNeed();
        numberPickerView.setContentDescription(context.getString(n1j.U, Integer.valueOf(i)));
        numberPickerView2.setContentDescription(context.getString(n1j.T, Integer.valueOf(i2)));
        numberPickerView3.setContentDescription(context.getString(n1j.S, Integer.valueOf(i3)));
    }
}
