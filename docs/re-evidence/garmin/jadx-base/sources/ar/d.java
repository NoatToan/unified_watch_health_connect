package ar;

import android.content.Context;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.t;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes7.dex */
public final class d {
    private d() {
    }

    public static String a(Context context, t tVar) {
        Integer num;
        if (context == null || tVar == null || (num = tVar.f29674e) == null) {
            return null;
        }
        int iIntValue = num.intValue();
        Double d14 = tVar.f29675f;
        if (iIntValue == 0) {
            return context.getString(R.string.activity_details_water_type_fresh);
        }
        if (iIntValue == 1) {
            return context.getString(R.string.activity_details_water_type_salt);
        }
        if (iIntValue != 3) {
            return null;
        }
        String string = context.getString(R.string.activity_details_water_type_custom);
        if (d14 == null || d14.doubleValue() <= 0.0d) {
            return string;
        }
        double dDoubleValue = d14.doubleValue() / 1000.0d;
        StringBuilder sb3 = new StringBuilder();
        l3.f23124b.getClass();
        sb3.append(l3.a.L(dDoubleValue, 3));
        sb3.append(StringUtils.SPACE);
        sb3.append(context.getString(R.string.lbl_kg_l));
        return sb3.toString();
    }
}
