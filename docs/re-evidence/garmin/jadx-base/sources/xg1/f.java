package xg1;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import androidx.fragment.app.v;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import gg1.i0;
import java.text.NumberFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class f extends androidx.fragment.app.i implements s<Double> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i<Double> f190895a;

    @Override // xg1.s
    public final void X4(i<Double> iVar) {
        this.f190895a = iVar;
    }

    @Override // xg1.s
    public final void g(v vVar) {
        show(vVar, "TimeDialogFragment");
    }

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        if (am.j.z(f12.l.f68084a)) {
            View viewInflate = LayoutInflater.from(getActivity()).inflate(R.layout.gcm_single_number_picker_3_0, (ViewGroup) null);
            NumberPicker numberPicker = (NumberPicker) viewInflate.findViewById(R.id.number_picker_value);
            numberPicker.setMinValue(30);
            numberPicker.setMaxValue(254);
            NumberFormat.getNumberInstance(Locale.getDefault());
            if (f12.l.a.a().t() <= 0.0f) {
                numberPicker.setValue(170);
            } else if (f12.l.a.a().t() > 254.0f) {
                numberPicker.setValue(254);
            } else if (f12.l.a.a().t() < 30.0f) {
                numberPicker.setValue(30);
            } else {
                numberPicker.setValue((int) f12.l.a.a().t());
            }
            return new androidx.appcompat.app.e.a(getActivity()).setTitle(R.string.lbl_height).setView(viewInflate).setCancelable(true).setPositiveButton(R.string.lbl_done, new wq.c(3, this, numberPicker)).create();
        }
        View viewInflate2 = LayoutInflater.from(getActivity()).inflate(R.layout.gcm_edit_height_statute, (ViewGroup) null);
        NumberPicker numberPicker2 = (NumberPicker) viewInflate2.findViewById(R.id.number_picker_feet);
        numberPicker2.setMinValue(1);
        numberPicker2.setMaxValue(8);
        numberPicker2.setWrapSelectorWheel(false);
        NumberPicker numberPicker3 = (NumberPicker) viewInflate2.findViewById(R.id.number_picker_inches);
        numberPicker3.setMinValue(0);
        numberPicker3.setMaxValue(11);
        numberPicker3.setWrapSelectorWheel(false);
        NumberPicker numberPicker4 = (NumberPicker) viewInflate2.findViewById(R.id.number_picker__max_inches);
        numberPicker4.setMinValue(0);
        numberPicker4.setMaxValue(4);
        numberPicker4.setWrapSelectorWheel(false);
        numberPicker2.setOnValueChangedListener(new i0(numberPicker3, numberPicker4, 1));
        if (f12.l.a.a().t() > 0.0f) {
            float fT = f12.l.a.a().t();
            l3.f23124b.getClass();
            int[] iArrK1 = l3.a.K1(fT);
            if (iArrK1[0] == 8) {
                numberPicker3.setVisibility(8);
                numberPicker4.setVisibility(0);
            } else {
                numberPicker3.setVisibility(0);
                numberPicker4.setVisibility(8);
            }
            numberPicker2.setValue(iArrK1[0]);
            numberPicker3.setValue(iArrK1[1]);
            numberPicker4.setValue(iArrK1[1]);
        } else {
            l3.f23124b.getClass();
            int[] iArrK2 = l3.a.K1(170.0f);
            numberPicker2.setValue(iArrK2[0]);
            numberPicker3.setValue(iArrK2[1]);
        }
        return new androidx.appcompat.app.e.a(getActivity()).setTitle(R.string.lbl_height).setView(viewInflate2).setCancelable(true).setPositiveButton(R.string.lbl_done, new c32.c((Object) this, numberPicker2, (Object) numberPicker3, (Object) numberPicker4, 10)).create();
    }
}
