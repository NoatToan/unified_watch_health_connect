package com.garmin.android.apps.connectmobile.settings;

import am.j;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import android.widget.TextView;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import f12.l;
import gg1.k0;
import java.text.NumberFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f41745a;

    public interface a {
        void c(float f14);
    }

    public d(Context context, boolean z14, a aVar) {
        this.f41745a = aVar;
        if (z14) {
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.gcm_single_number_picker_3_0, (ViewGroup) null);
            NumberPicker numberPicker = (NumberPicker) viewInflate.findViewById(R.id.number_picker_value);
            ((TextView) viewInflate.findViewById(R.id.number_picker_label)).setContentDescription(context.getString(R.string.lbl_centimeters));
            numberPicker.setMinValue(30);
            numberPicker.setMaxValue(254);
            NumberFormat.getNumberInstance(Locale.getDefault());
            l.f68084a.getClass();
            if (l.a.a().t() <= 0.0f) {
                numberPicker.setValue(170);
            } else if (l.a.a().t() > 254) {
                numberPicker.setValue(254);
            } else if (l.a.a().t() < 30) {
                numberPicker.setValue(30);
            } else {
                numberPicker.setValue((int) l.a.a().t());
            }
            new androidx.appcompat.app.e.a(context).setTitle(R.string.lbl_height).setView(viewInflate).setCancelable(true).setPositiveButton(R.string.lbl_done, new b(this, numberPicker)).show();
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
        numberPicker2.setOnValueChangedListener(new k0(this, numberPicker3, numberPicker4));
        l.f68084a.getClass();
        if (l.a.a().t() > 0.0f) {
            float fT = l.a.a().t();
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
        new androidx.appcompat.app.e.a(context).setTitle(R.string.lbl_height).setView(viewInflate2).setCancelable(true).setPositiveButton(R.string.lbl_done, new c(this, numberPicker2, numberPicker3, numberPicker4)).show();
    }

    public d(Context context, a aVar) {
        this(context, j.z(l.f68084a), aVar);
    }
}
