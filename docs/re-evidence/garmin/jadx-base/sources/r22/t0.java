package r22;

import android.widget.NumberPicker;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes10.dex */
public class t0 extends a2 {
    public static final /* synthetic */ int S0 = 0;

    @Override // r22.a2
    public final String v6(String str, int i14, int i15, String str2, String str3, int i16) {
        return getActivity().getString(R.string.activity_details_gas_mixture);
    }

    @Override // r22.a2
    public final void z6(NumberPicker numberPicker, int i14, int i15) {
        if (numberPicker.getId() == R.id.nr_picker_1) {
            int i16 = 100 - i15;
            F6(i16);
            H6(0, i16, false);
            if (this.f149562i > i16) {
                E6(i16);
            }
            this.f149556c.setMaxValue(i16);
            return;
        }
        if (numberPicker.getId() == R.id.nr_picker_2) {
            int i17 = 100 - i15;
            this.f149567m = true;
            this.f149574v = i17;
            C6(0, i17, false);
            if (this.f149561h > i17) {
                A6(i17);
            }
            this.f149555b.setMaxValue(i17);
        }
    }
}
