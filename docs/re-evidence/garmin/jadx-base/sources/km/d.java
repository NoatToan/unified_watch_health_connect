package km;

import android.content.res.Resources;
import com.garmin.android.apps.connectmobile.R;
import java.util.Iterator;
import java.util.List;
import p13.j0;
import p13.x;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<List<Integer>> f105294a = x.k(x.k(1, 52, 50, 64), x.k(5, 62, 61, 63), x.k(24, 25), x.k(23, 26), x.k(36, 37));

    public static final boolean a(int i14, int i15) {
        Object next;
        Iterator<T> it = f105294a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((List) next).contains(Integer.valueOf(i14)));
        List list = (List) next;
        if (list == null) {
            list = j0.f134944a;
        }
        return list.contains(Integer.valueOf(i15));
    }

    public static final String b(Resources resources, int i14) {
        if (i14 == 1) {
            String string = resources.getString(R.string.lbl_pace);
            string.getClass();
            return string;
        }
        if (i14 == 5) {
            String string2 = resources.getString(R.string.activity_details_power);
            string2.getClass();
            return string2;
        }
        if (i14 == 50) {
            String string3 = resources.getString(R.string.activities_lap_average_pace);
            string3.getClass();
            return string3;
        }
        if (i14 == 52) {
            String string4 = resources.getString(R.string.activities_lap_average_pace);
            string4.getClass();
            return string4;
        }
        switch (i14) {
            case 61:
                String string5 = resources.getString(R.string.activity_details_power_per_weight);
                string5.getClass();
                return string5;
            case 62:
                String string6 = resources.getString(R.string.split_average_power, resources.getString(R.string.lbl_watts));
                string6.getClass();
                return string6;
            case 63:
                String string7 = resources.getString(R.string.split_average_power, resources.getString(R.string.lbl_watt_kg));
                string7.getClass();
                return string7;
            case 64:
                String string8 = resources.getString(R.string.activities_grade_adjusted_pace);
                string8.getClass();
                return string8;
            default:
                return "";
        }
    }
}
