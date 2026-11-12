package com.xiaomi.fitness.baseui.dialog;

import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeUtils;
import defpackage.gsi;
import defpackage.n1j;
import defpackage.rv6;
import defpackage.vli;
import java.lang.reflect.Field;
import miuix.pickerwidget.widget.DateTimePicker;

/* JADX INFO: loaded from: classes7.dex */
public class DateTimePickerDialog extends CommonDialog<DateTimePickerDialogParams> implements DateTimePicker.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DateTimePicker f11655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f11656b;
    public long c = System.currentTimeMillis();
    public long d = 0;
    public long e = System.currentTimeMillis();

    public static class DateTimePickerDialogParams extends DialogParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b f11657a;

        public DateTimePickerDialogParams(String str) {
            super(str);
        }

        public b a() {
            return this.f11657a;
        }

        public void c(b bVar) {
            this.f11657a = bVar;
        }
    }

    public static class a extends com.xiaomi.fitness.baseui.dialog.a<a, DateTimePickerDialogParams, DateTimePickerDialog> {
        public a(String str) {
            this(new DateTimePickerDialogParams(str));
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a getThis() {
            return this;
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DateTimePickerDialog internalCreate() {
            return new DateTimePickerDialog();
        }

        public a c(b bVar) {
            requireDialogParams().c(bVar);
            return this;
        }

        public a(DateTimePickerDialogParams dateTimePickerDialogParams) {
            super(dateTimePickerDialogParams);
        }
    }

    public interface b {
        String a(long j);
    }

    public void A(long j) {
        this.c = j;
        if (this.d > j) {
            this.d = j;
        }
        if (this.e > j) {
            this.e = j;
        }
        DateTimePicker dateTimePicker = this.f11655a;
        if (dateTimePicker != null) {
            dateTimePicker.setMaxDateTime(j);
        }
        z();
    }

    public void B(long j) {
        long timeInMillis = TimeUtils.getDayZero0ClockCalendar(j).getTimeInMillis();
        this.d = timeInMillis;
        if (this.c < timeInMillis) {
            this.c = timeInMillis;
        }
        if (this.e < timeInMillis) {
            this.e = timeInMillis;
        }
        if (timeInMillis < 0) {
            this.d = 0L;
        }
        DateTimePicker dateTimePicker = this.f11655a;
        if (dateTimePicker != null) {
            dateTimePicker.setMinDateTime(this.d);
        }
        z();
    }

    public final void C() {
        View viewFindViewById = this.f11655a.findViewById(gsi.e);
        ViewParent parent = viewFindViewById.getParent();
        if (parent instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) parent;
            linearLayout.setPaddingRelative(0, linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), 0);
        }
        D(viewFindViewById);
        D(this.f11655a.findViewById(gsi.f));
        D(this.f11655a.findViewById(gsi.s));
    }

    public final void D(View view) {
        if (view == null) {
            return;
        }
        try {
            Resources resources = this.mContext.getResources();
            Class<?> cls = view.getClass();
            Field declaredField = cls.getDeclaredField("mTextSizeHilight");
            declaredField.setAccessible(true);
            declaredField.set(view, Integer.valueOf(resources.getDimensionPixelSize(vli.c)));
            Field declaredField2 = cls.getDeclaredField("mTextSizeHint");
            declaredField2.setAccessible(true);
            declaredField2.set(view, Integer.valueOf(resources.getDimensionPixelSize(vli.f37008b)));
            view.postInvalidate();
        } catch (Exception e) {
            Logger.e("DateTimePickerDialog", "there is not mLabelTextSize in picker", e);
        }
    }

    @Override // miuix.pickerwidget.widget.DateTimePicker.d
    public void e(DateTimePicker dateTimePicker, long j) {
        this.e = j;
        z();
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomView(View view) {
        super.initCustomView(view);
        DateTimePicker dateTimePicker = (DateTimePicker) view.findViewById(gsi.S);
        this.f11655a = dateTimePicker;
        dateTimePicker.setMinuteInterval(1);
        this.f11655a.setMinDateTime(this.d);
        this.f11655a.setMaxDateTime(this.c);
        this.f11655a.t(this.e);
        this.f11655a.setOnTimeChangedListener(this);
        this.f11656b = (TextView) view.findViewById(gsi.m0);
        z();
        C();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (bundle != null) {
            A(bundle.getLong("key_saved_max_time", this.c));
            B(bundle.getLong("key_saved_min_time", this.d));
            y(bundle.getLong("key_saved_selected_time", this.e));
        }
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.getWindow().setFlags(131072, 131072);
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        DateTimePicker dateTimePicker = this.f11655a;
        if (dateTimePicker != null) {
            dateTimePicker.setOnTimeChangedListener(null);
        }
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void onDialogDismiss(int i) {
        super.onDialogDismiss(i);
        if (i == -1) {
            Bundle bundle = new Bundle();
            bundle.putLong("key_select_mills", this.e);
            setResultData(Integer.valueOf(i), bundle);
        }
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putLong("key_saved_max_time", this.c);
        bundle.putLong("key_saved_min_time", this.d);
        bundle.putLong("key_saved_selected_time", this.e);
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void onShow() {
        super.onShow();
        if (getDialog() != null) {
            rv6.a(getDialog());
        }
    }

    public void y(long j) {
        this.e = j;
        long j2 = this.d;
        if (j < j2) {
            this.e = j2;
        }
        long j3 = this.e;
        long j4 = this.c;
        if (j3 > j4) {
            this.e = j4;
        }
        DateTimePicker dateTimePicker = this.f11655a;
        if (dateTimePicker != null) {
            dateTimePicker.t(this.e);
        }
        z();
    }

    public final void z() {
        if (this.f11656b != null) {
            try {
                b bVarA = requireDialogParams().a();
                this.f11656b.setText(bVarA == null ? TimeUtils.formatDate("yyyy", Long.valueOf(this.e)) : bVarA.a(this.e));
                if (getContext() != null) {
                    this.f11656b.setContentDescription(getContext().getString(n1j.g, TimeUtils.formatDate(getContext().getString(n1j.d), Long.valueOf(this.e))));
                }
            } catch (Exception e) {
                Logger.i("DateTimePickerDialog", "updateDescription error" + e);
            }
        }
    }
}
