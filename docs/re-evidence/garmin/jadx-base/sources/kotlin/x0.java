package kotlin;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.inputmethodservice.InputMethodService;
import android.view.View;
import g6.e;
import g6.f;
import o72.z0;
import oe.m;
import oe.n;
import oe.o;
import xy2.b;

/* JADX INFO: loaded from: classes.dex */
public final class x0 {
    public static final v1 a(View view2) {
        Context context = view2.getContext();
        Context baseContext = context;
        while (true) {
            if (baseContext instanceof ContextWrapper) {
                if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService) || (baseContext instanceof Application)) {
                    break;
                }
                ContextWrapper contextWrapper = (ContextWrapper) baseContext;
                if (contextWrapper.getBaseContext() != null) {
                    baseContext = contextWrapper.getBaseContext();
                }
            }
            baseContext = null;
            break;
        }
        if (baseContext != null) {
            n.f131242a.getClass();
            z0 z0Var = n.a.f131244b;
            o oVar = n.a.f131245c;
            z0Var.getClass();
            oVar.getClass();
            m mVarB = oVar.b(baseContext);
            v1.a aVar = v1.f91599c;
            long jWidth = (((long) mVarB.f131240a.c().width()) << 32) | (4294967295L & ((long) mVarB.f131240a.c().height()));
            e eVarB = b.b(baseContext);
            aVar.getClass();
            return new v1(jWidth, eVarB.A(g6.n.c(jWidth)), null);
        }
        Configuration configuration = context.getResources().getConfiguration();
        e eVarB2 = b.b(context);
        v1.a aVar2 = v1.f91599c;
        float f14 = configuration.screenWidthDp;
        f.a aVar3 = f.f75994b;
        long jE = dh.b.e(f14, configuration.screenHeightDp);
        aVar2.getClass();
        long jK1 = eVarB2.k1(jE);
        long jIntBitsToFloat = (((long) ((int) Float.intBitsToFloat((int) (jK1 >> 32)))) << 32) | (((long) ((int) Float.intBitsToFloat((int) (jK1 & 4294967295L)))) & 4294967295L);
        g6.m.a aVar4 = g6.m.f76012b;
        return new v1(jIntBitsToFloat, jE, null);
    }
}
