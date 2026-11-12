package gg1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes10.dex */
public class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f77252a;

    public interface a {
    }

    public j0(Context context, boolean z14, a aVar, Double d14) {
        this.f77252a = aVar;
        double dDoubleValue = d14.doubleValue();
        if (z14) {
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.gcm_single_number_picker_3_0, (ViewGroup) null);
            NumberPicker numberPicker = (NumberPicker) viewInflate.findViewById(R.id.number_picker_value);
            numberPicker.setMinValue(30);
            numberPicker.setMaxValue(254);
            if (dDoubleValue <= 0.0d) {
                numberPicker.setValue(170);
            } else if (dDoubleValue > 254) {
                numberPicker.setValue(254);
            } else if (dDoubleValue < 30) {
                numberPicker.setValue(30);
            } else {
                numberPicker.setValue((int) dDoubleValue);
            }
            new androidx.appcompat.app.e.a(context).setTitle(R.string.lbl_height).setView(viewInflate).setCancelable(true).setPositiveButton(R.string.lbl_done, new ag0.d(27, this, numberPicker)).show();
            return;
        }
        View viewInflate2 = LayoutInflater.from(context).inflate(R.layout.gcm_edit_height_statute, (ViewGroup) null);
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
        numberPicker2.setOnValueChangedListener(new i0(numberPicker3, numberPicker4, 0));
        if (dDoubleValue > 0.0d) {
            l3.f23124b.getClass();
            int[] iArrK1 = l3.a.K1((float) dDoubleValue);
            if (iArrK1 != null) {
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
            }
        } else {
            l3.f23124b.getClass();
            int[] iArrK2 = l3.a.K1(170.0f);
            if (iArrK2 != null && iArrK2.length > 1) {
                numberPicker2.setValue(iArrK2[0]);
                numberPicker3.setValue(iArrK2[1]);
            }
        }
        new androidx.appcompat.app.e.a(context).setTitle(R.string.lbl_height).setView(viewInflate2).setCancelable(true).setPositiveButton(R.string.lbl_done, new c32.c((Object) this, numberPicker2, (Object) numberPicker3, (Object) numberPicker4, 4)).show();
    }
}
