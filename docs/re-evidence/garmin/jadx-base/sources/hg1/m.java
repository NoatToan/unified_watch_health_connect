package hg1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes10.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f83715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f83716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f83717c;

    public interface a {
        void b(int i14);
    }

    public m(Context context, String str, a aVar, j jVar, int i14) {
        this.f83717c = str;
        this.f83715a = aVar;
        this.f83716b = jVar;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.gcm_edit_pace, (ViewGroup) null);
        NumberPicker numberPicker = (NumberPicker) viewInflate.findViewById(R.id.number_picker_min);
        NumberPicker numberPicker2 = (NumberPicker) viewInflate.findViewById(R.id.number_picker_sec);
        if (jVar == j.ALERT_TYPE_VIRTUAL_PACER) {
            String[] strArr = new String[2];
            for (int i15 = 0; i15 < 2; i15++) {
                String string = Integer.toString(i15 * 30);
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                strArr[i15] = string;
            }
            numberPicker2.setDisplayedValues(strArr);
            numberPicker2.setMinValue(0);
            numberPicker2.setMaxValue(1);
            numberPicker.setMinValue(0);
            numberPicker.setMaxValue(10);
            String strP0 = l3.f23124b.p0(i14, context);
            if (strP0.split(":")[1].equalsIgnoreCase("00")) {
                numberPicker2.setValue(0);
            } else {
                numberPicker2.setValue(Integer.parseInt(strP0.split(":")[1]) / 30);
            }
            numberPicker.setValue(Integer.parseInt(strP0.split(":")[0]));
        } else if (jVar == j.ALERT_TYPE_RUN_WALK_INTERVALS) {
            numberPicker2.setDisplayedValues(new String[]{Integer.toString(0), Integer.toString(30)});
            numberPicker2.setMinValue(0);
            numberPicker2.setMaxValue(1);
            numberPicker.setMinValue(0);
            numberPicker.setMaxValue(10);
            if (i14 % 60 == 30) {
                numberPicker2.setValue(30);
            } else {
                numberPicker2.setValue(0);
            }
            numberPicker.setValue(i14 / 60);
        }
        numberPicker.setWrapSelectorWheel(false);
        numberPicker2.setWrapSelectorWheel(false);
        new androidx.appcompat.app.e.a(context).setTitle(this.f83717c).setView(viewInflate).setCancelable(true).setPositiveButton(R.string.lbl_done, new bi2.k(this, 15, numberPicker, numberPicker2)).show();
    }
}
