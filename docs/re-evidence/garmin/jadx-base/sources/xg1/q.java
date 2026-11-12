package xg1;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import android.widget.TextView;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes10.dex */
public class q extends androidx.fragment.app.i implements s<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i<Integer> f190917a;

    @Override // xg1.s
    public final void X4(i<Integer> iVar) {
        this.f190917a = iVar;
    }

    @Override // xg1.s
    public final void g(v vVar) {
        show(vVar, "SingleNumberSelectionDi");
    }

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        String string;
        int i14;
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("DIALOG_TITLE");
            i14 = arguments.getInt("DIALOG_VALUE", 0);
        } else {
            string = null;
            i14 = 0;
        }
        View viewInflate = LayoutInflater.from(getActivity()).inflate(R.layout.gcm_single_number_picker_3_0, (ViewGroup) null);
        NumberPicker numberPicker = (NumberPicker) viewInflate.findViewById(R.id.number_picker_value);
        TextView textView = (TextView) viewInflate.findViewById(R.id.number_picker_label);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(100);
        if (i14 < 0) {
            numberPicker.setValue(0);
        } else if (i14 > 100) {
            numberPicker.setValue(100);
        } else {
            numberPicker.setValue(i14);
        }
        textView.setText(R.string.common_abbrev_ml_per_kg_per_min);
        textView.setContentDescription(requireContext().getString(R.string.lbl_vo2_unit_long_format));
        return new androidx.appcompat.app.e.a(getActivity()).setTitle(string).setView(viewInflate).setCancelable(true).setPositiveButton(R.string.lbl_done, new wq.c(6, this, numberPicker)).create();
    }
}
