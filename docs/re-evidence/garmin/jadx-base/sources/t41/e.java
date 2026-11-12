package t41;

import android.content.Context;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.math.MathKt;
import p13.y;
import t21.u;

/* JADX INFO: loaded from: classes9.dex */
public final class e {
    public static final ArrayList a(Context context, List list) {
        Context context2 = context;
        context2.getClass();
        oi0.h hVar = new oi0.h(context2);
        oi0.g gVar = new oi0.g(context2);
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar = (com.garmin.android.apps.connectmobile.pacepro.data.dto.b) it.next();
            bVar.getClass();
            boolean zG = com.garmin.android.apps.connectmobile.pacepro.data.dto.b.g();
            l3.a aVar = l3.f23124b;
            double d14 = bVar.f39770g;
            m3 m3Var = bVar.d() ? m3.KILOMETER : m3.MILE;
            DecimalFormat decimalFormat = l3.f23129g;
            aVar.getClass();
            String strO = l3.a.O(context2, d14, m3Var, decimalFormat, true);
            String strA = oi0.c.A(context2, new u(13), strO);
            long j8 = bVar.f39773j;
            String strB1 = l3.a.b1(((long) 1000) * j8);
            String strD = hVar.d(j8, true);
            double d15 = j8 / (bVar.f39770g / (zG ? 1000.0d : 1609.344d));
            Context context3 = context2;
            String string = context3.getString(R.string.lbl_pace_value, aVar.r0(context3, d15, zG, true, ""));
            string.getClass();
            String string2 = context3.getString(R.string.lbl_pace_value, context3.getString(R.string.string_space_string_pattern, hVar.d(MathKt.d(d15), true), gVar.a(zG)));
            string2.getClass();
            Long l14 = bVar.f39764a;
            long jLongValue = l14 != null ? l14.longValue() : 0L;
            String str = bVar.f39765b;
            if (str == null) {
                str = "";
            }
            arrayList.add(new q51.e(jLongValue, str, strO, strA, strB1, strD, string, string2));
            context2 = context3;
        }
        return arrayList;
    }
}
