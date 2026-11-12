package jd0;

import am.x0;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes8.dex */
public final class j {
    public final void a(Context context, x0 x0Var, long j8) {
        if (context == null || x0Var == null || j8 == -1) {
            return;
        }
        qd2.a aVarB = qd2.a.b();
        if (aVarB != null) {
            aVarB.i(qd2.a.b.ACTIVITY_LIST);
            aVarB.h(qd2.a.EnumC2721a.ACTIVITY_DETAILS, j8);
            aVarB.h(qd2.a.EnumC2721a.ACTIVITY_CHARTS, j8);
        }
        aq.b bVar = new aq.b();
        bVar.f11823b = j8;
        bVar.f11827f = x0Var.f4358a;
        Intent intentA = bVar.a(context);
        intentA.putExtra("GCM_extra_get_from_cache", false);
        intentA.setFlags(67108864);
        context.startActivity(intentA);
    }

    public final void b(Context context, long j8) {
        if (context == null || j8 == -1) {
            return;
        }
        qd2.a aVarB = qd2.a.b();
        if (aVarB != null) {
            aVarB.i(qd2.a.b.ACTIVITY_LIST);
            aVarB.h(qd2.a.EnumC2721a.ACTIVITY_DETAILS, j8);
            aVarB.h(qd2.a.EnumC2721a.ACTIVITY_CHARTS, j8);
        }
        aq.b bVar = new aq.b();
        bVar.f11823b = j8;
        bVar.f11827f = x0.C.f4358a;
        Intent intentA = bVar.a(context);
        intentA.putExtra("GCM_extra_get_from_cache", false);
        intentA.setFlags(67108864);
        context.startActivity(intentA);
    }

    public final void c(Context context, long j8) {
        if (context == null || j8 == -1) {
            return;
        }
        qd2.a aVarB = qd2.a.b();
        if (aVarB != null) {
            aVarB.i(qd2.a.b.ACTIVITY_LIST);
            aVarB.h(qd2.a.EnumC2721a.ACTIVITY_DETAILS, j8);
            aVarB.h(qd2.a.EnumC2721a.ACTIVITY_CHARTS, j8);
        }
        aq.b bVar = new aq.b();
        bVar.f11823b = j8;
        bVar.f11827f = x0.C.f4358a;
        Intent intentA = bVar.a(context);
        intentA.putExtra("GCM_extra_get_from_cache", false);
        intentA.setFlags(67108864);
        context.startActivity(intentA);
    }
}
