package com.facebook.react.modules.timepicker;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.format.DateFormat;
import androidx.fragment.app.DialogFragment;
import defpackage.wy6;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class TimePickerDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TimePickerDialog.OnTimeSetListener f7463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DialogInterface.OnDismissListener f7464b;

    public static Dialog s(Bundle bundle, Context context, TimePickerDialog.OnTimeSetListener onTimeSetListener) {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(11);
        int i2 = calendar.get(12);
        boolean zIs24HourFormat = DateFormat.is24HourFormat(context);
        TimePickerMode timePickerModeValueOf = TimePickerMode.DEFAULT;
        if (bundle != null && bundle.getString("mode", null) != null) {
            timePickerModeValueOf = TimePickerMode.valueOf(bundle.getString("mode").toUpperCase(Locale.US));
        }
        if (bundle != null) {
            i = bundle.getInt("hour", calendar.get(11));
            i2 = bundle.getInt("minute", calendar.get(12));
            zIs24HourFormat = bundle.getBoolean("is24Hour", DateFormat.is24HourFormat(context));
        }
        if (timePickerModeValueOf == TimePickerMode.CLOCK) {
            return new wy6(context, context.getResources().getIdentifier("ClockTimePickerDialog", "style", context.getPackageName()), onTimeSetListener, i, i2, zIs24HourFormat);
        }
        return timePickerModeValueOf == TimePickerMode.SPINNER ? new wy6(context, context.getResources().getIdentifier("SpinnerTimePickerDialog", "style", context.getPackageName()), onTimeSetListener, i, i2, zIs24HourFormat) : new wy6(context, onTimeSetListener, i, i2, zIs24HourFormat);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        return s(getArguments(), getActivity(), this.f7463a);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.f7464b;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.f7464b = onDismissListener;
    }

    public void setOnTimeSetListener(TimePickerDialog.OnTimeSetListener onTimeSetListener) {
        this.f7463a = onTimeSetListener;
    }
}
