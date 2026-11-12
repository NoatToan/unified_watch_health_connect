package k51;

import android.content.Context;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import java.text.DecimalFormat;
import o51.c;

/* JADX INFO: loaded from: classes9.dex */
public final class b {
    public static final c a(com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar, Context context) {
        bVar.getClass();
        long j8 = bVar.f39773j;
        context.getClass();
        l3.a aVar = l3.f23124b;
        double d14 = bVar.f39770g;
        m3 m3Var = bVar.d() ? m3.KILOMETER : m3.MILE;
        DecimalFormat decimalFormat = l3.f23125c;
        aVar.getClass();
        String strO = l3.a.O(context, d14, m3Var, decimalFormat, true);
        String string = context.getString(R.string.string_string_bracket_pattern, l3.a.b1(1000 * j8), aVar.z0(new l22.a(context), l3.a.p(bVar.f39770g / j8, com.garmin.android.apps.connectmobile.pacepro.data.dto.b.g()), com.garmin.android.apps.connectmobile.pacepro.data.dto.b.g(), true, null));
        string.getClass();
        String string2 = context.getString(R.string.string_space_dot_space_string_pattern, strO, string);
        string2.getClass();
        String str = bVar.f39765b;
        Long l14 = bVar.f39764a;
        return new c(str, string2, l14 != null ? l14.longValue() : -1L, R.drawable.run);
    }
}
