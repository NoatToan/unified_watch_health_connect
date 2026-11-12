package hr1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import xz.f;
import xz.g;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static final ArrayList a(Context context, boolean z14, boolean z15, boolean z16, boolean z17) {
        context.getClass();
        ArrayList arrayList = new ArrayList();
        if ((z15 && z16) || (!z15 && z16)) {
            String string = context.getString(R.string.stress_level_rest);
            string.getClass();
            arrayList.add(new f(string, null, Integer.valueOf(a7.b.getColor(context, R.color.gcm_chart_body_battery_rest)), null, g.a.f192745a, null, null, 106, null));
        }
        if ((z15 && z16) || (!z16 && z15)) {
            String string2 = context.getString(R.string.title_stress);
            string2.getClass();
            Integer numValueOf = Integer.valueOf(a7.b.getColor(context, R.color.gcm_chart_body_battery_stress));
            g.a aVar = g.a.f192745a;
            arrayList.add(new f(string2, null, numValueOf, null, aVar, null, null, 106, null));
            if (z17) {
                String string3 = context.getString(R.string.allday_stress_active);
                string3.getClass();
                arrayList.add(new f(string3, null, Integer.valueOf(a7.b.getColor(context, R.color.gcm_chart_body_battery_active)), null, aVar, null, null, 106, null));
            }
        }
        if ((z15 || z16) && z14) {
            String string4 = context.getString(R.string.allday_stress_unmeasurable);
            string4.getClass();
            arrayList.add(new f(string4, null, Integer.valueOf(a7.b.getColor(context, R.color.gcm3_stress_unmeasurable)), null, g.h.f192753a, null, null, 106, null));
        }
        return arrayList;
    }
}
