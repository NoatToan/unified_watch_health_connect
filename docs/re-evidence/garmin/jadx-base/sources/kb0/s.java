package kb0;

import android.content.Context;
import android.text.format.DateFormat;
import b63.v;
import c63.k0;
import c63.r0;
import c63.t;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class s {
    public static final String a(Context context, v vVar) {
        k0 k0Var;
        context.getClass();
        vVar.getClass();
        if (DateFormat.is24HourFormat(context)) {
            v.INSTANCE.getClass();
            k0.f24999b.getClass();
            k0.a aVar = new k0.a(new e63.d());
            aVar.e(r0.ZERO);
            t.b(aVar, CoreConstants.COLON_CHAR);
            aVar.m(r0.ZERO);
            Unit unit = Unit.INSTANCE;
            k0Var = new k0(aVar.build());
        } else {
            v.INSTANCE.getClass();
            k0.f24999b.getClass();
            k0.a aVar2 = new k0.a(new e63.d());
            aVar2.i(r0.ZERO);
            t.b(aVar2, CoreConstants.COLON_CHAR);
            aVar2.m(r0.ZERO);
            t.b(aVar2, ' ');
            aVar2.p();
            Unit unit2 = Unit.INSTANCE;
            k0Var = new k0(aVar2.build());
        }
        return k0Var.b(vVar);
    }
}
