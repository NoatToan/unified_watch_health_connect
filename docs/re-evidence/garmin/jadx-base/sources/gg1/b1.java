package gg1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f77198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f77199b;

    public interface a {
    }

    public b1(Context context, a aVar, Double d14, float f14, float f15, float f16) {
        this.f77198a = aVar;
        this.f77199b = d14 != null ? d14.doubleValue() : f14;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.gcm_edit_weight, (ViewGroup) null);
        NumberPicker numberPicker = (NumberPicker) viewInflate.findViewById(R.id.number_picker_weight_whole);
        TextView textView = (TextView) viewInflate.findViewById(R.id.decimal_char);
        NumberPicker numberPicker2 = (NumberPicker) viewInflate.findViewById(R.id.number_picker_weight_tenth);
        ((TextView) viewInflate.findViewById(R.id.weight_label)).setVisibility(4);
        textView.setText(String.valueOf(new DecimalFormatSymbols(Locale.getDefault()).getDecimalSeparator()));
        double dPow = Math.pow(10.0d, 3.0d);
        int i14 = (int) f14;
        int i15 = ((int) (f15 - f14)) + 1;
        if (this.f77199b == 0.0d) {
            this.f77199b = f14;
        }
        int i16 = (int) this.f77199b;
        numberPicker.setMinValue(i14);
        numberPicker.setMaxValue(i15);
        numberPicker.setValue(i16);
        numberPicker.setVisibility(0);
        textView.setVisibility(0);
        int iRound = (int) Math.round(((double) (f14 - i14)) * dPow);
        int iRound2 = (int) Math.round(((double) (f15 - ((int) f15))) * dPow);
        int iRound3 = (int) Math.round(((double) (f16 - ((int) f16))) * dPow);
        double d15 = this.f77199b;
        int iRound4 = (int) Math.round((d15 - ((double) ((int) d15))) * dPow);
        ArrayList arrayList = new ArrayList();
        for (int i17 = iRound; i17 <= iRound2; i17 += iRound3) {
            arrayList.add(String.format(Locale.getDefault(), "%03d", Integer.valueOf(i17)));
        }
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        numberPicker2.setDisplayedValues(strArr);
        numberPicker2.setMinValue(iRound);
        numberPicker2.setMaxValue(iRound2 / iRound3);
        numberPicker2.setValue(iRound4 / iRound3);
        numberPicker2.setVisibility(0);
        new androidx.appcompat.app.e.a(context).setView(viewInflate).setCancelable(true).setPositiveButton(R.string.lbl_done, new a1(this, numberPicker, numberPicker2, iRound3, dPow)).show();
    }
}
