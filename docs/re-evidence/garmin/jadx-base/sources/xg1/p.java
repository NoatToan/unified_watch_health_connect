package xg1;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import androidx.fragment.app.v;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes10.dex */
public class p extends androidx.fragment.app.i implements s<Double> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i<Double> f190916a;

    @Override // xg1.s
    public final void X4(i<Double> iVar) {
        this.f190916a = iVar;
    }

    @Override // xg1.s
    public final void g(v vVar) {
        show(vVar, "TimeDialogFragment");
    }

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        String string;
        long j8;
        int i14;
        int i15;
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("DIALOG_TITLE");
            j8 = arguments.getLong("SECOND_SINCE_MIDNIGHT");
        } else {
            string = "";
            j8 = 0;
        }
        l3.f23124b.getClass();
        int[] iArrF = l3.a.f(j8);
        if (iArrF != null) {
            int i16 = iArrF[0];
            i15 = iArrF[1];
            i14 = i16;
        } else {
            i14 = 12;
            i15 = 0;
        }
        TimePickerDialog timePickerDialog = new TimePickerDialog(getActivity(), R.style.GCMTimePicker, new ls0.m(this, 10), i14, i15, DateFormat.is24HourFormat(getActivity()));
        timePickerDialog.setTitle(string);
        og.a.W(timePickerDialog, requireContext());
        og.a.w(timePickerDialog, requireContext());
        return timePickerDialog;
    }
}
