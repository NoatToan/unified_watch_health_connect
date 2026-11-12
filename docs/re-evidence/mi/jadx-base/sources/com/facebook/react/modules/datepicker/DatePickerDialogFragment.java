package com.facebook.react.modules.datepicker;

import android.R;
import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.DatePicker;
import androidx.fragment.app.DialogFragment;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import defpackage.vy6;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"ValidFragment"})
public class DatePickerDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DatePickerDialog.OnDateSetListener f7395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DialogInterface.OnDismissListener f7396b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7397a;

        static {
            int[] iArr = new int[DatePickerMode.values().length];
            f7397a = iArr;
            try {
                iArr[DatePickerMode.CALENDAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7397a[DatePickerMode.SPINNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7397a[DatePickerMode.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00bf  */
    public static Dialog s(Bundle bundle, Context context, DatePickerDialog.OnDateSetListener onDateSetListener) {
        vy6 vy6Var;
        DatePicker datePicker;
        Calendar calendar = Calendar.getInstance();
        if (bundle != null && bundle.containsKey(DialWidgetType.DATE)) {
            calendar.setTimeInMillis(bundle.getLong(DialWidgetType.DATE));
        }
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        DatePickerMode datePickerModeValueOf = DatePickerMode.DEFAULT;
        vy6 vy6Var2 = null;
        if (bundle != null && bundle.getString("mode", null) != null) {
            datePickerModeValueOf = DatePickerMode.valueOf(bundle.getString("mode").toUpperCase(Locale.US));
        }
        int i4 = a.f7397a[datePickerModeValueOf.ordinal()];
        if (i4 == 1) {
            vy6Var = new vy6(context, context.getResources().getIdentifier("CalendarDatePickerDialog", "style", context.getPackageName()), onDateSetListener, i, i2, i3);
        } else {
            if (i4 != 2) {
                if (i4 == 3) {
                    vy6Var = new vy6(context, onDateSetListener, i, i2, i3);
                }
                datePicker = vy6Var2.getDatePicker();
                if (bundle == null && bundle.containsKey("minDate")) {
                    calendar.setTimeInMillis(bundle.getLong("minDate"));
                    calendar.set(11, 0);
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                    datePicker.setMinDate(calendar.getTimeInMillis());
                } else {
                    datePicker.setMinDate(-2208988800001L);
                }
                if (bundle != null && bundle.containsKey("maxDate")) {
                    calendar.setTimeInMillis(bundle.getLong("maxDate"));
                    calendar.set(11, 23);
                    calendar.set(12, 59);
                    calendar.set(13, 59);
                    calendar.set(14, 999);
                    datePicker.setMaxDate(calendar.getTimeInMillis());
                }
                return vy6Var2;
            }
            vy6Var = new vy6(context, R.style.Theme.Holo.Light.Dialog, onDateSetListener, i, i2, i3);
            vy6Var.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        vy6Var2 = vy6Var;
        datePicker = vy6Var2.getDatePicker();
        if (bundle == null) {
            datePicker.setMinDate(-2208988800001L);
        } else {
            datePicker.setMinDate(-2208988800001L);
        }
        if (bundle != null) {
            calendar.setTimeInMillis(bundle.getLong("maxDate"));
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
            calendar.set(14, 999);
            datePicker.setMaxDate(calendar.getTimeInMillis());
        }
        return vy6Var2;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        return s(getArguments(), getActivity(), this.f7395a);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.f7396b;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    public void setOnDateSetListener(DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f7395a = onDateSetListener;
    }

    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.f7396b = onDismissListener;
    }
}
