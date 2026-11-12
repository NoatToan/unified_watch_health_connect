package sa1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes9.dex */
public final class x {
    public static final androidx.appcompat.app.e a(int i14, Context context, e23.l lVar) {
        context.getClass();
        String string = context.getString(R.string.string_space_string_bracket_pattern, context.getString(R.string.lbl_functional_threshold_power_short), context.getString(R.string.lbl_watts));
        string.getClass();
        rk1.b.C2900b c2900b = new rk1.b.C2900b(context);
        c2900b.e(1);
        c2900b.d(999);
        rk1.b.d dVar = c2900b.f153344b;
        dVar.f153345a = 1;
        dVar.f153346b = string;
        c2900b.c(Integer.valueOf(i14));
        c2900b.f(new m32.a(lVar, 1));
        androidx.appcompat.app.e eVarB = c2900b.b();
        eVarB.getClass();
        return eVarB;
    }
}
