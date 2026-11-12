package com.garmin.android.apps.connectmobile.settings.activityoptions;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes10.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f41727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41728b;

    public interface a {
        void m(int i14);
    }

    public e(Context context, a aVar, int i14) {
        this.f41727a = aVar;
        this.f41728b = i14;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.gcm_edit_time, (ViewGroup) null);
        NumberPicker numberPicker = (NumberPicker) viewInflate.findViewById(R.id.number_picker_hour);
        NumberPicker numberPicker2 = (NumberPicker) viewInflate.findViewById(R.id.number_picker_min);
        NumberPicker numberPicker3 = (NumberPicker) viewInflate.findViewById(R.id.number_picker_sec);
        String[] strArr = new String[12];
        for (int i15 = 0; i15 < 12; i15++) {
            String string = Integer.toString(i15 * 5);
            if (string.length() < 2) {
                string = "0".concat(string);
            }
            strArr[i15] = string;
        }
        numberPicker3.setDisplayedValues(strArr);
        numberPicker3.setMinValue(0);
        numberPicker3.setMaxValue(11);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(8);
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(59);
        int i16 = this.f41728b;
        l3.f23124b.getClass();
        String[] strArrSplit = l3.a.n1(i16).split(":");
        int i17 = Integer.parseInt(strArrSplit[0]);
        int i18 = Integer.parseInt(strArrSplit[1]);
        numberPicker3.setValue(Integer.parseInt(strArrSplit[2]) / 5);
        numberPicker2.setValue(i18);
        numberPicker.setValue(i17);
        numberPicker2.setWrapSelectorWheel(false);
        numberPicker3.setWrapSelectorWheel(false);
        numberPicker.setWrapSelectorWheel(false);
        new androidx.appcompat.app.e.a(context).setTitle(R.string.lbl_time).setView(viewInflate).setCancelable(true).setPositiveButton(R.string.lbl_done, new c32.c((Object) this, numberPicker, (Object) numberPicker2, (Object) numberPicker3, 5)).show();
    }
}
